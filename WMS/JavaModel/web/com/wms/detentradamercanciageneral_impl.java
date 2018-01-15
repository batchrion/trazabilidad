/*
               File: detentradamercanciageneral_impl
        Description: Det Entrada Mercancia General
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:47.50
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

public final  class detentradamercanciageneral_impl extends GXWebComponent
{
   public detentradamercanciageneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public detentradamercanciageneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( detentradamercanciageneral_impl.class ));
   }

   public detentradamercanciageneral_impl( int remoteHandle ,
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
               A24CabEntradaMercanciaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Integer(A24CabEntradaMercanciaId)});
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
         pa0K2( ) ;
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
         httpContext.writeValue( "Det Entrada Mercancia General") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210224760");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.detentradamercanciageneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A24CabEntradaMercanciaId,6,0)))+"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA24CabEntradaMercanciaId", GXutil.ltrim( localUtil.ntoc( wcpOA24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_OCDOCENTRY", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_OC1LINENUM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A11OC1LineNum), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ITMITEMCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A12ItmItemCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ITMITEMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13ItmItemName, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_WHSCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14WhsCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PPDETLINCANTIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A15PPDetLinCantidad), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PPDETLINRECIBIDA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A27PPDetLinRecibida), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PPDETLINPENDIENTE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A16PPDetLinPendiente), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PPDETFECHAENTREGA", getSecureSignedToken( sPrefix, localUtil.format( A17PPDetFechaEntrega, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PPDETLINSTATUS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A23PPDetLinStatus, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRESA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A10Empresa, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A26Lote, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm0K2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("detentradamercanciageneral.js", "?201811210224767");
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
      return "DetEntradaMercanciaGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "Det Entrada Mercancia General" ;
   }

   public void wb0K0( )
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
            com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.wms.detentradamercanciageneral");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e110k1_client"+"'", TempTags, "", 2, "HLP_DetEntradaMercanciaGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e120k1_client"+"'", TempTags, "", 2, "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtCabEntradaMercanciaId_Internalname, "Id", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCabEntradaMercanciaId_Internalname, GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")), ((edtCabEntradaMercanciaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCabEntradaMercanciaId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCabEntradaMercanciaId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtOcDocEntry_Internalname, "Oc Doc Entry", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOcDocEntry_Internalname, GXutil.ltrim( localUtil.ntoc( A1OcDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtOcDocEntry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtOcDocEntry_Link, "", "", "", edtOcDocEntry_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtOcDocEntry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtOC1LineNum_Internalname, "OC1Line Num", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOC1LineNum_Internalname, GXutil.ltrim( localUtil.ntoc( A11OC1LineNum, (byte)(9), (byte)(0), ",", "")), ((edtOC1LineNum_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11OC1LineNum), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A11OC1LineNum), "ZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOC1LineNum_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtOC1LineNum_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtItmItemCode_Internalname, "Itm Item Code", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtItmItemCode_Internalname, A12ItmItemCode, GXutil.rtrim( localUtil.format( A12ItmItemCode, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItmItemCode_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtItmItemCode_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtItmItemName_Internalname, "Itm Item Name", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtItmItemName_Internalname, A13ItmItemName, GXutil.rtrim( localUtil.format( A13ItmItemName, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItmItemName_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtItmItemName_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtWhsCode_Internalname, "Whs Code", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtWhsCode_Internalname, A14WhsCode, GXutil.rtrim( localUtil.format( A14WhsCode, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWhsCode_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtWhsCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPPDetLinCantidad_Internalname, "PPDet Lin Cantidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPPDetLinCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A15PPDetLinCantidad, (byte)(18), (byte)(0), ",", "")), ((edtPPDetLinCantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A15PPDetLinCantidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A15PPDetLinCantidad), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPPDetLinCantidad_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPPDetLinCantidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPPDetLinRecibida_Internalname, "Recibida", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPPDetLinRecibida_Internalname, GXutil.ltrim( localUtil.ntoc( A27PPDetLinRecibida, (byte)(18), (byte)(0), ",", "")), ((edtPPDetLinRecibida_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A27PPDetLinRecibida), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A27PPDetLinRecibida), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPPDetLinRecibida_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPPDetLinRecibida_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPPDetLinPendiente_Internalname, "PPDet Lin Pendiente", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPPDetLinPendiente_Internalname, GXutil.ltrim( localUtil.ntoc( A16PPDetLinPendiente, (byte)(18), (byte)(0), ",", "")), ((edtPPDetLinPendiente_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A16PPDetLinPendiente), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A16PPDetLinPendiente), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPPDetLinPendiente_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPPDetLinPendiente_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPPDetFechaEntrega_Internalname, "PPDet Fecha Entrega", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPPDetFechaEntrega_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPPDetFechaEntrega_Internalname, localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A17PPDetFechaEntrega, "99/99/9999 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPPDetFechaEntrega_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPPDetFechaEntrega_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercanciaGeneral.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtPPDetFechaEntrega_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPPDetFechaEntrega_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPPDetLinStatus_Internalname, "PPDet Lin Status", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPPDetLinStatus_Internalname, GXutil.rtrim( A23PPDetLinStatus), GXutil.rtrim( localUtil.format( A23PPDetLinStatus, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPPDetLinStatus_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPPDetLinStatus_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtEmpresa_Internalname, "Empresa", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtEmpresa_Internalname, A10Empresa, GXutil.rtrim( localUtil.format( A10Empresa, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresa_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtEmpresa_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtLote_Internalname, "Lote", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtLote_Internalname, A26Lote, GXutil.rtrim( localUtil.format( A26Lote, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLote_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtLote_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercanciaGeneral.htm");
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

   public void start0K2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
            Form.getMeta().addItem("description", "Det Entrada Mercancia General", (short)(0)) ;
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
            strup0K0( ) ;
         }
      }
   }

   public void ws0K2( )
   {
      start0K2( ) ;
      evt0K2( ) ;
   }

   public void evt0K2( )
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
                              strup0K0( ) ;
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
                              strup0K0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e130K2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0K0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e140K2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0K0( ) ;
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
                              strup0K0( ) ;
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

   public void we0K2( )
   {
      if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0K2( ) ;
         }
      }
   }

   public void pa0K2( )
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
      rf0K2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "DetEntradaMercanciaGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf0K2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H000K2 */
         pr_default.execute(0, new Object[] {new Integer(A24CabEntradaMercanciaId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A26Lote = H000K2_A26Lote[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A26Lote", A26Lote);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_LOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A26Lote, ""))));
            n26Lote = H000K2_n26Lote[0] ;
            A10Empresa = H000K2_A10Empresa[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Empresa", A10Empresa);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_EMPRESA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A10Empresa, ""))));
            A23PPDetLinStatus = H000K2_A23PPDetLinStatus[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A23PPDetLinStatus", A23PPDetLinStatus);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PPDETLINSTATUS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A23PPDetLinStatus, ""))));
            A17PPDetFechaEntrega = H000K2_A17PPDetFechaEntrega[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17PPDetFechaEntrega", localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PPDETFECHAENTREGA", getSecureSignedToken( sPrefix, localUtil.format( A17PPDetFechaEntrega, "99/99/9999 99:99:99")));
            A16PPDetLinPendiente = H000K2_A16PPDetLinPendiente[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16PPDetLinPendiente", GXutil.ltrim( GXutil.str( A16PPDetLinPendiente, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PPDETLINPENDIENTE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A16PPDetLinPendiente), "ZZZZZZZZZZZZZZZZZ9")));
            A27PPDetLinRecibida = H000K2_A27PPDetLinRecibida[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27PPDetLinRecibida", GXutil.ltrim( GXutil.str( A27PPDetLinRecibida, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PPDETLINRECIBIDA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A27PPDetLinRecibida), "ZZZZZZZZZZZZZZZZZ9")));
            A15PPDetLinCantidad = H000K2_A15PPDetLinCantidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A15PPDetLinCantidad", GXutil.ltrim( GXutil.str( A15PPDetLinCantidad, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PPDETLINCANTIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A15PPDetLinCantidad), "ZZZZZZZZZZZZZZZZZ9")));
            A14WhsCode = H000K2_A14WhsCode[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14WhsCode", A14WhsCode);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_WHSCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14WhsCode, ""))));
            A13ItmItemName = H000K2_A13ItmItemName[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13ItmItemName", A13ItmItemName);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ITMITEMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13ItmItemName, ""))));
            A12ItmItemCode = H000K2_A12ItmItemCode[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12ItmItemCode", A12ItmItemCode);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ITMITEMCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A12ItmItemCode, ""))));
            A11OC1LineNum = H000K2_A11OC1LineNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11OC1LineNum", GXutil.ltrim( GXutil.str( A11OC1LineNum, 9, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OC1LINENUM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A11OC1LineNum), "ZZZZZZZZ9")));
            A1OcDocEntry = H000K2_A1OcDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OCDOCENTRY", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")));
            /* Execute user event: Load */
            e140K2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb0K0( ) ;
      }
   }

   public void strup0K0( )
   {
      /* Before Start, stand alone formulas. */
      AV13Pgmname = "DetEntradaMercanciaGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e130K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A1OcDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtOcDocEntry_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OCDOCENTRY", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")));
         A11OC1LineNum = (int)(localUtil.ctol( httpContext.cgiGet( edtOC1LineNum_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11OC1LineNum", GXutil.ltrim( GXutil.str( A11OC1LineNum, 9, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OC1LINENUM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A11OC1LineNum), "ZZZZZZZZ9")));
         A12ItmItemCode = httpContext.cgiGet( edtItmItemCode_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12ItmItemCode", A12ItmItemCode);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ITMITEMCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A12ItmItemCode, ""))));
         A13ItmItemName = httpContext.cgiGet( edtItmItemName_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13ItmItemName", A13ItmItemName);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ITMITEMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13ItmItemName, ""))));
         A14WhsCode = httpContext.cgiGet( edtWhsCode_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14WhsCode", A14WhsCode);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_WHSCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14WhsCode, ""))));
         A15PPDetLinCantidad = localUtil.ctol( httpContext.cgiGet( edtPPDetLinCantidad_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A15PPDetLinCantidad", GXutil.ltrim( GXutil.str( A15PPDetLinCantidad, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PPDETLINCANTIDAD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A15PPDetLinCantidad), "ZZZZZZZZZZZZZZZZZ9")));
         A27PPDetLinRecibida = localUtil.ctol( httpContext.cgiGet( edtPPDetLinRecibida_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27PPDetLinRecibida", GXutil.ltrim( GXutil.str( A27PPDetLinRecibida, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PPDETLINRECIBIDA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A27PPDetLinRecibida), "ZZZZZZZZZZZZZZZZZ9")));
         A16PPDetLinPendiente = localUtil.ctol( httpContext.cgiGet( edtPPDetLinPendiente_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16PPDetLinPendiente", GXutil.ltrim( GXutil.str( A16PPDetLinPendiente, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PPDETLINPENDIENTE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A16PPDetLinPendiente), "ZZZZZZZZZZZZZZZZZ9")));
         A17PPDetFechaEntrega = localUtil.ctot( httpContext.cgiGet( edtPPDetFechaEntrega_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17PPDetFechaEntrega", localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PPDETFECHAENTREGA", getSecureSignedToken( sPrefix, localUtil.format( A17PPDetFechaEntrega, "99/99/9999 99:99:99")));
         A23PPDetLinStatus = httpContext.cgiGet( edtPPDetLinStatus_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A23PPDetLinStatus", A23PPDetLinStatus);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PPDETLINSTATUS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A23PPDetLinStatus, ""))));
         A10Empresa = httpContext.cgiGet( edtEmpresa_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Empresa", A10Empresa);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_EMPRESA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A10Empresa, ""))));
         A26Lote = httpContext.cgiGet( edtLote_Internalname) ;
         n26Lote = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A26Lote", A26Lote);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_LOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A26Lote, ""))));
         /* Read saved values. */
         wcpOA24CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA24CabEntradaMercanciaId"), ",", ".")) ;
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
      e130K2 ();
      if (returnInSub) return;
   }

   public void e130K2( )
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

   protected void e140K2( )
   {
      /* Load Routine */
      edtOcDocEntry_Link = formatLink("com.wms.viewcabentradamercancia") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A24CabEntradaMercanciaId,6,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOcDocEntry_Internalname, "Link", edtOcDocEntry_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV7TrnContext = (com.wms.SdtTransactionContext)new com.wms.SdtTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV13Pgmname );
      AV7TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtTransactionContext_Transactionname( "DetEntradaMercancia" );
      AV8TrnContextAtt = (com.wms.SdtTransactionContext_Attribute)new com.wms.SdtTransactionContext_Attribute(remoteHandle, context);
      AV8TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "CabEntradaMercanciaId" );
      AV8TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV6CabEntradaMercanciaId, 6, 0) );
      AV7TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV8TrnContextAtt, 0);
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "TransactionContext", "WMS"));
   }

   public void setparameters( Object[] obj )
   {
      A24CabEntradaMercanciaId = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
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
      pa0K2( ) ;
      ws0K2( ) ;
      we0K2( ) ;
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
      sCtrlA24CabEntradaMercanciaId = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa0K2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "detentradamercanciageneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa0K2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A24CabEntradaMercanciaId = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
      }
      wcpOA24CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA24CabEntradaMercanciaId"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( A24CabEntradaMercanciaId != wcpOA24CabEntradaMercanciaId ) ) )
      {
         setjustcreated();
      }
      wcpOA24CabEntradaMercanciaId = A24CabEntradaMercanciaId ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA24CabEntradaMercanciaId = httpContext.cgiGet( sPrefix+"A24CabEntradaMercanciaId_CTRL") ;
      if ( GXutil.len( sCtrlA24CabEntradaMercanciaId) > 0 )
      {
         A24CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA24CabEntradaMercanciaId), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
      }
      else
      {
         A24CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A24CabEntradaMercanciaId_PARM"), ",", ".")) ;
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
      pa0K2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws0K2( ) ;
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
      ws0K2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A24CabEntradaMercanciaId_PARM", GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA24CabEntradaMercanciaId)) > 0 )
      {
         com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A24CabEntradaMercanciaId_CTRL", GXutil.rtrim( sCtrlA24CabEntradaMercanciaId));
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
      we0K2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1022385");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210224916");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("detentradamercanciageneral.js", "?201811210224917");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtCabEntradaMercanciaId_Internalname = sPrefix+"CABENTRADAMERCANCIAID" ;
      edtOcDocEntry_Internalname = sPrefix+"OCDOCENTRY" ;
      edtOC1LineNum_Internalname = sPrefix+"OC1LINENUM" ;
      edtItmItemCode_Internalname = sPrefix+"ITMITEMCODE" ;
      edtItmItemName_Internalname = sPrefix+"ITMITEMNAME" ;
      edtWhsCode_Internalname = sPrefix+"WHSCODE" ;
      edtPPDetLinCantidad_Internalname = sPrefix+"PPDETLINCANTIDAD" ;
      edtPPDetLinRecibida_Internalname = sPrefix+"PPDETLINRECIBIDA" ;
      edtPPDetLinPendiente_Internalname = sPrefix+"PPDETLINPENDIENTE" ;
      edtPPDetFechaEntrega_Internalname = sPrefix+"PPDETFECHAENTREGA" ;
      edtPPDetLinStatus_Internalname = sPrefix+"PPDETLINSTATUS" ;
      edtEmpresa_Internalname = sPrefix+"EMPRESA" ;
      edtLote_Internalname = sPrefix+"LOTE" ;
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
      edtLote_Jsonclick = "" ;
      edtLote_Enabled = 0 ;
      edtEmpresa_Jsonclick = "" ;
      edtEmpresa_Enabled = 0 ;
      edtPPDetLinStatus_Jsonclick = "" ;
      edtPPDetLinStatus_Enabled = 0 ;
      edtPPDetFechaEntrega_Jsonclick = "" ;
      edtPPDetFechaEntrega_Enabled = 0 ;
      edtPPDetLinPendiente_Jsonclick = "" ;
      edtPPDetLinPendiente_Enabled = 0 ;
      edtPPDetLinRecibida_Jsonclick = "" ;
      edtPPDetLinRecibida_Enabled = 0 ;
      edtPPDetLinCantidad_Jsonclick = "" ;
      edtPPDetLinCantidad_Enabled = 0 ;
      edtWhsCode_Jsonclick = "" ;
      edtWhsCode_Enabled = 0 ;
      edtItmItemName_Jsonclick = "" ;
      edtItmItemName_Enabled = 0 ;
      edtItmItemCode_Jsonclick = "" ;
      edtItmItemCode_Enabled = 0 ;
      edtOC1LineNum_Jsonclick = "" ;
      edtOC1LineNum_Enabled = 0 ;
      edtOcDocEntry_Jsonclick = "" ;
      edtOcDocEntry_Link = "" ;
      edtOcDocEntry_Enabled = 0 ;
      edtCabEntradaMercanciaId_Jsonclick = "" ;
      edtCabEntradaMercanciaId_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e110K1',iparms:[{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e120K1',iparms:[{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',nv:0}],oparms:[]}");
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
      A12ItmItemCode = "" ;
      A13ItmItemName = "" ;
      A14WhsCode = "" ;
      A17PPDetFechaEntrega = GXutil.resetTime( GXutil.nullDate() );
      A23PPDetLinStatus = "" ;
      A10Empresa = "" ;
      A26Lote = "" ;
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
      H000K2_A24CabEntradaMercanciaId = new int[1] ;
      H000K2_A26Lote = new String[] {""} ;
      H000K2_n26Lote = new boolean[] {false} ;
      H000K2_A10Empresa = new String[] {""} ;
      H000K2_A23PPDetLinStatus = new String[] {""} ;
      H000K2_A17PPDetFechaEntrega = new java.util.Date[] {GXutil.nullDate()} ;
      H000K2_A16PPDetLinPendiente = new long[1] ;
      H000K2_A27PPDetLinRecibida = new long[1] ;
      H000K2_A15PPDetLinCantidad = new long[1] ;
      H000K2_A14WhsCode = new String[] {""} ;
      H000K2_A13ItmItemName = new String[] {""} ;
      H000K2_A12ItmItemCode = new String[] {""} ;
      H000K2_A11OC1LineNum = new int[1] ;
      H000K2_A1OcDocEntry = new int[1] ;
      AV7TrnContext = new com.wms.SdtTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV8TrnContextAtt = new com.wms.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA24CabEntradaMercanciaId = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.detentradamercanciageneral__default(),
         new Object[] {
             new Object[] {
            H000K2_A24CabEntradaMercanciaId, H000K2_A26Lote, H000K2_n26Lote, H000K2_A10Empresa, H000K2_A23PPDetLinStatus, H000K2_A17PPDetFechaEntrega, H000K2_A16PPDetLinPendiente, H000K2_A27PPDetLinRecibida, H000K2_A15PPDetLinCantidad, H000K2_A14WhsCode,
            H000K2_A13ItmItemName, H000K2_A12ItmItemCode, H000K2_A11OC1LineNum, H000K2_A1OcDocEntry
            }
         }
      );
      AV13Pgmname = "DetEntradaMercanciaGeneral" ;
      /* GeneXus formulas. */
      AV13Pgmname = "DetEntradaMercanciaGeneral" ;
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
   private int wcpOA24CabEntradaMercanciaId ;
   private int A24CabEntradaMercanciaId ;
   private int A1OcDocEntry ;
   private int A11OC1LineNum ;
   private int edtCabEntradaMercanciaId_Enabled ;
   private int edtOcDocEntry_Enabled ;
   private int edtOC1LineNum_Enabled ;
   private int edtItmItemCode_Enabled ;
   private int edtItmItemName_Enabled ;
   private int edtWhsCode_Enabled ;
   private int edtPPDetLinCantidad_Enabled ;
   private int edtPPDetLinRecibida_Enabled ;
   private int edtPPDetLinPendiente_Enabled ;
   private int edtPPDetFechaEntrega_Enabled ;
   private int edtPPDetLinStatus_Enabled ;
   private int edtEmpresa_Enabled ;
   private int edtLote_Enabled ;
   private int AV6CabEntradaMercanciaId ;
   private int idxLst ;
   private long A15PPDetLinCantidad ;
   private long A27PPDetLinRecibida ;
   private long A16PPDetLinPendiente ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A23PPDetLinStatus ;
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
   private String edtCabEntradaMercanciaId_Internalname ;
   private String edtCabEntradaMercanciaId_Jsonclick ;
   private String edtOcDocEntry_Internalname ;
   private String edtOcDocEntry_Link ;
   private String edtOcDocEntry_Jsonclick ;
   private String edtOC1LineNum_Internalname ;
   private String edtOC1LineNum_Jsonclick ;
   private String edtItmItemCode_Internalname ;
   private String edtItmItemCode_Jsonclick ;
   private String edtItmItemName_Internalname ;
   private String edtItmItemName_Jsonclick ;
   private String edtWhsCode_Internalname ;
   private String edtWhsCode_Jsonclick ;
   private String edtPPDetLinCantidad_Internalname ;
   private String edtPPDetLinCantidad_Jsonclick ;
   private String edtPPDetLinRecibida_Internalname ;
   private String edtPPDetLinRecibida_Jsonclick ;
   private String edtPPDetLinPendiente_Internalname ;
   private String edtPPDetLinPendiente_Jsonclick ;
   private String edtPPDetFechaEntrega_Internalname ;
   private String edtPPDetFechaEntrega_Jsonclick ;
   private String edtPPDetLinStatus_Internalname ;
   private String edtPPDetLinStatus_Jsonclick ;
   private String edtEmpresa_Internalname ;
   private String edtEmpresa_Jsonclick ;
   private String edtLote_Internalname ;
   private String edtLote_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV13Pgmname ;
   private String scmdbuf ;
   private String sCtrlA24CabEntradaMercanciaId ;
   private java.util.Date A17PPDetFechaEntrega ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n26Lote ;
   private boolean returnInSub ;
   private String A12ItmItemCode ;
   private String A13ItmItemName ;
   private String A14WhsCode ;
   private String A10Empresa ;
   private String A26Lote ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private IDataStoreProvider pr_default ;
   private int[] H000K2_A24CabEntradaMercanciaId ;
   private String[] H000K2_A26Lote ;
   private boolean[] H000K2_n26Lote ;
   private String[] H000K2_A10Empresa ;
   private String[] H000K2_A23PPDetLinStatus ;
   private java.util.Date[] H000K2_A17PPDetFechaEntrega ;
   private long[] H000K2_A16PPDetLinPendiente ;
   private long[] H000K2_A27PPDetLinRecibida ;
   private long[] H000K2_A15PPDetLinCantidad ;
   private String[] H000K2_A14WhsCode ;
   private String[] H000K2_A13ItmItemName ;
   private String[] H000K2_A12ItmItemCode ;
   private int[] H000K2_A11OC1LineNum ;
   private int[] H000K2_A1OcDocEntry ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private com.wms.SdtTransactionContext AV7TrnContext ;
   private com.wms.SdtTransactionContext_Attribute AV8TrnContextAtt ;
}

final  class detentradamercanciageneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000K2", "SELECT [CabEntradaMercanciaId], [Lote], [Empresa], [PPDetLinStatus], [PPDetFechaEntrega], [PPDetLinPendiente], [PPDetLinRecibida], [PPDetLinCantidad], [WhsCode], [ItmItemName], [ItmItemCode], [OC1LineNum], [OcDocEntry] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE [CabEntradaMercanciaId] = ? ORDER BY [CabEntradaMercanciaId] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[4])[0] = rslt.getString(4, 1) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((long[]) buf[7])[0] = rslt.getLong(7) ;
               ((long[]) buf[8])[0] = rslt.getLong(8) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(11) ;
               ((int[]) buf[12])[0] = rslt.getInt(12) ;
               ((int[]) buf[13])[0] = rslt.getInt(13) ;
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

