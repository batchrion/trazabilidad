/*
               File: cabentradamercanciageneral_impl
        Description: Cab Entrada Mercancia General
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:43.35
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

public final  class cabentradamercanciageneral_impl extends GXWebComponent
{
   public cabentradamercanciageneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cabentradamercanciageneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cabentradamercanciageneral_impl.class ));
   }

   public cabentradamercanciageneral_impl( int remoteHandle ,
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
         pa0G2( ) ;
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
         httpContext.writeValue( "Cab Entrada Mercancia General") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210224341");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.cabentradamercanciageneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A24CabEntradaMercanciaId,6,0)))+"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PROVCARCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A3ProvCarCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PROVCARDNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A4ProvCardName, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_OCDOCDUEDATE", getSecureSignedToken( sPrefix, localUtil.format( A6OcDocDueDate, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_OCDOCDATE", getSecureSignedToken( sPrefix, localUtil.format( A5OcDocDate, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRESA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A10Empresa, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPSLPNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A8EmpSlpName, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USERNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A25UserName, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm0G2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("cabentradamercanciageneral.js", "?201811210224345");
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
      return "CabEntradaMercanciaGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "Cab Entrada Mercancia General" ;
   }

   public void wb0G0( )
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
            com.wms.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.wms.cabentradamercanciageneral");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e110g1_client"+"'", TempTags, "", 2, "HLP_CabEntradaMercanciaGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e120g1_client"+"'", TempTags, "", 2, "HLP_CabEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCabEntradaMercanciaId_Internalname, GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")), ((edtCabEntradaMercanciaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCabEntradaMercanciaId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCabEntradaMercanciaId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_CabEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOcDocEntry_Internalname, GXutil.ltrim( localUtil.ntoc( A1OcDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtOcDocEntry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOcDocEntry_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtOcDocEntry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_CabEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtProvCarCode_Internalname, "Prov Car Code", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtProvCarCode_Internalname, A3ProvCarCode, GXutil.rtrim( localUtil.format( A3ProvCarCode, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProvCarCode_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtProvCarCode_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_CabEntradaMercanciaGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtProvCardName_Internalname, "Prov Card Name", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtProvCardName_Internalname, A4ProvCardName, GXutil.rtrim( localUtil.format( A4ProvCardName, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProvCardName_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtProvCardName_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_CabEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtOcDocDueDate_Internalname, "Oc Doc Due Date", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtOcDocDueDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOcDocDueDate_Internalname, localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A6OcDocDueDate, "99/99/9999 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOcDocDueDate_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtOcDocDueDate_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_CabEntradaMercanciaGeneral.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtOcDocDueDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOcDocDueDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CabEntradaMercanciaGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtOcDocDate_Internalname, "Oc Doc Date", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtOcDocDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOcDocDate_Internalname, localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A5OcDocDate, "99/99/9999 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOcDocDate_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtOcDocDate_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_CabEntradaMercanciaGeneral.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtOcDocDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOcDocDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CabEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtEmpresa_Internalname, "Empresa", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtEmpresa_Internalname, A10Empresa, GXutil.rtrim( localUtil.format( A10Empresa, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresa_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtEmpresa_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_CabEntradaMercanciaGeneral.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtEmpSlpName_Internalname, "Emp Slp Name", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtEmpSlpName_Internalname, A8EmpSlpName, GXutil.rtrim( localUtil.format( A8EmpSlpName, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpSlpName_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtEmpSlpName_Enabled, 0, "text", "", 80, "chr", 1, "row", 155, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_CabEntradaMercanciaGeneral.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUserName_Internalname, "por", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUserName_Internalname, A25UserName, GXutil.rtrim( localUtil.format( A25UserName, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUserName_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUserName_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_CabEntradaMercanciaGeneral.htm");
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

   public void start0G2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
            Form.getMeta().addItem("description", "Cab Entrada Mercancia General", (short)(0)) ;
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
            strup0G0( ) ;
         }
      }
   }

   public void ws0G2( )
   {
      start0G2( ) ;
      evt0G2( ) ;
   }

   public void evt0G2( )
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
                              strup0G0( ) ;
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
                              strup0G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e130G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e140G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0G0( ) ;
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
                              strup0G0( ) ;
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

   public void we0G2( )
   {
      if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0G2( ) ;
         }
      }
   }

   public void pa0G2( )
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
      rf0G2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "CabEntradaMercanciaGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf0G2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H000G2 */
         pr_default.execute(0, new Object[] {new Integer(A24CabEntradaMercanciaId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A25UserName = H000G2_A25UserName[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A25UserName", A25UserName);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USERNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A25UserName, ""))));
            A8EmpSlpName = H000G2_A8EmpSlpName[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8EmpSlpName", A8EmpSlpName);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_EMPSLPNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A8EmpSlpName, ""))));
            A10Empresa = H000G2_A10Empresa[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Empresa", A10Empresa);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_EMPRESA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A10Empresa, ""))));
            A5OcDocDate = H000G2_A5OcDocDate[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5OcDocDate", localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OCDOCDATE", getSecureSignedToken( sPrefix, localUtil.format( A5OcDocDate, "99/99/9999 99:99:99")));
            A6OcDocDueDate = H000G2_A6OcDocDueDate[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6OcDocDueDate", localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OCDOCDUEDATE", getSecureSignedToken( sPrefix, localUtil.format( A6OcDocDueDate, "99/99/9999 99:99:99")));
            A4ProvCardName = H000G2_A4ProvCardName[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4ProvCardName", A4ProvCardName);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PROVCARDNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A4ProvCardName, ""))));
            A3ProvCarCode = H000G2_A3ProvCarCode[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3ProvCarCode", A3ProvCarCode);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PROVCARCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A3ProvCarCode, ""))));
            A1OcDocEntry = H000G2_A1OcDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OCDOCENTRY", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")));
            /* Execute user event: Load */
            e140G2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb0G0( ) ;
      }
   }

   public void strup0G0( )
   {
      /* Before Start, stand alone formulas. */
      AV13Pgmname = "CabEntradaMercanciaGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e130G2 ();
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
         A3ProvCarCode = httpContext.cgiGet( edtProvCarCode_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3ProvCarCode", A3ProvCarCode);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PROVCARCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A3ProvCarCode, ""))));
         A4ProvCardName = httpContext.cgiGet( edtProvCardName_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4ProvCardName", A4ProvCardName);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PROVCARDNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A4ProvCardName, ""))));
         A6OcDocDueDate = localUtil.ctot( httpContext.cgiGet( edtOcDocDueDate_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6OcDocDueDate", localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OCDOCDUEDATE", getSecureSignedToken( sPrefix, localUtil.format( A6OcDocDueDate, "99/99/9999 99:99:99")));
         A5OcDocDate = localUtil.ctot( httpContext.cgiGet( edtOcDocDate_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5OcDocDate", localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OCDOCDATE", getSecureSignedToken( sPrefix, localUtil.format( A5OcDocDate, "99/99/9999 99:99:99")));
         A10Empresa = httpContext.cgiGet( edtEmpresa_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Empresa", A10Empresa);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_EMPRESA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A10Empresa, ""))));
         A8EmpSlpName = httpContext.cgiGet( edtEmpSlpName_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8EmpSlpName", A8EmpSlpName);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_EMPSLPNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A8EmpSlpName, ""))));
         A25UserName = httpContext.cgiGet( edtUserName_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A25UserName", A25UserName);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USERNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A25UserName, ""))));
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
      e130G2 ();
      if (returnInSub) return;
   }

   public void e130G2( )
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

   protected void e140G2( )
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
      AV7TrnContext.setgxTv_SdtTransactionContext_Transactionname( "CabEntradaMercancia" );
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
      pa0G2( ) ;
      ws0G2( ) ;
      we0G2( ) ;
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
      pa0G2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "cabentradamercanciageneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa0G2( ) ;
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
      pa0G2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws0G2( ) ;
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
      ws0G2( ) ;
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
      we0G2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210224449");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("cabentradamercanciageneral.js", "?201811210224449");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtCabEntradaMercanciaId_Internalname = sPrefix+"CABENTRADAMERCANCIAID" ;
      edtOcDocEntry_Internalname = sPrefix+"OCDOCENTRY" ;
      edtProvCarCode_Internalname = sPrefix+"PROVCARCODE" ;
      edtProvCardName_Internalname = sPrefix+"PROVCARDNAME" ;
      edtOcDocDueDate_Internalname = sPrefix+"OCDOCDUEDATE" ;
      edtOcDocDate_Internalname = sPrefix+"OCDOCDATE" ;
      edtEmpresa_Internalname = sPrefix+"EMPRESA" ;
      edtEmpSlpName_Internalname = sPrefix+"EMPSLPNAME" ;
      edtUserName_Internalname = sPrefix+"USERNAME" ;
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
      edtUserName_Jsonclick = "" ;
      edtUserName_Enabled = 0 ;
      edtEmpSlpName_Jsonclick = "" ;
      edtEmpSlpName_Enabled = 0 ;
      edtEmpresa_Jsonclick = "" ;
      edtEmpresa_Enabled = 0 ;
      edtOcDocDate_Jsonclick = "" ;
      edtOcDocDate_Enabled = 0 ;
      edtOcDocDueDate_Jsonclick = "" ;
      edtOcDocDueDate_Enabled = 0 ;
      edtProvCardName_Jsonclick = "" ;
      edtProvCardName_Enabled = 0 ;
      edtProvCarCode_Jsonclick = "" ;
      edtProvCarCode_Enabled = 0 ;
      edtOcDocEntry_Jsonclick = "" ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e110G1',iparms:[{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e120G1',iparms:[{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',nv:0}],oparms:[]}");
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
      A3ProvCarCode = "" ;
      A4ProvCardName = "" ;
      A6OcDocDueDate = GXutil.resetTime( GXutil.nullDate() );
      A5OcDocDate = GXutil.resetTime( GXutil.nullDate() );
      A10Empresa = "" ;
      A8EmpSlpName = "" ;
      A25UserName = "" ;
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
      H000G2_A24CabEntradaMercanciaId = new int[1] ;
      H000G2_A25UserName = new String[] {""} ;
      H000G2_A8EmpSlpName = new String[] {""} ;
      H000G2_A10Empresa = new String[] {""} ;
      H000G2_A5OcDocDate = new java.util.Date[] {GXutil.nullDate()} ;
      H000G2_A6OcDocDueDate = new java.util.Date[] {GXutil.nullDate()} ;
      H000G2_A4ProvCardName = new String[] {""} ;
      H000G2_A3ProvCarCode = new String[] {""} ;
      H000G2_A1OcDocEntry = new int[1] ;
      AV7TrnContext = new com.wms.SdtTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV8TrnContextAtt = new com.wms.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA24CabEntradaMercanciaId = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.cabentradamercanciageneral__default(),
         new Object[] {
             new Object[] {
            H000G2_A24CabEntradaMercanciaId, H000G2_A25UserName, H000G2_A8EmpSlpName, H000G2_A10Empresa, H000G2_A5OcDocDate, H000G2_A6OcDocDueDate, H000G2_A4ProvCardName, H000G2_A3ProvCarCode, H000G2_A1OcDocEntry
            }
         }
      );
      AV13Pgmname = "CabEntradaMercanciaGeneral" ;
      /* GeneXus formulas. */
      AV13Pgmname = "CabEntradaMercanciaGeneral" ;
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
   private int edtCabEntradaMercanciaId_Enabled ;
   private int edtOcDocEntry_Enabled ;
   private int edtProvCarCode_Enabled ;
   private int edtProvCardName_Enabled ;
   private int edtOcDocDueDate_Enabled ;
   private int edtOcDocDate_Enabled ;
   private int edtEmpresa_Enabled ;
   private int edtEmpSlpName_Enabled ;
   private int edtUserName_Enabled ;
   private int AV6CabEntradaMercanciaId ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private String edtOcDocEntry_Jsonclick ;
   private String edtProvCarCode_Internalname ;
   private String edtProvCarCode_Jsonclick ;
   private String edtProvCardName_Internalname ;
   private String edtProvCardName_Jsonclick ;
   private String edtOcDocDueDate_Internalname ;
   private String edtOcDocDueDate_Jsonclick ;
   private String edtOcDocDate_Internalname ;
   private String edtOcDocDate_Jsonclick ;
   private String edtEmpresa_Internalname ;
   private String edtEmpresa_Jsonclick ;
   private String edtEmpSlpName_Internalname ;
   private String edtEmpSlpName_Jsonclick ;
   private String edtUserName_Internalname ;
   private String edtUserName_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV13Pgmname ;
   private String scmdbuf ;
   private String sCtrlA24CabEntradaMercanciaId ;
   private java.util.Date A6OcDocDueDate ;
   private java.util.Date A5OcDocDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String A3ProvCarCode ;
   private String A4ProvCardName ;
   private String A10Empresa ;
   private String A8EmpSlpName ;
   private String A25UserName ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private IDataStoreProvider pr_default ;
   private int[] H000G2_A24CabEntradaMercanciaId ;
   private String[] H000G2_A25UserName ;
   private String[] H000G2_A8EmpSlpName ;
   private String[] H000G2_A10Empresa ;
   private java.util.Date[] H000G2_A5OcDocDate ;
   private java.util.Date[] H000G2_A6OcDocDueDate ;
   private String[] H000G2_A4ProvCardName ;
   private String[] H000G2_A3ProvCarCode ;
   private int[] H000G2_A1OcDocEntry ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private com.wms.SdtTransactionContext AV7TrnContext ;
   private com.wms.SdtTransactionContext_Attribute AV8TrnContextAtt ;
}

final  class cabentradamercanciageneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000G2", "SELECT [CabEntradaMercanciaId], [UserName], [EmpSlpName], [Empresa], [OcDocDate], [OcDocDueDate], [ProvCardName], [ProvCarCode], [OcDocEntry] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE [CabEntradaMercanciaId] = ? ORDER BY [CabEntradaMercanciaId] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
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

