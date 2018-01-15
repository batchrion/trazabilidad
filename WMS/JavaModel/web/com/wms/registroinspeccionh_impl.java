/*
               File: registroinspeccionh_impl
        Description: Registro Inspeccion H
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:59.87
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

public final  class registroinspeccionh_impl extends GXDataArea
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
         Form.getMeta().addItem("description", "Registro Inspeccion H", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public registroinspeccionh_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public registroinspeccionh_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registroinspeccionh_impl.class ));
   }

   public registroinspeccionh_impl( int remoteHandle ,
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
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Registro Inspeccion H", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.wms.gx0050"+"',["+"{Ctrl:gx.dom.el('"+"UVID_CONTROLCHDOCENTRY"+"'), id:'"+"UVID_CONTROLCHDOCENTRY"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCHDocEntry_Internalname, "Doc Entry", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCHDocEntry_Internalname, GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtUVID_CONTROLCHDocEntry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCHDocEntry_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_CONTROLCHDocEntry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_WhsCode_Internalname, "U_Whs Code", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_WhsCode_Internalname, A65U_WhsCode, GXutil.rtrim( localUtil.format( A65U_WhsCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_WhsCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_WhsCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_ItemCode_Internalname, "U_Item Code", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_ItemCode_Internalname, A63U_ItemCode, GXutil.rtrim( localUtil.format( A63U_ItemCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_ItemCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_ItemCode_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_NoLote_Internalname, "U_No Lote", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NoLote_Internalname, A70U_NoLote, GXutil.rtrim( localUtil.format( A70U_NoLote, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NoLote_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_NoLote_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Cantidad_Internalname, "U_Cantidad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Cantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A73U_Cantidad, (byte)(18), (byte)(0), ",", "")), ((edtU_Cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Cantidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Cantidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Bultos_Internalname, "U_Bultos", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Bultos_Internalname, GXutil.ltrim( localUtil.ntoc( A74U_Bultos, (byte)(9), (byte)(0), ",", "")), ((edtU_Bultos_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Bultos_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Bultos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_BultosMu_Internalname, "U_Bultos Mu", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_BultosMu_Internalname, GXutil.ltrim( localUtil.ntoc( A75U_BultosMu, (byte)(9), (byte)(0), ",", "")), ((edtU_BultosMu_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_BultosMu_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_BultosMu_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Traslado_Internalname, "U_Traslado", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Traslado_Internalname, GXutil.rtrim( A86U_Traslado), GXutil.rtrim( localUtil.format( A86U_Traslado, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Traslado_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Traslado_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecIngr_Internalname, "U_Fec Ingr", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtU_FecIngr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecIngr_Internalname, localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A76U_FecIngr, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecIngr_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_FecIngr_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecIngr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecIngr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_UM_Internalname, "U_UM", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_UM_Internalname, A78U_UM, GXutil.rtrim( localUtil.format( A78U_UM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_UM_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_UM_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecIni_Internalname, "U_Fec Ini", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtU_FecIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecIni_Internalname, localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A81U_FecIni, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecIni_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_FecIni_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecFin_Internalname, "U_Fec Fin", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtU_FecFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecFin_Internalname, localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A82U_FecFin, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecFin_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_FecFin_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Reanalis_Internalname, "U_Reanalis", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Reanalis_Internalname, GXutil.rtrim( A104U_Reanalis), GXutil.rtrim( localUtil.format( A104U_Reanalis, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Reanalis_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Reanalis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CorrAnal_Internalname, "U_Corr Anal", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CorrAnal_Internalname, GXutil.ltrim( localUtil.ntoc( A72U_CorrAnal, (byte)(9), (byte)(0), ",", "")), ((edtU_CorrAnal_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CorrAnal_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CorrAnal_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_NoDoc_Internalname, "U_No Doc", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NoDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ",", "")), ((edtU_NoDoc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NoDoc_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_NoDoc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecContr_Internalname, "U_Fec Contr", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtU_FecContr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecContr_Internalname, localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A80U_FecContr, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecContr_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_FecContr_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecContr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecContr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CorrLote_Internalname, "U_Corr Lote", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CorrLote_Internalname, GXutil.ltrim( localUtil.ntoc( A71U_CorrLote, (byte)(9), (byte)(0), ",", "")), ((edtU_CorrLote_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CorrLote_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CorrLote_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecUltIn_Internalname, "U_Fec Ult In", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtU_FecUltIn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecUltIn_Internalname, localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A77U_FecUltIn, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecUltIn_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_FecUltIn_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecUltIn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecUltIn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CCCode_Internalname, "U_CCCode", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CCCode_Internalname, A93U_CCCode, GXutil.rtrim( localUtil.format( A93U_CCCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CCCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CCCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_PrjCode_Internalname, "U_Prj Code", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_PrjCode_Internalname, A94U_PrjCode, GXutil.rtrim( localUtil.format( A94U_PrjCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_PrjCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_PrjCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCHU_Estado_Internalname, "U_Estado", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCHU_Estado_Internalname, GXutil.rtrim( A85UVID_CONTROLCHU_Estado), GXutil.rtrim( localUtil.format( A85UVID_CONTROLCHU_Estado, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCHU_Estado_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_CONTROLCHU_Estado_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_TipResul_Internalname, "U_Tip Resul", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_TipResul_Internalname, A87U_TipResul, GXutil.rtrim( localUtil.format( A87U_TipResul, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_TipResul_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_TipResul_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_WhsDest_Internalname, "U_Whs Dest", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_WhsDest_Internalname, A66U_WhsDest, GXutil.rtrim( localUtil.format( A66U_WhsDest, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_WhsDest_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_WhsDest_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCHU_Comment_Internalname, "U_Comment", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtUVID_CONTROLCHU_Comment_Internalname, A95UVID_CONTROLCHU_Comment, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", (short)(0), 1, edtUVID_CONTROLCHU_Comment_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_RegistroInspeccionH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionH.htm");
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
      e11062 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCHDocEntry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCHDocEntry_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_CONTROLCHDOCENTRY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A43UVID_CONTROLCHDocEntry = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
            }
            else
            {
               A43UVID_CONTROLCHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCHDocEntry_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
            }
            A65U_WhsCode = httpContext.cgiGet( edtU_WhsCode_Internalname) ;
            n65U_WhsCode = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65U_WhsCode", A65U_WhsCode);
            n65U_WhsCode = ((GXutil.strcmp("", A65U_WhsCode)==0) ? true : false) ;
            A63U_ItemCode = httpContext.cgiGet( edtU_ItemCode_Internalname) ;
            n63U_ItemCode = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A63U_ItemCode", A63U_ItemCode);
            n63U_ItemCode = ((GXutil.strcmp("", A63U_ItemCode)==0) ? true : false) ;
            A70U_NoLote = httpContext.cgiGet( edtU_NoLote_Internalname) ;
            n70U_NoLote = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A70U_NoLote", A70U_NoLote);
            n70U_NoLote = ((GXutil.strcmp("", A70U_NoLote)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_Cantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_Cantidad_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_CANTIDAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_Cantidad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A73U_Cantidad = 0 ;
               n73U_Cantidad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A73U_Cantidad", GXutil.ltrim( GXutil.str( A73U_Cantidad, 18, 0)));
            }
            else
            {
               A73U_Cantidad = localUtil.ctol( httpContext.cgiGet( edtU_Cantidad_Internalname), ",", ".") ;
               n73U_Cantidad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A73U_Cantidad", GXutil.ltrim( GXutil.str( A73U_Cantidad, 18, 0)));
            }
            n73U_Cantidad = ((0==A73U_Cantidad) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_Bultos_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_Bultos_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_BULTOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_Bultos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A74U_Bultos = 0 ;
               n74U_Bultos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A74U_Bultos", GXutil.ltrim( GXutil.str( A74U_Bultos, 9, 0)));
            }
            else
            {
               A74U_Bultos = (int)(localUtil.ctol( httpContext.cgiGet( edtU_Bultos_Internalname), ",", ".")) ;
               n74U_Bultos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A74U_Bultos", GXutil.ltrim( GXutil.str( A74U_Bultos, 9, 0)));
            }
            n74U_Bultos = ((0==A74U_Bultos) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_BultosMu_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_BultosMu_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_BULTOSMU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_BultosMu_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A75U_BultosMu = 0 ;
               n75U_BultosMu = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A75U_BultosMu", GXutil.ltrim( GXutil.str( A75U_BultosMu, 9, 0)));
            }
            else
            {
               A75U_BultosMu = (int)(localUtil.ctol( httpContext.cgiGet( edtU_BultosMu_Internalname), ",", ".")) ;
               n75U_BultosMu = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A75U_BultosMu", GXutil.ltrim( GXutil.str( A75U_BultosMu, 9, 0)));
            }
            n75U_BultosMu = ((0==A75U_BultosMu) ? true : false) ;
            A86U_Traslado = httpContext.cgiGet( edtU_Traslado_Internalname) ;
            n86U_Traslado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A86U_Traslado", A86U_Traslado);
            n86U_Traslado = ((GXutil.strcmp("", A86U_Traslado)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtU_FecIngr_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "U_FECINGR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_FecIngr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
               n76U_FecIngr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A76U_FecIngr", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A76U_FecIngr = localUtil.ctot( httpContext.cgiGet( edtU_FecIngr_Internalname)) ;
               n76U_FecIngr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A76U_FecIngr", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
            }
            n76U_FecIngr = (GXutil.dateCompare(GXutil.nullDate(), A76U_FecIngr) ? true : false) ;
            A78U_UM = httpContext.cgiGet( edtU_UM_Internalname) ;
            n78U_UM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A78U_UM", A78U_UM);
            n78U_UM = ((GXutil.strcmp("", A78U_UM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtU_FecIni_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "U_FECINI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_FecIni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
               n81U_FecIni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A81U_FecIni", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A81U_FecIni = localUtil.ctot( httpContext.cgiGet( edtU_FecIni_Internalname)) ;
               n81U_FecIni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A81U_FecIni", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
            }
            n81U_FecIni = (GXutil.dateCompare(GXutil.nullDate(), A81U_FecIni) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtU_FecFin_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "U_FECFIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_FecFin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
               n82U_FecFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A82U_FecFin", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A82U_FecFin = localUtil.ctot( httpContext.cgiGet( edtU_FecFin_Internalname)) ;
               n82U_FecFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A82U_FecFin", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
            }
            n82U_FecFin = (GXutil.dateCompare(GXutil.nullDate(), A82U_FecFin) ? true : false) ;
            A104U_Reanalis = httpContext.cgiGet( edtU_Reanalis_Internalname) ;
            n104U_Reanalis = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A104U_Reanalis", A104U_Reanalis);
            n104U_Reanalis = ((GXutil.strcmp("", A104U_Reanalis)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_CorrAnal_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_CorrAnal_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_CORRANAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_CorrAnal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A72U_CorrAnal = 0 ;
               n72U_CorrAnal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A72U_CorrAnal", GXutil.ltrim( GXutil.str( A72U_CorrAnal, 9, 0)));
            }
            else
            {
               A72U_CorrAnal = (int)(localUtil.ctol( httpContext.cgiGet( edtU_CorrAnal_Internalname), ",", ".")) ;
               n72U_CorrAnal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A72U_CorrAnal", GXutil.ltrim( GXutil.str( A72U_CorrAnal, 9, 0)));
            }
            n72U_CorrAnal = ((0==A72U_CorrAnal) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_NoDoc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_NoDoc_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_NODOC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_NoDoc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A79U_NoDoc = 0 ;
               n79U_NoDoc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A79U_NoDoc", GXutil.ltrim( GXutil.str( A79U_NoDoc, 9, 0)));
            }
            else
            {
               A79U_NoDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtU_NoDoc_Internalname), ",", ".")) ;
               n79U_NoDoc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A79U_NoDoc", GXutil.ltrim( GXutil.str( A79U_NoDoc, 9, 0)));
            }
            n79U_NoDoc = ((0==A79U_NoDoc) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtU_FecContr_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "U_FECCONTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_FecContr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
               n80U_FecContr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A80U_FecContr", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A80U_FecContr = localUtil.ctot( httpContext.cgiGet( edtU_FecContr_Internalname)) ;
               n80U_FecContr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A80U_FecContr", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
            }
            n80U_FecContr = (GXutil.dateCompare(GXutil.nullDate(), A80U_FecContr) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_CorrLote_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_CorrLote_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_CORRLOTE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_CorrLote_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A71U_CorrLote = 0 ;
               n71U_CorrLote = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A71U_CorrLote", GXutil.ltrim( GXutil.str( A71U_CorrLote, 9, 0)));
            }
            else
            {
               A71U_CorrLote = (int)(localUtil.ctol( httpContext.cgiGet( edtU_CorrLote_Internalname), ",", ".")) ;
               n71U_CorrLote = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A71U_CorrLote", GXutil.ltrim( GXutil.str( A71U_CorrLote, 9, 0)));
            }
            n71U_CorrLote = ((0==A71U_CorrLote) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtU_FecUltIn_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "U_FECULTIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_FecUltIn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
               n77U_FecUltIn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A77U_FecUltIn", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A77U_FecUltIn = localUtil.ctot( httpContext.cgiGet( edtU_FecUltIn_Internalname)) ;
               n77U_FecUltIn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A77U_FecUltIn", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
            }
            n77U_FecUltIn = (GXutil.dateCompare(GXutil.nullDate(), A77U_FecUltIn) ? true : false) ;
            A93U_CCCode = httpContext.cgiGet( edtU_CCCode_Internalname) ;
            n93U_CCCode = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A93U_CCCode", A93U_CCCode);
            n93U_CCCode = ((GXutil.strcmp("", A93U_CCCode)==0) ? true : false) ;
            A94U_PrjCode = httpContext.cgiGet( edtU_PrjCode_Internalname) ;
            n94U_PrjCode = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A94U_PrjCode", A94U_PrjCode);
            n94U_PrjCode = ((GXutil.strcmp("", A94U_PrjCode)==0) ? true : false) ;
            A85UVID_CONTROLCHU_Estado = httpContext.cgiGet( edtUVID_CONTROLCHU_Estado_Internalname) ;
            n85UVID_CONTROLCHU_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A85UVID_CONTROLCHU_Estado", A85UVID_CONTROLCHU_Estado);
            n85UVID_CONTROLCHU_Estado = ((GXutil.strcmp("", A85UVID_CONTROLCHU_Estado)==0) ? true : false) ;
            A87U_TipResul = httpContext.cgiGet( edtU_TipResul_Internalname) ;
            n87U_TipResul = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A87U_TipResul", A87U_TipResul);
            n87U_TipResul = ((GXutil.strcmp("", A87U_TipResul)==0) ? true : false) ;
            A66U_WhsDest = httpContext.cgiGet( edtU_WhsDest_Internalname) ;
            n66U_WhsDest = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A66U_WhsDest", A66U_WhsDest);
            n66U_WhsDest = ((GXutil.strcmp("", A66U_WhsDest)==0) ? true : false) ;
            A95UVID_CONTROLCHU_Comment = httpContext.cgiGet( edtUVID_CONTROLCHU_Comment_Internalname) ;
            n95UVID_CONTROLCHU_Comment = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A95UVID_CONTROLCHU_Comment", A95UVID_CONTROLCHU_Comment);
            n95UVID_CONTROLCHU_Comment = ((GXutil.strcmp("", A95UVID_CONTROLCHU_Comment)==0) ? true : false) ;
            /* Read saved values. */
            Z43UVID_CONTROLCHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( "Z43UVID_CONTROLCHDocEntry"), ",", ".")) ;
            Z65U_WhsCode = httpContext.cgiGet( "Z65U_WhsCode") ;
            n65U_WhsCode = ((GXutil.strcmp("", A65U_WhsCode)==0) ? true : false) ;
            Z63U_ItemCode = httpContext.cgiGet( "Z63U_ItemCode") ;
            n63U_ItemCode = ((GXutil.strcmp("", A63U_ItemCode)==0) ? true : false) ;
            Z70U_NoLote = httpContext.cgiGet( "Z70U_NoLote") ;
            n70U_NoLote = ((GXutil.strcmp("", A70U_NoLote)==0) ? true : false) ;
            Z73U_Cantidad = localUtil.ctol( httpContext.cgiGet( "Z73U_Cantidad"), ",", ".") ;
            n73U_Cantidad = ((0==A73U_Cantidad) ? true : false) ;
            Z74U_Bultos = (int)(localUtil.ctol( httpContext.cgiGet( "Z74U_Bultos"), ",", ".")) ;
            n74U_Bultos = ((0==A74U_Bultos) ? true : false) ;
            Z75U_BultosMu = (int)(localUtil.ctol( httpContext.cgiGet( "Z75U_BultosMu"), ",", ".")) ;
            n75U_BultosMu = ((0==A75U_BultosMu) ? true : false) ;
            Z86U_Traslado = httpContext.cgiGet( "Z86U_Traslado") ;
            n86U_Traslado = ((GXutil.strcmp("", A86U_Traslado)==0) ? true : false) ;
            Z76U_FecIngr = localUtil.ctot( httpContext.cgiGet( "Z76U_FecIngr"), 0) ;
            n76U_FecIngr = (GXutil.dateCompare(GXutil.nullDate(), A76U_FecIngr) ? true : false) ;
            Z78U_UM = httpContext.cgiGet( "Z78U_UM") ;
            n78U_UM = ((GXutil.strcmp("", A78U_UM)==0) ? true : false) ;
            Z81U_FecIni = localUtil.ctot( httpContext.cgiGet( "Z81U_FecIni"), 0) ;
            n81U_FecIni = (GXutil.dateCompare(GXutil.nullDate(), A81U_FecIni) ? true : false) ;
            Z82U_FecFin = localUtil.ctot( httpContext.cgiGet( "Z82U_FecFin"), 0) ;
            n82U_FecFin = (GXutil.dateCompare(GXutil.nullDate(), A82U_FecFin) ? true : false) ;
            Z104U_Reanalis = httpContext.cgiGet( "Z104U_Reanalis") ;
            n104U_Reanalis = ((GXutil.strcmp("", A104U_Reanalis)==0) ? true : false) ;
            Z72U_CorrAnal = (int)(localUtil.ctol( httpContext.cgiGet( "Z72U_CorrAnal"), ",", ".")) ;
            n72U_CorrAnal = ((0==A72U_CorrAnal) ? true : false) ;
            Z79U_NoDoc = (int)(localUtil.ctol( httpContext.cgiGet( "Z79U_NoDoc"), ",", ".")) ;
            n79U_NoDoc = ((0==A79U_NoDoc) ? true : false) ;
            Z80U_FecContr = localUtil.ctot( httpContext.cgiGet( "Z80U_FecContr"), 0) ;
            n80U_FecContr = (GXutil.dateCompare(GXutil.nullDate(), A80U_FecContr) ? true : false) ;
            Z71U_CorrLote = (int)(localUtil.ctol( httpContext.cgiGet( "Z71U_CorrLote"), ",", ".")) ;
            n71U_CorrLote = ((0==A71U_CorrLote) ? true : false) ;
            Z77U_FecUltIn = localUtil.ctot( httpContext.cgiGet( "Z77U_FecUltIn"), 0) ;
            n77U_FecUltIn = (GXutil.dateCompare(GXutil.nullDate(), A77U_FecUltIn) ? true : false) ;
            Z93U_CCCode = httpContext.cgiGet( "Z93U_CCCode") ;
            n93U_CCCode = ((GXutil.strcmp("", A93U_CCCode)==0) ? true : false) ;
            Z94U_PrjCode = httpContext.cgiGet( "Z94U_PrjCode") ;
            n94U_PrjCode = ((GXutil.strcmp("", A94U_PrjCode)==0) ? true : false) ;
            Z85UVID_CONTROLCHU_Estado = httpContext.cgiGet( "Z85UVID_CONTROLCHU_Estado") ;
            n85UVID_CONTROLCHU_Estado = ((GXutil.strcmp("", A85UVID_CONTROLCHU_Estado)==0) ? true : false) ;
            Z87U_TipResul = httpContext.cgiGet( "Z87U_TipResul") ;
            n87U_TipResul = ((GXutil.strcmp("", A87U_TipResul)==0) ? true : false) ;
            Z66U_WhsDest = httpContext.cgiGet( "Z66U_WhsDest") ;
            n66U_WhsDest = ((GXutil.strcmp("", A66U_WhsDest)==0) ? true : false) ;
            Z95UVID_CONTROLCHU_Comment = httpContext.cgiGet( "Z95UVID_CONTROLCHU_Comment") ;
            n95UVID_CONTROLCHU_Comment = ((GXutil.strcmp("", A95UVID_CONTROLCHU_Comment)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A43UVID_CONTROLCHDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal( ) ;
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
                        e11062 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12062 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         e12062 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll065( ) ;
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
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      }
   }

   public void disable_std_buttons_dsp( )
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
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)), true);
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_enter_Visible, 5, 0)), true);
      }
      disableAttributes065( ) ;
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

   public void resetCaption060( )
   {
   }

   public void e11062( )
   {
      /* Start Routine */
   }

   public void e12062( )
   {
      /* After Trn Routine */
   }

   public void zm065( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z65U_WhsCode = T00063_A65U_WhsCode[0] ;
            Z63U_ItemCode = T00063_A63U_ItemCode[0] ;
            Z70U_NoLote = T00063_A70U_NoLote[0] ;
            Z73U_Cantidad = T00063_A73U_Cantidad[0] ;
            Z74U_Bultos = T00063_A74U_Bultos[0] ;
            Z75U_BultosMu = T00063_A75U_BultosMu[0] ;
            Z86U_Traslado = T00063_A86U_Traslado[0] ;
            Z76U_FecIngr = T00063_A76U_FecIngr[0] ;
            Z78U_UM = T00063_A78U_UM[0] ;
            Z81U_FecIni = T00063_A81U_FecIni[0] ;
            Z82U_FecFin = T00063_A82U_FecFin[0] ;
            Z104U_Reanalis = T00063_A104U_Reanalis[0] ;
            Z72U_CorrAnal = T00063_A72U_CorrAnal[0] ;
            Z79U_NoDoc = T00063_A79U_NoDoc[0] ;
            Z80U_FecContr = T00063_A80U_FecContr[0] ;
            Z71U_CorrLote = T00063_A71U_CorrLote[0] ;
            Z77U_FecUltIn = T00063_A77U_FecUltIn[0] ;
            Z93U_CCCode = T00063_A93U_CCCode[0] ;
            Z94U_PrjCode = T00063_A94U_PrjCode[0] ;
            Z85UVID_CONTROLCHU_Estado = T00063_A85UVID_CONTROLCHU_Estado[0] ;
            Z87U_TipResul = T00063_A87U_TipResul[0] ;
            Z66U_WhsDest = T00063_A66U_WhsDest[0] ;
            Z95UVID_CONTROLCHU_Comment = T00063_A95UVID_CONTROLCHU_Comment[0] ;
         }
         else
         {
            Z65U_WhsCode = A65U_WhsCode ;
            Z63U_ItemCode = A63U_ItemCode ;
            Z70U_NoLote = A70U_NoLote ;
            Z73U_Cantidad = A73U_Cantidad ;
            Z74U_Bultos = A74U_Bultos ;
            Z75U_BultosMu = A75U_BultosMu ;
            Z86U_Traslado = A86U_Traslado ;
            Z76U_FecIngr = A76U_FecIngr ;
            Z78U_UM = A78U_UM ;
            Z81U_FecIni = A81U_FecIni ;
            Z82U_FecFin = A82U_FecFin ;
            Z104U_Reanalis = A104U_Reanalis ;
            Z72U_CorrAnal = A72U_CorrAnal ;
            Z79U_NoDoc = A79U_NoDoc ;
            Z80U_FecContr = A80U_FecContr ;
            Z71U_CorrLote = A71U_CorrLote ;
            Z77U_FecUltIn = A77U_FecUltIn ;
            Z93U_CCCode = A93U_CCCode ;
            Z94U_PrjCode = A94U_PrjCode ;
            Z85UVID_CONTROLCHU_Estado = A85UVID_CONTROLCHU_Estado ;
            Z87U_TipResul = A87U_TipResul ;
            Z66U_WhsDest = A66U_WhsDest ;
            Z95UVID_CONTROLCHU_Comment = A95UVID_CONTROLCHU_Comment ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z43UVID_CONTROLCHDocEntry = A43UVID_CONTROLCHDocEntry ;
         Z65U_WhsCode = A65U_WhsCode ;
         Z63U_ItemCode = A63U_ItemCode ;
         Z70U_NoLote = A70U_NoLote ;
         Z73U_Cantidad = A73U_Cantidad ;
         Z74U_Bultos = A74U_Bultos ;
         Z75U_BultosMu = A75U_BultosMu ;
         Z86U_Traslado = A86U_Traslado ;
         Z76U_FecIngr = A76U_FecIngr ;
         Z78U_UM = A78U_UM ;
         Z81U_FecIni = A81U_FecIni ;
         Z82U_FecFin = A82U_FecFin ;
         Z104U_Reanalis = A104U_Reanalis ;
         Z72U_CorrAnal = A72U_CorrAnal ;
         Z79U_NoDoc = A79U_NoDoc ;
         Z80U_FecContr = A80U_FecContr ;
         Z71U_CorrLote = A71U_CorrLote ;
         Z77U_FecUltIn = A77U_FecUltIn ;
         Z93U_CCCode = A93U_CCCode ;
         Z94U_PrjCode = A94U_PrjCode ;
         Z85UVID_CONTROLCHU_Estado = A85UVID_CONTROLCHU_Estado ;
         Z87U_TipResul = A87U_TipResul ;
         Z66U_WhsDest = A66U_WhsDest ;
         Z95UVID_CONTROLCHU_Comment = A95UVID_CONTROLCHU_Comment ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      }
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

   public void load065( )
   {
      /* Using cursor T00064 */
      pr_fusquim_sap.execute(2, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(2) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A65U_WhsCode = T00064_A65U_WhsCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65U_WhsCode", A65U_WhsCode);
         n65U_WhsCode = T00064_n65U_WhsCode[0] ;
         A63U_ItemCode = T00064_A63U_ItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63U_ItemCode", A63U_ItemCode);
         n63U_ItemCode = T00064_n63U_ItemCode[0] ;
         A70U_NoLote = T00064_A70U_NoLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70U_NoLote", A70U_NoLote);
         n70U_NoLote = T00064_n70U_NoLote[0] ;
         A73U_Cantidad = T00064_A73U_Cantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73U_Cantidad", GXutil.ltrim( GXutil.str( A73U_Cantidad, 18, 0)));
         n73U_Cantidad = T00064_n73U_Cantidad[0] ;
         A74U_Bultos = T00064_A74U_Bultos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74U_Bultos", GXutil.ltrim( GXutil.str( A74U_Bultos, 9, 0)));
         n74U_Bultos = T00064_n74U_Bultos[0] ;
         A75U_BultosMu = T00064_A75U_BultosMu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75U_BultosMu", GXutil.ltrim( GXutil.str( A75U_BultosMu, 9, 0)));
         n75U_BultosMu = T00064_n75U_BultosMu[0] ;
         A86U_Traslado = T00064_A86U_Traslado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A86U_Traslado", A86U_Traslado);
         n86U_Traslado = T00064_n86U_Traslado[0] ;
         A76U_FecIngr = T00064_A76U_FecIngr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76U_FecIngr", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
         n76U_FecIngr = T00064_n76U_FecIngr[0] ;
         A78U_UM = T00064_A78U_UM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78U_UM", A78U_UM);
         n78U_UM = T00064_n78U_UM[0] ;
         A81U_FecIni = T00064_A81U_FecIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81U_FecIni", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
         n81U_FecIni = T00064_n81U_FecIni[0] ;
         A82U_FecFin = T00064_A82U_FecFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82U_FecFin", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
         n82U_FecFin = T00064_n82U_FecFin[0] ;
         A104U_Reanalis = T00064_A104U_Reanalis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104U_Reanalis", A104U_Reanalis);
         n104U_Reanalis = T00064_n104U_Reanalis[0] ;
         A72U_CorrAnal = T00064_A72U_CorrAnal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A72U_CorrAnal", GXutil.ltrim( GXutil.str( A72U_CorrAnal, 9, 0)));
         n72U_CorrAnal = T00064_n72U_CorrAnal[0] ;
         A79U_NoDoc = T00064_A79U_NoDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79U_NoDoc", GXutil.ltrim( GXutil.str( A79U_NoDoc, 9, 0)));
         n79U_NoDoc = T00064_n79U_NoDoc[0] ;
         A80U_FecContr = T00064_A80U_FecContr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80U_FecContr", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
         n80U_FecContr = T00064_n80U_FecContr[0] ;
         A71U_CorrLote = T00064_A71U_CorrLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71U_CorrLote", GXutil.ltrim( GXutil.str( A71U_CorrLote, 9, 0)));
         n71U_CorrLote = T00064_n71U_CorrLote[0] ;
         A77U_FecUltIn = T00064_A77U_FecUltIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A77U_FecUltIn", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
         n77U_FecUltIn = T00064_n77U_FecUltIn[0] ;
         A93U_CCCode = T00064_A93U_CCCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93U_CCCode", A93U_CCCode);
         n93U_CCCode = T00064_n93U_CCCode[0] ;
         A94U_PrjCode = T00064_A94U_PrjCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94U_PrjCode", A94U_PrjCode);
         n94U_PrjCode = T00064_n94U_PrjCode[0] ;
         A85UVID_CONTROLCHU_Estado = T00064_A85UVID_CONTROLCHU_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A85UVID_CONTROLCHU_Estado", A85UVID_CONTROLCHU_Estado);
         n85UVID_CONTROLCHU_Estado = T00064_n85UVID_CONTROLCHU_Estado[0] ;
         A87U_TipResul = T00064_A87U_TipResul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87U_TipResul", A87U_TipResul);
         n87U_TipResul = T00064_n87U_TipResul[0] ;
         A66U_WhsDest = T00064_A66U_WhsDest[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66U_WhsDest", A66U_WhsDest);
         n66U_WhsDest = T00064_n66U_WhsDest[0] ;
         A95UVID_CONTROLCHU_Comment = T00064_A95UVID_CONTROLCHU_Comment[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95UVID_CONTROLCHU_Comment", A95UVID_CONTROLCHU_Comment);
         n95UVID_CONTROLCHU_Comment = T00064_n95UVID_CONTROLCHU_Comment[0] ;
         zm065( -6) ;
      }
      pr_fusquim_sap.close(2);
      onLoadActions065( ) ;
   }

   public void onLoadActions065( )
   {
   }

   public void checkExtendedTable065( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A76U_FecIngr) || (( A76U_FecIngr.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A76U_FecIngr, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo U_Fec Ingr fuera de rango", "OutOfRange", 1, "U_FECINGR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtU_FecIngr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A81U_FecIni) || (( A81U_FecIni.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A81U_FecIni, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo U_Fec Ini fuera de rango", "OutOfRange", 1, "U_FECINI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtU_FecIni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A82U_FecFin) || (( A82U_FecFin.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A82U_FecFin, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo U_Fec Fin fuera de rango", "OutOfRange", 1, "U_FECFIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtU_FecFin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A80U_FecContr) || (( A80U_FecContr.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A80U_FecContr, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo U_Fec Contr fuera de rango", "OutOfRange", 1, "U_FECCONTR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtU_FecContr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A77U_FecUltIn) || (( A77U_FecUltIn.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A77U_FecUltIn, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo U_Fec Ult In fuera de rango", "OutOfRange", 1, "U_FECULTIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtU_FecUltIn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors065( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey065( )
   {
      /* Using cursor T00065 */
      pr_fusquim_sap.execute(3, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(3) != 101) )
      {
         RcdFound5 = (short)(1) ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
      }
      pr_fusquim_sap.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00063 */
      pr_fusquim_sap.execute(1, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(1) != 101) )
      {
         zm065( 6) ;
         RcdFound5 = (short)(1) ;
         A43UVID_CONTROLCHDocEntry = T00063_A43UVID_CONTROLCHDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
         A65U_WhsCode = T00063_A65U_WhsCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65U_WhsCode", A65U_WhsCode);
         n65U_WhsCode = T00063_n65U_WhsCode[0] ;
         A63U_ItemCode = T00063_A63U_ItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63U_ItemCode", A63U_ItemCode);
         n63U_ItemCode = T00063_n63U_ItemCode[0] ;
         A70U_NoLote = T00063_A70U_NoLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70U_NoLote", A70U_NoLote);
         n70U_NoLote = T00063_n70U_NoLote[0] ;
         A73U_Cantidad = T00063_A73U_Cantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73U_Cantidad", GXutil.ltrim( GXutil.str( A73U_Cantidad, 18, 0)));
         n73U_Cantidad = T00063_n73U_Cantidad[0] ;
         A74U_Bultos = T00063_A74U_Bultos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74U_Bultos", GXutil.ltrim( GXutil.str( A74U_Bultos, 9, 0)));
         n74U_Bultos = T00063_n74U_Bultos[0] ;
         A75U_BultosMu = T00063_A75U_BultosMu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75U_BultosMu", GXutil.ltrim( GXutil.str( A75U_BultosMu, 9, 0)));
         n75U_BultosMu = T00063_n75U_BultosMu[0] ;
         A86U_Traslado = T00063_A86U_Traslado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A86U_Traslado", A86U_Traslado);
         n86U_Traslado = T00063_n86U_Traslado[0] ;
         A76U_FecIngr = T00063_A76U_FecIngr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76U_FecIngr", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
         n76U_FecIngr = T00063_n76U_FecIngr[0] ;
         A78U_UM = T00063_A78U_UM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78U_UM", A78U_UM);
         n78U_UM = T00063_n78U_UM[0] ;
         A81U_FecIni = T00063_A81U_FecIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81U_FecIni", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
         n81U_FecIni = T00063_n81U_FecIni[0] ;
         A82U_FecFin = T00063_A82U_FecFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82U_FecFin", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
         n82U_FecFin = T00063_n82U_FecFin[0] ;
         A104U_Reanalis = T00063_A104U_Reanalis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104U_Reanalis", A104U_Reanalis);
         n104U_Reanalis = T00063_n104U_Reanalis[0] ;
         A72U_CorrAnal = T00063_A72U_CorrAnal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A72U_CorrAnal", GXutil.ltrim( GXutil.str( A72U_CorrAnal, 9, 0)));
         n72U_CorrAnal = T00063_n72U_CorrAnal[0] ;
         A79U_NoDoc = T00063_A79U_NoDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79U_NoDoc", GXutil.ltrim( GXutil.str( A79U_NoDoc, 9, 0)));
         n79U_NoDoc = T00063_n79U_NoDoc[0] ;
         A80U_FecContr = T00063_A80U_FecContr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80U_FecContr", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
         n80U_FecContr = T00063_n80U_FecContr[0] ;
         A71U_CorrLote = T00063_A71U_CorrLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71U_CorrLote", GXutil.ltrim( GXutil.str( A71U_CorrLote, 9, 0)));
         n71U_CorrLote = T00063_n71U_CorrLote[0] ;
         A77U_FecUltIn = T00063_A77U_FecUltIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A77U_FecUltIn", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
         n77U_FecUltIn = T00063_n77U_FecUltIn[0] ;
         A93U_CCCode = T00063_A93U_CCCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93U_CCCode", A93U_CCCode);
         n93U_CCCode = T00063_n93U_CCCode[0] ;
         A94U_PrjCode = T00063_A94U_PrjCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94U_PrjCode", A94U_PrjCode);
         n94U_PrjCode = T00063_n94U_PrjCode[0] ;
         A85UVID_CONTROLCHU_Estado = T00063_A85UVID_CONTROLCHU_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A85UVID_CONTROLCHU_Estado", A85UVID_CONTROLCHU_Estado);
         n85UVID_CONTROLCHU_Estado = T00063_n85UVID_CONTROLCHU_Estado[0] ;
         A87U_TipResul = T00063_A87U_TipResul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87U_TipResul", A87U_TipResul);
         n87U_TipResul = T00063_n87U_TipResul[0] ;
         A66U_WhsDest = T00063_A66U_WhsDest[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66U_WhsDest", A66U_WhsDest);
         n66U_WhsDest = T00063_n66U_WhsDest[0] ;
         A95UVID_CONTROLCHU_Comment = T00063_A95UVID_CONTROLCHU_Comment[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95UVID_CONTROLCHU_Comment", A95UVID_CONTROLCHU_Comment);
         n95UVID_CONTROLCHU_Comment = T00063_n95UVID_CONTROLCHU_Comment[0] ;
         Z43UVID_CONTROLCHDocEntry = A43UVID_CONTROLCHDocEntry ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load065( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey065( ) ;
         }
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey065( ) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_fusquim_sap.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey065( ) ;
      if ( RcdFound5 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T00066 */
      pr_fusquim_sap.execute(4, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(4) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T00066_A43UVID_CONTROLCHDocEntry[0] < A43UVID_CONTROLCHDocEntry ) ) )
         {
            pr_fusquim_sap.readNext(4);
         }
         if ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T00066_A43UVID_CONTROLCHDocEntry[0] > A43UVID_CONTROLCHDocEntry ) ) )
         {
            A43UVID_CONTROLCHDocEntry = T00066_A43UVID_CONTROLCHDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(4);
   }

   public void move_previous( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T00067 */
      pr_fusquim_sap.execute(5, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(5) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T00067_A43UVID_CONTROLCHDocEntry[0] > A43UVID_CONTROLCHDocEntry ) ) )
         {
            pr_fusquim_sap.readNext(5);
         }
         if ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T00067_A43UVID_CONTROLCHDocEntry[0] < A43UVID_CONTROLCHDocEntry ) ) )
         {
            A43UVID_CONTROLCHDocEntry = T00067_A43UVID_CONTROLCHDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey065( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert065( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound5 == 1 )
         {
            if ( A43UVID_CONTROLCHDocEntry != Z43UVID_CONTROLCHDocEntry )
            {
               A43UVID_CONTROLCHDocEntry = Z43UVID_CONTROLCHDocEntry ;
               httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "UVID_CONTROLCHDOCENTRY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update065( ) ;
               GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A43UVID_CONTROLCHDocEntry != Z43UVID_CONTROLCHDocEntry )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert065( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "UVID_CONTROLCHDOCENTRY");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert065( ) ;
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
   }

   public void btn_delete( )
   {
      if ( A43UVID_CONTROLCHDocEntry != Z43UVID_CONTROLCHDocEntry )
      {
         A43UVID_CONTROLCHDocEntry = Z43UVID_CONTROLCHDocEntry ;
         httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "UVID_CONTROLCHDOCENTRY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "UVID_CONTROLCHDOCENTRY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtU_WhsCode_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart065( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtU_WhsCode_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd065( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_previous( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtU_WhsCode_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_next( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtU_WhsCode_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart065( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound5 != 0 )
         {
            scanNext065( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtU_WhsCode_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd065( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency065( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00062 */
         pr_fusquim_sap.execute(0, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
         if ( (pr_fusquim_sap.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_CONTROLCH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_fusquim_sap.getStatus(0) == 101) || ( GXutil.strcmp(Z65U_WhsCode, T00062_A65U_WhsCode[0]) != 0 ) || ( GXutil.strcmp(Z63U_ItemCode, T00062_A63U_ItemCode[0]) != 0 ) || ( GXutil.strcmp(Z70U_NoLote, T00062_A70U_NoLote[0]) != 0 ) || ( Z73U_Cantidad != T00062_A73U_Cantidad[0] ) || ( Z74U_Bultos != T00062_A74U_Bultos[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z75U_BultosMu != T00062_A75U_BultosMu[0] ) || ( GXutil.strcmp(Z86U_Traslado, T00062_A86U_Traslado[0]) != 0 ) || !( GXutil.dateCompare(Z76U_FecIngr, T00062_A76U_FecIngr[0]) ) || ( GXutil.strcmp(Z78U_UM, T00062_A78U_UM[0]) != 0 ) || !( GXutil.dateCompare(Z81U_FecIni, T00062_A81U_FecIni[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z82U_FecFin, T00062_A82U_FecFin[0]) ) || ( GXutil.strcmp(Z104U_Reanalis, T00062_A104U_Reanalis[0]) != 0 ) || ( Z72U_CorrAnal != T00062_A72U_CorrAnal[0] ) || ( Z79U_NoDoc != T00062_A79U_NoDoc[0] ) || !( GXutil.dateCompare(Z80U_FecContr, T00062_A80U_FecContr[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z71U_CorrLote != T00062_A71U_CorrLote[0] ) || !( GXutil.dateCompare(Z77U_FecUltIn, T00062_A77U_FecUltIn[0]) ) || ( GXutil.strcmp(Z93U_CCCode, T00062_A93U_CCCode[0]) != 0 ) || ( GXutil.strcmp(Z94U_PrjCode, T00062_A94U_PrjCode[0]) != 0 ) || ( GXutil.strcmp(Z85UVID_CONTROLCHU_Estado, T00062_A85UVID_CONTROLCHU_Estado[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z87U_TipResul, T00062_A87U_TipResul[0]) != 0 ) || ( GXutil.strcmp(Z66U_WhsDest, T00062_A66U_WhsDest[0]) != 0 ) || ( GXutil.strcmp(Z95UVID_CONTROLCHU_Comment, T00062_A95UVID_CONTROLCHU_Comment[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"@VID_CONTROLCH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert065( )
   {
      beforeValidate065( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable065( ) ;
      }
      if ( AnyError == 0 )
      {
         zm065( 0) ;
         checkOptimisticConcurrency065( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm065( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert065( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00068 */
                  pr_fusquim_sap.execute(6, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry), new Boolean(n65U_WhsCode), A65U_WhsCode, new Boolean(n63U_ItemCode), A63U_ItemCode, new Boolean(n70U_NoLote), A70U_NoLote, new Boolean(n73U_Cantidad), new Long(A73U_Cantidad), new Boolean(n74U_Bultos), new Integer(A74U_Bultos), new Boolean(n75U_BultosMu), new Integer(A75U_BultosMu), new Boolean(n86U_Traslado), A86U_Traslado, new Boolean(n76U_FecIngr), A76U_FecIngr, new Boolean(n78U_UM), A78U_UM, new Boolean(n81U_FecIni), A81U_FecIni, new Boolean(n82U_FecFin), A82U_FecFin, new Boolean(n104U_Reanalis), A104U_Reanalis, new Boolean(n72U_CorrAnal), new Integer(A72U_CorrAnal), new Boolean(n79U_NoDoc), new Integer(A79U_NoDoc), new Boolean(n80U_FecContr), A80U_FecContr, new Boolean(n71U_CorrLote), new Integer(A71U_CorrLote), new Boolean(n77U_FecUltIn), A77U_FecUltIn, new Boolean(n93U_CCCode), A93U_CCCode, new Boolean(n94U_PrjCode), A94U_PrjCode, new Boolean(n85UVID_CONTROLCHU_Estado), A85UVID_CONTROLCHU_Estado, new Boolean(n87U_TipResul), A87U_TipResul, new Boolean(n66U_WhsDest), A66U_WhsDest, new Boolean(n95UVID_CONTROLCHU_Comment), A95UVID_CONTROLCHU_Comment});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_CONTROLCH") ;
                  if ( (pr_fusquim_sap.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption060( ) ;
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
            load065( ) ;
         }
         endLevel065( ) ;
      }
      closeExtendedTableCursors065( ) ;
   }

   public void update065( )
   {
      beforeValidate065( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable065( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency065( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm065( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate065( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00069 */
                  pr_fusquim_sap.execute(7, new Object[] {new Boolean(n65U_WhsCode), A65U_WhsCode, new Boolean(n63U_ItemCode), A63U_ItemCode, new Boolean(n70U_NoLote), A70U_NoLote, new Boolean(n73U_Cantidad), new Long(A73U_Cantidad), new Boolean(n74U_Bultos), new Integer(A74U_Bultos), new Boolean(n75U_BultosMu), new Integer(A75U_BultosMu), new Boolean(n86U_Traslado), A86U_Traslado, new Boolean(n76U_FecIngr), A76U_FecIngr, new Boolean(n78U_UM), A78U_UM, new Boolean(n81U_FecIni), A81U_FecIni, new Boolean(n82U_FecFin), A82U_FecFin, new Boolean(n104U_Reanalis), A104U_Reanalis, new Boolean(n72U_CorrAnal), new Integer(A72U_CorrAnal), new Boolean(n79U_NoDoc), new Integer(A79U_NoDoc), new Boolean(n80U_FecContr), A80U_FecContr, new Boolean(n71U_CorrLote), new Integer(A71U_CorrLote), new Boolean(n77U_FecUltIn), A77U_FecUltIn, new Boolean(n93U_CCCode), A93U_CCCode, new Boolean(n94U_PrjCode), A94U_PrjCode, new Boolean(n85UVID_CONTROLCHU_Estado), A85UVID_CONTROLCHU_Estado, new Boolean(n87U_TipResul), A87U_TipResul, new Boolean(n66U_WhsDest), A66U_WhsDest, new Boolean(n95UVID_CONTROLCHU_Comment), A95UVID_CONTROLCHU_Comment, new Integer(A43UVID_CONTROLCHDocEntry)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_CONTROLCH") ;
                  if ( (pr_fusquim_sap.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_CONTROLCH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate065( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption060( ) ;
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
         endLevel065( ) ;
      }
      closeExtendedTableCursors065( ) ;
   }

   public void deferredUpdate065( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate065( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency065( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls065( ) ;
         afterConfirm065( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete065( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000610 */
               pr_fusquim_sap.execute(8, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_CONTROLCH") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound5 == 0 )
                     {
                        initAll065( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), "SuccessfullyDeleted", 0, "", true);
                     resetCaption060( ) ;
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
      sMode5 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel065( ) ;
      Gx_mode = sMode5 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls065( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel065( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_fusquim_sap.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete065( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "registroinspeccionh");
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "registroinspeccionh");
         if ( AnyError == 0 )
         {
            confirmValues060( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "registroinspeccionh");
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "registroinspeccionh");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart065( )
   {
      /* Scan By routine */
      /* Using cursor T000611 */
      pr_fusquim_sap.execute(9);
      RcdFound5 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A43UVID_CONTROLCHDocEntry = T000611_A43UVID_CONTROLCHDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext065( )
   {
      /* Scan next routine */
      pr_fusquim_sap.readNext(9);
      RcdFound5 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A43UVID_CONTROLCHDocEntry = T000611_A43UVID_CONTROLCHDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
      }
   }

   public void scanEnd065( )
   {
      pr_fusquim_sap.close(9);
   }

   public void afterConfirm065( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert065( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate065( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete065( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete065( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate065( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes065( )
   {
      edtUVID_CONTROLCHDocEntry_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCHDocEntry_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCHDocEntry_Enabled, 5, 0)), true);
      edtU_WhsCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_WhsCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_WhsCode_Enabled, 5, 0)), true);
      edtU_ItemCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_ItemCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_ItemCode_Enabled, 5, 0)), true);
      edtU_NoLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_NoLote_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_NoLote_Enabled, 5, 0)), true);
      edtU_Cantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Cantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Cantidad_Enabled, 5, 0)), true);
      edtU_Bultos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Bultos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Bultos_Enabled, 5, 0)), true);
      edtU_BultosMu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_BultosMu_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_BultosMu_Enabled, 5, 0)), true);
      edtU_Traslado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Traslado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Traslado_Enabled, 5, 0)), true);
      edtU_FecIngr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_FecIngr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_FecIngr_Enabled, 5, 0)), true);
      edtU_UM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_UM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_UM_Enabled, 5, 0)), true);
      edtU_FecIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_FecIni_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_FecIni_Enabled, 5, 0)), true);
      edtU_FecFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_FecFin_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_FecFin_Enabled, 5, 0)), true);
      edtU_Reanalis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Reanalis_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Reanalis_Enabled, 5, 0)), true);
      edtU_CorrAnal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CorrAnal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CorrAnal_Enabled, 5, 0)), true);
      edtU_NoDoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_NoDoc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_NoDoc_Enabled, 5, 0)), true);
      edtU_FecContr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_FecContr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_FecContr_Enabled, 5, 0)), true);
      edtU_CorrLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CorrLote_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CorrLote_Enabled, 5, 0)), true);
      edtU_FecUltIn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_FecUltIn_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_FecUltIn_Enabled, 5, 0)), true);
      edtU_CCCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CCCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CCCode_Enabled, 5, 0)), true);
      edtU_PrjCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_PrjCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_PrjCode_Enabled, 5, 0)), true);
      edtUVID_CONTROLCHU_Estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCHU_Estado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCHU_Estado_Enabled, 5, 0)), true);
      edtU_TipResul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_TipResul_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_TipResul_Enabled, 5, 0)), true);
      edtU_WhsDest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_WhsDest_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_WhsDest_Enabled, 5, 0)), true);
      edtUVID_CONTROLCHU_Comment_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCHU_Comment_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCHU_Comment_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues060( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20181121023467");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.registroinspeccionh") +"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z43UVID_CONTROLCHDocEntry", GXutil.ltrim( localUtil.ntoc( Z43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z65U_WhsCode", Z65U_WhsCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z63U_ItemCode", Z63U_ItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z70U_NoLote", Z70U_NoLote);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z73U_Cantidad", GXutil.ltrim( localUtil.ntoc( Z73U_Cantidad, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z74U_Bultos", GXutil.ltrim( localUtil.ntoc( Z74U_Bultos, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z75U_BultosMu", GXutil.ltrim( localUtil.ntoc( Z75U_BultosMu, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z86U_Traslado", GXutil.rtrim( Z86U_Traslado));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z76U_FecIngr", localUtil.ttoc( Z76U_FecIngr, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z78U_UM", Z78U_UM);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z81U_FecIni", localUtil.ttoc( Z81U_FecIni, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z82U_FecFin", localUtil.ttoc( Z82U_FecFin, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z104U_Reanalis", GXutil.rtrim( Z104U_Reanalis));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z72U_CorrAnal", GXutil.ltrim( localUtil.ntoc( Z72U_CorrAnal, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z79U_NoDoc", GXutil.ltrim( localUtil.ntoc( Z79U_NoDoc, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z80U_FecContr", localUtil.ttoc( Z80U_FecContr, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z71U_CorrLote", GXutil.ltrim( localUtil.ntoc( Z71U_CorrLote, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z77U_FecUltIn", localUtil.ttoc( Z77U_FecUltIn, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z93U_CCCode", Z93U_CCCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z94U_PrjCode", Z94U_PrjCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z85UVID_CONTROLCHU_Estado", GXutil.rtrim( Z85UVID_CONTROLCHU_Estado));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z87U_TipResul", Z87U_TipResul);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z66U_WhsDest", Z66U_WhsDest);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z95UVID_CONTROLCHU_Comment", Z95UVID_CONTROLCHU_Comment);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
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
      return formatLink("com.wms.registroinspeccionh")  ;
   }

   public String getPgmname( )
   {
      return "RegistroInspeccionH" ;
   }

   public String getPgmdesc( )
   {
      return "Registro Inspeccion H" ;
   }

   public void initializeNonKey065( )
   {
      A65U_WhsCode = "" ;
      n65U_WhsCode = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65U_WhsCode", A65U_WhsCode);
      n65U_WhsCode = ((GXutil.strcmp("", A65U_WhsCode)==0) ? true : false) ;
      A63U_ItemCode = "" ;
      n63U_ItemCode = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A63U_ItemCode", A63U_ItemCode);
      n63U_ItemCode = ((GXutil.strcmp("", A63U_ItemCode)==0) ? true : false) ;
      A70U_NoLote = "" ;
      n70U_NoLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A70U_NoLote", A70U_NoLote);
      n70U_NoLote = ((GXutil.strcmp("", A70U_NoLote)==0) ? true : false) ;
      A73U_Cantidad = 0 ;
      n73U_Cantidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A73U_Cantidad", GXutil.ltrim( GXutil.str( A73U_Cantidad, 18, 0)));
      n73U_Cantidad = ((0==A73U_Cantidad) ? true : false) ;
      A74U_Bultos = 0 ;
      n74U_Bultos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A74U_Bultos", GXutil.ltrim( GXutil.str( A74U_Bultos, 9, 0)));
      n74U_Bultos = ((0==A74U_Bultos) ? true : false) ;
      A75U_BultosMu = 0 ;
      n75U_BultosMu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A75U_BultosMu", GXutil.ltrim( GXutil.str( A75U_BultosMu, 9, 0)));
      n75U_BultosMu = ((0==A75U_BultosMu) ? true : false) ;
      A86U_Traslado = "" ;
      n86U_Traslado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A86U_Traslado", A86U_Traslado);
      n86U_Traslado = ((GXutil.strcmp("", A86U_Traslado)==0) ? true : false) ;
      A76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      n76U_FecIngr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A76U_FecIngr", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
      n76U_FecIngr = (GXutil.dateCompare(GXutil.nullDate(), A76U_FecIngr) ? true : false) ;
      A78U_UM = "" ;
      n78U_UM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A78U_UM", A78U_UM);
      n78U_UM = ((GXutil.strcmp("", A78U_UM)==0) ? true : false) ;
      A81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      n81U_FecIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A81U_FecIni", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
      n81U_FecIni = (GXutil.dateCompare(GXutil.nullDate(), A81U_FecIni) ? true : false) ;
      A82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      n82U_FecFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A82U_FecFin", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
      n82U_FecFin = (GXutil.dateCompare(GXutil.nullDate(), A82U_FecFin) ? true : false) ;
      A104U_Reanalis = "" ;
      n104U_Reanalis = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A104U_Reanalis", A104U_Reanalis);
      n104U_Reanalis = ((GXutil.strcmp("", A104U_Reanalis)==0) ? true : false) ;
      A72U_CorrAnal = 0 ;
      n72U_CorrAnal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A72U_CorrAnal", GXutil.ltrim( GXutil.str( A72U_CorrAnal, 9, 0)));
      n72U_CorrAnal = ((0==A72U_CorrAnal) ? true : false) ;
      A79U_NoDoc = 0 ;
      n79U_NoDoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A79U_NoDoc", GXutil.ltrim( GXutil.str( A79U_NoDoc, 9, 0)));
      n79U_NoDoc = ((0==A79U_NoDoc) ? true : false) ;
      A80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      n80U_FecContr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A80U_FecContr", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
      n80U_FecContr = (GXutil.dateCompare(GXutil.nullDate(), A80U_FecContr) ? true : false) ;
      A71U_CorrLote = 0 ;
      n71U_CorrLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A71U_CorrLote", GXutil.ltrim( GXutil.str( A71U_CorrLote, 9, 0)));
      n71U_CorrLote = ((0==A71U_CorrLote) ? true : false) ;
      A77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      n77U_FecUltIn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A77U_FecUltIn", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
      n77U_FecUltIn = (GXutil.dateCompare(GXutil.nullDate(), A77U_FecUltIn) ? true : false) ;
      A93U_CCCode = "" ;
      n93U_CCCode = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A93U_CCCode", A93U_CCCode);
      n93U_CCCode = ((GXutil.strcmp("", A93U_CCCode)==0) ? true : false) ;
      A94U_PrjCode = "" ;
      n94U_PrjCode = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A94U_PrjCode", A94U_PrjCode);
      n94U_PrjCode = ((GXutil.strcmp("", A94U_PrjCode)==0) ? true : false) ;
      A85UVID_CONTROLCHU_Estado = "" ;
      n85UVID_CONTROLCHU_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A85UVID_CONTROLCHU_Estado", A85UVID_CONTROLCHU_Estado);
      n85UVID_CONTROLCHU_Estado = ((GXutil.strcmp("", A85UVID_CONTROLCHU_Estado)==0) ? true : false) ;
      A87U_TipResul = "" ;
      n87U_TipResul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A87U_TipResul", A87U_TipResul);
      n87U_TipResul = ((GXutil.strcmp("", A87U_TipResul)==0) ? true : false) ;
      A66U_WhsDest = "" ;
      n66U_WhsDest = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A66U_WhsDest", A66U_WhsDest);
      n66U_WhsDest = ((GXutil.strcmp("", A66U_WhsDest)==0) ? true : false) ;
      A95UVID_CONTROLCHU_Comment = "" ;
      n95UVID_CONTROLCHU_Comment = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A95UVID_CONTROLCHU_Comment", A95UVID_CONTROLCHU_Comment);
      n95UVID_CONTROLCHU_Comment = ((GXutil.strcmp("", A95UVID_CONTROLCHU_Comment)==0) ? true : false) ;
      Z65U_WhsCode = "" ;
      Z63U_ItemCode = "" ;
      Z70U_NoLote = "" ;
      Z73U_Cantidad = 0 ;
      Z74U_Bultos = 0 ;
      Z75U_BultosMu = 0 ;
      Z86U_Traslado = "" ;
      Z76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      Z78U_UM = "" ;
      Z81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      Z82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      Z104U_Reanalis = "" ;
      Z72U_CorrAnal = 0 ;
      Z79U_NoDoc = 0 ;
      Z80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      Z71U_CorrLote = 0 ;
      Z77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      Z93U_CCCode = "" ;
      Z94U_PrjCode = "" ;
      Z85UVID_CONTROLCHU_Estado = "" ;
      Z87U_TipResul = "" ;
      Z66U_WhsDest = "" ;
      Z95UVID_CONTROLCHU_Comment = "" ;
   }

   public void initAll065( )
   {
      A43UVID_CONTROLCHDocEntry = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
      initializeNonKey065( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20181121023496");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("registroinspeccionh.js", "?20181121023496");
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
      edtUVID_CONTROLCHDocEntry_Internalname = "UVID_CONTROLCHDOCENTRY" ;
      edtU_WhsCode_Internalname = "U_WHSCODE" ;
      edtU_ItemCode_Internalname = "U_ITEMCODE" ;
      edtU_NoLote_Internalname = "U_NOLOTE" ;
      edtU_Cantidad_Internalname = "U_CANTIDAD" ;
      edtU_Bultos_Internalname = "U_BULTOS" ;
      edtU_BultosMu_Internalname = "U_BULTOSMU" ;
      edtU_Traslado_Internalname = "U_TRASLADO" ;
      edtU_FecIngr_Internalname = "U_FECINGR" ;
      edtU_UM_Internalname = "U_UM" ;
      edtU_FecIni_Internalname = "U_FECINI" ;
      edtU_FecFin_Internalname = "U_FECFIN" ;
      edtU_Reanalis_Internalname = "U_REANALIS" ;
      edtU_CorrAnal_Internalname = "U_CORRANAL" ;
      edtU_NoDoc_Internalname = "U_NODOC" ;
      edtU_FecContr_Internalname = "U_FECCONTR" ;
      edtU_CorrLote_Internalname = "U_CORRLOTE" ;
      edtU_FecUltIn_Internalname = "U_FECULTIN" ;
      edtU_CCCode_Internalname = "U_CCCODE" ;
      edtU_PrjCode_Internalname = "U_PRJCODE" ;
      edtUVID_CONTROLCHU_Estado_Internalname = "UVID_CONTROLCHU_ESTADO" ;
      edtU_TipResul_Internalname = "U_TIPRESUL" ;
      edtU_WhsDest_Internalname = "U_WHSDEST" ;
      edtUVID_CONTROLCHU_Comment_Internalname = "UVID_CONTROLCHU_COMMENT" ;
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
      Form.setCaption( "Registro Inspeccion H" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtUVID_CONTROLCHU_Comment_Enabled = 1 ;
      edtU_WhsDest_Jsonclick = "" ;
      edtU_WhsDest_Enabled = 1 ;
      edtU_TipResul_Jsonclick = "" ;
      edtU_TipResul_Enabled = 1 ;
      edtUVID_CONTROLCHU_Estado_Jsonclick = "" ;
      edtUVID_CONTROLCHU_Estado_Enabled = 1 ;
      edtU_PrjCode_Jsonclick = "" ;
      edtU_PrjCode_Enabled = 1 ;
      edtU_CCCode_Jsonclick = "" ;
      edtU_CCCode_Enabled = 1 ;
      edtU_FecUltIn_Jsonclick = "" ;
      edtU_FecUltIn_Enabled = 1 ;
      edtU_CorrLote_Jsonclick = "" ;
      edtU_CorrLote_Enabled = 1 ;
      edtU_FecContr_Jsonclick = "" ;
      edtU_FecContr_Enabled = 1 ;
      edtU_NoDoc_Jsonclick = "" ;
      edtU_NoDoc_Enabled = 1 ;
      edtU_CorrAnal_Jsonclick = "" ;
      edtU_CorrAnal_Enabled = 1 ;
      edtU_Reanalis_Jsonclick = "" ;
      edtU_Reanalis_Enabled = 1 ;
      edtU_FecFin_Jsonclick = "" ;
      edtU_FecFin_Enabled = 1 ;
      edtU_FecIni_Jsonclick = "" ;
      edtU_FecIni_Enabled = 1 ;
      edtU_UM_Jsonclick = "" ;
      edtU_UM_Enabled = 1 ;
      edtU_FecIngr_Jsonclick = "" ;
      edtU_FecIngr_Enabled = 1 ;
      edtU_Traslado_Jsonclick = "" ;
      edtU_Traslado_Enabled = 1 ;
      edtU_BultosMu_Jsonclick = "" ;
      edtU_BultosMu_Enabled = 1 ;
      edtU_Bultos_Jsonclick = "" ;
      edtU_Bultos_Enabled = 1 ;
      edtU_Cantidad_Jsonclick = "" ;
      edtU_Cantidad_Enabled = 1 ;
      edtU_NoLote_Jsonclick = "" ;
      edtU_NoLote_Enabled = 1 ;
      edtU_ItemCode_Jsonclick = "" ;
      edtU_ItemCode_Enabled = 1 ;
      edtU_WhsCode_Jsonclick = "" ;
      edtU_WhsCode_Enabled = 1 ;
      edtUVID_CONTROLCHDocEntry_Jsonclick = "" ;
      edtUVID_CONTROLCHDocEntry_Enabled = 1 ;
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

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtU_WhsCode_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Uvid_controlchdocentry( int GX_Parm1 ,
                                             String GX_Parm2 ,
                                             String GX_Parm3 ,
                                             String GX_Parm4 ,
                                             long GX_Parm5 ,
                                             int GX_Parm6 ,
                                             int GX_Parm7 ,
                                             String GX_Parm8 ,
                                             java.util.Date GX_Parm9 ,
                                             String GX_Parm10 ,
                                             java.util.Date GX_Parm11 ,
                                             java.util.Date GX_Parm12 ,
                                             String GX_Parm13 ,
                                             int GX_Parm14 ,
                                             int GX_Parm15 ,
                                             java.util.Date GX_Parm16 ,
                                             int GX_Parm17 ,
                                             java.util.Date GX_Parm18 ,
                                             String GX_Parm19 ,
                                             String GX_Parm20 ,
                                             String GX_Parm21 ,
                                             String GX_Parm22 ,
                                             String GX_Parm23 ,
                                             String GX_Parm24 )
   {
      A43UVID_CONTROLCHDocEntry = GX_Parm1 ;
      A65U_WhsCode = GX_Parm2 ;
      n65U_WhsCode = false ;
      A63U_ItemCode = GX_Parm3 ;
      n63U_ItemCode = false ;
      A70U_NoLote = GX_Parm4 ;
      n70U_NoLote = false ;
      A73U_Cantidad = GX_Parm5 ;
      n73U_Cantidad = false ;
      A74U_Bultos = GX_Parm6 ;
      n74U_Bultos = false ;
      A75U_BultosMu = GX_Parm7 ;
      n75U_BultosMu = false ;
      A86U_Traslado = GX_Parm8 ;
      n86U_Traslado = false ;
      A76U_FecIngr = GX_Parm9 ;
      n76U_FecIngr = false ;
      A78U_UM = GX_Parm10 ;
      n78U_UM = false ;
      A81U_FecIni = GX_Parm11 ;
      n81U_FecIni = false ;
      A82U_FecFin = GX_Parm12 ;
      n82U_FecFin = false ;
      A104U_Reanalis = GX_Parm13 ;
      n104U_Reanalis = false ;
      A72U_CorrAnal = GX_Parm14 ;
      n72U_CorrAnal = false ;
      A79U_NoDoc = GX_Parm15 ;
      n79U_NoDoc = false ;
      A80U_FecContr = GX_Parm16 ;
      n80U_FecContr = false ;
      A71U_CorrLote = GX_Parm17 ;
      n71U_CorrLote = false ;
      A77U_FecUltIn = GX_Parm18 ;
      n77U_FecUltIn = false ;
      A93U_CCCode = GX_Parm19 ;
      n93U_CCCode = false ;
      A94U_PrjCode = GX_Parm20 ;
      n94U_PrjCode = false ;
      A85UVID_CONTROLCHU_Estado = GX_Parm21 ;
      n85UVID_CONTROLCHU_Estado = false ;
      A87U_TipResul = GX_Parm22 ;
      n87U_TipResul = false ;
      A66U_WhsDest = GX_Parm23 ;
      n66U_WhsDest = false ;
      A95UVID_CONTROLCHU_Comment = GX_Parm24 ;
      n95UVID_CONTROLCHU_Comment = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A65U_WhsCode);
      isValidOutput.add(A63U_ItemCode);
      isValidOutput.add(A70U_NoLote);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A73U_Cantidad, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A74U_Bultos, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A75U_BultosMu, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A86U_Traslado));
      isValidOutput.add(localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(A78U_UM);
      isValidOutput.add(localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( A104U_Reanalis));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A72U_CorrAnal, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A71U_CorrLote, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(A93U_CCCode);
      isValidOutput.add(A94U_PrjCode);
      isValidOutput.add(GXutil.rtrim( A85UVID_CONTROLCHU_Estado));
      isValidOutput.add(A87U_TipResul);
      isValidOutput.add(A66U_WhsDest);
      isValidOutput.add(A95UVID_CONTROLCHU_Comment);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(Z65U_WhsCode);
      isValidOutput.add(Z63U_ItemCode);
      isValidOutput.add(Z70U_NoLote);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z73U_Cantidad, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z74U_Bultos, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z75U_BultosMu, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z86U_Traslado));
      isValidOutput.add(localUtil.ttoc( Z76U_FecIngr, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(Z78U_UM);
      isValidOutput.add(localUtil.ttoc( Z81U_FecIni, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(localUtil.ttoc( Z82U_FecFin, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z104U_Reanalis));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z72U_CorrAnal, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z79U_NoDoc, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(localUtil.ttoc( Z80U_FecContr, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z71U_CorrLote, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(localUtil.ttoc( Z77U_FecUltIn, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(Z93U_CCCode);
      isValidOutput.add(Z94U_PrjCode);
      isValidOutput.add(GXutil.rtrim( Z85UVID_CONTROLCHU_Estado));
      isValidOutput.add(Z87U_TipResul);
      isValidOutput.add(Z66U_WhsDest);
      isValidOutput.add(Z95UVID_CONTROLCHU_Comment);
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12062',iparms:[],oparms:[]}");
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
      Z65U_WhsCode = "" ;
      Z63U_ItemCode = "" ;
      Z70U_NoLote = "" ;
      Z86U_Traslado = "" ;
      Z76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      Z78U_UM = "" ;
      Z81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      Z82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      Z104U_Reanalis = "" ;
      Z80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      Z77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      Z93U_CCCode = "" ;
      Z94U_PrjCode = "" ;
      Z85UVID_CONTROLCHU_Estado = "" ;
      Z87U_TipResul = "" ;
      Z66U_WhsDest = "" ;
      Z95UVID_CONTROLCHU_Comment = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T00064_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00064_A65U_WhsCode = new String[] {""} ;
      T00064_n65U_WhsCode = new boolean[] {false} ;
      T00064_A63U_ItemCode = new String[] {""} ;
      T00064_n63U_ItemCode = new boolean[] {false} ;
      T00064_A70U_NoLote = new String[] {""} ;
      T00064_n70U_NoLote = new boolean[] {false} ;
      T00064_A73U_Cantidad = new long[1] ;
      T00064_n73U_Cantidad = new boolean[] {false} ;
      T00064_A74U_Bultos = new int[1] ;
      T00064_n74U_Bultos = new boolean[] {false} ;
      T00064_A75U_BultosMu = new int[1] ;
      T00064_n75U_BultosMu = new boolean[] {false} ;
      T00064_A86U_Traslado = new String[] {""} ;
      T00064_n86U_Traslado = new boolean[] {false} ;
      T00064_A76U_FecIngr = new java.util.Date[] {GXutil.nullDate()} ;
      T00064_n76U_FecIngr = new boolean[] {false} ;
      T00064_A78U_UM = new String[] {""} ;
      T00064_n78U_UM = new boolean[] {false} ;
      T00064_A81U_FecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00064_n81U_FecIni = new boolean[] {false} ;
      T00064_A82U_FecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T00064_n82U_FecFin = new boolean[] {false} ;
      T00064_A104U_Reanalis = new String[] {""} ;
      T00064_n104U_Reanalis = new boolean[] {false} ;
      T00064_A72U_CorrAnal = new int[1] ;
      T00064_n72U_CorrAnal = new boolean[] {false} ;
      T00064_A79U_NoDoc = new int[1] ;
      T00064_n79U_NoDoc = new boolean[] {false} ;
      T00064_A80U_FecContr = new java.util.Date[] {GXutil.nullDate()} ;
      T00064_n80U_FecContr = new boolean[] {false} ;
      T00064_A71U_CorrLote = new int[1] ;
      T00064_n71U_CorrLote = new boolean[] {false} ;
      T00064_A77U_FecUltIn = new java.util.Date[] {GXutil.nullDate()} ;
      T00064_n77U_FecUltIn = new boolean[] {false} ;
      T00064_A93U_CCCode = new String[] {""} ;
      T00064_n93U_CCCode = new boolean[] {false} ;
      T00064_A94U_PrjCode = new String[] {""} ;
      T00064_n94U_PrjCode = new boolean[] {false} ;
      T00064_A85UVID_CONTROLCHU_Estado = new String[] {""} ;
      T00064_n85UVID_CONTROLCHU_Estado = new boolean[] {false} ;
      T00064_A87U_TipResul = new String[] {""} ;
      T00064_n87U_TipResul = new boolean[] {false} ;
      T00064_A66U_WhsDest = new String[] {""} ;
      T00064_n66U_WhsDest = new boolean[] {false} ;
      T00064_A95UVID_CONTROLCHU_Comment = new String[] {""} ;
      T00064_n95UVID_CONTROLCHU_Comment = new boolean[] {false} ;
      T00065_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00063_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00063_A65U_WhsCode = new String[] {""} ;
      T00063_n65U_WhsCode = new boolean[] {false} ;
      T00063_A63U_ItemCode = new String[] {""} ;
      T00063_n63U_ItemCode = new boolean[] {false} ;
      T00063_A70U_NoLote = new String[] {""} ;
      T00063_n70U_NoLote = new boolean[] {false} ;
      T00063_A73U_Cantidad = new long[1] ;
      T00063_n73U_Cantidad = new boolean[] {false} ;
      T00063_A74U_Bultos = new int[1] ;
      T00063_n74U_Bultos = new boolean[] {false} ;
      T00063_A75U_BultosMu = new int[1] ;
      T00063_n75U_BultosMu = new boolean[] {false} ;
      T00063_A86U_Traslado = new String[] {""} ;
      T00063_n86U_Traslado = new boolean[] {false} ;
      T00063_A76U_FecIngr = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_n76U_FecIngr = new boolean[] {false} ;
      T00063_A78U_UM = new String[] {""} ;
      T00063_n78U_UM = new boolean[] {false} ;
      T00063_A81U_FecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_n81U_FecIni = new boolean[] {false} ;
      T00063_A82U_FecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_n82U_FecFin = new boolean[] {false} ;
      T00063_A104U_Reanalis = new String[] {""} ;
      T00063_n104U_Reanalis = new boolean[] {false} ;
      T00063_A72U_CorrAnal = new int[1] ;
      T00063_n72U_CorrAnal = new boolean[] {false} ;
      T00063_A79U_NoDoc = new int[1] ;
      T00063_n79U_NoDoc = new boolean[] {false} ;
      T00063_A80U_FecContr = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_n80U_FecContr = new boolean[] {false} ;
      T00063_A71U_CorrLote = new int[1] ;
      T00063_n71U_CorrLote = new boolean[] {false} ;
      T00063_A77U_FecUltIn = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_n77U_FecUltIn = new boolean[] {false} ;
      T00063_A93U_CCCode = new String[] {""} ;
      T00063_n93U_CCCode = new boolean[] {false} ;
      T00063_A94U_PrjCode = new String[] {""} ;
      T00063_n94U_PrjCode = new boolean[] {false} ;
      T00063_A85UVID_CONTROLCHU_Estado = new String[] {""} ;
      T00063_n85UVID_CONTROLCHU_Estado = new boolean[] {false} ;
      T00063_A87U_TipResul = new String[] {""} ;
      T00063_n87U_TipResul = new boolean[] {false} ;
      T00063_A66U_WhsDest = new String[] {""} ;
      T00063_n66U_WhsDest = new boolean[] {false} ;
      T00063_A95UVID_CONTROLCHU_Comment = new String[] {""} ;
      T00063_n95UVID_CONTROLCHU_Comment = new boolean[] {false} ;
      sMode5 = "" ;
      T00066_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00067_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00062_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00062_A65U_WhsCode = new String[] {""} ;
      T00062_n65U_WhsCode = new boolean[] {false} ;
      T00062_A63U_ItemCode = new String[] {""} ;
      T00062_n63U_ItemCode = new boolean[] {false} ;
      T00062_A70U_NoLote = new String[] {""} ;
      T00062_n70U_NoLote = new boolean[] {false} ;
      T00062_A73U_Cantidad = new long[1] ;
      T00062_n73U_Cantidad = new boolean[] {false} ;
      T00062_A74U_Bultos = new int[1] ;
      T00062_n74U_Bultos = new boolean[] {false} ;
      T00062_A75U_BultosMu = new int[1] ;
      T00062_n75U_BultosMu = new boolean[] {false} ;
      T00062_A86U_Traslado = new String[] {""} ;
      T00062_n86U_Traslado = new boolean[] {false} ;
      T00062_A76U_FecIngr = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_n76U_FecIngr = new boolean[] {false} ;
      T00062_A78U_UM = new String[] {""} ;
      T00062_n78U_UM = new boolean[] {false} ;
      T00062_A81U_FecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_n81U_FecIni = new boolean[] {false} ;
      T00062_A82U_FecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_n82U_FecFin = new boolean[] {false} ;
      T00062_A104U_Reanalis = new String[] {""} ;
      T00062_n104U_Reanalis = new boolean[] {false} ;
      T00062_A72U_CorrAnal = new int[1] ;
      T00062_n72U_CorrAnal = new boolean[] {false} ;
      T00062_A79U_NoDoc = new int[1] ;
      T00062_n79U_NoDoc = new boolean[] {false} ;
      T00062_A80U_FecContr = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_n80U_FecContr = new boolean[] {false} ;
      T00062_A71U_CorrLote = new int[1] ;
      T00062_n71U_CorrLote = new boolean[] {false} ;
      T00062_A77U_FecUltIn = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_n77U_FecUltIn = new boolean[] {false} ;
      T00062_A93U_CCCode = new String[] {""} ;
      T00062_n93U_CCCode = new boolean[] {false} ;
      T00062_A94U_PrjCode = new String[] {""} ;
      T00062_n94U_PrjCode = new boolean[] {false} ;
      T00062_A85UVID_CONTROLCHU_Estado = new String[] {""} ;
      T00062_n85UVID_CONTROLCHU_Estado = new boolean[] {false} ;
      T00062_A87U_TipResul = new String[] {""} ;
      T00062_n87U_TipResul = new boolean[] {false} ;
      T00062_A66U_WhsDest = new String[] {""} ;
      T00062_n66U_WhsDest = new boolean[] {false} ;
      T00062_A95UVID_CONTROLCHU_Comment = new String[] {""} ;
      T00062_n95UVID_CONTROLCHU_Comment = new boolean[] {false} ;
      T000611_A43UVID_CONTROLCHDocEntry = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.registroinspeccionh__fusquim_sap(),
         new Object[] {
             new Object[] {
            T00062_A43UVID_CONTROLCHDocEntry, T00062_A65U_WhsCode, T00062_n65U_WhsCode, T00062_A63U_ItemCode, T00062_n63U_ItemCode, T00062_A70U_NoLote, T00062_n70U_NoLote, T00062_A73U_Cantidad, T00062_n73U_Cantidad, T00062_A74U_Bultos,
            T00062_n74U_Bultos, T00062_A75U_BultosMu, T00062_n75U_BultosMu, T00062_A86U_Traslado, T00062_n86U_Traslado, T00062_A76U_FecIngr, T00062_n76U_FecIngr, T00062_A78U_UM, T00062_n78U_UM, T00062_A81U_FecIni,
            T00062_n81U_FecIni, T00062_A82U_FecFin, T00062_n82U_FecFin, T00062_A104U_Reanalis, T00062_n104U_Reanalis, T00062_A72U_CorrAnal, T00062_n72U_CorrAnal, T00062_A79U_NoDoc, T00062_n79U_NoDoc, T00062_A80U_FecContr,
            T00062_n80U_FecContr, T00062_A71U_CorrLote, T00062_n71U_CorrLote, T00062_A77U_FecUltIn, T00062_n77U_FecUltIn, T00062_A93U_CCCode, T00062_n93U_CCCode, T00062_A94U_PrjCode, T00062_n94U_PrjCode, T00062_A85UVID_CONTROLCHU_Estado,
            T00062_n85UVID_CONTROLCHU_Estado, T00062_A87U_TipResul, T00062_n87U_TipResul, T00062_A66U_WhsDest, T00062_n66U_WhsDest, T00062_A95UVID_CONTROLCHU_Comment, T00062_n95UVID_CONTROLCHU_Comment
            }
            , new Object[] {
            T00063_A43UVID_CONTROLCHDocEntry, T00063_A65U_WhsCode, T00063_n65U_WhsCode, T00063_A63U_ItemCode, T00063_n63U_ItemCode, T00063_A70U_NoLote, T00063_n70U_NoLote, T00063_A73U_Cantidad, T00063_n73U_Cantidad, T00063_A74U_Bultos,
            T00063_n74U_Bultos, T00063_A75U_BultosMu, T00063_n75U_BultosMu, T00063_A86U_Traslado, T00063_n86U_Traslado, T00063_A76U_FecIngr, T00063_n76U_FecIngr, T00063_A78U_UM, T00063_n78U_UM, T00063_A81U_FecIni,
            T00063_n81U_FecIni, T00063_A82U_FecFin, T00063_n82U_FecFin, T00063_A104U_Reanalis, T00063_n104U_Reanalis, T00063_A72U_CorrAnal, T00063_n72U_CorrAnal, T00063_A79U_NoDoc, T00063_n79U_NoDoc, T00063_A80U_FecContr,
            T00063_n80U_FecContr, T00063_A71U_CorrLote, T00063_n71U_CorrLote, T00063_A77U_FecUltIn, T00063_n77U_FecUltIn, T00063_A93U_CCCode, T00063_n93U_CCCode, T00063_A94U_PrjCode, T00063_n94U_PrjCode, T00063_A85UVID_CONTROLCHU_Estado,
            T00063_n85UVID_CONTROLCHU_Estado, T00063_A87U_TipResul, T00063_n87U_TipResul, T00063_A66U_WhsDest, T00063_n66U_WhsDest, T00063_A95UVID_CONTROLCHU_Comment, T00063_n95UVID_CONTROLCHU_Comment
            }
            , new Object[] {
            T00064_A43UVID_CONTROLCHDocEntry, T00064_A65U_WhsCode, T00064_n65U_WhsCode, T00064_A63U_ItemCode, T00064_n63U_ItemCode, T00064_A70U_NoLote, T00064_n70U_NoLote, T00064_A73U_Cantidad, T00064_n73U_Cantidad, T00064_A74U_Bultos,
            T00064_n74U_Bultos, T00064_A75U_BultosMu, T00064_n75U_BultosMu, T00064_A86U_Traslado, T00064_n86U_Traslado, T00064_A76U_FecIngr, T00064_n76U_FecIngr, T00064_A78U_UM, T00064_n78U_UM, T00064_A81U_FecIni,
            T00064_n81U_FecIni, T00064_A82U_FecFin, T00064_n82U_FecFin, T00064_A104U_Reanalis, T00064_n104U_Reanalis, T00064_A72U_CorrAnal, T00064_n72U_CorrAnal, T00064_A79U_NoDoc, T00064_n79U_NoDoc, T00064_A80U_FecContr,
            T00064_n80U_FecContr, T00064_A71U_CorrLote, T00064_n71U_CorrLote, T00064_A77U_FecUltIn, T00064_n77U_FecUltIn, T00064_A93U_CCCode, T00064_n93U_CCCode, T00064_A94U_PrjCode, T00064_n94U_PrjCode, T00064_A85UVID_CONTROLCHU_Estado,
            T00064_n85UVID_CONTROLCHU_Estado, T00064_A87U_TipResul, T00064_n87U_TipResul, T00064_A66U_WhsDest, T00064_n66U_WhsDest, T00064_A95UVID_CONTROLCHU_Comment, T00064_n95UVID_CONTROLCHU_Comment
            }
            , new Object[] {
            T00065_A43UVID_CONTROLCHDocEntry
            }
            , new Object[] {
            T00066_A43UVID_CONTROLCHDocEntry
            }
            , new Object[] {
            T00067_A43UVID_CONTROLCHDocEntry
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000611_A43UVID_CONTROLCHDocEntry
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.registroinspeccionh__default(),
         new Object[] {
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound5 ;
   private int Z43UVID_CONTROLCHDocEntry ;
   private int Z74U_Bultos ;
   private int Z75U_BultosMu ;
   private int Z72U_CorrAnal ;
   private int Z79U_NoDoc ;
   private int Z71U_CorrLote ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A43UVID_CONTROLCHDocEntry ;
   private int edtUVID_CONTROLCHDocEntry_Enabled ;
   private int edtU_WhsCode_Enabled ;
   private int edtU_ItemCode_Enabled ;
   private int edtU_NoLote_Enabled ;
   private int edtU_Cantidad_Enabled ;
   private int A74U_Bultos ;
   private int edtU_Bultos_Enabled ;
   private int A75U_BultosMu ;
   private int edtU_BultosMu_Enabled ;
   private int edtU_Traslado_Enabled ;
   private int edtU_FecIngr_Enabled ;
   private int edtU_UM_Enabled ;
   private int edtU_FecIni_Enabled ;
   private int edtU_FecFin_Enabled ;
   private int edtU_Reanalis_Enabled ;
   private int A72U_CorrAnal ;
   private int edtU_CorrAnal_Enabled ;
   private int A79U_NoDoc ;
   private int edtU_NoDoc_Enabled ;
   private int edtU_FecContr_Enabled ;
   private int A71U_CorrLote ;
   private int edtU_CorrLote_Enabled ;
   private int edtU_FecUltIn_Enabled ;
   private int edtU_CCCode_Enabled ;
   private int edtU_PrjCode_Enabled ;
   private int edtUVID_CONTROLCHU_Estado_Enabled ;
   private int edtU_TipResul_Enabled ;
   private int edtU_WhsDest_Enabled ;
   private int edtUVID_CONTROLCHU_Comment_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z73U_Cantidad ;
   private long A73U_Cantidad ;
   private String sPrefix ;
   private String Z86U_Traslado ;
   private String Z104U_Reanalis ;
   private String Z85UVID_CONTROLCHU_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtUVID_CONTROLCHDocEntry_Internalname ;
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
   private String A86U_Traslado ;
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
   private String A104U_Reanalis ;
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
   private String A85UVID_CONTROLCHU_Estado ;
   private String edtUVID_CONTROLCHU_Estado_Jsonclick ;
   private String edtU_TipResul_Internalname ;
   private String edtU_TipResul_Jsonclick ;
   private String edtU_WhsDest_Internalname ;
   private String edtU_WhsDest_Jsonclick ;
   private String edtUVID_CONTROLCHU_Comment_Internalname ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sMode5 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z76U_FecIngr ;
   private java.util.Date Z81U_FecIni ;
   private java.util.Date Z82U_FecFin ;
   private java.util.Date Z80U_FecContr ;
   private java.util.Date Z77U_FecUltIn ;
   private java.util.Date A76U_FecIngr ;
   private java.util.Date A81U_FecIni ;
   private java.util.Date A82U_FecFin ;
   private java.util.Date A80U_FecContr ;
   private java.util.Date A77U_FecUltIn ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n65U_WhsCode ;
   private boolean n63U_ItemCode ;
   private boolean n70U_NoLote ;
   private boolean n73U_Cantidad ;
   private boolean n74U_Bultos ;
   private boolean n75U_BultosMu ;
   private boolean n86U_Traslado ;
   private boolean n76U_FecIngr ;
   private boolean n78U_UM ;
   private boolean n81U_FecIni ;
   private boolean n82U_FecFin ;
   private boolean n104U_Reanalis ;
   private boolean n72U_CorrAnal ;
   private boolean n79U_NoDoc ;
   private boolean n80U_FecContr ;
   private boolean n71U_CorrLote ;
   private boolean n77U_FecUltIn ;
   private boolean n93U_CCCode ;
   private boolean n94U_PrjCode ;
   private boolean n85UVID_CONTROLCHU_Estado ;
   private boolean n87U_TipResul ;
   private boolean n66U_WhsDest ;
   private boolean n95UVID_CONTROLCHU_Comment ;
   private boolean Gx_longc ;
   private String Z65U_WhsCode ;
   private String Z63U_ItemCode ;
   private String Z70U_NoLote ;
   private String Z78U_UM ;
   private String Z93U_CCCode ;
   private String Z94U_PrjCode ;
   private String Z87U_TipResul ;
   private String Z66U_WhsDest ;
   private String Z95UVID_CONTROLCHU_Comment ;
   private String A65U_WhsCode ;
   private String A63U_ItemCode ;
   private String A70U_NoLote ;
   private String A78U_UM ;
   private String A93U_CCCode ;
   private String A94U_PrjCode ;
   private String A87U_TipResul ;
   private String A66U_WhsDest ;
   private String A95UVID_CONTROLCHU_Comment ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_fusquim_sap ;
   private int[] T00064_A43UVID_CONTROLCHDocEntry ;
   private String[] T00064_A65U_WhsCode ;
   private boolean[] T00064_n65U_WhsCode ;
   private String[] T00064_A63U_ItemCode ;
   private boolean[] T00064_n63U_ItemCode ;
   private String[] T00064_A70U_NoLote ;
   private boolean[] T00064_n70U_NoLote ;
   private long[] T00064_A73U_Cantidad ;
   private boolean[] T00064_n73U_Cantidad ;
   private int[] T00064_A74U_Bultos ;
   private boolean[] T00064_n74U_Bultos ;
   private int[] T00064_A75U_BultosMu ;
   private boolean[] T00064_n75U_BultosMu ;
   private String[] T00064_A86U_Traslado ;
   private boolean[] T00064_n86U_Traslado ;
   private java.util.Date[] T00064_A76U_FecIngr ;
   private boolean[] T00064_n76U_FecIngr ;
   private String[] T00064_A78U_UM ;
   private boolean[] T00064_n78U_UM ;
   private java.util.Date[] T00064_A81U_FecIni ;
   private boolean[] T00064_n81U_FecIni ;
   private java.util.Date[] T00064_A82U_FecFin ;
   private boolean[] T00064_n82U_FecFin ;
   private String[] T00064_A104U_Reanalis ;
   private boolean[] T00064_n104U_Reanalis ;
   private int[] T00064_A72U_CorrAnal ;
   private boolean[] T00064_n72U_CorrAnal ;
   private int[] T00064_A79U_NoDoc ;
   private boolean[] T00064_n79U_NoDoc ;
   private java.util.Date[] T00064_A80U_FecContr ;
   private boolean[] T00064_n80U_FecContr ;
   private int[] T00064_A71U_CorrLote ;
   private boolean[] T00064_n71U_CorrLote ;
   private java.util.Date[] T00064_A77U_FecUltIn ;
   private boolean[] T00064_n77U_FecUltIn ;
   private String[] T00064_A93U_CCCode ;
   private boolean[] T00064_n93U_CCCode ;
   private String[] T00064_A94U_PrjCode ;
   private boolean[] T00064_n94U_PrjCode ;
   private String[] T00064_A85UVID_CONTROLCHU_Estado ;
   private boolean[] T00064_n85UVID_CONTROLCHU_Estado ;
   private String[] T00064_A87U_TipResul ;
   private boolean[] T00064_n87U_TipResul ;
   private String[] T00064_A66U_WhsDest ;
   private boolean[] T00064_n66U_WhsDest ;
   private String[] T00064_A95UVID_CONTROLCHU_Comment ;
   private boolean[] T00064_n95UVID_CONTROLCHU_Comment ;
   private int[] T00065_A43UVID_CONTROLCHDocEntry ;
   private int[] T00063_A43UVID_CONTROLCHDocEntry ;
   private String[] T00063_A65U_WhsCode ;
   private boolean[] T00063_n65U_WhsCode ;
   private String[] T00063_A63U_ItemCode ;
   private boolean[] T00063_n63U_ItemCode ;
   private String[] T00063_A70U_NoLote ;
   private boolean[] T00063_n70U_NoLote ;
   private long[] T00063_A73U_Cantidad ;
   private boolean[] T00063_n73U_Cantidad ;
   private int[] T00063_A74U_Bultos ;
   private boolean[] T00063_n74U_Bultos ;
   private int[] T00063_A75U_BultosMu ;
   private boolean[] T00063_n75U_BultosMu ;
   private String[] T00063_A86U_Traslado ;
   private boolean[] T00063_n86U_Traslado ;
   private java.util.Date[] T00063_A76U_FecIngr ;
   private boolean[] T00063_n76U_FecIngr ;
   private String[] T00063_A78U_UM ;
   private boolean[] T00063_n78U_UM ;
   private java.util.Date[] T00063_A81U_FecIni ;
   private boolean[] T00063_n81U_FecIni ;
   private java.util.Date[] T00063_A82U_FecFin ;
   private boolean[] T00063_n82U_FecFin ;
   private String[] T00063_A104U_Reanalis ;
   private boolean[] T00063_n104U_Reanalis ;
   private int[] T00063_A72U_CorrAnal ;
   private boolean[] T00063_n72U_CorrAnal ;
   private int[] T00063_A79U_NoDoc ;
   private boolean[] T00063_n79U_NoDoc ;
   private java.util.Date[] T00063_A80U_FecContr ;
   private boolean[] T00063_n80U_FecContr ;
   private int[] T00063_A71U_CorrLote ;
   private boolean[] T00063_n71U_CorrLote ;
   private java.util.Date[] T00063_A77U_FecUltIn ;
   private boolean[] T00063_n77U_FecUltIn ;
   private String[] T00063_A93U_CCCode ;
   private boolean[] T00063_n93U_CCCode ;
   private String[] T00063_A94U_PrjCode ;
   private boolean[] T00063_n94U_PrjCode ;
   private String[] T00063_A85UVID_CONTROLCHU_Estado ;
   private boolean[] T00063_n85UVID_CONTROLCHU_Estado ;
   private String[] T00063_A87U_TipResul ;
   private boolean[] T00063_n87U_TipResul ;
   private String[] T00063_A66U_WhsDest ;
   private boolean[] T00063_n66U_WhsDest ;
   private String[] T00063_A95UVID_CONTROLCHU_Comment ;
   private boolean[] T00063_n95UVID_CONTROLCHU_Comment ;
   private int[] T00066_A43UVID_CONTROLCHDocEntry ;
   private int[] T00067_A43UVID_CONTROLCHDocEntry ;
   private int[] T00062_A43UVID_CONTROLCHDocEntry ;
   private String[] T00062_A65U_WhsCode ;
   private boolean[] T00062_n65U_WhsCode ;
   private String[] T00062_A63U_ItemCode ;
   private boolean[] T00062_n63U_ItemCode ;
   private String[] T00062_A70U_NoLote ;
   private boolean[] T00062_n70U_NoLote ;
   private long[] T00062_A73U_Cantidad ;
   private boolean[] T00062_n73U_Cantidad ;
   private int[] T00062_A74U_Bultos ;
   private boolean[] T00062_n74U_Bultos ;
   private int[] T00062_A75U_BultosMu ;
   private boolean[] T00062_n75U_BultosMu ;
   private String[] T00062_A86U_Traslado ;
   private boolean[] T00062_n86U_Traslado ;
   private java.util.Date[] T00062_A76U_FecIngr ;
   private boolean[] T00062_n76U_FecIngr ;
   private String[] T00062_A78U_UM ;
   private boolean[] T00062_n78U_UM ;
   private java.util.Date[] T00062_A81U_FecIni ;
   private boolean[] T00062_n81U_FecIni ;
   private java.util.Date[] T00062_A82U_FecFin ;
   private boolean[] T00062_n82U_FecFin ;
   private String[] T00062_A104U_Reanalis ;
   private boolean[] T00062_n104U_Reanalis ;
   private int[] T00062_A72U_CorrAnal ;
   private boolean[] T00062_n72U_CorrAnal ;
   private int[] T00062_A79U_NoDoc ;
   private boolean[] T00062_n79U_NoDoc ;
   private java.util.Date[] T00062_A80U_FecContr ;
   private boolean[] T00062_n80U_FecContr ;
   private int[] T00062_A71U_CorrLote ;
   private boolean[] T00062_n71U_CorrLote ;
   private java.util.Date[] T00062_A77U_FecUltIn ;
   private boolean[] T00062_n77U_FecUltIn ;
   private String[] T00062_A93U_CCCode ;
   private boolean[] T00062_n93U_CCCode ;
   private String[] T00062_A94U_PrjCode ;
   private boolean[] T00062_n94U_PrjCode ;
   private String[] T00062_A85UVID_CONTROLCHU_Estado ;
   private boolean[] T00062_n85UVID_CONTROLCHU_Estado ;
   private String[] T00062_A87U_TipResul ;
   private boolean[] T00062_n87U_TipResul ;
   private String[] T00062_A66U_WhsDest ;
   private boolean[] T00062_n66U_WhsDest ;
   private String[] T00062_A95UVID_CONTROLCHU_Comment ;
   private boolean[] T00062_n95UVID_CONTROLCHU_Comment ;
   private IDataStoreProvider pr_default ;
   private int[] T000611_A43UVID_CONTROLCHDocEntry ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class registroinspeccionh__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00062", "SELECT [DocEntry], [U_WhsCode], [U_ItemCode], [U_NoLote], [U_Cantidad], [U_Bultos], [U_BultosMu], [U_Traslado], [U_FecIngr], [U_UM], [U_FecIni], [U_FecFin], [U_Reanalis], [U_CorrAnal], [U_NoDoc], [U_FecContr], [U_CorrLote], [U_FecUltIn], [U_CCCode], [U_PrjCode], [U_Estado], [U_TipResul], [U_WhsDest], [U_Comment] FROM dbo.[@VID_CONTROLCH] WITH (UPDLOCK) WHERE [DocEntry] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00063", "SELECT [DocEntry], [U_WhsCode], [U_ItemCode], [U_NoLote], [U_Cantidad], [U_Bultos], [U_BultosMu], [U_Traslado], [U_FecIngr], [U_UM], [U_FecIni], [U_FecFin], [U_Reanalis], [U_CorrAnal], [U_NoDoc], [U_FecContr], [U_CorrLote], [U_FecUltIn], [U_CCCode], [U_PrjCode], [U_Estado], [U_TipResul], [U_WhsDest], [U_Comment] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) WHERE [DocEntry] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00064", "SELECT TM1.[DocEntry], TM1.[U_WhsCode], TM1.[U_ItemCode], TM1.[U_NoLote], TM1.[U_Cantidad], TM1.[U_Bultos], TM1.[U_BultosMu], TM1.[U_Traslado], TM1.[U_FecIngr], TM1.[U_UM], TM1.[U_FecIni], TM1.[U_FecFin], TM1.[U_Reanalis], TM1.[U_CorrAnal], TM1.[U_NoDoc], TM1.[U_FecContr], TM1.[U_CorrLote], TM1.[U_FecUltIn], TM1.[U_CCCode], TM1.[U_PrjCode], TM1.[U_Estado], TM1.[U_TipResul], TM1.[U_WhsDest], TM1.[U_Comment] FROM dbo.[@VID_CONTROLCH] TM1 WITH (NOLOCK) WHERE TM1.[DocEntry] = ? ORDER BY TM1.[DocEntry]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00065", "SELECT [DocEntry] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) WHERE [DocEntry] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00066", "SELECT TOP 1 [DocEntry] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) WHERE ( [DocEntry] > ?) ORDER BY [DocEntry]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00067", "SELECT TOP 1 [DocEntry] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) WHERE ( [DocEntry] < ?) ORDER BY [DocEntry] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00068", "INSERT INTO dbo.[@VID_CONTROLCH]([DocEntry], [U_WhsCode], [U_ItemCode], [U_NoLote], [U_Cantidad], [U_Bultos], [U_BultosMu], [U_Traslado], [U_FecIngr], [U_UM], [U_FecIni], [U_FecFin], [U_Reanalis], [U_CorrAnal], [U_NoDoc], [U_FecContr], [U_CorrLote], [U_FecUltIn], [U_CCCode], [U_PrjCode], [U_Estado], [U_TipResul], [U_WhsDest], [U_Comment], [DocNum], [Period], [Instance], [Series], [Handwrtten], [Canceled], [Object], [LogInst], [UserSign], [Transfered], [Status], [CreateDate], [CreateTime], [UpdateDate], [UpdateTime], [DataSource], [RequestStatus], [Creator], [Remark], [U_ItemName], [U_NumTras], [U_NumCon], [U_NumMusd], [U_Usuario], [U_DocOrig], [U_ContraMu], [U_CoMuSize], [U_MuestDes], [U_MuDeSize], [U_CtaCalid], [U_AtrQ1], [U_AtrQ2], [U_AtrQ3], [U_AtrQ4], [U_AtrT1], [U_AtrT2], [U_AtrT3], [U_AtrT4], [U_NroOF]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, convert(int, 0), convert(int, 0), convert(int, 0), convert(int, 0), '', '', '', convert(int, 0), convert(int, 0), '', '', convert( DATETIME, '17530101', 112 ), convert(int, 0), convert( DATETIME, '17530101', 112 ), convert(int, 0), '', '', '', '', '', '', '', '', '', convert(int, 0), '', convert(int, 0), '', convert(int, 0), '', convert(int, 0), convert(int, 0), convert(int, 0), convert(int, 0), '', '', '', '', convert(int, 0))", GX_NOMASK)
         ,new UpdateCursor("T00069", "UPDATE dbo.[@VID_CONTROLCH] SET [U_WhsCode]=?, [U_ItemCode]=?, [U_NoLote]=?, [U_Cantidad]=?, [U_Bultos]=?, [U_BultosMu]=?, [U_Traslado]=?, [U_FecIngr]=?, [U_UM]=?, [U_FecIni]=?, [U_FecFin]=?, [U_Reanalis]=?, [U_CorrAnal]=?, [U_NoDoc]=?, [U_FecContr]=?, [U_CorrLote]=?, [U_FecUltIn]=?, [U_CCCode]=?, [U_PrjCode]=?, [U_Estado]=?, [U_TipResul]=?, [U_WhsDest]=?, [U_Comment]=?  WHERE [DocEntry] = ?", GX_NOMASK)
         ,new UpdateCursor("T000610", "DELETE FROM dbo.[@VID_CONTROLCH]  WHERE [DocEntry] = ?", GX_NOMASK)
         ,new ForEachCursor("T000611", "SELECT [DocEntry] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) ORDER BY [DocEntry]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
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
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 1) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 1) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 1) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 8);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 20);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 32);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(5, ((Number) parms[8]).longValue(), 0);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[16], false);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 15);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[22], false);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[30], false);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[32]).intValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[34], false);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 8);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 8);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[42], 8);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[44], 8);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[46], 254);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 32);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(4, ((Number) parms[7]).longValue(), 0);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 15);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[29], false);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[31]).intValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 8);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 8);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 8);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 8);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 254);
               }
               stmt.setInt(24, ((Number) parms[46]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

final  class registroinspeccionh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

}

