/*
               File: detentradamercancia_impl
        Description: Det Entrada Mercancia
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:49.17
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

public final  class detentradamercancia_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV7CabEntradaMercanciaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( AV7CabEntradaMercanciaId, 6, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCABENTRADAMERCANCIAID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CabEntradaMercanciaId), "ZZZZZ9")));
         }
      }
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Det Entrada Mercancia", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtOcDocEntry_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public detentradamercancia_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public detentradamercancia_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( detentradamercancia_impl.class ));
   }

   public detentradamercancia_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
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

   public void fix_multi_value_controls( )
   {
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Det Entrada Mercancia", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "BtnFirst" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtCabEntradaMercanciaId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCabEntradaMercanciaId_Internalname, GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")), ((edtCabEntradaMercanciaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCabEntradaMercanciaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtCabEntradaMercanciaId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtOcDocEntry_Internalname, "Número OC", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOcDocEntry_Internalname, GXutil.ltrim( localUtil.ntoc( A1OcDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtOcDocEntry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOcDocEntry_Jsonclick, 0, "Attribute", "", "", "", 1, edtOcDocEntry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtOC1LineNum_Internalname, "Número de Línea", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOC1LineNum_Internalname, GXutil.ltrim( localUtil.ntoc( A11OC1LineNum, (byte)(9), (byte)(0), ",", "")), ((edtOC1LineNum_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11OC1LineNum), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A11OC1LineNum), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOC1LineNum_Jsonclick, 0, "Attribute", "", "", "", 1, edtOC1LineNum_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtItmItemCode_Internalname, "Cod. Artículo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtItmItemCode_Internalname, A12ItmItemCode, GXutil.rtrim( localUtil.format( A12ItmItemCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItmItemCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtItmItemCode_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtItmItemName_Internalname, "Artículo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtItmItemName_Internalname, A13ItmItemName, GXutil.rtrim( localUtil.format( A13ItmItemName, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItmItemName_Jsonclick, 0, "Attribute", "", "", "", 1, edtItmItemName_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtWhsCode_Internalname, "Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtWhsCode_Internalname, A14WhsCode, GXutil.rtrim( localUtil.format( A14WhsCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWhsCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtWhsCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPPDetLinCantidad_Internalname, "Cant. Solicitada", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPPDetLinCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A15PPDetLinCantidad, (byte)(18), (byte)(0), ",", "")), ((edtPPDetLinCantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A15PPDetLinCantidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A15PPDetLinCantidad), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPPDetLinCantidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtPPDetLinCantidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPPDetLinRecibida_Internalname, "Cant. Recibida", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPPDetLinRecibida_Internalname, GXutil.ltrim( localUtil.ntoc( A27PPDetLinRecibida, (byte)(18), (byte)(0), ",", "")), ((edtPPDetLinRecibida_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A27PPDetLinRecibida), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A27PPDetLinRecibida), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPPDetLinRecibida_Jsonclick, 0, "Attribute", "", "", "", 1, edtPPDetLinRecibida_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPPDetLinPendiente_Internalname, "Cant. Pendiente", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPPDetLinPendiente_Internalname, GXutil.ltrim( localUtil.ntoc( A16PPDetLinPendiente, (byte)(18), (byte)(0), ",", "")), ((edtPPDetLinPendiente_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A16PPDetLinPendiente), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A16PPDetLinPendiente), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPPDetLinPendiente_Jsonclick, 0, "Attribute", "", "", "", 1, edtPPDetLinPendiente_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPPDetFechaEntrega_Internalname, "Fecha de Entrega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtPPDetFechaEntrega_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPPDetFechaEntrega_Internalname, localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A17PPDetFechaEntrega, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPPDetFechaEntrega_Jsonclick, 0, "Attribute", "", "", "", 1, edtPPDetFechaEntrega_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtPPDetFechaEntrega_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPPDetFechaEntrega_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPPDetLinStatus_Internalname, "Estado de Línea", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPPDetLinStatus_Internalname, GXutil.rtrim( A23PPDetLinStatus), GXutil.rtrim( localUtil.format( A23PPDetLinStatus, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPPDetLinStatus_Jsonclick, 0, "Attribute", "", "", "", 1, edtPPDetLinStatus_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtEmpresa_Internalname, "Empresa", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtEmpresa_Internalname, A10Empresa, GXutil.rtrim( localUtil.format( A10Empresa, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresa_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresa_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtLote_Internalname, "Lote", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtLote_Internalname, A26Lote, GXutil.rtrim( localUtil.format( A26Lote, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLote_Jsonclick, 0, "Attribute", "", "", "", 1, edtLote_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11022 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A24CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( edtCabEntradaMercanciaId_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOcDocEntry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOcDocEntry_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OCDOCENTRY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOcDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1OcDocEntry = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
            }
            else
            {
               A1OcDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtOcDocEntry_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOC1LineNum_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOC1LineNum_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OC1LINENUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOC1LineNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11OC1LineNum = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11OC1LineNum", GXutil.ltrim( GXutil.str( A11OC1LineNum, 9, 0)));
            }
            else
            {
               A11OC1LineNum = (int)(localUtil.ctol( httpContext.cgiGet( edtOC1LineNum_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11OC1LineNum", GXutil.ltrim( GXutil.str( A11OC1LineNum, 9, 0)));
            }
            A12ItmItemCode = httpContext.cgiGet( edtItmItemCode_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12ItmItemCode", A12ItmItemCode);
            A13ItmItemName = httpContext.cgiGet( edtItmItemName_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13ItmItemName", A13ItmItemName);
            A14WhsCode = httpContext.cgiGet( edtWhsCode_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14WhsCode", A14WhsCode);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPPDetLinCantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPPDetLinCantidad_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PPDETLINCANTIDAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPPDetLinCantidad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A15PPDetLinCantidad = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A15PPDetLinCantidad", GXutil.ltrim( GXutil.str( A15PPDetLinCantidad, 18, 0)));
            }
            else
            {
               A15PPDetLinCantidad = localUtil.ctol( httpContext.cgiGet( edtPPDetLinCantidad_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A15PPDetLinCantidad", GXutil.ltrim( GXutil.str( A15PPDetLinCantidad, 18, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPPDetLinRecibida_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPPDetLinRecibida_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PPDETLINRECIBIDA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPPDetLinRecibida_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A27PPDetLinRecibida = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A27PPDetLinRecibida", GXutil.ltrim( GXutil.str( A27PPDetLinRecibida, 18, 0)));
            }
            else
            {
               A27PPDetLinRecibida = localUtil.ctol( httpContext.cgiGet( edtPPDetLinRecibida_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A27PPDetLinRecibida", GXutil.ltrim( GXutil.str( A27PPDetLinRecibida, 18, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPPDetLinPendiente_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPPDetLinPendiente_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PPDETLINPENDIENTE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPPDetLinPendiente_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A16PPDetLinPendiente = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A16PPDetLinPendiente", GXutil.ltrim( GXutil.str( A16PPDetLinPendiente, 18, 0)));
            }
            else
            {
               A16PPDetLinPendiente = localUtil.ctol( httpContext.cgiGet( edtPPDetLinPendiente_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A16PPDetLinPendiente", GXutil.ltrim( GXutil.str( A16PPDetLinPendiente, 18, 0)));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtPPDetFechaEntrega_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "PPDETFECHAENTREGA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPPDetFechaEntrega_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A17PPDetFechaEntrega = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A17PPDetFechaEntrega", localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A17PPDetFechaEntrega = localUtil.ctot( httpContext.cgiGet( edtPPDetFechaEntrega_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A17PPDetFechaEntrega", localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "));
            }
            A23PPDetLinStatus = httpContext.cgiGet( edtPPDetLinStatus_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A23PPDetLinStatus", A23PPDetLinStatus);
            A10Empresa = httpContext.cgiGet( edtEmpresa_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10Empresa", A10Empresa);
            A26Lote = httpContext.cgiGet( edtLote_Internalname) ;
            n26Lote = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A26Lote", A26Lote);
            n26Lote = ((GXutil.strcmp("", A26Lote)==0) ? true : false) ;
            /* Read saved values. */
            Z24CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( "Z24CabEntradaMercanciaId"), ",", ".")) ;
            Z1OcDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( "Z1OcDocEntry"), ",", ".")) ;
            Z11OC1LineNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z11OC1LineNum"), ",", ".")) ;
            Z12ItmItemCode = httpContext.cgiGet( "Z12ItmItemCode") ;
            Z13ItmItemName = httpContext.cgiGet( "Z13ItmItemName") ;
            Z14WhsCode = httpContext.cgiGet( "Z14WhsCode") ;
            Z15PPDetLinCantidad = localUtil.ctol( httpContext.cgiGet( "Z15PPDetLinCantidad"), ",", ".") ;
            Z27PPDetLinRecibida = localUtil.ctol( httpContext.cgiGet( "Z27PPDetLinRecibida"), ",", ".") ;
            Z16PPDetLinPendiente = localUtil.ctol( httpContext.cgiGet( "Z16PPDetLinPendiente"), ",", ".") ;
            Z17PPDetFechaEntrega = localUtil.ctot( httpContext.cgiGet( "Z17PPDetFechaEntrega"), 0) ;
            Z23PPDetLinStatus = httpContext.cgiGet( "Z23PPDetLinStatus") ;
            Z10Empresa = httpContext.cgiGet( "Z10Empresa") ;
            Z26Lote = httpContext.cgiGet( "Z26Lote") ;
            n26Lote = ((GXutil.strcmp("", A26Lote)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( "vCABENTRADAMERCANCIAID"), ",", ".")) ;
            AV11Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "DetEntradaMercancia" ;
            forbiddenHiddens = forbiddenHiddens + PrivateUtilities.encodeString( AV9TrnContext.toxml(false, true, "TransactionContext", "WMS")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A24CabEntradaMercanciaId != Z24CabEntradaMercanciaId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               A24CabEntradaMercanciaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
               {
                  sMode1 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_020( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CABENTRADAMERCANCIAID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCabEntradaMercanciaId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11022 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12022 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( GXutil.strcmp(Gx_mode, "DSP") != 0 )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: After Trn */
         e12022 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll021( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_first_Visible, 5, 0)), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_previous_Visible, 5, 0)), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_next_Visible, 5, 0)), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_last_Visible, 5, 0)), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_select_Visible, 5, 0)), true);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)), true);
         if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_enter_Visible, 5, 0)), true);
         }
         disableAttributes021( ) ;
      }
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void confirm_020( )
   {
      beforeValidate021( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls021( ) ;
         }
         else
         {
            checkExtendedTable021( ) ;
            closeExtendedTableCursors021( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption020( )
   {
   }

   public void e11022( )
   {
      /* Start Routine */
      if ( ! new com.wms.isauthorized(remoteHandle, context).executeUdp( AV11Pgmname) )
      {
         callWebObject(formatLink("com.wms.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV11Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
   }

   public void e12022( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.wms.wwdetentradamercancia") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm021( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z1OcDocEntry = T00023_A1OcDocEntry[0] ;
            Z11OC1LineNum = T00023_A11OC1LineNum[0] ;
            Z12ItmItemCode = T00023_A12ItmItemCode[0] ;
            Z13ItmItemName = T00023_A13ItmItemName[0] ;
            Z14WhsCode = T00023_A14WhsCode[0] ;
            Z15PPDetLinCantidad = T00023_A15PPDetLinCantidad[0] ;
            Z27PPDetLinRecibida = T00023_A27PPDetLinRecibida[0] ;
            Z16PPDetLinPendiente = T00023_A16PPDetLinPendiente[0] ;
            Z17PPDetFechaEntrega = T00023_A17PPDetFechaEntrega[0] ;
            Z23PPDetLinStatus = T00023_A23PPDetLinStatus[0] ;
            Z10Empresa = T00023_A10Empresa[0] ;
            Z26Lote = T00023_A26Lote[0] ;
         }
         else
         {
            Z1OcDocEntry = A1OcDocEntry ;
            Z11OC1LineNum = A11OC1LineNum ;
            Z12ItmItemCode = A12ItmItemCode ;
            Z13ItmItemName = A13ItmItemName ;
            Z14WhsCode = A14WhsCode ;
            Z15PPDetLinCantidad = A15PPDetLinCantidad ;
            Z27PPDetLinRecibida = A27PPDetLinRecibida ;
            Z16PPDetLinPendiente = A16PPDetLinPendiente ;
            Z17PPDetFechaEntrega = A17PPDetFechaEntrega ;
            Z23PPDetLinStatus = A23PPDetLinStatus ;
            Z10Empresa = A10Empresa ;
            Z26Lote = A26Lote ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z24CabEntradaMercanciaId = A24CabEntradaMercanciaId ;
         Z1OcDocEntry = A1OcDocEntry ;
         Z11OC1LineNum = A11OC1LineNum ;
         Z12ItmItemCode = A12ItmItemCode ;
         Z13ItmItemName = A13ItmItemName ;
         Z14WhsCode = A14WhsCode ;
         Z15PPDetLinCantidad = A15PPDetLinCantidad ;
         Z27PPDetLinRecibida = A27PPDetLinRecibida ;
         Z16PPDetLinPendiente = A16PPDetLinPendiente ;
         Z17PPDetFechaEntrega = A17PPDetFechaEntrega ;
         Z23PPDetLinStatus = A23PPDetLinStatus ;
         Z10Empresa = A10Empresa ;
         Z26Lote = A26Lote ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCabEntradaMercanciaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCabEntradaMercanciaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCabEntradaMercanciaId_Enabled, 5, 0)), true);
      edtCabEntradaMercanciaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCabEntradaMercanciaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCabEntradaMercanciaId_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7CabEntradaMercanciaId) )
      {
         A24CabEntradaMercanciaId = AV7CabEntradaMercanciaId ;
         httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
      }
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_enter_Enabled, 5, 0)), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_enter_Enabled, 5, 0)), true);
      }
   }

   public void load021( )
   {
      /* Using cursor T00024 */
      pr_default.execute(2, new Object[] {new Integer(A24CabEntradaMercanciaId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1OcDocEntry = T00024_A1OcDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
         A11OC1LineNum = T00024_A11OC1LineNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11OC1LineNum", GXutil.ltrim( GXutil.str( A11OC1LineNum, 9, 0)));
         A12ItmItemCode = T00024_A12ItmItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12ItmItemCode", A12ItmItemCode);
         A13ItmItemName = T00024_A13ItmItemName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13ItmItemName", A13ItmItemName);
         A14WhsCode = T00024_A14WhsCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14WhsCode", A14WhsCode);
         A15PPDetLinCantidad = T00024_A15PPDetLinCantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15PPDetLinCantidad", GXutil.ltrim( GXutil.str( A15PPDetLinCantidad, 18, 0)));
         A27PPDetLinRecibida = T00024_A27PPDetLinRecibida[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27PPDetLinRecibida", GXutil.ltrim( GXutil.str( A27PPDetLinRecibida, 18, 0)));
         A16PPDetLinPendiente = T00024_A16PPDetLinPendiente[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16PPDetLinPendiente", GXutil.ltrim( GXutil.str( A16PPDetLinPendiente, 18, 0)));
         A17PPDetFechaEntrega = T00024_A17PPDetFechaEntrega[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17PPDetFechaEntrega", localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "));
         A23PPDetLinStatus = T00024_A23PPDetLinStatus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23PPDetLinStatus", A23PPDetLinStatus);
         A10Empresa = T00024_A10Empresa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Empresa", A10Empresa);
         A26Lote = T00024_A26Lote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26Lote", A26Lote);
         n26Lote = T00024_n26Lote[0] ;
         zm021( -4) ;
      }
      pr_default.close(2);
      onLoadActions021( ) ;
   }

   public void onLoadActions021( )
   {
      AV11Pgmname = "DetEntradaMercancia" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
   }

   public void checkExtendedTable021( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV11Pgmname = "DetEntradaMercancia" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A17PPDetFechaEntrega) || (( A17PPDetFechaEntrega.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A17PPDetFechaEntrega, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo PPDet Fecha Entrega fuera de rango", "OutOfRange", 1, "PPDETFECHAENTREGA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPPDetFechaEntrega_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors021( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey021( )
   {
      /* Using cursor T00025 */
      pr_default.execute(3, new Object[] {new Integer(A24CabEntradaMercanciaId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00023 */
      pr_default.execute(1, new Object[] {new Integer(A24CabEntradaMercanciaId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm021( 4) ;
         RcdFound1 = (short)(1) ;
         A24CabEntradaMercanciaId = T00023_A24CabEntradaMercanciaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
         A1OcDocEntry = T00023_A1OcDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
         A11OC1LineNum = T00023_A11OC1LineNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11OC1LineNum", GXutil.ltrim( GXutil.str( A11OC1LineNum, 9, 0)));
         A12ItmItemCode = T00023_A12ItmItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12ItmItemCode", A12ItmItemCode);
         A13ItmItemName = T00023_A13ItmItemName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13ItmItemName", A13ItmItemName);
         A14WhsCode = T00023_A14WhsCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14WhsCode", A14WhsCode);
         A15PPDetLinCantidad = T00023_A15PPDetLinCantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15PPDetLinCantidad", GXutil.ltrim( GXutil.str( A15PPDetLinCantidad, 18, 0)));
         A27PPDetLinRecibida = T00023_A27PPDetLinRecibida[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27PPDetLinRecibida", GXutil.ltrim( GXutil.str( A27PPDetLinRecibida, 18, 0)));
         A16PPDetLinPendiente = T00023_A16PPDetLinPendiente[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16PPDetLinPendiente", GXutil.ltrim( GXutil.str( A16PPDetLinPendiente, 18, 0)));
         A17PPDetFechaEntrega = T00023_A17PPDetFechaEntrega[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17PPDetFechaEntrega", localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "));
         A23PPDetLinStatus = T00023_A23PPDetLinStatus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23PPDetLinStatus", A23PPDetLinStatus);
         A10Empresa = T00023_A10Empresa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Empresa", A10Empresa);
         A26Lote = T00023_A26Lote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26Lote", A26Lote);
         n26Lote = T00023_n26Lote[0] ;
         Z24CabEntradaMercanciaId = A24CabEntradaMercanciaId ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load021( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey021( ) ;
         }
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey021( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey021( ) ;
      if ( RcdFound1 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T00026 */
      pr_default.execute(4, new Object[] {new Integer(A24CabEntradaMercanciaId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00026_A24CabEntradaMercanciaId[0] < A24CabEntradaMercanciaId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00026_A24CabEntradaMercanciaId[0] > A24CabEntradaMercanciaId ) ) )
         {
            A24CabEntradaMercanciaId = T00026_A24CabEntradaMercanciaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T00027 */
      pr_default.execute(5, new Object[] {new Integer(A24CabEntradaMercanciaId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00027_A24CabEntradaMercanciaId[0] > A24CabEntradaMercanciaId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00027_A24CabEntradaMercanciaId[0] < A24CabEntradaMercanciaId ) ) )
         {
            A24CabEntradaMercanciaId = T00027_A24CabEntradaMercanciaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey021( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtOcDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert021( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1 == 1 )
         {
            if ( A24CabEntradaMercanciaId != Z24CabEntradaMercanciaId )
            {
               A24CabEntradaMercanciaId = Z24CabEntradaMercanciaId ;
               httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CABENTRADAMERCANCIAID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCabEntradaMercanciaId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOcDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update021( ) ;
               GX_FocusControl = edtOcDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A24CabEntradaMercanciaId != Z24CabEntradaMercanciaId )
            {
               /* Insert record */
               GX_FocusControl = edtOcDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert021( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CABENTRADAMERCANCIAID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCabEntradaMercanciaId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtOcDocEntry_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert021( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( A24CabEntradaMercanciaId != Z24CabEntradaMercanciaId )
      {
         A24CabEntradaMercanciaId = Z24CabEntradaMercanciaId ;
         httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CABENTRADAMERCANCIAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCabEntradaMercanciaId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOcDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency021( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00022 */
         pr_default.execute(0, new Object[] {new Integer(A24CabEntradaMercanciaId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"CabEntradaMercancia"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1OcDocEntry != T00022_A1OcDocEntry[0] ) || ( Z11OC1LineNum != T00022_A11OC1LineNum[0] ) || ( GXutil.strcmp(Z12ItmItemCode, T00022_A12ItmItemCode[0]) != 0 ) || ( GXutil.strcmp(Z13ItmItemName, T00022_A13ItmItemName[0]) != 0 ) || ( GXutil.strcmp(Z14WhsCode, T00022_A14WhsCode[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z15PPDetLinCantidad != T00022_A15PPDetLinCantidad[0] ) || ( Z27PPDetLinRecibida != T00022_A27PPDetLinRecibida[0] ) || ( Z16PPDetLinPendiente != T00022_A16PPDetLinPendiente[0] ) || !( GXutil.dateCompare(Z17PPDetFechaEntrega, T00022_A17PPDetFechaEntrega[0]) ) || ( GXutil.strcmp(Z23PPDetLinStatus, T00022_A23PPDetLinStatus[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10Empresa, T00022_A10Empresa[0]) != 0 ) || ( GXutil.strcmp(Z26Lote, T00022_A26Lote[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"CabEntradaMercancia"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert021( )
   {
      beforeValidate021( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable021( ) ;
      }
      if ( AnyError == 0 )
      {
         zm021( 0) ;
         checkOptimisticConcurrency021( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm021( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert021( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00028 */
                  pr_default.execute(6, new Object[] {new Integer(A1OcDocEntry), new Integer(A11OC1LineNum), A12ItmItemCode, A13ItmItemName, A14WhsCode, new Long(A15PPDetLinCantidad), new Long(A27PPDetLinRecibida), new Long(A16PPDetLinPendiente), A17PPDetFechaEntrega, A23PPDetLinStatus, A10Empresa, new Boolean(n26Lote), A26Lote});
                  A24CabEntradaMercanciaId = T00028_A24CabEntradaMercanciaId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("CabEntradaMercancia") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption020( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load021( ) ;
         }
         endLevel021( ) ;
      }
      closeExtendedTableCursors021( ) ;
   }

   public void update021( )
   {
      beforeValidate021( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable021( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency021( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm021( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate021( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00029 */
                  pr_default.execute(7, new Object[] {new Integer(A1OcDocEntry), new Integer(A11OC1LineNum), A12ItmItemCode, A13ItmItemName, A14WhsCode, new Long(A15PPDetLinCantidad), new Long(A27PPDetLinRecibida), new Long(A16PPDetLinPendiente), A17PPDetFechaEntrega, A23PPDetLinStatus, A10Empresa, new Boolean(n26Lote), A26Lote, new Integer(A24CabEntradaMercanciaId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("CabEntradaMercancia") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"CabEntradaMercancia"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate021( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
                           }
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel021( ) ;
      }
      closeExtendedTableCursors021( ) ;
   }

   public void deferredUpdate021( )
   {
   }

   public void delete( )
   {
      beforeValidate021( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency021( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls021( ) ;
         afterConfirm021( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete021( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000210 */
               pr_default.execute(8, new Object[] {new Integer(A24CabEntradaMercanciaId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("CabEntradaMercancia") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
                     {
                        if ( AnyError == 0 )
                        {
                           httpContext.nUserReturn = (byte)(1) ;
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel021( ) ;
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls021( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV11Pgmname = "DetEntradaMercancia" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
      }
   }

   public void endLevel021( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete021( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "detentradamercancia");
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "detentradamercancia");
         if ( AnyError == 0 )
         {
            confirmValues020( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "detentradamercancia");
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "detentradamercancia");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart021( )
   {
      /* Scan By routine */
      /* Using cursor T000211 */
      pr_default.execute(9);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A24CabEntradaMercanciaId = T000211_A24CabEntradaMercanciaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext021( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A24CabEntradaMercanciaId = T000211_A24CabEntradaMercanciaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
      }
   }

   public void scanEnd021( )
   {
      pr_default.close(9);
   }

   public void afterConfirm021( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert021( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate021( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete021( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete021( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate021( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes021( )
   {
      edtCabEntradaMercanciaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCabEntradaMercanciaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCabEntradaMercanciaId_Enabled, 5, 0)), true);
      edtOcDocEntry_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOcDocEntry_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOcDocEntry_Enabled, 5, 0)), true);
      edtOC1LineNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOC1LineNum_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOC1LineNum_Enabled, 5, 0)), true);
      edtItmItemCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItmItemCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtItmItemCode_Enabled, 5, 0)), true);
      edtItmItemName_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItmItemName_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtItmItemName_Enabled, 5, 0)), true);
      edtWhsCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWhsCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtWhsCode_Enabled, 5, 0)), true);
      edtPPDetLinCantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPPDetLinCantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPPDetLinCantidad_Enabled, 5, 0)), true);
      edtPPDetLinRecibida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPPDetLinRecibida_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPPDetLinRecibida_Enabled, 5, 0)), true);
      edtPPDetLinPendiente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPPDetLinPendiente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPPDetLinPendiente_Enabled, 5, 0)), true);
      edtPPDetFechaEntrega_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPPDetFechaEntrega_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPPDetFechaEntrega_Enabled, 5, 0)), true);
      edtPPDetLinStatus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPPDetLinStatus_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPPDetLinStatus_Enabled, 5, 0)), true);
      edtEmpresa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresa_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresa_Enabled, 5, 0)), true);
      edtLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLote_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtLote_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues020( )
   {
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
      MasterPageObj.master_styles();
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210225245");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.detentradamercancia") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7CabEntradaMercanciaId,6,0)))+"\">") ;
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
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z24CabEntradaMercanciaId", GXutil.ltrim( localUtil.ntoc( Z24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z1OcDocEntry", GXutil.ltrim( localUtil.ntoc( Z1OcDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z11OC1LineNum", GXutil.ltrim( localUtil.ntoc( Z11OC1LineNum, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z12ItmItemCode", Z12ItmItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z13ItmItemName", Z13ItmItemName);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z14WhsCode", Z14WhsCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z15PPDetLinCantidad", GXutil.ltrim( localUtil.ntoc( Z15PPDetLinCantidad, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z27PPDetLinRecibida", GXutil.ltrim( localUtil.ntoc( Z27PPDetLinRecibida, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z16PPDetLinPendiente", GXutil.ltrim( localUtil.ntoc( Z16PPDetLinPendiente, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z17PPDetFechaEntrega", localUtil.ttoc( Z17PPDetFechaEntrega, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z23PPDetLinStatus", GXutil.rtrim( Z23PPDetLinStatus));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z10Empresa", Z10Empresa);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z26Lote", Z26Lote);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vCABENTRADAMERCANCIAID", GXutil.ltrim( localUtil.ntoc( AV7CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV11Pgmname));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCABENTRADAMERCANCIAID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CabEntradaMercanciaId), "ZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "DetEntradaMercancia" ;
      forbiddenHiddens = forbiddenHiddens + PrivateUtilities.encodeString( AV9TrnContext.toxml(false, true, "TransactionContext", "WMS")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
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
   }

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      com.wms.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
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
      return formatLink("com.wms.detentradamercancia") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7CabEntradaMercanciaId,6,0))) ;
   }

   public String getPgmname( )
   {
      return "DetEntradaMercancia" ;
   }

   public String getPgmdesc( )
   {
      return "Det Entrada Mercancia" ;
   }

   public void initializeNonKey021( )
   {
      A1OcDocEntry = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
      A11OC1LineNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11OC1LineNum", GXutil.ltrim( GXutil.str( A11OC1LineNum, 9, 0)));
      A12ItmItemCode = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12ItmItemCode", A12ItmItemCode);
      A13ItmItemName = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13ItmItemName", A13ItmItemName);
      A14WhsCode = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14WhsCode", A14WhsCode);
      A15PPDetLinCantidad = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A15PPDetLinCantidad", GXutil.ltrim( GXutil.str( A15PPDetLinCantidad, 18, 0)));
      A27PPDetLinRecibida = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A27PPDetLinRecibida", GXutil.ltrim( GXutil.str( A27PPDetLinRecibida, 18, 0)));
      A16PPDetLinPendiente = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A16PPDetLinPendiente", GXutil.ltrim( GXutil.str( A16PPDetLinPendiente, 18, 0)));
      A17PPDetFechaEntrega = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A17PPDetFechaEntrega", localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "));
      A23PPDetLinStatus = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A23PPDetLinStatus", A23PPDetLinStatus);
      A10Empresa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Empresa", A10Empresa);
      A26Lote = "" ;
      n26Lote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A26Lote", A26Lote);
      n26Lote = ((GXutil.strcmp("", A26Lote)==0) ? true : false) ;
      Z1OcDocEntry = 0 ;
      Z11OC1LineNum = 0 ;
      Z12ItmItemCode = "" ;
      Z13ItmItemName = "" ;
      Z14WhsCode = "" ;
      Z15PPDetLinCantidad = 0 ;
      Z27PPDetLinRecibida = 0 ;
      Z16PPDetLinPendiente = 0 ;
      Z17PPDetFechaEntrega = GXutil.resetTime( GXutil.nullDate() );
      Z23PPDetLinStatus = "" ;
      Z10Empresa = "" ;
      Z26Lote = "" ;
   }

   public void initAll021( )
   {
      A24CabEntradaMercanciaId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
      initializeNonKey021( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?15125532");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1022385");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210225266");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("detentradamercancia.js", "?201811210225267");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtCabEntradaMercanciaId_Internalname = "CABENTRADAMERCANCIAID" ;
      edtOcDocEntry_Internalname = "OCDOCENTRY" ;
      edtOC1LineNum_Internalname = "OC1LINENUM" ;
      edtItmItemCode_Internalname = "ITMITEMCODE" ;
      edtItmItemName_Internalname = "ITMITEMNAME" ;
      edtWhsCode_Internalname = "WHSCODE" ;
      edtPPDetLinCantidad_Internalname = "PPDETLINCANTIDAD" ;
      edtPPDetLinRecibida_Internalname = "PPDETLINRECIBIDA" ;
      edtPPDetLinPendiente_Internalname = "PPDETLINPENDIENTE" ;
      edtPPDetFechaEntrega_Internalname = "PPDETFECHAENTREGA" ;
      edtPPDetLinStatus_Internalname = "PPDETLINSTATUS" ;
      edtEmpresa_Internalname = "EMPRESA" ;
      edtLote_Internalname = "LOTE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
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
      Form.setCaption( "Det Entrada Mercancia" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtLote_Jsonclick = "" ;
      edtLote_Enabled = 1 ;
      edtEmpresa_Jsonclick = "" ;
      edtEmpresa_Enabled = 1 ;
      edtPPDetLinStatus_Jsonclick = "" ;
      edtPPDetLinStatus_Enabled = 1 ;
      edtPPDetFechaEntrega_Jsonclick = "" ;
      edtPPDetFechaEntrega_Enabled = 1 ;
      edtPPDetLinPendiente_Jsonclick = "" ;
      edtPPDetLinPendiente_Enabled = 1 ;
      edtPPDetLinRecibida_Jsonclick = "" ;
      edtPPDetLinRecibida_Enabled = 1 ;
      edtPPDetLinCantidad_Jsonclick = "" ;
      edtPPDetLinCantidad_Enabled = 1 ;
      edtWhsCode_Jsonclick = "" ;
      edtWhsCode_Enabled = 1 ;
      edtItmItemName_Jsonclick = "" ;
      edtItmItemName_Enabled = 1 ;
      edtItmItemCode_Jsonclick = "" ;
      edtItmItemCode_Enabled = 1 ;
      edtOC1LineNum_Jsonclick = "" ;
      edtOC1LineNum_Enabled = 1 ;
      edtOcDocEntry_Jsonclick = "" ;
      edtOcDocEntry_Enabled = 1 ;
      edtCabEntradaMercanciaId_Jsonclick = "" ;
      edtCabEntradaMercanciaId_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7CabEntradaMercanciaId',fld:'vCABENTRADAMERCANCIAID',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12022',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z12ItmItemCode = "" ;
      Z13ItmItemName = "" ;
      Z14WhsCode = "" ;
      Z17PPDetFechaEntrega = GXutil.resetTime( GXutil.nullDate() );
      Z23PPDetLinStatus = "" ;
      Z10Empresa = "" ;
      Z26Lote = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A12ItmItemCode = "" ;
      A13ItmItemName = "" ;
      A14WhsCode = "" ;
      A17PPDetFechaEntrega = GXutil.resetTime( GXutil.nullDate() );
      A23PPDetLinStatus = "" ;
      A10Empresa = "" ;
      A26Lote = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV11Pgmname = "" ;
      forbiddenHiddens = "" ;
      AV9TrnContext = new com.wms.SdtTransactionContext(remoteHandle, context);
      hsh = "" ;
      sMode1 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10WebSession = httpContext.getWebSession();
      T00024_A24CabEntradaMercanciaId = new int[1] ;
      T00024_A1OcDocEntry = new int[1] ;
      T00024_A11OC1LineNum = new int[1] ;
      T00024_A12ItmItemCode = new String[] {""} ;
      T00024_A13ItmItemName = new String[] {""} ;
      T00024_A14WhsCode = new String[] {""} ;
      T00024_A15PPDetLinCantidad = new long[1] ;
      T00024_A27PPDetLinRecibida = new long[1] ;
      T00024_A16PPDetLinPendiente = new long[1] ;
      T00024_A17PPDetFechaEntrega = new java.util.Date[] {GXutil.nullDate()} ;
      T00024_A23PPDetLinStatus = new String[] {""} ;
      T00024_A10Empresa = new String[] {""} ;
      T00024_A26Lote = new String[] {""} ;
      T00024_n26Lote = new boolean[] {false} ;
      T00025_A24CabEntradaMercanciaId = new int[1] ;
      T00023_A24CabEntradaMercanciaId = new int[1] ;
      T00023_A1OcDocEntry = new int[1] ;
      T00023_A11OC1LineNum = new int[1] ;
      T00023_A12ItmItemCode = new String[] {""} ;
      T00023_A13ItmItemName = new String[] {""} ;
      T00023_A14WhsCode = new String[] {""} ;
      T00023_A15PPDetLinCantidad = new long[1] ;
      T00023_A27PPDetLinRecibida = new long[1] ;
      T00023_A16PPDetLinPendiente = new long[1] ;
      T00023_A17PPDetFechaEntrega = new java.util.Date[] {GXutil.nullDate()} ;
      T00023_A23PPDetLinStatus = new String[] {""} ;
      T00023_A10Empresa = new String[] {""} ;
      T00023_A26Lote = new String[] {""} ;
      T00023_n26Lote = new boolean[] {false} ;
      T00026_A24CabEntradaMercanciaId = new int[1] ;
      T00027_A24CabEntradaMercanciaId = new int[1] ;
      T00022_A24CabEntradaMercanciaId = new int[1] ;
      T00022_A1OcDocEntry = new int[1] ;
      T00022_A11OC1LineNum = new int[1] ;
      T00022_A12ItmItemCode = new String[] {""} ;
      T00022_A13ItmItemName = new String[] {""} ;
      T00022_A14WhsCode = new String[] {""} ;
      T00022_A15PPDetLinCantidad = new long[1] ;
      T00022_A27PPDetLinRecibida = new long[1] ;
      T00022_A16PPDetLinPendiente = new long[1] ;
      T00022_A17PPDetFechaEntrega = new java.util.Date[] {GXutil.nullDate()} ;
      T00022_A23PPDetLinStatus = new String[] {""} ;
      T00022_A10Empresa = new String[] {""} ;
      T00022_A26Lote = new String[] {""} ;
      T00022_n26Lote = new boolean[] {false} ;
      T00028_A24CabEntradaMercanciaId = new int[1] ;
      T000211_A24CabEntradaMercanciaId = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.detentradamercancia__fusquim_sap(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.detentradamercancia__default(),
         new Object[] {
             new Object[] {
            T00022_A24CabEntradaMercanciaId, T00022_A1OcDocEntry, T00022_A11OC1LineNum, T00022_A12ItmItemCode, T00022_A13ItmItemName, T00022_A14WhsCode, T00022_A15PPDetLinCantidad, T00022_A27PPDetLinRecibida, T00022_A16PPDetLinPendiente, T00022_A17PPDetFechaEntrega,
            T00022_A23PPDetLinStatus, T00022_A10Empresa, T00022_A26Lote, T00022_n26Lote
            }
            , new Object[] {
            T00023_A24CabEntradaMercanciaId, T00023_A1OcDocEntry, T00023_A11OC1LineNum, T00023_A12ItmItemCode, T00023_A13ItmItemName, T00023_A14WhsCode, T00023_A15PPDetLinCantidad, T00023_A27PPDetLinRecibida, T00023_A16PPDetLinPendiente, T00023_A17PPDetFechaEntrega,
            T00023_A23PPDetLinStatus, T00023_A10Empresa, T00023_A26Lote, T00023_n26Lote
            }
            , new Object[] {
            T00024_A24CabEntradaMercanciaId, T00024_A1OcDocEntry, T00024_A11OC1LineNum, T00024_A12ItmItemCode, T00024_A13ItmItemName, T00024_A14WhsCode, T00024_A15PPDetLinCantidad, T00024_A27PPDetLinRecibida, T00024_A16PPDetLinPendiente, T00024_A17PPDetFechaEntrega,
            T00024_A23PPDetLinStatus, T00024_A10Empresa, T00024_A26Lote, T00024_n26Lote
            }
            , new Object[] {
            T00025_A24CabEntradaMercanciaId
            }
            , new Object[] {
            T00026_A24CabEntradaMercanciaId
            }
            , new Object[] {
            T00027_A24CabEntradaMercanciaId
            }
            , new Object[] {
            T00028_A24CabEntradaMercanciaId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000211_A24CabEntradaMercanciaId
            }
         }
      );
      AV11Pgmname = "DetEntradaMercancia" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1 ;
   private int wcpOAV7CabEntradaMercanciaId ;
   private int Z24CabEntradaMercanciaId ;
   private int Z1OcDocEntry ;
   private int Z11OC1LineNum ;
   private int AV7CabEntradaMercanciaId ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A24CabEntradaMercanciaId ;
   private int edtCabEntradaMercanciaId_Enabled ;
   private int A1OcDocEntry ;
   private int edtOcDocEntry_Enabled ;
   private int A11OC1LineNum ;
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
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z15PPDetLinCantidad ;
   private long Z27PPDetLinRecibida ;
   private long Z16PPDetLinPendiente ;
   private long A15PPDetLinCantidad ;
   private long A27PPDetLinRecibida ;
   private long A16PPDetLinPendiente ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z23PPDetLinStatus ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOcDocEntry_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtCabEntradaMercanciaId_Internalname ;
   private String edtCabEntradaMercanciaId_Jsonclick ;
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
   private String A23PPDetLinStatus ;
   private String edtPPDetLinStatus_Jsonclick ;
   private String edtEmpresa_Internalname ;
   private String edtEmpresa_Jsonclick ;
   private String edtLote_Internalname ;
   private String edtLote_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV11Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode1 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z17PPDetFechaEntrega ;
   private java.util.Date A17PPDetFechaEntrega ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n26Lote ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z12ItmItemCode ;
   private String Z13ItmItemName ;
   private String Z14WhsCode ;
   private String Z10Empresa ;
   private String Z26Lote ;
   private String A12ItmItemCode ;
   private String A13ItmItemName ;
   private String A14WhsCode ;
   private String A10Empresa ;
   private String A26Lote ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.wms.SdtTransactionContext AV9TrnContext ;
   private IDataStoreProvider pr_default ;
   private int[] T00024_A24CabEntradaMercanciaId ;
   private int[] T00024_A1OcDocEntry ;
   private int[] T00024_A11OC1LineNum ;
   private String[] T00024_A12ItmItemCode ;
   private String[] T00024_A13ItmItemName ;
   private String[] T00024_A14WhsCode ;
   private long[] T00024_A15PPDetLinCantidad ;
   private long[] T00024_A27PPDetLinRecibida ;
   private long[] T00024_A16PPDetLinPendiente ;
   private java.util.Date[] T00024_A17PPDetFechaEntrega ;
   private String[] T00024_A23PPDetLinStatus ;
   private String[] T00024_A10Empresa ;
   private String[] T00024_A26Lote ;
   private boolean[] T00024_n26Lote ;
   private int[] T00025_A24CabEntradaMercanciaId ;
   private int[] T00023_A24CabEntradaMercanciaId ;
   private int[] T00023_A1OcDocEntry ;
   private int[] T00023_A11OC1LineNum ;
   private String[] T00023_A12ItmItemCode ;
   private String[] T00023_A13ItmItemName ;
   private String[] T00023_A14WhsCode ;
   private long[] T00023_A15PPDetLinCantidad ;
   private long[] T00023_A27PPDetLinRecibida ;
   private long[] T00023_A16PPDetLinPendiente ;
   private java.util.Date[] T00023_A17PPDetFechaEntrega ;
   private String[] T00023_A23PPDetLinStatus ;
   private String[] T00023_A10Empresa ;
   private String[] T00023_A26Lote ;
   private boolean[] T00023_n26Lote ;
   private int[] T00026_A24CabEntradaMercanciaId ;
   private int[] T00027_A24CabEntradaMercanciaId ;
   private int[] T00022_A24CabEntradaMercanciaId ;
   private int[] T00022_A1OcDocEntry ;
   private int[] T00022_A11OC1LineNum ;
   private String[] T00022_A12ItmItemCode ;
   private String[] T00022_A13ItmItemName ;
   private String[] T00022_A14WhsCode ;
   private long[] T00022_A15PPDetLinCantidad ;
   private long[] T00022_A27PPDetLinRecibida ;
   private long[] T00022_A16PPDetLinPendiente ;
   private java.util.Date[] T00022_A17PPDetFechaEntrega ;
   private String[] T00022_A23PPDetLinStatus ;
   private String[] T00022_A10Empresa ;
   private String[] T00022_A26Lote ;
   private boolean[] T00022_n26Lote ;
   private int[] T00028_A24CabEntradaMercanciaId ;
   private IDataStoreProvider pr_fusquim_sap ;
   private int[] T000211_A24CabEntradaMercanciaId ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class detentradamercancia__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

final  class detentradamercancia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00022", "SELECT [CabEntradaMercanciaId], [OcDocEntry], [OC1LineNum], [ItmItemCode], [ItmItemName], [WhsCode], [PPDetLinCantidad], [PPDetLinRecibida], [PPDetLinPendiente], [PPDetFechaEntrega], [PPDetLinStatus], [Empresa], [Lote] FROM [CabEntradaMercancia] WITH (UPDLOCK) WHERE [CabEntradaMercanciaId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00023", "SELECT [CabEntradaMercanciaId], [OcDocEntry], [OC1LineNum], [ItmItemCode], [ItmItemName], [WhsCode], [PPDetLinCantidad], [PPDetLinRecibida], [PPDetLinPendiente], [PPDetFechaEntrega], [PPDetLinStatus], [Empresa], [Lote] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE [CabEntradaMercanciaId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00024", "SELECT TM1.[CabEntradaMercanciaId], TM1.[OcDocEntry], TM1.[OC1LineNum], TM1.[ItmItemCode], TM1.[ItmItemName], TM1.[WhsCode], TM1.[PPDetLinCantidad], TM1.[PPDetLinRecibida], TM1.[PPDetLinPendiente], TM1.[PPDetFechaEntrega], TM1.[PPDetLinStatus], TM1.[Empresa], TM1.[Lote] FROM [CabEntradaMercancia] TM1 WITH (NOLOCK) WHERE TM1.[CabEntradaMercanciaId] = ? ORDER BY TM1.[CabEntradaMercanciaId]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00025", "SELECT [CabEntradaMercanciaId] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE [CabEntradaMercanciaId] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00026", "SELECT TOP 1 [CabEntradaMercanciaId] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE ( [CabEntradaMercanciaId] > ?) ORDER BY [CabEntradaMercanciaId]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00027", "SELECT TOP 1 [CabEntradaMercanciaId] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE ( [CabEntradaMercanciaId] < ?) ORDER BY [CabEntradaMercanciaId] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00028", "INSERT INTO [CabEntradaMercancia]([OcDocEntry], [OC1LineNum], [ItmItemCode], [ItmItemName], [WhsCode], [PPDetLinCantidad], [PPDetLinRecibida], [PPDetLinPendiente], [PPDetFechaEntrega], [PPDetLinStatus], [Empresa], [Lote], [ProvCarCode], [ProvCardName], [OcDocDate], [OcDocDueDate], [EmpSlpName], [UserName]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '', '', convert( DATETIME, '17530101', 112 ), convert( DATETIME, '17530101', 112 ), '', ''); SELECT SCOPE_IDENTITY()", GX_NOMASK)
         ,new UpdateCursor("T00029", "UPDATE [CabEntradaMercancia] SET [OcDocEntry]=?, [OC1LineNum]=?, [ItmItemCode]=?, [ItmItemName]=?, [WhsCode]=?, [PPDetLinCantidad]=?, [PPDetLinRecibida]=?, [PPDetLinPendiente]=?, [PPDetFechaEntrega]=?, [PPDetLinStatus]=?, [Empresa]=?, [Lote]=?  WHERE [CabEntradaMercanciaId] = ?", GX_NOMASK)
         ,new UpdateCursor("T000210", "DELETE FROM [CabEntradaMercancia]  WHERE [CabEntradaMercanciaId] = ?", GX_NOMASK)
         ,new ForEachCursor("T000211", "SELECT [CabEntradaMercanciaId] FROM [CabEntradaMercancia] WITH (NOLOCK) ORDER BY [CabEntradaMercanciaId]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((long[]) buf[8])[0] = rslt.getLong(9) ;
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10) ;
               ((String[]) buf[10])[0] = rslt.getString(11, 1) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((long[]) buf[8])[0] = rslt.getLong(9) ;
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10) ;
               ((String[]) buf[10])[0] = rslt.getString(11, 1) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((long[]) buf[8])[0] = rslt.getLong(9) ;
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10) ;
               ((String[]) buf[10])[0] = rslt.getString(11, 1) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setVarchar(5, (String)parms[4], 8, false);
               stmt.setBigDecimal(6, ((Number) parms[5]).longValue(), 0);
               stmt.setBigDecimal(7, ((Number) parms[6]).longValue(), 0);
               stmt.setBigDecimal(8, ((Number) parms[7]).longValue(), 0);
               stmt.setDateTime(9, (java.util.Date)parms[8], false);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setVarchar(11, (String)parms[10], 7, false);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[12], 15);
               }
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setVarchar(5, (String)parms[4], 8, false);
               stmt.setBigDecimal(6, ((Number) parms[5]).longValue(), 0);
               stmt.setBigDecimal(7, ((Number) parms[6]).longValue(), 0);
               stmt.setBigDecimal(8, ((Number) parms[7]).longValue(), 0);
               stmt.setDateTime(9, (java.util.Date)parms[8], false);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setVarchar(11, (String)parms[10], 7, false);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[12], 15);
               }
               stmt.setInt(13, ((Number) parms[13]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

