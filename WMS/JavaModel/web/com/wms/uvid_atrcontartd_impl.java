/*
               File: uvid_atrcontartd_impl
        Description: UVID_ATRCONTARTD
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:0.73
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

public final  class uvid_atrcontartd_impl extends GXDataArea
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
         Form.getMeta().addItem("description", "UVID_ATRCONTARTD", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public uvid_atrcontartd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public uvid_atrcontartd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( uvid_atrcontartd_impl.class ));
   }

   public uvid_atrcontartd_impl( int remoteHandle ,
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
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "UVID_ATRCONTARTD", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.wms.gx0090"+"',["+"{Ctrl:gx.dom.el('"+"UVID_ATRCONTARTDDOCENTRY"+"'), id:'"+"UVID_ATRCONTARTDDOCENTRY"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"LINEID2"+"'), id:'"+"LINEID2"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTDDocEntry_Internalname, "Doc Entry", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTDDocEntry_Internalname, GXutil.ltrim( localUtil.ntoc( A128UVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTDDocEntry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A128UVID_ATRCONTARTDDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A128UVID_ATRCONTARTDDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTDDocEntry_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTDDocEntry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtLineId2_Internalname, "Line Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtLineId2_Internalname, GXutil.ltrim( localUtil.ntoc( A129LineId2, (byte)(9), (byte)(0), ",", "")), ((edtLineId2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129LineId2), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A129LineId2), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLineId2_Jsonclick, 0, "Attribute", "", "", "", 1, edtLineId2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtVisOrder2_Internalname, "Vis Order", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtVisOrder2_Internalname, GXutil.ltrim( localUtil.ntoc( A145VisOrder2, (byte)(9), (byte)(0), ",", "")), ((edtVisOrder2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A145VisOrder2), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A145VisOrder2), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVisOrder2_Jsonclick, 0, "Attribute", "", "", "", 1, edtVisOrder2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTDObject_Internalname, "Object", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTDObject_Internalname, A146UVID_ATRCONTARTDObject, GXutil.rtrim( localUtil.format( A146UVID_ATRCONTARTDObject, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTDObject_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTDObject_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTDLogInst_Internalname, "Log Inst", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTDLogInst_Internalname, GXutil.ltrim( localUtil.ntoc( A147UVID_ATRCONTARTDLogInst, (byte)(9), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTDLogInst_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A147UVID_ATRCONTARTDLogInst), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A147UVID_ATRCONTARTDLogInst), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTDLogInst_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTDLogInst_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CodAtr2_Internalname, "U_Cod Atr", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CodAtr2_Internalname, A148U_CodAtr2, GXutil.rtrim( localUtil.format( A148U_CodAtr2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CodAtr2_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CodAtr2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTDU_NameAtr_Internalname, "U_Name Atr", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTDU_NameAtr_Internalname, A149UVID_ATRCONTARTDU_NameAtr, GXutil.rtrim( localUtil.format( A149UVID_ATRCONTARTDU_NameAtr, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTDU_NameAtr_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTDU_NameAtr_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTDU_Cualitat_Internalname, "U_Cualitat", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTDU_Cualitat_Internalname, GXutil.rtrim( A150UVID_ATRCONTARTDU_Cualitat), GXutil.rtrim( localUtil.format( A150UVID_ATRCONTARTDU_Cualitat, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTDU_Cualitat_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTDU_Cualitat_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Critico2_Internalname, "U_Critico", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Critico2_Internalname, GXutil.rtrim( A151U_Critico2), GXutil.rtrim( localUtil.format( A151U_Critico2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Critico2_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Critico2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_TipoMues2_Internalname, "U_Tipo Mues", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_TipoMues2_Internalname, A152U_TipoMues2, GXutil.rtrim( localUtil.format( A152U_TipoMues2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_TipoMues2_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_TipoMues2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_AQL2_Internalname, "U_AQL", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_AQL2_Internalname, A153U_AQL2, GXutil.rtrim( localUtil.format( A153U_AQL2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_AQL2_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_AQL2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_TiempoEs_Internalname, "U_Tiempo Es", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_TiempoEs_Internalname, GXutil.ltrim( localUtil.ntoc( A154U_TiempoEs, (byte)(18), (byte)(0), ",", "")), ((edtU_TiempoEs_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A154U_TiempoEs), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A154U_TiempoEs), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_TiempoEs_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_TiempoEs_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_StandAtr2_Internalname, "U_Stand Atr", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_StandAtr2_Internalname, GXutil.ltrim( localUtil.ntoc( A155U_StandAtr2, (byte)(18), (byte)(0), ",", "")), ((edtU_StandAtr2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A155U_StandAtr2), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A155U_StandAtr2), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_StandAtr2_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_StandAtr2_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Minimo2_Internalname, "U_Minimo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Minimo2_Internalname, GXutil.ltrim( localUtil.ntoc( A156U_Minimo2, (byte)(18), (byte)(0), ",", "")), ((edtU_Minimo2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A156U_Minimo2), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A156U_Minimo2), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Minimo2_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Minimo2_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Maximo2_Internalname, "U_Maximo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Maximo2_Internalname, GXutil.ltrim( localUtil.ntoc( A157U_Maximo2, (byte)(18), (byte)(0), ",", "")), ((edtU_Maximo2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A157U_Maximo2), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A157U_Maximo2), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Maximo2_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Maximo2_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTDU_Comment_Internalname, "U_Comment", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtUVID_ATRCONTARTDU_Comment_Internalname, A158UVID_ATRCONTARTDU_Comment, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", (short)(0), 1, edtUVID_ATRCONTARTDU_Comment_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CodEquip2_Internalname, "U_Cod Equip", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CodEquip2_Internalname, A159U_CodEquip2, GXutil.rtrim( localUtil.format( A159U_CodEquip2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CodEquip2_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CodEquip2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Metodo_Internalname, "U_Metodo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Metodo_Internalname, A160U_Metodo, GXutil.rtrim( localUtil.format( A160U_Metodo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Metodo_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Metodo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTD.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_TipoDef2_Internalname, "U_Tipo Def", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_TipoDef2_Internalname, GXutil.rtrim( A161U_TipoDef2), GXutil.rtrim( localUtil.format( A161U_TipoDef2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_TipoDef2_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_TipoDef2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTD.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTD.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTD.htm");
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTDDocEntry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTDDocEntry_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTDDOCENTRY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A128UVID_ATRCONTARTDDocEntry = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
            }
            else
            {
               A128UVID_ATRCONTARTDDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTDDocEntry_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLineId2_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLineId2_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LINEID2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLineId2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129LineId2 = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
            }
            else
            {
               A129LineId2 = (int)(localUtil.ctol( httpContext.cgiGet( edtLineId2_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVisOrder2_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVisOrder2_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VISORDER2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVisOrder2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A145VisOrder2 = 0 ;
               n145VisOrder2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A145VisOrder2", GXutil.ltrim( GXutil.str( A145VisOrder2, 9, 0)));
            }
            else
            {
               A145VisOrder2 = (int)(localUtil.ctol( httpContext.cgiGet( edtVisOrder2_Internalname), ",", ".")) ;
               n145VisOrder2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A145VisOrder2", GXutil.ltrim( GXutil.str( A145VisOrder2, 9, 0)));
            }
            n145VisOrder2 = ((0==A145VisOrder2) ? true : false) ;
            A146UVID_ATRCONTARTDObject = httpContext.cgiGet( edtUVID_ATRCONTARTDObject_Internalname) ;
            n146UVID_ATRCONTARTDObject = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A146UVID_ATRCONTARTDObject", A146UVID_ATRCONTARTDObject);
            n146UVID_ATRCONTARTDObject = ((GXutil.strcmp("", A146UVID_ATRCONTARTDObject)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTDLogInst_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTDLogInst_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTDLOGINST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTDLogInst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A147UVID_ATRCONTARTDLogInst = 0 ;
               n147UVID_ATRCONTARTDLogInst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A147UVID_ATRCONTARTDLogInst", GXutil.ltrim( GXutil.str( A147UVID_ATRCONTARTDLogInst, 9, 0)));
            }
            else
            {
               A147UVID_ATRCONTARTDLogInst = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTDLogInst_Internalname), ",", ".")) ;
               n147UVID_ATRCONTARTDLogInst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A147UVID_ATRCONTARTDLogInst", GXutil.ltrim( GXutil.str( A147UVID_ATRCONTARTDLogInst, 9, 0)));
            }
            n147UVID_ATRCONTARTDLogInst = ((0==A147UVID_ATRCONTARTDLogInst) ? true : false) ;
            A148U_CodAtr2 = httpContext.cgiGet( edtU_CodAtr2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A148U_CodAtr2", A148U_CodAtr2);
            A149UVID_ATRCONTARTDU_NameAtr = httpContext.cgiGet( edtUVID_ATRCONTARTDU_NameAtr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A149UVID_ATRCONTARTDU_NameAtr", A149UVID_ATRCONTARTDU_NameAtr);
            A150UVID_ATRCONTARTDU_Cualitat = httpContext.cgiGet( edtUVID_ATRCONTARTDU_Cualitat_Internalname) ;
            n150UVID_ATRCONTARTDU_Cualitat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A150UVID_ATRCONTARTDU_Cualitat", A150UVID_ATRCONTARTDU_Cualitat);
            n150UVID_ATRCONTARTDU_Cualitat = ((GXutil.strcmp("", A150UVID_ATRCONTARTDU_Cualitat)==0) ? true : false) ;
            A151U_Critico2 = httpContext.cgiGet( edtU_Critico2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A151U_Critico2", A151U_Critico2);
            A152U_TipoMues2 = httpContext.cgiGet( edtU_TipoMues2_Internalname) ;
            n152U_TipoMues2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A152U_TipoMues2", A152U_TipoMues2);
            n152U_TipoMues2 = ((GXutil.strcmp("", A152U_TipoMues2)==0) ? true : false) ;
            A153U_AQL2 = httpContext.cgiGet( edtU_AQL2_Internalname) ;
            n153U_AQL2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A153U_AQL2", A153U_AQL2);
            n153U_AQL2 = ((GXutil.strcmp("", A153U_AQL2)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_TiempoEs_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_TiempoEs_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_TIEMPOES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_TiempoEs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A154U_TiempoEs = 0 ;
               n154U_TiempoEs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A154U_TiempoEs", GXutil.ltrim( GXutil.str( A154U_TiempoEs, 18, 0)));
            }
            else
            {
               A154U_TiempoEs = localUtil.ctol( httpContext.cgiGet( edtU_TiempoEs_Internalname), ",", ".") ;
               n154U_TiempoEs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A154U_TiempoEs", GXutil.ltrim( GXutil.str( A154U_TiempoEs, 18, 0)));
            }
            n154U_TiempoEs = ((0==A154U_TiempoEs) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_StandAtr2_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_StandAtr2_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_STANDATR2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_StandAtr2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A155U_StandAtr2 = 0 ;
               n155U_StandAtr2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A155U_StandAtr2", GXutil.ltrim( GXutil.str( A155U_StandAtr2, 18, 0)));
            }
            else
            {
               A155U_StandAtr2 = localUtil.ctol( httpContext.cgiGet( edtU_StandAtr2_Internalname), ",", ".") ;
               n155U_StandAtr2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A155U_StandAtr2", GXutil.ltrim( GXutil.str( A155U_StandAtr2, 18, 0)));
            }
            n155U_StandAtr2 = ((0==A155U_StandAtr2) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_Minimo2_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_Minimo2_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_MINIMO2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_Minimo2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A156U_Minimo2 = 0 ;
               n156U_Minimo2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A156U_Minimo2", GXutil.ltrim( GXutil.str( A156U_Minimo2, 18, 0)));
            }
            else
            {
               A156U_Minimo2 = localUtil.ctol( httpContext.cgiGet( edtU_Minimo2_Internalname), ",", ".") ;
               n156U_Minimo2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A156U_Minimo2", GXutil.ltrim( GXutil.str( A156U_Minimo2, 18, 0)));
            }
            n156U_Minimo2 = ((0==A156U_Minimo2) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_Maximo2_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_Maximo2_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_MAXIMO2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_Maximo2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A157U_Maximo2 = 0 ;
               n157U_Maximo2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A157U_Maximo2", GXutil.ltrim( GXutil.str( A157U_Maximo2, 18, 0)));
            }
            else
            {
               A157U_Maximo2 = localUtil.ctol( httpContext.cgiGet( edtU_Maximo2_Internalname), ",", ".") ;
               n157U_Maximo2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A157U_Maximo2", GXutil.ltrim( GXutil.str( A157U_Maximo2, 18, 0)));
            }
            n157U_Maximo2 = ((0==A157U_Maximo2) ? true : false) ;
            A158UVID_ATRCONTARTDU_Comment = httpContext.cgiGet( edtUVID_ATRCONTARTDU_Comment_Internalname) ;
            n158UVID_ATRCONTARTDU_Comment = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A158UVID_ATRCONTARTDU_Comment", A158UVID_ATRCONTARTDU_Comment);
            n158UVID_ATRCONTARTDU_Comment = ((GXutil.strcmp("", A158UVID_ATRCONTARTDU_Comment)==0) ? true : false) ;
            A159U_CodEquip2 = httpContext.cgiGet( edtU_CodEquip2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A159U_CodEquip2", A159U_CodEquip2);
            A160U_Metodo = httpContext.cgiGet( edtU_Metodo_Internalname) ;
            n160U_Metodo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A160U_Metodo", A160U_Metodo);
            n160U_Metodo = ((GXutil.strcmp("", A160U_Metodo)==0) ? true : false) ;
            A161U_TipoDef2 = httpContext.cgiGet( edtU_TipoDef2_Internalname) ;
            n161U_TipoDef2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A161U_TipoDef2", A161U_TipoDef2);
            n161U_TipoDef2 = ((GXutil.strcmp("", A161U_TipoDef2)==0) ? true : false) ;
            /* Read saved values. */
            Z128UVID_ATRCONTARTDDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( "Z128UVID_ATRCONTARTDDocEntry"), ",", ".")) ;
            Z129LineId2 = (int)(localUtil.ctol( httpContext.cgiGet( "Z129LineId2"), ",", ".")) ;
            Z145VisOrder2 = (int)(localUtil.ctol( httpContext.cgiGet( "Z145VisOrder2"), ",", ".")) ;
            n145VisOrder2 = ((0==A145VisOrder2) ? true : false) ;
            Z146UVID_ATRCONTARTDObject = httpContext.cgiGet( "Z146UVID_ATRCONTARTDObject") ;
            n146UVID_ATRCONTARTDObject = ((GXutil.strcmp("", A146UVID_ATRCONTARTDObject)==0) ? true : false) ;
            Z147UVID_ATRCONTARTDLogInst = (int)(localUtil.ctol( httpContext.cgiGet( "Z147UVID_ATRCONTARTDLogInst"), ",", ".")) ;
            n147UVID_ATRCONTARTDLogInst = ((0==A147UVID_ATRCONTARTDLogInst) ? true : false) ;
            Z148U_CodAtr2 = httpContext.cgiGet( "Z148U_CodAtr2") ;
            Z149UVID_ATRCONTARTDU_NameAtr = httpContext.cgiGet( "Z149UVID_ATRCONTARTDU_NameAtr") ;
            Z150UVID_ATRCONTARTDU_Cualitat = httpContext.cgiGet( "Z150UVID_ATRCONTARTDU_Cualitat") ;
            n150UVID_ATRCONTARTDU_Cualitat = ((GXutil.strcmp("", A150UVID_ATRCONTARTDU_Cualitat)==0) ? true : false) ;
            Z151U_Critico2 = httpContext.cgiGet( "Z151U_Critico2") ;
            Z152U_TipoMues2 = httpContext.cgiGet( "Z152U_TipoMues2") ;
            n152U_TipoMues2 = ((GXutil.strcmp("", A152U_TipoMues2)==0) ? true : false) ;
            Z153U_AQL2 = httpContext.cgiGet( "Z153U_AQL2") ;
            n153U_AQL2 = ((GXutil.strcmp("", A153U_AQL2)==0) ? true : false) ;
            Z154U_TiempoEs = localUtil.ctol( httpContext.cgiGet( "Z154U_TiempoEs"), ",", ".") ;
            n154U_TiempoEs = ((0==A154U_TiempoEs) ? true : false) ;
            Z155U_StandAtr2 = localUtil.ctol( httpContext.cgiGet( "Z155U_StandAtr2"), ",", ".") ;
            n155U_StandAtr2 = ((0==A155U_StandAtr2) ? true : false) ;
            Z156U_Minimo2 = localUtil.ctol( httpContext.cgiGet( "Z156U_Minimo2"), ",", ".") ;
            n156U_Minimo2 = ((0==A156U_Minimo2) ? true : false) ;
            Z157U_Maximo2 = localUtil.ctol( httpContext.cgiGet( "Z157U_Maximo2"), ",", ".") ;
            n157U_Maximo2 = ((0==A157U_Maximo2) ? true : false) ;
            Z158UVID_ATRCONTARTDU_Comment = httpContext.cgiGet( "Z158UVID_ATRCONTARTDU_Comment") ;
            n158UVID_ATRCONTARTDU_Comment = ((GXutil.strcmp("", A158UVID_ATRCONTARTDU_Comment)==0) ? true : false) ;
            Z159U_CodEquip2 = httpContext.cgiGet( "Z159U_CodEquip2") ;
            Z160U_Metodo = httpContext.cgiGet( "Z160U_Metodo") ;
            n160U_Metodo = ((GXutil.strcmp("", A160U_Metodo)==0) ? true : false) ;
            Z161U_TipoDef2 = httpContext.cgiGet( "Z161U_TipoDef2") ;
            n161U_TipoDef2 = ((GXutil.strcmp("", A161U_TipoDef2)==0) ? true : false) ;
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
               A128UVID_ATRCONTARTDDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
               A129LineId2 = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
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
            initAll089( ) ;
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
      disableAttributes089( ) ;
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

   public void resetCaption080( )
   {
   }

   public void zm089( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z145VisOrder2 = T00083_A145VisOrder2[0] ;
            Z146UVID_ATRCONTARTDObject = T00083_A146UVID_ATRCONTARTDObject[0] ;
            Z147UVID_ATRCONTARTDLogInst = T00083_A147UVID_ATRCONTARTDLogInst[0] ;
            Z148U_CodAtr2 = T00083_A148U_CodAtr2[0] ;
            Z149UVID_ATRCONTARTDU_NameAtr = T00083_A149UVID_ATRCONTARTDU_NameAtr[0] ;
            Z150UVID_ATRCONTARTDU_Cualitat = T00083_A150UVID_ATRCONTARTDU_Cualitat[0] ;
            Z151U_Critico2 = T00083_A151U_Critico2[0] ;
            Z152U_TipoMues2 = T00083_A152U_TipoMues2[0] ;
            Z153U_AQL2 = T00083_A153U_AQL2[0] ;
            Z154U_TiempoEs = T00083_A154U_TiempoEs[0] ;
            Z155U_StandAtr2 = T00083_A155U_StandAtr2[0] ;
            Z156U_Minimo2 = T00083_A156U_Minimo2[0] ;
            Z157U_Maximo2 = T00083_A157U_Maximo2[0] ;
            Z158UVID_ATRCONTARTDU_Comment = T00083_A158UVID_ATRCONTARTDU_Comment[0] ;
            Z159U_CodEquip2 = T00083_A159U_CodEquip2[0] ;
            Z160U_Metodo = T00083_A160U_Metodo[0] ;
            Z161U_TipoDef2 = T00083_A161U_TipoDef2[0] ;
         }
         else
         {
            Z145VisOrder2 = A145VisOrder2 ;
            Z146UVID_ATRCONTARTDObject = A146UVID_ATRCONTARTDObject ;
            Z147UVID_ATRCONTARTDLogInst = A147UVID_ATRCONTARTDLogInst ;
            Z148U_CodAtr2 = A148U_CodAtr2 ;
            Z149UVID_ATRCONTARTDU_NameAtr = A149UVID_ATRCONTARTDU_NameAtr ;
            Z150UVID_ATRCONTARTDU_Cualitat = A150UVID_ATRCONTARTDU_Cualitat ;
            Z151U_Critico2 = A151U_Critico2 ;
            Z152U_TipoMues2 = A152U_TipoMues2 ;
            Z153U_AQL2 = A153U_AQL2 ;
            Z154U_TiempoEs = A154U_TiempoEs ;
            Z155U_StandAtr2 = A155U_StandAtr2 ;
            Z156U_Minimo2 = A156U_Minimo2 ;
            Z157U_Maximo2 = A157U_Maximo2 ;
            Z158UVID_ATRCONTARTDU_Comment = A158UVID_ATRCONTARTDU_Comment ;
            Z159U_CodEquip2 = A159U_CodEquip2 ;
            Z160U_Metodo = A160U_Metodo ;
            Z161U_TipoDef2 = A161U_TipoDef2 ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z128UVID_ATRCONTARTDDocEntry = A128UVID_ATRCONTARTDDocEntry ;
         Z129LineId2 = A129LineId2 ;
         Z145VisOrder2 = A145VisOrder2 ;
         Z146UVID_ATRCONTARTDObject = A146UVID_ATRCONTARTDObject ;
         Z147UVID_ATRCONTARTDLogInst = A147UVID_ATRCONTARTDLogInst ;
         Z148U_CodAtr2 = A148U_CodAtr2 ;
         Z149UVID_ATRCONTARTDU_NameAtr = A149UVID_ATRCONTARTDU_NameAtr ;
         Z150UVID_ATRCONTARTDU_Cualitat = A150UVID_ATRCONTARTDU_Cualitat ;
         Z151U_Critico2 = A151U_Critico2 ;
         Z152U_TipoMues2 = A152U_TipoMues2 ;
         Z153U_AQL2 = A153U_AQL2 ;
         Z154U_TiempoEs = A154U_TiempoEs ;
         Z155U_StandAtr2 = A155U_StandAtr2 ;
         Z156U_Minimo2 = A156U_Minimo2 ;
         Z157U_Maximo2 = A157U_Maximo2 ;
         Z158UVID_ATRCONTARTDU_Comment = A158UVID_ATRCONTARTDU_Comment ;
         Z159U_CodEquip2 = A159U_CodEquip2 ;
         Z160U_Metodo = A160U_Metodo ;
         Z161U_TipoDef2 = A161U_TipoDef2 ;
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

   public void load089( )
   {
      /* Using cursor T00084 */
      pr_fusquim_sap.execute(2, new Object[] {new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A129LineId2)});
      if ( (pr_fusquim_sap.getStatus(2) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A145VisOrder2 = T00084_A145VisOrder2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A145VisOrder2", GXutil.ltrim( GXutil.str( A145VisOrder2, 9, 0)));
         n145VisOrder2 = T00084_n145VisOrder2[0] ;
         A146UVID_ATRCONTARTDObject = T00084_A146UVID_ATRCONTARTDObject[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146UVID_ATRCONTARTDObject", A146UVID_ATRCONTARTDObject);
         n146UVID_ATRCONTARTDObject = T00084_n146UVID_ATRCONTARTDObject[0] ;
         A147UVID_ATRCONTARTDLogInst = T00084_A147UVID_ATRCONTARTDLogInst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147UVID_ATRCONTARTDLogInst", GXutil.ltrim( GXutil.str( A147UVID_ATRCONTARTDLogInst, 9, 0)));
         n147UVID_ATRCONTARTDLogInst = T00084_n147UVID_ATRCONTARTDLogInst[0] ;
         A148U_CodAtr2 = T00084_A148U_CodAtr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148U_CodAtr2", A148U_CodAtr2);
         A149UVID_ATRCONTARTDU_NameAtr = T00084_A149UVID_ATRCONTARTDU_NameAtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149UVID_ATRCONTARTDU_NameAtr", A149UVID_ATRCONTARTDU_NameAtr);
         A150UVID_ATRCONTARTDU_Cualitat = T00084_A150UVID_ATRCONTARTDU_Cualitat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150UVID_ATRCONTARTDU_Cualitat", A150UVID_ATRCONTARTDU_Cualitat);
         n150UVID_ATRCONTARTDU_Cualitat = T00084_n150UVID_ATRCONTARTDU_Cualitat[0] ;
         A151U_Critico2 = T00084_A151U_Critico2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A151U_Critico2", A151U_Critico2);
         A152U_TipoMues2 = T00084_A152U_TipoMues2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152U_TipoMues2", A152U_TipoMues2);
         n152U_TipoMues2 = T00084_n152U_TipoMues2[0] ;
         A153U_AQL2 = T00084_A153U_AQL2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153U_AQL2", A153U_AQL2);
         n153U_AQL2 = T00084_n153U_AQL2[0] ;
         A154U_TiempoEs = T00084_A154U_TiempoEs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154U_TiempoEs", GXutil.ltrim( GXutil.str( A154U_TiempoEs, 18, 0)));
         n154U_TiempoEs = T00084_n154U_TiempoEs[0] ;
         A155U_StandAtr2 = T00084_A155U_StandAtr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155U_StandAtr2", GXutil.ltrim( GXutil.str( A155U_StandAtr2, 18, 0)));
         n155U_StandAtr2 = T00084_n155U_StandAtr2[0] ;
         A156U_Minimo2 = T00084_A156U_Minimo2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156U_Minimo2", GXutil.ltrim( GXutil.str( A156U_Minimo2, 18, 0)));
         n156U_Minimo2 = T00084_n156U_Minimo2[0] ;
         A157U_Maximo2 = T00084_A157U_Maximo2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A157U_Maximo2", GXutil.ltrim( GXutil.str( A157U_Maximo2, 18, 0)));
         n157U_Maximo2 = T00084_n157U_Maximo2[0] ;
         A158UVID_ATRCONTARTDU_Comment = T00084_A158UVID_ATRCONTARTDU_Comment[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158UVID_ATRCONTARTDU_Comment", A158UVID_ATRCONTARTDU_Comment);
         n158UVID_ATRCONTARTDU_Comment = T00084_n158UVID_ATRCONTARTDU_Comment[0] ;
         A159U_CodEquip2 = T00084_A159U_CodEquip2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A159U_CodEquip2", A159U_CodEquip2);
         A160U_Metodo = T00084_A160U_Metodo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160U_Metodo", A160U_Metodo);
         n160U_Metodo = T00084_n160U_Metodo[0] ;
         A161U_TipoDef2 = T00084_A161U_TipoDef2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A161U_TipoDef2", A161U_TipoDef2);
         n161U_TipoDef2 = T00084_n161U_TipoDef2[0] ;
         zm089( -1) ;
      }
      pr_fusquim_sap.close(2);
      onLoadActions089( ) ;
   }

   public void onLoadActions089( )
   {
   }

   public void checkExtendedTable089( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors089( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey089( )
   {
      /* Using cursor T00085 */
      pr_fusquim_sap.execute(3, new Object[] {new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A129LineId2)});
      if ( (pr_fusquim_sap.getStatus(3) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_fusquim_sap.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00083 */
      pr_fusquim_sap.execute(1, new Object[] {new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A129LineId2)});
      if ( (pr_fusquim_sap.getStatus(1) != 101) )
      {
         zm089( 1) ;
         RcdFound9 = (short)(1) ;
         A128UVID_ATRCONTARTDDocEntry = T00083_A128UVID_ATRCONTARTDDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
         A129LineId2 = T00083_A129LineId2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
         A145VisOrder2 = T00083_A145VisOrder2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A145VisOrder2", GXutil.ltrim( GXutil.str( A145VisOrder2, 9, 0)));
         n145VisOrder2 = T00083_n145VisOrder2[0] ;
         A146UVID_ATRCONTARTDObject = T00083_A146UVID_ATRCONTARTDObject[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146UVID_ATRCONTARTDObject", A146UVID_ATRCONTARTDObject);
         n146UVID_ATRCONTARTDObject = T00083_n146UVID_ATRCONTARTDObject[0] ;
         A147UVID_ATRCONTARTDLogInst = T00083_A147UVID_ATRCONTARTDLogInst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147UVID_ATRCONTARTDLogInst", GXutil.ltrim( GXutil.str( A147UVID_ATRCONTARTDLogInst, 9, 0)));
         n147UVID_ATRCONTARTDLogInst = T00083_n147UVID_ATRCONTARTDLogInst[0] ;
         A148U_CodAtr2 = T00083_A148U_CodAtr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148U_CodAtr2", A148U_CodAtr2);
         A149UVID_ATRCONTARTDU_NameAtr = T00083_A149UVID_ATRCONTARTDU_NameAtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149UVID_ATRCONTARTDU_NameAtr", A149UVID_ATRCONTARTDU_NameAtr);
         A150UVID_ATRCONTARTDU_Cualitat = T00083_A150UVID_ATRCONTARTDU_Cualitat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150UVID_ATRCONTARTDU_Cualitat", A150UVID_ATRCONTARTDU_Cualitat);
         n150UVID_ATRCONTARTDU_Cualitat = T00083_n150UVID_ATRCONTARTDU_Cualitat[0] ;
         A151U_Critico2 = T00083_A151U_Critico2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A151U_Critico2", A151U_Critico2);
         A152U_TipoMues2 = T00083_A152U_TipoMues2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152U_TipoMues2", A152U_TipoMues2);
         n152U_TipoMues2 = T00083_n152U_TipoMues2[0] ;
         A153U_AQL2 = T00083_A153U_AQL2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153U_AQL2", A153U_AQL2);
         n153U_AQL2 = T00083_n153U_AQL2[0] ;
         A154U_TiempoEs = T00083_A154U_TiempoEs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154U_TiempoEs", GXutil.ltrim( GXutil.str( A154U_TiempoEs, 18, 0)));
         n154U_TiempoEs = T00083_n154U_TiempoEs[0] ;
         A155U_StandAtr2 = T00083_A155U_StandAtr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155U_StandAtr2", GXutil.ltrim( GXutil.str( A155U_StandAtr2, 18, 0)));
         n155U_StandAtr2 = T00083_n155U_StandAtr2[0] ;
         A156U_Minimo2 = T00083_A156U_Minimo2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156U_Minimo2", GXutil.ltrim( GXutil.str( A156U_Minimo2, 18, 0)));
         n156U_Minimo2 = T00083_n156U_Minimo2[0] ;
         A157U_Maximo2 = T00083_A157U_Maximo2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A157U_Maximo2", GXutil.ltrim( GXutil.str( A157U_Maximo2, 18, 0)));
         n157U_Maximo2 = T00083_n157U_Maximo2[0] ;
         A158UVID_ATRCONTARTDU_Comment = T00083_A158UVID_ATRCONTARTDU_Comment[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158UVID_ATRCONTARTDU_Comment", A158UVID_ATRCONTARTDU_Comment);
         n158UVID_ATRCONTARTDU_Comment = T00083_n158UVID_ATRCONTARTDU_Comment[0] ;
         A159U_CodEquip2 = T00083_A159U_CodEquip2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A159U_CodEquip2", A159U_CodEquip2);
         A160U_Metodo = T00083_A160U_Metodo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160U_Metodo", A160U_Metodo);
         n160U_Metodo = T00083_n160U_Metodo[0] ;
         A161U_TipoDef2 = T00083_A161U_TipoDef2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A161U_TipoDef2", A161U_TipoDef2);
         n161U_TipoDef2 = T00083_n161U_TipoDef2[0] ;
         Z128UVID_ATRCONTARTDDocEntry = A128UVID_ATRCONTARTDDocEntry ;
         Z129LineId2 = A129LineId2 ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load089( ) ;
         if ( AnyError == 1 )
         {
            RcdFound9 = (short)(0) ;
            initializeNonKey089( ) ;
         }
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound9 = (short)(0) ;
         initializeNonKey089( ) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_fusquim_sap.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey089( ) ;
      if ( RcdFound9 == 0 )
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
      RcdFound9 = (short)(0) ;
      /* Using cursor T00086 */
      pr_fusquim_sap.execute(4, new Object[] {new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A129LineId2)});
      if ( (pr_fusquim_sap.getStatus(4) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T00086_A128UVID_ATRCONTARTDDocEntry[0] < A128UVID_ATRCONTARTDDocEntry ) || ( T00086_A128UVID_ATRCONTARTDDocEntry[0] == A128UVID_ATRCONTARTDDocEntry ) && ( T00086_A129LineId2[0] < A129LineId2 ) ) )
         {
            pr_fusquim_sap.readNext(4);
         }
         if ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T00086_A128UVID_ATRCONTARTDDocEntry[0] > A128UVID_ATRCONTARTDDocEntry ) || ( T00086_A128UVID_ATRCONTARTDDocEntry[0] == A128UVID_ATRCONTARTDDocEntry ) && ( T00086_A129LineId2[0] > A129LineId2 ) ) )
         {
            A128UVID_ATRCONTARTDDocEntry = T00086_A128UVID_ATRCONTARTDDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
            A129LineId2 = T00086_A129LineId2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
            RcdFound9 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(4);
   }

   public void move_previous( )
   {
      RcdFound9 = (short)(0) ;
      /* Using cursor T00087 */
      pr_fusquim_sap.execute(5, new Object[] {new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A129LineId2)});
      if ( (pr_fusquim_sap.getStatus(5) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T00087_A128UVID_ATRCONTARTDDocEntry[0] > A128UVID_ATRCONTARTDDocEntry ) || ( T00087_A128UVID_ATRCONTARTDDocEntry[0] == A128UVID_ATRCONTARTDDocEntry ) && ( T00087_A129LineId2[0] > A129LineId2 ) ) )
         {
            pr_fusquim_sap.readNext(5);
         }
         if ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T00087_A128UVID_ATRCONTARTDDocEntry[0] < A128UVID_ATRCONTARTDDocEntry ) || ( T00087_A128UVID_ATRCONTARTDDocEntry[0] == A128UVID_ATRCONTARTDDocEntry ) && ( T00087_A129LineId2[0] < A129LineId2 ) ) )
         {
            A128UVID_ATRCONTARTDDocEntry = T00087_A128UVID_ATRCONTARTDDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
            A129LineId2 = T00087_A129LineId2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
            RcdFound9 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey089( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert089( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound9 == 1 )
         {
            if ( ( A128UVID_ATRCONTARTDDocEntry != Z128UVID_ATRCONTARTDDocEntry ) || ( A129LineId2 != Z129LineId2 ) )
            {
               A128UVID_ATRCONTARTDDocEntry = Z128UVID_ATRCONTARTDDocEntry ;
               httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
               A129LineId2 = Z129LineId2 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "UVID_ATRCONTARTDDOCENTRY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update089( ) ;
               GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A128UVID_ATRCONTARTDDocEntry != Z128UVID_ATRCONTARTDDocEntry ) || ( A129LineId2 != Z129LineId2 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert089( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "UVID_ATRCONTARTDDOCENTRY");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert089( ) ;
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
      if ( ( A128UVID_ATRCONTARTDDocEntry != Z128UVID_ATRCONTARTDDocEntry ) || ( A129LineId2 != Z129LineId2 ) )
      {
         A128UVID_ATRCONTARTDDocEntry = Z128UVID_ATRCONTARTDDocEntry ;
         httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
         A129LineId2 = Z129LineId2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "UVID_ATRCONTARTDDOCENTRY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
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
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "UVID_ATRCONTARTDDOCENTRY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUVID_ATRCONTARTDDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVisOrder2_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart089( ) ;
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVisOrder2_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd089( ) ;
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
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVisOrder2_Internalname ;
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
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVisOrder2_Internalname ;
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
      scanStart089( ) ;
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound9 != 0 )
         {
            scanNext089( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVisOrder2_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd089( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency089( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00082 */
         pr_fusquim_sap.execute(0, new Object[] {new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A129LineId2)});
         if ( (pr_fusquim_sap.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_ATRCONTARTD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_fusquim_sap.getStatus(0) == 101) || ( Z145VisOrder2 != T00082_A145VisOrder2[0] ) || ( GXutil.strcmp(Z146UVID_ATRCONTARTDObject, T00082_A146UVID_ATRCONTARTDObject[0]) != 0 ) || ( Z147UVID_ATRCONTARTDLogInst != T00082_A147UVID_ATRCONTARTDLogInst[0] ) || ( GXutil.strcmp(Z148U_CodAtr2, T00082_A148U_CodAtr2[0]) != 0 ) || ( GXutil.strcmp(Z149UVID_ATRCONTARTDU_NameAtr, T00082_A149UVID_ATRCONTARTDU_NameAtr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z150UVID_ATRCONTARTDU_Cualitat, T00082_A150UVID_ATRCONTARTDU_Cualitat[0]) != 0 ) || ( GXutil.strcmp(Z151U_Critico2, T00082_A151U_Critico2[0]) != 0 ) || ( GXutil.strcmp(Z152U_TipoMues2, T00082_A152U_TipoMues2[0]) != 0 ) || ( GXutil.strcmp(Z153U_AQL2, T00082_A153U_AQL2[0]) != 0 ) || ( Z154U_TiempoEs != T00082_A154U_TiempoEs[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z155U_StandAtr2 != T00082_A155U_StandAtr2[0] ) || ( Z156U_Minimo2 != T00082_A156U_Minimo2[0] ) || ( Z157U_Maximo2 != T00082_A157U_Maximo2[0] ) || ( GXutil.strcmp(Z158UVID_ATRCONTARTDU_Comment, T00082_A158UVID_ATRCONTARTDU_Comment[0]) != 0 ) || ( GXutil.strcmp(Z159U_CodEquip2, T00082_A159U_CodEquip2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z160U_Metodo, T00082_A160U_Metodo[0]) != 0 ) || ( GXutil.strcmp(Z161U_TipoDef2, T00082_A161U_TipoDef2[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"@VID_ATRCONTARTD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert089( )
   {
      beforeValidate089( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable089( ) ;
      }
      if ( AnyError == 0 )
      {
         zm089( 0) ;
         checkOptimisticConcurrency089( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm089( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert089( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00088 */
                  pr_fusquim_sap.execute(6, new Object[] {new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A129LineId2), new Boolean(n145VisOrder2), new Integer(A145VisOrder2), new Boolean(n146UVID_ATRCONTARTDObject), A146UVID_ATRCONTARTDObject, new Boolean(n147UVID_ATRCONTARTDLogInst), new Integer(A147UVID_ATRCONTARTDLogInst), A148U_CodAtr2, A149UVID_ATRCONTARTDU_NameAtr, new Boolean(n150UVID_ATRCONTARTDU_Cualitat), A150UVID_ATRCONTARTDU_Cualitat, A151U_Critico2, new Boolean(n152U_TipoMues2), A152U_TipoMues2, new Boolean(n153U_AQL2), A153U_AQL2, new Boolean(n154U_TiempoEs), new Long(A154U_TiempoEs), new Boolean(n155U_StandAtr2), new Long(A155U_StandAtr2), new Boolean(n156U_Minimo2), new Long(A156U_Minimo2), new Boolean(n157U_Maximo2), new Long(A157U_Maximo2), new Boolean(n158UVID_ATRCONTARTDU_Comment), A158UVID_ATRCONTARTDU_Comment, A159U_CodEquip2, new Boolean(n160U_Metodo), A160U_Metodo, new Boolean(n161U_TipoDef2), A161U_TipoDef2});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_ATRCONTARTD") ;
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
                        resetCaption080( ) ;
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
            load089( ) ;
         }
         endLevel089( ) ;
      }
      closeExtendedTableCursors089( ) ;
   }

   public void update089( )
   {
      beforeValidate089( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable089( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency089( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm089( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate089( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00089 */
                  pr_fusquim_sap.execute(7, new Object[] {new Boolean(n145VisOrder2), new Integer(A145VisOrder2), new Boolean(n146UVID_ATRCONTARTDObject), A146UVID_ATRCONTARTDObject, new Boolean(n147UVID_ATRCONTARTDLogInst), new Integer(A147UVID_ATRCONTARTDLogInst), A148U_CodAtr2, A149UVID_ATRCONTARTDU_NameAtr, new Boolean(n150UVID_ATRCONTARTDU_Cualitat), A150UVID_ATRCONTARTDU_Cualitat, A151U_Critico2, new Boolean(n152U_TipoMues2), A152U_TipoMues2, new Boolean(n153U_AQL2), A153U_AQL2, new Boolean(n154U_TiempoEs), new Long(A154U_TiempoEs), new Boolean(n155U_StandAtr2), new Long(A155U_StandAtr2), new Boolean(n156U_Minimo2), new Long(A156U_Minimo2), new Boolean(n157U_Maximo2), new Long(A157U_Maximo2), new Boolean(n158UVID_ATRCONTARTDU_Comment), A158UVID_ATRCONTARTDU_Comment, A159U_CodEquip2, new Boolean(n160U_Metodo), A160U_Metodo, new Boolean(n161U_TipoDef2), A161U_TipoDef2, new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A129LineId2)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_ATRCONTARTD") ;
                  if ( (pr_fusquim_sap.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_ATRCONTARTD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate089( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption080( ) ;
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
         endLevel089( ) ;
      }
      closeExtendedTableCursors089( ) ;
   }

   public void deferredUpdate089( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate089( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency089( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls089( ) ;
         afterConfirm089( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete089( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000810 */
               pr_fusquim_sap.execute(8, new Object[] {new Integer(A128UVID_ATRCONTARTDDocEntry), new Integer(A129LineId2)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_ATRCONTARTD") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound9 == 0 )
                     {
                        initAll089( ) ;
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
                     resetCaption080( ) ;
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
      sMode9 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel089( ) ;
      Gx_mode = sMode9 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls089( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel089( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_fusquim_sap.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete089( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "uvid_atrcontartd");
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "uvid_atrcontartd");
         if ( AnyError == 0 )
         {
            confirmValues080( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "uvid_atrcontartd");
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "uvid_atrcontartd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart089( )
   {
      /* Using cursor T000811 */
      pr_fusquim_sap.execute(9);
      RcdFound9 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A128UVID_ATRCONTARTDDocEntry = T000811_A128UVID_ATRCONTARTDDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
         A129LineId2 = T000811_A129LineId2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext089( )
   {
      /* Scan next routine */
      pr_fusquim_sap.readNext(9);
      RcdFound9 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A128UVID_ATRCONTARTDDocEntry = T000811_A128UVID_ATRCONTARTDDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
         A129LineId2 = T000811_A129LineId2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
      }
   }

   public void scanEnd089( )
   {
      pr_fusquim_sap.close(9);
   }

   public void afterConfirm089( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert089( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate089( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete089( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete089( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate089( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes089( )
   {
      edtUVID_ATRCONTARTDDocEntry_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTDDocEntry_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTDDocEntry_Enabled, 5, 0)), true);
      edtLineId2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLineId2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtLineId2_Enabled, 5, 0)), true);
      edtVisOrder2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVisOrder2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtVisOrder2_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTDObject_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTDObject_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTDObject_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTDLogInst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTDLogInst_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTDLogInst_Enabled, 5, 0)), true);
      edtU_CodAtr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CodAtr2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CodAtr2_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTDU_NameAtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTDU_NameAtr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTDU_NameAtr_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTDU_Cualitat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTDU_Cualitat_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTDU_Cualitat_Enabled, 5, 0)), true);
      edtU_Critico2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Critico2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Critico2_Enabled, 5, 0)), true);
      edtU_TipoMues2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_TipoMues2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_TipoMues2_Enabled, 5, 0)), true);
      edtU_AQL2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_AQL2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_AQL2_Enabled, 5, 0)), true);
      edtU_TiempoEs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_TiempoEs_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_TiempoEs_Enabled, 5, 0)), true);
      edtU_StandAtr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_StandAtr2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_StandAtr2_Enabled, 5, 0)), true);
      edtU_Minimo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Minimo2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Minimo2_Enabled, 5, 0)), true);
      edtU_Maximo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Maximo2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Maximo2_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTDU_Comment_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTDU_Comment_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTDU_Comment_Enabled, 5, 0)), true);
      edtU_CodEquip2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CodEquip2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CodEquip2_Enabled, 5, 0)), true);
      edtU_Metodo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Metodo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Metodo_Enabled, 5, 0)), true);
      edtU_TipoDef2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_TipoDef2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_TipoDef2_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues080( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20181121023412");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.uvid_atrcontartd") +"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( localUtil.ntoc( Z128UVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z129LineId2", GXutil.ltrim( localUtil.ntoc( Z129LineId2, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z145VisOrder2", GXutil.ltrim( localUtil.ntoc( Z145VisOrder2, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z146UVID_ATRCONTARTDObject", Z146UVID_ATRCONTARTDObject);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z147UVID_ATRCONTARTDLogInst", GXutil.ltrim( localUtil.ntoc( Z147UVID_ATRCONTARTDLogInst, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z148U_CodAtr2", Z148U_CodAtr2);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z149UVID_ATRCONTARTDU_NameAtr", Z149UVID_ATRCONTARTDU_NameAtr);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z150UVID_ATRCONTARTDU_Cualitat", GXutil.rtrim( Z150UVID_ATRCONTARTDU_Cualitat));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z151U_Critico2", GXutil.rtrim( Z151U_Critico2));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z152U_TipoMues2", Z152U_TipoMues2);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z153U_AQL2", Z153U_AQL2);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z154U_TiempoEs", GXutil.ltrim( localUtil.ntoc( Z154U_TiempoEs, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z155U_StandAtr2", GXutil.ltrim( localUtil.ntoc( Z155U_StandAtr2, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z156U_Minimo2", GXutil.ltrim( localUtil.ntoc( Z156U_Minimo2, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z157U_Maximo2", GXutil.ltrim( localUtil.ntoc( Z157U_Maximo2, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z158UVID_ATRCONTARTDU_Comment", Z158UVID_ATRCONTARTDU_Comment);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z159U_CodEquip2", Z159U_CodEquip2);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z160U_Metodo", Z160U_Metodo);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z161U_TipoDef2", GXutil.rtrim( Z161U_TipoDef2));
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
      return formatLink("com.wms.uvid_atrcontartd")  ;
   }

   public String getPgmname( )
   {
      return "UVID_ATRCONTARTD" ;
   }

   public String getPgmdesc( )
   {
      return "UVID_ATRCONTARTD" ;
   }

   public void initializeNonKey089( )
   {
      A145VisOrder2 = 0 ;
      n145VisOrder2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A145VisOrder2", GXutil.ltrim( GXutil.str( A145VisOrder2, 9, 0)));
      n145VisOrder2 = ((0==A145VisOrder2) ? true : false) ;
      A146UVID_ATRCONTARTDObject = "" ;
      n146UVID_ATRCONTARTDObject = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A146UVID_ATRCONTARTDObject", A146UVID_ATRCONTARTDObject);
      n146UVID_ATRCONTARTDObject = ((GXutil.strcmp("", A146UVID_ATRCONTARTDObject)==0) ? true : false) ;
      A147UVID_ATRCONTARTDLogInst = 0 ;
      n147UVID_ATRCONTARTDLogInst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A147UVID_ATRCONTARTDLogInst", GXutil.ltrim( GXutil.str( A147UVID_ATRCONTARTDLogInst, 9, 0)));
      n147UVID_ATRCONTARTDLogInst = ((0==A147UVID_ATRCONTARTDLogInst) ? true : false) ;
      A148U_CodAtr2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A148U_CodAtr2", A148U_CodAtr2);
      A149UVID_ATRCONTARTDU_NameAtr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A149UVID_ATRCONTARTDU_NameAtr", A149UVID_ATRCONTARTDU_NameAtr);
      A150UVID_ATRCONTARTDU_Cualitat = "" ;
      n150UVID_ATRCONTARTDU_Cualitat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A150UVID_ATRCONTARTDU_Cualitat", A150UVID_ATRCONTARTDU_Cualitat);
      n150UVID_ATRCONTARTDU_Cualitat = ((GXutil.strcmp("", A150UVID_ATRCONTARTDU_Cualitat)==0) ? true : false) ;
      A151U_Critico2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A151U_Critico2", A151U_Critico2);
      A152U_TipoMues2 = "" ;
      n152U_TipoMues2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A152U_TipoMues2", A152U_TipoMues2);
      n152U_TipoMues2 = ((GXutil.strcmp("", A152U_TipoMues2)==0) ? true : false) ;
      A153U_AQL2 = "" ;
      n153U_AQL2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A153U_AQL2", A153U_AQL2);
      n153U_AQL2 = ((GXutil.strcmp("", A153U_AQL2)==0) ? true : false) ;
      A154U_TiempoEs = 0 ;
      n154U_TiempoEs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A154U_TiempoEs", GXutil.ltrim( GXutil.str( A154U_TiempoEs, 18, 0)));
      n154U_TiempoEs = ((0==A154U_TiempoEs) ? true : false) ;
      A155U_StandAtr2 = 0 ;
      n155U_StandAtr2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A155U_StandAtr2", GXutil.ltrim( GXutil.str( A155U_StandAtr2, 18, 0)));
      n155U_StandAtr2 = ((0==A155U_StandAtr2) ? true : false) ;
      A156U_Minimo2 = 0 ;
      n156U_Minimo2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A156U_Minimo2", GXutil.ltrim( GXutil.str( A156U_Minimo2, 18, 0)));
      n156U_Minimo2 = ((0==A156U_Minimo2) ? true : false) ;
      A157U_Maximo2 = 0 ;
      n157U_Maximo2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A157U_Maximo2", GXutil.ltrim( GXutil.str( A157U_Maximo2, 18, 0)));
      n157U_Maximo2 = ((0==A157U_Maximo2) ? true : false) ;
      A158UVID_ATRCONTARTDU_Comment = "" ;
      n158UVID_ATRCONTARTDU_Comment = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A158UVID_ATRCONTARTDU_Comment", A158UVID_ATRCONTARTDU_Comment);
      n158UVID_ATRCONTARTDU_Comment = ((GXutil.strcmp("", A158UVID_ATRCONTARTDU_Comment)==0) ? true : false) ;
      A159U_CodEquip2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A159U_CodEquip2", A159U_CodEquip2);
      A160U_Metodo = "" ;
      n160U_Metodo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A160U_Metodo", A160U_Metodo);
      n160U_Metodo = ((GXutil.strcmp("", A160U_Metodo)==0) ? true : false) ;
      A161U_TipoDef2 = "" ;
      n161U_TipoDef2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A161U_TipoDef2", A161U_TipoDef2);
      n161U_TipoDef2 = ((GXutil.strcmp("", A161U_TipoDef2)==0) ? true : false) ;
      Z145VisOrder2 = 0 ;
      Z146UVID_ATRCONTARTDObject = "" ;
      Z147UVID_ATRCONTARTDLogInst = 0 ;
      Z148U_CodAtr2 = "" ;
      Z149UVID_ATRCONTARTDU_NameAtr = "" ;
      Z150UVID_ATRCONTARTDU_Cualitat = "" ;
      Z151U_Critico2 = "" ;
      Z152U_TipoMues2 = "" ;
      Z153U_AQL2 = "" ;
      Z154U_TiempoEs = 0 ;
      Z155U_StandAtr2 = 0 ;
      Z156U_Minimo2 = 0 ;
      Z157U_Maximo2 = 0 ;
      Z158UVID_ATRCONTARTDU_Comment = "" ;
      Z159U_CodEquip2 = "" ;
      Z160U_Metodo = "" ;
      Z161U_TipoDef2 = "" ;
   }

   public void initAll089( )
   {
      A128UVID_ATRCONTARTDDocEntry = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A128UVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( A128UVID_ATRCONTARTDDocEntry, 9, 0)));
      A129LineId2 = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129LineId2", GXutil.ltrim( GXutil.str( A129LineId2, 9, 0)));
      initializeNonKey089( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20181121023432");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("uvid_atrcontartd.js", "?20181121023433");
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
      edtUVID_ATRCONTARTDDocEntry_Internalname = "UVID_ATRCONTARTDDOCENTRY" ;
      edtLineId2_Internalname = "LINEID2" ;
      edtVisOrder2_Internalname = "VISORDER2" ;
      edtUVID_ATRCONTARTDObject_Internalname = "UVID_ATRCONTARTDOBJECT" ;
      edtUVID_ATRCONTARTDLogInst_Internalname = "UVID_ATRCONTARTDLOGINST" ;
      edtU_CodAtr2_Internalname = "U_CODATR2" ;
      edtUVID_ATRCONTARTDU_NameAtr_Internalname = "UVID_ATRCONTARTDU_NAMEATR" ;
      edtUVID_ATRCONTARTDU_Cualitat_Internalname = "UVID_ATRCONTARTDU_CUALITAT" ;
      edtU_Critico2_Internalname = "U_CRITICO2" ;
      edtU_TipoMues2_Internalname = "U_TIPOMUES2" ;
      edtU_AQL2_Internalname = "U_AQL2" ;
      edtU_TiempoEs_Internalname = "U_TIEMPOES" ;
      edtU_StandAtr2_Internalname = "U_STANDATR2" ;
      edtU_Minimo2_Internalname = "U_MINIMO2" ;
      edtU_Maximo2_Internalname = "U_MAXIMO2" ;
      edtUVID_ATRCONTARTDU_Comment_Internalname = "UVID_ATRCONTARTDU_COMMENT" ;
      edtU_CodEquip2_Internalname = "U_CODEQUIP2" ;
      edtU_Metodo_Internalname = "U_METODO" ;
      edtU_TipoDef2_Internalname = "U_TIPODEF2" ;
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
      Form.setCaption( "UVID_ATRCONTARTD" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtU_TipoDef2_Jsonclick = "" ;
      edtU_TipoDef2_Enabled = 1 ;
      edtU_Metodo_Jsonclick = "" ;
      edtU_Metodo_Enabled = 1 ;
      edtU_CodEquip2_Jsonclick = "" ;
      edtU_CodEquip2_Enabled = 1 ;
      edtUVID_ATRCONTARTDU_Comment_Enabled = 1 ;
      edtU_Maximo2_Jsonclick = "" ;
      edtU_Maximo2_Enabled = 1 ;
      edtU_Minimo2_Jsonclick = "" ;
      edtU_Minimo2_Enabled = 1 ;
      edtU_StandAtr2_Jsonclick = "" ;
      edtU_StandAtr2_Enabled = 1 ;
      edtU_TiempoEs_Jsonclick = "" ;
      edtU_TiempoEs_Enabled = 1 ;
      edtU_AQL2_Jsonclick = "" ;
      edtU_AQL2_Enabled = 1 ;
      edtU_TipoMues2_Jsonclick = "" ;
      edtU_TipoMues2_Enabled = 1 ;
      edtU_Critico2_Jsonclick = "" ;
      edtU_Critico2_Enabled = 1 ;
      edtUVID_ATRCONTARTDU_Cualitat_Jsonclick = "" ;
      edtUVID_ATRCONTARTDU_Cualitat_Enabled = 1 ;
      edtUVID_ATRCONTARTDU_NameAtr_Jsonclick = "" ;
      edtUVID_ATRCONTARTDU_NameAtr_Enabled = 1 ;
      edtU_CodAtr2_Jsonclick = "" ;
      edtU_CodAtr2_Enabled = 1 ;
      edtUVID_ATRCONTARTDLogInst_Jsonclick = "" ;
      edtUVID_ATRCONTARTDLogInst_Enabled = 1 ;
      edtUVID_ATRCONTARTDObject_Jsonclick = "" ;
      edtUVID_ATRCONTARTDObject_Enabled = 1 ;
      edtVisOrder2_Jsonclick = "" ;
      edtVisOrder2_Enabled = 1 ;
      edtLineId2_Jsonclick = "" ;
      edtLineId2_Enabled = 1 ;
      edtUVID_ATRCONTARTDDocEntry_Jsonclick = "" ;
      edtUVID_ATRCONTARTDDocEntry_Enabled = 1 ;
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
      GX_FocusControl = edtVisOrder2_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Lineid2( int GX_Parm1 ,
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
                              long GX_Parm12 ,
                              long GX_Parm13 ,
                              long GX_Parm14 ,
                              long GX_Parm15 ,
                              String GX_Parm16 ,
                              String GX_Parm17 ,
                              String GX_Parm18 ,
                              String GX_Parm19 )
   {
      A128UVID_ATRCONTARTDDocEntry = GX_Parm1 ;
      A129LineId2 = GX_Parm2 ;
      A145VisOrder2 = GX_Parm3 ;
      n145VisOrder2 = false ;
      A146UVID_ATRCONTARTDObject = GX_Parm4 ;
      n146UVID_ATRCONTARTDObject = false ;
      A147UVID_ATRCONTARTDLogInst = GX_Parm5 ;
      n147UVID_ATRCONTARTDLogInst = false ;
      A148U_CodAtr2 = GX_Parm6 ;
      A149UVID_ATRCONTARTDU_NameAtr = GX_Parm7 ;
      A150UVID_ATRCONTARTDU_Cualitat = GX_Parm8 ;
      n150UVID_ATRCONTARTDU_Cualitat = false ;
      A151U_Critico2 = GX_Parm9 ;
      A152U_TipoMues2 = GX_Parm10 ;
      n152U_TipoMues2 = false ;
      A153U_AQL2 = GX_Parm11 ;
      n153U_AQL2 = false ;
      A154U_TiempoEs = GX_Parm12 ;
      n154U_TiempoEs = false ;
      A155U_StandAtr2 = GX_Parm13 ;
      n155U_StandAtr2 = false ;
      A156U_Minimo2 = GX_Parm14 ;
      n156U_Minimo2 = false ;
      A157U_Maximo2 = GX_Parm15 ;
      n157U_Maximo2 = false ;
      A158UVID_ATRCONTARTDU_Comment = GX_Parm16 ;
      n158UVID_ATRCONTARTDU_Comment = false ;
      A159U_CodEquip2 = GX_Parm17 ;
      A160U_Metodo = GX_Parm18 ;
      n160U_Metodo = false ;
      A161U_TipoDef2 = GX_Parm19 ;
      n161U_TipoDef2 = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A145VisOrder2, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(A146UVID_ATRCONTARTDObject);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A147UVID_ATRCONTARTDLogInst, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(A148U_CodAtr2);
      isValidOutput.add(A149UVID_ATRCONTARTDU_NameAtr);
      isValidOutput.add(GXutil.rtrim( A150UVID_ATRCONTARTDU_Cualitat));
      isValidOutput.add(GXutil.rtrim( A151U_Critico2));
      isValidOutput.add(A152U_TipoMues2);
      isValidOutput.add(A153U_AQL2);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A154U_TiempoEs, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A155U_StandAtr2, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A156U_Minimo2, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A157U_Maximo2, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A158UVID_ATRCONTARTDU_Comment);
      isValidOutput.add(A159U_CodEquip2);
      isValidOutput.add(A160U_Metodo);
      isValidOutput.add(GXutil.rtrim( A161U_TipoDef2));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z128UVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z129LineId2, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z145VisOrder2, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(Z146UVID_ATRCONTARTDObject);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z147UVID_ATRCONTARTDLogInst, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(Z148U_CodAtr2);
      isValidOutput.add(Z149UVID_ATRCONTARTDU_NameAtr);
      isValidOutput.add(GXutil.rtrim( Z150UVID_ATRCONTARTDU_Cualitat));
      isValidOutput.add(GXutil.rtrim( Z151U_Critico2));
      isValidOutput.add(Z152U_TipoMues2);
      isValidOutput.add(Z153U_AQL2);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z154U_TiempoEs, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z155U_StandAtr2, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z156U_Minimo2, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z157U_Maximo2, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(Z158UVID_ATRCONTARTDU_Comment);
      isValidOutput.add(Z159U_CodEquip2);
      isValidOutput.add(Z160U_Metodo);
      isValidOutput.add(GXutil.rtrim( Z161U_TipoDef2));
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
      Z146UVID_ATRCONTARTDObject = "" ;
      Z148U_CodAtr2 = "" ;
      Z149UVID_ATRCONTARTDU_NameAtr = "" ;
      Z150UVID_ATRCONTARTDU_Cualitat = "" ;
      Z151U_Critico2 = "" ;
      Z152U_TipoMues2 = "" ;
      Z153U_AQL2 = "" ;
      Z158UVID_ATRCONTARTDU_Comment = "" ;
      Z159U_CodEquip2 = "" ;
      Z160U_Metodo = "" ;
      Z161U_TipoDef2 = "" ;
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
      A146UVID_ATRCONTARTDObject = "" ;
      A148U_CodAtr2 = "" ;
      A149UVID_ATRCONTARTDU_NameAtr = "" ;
      A150UVID_ATRCONTARTDU_Cualitat = "" ;
      A151U_Critico2 = "" ;
      A152U_TipoMues2 = "" ;
      A153U_AQL2 = "" ;
      A158UVID_ATRCONTARTDU_Comment = "" ;
      A159U_CodEquip2 = "" ;
      A160U_Metodo = "" ;
      A161U_TipoDef2 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T00084_A128UVID_ATRCONTARTDDocEntry = new int[1] ;
      T00084_A129LineId2 = new int[1] ;
      T00084_A145VisOrder2 = new int[1] ;
      T00084_n145VisOrder2 = new boolean[] {false} ;
      T00084_A146UVID_ATRCONTARTDObject = new String[] {""} ;
      T00084_n146UVID_ATRCONTARTDObject = new boolean[] {false} ;
      T00084_A147UVID_ATRCONTARTDLogInst = new int[1] ;
      T00084_n147UVID_ATRCONTARTDLogInst = new boolean[] {false} ;
      T00084_A148U_CodAtr2 = new String[] {""} ;
      T00084_A149UVID_ATRCONTARTDU_NameAtr = new String[] {""} ;
      T00084_A150UVID_ATRCONTARTDU_Cualitat = new String[] {""} ;
      T00084_n150UVID_ATRCONTARTDU_Cualitat = new boolean[] {false} ;
      T00084_A151U_Critico2 = new String[] {""} ;
      T00084_A152U_TipoMues2 = new String[] {""} ;
      T00084_n152U_TipoMues2 = new boolean[] {false} ;
      T00084_A153U_AQL2 = new String[] {""} ;
      T00084_n153U_AQL2 = new boolean[] {false} ;
      T00084_A154U_TiempoEs = new long[1] ;
      T00084_n154U_TiempoEs = new boolean[] {false} ;
      T00084_A155U_StandAtr2 = new long[1] ;
      T00084_n155U_StandAtr2 = new boolean[] {false} ;
      T00084_A156U_Minimo2 = new long[1] ;
      T00084_n156U_Minimo2 = new boolean[] {false} ;
      T00084_A157U_Maximo2 = new long[1] ;
      T00084_n157U_Maximo2 = new boolean[] {false} ;
      T00084_A158UVID_ATRCONTARTDU_Comment = new String[] {""} ;
      T00084_n158UVID_ATRCONTARTDU_Comment = new boolean[] {false} ;
      T00084_A159U_CodEquip2 = new String[] {""} ;
      T00084_A160U_Metodo = new String[] {""} ;
      T00084_n160U_Metodo = new boolean[] {false} ;
      T00084_A161U_TipoDef2 = new String[] {""} ;
      T00084_n161U_TipoDef2 = new boolean[] {false} ;
      T00085_A128UVID_ATRCONTARTDDocEntry = new int[1] ;
      T00085_A129LineId2 = new int[1] ;
      T00083_A128UVID_ATRCONTARTDDocEntry = new int[1] ;
      T00083_A129LineId2 = new int[1] ;
      T00083_A145VisOrder2 = new int[1] ;
      T00083_n145VisOrder2 = new boolean[] {false} ;
      T00083_A146UVID_ATRCONTARTDObject = new String[] {""} ;
      T00083_n146UVID_ATRCONTARTDObject = new boolean[] {false} ;
      T00083_A147UVID_ATRCONTARTDLogInst = new int[1] ;
      T00083_n147UVID_ATRCONTARTDLogInst = new boolean[] {false} ;
      T00083_A148U_CodAtr2 = new String[] {""} ;
      T00083_A149UVID_ATRCONTARTDU_NameAtr = new String[] {""} ;
      T00083_A150UVID_ATRCONTARTDU_Cualitat = new String[] {""} ;
      T00083_n150UVID_ATRCONTARTDU_Cualitat = new boolean[] {false} ;
      T00083_A151U_Critico2 = new String[] {""} ;
      T00083_A152U_TipoMues2 = new String[] {""} ;
      T00083_n152U_TipoMues2 = new boolean[] {false} ;
      T00083_A153U_AQL2 = new String[] {""} ;
      T00083_n153U_AQL2 = new boolean[] {false} ;
      T00083_A154U_TiempoEs = new long[1] ;
      T00083_n154U_TiempoEs = new boolean[] {false} ;
      T00083_A155U_StandAtr2 = new long[1] ;
      T00083_n155U_StandAtr2 = new boolean[] {false} ;
      T00083_A156U_Minimo2 = new long[1] ;
      T00083_n156U_Minimo2 = new boolean[] {false} ;
      T00083_A157U_Maximo2 = new long[1] ;
      T00083_n157U_Maximo2 = new boolean[] {false} ;
      T00083_A158UVID_ATRCONTARTDU_Comment = new String[] {""} ;
      T00083_n158UVID_ATRCONTARTDU_Comment = new boolean[] {false} ;
      T00083_A159U_CodEquip2 = new String[] {""} ;
      T00083_A160U_Metodo = new String[] {""} ;
      T00083_n160U_Metodo = new boolean[] {false} ;
      T00083_A161U_TipoDef2 = new String[] {""} ;
      T00083_n161U_TipoDef2 = new boolean[] {false} ;
      sMode9 = "" ;
      T00086_A128UVID_ATRCONTARTDDocEntry = new int[1] ;
      T00086_A129LineId2 = new int[1] ;
      T00087_A128UVID_ATRCONTARTDDocEntry = new int[1] ;
      T00087_A129LineId2 = new int[1] ;
      T00082_A128UVID_ATRCONTARTDDocEntry = new int[1] ;
      T00082_A129LineId2 = new int[1] ;
      T00082_A145VisOrder2 = new int[1] ;
      T00082_n145VisOrder2 = new boolean[] {false} ;
      T00082_A146UVID_ATRCONTARTDObject = new String[] {""} ;
      T00082_n146UVID_ATRCONTARTDObject = new boolean[] {false} ;
      T00082_A147UVID_ATRCONTARTDLogInst = new int[1] ;
      T00082_n147UVID_ATRCONTARTDLogInst = new boolean[] {false} ;
      T00082_A148U_CodAtr2 = new String[] {""} ;
      T00082_A149UVID_ATRCONTARTDU_NameAtr = new String[] {""} ;
      T00082_A150UVID_ATRCONTARTDU_Cualitat = new String[] {""} ;
      T00082_n150UVID_ATRCONTARTDU_Cualitat = new boolean[] {false} ;
      T00082_A151U_Critico2 = new String[] {""} ;
      T00082_A152U_TipoMues2 = new String[] {""} ;
      T00082_n152U_TipoMues2 = new boolean[] {false} ;
      T00082_A153U_AQL2 = new String[] {""} ;
      T00082_n153U_AQL2 = new boolean[] {false} ;
      T00082_A154U_TiempoEs = new long[1] ;
      T00082_n154U_TiempoEs = new boolean[] {false} ;
      T00082_A155U_StandAtr2 = new long[1] ;
      T00082_n155U_StandAtr2 = new boolean[] {false} ;
      T00082_A156U_Minimo2 = new long[1] ;
      T00082_n156U_Minimo2 = new boolean[] {false} ;
      T00082_A157U_Maximo2 = new long[1] ;
      T00082_n157U_Maximo2 = new boolean[] {false} ;
      T00082_A158UVID_ATRCONTARTDU_Comment = new String[] {""} ;
      T00082_n158UVID_ATRCONTARTDU_Comment = new boolean[] {false} ;
      T00082_A159U_CodEquip2 = new String[] {""} ;
      T00082_A160U_Metodo = new String[] {""} ;
      T00082_n160U_Metodo = new boolean[] {false} ;
      T00082_A161U_TipoDef2 = new String[] {""} ;
      T00082_n161U_TipoDef2 = new boolean[] {false} ;
      T000811_A128UVID_ATRCONTARTDDocEntry = new int[1] ;
      T000811_A129LineId2 = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.uvid_atrcontartd__fusquim_sap(),
         new Object[] {
             new Object[] {
            T00082_A128UVID_ATRCONTARTDDocEntry, T00082_A129LineId2, T00082_A145VisOrder2, T00082_n145VisOrder2, T00082_A146UVID_ATRCONTARTDObject, T00082_n146UVID_ATRCONTARTDObject, T00082_A147UVID_ATRCONTARTDLogInst, T00082_n147UVID_ATRCONTARTDLogInst, T00082_A148U_CodAtr2, T00082_A149UVID_ATRCONTARTDU_NameAtr,
            T00082_A150UVID_ATRCONTARTDU_Cualitat, T00082_n150UVID_ATRCONTARTDU_Cualitat, T00082_A151U_Critico2, T00082_A152U_TipoMues2, T00082_n152U_TipoMues2, T00082_A153U_AQL2, T00082_n153U_AQL2, T00082_A154U_TiempoEs, T00082_n154U_TiempoEs, T00082_A155U_StandAtr2,
            T00082_n155U_StandAtr2, T00082_A156U_Minimo2, T00082_n156U_Minimo2, T00082_A157U_Maximo2, T00082_n157U_Maximo2, T00082_A158UVID_ATRCONTARTDU_Comment, T00082_n158UVID_ATRCONTARTDU_Comment, T00082_A159U_CodEquip2, T00082_A160U_Metodo, T00082_n160U_Metodo,
            T00082_A161U_TipoDef2, T00082_n161U_TipoDef2
            }
            , new Object[] {
            T00083_A128UVID_ATRCONTARTDDocEntry, T00083_A129LineId2, T00083_A145VisOrder2, T00083_n145VisOrder2, T00083_A146UVID_ATRCONTARTDObject, T00083_n146UVID_ATRCONTARTDObject, T00083_A147UVID_ATRCONTARTDLogInst, T00083_n147UVID_ATRCONTARTDLogInst, T00083_A148U_CodAtr2, T00083_A149UVID_ATRCONTARTDU_NameAtr,
            T00083_A150UVID_ATRCONTARTDU_Cualitat, T00083_n150UVID_ATRCONTARTDU_Cualitat, T00083_A151U_Critico2, T00083_A152U_TipoMues2, T00083_n152U_TipoMues2, T00083_A153U_AQL2, T00083_n153U_AQL2, T00083_A154U_TiempoEs, T00083_n154U_TiempoEs, T00083_A155U_StandAtr2,
            T00083_n155U_StandAtr2, T00083_A156U_Minimo2, T00083_n156U_Minimo2, T00083_A157U_Maximo2, T00083_n157U_Maximo2, T00083_A158UVID_ATRCONTARTDU_Comment, T00083_n158UVID_ATRCONTARTDU_Comment, T00083_A159U_CodEquip2, T00083_A160U_Metodo, T00083_n160U_Metodo,
            T00083_A161U_TipoDef2, T00083_n161U_TipoDef2
            }
            , new Object[] {
            T00084_A128UVID_ATRCONTARTDDocEntry, T00084_A129LineId2, T00084_A145VisOrder2, T00084_n145VisOrder2, T00084_A146UVID_ATRCONTARTDObject, T00084_n146UVID_ATRCONTARTDObject, T00084_A147UVID_ATRCONTARTDLogInst, T00084_n147UVID_ATRCONTARTDLogInst, T00084_A148U_CodAtr2, T00084_A149UVID_ATRCONTARTDU_NameAtr,
            T00084_A150UVID_ATRCONTARTDU_Cualitat, T00084_n150UVID_ATRCONTARTDU_Cualitat, T00084_A151U_Critico2, T00084_A152U_TipoMues2, T00084_n152U_TipoMues2, T00084_A153U_AQL2, T00084_n153U_AQL2, T00084_A154U_TiempoEs, T00084_n154U_TiempoEs, T00084_A155U_StandAtr2,
            T00084_n155U_StandAtr2, T00084_A156U_Minimo2, T00084_n156U_Minimo2, T00084_A157U_Maximo2, T00084_n157U_Maximo2, T00084_A158UVID_ATRCONTARTDU_Comment, T00084_n158UVID_ATRCONTARTDU_Comment, T00084_A159U_CodEquip2, T00084_A160U_Metodo, T00084_n160U_Metodo,
            T00084_A161U_TipoDef2, T00084_n161U_TipoDef2
            }
            , new Object[] {
            T00085_A128UVID_ATRCONTARTDDocEntry, T00085_A129LineId2
            }
            , new Object[] {
            T00086_A128UVID_ATRCONTARTDDocEntry, T00086_A129LineId2
            }
            , new Object[] {
            T00087_A128UVID_ATRCONTARTDDocEntry, T00087_A129LineId2
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000811_A128UVID_ATRCONTARTDDocEntry, T000811_A129LineId2
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.uvid_atrcontartd__default(),
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
   private short RcdFound9 ;
   private int Z128UVID_ATRCONTARTDDocEntry ;
   private int Z129LineId2 ;
   private int Z145VisOrder2 ;
   private int Z147UVID_ATRCONTARTDLogInst ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A128UVID_ATRCONTARTDDocEntry ;
   private int edtUVID_ATRCONTARTDDocEntry_Enabled ;
   private int A129LineId2 ;
   private int edtLineId2_Enabled ;
   private int A145VisOrder2 ;
   private int edtVisOrder2_Enabled ;
   private int edtUVID_ATRCONTARTDObject_Enabled ;
   private int A147UVID_ATRCONTARTDLogInst ;
   private int edtUVID_ATRCONTARTDLogInst_Enabled ;
   private int edtU_CodAtr2_Enabled ;
   private int edtUVID_ATRCONTARTDU_NameAtr_Enabled ;
   private int edtUVID_ATRCONTARTDU_Cualitat_Enabled ;
   private int edtU_Critico2_Enabled ;
   private int edtU_TipoMues2_Enabled ;
   private int edtU_AQL2_Enabled ;
   private int edtU_TiempoEs_Enabled ;
   private int edtU_StandAtr2_Enabled ;
   private int edtU_Minimo2_Enabled ;
   private int edtU_Maximo2_Enabled ;
   private int edtUVID_ATRCONTARTDU_Comment_Enabled ;
   private int edtU_CodEquip2_Enabled ;
   private int edtU_Metodo_Enabled ;
   private int edtU_TipoDef2_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z154U_TiempoEs ;
   private long Z155U_StandAtr2 ;
   private long Z156U_Minimo2 ;
   private long Z157U_Maximo2 ;
   private long A154U_TiempoEs ;
   private long A155U_StandAtr2 ;
   private long A156U_Minimo2 ;
   private long A157U_Maximo2 ;
   private String sPrefix ;
   private String Z150UVID_ATRCONTARTDU_Cualitat ;
   private String Z151U_Critico2 ;
   private String Z161U_TipoDef2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtUVID_ATRCONTARTDDocEntry_Internalname ;
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
   private String edtUVID_ATRCONTARTDDocEntry_Jsonclick ;
   private String edtLineId2_Internalname ;
   private String edtLineId2_Jsonclick ;
   private String edtVisOrder2_Internalname ;
   private String edtVisOrder2_Jsonclick ;
   private String edtUVID_ATRCONTARTDObject_Internalname ;
   private String edtUVID_ATRCONTARTDObject_Jsonclick ;
   private String edtUVID_ATRCONTARTDLogInst_Internalname ;
   private String edtUVID_ATRCONTARTDLogInst_Jsonclick ;
   private String edtU_CodAtr2_Internalname ;
   private String edtU_CodAtr2_Jsonclick ;
   private String edtUVID_ATRCONTARTDU_NameAtr_Internalname ;
   private String edtUVID_ATRCONTARTDU_NameAtr_Jsonclick ;
   private String edtUVID_ATRCONTARTDU_Cualitat_Internalname ;
   private String A150UVID_ATRCONTARTDU_Cualitat ;
   private String edtUVID_ATRCONTARTDU_Cualitat_Jsonclick ;
   private String edtU_Critico2_Internalname ;
   private String A151U_Critico2 ;
   private String edtU_Critico2_Jsonclick ;
   private String edtU_TipoMues2_Internalname ;
   private String edtU_TipoMues2_Jsonclick ;
   private String edtU_AQL2_Internalname ;
   private String edtU_AQL2_Jsonclick ;
   private String edtU_TiempoEs_Internalname ;
   private String edtU_TiempoEs_Jsonclick ;
   private String edtU_StandAtr2_Internalname ;
   private String edtU_StandAtr2_Jsonclick ;
   private String edtU_Minimo2_Internalname ;
   private String edtU_Minimo2_Jsonclick ;
   private String edtU_Maximo2_Internalname ;
   private String edtU_Maximo2_Jsonclick ;
   private String edtUVID_ATRCONTARTDU_Comment_Internalname ;
   private String edtU_CodEquip2_Internalname ;
   private String edtU_CodEquip2_Jsonclick ;
   private String edtU_Metodo_Internalname ;
   private String edtU_Metodo_Jsonclick ;
   private String edtU_TipoDef2_Internalname ;
   private String A161U_TipoDef2 ;
   private String edtU_TipoDef2_Jsonclick ;
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
   private String sMode9 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n145VisOrder2 ;
   private boolean n146UVID_ATRCONTARTDObject ;
   private boolean n147UVID_ATRCONTARTDLogInst ;
   private boolean n150UVID_ATRCONTARTDU_Cualitat ;
   private boolean n152U_TipoMues2 ;
   private boolean n153U_AQL2 ;
   private boolean n154U_TiempoEs ;
   private boolean n155U_StandAtr2 ;
   private boolean n156U_Minimo2 ;
   private boolean n157U_Maximo2 ;
   private boolean n158UVID_ATRCONTARTDU_Comment ;
   private boolean n160U_Metodo ;
   private boolean n161U_TipoDef2 ;
   private boolean Gx_longc ;
   private String Z146UVID_ATRCONTARTDObject ;
   private String Z148U_CodAtr2 ;
   private String Z149UVID_ATRCONTARTDU_NameAtr ;
   private String Z152U_TipoMues2 ;
   private String Z153U_AQL2 ;
   private String Z158UVID_ATRCONTARTDU_Comment ;
   private String Z159U_CodEquip2 ;
   private String Z160U_Metodo ;
   private String A146UVID_ATRCONTARTDObject ;
   private String A148U_CodAtr2 ;
   private String A149UVID_ATRCONTARTDU_NameAtr ;
   private String A152U_TipoMues2 ;
   private String A153U_AQL2 ;
   private String A158UVID_ATRCONTARTDU_Comment ;
   private String A159U_CodEquip2 ;
   private String A160U_Metodo ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_fusquim_sap ;
   private int[] T00084_A128UVID_ATRCONTARTDDocEntry ;
   private int[] T00084_A129LineId2 ;
   private int[] T00084_A145VisOrder2 ;
   private boolean[] T00084_n145VisOrder2 ;
   private String[] T00084_A146UVID_ATRCONTARTDObject ;
   private boolean[] T00084_n146UVID_ATRCONTARTDObject ;
   private int[] T00084_A147UVID_ATRCONTARTDLogInst ;
   private boolean[] T00084_n147UVID_ATRCONTARTDLogInst ;
   private String[] T00084_A148U_CodAtr2 ;
   private String[] T00084_A149UVID_ATRCONTARTDU_NameAtr ;
   private String[] T00084_A150UVID_ATRCONTARTDU_Cualitat ;
   private boolean[] T00084_n150UVID_ATRCONTARTDU_Cualitat ;
   private String[] T00084_A151U_Critico2 ;
   private String[] T00084_A152U_TipoMues2 ;
   private boolean[] T00084_n152U_TipoMues2 ;
   private String[] T00084_A153U_AQL2 ;
   private boolean[] T00084_n153U_AQL2 ;
   private long[] T00084_A154U_TiempoEs ;
   private boolean[] T00084_n154U_TiempoEs ;
   private long[] T00084_A155U_StandAtr2 ;
   private boolean[] T00084_n155U_StandAtr2 ;
   private long[] T00084_A156U_Minimo2 ;
   private boolean[] T00084_n156U_Minimo2 ;
   private long[] T00084_A157U_Maximo2 ;
   private boolean[] T00084_n157U_Maximo2 ;
   private String[] T00084_A158UVID_ATRCONTARTDU_Comment ;
   private boolean[] T00084_n158UVID_ATRCONTARTDU_Comment ;
   private String[] T00084_A159U_CodEquip2 ;
   private String[] T00084_A160U_Metodo ;
   private boolean[] T00084_n160U_Metodo ;
   private String[] T00084_A161U_TipoDef2 ;
   private boolean[] T00084_n161U_TipoDef2 ;
   private int[] T00085_A128UVID_ATRCONTARTDDocEntry ;
   private int[] T00085_A129LineId2 ;
   private int[] T00083_A128UVID_ATRCONTARTDDocEntry ;
   private int[] T00083_A129LineId2 ;
   private int[] T00083_A145VisOrder2 ;
   private boolean[] T00083_n145VisOrder2 ;
   private String[] T00083_A146UVID_ATRCONTARTDObject ;
   private boolean[] T00083_n146UVID_ATRCONTARTDObject ;
   private int[] T00083_A147UVID_ATRCONTARTDLogInst ;
   private boolean[] T00083_n147UVID_ATRCONTARTDLogInst ;
   private String[] T00083_A148U_CodAtr2 ;
   private String[] T00083_A149UVID_ATRCONTARTDU_NameAtr ;
   private String[] T00083_A150UVID_ATRCONTARTDU_Cualitat ;
   private boolean[] T00083_n150UVID_ATRCONTARTDU_Cualitat ;
   private String[] T00083_A151U_Critico2 ;
   private String[] T00083_A152U_TipoMues2 ;
   private boolean[] T00083_n152U_TipoMues2 ;
   private String[] T00083_A153U_AQL2 ;
   private boolean[] T00083_n153U_AQL2 ;
   private long[] T00083_A154U_TiempoEs ;
   private boolean[] T00083_n154U_TiempoEs ;
   private long[] T00083_A155U_StandAtr2 ;
   private boolean[] T00083_n155U_StandAtr2 ;
   private long[] T00083_A156U_Minimo2 ;
   private boolean[] T00083_n156U_Minimo2 ;
   private long[] T00083_A157U_Maximo2 ;
   private boolean[] T00083_n157U_Maximo2 ;
   private String[] T00083_A158UVID_ATRCONTARTDU_Comment ;
   private boolean[] T00083_n158UVID_ATRCONTARTDU_Comment ;
   private String[] T00083_A159U_CodEquip2 ;
   private String[] T00083_A160U_Metodo ;
   private boolean[] T00083_n160U_Metodo ;
   private String[] T00083_A161U_TipoDef2 ;
   private boolean[] T00083_n161U_TipoDef2 ;
   private int[] T00086_A128UVID_ATRCONTARTDDocEntry ;
   private int[] T00086_A129LineId2 ;
   private int[] T00087_A128UVID_ATRCONTARTDDocEntry ;
   private int[] T00087_A129LineId2 ;
   private int[] T00082_A128UVID_ATRCONTARTDDocEntry ;
   private int[] T00082_A129LineId2 ;
   private int[] T00082_A145VisOrder2 ;
   private boolean[] T00082_n145VisOrder2 ;
   private String[] T00082_A146UVID_ATRCONTARTDObject ;
   private boolean[] T00082_n146UVID_ATRCONTARTDObject ;
   private int[] T00082_A147UVID_ATRCONTARTDLogInst ;
   private boolean[] T00082_n147UVID_ATRCONTARTDLogInst ;
   private String[] T00082_A148U_CodAtr2 ;
   private String[] T00082_A149UVID_ATRCONTARTDU_NameAtr ;
   private String[] T00082_A150UVID_ATRCONTARTDU_Cualitat ;
   private boolean[] T00082_n150UVID_ATRCONTARTDU_Cualitat ;
   private String[] T00082_A151U_Critico2 ;
   private String[] T00082_A152U_TipoMues2 ;
   private boolean[] T00082_n152U_TipoMues2 ;
   private String[] T00082_A153U_AQL2 ;
   private boolean[] T00082_n153U_AQL2 ;
   private long[] T00082_A154U_TiempoEs ;
   private boolean[] T00082_n154U_TiempoEs ;
   private long[] T00082_A155U_StandAtr2 ;
   private boolean[] T00082_n155U_StandAtr2 ;
   private long[] T00082_A156U_Minimo2 ;
   private boolean[] T00082_n156U_Minimo2 ;
   private long[] T00082_A157U_Maximo2 ;
   private boolean[] T00082_n157U_Maximo2 ;
   private String[] T00082_A158UVID_ATRCONTARTDU_Comment ;
   private boolean[] T00082_n158UVID_ATRCONTARTDU_Comment ;
   private String[] T00082_A159U_CodEquip2 ;
   private String[] T00082_A160U_Metodo ;
   private boolean[] T00082_n160U_Metodo ;
   private String[] T00082_A161U_TipoDef2 ;
   private boolean[] T00082_n161U_TipoDef2 ;
   private IDataStoreProvider pr_default ;
   private int[] T000811_A128UVID_ATRCONTARTDDocEntry ;
   private int[] T000811_A129LineId2 ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class uvid_atrcontartd__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00082", "SELECT [DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_AQL], [U_TiempoEs], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Comment], [U_CodEquip], [U_Metodo], [U_TipoDef] FROM dbo.[@VID_ATRCONTARTD] WITH (UPDLOCK) WHERE [DocEntry] = ? AND [LineId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00083", "SELECT [DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_AQL], [U_TiempoEs], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Comment], [U_CodEquip], [U_Metodo], [U_TipoDef] FROM dbo.[@VID_ATRCONTARTD] WITH (NOLOCK) WHERE [DocEntry] = ? AND [LineId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00084", "SELECT TM1.[DocEntry], TM1.[LineId], TM1.[VisOrder], TM1.[Object], TM1.[LogInst], TM1.[U_CodAtr], TM1.[U_NameAtr], TM1.[U_Cualitat], TM1.[U_Critico], TM1.[U_TipoMues], TM1.[U_AQL], TM1.[U_TiempoEs], TM1.[U_StandAtr], TM1.[U_Minimo], TM1.[U_Maximo], TM1.[U_Comment], TM1.[U_CodEquip], TM1.[U_Metodo], TM1.[U_TipoDef] FROM dbo.[@VID_ATRCONTARTD] TM1 WITH (NOLOCK) WHERE TM1.[DocEntry] = ? and TM1.[LineId] = ? ORDER BY TM1.[DocEntry], TM1.[LineId]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00085", "SELECT [DocEntry], [LineId] FROM dbo.[@VID_ATRCONTARTD] WITH (NOLOCK) WHERE [DocEntry] = ? AND [LineId] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00086", "SELECT TOP 1 [DocEntry], [LineId] FROM dbo.[@VID_ATRCONTARTD] WITH (NOLOCK) WHERE ( [DocEntry] > ? or [DocEntry] = ? and [LineId] > ?) ORDER BY [DocEntry], [LineId]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00087", "SELECT TOP 1 [DocEntry], [LineId] FROM dbo.[@VID_ATRCONTARTD] WITH (NOLOCK) WHERE ( [DocEntry] < ? or [DocEntry] = ? and [LineId] < ?) ORDER BY [DocEntry] DESC, [LineId] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00088", "INSERT INTO dbo.[@VID_ATRCONTARTD]([DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_AQL], [U_TiempoEs], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Comment], [U_CodEquip], [U_Metodo], [U_TipoDef]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00089", "UPDATE dbo.[@VID_ATRCONTARTD] SET [VisOrder]=?, [Object]=?, [LogInst]=?, [U_CodAtr]=?, [U_NameAtr]=?, [U_Cualitat]=?, [U_Critico]=?, [U_TipoMues]=?, [U_AQL]=?, [U_TiempoEs]=?, [U_StandAtr]=?, [U_Minimo]=?, [U_Maximo]=?, [U_Comment]=?, [U_CodEquip]=?, [U_Metodo]=?, [U_TipoDef]=?  WHERE [DocEntry] = ? AND [LineId] = ?", GX_NOMASK)
         ,new UpdateCursor("T000810", "DELETE FROM dbo.[@VID_ATRCONTARTD]  WHERE [DocEntry] = ? AND [LineId] = ?", GX_NOMASK)
         ,new ForEachCursor("T000811", "SELECT [DocEntry], [LineId] FROM dbo.[@VID_ATRCONTARTD] WITH (NOLOCK) ORDER BY [DocEntry], [LineId]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[10])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 1) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[10])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 1) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[10])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 1) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setVarchar(6, (String)parms[8], 8, false);
               stmt.setVarchar(7, (String)parms[9], 50, false);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 1);
               }
               stmt.setString(9, (String)parms[12], 1);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[14], 8);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[16], 8);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(12, ((Number) parms[18]).longValue(), 0);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(13, ((Number) parms[20]).longValue(), 0);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(14, ((Number) parms[22]).longValue(), 0);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(15, ((Number) parms[24]).longValue(), 0);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[26], 254);
               }
               stmt.setVarchar(17, (String)parms[27], 8, false);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[29], 20);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[31], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               stmt.setVarchar(4, (String)parms[6], 8, false);
               stmt.setVarchar(5, (String)parms[7], 50, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 1);
               }
               stmt.setString(7, (String)parms[10], 1);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 8);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 8);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(10, ((Number) parms[16]).longValue(), 0);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(11, ((Number) parms[18]).longValue(), 0);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(12, ((Number) parms[20]).longValue(), 0);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(13, ((Number) parms[22]).longValue(), 0);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 254);
               }
               stmt.setVarchar(15, (String)parms[25], 8, false);
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 20);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 1);
               }
               stmt.setInt(18, ((Number) parms[30]).intValue());
               stmt.setInt(19, ((Number) parms[31]).intValue());
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

final  class uvid_atrcontartd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

