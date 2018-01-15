/*
               File: registroinspeccionhgeneral_impl
        Description: Registro Inspeccion HGeneral
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 5, 2018 15:0:54.19
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

public final  class registroinspeccionhgeneral_impl extends GXWebComponent
{
   public registroinspeccionhgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public registroinspeccionhgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registroinspeccionhgeneral_impl.class ));
   }

   public registroinspeccionhgeneral_impl( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetNextPar( ) ;
               sSFPrefix = httpContext.GetNextPar( ) ;
               A43UVID_CONTROLCHDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Integer(A43UVID_CONTROLCHDocEntry)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa0V2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      com.wms.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( "Registro Inspeccion HGeneral") ;
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
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxcfg.js", "?2018151505426");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 111985));
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.registroinspeccionhgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43UVID_CONTROLCHDocEntry,9,0)))+"\">") ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         httpContext.writeText( "<div") ;
         com.wms.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA43UVID_CONTROLCHDocEntry", GXutil.ltrim( localUtil.ntoc( wcpOA43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_WHSCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A65U_WhsCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_ITEMCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A63U_ItemCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_NOLOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A70U_NoLote, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_CANTIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_BULTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_BULTOSMU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_TRASLADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A86U_Traslado, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_FECINGR", getSecureSignedToken( sPrefix, localUtil.format( A76U_FecIngr, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_UM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A78U_UM, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_FECINI", getSecureSignedToken( sPrefix, localUtil.format( A81U_FecIni, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_FECFIN", getSecureSignedToken( sPrefix, localUtil.format( A82U_FecFin, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_REANALIS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A104U_Reanalis, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_CORRANAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_NODOC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_FECCONTR", getSecureSignedToken( sPrefix, localUtil.format( A80U_FecContr, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_CORRLOTE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_FECULTIN", getSecureSignedToken( sPrefix, localUtil.format( A77U_FecUltIn, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_CCCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A93U_CCCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_PRJCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A94U_PrjCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_UVID_CONTROLCHU_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A85UVID_CONTROLCHU_Estado, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_TIPRESUL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A87U_TipResul, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_U_WHSDEST", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A66U_WhsDest, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_UVID_CONTROLCHU_COMMENT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A95UVID_CONTROLCHU_Comment, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm0V2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("registroinspeccionhgeneral.js", "?2018151505436");
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "RegistroInspeccionHGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "Registro Inspeccion HGeneral" ;
   }

   public void wb0V0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.wms.registroinspeccionhgeneral");
         }
         com.wms.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewActionsCell", "Center", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group WWViewActions", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e110v1_client"+"'", TempTags, "", 2, "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e120v1_client"+"'", TempTags, "", 2, "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divAttributestable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCHDocEntry_Internalname, "Doc Entry", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCHDocEntry_Internalname, GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtUVID_CONTROLCHDocEntry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCHDocEntry_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUVID_CONTROLCHDocEntry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_WhsCode_Internalname, "U_Whs Code", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_WhsCode_Internalname, A65U_WhsCode, GXutil.rtrim( localUtil.format( A65U_WhsCode, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_WhsCode_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_WhsCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_ItemCode_Internalname, "U_Item Code", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_ItemCode_Internalname, A63U_ItemCode, GXutil.rtrim( localUtil.format( A63U_ItemCode, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_ItemCode_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_ItemCode_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_NoLote_Internalname, "U_No Lote", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NoLote_Internalname, A70U_NoLote, GXutil.rtrim( localUtil.format( A70U_NoLote, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NoLote_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_NoLote_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Cantidad_Internalname, "U_Cantidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Cantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A73U_Cantidad, (byte)(18), (byte)(0), ",", "")), ((edtU_Cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Cantidad_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_Cantidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Bultos_Internalname, "U_Bultos", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Bultos_Internalname, GXutil.ltrim( localUtil.ntoc( A74U_Bultos, (byte)(9), (byte)(0), ",", "")), ((edtU_Bultos_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Bultos_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_Bultos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_BultosMu_Internalname, "U_Bultos Mu", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_BultosMu_Internalname, GXutil.ltrim( localUtil.ntoc( A75U_BultosMu, (byte)(9), (byte)(0), ",", "")), ((edtU_BultosMu_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_BultosMu_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_BultosMu_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Traslado_Internalname, "U_Traslado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Traslado_Internalname, GXutil.rtrim( A86U_Traslado), GXutil.rtrim( localUtil.format( A86U_Traslado, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Traslado_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_Traslado_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecIngr_Internalname, "U_Fec Ingr", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtU_FecIngr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecIngr_Internalname, localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A76U_FecIngr, "99/99/9999 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecIngr_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_FecIngr_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecIngr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecIngr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccionHGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_UM_Internalname, "U_UM", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_UM_Internalname, A78U_UM, GXutil.rtrim( localUtil.format( A78U_UM, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_UM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_UM_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecIni_Internalname, "U_Fec Ini", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtU_FecIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecIni_Internalname, localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A81U_FecIni, "99/99/9999 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecIni_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_FecIni_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccionHGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecFin_Internalname, "U_Fec Fin", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtU_FecFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecFin_Internalname, localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A82U_FecFin, "99/99/9999 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecFin_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_FecFin_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccionHGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Reanalis_Internalname, "U_Reanalis", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Reanalis_Internalname, GXutil.rtrim( A104U_Reanalis), GXutil.rtrim( localUtil.format( A104U_Reanalis, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Reanalis_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_Reanalis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CorrAnal_Internalname, "U_Corr Anal", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CorrAnal_Internalname, GXutil.ltrim( localUtil.ntoc( A72U_CorrAnal, (byte)(9), (byte)(0), ",", "")), ((edtU_CorrAnal_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CorrAnal_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_CorrAnal_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_NoDoc_Internalname, "U_No Doc", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NoDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ",", "")), ((edtU_NoDoc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NoDoc_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_NoDoc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecContr_Internalname, "U_Fec Contr", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtU_FecContr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecContr_Internalname, localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A80U_FecContr, "99/99/9999 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecContr_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_FecContr_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecContr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecContr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccionHGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CorrLote_Internalname, "U_Corr Lote", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CorrLote_Internalname, GXutil.ltrim( localUtil.ntoc( A71U_CorrLote, (byte)(9), (byte)(0), ",", "")), ((edtU_CorrLote_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CorrLote_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_CorrLote_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecUltIn_Internalname, "U_Fec Ult In", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtU_FecUltIn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecUltIn_Internalname, localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A77U_FecUltIn, "99/99/9999 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecUltIn_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_FecUltIn_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecUltIn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecUltIn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccionHGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CCCode_Internalname, "U_CCCode", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CCCode_Internalname, A93U_CCCode, GXutil.rtrim( localUtil.format( A93U_CCCode, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CCCode_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_CCCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_PrjCode_Internalname, "U_Prj Code", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_PrjCode_Internalname, A94U_PrjCode, GXutil.rtrim( localUtil.format( A94U_PrjCode, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_PrjCode_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_PrjCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCHU_Estado_Internalname, "U_Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCHU_Estado_Internalname, GXutil.rtrim( A85UVID_CONTROLCHU_Estado), GXutil.rtrim( localUtil.format( A85UVID_CONTROLCHU_Estado, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCHU_Estado_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUVID_CONTROLCHU_Estado_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_TipResul_Internalname, "U_Tip Resul", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_TipResul_Internalname, A87U_TipResul, GXutil.rtrim( localUtil.format( A87U_TipResul, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_TipResul_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_TipResul_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_WhsDest_Internalname, "U_Whs Dest", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_WhsDest_Internalname, A66U_WhsDest, GXutil.rtrim( localUtil.format( A66U_WhsDest, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_WhsDest_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtU_WhsDest_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCHU_Comment_Internalname, "U_Comment", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtUVID_CONTROLCHU_Comment_Internalname, A95UVID_CONTROLCHU_Comment, "", "", (short)(0), 1, edtUVID_CONTROLCHU_Comment_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_RegistroInspeccionHGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start0V2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
            Form.getMeta().addItem("description", "Registro Inspeccion HGeneral", (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup0V0( ) ;
         }
      }
   }

   public void ws0V2( )
   {
      start0V2( ) ;
      evt0V2( ) ;
   }

   public void evt0V2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e130V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e140V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we0V2( )
   {
      if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0V2( ) ;
         }
      }
   }

   public void pa0V2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
            }
         }
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
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
      rf0V2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "RegistroInspeccionHGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf0V2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H000V2 */
         pr_default.execute(0, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A95UVID_CONTROLCHU_Comment = H000V2_A95UVID_CONTROLCHU_Comment[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A95UVID_CONTROLCHU_Comment", A95UVID_CONTROLCHU_Comment);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_UVID_CONTROLCHU_COMMENT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A95UVID_CONTROLCHU_Comment, ""))));
            n95UVID_CONTROLCHU_Comment = H000V2_n95UVID_CONTROLCHU_Comment[0] ;
            A66U_WhsDest = H000V2_A66U_WhsDest[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66U_WhsDest", A66U_WhsDest);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_WHSDEST", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A66U_WhsDest, ""))));
            n66U_WhsDest = H000V2_n66U_WhsDest[0] ;
            A87U_TipResul = H000V2_A87U_TipResul[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A87U_TipResul", A87U_TipResul);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_TIPRESUL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A87U_TipResul, ""))));
            n87U_TipResul = H000V2_n87U_TipResul[0] ;
            A85UVID_CONTROLCHU_Estado = H000V2_A85UVID_CONTROLCHU_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A85UVID_CONTROLCHU_Estado", A85UVID_CONTROLCHU_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_UVID_CONTROLCHU_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A85UVID_CONTROLCHU_Estado, ""))));
            n85UVID_CONTROLCHU_Estado = H000V2_n85UVID_CONTROLCHU_Estado[0] ;
            A94U_PrjCode = H000V2_A94U_PrjCode[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A94U_PrjCode", A94U_PrjCode);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_PRJCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A94U_PrjCode, ""))));
            n94U_PrjCode = H000V2_n94U_PrjCode[0] ;
            A93U_CCCode = H000V2_A93U_CCCode[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A93U_CCCode", A93U_CCCode);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_CCCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A93U_CCCode, ""))));
            n93U_CCCode = H000V2_n93U_CCCode[0] ;
            A77U_FecUltIn = H000V2_A77U_FecUltIn[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A77U_FecUltIn", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_FECULTIN", getSecureSignedToken( sPrefix, localUtil.format( A77U_FecUltIn, "99/99/9999 99:99:99")));
            n77U_FecUltIn = H000V2_n77U_FecUltIn[0] ;
            A71U_CorrLote = H000V2_A71U_CorrLote[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A71U_CorrLote", GXutil.ltrim( GXutil.str( A71U_CorrLote, 9, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_CORRLOTE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")));
            n71U_CorrLote = H000V2_n71U_CorrLote[0] ;
            A80U_FecContr = H000V2_A80U_FecContr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A80U_FecContr", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_FECCONTR", getSecureSignedToken( sPrefix, localUtil.format( A80U_FecContr, "99/99/9999 99:99:99")));
            n80U_FecContr = H000V2_n80U_FecContr[0] ;
            A79U_NoDoc = H000V2_A79U_NoDoc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A79U_NoDoc", GXutil.ltrim( GXutil.str( A79U_NoDoc, 9, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_NODOC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")));
            n79U_NoDoc = H000V2_n79U_NoDoc[0] ;
            A72U_CorrAnal = H000V2_A72U_CorrAnal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A72U_CorrAnal", GXutil.ltrim( GXutil.str( A72U_CorrAnal, 9, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_CORRANAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")));
            n72U_CorrAnal = H000V2_n72U_CorrAnal[0] ;
            A104U_Reanalis = H000V2_A104U_Reanalis[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104U_Reanalis", A104U_Reanalis);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_REANALIS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A104U_Reanalis, ""))));
            n104U_Reanalis = H000V2_n104U_Reanalis[0] ;
            A82U_FecFin = H000V2_A82U_FecFin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A82U_FecFin", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_FECFIN", getSecureSignedToken( sPrefix, localUtil.format( A82U_FecFin, "99/99/9999 99:99:99")));
            n82U_FecFin = H000V2_n82U_FecFin[0] ;
            A81U_FecIni = H000V2_A81U_FecIni[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A81U_FecIni", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_FECINI", getSecureSignedToken( sPrefix, localUtil.format( A81U_FecIni, "99/99/9999 99:99:99")));
            n81U_FecIni = H000V2_n81U_FecIni[0] ;
            A78U_UM = H000V2_A78U_UM[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A78U_UM", A78U_UM);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_UM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A78U_UM, ""))));
            n78U_UM = H000V2_n78U_UM[0] ;
            A76U_FecIngr = H000V2_A76U_FecIngr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A76U_FecIngr", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_FECINGR", getSecureSignedToken( sPrefix, localUtil.format( A76U_FecIngr, "99/99/9999 99:99:99")));
            n76U_FecIngr = H000V2_n76U_FecIngr[0] ;
            A86U_Traslado = H000V2_A86U_Traslado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A86U_Traslado", A86U_Traslado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_TRASLADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A86U_Traslado, ""))));
            n86U_Traslado = H000V2_n86U_Traslado[0] ;
            A75U_BultosMu = H000V2_A75U_BultosMu[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A75U_BultosMu", GXutil.ltrim( GXutil.str( A75U_BultosMu, 9, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_BULTOSMU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")));
            n75U_BultosMu = H000V2_n75U_BultosMu[0] ;
            A74U_Bultos = H000V2_A74U_Bultos[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A74U_Bultos", GXutil.ltrim( GXutil.str( A74U_Bultos, 9, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_BULTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")));
            n74U_Bultos = H000V2_n74U_Bultos[0] ;
            A73U_Cantidad = H000V2_A73U_Cantidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A73U_Cantidad", GXutil.ltrim( GXutil.str( A73U_Cantidad, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_CANTIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")));
            n73U_Cantidad = H000V2_n73U_Cantidad[0] ;
            A70U_NoLote = H000V2_A70U_NoLote[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A70U_NoLote", A70U_NoLote);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_NOLOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A70U_NoLote, ""))));
            n70U_NoLote = H000V2_n70U_NoLote[0] ;
            A63U_ItemCode = H000V2_A63U_ItemCode[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A63U_ItemCode", A63U_ItemCode);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_ITEMCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A63U_ItemCode, ""))));
            n63U_ItemCode = H000V2_n63U_ItemCode[0] ;
            A65U_WhsCode = H000V2_A65U_WhsCode[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A65U_WhsCode", A65U_WhsCode);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_WHSCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A65U_WhsCode, ""))));
            n65U_WhsCode = H000V2_n65U_WhsCode[0] ;
            /* Execute user event: Load */
            e140V2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb0V0( ) ;
      }
   }

   public void strup0V0( )
   {
      /* Before Start, stand alone formulas. */
      AV13Pgmname = "RegistroInspeccionHGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e130V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A65U_WhsCode = httpContext.cgiGet( edtU_WhsCode_Internalname) ;
         n65U_WhsCode = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A65U_WhsCode", A65U_WhsCode);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_WHSCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A65U_WhsCode, ""))));
         A63U_ItemCode = httpContext.cgiGet( edtU_ItemCode_Internalname) ;
         n63U_ItemCode = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A63U_ItemCode", A63U_ItemCode);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_ITEMCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A63U_ItemCode, ""))));
         A70U_NoLote = httpContext.cgiGet( edtU_NoLote_Internalname) ;
         n70U_NoLote = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A70U_NoLote", A70U_NoLote);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_NOLOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A70U_NoLote, ""))));
         A73U_Cantidad = localUtil.ctol( httpContext.cgiGet( edtU_Cantidad_Internalname), ",", ".") ;
         n73U_Cantidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A73U_Cantidad", GXutil.ltrim( GXutil.str( A73U_Cantidad, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_CANTIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")));
         A74U_Bultos = (int)(localUtil.ctol( httpContext.cgiGet( edtU_Bultos_Internalname), ",", ".")) ;
         n74U_Bultos = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A74U_Bultos", GXutil.ltrim( GXutil.str( A74U_Bultos, 9, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_BULTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")));
         A75U_BultosMu = (int)(localUtil.ctol( httpContext.cgiGet( edtU_BultosMu_Internalname), ",", ".")) ;
         n75U_BultosMu = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A75U_BultosMu", GXutil.ltrim( GXutil.str( A75U_BultosMu, 9, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_BULTOSMU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")));
         A86U_Traslado = httpContext.cgiGet( edtU_Traslado_Internalname) ;
         n86U_Traslado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A86U_Traslado", A86U_Traslado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_TRASLADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A86U_Traslado, ""))));
         A76U_FecIngr = localUtil.ctot( httpContext.cgiGet( edtU_FecIngr_Internalname), 0) ;
         n76U_FecIngr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A76U_FecIngr", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_FECINGR", getSecureSignedToken( sPrefix, localUtil.format( A76U_FecIngr, "99/99/9999 99:99:99")));
         A78U_UM = httpContext.cgiGet( edtU_UM_Internalname) ;
         n78U_UM = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A78U_UM", A78U_UM);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_UM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A78U_UM, ""))));
         A81U_FecIni = localUtil.ctot( httpContext.cgiGet( edtU_FecIni_Internalname), 0) ;
         n81U_FecIni = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A81U_FecIni", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_FECINI", getSecureSignedToken( sPrefix, localUtil.format( A81U_FecIni, "99/99/9999 99:99:99")));
         A82U_FecFin = localUtil.ctot( httpContext.cgiGet( edtU_FecFin_Internalname), 0) ;
         n82U_FecFin = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A82U_FecFin", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_FECFIN", getSecureSignedToken( sPrefix, localUtil.format( A82U_FecFin, "99/99/9999 99:99:99")));
         A104U_Reanalis = httpContext.cgiGet( edtU_Reanalis_Internalname) ;
         n104U_Reanalis = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104U_Reanalis", A104U_Reanalis);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_REANALIS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A104U_Reanalis, ""))));
         A72U_CorrAnal = (int)(localUtil.ctol( httpContext.cgiGet( edtU_CorrAnal_Internalname), ",", ".")) ;
         n72U_CorrAnal = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A72U_CorrAnal", GXutil.ltrim( GXutil.str( A72U_CorrAnal, 9, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_CORRANAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")));
         A79U_NoDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtU_NoDoc_Internalname), ",", ".")) ;
         n79U_NoDoc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A79U_NoDoc", GXutil.ltrim( GXutil.str( A79U_NoDoc, 9, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_NODOC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")));
         A80U_FecContr = localUtil.ctot( httpContext.cgiGet( edtU_FecContr_Internalname), 0) ;
         n80U_FecContr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A80U_FecContr", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_FECCONTR", getSecureSignedToken( sPrefix, localUtil.format( A80U_FecContr, "99/99/9999 99:99:99")));
         A71U_CorrLote = (int)(localUtil.ctol( httpContext.cgiGet( edtU_CorrLote_Internalname), ",", ".")) ;
         n71U_CorrLote = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A71U_CorrLote", GXutil.ltrim( GXutil.str( A71U_CorrLote, 9, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_CORRLOTE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")));
         A77U_FecUltIn = localUtil.ctot( httpContext.cgiGet( edtU_FecUltIn_Internalname), 0) ;
         n77U_FecUltIn = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A77U_FecUltIn", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_FECULTIN", getSecureSignedToken( sPrefix, localUtil.format( A77U_FecUltIn, "99/99/9999 99:99:99")));
         A93U_CCCode = httpContext.cgiGet( edtU_CCCode_Internalname) ;
         n93U_CCCode = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A93U_CCCode", A93U_CCCode);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_CCCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A93U_CCCode, ""))));
         A94U_PrjCode = httpContext.cgiGet( edtU_PrjCode_Internalname) ;
         n94U_PrjCode = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A94U_PrjCode", A94U_PrjCode);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_PRJCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A94U_PrjCode, ""))));
         A85UVID_CONTROLCHU_Estado = httpContext.cgiGet( edtUVID_CONTROLCHU_Estado_Internalname) ;
         n85UVID_CONTROLCHU_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A85UVID_CONTROLCHU_Estado", A85UVID_CONTROLCHU_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_UVID_CONTROLCHU_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A85UVID_CONTROLCHU_Estado, ""))));
         A87U_TipResul = httpContext.cgiGet( edtU_TipResul_Internalname) ;
         n87U_TipResul = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A87U_TipResul", A87U_TipResul);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_TIPRESUL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A87U_TipResul, ""))));
         A66U_WhsDest = httpContext.cgiGet( edtU_WhsDest_Internalname) ;
         n66U_WhsDest = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66U_WhsDest", A66U_WhsDest);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_U_WHSDEST", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A66U_WhsDest, ""))));
         A95UVID_CONTROLCHU_Comment = httpContext.cgiGet( edtUVID_CONTROLCHU_Comment_Internalname) ;
         n95UVID_CONTROLCHU_Comment = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A95UVID_CONTROLCHU_Comment", A95UVID_CONTROLCHU_Comment);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_UVID_CONTROLCHU_COMMENT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A95UVID_CONTROLCHU_Comment, ""))));
         /* Read saved values. */
         wcpOA43UVID_CONTROLCHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA43UVID_CONTROLCHDocEntry"), ",", ".")) ;
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
      e130V2 ();
      if (returnInSub) return;
   }

   public void e130V2( )
   {
      /* Start Routine */
      if ( ! new com.wms.isauthorized(remoteHandle, context).executeUdp( AV13Pgmname) )
      {
         callWebObject(formatLink("com.wms.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e140V2( )
   {
      /* Load Routine */
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV7TrnContext = (com.wms.SdtTransactionContext)new com.wms.SdtTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV13Pgmname );
      AV7TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtTransactionContext_Transactionname( "RegistroInspeccionH" );
      AV8TrnContextAtt = (com.wms.SdtTransactionContext_Attribute)new com.wms.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "UVID_CONTROLCHDocEntry" );
      AV8TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV6UVID_CONTROLCHDocEntry, 9, 0) );
      AV7TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV8TrnContextAtt, 0);
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "TransactionContext", "WMS"));
   }

   public void setparameters( Object[] obj )
   {
      A43UVID_CONTROLCHDocEntry = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
   }

   public String getresponse( String sGXDynURL )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa0V2( ) ;
      ws0V2( ) ;
      we0V2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlA43UVID_CONTROLCHDocEntry = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa0V2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "registroinspeccionhgeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa0V2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A43UVID_CONTROLCHDocEntry = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
      }
      wcpOA43UVID_CONTROLCHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA43UVID_CONTROLCHDocEntry"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( A43UVID_CONTROLCHDocEntry != wcpOA43UVID_CONTROLCHDocEntry ) ) )
      {
         setjustcreated();
      }
      wcpOA43UVID_CONTROLCHDocEntry = A43UVID_CONTROLCHDocEntry ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA43UVID_CONTROLCHDocEntry = httpContext.cgiGet( sPrefix+"A43UVID_CONTROLCHDocEntry_CTRL") ;
      if ( GXutil.len( sCtrlA43UVID_CONTROLCHDocEntry) > 0 )
      {
         A43UVID_CONTROLCHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA43UVID_CONTROLCHDocEntry), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
      }
      else
      {
         A43UVID_CONTROLCHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A43UVID_CONTROLCHDocEntry_PARM"), ",", ".")) ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa0V2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws0V2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws0V2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A43UVID_CONTROLCHDocEntry_PARM", GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA43UVID_CONTROLCHDocEntry)) > 0 )
      {
         com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A43UVID_CONTROLCHDocEntry_CTRL", GXutil.rtrim( sCtrlA43UVID_CONTROLCHDocEntry));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we0V2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName ;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?15125532");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?11405179");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2018151505658");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("registroinspeccionhgeneral.js", "?2018151505659");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtUVID_CONTROLCHDocEntry_Internalname = sPrefix+"UVID_CONTROLCHDOCENTRY" ;
      edtU_WhsCode_Internalname = sPrefix+"U_WHSCODE" ;
      edtU_ItemCode_Internalname = sPrefix+"U_ITEMCODE" ;
      edtU_NoLote_Internalname = sPrefix+"U_NOLOTE" ;
      edtU_Cantidad_Internalname = sPrefix+"U_CANTIDAD" ;
      edtU_Bultos_Internalname = sPrefix+"U_BULTOS" ;
      edtU_BultosMu_Internalname = sPrefix+"U_BULTOSMU" ;
      edtU_Traslado_Internalname = sPrefix+"U_TRASLADO" ;
      edtU_FecIngr_Internalname = sPrefix+"U_FECINGR" ;
      edtU_UM_Internalname = sPrefix+"U_UM" ;
      edtU_FecIni_Internalname = sPrefix+"U_FECINI" ;
      edtU_FecFin_Internalname = sPrefix+"U_FECFIN" ;
      edtU_Reanalis_Internalname = sPrefix+"U_REANALIS" ;
      edtU_CorrAnal_Internalname = sPrefix+"U_CORRANAL" ;
      edtU_NoDoc_Internalname = sPrefix+"U_NODOC" ;
      edtU_FecContr_Internalname = sPrefix+"U_FECCONTR" ;
      edtU_CorrLote_Internalname = sPrefix+"U_CORRLOTE" ;
      edtU_FecUltIn_Internalname = sPrefix+"U_FECULTIN" ;
      edtU_CCCode_Internalname = sPrefix+"U_CCCODE" ;
      edtU_PrjCode_Internalname = sPrefix+"U_PRJCODE" ;
      edtUVID_CONTROLCHU_Estado_Internalname = sPrefix+"UVID_CONTROLCHU_ESTADO" ;
      edtU_TipResul_Internalname = sPrefix+"U_TIPRESUL" ;
      edtU_WhsDest_Internalname = sPrefix+"U_WHSDEST" ;
      edtUVID_CONTROLCHU_Comment_Internalname = sPrefix+"UVID_CONTROLCHU_COMMENT" ;
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      divMaintable_Internalname = sPrefix+"MAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
   }

   public void initialize_properties( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      edtUVID_CONTROLCHU_Comment_Enabled = 0 ;
      edtU_WhsDest_Jsonclick = "" ;
      edtU_WhsDest_Enabled = 0 ;
      edtU_TipResul_Jsonclick = "" ;
      edtU_TipResul_Enabled = 0 ;
      edtUVID_CONTROLCHU_Estado_Jsonclick = "" ;
      edtUVID_CONTROLCHU_Estado_Enabled = 0 ;
      edtU_PrjCode_Jsonclick = "" ;
      edtU_PrjCode_Enabled = 0 ;
      edtU_CCCode_Jsonclick = "" ;
      edtU_CCCode_Enabled = 0 ;
      edtU_FecUltIn_Jsonclick = "" ;
      edtU_FecUltIn_Enabled = 0 ;
      edtU_CorrLote_Jsonclick = "" ;
      edtU_CorrLote_Enabled = 0 ;
      edtU_FecContr_Jsonclick = "" ;
      edtU_FecContr_Enabled = 0 ;
      edtU_NoDoc_Jsonclick = "" ;
      edtU_NoDoc_Enabled = 0 ;
      edtU_CorrAnal_Jsonclick = "" ;
      edtU_CorrAnal_Enabled = 0 ;
      edtU_Reanalis_Jsonclick = "" ;
      edtU_Reanalis_Enabled = 0 ;
      edtU_FecFin_Jsonclick = "" ;
      edtU_FecFin_Enabled = 0 ;
      edtU_FecIni_Jsonclick = "" ;
      edtU_FecIni_Enabled = 0 ;
      edtU_UM_Jsonclick = "" ;
      edtU_UM_Enabled = 0 ;
      edtU_FecIngr_Jsonclick = "" ;
      edtU_FecIngr_Enabled = 0 ;
      edtU_Traslado_Jsonclick = "" ;
      edtU_Traslado_Enabled = 0 ;
      edtU_BultosMu_Jsonclick = "" ;
      edtU_BultosMu_Enabled = 0 ;
      edtU_Bultos_Jsonclick = "" ;
      edtU_Bultos_Enabled = 0 ;
      edtU_Cantidad_Jsonclick = "" ;
      edtU_Cantidad_Enabled = 0 ;
      edtU_NoLote_Jsonclick = "" ;
      edtU_NoLote_Enabled = 0 ;
      edtU_ItemCode_Jsonclick = "" ;
      edtU_ItemCode_Enabled = 0 ;
      edtU_WhsCode_Jsonclick = "" ;
      edtU_WhsCode_Enabled = 0 ;
      edtUVID_CONTROLCHDocEntry_Jsonclick = "" ;
      edtUVID_CONTROLCHDocEntry_Enabled = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e110V1',iparms:[{av:'A43UVID_CONTROLCHDocEntry',fld:'UVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e120V1',iparms:[{av:'A43UVID_CONTROLCHDocEntry',fld:'UVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
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
      sPrefix = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A65U_WhsCode = "" ;
      A63U_ItemCode = "" ;
      A70U_NoLote = "" ;
      A86U_Traslado = "" ;
      A76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      A78U_UM = "" ;
      A81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      A82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      A104U_Reanalis = "" ;
      A80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      A77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      A93U_CCCode = "" ;
      A94U_PrjCode = "" ;
      A85UVID_CONTROLCHU_Estado = "" ;
      A87U_TipResul = "" ;
      A66U_WhsDest = "" ;
      A95UVID_CONTROLCHU_Comment = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV13Pgmname = "" ;
      scmdbuf = "" ;
      H000V2_A43UVID_CONTROLCHDocEntry = new int[1] ;
      H000V2_A95UVID_CONTROLCHU_Comment = new String[] {""} ;
      H000V2_n95UVID_CONTROLCHU_Comment = new boolean[] {false} ;
      H000V2_A66U_WhsDest = new String[] {""} ;
      H000V2_n66U_WhsDest = new boolean[] {false} ;
      H000V2_A87U_TipResul = new String[] {""} ;
      H000V2_n87U_TipResul = new boolean[] {false} ;
      H000V2_A85UVID_CONTROLCHU_Estado = new String[] {""} ;
      H000V2_n85UVID_CONTROLCHU_Estado = new boolean[] {false} ;
      H000V2_A94U_PrjCode = new String[] {""} ;
      H000V2_n94U_PrjCode = new boolean[] {false} ;
      H000V2_A93U_CCCode = new String[] {""} ;
      H000V2_n93U_CCCode = new boolean[] {false} ;
      H000V2_A77U_FecUltIn = new java.util.Date[] {GXutil.nullDate()} ;
      H000V2_n77U_FecUltIn = new boolean[] {false} ;
      H000V2_A71U_CorrLote = new int[1] ;
      H000V2_n71U_CorrLote = new boolean[] {false} ;
      H000V2_A80U_FecContr = new java.util.Date[] {GXutil.nullDate()} ;
      H000V2_n80U_FecContr = new boolean[] {false} ;
      H000V2_A79U_NoDoc = new int[1] ;
      H000V2_n79U_NoDoc = new boolean[] {false} ;
      H000V2_A72U_CorrAnal = new int[1] ;
      H000V2_n72U_CorrAnal = new boolean[] {false} ;
      H000V2_A104U_Reanalis = new String[] {""} ;
      H000V2_n104U_Reanalis = new boolean[] {false} ;
      H000V2_A82U_FecFin = new java.util.Date[] {GXutil.nullDate()} ;
      H000V2_n82U_FecFin = new boolean[] {false} ;
      H000V2_A81U_FecIni = new java.util.Date[] {GXutil.nullDate()} ;
      H000V2_n81U_FecIni = new boolean[] {false} ;
      H000V2_A78U_UM = new String[] {""} ;
      H000V2_n78U_UM = new boolean[] {false} ;
      H000V2_A76U_FecIngr = new java.util.Date[] {GXutil.nullDate()} ;
      H000V2_n76U_FecIngr = new boolean[] {false} ;
      H000V2_A86U_Traslado = new String[] {""} ;
      H000V2_n86U_Traslado = new boolean[] {false} ;
      H000V2_A75U_BultosMu = new int[1] ;
      H000V2_n75U_BultosMu = new boolean[] {false} ;
      H000V2_A74U_Bultos = new int[1] ;
      H000V2_n74U_Bultos = new boolean[] {false} ;
      H000V2_A73U_Cantidad = new long[1] ;
      H000V2_n73U_Cantidad = new boolean[] {false} ;
      H000V2_A70U_NoLote = new String[] {""} ;
      H000V2_n70U_NoLote = new boolean[] {false} ;
      H000V2_A63U_ItemCode = new String[] {""} ;
      H000V2_n63U_ItemCode = new boolean[] {false} ;
      H000V2_A65U_WhsCode = new String[] {""} ;
      H000V2_n65U_WhsCode = new boolean[] {false} ;
      AV7TrnContext = new com.wms.SdtTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV8TrnContextAtt = new com.wms.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA43UVID_CONTROLCHDocEntry = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.registroinspeccionhgeneral__default(),
         new Object[] {
             new Object[] {
            H000V2_A43UVID_CONTROLCHDocEntry, H000V2_A95UVID_CONTROLCHU_Comment, H000V2_n95UVID_CONTROLCHU_Comment, H000V2_A66U_WhsDest, H000V2_n66U_WhsDest, H000V2_A87U_TipResul, H000V2_n87U_TipResul, H000V2_A85UVID_CONTROLCHU_Estado, H000V2_n85UVID_CONTROLCHU_Estado, H000V2_A94U_PrjCode,
            H000V2_n94U_PrjCode, H000V2_A93U_CCCode, H000V2_n93U_CCCode, H000V2_A77U_FecUltIn, H000V2_n77U_FecUltIn, H000V2_A71U_CorrLote, H000V2_n71U_CorrLote, H000V2_A80U_FecContr, H000V2_n80U_FecContr, H000V2_A79U_NoDoc,
            H000V2_n79U_NoDoc, H000V2_A72U_CorrAnal, H000V2_n72U_CorrAnal, H000V2_A104U_Reanalis, H000V2_n104U_Reanalis, H000V2_A82U_FecFin, H000V2_n82U_FecFin, H000V2_A81U_FecIni, H000V2_n81U_FecIni, H000V2_A78U_UM,
            H000V2_n78U_UM, H000V2_A76U_FecIngr, H000V2_n76U_FecIngr, H000V2_A86U_Traslado, H000V2_n86U_Traslado, H000V2_A75U_BultosMu, H000V2_n75U_BultosMu, H000V2_A74U_Bultos, H000V2_n74U_Bultos, H000V2_A73U_Cantidad,
            H000V2_n73U_Cantidad, H000V2_A70U_NoLote, H000V2_n70U_NoLote, H000V2_A63U_ItemCode, H000V2_n63U_ItemCode, H000V2_A65U_WhsCode, H000V2_n65U_WhsCode
            }
         }
      );
      AV13Pgmname = "RegistroInspeccionHGeneral" ;
      /* GeneXus formulas. */
      AV13Pgmname = "RegistroInspeccionHGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA43UVID_CONTROLCHDocEntry ;
   private int A43UVID_CONTROLCHDocEntry ;
   private int A74U_Bultos ;
   private int A75U_BultosMu ;
   private int A72U_CorrAnal ;
   private int A79U_NoDoc ;
   private int A71U_CorrLote ;
   private int edtUVID_CONTROLCHDocEntry_Enabled ;
   private int edtU_WhsCode_Enabled ;
   private int edtU_ItemCode_Enabled ;
   private int edtU_NoLote_Enabled ;
   private int edtU_Cantidad_Enabled ;
   private int edtU_Bultos_Enabled ;
   private int edtU_BultosMu_Enabled ;
   private int edtU_Traslado_Enabled ;
   private int edtU_FecIngr_Enabled ;
   private int edtU_UM_Enabled ;
   private int edtU_FecIni_Enabled ;
   private int edtU_FecFin_Enabled ;
   private int edtU_Reanalis_Enabled ;
   private int edtU_CorrAnal_Enabled ;
   private int edtU_NoDoc_Enabled ;
   private int edtU_FecContr_Enabled ;
   private int edtU_CorrLote_Enabled ;
   private int edtU_FecUltIn_Enabled ;
   private int edtU_CCCode_Enabled ;
   private int edtU_PrjCode_Enabled ;
   private int edtUVID_CONTROLCHU_Estado_Enabled ;
   private int edtU_TipResul_Enabled ;
   private int edtU_WhsDest_Enabled ;
   private int edtUVID_CONTROLCHU_Comment_Enabled ;
   private int AV6UVID_CONTROLCHDocEntry ;
   private int idxLst ;
   private long A73U_Cantidad ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A86U_Traslado ;
   private String A104U_Reanalis ;
   private String A85UVID_CONTROLCHU_Estado ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String divMaintable_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divAttributestable_Internalname ;
   private String edtUVID_CONTROLCHDocEntry_Internalname ;
   private String edtUVID_CONTROLCHDocEntry_Jsonclick ;
   private String edtU_WhsCode_Internalname ;
   private String edtU_WhsCode_Jsonclick ;
   private String edtU_ItemCode_Internalname ;
   private String edtU_ItemCode_Jsonclick ;
   private String edtU_NoLote_Internalname ;
   private String edtU_NoLote_Jsonclick ;
   private String edtU_Cantidad_Internalname ;
   private String edtU_Cantidad_Jsonclick ;
   private String edtU_Bultos_Internalname ;
   private String edtU_Bultos_Jsonclick ;
   private String edtU_BultosMu_Internalname ;
   private String edtU_BultosMu_Jsonclick ;
   private String edtU_Traslado_Internalname ;
   private String edtU_Traslado_Jsonclick ;
   private String edtU_FecIngr_Internalname ;
   private String edtU_FecIngr_Jsonclick ;
   private String edtU_UM_Internalname ;
   private String edtU_UM_Jsonclick ;
   private String edtU_FecIni_Internalname ;
   private String edtU_FecIni_Jsonclick ;
   private String edtU_FecFin_Internalname ;
   private String edtU_FecFin_Jsonclick ;
   private String edtU_Reanalis_Internalname ;
   private String edtU_Reanalis_Jsonclick ;
   private String edtU_CorrAnal_Internalname ;
   private String edtU_CorrAnal_Jsonclick ;
   private String edtU_NoDoc_Internalname ;
   private String edtU_NoDoc_Jsonclick ;
   private String edtU_FecContr_Internalname ;
   private String edtU_FecContr_Jsonclick ;
   private String edtU_CorrLote_Internalname ;
   private String edtU_CorrLote_Jsonclick ;
   private String edtU_FecUltIn_Internalname ;
   private String edtU_FecUltIn_Jsonclick ;
   private String edtU_CCCode_Internalname ;
   private String edtU_CCCode_Jsonclick ;
   private String edtU_PrjCode_Internalname ;
   private String edtU_PrjCode_Jsonclick ;
   private String edtUVID_CONTROLCHU_Estado_Internalname ;
   private String edtUVID_CONTROLCHU_Estado_Jsonclick ;
   private String edtU_TipResul_Internalname ;
   private String edtU_TipResul_Jsonclick ;
   private String edtU_WhsDest_Internalname ;
   private String edtU_WhsDest_Jsonclick ;
   private String edtUVID_CONTROLCHU_Comment_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV13Pgmname ;
   private String scmdbuf ;
   private String sCtrlA43UVID_CONTROLCHDocEntry ;
   private java.util.Date A76U_FecIngr ;
   private java.util.Date A81U_FecIni ;
   private java.util.Date A82U_FecFin ;
   private java.util.Date A80U_FecContr ;
   private java.util.Date A77U_FecUltIn ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n95UVID_CONTROLCHU_Comment ;
   private boolean n66U_WhsDest ;
   private boolean n87U_TipResul ;
   private boolean n85UVID_CONTROLCHU_Estado ;
   private boolean n94U_PrjCode ;
   private boolean n93U_CCCode ;
   private boolean n77U_FecUltIn ;
   private boolean n71U_CorrLote ;
   private boolean n80U_FecContr ;
   private boolean n79U_NoDoc ;
   private boolean n72U_CorrAnal ;
   private boolean n104U_Reanalis ;
   private boolean n82U_FecFin ;
   private boolean n81U_FecIni ;
   private boolean n78U_UM ;
   private boolean n76U_FecIngr ;
   private boolean n86U_Traslado ;
   private boolean n75U_BultosMu ;
   private boolean n74U_Bultos ;
   private boolean n73U_Cantidad ;
   private boolean n70U_NoLote ;
   private boolean n63U_ItemCode ;
   private boolean n65U_WhsCode ;
   private boolean returnInSub ;
   private String A65U_WhsCode ;
   private String A63U_ItemCode ;
   private String A70U_NoLote ;
   private String A78U_UM ;
   private String A93U_CCCode ;
   private String A94U_PrjCode ;
   private String A87U_TipResul ;
   private String A66U_WhsDest ;
   private String A95UVID_CONTROLCHU_Comment ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private IDataStoreProvider pr_default ;
   private int[] H000V2_A43UVID_CONTROLCHDocEntry ;
   private String[] H000V2_A95UVID_CONTROLCHU_Comment ;
   private boolean[] H000V2_n95UVID_CONTROLCHU_Comment ;
   private String[] H000V2_A66U_WhsDest ;
   private boolean[] H000V2_n66U_WhsDest ;
   private String[] H000V2_A87U_TipResul ;
   private boolean[] H000V2_n87U_TipResul ;
   private String[] H000V2_A85UVID_CONTROLCHU_Estado ;
   private boolean[] H000V2_n85UVID_CONTROLCHU_Estado ;
   private String[] H000V2_A94U_PrjCode ;
   private boolean[] H000V2_n94U_PrjCode ;
   private String[] H000V2_A93U_CCCode ;
   private boolean[] H000V2_n93U_CCCode ;
   private java.util.Date[] H000V2_A77U_FecUltIn ;
   private boolean[] H000V2_n77U_FecUltIn ;
   private int[] H000V2_A71U_CorrLote ;
   private boolean[] H000V2_n71U_CorrLote ;
   private java.util.Date[] H000V2_A80U_FecContr ;
   private boolean[] H000V2_n80U_FecContr ;
   private int[] H000V2_A79U_NoDoc ;
   private boolean[] H000V2_n79U_NoDoc ;
   private int[] H000V2_A72U_CorrAnal ;
   private boolean[] H000V2_n72U_CorrAnal ;
   private String[] H000V2_A104U_Reanalis ;
   private boolean[] H000V2_n104U_Reanalis ;
   private java.util.Date[] H000V2_A82U_FecFin ;
   private boolean[] H000V2_n82U_FecFin ;
   private java.util.Date[] H000V2_A81U_FecIni ;
   private boolean[] H000V2_n81U_FecIni ;
   private String[] H000V2_A78U_UM ;
   private boolean[] H000V2_n78U_UM ;
   private java.util.Date[] H000V2_A76U_FecIngr ;
   private boolean[] H000V2_n76U_FecIngr ;
   private String[] H000V2_A86U_Traslado ;
   private boolean[] H000V2_n86U_Traslado ;
   private int[] H000V2_A75U_BultosMu ;
   private boolean[] H000V2_n75U_BultosMu ;
   private int[] H000V2_A74U_Bultos ;
   private boolean[] H000V2_n74U_Bultos ;
   private long[] H000V2_A73U_Cantidad ;
   private boolean[] H000V2_n73U_Cantidad ;
   private String[] H000V2_A70U_NoLote ;
   private boolean[] H000V2_n70U_NoLote ;
   private String[] H000V2_A63U_ItemCode ;
   private boolean[] H000V2_n63U_ItemCode ;
   private String[] H000V2_A65U_WhsCode ;
   private boolean[] H000V2_n65U_WhsCode ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private com.wms.SdtTransactionContext AV7TrnContext ;
   private com.wms.SdtTransactionContext_Attribute AV8TrnContextAtt ;
}

final  class registroinspeccionhgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000V2", "SELECT [DocEntry], [U_Comment], [U_WhsDest], [U_TipResul], [U_Estado], [U_PrjCode], [U_CCCode], [U_FecUltIn], [U_CorrLote], [U_FecContr], [U_NoDoc], [U_CorrAnal], [U_Reanalis], [U_FecFin], [U_FecIni], [U_UM], [U_FecIngr], [U_Traslado], [U_BultosMu], [U_Bultos], [U_Cantidad], [U_NoLote], [U_ItemCode], [U_WhsCode] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) WHERE [DocEntry] = ? ORDER BY [DocEntry] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((long[]) buf[39])[0] = rslt.getLong(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

