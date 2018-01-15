/*
               File: bodegacuar_impl
        Description: Bodega Cuar
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 11, 2018 11:27:20.2
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

public final  class bodegacuar_impl extends GXDataArea
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
         Form.getMeta().addItem("description", "Bodega Cuar", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtItemCode_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public bodegacuar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public bodegacuar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( bodegacuar_impl.class ));
   }

   public bodegacuar_impl( int remoteHandle ,
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
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Bodega Cuar", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_BodegaCuar.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BodegaCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BodegaCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BodegaCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BodegaCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.wms.gx00b0"+"',["+"{Ctrl:gx.dom.el('"+"ITEMCODE"+"'), id:'"+"ITEMCODE"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_BodegaCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtItemCode_Internalname, "Item Code", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtItemCode_Internalname, A189ItemCode, GXutil.rtrim( localUtil.format( A189ItemCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItemCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtItemCode_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_BodegaCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtItemName_Internalname, "Item Name", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtItemName_Internalname, A190ItemName, GXutil.rtrim( localUtil.format( A190ItemName, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItemName_Jsonclick, 0, "Attribute", "", "", "", 1, edtItemName_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_BodegaCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtBodegaCuarWhsCode_Internalname, "Whs Code", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtBodegaCuarWhsCode_Internalname, GXutil.ltrim( localUtil.ntoc( A196BodegaCuarWhsCode, (byte)(4), (byte)(0), ",", "")), ((edtBodegaCuarWhsCode_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A196BodegaCuarWhsCode), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A196BodegaCuarWhsCode), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBodegaCuarWhsCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtBodegaCuarWhsCode_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_BodegaCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtOnHand_Internalname, "On Hand", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtOnHand_Internalname, GXutil.ltrim( localUtil.ntoc( A191OnHand, (byte)(18), (byte)(0), ",", "")), ((edtOnHand_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A191OnHand), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A191OnHand), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOnHand_Jsonclick, 0, "Attribute", "", "", "", 1, edtOnHand_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_BodegaCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtCntUnitMsr_Internalname, "Cnt Unit Msr", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCntUnitMsr_Internalname, A192CntUnitMsr, GXutil.rtrim( localUtil.format( A192CntUnitMsr, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCntUnitMsr_Jsonclick, 0, "Attribute", "", "", "", 1, edtCntUnitMsr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_BodegaCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtAvgPrice_Internalname, "Avg Price", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtAvgPrice_Internalname, GXutil.ltrim( localUtil.ntoc( A193AvgPrice, (byte)(18), (byte)(0), ",", "")), ((edtAvgPrice_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A193AvgPrice), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A193AvgPrice), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAvgPrice_Jsonclick, 0, "Attribute", "", "", "", 1, edtAvgPrice_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_BodegaCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtvalidFor_Internalname, "valid For", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtvalidFor_Internalname, GXutil.rtrim( A194validFor), GXutil.rtrim( localUtil.format( A194validFor, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtvalidFor_Jsonclick, 0, "Attribute", "", "", "", 1, edtvalidFor_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_BodegaCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtInvntItem_Internalname, "Invnt Item", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtInvntItem_Internalname, GXutil.rtrim( A195InvntItem), GXutil.rtrim( localUtil.format( A195InvntItem, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvntItem_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvntItem_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_BodegaCuar.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BodegaCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BodegaCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BodegaCuar.htm");
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
            A189ItemCode = httpContext.cgiGet( edtItemCode_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A189ItemCode", A189ItemCode);
            A190ItemName = httpContext.cgiGet( edtItemName_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A190ItemName", A190ItemName);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBodegaCuarWhsCode_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBodegaCuarWhsCode_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BODEGACUARWHSCODE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBodegaCuarWhsCode_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A196BodegaCuarWhsCode = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A196BodegaCuarWhsCode", GXutil.ltrim( GXutil.str( A196BodegaCuarWhsCode, 4, 0)));
            }
            else
            {
               A196BodegaCuarWhsCode = (short)(localUtil.ctol( httpContext.cgiGet( edtBodegaCuarWhsCode_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A196BodegaCuarWhsCode", GXutil.ltrim( GXutil.str( A196BodegaCuarWhsCode, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOnHand_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOnHand_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ONHAND");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOnHand_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A191OnHand = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A191OnHand", GXutil.ltrim( GXutil.str( A191OnHand, 18, 0)));
            }
            else
            {
               A191OnHand = localUtil.ctol( httpContext.cgiGet( edtOnHand_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A191OnHand", GXutil.ltrim( GXutil.str( A191OnHand, 18, 0)));
            }
            A192CntUnitMsr = httpContext.cgiGet( edtCntUnitMsr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A192CntUnitMsr", A192CntUnitMsr);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAvgPrice_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAvgPrice_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVGPRICE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAvgPrice_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A193AvgPrice = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A193AvgPrice", GXutil.ltrim( GXutil.str( A193AvgPrice, 18, 0)));
            }
            else
            {
               A193AvgPrice = localUtil.ctol( httpContext.cgiGet( edtAvgPrice_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A193AvgPrice", GXutil.ltrim( GXutil.str( A193AvgPrice, 18, 0)));
            }
            A194validFor = httpContext.cgiGet( edtvalidFor_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194validFor", A194validFor);
            A195InvntItem = httpContext.cgiGet( edtInvntItem_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A195InvntItem", A195InvntItem);
            /* Read saved values. */
            Z189ItemCode = httpContext.cgiGet( "Z189ItemCode") ;
            Z190ItemName = httpContext.cgiGet( "Z190ItemName") ;
            Z196BodegaCuarWhsCode = (short)(localUtil.ctol( httpContext.cgiGet( "Z196BodegaCuarWhsCode"), ",", ".")) ;
            Z191OnHand = localUtil.ctol( httpContext.cgiGet( "Z191OnHand"), ",", ".") ;
            Z192CntUnitMsr = httpContext.cgiGet( "Z192CntUnitMsr") ;
            Z193AvgPrice = localUtil.ctol( httpContext.cgiGet( "Z193AvgPrice"), ",", ".") ;
            Z194validFor = httpContext.cgiGet( "Z194validFor") ;
            Z195InvntItem = httpContext.cgiGet( "Z195InvntItem") ;
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
               A189ItemCode = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A189ItemCode", A189ItemCode);
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
            initAll0C11( ) ;
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
      disableAttributes0C11( ) ;
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

   public void resetCaption0C0( )
   {
   }

   public void zm0C11( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z190ItemName = T000C3_A190ItemName[0] ;
            Z196BodegaCuarWhsCode = T000C3_A196BodegaCuarWhsCode[0] ;
            Z191OnHand = T000C3_A191OnHand[0] ;
            Z192CntUnitMsr = T000C3_A192CntUnitMsr[0] ;
            Z193AvgPrice = T000C3_A193AvgPrice[0] ;
            Z194validFor = T000C3_A194validFor[0] ;
            Z195InvntItem = T000C3_A195InvntItem[0] ;
         }
         else
         {
            Z190ItemName = A190ItemName ;
            Z196BodegaCuarWhsCode = A196BodegaCuarWhsCode ;
            Z191OnHand = A191OnHand ;
            Z192CntUnitMsr = A192CntUnitMsr ;
            Z193AvgPrice = A193AvgPrice ;
            Z194validFor = A194validFor ;
            Z195InvntItem = A195InvntItem ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z189ItemCode = A189ItemCode ;
         Z190ItemName = A190ItemName ;
         Z196BodegaCuarWhsCode = A196BodegaCuarWhsCode ;
         Z191OnHand = A191OnHand ;
         Z192CntUnitMsr = A192CntUnitMsr ;
         Z193AvgPrice = A193AvgPrice ;
         Z194validFor = A194validFor ;
         Z195InvntItem = A195InvntItem ;
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

   public void load0C11( )
   {
      /* Using cursor T000C4 */
      pr_fusquim_sap.execute(2, new Object[] {A189ItemCode});
      if ( (pr_fusquim_sap.getStatus(2) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A190ItemName = T000C4_A190ItemName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A190ItemName", A190ItemName);
         A196BodegaCuarWhsCode = T000C4_A196BodegaCuarWhsCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A196BodegaCuarWhsCode", GXutil.ltrim( GXutil.str( A196BodegaCuarWhsCode, 4, 0)));
         A191OnHand = T000C4_A191OnHand[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191OnHand", GXutil.ltrim( GXutil.str( A191OnHand, 18, 0)));
         A192CntUnitMsr = T000C4_A192CntUnitMsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192CntUnitMsr", A192CntUnitMsr);
         A193AvgPrice = T000C4_A193AvgPrice[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A193AvgPrice", GXutil.ltrim( GXutil.str( A193AvgPrice, 18, 0)));
         A194validFor = T000C4_A194validFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194validFor", A194validFor);
         A195InvntItem = T000C4_A195InvntItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195InvntItem", A195InvntItem);
         zm0C11( -1) ;
      }
      pr_fusquim_sap.close(2);
      onLoadActions0C11( ) ;
   }

   public void onLoadActions0C11( )
   {
   }

   public void checkExtendedTable0C11( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors0C11( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0C11( )
   {
      /* Using cursor T000C5 */
      pr_fusquim_sap.execute(3, new Object[] {A189ItemCode});
      if ( (pr_fusquim_sap.getStatus(3) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_fusquim_sap.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000C3 */
      pr_fusquim_sap.execute(1, new Object[] {A189ItemCode});
      if ( (pr_fusquim_sap.getStatus(1) != 101) )
      {
         zm0C11( 1) ;
         RcdFound11 = (short)(1) ;
         A189ItemCode = T000C3_A189ItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189ItemCode", A189ItemCode);
         A190ItemName = T000C3_A190ItemName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A190ItemName", A190ItemName);
         A196BodegaCuarWhsCode = T000C3_A196BodegaCuarWhsCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A196BodegaCuarWhsCode", GXutil.ltrim( GXutil.str( A196BodegaCuarWhsCode, 4, 0)));
         A191OnHand = T000C3_A191OnHand[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191OnHand", GXutil.ltrim( GXutil.str( A191OnHand, 18, 0)));
         A192CntUnitMsr = T000C3_A192CntUnitMsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192CntUnitMsr", A192CntUnitMsr);
         A193AvgPrice = T000C3_A193AvgPrice[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A193AvgPrice", GXutil.ltrim( GXutil.str( A193AvgPrice, 18, 0)));
         A194validFor = T000C3_A194validFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194validFor", A194validFor);
         A195InvntItem = T000C3_A195InvntItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195InvntItem", A195InvntItem);
         Z189ItemCode = A189ItemCode ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0C11( ) ;
         if ( AnyError == 1 )
         {
            RcdFound11 = (short)(0) ;
            initializeNonKey0C11( ) ;
         }
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey0C11( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_fusquim_sap.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0C11( ) ;
      if ( RcdFound11 == 0 )
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
      RcdFound11 = (short)(0) ;
      /* Using cursor T000C6 */
      pr_fusquim_sap.execute(4, new Object[] {A189ItemCode});
      if ( (pr_fusquim_sap.getStatus(4) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( GXutil.strcmp(T000C6_A189ItemCode[0], A189ItemCode) < 0 ) ) )
         {
            pr_fusquim_sap.readNext(4);
         }
         if ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( GXutil.strcmp(T000C6_A189ItemCode[0], A189ItemCode) > 0 ) ) )
         {
            A189ItemCode = T000C6_A189ItemCode[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A189ItemCode", A189ItemCode);
            RcdFound11 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(4);
   }

   public void move_previous( )
   {
      RcdFound11 = (short)(0) ;
      /* Using cursor T000C7 */
      pr_fusquim_sap.execute(5, new Object[] {A189ItemCode});
      if ( (pr_fusquim_sap.getStatus(5) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( GXutil.strcmp(T000C7_A189ItemCode[0], A189ItemCode) > 0 ) ) )
         {
            pr_fusquim_sap.readNext(5);
         }
         if ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( GXutil.strcmp(T000C7_A189ItemCode[0], A189ItemCode) < 0 ) ) )
         {
            A189ItemCode = T000C7_A189ItemCode[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A189ItemCode", A189ItemCode);
            RcdFound11 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0C11( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtItemCode_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0C11( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound11 == 1 )
         {
            if ( GXutil.strcmp(A189ItemCode, Z189ItemCode) != 0 )
            {
               A189ItemCode = Z189ItemCode ;
               httpContext.ajax_rsp_assign_attri("", false, "A189ItemCode", A189ItemCode);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ITEMCODE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtItemCode_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtItemCode_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0C11( ) ;
               GX_FocusControl = edtItemCode_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A189ItemCode, Z189ItemCode) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtItemCode_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0C11( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ITEMCODE");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtItemCode_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtItemCode_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0C11( ) ;
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
      if ( GXutil.strcmp(A189ItemCode, Z189ItemCode) != 0 )
      {
         A189ItemCode = Z189ItemCode ;
         httpContext.ajax_rsp_assign_attri("", false, "A189ItemCode", A189ItemCode);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ITEMCODE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtItemCode_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtItemCode_Internalname ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "ITEMCODE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtItemCode_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtItemName_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0C11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtItemName_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0C11( ) ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtItemName_Internalname ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtItemName_Internalname ;
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
      scanStart0C11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound11 != 0 )
         {
            scanNext0C11( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtItemName_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0C11( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0C11( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000C2 */
         pr_fusquim_sap.execute(0, new Object[] {A189ItemCode});
         if ( (pr_fusquim_sap.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VSTOCKCUAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_fusquim_sap.getStatus(0) == 101) || ( GXutil.strcmp(Z190ItemName, T000C2_A190ItemName[0]) != 0 ) || ( Z196BodegaCuarWhsCode != T000C2_A196BodegaCuarWhsCode[0] ) || ( Z191OnHand != T000C2_A191OnHand[0] ) || ( GXutil.strcmp(Z192CntUnitMsr, T000C2_A192CntUnitMsr[0]) != 0 ) || ( Z193AvgPrice != T000C2_A193AvgPrice[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z194validFor, T000C2_A194validFor[0]) != 0 ) || ( GXutil.strcmp(Z195InvntItem, T000C2_A195InvntItem[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VSTOCKCUAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0C11( )
   {
      beforeValidate0C11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C11( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0C11( 0) ;
         checkOptimisticConcurrency0C11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C11( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0C11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C8 */
                  pr_fusquim_sap.execute(6, new Object[] {A189ItemCode, A190ItemName, new Short(A196BodegaCuarWhsCode), new Long(A191OnHand), A192CntUnitMsr, new Long(A193AvgPrice), A194validFor, A195InvntItem});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VStockCuar") ;
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
                        resetCaption0C0( ) ;
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
            load0C11( ) ;
         }
         endLevel0C11( ) ;
      }
      closeExtendedTableCursors0C11( ) ;
   }

   public void update0C11( )
   {
      beforeValidate0C11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C11( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C11( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0C11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C9 */
                  pr_fusquim_sap.execute(7, new Object[] {A190ItemName, new Short(A196BodegaCuarWhsCode), new Long(A191OnHand), A192CntUnitMsr, new Long(A193AvgPrice), A194validFor, A195InvntItem, A189ItemCode});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VStockCuar") ;
                  if ( (pr_fusquim_sap.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VSTOCKCUAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0C11( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption0C0( ) ;
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
         endLevel0C11( ) ;
      }
      closeExtendedTableCursors0C11( ) ;
   }

   public void deferredUpdate0C11( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0C11( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C11( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0C11( ) ;
         afterConfirm0C11( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0C11( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000C10 */
               pr_fusquim_sap.execute(8, new Object[] {A189ItemCode});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VStockCuar") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound11 == 0 )
                     {
                        initAll0C11( ) ;
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
                     resetCaption0C0( ) ;
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0C11( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0C11( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0C11( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_fusquim_sap.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0C11( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "bodegacuar");
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "bodegacuar");
         if ( AnyError == 0 )
         {
            confirmValues0C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "bodegacuar");
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "bodegacuar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0C11( )
   {
      /* Using cursor T000C11 */
      pr_fusquim_sap.execute(9);
      RcdFound11 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A189ItemCode = T000C11_A189ItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189ItemCode", A189ItemCode);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0C11( )
   {
      /* Scan next routine */
      pr_fusquim_sap.readNext(9);
      RcdFound11 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A189ItemCode = T000C11_A189ItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189ItemCode", A189ItemCode);
      }
   }

   public void scanEnd0C11( )
   {
      pr_fusquim_sap.close(9);
   }

   public void afterConfirm0C11( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C11( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0C11( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0C11( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0C11( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0C11( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0C11( )
   {
      edtItemCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItemCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtItemCode_Enabled, 5, 0)), true);
      edtItemName_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItemName_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtItemName_Enabled, 5, 0)), true);
      edtBodegaCuarWhsCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBodegaCuarWhsCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBodegaCuarWhsCode_Enabled, 5, 0)), true);
      edtOnHand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOnHand_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOnHand_Enabled, 5, 0)), true);
      edtCntUnitMsr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCntUnitMsr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCntUnitMsr_Enabled, 5, 0)), true);
      edtAvgPrice_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAvgPrice_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAvgPrice_Enabled, 5, 0)), true);
      edtvalidFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtvalidFor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtvalidFor_Enabled, 5, 0)), true);
      edtInvntItem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvntItem_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvntItem_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0C0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811111272157");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.bodegacuar") +"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z189ItemCode", Z189ItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z190ItemName", Z190ItemName);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z196BodegaCuarWhsCode", GXutil.ltrim( localUtil.ntoc( Z196BodegaCuarWhsCode, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z191OnHand", GXutil.ltrim( localUtil.ntoc( Z191OnHand, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z192CntUnitMsr", Z192CntUnitMsr);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z193AvgPrice", GXutil.ltrim( localUtil.ntoc( Z193AvgPrice, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z194validFor", GXutil.rtrim( Z194validFor));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z195InvntItem", GXutil.rtrim( Z195InvntItem));
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
      return formatLink("com.wms.bodegacuar")  ;
   }

   public String getPgmname( )
   {
      return "BodegaCuar" ;
   }

   public String getPgmdesc( )
   {
      return "Bodega Cuar" ;
   }

   public void initializeNonKey0C11( )
   {
      A190ItemName = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A190ItemName", A190ItemName);
      A196BodegaCuarWhsCode = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A196BodegaCuarWhsCode", GXutil.ltrim( GXutil.str( A196BodegaCuarWhsCode, 4, 0)));
      A191OnHand = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A191OnHand", GXutil.ltrim( GXutil.str( A191OnHand, 18, 0)));
      A192CntUnitMsr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A192CntUnitMsr", A192CntUnitMsr);
      A193AvgPrice = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A193AvgPrice", GXutil.ltrim( GXutil.str( A193AvgPrice, 18, 0)));
      A194validFor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A194validFor", A194validFor);
      A195InvntItem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A195InvntItem", A195InvntItem);
      Z190ItemName = "" ;
      Z196BodegaCuarWhsCode = (short)(0) ;
      Z191OnHand = 0 ;
      Z192CntUnitMsr = "" ;
      Z193AvgPrice = 0 ;
      Z194validFor = "" ;
      Z195InvntItem = "" ;
   }

   public void initAll0C11( )
   {
      A189ItemCode = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A189ItemCode", A189ItemCode);
      initializeNonKey0C11( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?831865");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811111272166");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("bodegacuar.js", "?201811111272166");
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
      edtItemCode_Internalname = "ITEMCODE" ;
      edtItemName_Internalname = "ITEMNAME" ;
      edtBodegaCuarWhsCode_Internalname = "BODEGACUARWHSCODE" ;
      edtOnHand_Internalname = "ONHAND" ;
      edtCntUnitMsr_Internalname = "CNTUNITMSR" ;
      edtAvgPrice_Internalname = "AVGPRICE" ;
      edtvalidFor_Internalname = "VALIDFOR" ;
      edtInvntItem_Internalname = "INVNTITEM" ;
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
      Form.setCaption( "Bodega Cuar" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtInvntItem_Jsonclick = "" ;
      edtInvntItem_Enabled = 1 ;
      edtvalidFor_Jsonclick = "" ;
      edtvalidFor_Enabled = 1 ;
      edtAvgPrice_Jsonclick = "" ;
      edtAvgPrice_Enabled = 1 ;
      edtCntUnitMsr_Jsonclick = "" ;
      edtCntUnitMsr_Enabled = 1 ;
      edtOnHand_Jsonclick = "" ;
      edtOnHand_Enabled = 1 ;
      edtBodegaCuarWhsCode_Jsonclick = "" ;
      edtBodegaCuarWhsCode_Enabled = 1 ;
      edtItemName_Jsonclick = "" ;
      edtItemName_Enabled = 1 ;
      edtItemCode_Jsonclick = "" ;
      edtItemCode_Enabled = 1 ;
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
      GX_FocusControl = edtItemName_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Itemcode( String GX_Parm1 ,
                               String GX_Parm2 ,
                               short GX_Parm3 ,
                               long GX_Parm4 ,
                               String GX_Parm5 ,
                               long GX_Parm6 ,
                               String GX_Parm7 ,
                               String GX_Parm8 )
   {
      A189ItemCode = GX_Parm1 ;
      A190ItemName = GX_Parm2 ;
      A196BodegaCuarWhsCode = GX_Parm3 ;
      A191OnHand = GX_Parm4 ;
      A192CntUnitMsr = GX_Parm5 ;
      A193AvgPrice = GX_Parm6 ;
      A194validFor = GX_Parm7 ;
      A195InvntItem = GX_Parm8 ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A190ItemName);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A196BodegaCuarWhsCode, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A191OnHand, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A192CntUnitMsr);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A193AvgPrice, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A194validFor));
      isValidOutput.add(GXutil.rtrim( A195InvntItem));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(Z189ItemCode);
      isValidOutput.add(Z190ItemName);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z196BodegaCuarWhsCode, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z191OnHand, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(Z192CntUnitMsr);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z193AvgPrice, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z194validFor));
      isValidOutput.add(GXutil.rtrim( Z195InvntItem));
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
      Z189ItemCode = "" ;
      Z190ItemName = "" ;
      Z192CntUnitMsr = "" ;
      Z194validFor = "" ;
      Z195InvntItem = "" ;
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
      A189ItemCode = "" ;
      A190ItemName = "" ;
      A192CntUnitMsr = "" ;
      A194validFor = "" ;
      A195InvntItem = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T000C4_A189ItemCode = new String[] {""} ;
      T000C4_A190ItemName = new String[] {""} ;
      T000C4_A196BodegaCuarWhsCode = new short[1] ;
      T000C4_A191OnHand = new long[1] ;
      T000C4_A192CntUnitMsr = new String[] {""} ;
      T000C4_A193AvgPrice = new long[1] ;
      T000C4_A194validFor = new String[] {""} ;
      T000C4_A195InvntItem = new String[] {""} ;
      T000C5_A189ItemCode = new String[] {""} ;
      T000C3_A189ItemCode = new String[] {""} ;
      T000C3_A190ItemName = new String[] {""} ;
      T000C3_A196BodegaCuarWhsCode = new short[1] ;
      T000C3_A191OnHand = new long[1] ;
      T000C3_A192CntUnitMsr = new String[] {""} ;
      T000C3_A193AvgPrice = new long[1] ;
      T000C3_A194validFor = new String[] {""} ;
      T000C3_A195InvntItem = new String[] {""} ;
      sMode11 = "" ;
      T000C6_A189ItemCode = new String[] {""} ;
      T000C7_A189ItemCode = new String[] {""} ;
      T000C2_A189ItemCode = new String[] {""} ;
      T000C2_A190ItemName = new String[] {""} ;
      T000C2_A196BodegaCuarWhsCode = new short[1] ;
      T000C2_A191OnHand = new long[1] ;
      T000C2_A192CntUnitMsr = new String[] {""} ;
      T000C2_A193AvgPrice = new long[1] ;
      T000C2_A194validFor = new String[] {""} ;
      T000C2_A195InvntItem = new String[] {""} ;
      T000C11_A189ItemCode = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.bodegacuar__fusquim_sap(),
         new Object[] {
             new Object[] {
            T000C2_A189ItemCode, T000C2_A190ItemName, T000C2_A196BodegaCuarWhsCode, T000C2_A191OnHand, T000C2_A192CntUnitMsr, T000C2_A193AvgPrice, T000C2_A194validFor, T000C2_A195InvntItem
            }
            , new Object[] {
            T000C3_A189ItemCode, T000C3_A190ItemName, T000C3_A196BodegaCuarWhsCode, T000C3_A191OnHand, T000C3_A192CntUnitMsr, T000C3_A193AvgPrice, T000C3_A194validFor, T000C3_A195InvntItem
            }
            , new Object[] {
            T000C4_A189ItemCode, T000C4_A190ItemName, T000C4_A196BodegaCuarWhsCode, T000C4_A191OnHand, T000C4_A192CntUnitMsr, T000C4_A193AvgPrice, T000C4_A194validFor, T000C4_A195InvntItem
            }
            , new Object[] {
            T000C5_A189ItemCode
            }
            , new Object[] {
            T000C6_A189ItemCode
            }
            , new Object[] {
            T000C7_A189ItemCode
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000C11_A189ItemCode
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.bodegacuar__default(),
         new Object[] {
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z196BodegaCuarWhsCode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A196BodegaCuarWhsCode ;
   private short RcdFound11 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtItemCode_Enabled ;
   private int edtItemName_Enabled ;
   private int edtBodegaCuarWhsCode_Enabled ;
   private int edtOnHand_Enabled ;
   private int edtCntUnitMsr_Enabled ;
   private int edtAvgPrice_Enabled ;
   private int edtvalidFor_Enabled ;
   private int edtInvntItem_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z191OnHand ;
   private long Z193AvgPrice ;
   private long A191OnHand ;
   private long A193AvgPrice ;
   private String sPrefix ;
   private String Z194validFor ;
   private String Z195InvntItem ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtItemCode_Internalname ;
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
   private String edtItemCode_Jsonclick ;
   private String edtItemName_Internalname ;
   private String edtItemName_Jsonclick ;
   private String edtBodegaCuarWhsCode_Internalname ;
   private String edtBodegaCuarWhsCode_Jsonclick ;
   private String edtOnHand_Internalname ;
   private String edtOnHand_Jsonclick ;
   private String edtCntUnitMsr_Internalname ;
   private String edtCntUnitMsr_Jsonclick ;
   private String edtAvgPrice_Internalname ;
   private String edtAvgPrice_Jsonclick ;
   private String edtvalidFor_Internalname ;
   private String A194validFor ;
   private String edtvalidFor_Jsonclick ;
   private String edtInvntItem_Internalname ;
   private String A195InvntItem ;
   private String edtInvntItem_Jsonclick ;
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
   private String sMode11 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private String Z189ItemCode ;
   private String Z190ItemName ;
   private String Z192CntUnitMsr ;
   private String A189ItemCode ;
   private String A190ItemName ;
   private String A192CntUnitMsr ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_fusquim_sap ;
   private String[] T000C4_A189ItemCode ;
   private String[] T000C4_A190ItemName ;
   private short[] T000C4_A196BodegaCuarWhsCode ;
   private long[] T000C4_A191OnHand ;
   private String[] T000C4_A192CntUnitMsr ;
   private long[] T000C4_A193AvgPrice ;
   private String[] T000C4_A194validFor ;
   private String[] T000C4_A195InvntItem ;
   private String[] T000C5_A189ItemCode ;
   private String[] T000C3_A189ItemCode ;
   private String[] T000C3_A190ItemName ;
   private short[] T000C3_A196BodegaCuarWhsCode ;
   private long[] T000C3_A191OnHand ;
   private String[] T000C3_A192CntUnitMsr ;
   private long[] T000C3_A193AvgPrice ;
   private String[] T000C3_A194validFor ;
   private String[] T000C3_A195InvntItem ;
   private String[] T000C6_A189ItemCode ;
   private String[] T000C7_A189ItemCode ;
   private String[] T000C2_A189ItemCode ;
   private String[] T000C2_A190ItemName ;
   private short[] T000C2_A196BodegaCuarWhsCode ;
   private long[] T000C2_A191OnHand ;
   private String[] T000C2_A192CntUnitMsr ;
   private long[] T000C2_A193AvgPrice ;
   private String[] T000C2_A194validFor ;
   private String[] T000C2_A195InvntItem ;
   private IDataStoreProvider pr_default ;
   private String[] T000C11_A189ItemCode ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class bodegacuar__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000C2", "SELECT [ItemCode], [ItemName], [WhsCode], [OnHand], [CntUnitMsr], [AvgPrice], [validFor], [InvntItem] FROM dbo.[VStockCuar] WITH (UPDLOCK) WHERE [ItemCode] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C3", "SELECT [ItemCode], [ItemName], [WhsCode], [OnHand], [CntUnitMsr], [AvgPrice], [validFor], [InvntItem] FROM dbo.[VStockCuar] WITH (NOLOCK) WHERE [ItemCode] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C4", "SELECT TM1.[ItemCode], TM1.[ItemName], TM1.[WhsCode], TM1.[OnHand], TM1.[CntUnitMsr], TM1.[AvgPrice], TM1.[validFor], TM1.[InvntItem] FROM dbo.[VStockCuar] TM1 WITH (NOLOCK) WHERE TM1.[ItemCode] = ? ORDER BY TM1.[ItemCode]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000C5", "SELECT [ItemCode] FROM dbo.[VStockCuar] WITH (NOLOCK) WHERE [ItemCode] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C6", "SELECT TOP 1 [ItemCode] FROM dbo.[VStockCuar] WITH (NOLOCK) WHERE ( [ItemCode] > ?) ORDER BY [ItemCode]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000C7", "SELECT TOP 1 [ItemCode] FROM dbo.[VStockCuar] WITH (NOLOCK) WHERE ( [ItemCode] < ?) ORDER BY [ItemCode] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000C8", "INSERT INTO dbo.[VStockCuar]([ItemCode], [ItemName], [WhsCode], [OnHand], [CntUnitMsr], [AvgPrice], [validFor], [InvntItem]) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000C9", "UPDATE dbo.[VStockCuar] SET [ItemName]=?, [WhsCode]=?, [OnHand]=?, [CntUnitMsr]=?, [AvgPrice]=?, [validFor]=?, [InvntItem]=?  WHERE [ItemCode] = ?", GX_NOMASK)
         ,new UpdateCursor("T000C10", "DELETE FROM dbo.[VStockCuar]  WHERE [ItemCode] = ?", GX_NOMASK)
         ,new ForEachCursor("T000C11", "SELECT [ItemCode] FROM dbo.[VStockCuar] WITH (NOLOCK) ORDER BY [ItemCode]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 100, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, ((Number) parms[3]).longValue(), 0);
               stmt.setVarchar(5, (String)parms[4], 100, false);
               stmt.setBigDecimal(6, ((Number) parms[5]).longValue(), 0);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 100, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, ((Number) parms[2]).longValue(), 0);
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setBigDecimal(5, ((Number) parms[4]).longValue(), 0);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

final  class bodegacuar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

