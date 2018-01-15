/*
               File: registroinspecciond_impl
        Description: Registro Inspeccion D
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:53.51
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

public final  class registroinspecciond_impl extends GXDataArea
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
         Form.getMeta().addItem("description", "Registro Inspeccion D", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public registroinspecciond_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public registroinspecciond_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registroinspecciond_impl.class ));
   }

   public registroinspecciond_impl( int remoteHandle ,
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
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Registro Inspeccion D", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.wms.gx0080"+"',["+"{Ctrl:gx.dom.el('"+"UVID_CONTROLCDDOCENTRY"+"'), id:'"+"UVID_CONTROLCDDOCENTRY"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"LINEID"+"'), id:'"+"LINEID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCDDocEntry_Internalname, "Doc Entry", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCDDocEntry_Internalname, GXutil.ltrim( localUtil.ntoc( A41UVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtUVID_CONTROLCDDocEntry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A41UVID_CONTROLCDDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A41UVID_CONTROLCDDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCDDocEntry_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_CONTROLCDDocEntry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtLineId_Internalname, "Line Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtLineId_Internalname, GXutil.ltrim( localUtil.ntoc( A42LineId, (byte)(9), (byte)(0), ",", "")), ((edtLineId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A42LineId), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A42LineId), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLineId_Jsonclick, 0, "Attribute", "", "", "", 1, edtLineId_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtVisOrder_Internalname, "Vis Order", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtVisOrder_Internalname, GXutil.ltrim( localUtil.ntoc( A106VisOrder, (byte)(9), (byte)(0), ",", "")), ((edtVisOrder_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A106VisOrder), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A106VisOrder), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVisOrder_Jsonclick, 0, "Attribute", "", "", "", 1, edtVisOrder_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCDObject_Internalname, "Object", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCDObject_Internalname, A107UVID_CONTROLCDObject, GXutil.rtrim( localUtil.format( A107UVID_CONTROLCDObject, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCDObject_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_CONTROLCDObject_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCDLogInst_Internalname, "Log Inst", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCDLogInst_Internalname, GXutil.ltrim( localUtil.ntoc( A108UVID_CONTROLCDLogInst, (byte)(9), (byte)(0), ",", "")), ((edtUVID_CONTROLCDLogInst_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A108UVID_CONTROLCDLogInst), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A108UVID_CONTROLCDLogInst), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCDLogInst_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_CONTROLCDLogInst_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CodAtr_Internalname, "U_Cod Atr", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CodAtr_Internalname, A109U_CodAtr, GXutil.rtrim( localUtil.format( A109U_CodAtr, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CodAtr_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CodAtr_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_NameAtr_Internalname, "U_Name Atr", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NameAtr_Internalname, A110U_NameAtr, GXutil.rtrim( localUtil.format( A110U_NameAtr, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NameAtr_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_NameAtr_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Cualitat_Internalname, "U_Cualitat", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Cualitat_Internalname, GXutil.rtrim( A111U_Cualitat), GXutil.rtrim( localUtil.format( A111U_Cualitat, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Cualitat_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Cualitat_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Critico_Internalname, "U_Critico", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Critico_Internalname, GXutil.rtrim( A112U_Critico), GXutil.rtrim( localUtil.format( A112U_Critico, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Critico_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Critico_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_TipoMues_Internalname, "U_Tipo Mues", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_TipoMues_Internalname, A113U_TipoMues, GXutil.rtrim( localUtil.format( A113U_TipoMues, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_TipoMues_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_TipoMues_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Rango_Internalname, "U_Rango", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Rango_Internalname, A114U_Rango, GXutil.rtrim( localUtil.format( A114U_Rango, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Rango_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Rango_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_TipoDef_Internalname, "U_Tipo Def", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_TipoDef_Internalname, GXutil.rtrim( A115U_TipoDef), GXutil.rtrim( localUtil.format( A115U_TipoDef, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_TipoDef_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_TipoDef_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_AQL_Internalname, "U_AQL", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_AQL_Internalname, A116U_AQL, GXutil.rtrim( localUtil.format( A116U_AQL, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_AQL_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_AQL_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_TiempoDu_Internalname, "U_Tiempo Du", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_TiempoDu_Internalname, GXutil.ltrim( localUtil.ntoc( A117U_TiempoDu, (byte)(18), (byte)(0), ",", "")), ((edtU_TiempoDu_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A117U_TiempoDu), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A117U_TiempoDu), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_TiempoDu_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_TiempoDu_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_StandAtr_Internalname, "U_Stand Atr", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_StandAtr_Internalname, GXutil.ltrim( localUtil.ntoc( A118U_StandAtr, (byte)(18), (byte)(0), ",", "")), ((edtU_StandAtr_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A118U_StandAtr), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A118U_StandAtr), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_StandAtr_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_StandAtr_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Minimo_Internalname, "U_Minimo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Minimo_Internalname, GXutil.ltrim( localUtil.ntoc( A119U_Minimo, (byte)(18), (byte)(0), ",", "")), ((edtU_Minimo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119U_Minimo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A119U_Minimo), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Minimo_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Minimo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Maximo_Internalname, "U_Maximo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Maximo_Internalname, GXutil.ltrim( localUtil.ntoc( A120U_Maximo, (byte)(18), (byte)(0), ",", "")), ((edtU_Maximo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A120U_Maximo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A120U_Maximo), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Maximo_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Maximo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Medicion_Internalname, "U_Medicion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Medicion_Internalname, GXutil.ltrim( localUtil.ntoc( A121U_Medicion, (byte)(18), (byte)(0), ",", "")), ((edtU_Medicion_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A121U_Medicion), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A121U_Medicion), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Medicion_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Medicion_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CodEquip_Internalname, "U_Cod Equip", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CodEquip_Internalname, A122U_CodEquip, GXutil.rtrim( localUtil.format( A122U_CodEquip, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CodEquip_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CodEquip_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCDU_Comment_Internalname, "U_Comment", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtUVID_CONTROLCDU_Comment_Internalname, A123UVID_CONTROLCDU_Comment, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", (short)(0), 1, edtUVID_CONTROLCDU_Comment_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Comment2_Internalname, "U_Comment2", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtU_Comment2_Internalname, A124U_Comment2, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", (short)(0), 1, edtU_Comment2_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_RegistroInspeccionD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCDU_Estado_Internalname, "U_Estado", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCDU_Estado_Internalname, GXutil.rtrim( A125UVID_CONTROLCDU_Estado), GXutil.rtrim( localUtil.format( A125UVID_CONTROLCDU_Estado, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCDU_Estado_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_CONTROLCDU_Estado_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccionD.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccionD.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCDDocEntry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCDDocEntry_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_CONTROLCDDOCENTRY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A41UVID_CONTROLCDDocEntry = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
            }
            else
            {
               A41UVID_CONTROLCDDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCDDocEntry_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLineId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLineId_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LINEID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLineId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A42LineId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
            }
            else
            {
               A42LineId = (int)(localUtil.ctol( httpContext.cgiGet( edtLineId_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVisOrder_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVisOrder_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VISORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVisOrder_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A106VisOrder = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A106VisOrder", GXutil.ltrim( GXutil.str( A106VisOrder, 9, 0)));
            }
            else
            {
               A106VisOrder = (int)(localUtil.ctol( httpContext.cgiGet( edtVisOrder_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A106VisOrder", GXutil.ltrim( GXutil.str( A106VisOrder, 9, 0)));
            }
            A107UVID_CONTROLCDObject = httpContext.cgiGet( edtUVID_CONTROLCDObject_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A107UVID_CONTROLCDObject", A107UVID_CONTROLCDObject);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCDLogInst_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCDLogInst_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_CONTROLCDLOGINST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_CONTROLCDLogInst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A108UVID_CONTROLCDLogInst = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A108UVID_CONTROLCDLogInst", GXutil.ltrim( GXutil.str( A108UVID_CONTROLCDLogInst, 9, 0)));
            }
            else
            {
               A108UVID_CONTROLCDLogInst = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCDLogInst_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A108UVID_CONTROLCDLogInst", GXutil.ltrim( GXutil.str( A108UVID_CONTROLCDLogInst, 9, 0)));
            }
            A109U_CodAtr = httpContext.cgiGet( edtU_CodAtr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A109U_CodAtr", A109U_CodAtr);
            A110U_NameAtr = httpContext.cgiGet( edtU_NameAtr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A110U_NameAtr", A110U_NameAtr);
            A111U_Cualitat = httpContext.cgiGet( edtU_Cualitat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A111U_Cualitat", A111U_Cualitat);
            A112U_Critico = httpContext.cgiGet( edtU_Critico_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A112U_Critico", A112U_Critico);
            A113U_TipoMues = httpContext.cgiGet( edtU_TipoMues_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A113U_TipoMues", A113U_TipoMues);
            A114U_Rango = httpContext.cgiGet( edtU_Rango_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A114U_Rango", A114U_Rango);
            A115U_TipoDef = httpContext.cgiGet( edtU_TipoDef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A115U_TipoDef", A115U_TipoDef);
            A116U_AQL = httpContext.cgiGet( edtU_AQL_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A116U_AQL", A116U_AQL);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_TiempoDu_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_TiempoDu_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_TIEMPODU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_TiempoDu_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A117U_TiempoDu = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A117U_TiempoDu", GXutil.ltrim( GXutil.str( A117U_TiempoDu, 18, 0)));
            }
            else
            {
               A117U_TiempoDu = localUtil.ctol( httpContext.cgiGet( edtU_TiempoDu_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A117U_TiempoDu", GXutil.ltrim( GXutil.str( A117U_TiempoDu, 18, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_StandAtr_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_StandAtr_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_STANDATR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_StandAtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A118U_StandAtr = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A118U_StandAtr", GXutil.ltrim( GXutil.str( A118U_StandAtr, 18, 0)));
            }
            else
            {
               A118U_StandAtr = localUtil.ctol( httpContext.cgiGet( edtU_StandAtr_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A118U_StandAtr", GXutil.ltrim( GXutil.str( A118U_StandAtr, 18, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_Minimo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_Minimo_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_MINIMO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_Minimo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A119U_Minimo = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A119U_Minimo", GXutil.ltrim( GXutil.str( A119U_Minimo, 18, 0)));
            }
            else
            {
               A119U_Minimo = localUtil.ctol( httpContext.cgiGet( edtU_Minimo_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A119U_Minimo", GXutil.ltrim( GXutil.str( A119U_Minimo, 18, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_Maximo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_Maximo_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_MAXIMO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_Maximo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A120U_Maximo = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A120U_Maximo", GXutil.ltrim( GXutil.str( A120U_Maximo, 18, 0)));
            }
            else
            {
               A120U_Maximo = localUtil.ctol( httpContext.cgiGet( edtU_Maximo_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A120U_Maximo", GXutil.ltrim( GXutil.str( A120U_Maximo, 18, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_Medicion_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_Medicion_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_MEDICION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_Medicion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A121U_Medicion = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A121U_Medicion", GXutil.ltrim( GXutil.str( A121U_Medicion, 18, 0)));
            }
            else
            {
               A121U_Medicion = localUtil.ctol( httpContext.cgiGet( edtU_Medicion_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A121U_Medicion", GXutil.ltrim( GXutil.str( A121U_Medicion, 18, 0)));
            }
            A122U_CodEquip = httpContext.cgiGet( edtU_CodEquip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A122U_CodEquip", A122U_CodEquip);
            A123UVID_CONTROLCDU_Comment = httpContext.cgiGet( edtUVID_CONTROLCDU_Comment_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A123UVID_CONTROLCDU_Comment", A123UVID_CONTROLCDU_Comment);
            A124U_Comment2 = httpContext.cgiGet( edtU_Comment2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A124U_Comment2", A124U_Comment2);
            A125UVID_CONTROLCDU_Estado = httpContext.cgiGet( edtUVID_CONTROLCDU_Estado_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A125UVID_CONTROLCDU_Estado", A125UVID_CONTROLCDU_Estado);
            /* Read saved values. */
            Z41UVID_CONTROLCDDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( "Z41UVID_CONTROLCDDocEntry"), ",", ".")) ;
            Z42LineId = (int)(localUtil.ctol( httpContext.cgiGet( "Z42LineId"), ",", ".")) ;
            Z106VisOrder = (int)(localUtil.ctol( httpContext.cgiGet( "Z106VisOrder"), ",", ".")) ;
            Z107UVID_CONTROLCDObject = httpContext.cgiGet( "Z107UVID_CONTROLCDObject") ;
            Z108UVID_CONTROLCDLogInst = (int)(localUtil.ctol( httpContext.cgiGet( "Z108UVID_CONTROLCDLogInst"), ",", ".")) ;
            Z109U_CodAtr = httpContext.cgiGet( "Z109U_CodAtr") ;
            Z110U_NameAtr = httpContext.cgiGet( "Z110U_NameAtr") ;
            Z111U_Cualitat = httpContext.cgiGet( "Z111U_Cualitat") ;
            Z112U_Critico = httpContext.cgiGet( "Z112U_Critico") ;
            Z113U_TipoMues = httpContext.cgiGet( "Z113U_TipoMues") ;
            Z114U_Rango = httpContext.cgiGet( "Z114U_Rango") ;
            Z115U_TipoDef = httpContext.cgiGet( "Z115U_TipoDef") ;
            Z116U_AQL = httpContext.cgiGet( "Z116U_AQL") ;
            Z117U_TiempoDu = localUtil.ctol( httpContext.cgiGet( "Z117U_TiempoDu"), ",", ".") ;
            Z118U_StandAtr = localUtil.ctol( httpContext.cgiGet( "Z118U_StandAtr"), ",", ".") ;
            Z119U_Minimo = localUtil.ctol( httpContext.cgiGet( "Z119U_Minimo"), ",", ".") ;
            Z120U_Maximo = localUtil.ctol( httpContext.cgiGet( "Z120U_Maximo"), ",", ".") ;
            Z121U_Medicion = localUtil.ctol( httpContext.cgiGet( "Z121U_Medicion"), ",", ".") ;
            Z122U_CodEquip = httpContext.cgiGet( "Z122U_CodEquip") ;
            Z123UVID_CONTROLCDU_Comment = httpContext.cgiGet( "Z123UVID_CONTROLCDU_Comment") ;
            Z124U_Comment2 = httpContext.cgiGet( "Z124U_Comment2") ;
            Z125UVID_CONTROLCDU_Estado = httpContext.cgiGet( "Z125UVID_CONTROLCDU_Estado") ;
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
               A41UVID_CONTROLCDDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
               A42LineId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll078( ) ;
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
      disableAttributes078( ) ;
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

   public void resetCaption070( )
   {
   }

   public void zm078( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z106VisOrder = T00073_A106VisOrder[0] ;
            Z107UVID_CONTROLCDObject = T00073_A107UVID_CONTROLCDObject[0] ;
            Z108UVID_CONTROLCDLogInst = T00073_A108UVID_CONTROLCDLogInst[0] ;
            Z109U_CodAtr = T00073_A109U_CodAtr[0] ;
            Z110U_NameAtr = T00073_A110U_NameAtr[0] ;
            Z111U_Cualitat = T00073_A111U_Cualitat[0] ;
            Z112U_Critico = T00073_A112U_Critico[0] ;
            Z113U_TipoMues = T00073_A113U_TipoMues[0] ;
            Z114U_Rango = T00073_A114U_Rango[0] ;
            Z115U_TipoDef = T00073_A115U_TipoDef[0] ;
            Z116U_AQL = T00073_A116U_AQL[0] ;
            Z117U_TiempoDu = T00073_A117U_TiempoDu[0] ;
            Z118U_StandAtr = T00073_A118U_StandAtr[0] ;
            Z119U_Minimo = T00073_A119U_Minimo[0] ;
            Z120U_Maximo = T00073_A120U_Maximo[0] ;
            Z121U_Medicion = T00073_A121U_Medicion[0] ;
            Z122U_CodEquip = T00073_A122U_CodEquip[0] ;
            Z123UVID_CONTROLCDU_Comment = T00073_A123UVID_CONTROLCDU_Comment[0] ;
            Z124U_Comment2 = T00073_A124U_Comment2[0] ;
            Z125UVID_CONTROLCDU_Estado = T00073_A125UVID_CONTROLCDU_Estado[0] ;
         }
         else
         {
            Z106VisOrder = A106VisOrder ;
            Z107UVID_CONTROLCDObject = A107UVID_CONTROLCDObject ;
            Z108UVID_CONTROLCDLogInst = A108UVID_CONTROLCDLogInst ;
            Z109U_CodAtr = A109U_CodAtr ;
            Z110U_NameAtr = A110U_NameAtr ;
            Z111U_Cualitat = A111U_Cualitat ;
            Z112U_Critico = A112U_Critico ;
            Z113U_TipoMues = A113U_TipoMues ;
            Z114U_Rango = A114U_Rango ;
            Z115U_TipoDef = A115U_TipoDef ;
            Z116U_AQL = A116U_AQL ;
            Z117U_TiempoDu = A117U_TiempoDu ;
            Z118U_StandAtr = A118U_StandAtr ;
            Z119U_Minimo = A119U_Minimo ;
            Z120U_Maximo = A120U_Maximo ;
            Z121U_Medicion = A121U_Medicion ;
            Z122U_CodEquip = A122U_CodEquip ;
            Z123UVID_CONTROLCDU_Comment = A123UVID_CONTROLCDU_Comment ;
            Z124U_Comment2 = A124U_Comment2 ;
            Z125UVID_CONTROLCDU_Estado = A125UVID_CONTROLCDU_Estado ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z41UVID_CONTROLCDDocEntry = A41UVID_CONTROLCDDocEntry ;
         Z42LineId = A42LineId ;
         Z106VisOrder = A106VisOrder ;
         Z107UVID_CONTROLCDObject = A107UVID_CONTROLCDObject ;
         Z108UVID_CONTROLCDLogInst = A108UVID_CONTROLCDLogInst ;
         Z109U_CodAtr = A109U_CodAtr ;
         Z110U_NameAtr = A110U_NameAtr ;
         Z111U_Cualitat = A111U_Cualitat ;
         Z112U_Critico = A112U_Critico ;
         Z113U_TipoMues = A113U_TipoMues ;
         Z114U_Rango = A114U_Rango ;
         Z115U_TipoDef = A115U_TipoDef ;
         Z116U_AQL = A116U_AQL ;
         Z117U_TiempoDu = A117U_TiempoDu ;
         Z118U_StandAtr = A118U_StandAtr ;
         Z119U_Minimo = A119U_Minimo ;
         Z120U_Maximo = A120U_Maximo ;
         Z121U_Medicion = A121U_Medicion ;
         Z122U_CodEquip = A122U_CodEquip ;
         Z123UVID_CONTROLCDU_Comment = A123UVID_CONTROLCDU_Comment ;
         Z124U_Comment2 = A124U_Comment2 ;
         Z125UVID_CONTROLCDU_Estado = A125UVID_CONTROLCDU_Estado ;
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

   public void load078( )
   {
      /* Using cursor T00074 */
      pr_fusquim_sap.execute(2, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
      if ( (pr_fusquim_sap.getStatus(2) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A106VisOrder = T00074_A106VisOrder[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106VisOrder", GXutil.ltrim( GXutil.str( A106VisOrder, 9, 0)));
         A107UVID_CONTROLCDObject = T00074_A107UVID_CONTROLCDObject[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107UVID_CONTROLCDObject", A107UVID_CONTROLCDObject);
         A108UVID_CONTROLCDLogInst = T00074_A108UVID_CONTROLCDLogInst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108UVID_CONTROLCDLogInst", GXutil.ltrim( GXutil.str( A108UVID_CONTROLCDLogInst, 9, 0)));
         A109U_CodAtr = T00074_A109U_CodAtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109U_CodAtr", A109U_CodAtr);
         A110U_NameAtr = T00074_A110U_NameAtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110U_NameAtr", A110U_NameAtr);
         A111U_Cualitat = T00074_A111U_Cualitat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111U_Cualitat", A111U_Cualitat);
         A112U_Critico = T00074_A112U_Critico[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112U_Critico", A112U_Critico);
         A113U_TipoMues = T00074_A113U_TipoMues[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113U_TipoMues", A113U_TipoMues);
         A114U_Rango = T00074_A114U_Rango[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114U_Rango", A114U_Rango);
         A115U_TipoDef = T00074_A115U_TipoDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115U_TipoDef", A115U_TipoDef);
         A116U_AQL = T00074_A116U_AQL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116U_AQL", A116U_AQL);
         A117U_TiempoDu = T00074_A117U_TiempoDu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117U_TiempoDu", GXutil.ltrim( GXutil.str( A117U_TiempoDu, 18, 0)));
         A118U_StandAtr = T00074_A118U_StandAtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118U_StandAtr", GXutil.ltrim( GXutil.str( A118U_StandAtr, 18, 0)));
         A119U_Minimo = T00074_A119U_Minimo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119U_Minimo", GXutil.ltrim( GXutil.str( A119U_Minimo, 18, 0)));
         A120U_Maximo = T00074_A120U_Maximo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120U_Maximo", GXutil.ltrim( GXutil.str( A120U_Maximo, 18, 0)));
         A121U_Medicion = T00074_A121U_Medicion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121U_Medicion", GXutil.ltrim( GXutil.str( A121U_Medicion, 18, 0)));
         A122U_CodEquip = T00074_A122U_CodEquip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122U_CodEquip", A122U_CodEquip);
         A123UVID_CONTROLCDU_Comment = T00074_A123UVID_CONTROLCDU_Comment[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A123UVID_CONTROLCDU_Comment", A123UVID_CONTROLCDU_Comment);
         A124U_Comment2 = T00074_A124U_Comment2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124U_Comment2", A124U_Comment2);
         A125UVID_CONTROLCDU_Estado = T00074_A125UVID_CONTROLCDU_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125UVID_CONTROLCDU_Estado", A125UVID_CONTROLCDU_Estado);
         zm078( -1) ;
      }
      pr_fusquim_sap.close(2);
      onLoadActions078( ) ;
   }

   public void onLoadActions078( )
   {
   }

   public void checkExtendedTable078( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors078( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey078( )
   {
      /* Using cursor T00075 */
      pr_fusquim_sap.execute(3, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
      if ( (pr_fusquim_sap.getStatus(3) != 101) )
      {
         RcdFound8 = (short)(1) ;
      }
      else
      {
         RcdFound8 = (short)(0) ;
      }
      pr_fusquim_sap.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00073 */
      pr_fusquim_sap.execute(1, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
      if ( (pr_fusquim_sap.getStatus(1) != 101) )
      {
         zm078( 1) ;
         RcdFound8 = (short)(1) ;
         A41UVID_CONTROLCDDocEntry = T00073_A41UVID_CONTROLCDDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
         A42LineId = T00073_A42LineId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
         A106VisOrder = T00073_A106VisOrder[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106VisOrder", GXutil.ltrim( GXutil.str( A106VisOrder, 9, 0)));
         A107UVID_CONTROLCDObject = T00073_A107UVID_CONTROLCDObject[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107UVID_CONTROLCDObject", A107UVID_CONTROLCDObject);
         A108UVID_CONTROLCDLogInst = T00073_A108UVID_CONTROLCDLogInst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108UVID_CONTROLCDLogInst", GXutil.ltrim( GXutil.str( A108UVID_CONTROLCDLogInst, 9, 0)));
         A109U_CodAtr = T00073_A109U_CodAtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109U_CodAtr", A109U_CodAtr);
         A110U_NameAtr = T00073_A110U_NameAtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110U_NameAtr", A110U_NameAtr);
         A111U_Cualitat = T00073_A111U_Cualitat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111U_Cualitat", A111U_Cualitat);
         A112U_Critico = T00073_A112U_Critico[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112U_Critico", A112U_Critico);
         A113U_TipoMues = T00073_A113U_TipoMues[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113U_TipoMues", A113U_TipoMues);
         A114U_Rango = T00073_A114U_Rango[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114U_Rango", A114U_Rango);
         A115U_TipoDef = T00073_A115U_TipoDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115U_TipoDef", A115U_TipoDef);
         A116U_AQL = T00073_A116U_AQL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116U_AQL", A116U_AQL);
         A117U_TiempoDu = T00073_A117U_TiempoDu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117U_TiempoDu", GXutil.ltrim( GXutil.str( A117U_TiempoDu, 18, 0)));
         A118U_StandAtr = T00073_A118U_StandAtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118U_StandAtr", GXutil.ltrim( GXutil.str( A118U_StandAtr, 18, 0)));
         A119U_Minimo = T00073_A119U_Minimo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119U_Minimo", GXutil.ltrim( GXutil.str( A119U_Minimo, 18, 0)));
         A120U_Maximo = T00073_A120U_Maximo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120U_Maximo", GXutil.ltrim( GXutil.str( A120U_Maximo, 18, 0)));
         A121U_Medicion = T00073_A121U_Medicion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121U_Medicion", GXutil.ltrim( GXutil.str( A121U_Medicion, 18, 0)));
         A122U_CodEquip = T00073_A122U_CodEquip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122U_CodEquip", A122U_CodEquip);
         A123UVID_CONTROLCDU_Comment = T00073_A123UVID_CONTROLCDU_Comment[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A123UVID_CONTROLCDU_Comment", A123UVID_CONTROLCDU_Comment);
         A124U_Comment2 = T00073_A124U_Comment2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124U_Comment2", A124U_Comment2);
         A125UVID_CONTROLCDU_Estado = T00073_A125UVID_CONTROLCDU_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125UVID_CONTROLCDU_Estado", A125UVID_CONTROLCDU_Estado);
         Z41UVID_CONTROLCDDocEntry = A41UVID_CONTROLCDDocEntry ;
         Z42LineId = A42LineId ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load078( ) ;
         if ( AnyError == 1 )
         {
            RcdFound8 = (short)(0) ;
            initializeNonKey078( ) ;
         }
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound8 = (short)(0) ;
         initializeNonKey078( ) ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_fusquim_sap.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey078( ) ;
      if ( RcdFound8 == 0 )
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
      RcdFound8 = (short)(0) ;
      /* Using cursor T00076 */
      pr_fusquim_sap.execute(4, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
      if ( (pr_fusquim_sap.getStatus(4) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T00076_A41UVID_CONTROLCDDocEntry[0] < A41UVID_CONTROLCDDocEntry ) || ( T00076_A41UVID_CONTROLCDDocEntry[0] == A41UVID_CONTROLCDDocEntry ) && ( T00076_A42LineId[0] < A42LineId ) ) )
         {
            pr_fusquim_sap.readNext(4);
         }
         if ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T00076_A41UVID_CONTROLCDDocEntry[0] > A41UVID_CONTROLCDDocEntry ) || ( T00076_A41UVID_CONTROLCDDocEntry[0] == A41UVID_CONTROLCDDocEntry ) && ( T00076_A42LineId[0] > A42LineId ) ) )
         {
            A41UVID_CONTROLCDDocEntry = T00076_A41UVID_CONTROLCDDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
            A42LineId = T00076_A42LineId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
            RcdFound8 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(4);
   }

   public void move_previous( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T00077 */
      pr_fusquim_sap.execute(5, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
      if ( (pr_fusquim_sap.getStatus(5) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T00077_A41UVID_CONTROLCDDocEntry[0] > A41UVID_CONTROLCDDocEntry ) || ( T00077_A41UVID_CONTROLCDDocEntry[0] == A41UVID_CONTROLCDDocEntry ) && ( T00077_A42LineId[0] > A42LineId ) ) )
         {
            pr_fusquim_sap.readNext(5);
         }
         if ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T00077_A41UVID_CONTROLCDDocEntry[0] < A41UVID_CONTROLCDDocEntry ) || ( T00077_A41UVID_CONTROLCDDocEntry[0] == A41UVID_CONTROLCDDocEntry ) && ( T00077_A42LineId[0] < A42LineId ) ) )
         {
            A41UVID_CONTROLCDDocEntry = T00077_A41UVID_CONTROLCDDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
            A42LineId = T00077_A42LineId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
            RcdFound8 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey078( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert078( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound8 == 1 )
         {
            if ( ( A41UVID_CONTROLCDDocEntry != Z41UVID_CONTROLCDDocEntry ) || ( A42LineId != Z42LineId ) )
            {
               A41UVID_CONTROLCDDocEntry = Z41UVID_CONTROLCDDocEntry ;
               httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
               A42LineId = Z42LineId ;
               httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "UVID_CONTROLCDDOCENTRY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update078( ) ;
               GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A41UVID_CONTROLCDDocEntry != Z41UVID_CONTROLCDDocEntry ) || ( A42LineId != Z42LineId ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert078( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "UVID_CONTROLCDDOCENTRY");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert078( ) ;
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
      if ( ( A41UVID_CONTROLCDDocEntry != Z41UVID_CONTROLCDDocEntry ) || ( A42LineId != Z42LineId ) )
      {
         A41UVID_CONTROLCDDocEntry = Z41UVID_CONTROLCDDocEntry ;
         httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
         A42LineId = Z42LineId ;
         httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "UVID_CONTROLCDDOCENTRY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
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
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "UVID_CONTROLCDDOCENTRY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUVID_CONTROLCDDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVisOrder_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart078( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVisOrder_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd078( ) ;
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
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVisOrder_Internalname ;
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
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVisOrder_Internalname ;
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
      scanStart078( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound8 != 0 )
         {
            scanNext078( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVisOrder_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd078( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency078( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00072 */
         pr_fusquim_sap.execute(0, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
         if ( (pr_fusquim_sap.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_CONTROLCD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_fusquim_sap.getStatus(0) == 101) || ( Z106VisOrder != T00072_A106VisOrder[0] ) || ( GXutil.strcmp(Z107UVID_CONTROLCDObject, T00072_A107UVID_CONTROLCDObject[0]) != 0 ) || ( Z108UVID_CONTROLCDLogInst != T00072_A108UVID_CONTROLCDLogInst[0] ) || ( GXutil.strcmp(Z109U_CodAtr, T00072_A109U_CodAtr[0]) != 0 ) || ( GXutil.strcmp(Z110U_NameAtr, T00072_A110U_NameAtr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z111U_Cualitat, T00072_A111U_Cualitat[0]) != 0 ) || ( GXutil.strcmp(Z112U_Critico, T00072_A112U_Critico[0]) != 0 ) || ( GXutil.strcmp(Z113U_TipoMues, T00072_A113U_TipoMues[0]) != 0 ) || ( GXutil.strcmp(Z114U_Rango, T00072_A114U_Rango[0]) != 0 ) || ( GXutil.strcmp(Z115U_TipoDef, T00072_A115U_TipoDef[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z116U_AQL, T00072_A116U_AQL[0]) != 0 ) || ( Z117U_TiempoDu != T00072_A117U_TiempoDu[0] ) || ( Z118U_StandAtr != T00072_A118U_StandAtr[0] ) || ( Z119U_Minimo != T00072_A119U_Minimo[0] ) || ( Z120U_Maximo != T00072_A120U_Maximo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z121U_Medicion != T00072_A121U_Medicion[0] ) || ( GXutil.strcmp(Z122U_CodEquip, T00072_A122U_CodEquip[0]) != 0 ) || ( GXutil.strcmp(Z123UVID_CONTROLCDU_Comment, T00072_A123UVID_CONTROLCDU_Comment[0]) != 0 ) || ( GXutil.strcmp(Z124U_Comment2, T00072_A124U_Comment2[0]) != 0 ) || ( GXutil.strcmp(Z125UVID_CONTROLCDU_Estado, T00072_A125UVID_CONTROLCDU_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"@VID_CONTROLCD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert078( )
   {
      beforeValidate078( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable078( ) ;
      }
      if ( AnyError == 0 )
      {
         zm078( 0) ;
         checkOptimisticConcurrency078( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm078( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert078( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00078 */
                  pr_fusquim_sap.execute(6, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId), new Integer(A106VisOrder), A107UVID_CONTROLCDObject, new Integer(A108UVID_CONTROLCDLogInst), A109U_CodAtr, A110U_NameAtr, A111U_Cualitat, A112U_Critico, A113U_TipoMues, A114U_Rango, A115U_TipoDef, A116U_AQL, new Long(A117U_TiempoDu), new Long(A118U_StandAtr), new Long(A119U_Minimo), new Long(A120U_Maximo), new Long(A121U_Medicion), A122U_CodEquip, A123UVID_CONTROLCDU_Comment, A124U_Comment2, A125UVID_CONTROLCDU_Estado});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_CONTROLCD") ;
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
                        resetCaption070( ) ;
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
            load078( ) ;
         }
         endLevel078( ) ;
      }
      closeExtendedTableCursors078( ) ;
   }

   public void update078( )
   {
      beforeValidate078( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable078( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency078( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm078( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate078( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00079 */
                  pr_fusquim_sap.execute(7, new Object[] {new Integer(A106VisOrder), A107UVID_CONTROLCDObject, new Integer(A108UVID_CONTROLCDLogInst), A109U_CodAtr, A110U_NameAtr, A111U_Cualitat, A112U_Critico, A113U_TipoMues, A114U_Rango, A115U_TipoDef, A116U_AQL, new Long(A117U_TiempoDu), new Long(A118U_StandAtr), new Long(A119U_Minimo), new Long(A120U_Maximo), new Long(A121U_Medicion), A122U_CodEquip, A123UVID_CONTROLCDU_Comment, A124U_Comment2, A125UVID_CONTROLCDU_Estado, new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_CONTROLCD") ;
                  if ( (pr_fusquim_sap.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_CONTROLCD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate078( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption070( ) ;
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
         endLevel078( ) ;
      }
      closeExtendedTableCursors078( ) ;
   }

   public void deferredUpdate078( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate078( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency078( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls078( ) ;
         afterConfirm078( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete078( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000710 */
               pr_fusquim_sap.execute(8, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_CONTROLCD") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound8 == 0 )
                     {
                        initAll078( ) ;
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
                     resetCaption070( ) ;
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
      sMode8 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel078( ) ;
      Gx_mode = sMode8 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls078( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel078( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_fusquim_sap.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete078( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "registroinspecciond");
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "registroinspecciond");
         if ( AnyError == 0 )
         {
            confirmValues070( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "registroinspecciond");
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "registroinspecciond");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart078( )
   {
      /* Using cursor T000711 */
      pr_fusquim_sap.execute(9);
      RcdFound8 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A41UVID_CONTROLCDDocEntry = T000711_A41UVID_CONTROLCDDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
         A42LineId = T000711_A42LineId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext078( )
   {
      /* Scan next routine */
      pr_fusquim_sap.readNext(9);
      RcdFound8 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A41UVID_CONTROLCDDocEntry = T000711_A41UVID_CONTROLCDDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
         A42LineId = T000711_A42LineId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
      }
   }

   public void scanEnd078( )
   {
      pr_fusquim_sap.close(9);
   }

   public void afterConfirm078( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert078( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate078( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete078( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete078( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate078( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes078( )
   {
      edtUVID_CONTROLCDDocEntry_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCDDocEntry_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCDDocEntry_Enabled, 5, 0)), true);
      edtLineId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLineId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtLineId_Enabled, 5, 0)), true);
      edtVisOrder_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVisOrder_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtVisOrder_Enabled, 5, 0)), true);
      edtUVID_CONTROLCDObject_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCDObject_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCDObject_Enabled, 5, 0)), true);
      edtUVID_CONTROLCDLogInst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCDLogInst_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCDLogInst_Enabled, 5, 0)), true);
      edtU_CodAtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CodAtr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CodAtr_Enabled, 5, 0)), true);
      edtU_NameAtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_NameAtr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_NameAtr_Enabled, 5, 0)), true);
      edtU_Cualitat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Cualitat_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Cualitat_Enabled, 5, 0)), true);
      edtU_Critico_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Critico_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Critico_Enabled, 5, 0)), true);
      edtU_TipoMues_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_TipoMues_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_TipoMues_Enabled, 5, 0)), true);
      edtU_Rango_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Rango_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Rango_Enabled, 5, 0)), true);
      edtU_TipoDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_TipoDef_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_TipoDef_Enabled, 5, 0)), true);
      edtU_AQL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_AQL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_AQL_Enabled, 5, 0)), true);
      edtU_TiempoDu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_TiempoDu_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_TiempoDu_Enabled, 5, 0)), true);
      edtU_StandAtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_StandAtr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_StandAtr_Enabled, 5, 0)), true);
      edtU_Minimo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Minimo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Minimo_Enabled, 5, 0)), true);
      edtU_Maximo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Maximo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Maximo_Enabled, 5, 0)), true);
      edtU_Medicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Medicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Medicion_Enabled, 5, 0)), true);
      edtU_CodEquip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CodEquip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CodEquip_Enabled, 5, 0)), true);
      edtUVID_CONTROLCDU_Comment_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCDU_Comment_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCDU_Comment_Enabled, 5, 0)), true);
      edtU_Comment2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Comment2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Comment2_Enabled, 5, 0)), true);
      edtUVID_CONTROLCDU_Estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCDU_Estado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCDU_Estado_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues070( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210225828");
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
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.registroinspecciond") +"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z41UVID_CONTROLCDDocEntry", GXutil.ltrim( localUtil.ntoc( Z41UVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z42LineId", GXutil.ltrim( localUtil.ntoc( Z42LineId, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z106VisOrder", GXutil.ltrim( localUtil.ntoc( Z106VisOrder, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z107UVID_CONTROLCDObject", Z107UVID_CONTROLCDObject);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z108UVID_CONTROLCDLogInst", GXutil.ltrim( localUtil.ntoc( Z108UVID_CONTROLCDLogInst, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z109U_CodAtr", Z109U_CodAtr);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z110U_NameAtr", Z110U_NameAtr);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z111U_Cualitat", GXutil.rtrim( Z111U_Cualitat));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z112U_Critico", GXutil.rtrim( Z112U_Critico));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z113U_TipoMues", Z113U_TipoMues);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z114U_Rango", Z114U_Rango);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z115U_TipoDef", GXutil.rtrim( Z115U_TipoDef));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z116U_AQL", Z116U_AQL);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z117U_TiempoDu", GXutil.ltrim( localUtil.ntoc( Z117U_TiempoDu, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z118U_StandAtr", GXutil.ltrim( localUtil.ntoc( Z118U_StandAtr, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z119U_Minimo", GXutil.ltrim( localUtil.ntoc( Z119U_Minimo, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z120U_Maximo", GXutil.ltrim( localUtil.ntoc( Z120U_Maximo, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z121U_Medicion", GXutil.ltrim( localUtil.ntoc( Z121U_Medicion, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z122U_CodEquip", Z122U_CodEquip);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z123UVID_CONTROLCDU_Comment", Z123UVID_CONTROLCDU_Comment);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z124U_Comment2", Z124U_Comment2);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z125UVID_CONTROLCDU_Estado", GXutil.rtrim( Z125UVID_CONTROLCDU_Estado));
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
      return formatLink("com.wms.registroinspecciond")  ;
   }

   public String getPgmname( )
   {
      return "RegistroInspeccionD" ;
   }

   public String getPgmdesc( )
   {
      return "Registro Inspeccion D" ;
   }

   public void initializeNonKey078( )
   {
      A106VisOrder = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A106VisOrder", GXutil.ltrim( GXutil.str( A106VisOrder, 9, 0)));
      A107UVID_CONTROLCDObject = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A107UVID_CONTROLCDObject", A107UVID_CONTROLCDObject);
      A108UVID_CONTROLCDLogInst = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A108UVID_CONTROLCDLogInst", GXutil.ltrim( GXutil.str( A108UVID_CONTROLCDLogInst, 9, 0)));
      A109U_CodAtr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A109U_CodAtr", A109U_CodAtr);
      A110U_NameAtr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A110U_NameAtr", A110U_NameAtr);
      A111U_Cualitat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A111U_Cualitat", A111U_Cualitat);
      A112U_Critico = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A112U_Critico", A112U_Critico);
      A113U_TipoMues = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A113U_TipoMues", A113U_TipoMues);
      A114U_Rango = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A114U_Rango", A114U_Rango);
      A115U_TipoDef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A115U_TipoDef", A115U_TipoDef);
      A116U_AQL = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A116U_AQL", A116U_AQL);
      A117U_TiempoDu = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A117U_TiempoDu", GXutil.ltrim( GXutil.str( A117U_TiempoDu, 18, 0)));
      A118U_StandAtr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A118U_StandAtr", GXutil.ltrim( GXutil.str( A118U_StandAtr, 18, 0)));
      A119U_Minimo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A119U_Minimo", GXutil.ltrim( GXutil.str( A119U_Minimo, 18, 0)));
      A120U_Maximo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A120U_Maximo", GXutil.ltrim( GXutil.str( A120U_Maximo, 18, 0)));
      A121U_Medicion = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A121U_Medicion", GXutil.ltrim( GXutil.str( A121U_Medicion, 18, 0)));
      A122U_CodEquip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A122U_CodEquip", A122U_CodEquip);
      A123UVID_CONTROLCDU_Comment = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A123UVID_CONTROLCDU_Comment", A123UVID_CONTROLCDU_Comment);
      A124U_Comment2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A124U_Comment2", A124U_Comment2);
      A125UVID_CONTROLCDU_Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A125UVID_CONTROLCDU_Estado", A125UVID_CONTROLCDU_Estado);
      Z106VisOrder = 0 ;
      Z107UVID_CONTROLCDObject = "" ;
      Z108UVID_CONTROLCDLogInst = 0 ;
      Z109U_CodAtr = "" ;
      Z110U_NameAtr = "" ;
      Z111U_Cualitat = "" ;
      Z112U_Critico = "" ;
      Z113U_TipoMues = "" ;
      Z114U_Rango = "" ;
      Z115U_TipoDef = "" ;
      Z116U_AQL = "" ;
      Z117U_TiempoDu = 0 ;
      Z118U_StandAtr = 0 ;
      Z119U_Minimo = 0 ;
      Z120U_Maximo = 0 ;
      Z121U_Medicion = 0 ;
      Z122U_CodEquip = "" ;
      Z123UVID_CONTROLCDU_Comment = "" ;
      Z124U_Comment2 = "" ;
      Z125UVID_CONTROLCDU_Estado = "" ;
   }

   public void initAll078( )
   {
      A41UVID_CONTROLCDDocEntry = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A41UVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( A41UVID_CONTROLCDDocEntry, 9, 0)));
      A42LineId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A42LineId", GXutil.ltrim( GXutil.str( A42LineId, 9, 0)));
      initializeNonKey078( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1022385");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210225852");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("registroinspecciond.js", "?201811210225853");
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
      edtUVID_CONTROLCDDocEntry_Internalname = "UVID_CONTROLCDDOCENTRY" ;
      edtLineId_Internalname = "LINEID" ;
      edtVisOrder_Internalname = "VISORDER" ;
      edtUVID_CONTROLCDObject_Internalname = "UVID_CONTROLCDOBJECT" ;
      edtUVID_CONTROLCDLogInst_Internalname = "UVID_CONTROLCDLOGINST" ;
      edtU_CodAtr_Internalname = "U_CODATR" ;
      edtU_NameAtr_Internalname = "U_NAMEATR" ;
      edtU_Cualitat_Internalname = "U_CUALITAT" ;
      edtU_Critico_Internalname = "U_CRITICO" ;
      edtU_TipoMues_Internalname = "U_TIPOMUES" ;
      edtU_Rango_Internalname = "U_RANGO" ;
      edtU_TipoDef_Internalname = "U_TIPODEF" ;
      edtU_AQL_Internalname = "U_AQL" ;
      edtU_TiempoDu_Internalname = "U_TIEMPODU" ;
      edtU_StandAtr_Internalname = "U_STANDATR" ;
      edtU_Minimo_Internalname = "U_MINIMO" ;
      edtU_Maximo_Internalname = "U_MAXIMO" ;
      edtU_Medicion_Internalname = "U_MEDICION" ;
      edtU_CodEquip_Internalname = "U_CODEQUIP" ;
      edtUVID_CONTROLCDU_Comment_Internalname = "UVID_CONTROLCDU_COMMENT" ;
      edtU_Comment2_Internalname = "U_COMMENT2" ;
      edtUVID_CONTROLCDU_Estado_Internalname = "UVID_CONTROLCDU_ESTADO" ;
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
      Form.setCaption( "Registro Inspeccion D" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtUVID_CONTROLCDU_Estado_Jsonclick = "" ;
      edtUVID_CONTROLCDU_Estado_Enabled = 1 ;
      edtU_Comment2_Enabled = 1 ;
      edtUVID_CONTROLCDU_Comment_Enabled = 1 ;
      edtU_CodEquip_Jsonclick = "" ;
      edtU_CodEquip_Enabled = 1 ;
      edtU_Medicion_Jsonclick = "" ;
      edtU_Medicion_Enabled = 1 ;
      edtU_Maximo_Jsonclick = "" ;
      edtU_Maximo_Enabled = 1 ;
      edtU_Minimo_Jsonclick = "" ;
      edtU_Minimo_Enabled = 1 ;
      edtU_StandAtr_Jsonclick = "" ;
      edtU_StandAtr_Enabled = 1 ;
      edtU_TiempoDu_Jsonclick = "" ;
      edtU_TiempoDu_Enabled = 1 ;
      edtU_AQL_Jsonclick = "" ;
      edtU_AQL_Enabled = 1 ;
      edtU_TipoDef_Jsonclick = "" ;
      edtU_TipoDef_Enabled = 1 ;
      edtU_Rango_Jsonclick = "" ;
      edtU_Rango_Enabled = 1 ;
      edtU_TipoMues_Jsonclick = "" ;
      edtU_TipoMues_Enabled = 1 ;
      edtU_Critico_Jsonclick = "" ;
      edtU_Critico_Enabled = 1 ;
      edtU_Cualitat_Jsonclick = "" ;
      edtU_Cualitat_Enabled = 1 ;
      edtU_NameAtr_Jsonclick = "" ;
      edtU_NameAtr_Enabled = 1 ;
      edtU_CodAtr_Jsonclick = "" ;
      edtU_CodAtr_Enabled = 1 ;
      edtUVID_CONTROLCDLogInst_Jsonclick = "" ;
      edtUVID_CONTROLCDLogInst_Enabled = 1 ;
      edtUVID_CONTROLCDObject_Jsonclick = "" ;
      edtUVID_CONTROLCDObject_Enabled = 1 ;
      edtVisOrder_Jsonclick = "" ;
      edtVisOrder_Enabled = 1 ;
      edtLineId_Jsonclick = "" ;
      edtLineId_Enabled = 1 ;
      edtUVID_CONTROLCDDocEntry_Jsonclick = "" ;
      edtUVID_CONTROLCDDocEntry_Enabled = 1 ;
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
      GX_FocusControl = edtVisOrder_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Lineid( int GX_Parm1 ,
                             int GX_Parm2 ,
                             int GX_Parm3 ,
                             String GX_Parm4 ,
                             int GX_Parm5 ,
                             String GX_Parm6 ,
                             String GX_Parm7 ,
                             String GX_Parm8 ,
                             String GX_Parm9 ,
                             String GX_Parm10 ,
                             String GX_Parm11 ,
                             String GX_Parm12 ,
                             String GX_Parm13 ,
                             long GX_Parm14 ,
                             long GX_Parm15 ,
                             long GX_Parm16 ,
                             long GX_Parm17 ,
                             long GX_Parm18 ,
                             String GX_Parm19 ,
                             String GX_Parm20 ,
                             String GX_Parm21 ,
                             String GX_Parm22 )
   {
      A41UVID_CONTROLCDDocEntry = GX_Parm1 ;
      A42LineId = GX_Parm2 ;
      A106VisOrder = GX_Parm3 ;
      A107UVID_CONTROLCDObject = GX_Parm4 ;
      A108UVID_CONTROLCDLogInst = GX_Parm5 ;
      A109U_CodAtr = GX_Parm6 ;
      A110U_NameAtr = GX_Parm7 ;
      A111U_Cualitat = GX_Parm8 ;
      A112U_Critico = GX_Parm9 ;
      A113U_TipoMues = GX_Parm10 ;
      A114U_Rango = GX_Parm11 ;
      A115U_TipoDef = GX_Parm12 ;
      A116U_AQL = GX_Parm13 ;
      A117U_TiempoDu = GX_Parm14 ;
      A118U_StandAtr = GX_Parm15 ;
      A119U_Minimo = GX_Parm16 ;
      A120U_Maximo = GX_Parm17 ;
      A121U_Medicion = GX_Parm18 ;
      A122U_CodEquip = GX_Parm19 ;
      A123UVID_CONTROLCDU_Comment = GX_Parm20 ;
      A124U_Comment2 = GX_Parm21 ;
      A125UVID_CONTROLCDU_Estado = GX_Parm22 ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A106VisOrder, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(A107UVID_CONTROLCDObject);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A108UVID_CONTROLCDLogInst, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(A109U_CodAtr);
      isValidOutput.add(A110U_NameAtr);
      isValidOutput.add(GXutil.rtrim( A111U_Cualitat));
      isValidOutput.add(GXutil.rtrim( A112U_Critico));
      isValidOutput.add(A113U_TipoMues);
      isValidOutput.add(A114U_Rango);
      isValidOutput.add(GXutil.rtrim( A115U_TipoDef));
      isValidOutput.add(A116U_AQL);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A117U_TiempoDu, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A118U_StandAtr, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A119U_Minimo, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A120U_Maximo, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A121U_Medicion, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A122U_CodEquip);
      isValidOutput.add(A123UVID_CONTROLCDU_Comment);
      isValidOutput.add(A124U_Comment2);
      isValidOutput.add(GXutil.rtrim( A125UVID_CONTROLCDU_Estado));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z41UVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z42LineId, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z106VisOrder, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(Z107UVID_CONTROLCDObject);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z108UVID_CONTROLCDLogInst, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(Z109U_CodAtr);
      isValidOutput.add(Z110U_NameAtr);
      isValidOutput.add(GXutil.rtrim( Z111U_Cualitat));
      isValidOutput.add(GXutil.rtrim( Z112U_Critico));
      isValidOutput.add(Z113U_TipoMues);
      isValidOutput.add(Z114U_Rango);
      isValidOutput.add(GXutil.rtrim( Z115U_TipoDef));
      isValidOutput.add(Z116U_AQL);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z117U_TiempoDu, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z118U_StandAtr, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z119U_Minimo, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z120U_Maximo, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z121U_Medicion, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(Z122U_CodEquip);
      isValidOutput.add(Z123UVID_CONTROLCDU_Comment);
      isValidOutput.add(Z124U_Comment2);
      isValidOutput.add(GXutil.rtrim( Z125UVID_CONTROLCDU_Estado));
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
      Z107UVID_CONTROLCDObject = "" ;
      Z109U_CodAtr = "" ;
      Z110U_NameAtr = "" ;
      Z111U_Cualitat = "" ;
      Z112U_Critico = "" ;
      Z113U_TipoMues = "" ;
      Z114U_Rango = "" ;
      Z115U_TipoDef = "" ;
      Z116U_AQL = "" ;
      Z122U_CodEquip = "" ;
      Z123UVID_CONTROLCDU_Comment = "" ;
      Z124U_Comment2 = "" ;
      Z125UVID_CONTROLCDU_Estado = "" ;
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
      A107UVID_CONTROLCDObject = "" ;
      A109U_CodAtr = "" ;
      A110U_NameAtr = "" ;
      A111U_Cualitat = "" ;
      A112U_Critico = "" ;
      A113U_TipoMues = "" ;
      A114U_Rango = "" ;
      A115U_TipoDef = "" ;
      A116U_AQL = "" ;
      A122U_CodEquip = "" ;
      A123UVID_CONTROLCDU_Comment = "" ;
      A124U_Comment2 = "" ;
      A125UVID_CONTROLCDU_Estado = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T00074_A41UVID_CONTROLCDDocEntry = new int[1] ;
      T00074_A42LineId = new int[1] ;
      T00074_A106VisOrder = new int[1] ;
      T00074_A107UVID_CONTROLCDObject = new String[] {""} ;
      T00074_A108UVID_CONTROLCDLogInst = new int[1] ;
      T00074_A109U_CodAtr = new String[] {""} ;
      T00074_A110U_NameAtr = new String[] {""} ;
      T00074_A111U_Cualitat = new String[] {""} ;
      T00074_A112U_Critico = new String[] {""} ;
      T00074_A113U_TipoMues = new String[] {""} ;
      T00074_A114U_Rango = new String[] {""} ;
      T00074_A115U_TipoDef = new String[] {""} ;
      T00074_A116U_AQL = new String[] {""} ;
      T00074_A117U_TiempoDu = new long[1] ;
      T00074_A118U_StandAtr = new long[1] ;
      T00074_A119U_Minimo = new long[1] ;
      T00074_A120U_Maximo = new long[1] ;
      T00074_A121U_Medicion = new long[1] ;
      T00074_A122U_CodEquip = new String[] {""} ;
      T00074_A123UVID_CONTROLCDU_Comment = new String[] {""} ;
      T00074_A124U_Comment2 = new String[] {""} ;
      T00074_A125UVID_CONTROLCDU_Estado = new String[] {""} ;
      T00075_A41UVID_CONTROLCDDocEntry = new int[1] ;
      T00075_A42LineId = new int[1] ;
      T00073_A41UVID_CONTROLCDDocEntry = new int[1] ;
      T00073_A42LineId = new int[1] ;
      T00073_A106VisOrder = new int[1] ;
      T00073_A107UVID_CONTROLCDObject = new String[] {""} ;
      T00073_A108UVID_CONTROLCDLogInst = new int[1] ;
      T00073_A109U_CodAtr = new String[] {""} ;
      T00073_A110U_NameAtr = new String[] {""} ;
      T00073_A111U_Cualitat = new String[] {""} ;
      T00073_A112U_Critico = new String[] {""} ;
      T00073_A113U_TipoMues = new String[] {""} ;
      T00073_A114U_Rango = new String[] {""} ;
      T00073_A115U_TipoDef = new String[] {""} ;
      T00073_A116U_AQL = new String[] {""} ;
      T00073_A117U_TiempoDu = new long[1] ;
      T00073_A118U_StandAtr = new long[1] ;
      T00073_A119U_Minimo = new long[1] ;
      T00073_A120U_Maximo = new long[1] ;
      T00073_A121U_Medicion = new long[1] ;
      T00073_A122U_CodEquip = new String[] {""} ;
      T00073_A123UVID_CONTROLCDU_Comment = new String[] {""} ;
      T00073_A124U_Comment2 = new String[] {""} ;
      T00073_A125UVID_CONTROLCDU_Estado = new String[] {""} ;
      sMode8 = "" ;
      T00076_A41UVID_CONTROLCDDocEntry = new int[1] ;
      T00076_A42LineId = new int[1] ;
      T00077_A41UVID_CONTROLCDDocEntry = new int[1] ;
      T00077_A42LineId = new int[1] ;
      T00072_A41UVID_CONTROLCDDocEntry = new int[1] ;
      T00072_A42LineId = new int[1] ;
      T00072_A106VisOrder = new int[1] ;
      T00072_A107UVID_CONTROLCDObject = new String[] {""} ;
      T00072_A108UVID_CONTROLCDLogInst = new int[1] ;
      T00072_A109U_CodAtr = new String[] {""} ;
      T00072_A110U_NameAtr = new String[] {""} ;
      T00072_A111U_Cualitat = new String[] {""} ;
      T00072_A112U_Critico = new String[] {""} ;
      T00072_A113U_TipoMues = new String[] {""} ;
      T00072_A114U_Rango = new String[] {""} ;
      T00072_A115U_TipoDef = new String[] {""} ;
      T00072_A116U_AQL = new String[] {""} ;
      T00072_A117U_TiempoDu = new long[1] ;
      T00072_A118U_StandAtr = new long[1] ;
      T00072_A119U_Minimo = new long[1] ;
      T00072_A120U_Maximo = new long[1] ;
      T00072_A121U_Medicion = new long[1] ;
      T00072_A122U_CodEquip = new String[] {""} ;
      T00072_A123UVID_CONTROLCDU_Comment = new String[] {""} ;
      T00072_A124U_Comment2 = new String[] {""} ;
      T00072_A125UVID_CONTROLCDU_Estado = new String[] {""} ;
      T000711_A41UVID_CONTROLCDDocEntry = new int[1] ;
      T000711_A42LineId = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.registroinspecciond__fusquim_sap(),
         new Object[] {
             new Object[] {
            T00072_A41UVID_CONTROLCDDocEntry, T00072_A42LineId, T00072_A106VisOrder, T00072_A107UVID_CONTROLCDObject, T00072_A108UVID_CONTROLCDLogInst, T00072_A109U_CodAtr, T00072_A110U_NameAtr, T00072_A111U_Cualitat, T00072_A112U_Critico, T00072_A113U_TipoMues,
            T00072_A114U_Rango, T00072_A115U_TipoDef, T00072_A116U_AQL, T00072_A117U_TiempoDu, T00072_A118U_StandAtr, T00072_A119U_Minimo, T00072_A120U_Maximo, T00072_A121U_Medicion, T00072_A122U_CodEquip, T00072_A123UVID_CONTROLCDU_Comment,
            T00072_A124U_Comment2, T00072_A125UVID_CONTROLCDU_Estado
            }
            , new Object[] {
            T00073_A41UVID_CONTROLCDDocEntry, T00073_A42LineId, T00073_A106VisOrder, T00073_A107UVID_CONTROLCDObject, T00073_A108UVID_CONTROLCDLogInst, T00073_A109U_CodAtr, T00073_A110U_NameAtr, T00073_A111U_Cualitat, T00073_A112U_Critico, T00073_A113U_TipoMues,
            T00073_A114U_Rango, T00073_A115U_TipoDef, T00073_A116U_AQL, T00073_A117U_TiempoDu, T00073_A118U_StandAtr, T00073_A119U_Minimo, T00073_A120U_Maximo, T00073_A121U_Medicion, T00073_A122U_CodEquip, T00073_A123UVID_CONTROLCDU_Comment,
            T00073_A124U_Comment2, T00073_A125UVID_CONTROLCDU_Estado
            }
            , new Object[] {
            T00074_A41UVID_CONTROLCDDocEntry, T00074_A42LineId, T00074_A106VisOrder, T00074_A107UVID_CONTROLCDObject, T00074_A108UVID_CONTROLCDLogInst, T00074_A109U_CodAtr, T00074_A110U_NameAtr, T00074_A111U_Cualitat, T00074_A112U_Critico, T00074_A113U_TipoMues,
            T00074_A114U_Rango, T00074_A115U_TipoDef, T00074_A116U_AQL, T00074_A117U_TiempoDu, T00074_A118U_StandAtr, T00074_A119U_Minimo, T00074_A120U_Maximo, T00074_A121U_Medicion, T00074_A122U_CodEquip, T00074_A123UVID_CONTROLCDU_Comment,
            T00074_A124U_Comment2, T00074_A125UVID_CONTROLCDU_Estado
            }
            , new Object[] {
            T00075_A41UVID_CONTROLCDDocEntry, T00075_A42LineId
            }
            , new Object[] {
            T00076_A41UVID_CONTROLCDDocEntry, T00076_A42LineId
            }
            , new Object[] {
            T00077_A41UVID_CONTROLCDDocEntry, T00077_A42LineId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000711_A41UVID_CONTROLCDDocEntry, T000711_A42LineId
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.registroinspecciond__default(),
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
   private short RcdFound8 ;
   private int Z41UVID_CONTROLCDDocEntry ;
   private int Z42LineId ;
   private int Z106VisOrder ;
   private int Z108UVID_CONTROLCDLogInst ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A41UVID_CONTROLCDDocEntry ;
   private int edtUVID_CONTROLCDDocEntry_Enabled ;
   private int A42LineId ;
   private int edtLineId_Enabled ;
   private int A106VisOrder ;
   private int edtVisOrder_Enabled ;
   private int edtUVID_CONTROLCDObject_Enabled ;
   private int A108UVID_CONTROLCDLogInst ;
   private int edtUVID_CONTROLCDLogInst_Enabled ;
   private int edtU_CodAtr_Enabled ;
   private int edtU_NameAtr_Enabled ;
   private int edtU_Cualitat_Enabled ;
   private int edtU_Critico_Enabled ;
   private int edtU_TipoMues_Enabled ;
   private int edtU_Rango_Enabled ;
   private int edtU_TipoDef_Enabled ;
   private int edtU_AQL_Enabled ;
   private int edtU_TiempoDu_Enabled ;
   private int edtU_StandAtr_Enabled ;
   private int edtU_Minimo_Enabled ;
   private int edtU_Maximo_Enabled ;
   private int edtU_Medicion_Enabled ;
   private int edtU_CodEquip_Enabled ;
   private int edtUVID_CONTROLCDU_Comment_Enabled ;
   private int edtU_Comment2_Enabled ;
   private int edtUVID_CONTROLCDU_Estado_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z117U_TiempoDu ;
   private long Z118U_StandAtr ;
   private long Z119U_Minimo ;
   private long Z120U_Maximo ;
   private long Z121U_Medicion ;
   private long A117U_TiempoDu ;
   private long A118U_StandAtr ;
   private long A119U_Minimo ;
   private long A120U_Maximo ;
   private long A121U_Medicion ;
   private String sPrefix ;
   private String Z111U_Cualitat ;
   private String Z112U_Critico ;
   private String Z115U_TipoDef ;
   private String Z125UVID_CONTROLCDU_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtUVID_CONTROLCDDocEntry_Internalname ;
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
   private String edtUVID_CONTROLCDDocEntry_Jsonclick ;
   private String edtLineId_Internalname ;
   private String edtLineId_Jsonclick ;
   private String edtVisOrder_Internalname ;
   private String edtVisOrder_Jsonclick ;
   private String edtUVID_CONTROLCDObject_Internalname ;
   private String edtUVID_CONTROLCDObject_Jsonclick ;
   private String edtUVID_CONTROLCDLogInst_Internalname ;
   private String edtUVID_CONTROLCDLogInst_Jsonclick ;
   private String edtU_CodAtr_Internalname ;
   private String edtU_CodAtr_Jsonclick ;
   private String edtU_NameAtr_Internalname ;
   private String edtU_NameAtr_Jsonclick ;
   private String edtU_Cualitat_Internalname ;
   private String A111U_Cualitat ;
   private String edtU_Cualitat_Jsonclick ;
   private String edtU_Critico_Internalname ;
   private String A112U_Critico ;
   private String edtU_Critico_Jsonclick ;
   private String edtU_TipoMues_Internalname ;
   private String edtU_TipoMues_Jsonclick ;
   private String edtU_Rango_Internalname ;
   private String edtU_Rango_Jsonclick ;
   private String edtU_TipoDef_Internalname ;
   private String A115U_TipoDef ;
   private String edtU_TipoDef_Jsonclick ;
   private String edtU_AQL_Internalname ;
   private String edtU_AQL_Jsonclick ;
   private String edtU_TiempoDu_Internalname ;
   private String edtU_TiempoDu_Jsonclick ;
   private String edtU_StandAtr_Internalname ;
   private String edtU_StandAtr_Jsonclick ;
   private String edtU_Minimo_Internalname ;
   private String edtU_Minimo_Jsonclick ;
   private String edtU_Maximo_Internalname ;
   private String edtU_Maximo_Jsonclick ;
   private String edtU_Medicion_Internalname ;
   private String edtU_Medicion_Jsonclick ;
   private String edtU_CodEquip_Internalname ;
   private String edtU_CodEquip_Jsonclick ;
   private String edtUVID_CONTROLCDU_Comment_Internalname ;
   private String edtU_Comment2_Internalname ;
   private String edtUVID_CONTROLCDU_Estado_Internalname ;
   private String A125UVID_CONTROLCDU_Estado ;
   private String edtUVID_CONTROLCDU_Estado_Jsonclick ;
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
   private String sMode8 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private String Z107UVID_CONTROLCDObject ;
   private String Z109U_CodAtr ;
   private String Z110U_NameAtr ;
   private String Z113U_TipoMues ;
   private String Z114U_Rango ;
   private String Z116U_AQL ;
   private String Z122U_CodEquip ;
   private String Z123UVID_CONTROLCDU_Comment ;
   private String Z124U_Comment2 ;
   private String A107UVID_CONTROLCDObject ;
   private String A109U_CodAtr ;
   private String A110U_NameAtr ;
   private String A113U_TipoMues ;
   private String A114U_Rango ;
   private String A116U_AQL ;
   private String A122U_CodEquip ;
   private String A123UVID_CONTROLCDU_Comment ;
   private String A124U_Comment2 ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_fusquim_sap ;
   private int[] T00074_A41UVID_CONTROLCDDocEntry ;
   private int[] T00074_A42LineId ;
   private int[] T00074_A106VisOrder ;
   private String[] T00074_A107UVID_CONTROLCDObject ;
   private int[] T00074_A108UVID_CONTROLCDLogInst ;
   private String[] T00074_A109U_CodAtr ;
   private String[] T00074_A110U_NameAtr ;
   private String[] T00074_A111U_Cualitat ;
   private String[] T00074_A112U_Critico ;
   private String[] T00074_A113U_TipoMues ;
   private String[] T00074_A114U_Rango ;
   private String[] T00074_A115U_TipoDef ;
   private String[] T00074_A116U_AQL ;
   private long[] T00074_A117U_TiempoDu ;
   private long[] T00074_A118U_StandAtr ;
   private long[] T00074_A119U_Minimo ;
   private long[] T00074_A120U_Maximo ;
   private long[] T00074_A121U_Medicion ;
   private String[] T00074_A122U_CodEquip ;
   private String[] T00074_A123UVID_CONTROLCDU_Comment ;
   private String[] T00074_A124U_Comment2 ;
   private String[] T00074_A125UVID_CONTROLCDU_Estado ;
   private int[] T00075_A41UVID_CONTROLCDDocEntry ;
   private int[] T00075_A42LineId ;
   private int[] T00073_A41UVID_CONTROLCDDocEntry ;
   private int[] T00073_A42LineId ;
   private int[] T00073_A106VisOrder ;
   private String[] T00073_A107UVID_CONTROLCDObject ;
   private int[] T00073_A108UVID_CONTROLCDLogInst ;
   private String[] T00073_A109U_CodAtr ;
   private String[] T00073_A110U_NameAtr ;
   private String[] T00073_A111U_Cualitat ;
   private String[] T00073_A112U_Critico ;
   private String[] T00073_A113U_TipoMues ;
   private String[] T00073_A114U_Rango ;
   private String[] T00073_A115U_TipoDef ;
   private String[] T00073_A116U_AQL ;
   private long[] T00073_A117U_TiempoDu ;
   private long[] T00073_A118U_StandAtr ;
   private long[] T00073_A119U_Minimo ;
   private long[] T00073_A120U_Maximo ;
   private long[] T00073_A121U_Medicion ;
   private String[] T00073_A122U_CodEquip ;
   private String[] T00073_A123UVID_CONTROLCDU_Comment ;
   private String[] T00073_A124U_Comment2 ;
   private String[] T00073_A125UVID_CONTROLCDU_Estado ;
   private int[] T00076_A41UVID_CONTROLCDDocEntry ;
   private int[] T00076_A42LineId ;
   private int[] T00077_A41UVID_CONTROLCDDocEntry ;
   private int[] T00077_A42LineId ;
   private int[] T00072_A41UVID_CONTROLCDDocEntry ;
   private int[] T00072_A42LineId ;
   private int[] T00072_A106VisOrder ;
   private String[] T00072_A107UVID_CONTROLCDObject ;
   private int[] T00072_A108UVID_CONTROLCDLogInst ;
   private String[] T00072_A109U_CodAtr ;
   private String[] T00072_A110U_NameAtr ;
   private String[] T00072_A111U_Cualitat ;
   private String[] T00072_A112U_Critico ;
   private String[] T00072_A113U_TipoMues ;
   private String[] T00072_A114U_Rango ;
   private String[] T00072_A115U_TipoDef ;
   private String[] T00072_A116U_AQL ;
   private long[] T00072_A117U_TiempoDu ;
   private long[] T00072_A118U_StandAtr ;
   private long[] T00072_A119U_Minimo ;
   private long[] T00072_A120U_Maximo ;
   private long[] T00072_A121U_Medicion ;
   private String[] T00072_A122U_CodEquip ;
   private String[] T00072_A123UVID_CONTROLCDU_Comment ;
   private String[] T00072_A124U_Comment2 ;
   private String[] T00072_A125UVID_CONTROLCDU_Estado ;
   private IDataStoreProvider pr_default ;
   private int[] T000711_A41UVID_CONTROLCDDocEntry ;
   private int[] T000711_A42LineId ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class registroinspecciond__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00072", "SELECT [DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_Rango], [U_TipoDef], [U_AQL], [U_TiempoDu], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Medicion], [U_CodEquip], [U_Comment], [U_Comment2], [U_Estado] FROM dbo.[@VID_CONTROLCD] WITH (UPDLOCK) WHERE [DocEntry] = ? AND [LineId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00073", "SELECT [DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_Rango], [U_TipoDef], [U_AQL], [U_TiempoDu], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Medicion], [U_CodEquip], [U_Comment], [U_Comment2], [U_Estado] FROM dbo.[@VID_CONTROLCD] WITH (NOLOCK) WHERE [DocEntry] = ? AND [LineId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00074", "SELECT TM1.[DocEntry], TM1.[LineId], TM1.[VisOrder], TM1.[Object], TM1.[LogInst], TM1.[U_CodAtr], TM1.[U_NameAtr], TM1.[U_Cualitat], TM1.[U_Critico], TM1.[U_TipoMues], TM1.[U_Rango], TM1.[U_TipoDef], TM1.[U_AQL], TM1.[U_TiempoDu], TM1.[U_StandAtr], TM1.[U_Minimo], TM1.[U_Maximo], TM1.[U_Medicion], TM1.[U_CodEquip], TM1.[U_Comment], TM1.[U_Comment2], TM1.[U_Estado] FROM dbo.[@VID_CONTROLCD] TM1 WITH (NOLOCK) WHERE TM1.[DocEntry] = ? and TM1.[LineId] = ? ORDER BY TM1.[DocEntry], TM1.[LineId]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00075", "SELECT [DocEntry], [LineId] FROM dbo.[@VID_CONTROLCD] WITH (NOLOCK) WHERE [DocEntry] = ? AND [LineId] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00076", "SELECT TOP 1 [DocEntry], [LineId] FROM dbo.[@VID_CONTROLCD] WITH (NOLOCK) WHERE ( [DocEntry] > ? or [DocEntry] = ? and [LineId] > ?) ORDER BY [DocEntry], [LineId]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00077", "SELECT TOP 1 [DocEntry], [LineId] FROM dbo.[@VID_CONTROLCD] WITH (NOLOCK) WHERE ( [DocEntry] < ? or [DocEntry] = ? and [LineId] < ?) ORDER BY [DocEntry] DESC, [LineId] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00078", "INSERT INTO dbo.[@VID_CONTROLCD]([DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_Rango], [U_TipoDef], [U_AQL], [U_TiempoDu], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Medicion], [U_CodEquip], [U_Comment], [U_Comment2], [U_Estado]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00079", "UPDATE dbo.[@VID_CONTROLCD] SET [VisOrder]=?, [Object]=?, [LogInst]=?, [U_CodAtr]=?, [U_NameAtr]=?, [U_Cualitat]=?, [U_Critico]=?, [U_TipoMues]=?, [U_Rango]=?, [U_TipoDef]=?, [U_AQL]=?, [U_TiempoDu]=?, [U_StandAtr]=?, [U_Minimo]=?, [U_Maximo]=?, [U_Medicion]=?, [U_CodEquip]=?, [U_Comment]=?, [U_Comment2]=?, [U_Estado]=?  WHERE [DocEntry] = ? AND [LineId] = ?", GX_NOMASK)
         ,new UpdateCursor("T000710", "DELETE FROM dbo.[@VID_CONTROLCD]  WHERE [DocEntry] = ? AND [LineId] = ?", GX_NOMASK)
         ,new ForEachCursor("T000711", "SELECT [DocEntry], [LineId] FROM dbo.[@VID_CONTROLCD] WITH (NOLOCK) ORDER BY [DocEntry], [LineId]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getString(12, 1) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((long[]) buf[13])[0] = rslt.getLong(14) ;
               ((long[]) buf[14])[0] = rslt.getLong(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((long[]) buf[16])[0] = rslt.getLong(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getString(22, 1) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getString(12, 1) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((long[]) buf[13])[0] = rslt.getLong(14) ;
               ((long[]) buf[14])[0] = rslt.getLong(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((long[]) buf[16])[0] = rslt.getLong(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getString(22, 1) ;
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getString(12, 1) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((long[]) buf[13])[0] = rslt.getLong(14) ;
               ((long[]) buf[14])[0] = rslt.getLong(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((long[]) buf[16])[0] = rslt.getLong(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getString(22, 1) ;
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setVarchar(4, (String)parms[3], 20, false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setVarchar(6, (String)parms[5], 20, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setVarchar(10, (String)parms[9], 8, false);
               stmt.setVarchar(11, (String)parms[10], 20, false);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setVarchar(13, (String)parms[12], 8, false);
               stmt.setBigDecimal(14, ((Number) parms[13]).longValue(), 0);
               stmt.setBigDecimal(15, ((Number) parms[14]).longValue(), 0);
               stmt.setBigDecimal(16, ((Number) parms[15]).longValue(), 0);
               stmt.setBigDecimal(17, ((Number) parms[16]).longValue(), 0);
               stmt.setBigDecimal(18, ((Number) parms[17]).longValue(), 0);
               stmt.setVarchar(19, (String)parms[18], 8, false);
               stmt.setVarchar(20, (String)parms[19], 254, false);
               stmt.setVarchar(21, (String)parms[20], 254, false);
               stmt.setString(22, (String)parms[21], 1);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setVarchar(4, (String)parms[3], 20, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setVarchar(8, (String)parms[7], 8, false);
               stmt.setVarchar(9, (String)parms[8], 20, false);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setVarchar(11, (String)parms[10], 8, false);
               stmt.setBigDecimal(12, ((Number) parms[11]).longValue(), 0);
               stmt.setBigDecimal(13, ((Number) parms[12]).longValue(), 0);
               stmt.setBigDecimal(14, ((Number) parms[13]).longValue(), 0);
               stmt.setBigDecimal(15, ((Number) parms[14]).longValue(), 0);
               stmt.setBigDecimal(16, ((Number) parms[15]).longValue(), 0);
               stmt.setVarchar(17, (String)parms[16], 8, false);
               stmt.setVarchar(18, (String)parms[17], 254, false);
               stmt.setVarchar(19, (String)parms[18], 254, false);
               stmt.setString(20, (String)parms[19], 1);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

final  class registroinspecciond__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

