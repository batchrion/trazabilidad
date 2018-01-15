/*
               File: cabentradamercancia_impl
        Description: Cab Entrada Mercancia
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:45.19
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

public final  class cabentradamercancia_impl extends GXDataArea
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
            AV11CabEntradaMercanciaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( AV11CabEntradaMercanciaId, 6, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCABENTRADAMERCANCIAID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11CabEntradaMercanciaId), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", "Cab Entrada Mercancia", (short)(0)) ;
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

   public cabentradamercancia_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cabentradamercancia_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cabentradamercancia_impl.class ));
   }

   public cabentradamercancia_impl( int remoteHandle ,
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
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Cab Entrada Mercancia", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_CabEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CabEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CabEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CabEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CabEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_CabEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCabEntradaMercanciaId_Internalname, GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")), ((edtCabEntradaMercanciaId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCabEntradaMercanciaId_Jsonclick, 0, "Attribute", "", "", "", 1, edtCabEntradaMercanciaId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_CabEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOcDocEntry_Internalname, GXutil.ltrim( localUtil.ntoc( A1OcDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtOcDocEntry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOcDocEntry_Jsonclick, 0, "Attribute", "", "", "", 1, edtOcDocEntry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_CabEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtProvCarCode_Internalname, "Cod. Proveedor", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtProvCarCode_Internalname, A3ProvCarCode, GXutil.rtrim( localUtil.format( A3ProvCarCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProvCarCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtProvCarCode_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_CabEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtProvCardName_Internalname, "Proveedor", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtProvCardName_Internalname, A4ProvCardName, GXutil.rtrim( localUtil.format( A4ProvCardName, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProvCardName_Jsonclick, 0, "Attribute", "", "", "", 1, edtProvCardName_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_CabEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtOcDocDate_Internalname, "Fecha de Emisión", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtOcDocDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOcDocDate_Internalname, localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A5OcDocDate, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOcDocDate_Jsonclick, 0, "Attribute", "", "", "", 1, edtOcDocDate_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_CabEntradaMercancia.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtOcDocDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOcDocDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CabEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtOcDocDueDate_Internalname, "Fecha de Vencimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtOcDocDueDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOcDocDueDate_Internalname, localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A6OcDocDueDate, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOcDocDueDate_Jsonclick, 0, "Attribute", "", "", "", 1, edtOcDocDueDate_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_CabEntradaMercancia.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtOcDocDueDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOcDocDueDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CabEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtEmpSlpName_Internalname, "Solicitado por", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtEmpSlpName_Internalname, A8EmpSlpName, GXutil.rtrim( localUtil.format( A8EmpSlpName, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpSlpName_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpSlpName_Enabled, 0, "text", "", 80, "chr", 1, "row", 155, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_CabEntradaMercancia.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtEmpresa_Internalname, A10Empresa, GXutil.rtrim( localUtil.format( A10Empresa, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpresa_Jsonclick, 0, "Attribute", "", "", "", 1, edtEmpresa_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_CabEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUserName_Internalname, "Recibido por", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUserName_Internalname, A25UserName, GXutil.rtrim( localUtil.format( A25UserName, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUserName_Jsonclick, 0, "Attribute", "", "", "", 1, edtUserName_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_CabEntradaMercancia.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CabEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CabEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CabEntradaMercancia.htm");
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
      e11012 ();
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
            A3ProvCarCode = httpContext.cgiGet( edtProvCarCode_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3ProvCarCode", A3ProvCarCode);
            A4ProvCardName = httpContext.cgiGet( edtProvCardName_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4ProvCardName", A4ProvCardName);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtOcDocDate_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "OCDOCDATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOcDocDate_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5OcDocDate = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A5OcDocDate", localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A5OcDocDate = localUtil.ctot( httpContext.cgiGet( edtOcDocDate_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5OcDocDate", localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtOcDocDueDate_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "OCDOCDUEDATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOcDocDueDate_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6OcDocDueDate = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A6OcDocDueDate", localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A6OcDocDueDate = localUtil.ctot( httpContext.cgiGet( edtOcDocDueDate_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6OcDocDueDate", localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
            }
            A8EmpSlpName = httpContext.cgiGet( edtEmpSlpName_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8EmpSlpName", A8EmpSlpName);
            A10Empresa = httpContext.cgiGet( edtEmpresa_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10Empresa", A10Empresa);
            A25UserName = httpContext.cgiGet( edtUserName_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A25UserName", A25UserName);
            /* Read saved values. */
            Z24CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( "Z24CabEntradaMercanciaId"), ",", ".")) ;
            Z1OcDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( "Z1OcDocEntry"), ",", ".")) ;
            Z3ProvCarCode = httpContext.cgiGet( "Z3ProvCarCode") ;
            Z4ProvCardName = httpContext.cgiGet( "Z4ProvCardName") ;
            Z5OcDocDate = localUtil.ctot( httpContext.cgiGet( "Z5OcDocDate"), 0) ;
            Z6OcDocDueDate = localUtil.ctot( httpContext.cgiGet( "Z6OcDocDueDate"), 0) ;
            Z8EmpSlpName = httpContext.cgiGet( "Z8EmpSlpName") ;
            Z10Empresa = httpContext.cgiGet( "Z10Empresa") ;
            Z25UserName = httpContext.cgiGet( "Z25UserName") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV11CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( "vCABENTRADAMERCANCIAID"), ",", ".")) ;
            AV12Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "CabEntradaMercancia" ;
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
                        confirm_010( ) ;
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
                        e11012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12012 ();
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
         e12012 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll011( ) ;
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
         disableAttributes011( ) ;
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

   public void confirm_010( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls011( ) ;
         }
         else
         {
            checkExtendedTable011( ) ;
            closeExtendedTableCursors011( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption010( )
   {
   }

   public void e11012( )
   {
      /* Start Routine */
      if ( ! new com.wms.isauthorized(remoteHandle, context).executeUdp( AV12Pgmname) )
      {
         callWebObject(formatLink("com.wms.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV12Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
   }

   public void e12012( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.wms.wwcabentradamercancia") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm011( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z1OcDocEntry = T00013_A1OcDocEntry[0] ;
            Z3ProvCarCode = T00013_A3ProvCarCode[0] ;
            Z4ProvCardName = T00013_A4ProvCardName[0] ;
            Z5OcDocDate = T00013_A5OcDocDate[0] ;
            Z6OcDocDueDate = T00013_A6OcDocDueDate[0] ;
            Z8EmpSlpName = T00013_A8EmpSlpName[0] ;
            Z10Empresa = T00013_A10Empresa[0] ;
            Z25UserName = T00013_A25UserName[0] ;
         }
         else
         {
            Z1OcDocEntry = A1OcDocEntry ;
            Z3ProvCarCode = A3ProvCarCode ;
            Z4ProvCardName = A4ProvCardName ;
            Z5OcDocDate = A5OcDocDate ;
            Z6OcDocDueDate = A6OcDocDueDate ;
            Z8EmpSlpName = A8EmpSlpName ;
            Z10Empresa = A10Empresa ;
            Z25UserName = A25UserName ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z24CabEntradaMercanciaId = A24CabEntradaMercanciaId ;
         Z1OcDocEntry = A1OcDocEntry ;
         Z3ProvCarCode = A3ProvCarCode ;
         Z4ProvCardName = A4ProvCardName ;
         Z5OcDocDate = A5OcDocDate ;
         Z6OcDocDueDate = A6OcDocDueDate ;
         Z8EmpSlpName = A8EmpSlpName ;
         Z10Empresa = A10Empresa ;
         Z25UserName = A25UserName ;
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
      if ( ! (0==AV11CabEntradaMercanciaId) )
      {
         A24CabEntradaMercanciaId = AV11CabEntradaMercanciaId ;
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

   public void load011( )
   {
      /* Using cursor T00014 */
      pr_default.execute(2, new Object[] {new Integer(A24CabEntradaMercanciaId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1OcDocEntry = T00014_A1OcDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
         A3ProvCarCode = T00014_A3ProvCarCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3ProvCarCode", A3ProvCarCode);
         A4ProvCardName = T00014_A4ProvCardName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4ProvCardName", A4ProvCardName);
         A5OcDocDate = T00014_A5OcDocDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5OcDocDate", localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "));
         A6OcDocDueDate = T00014_A6OcDocDueDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6OcDocDueDate", localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
         A8EmpSlpName = T00014_A8EmpSlpName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8EmpSlpName", A8EmpSlpName);
         A10Empresa = T00014_A10Empresa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Empresa", A10Empresa);
         A25UserName = T00014_A25UserName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25UserName", A25UserName);
         zm011( -5) ;
      }
      pr_default.close(2);
      onLoadActions011( ) ;
   }

   public void onLoadActions011( )
   {
      AV12Pgmname = "CabEntradaMercancia" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
   }

   public void checkExtendedTable011( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV12Pgmname = "CabEntradaMercancia" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A5OcDocDate) || (( A5OcDocDate.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A5OcDocDate, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo Oc Doc Date fuera de rango", "OutOfRange", 1, "OCDOCDATE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOcDocDate_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A6OcDocDueDate) || (( A6OcDocDueDate.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A6OcDocDueDate, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo Oc Doc Due Date fuera de rango", "OutOfRange", 1, "OCDOCDUEDATE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOcDocDueDate_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors011( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey011( )
   {
      /* Using cursor T00015 */
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
      /* Using cursor T00013 */
      pr_default.execute(1, new Object[] {new Integer(A24CabEntradaMercanciaId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm011( 5) ;
         RcdFound1 = (short)(1) ;
         A24CabEntradaMercanciaId = T00013_A24CabEntradaMercanciaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
         A1OcDocEntry = T00013_A1OcDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
         A3ProvCarCode = T00013_A3ProvCarCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3ProvCarCode", A3ProvCarCode);
         A4ProvCardName = T00013_A4ProvCardName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4ProvCardName", A4ProvCardName);
         A5OcDocDate = T00013_A5OcDocDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5OcDocDate", localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "));
         A6OcDocDueDate = T00013_A6OcDocDueDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6OcDocDueDate", localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
         A8EmpSlpName = T00013_A8EmpSlpName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8EmpSlpName", A8EmpSlpName);
         A10Empresa = T00013_A10Empresa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Empresa", A10Empresa);
         A25UserName = T00013_A25UserName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25UserName", A25UserName);
         Z24CabEntradaMercanciaId = A24CabEntradaMercanciaId ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load011( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey011( ) ;
         }
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey011( ) ;
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
      getKey011( ) ;
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
      /* Using cursor T00016 */
      pr_default.execute(4, new Object[] {new Integer(A24CabEntradaMercanciaId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00016_A24CabEntradaMercanciaId[0] < A24CabEntradaMercanciaId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00016_A24CabEntradaMercanciaId[0] > A24CabEntradaMercanciaId ) ) )
         {
            A24CabEntradaMercanciaId = T00016_A24CabEntradaMercanciaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T00017 */
      pr_default.execute(5, new Object[] {new Integer(A24CabEntradaMercanciaId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00017_A24CabEntradaMercanciaId[0] > A24CabEntradaMercanciaId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00017_A24CabEntradaMercanciaId[0] < A24CabEntradaMercanciaId ) ) )
         {
            A24CabEntradaMercanciaId = T00017_A24CabEntradaMercanciaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey011( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtOcDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert011( ) ;
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
               update011( ) ;
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
               insert011( ) ;
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
                  insert011( ) ;
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

   public void checkOptimisticConcurrency011( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00012 */
         pr_default.execute(0, new Object[] {new Integer(A24CabEntradaMercanciaId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"CabEntradaMercancia"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1OcDocEntry != T00012_A1OcDocEntry[0] ) || ( GXutil.strcmp(Z3ProvCarCode, T00012_A3ProvCarCode[0]) != 0 ) || ( GXutil.strcmp(Z4ProvCardName, T00012_A4ProvCardName[0]) != 0 ) || !( GXutil.dateCompare(Z5OcDocDate, T00012_A5OcDocDate[0]) ) || !( GXutil.dateCompare(Z6OcDocDueDate, T00012_A6OcDocDueDate[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8EmpSlpName, T00012_A8EmpSlpName[0]) != 0 ) || ( GXutil.strcmp(Z10Empresa, T00012_A10Empresa[0]) != 0 ) || ( GXutil.strcmp(Z25UserName, T00012_A25UserName[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"CabEntradaMercancia"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         zm011( 0) ;
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00018 */
                  pr_default.execute(6, new Object[] {new Integer(A1OcDocEntry), A3ProvCarCode, A4ProvCardName, A5OcDocDate, A6OcDocDueDate, A8EmpSlpName, A10Empresa, A25UserName});
                  A24CabEntradaMercanciaId = T00018_A24CabEntradaMercanciaId[0] ;
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
                        resetCaption010( ) ;
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
            load011( ) ;
         }
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void update011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00019 */
                  pr_default.execute(7, new Object[] {new Integer(A1OcDocEntry), A3ProvCarCode, A4ProvCardName, A5OcDocDate, A6OcDocDueDate, A8EmpSlpName, A10Empresa, A25UserName, new Integer(A24CabEntradaMercanciaId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("CabEntradaMercancia") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"CabEntradaMercancia"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate011( ) ;
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
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void deferredUpdate011( )
   {
   }

   public void delete( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls011( ) ;
         afterConfirm011( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete011( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000110 */
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
      endLevel011( ) ;
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls011( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV12Pgmname = "CabEntradaMercancia" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      }
   }

   public void endLevel011( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete011( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "cabentradamercancia");
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "cabentradamercancia");
         if ( AnyError == 0 )
         {
            confirmValues010( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "cabentradamercancia");
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "cabentradamercancia");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart011( )
   {
      /* Scan By routine */
      /* Using cursor T000111 */
      pr_default.execute(9);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A24CabEntradaMercanciaId = T000111_A24CabEntradaMercanciaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext011( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A24CabEntradaMercanciaId = T000111_A24CabEntradaMercanciaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
      }
   }

   public void scanEnd011( )
   {
      pr_default.close(9);
   }

   public void afterConfirm011( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert011( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate011( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete011( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete011( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate011( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes011( )
   {
      edtCabEntradaMercanciaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCabEntradaMercanciaId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCabEntradaMercanciaId_Enabled, 5, 0)), true);
      edtOcDocEntry_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOcDocEntry_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOcDocEntry_Enabled, 5, 0)), true);
      edtProvCarCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProvCarCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtProvCarCode_Enabled, 5, 0)), true);
      edtProvCardName_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProvCardName_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtProvCardName_Enabled, 5, 0)), true);
      edtOcDocDate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOcDocDate_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOcDocDate_Enabled, 5, 0)), true);
      edtOcDocDueDate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOcDocDueDate_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOcDocDueDate_Enabled, 5, 0)), true);
      edtEmpSlpName_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpSlpName_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpSlpName_Enabled, 5, 0)), true);
      edtEmpresa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpresa_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtEmpresa_Enabled, 5, 0)), true);
      edtUserName_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUserName_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUserName_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues010( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210224815");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.cabentradamercancia") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11CabEntradaMercanciaId,6,0)))+"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z3ProvCarCode", Z3ProvCarCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z4ProvCardName", Z4ProvCardName);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z5OcDocDate", localUtil.ttoc( Z5OcDocDate, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z6OcDocDueDate", localUtil.ttoc( Z6OcDocDueDate, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z8EmpSlpName", Z8EmpSlpName);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z10Empresa", Z10Empresa);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z25UserName", Z25UserName);
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vCABENTRADAMERCANCIAID", GXutil.ltrim( localUtil.ntoc( AV11CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV12Pgmname));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCABENTRADAMERCANCIAID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11CabEntradaMercanciaId), "ZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "CabEntradaMercancia" ;
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
      return formatLink("com.wms.cabentradamercancia") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11CabEntradaMercanciaId,6,0))) ;
   }

   public String getPgmname( )
   {
      return "CabEntradaMercancia" ;
   }

   public String getPgmdesc( )
   {
      return "Cab Entrada Mercancia" ;
   }

   public void initializeNonKey011( )
   {
      A1OcDocEntry = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1OcDocEntry", GXutil.ltrim( GXutil.str( A1OcDocEntry, 9, 0)));
      A3ProvCarCode = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3ProvCarCode", A3ProvCarCode);
      A4ProvCardName = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4ProvCardName", A4ProvCardName);
      A5OcDocDate = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A5OcDocDate", localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "));
      A6OcDocDueDate = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A6OcDocDueDate", localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
      A8EmpSlpName = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8EmpSlpName", A8EmpSlpName);
      A10Empresa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Empresa", A10Empresa);
      A25UserName = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A25UserName", A25UserName);
      Z1OcDocEntry = 0 ;
      Z3ProvCarCode = "" ;
      Z4ProvCardName = "" ;
      Z5OcDocDate = GXutil.resetTime( GXutil.nullDate() );
      Z6OcDocDueDate = GXutil.resetTime( GXutil.nullDate() );
      Z8EmpSlpName = "" ;
      Z10Empresa = "" ;
      Z25UserName = "" ;
   }

   public void initAll011( )
   {
      A24CabEntradaMercanciaId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A24CabEntradaMercanciaId", GXutil.ltrim( GXutil.str( A24CabEntradaMercanciaId, 6, 0)));
      initializeNonKey011( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210224832");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("cabentradamercancia.js", "?201811210224832");
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
      edtProvCarCode_Internalname = "PROVCARCODE" ;
      edtProvCardName_Internalname = "PROVCARDNAME" ;
      edtOcDocDate_Internalname = "OCDOCDATE" ;
      edtOcDocDueDate_Internalname = "OCDOCDUEDATE" ;
      edtEmpSlpName_Internalname = "EMPSLPNAME" ;
      edtEmpresa_Internalname = "EMPRESA" ;
      edtUserName_Internalname = "USERNAME" ;
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
      Form.setCaption( "Cab Entrada Mercancia" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtUserName_Jsonclick = "" ;
      edtUserName_Enabled = 1 ;
      edtEmpresa_Jsonclick = "" ;
      edtEmpresa_Enabled = 1 ;
      edtEmpSlpName_Jsonclick = "" ;
      edtEmpSlpName_Enabled = 1 ;
      edtOcDocDueDate_Jsonclick = "" ;
      edtOcDocDueDate_Enabled = 1 ;
      edtOcDocDate_Jsonclick = "" ;
      edtOcDocDate_Enabled = 1 ;
      edtProvCardName_Jsonclick = "" ;
      edtProvCardName_Enabled = 1 ;
      edtProvCarCode_Jsonclick = "" ;
      edtProvCarCode_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV11CabEntradaMercanciaId',fld:'vCABENTRADAMERCANCIAID',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12012',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z3ProvCarCode = "" ;
      Z4ProvCardName = "" ;
      Z5OcDocDate = GXutil.resetTime( GXutil.nullDate() );
      Z6OcDocDueDate = GXutil.resetTime( GXutil.nullDate() );
      Z8EmpSlpName = "" ;
      Z10Empresa = "" ;
      Z25UserName = "" ;
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
      A3ProvCarCode = "" ;
      A4ProvCardName = "" ;
      A5OcDocDate = GXutil.resetTime( GXutil.nullDate() );
      A6OcDocDueDate = GXutil.resetTime( GXutil.nullDate() );
      A8EmpSlpName = "" ;
      A10Empresa = "" ;
      A25UserName = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV12Pgmname = "" ;
      forbiddenHiddens = "" ;
      AV9TrnContext = new com.wms.SdtTransactionContext(remoteHandle, context);
      hsh = "" ;
      sMode1 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10WebSession = httpContext.getWebSession();
      T00014_A24CabEntradaMercanciaId = new int[1] ;
      T00014_A1OcDocEntry = new int[1] ;
      T00014_A3ProvCarCode = new String[] {""} ;
      T00014_A4ProvCardName = new String[] {""} ;
      T00014_A5OcDocDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00014_A6OcDocDueDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00014_A8EmpSlpName = new String[] {""} ;
      T00014_A10Empresa = new String[] {""} ;
      T00014_A25UserName = new String[] {""} ;
      T00015_A24CabEntradaMercanciaId = new int[1] ;
      T00013_A24CabEntradaMercanciaId = new int[1] ;
      T00013_A1OcDocEntry = new int[1] ;
      T00013_A3ProvCarCode = new String[] {""} ;
      T00013_A4ProvCardName = new String[] {""} ;
      T00013_A5OcDocDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00013_A6OcDocDueDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00013_A8EmpSlpName = new String[] {""} ;
      T00013_A10Empresa = new String[] {""} ;
      T00013_A25UserName = new String[] {""} ;
      T00016_A24CabEntradaMercanciaId = new int[1] ;
      T00017_A24CabEntradaMercanciaId = new int[1] ;
      T00012_A24CabEntradaMercanciaId = new int[1] ;
      T00012_A1OcDocEntry = new int[1] ;
      T00012_A3ProvCarCode = new String[] {""} ;
      T00012_A4ProvCardName = new String[] {""} ;
      T00012_A5OcDocDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00012_A6OcDocDueDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00012_A8EmpSlpName = new String[] {""} ;
      T00012_A10Empresa = new String[] {""} ;
      T00012_A25UserName = new String[] {""} ;
      T00018_A24CabEntradaMercanciaId = new int[1] ;
      T000111_A24CabEntradaMercanciaId = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.cabentradamercancia__fusquim_sap(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.cabentradamercancia__default(),
         new Object[] {
             new Object[] {
            T00012_A24CabEntradaMercanciaId, T00012_A1OcDocEntry, T00012_A3ProvCarCode, T00012_A4ProvCardName, T00012_A5OcDocDate, T00012_A6OcDocDueDate, T00012_A8EmpSlpName, T00012_A10Empresa, T00012_A25UserName
            }
            , new Object[] {
            T00013_A24CabEntradaMercanciaId, T00013_A1OcDocEntry, T00013_A3ProvCarCode, T00013_A4ProvCardName, T00013_A5OcDocDate, T00013_A6OcDocDueDate, T00013_A8EmpSlpName, T00013_A10Empresa, T00013_A25UserName
            }
            , new Object[] {
            T00014_A24CabEntradaMercanciaId, T00014_A1OcDocEntry, T00014_A3ProvCarCode, T00014_A4ProvCardName, T00014_A5OcDocDate, T00014_A6OcDocDueDate, T00014_A8EmpSlpName, T00014_A10Empresa, T00014_A25UserName
            }
            , new Object[] {
            T00015_A24CabEntradaMercanciaId
            }
            , new Object[] {
            T00016_A24CabEntradaMercanciaId
            }
            , new Object[] {
            T00017_A24CabEntradaMercanciaId
            }
            , new Object[] {
            T00018_A24CabEntradaMercanciaId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000111_A24CabEntradaMercanciaId
            }
         }
      );
      AV12Pgmname = "CabEntradaMercancia" ;
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
   private int wcpOAV11CabEntradaMercanciaId ;
   private int Z24CabEntradaMercanciaId ;
   private int Z1OcDocEntry ;
   private int AV11CabEntradaMercanciaId ;
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
   private int edtProvCarCode_Enabled ;
   private int edtProvCardName_Enabled ;
   private int edtOcDocDate_Enabled ;
   private int edtOcDocDueDate_Enabled ;
   private int edtEmpSlpName_Enabled ;
   private int edtEmpresa_Enabled ;
   private int edtUserName_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
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
   private String edtProvCarCode_Internalname ;
   private String edtProvCarCode_Jsonclick ;
   private String edtProvCardName_Internalname ;
   private String edtProvCardName_Jsonclick ;
   private String edtOcDocDate_Internalname ;
   private String edtOcDocDate_Jsonclick ;
   private String edtOcDocDueDate_Internalname ;
   private String edtOcDocDueDate_Jsonclick ;
   private String edtEmpSlpName_Internalname ;
   private String edtEmpSlpName_Jsonclick ;
   private String edtEmpresa_Internalname ;
   private String edtEmpresa_Jsonclick ;
   private String edtUserName_Internalname ;
   private String edtUserName_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV12Pgmname ;
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
   private java.util.Date Z5OcDocDate ;
   private java.util.Date Z6OcDocDueDate ;
   private java.util.Date A5OcDocDate ;
   private java.util.Date A6OcDocDueDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z3ProvCarCode ;
   private String Z4ProvCardName ;
   private String Z8EmpSlpName ;
   private String Z10Empresa ;
   private String Z25UserName ;
   private String A3ProvCarCode ;
   private String A4ProvCardName ;
   private String A8EmpSlpName ;
   private String A10Empresa ;
   private String A25UserName ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.wms.SdtTransactionContext AV9TrnContext ;
   private IDataStoreProvider pr_default ;
   private int[] T00014_A24CabEntradaMercanciaId ;
   private int[] T00014_A1OcDocEntry ;
   private String[] T00014_A3ProvCarCode ;
   private String[] T00014_A4ProvCardName ;
   private java.util.Date[] T00014_A5OcDocDate ;
   private java.util.Date[] T00014_A6OcDocDueDate ;
   private String[] T00014_A8EmpSlpName ;
   private String[] T00014_A10Empresa ;
   private String[] T00014_A25UserName ;
   private int[] T00015_A24CabEntradaMercanciaId ;
   private int[] T00013_A24CabEntradaMercanciaId ;
   private int[] T00013_A1OcDocEntry ;
   private String[] T00013_A3ProvCarCode ;
   private String[] T00013_A4ProvCardName ;
   private java.util.Date[] T00013_A5OcDocDate ;
   private java.util.Date[] T00013_A6OcDocDueDate ;
   private String[] T00013_A8EmpSlpName ;
   private String[] T00013_A10Empresa ;
   private String[] T00013_A25UserName ;
   private int[] T00016_A24CabEntradaMercanciaId ;
   private int[] T00017_A24CabEntradaMercanciaId ;
   private int[] T00012_A24CabEntradaMercanciaId ;
   private int[] T00012_A1OcDocEntry ;
   private String[] T00012_A3ProvCarCode ;
   private String[] T00012_A4ProvCardName ;
   private java.util.Date[] T00012_A5OcDocDate ;
   private java.util.Date[] T00012_A6OcDocDueDate ;
   private String[] T00012_A8EmpSlpName ;
   private String[] T00012_A10Empresa ;
   private String[] T00012_A25UserName ;
   private int[] T00018_A24CabEntradaMercanciaId ;
   private IDataStoreProvider pr_fusquim_sap ;
   private int[] T000111_A24CabEntradaMercanciaId ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class cabentradamercancia__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class cabentradamercancia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00012", "SELECT [CabEntradaMercanciaId], [OcDocEntry], [ProvCarCode], [ProvCardName], [OcDocDate], [OcDocDueDate], [EmpSlpName], [Empresa], [UserName] FROM [CabEntradaMercancia] WITH (UPDLOCK) WHERE [CabEntradaMercanciaId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00013", "SELECT [CabEntradaMercanciaId], [OcDocEntry], [ProvCarCode], [ProvCardName], [OcDocDate], [OcDocDueDate], [EmpSlpName], [Empresa], [UserName] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE [CabEntradaMercanciaId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00014", "SELECT TM1.[CabEntradaMercanciaId], TM1.[OcDocEntry], TM1.[ProvCarCode], TM1.[ProvCardName], TM1.[OcDocDate], TM1.[OcDocDueDate], TM1.[EmpSlpName], TM1.[Empresa], TM1.[UserName] FROM [CabEntradaMercancia] TM1 WITH (NOLOCK) WHERE TM1.[CabEntradaMercanciaId] = ? ORDER BY TM1.[CabEntradaMercanciaId]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00015", "SELECT [CabEntradaMercanciaId] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE [CabEntradaMercanciaId] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00016", "SELECT TOP 1 [CabEntradaMercanciaId] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE ( [CabEntradaMercanciaId] > ?) ORDER BY [CabEntradaMercanciaId]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00017", "SELECT TOP 1 [CabEntradaMercanciaId] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE ( [CabEntradaMercanciaId] < ?) ORDER BY [CabEntradaMercanciaId] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00018", "INSERT INTO [CabEntradaMercancia]([OcDocEntry], [ProvCarCode], [ProvCardName], [OcDocDate], [OcDocDueDate], [EmpSlpName], [Empresa], [UserName], [OC1LineNum], [ItmItemCode], [ItmItemName], [WhsCode], [PPDetLinCantidad], [PPDetLinPendiente], [PPDetFechaEntrega], [PPDetLinStatus], [Lote], [PPDetLinRecibida]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, convert(int, 0), '', '', '', convert(int, 0), convert(int, 0), convert( DATETIME, '17530101', 112 ), '', '', convert(int, 0)); SELECT SCOPE_IDENTITY()", GX_NOMASK)
         ,new UpdateCursor("T00019", "UPDATE [CabEntradaMercancia] SET [OcDocEntry]=?, [ProvCarCode]=?, [ProvCardName]=?, [OcDocDate]=?, [OcDocDueDate]=?, [EmpSlpName]=?, [Empresa]=?, [UserName]=?  WHERE [CabEntradaMercanciaId] = ?", GX_NOMASK)
         ,new UpdateCursor("T000110", "DELETE FROM [CabEntradaMercancia]  WHERE [CabEntradaMercanciaId] = ?", GX_NOMASK)
         ,new ForEachCursor("T000111", "SELECT [CabEntradaMercanciaId] FROM [CabEntradaMercancia] WITH (NOLOCK) ORDER BY [CabEntradaMercanciaId]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
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
               stmt.setVarchar(2, (String)parms[1], 15, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 155, false);
               stmt.setVarchar(7, (String)parms[6], 7, false);
               stmt.setVarchar(8, (String)parms[7], 40, false);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 15, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 155, false);
               stmt.setVarchar(7, (String)parms[6], 7, false);
               stmt.setVarchar(8, (String)parms[7], 40, false);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

