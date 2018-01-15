/*
               File: gx00a0_impl
        Description: Selection List UVID_ATRCONTARTH
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:31.43
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

public final  class gx00a0_impl extends GXDataArea
{
   public gx00a0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00a0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00a0_impl.class ));
   }

   public gx00a0_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_84 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_84_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_84_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV6cUVID_ATRCONTARTHDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cUVID_ATRCONTARTHDocNum = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cUVID_ATRCONTARTHPeriod = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cUVID_ATRCONTARTHInstance = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10cUVID_ATRCONTARTHSeries = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11cUVID_ATRCONTARTHHandwrtten = httpContext.GetNextPar( ) ;
            AV12cUVID_ATRCONTARTHCanceled = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTHDocEntry, AV7cUVID_ATRCONTARTHDocNum, AV8cUVID_ATRCONTARTHPeriod, AV9cUVID_ATRCONTARTHInstance, AV10cUVID_ATRCONTARTHSeries, AV11cUVID_ATRCONTARTHHandwrtten, AV12cUVID_ATRCONTARTHCanceled) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
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
            AV13pUVID_ATRCONTARTHDocEntry = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_ATRCONTARTHDocEntry, 9, 0)));
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
         MasterPageObj = new com.wms.rwdpromptmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,true);
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
      pa102( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start102( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      com.wms.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210233154");
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.gx00a0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUVID_ATRCONTARTHDocEntry,9,0)))+"\">") ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTHDOCENTRY", GXutil.ltrim( localUtil.ntoc( AV6cUVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTHDOCNUM", GXutil.ltrim( localUtil.ntoc( AV7cUVID_ATRCONTARTHDocNum, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTHPERIOD", GXutil.ltrim( localUtil.ntoc( AV8cUVID_ATRCONTARTHPeriod, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTHINSTANCE", GXutil.ltrim( localUtil.ntoc( AV9cUVID_ATRCONTARTHInstance, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTHSERIES", GXutil.ltrim( localUtil.ntoc( AV10cUVID_ATRCONTARTHSeries, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTHHANDWRTTEN", GXutil.rtrim( AV11cUVID_ATRCONTARTHHandwrtten));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTHCANCELED", GXutil.rtrim( AV12cUVID_ATRCONTARTHCanceled));
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPUVID_ATRCONTARTHDOCENTRY", GXutil.ltrim( localUtil.ntoc( AV13pUVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHDOCENTRYFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontarthdocentryfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHDOCNUMFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontarthdocnumfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHPERIODFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontarthperiodfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHINSTANCEFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontarthinstancefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHSERIESFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontarthseriesfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHHANDWRTTENFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontarthhandwrttenfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHCANCELEDFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontarthcanceledfiltercontainer_Class));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.wms.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we102( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt102( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.wms.gx00a0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUVID_ATRCONTARTHDocEntry,9,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00A0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List UVID_ATRCONTARTH" ;
   }

   public void wb100( )
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
         com.wms.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontarthdocentryfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontarthdocentryfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontarthdocentryfilter_Internalname, "UVID_ATRCONTARTHDoc Entry", "", "", lblLbluvid_atrcontarthdocentryfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11101_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontarthdocentry_Internalname, "Doc Entry", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontarthdocentry_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cUVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtavCuvid_atrcontarthdocentry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cUVID_ATRCONTARTHDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cUVID_ATRCONTARTHDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontarthdocentry_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontarthdocentry_Visible, edtavCuvid_atrcontarthdocentry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontarthdocnumfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontarthdocnumfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontarthdocnumfilter_Internalname, "UVID_ATRCONTARTHDoc Num", "", "", lblLbluvid_atrcontarthdocnumfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12101_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontarthdocnum_Internalname, "Doc Num", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontarthdocnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cUVID_ATRCONTARTHDocNum, (byte)(9), (byte)(0), ",", "")), ((edtavCuvid_atrcontarthdocnum_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cUVID_ATRCONTARTHDocNum), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cUVID_ATRCONTARTHDocNum), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontarthdocnum_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontarthdocnum_Visible, edtavCuvid_atrcontarthdocnum_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontarthperiodfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontarthperiodfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontarthperiodfilter_Internalname, "UVID_ATRCONTARTHPeriod", "", "", lblLbluvid_atrcontarthperiodfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13101_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontarthperiod_Internalname, "Period", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontarthperiod_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cUVID_ATRCONTARTHPeriod, (byte)(9), (byte)(0), ",", "")), ((edtavCuvid_atrcontarthperiod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cUVID_ATRCONTARTHPeriod), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cUVID_ATRCONTARTHPeriod), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontarthperiod_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontarthperiod_Visible, edtavCuvid_atrcontarthperiod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontarthinstancefiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontarthinstancefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontarthinstancefilter_Internalname, "UVID_ATRCONTARTHInstance", "", "", lblLbluvid_atrcontarthinstancefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14101_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontarthinstance_Internalname, "Instance", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontarthinstance_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cUVID_ATRCONTARTHInstance, (byte)(4), (byte)(0), ",", "")), ((edtavCuvid_atrcontarthinstance_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cUVID_ATRCONTARTHInstance), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cUVID_ATRCONTARTHInstance), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontarthinstance_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontarthinstance_Visible, edtavCuvid_atrcontarthinstance_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontarthseriesfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontarthseriesfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontarthseriesfilter_Internalname, "UVID_ATRCONTARTHSeries", "", "", lblLbluvid_atrcontarthseriesfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15101_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontarthseries_Internalname, "Series", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontarthseries_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cUVID_ATRCONTARTHSeries, (byte)(9), (byte)(0), ",", "")), ((edtavCuvid_atrcontarthseries_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cUVID_ATRCONTARTHSeries), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cUVID_ATRCONTARTHSeries), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontarthseries_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontarthseries_Visible, edtavCuvid_atrcontarthseries_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontarthhandwrttenfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontarthhandwrttenfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontarthhandwrttenfilter_Internalname, "UVID_ATRCONTARTHHandwrtten", "", "", lblLbluvid_atrcontarthhandwrttenfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16101_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontarthhandwrtten_Internalname, "Handwrtten", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontarthhandwrtten_Internalname, GXutil.rtrim( AV11cUVID_ATRCONTARTHHandwrtten), GXutil.rtrim( localUtil.format( AV11cUVID_ATRCONTARTHHandwrtten, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontarthhandwrtten_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontarthhandwrtten_Visible, edtavCuvid_atrcontarthhandwrtten_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontarthcanceledfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontarthcanceledfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontarthcanceledfilter_Internalname, "UVID_ATRCONTARTHCanceled", "", "", lblLbluvid_atrcontarthcanceledfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17101_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontarthcanceled_Internalname, "Canceled", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontarthcanceled_Internalname, GXutil.rtrim( AV12cUVID_ATRCONTARTHCanceled), GXutil.rtrim( localUtil.format( AV12cUVID_ATRCONTARTHCanceled, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontarthcanceled_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontarthcanceled_Visible, edtavCuvid_atrcontarthcanceled_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18101_client"+"'", TempTags, "", 2, "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"84\">") ;
            sStyleString = "" ;
            com.wms.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Doc Entry") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Doc Num") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Period") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Instance") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Series") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A162UVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A163UVID_ATRCONTARTHDocNum, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtUVID_ATRCONTARTHDocNum_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A164UVID_ATRCONTARTHPeriod, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A165UVID_ATRCONTARTHInstance, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166UVID_ATRCONTARTHSeries, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 84 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_84 = (short)(nGXsfl_84_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.wms.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.wms.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00A0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start102( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List UVID_ATRCONTARTH", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup100( ) ;
   }

   public void ws102( )
   {
      start102( ) ;
      evt102( ) ;
   }

   public void evt102( )
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
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_84_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_842( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A162UVID_ATRCONTARTHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHDocEntry_Internalname), ",", ".")) ;
                           A163UVID_ATRCONTARTHDocNum = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHDocNum_Internalname), ",", ".")) ;
                           n163UVID_ATRCONTARTHDocNum = false ;
                           A164UVID_ATRCONTARTHPeriod = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHPeriod_Internalname), ",", ".")) ;
                           n164UVID_ATRCONTARTHPeriod = false ;
                           A165UVID_ATRCONTARTHInstance = (short)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHInstance_Internalname), ",", ".")) ;
                           n165UVID_ATRCONTARTHInstance = false ;
                           A166UVID_ATRCONTARTHSeries = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHSeries_Internalname), ",", ".")) ;
                           n166UVID_ATRCONTARTHSeries = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19102 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e20102 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cuvid_atrcontarthdocentry Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHDOCENTRY"), ",", ".") != AV6cUVID_ATRCONTARTHDocEntry )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_atrcontarthdocnum Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHDOCNUM"), ",", ".") != AV7cUVID_ATRCONTARTHDocNum )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_atrcontarthperiod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHPERIOD"), ",", ".") != AV8cUVID_ATRCONTARTHPeriod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_atrcontarthinstance Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHINSTANCE"), ",", ".") != AV9cUVID_ATRCONTARTHInstance )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_atrcontarthseries Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHSERIES"), ",", ".") != AV10cUVID_ATRCONTARTHSeries )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_atrcontarthhandwrtten Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHHANDWRTTEN"), AV11cUVID_ATRCONTARTHHandwrtten) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_atrcontarthcanceled Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHCANCELED"), AV12cUVID_ATRCONTARTHCanceled) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e21102 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we102( )
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

   public void pa102( )
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
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_842( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         sendrow_842( ) ;
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int AV6cUVID_ATRCONTARTHDocEntry ,
                                  int AV7cUVID_ATRCONTARTHDocNum ,
                                  int AV8cUVID_ATRCONTARTHPeriod ,
                                  short AV9cUVID_ATRCONTARTHInstance ,
                                  int AV10cUVID_ATRCONTARTHSeries ,
                                  String AV11cUVID_ATRCONTARTHHandwrtten ,
                                  String AV12cUVID_ATRCONTARTHCanceled )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf102( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTHDOCENTRY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A162UVID_ATRCONTARTHDocEntry), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHDOCENTRY", GXutil.ltrim( localUtil.ntoc( A162UVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTHDOCNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A163UVID_ATRCONTARTHDocNum), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHDOCNUM", GXutil.ltrim( localUtil.ntoc( A163UVID_ATRCONTARTHDocNum, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTHPERIOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A164UVID_ATRCONTARTHPeriod), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHPERIOD", GXutil.ltrim( localUtil.ntoc( A164UVID_ATRCONTARTHPeriod, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTHINSTANCE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A165UVID_ATRCONTARTHInstance), "ZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHINSTANCE", GXutil.ltrim( localUtil.ntoc( A165UVID_ATRCONTARTHInstance, (byte)(4), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTHSERIES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A166UVID_ATRCONTARTHSeries), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTHSERIES", GXutil.ltrim( localUtil.ntoc( A166UVID_ATRCONTARTHSeries, (byte)(9), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf102( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf102( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(84) ;
      nGXsfl_84_idx = (short)(1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_842( ) ;
      bGXsfl_84_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_842( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_fusquim_sap.dynParam(0, new Object[]{ new Object[]{
                                              new Integer(AV7cUVID_ATRCONTARTHDocNum) ,
                                              new Integer(AV8cUVID_ATRCONTARTHPeriod) ,
                                              new Short(AV9cUVID_ATRCONTARTHInstance) ,
                                              new Integer(AV10cUVID_ATRCONTARTHSeries) ,
                                              AV11cUVID_ATRCONTARTHHandwrtten ,
                                              AV12cUVID_ATRCONTARTHCanceled ,
                                              new Integer(A163UVID_ATRCONTARTHDocNum) ,
                                              new Integer(A164UVID_ATRCONTARTHPeriod) ,
                                              new Short(A165UVID_ATRCONTARTHInstance) ,
                                              new Integer(A166UVID_ATRCONTARTHSeries) ,
                                              A167UVID_ATRCONTARTHHandwrtten ,
                                              A168UVID_ATRCONTARTHCanceled ,
                                              new Integer(AV6cUVID_ATRCONTARTHDocEntry) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                              }
         } ) ;
         lV11cUVID_ATRCONTARTHHandwrtten = GXutil.padr( GXutil.rtrim( AV11cUVID_ATRCONTARTHHandwrtten), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cUVID_ATRCONTARTHHandwrtten", AV11cUVID_ATRCONTARTHHandwrtten);
         lV12cUVID_ATRCONTARTHCanceled = GXutil.padr( GXutil.rtrim( AV12cUVID_ATRCONTARTHCanceled), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cUVID_ATRCONTARTHCanceled", AV12cUVID_ATRCONTARTHCanceled);
         /* Using cursor H00102 */
         pr_fusquim_sap.execute(0, new Object[] {new Integer(AV6cUVID_ATRCONTARTHDocEntry), new Integer(AV7cUVID_ATRCONTARTHDocNum), new Integer(AV8cUVID_ATRCONTARTHPeriod), new Short(AV9cUVID_ATRCONTARTHInstance), new Integer(AV10cUVID_ATRCONTARTHSeries), lV11cUVID_ATRCONTARTHHandwrtten, lV12cUVID_ATRCONTARTHCanceled, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_fusquim_sap.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A168UVID_ATRCONTARTHCanceled = H00102_A168UVID_ATRCONTARTHCanceled[0] ;
            n168UVID_ATRCONTARTHCanceled = H00102_n168UVID_ATRCONTARTHCanceled[0] ;
            A167UVID_ATRCONTARTHHandwrtten = H00102_A167UVID_ATRCONTARTHHandwrtten[0] ;
            n167UVID_ATRCONTARTHHandwrtten = H00102_n167UVID_ATRCONTARTHHandwrtten[0] ;
            A166UVID_ATRCONTARTHSeries = H00102_A166UVID_ATRCONTARTHSeries[0] ;
            n166UVID_ATRCONTARTHSeries = H00102_n166UVID_ATRCONTARTHSeries[0] ;
            A165UVID_ATRCONTARTHInstance = H00102_A165UVID_ATRCONTARTHInstance[0] ;
            n165UVID_ATRCONTARTHInstance = H00102_n165UVID_ATRCONTARTHInstance[0] ;
            A164UVID_ATRCONTARTHPeriod = H00102_A164UVID_ATRCONTARTHPeriod[0] ;
            n164UVID_ATRCONTARTHPeriod = H00102_n164UVID_ATRCONTARTHPeriod[0] ;
            A163UVID_ATRCONTARTHDocNum = H00102_A163UVID_ATRCONTARTHDocNum[0] ;
            n163UVID_ATRCONTARTHDocNum = H00102_n163UVID_ATRCONTARTHDocNum[0] ;
            A162UVID_ATRCONTARTHDocEntry = H00102_A162UVID_ATRCONTARTHDocEntry[0] ;
            /* Execute user event: Load */
            e20102 ();
            pr_fusquim_sap.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_fusquim_sap.getStatus(0) == 101) ? 1 : 0)) ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_fusquim_sap.close(0);
         wbEnd = (short)(84) ;
         wb100( ) ;
      }
      bGXsfl_84_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      pr_fusquim_sap.dynParam(1, new Object[]{ new Object[]{
                                           new Integer(AV7cUVID_ATRCONTARTHDocNum) ,
                                           new Integer(AV8cUVID_ATRCONTARTHPeriod) ,
                                           new Short(AV9cUVID_ATRCONTARTHInstance) ,
                                           new Integer(AV10cUVID_ATRCONTARTHSeries) ,
                                           AV11cUVID_ATRCONTARTHHandwrtten ,
                                           AV12cUVID_ATRCONTARTHCanceled ,
                                           new Integer(A163UVID_ATRCONTARTHDocNum) ,
                                           new Integer(A164UVID_ATRCONTARTHPeriod) ,
                                           new Short(A165UVID_ATRCONTARTHInstance) ,
                                           new Integer(A166UVID_ATRCONTARTHSeries) ,
                                           A167UVID_ATRCONTARTHHandwrtten ,
                                           A168UVID_ATRCONTARTHCanceled ,
                                           new Integer(AV6cUVID_ATRCONTARTHDocEntry) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                           }
      } ) ;
      lV11cUVID_ATRCONTARTHHandwrtten = GXutil.padr( GXutil.rtrim( AV11cUVID_ATRCONTARTHHandwrtten), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cUVID_ATRCONTARTHHandwrtten", AV11cUVID_ATRCONTARTHHandwrtten);
      lV12cUVID_ATRCONTARTHCanceled = GXutil.padr( GXutil.rtrim( AV12cUVID_ATRCONTARTHCanceled), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cUVID_ATRCONTARTHCanceled", AV12cUVID_ATRCONTARTHCanceled);
      /* Using cursor H00103 */
      pr_fusquim_sap.execute(1, new Object[] {new Integer(AV6cUVID_ATRCONTARTHDocEntry), new Integer(AV7cUVID_ATRCONTARTHDocNum), new Integer(AV8cUVID_ATRCONTARTHPeriod), new Short(AV9cUVID_ATRCONTARTHInstance), new Integer(AV10cUVID_ATRCONTARTHSeries), lV11cUVID_ATRCONTARTHHandwrtten, lV12cUVID_ATRCONTARTHCanceled});
      GRID1_nRecordCount = H00103_AGRID1_nRecordCount[0] ;
      pr_fusquim_sap.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTHDocEntry, AV7cUVID_ATRCONTARTHDocNum, AV8cUVID_ATRCONTARTHPeriod, AV9cUVID_ATRCONTARTHInstance, AV10cUVID_ATRCONTARTHSeries, AV11cUVID_ATRCONTARTHHandwrtten, AV12cUVID_ATRCONTARTHCanceled) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTHDocEntry, AV7cUVID_ATRCONTARTHDocNum, AV8cUVID_ATRCONTARTHPeriod, AV9cUVID_ATRCONTARTHInstance, AV10cUVID_ATRCONTARTHSeries, AV11cUVID_ATRCONTARTHHandwrtten, AV12cUVID_ATRCONTARTHCanceled) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTHDocEntry, AV7cUVID_ATRCONTARTHDocNum, AV8cUVID_ATRCONTARTHPeriod, AV9cUVID_ATRCONTARTHInstance, AV10cUVID_ATRCONTARTHSeries, AV11cUVID_ATRCONTARTHHandwrtten, AV12cUVID_ATRCONTARTHCanceled) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTHDocEntry, AV7cUVID_ATRCONTARTHDocNum, AV8cUVID_ATRCONTARTHPeriod, AV9cUVID_ATRCONTARTHInstance, AV10cUVID_ATRCONTARTHSeries, AV11cUVID_ATRCONTARTHHandwrtten, AV12cUVID_ATRCONTARTHCanceled) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTHDocEntry, AV7cUVID_ATRCONTARTHDocNum, AV8cUVID_ATRCONTARTHPeriod, AV9cUVID_ATRCONTARTHInstance, AV10cUVID_ATRCONTARTHSeries, AV11cUVID_ATRCONTARTHHandwrtten, AV12cUVID_ATRCONTARTHCanceled) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup100( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19102 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthdocentry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthdocentry_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUVID_ATRCONTARTHDOCENTRY");
            GX_FocusControl = edtavCuvid_atrcontarthdocentry_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cUVID_ATRCONTARTHDocEntry = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cUVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( AV6cUVID_ATRCONTARTHDocEntry, 9, 0)));
         }
         else
         {
            AV6cUVID_ATRCONTARTHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthdocentry_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cUVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( AV6cUVID_ATRCONTARTHDocEntry, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthdocnum_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthdocnum_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUVID_ATRCONTARTHDOCNUM");
            GX_FocusControl = edtavCuvid_atrcontarthdocnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cUVID_ATRCONTARTHDocNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cUVID_ATRCONTARTHDocNum", GXutil.ltrim( GXutil.str( AV7cUVID_ATRCONTARTHDocNum, 9, 0)));
         }
         else
         {
            AV7cUVID_ATRCONTARTHDocNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthdocnum_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cUVID_ATRCONTARTHDocNum", GXutil.ltrim( GXutil.str( AV7cUVID_ATRCONTARTHDocNum, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthperiod_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthperiod_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUVID_ATRCONTARTHPERIOD");
            GX_FocusControl = edtavCuvid_atrcontarthperiod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cUVID_ATRCONTARTHPeriod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cUVID_ATRCONTARTHPeriod", GXutil.ltrim( GXutil.str( AV8cUVID_ATRCONTARTHPeriod, 9, 0)));
         }
         else
         {
            AV8cUVID_ATRCONTARTHPeriod = (int)(localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthperiod_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cUVID_ATRCONTARTHPeriod", GXutil.ltrim( GXutil.str( AV8cUVID_ATRCONTARTHPeriod, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthinstance_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthinstance_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUVID_ATRCONTARTHINSTANCE");
            GX_FocusControl = edtavCuvid_atrcontarthinstance_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cUVID_ATRCONTARTHInstance = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cUVID_ATRCONTARTHInstance", GXutil.ltrim( GXutil.str( AV9cUVID_ATRCONTARTHInstance, 4, 0)));
         }
         else
         {
            AV9cUVID_ATRCONTARTHInstance = (short)(localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthinstance_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cUVID_ATRCONTARTHInstance", GXutil.ltrim( GXutil.str( AV9cUVID_ATRCONTARTHInstance, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthseries_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthseries_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUVID_ATRCONTARTHSERIES");
            GX_FocusControl = edtavCuvid_atrcontarthseries_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cUVID_ATRCONTARTHSeries = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cUVID_ATRCONTARTHSeries", GXutil.ltrim( GXutil.str( AV10cUVID_ATRCONTARTHSeries, 9, 0)));
         }
         else
         {
            AV10cUVID_ATRCONTARTHSeries = (int)(localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontarthseries_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cUVID_ATRCONTARTHSeries", GXutil.ltrim( GXutil.str( AV10cUVID_ATRCONTARTHSeries, 9, 0)));
         }
         AV11cUVID_ATRCONTARTHHandwrtten = httpContext.cgiGet( edtavCuvid_atrcontarthhandwrtten_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cUVID_ATRCONTARTHHandwrtten", AV11cUVID_ATRCONTARTHHandwrtten);
         AV12cUVID_ATRCONTARTHCanceled = httpContext.cgiGet( edtavCuvid_atrcontarthcanceled_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cUVID_ATRCONTARTHCanceled", AV12cUVID_ATRCONTARTHCanceled);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHDOCENTRY"), ",", ".") != AV6cUVID_ATRCONTARTHDocEntry )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHDOCNUM"), ",", ".") != AV7cUVID_ATRCONTARTHDocNum )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHPERIOD"), ",", ".") != AV8cUVID_ATRCONTARTHPeriod )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHINSTANCE"), ",", ".") != AV9cUVID_ATRCONTARTHInstance )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHSERIES"), ",", ".") != AV10cUVID_ATRCONTARTHSeries )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHHANDWRTTEN"), AV11cUVID_ATRCONTARTHHandwrtten) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTHCANCELED"), AV12cUVID_ATRCONTARTHCanceled) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e19102 ();
      if (returnInSub) return;
   }

   public void e19102( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "UVID_ATRCONTARTH", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e20102( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_842( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_84_Refreshing )
      {
         httpContext.doAjaxLoad(84, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e21102 ();
      if (returnInSub) return;
   }

   public void e21102( )
   {
      /* Enter Routine */
      AV13pUVID_ATRCONTARTHDocEntry = A162UVID_ATRCONTARTHDocEntry ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_ATRCONTARTHDocEntry, 9, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pUVID_ATRCONTARTHDocEntry)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pUVID_ATRCONTARTHDocEntry = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_ATRCONTARTHDocEntry, 9, 0)));
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
      pa102( ) ;
      ws102( ) ;
      we102( ) ;
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
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210233363");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gx00a0.js", "?201811210233363");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtUVID_ATRCONTARTHDocEntry_Internalname = "UVID_ATRCONTARTHDOCENTRY_"+sGXsfl_84_idx ;
      edtUVID_ATRCONTARTHDocNum_Internalname = "UVID_ATRCONTARTHDOCNUM_"+sGXsfl_84_idx ;
      edtUVID_ATRCONTARTHPeriod_Internalname = "UVID_ATRCONTARTHPERIOD_"+sGXsfl_84_idx ;
      edtUVID_ATRCONTARTHInstance_Internalname = "UVID_ATRCONTARTHINSTANCE_"+sGXsfl_84_idx ;
      edtUVID_ATRCONTARTHSeries_Internalname = "UVID_ATRCONTARTHSERIES_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtUVID_ATRCONTARTHDocEntry_Internalname = "UVID_ATRCONTARTHDOCENTRY_"+sGXsfl_84_fel_idx ;
      edtUVID_ATRCONTARTHDocNum_Internalname = "UVID_ATRCONTARTHDOCNUM_"+sGXsfl_84_fel_idx ;
      edtUVID_ATRCONTARTHPeriod_Internalname = "UVID_ATRCONTARTHPERIOD_"+sGXsfl_84_fel_idx ;
      edtUVID_ATRCONTARTHInstance_Internalname = "UVID_ATRCONTARTHINSTANCE_"+sGXsfl_84_fel_idx ;
      edtUVID_ATRCONTARTHSeries_Internalname = "UVID_ATRCONTARTHSERIES_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb100( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_84_idx <= subgrid1_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_84_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A162UVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_ATRCONTARTHDocEntry_Internalname,GXutil.ltrim( localUtil.ntoc( A162UVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A162UVID_ATRCONTARTHDocEntry), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_ATRCONTARTHDocEntry_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtUVID_ATRCONTARTHDocNum_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A162UVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHDocNum_Internalname, "Link", edtUVID_ATRCONTARTHDocNum_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_ATRCONTARTHDocNum_Internalname,GXutil.ltrim( localUtil.ntoc( A163UVID_ATRCONTARTHDocNum, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A163UVID_ATRCONTARTHDocNum), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtUVID_ATRCONTARTHDocNum_Link,"","","",edtUVID_ATRCONTARTHDocNum_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_ATRCONTARTHPeriod_Internalname,GXutil.ltrim( localUtil.ntoc( A164UVID_ATRCONTARTHPeriod, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A164UVID_ATRCONTARTHPeriod), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_ATRCONTARTHPeriod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_ATRCONTARTHInstance_Internalname,GXutil.ltrim( localUtil.ntoc( A165UVID_ATRCONTARTHInstance, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A165UVID_ATRCONTARTHInstance), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_ATRCONTARTHInstance_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_ATRCONTARTHSeries_Internalname,GXutil.ltrim( localUtil.ntoc( A166UVID_ATRCONTARTHSeries, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A166UVID_ATRCONTARTHSeries), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_ATRCONTARTHSeries_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTHDOCENTRY"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A162UVID_ATRCONTARTHDocEntry), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTHDOCNUM"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A163UVID_ATRCONTARTHDocNum), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTHPERIOD"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A164UVID_ATRCONTARTHPeriod), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTHINSTANCE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A165UVID_ATRCONTARTHInstance), "ZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTHSERIES"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A166UVID_ATRCONTARTHSeries), "ZZZZZZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLbluvid_atrcontarthdocentryfilter_Internalname = "LBLUVID_ATRCONTARTHDOCENTRYFILTER" ;
      edtavCuvid_atrcontarthdocentry_Internalname = "vCUVID_ATRCONTARTHDOCENTRY" ;
      divUvid_atrcontarthdocentryfiltercontainer_Internalname = "UVID_ATRCONTARTHDOCENTRYFILTERCONTAINER" ;
      lblLbluvid_atrcontarthdocnumfilter_Internalname = "LBLUVID_ATRCONTARTHDOCNUMFILTER" ;
      edtavCuvid_atrcontarthdocnum_Internalname = "vCUVID_ATRCONTARTHDOCNUM" ;
      divUvid_atrcontarthdocnumfiltercontainer_Internalname = "UVID_ATRCONTARTHDOCNUMFILTERCONTAINER" ;
      lblLbluvid_atrcontarthperiodfilter_Internalname = "LBLUVID_ATRCONTARTHPERIODFILTER" ;
      edtavCuvid_atrcontarthperiod_Internalname = "vCUVID_ATRCONTARTHPERIOD" ;
      divUvid_atrcontarthperiodfiltercontainer_Internalname = "UVID_ATRCONTARTHPERIODFILTERCONTAINER" ;
      lblLbluvid_atrcontarthinstancefilter_Internalname = "LBLUVID_ATRCONTARTHINSTANCEFILTER" ;
      edtavCuvid_atrcontarthinstance_Internalname = "vCUVID_ATRCONTARTHINSTANCE" ;
      divUvid_atrcontarthinstancefiltercontainer_Internalname = "UVID_ATRCONTARTHINSTANCEFILTERCONTAINER" ;
      lblLbluvid_atrcontarthseriesfilter_Internalname = "LBLUVID_ATRCONTARTHSERIESFILTER" ;
      edtavCuvid_atrcontarthseries_Internalname = "vCUVID_ATRCONTARTHSERIES" ;
      divUvid_atrcontarthseriesfiltercontainer_Internalname = "UVID_ATRCONTARTHSERIESFILTERCONTAINER" ;
      lblLbluvid_atrcontarthhandwrttenfilter_Internalname = "LBLUVID_ATRCONTARTHHANDWRTTENFILTER" ;
      edtavCuvid_atrcontarthhandwrtten_Internalname = "vCUVID_ATRCONTARTHHANDWRTTEN" ;
      divUvid_atrcontarthhandwrttenfiltercontainer_Internalname = "UVID_ATRCONTARTHHANDWRTTENFILTERCONTAINER" ;
      lblLbluvid_atrcontarthcanceledfilter_Internalname = "LBLUVID_ATRCONTARTHCANCELEDFILTER" ;
      edtavCuvid_atrcontarthcanceled_Internalname = "vCUVID_ATRCONTARTHCANCELED" ;
      divUvid_atrcontarthcanceledfiltercontainer_Internalname = "UVID_ATRCONTARTHCANCELEDFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtUVID_ATRCONTARTHDocEntry_Internalname = "UVID_ATRCONTARTHDOCENTRY" ;
      edtUVID_ATRCONTARTHDocNum_Internalname = "UVID_ATRCONTARTHDOCNUM" ;
      edtUVID_ATRCONTARTHPeriod_Internalname = "UVID_ATRCONTARTHPERIOD" ;
      edtUVID_ATRCONTARTHInstance_Internalname = "UVID_ATRCONTARTHINSTANCE" ;
      edtUVID_ATRCONTARTHSeries_Internalname = "UVID_ATRCONTARTHSERIES" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divMain_Internalname = "MAIN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtUVID_ATRCONTARTHSeries_Jsonclick = "" ;
      edtUVID_ATRCONTARTHInstance_Jsonclick = "" ;
      edtUVID_ATRCONTARTHPeriod_Jsonclick = "" ;
      edtUVID_ATRCONTARTHDocNum_Jsonclick = "" ;
      edtUVID_ATRCONTARTHDocEntry_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtUVID_ATRCONTARTHDocNum_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCuvid_atrcontarthcanceled_Jsonclick = "" ;
      edtavCuvid_atrcontarthcanceled_Enabled = 1 ;
      edtavCuvid_atrcontarthcanceled_Visible = 1 ;
      edtavCuvid_atrcontarthhandwrtten_Jsonclick = "" ;
      edtavCuvid_atrcontarthhandwrtten_Enabled = 1 ;
      edtavCuvid_atrcontarthhandwrtten_Visible = 1 ;
      edtavCuvid_atrcontarthseries_Jsonclick = "" ;
      edtavCuvid_atrcontarthseries_Enabled = 1 ;
      edtavCuvid_atrcontarthseries_Visible = 1 ;
      edtavCuvid_atrcontarthinstance_Jsonclick = "" ;
      edtavCuvid_atrcontarthinstance_Enabled = 1 ;
      edtavCuvid_atrcontarthinstance_Visible = 1 ;
      edtavCuvid_atrcontarthperiod_Jsonclick = "" ;
      edtavCuvid_atrcontarthperiod_Enabled = 1 ;
      edtavCuvid_atrcontarthperiod_Visible = 1 ;
      edtavCuvid_atrcontarthdocnum_Jsonclick = "" ;
      edtavCuvid_atrcontarthdocnum_Enabled = 1 ;
      edtavCuvid_atrcontarthdocnum_Visible = 1 ;
      edtavCuvid_atrcontarthdocentry_Jsonclick = "" ;
      edtavCuvid_atrcontarthdocentry_Enabled = 1 ;
      edtavCuvid_atrcontarthdocentry_Visible = 1 ;
      divUvid_atrcontarthcanceledfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_atrcontarthhandwrttenfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_atrcontarthseriesfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_atrcontarthinstancefiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_atrcontarthperiodfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_atrcontarthdocnumfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_atrcontarthdocentryfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List UVID_ATRCONTARTH" );
      subGrid1_Rows = 10 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_ATRCONTARTHDocEntry',fld:'vCUVID_ATRCONTARTHDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cUVID_ATRCONTARTHDocNum',fld:'vCUVID_ATRCONTARTHDOCNUM',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cUVID_ATRCONTARTHPeriod',fld:'vCUVID_ATRCONTARTHPERIOD',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_ATRCONTARTHInstance',fld:'vCUVID_ATRCONTARTHINSTANCE',pic:'ZZZ9',nv:0},{av:'AV10cUVID_ATRCONTARTHSeries',fld:'vCUVID_ATRCONTARTHSERIES',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cUVID_ATRCONTARTHHandwrtten',fld:'vCUVID_ATRCONTARTHHANDWRTTEN',pic:'',nv:''},{av:'AV12cUVID_ATRCONTARTHCanceled',fld:'vCUVID_ATRCONTARTHCANCELED',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e18101',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTHDOCENTRYFILTER.CLICK","{handler:'e11101',iparms:[{av:'divUvid_atrcontarthdocentryfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHDOCENTRYFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontarthdocentryfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHDOCENTRYFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontarthdocentry_Visible',ctrl:'vCUVID_ATRCONTARTHDOCENTRY',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTHDOCNUMFILTER.CLICK","{handler:'e12101',iparms:[{av:'divUvid_atrcontarthdocnumfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHDOCNUMFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontarthdocnumfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHDOCNUMFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontarthdocnum_Visible',ctrl:'vCUVID_ATRCONTARTHDOCNUM',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTHPERIODFILTER.CLICK","{handler:'e13101',iparms:[{av:'divUvid_atrcontarthperiodfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHPERIODFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontarthperiodfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHPERIODFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontarthperiod_Visible',ctrl:'vCUVID_ATRCONTARTHPERIOD',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTHINSTANCEFILTER.CLICK","{handler:'e14101',iparms:[{av:'divUvid_atrcontarthinstancefiltercontainer_Class',ctrl:'UVID_ATRCONTARTHINSTANCEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontarthinstancefiltercontainer_Class',ctrl:'UVID_ATRCONTARTHINSTANCEFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontarthinstance_Visible',ctrl:'vCUVID_ATRCONTARTHINSTANCE',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTHSERIESFILTER.CLICK","{handler:'e15101',iparms:[{av:'divUvid_atrcontarthseriesfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHSERIESFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontarthseriesfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHSERIESFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontarthseries_Visible',ctrl:'vCUVID_ATRCONTARTHSERIES',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTHHANDWRTTENFILTER.CLICK","{handler:'e16101',iparms:[{av:'divUvid_atrcontarthhandwrttenfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHHANDWRTTENFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontarthhandwrttenfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHHANDWRTTENFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontarthhandwrtten_Visible',ctrl:'vCUVID_ATRCONTARTHHANDWRTTEN',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTHCANCELEDFILTER.CLICK","{handler:'e17101',iparms:[{av:'divUvid_atrcontarthcanceledfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHCANCELEDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontarthcanceledfiltercontainer_Class',ctrl:'UVID_ATRCONTARTHCANCELEDFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontarthcanceled_Visible',ctrl:'vCUVID_ATRCONTARTHCANCELED',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e21102',iparms:[{av:'A162UVID_ATRCONTARTHDocEntry',fld:'UVID_ATRCONTARTHDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pUVID_ATRCONTARTHDocEntry',fld:'vPUVID_ATRCONTARTHDOCENTRY',pic:'ZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_ATRCONTARTHDocEntry',fld:'vCUVID_ATRCONTARTHDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cUVID_ATRCONTARTHDocNum',fld:'vCUVID_ATRCONTARTHDOCNUM',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cUVID_ATRCONTARTHPeriod',fld:'vCUVID_ATRCONTARTHPERIOD',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_ATRCONTARTHInstance',fld:'vCUVID_ATRCONTARTHINSTANCE',pic:'ZZZ9',nv:0},{av:'AV10cUVID_ATRCONTARTHSeries',fld:'vCUVID_ATRCONTARTHSERIES',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cUVID_ATRCONTARTHHandwrtten',fld:'vCUVID_ATRCONTARTHHANDWRTTEN',pic:'',nv:''},{av:'AV12cUVID_ATRCONTARTHCanceled',fld:'vCUVID_ATRCONTARTHCANCELED',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_ATRCONTARTHDocEntry',fld:'vCUVID_ATRCONTARTHDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cUVID_ATRCONTARTHDocNum',fld:'vCUVID_ATRCONTARTHDOCNUM',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cUVID_ATRCONTARTHPeriod',fld:'vCUVID_ATRCONTARTHPERIOD',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_ATRCONTARTHInstance',fld:'vCUVID_ATRCONTARTHINSTANCE',pic:'ZZZ9',nv:0},{av:'AV10cUVID_ATRCONTARTHSeries',fld:'vCUVID_ATRCONTARTHSERIES',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cUVID_ATRCONTARTHHandwrtten',fld:'vCUVID_ATRCONTARTHHANDWRTTEN',pic:'',nv:''},{av:'AV12cUVID_ATRCONTARTHCanceled',fld:'vCUVID_ATRCONTARTHCANCELED',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_ATRCONTARTHDocEntry',fld:'vCUVID_ATRCONTARTHDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cUVID_ATRCONTARTHDocNum',fld:'vCUVID_ATRCONTARTHDOCNUM',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cUVID_ATRCONTARTHPeriod',fld:'vCUVID_ATRCONTARTHPERIOD',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_ATRCONTARTHInstance',fld:'vCUVID_ATRCONTARTHINSTANCE',pic:'ZZZ9',nv:0},{av:'AV10cUVID_ATRCONTARTHSeries',fld:'vCUVID_ATRCONTARTHSERIES',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cUVID_ATRCONTARTHHandwrtten',fld:'vCUVID_ATRCONTARTHHANDWRTTEN',pic:'',nv:''},{av:'AV12cUVID_ATRCONTARTHCanceled',fld:'vCUVID_ATRCONTARTHCANCELED',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_ATRCONTARTHDocEntry',fld:'vCUVID_ATRCONTARTHDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cUVID_ATRCONTARTHDocNum',fld:'vCUVID_ATRCONTARTHDOCNUM',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cUVID_ATRCONTARTHPeriod',fld:'vCUVID_ATRCONTARTHPERIOD',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_ATRCONTARTHInstance',fld:'vCUVID_ATRCONTARTHINSTANCE',pic:'ZZZ9',nv:0},{av:'AV10cUVID_ATRCONTARTHSeries',fld:'vCUVID_ATRCONTARTHSERIES',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cUVID_ATRCONTARTHHandwrtten',fld:'vCUVID_ATRCONTARTHHANDWRTTEN',pic:'',nv:''},{av:'AV12cUVID_ATRCONTARTHCanceled',fld:'vCUVID_ATRCONTARTHCANCELED',pic:'',nv:''}],oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV11cUVID_ATRCONTARTHHandwrtten = "" ;
      AV12cUVID_ATRCONTARTHCanceled = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbluvid_atrcontarthdocentryfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbluvid_atrcontarthdocnumfilter_Jsonclick = "" ;
      lblLbluvid_atrcontarthperiodfilter_Jsonclick = "" ;
      lblLbluvid_atrcontarthinstancefilter_Jsonclick = "" ;
      lblLbluvid_atrcontarthseriesfilter_Jsonclick = "" ;
      lblLbluvid_atrcontarthhandwrttenfilter_Jsonclick = "" ;
      lblLbluvid_atrcontarthcanceledfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV11cUVID_ATRCONTARTHHandwrtten = "" ;
      lV12cUVID_ATRCONTARTHCanceled = "" ;
      A167UVID_ATRCONTARTHHandwrtten = "" ;
      A168UVID_ATRCONTARTHCanceled = "" ;
      H00102_A168UVID_ATRCONTARTHCanceled = new String[] {""} ;
      H00102_n168UVID_ATRCONTARTHCanceled = new boolean[] {false} ;
      H00102_A167UVID_ATRCONTARTHHandwrtten = new String[] {""} ;
      H00102_n167UVID_ATRCONTARTHHandwrtten = new boolean[] {false} ;
      H00102_A166UVID_ATRCONTARTHSeries = new int[1] ;
      H00102_n166UVID_ATRCONTARTHSeries = new boolean[] {false} ;
      H00102_A165UVID_ATRCONTARTHInstance = new short[1] ;
      H00102_n165UVID_ATRCONTARTHInstance = new boolean[] {false} ;
      H00102_A164UVID_ATRCONTARTHPeriod = new int[1] ;
      H00102_n164UVID_ATRCONTARTHPeriod = new boolean[] {false} ;
      H00102_A163UVID_ATRCONTARTHDocNum = new int[1] ;
      H00102_n163UVID_ATRCONTARTHDocNum = new boolean[] {false} ;
      H00102_A162UVID_ATRCONTARTHDocEntry = new int[1] ;
      H00103_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.gx00a0__fusquim_sap(),
         new Object[] {
             new Object[] {
            H00102_A168UVID_ATRCONTARTHCanceled, H00102_n168UVID_ATRCONTARTHCanceled, H00102_A167UVID_ATRCONTARTHHandwrtten, H00102_n167UVID_ATRCONTARTHHandwrtten, H00102_A166UVID_ATRCONTARTHSeries, H00102_n166UVID_ATRCONTARTHSeries, H00102_A165UVID_ATRCONTARTHInstance, H00102_n165UVID_ATRCONTARTHInstance, H00102_A164UVID_ATRCONTARTHPeriod, H00102_n164UVID_ATRCONTARTHPeriod,
            H00102_A163UVID_ATRCONTARTHDocNum, H00102_n163UVID_ATRCONTARTHDocNum, H00102_A162UVID_ATRCONTARTHDocEntry
            }
            , new Object[] {
            H00103_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_84 ;
   private short nGXsfl_84_idx=1 ;
   private short AV9cUVID_ATRCONTARTHInstance ;
   private short wbEnd ;
   private short wbStart ;
   private short A165UVID_ATRCONTARTHInstance ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int AV6cUVID_ATRCONTARTHDocEntry ;
   private int AV7cUVID_ATRCONTARTHDocNum ;
   private int AV8cUVID_ATRCONTARTHPeriod ;
   private int AV10cUVID_ATRCONTARTHSeries ;
   private int AV13pUVID_ATRCONTARTHDocEntry ;
   private int edtavCuvid_atrcontarthdocentry_Enabled ;
   private int edtavCuvid_atrcontarthdocentry_Visible ;
   private int edtavCuvid_atrcontarthdocnum_Enabled ;
   private int edtavCuvid_atrcontarthdocnum_Visible ;
   private int edtavCuvid_atrcontarthperiod_Enabled ;
   private int edtavCuvid_atrcontarthperiod_Visible ;
   private int edtavCuvid_atrcontarthinstance_Enabled ;
   private int edtavCuvid_atrcontarthinstance_Visible ;
   private int edtavCuvid_atrcontarthseries_Enabled ;
   private int edtavCuvid_atrcontarthseries_Visible ;
   private int edtavCuvid_atrcontarthhandwrtten_Visible ;
   private int edtavCuvid_atrcontarthhandwrtten_Enabled ;
   private int edtavCuvid_atrcontarthcanceled_Visible ;
   private int edtavCuvid_atrcontarthcanceled_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A162UVID_ATRCONTARTHDocEntry ;
   private int A163UVID_ATRCONTARTHDocNum ;
   private int A164UVID_ATRCONTARTHPeriod ;
   private int A166UVID_ATRCONTARTHSeries ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divUvid_atrcontarthdocentryfiltercontainer_Class ;
   private String divUvid_atrcontarthdocnumfiltercontainer_Class ;
   private String divUvid_atrcontarthperiodfiltercontainer_Class ;
   private String divUvid_atrcontarthinstancefiltercontainer_Class ;
   private String divUvid_atrcontarthseriesfiltercontainer_Class ;
   private String divUvid_atrcontarthhandwrttenfiltercontainer_Class ;
   private String divUvid_atrcontarthcanceledfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV11cUVID_ATRCONTARTHHandwrtten ;
   private String AV12cUVID_ATRCONTARTHCanceled ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divUvid_atrcontarthdocentryfiltercontainer_Internalname ;
   private String lblLbluvid_atrcontarthdocentryfilter_Internalname ;
   private String lblLbluvid_atrcontarthdocentryfilter_Jsonclick ;
   private String edtavCuvid_atrcontarthdocentry_Internalname ;
   private String TempTags ;
   private String edtavCuvid_atrcontarthdocentry_Jsonclick ;
   private String divUvid_atrcontarthdocnumfiltercontainer_Internalname ;
   private String lblLbluvid_atrcontarthdocnumfilter_Internalname ;
   private String lblLbluvid_atrcontarthdocnumfilter_Jsonclick ;
   private String edtavCuvid_atrcontarthdocnum_Internalname ;
   private String edtavCuvid_atrcontarthdocnum_Jsonclick ;
   private String divUvid_atrcontarthperiodfiltercontainer_Internalname ;
   private String lblLbluvid_atrcontarthperiodfilter_Internalname ;
   private String lblLbluvid_atrcontarthperiodfilter_Jsonclick ;
   private String edtavCuvid_atrcontarthperiod_Internalname ;
   private String edtavCuvid_atrcontarthperiod_Jsonclick ;
   private String divUvid_atrcontarthinstancefiltercontainer_Internalname ;
   private String lblLbluvid_atrcontarthinstancefilter_Internalname ;
   private String lblLbluvid_atrcontarthinstancefilter_Jsonclick ;
   private String edtavCuvid_atrcontarthinstance_Internalname ;
   private String edtavCuvid_atrcontarthinstance_Jsonclick ;
   private String divUvid_atrcontarthseriesfiltercontainer_Internalname ;
   private String lblLbluvid_atrcontarthseriesfilter_Internalname ;
   private String lblLbluvid_atrcontarthseriesfilter_Jsonclick ;
   private String edtavCuvid_atrcontarthseries_Internalname ;
   private String edtavCuvid_atrcontarthseries_Jsonclick ;
   private String divUvid_atrcontarthhandwrttenfiltercontainer_Internalname ;
   private String lblLbluvid_atrcontarthhandwrttenfilter_Internalname ;
   private String lblLbluvid_atrcontarthhandwrttenfilter_Jsonclick ;
   private String edtavCuvid_atrcontarthhandwrtten_Internalname ;
   private String edtavCuvid_atrcontarthhandwrtten_Jsonclick ;
   private String divUvid_atrcontarthcanceledfiltercontainer_Internalname ;
   private String lblLbluvid_atrcontarthcanceledfilter_Internalname ;
   private String lblLbluvid_atrcontarthcanceledfilter_Jsonclick ;
   private String edtavCuvid_atrcontarthcanceled_Internalname ;
   private String edtavCuvid_atrcontarthcanceled_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String edtUVID_ATRCONTARTHDocNum_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtUVID_ATRCONTARTHDocEntry_Internalname ;
   private String edtUVID_ATRCONTARTHDocNum_Internalname ;
   private String edtUVID_ATRCONTARTHPeriod_Internalname ;
   private String edtUVID_ATRCONTARTHInstance_Internalname ;
   private String edtUVID_ATRCONTARTHSeries_Internalname ;
   private String scmdbuf ;
   private String lV11cUVID_ATRCONTARTHHandwrtten ;
   private String lV12cUVID_ATRCONTARTHCanceled ;
   private String A167UVID_ATRCONTARTHHandwrtten ;
   private String A168UVID_ATRCONTARTHCanceled ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtUVID_ATRCONTARTHDocEntry_Jsonclick ;
   private String edtUVID_ATRCONTARTHDocNum_Jsonclick ;
   private String edtUVID_ATRCONTARTHPeriod_Jsonclick ;
   private String edtUVID_ATRCONTARTHInstance_Jsonclick ;
   private String edtUVID_ATRCONTARTHSeries_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n163UVID_ATRCONTARTHDocNum ;
   private boolean n164UVID_ATRCONTARTHPeriod ;
   private boolean n165UVID_ATRCONTARTHInstance ;
   private boolean n166UVID_ATRCONTARTHSeries ;
   private boolean n168UVID_ATRCONTARTHCanceled ;
   private boolean n167UVID_ATRCONTARTHHandwrtten ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV17Linkselection_GXI ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_fusquim_sap ;
   private String[] H00102_A168UVID_ATRCONTARTHCanceled ;
   private boolean[] H00102_n168UVID_ATRCONTARTHCanceled ;
   private String[] H00102_A167UVID_ATRCONTARTHHandwrtten ;
   private boolean[] H00102_n167UVID_ATRCONTARTHHandwrtten ;
   private int[] H00102_A166UVID_ATRCONTARTHSeries ;
   private boolean[] H00102_n166UVID_ATRCONTARTHSeries ;
   private short[] H00102_A165UVID_ATRCONTARTHInstance ;
   private boolean[] H00102_n165UVID_ATRCONTARTHInstance ;
   private int[] H00102_A164UVID_ATRCONTARTHPeriod ;
   private boolean[] H00102_n164UVID_ATRCONTARTHPeriod ;
   private int[] H00102_A163UVID_ATRCONTARTHDocNum ;
   private boolean[] H00102_n163UVID_ATRCONTARTHDocNum ;
   private int[] H00102_A162UVID_ATRCONTARTHDocEntry ;
   private long[] H00103_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00a0__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00102( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV7cUVID_ATRCONTARTHDocNum ,
                                          int AV8cUVID_ATRCONTARTHPeriod ,
                                          short AV9cUVID_ATRCONTARTHInstance ,
                                          int AV10cUVID_ATRCONTARTHSeries ,
                                          String AV11cUVID_ATRCONTARTHHandwrtten ,
                                          String AV12cUVID_ATRCONTARTHCanceled ,
                                          int A163UVID_ATRCONTARTHDocNum ,
                                          int A164UVID_ATRCONTARTHPeriod ,
                                          short A165UVID_ATRCONTARTHInstance ,
                                          int A166UVID_ATRCONTARTHSeries ,
                                          String A167UVID_ATRCONTARTHHandwrtten ,
                                          String A168UVID_ATRCONTARTHCanceled ,
                                          int AV6cUVID_ATRCONTARTHDocEntry )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [10] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " [Canceled], [Handwrtten], [Series], [Instance], [Period], [DocNum], [DocEntry]" ;
      sFromString = " FROM dbo.[@VID_ATRCONTARTH] WITH (NOLOCK)" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE ([DocEntry] >= ?)" ;
      if ( ! (0==AV7cUVID_ATRCONTARTHDocNum) )
      {
         sWhereString = sWhereString + " and ([DocNum] >= ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cUVID_ATRCONTARTHPeriod) )
      {
         sWhereString = sWhereString + " and ([Period] >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cUVID_ATRCONTARTHInstance) )
      {
         sWhereString = sWhereString + " and ([Instance] >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cUVID_ATRCONTARTHSeries) )
      {
         sWhereString = sWhereString + " and ([Series] >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cUVID_ATRCONTARTHHandwrtten)==0) )
      {
         sWhereString = sWhereString + " and ([Handwrtten] like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cUVID_ATRCONTARTHCanceled)==0) )
      {
         sWhereString = sWhereString + " and ([Canceled] like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY [DocEntry]" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT CAST((SELECT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) AS INTEGER) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00103( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV7cUVID_ATRCONTARTHDocNum ,
                                          int AV8cUVID_ATRCONTARTHPeriod ,
                                          short AV9cUVID_ATRCONTARTHInstance ,
                                          int AV10cUVID_ATRCONTARTHSeries ,
                                          String AV11cUVID_ATRCONTARTHHandwrtten ,
                                          String AV12cUVID_ATRCONTARTHCanceled ,
                                          int A163UVID_ATRCONTARTHDocNum ,
                                          int A164UVID_ATRCONTARTHPeriod ,
                                          short A165UVID_ATRCONTARTHInstance ,
                                          int A166UVID_ATRCONTARTHSeries ,
                                          String A167UVID_ATRCONTARTHHandwrtten ,
                                          String A168UVID_ATRCONTARTHCanceled ,
                                          int AV6cUVID_ATRCONTARTHDocEntry )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM dbo.[@VID_ATRCONTARTH] WITH (NOLOCK)" ;
      scmdbuf = scmdbuf + " WHERE ([DocEntry] >= ?)" ;
      if ( ! (0==AV7cUVID_ATRCONTARTHDocNum) )
      {
         sWhereString = sWhereString + " and ([DocNum] >= ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cUVID_ATRCONTARTHPeriod) )
      {
         sWhereString = sWhereString + " and ([Period] >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cUVID_ATRCONTARTHInstance) )
      {
         sWhereString = sWhereString + " and ([Instance] >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cUVID_ATRCONTARTHSeries) )
      {
         sWhereString = sWhereString + " and ([Series] >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cUVID_ATRCONTARTHHandwrtten)==0) )
      {
         sWhereString = sWhereString + " and ([Handwrtten] like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cUVID_ATRCONTARTHCanceled)==0) )
      {
         sWhereString = sWhereString + " and ([Canceled] like ?)" ;
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H00102(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H00103(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00102", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00103", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

