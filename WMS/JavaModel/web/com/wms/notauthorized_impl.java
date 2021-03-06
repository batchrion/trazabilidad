/*
               File: notauthorized_impl
        Description: Not Authorized web panel
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:15.30
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class notauthorized_impl extends GXDataArea
{
   public notauthorized_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public notauthorized_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( notauthorized_impl.class ));
   }

   public notauthorized_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
         gxfirstwebparm_bkp = gxfirstwebparm ;
         gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            dyncall( httpContext.GetNextPar( )) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else
         {
            if ( ! httpContext.IsValidAjaxCall( false) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = gxfirstwebparm_bkp ;
         }
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GxObject = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "GxObject", GxObject);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGXOBJECT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( GxObject, ""))));
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj = new com.wms.rwdmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa072( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start072( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      com.wms.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), false);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210231532");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("com.wms.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(GxObject))+"\">") ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vGXOBJECT", GxObject);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGXOBJECT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( GxObject, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGXOBJECT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( GxObject, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
      if ( ! ( WebComp_Headerbc == null ) )
      {
         WebComp_Headerbc.componentjscripts();
      }
      if ( ! ( WebComp_Recentlinks == null ) )
      {
         WebComp_Recentlinks.componentjscripts();
      }
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.wms.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we072( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt072( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.wms.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(GxObject)) ;
   }

   public String getPgmname( )
   {
      return "NotAuthorized" ;
   }

   public String getPgmdesc( )
   {
      return "Not Authorized web panel" ;
   }

   public void wb070( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.wms.GxWebStd.gx_hidden_field( httpContext, "W0002"+"", GXutil.rtrim( WebComp_Headerbc_Component));
            httpContext.writeText( "<div") ;
            com.wms.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0002"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.strcmp(GXutil.lower( OldHeaderbc), GXutil.lower( WebComp_Headerbc_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0002"+"");
            }
            WebComp_Headerbc.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldHeaderbc), GXutil.lower( WebComp_Headerbc_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
            httpContext.writeText( "</div>") ;
         }
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.wms.GxWebStd.gx_hidden_field( httpContext, "W0003"+"", GXutil.rtrim( WebComp_Recentlinks_Component));
            httpContext.writeText( "<div") ;
            com.wms.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0003"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Recentlinks_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldRecentlinks), GXutil.lower( WebComp_Recentlinks_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0003"+"");
               }
               WebComp_Recentlinks.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldRecentlinks), GXutil.lower( WebComp_Recentlinks_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         wb_table1_4_072( true) ;
      }
      else
      {
         wb_table1_4_072( false) ;
      }
      return  ;
   }

   public void wb_table1_4_072e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_13_072( true) ;
      }
      else
      {
         wb_table2_13_072( false) ;
      }
      return  ;
   }

   public void wb_table2_13_072e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_16_072( true) ;
      }
      else
      {
         wb_table3_16_072( false) ;
      }
      return  ;
   }

   public void wb_table3_16_072e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start072( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Not Authorized web panel", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup070( ) ;
   }

   public void ws072( )
   {
      start072( ) ;
      evt072( ) ;
   }

   public void evt072( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e11072 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e12072 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                              }
                              dynload_actions( ) ;
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 2 )
                     {
                        OldHeaderbc = httpContext.cgiGet( "W0002") ;
                        if ( ( GXutil.len( OldHeaderbc) == 0 ) || ( GXutil.strcmp(OldHeaderbc, WebComp_Headerbc_Component) != 0 ) )
                        {
                           WebComp_Headerbc = WebUtils.getWebComponent(getClass(), "com.wms." + OldHeaderbc + "_impl", remoteHandle, context);
                           WebComp_Headerbc_Component = OldHeaderbc ;
                        }
                        WebComp_Headerbc.componentprocess("W0002", "", sEvt);
                        WebComp_Headerbc_Component = OldHeaderbc ;
                     }
                     else if ( nCmpId == 3 )
                     {
                        OldRecentlinks = httpContext.cgiGet( "W0003") ;
                        if ( ( GXutil.len( OldRecentlinks) == 0 ) || ( GXutil.strcmp(OldRecentlinks, WebComp_Recentlinks_Component) != 0 ) )
                        {
                           WebComp_Recentlinks = WebUtils.getWebComponent(getClass(), "com.wms." + OldRecentlinks + "_impl", remoteHandle, context);
                           WebComp_Recentlinks_Component = OldRecentlinks ;
                        }
                        if ( GXutil.len( WebComp_Recentlinks_Component) != 0 )
                        {
                           WebComp_Recentlinks.componentprocess("W0003", "", sEvt);
                        }
                        WebComp_Recentlinks_Component = OldRecentlinks ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we072( )
   {
      if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa072( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
         }
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf072( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV8Pgmname = "NotAuthorized" ;
      Gx_err = (short)(0) ;
   }

   public void rf072( )
   {
      initialize_formulas( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            WebComp_Headerbc.componentstart();
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Recentlinks_Component) != 0 )
            {
               WebComp_Recentlinks.componentstart();
            }
         }
      }
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e12072 ();
         wb070( ) ;
      }
   }

   public void strup070( )
   {
      /* Before Start, stand alone formulas. */
      AV8Pgmname = "NotAuthorized" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11072 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         /* Read saved values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e11072 ();
      if (returnInSub) return;
   }

   public void e11072( )
   {
      /* Start Routine */
      /* Object Property */
      if ( GXutil.strcmp(GXutil.lower( WebComp_Recentlinks_Component), GXutil.lower( "RecentLinks")) != 0 )
      {
         WebComp_Recentlinks = WebUtils.getWebComponent(getClass(), "com.wms.recentlinks_impl", remoteHandle, context);
         WebComp_Recentlinks_Component = "RecentLinks" ;
      }
      if ( GXutil.len( WebComp_Recentlinks_Component) != 0 )
      {
         WebComp_Recentlinks.setjustcreated();
         WebComp_Recentlinks.componentprepare(new Object[] {"W0003","","Not Authorized",AV8Pgmname});
         WebComp_Recentlinks.componentbind(new Object[] {"",""});
      }
      httpContext.GX_msglist.addItem("You are not authorized to do this action");
   }

   protected void nextLoad( )
   {
   }

   protected void e12072( )
   {
      /* Load Routine */
   }

   public void wb_table3_16_072( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         com.wms.GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableHorizontalLine", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_16_072e( true) ;
      }
      else
      {
         wb_table3_16_072e( false) ;
      }
   }

   public void wb_table2_13_072( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         com.wms.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "HorizontalSpace", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_13_072e( true) ;
      }
      else
      {
         wb_table2_13_072e( false) ;
      }
   }

   public void wb_table1_4_072( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         com.wms.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "ViewTable", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Not Authorized", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_NotAuthorized.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_4_072e( true) ;
      }
      else
      {
         wb_table1_4_072e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      GxObject = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "GxObject", GxObject);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGXOBJECT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( GxObject, ""))));
   }

   public String getresponse( String sGXDynURL )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa072( ) ;
      ws072( ) ;
      we072( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1022385");
      if ( ! ( WebComp_Headerbc == null ) )
      {
         WebComp_Headerbc.componentthemes();
      }
      if ( ! ( WebComp_Recentlinks == null ) )
      {
         if ( GXutil.len( WebComp_Recentlinks_Component) != 0 )
         {
            WebComp_Recentlinks.componentthemes();
         }
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210231546");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("notauthorized.js", "?201811210231546");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitletext_Internalname = "TITLETEXT" ;
      tblTable1_Internalname = "TABLE1" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable3_Internalname = "TABLE3" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Not Authorized web panel" );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOGxObject = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GxObject = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      WebComp_Headerbc_Component = "" ;
      OldHeaderbc = "" ;
      WebComp_Recentlinks_Component = "" ;
      OldRecentlinks = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8Pgmname = "" ;
      sStyleString = "" ;
      lblTitletext_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV8Pgmname = "NotAuthorized" ;
      /* GeneXus formulas. */
      AV8Pgmname = "NotAuthorized" ;
      Gx_err = (short)(0) ;
      WebComp_Headerbc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Recentlinks = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String WebComp_Headerbc_Component ;
   private String OldHeaderbc ;
   private String WebComp_Recentlinks_Component ;
   private String OldRecentlinks ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV8Pgmname ;
   private String sStyleString ;
   private String tblTable3_Internalname ;
   private String tblTable2_Internalname ;
   private String tblTable1_Internalname ;
   private String lblTitletext_Internalname ;
   private String lblTitletext_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String wcpOGxObject ;
   private String GxObject ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Headerbc ;
   private GXWebComponent WebComp_Recentlinks ;
   private com.genexus.webpanels.GXWebForm Form ;
}

