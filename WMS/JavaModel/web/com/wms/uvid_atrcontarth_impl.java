/*
               File: uvid_atrcontarth_impl
        Description: UVID_ATRCONTARTH
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:6.42
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

public final  class uvid_atrcontarth_impl extends GXDataArea
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
         Form.getMeta().addItem("description", "UVID_ATRCONTARTH", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public uvid_atrcontarth_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public uvid_atrcontarth_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( uvid_atrcontarth_impl.class ));
   }

   public uvid_atrcontarth_impl( int remoteHandle ,
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
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "UVID_ATRCONTARTH", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.wms.gx00a0"+"',["+"{Ctrl:gx.dom.el('"+"UVID_ATRCONTARTHDOCENTRY"+"'), id:'"+"UVID_ATRCONTARTHDOCENTRY"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHDocEntry_Internalname, "Doc Entry", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHDocEntry_Internalname, GXutil.ltrim( localUtil.ntoc( A162UVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHDocEntry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A162UVID_ATRCONTARTHDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A162UVID_ATRCONTARTHDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHDocEntry_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHDocEntry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHDocNum_Internalname, "Doc Num", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHDocNum_Internalname, GXutil.ltrim( localUtil.ntoc( A163UVID_ATRCONTARTHDocNum, (byte)(9), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHDocNum_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A163UVID_ATRCONTARTHDocNum), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A163UVID_ATRCONTARTHDocNum), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHDocNum_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHDocNum_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHPeriod_Internalname, "Period", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHPeriod_Internalname, GXutil.ltrim( localUtil.ntoc( A164UVID_ATRCONTARTHPeriod, (byte)(9), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHPeriod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A164UVID_ATRCONTARTHPeriod), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A164UVID_ATRCONTARTHPeriod), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHPeriod_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHPeriod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHInstance_Internalname, "Instance", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHInstance_Internalname, GXutil.ltrim( localUtil.ntoc( A165UVID_ATRCONTARTHInstance, (byte)(4), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHInstance_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A165UVID_ATRCONTARTHInstance), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A165UVID_ATRCONTARTHInstance), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHInstance_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHInstance_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHSeries_Internalname, "Series", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHSeries_Internalname, GXutil.ltrim( localUtil.ntoc( A166UVID_ATRCONTARTHSeries, (byte)(9), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHSeries_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A166UVID_ATRCONTARTHSeries), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A166UVID_ATRCONTARTHSeries), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHSeries_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHSeries_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHHandwrtten_Internalname, "Handwrtten", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHHandwrtten_Internalname, GXutil.rtrim( A167UVID_ATRCONTARTHHandwrtten), GXutil.rtrim( localUtil.format( A167UVID_ATRCONTARTHHandwrtten, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHHandwrtten_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHHandwrtten_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHCanceled_Internalname, "Canceled", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHCanceled_Internalname, GXutil.rtrim( A168UVID_ATRCONTARTHCanceled), GXutil.rtrim( localUtil.format( A168UVID_ATRCONTARTHCanceled, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHCanceled_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHCanceled_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHObject_Internalname, "Object", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHObject_Internalname, A169UVID_ATRCONTARTHObject, GXutil.rtrim( localUtil.format( A169UVID_ATRCONTARTHObject, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHObject_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHObject_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHLogInst_Internalname, "Log Inst", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHLogInst_Internalname, GXutil.ltrim( localUtil.ntoc( A170UVID_ATRCONTARTHLogInst, (byte)(9), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHLogInst_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A170UVID_ATRCONTARTHLogInst), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A170UVID_ATRCONTARTHLogInst), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHLogInst_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHLogInst_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHUserSign_Internalname, "User Sign", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHUserSign_Internalname, GXutil.ltrim( localUtil.ntoc( A171UVID_ATRCONTARTHUserSign, (byte)(9), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHUserSign_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A171UVID_ATRCONTARTHUserSign), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A171UVID_ATRCONTARTHUserSign), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHUserSign_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHUserSign_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHTransfered_Internalname, "Transfered", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHTransfered_Internalname, GXutil.rtrim( A172UVID_ATRCONTARTHTransfered), GXutil.rtrim( localUtil.format( A172UVID_ATRCONTARTHTransfered, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHTransfered_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHTransfered_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHStatus_Internalname, "Status", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHStatus_Internalname, GXutil.rtrim( A173UVID_ATRCONTARTHStatus), GXutil.rtrim( localUtil.format( A173UVID_ATRCONTARTHStatus, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHStatus_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHStatus_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHCreateDate_Internalname, "Create Date", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtUVID_ATRCONTARTHCreateDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHCreateDate_Internalname, localUtil.ttoc( A174UVID_ATRCONTARTHCreateDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A174UVID_ATRCONTARTHCreateDate, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHCreateDate_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHCreateDate_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtUVID_ATRCONTARTHCreateDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtUVID_ATRCONTARTHCreateDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHCreateTime_Internalname, "Create Time", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHCreateTime_Internalname, GXutil.ltrim( localUtil.ntoc( A175UVID_ATRCONTARTHCreateTime, (byte)(4), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHCreateTime_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A175UVID_ATRCONTARTHCreateTime), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A175UVID_ATRCONTARTHCreateTime), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHCreateTime_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHCreateTime_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHUpdateDate_Internalname, "Update Date", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtUVID_ATRCONTARTHUpdateDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHUpdateDate_Internalname, localUtil.ttoc( A176UVID_ATRCONTARTHUpdateDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A176UVID_ATRCONTARTHUpdateDate, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHUpdateDate_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHUpdateDate_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtUVID_ATRCONTARTHUpdateDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtUVID_ATRCONTARTHUpdateDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHUpdateTime_Internalname, "Update Time", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHUpdateTime_Internalname, GXutil.ltrim( localUtil.ntoc( A177UVID_ATRCONTARTHUpdateTime, (byte)(4), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHUpdateTime_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A177UVID_ATRCONTARTHUpdateTime), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A177UVID_ATRCONTARTHUpdateTime), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHUpdateTime_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHUpdateTime_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHDataSource_Internalname, "Data Source", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHDataSource_Internalname, GXutil.rtrim( A178UVID_ATRCONTARTHDataSource), GXutil.rtrim( localUtil.format( A178UVID_ATRCONTARTHDataSource, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHDataSource_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHDataSource_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHRequestStatus_Internalname, "Request Status", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHRequestStatus_Internalname, GXutil.rtrim( A179UVID_ATRCONTARTHRequestStatus), GXutil.rtrim( localUtil.format( A179UVID_ATRCONTARTHRequestStatus, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHRequestStatus_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHRequestStatus_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHCreator_Internalname, "Creator", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHCreator_Internalname, A180UVID_ATRCONTARTHCreator, GXutil.rtrim( localUtil.format( A180UVID_ATRCONTARTHCreator, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHCreator_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHCreator_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHRemark_Internalname, "Remark", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHRemark_Internalname, A181UVID_ATRCONTARTHRemark, A181UVID_ATRCONTARTHRemark, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHRemark_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHRemark_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(0), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHU_ItemCode_Internalname, "U_Item Code", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHU_ItemCode_Internalname, A182UVID_ATRCONTARTHU_ItemCode, GXutil.rtrim( localUtil.format( A182UVID_ATRCONTARTHU_ItemCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHU_ItemCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHU_ItemCode_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHU_ItemName_Internalname, "U_Item Name", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHU_ItemName_Internalname, A183UVID_ATRCONTARTHU_ItemName, GXutil.rtrim( localUtil.format( A183UVID_ATRCONTARTHU_ItemName, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHU_ItemName_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHU_ItemName_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHU_Comment_Internalname, "U_Comment", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtUVID_ATRCONTARTHU_Comment_Internalname, A184UVID_ATRCONTARTHU_Comment, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", (short)(0), 1, edtUVID_ATRCONTARTHU_Comment_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHU_ContraMu_Internalname, "U_Contra Mu", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHU_ContraMu_Internalname, GXutil.rtrim( A185UVID_ATRCONTARTHU_ContraMu), GXutil.rtrim( localUtil.format( A185UVID_ATRCONTARTHU_ContraMu, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHU_ContraMu_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHU_ContraMu_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHU_CoMuSize_Internalname, "U_Co Mu Size", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHU_CoMuSize_Internalname, GXutil.ltrim( localUtil.ntoc( A186UVID_ATRCONTARTHU_CoMuSize, (byte)(18), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHU_CoMuSize_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A186UVID_ATRCONTARTHU_CoMuSize), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A186UVID_ATRCONTARTHU_CoMuSize), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHU_CoMuSize_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHU_CoMuSize_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHU_MuestDes_Internalname, "U_Muest Des", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHU_MuestDes_Internalname, GXutil.rtrim( A187UVID_ATRCONTARTHU_MuestDes), GXutil.rtrim( localUtil.format( A187UVID_ATRCONTARTHU_MuestDes, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHU_MuestDes_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHU_MuestDes_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_ATRCONTARTH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_ATRCONTARTHU_MuDeSize_Internalname, "U_Mu De Size", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_ATRCONTARTHU_MuDeSize_Internalname, GXutil.ltrim( localUtil.ntoc( A188UVID_ATRCONTARTHU_MuDeSize, (byte)(18), (byte)(0), ",", "")), ((edtUVID_ATRCONTARTHU_MuDeSize_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A188UVID_ATRCONTARTHU_MuDeSize), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A188UVID_ATRCONTARTHU_MuDeSize), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_ATRCONTARTHU_MuDeSize_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_ATRCONTARTHU_MuDeSize_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_ATRCONTARTH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_ATRCONTARTH.htm");
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHDocEntry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHDocEntry_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHDOCENTRY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A162UVID_ATRCONTARTHDocEntry = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
            }
            else
            {
               A162UVID_ATRCONTARTHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHDocEntry_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHDocNum_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHDocNum_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHDOCNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHDocNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A163UVID_ATRCONTARTHDocNum = 0 ;
               n163UVID_ATRCONTARTHDocNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A163UVID_ATRCONTARTHDocNum", GXutil.ltrim( GXutil.str( A163UVID_ATRCONTARTHDocNum, 9, 0)));
            }
            else
            {
               A163UVID_ATRCONTARTHDocNum = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHDocNum_Internalname), ",", ".")) ;
               n163UVID_ATRCONTARTHDocNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A163UVID_ATRCONTARTHDocNum", GXutil.ltrim( GXutil.str( A163UVID_ATRCONTARTHDocNum, 9, 0)));
            }
            n163UVID_ATRCONTARTHDocNum = ((0==A163UVID_ATRCONTARTHDocNum) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHPeriod_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHPeriod_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHPERIOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHPeriod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A164UVID_ATRCONTARTHPeriod = 0 ;
               n164UVID_ATRCONTARTHPeriod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A164UVID_ATRCONTARTHPeriod", GXutil.ltrim( GXutil.str( A164UVID_ATRCONTARTHPeriod, 9, 0)));
            }
            else
            {
               A164UVID_ATRCONTARTHPeriod = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHPeriod_Internalname), ",", ".")) ;
               n164UVID_ATRCONTARTHPeriod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A164UVID_ATRCONTARTHPeriod", GXutil.ltrim( GXutil.str( A164UVID_ATRCONTARTHPeriod, 9, 0)));
            }
            n164UVID_ATRCONTARTHPeriod = ((0==A164UVID_ATRCONTARTHPeriod) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHInstance_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHInstance_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHINSTANCE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHInstance_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A165UVID_ATRCONTARTHInstance = (short)(0) ;
               n165UVID_ATRCONTARTHInstance = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A165UVID_ATRCONTARTHInstance", GXutil.ltrim( GXutil.str( A165UVID_ATRCONTARTHInstance, 4, 0)));
            }
            else
            {
               A165UVID_ATRCONTARTHInstance = (short)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHInstance_Internalname), ",", ".")) ;
               n165UVID_ATRCONTARTHInstance = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A165UVID_ATRCONTARTHInstance", GXutil.ltrim( GXutil.str( A165UVID_ATRCONTARTHInstance, 4, 0)));
            }
            n165UVID_ATRCONTARTHInstance = ((0==A165UVID_ATRCONTARTHInstance) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHSeries_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHSeries_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHSERIES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHSeries_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A166UVID_ATRCONTARTHSeries = 0 ;
               n166UVID_ATRCONTARTHSeries = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A166UVID_ATRCONTARTHSeries", GXutil.ltrim( GXutil.str( A166UVID_ATRCONTARTHSeries, 9, 0)));
            }
            else
            {
               A166UVID_ATRCONTARTHSeries = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHSeries_Internalname), ",", ".")) ;
               n166UVID_ATRCONTARTHSeries = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A166UVID_ATRCONTARTHSeries", GXutil.ltrim( GXutil.str( A166UVID_ATRCONTARTHSeries, 9, 0)));
            }
            n166UVID_ATRCONTARTHSeries = ((0==A166UVID_ATRCONTARTHSeries) ? true : false) ;
            A167UVID_ATRCONTARTHHandwrtten = httpContext.cgiGet( edtUVID_ATRCONTARTHHandwrtten_Internalname) ;
            n167UVID_ATRCONTARTHHandwrtten = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A167UVID_ATRCONTARTHHandwrtten", A167UVID_ATRCONTARTHHandwrtten);
            n167UVID_ATRCONTARTHHandwrtten = ((GXutil.strcmp("", A167UVID_ATRCONTARTHHandwrtten)==0) ? true : false) ;
            A168UVID_ATRCONTARTHCanceled = httpContext.cgiGet( edtUVID_ATRCONTARTHCanceled_Internalname) ;
            n168UVID_ATRCONTARTHCanceled = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A168UVID_ATRCONTARTHCanceled", A168UVID_ATRCONTARTHCanceled);
            n168UVID_ATRCONTARTHCanceled = ((GXutil.strcmp("", A168UVID_ATRCONTARTHCanceled)==0) ? true : false) ;
            A169UVID_ATRCONTARTHObject = httpContext.cgiGet( edtUVID_ATRCONTARTHObject_Internalname) ;
            n169UVID_ATRCONTARTHObject = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A169UVID_ATRCONTARTHObject", A169UVID_ATRCONTARTHObject);
            n169UVID_ATRCONTARTHObject = ((GXutil.strcmp("", A169UVID_ATRCONTARTHObject)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHLogInst_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHLogInst_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHLOGINST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHLogInst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A170UVID_ATRCONTARTHLogInst = 0 ;
               n170UVID_ATRCONTARTHLogInst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A170UVID_ATRCONTARTHLogInst", GXutil.ltrim( GXutil.str( A170UVID_ATRCONTARTHLogInst, 9, 0)));
            }
            else
            {
               A170UVID_ATRCONTARTHLogInst = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHLogInst_Internalname), ",", ".")) ;
               n170UVID_ATRCONTARTHLogInst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A170UVID_ATRCONTARTHLogInst", GXutil.ltrim( GXutil.str( A170UVID_ATRCONTARTHLogInst, 9, 0)));
            }
            n170UVID_ATRCONTARTHLogInst = ((0==A170UVID_ATRCONTARTHLogInst) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHUserSign_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHUserSign_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHUSERSIGN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHUserSign_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A171UVID_ATRCONTARTHUserSign = 0 ;
               n171UVID_ATRCONTARTHUserSign = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A171UVID_ATRCONTARTHUserSign", GXutil.ltrim( GXutil.str( A171UVID_ATRCONTARTHUserSign, 9, 0)));
            }
            else
            {
               A171UVID_ATRCONTARTHUserSign = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHUserSign_Internalname), ",", ".")) ;
               n171UVID_ATRCONTARTHUserSign = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A171UVID_ATRCONTARTHUserSign", GXutil.ltrim( GXutil.str( A171UVID_ATRCONTARTHUserSign, 9, 0)));
            }
            n171UVID_ATRCONTARTHUserSign = ((0==A171UVID_ATRCONTARTHUserSign) ? true : false) ;
            A172UVID_ATRCONTARTHTransfered = httpContext.cgiGet( edtUVID_ATRCONTARTHTransfered_Internalname) ;
            n172UVID_ATRCONTARTHTransfered = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A172UVID_ATRCONTARTHTransfered", A172UVID_ATRCONTARTHTransfered);
            n172UVID_ATRCONTARTHTransfered = ((GXutil.strcmp("", A172UVID_ATRCONTARTHTransfered)==0) ? true : false) ;
            A173UVID_ATRCONTARTHStatus = httpContext.cgiGet( edtUVID_ATRCONTARTHStatus_Internalname) ;
            n173UVID_ATRCONTARTHStatus = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A173UVID_ATRCONTARTHStatus", A173UVID_ATRCONTARTHStatus);
            n173UVID_ATRCONTARTHStatus = ((GXutil.strcmp("", A173UVID_ATRCONTARTHStatus)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtUVID_ATRCONTARTHCreateDate_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "UVID_ATRCONTARTHCREATEDATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHCreateDate_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A174UVID_ATRCONTARTHCreateDate = GXutil.resetTime( GXutil.nullDate() );
               n174UVID_ATRCONTARTHCreateDate = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A174UVID_ATRCONTARTHCreateDate", localUtil.ttoc( A174UVID_ATRCONTARTHCreateDate, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A174UVID_ATRCONTARTHCreateDate = localUtil.ctot( httpContext.cgiGet( edtUVID_ATRCONTARTHCreateDate_Internalname)) ;
               n174UVID_ATRCONTARTHCreateDate = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A174UVID_ATRCONTARTHCreateDate", localUtil.ttoc( A174UVID_ATRCONTARTHCreateDate, 10, 8, 0, 3, "/", ":", " "));
            }
            n174UVID_ATRCONTARTHCreateDate = (GXutil.dateCompare(GXutil.nullDate(), A174UVID_ATRCONTARTHCreateDate) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHCreateTime_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHCreateTime_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHCREATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHCreateTime_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A175UVID_ATRCONTARTHCreateTime = (short)(0) ;
               n175UVID_ATRCONTARTHCreateTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A175UVID_ATRCONTARTHCreateTime", GXutil.ltrim( GXutil.str( A175UVID_ATRCONTARTHCreateTime, 4, 0)));
            }
            else
            {
               A175UVID_ATRCONTARTHCreateTime = (short)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHCreateTime_Internalname), ",", ".")) ;
               n175UVID_ATRCONTARTHCreateTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A175UVID_ATRCONTARTHCreateTime", GXutil.ltrim( GXutil.str( A175UVID_ATRCONTARTHCreateTime, 4, 0)));
            }
            n175UVID_ATRCONTARTHCreateTime = ((0==A175UVID_ATRCONTARTHCreateTime) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtUVID_ATRCONTARTHUpdateDate_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "UVID_ATRCONTARTHUPDATEDATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHUpdateDate_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A176UVID_ATRCONTARTHUpdateDate = GXutil.resetTime( GXutil.nullDate() );
               n176UVID_ATRCONTARTHUpdateDate = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A176UVID_ATRCONTARTHUpdateDate", localUtil.ttoc( A176UVID_ATRCONTARTHUpdateDate, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A176UVID_ATRCONTARTHUpdateDate = localUtil.ctot( httpContext.cgiGet( edtUVID_ATRCONTARTHUpdateDate_Internalname)) ;
               n176UVID_ATRCONTARTHUpdateDate = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A176UVID_ATRCONTARTHUpdateDate", localUtil.ttoc( A176UVID_ATRCONTARTHUpdateDate, 10, 8, 0, 3, "/", ":", " "));
            }
            n176UVID_ATRCONTARTHUpdateDate = (GXutil.dateCompare(GXutil.nullDate(), A176UVID_ATRCONTARTHUpdateDate) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHUpdateTime_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHUpdateTime_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHUPDATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHUpdateTime_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A177UVID_ATRCONTARTHUpdateTime = (short)(0) ;
               n177UVID_ATRCONTARTHUpdateTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A177UVID_ATRCONTARTHUpdateTime", GXutil.ltrim( GXutil.str( A177UVID_ATRCONTARTHUpdateTime, 4, 0)));
            }
            else
            {
               A177UVID_ATRCONTARTHUpdateTime = (short)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHUpdateTime_Internalname), ",", ".")) ;
               n177UVID_ATRCONTARTHUpdateTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A177UVID_ATRCONTARTHUpdateTime", GXutil.ltrim( GXutil.str( A177UVID_ATRCONTARTHUpdateTime, 4, 0)));
            }
            n177UVID_ATRCONTARTHUpdateTime = ((0==A177UVID_ATRCONTARTHUpdateTime) ? true : false) ;
            A178UVID_ATRCONTARTHDataSource = httpContext.cgiGet( edtUVID_ATRCONTARTHDataSource_Internalname) ;
            n178UVID_ATRCONTARTHDataSource = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A178UVID_ATRCONTARTHDataSource", A178UVID_ATRCONTARTHDataSource);
            n178UVID_ATRCONTARTHDataSource = ((GXutil.strcmp("", A178UVID_ATRCONTARTHDataSource)==0) ? true : false) ;
            A179UVID_ATRCONTARTHRequestStatus = httpContext.cgiGet( edtUVID_ATRCONTARTHRequestStatus_Internalname) ;
            n179UVID_ATRCONTARTHRequestStatus = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A179UVID_ATRCONTARTHRequestStatus", A179UVID_ATRCONTARTHRequestStatus);
            n179UVID_ATRCONTARTHRequestStatus = ((GXutil.strcmp("", A179UVID_ATRCONTARTHRequestStatus)==0) ? true : false) ;
            A180UVID_ATRCONTARTHCreator = httpContext.cgiGet( edtUVID_ATRCONTARTHCreator_Internalname) ;
            n180UVID_ATRCONTARTHCreator = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A180UVID_ATRCONTARTHCreator", A180UVID_ATRCONTARTHCreator);
            n180UVID_ATRCONTARTHCreator = ((GXutil.strcmp("", A180UVID_ATRCONTARTHCreator)==0) ? true : false) ;
            A181UVID_ATRCONTARTHRemark = httpContext.cgiGet( edtUVID_ATRCONTARTHRemark_Internalname) ;
            n181UVID_ATRCONTARTHRemark = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A181UVID_ATRCONTARTHRemark", A181UVID_ATRCONTARTHRemark);
            n181UVID_ATRCONTARTHRemark = ((GXutil.strcmp("", A181UVID_ATRCONTARTHRemark)==0) ? true : false) ;
            A182UVID_ATRCONTARTHU_ItemCode = httpContext.cgiGet( edtUVID_ATRCONTARTHU_ItemCode_Internalname) ;
            n182UVID_ATRCONTARTHU_ItemCode = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A182UVID_ATRCONTARTHU_ItemCode", A182UVID_ATRCONTARTHU_ItemCode);
            n182UVID_ATRCONTARTHU_ItemCode = ((GXutil.strcmp("", A182UVID_ATRCONTARTHU_ItemCode)==0) ? true : false) ;
            A183UVID_ATRCONTARTHU_ItemName = httpContext.cgiGet( edtUVID_ATRCONTARTHU_ItemName_Internalname) ;
            n183UVID_ATRCONTARTHU_ItemName = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A183UVID_ATRCONTARTHU_ItemName", A183UVID_ATRCONTARTHU_ItemName);
            n183UVID_ATRCONTARTHU_ItemName = ((GXutil.strcmp("", A183UVID_ATRCONTARTHU_ItemName)==0) ? true : false) ;
            A184UVID_ATRCONTARTHU_Comment = httpContext.cgiGet( edtUVID_ATRCONTARTHU_Comment_Internalname) ;
            n184UVID_ATRCONTARTHU_Comment = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A184UVID_ATRCONTARTHU_Comment", A184UVID_ATRCONTARTHU_Comment);
            n184UVID_ATRCONTARTHU_Comment = ((GXutil.strcmp("", A184UVID_ATRCONTARTHU_Comment)==0) ? true : false) ;
            A185UVID_ATRCONTARTHU_ContraMu = httpContext.cgiGet( edtUVID_ATRCONTARTHU_ContraMu_Internalname) ;
            n185UVID_ATRCONTARTHU_ContraMu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A185UVID_ATRCONTARTHU_ContraMu", A185UVID_ATRCONTARTHU_ContraMu);
            n185UVID_ATRCONTARTHU_ContraMu = ((GXutil.strcmp("", A185UVID_ATRCONTARTHU_ContraMu)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHU_CoMuSize_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHU_CoMuSize_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHU_COMUSIZE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHU_CoMuSize_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A186UVID_ATRCONTARTHU_CoMuSize = 0 ;
               n186UVID_ATRCONTARTHU_CoMuSize = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A186UVID_ATRCONTARTHU_CoMuSize", GXutil.ltrim( GXutil.str( A186UVID_ATRCONTARTHU_CoMuSize, 18, 0)));
            }
            else
            {
               A186UVID_ATRCONTARTHU_CoMuSize = localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHU_CoMuSize_Internalname), ",", ".") ;
               n186UVID_ATRCONTARTHU_CoMuSize = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A186UVID_ATRCONTARTHU_CoMuSize", GXutil.ltrim( GXutil.str( A186UVID_ATRCONTARTHU_CoMuSize, 18, 0)));
            }
            n186UVID_ATRCONTARTHU_CoMuSize = ((0==A186UVID_ATRCONTARTHU_CoMuSize) ? true : false) ;
            A187UVID_ATRCONTARTHU_MuestDes = httpContext.cgiGet( edtUVID_ATRCONTARTHU_MuestDes_Internalname) ;
            n187UVID_ATRCONTARTHU_MuestDes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A187UVID_ATRCONTARTHU_MuestDes", A187UVID_ATRCONTARTHU_MuestDes);
            n187UVID_ATRCONTARTHU_MuestDes = ((GXutil.strcmp("", A187UVID_ATRCONTARTHU_MuestDes)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHU_MuDeSize_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHU_MuDeSize_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_ATRCONTARTHU_MUDESIZE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHU_MuDeSize_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A188UVID_ATRCONTARTHU_MuDeSize = 0 ;
               n188UVID_ATRCONTARTHU_MuDeSize = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A188UVID_ATRCONTARTHU_MuDeSize", GXutil.ltrim( GXutil.str( A188UVID_ATRCONTARTHU_MuDeSize, 18, 0)));
            }
            else
            {
               A188UVID_ATRCONTARTHU_MuDeSize = localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTHU_MuDeSize_Internalname), ",", ".") ;
               n188UVID_ATRCONTARTHU_MuDeSize = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A188UVID_ATRCONTARTHU_MuDeSize", GXutil.ltrim( GXutil.str( A188UVID_ATRCONTARTHU_MuDeSize, 18, 0)));
            }
            n188UVID_ATRCONTARTHU_MuDeSize = ((0==A188UVID_ATRCONTARTHU_MuDeSize) ? true : false) ;
            /* Read saved values. */
            Z162UVID_ATRCONTARTHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( "Z162UVID_ATRCONTARTHDocEntry"), ",", ".")) ;
            Z163UVID_ATRCONTARTHDocNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z163UVID_ATRCONTARTHDocNum"), ",", ".")) ;
            n163UVID_ATRCONTARTHDocNum = ((0==A163UVID_ATRCONTARTHDocNum) ? true : false) ;
            Z164UVID_ATRCONTARTHPeriod = (int)(localUtil.ctol( httpContext.cgiGet( "Z164UVID_ATRCONTARTHPeriod"), ",", ".")) ;
            n164UVID_ATRCONTARTHPeriod = ((0==A164UVID_ATRCONTARTHPeriod) ? true : false) ;
            Z165UVID_ATRCONTARTHInstance = (short)(localUtil.ctol( httpContext.cgiGet( "Z165UVID_ATRCONTARTHInstance"), ",", ".")) ;
            n165UVID_ATRCONTARTHInstance = ((0==A165UVID_ATRCONTARTHInstance) ? true : false) ;
            Z166UVID_ATRCONTARTHSeries = (int)(localUtil.ctol( httpContext.cgiGet( "Z166UVID_ATRCONTARTHSeries"), ",", ".")) ;
            n166UVID_ATRCONTARTHSeries = ((0==A166UVID_ATRCONTARTHSeries) ? true : false) ;
            Z167UVID_ATRCONTARTHHandwrtten = httpContext.cgiGet( "Z167UVID_ATRCONTARTHHandwrtten") ;
            n167UVID_ATRCONTARTHHandwrtten = ((GXutil.strcmp("", A167UVID_ATRCONTARTHHandwrtten)==0) ? true : false) ;
            Z168UVID_ATRCONTARTHCanceled = httpContext.cgiGet( "Z168UVID_ATRCONTARTHCanceled") ;
            n168UVID_ATRCONTARTHCanceled = ((GXutil.strcmp("", A168UVID_ATRCONTARTHCanceled)==0) ? true : false) ;
            Z169UVID_ATRCONTARTHObject = httpContext.cgiGet( "Z169UVID_ATRCONTARTHObject") ;
            n169UVID_ATRCONTARTHObject = ((GXutil.strcmp("", A169UVID_ATRCONTARTHObject)==0) ? true : false) ;
            Z170UVID_ATRCONTARTHLogInst = (int)(localUtil.ctol( httpContext.cgiGet( "Z170UVID_ATRCONTARTHLogInst"), ",", ".")) ;
            n170UVID_ATRCONTARTHLogInst = ((0==A170UVID_ATRCONTARTHLogInst) ? true : false) ;
            Z171UVID_ATRCONTARTHUserSign = (int)(localUtil.ctol( httpContext.cgiGet( "Z171UVID_ATRCONTARTHUserSign"), ",", ".")) ;
            n171UVID_ATRCONTARTHUserSign = ((0==A171UVID_ATRCONTARTHUserSign) ? true : false) ;
            Z172UVID_ATRCONTARTHTransfered = httpContext.cgiGet( "Z172UVID_ATRCONTARTHTransfered") ;
            n172UVID_ATRCONTARTHTransfered = ((GXutil.strcmp("", A172UVID_ATRCONTARTHTransfered)==0) ? true : false) ;
            Z173UVID_ATRCONTARTHStatus = httpContext.cgiGet( "Z173UVID_ATRCONTARTHStatus") ;
            n173UVID_ATRCONTARTHStatus = ((GXutil.strcmp("", A173UVID_ATRCONTARTHStatus)==0) ? true : false) ;
            Z174UVID_ATRCONTARTHCreateDate = localUtil.ctot( httpContext.cgiGet( "Z174UVID_ATRCONTARTHCreateDate"), 0) ;
            n174UVID_ATRCONTARTHCreateDate = (GXutil.dateCompare(GXutil.nullDate(), A174UVID_ATRCONTARTHCreateDate) ? true : false) ;
            Z175UVID_ATRCONTARTHCreateTime = (short)(localUtil.ctol( httpContext.cgiGet( "Z175UVID_ATRCONTARTHCreateTime"), ",", ".")) ;
            n175UVID_ATRCONTARTHCreateTime = ((0==A175UVID_ATRCONTARTHCreateTime) ? true : false) ;
            Z176UVID_ATRCONTARTHUpdateDate = localUtil.ctot( httpContext.cgiGet( "Z176UVID_ATRCONTARTHUpdateDate"), 0) ;
            n176UVID_ATRCONTARTHUpdateDate = (GXutil.dateCompare(GXutil.nullDate(), A176UVID_ATRCONTARTHUpdateDate) ? true : false) ;
            Z177UVID_ATRCONTARTHUpdateTime = (short)(localUtil.ctol( httpContext.cgiGet( "Z177UVID_ATRCONTARTHUpdateTime"), ",", ".")) ;
            n177UVID_ATRCONTARTHUpdateTime = ((0==A177UVID_ATRCONTARTHUpdateTime) ? true : false) ;
            Z178UVID_ATRCONTARTHDataSource = httpContext.cgiGet( "Z178UVID_ATRCONTARTHDataSource") ;
            n178UVID_ATRCONTARTHDataSource = ((GXutil.strcmp("", A178UVID_ATRCONTARTHDataSource)==0) ? true : false) ;
            Z179UVID_ATRCONTARTHRequestStatus = httpContext.cgiGet( "Z179UVID_ATRCONTARTHRequestStatus") ;
            n179UVID_ATRCONTARTHRequestStatus = ((GXutil.strcmp("", A179UVID_ATRCONTARTHRequestStatus)==0) ? true : false) ;
            Z180UVID_ATRCONTARTHCreator = httpContext.cgiGet( "Z180UVID_ATRCONTARTHCreator") ;
            n180UVID_ATRCONTARTHCreator = ((GXutil.strcmp("", A180UVID_ATRCONTARTHCreator)==0) ? true : false) ;
            Z182UVID_ATRCONTARTHU_ItemCode = httpContext.cgiGet( "Z182UVID_ATRCONTARTHU_ItemCode") ;
            n182UVID_ATRCONTARTHU_ItemCode = ((GXutil.strcmp("", A182UVID_ATRCONTARTHU_ItemCode)==0) ? true : false) ;
            Z183UVID_ATRCONTARTHU_ItemName = httpContext.cgiGet( "Z183UVID_ATRCONTARTHU_ItemName") ;
            n183UVID_ATRCONTARTHU_ItemName = ((GXutil.strcmp("", A183UVID_ATRCONTARTHU_ItemName)==0) ? true : false) ;
            Z184UVID_ATRCONTARTHU_Comment = httpContext.cgiGet( "Z184UVID_ATRCONTARTHU_Comment") ;
            n184UVID_ATRCONTARTHU_Comment = ((GXutil.strcmp("", A184UVID_ATRCONTARTHU_Comment)==0) ? true : false) ;
            Z185UVID_ATRCONTARTHU_ContraMu = httpContext.cgiGet( "Z185UVID_ATRCONTARTHU_ContraMu") ;
            n185UVID_ATRCONTARTHU_ContraMu = ((GXutil.strcmp("", A185UVID_ATRCONTARTHU_ContraMu)==0) ? true : false) ;
            Z186UVID_ATRCONTARTHU_CoMuSize = localUtil.ctol( httpContext.cgiGet( "Z186UVID_ATRCONTARTHU_CoMuSize"), ",", ".") ;
            n186UVID_ATRCONTARTHU_CoMuSize = ((0==A186UVID_ATRCONTARTHU_CoMuSize) ? true : false) ;
            Z187UVID_ATRCONTARTHU_MuestDes = httpContext.cgiGet( "Z187UVID_ATRCONTARTHU_MuestDes") ;
            n187UVID_ATRCONTARTHU_MuestDes = ((GXutil.strcmp("", A187UVID_ATRCONTARTHU_MuestDes)==0) ? true : false) ;
            Z188UVID_ATRCONTARTHU_MuDeSize = localUtil.ctol( httpContext.cgiGet( "Z188UVID_ATRCONTARTHU_MuDeSize"), ",", ".") ;
            n188UVID_ATRCONTARTHU_MuDeSize = ((0==A188UVID_ATRCONTARTHU_MuDeSize) ? true : false) ;
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
               A162UVID_ATRCONTARTHDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
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
            initAll0B10( ) ;
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
      disableAttributes0B10( ) ;
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

   public void resetCaption0B0( )
   {
   }

   public void zm0B10( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z163UVID_ATRCONTARTHDocNum = T000B3_A163UVID_ATRCONTARTHDocNum[0] ;
            Z164UVID_ATRCONTARTHPeriod = T000B3_A164UVID_ATRCONTARTHPeriod[0] ;
            Z165UVID_ATRCONTARTHInstance = T000B3_A165UVID_ATRCONTARTHInstance[0] ;
            Z166UVID_ATRCONTARTHSeries = T000B3_A166UVID_ATRCONTARTHSeries[0] ;
            Z167UVID_ATRCONTARTHHandwrtten = T000B3_A167UVID_ATRCONTARTHHandwrtten[0] ;
            Z168UVID_ATRCONTARTHCanceled = T000B3_A168UVID_ATRCONTARTHCanceled[0] ;
            Z169UVID_ATRCONTARTHObject = T000B3_A169UVID_ATRCONTARTHObject[0] ;
            Z170UVID_ATRCONTARTHLogInst = T000B3_A170UVID_ATRCONTARTHLogInst[0] ;
            Z171UVID_ATRCONTARTHUserSign = T000B3_A171UVID_ATRCONTARTHUserSign[0] ;
            Z172UVID_ATRCONTARTHTransfered = T000B3_A172UVID_ATRCONTARTHTransfered[0] ;
            Z173UVID_ATRCONTARTHStatus = T000B3_A173UVID_ATRCONTARTHStatus[0] ;
            Z174UVID_ATRCONTARTHCreateDate = T000B3_A174UVID_ATRCONTARTHCreateDate[0] ;
            Z175UVID_ATRCONTARTHCreateTime = T000B3_A175UVID_ATRCONTARTHCreateTime[0] ;
            Z176UVID_ATRCONTARTHUpdateDate = T000B3_A176UVID_ATRCONTARTHUpdateDate[0] ;
            Z177UVID_ATRCONTARTHUpdateTime = T000B3_A177UVID_ATRCONTARTHUpdateTime[0] ;
            Z178UVID_ATRCONTARTHDataSource = T000B3_A178UVID_ATRCONTARTHDataSource[0] ;
            Z179UVID_ATRCONTARTHRequestStatus = T000B3_A179UVID_ATRCONTARTHRequestStatus[0] ;
            Z180UVID_ATRCONTARTHCreator = T000B3_A180UVID_ATRCONTARTHCreator[0] ;
            Z182UVID_ATRCONTARTHU_ItemCode = T000B3_A182UVID_ATRCONTARTHU_ItemCode[0] ;
            Z183UVID_ATRCONTARTHU_ItemName = T000B3_A183UVID_ATRCONTARTHU_ItemName[0] ;
            Z184UVID_ATRCONTARTHU_Comment = T000B3_A184UVID_ATRCONTARTHU_Comment[0] ;
            Z185UVID_ATRCONTARTHU_ContraMu = T000B3_A185UVID_ATRCONTARTHU_ContraMu[0] ;
            Z186UVID_ATRCONTARTHU_CoMuSize = T000B3_A186UVID_ATRCONTARTHU_CoMuSize[0] ;
            Z187UVID_ATRCONTARTHU_MuestDes = T000B3_A187UVID_ATRCONTARTHU_MuestDes[0] ;
            Z188UVID_ATRCONTARTHU_MuDeSize = T000B3_A188UVID_ATRCONTARTHU_MuDeSize[0] ;
         }
         else
         {
            Z163UVID_ATRCONTARTHDocNum = A163UVID_ATRCONTARTHDocNum ;
            Z164UVID_ATRCONTARTHPeriod = A164UVID_ATRCONTARTHPeriod ;
            Z165UVID_ATRCONTARTHInstance = A165UVID_ATRCONTARTHInstance ;
            Z166UVID_ATRCONTARTHSeries = A166UVID_ATRCONTARTHSeries ;
            Z167UVID_ATRCONTARTHHandwrtten = A167UVID_ATRCONTARTHHandwrtten ;
            Z168UVID_ATRCONTARTHCanceled = A168UVID_ATRCONTARTHCanceled ;
            Z169UVID_ATRCONTARTHObject = A169UVID_ATRCONTARTHObject ;
            Z170UVID_ATRCONTARTHLogInst = A170UVID_ATRCONTARTHLogInst ;
            Z171UVID_ATRCONTARTHUserSign = A171UVID_ATRCONTARTHUserSign ;
            Z172UVID_ATRCONTARTHTransfered = A172UVID_ATRCONTARTHTransfered ;
            Z173UVID_ATRCONTARTHStatus = A173UVID_ATRCONTARTHStatus ;
            Z174UVID_ATRCONTARTHCreateDate = A174UVID_ATRCONTARTHCreateDate ;
            Z175UVID_ATRCONTARTHCreateTime = A175UVID_ATRCONTARTHCreateTime ;
            Z176UVID_ATRCONTARTHUpdateDate = A176UVID_ATRCONTARTHUpdateDate ;
            Z177UVID_ATRCONTARTHUpdateTime = A177UVID_ATRCONTARTHUpdateTime ;
            Z178UVID_ATRCONTARTHDataSource = A178UVID_ATRCONTARTHDataSource ;
            Z179UVID_ATRCONTARTHRequestStatus = A179UVID_ATRCONTARTHRequestStatus ;
            Z180UVID_ATRCONTARTHCreator = A180UVID_ATRCONTARTHCreator ;
            Z182UVID_ATRCONTARTHU_ItemCode = A182UVID_ATRCONTARTHU_ItemCode ;
            Z183UVID_ATRCONTARTHU_ItemName = A183UVID_ATRCONTARTHU_ItemName ;
            Z184UVID_ATRCONTARTHU_Comment = A184UVID_ATRCONTARTHU_Comment ;
            Z185UVID_ATRCONTARTHU_ContraMu = A185UVID_ATRCONTARTHU_ContraMu ;
            Z186UVID_ATRCONTARTHU_CoMuSize = A186UVID_ATRCONTARTHU_CoMuSize ;
            Z187UVID_ATRCONTARTHU_MuestDes = A187UVID_ATRCONTARTHU_MuestDes ;
            Z188UVID_ATRCONTARTHU_MuDeSize = A188UVID_ATRCONTARTHU_MuDeSize ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z162UVID_ATRCONTARTHDocEntry = A162UVID_ATRCONTARTHDocEntry ;
         Z163UVID_ATRCONTARTHDocNum = A163UVID_ATRCONTARTHDocNum ;
         Z164UVID_ATRCONTARTHPeriod = A164UVID_ATRCONTARTHPeriod ;
         Z165UVID_ATRCONTARTHInstance = A165UVID_ATRCONTARTHInstance ;
         Z166UVID_ATRCONTARTHSeries = A166UVID_ATRCONTARTHSeries ;
         Z167UVID_ATRCONTARTHHandwrtten = A167UVID_ATRCONTARTHHandwrtten ;
         Z168UVID_ATRCONTARTHCanceled = A168UVID_ATRCONTARTHCanceled ;
         Z169UVID_ATRCONTARTHObject = A169UVID_ATRCONTARTHObject ;
         Z170UVID_ATRCONTARTHLogInst = A170UVID_ATRCONTARTHLogInst ;
         Z171UVID_ATRCONTARTHUserSign = A171UVID_ATRCONTARTHUserSign ;
         Z172UVID_ATRCONTARTHTransfered = A172UVID_ATRCONTARTHTransfered ;
         Z173UVID_ATRCONTARTHStatus = A173UVID_ATRCONTARTHStatus ;
         Z174UVID_ATRCONTARTHCreateDate = A174UVID_ATRCONTARTHCreateDate ;
         Z175UVID_ATRCONTARTHCreateTime = A175UVID_ATRCONTARTHCreateTime ;
         Z176UVID_ATRCONTARTHUpdateDate = A176UVID_ATRCONTARTHUpdateDate ;
         Z177UVID_ATRCONTARTHUpdateTime = A177UVID_ATRCONTARTHUpdateTime ;
         Z178UVID_ATRCONTARTHDataSource = A178UVID_ATRCONTARTHDataSource ;
         Z179UVID_ATRCONTARTHRequestStatus = A179UVID_ATRCONTARTHRequestStatus ;
         Z180UVID_ATRCONTARTHCreator = A180UVID_ATRCONTARTHCreator ;
         Z181UVID_ATRCONTARTHRemark = A181UVID_ATRCONTARTHRemark ;
         Z182UVID_ATRCONTARTHU_ItemCode = A182UVID_ATRCONTARTHU_ItemCode ;
         Z183UVID_ATRCONTARTHU_ItemName = A183UVID_ATRCONTARTHU_ItemName ;
         Z184UVID_ATRCONTARTHU_Comment = A184UVID_ATRCONTARTHU_Comment ;
         Z185UVID_ATRCONTARTHU_ContraMu = A185UVID_ATRCONTARTHU_ContraMu ;
         Z186UVID_ATRCONTARTHU_CoMuSize = A186UVID_ATRCONTARTHU_CoMuSize ;
         Z187UVID_ATRCONTARTHU_MuestDes = A187UVID_ATRCONTARTHU_MuestDes ;
         Z188UVID_ATRCONTARTHU_MuDeSize = A188UVID_ATRCONTARTHU_MuDeSize ;
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

   public void load0B10( )
   {
      /* Using cursor T000B4 */
      pr_fusquim_sap.execute(2, new Object[] {new Integer(A162UVID_ATRCONTARTHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(2) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A163UVID_ATRCONTARTHDocNum = T000B4_A163UVID_ATRCONTARTHDocNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163UVID_ATRCONTARTHDocNum", GXutil.ltrim( GXutil.str( A163UVID_ATRCONTARTHDocNum, 9, 0)));
         n163UVID_ATRCONTARTHDocNum = T000B4_n163UVID_ATRCONTARTHDocNum[0] ;
         A164UVID_ATRCONTARTHPeriod = T000B4_A164UVID_ATRCONTARTHPeriod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164UVID_ATRCONTARTHPeriod", GXutil.ltrim( GXutil.str( A164UVID_ATRCONTARTHPeriod, 9, 0)));
         n164UVID_ATRCONTARTHPeriod = T000B4_n164UVID_ATRCONTARTHPeriod[0] ;
         A165UVID_ATRCONTARTHInstance = T000B4_A165UVID_ATRCONTARTHInstance[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165UVID_ATRCONTARTHInstance", GXutil.ltrim( GXutil.str( A165UVID_ATRCONTARTHInstance, 4, 0)));
         n165UVID_ATRCONTARTHInstance = T000B4_n165UVID_ATRCONTARTHInstance[0] ;
         A166UVID_ATRCONTARTHSeries = T000B4_A166UVID_ATRCONTARTHSeries[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166UVID_ATRCONTARTHSeries", GXutil.ltrim( GXutil.str( A166UVID_ATRCONTARTHSeries, 9, 0)));
         n166UVID_ATRCONTARTHSeries = T000B4_n166UVID_ATRCONTARTHSeries[0] ;
         A167UVID_ATRCONTARTHHandwrtten = T000B4_A167UVID_ATRCONTARTHHandwrtten[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A167UVID_ATRCONTARTHHandwrtten", A167UVID_ATRCONTARTHHandwrtten);
         n167UVID_ATRCONTARTHHandwrtten = T000B4_n167UVID_ATRCONTARTHHandwrtten[0] ;
         A168UVID_ATRCONTARTHCanceled = T000B4_A168UVID_ATRCONTARTHCanceled[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A168UVID_ATRCONTARTHCanceled", A168UVID_ATRCONTARTHCanceled);
         n168UVID_ATRCONTARTHCanceled = T000B4_n168UVID_ATRCONTARTHCanceled[0] ;
         A169UVID_ATRCONTARTHObject = T000B4_A169UVID_ATRCONTARTHObject[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A169UVID_ATRCONTARTHObject", A169UVID_ATRCONTARTHObject);
         n169UVID_ATRCONTARTHObject = T000B4_n169UVID_ATRCONTARTHObject[0] ;
         A170UVID_ATRCONTARTHLogInst = T000B4_A170UVID_ATRCONTARTHLogInst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170UVID_ATRCONTARTHLogInst", GXutil.ltrim( GXutil.str( A170UVID_ATRCONTARTHLogInst, 9, 0)));
         n170UVID_ATRCONTARTHLogInst = T000B4_n170UVID_ATRCONTARTHLogInst[0] ;
         A171UVID_ATRCONTARTHUserSign = T000B4_A171UVID_ATRCONTARTHUserSign[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A171UVID_ATRCONTARTHUserSign", GXutil.ltrim( GXutil.str( A171UVID_ATRCONTARTHUserSign, 9, 0)));
         n171UVID_ATRCONTARTHUserSign = T000B4_n171UVID_ATRCONTARTHUserSign[0] ;
         A172UVID_ATRCONTARTHTransfered = T000B4_A172UVID_ATRCONTARTHTransfered[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A172UVID_ATRCONTARTHTransfered", A172UVID_ATRCONTARTHTransfered);
         n172UVID_ATRCONTARTHTransfered = T000B4_n172UVID_ATRCONTARTHTransfered[0] ;
         A173UVID_ATRCONTARTHStatus = T000B4_A173UVID_ATRCONTARTHStatus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A173UVID_ATRCONTARTHStatus", A173UVID_ATRCONTARTHStatus);
         n173UVID_ATRCONTARTHStatus = T000B4_n173UVID_ATRCONTARTHStatus[0] ;
         A174UVID_ATRCONTARTHCreateDate = T000B4_A174UVID_ATRCONTARTHCreateDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A174UVID_ATRCONTARTHCreateDate", localUtil.ttoc( A174UVID_ATRCONTARTHCreateDate, 10, 8, 0, 3, "/", ":", " "));
         n174UVID_ATRCONTARTHCreateDate = T000B4_n174UVID_ATRCONTARTHCreateDate[0] ;
         A175UVID_ATRCONTARTHCreateTime = T000B4_A175UVID_ATRCONTARTHCreateTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A175UVID_ATRCONTARTHCreateTime", GXutil.ltrim( GXutil.str( A175UVID_ATRCONTARTHCreateTime, 4, 0)));
         n175UVID_ATRCONTARTHCreateTime = T000B4_n175UVID_ATRCONTARTHCreateTime[0] ;
         A176UVID_ATRCONTARTHUpdateDate = T000B4_A176UVID_ATRCONTARTHUpdateDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A176UVID_ATRCONTARTHUpdateDate", localUtil.ttoc( A176UVID_ATRCONTARTHUpdateDate, 10, 8, 0, 3, "/", ":", " "));
         n176UVID_ATRCONTARTHUpdateDate = T000B4_n176UVID_ATRCONTARTHUpdateDate[0] ;
         A177UVID_ATRCONTARTHUpdateTime = T000B4_A177UVID_ATRCONTARTHUpdateTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A177UVID_ATRCONTARTHUpdateTime", GXutil.ltrim( GXutil.str( A177UVID_ATRCONTARTHUpdateTime, 4, 0)));
         n177UVID_ATRCONTARTHUpdateTime = T000B4_n177UVID_ATRCONTARTHUpdateTime[0] ;
         A178UVID_ATRCONTARTHDataSource = T000B4_A178UVID_ATRCONTARTHDataSource[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A178UVID_ATRCONTARTHDataSource", A178UVID_ATRCONTARTHDataSource);
         n178UVID_ATRCONTARTHDataSource = T000B4_n178UVID_ATRCONTARTHDataSource[0] ;
         A179UVID_ATRCONTARTHRequestStatus = T000B4_A179UVID_ATRCONTARTHRequestStatus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179UVID_ATRCONTARTHRequestStatus", A179UVID_ATRCONTARTHRequestStatus);
         n179UVID_ATRCONTARTHRequestStatus = T000B4_n179UVID_ATRCONTARTHRequestStatus[0] ;
         A180UVID_ATRCONTARTHCreator = T000B4_A180UVID_ATRCONTARTHCreator[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180UVID_ATRCONTARTHCreator", A180UVID_ATRCONTARTHCreator);
         n180UVID_ATRCONTARTHCreator = T000B4_n180UVID_ATRCONTARTHCreator[0] ;
         A181UVID_ATRCONTARTHRemark = T000B4_A181UVID_ATRCONTARTHRemark[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A181UVID_ATRCONTARTHRemark", A181UVID_ATRCONTARTHRemark);
         n181UVID_ATRCONTARTHRemark = T000B4_n181UVID_ATRCONTARTHRemark[0] ;
         A182UVID_ATRCONTARTHU_ItemCode = T000B4_A182UVID_ATRCONTARTHU_ItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182UVID_ATRCONTARTHU_ItemCode", A182UVID_ATRCONTARTHU_ItemCode);
         n182UVID_ATRCONTARTHU_ItemCode = T000B4_n182UVID_ATRCONTARTHU_ItemCode[0] ;
         A183UVID_ATRCONTARTHU_ItemName = T000B4_A183UVID_ATRCONTARTHU_ItemName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183UVID_ATRCONTARTHU_ItemName", A183UVID_ATRCONTARTHU_ItemName);
         n183UVID_ATRCONTARTHU_ItemName = T000B4_n183UVID_ATRCONTARTHU_ItemName[0] ;
         A184UVID_ATRCONTARTHU_Comment = T000B4_A184UVID_ATRCONTARTHU_Comment[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184UVID_ATRCONTARTHU_Comment", A184UVID_ATRCONTARTHU_Comment);
         n184UVID_ATRCONTARTHU_Comment = T000B4_n184UVID_ATRCONTARTHU_Comment[0] ;
         A185UVID_ATRCONTARTHU_ContraMu = T000B4_A185UVID_ATRCONTARTHU_ContraMu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A185UVID_ATRCONTARTHU_ContraMu", A185UVID_ATRCONTARTHU_ContraMu);
         n185UVID_ATRCONTARTHU_ContraMu = T000B4_n185UVID_ATRCONTARTHU_ContraMu[0] ;
         A186UVID_ATRCONTARTHU_CoMuSize = T000B4_A186UVID_ATRCONTARTHU_CoMuSize[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186UVID_ATRCONTARTHU_CoMuSize", GXutil.ltrim( GXutil.str( A186UVID_ATRCONTARTHU_CoMuSize, 18, 0)));
         n186UVID_ATRCONTARTHU_CoMuSize = T000B4_n186UVID_ATRCONTARTHU_CoMuSize[0] ;
         A187UVID_ATRCONTARTHU_MuestDes = T000B4_A187UVID_ATRCONTARTHU_MuestDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187UVID_ATRCONTARTHU_MuestDes", A187UVID_ATRCONTARTHU_MuestDes);
         n187UVID_ATRCONTARTHU_MuestDes = T000B4_n187UVID_ATRCONTARTHU_MuestDes[0] ;
         A188UVID_ATRCONTARTHU_MuDeSize = T000B4_A188UVID_ATRCONTARTHU_MuDeSize[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A188UVID_ATRCONTARTHU_MuDeSize", GXutil.ltrim( GXutil.str( A188UVID_ATRCONTARTHU_MuDeSize, 18, 0)));
         n188UVID_ATRCONTARTHU_MuDeSize = T000B4_n188UVID_ATRCONTARTHU_MuDeSize[0] ;
         zm0B10( -3) ;
      }
      pr_fusquim_sap.close(2);
      onLoadActions0B10( ) ;
   }

   public void onLoadActions0B10( )
   {
   }

   public void checkExtendedTable0B10( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A174UVID_ATRCONTARTHCreateDate) || (( A174UVID_ATRCONTARTHCreateDate.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A174UVID_ATRCONTARTHCreateDate, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo UVID_ATRCONTARTHCreate Date fuera de rango", "OutOfRange", 1, "UVID_ATRCONTARTHCREATEDATE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUVID_ATRCONTARTHCreateDate_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A176UVID_ATRCONTARTHUpdateDate) || (( A176UVID_ATRCONTARTHUpdateDate.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A176UVID_ATRCONTARTHUpdateDate, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo UVID_ATRCONTARTHUpdate Date fuera de rango", "OutOfRange", 1, "UVID_ATRCONTARTHUPDATEDATE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUVID_ATRCONTARTHUpdateDate_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0B10( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0B10( )
   {
      /* Using cursor T000B5 */
      pr_fusquim_sap.execute(3, new Object[] {new Integer(A162UVID_ATRCONTARTHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(3) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_fusquim_sap.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000B3 */
      pr_fusquim_sap.execute(1, new Object[] {new Integer(A162UVID_ATRCONTARTHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(1) != 101) )
      {
         zm0B10( 3) ;
         RcdFound10 = (short)(1) ;
         A162UVID_ATRCONTARTHDocEntry = T000B3_A162UVID_ATRCONTARTHDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
         A163UVID_ATRCONTARTHDocNum = T000B3_A163UVID_ATRCONTARTHDocNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163UVID_ATRCONTARTHDocNum", GXutil.ltrim( GXutil.str( A163UVID_ATRCONTARTHDocNum, 9, 0)));
         n163UVID_ATRCONTARTHDocNum = T000B3_n163UVID_ATRCONTARTHDocNum[0] ;
         A164UVID_ATRCONTARTHPeriod = T000B3_A164UVID_ATRCONTARTHPeriod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164UVID_ATRCONTARTHPeriod", GXutil.ltrim( GXutil.str( A164UVID_ATRCONTARTHPeriod, 9, 0)));
         n164UVID_ATRCONTARTHPeriod = T000B3_n164UVID_ATRCONTARTHPeriod[0] ;
         A165UVID_ATRCONTARTHInstance = T000B3_A165UVID_ATRCONTARTHInstance[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165UVID_ATRCONTARTHInstance", GXutil.ltrim( GXutil.str( A165UVID_ATRCONTARTHInstance, 4, 0)));
         n165UVID_ATRCONTARTHInstance = T000B3_n165UVID_ATRCONTARTHInstance[0] ;
         A166UVID_ATRCONTARTHSeries = T000B3_A166UVID_ATRCONTARTHSeries[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166UVID_ATRCONTARTHSeries", GXutil.ltrim( GXutil.str( A166UVID_ATRCONTARTHSeries, 9, 0)));
         n166UVID_ATRCONTARTHSeries = T000B3_n166UVID_ATRCONTARTHSeries[0] ;
         A167UVID_ATRCONTARTHHandwrtten = T000B3_A167UVID_ATRCONTARTHHandwrtten[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A167UVID_ATRCONTARTHHandwrtten", A167UVID_ATRCONTARTHHandwrtten);
         n167UVID_ATRCONTARTHHandwrtten = T000B3_n167UVID_ATRCONTARTHHandwrtten[0] ;
         A168UVID_ATRCONTARTHCanceled = T000B3_A168UVID_ATRCONTARTHCanceled[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A168UVID_ATRCONTARTHCanceled", A168UVID_ATRCONTARTHCanceled);
         n168UVID_ATRCONTARTHCanceled = T000B3_n168UVID_ATRCONTARTHCanceled[0] ;
         A169UVID_ATRCONTARTHObject = T000B3_A169UVID_ATRCONTARTHObject[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A169UVID_ATRCONTARTHObject", A169UVID_ATRCONTARTHObject);
         n169UVID_ATRCONTARTHObject = T000B3_n169UVID_ATRCONTARTHObject[0] ;
         A170UVID_ATRCONTARTHLogInst = T000B3_A170UVID_ATRCONTARTHLogInst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170UVID_ATRCONTARTHLogInst", GXutil.ltrim( GXutil.str( A170UVID_ATRCONTARTHLogInst, 9, 0)));
         n170UVID_ATRCONTARTHLogInst = T000B3_n170UVID_ATRCONTARTHLogInst[0] ;
         A171UVID_ATRCONTARTHUserSign = T000B3_A171UVID_ATRCONTARTHUserSign[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A171UVID_ATRCONTARTHUserSign", GXutil.ltrim( GXutil.str( A171UVID_ATRCONTARTHUserSign, 9, 0)));
         n171UVID_ATRCONTARTHUserSign = T000B3_n171UVID_ATRCONTARTHUserSign[0] ;
         A172UVID_ATRCONTARTHTransfered = T000B3_A172UVID_ATRCONTARTHTransfered[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A172UVID_ATRCONTARTHTransfered", A172UVID_ATRCONTARTHTransfered);
         n172UVID_ATRCONTARTHTransfered = T000B3_n172UVID_ATRCONTARTHTransfered[0] ;
         A173UVID_ATRCONTARTHStatus = T000B3_A173UVID_ATRCONTARTHStatus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A173UVID_ATRCONTARTHStatus", A173UVID_ATRCONTARTHStatus);
         n173UVID_ATRCONTARTHStatus = T000B3_n173UVID_ATRCONTARTHStatus[0] ;
         A174UVID_ATRCONTARTHCreateDate = T000B3_A174UVID_ATRCONTARTHCreateDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A174UVID_ATRCONTARTHCreateDate", localUtil.ttoc( A174UVID_ATRCONTARTHCreateDate, 10, 8, 0, 3, "/", ":", " "));
         n174UVID_ATRCONTARTHCreateDate = T000B3_n174UVID_ATRCONTARTHCreateDate[0] ;
         A175UVID_ATRCONTARTHCreateTime = T000B3_A175UVID_ATRCONTARTHCreateTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A175UVID_ATRCONTARTHCreateTime", GXutil.ltrim( GXutil.str( A175UVID_ATRCONTARTHCreateTime, 4, 0)));
         n175UVID_ATRCONTARTHCreateTime = T000B3_n175UVID_ATRCONTARTHCreateTime[0] ;
         A176UVID_ATRCONTARTHUpdateDate = T000B3_A176UVID_ATRCONTARTHUpdateDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A176UVID_ATRCONTARTHUpdateDate", localUtil.ttoc( A176UVID_ATRCONTARTHUpdateDate, 10, 8, 0, 3, "/", ":", " "));
         n176UVID_ATRCONTARTHUpdateDate = T000B3_n176UVID_ATRCONTARTHUpdateDate[0] ;
         A177UVID_ATRCONTARTHUpdateTime = T000B3_A177UVID_ATRCONTARTHUpdateTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A177UVID_ATRCONTARTHUpdateTime", GXutil.ltrim( GXutil.str( A177UVID_ATRCONTARTHUpdateTime, 4, 0)));
         n177UVID_ATRCONTARTHUpdateTime = T000B3_n177UVID_ATRCONTARTHUpdateTime[0] ;
         A178UVID_ATRCONTARTHDataSource = T000B3_A178UVID_ATRCONTARTHDataSource[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A178UVID_ATRCONTARTHDataSource", A178UVID_ATRCONTARTHDataSource);
         n178UVID_ATRCONTARTHDataSource = T000B3_n178UVID_ATRCONTARTHDataSource[0] ;
         A179UVID_ATRCONTARTHRequestStatus = T000B3_A179UVID_ATRCONTARTHRequestStatus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179UVID_ATRCONTARTHRequestStatus", A179UVID_ATRCONTARTHRequestStatus);
         n179UVID_ATRCONTARTHRequestStatus = T000B3_n179UVID_ATRCONTARTHRequestStatus[0] ;
         A180UVID_ATRCONTARTHCreator = T000B3_A180UVID_ATRCONTARTHCreator[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180UVID_ATRCONTARTHCreator", A180UVID_ATRCONTARTHCreator);
         n180UVID_ATRCONTARTHCreator = T000B3_n180UVID_ATRCONTARTHCreator[0] ;
         A181UVID_ATRCONTARTHRemark = T000B3_A181UVID_ATRCONTARTHRemark[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A181UVID_ATRCONTARTHRemark", A181UVID_ATRCONTARTHRemark);
         n181UVID_ATRCONTARTHRemark = T000B3_n181UVID_ATRCONTARTHRemark[0] ;
         A182UVID_ATRCONTARTHU_ItemCode = T000B3_A182UVID_ATRCONTARTHU_ItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182UVID_ATRCONTARTHU_ItemCode", A182UVID_ATRCONTARTHU_ItemCode);
         n182UVID_ATRCONTARTHU_ItemCode = T000B3_n182UVID_ATRCONTARTHU_ItemCode[0] ;
         A183UVID_ATRCONTARTHU_ItemName = T000B3_A183UVID_ATRCONTARTHU_ItemName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183UVID_ATRCONTARTHU_ItemName", A183UVID_ATRCONTARTHU_ItemName);
         n183UVID_ATRCONTARTHU_ItemName = T000B3_n183UVID_ATRCONTARTHU_ItemName[0] ;
         A184UVID_ATRCONTARTHU_Comment = T000B3_A184UVID_ATRCONTARTHU_Comment[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184UVID_ATRCONTARTHU_Comment", A184UVID_ATRCONTARTHU_Comment);
         n184UVID_ATRCONTARTHU_Comment = T000B3_n184UVID_ATRCONTARTHU_Comment[0] ;
         A185UVID_ATRCONTARTHU_ContraMu = T000B3_A185UVID_ATRCONTARTHU_ContraMu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A185UVID_ATRCONTARTHU_ContraMu", A185UVID_ATRCONTARTHU_ContraMu);
         n185UVID_ATRCONTARTHU_ContraMu = T000B3_n185UVID_ATRCONTARTHU_ContraMu[0] ;
         A186UVID_ATRCONTARTHU_CoMuSize = T000B3_A186UVID_ATRCONTARTHU_CoMuSize[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186UVID_ATRCONTARTHU_CoMuSize", GXutil.ltrim( GXutil.str( A186UVID_ATRCONTARTHU_CoMuSize, 18, 0)));
         n186UVID_ATRCONTARTHU_CoMuSize = T000B3_n186UVID_ATRCONTARTHU_CoMuSize[0] ;
         A187UVID_ATRCONTARTHU_MuestDes = T000B3_A187UVID_ATRCONTARTHU_MuestDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187UVID_ATRCONTARTHU_MuestDes", A187UVID_ATRCONTARTHU_MuestDes);
         n187UVID_ATRCONTARTHU_MuestDes = T000B3_n187UVID_ATRCONTARTHU_MuestDes[0] ;
         A188UVID_ATRCONTARTHU_MuDeSize = T000B3_A188UVID_ATRCONTARTHU_MuDeSize[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A188UVID_ATRCONTARTHU_MuDeSize", GXutil.ltrim( GXutil.str( A188UVID_ATRCONTARTHU_MuDeSize, 18, 0)));
         n188UVID_ATRCONTARTHU_MuDeSize = T000B3_n188UVID_ATRCONTARTHU_MuDeSize[0] ;
         Z162UVID_ATRCONTARTHDocEntry = A162UVID_ATRCONTARTHDocEntry ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0B10( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey0B10( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey0B10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_fusquim_sap.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0B10( ) ;
      if ( RcdFound10 == 0 )
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
      RcdFound10 = (short)(0) ;
      /* Using cursor T000B6 */
      pr_fusquim_sap.execute(4, new Object[] {new Integer(A162UVID_ATRCONTARTHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(4) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T000B6_A162UVID_ATRCONTARTHDocEntry[0] < A162UVID_ATRCONTARTHDocEntry ) ) )
         {
            pr_fusquim_sap.readNext(4);
         }
         if ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T000B6_A162UVID_ATRCONTARTHDocEntry[0] > A162UVID_ATRCONTARTHDocEntry ) ) )
         {
            A162UVID_ATRCONTARTHDocEntry = T000B6_A162UVID_ATRCONTARTHDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
            RcdFound10 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(4);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T000B7 */
      pr_fusquim_sap.execute(5, new Object[] {new Integer(A162UVID_ATRCONTARTHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(5) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T000B7_A162UVID_ATRCONTARTHDocEntry[0] > A162UVID_ATRCONTARTHDocEntry ) ) )
         {
            pr_fusquim_sap.readNext(5);
         }
         if ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T000B7_A162UVID_ATRCONTARTHDocEntry[0] < A162UVID_ATRCONTARTHDocEntry ) ) )
         {
            A162UVID_ATRCONTARTHDocEntry = T000B7_A162UVID_ATRCONTARTHDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
            RcdFound10 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0B10( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0B10( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( A162UVID_ATRCONTARTHDocEntry != Z162UVID_ATRCONTARTHDocEntry )
            {
               A162UVID_ATRCONTARTHDocEntry = Z162UVID_ATRCONTARTHDocEntry ;
               httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "UVID_ATRCONTARTHDOCENTRY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0B10( ) ;
               GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A162UVID_ATRCONTARTHDocEntry != Z162UVID_ATRCONTARTHDocEntry )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0B10( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "UVID_ATRCONTARTHDOCENTRY");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0B10( ) ;
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
      if ( A162UVID_ATRCONTARTHDocEntry != Z162UVID_ATRCONTARTHDocEntry )
      {
         A162UVID_ATRCONTARTHDocEntry = Z162UVID_ATRCONTARTHDocEntry ;
         httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "UVID_ATRCONTARTHDOCENTRY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "UVID_ATRCONTARTHDOCENTRY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUVID_ATRCONTARTHDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtUVID_ATRCONTARTHDocNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0B10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUVID_ATRCONTARTHDocNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0B10( ) ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUVID_ATRCONTARTHDocNum_Internalname ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUVID_ATRCONTARTHDocNum_Internalname ;
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
      scanStart0B10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNext0B10( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUVID_ATRCONTARTHDocNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0B10( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0B10( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000B2 */
         pr_fusquim_sap.execute(0, new Object[] {new Integer(A162UVID_ATRCONTARTHDocEntry)});
         if ( (pr_fusquim_sap.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_ATRCONTARTH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_fusquim_sap.getStatus(0) == 101) || ( Z163UVID_ATRCONTARTHDocNum != T000B2_A163UVID_ATRCONTARTHDocNum[0] ) || ( Z164UVID_ATRCONTARTHPeriod != T000B2_A164UVID_ATRCONTARTHPeriod[0] ) || ( Z165UVID_ATRCONTARTHInstance != T000B2_A165UVID_ATRCONTARTHInstance[0] ) || ( Z166UVID_ATRCONTARTHSeries != T000B2_A166UVID_ATRCONTARTHSeries[0] ) || ( GXutil.strcmp(Z167UVID_ATRCONTARTHHandwrtten, T000B2_A167UVID_ATRCONTARTHHandwrtten[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z168UVID_ATRCONTARTHCanceled, T000B2_A168UVID_ATRCONTARTHCanceled[0]) != 0 ) || ( GXutil.strcmp(Z169UVID_ATRCONTARTHObject, T000B2_A169UVID_ATRCONTARTHObject[0]) != 0 ) || ( Z170UVID_ATRCONTARTHLogInst != T000B2_A170UVID_ATRCONTARTHLogInst[0] ) || ( Z171UVID_ATRCONTARTHUserSign != T000B2_A171UVID_ATRCONTARTHUserSign[0] ) || ( GXutil.strcmp(Z172UVID_ATRCONTARTHTransfered, T000B2_A172UVID_ATRCONTARTHTransfered[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z173UVID_ATRCONTARTHStatus, T000B2_A173UVID_ATRCONTARTHStatus[0]) != 0 ) || !( GXutil.dateCompare(Z174UVID_ATRCONTARTHCreateDate, T000B2_A174UVID_ATRCONTARTHCreateDate[0]) ) || ( Z175UVID_ATRCONTARTHCreateTime != T000B2_A175UVID_ATRCONTARTHCreateTime[0] ) || !( GXutil.dateCompare(Z176UVID_ATRCONTARTHUpdateDate, T000B2_A176UVID_ATRCONTARTHUpdateDate[0]) ) || ( Z177UVID_ATRCONTARTHUpdateTime != T000B2_A177UVID_ATRCONTARTHUpdateTime[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z178UVID_ATRCONTARTHDataSource, T000B2_A178UVID_ATRCONTARTHDataSource[0]) != 0 ) || ( GXutil.strcmp(Z179UVID_ATRCONTARTHRequestStatus, T000B2_A179UVID_ATRCONTARTHRequestStatus[0]) != 0 ) || ( GXutil.strcmp(Z180UVID_ATRCONTARTHCreator, T000B2_A180UVID_ATRCONTARTHCreator[0]) != 0 ) || ( GXutil.strcmp(Z182UVID_ATRCONTARTHU_ItemCode, T000B2_A182UVID_ATRCONTARTHU_ItemCode[0]) != 0 ) || ( GXutil.strcmp(Z183UVID_ATRCONTARTHU_ItemName, T000B2_A183UVID_ATRCONTARTHU_ItemName[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z184UVID_ATRCONTARTHU_Comment, T000B2_A184UVID_ATRCONTARTHU_Comment[0]) != 0 ) || ( GXutil.strcmp(Z185UVID_ATRCONTARTHU_ContraMu, T000B2_A185UVID_ATRCONTARTHU_ContraMu[0]) != 0 ) || ( Z186UVID_ATRCONTARTHU_CoMuSize != T000B2_A186UVID_ATRCONTARTHU_CoMuSize[0] ) || ( GXutil.strcmp(Z187UVID_ATRCONTARTHU_MuestDes, T000B2_A187UVID_ATRCONTARTHU_MuestDes[0]) != 0 ) || ( Z188UVID_ATRCONTARTHU_MuDeSize != T000B2_A188UVID_ATRCONTARTHU_MuDeSize[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"@VID_ATRCONTARTH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0B10( )
   {
      beforeValidate0B10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B10( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0B10( 0) ;
         checkOptimisticConcurrency0B10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0B10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B8 */
                  pr_fusquim_sap.execute(6, new Object[] {new Integer(A162UVID_ATRCONTARTHDocEntry), new Boolean(n163UVID_ATRCONTARTHDocNum), new Integer(A163UVID_ATRCONTARTHDocNum), new Boolean(n164UVID_ATRCONTARTHPeriod), new Integer(A164UVID_ATRCONTARTHPeriod), new Boolean(n165UVID_ATRCONTARTHInstance), new Short(A165UVID_ATRCONTARTHInstance), new Boolean(n166UVID_ATRCONTARTHSeries), new Integer(A166UVID_ATRCONTARTHSeries), new Boolean(n167UVID_ATRCONTARTHHandwrtten), A167UVID_ATRCONTARTHHandwrtten, new Boolean(n168UVID_ATRCONTARTHCanceled), A168UVID_ATRCONTARTHCanceled, new Boolean(n169UVID_ATRCONTARTHObject), A169UVID_ATRCONTARTHObject, new Boolean(n170UVID_ATRCONTARTHLogInst), new Integer(A170UVID_ATRCONTARTHLogInst), new Boolean(n171UVID_ATRCONTARTHUserSign), new Integer(A171UVID_ATRCONTARTHUserSign), new Boolean(n172UVID_ATRCONTARTHTransfered), A172UVID_ATRCONTARTHTransfered, new Boolean(n173UVID_ATRCONTARTHStatus), A173UVID_ATRCONTARTHStatus, new Boolean(n174UVID_ATRCONTARTHCreateDate), A174UVID_ATRCONTARTHCreateDate, new Boolean(n175UVID_ATRCONTARTHCreateTime), new Short(A175UVID_ATRCONTARTHCreateTime), new Boolean(n176UVID_ATRCONTARTHUpdateDate), A176UVID_ATRCONTARTHUpdateDate, new Boolean(n177UVID_ATRCONTARTHUpdateTime), new Short(A177UVID_ATRCONTARTHUpdateTime), new Boolean(n178UVID_ATRCONTARTHDataSource), A178UVID_ATRCONTARTHDataSource, new Boolean(n179UVID_ATRCONTARTHRequestStatus), A179UVID_ATRCONTARTHRequestStatus, new Boolean(n180UVID_ATRCONTARTHCreator), A180UVID_ATRCONTARTHCreator, new Boolean(n181UVID_ATRCONTARTHRemark), A181UVID_ATRCONTARTHRemark, new Boolean(n182UVID_ATRCONTARTHU_ItemCode), A182UVID_ATRCONTARTHU_ItemCode, new Boolean(n183UVID_ATRCONTARTHU_ItemName), A183UVID_ATRCONTARTHU_ItemName, new Boolean(n184UVID_ATRCONTARTHU_Comment), A184UVID_ATRCONTARTHU_Comment, new Boolean(n185UVID_ATRCONTARTHU_ContraMu), A185UVID_ATRCONTARTHU_ContraMu, new Boolean(n186UVID_ATRCONTARTHU_CoMuSize), new Long(A186UVID_ATRCONTARTHU_CoMuSize), new Boolean(n187UVID_ATRCONTARTHU_MuestDes), A187UVID_ATRCONTARTHU_MuestDes, new Boolean(n188UVID_ATRCONTARTHU_MuDeSize), new Long(A188UVID_ATRCONTARTHU_MuDeSize)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_ATRCONTARTH") ;
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
                        resetCaption0B0( ) ;
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
            load0B10( ) ;
         }
         endLevel0B10( ) ;
      }
      closeExtendedTableCursors0B10( ) ;
   }

   public void update0B10( )
   {
      beforeValidate0B10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0B10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B9 */
                  pr_fusquim_sap.execute(7, new Object[] {new Boolean(n163UVID_ATRCONTARTHDocNum), new Integer(A163UVID_ATRCONTARTHDocNum), new Boolean(n164UVID_ATRCONTARTHPeriod), new Integer(A164UVID_ATRCONTARTHPeriod), new Boolean(n165UVID_ATRCONTARTHInstance), new Short(A165UVID_ATRCONTARTHInstance), new Boolean(n166UVID_ATRCONTARTHSeries), new Integer(A166UVID_ATRCONTARTHSeries), new Boolean(n167UVID_ATRCONTARTHHandwrtten), A167UVID_ATRCONTARTHHandwrtten, new Boolean(n168UVID_ATRCONTARTHCanceled), A168UVID_ATRCONTARTHCanceled, new Boolean(n169UVID_ATRCONTARTHObject), A169UVID_ATRCONTARTHObject, new Boolean(n170UVID_ATRCONTARTHLogInst), new Integer(A170UVID_ATRCONTARTHLogInst), new Boolean(n171UVID_ATRCONTARTHUserSign), new Integer(A171UVID_ATRCONTARTHUserSign), new Boolean(n172UVID_ATRCONTARTHTransfered), A172UVID_ATRCONTARTHTransfered, new Boolean(n173UVID_ATRCONTARTHStatus), A173UVID_ATRCONTARTHStatus, new Boolean(n174UVID_ATRCONTARTHCreateDate), A174UVID_ATRCONTARTHCreateDate, new Boolean(n175UVID_ATRCONTARTHCreateTime), new Short(A175UVID_ATRCONTARTHCreateTime), new Boolean(n176UVID_ATRCONTARTHUpdateDate), A176UVID_ATRCONTARTHUpdateDate, new Boolean(n177UVID_ATRCONTARTHUpdateTime), new Short(A177UVID_ATRCONTARTHUpdateTime), new Boolean(n178UVID_ATRCONTARTHDataSource), A178UVID_ATRCONTARTHDataSource, new Boolean(n179UVID_ATRCONTARTHRequestStatus), A179UVID_ATRCONTARTHRequestStatus, new Boolean(n180UVID_ATRCONTARTHCreator), A180UVID_ATRCONTARTHCreator, new Boolean(n181UVID_ATRCONTARTHRemark), A181UVID_ATRCONTARTHRemark, new Boolean(n182UVID_ATRCONTARTHU_ItemCode), A182UVID_ATRCONTARTHU_ItemCode, new Boolean(n183UVID_ATRCONTARTHU_ItemName), A183UVID_ATRCONTARTHU_ItemName, new Boolean(n184UVID_ATRCONTARTHU_Comment), A184UVID_ATRCONTARTHU_Comment, new Boolean(n185UVID_ATRCONTARTHU_ContraMu), A185UVID_ATRCONTARTHU_ContraMu, new Boolean(n186UVID_ATRCONTARTHU_CoMuSize), new Long(A186UVID_ATRCONTARTHU_CoMuSize), new Boolean(n187UVID_ATRCONTARTHU_MuestDes), A187UVID_ATRCONTARTHU_MuestDes, new Boolean(n188UVID_ATRCONTARTHU_MuDeSize), new Long(A188UVID_ATRCONTARTHU_MuDeSize), new Integer(A162UVID_ATRCONTARTHDocEntry)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_ATRCONTARTH") ;
                  if ( (pr_fusquim_sap.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_ATRCONTARTH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0B10( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption0B0( ) ;
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
         endLevel0B10( ) ;
      }
      closeExtendedTableCursors0B10( ) ;
   }

   public void deferredUpdate0B10( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0B10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0B10( ) ;
         afterConfirm0B10( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0B10( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000B10 */
               pr_fusquim_sap.execute(8, new Object[] {new Integer(A162UVID_ATRCONTARTHDocEntry)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_ATRCONTARTH") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound10 == 0 )
                     {
                        initAll0B10( ) ;
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
                     resetCaption0B0( ) ;
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0B10( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0B10( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0B10( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_fusquim_sap.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0B10( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "uvid_atrcontarth");
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "uvid_atrcontarth");
         if ( AnyError == 0 )
         {
            confirmValues0B0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "uvid_atrcontarth");
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "uvid_atrcontarth");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0B10( )
   {
      /* Using cursor T000B11 */
      pr_fusquim_sap.execute(9);
      RcdFound10 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A162UVID_ATRCONTARTHDocEntry = T000B11_A162UVID_ATRCONTARTHDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0B10( )
   {
      /* Scan next routine */
      pr_fusquim_sap.readNext(9);
      RcdFound10 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A162UVID_ATRCONTARTHDocEntry = T000B11_A162UVID_ATRCONTARTHDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
      }
   }

   public void scanEnd0B10( )
   {
      pr_fusquim_sap.close(9);
   }

   public void afterConfirm0B10( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0B10( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0B10( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0B10( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0B10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0B10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0B10( )
   {
      edtUVID_ATRCONTARTHDocEntry_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHDocEntry_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHDocEntry_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHDocNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHDocNum_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHDocNum_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHPeriod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHPeriod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHPeriod_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHInstance_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHInstance_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHInstance_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHSeries_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHSeries_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHSeries_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHHandwrtten_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHHandwrtten_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHHandwrtten_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHCanceled_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHCanceled_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHCanceled_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHObject_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHObject_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHObject_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHLogInst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHLogInst_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHLogInst_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHUserSign_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHUserSign_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHUserSign_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHTransfered_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHTransfered_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHTransfered_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHStatus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHStatus_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHStatus_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHCreateDate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHCreateDate_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHCreateDate_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHCreateTime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHCreateTime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHCreateTime_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHUpdateDate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHUpdateDate_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHUpdateDate_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHUpdateTime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHUpdateTime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHUpdateTime_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHDataSource_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHDataSource_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHDataSource_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHRequestStatus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHRequestStatus_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHRequestStatus_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHCreator_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHCreator_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHCreator_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHRemark_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHRemark_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHRemark_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHU_ItemCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHU_ItemCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHU_ItemCode_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHU_ItemName_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHU_ItemName_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHU_ItemName_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHU_Comment_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHU_Comment_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHU_Comment_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHU_ContraMu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHU_ContraMu_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHU_ContraMu_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHU_CoMuSize_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHU_CoMuSize_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHU_CoMuSize_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHU_MuestDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHU_MuestDes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHU_MuestDes_Enabled, 5, 0)), true);
      edtUVID_ATRCONTARTHU_MuDeSize_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_ATRCONTARTHU_MuDeSize_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_ATRCONTARTHU_MuDeSize_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0B0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210231069");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.uvid_atrcontarth") +"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( localUtil.ntoc( Z162UVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z163UVID_ATRCONTARTHDocNum", GXutil.ltrim( localUtil.ntoc( Z163UVID_ATRCONTARTHDocNum, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z164UVID_ATRCONTARTHPeriod", GXutil.ltrim( localUtil.ntoc( Z164UVID_ATRCONTARTHPeriod, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z165UVID_ATRCONTARTHInstance", GXutil.ltrim( localUtil.ntoc( Z165UVID_ATRCONTARTHInstance, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z166UVID_ATRCONTARTHSeries", GXutil.ltrim( localUtil.ntoc( Z166UVID_ATRCONTARTHSeries, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z167UVID_ATRCONTARTHHandwrtten", GXutil.rtrim( Z167UVID_ATRCONTARTHHandwrtten));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z168UVID_ATRCONTARTHCanceled", GXutil.rtrim( Z168UVID_ATRCONTARTHCanceled));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z169UVID_ATRCONTARTHObject", Z169UVID_ATRCONTARTHObject);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z170UVID_ATRCONTARTHLogInst", GXutil.ltrim( localUtil.ntoc( Z170UVID_ATRCONTARTHLogInst, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z171UVID_ATRCONTARTHUserSign", GXutil.ltrim( localUtil.ntoc( Z171UVID_ATRCONTARTHUserSign, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z172UVID_ATRCONTARTHTransfered", GXutil.rtrim( Z172UVID_ATRCONTARTHTransfered));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z173UVID_ATRCONTARTHStatus", GXutil.rtrim( Z173UVID_ATRCONTARTHStatus));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z174UVID_ATRCONTARTHCreateDate", localUtil.ttoc( Z174UVID_ATRCONTARTHCreateDate, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z175UVID_ATRCONTARTHCreateTime", GXutil.ltrim( localUtil.ntoc( Z175UVID_ATRCONTARTHCreateTime, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z176UVID_ATRCONTARTHUpdateDate", localUtil.ttoc( Z176UVID_ATRCONTARTHUpdateDate, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z177UVID_ATRCONTARTHUpdateTime", GXutil.ltrim( localUtil.ntoc( Z177UVID_ATRCONTARTHUpdateTime, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z178UVID_ATRCONTARTHDataSource", GXutil.rtrim( Z178UVID_ATRCONTARTHDataSource));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z179UVID_ATRCONTARTHRequestStatus", GXutil.rtrim( Z179UVID_ATRCONTARTHRequestStatus));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z180UVID_ATRCONTARTHCreator", Z180UVID_ATRCONTARTHCreator);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z182UVID_ATRCONTARTHU_ItemCode", Z182UVID_ATRCONTARTHU_ItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z183UVID_ATRCONTARTHU_ItemName", Z183UVID_ATRCONTARTHU_ItemName);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z184UVID_ATRCONTARTHU_Comment", Z184UVID_ATRCONTARTHU_Comment);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z185UVID_ATRCONTARTHU_ContraMu", GXutil.rtrim( Z185UVID_ATRCONTARTHU_ContraMu));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z186UVID_ATRCONTARTHU_CoMuSize", GXutil.ltrim( localUtil.ntoc( Z186UVID_ATRCONTARTHU_CoMuSize, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z187UVID_ATRCONTARTHU_MuestDes", GXutil.rtrim( Z187UVID_ATRCONTARTHU_MuestDes));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z188UVID_ATRCONTARTHU_MuDeSize", GXutil.ltrim( localUtil.ntoc( Z188UVID_ATRCONTARTHU_MuDeSize, (byte)(18), (byte)(0), ",", "")));
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
      return formatLink("com.wms.uvid_atrcontarth")  ;
   }

   public String getPgmname( )
   {
      return "UVID_ATRCONTARTH" ;
   }

   public String getPgmdesc( )
   {
      return "UVID_ATRCONTARTH" ;
   }

   public void initializeNonKey0B10( )
   {
      A163UVID_ATRCONTARTHDocNum = 0 ;
      n163UVID_ATRCONTARTHDocNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A163UVID_ATRCONTARTHDocNum", GXutil.ltrim( GXutil.str( A163UVID_ATRCONTARTHDocNum, 9, 0)));
      n163UVID_ATRCONTARTHDocNum = ((0==A163UVID_ATRCONTARTHDocNum) ? true : false) ;
      A164UVID_ATRCONTARTHPeriod = 0 ;
      n164UVID_ATRCONTARTHPeriod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A164UVID_ATRCONTARTHPeriod", GXutil.ltrim( GXutil.str( A164UVID_ATRCONTARTHPeriod, 9, 0)));
      n164UVID_ATRCONTARTHPeriod = ((0==A164UVID_ATRCONTARTHPeriod) ? true : false) ;
      A165UVID_ATRCONTARTHInstance = (short)(0) ;
      n165UVID_ATRCONTARTHInstance = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A165UVID_ATRCONTARTHInstance", GXutil.ltrim( GXutil.str( A165UVID_ATRCONTARTHInstance, 4, 0)));
      n165UVID_ATRCONTARTHInstance = ((0==A165UVID_ATRCONTARTHInstance) ? true : false) ;
      A166UVID_ATRCONTARTHSeries = 0 ;
      n166UVID_ATRCONTARTHSeries = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A166UVID_ATRCONTARTHSeries", GXutil.ltrim( GXutil.str( A166UVID_ATRCONTARTHSeries, 9, 0)));
      n166UVID_ATRCONTARTHSeries = ((0==A166UVID_ATRCONTARTHSeries) ? true : false) ;
      A167UVID_ATRCONTARTHHandwrtten = "" ;
      n167UVID_ATRCONTARTHHandwrtten = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A167UVID_ATRCONTARTHHandwrtten", A167UVID_ATRCONTARTHHandwrtten);
      n167UVID_ATRCONTARTHHandwrtten = ((GXutil.strcmp("", A167UVID_ATRCONTARTHHandwrtten)==0) ? true : false) ;
      A168UVID_ATRCONTARTHCanceled = "" ;
      n168UVID_ATRCONTARTHCanceled = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A168UVID_ATRCONTARTHCanceled", A168UVID_ATRCONTARTHCanceled);
      n168UVID_ATRCONTARTHCanceled = ((GXutil.strcmp("", A168UVID_ATRCONTARTHCanceled)==0) ? true : false) ;
      A169UVID_ATRCONTARTHObject = "" ;
      n169UVID_ATRCONTARTHObject = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A169UVID_ATRCONTARTHObject", A169UVID_ATRCONTARTHObject);
      n169UVID_ATRCONTARTHObject = ((GXutil.strcmp("", A169UVID_ATRCONTARTHObject)==0) ? true : false) ;
      A170UVID_ATRCONTARTHLogInst = 0 ;
      n170UVID_ATRCONTARTHLogInst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A170UVID_ATRCONTARTHLogInst", GXutil.ltrim( GXutil.str( A170UVID_ATRCONTARTHLogInst, 9, 0)));
      n170UVID_ATRCONTARTHLogInst = ((0==A170UVID_ATRCONTARTHLogInst) ? true : false) ;
      A171UVID_ATRCONTARTHUserSign = 0 ;
      n171UVID_ATRCONTARTHUserSign = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A171UVID_ATRCONTARTHUserSign", GXutil.ltrim( GXutil.str( A171UVID_ATRCONTARTHUserSign, 9, 0)));
      n171UVID_ATRCONTARTHUserSign = ((0==A171UVID_ATRCONTARTHUserSign) ? true : false) ;
      A172UVID_ATRCONTARTHTransfered = "" ;
      n172UVID_ATRCONTARTHTransfered = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A172UVID_ATRCONTARTHTransfered", A172UVID_ATRCONTARTHTransfered);
      n172UVID_ATRCONTARTHTransfered = ((GXutil.strcmp("", A172UVID_ATRCONTARTHTransfered)==0) ? true : false) ;
      A173UVID_ATRCONTARTHStatus = "" ;
      n173UVID_ATRCONTARTHStatus = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A173UVID_ATRCONTARTHStatus", A173UVID_ATRCONTARTHStatus);
      n173UVID_ATRCONTARTHStatus = ((GXutil.strcmp("", A173UVID_ATRCONTARTHStatus)==0) ? true : false) ;
      A174UVID_ATRCONTARTHCreateDate = GXutil.resetTime( GXutil.nullDate() );
      n174UVID_ATRCONTARTHCreateDate = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A174UVID_ATRCONTARTHCreateDate", localUtil.ttoc( A174UVID_ATRCONTARTHCreateDate, 10, 8, 0, 3, "/", ":", " "));
      n174UVID_ATRCONTARTHCreateDate = (GXutil.dateCompare(GXutil.nullDate(), A174UVID_ATRCONTARTHCreateDate) ? true : false) ;
      A175UVID_ATRCONTARTHCreateTime = (short)(0) ;
      n175UVID_ATRCONTARTHCreateTime = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A175UVID_ATRCONTARTHCreateTime", GXutil.ltrim( GXutil.str( A175UVID_ATRCONTARTHCreateTime, 4, 0)));
      n175UVID_ATRCONTARTHCreateTime = ((0==A175UVID_ATRCONTARTHCreateTime) ? true : false) ;
      A176UVID_ATRCONTARTHUpdateDate = GXutil.resetTime( GXutil.nullDate() );
      n176UVID_ATRCONTARTHUpdateDate = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A176UVID_ATRCONTARTHUpdateDate", localUtil.ttoc( A176UVID_ATRCONTARTHUpdateDate, 10, 8, 0, 3, "/", ":", " "));
      n176UVID_ATRCONTARTHUpdateDate = (GXutil.dateCompare(GXutil.nullDate(), A176UVID_ATRCONTARTHUpdateDate) ? true : false) ;
      A177UVID_ATRCONTARTHUpdateTime = (short)(0) ;
      n177UVID_ATRCONTARTHUpdateTime = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A177UVID_ATRCONTARTHUpdateTime", GXutil.ltrim( GXutil.str( A177UVID_ATRCONTARTHUpdateTime, 4, 0)));
      n177UVID_ATRCONTARTHUpdateTime = ((0==A177UVID_ATRCONTARTHUpdateTime) ? true : false) ;
      A178UVID_ATRCONTARTHDataSource = "" ;
      n178UVID_ATRCONTARTHDataSource = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A178UVID_ATRCONTARTHDataSource", A178UVID_ATRCONTARTHDataSource);
      n178UVID_ATRCONTARTHDataSource = ((GXutil.strcmp("", A178UVID_ATRCONTARTHDataSource)==0) ? true : false) ;
      A179UVID_ATRCONTARTHRequestStatus = "" ;
      n179UVID_ATRCONTARTHRequestStatus = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A179UVID_ATRCONTARTHRequestStatus", A179UVID_ATRCONTARTHRequestStatus);
      n179UVID_ATRCONTARTHRequestStatus = ((GXutil.strcmp("", A179UVID_ATRCONTARTHRequestStatus)==0) ? true : false) ;
      A180UVID_ATRCONTARTHCreator = "" ;
      n180UVID_ATRCONTARTHCreator = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A180UVID_ATRCONTARTHCreator", A180UVID_ATRCONTARTHCreator);
      n180UVID_ATRCONTARTHCreator = ((GXutil.strcmp("", A180UVID_ATRCONTARTHCreator)==0) ? true : false) ;
      A181UVID_ATRCONTARTHRemark = "" ;
      n181UVID_ATRCONTARTHRemark = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A181UVID_ATRCONTARTHRemark", A181UVID_ATRCONTARTHRemark);
      n181UVID_ATRCONTARTHRemark = ((GXutil.strcmp("", A181UVID_ATRCONTARTHRemark)==0) ? true : false) ;
      A182UVID_ATRCONTARTHU_ItemCode = "" ;
      n182UVID_ATRCONTARTHU_ItemCode = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A182UVID_ATRCONTARTHU_ItemCode", A182UVID_ATRCONTARTHU_ItemCode);
      n182UVID_ATRCONTARTHU_ItemCode = ((GXutil.strcmp("", A182UVID_ATRCONTARTHU_ItemCode)==0) ? true : false) ;
      A183UVID_ATRCONTARTHU_ItemName = "" ;
      n183UVID_ATRCONTARTHU_ItemName = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A183UVID_ATRCONTARTHU_ItemName", A183UVID_ATRCONTARTHU_ItemName);
      n183UVID_ATRCONTARTHU_ItemName = ((GXutil.strcmp("", A183UVID_ATRCONTARTHU_ItemName)==0) ? true : false) ;
      A184UVID_ATRCONTARTHU_Comment = "" ;
      n184UVID_ATRCONTARTHU_Comment = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A184UVID_ATRCONTARTHU_Comment", A184UVID_ATRCONTARTHU_Comment);
      n184UVID_ATRCONTARTHU_Comment = ((GXutil.strcmp("", A184UVID_ATRCONTARTHU_Comment)==0) ? true : false) ;
      A185UVID_ATRCONTARTHU_ContraMu = "" ;
      n185UVID_ATRCONTARTHU_ContraMu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A185UVID_ATRCONTARTHU_ContraMu", A185UVID_ATRCONTARTHU_ContraMu);
      n185UVID_ATRCONTARTHU_ContraMu = ((GXutil.strcmp("", A185UVID_ATRCONTARTHU_ContraMu)==0) ? true : false) ;
      A186UVID_ATRCONTARTHU_CoMuSize = 0 ;
      n186UVID_ATRCONTARTHU_CoMuSize = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A186UVID_ATRCONTARTHU_CoMuSize", GXutil.ltrim( GXutil.str( A186UVID_ATRCONTARTHU_CoMuSize, 18, 0)));
      n186UVID_ATRCONTARTHU_CoMuSize = ((0==A186UVID_ATRCONTARTHU_CoMuSize) ? true : false) ;
      A187UVID_ATRCONTARTHU_MuestDes = "" ;
      n187UVID_ATRCONTARTHU_MuestDes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A187UVID_ATRCONTARTHU_MuestDes", A187UVID_ATRCONTARTHU_MuestDes);
      n187UVID_ATRCONTARTHU_MuestDes = ((GXutil.strcmp("", A187UVID_ATRCONTARTHU_MuestDes)==0) ? true : false) ;
      A188UVID_ATRCONTARTHU_MuDeSize = 0 ;
      n188UVID_ATRCONTARTHU_MuDeSize = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A188UVID_ATRCONTARTHU_MuDeSize", GXutil.ltrim( GXutil.str( A188UVID_ATRCONTARTHU_MuDeSize, 18, 0)));
      n188UVID_ATRCONTARTHU_MuDeSize = ((0==A188UVID_ATRCONTARTHU_MuDeSize) ? true : false) ;
      Z163UVID_ATRCONTARTHDocNum = 0 ;
      Z164UVID_ATRCONTARTHPeriod = 0 ;
      Z165UVID_ATRCONTARTHInstance = (short)(0) ;
      Z166UVID_ATRCONTARTHSeries = 0 ;
      Z167UVID_ATRCONTARTHHandwrtten = "" ;
      Z168UVID_ATRCONTARTHCanceled = "" ;
      Z169UVID_ATRCONTARTHObject = "" ;
      Z170UVID_ATRCONTARTHLogInst = 0 ;
      Z171UVID_ATRCONTARTHUserSign = 0 ;
      Z172UVID_ATRCONTARTHTransfered = "" ;
      Z173UVID_ATRCONTARTHStatus = "" ;
      Z174UVID_ATRCONTARTHCreateDate = GXutil.resetTime( GXutil.nullDate() );
      Z175UVID_ATRCONTARTHCreateTime = (short)(0) ;
      Z176UVID_ATRCONTARTHUpdateDate = GXutil.resetTime( GXutil.nullDate() );
      Z177UVID_ATRCONTARTHUpdateTime = (short)(0) ;
      Z178UVID_ATRCONTARTHDataSource = "" ;
      Z179UVID_ATRCONTARTHRequestStatus = "" ;
      Z180UVID_ATRCONTARTHCreator = "" ;
      Z182UVID_ATRCONTARTHU_ItemCode = "" ;
      Z183UVID_ATRCONTARTHU_ItemName = "" ;
      Z184UVID_ATRCONTARTHU_Comment = "" ;
      Z185UVID_ATRCONTARTHU_ContraMu = "" ;
      Z186UVID_ATRCONTARTHU_CoMuSize = 0 ;
      Z187UVID_ATRCONTARTHU_MuestDes = "" ;
      Z188UVID_ATRCONTARTHU_MuDeSize = 0 ;
   }

   public void initAll0B10( )
   {
      A162UVID_ATRCONTARTHDocEntry = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A162UVID_ATRCONTARTHDocEntry", GXutil.ltrim( GXutil.str( A162UVID_ATRCONTARTHDocEntry, 9, 0)));
      initializeNonKey0B10( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210231094");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("uvid_atrcontarth.js", "?201811210231094");
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
      edtUVID_ATRCONTARTHDocEntry_Internalname = "UVID_ATRCONTARTHDOCENTRY" ;
      edtUVID_ATRCONTARTHDocNum_Internalname = "UVID_ATRCONTARTHDOCNUM" ;
      edtUVID_ATRCONTARTHPeriod_Internalname = "UVID_ATRCONTARTHPERIOD" ;
      edtUVID_ATRCONTARTHInstance_Internalname = "UVID_ATRCONTARTHINSTANCE" ;
      edtUVID_ATRCONTARTHSeries_Internalname = "UVID_ATRCONTARTHSERIES" ;
      edtUVID_ATRCONTARTHHandwrtten_Internalname = "UVID_ATRCONTARTHHANDWRTTEN" ;
      edtUVID_ATRCONTARTHCanceled_Internalname = "UVID_ATRCONTARTHCANCELED" ;
      edtUVID_ATRCONTARTHObject_Internalname = "UVID_ATRCONTARTHOBJECT" ;
      edtUVID_ATRCONTARTHLogInst_Internalname = "UVID_ATRCONTARTHLOGINST" ;
      edtUVID_ATRCONTARTHUserSign_Internalname = "UVID_ATRCONTARTHUSERSIGN" ;
      edtUVID_ATRCONTARTHTransfered_Internalname = "UVID_ATRCONTARTHTRANSFERED" ;
      edtUVID_ATRCONTARTHStatus_Internalname = "UVID_ATRCONTARTHSTATUS" ;
      edtUVID_ATRCONTARTHCreateDate_Internalname = "UVID_ATRCONTARTHCREATEDATE" ;
      edtUVID_ATRCONTARTHCreateTime_Internalname = "UVID_ATRCONTARTHCREATETIME" ;
      edtUVID_ATRCONTARTHUpdateDate_Internalname = "UVID_ATRCONTARTHUPDATEDATE" ;
      edtUVID_ATRCONTARTHUpdateTime_Internalname = "UVID_ATRCONTARTHUPDATETIME" ;
      edtUVID_ATRCONTARTHDataSource_Internalname = "UVID_ATRCONTARTHDATASOURCE" ;
      edtUVID_ATRCONTARTHRequestStatus_Internalname = "UVID_ATRCONTARTHREQUESTSTATUS" ;
      edtUVID_ATRCONTARTHCreator_Internalname = "UVID_ATRCONTARTHCREATOR" ;
      edtUVID_ATRCONTARTHRemark_Internalname = "UVID_ATRCONTARTHREMARK" ;
      edtUVID_ATRCONTARTHU_ItemCode_Internalname = "UVID_ATRCONTARTHU_ITEMCODE" ;
      edtUVID_ATRCONTARTHU_ItemName_Internalname = "UVID_ATRCONTARTHU_ITEMNAME" ;
      edtUVID_ATRCONTARTHU_Comment_Internalname = "UVID_ATRCONTARTHU_COMMENT" ;
      edtUVID_ATRCONTARTHU_ContraMu_Internalname = "UVID_ATRCONTARTHU_CONTRAMU" ;
      edtUVID_ATRCONTARTHU_CoMuSize_Internalname = "UVID_ATRCONTARTHU_COMUSIZE" ;
      edtUVID_ATRCONTARTHU_MuestDes_Internalname = "UVID_ATRCONTARTHU_MUESTDES" ;
      edtUVID_ATRCONTARTHU_MuDeSize_Internalname = "UVID_ATRCONTARTHU_MUDESIZE" ;
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
      Form.setCaption( "UVID_ATRCONTARTH" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtUVID_ATRCONTARTHU_MuDeSize_Jsonclick = "" ;
      edtUVID_ATRCONTARTHU_MuDeSize_Enabled = 1 ;
      edtUVID_ATRCONTARTHU_MuestDes_Jsonclick = "" ;
      edtUVID_ATRCONTARTHU_MuestDes_Enabled = 1 ;
      edtUVID_ATRCONTARTHU_CoMuSize_Jsonclick = "" ;
      edtUVID_ATRCONTARTHU_CoMuSize_Enabled = 1 ;
      edtUVID_ATRCONTARTHU_ContraMu_Jsonclick = "" ;
      edtUVID_ATRCONTARTHU_ContraMu_Enabled = 1 ;
      edtUVID_ATRCONTARTHU_Comment_Enabled = 1 ;
      edtUVID_ATRCONTARTHU_ItemName_Jsonclick = "" ;
      edtUVID_ATRCONTARTHU_ItemName_Enabled = 1 ;
      edtUVID_ATRCONTARTHU_ItemCode_Jsonclick = "" ;
      edtUVID_ATRCONTARTHU_ItemCode_Enabled = 1 ;
      edtUVID_ATRCONTARTHRemark_Jsonclick = "" ;
      edtUVID_ATRCONTARTHRemark_Enabled = 1 ;
      edtUVID_ATRCONTARTHCreator_Jsonclick = "" ;
      edtUVID_ATRCONTARTHCreator_Enabled = 1 ;
      edtUVID_ATRCONTARTHRequestStatus_Jsonclick = "" ;
      edtUVID_ATRCONTARTHRequestStatus_Enabled = 1 ;
      edtUVID_ATRCONTARTHDataSource_Jsonclick = "" ;
      edtUVID_ATRCONTARTHDataSource_Enabled = 1 ;
      edtUVID_ATRCONTARTHUpdateTime_Jsonclick = "" ;
      edtUVID_ATRCONTARTHUpdateTime_Enabled = 1 ;
      edtUVID_ATRCONTARTHUpdateDate_Jsonclick = "" ;
      edtUVID_ATRCONTARTHUpdateDate_Enabled = 1 ;
      edtUVID_ATRCONTARTHCreateTime_Jsonclick = "" ;
      edtUVID_ATRCONTARTHCreateTime_Enabled = 1 ;
      edtUVID_ATRCONTARTHCreateDate_Jsonclick = "" ;
      edtUVID_ATRCONTARTHCreateDate_Enabled = 1 ;
      edtUVID_ATRCONTARTHStatus_Jsonclick = "" ;
      edtUVID_ATRCONTARTHStatus_Enabled = 1 ;
      edtUVID_ATRCONTARTHTransfered_Jsonclick = "" ;
      edtUVID_ATRCONTARTHTransfered_Enabled = 1 ;
      edtUVID_ATRCONTARTHUserSign_Jsonclick = "" ;
      edtUVID_ATRCONTARTHUserSign_Enabled = 1 ;
      edtUVID_ATRCONTARTHLogInst_Jsonclick = "" ;
      edtUVID_ATRCONTARTHLogInst_Enabled = 1 ;
      edtUVID_ATRCONTARTHObject_Jsonclick = "" ;
      edtUVID_ATRCONTARTHObject_Enabled = 1 ;
      edtUVID_ATRCONTARTHCanceled_Jsonclick = "" ;
      edtUVID_ATRCONTARTHCanceled_Enabled = 1 ;
      edtUVID_ATRCONTARTHHandwrtten_Jsonclick = "" ;
      edtUVID_ATRCONTARTHHandwrtten_Enabled = 1 ;
      edtUVID_ATRCONTARTHSeries_Jsonclick = "" ;
      edtUVID_ATRCONTARTHSeries_Enabled = 1 ;
      edtUVID_ATRCONTARTHInstance_Jsonclick = "" ;
      edtUVID_ATRCONTARTHInstance_Enabled = 1 ;
      edtUVID_ATRCONTARTHPeriod_Jsonclick = "" ;
      edtUVID_ATRCONTARTHPeriod_Enabled = 1 ;
      edtUVID_ATRCONTARTHDocNum_Jsonclick = "" ;
      edtUVID_ATRCONTARTHDocNum_Enabled = 1 ;
      edtUVID_ATRCONTARTHDocEntry_Jsonclick = "" ;
      edtUVID_ATRCONTARTHDocEntry_Enabled = 1 ;
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
      GX_FocusControl = edtUVID_ATRCONTARTHDocNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Uvid_atrcontarthdocentry( int GX_Parm1 ,
                                               int GX_Parm2 ,
                                               int GX_Parm3 ,
                                               short GX_Parm4 ,
                                               int GX_Parm5 ,
                                               String GX_Parm6 ,
                                               String GX_Parm7 ,
                                               String GX_Parm8 ,
                                               int GX_Parm9 ,
                                               int GX_Parm10 ,
                                               String GX_Parm11 ,
                                               String GX_Parm12 ,
                                               java.util.Date GX_Parm13 ,
                                               short GX_Parm14 ,
                                               java.util.Date GX_Parm15 ,
                                               short GX_Parm16 ,
                                               String GX_Parm17 ,
                                               String GX_Parm18 ,
                                               String GX_Parm19 ,
                                               String GX_Parm20 ,
                                               String GX_Parm21 ,
                                               String GX_Parm22 ,
                                               String GX_Parm23 ,
                                               String GX_Parm24 ,
                                               long GX_Parm25 ,
                                               String GX_Parm26 ,
                                               long GX_Parm27 )
   {
      A162UVID_ATRCONTARTHDocEntry = GX_Parm1 ;
      A163UVID_ATRCONTARTHDocNum = GX_Parm2 ;
      n163UVID_ATRCONTARTHDocNum = false ;
      A164UVID_ATRCONTARTHPeriod = GX_Parm3 ;
      n164UVID_ATRCONTARTHPeriod = false ;
      A165UVID_ATRCONTARTHInstance = GX_Parm4 ;
      n165UVID_ATRCONTARTHInstance = false ;
      A166UVID_ATRCONTARTHSeries = GX_Parm5 ;
      n166UVID_ATRCONTARTHSeries = false ;
      A167UVID_ATRCONTARTHHandwrtten = GX_Parm6 ;
      n167UVID_ATRCONTARTHHandwrtten = false ;
      A168UVID_ATRCONTARTHCanceled = GX_Parm7 ;
      n168UVID_ATRCONTARTHCanceled = false ;
      A169UVID_ATRCONTARTHObject = GX_Parm8 ;
      n169UVID_ATRCONTARTHObject = false ;
      A170UVID_ATRCONTARTHLogInst = GX_Parm9 ;
      n170UVID_ATRCONTARTHLogInst = false ;
      A171UVID_ATRCONTARTHUserSign = GX_Parm10 ;
      n171UVID_ATRCONTARTHUserSign = false ;
      A172UVID_ATRCONTARTHTransfered = GX_Parm11 ;
      n172UVID_ATRCONTARTHTransfered = false ;
      A173UVID_ATRCONTARTHStatus = GX_Parm12 ;
      n173UVID_ATRCONTARTHStatus = false ;
      A174UVID_ATRCONTARTHCreateDate = GX_Parm13 ;
      n174UVID_ATRCONTARTHCreateDate = false ;
      A175UVID_ATRCONTARTHCreateTime = GX_Parm14 ;
      n175UVID_ATRCONTARTHCreateTime = false ;
      A176UVID_ATRCONTARTHUpdateDate = GX_Parm15 ;
      n176UVID_ATRCONTARTHUpdateDate = false ;
      A177UVID_ATRCONTARTHUpdateTime = GX_Parm16 ;
      n177UVID_ATRCONTARTHUpdateTime = false ;
      A178UVID_ATRCONTARTHDataSource = GX_Parm17 ;
      n178UVID_ATRCONTARTHDataSource = false ;
      A179UVID_ATRCONTARTHRequestStatus = GX_Parm18 ;
      n179UVID_ATRCONTARTHRequestStatus = false ;
      A180UVID_ATRCONTARTHCreator = GX_Parm19 ;
      n180UVID_ATRCONTARTHCreator = false ;
      A181UVID_ATRCONTARTHRemark = GX_Parm20 ;
      n181UVID_ATRCONTARTHRemark = false ;
      A182UVID_ATRCONTARTHU_ItemCode = GX_Parm21 ;
      n182UVID_ATRCONTARTHU_ItemCode = false ;
      A183UVID_ATRCONTARTHU_ItemName = GX_Parm22 ;
      n183UVID_ATRCONTARTHU_ItemName = false ;
      A184UVID_ATRCONTARTHU_Comment = GX_Parm23 ;
      n184UVID_ATRCONTARTHU_Comment = false ;
      A185UVID_ATRCONTARTHU_ContraMu = GX_Parm24 ;
      n185UVID_ATRCONTARTHU_ContraMu = false ;
      A186UVID_ATRCONTARTHU_CoMuSize = GX_Parm25 ;
      n186UVID_ATRCONTARTHU_CoMuSize = false ;
      A187UVID_ATRCONTARTHU_MuestDes = GX_Parm26 ;
      n187UVID_ATRCONTARTHU_MuestDes = false ;
      A188UVID_ATRCONTARTHU_MuDeSize = GX_Parm27 ;
      n188UVID_ATRCONTARTHU_MuDeSize = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A163UVID_ATRCONTARTHDocNum, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A164UVID_ATRCONTARTHPeriod, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A165UVID_ATRCONTARTHInstance, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A166UVID_ATRCONTARTHSeries, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A167UVID_ATRCONTARTHHandwrtten));
      isValidOutput.add(GXutil.rtrim( A168UVID_ATRCONTARTHCanceled));
      isValidOutput.add(A169UVID_ATRCONTARTHObject);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A170UVID_ATRCONTARTHLogInst, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A171UVID_ATRCONTARTHUserSign, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A172UVID_ATRCONTARTHTransfered));
      isValidOutput.add(GXutil.rtrim( A173UVID_ATRCONTARTHStatus));
      isValidOutput.add(localUtil.ttoc( A174UVID_ATRCONTARTHCreateDate, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A175UVID_ATRCONTARTHCreateTime, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( A176UVID_ATRCONTARTHUpdateDate, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A177UVID_ATRCONTARTHUpdateTime, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A178UVID_ATRCONTARTHDataSource));
      isValidOutput.add(GXutil.rtrim( A179UVID_ATRCONTARTHRequestStatus));
      isValidOutput.add(A180UVID_ATRCONTARTHCreator);
      isValidOutput.add(A181UVID_ATRCONTARTHRemark);
      isValidOutput.add(A182UVID_ATRCONTARTHU_ItemCode);
      isValidOutput.add(A183UVID_ATRCONTARTHU_ItemName);
      isValidOutput.add(A184UVID_ATRCONTARTHU_Comment);
      isValidOutput.add(GXutil.rtrim( A185UVID_ATRCONTARTHU_ContraMu));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A186UVID_ATRCONTARTHU_CoMuSize, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A187UVID_ATRCONTARTHU_MuestDes));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A188UVID_ATRCONTARTHU_MuDeSize, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z162UVID_ATRCONTARTHDocEntry, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z163UVID_ATRCONTARTHDocNum, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z164UVID_ATRCONTARTHPeriod, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z165UVID_ATRCONTARTHInstance, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z166UVID_ATRCONTARTHSeries, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z167UVID_ATRCONTARTHHandwrtten));
      isValidOutput.add(GXutil.rtrim( Z168UVID_ATRCONTARTHCanceled));
      isValidOutput.add(Z169UVID_ATRCONTARTHObject);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z170UVID_ATRCONTARTHLogInst, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z171UVID_ATRCONTARTHUserSign, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z172UVID_ATRCONTARTHTransfered));
      isValidOutput.add(GXutil.rtrim( Z173UVID_ATRCONTARTHStatus));
      isValidOutput.add(localUtil.ttoc( Z174UVID_ATRCONTARTHCreateDate, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z175UVID_ATRCONTARTHCreateTime, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(localUtil.ttoc( Z176UVID_ATRCONTARTHUpdateDate, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z177UVID_ATRCONTARTHUpdateTime, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z178UVID_ATRCONTARTHDataSource));
      isValidOutput.add(GXutil.rtrim( Z179UVID_ATRCONTARTHRequestStatus));
      isValidOutput.add(Z180UVID_ATRCONTARTHCreator);
      isValidOutput.add(Z181UVID_ATRCONTARTHRemark);
      isValidOutput.add(Z182UVID_ATRCONTARTHU_ItemCode);
      isValidOutput.add(Z183UVID_ATRCONTARTHU_ItemName);
      isValidOutput.add(Z184UVID_ATRCONTARTHU_Comment);
      isValidOutput.add(GXutil.rtrim( Z185UVID_ATRCONTARTHU_ContraMu));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z186UVID_ATRCONTARTHU_CoMuSize, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z187UVID_ATRCONTARTHU_MuestDes));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z188UVID_ATRCONTARTHU_MuDeSize, (byte)(18), (byte)(0), ",", "")));
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
      Z167UVID_ATRCONTARTHHandwrtten = "" ;
      Z168UVID_ATRCONTARTHCanceled = "" ;
      Z169UVID_ATRCONTARTHObject = "" ;
      Z172UVID_ATRCONTARTHTransfered = "" ;
      Z173UVID_ATRCONTARTHStatus = "" ;
      Z174UVID_ATRCONTARTHCreateDate = GXutil.resetTime( GXutil.nullDate() );
      Z176UVID_ATRCONTARTHUpdateDate = GXutil.resetTime( GXutil.nullDate() );
      Z178UVID_ATRCONTARTHDataSource = "" ;
      Z179UVID_ATRCONTARTHRequestStatus = "" ;
      Z180UVID_ATRCONTARTHCreator = "" ;
      Z182UVID_ATRCONTARTHU_ItemCode = "" ;
      Z183UVID_ATRCONTARTHU_ItemName = "" ;
      Z184UVID_ATRCONTARTHU_Comment = "" ;
      Z185UVID_ATRCONTARTHU_ContraMu = "" ;
      Z187UVID_ATRCONTARTHU_MuestDes = "" ;
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
      A167UVID_ATRCONTARTHHandwrtten = "" ;
      A168UVID_ATRCONTARTHCanceled = "" ;
      A169UVID_ATRCONTARTHObject = "" ;
      A172UVID_ATRCONTARTHTransfered = "" ;
      A173UVID_ATRCONTARTHStatus = "" ;
      A174UVID_ATRCONTARTHCreateDate = GXutil.resetTime( GXutil.nullDate() );
      A176UVID_ATRCONTARTHUpdateDate = GXutil.resetTime( GXutil.nullDate() );
      A178UVID_ATRCONTARTHDataSource = "" ;
      A179UVID_ATRCONTARTHRequestStatus = "" ;
      A180UVID_ATRCONTARTHCreator = "" ;
      A181UVID_ATRCONTARTHRemark = "" ;
      A182UVID_ATRCONTARTHU_ItemCode = "" ;
      A183UVID_ATRCONTARTHU_ItemName = "" ;
      A184UVID_ATRCONTARTHU_Comment = "" ;
      A185UVID_ATRCONTARTHU_ContraMu = "" ;
      A187UVID_ATRCONTARTHU_MuestDes = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Z181UVID_ATRCONTARTHRemark = "" ;
      T000B4_A162UVID_ATRCONTARTHDocEntry = new int[1] ;
      T000B4_A163UVID_ATRCONTARTHDocNum = new int[1] ;
      T000B4_n163UVID_ATRCONTARTHDocNum = new boolean[] {false} ;
      T000B4_A164UVID_ATRCONTARTHPeriod = new int[1] ;
      T000B4_n164UVID_ATRCONTARTHPeriod = new boolean[] {false} ;
      T000B4_A165UVID_ATRCONTARTHInstance = new short[1] ;
      T000B4_n165UVID_ATRCONTARTHInstance = new boolean[] {false} ;
      T000B4_A166UVID_ATRCONTARTHSeries = new int[1] ;
      T000B4_n166UVID_ATRCONTARTHSeries = new boolean[] {false} ;
      T000B4_A167UVID_ATRCONTARTHHandwrtten = new String[] {""} ;
      T000B4_n167UVID_ATRCONTARTHHandwrtten = new boolean[] {false} ;
      T000B4_A168UVID_ATRCONTARTHCanceled = new String[] {""} ;
      T000B4_n168UVID_ATRCONTARTHCanceled = new boolean[] {false} ;
      T000B4_A169UVID_ATRCONTARTHObject = new String[] {""} ;
      T000B4_n169UVID_ATRCONTARTHObject = new boolean[] {false} ;
      T000B4_A170UVID_ATRCONTARTHLogInst = new int[1] ;
      T000B4_n170UVID_ATRCONTARTHLogInst = new boolean[] {false} ;
      T000B4_A171UVID_ATRCONTARTHUserSign = new int[1] ;
      T000B4_n171UVID_ATRCONTARTHUserSign = new boolean[] {false} ;
      T000B4_A172UVID_ATRCONTARTHTransfered = new String[] {""} ;
      T000B4_n172UVID_ATRCONTARTHTransfered = new boolean[] {false} ;
      T000B4_A173UVID_ATRCONTARTHStatus = new String[] {""} ;
      T000B4_n173UVID_ATRCONTARTHStatus = new boolean[] {false} ;
      T000B4_A174UVID_ATRCONTARTHCreateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T000B4_n174UVID_ATRCONTARTHCreateDate = new boolean[] {false} ;
      T000B4_A175UVID_ATRCONTARTHCreateTime = new short[1] ;
      T000B4_n175UVID_ATRCONTARTHCreateTime = new boolean[] {false} ;
      T000B4_A176UVID_ATRCONTARTHUpdateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T000B4_n176UVID_ATRCONTARTHUpdateDate = new boolean[] {false} ;
      T000B4_A177UVID_ATRCONTARTHUpdateTime = new short[1] ;
      T000B4_n177UVID_ATRCONTARTHUpdateTime = new boolean[] {false} ;
      T000B4_A178UVID_ATRCONTARTHDataSource = new String[] {""} ;
      T000B4_n178UVID_ATRCONTARTHDataSource = new boolean[] {false} ;
      T000B4_A179UVID_ATRCONTARTHRequestStatus = new String[] {""} ;
      T000B4_n179UVID_ATRCONTARTHRequestStatus = new boolean[] {false} ;
      T000B4_A180UVID_ATRCONTARTHCreator = new String[] {""} ;
      T000B4_n180UVID_ATRCONTARTHCreator = new boolean[] {false} ;
      T000B4_A181UVID_ATRCONTARTHRemark = new String[] {""} ;
      T000B4_n181UVID_ATRCONTARTHRemark = new boolean[] {false} ;
      T000B4_A182UVID_ATRCONTARTHU_ItemCode = new String[] {""} ;
      T000B4_n182UVID_ATRCONTARTHU_ItemCode = new boolean[] {false} ;
      T000B4_A183UVID_ATRCONTARTHU_ItemName = new String[] {""} ;
      T000B4_n183UVID_ATRCONTARTHU_ItemName = new boolean[] {false} ;
      T000B4_A184UVID_ATRCONTARTHU_Comment = new String[] {""} ;
      T000B4_n184UVID_ATRCONTARTHU_Comment = new boolean[] {false} ;
      T000B4_A185UVID_ATRCONTARTHU_ContraMu = new String[] {""} ;
      T000B4_n185UVID_ATRCONTARTHU_ContraMu = new boolean[] {false} ;
      T000B4_A186UVID_ATRCONTARTHU_CoMuSize = new long[1] ;
      T000B4_n186UVID_ATRCONTARTHU_CoMuSize = new boolean[] {false} ;
      T000B4_A187UVID_ATRCONTARTHU_MuestDes = new String[] {""} ;
      T000B4_n187UVID_ATRCONTARTHU_MuestDes = new boolean[] {false} ;
      T000B4_A188UVID_ATRCONTARTHU_MuDeSize = new long[1] ;
      T000B4_n188UVID_ATRCONTARTHU_MuDeSize = new boolean[] {false} ;
      T000B5_A162UVID_ATRCONTARTHDocEntry = new int[1] ;
      T000B3_A162UVID_ATRCONTARTHDocEntry = new int[1] ;
      T000B3_A163UVID_ATRCONTARTHDocNum = new int[1] ;
      T000B3_n163UVID_ATRCONTARTHDocNum = new boolean[] {false} ;
      T000B3_A164UVID_ATRCONTARTHPeriod = new int[1] ;
      T000B3_n164UVID_ATRCONTARTHPeriod = new boolean[] {false} ;
      T000B3_A165UVID_ATRCONTARTHInstance = new short[1] ;
      T000B3_n165UVID_ATRCONTARTHInstance = new boolean[] {false} ;
      T000B3_A166UVID_ATRCONTARTHSeries = new int[1] ;
      T000B3_n166UVID_ATRCONTARTHSeries = new boolean[] {false} ;
      T000B3_A167UVID_ATRCONTARTHHandwrtten = new String[] {""} ;
      T000B3_n167UVID_ATRCONTARTHHandwrtten = new boolean[] {false} ;
      T000B3_A168UVID_ATRCONTARTHCanceled = new String[] {""} ;
      T000B3_n168UVID_ATRCONTARTHCanceled = new boolean[] {false} ;
      T000B3_A169UVID_ATRCONTARTHObject = new String[] {""} ;
      T000B3_n169UVID_ATRCONTARTHObject = new boolean[] {false} ;
      T000B3_A170UVID_ATRCONTARTHLogInst = new int[1] ;
      T000B3_n170UVID_ATRCONTARTHLogInst = new boolean[] {false} ;
      T000B3_A171UVID_ATRCONTARTHUserSign = new int[1] ;
      T000B3_n171UVID_ATRCONTARTHUserSign = new boolean[] {false} ;
      T000B3_A172UVID_ATRCONTARTHTransfered = new String[] {""} ;
      T000B3_n172UVID_ATRCONTARTHTransfered = new boolean[] {false} ;
      T000B3_A173UVID_ATRCONTARTHStatus = new String[] {""} ;
      T000B3_n173UVID_ATRCONTARTHStatus = new boolean[] {false} ;
      T000B3_A174UVID_ATRCONTARTHCreateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T000B3_n174UVID_ATRCONTARTHCreateDate = new boolean[] {false} ;
      T000B3_A175UVID_ATRCONTARTHCreateTime = new short[1] ;
      T000B3_n175UVID_ATRCONTARTHCreateTime = new boolean[] {false} ;
      T000B3_A176UVID_ATRCONTARTHUpdateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T000B3_n176UVID_ATRCONTARTHUpdateDate = new boolean[] {false} ;
      T000B3_A177UVID_ATRCONTARTHUpdateTime = new short[1] ;
      T000B3_n177UVID_ATRCONTARTHUpdateTime = new boolean[] {false} ;
      T000B3_A178UVID_ATRCONTARTHDataSource = new String[] {""} ;
      T000B3_n178UVID_ATRCONTARTHDataSource = new boolean[] {false} ;
      T000B3_A179UVID_ATRCONTARTHRequestStatus = new String[] {""} ;
      T000B3_n179UVID_ATRCONTARTHRequestStatus = new boolean[] {false} ;
      T000B3_A180UVID_ATRCONTARTHCreator = new String[] {""} ;
      T000B3_n180UVID_ATRCONTARTHCreator = new boolean[] {false} ;
      T000B3_A181UVID_ATRCONTARTHRemark = new String[] {""} ;
      T000B3_n181UVID_ATRCONTARTHRemark = new boolean[] {false} ;
      T000B3_A182UVID_ATRCONTARTHU_ItemCode = new String[] {""} ;
      T000B3_n182UVID_ATRCONTARTHU_ItemCode = new boolean[] {false} ;
      T000B3_A183UVID_ATRCONTARTHU_ItemName = new String[] {""} ;
      T000B3_n183UVID_ATRCONTARTHU_ItemName = new boolean[] {false} ;
      T000B3_A184UVID_ATRCONTARTHU_Comment = new String[] {""} ;
      T000B3_n184UVID_ATRCONTARTHU_Comment = new boolean[] {false} ;
      T000B3_A185UVID_ATRCONTARTHU_ContraMu = new String[] {""} ;
      T000B3_n185UVID_ATRCONTARTHU_ContraMu = new boolean[] {false} ;
      T000B3_A186UVID_ATRCONTARTHU_CoMuSize = new long[1] ;
      T000B3_n186UVID_ATRCONTARTHU_CoMuSize = new boolean[] {false} ;
      T000B3_A187UVID_ATRCONTARTHU_MuestDes = new String[] {""} ;
      T000B3_n187UVID_ATRCONTARTHU_MuestDes = new boolean[] {false} ;
      T000B3_A188UVID_ATRCONTARTHU_MuDeSize = new long[1] ;
      T000B3_n188UVID_ATRCONTARTHU_MuDeSize = new boolean[] {false} ;
      sMode10 = "" ;
      T000B6_A162UVID_ATRCONTARTHDocEntry = new int[1] ;
      T000B7_A162UVID_ATRCONTARTHDocEntry = new int[1] ;
      T000B2_A162UVID_ATRCONTARTHDocEntry = new int[1] ;
      T000B2_A163UVID_ATRCONTARTHDocNum = new int[1] ;
      T000B2_n163UVID_ATRCONTARTHDocNum = new boolean[] {false} ;
      T000B2_A164UVID_ATRCONTARTHPeriod = new int[1] ;
      T000B2_n164UVID_ATRCONTARTHPeriod = new boolean[] {false} ;
      T000B2_A165UVID_ATRCONTARTHInstance = new short[1] ;
      T000B2_n165UVID_ATRCONTARTHInstance = new boolean[] {false} ;
      T000B2_A166UVID_ATRCONTARTHSeries = new int[1] ;
      T000B2_n166UVID_ATRCONTARTHSeries = new boolean[] {false} ;
      T000B2_A167UVID_ATRCONTARTHHandwrtten = new String[] {""} ;
      T000B2_n167UVID_ATRCONTARTHHandwrtten = new boolean[] {false} ;
      T000B2_A168UVID_ATRCONTARTHCanceled = new String[] {""} ;
      T000B2_n168UVID_ATRCONTARTHCanceled = new boolean[] {false} ;
      T000B2_A169UVID_ATRCONTARTHObject = new String[] {""} ;
      T000B2_n169UVID_ATRCONTARTHObject = new boolean[] {false} ;
      T000B2_A170UVID_ATRCONTARTHLogInst = new int[1] ;
      T000B2_n170UVID_ATRCONTARTHLogInst = new boolean[] {false} ;
      T000B2_A171UVID_ATRCONTARTHUserSign = new int[1] ;
      T000B2_n171UVID_ATRCONTARTHUserSign = new boolean[] {false} ;
      T000B2_A172UVID_ATRCONTARTHTransfered = new String[] {""} ;
      T000B2_n172UVID_ATRCONTARTHTransfered = new boolean[] {false} ;
      T000B2_A173UVID_ATRCONTARTHStatus = new String[] {""} ;
      T000B2_n173UVID_ATRCONTARTHStatus = new boolean[] {false} ;
      T000B2_A174UVID_ATRCONTARTHCreateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T000B2_n174UVID_ATRCONTARTHCreateDate = new boolean[] {false} ;
      T000B2_A175UVID_ATRCONTARTHCreateTime = new short[1] ;
      T000B2_n175UVID_ATRCONTARTHCreateTime = new boolean[] {false} ;
      T000B2_A176UVID_ATRCONTARTHUpdateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T000B2_n176UVID_ATRCONTARTHUpdateDate = new boolean[] {false} ;
      T000B2_A177UVID_ATRCONTARTHUpdateTime = new short[1] ;
      T000B2_n177UVID_ATRCONTARTHUpdateTime = new boolean[] {false} ;
      T000B2_A178UVID_ATRCONTARTHDataSource = new String[] {""} ;
      T000B2_n178UVID_ATRCONTARTHDataSource = new boolean[] {false} ;
      T000B2_A179UVID_ATRCONTARTHRequestStatus = new String[] {""} ;
      T000B2_n179UVID_ATRCONTARTHRequestStatus = new boolean[] {false} ;
      T000B2_A180UVID_ATRCONTARTHCreator = new String[] {""} ;
      T000B2_n180UVID_ATRCONTARTHCreator = new boolean[] {false} ;
      T000B2_A181UVID_ATRCONTARTHRemark = new String[] {""} ;
      T000B2_n181UVID_ATRCONTARTHRemark = new boolean[] {false} ;
      T000B2_A182UVID_ATRCONTARTHU_ItemCode = new String[] {""} ;
      T000B2_n182UVID_ATRCONTARTHU_ItemCode = new boolean[] {false} ;
      T000B2_A183UVID_ATRCONTARTHU_ItemName = new String[] {""} ;
      T000B2_n183UVID_ATRCONTARTHU_ItemName = new boolean[] {false} ;
      T000B2_A184UVID_ATRCONTARTHU_Comment = new String[] {""} ;
      T000B2_n184UVID_ATRCONTARTHU_Comment = new boolean[] {false} ;
      T000B2_A185UVID_ATRCONTARTHU_ContraMu = new String[] {""} ;
      T000B2_n185UVID_ATRCONTARTHU_ContraMu = new boolean[] {false} ;
      T000B2_A186UVID_ATRCONTARTHU_CoMuSize = new long[1] ;
      T000B2_n186UVID_ATRCONTARTHU_CoMuSize = new boolean[] {false} ;
      T000B2_A187UVID_ATRCONTARTHU_MuestDes = new String[] {""} ;
      T000B2_n187UVID_ATRCONTARTHU_MuestDes = new boolean[] {false} ;
      T000B2_A188UVID_ATRCONTARTHU_MuDeSize = new long[1] ;
      T000B2_n188UVID_ATRCONTARTHU_MuDeSize = new boolean[] {false} ;
      T000B11_A162UVID_ATRCONTARTHDocEntry = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.uvid_atrcontarth__fusquim_sap(),
         new Object[] {
             new Object[] {
            T000B2_A162UVID_ATRCONTARTHDocEntry, T000B2_A163UVID_ATRCONTARTHDocNum, T000B2_n163UVID_ATRCONTARTHDocNum, T000B2_A164UVID_ATRCONTARTHPeriod, T000B2_n164UVID_ATRCONTARTHPeriod, T000B2_A165UVID_ATRCONTARTHInstance, T000B2_n165UVID_ATRCONTARTHInstance, T000B2_A166UVID_ATRCONTARTHSeries, T000B2_n166UVID_ATRCONTARTHSeries, T000B2_A167UVID_ATRCONTARTHHandwrtten,
            T000B2_n167UVID_ATRCONTARTHHandwrtten, T000B2_A168UVID_ATRCONTARTHCanceled, T000B2_n168UVID_ATRCONTARTHCanceled, T000B2_A169UVID_ATRCONTARTHObject, T000B2_n169UVID_ATRCONTARTHObject, T000B2_A170UVID_ATRCONTARTHLogInst, T000B2_n170UVID_ATRCONTARTHLogInst, T000B2_A171UVID_ATRCONTARTHUserSign, T000B2_n171UVID_ATRCONTARTHUserSign, T000B2_A172UVID_ATRCONTARTHTransfered,
            T000B2_n172UVID_ATRCONTARTHTransfered, T000B2_A173UVID_ATRCONTARTHStatus, T000B2_n173UVID_ATRCONTARTHStatus, T000B2_A174UVID_ATRCONTARTHCreateDate, T000B2_n174UVID_ATRCONTARTHCreateDate, T000B2_A175UVID_ATRCONTARTHCreateTime, T000B2_n175UVID_ATRCONTARTHCreateTime, T000B2_A176UVID_ATRCONTARTHUpdateDate, T000B2_n176UVID_ATRCONTARTHUpdateDate, T000B2_A177UVID_ATRCONTARTHUpdateTime,
            T000B2_n177UVID_ATRCONTARTHUpdateTime, T000B2_A178UVID_ATRCONTARTHDataSource, T000B2_n178UVID_ATRCONTARTHDataSource, T000B2_A179UVID_ATRCONTARTHRequestStatus, T000B2_n179UVID_ATRCONTARTHRequestStatus, T000B2_A180UVID_ATRCONTARTHCreator, T000B2_n180UVID_ATRCONTARTHCreator, T000B2_A181UVID_ATRCONTARTHRemark, T000B2_n181UVID_ATRCONTARTHRemark, T000B2_A182UVID_ATRCONTARTHU_ItemCode,
            T000B2_n182UVID_ATRCONTARTHU_ItemCode, T000B2_A183UVID_ATRCONTARTHU_ItemName, T000B2_n183UVID_ATRCONTARTHU_ItemName, T000B2_A184UVID_ATRCONTARTHU_Comment, T000B2_n184UVID_ATRCONTARTHU_Comment, T000B2_A185UVID_ATRCONTARTHU_ContraMu, T000B2_n185UVID_ATRCONTARTHU_ContraMu, T000B2_A186UVID_ATRCONTARTHU_CoMuSize, T000B2_n186UVID_ATRCONTARTHU_CoMuSize, T000B2_A187UVID_ATRCONTARTHU_MuestDes,
            T000B2_n187UVID_ATRCONTARTHU_MuestDes, T000B2_A188UVID_ATRCONTARTHU_MuDeSize, T000B2_n188UVID_ATRCONTARTHU_MuDeSize
            }
            , new Object[] {
            T000B3_A162UVID_ATRCONTARTHDocEntry, T000B3_A163UVID_ATRCONTARTHDocNum, T000B3_n163UVID_ATRCONTARTHDocNum, T000B3_A164UVID_ATRCONTARTHPeriod, T000B3_n164UVID_ATRCONTARTHPeriod, T000B3_A165UVID_ATRCONTARTHInstance, T000B3_n165UVID_ATRCONTARTHInstance, T000B3_A166UVID_ATRCONTARTHSeries, T000B3_n166UVID_ATRCONTARTHSeries, T000B3_A167UVID_ATRCONTARTHHandwrtten,
            T000B3_n167UVID_ATRCONTARTHHandwrtten, T000B3_A168UVID_ATRCONTARTHCanceled, T000B3_n168UVID_ATRCONTARTHCanceled, T000B3_A169UVID_ATRCONTARTHObject, T000B3_n169UVID_ATRCONTARTHObject, T000B3_A170UVID_ATRCONTARTHLogInst, T000B3_n170UVID_ATRCONTARTHLogInst, T000B3_A171UVID_ATRCONTARTHUserSign, T000B3_n171UVID_ATRCONTARTHUserSign, T000B3_A172UVID_ATRCONTARTHTransfered,
            T000B3_n172UVID_ATRCONTARTHTransfered, T000B3_A173UVID_ATRCONTARTHStatus, T000B3_n173UVID_ATRCONTARTHStatus, T000B3_A174UVID_ATRCONTARTHCreateDate, T000B3_n174UVID_ATRCONTARTHCreateDate, T000B3_A175UVID_ATRCONTARTHCreateTime, T000B3_n175UVID_ATRCONTARTHCreateTime, T000B3_A176UVID_ATRCONTARTHUpdateDate, T000B3_n176UVID_ATRCONTARTHUpdateDate, T000B3_A177UVID_ATRCONTARTHUpdateTime,
            T000B3_n177UVID_ATRCONTARTHUpdateTime, T000B3_A178UVID_ATRCONTARTHDataSource, T000B3_n178UVID_ATRCONTARTHDataSource, T000B3_A179UVID_ATRCONTARTHRequestStatus, T000B3_n179UVID_ATRCONTARTHRequestStatus, T000B3_A180UVID_ATRCONTARTHCreator, T000B3_n180UVID_ATRCONTARTHCreator, T000B3_A181UVID_ATRCONTARTHRemark, T000B3_n181UVID_ATRCONTARTHRemark, T000B3_A182UVID_ATRCONTARTHU_ItemCode,
            T000B3_n182UVID_ATRCONTARTHU_ItemCode, T000B3_A183UVID_ATRCONTARTHU_ItemName, T000B3_n183UVID_ATRCONTARTHU_ItemName, T000B3_A184UVID_ATRCONTARTHU_Comment, T000B3_n184UVID_ATRCONTARTHU_Comment, T000B3_A185UVID_ATRCONTARTHU_ContraMu, T000B3_n185UVID_ATRCONTARTHU_ContraMu, T000B3_A186UVID_ATRCONTARTHU_CoMuSize, T000B3_n186UVID_ATRCONTARTHU_CoMuSize, T000B3_A187UVID_ATRCONTARTHU_MuestDes,
            T000B3_n187UVID_ATRCONTARTHU_MuestDes, T000B3_A188UVID_ATRCONTARTHU_MuDeSize, T000B3_n188UVID_ATRCONTARTHU_MuDeSize
            }
            , new Object[] {
            T000B4_A162UVID_ATRCONTARTHDocEntry, T000B4_A163UVID_ATRCONTARTHDocNum, T000B4_n163UVID_ATRCONTARTHDocNum, T000B4_A164UVID_ATRCONTARTHPeriod, T000B4_n164UVID_ATRCONTARTHPeriod, T000B4_A165UVID_ATRCONTARTHInstance, T000B4_n165UVID_ATRCONTARTHInstance, T000B4_A166UVID_ATRCONTARTHSeries, T000B4_n166UVID_ATRCONTARTHSeries, T000B4_A167UVID_ATRCONTARTHHandwrtten,
            T000B4_n167UVID_ATRCONTARTHHandwrtten, T000B4_A168UVID_ATRCONTARTHCanceled, T000B4_n168UVID_ATRCONTARTHCanceled, T000B4_A169UVID_ATRCONTARTHObject, T000B4_n169UVID_ATRCONTARTHObject, T000B4_A170UVID_ATRCONTARTHLogInst, T000B4_n170UVID_ATRCONTARTHLogInst, T000B4_A171UVID_ATRCONTARTHUserSign, T000B4_n171UVID_ATRCONTARTHUserSign, T000B4_A172UVID_ATRCONTARTHTransfered,
            T000B4_n172UVID_ATRCONTARTHTransfered, T000B4_A173UVID_ATRCONTARTHStatus, T000B4_n173UVID_ATRCONTARTHStatus, T000B4_A174UVID_ATRCONTARTHCreateDate, T000B4_n174UVID_ATRCONTARTHCreateDate, T000B4_A175UVID_ATRCONTARTHCreateTime, T000B4_n175UVID_ATRCONTARTHCreateTime, T000B4_A176UVID_ATRCONTARTHUpdateDate, T000B4_n176UVID_ATRCONTARTHUpdateDate, T000B4_A177UVID_ATRCONTARTHUpdateTime,
            T000B4_n177UVID_ATRCONTARTHUpdateTime, T000B4_A178UVID_ATRCONTARTHDataSource, T000B4_n178UVID_ATRCONTARTHDataSource, T000B4_A179UVID_ATRCONTARTHRequestStatus, T000B4_n179UVID_ATRCONTARTHRequestStatus, T000B4_A180UVID_ATRCONTARTHCreator, T000B4_n180UVID_ATRCONTARTHCreator, T000B4_A181UVID_ATRCONTARTHRemark, T000B4_n181UVID_ATRCONTARTHRemark, T000B4_A182UVID_ATRCONTARTHU_ItemCode,
            T000B4_n182UVID_ATRCONTARTHU_ItemCode, T000B4_A183UVID_ATRCONTARTHU_ItemName, T000B4_n183UVID_ATRCONTARTHU_ItemName, T000B4_A184UVID_ATRCONTARTHU_Comment, T000B4_n184UVID_ATRCONTARTHU_Comment, T000B4_A185UVID_ATRCONTARTHU_ContraMu, T000B4_n185UVID_ATRCONTARTHU_ContraMu, T000B4_A186UVID_ATRCONTARTHU_CoMuSize, T000B4_n186UVID_ATRCONTARTHU_CoMuSize, T000B4_A187UVID_ATRCONTARTHU_MuestDes,
            T000B4_n187UVID_ATRCONTARTHU_MuestDes, T000B4_A188UVID_ATRCONTARTHU_MuDeSize, T000B4_n188UVID_ATRCONTARTHU_MuDeSize
            }
            , new Object[] {
            T000B5_A162UVID_ATRCONTARTHDocEntry
            }
            , new Object[] {
            T000B6_A162UVID_ATRCONTARTHDocEntry
            }
            , new Object[] {
            T000B7_A162UVID_ATRCONTARTHDocEntry
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000B11_A162UVID_ATRCONTARTHDocEntry
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.uvid_atrcontarth__default(),
         new Object[] {
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z165UVID_ATRCONTARTHInstance ;
   private short Z175UVID_ATRCONTARTHCreateTime ;
   private short Z177UVID_ATRCONTARTHUpdateTime ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A165UVID_ATRCONTARTHInstance ;
   private short A175UVID_ATRCONTARTHCreateTime ;
   private short A177UVID_ATRCONTARTHUpdateTime ;
   private short RcdFound10 ;
   private int Z162UVID_ATRCONTARTHDocEntry ;
   private int Z163UVID_ATRCONTARTHDocNum ;
   private int Z164UVID_ATRCONTARTHPeriod ;
   private int Z166UVID_ATRCONTARTHSeries ;
   private int Z170UVID_ATRCONTARTHLogInst ;
   private int Z171UVID_ATRCONTARTHUserSign ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A162UVID_ATRCONTARTHDocEntry ;
   private int edtUVID_ATRCONTARTHDocEntry_Enabled ;
   private int A163UVID_ATRCONTARTHDocNum ;
   private int edtUVID_ATRCONTARTHDocNum_Enabled ;
   private int A164UVID_ATRCONTARTHPeriod ;
   private int edtUVID_ATRCONTARTHPeriod_Enabled ;
   private int edtUVID_ATRCONTARTHInstance_Enabled ;
   private int A166UVID_ATRCONTARTHSeries ;
   private int edtUVID_ATRCONTARTHSeries_Enabled ;
   private int edtUVID_ATRCONTARTHHandwrtten_Enabled ;
   private int edtUVID_ATRCONTARTHCanceled_Enabled ;
   private int edtUVID_ATRCONTARTHObject_Enabled ;
   private int A170UVID_ATRCONTARTHLogInst ;
   private int edtUVID_ATRCONTARTHLogInst_Enabled ;
   private int A171UVID_ATRCONTARTHUserSign ;
   private int edtUVID_ATRCONTARTHUserSign_Enabled ;
   private int edtUVID_ATRCONTARTHTransfered_Enabled ;
   private int edtUVID_ATRCONTARTHStatus_Enabled ;
   private int edtUVID_ATRCONTARTHCreateDate_Enabled ;
   private int edtUVID_ATRCONTARTHCreateTime_Enabled ;
   private int edtUVID_ATRCONTARTHUpdateDate_Enabled ;
   private int edtUVID_ATRCONTARTHUpdateTime_Enabled ;
   private int edtUVID_ATRCONTARTHDataSource_Enabled ;
   private int edtUVID_ATRCONTARTHRequestStatus_Enabled ;
   private int edtUVID_ATRCONTARTHCreator_Enabled ;
   private int edtUVID_ATRCONTARTHRemark_Enabled ;
   private int edtUVID_ATRCONTARTHU_ItemCode_Enabled ;
   private int edtUVID_ATRCONTARTHU_ItemName_Enabled ;
   private int edtUVID_ATRCONTARTHU_Comment_Enabled ;
   private int edtUVID_ATRCONTARTHU_ContraMu_Enabled ;
   private int edtUVID_ATRCONTARTHU_CoMuSize_Enabled ;
   private int edtUVID_ATRCONTARTHU_MuestDes_Enabled ;
   private int edtUVID_ATRCONTARTHU_MuDeSize_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z186UVID_ATRCONTARTHU_CoMuSize ;
   private long Z188UVID_ATRCONTARTHU_MuDeSize ;
   private long A186UVID_ATRCONTARTHU_CoMuSize ;
   private long A188UVID_ATRCONTARTHU_MuDeSize ;
   private String sPrefix ;
   private String Z167UVID_ATRCONTARTHHandwrtten ;
   private String Z168UVID_ATRCONTARTHCanceled ;
   private String Z172UVID_ATRCONTARTHTransfered ;
   private String Z173UVID_ATRCONTARTHStatus ;
   private String Z178UVID_ATRCONTARTHDataSource ;
   private String Z179UVID_ATRCONTARTHRequestStatus ;
   private String Z185UVID_ATRCONTARTHU_ContraMu ;
   private String Z187UVID_ATRCONTARTHU_MuestDes ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtUVID_ATRCONTARTHDocEntry_Internalname ;
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
   private String edtUVID_ATRCONTARTHDocEntry_Jsonclick ;
   private String edtUVID_ATRCONTARTHDocNum_Internalname ;
   private String edtUVID_ATRCONTARTHDocNum_Jsonclick ;
   private String edtUVID_ATRCONTARTHPeriod_Internalname ;
   private String edtUVID_ATRCONTARTHPeriod_Jsonclick ;
   private String edtUVID_ATRCONTARTHInstance_Internalname ;
   private String edtUVID_ATRCONTARTHInstance_Jsonclick ;
   private String edtUVID_ATRCONTARTHSeries_Internalname ;
   private String edtUVID_ATRCONTARTHSeries_Jsonclick ;
   private String edtUVID_ATRCONTARTHHandwrtten_Internalname ;
   private String A167UVID_ATRCONTARTHHandwrtten ;
   private String edtUVID_ATRCONTARTHHandwrtten_Jsonclick ;
   private String edtUVID_ATRCONTARTHCanceled_Internalname ;
   private String A168UVID_ATRCONTARTHCanceled ;
   private String edtUVID_ATRCONTARTHCanceled_Jsonclick ;
   private String edtUVID_ATRCONTARTHObject_Internalname ;
   private String edtUVID_ATRCONTARTHObject_Jsonclick ;
   private String edtUVID_ATRCONTARTHLogInst_Internalname ;
   private String edtUVID_ATRCONTARTHLogInst_Jsonclick ;
   private String edtUVID_ATRCONTARTHUserSign_Internalname ;
   private String edtUVID_ATRCONTARTHUserSign_Jsonclick ;
   private String edtUVID_ATRCONTARTHTransfered_Internalname ;
   private String A172UVID_ATRCONTARTHTransfered ;
   private String edtUVID_ATRCONTARTHTransfered_Jsonclick ;
   private String edtUVID_ATRCONTARTHStatus_Internalname ;
   private String A173UVID_ATRCONTARTHStatus ;
   private String edtUVID_ATRCONTARTHStatus_Jsonclick ;
   private String edtUVID_ATRCONTARTHCreateDate_Internalname ;
   private String edtUVID_ATRCONTARTHCreateDate_Jsonclick ;
   private String edtUVID_ATRCONTARTHCreateTime_Internalname ;
   private String edtUVID_ATRCONTARTHCreateTime_Jsonclick ;
   private String edtUVID_ATRCONTARTHUpdateDate_Internalname ;
   private String edtUVID_ATRCONTARTHUpdateDate_Jsonclick ;
   private String edtUVID_ATRCONTARTHUpdateTime_Internalname ;
   private String edtUVID_ATRCONTARTHUpdateTime_Jsonclick ;
   private String edtUVID_ATRCONTARTHDataSource_Internalname ;
   private String A178UVID_ATRCONTARTHDataSource ;
   private String edtUVID_ATRCONTARTHDataSource_Jsonclick ;
   private String edtUVID_ATRCONTARTHRequestStatus_Internalname ;
   private String A179UVID_ATRCONTARTHRequestStatus ;
   private String edtUVID_ATRCONTARTHRequestStatus_Jsonclick ;
   private String edtUVID_ATRCONTARTHCreator_Internalname ;
   private String edtUVID_ATRCONTARTHCreator_Jsonclick ;
   private String edtUVID_ATRCONTARTHRemark_Internalname ;
   private String edtUVID_ATRCONTARTHRemark_Jsonclick ;
   private String edtUVID_ATRCONTARTHU_ItemCode_Internalname ;
   private String edtUVID_ATRCONTARTHU_ItemCode_Jsonclick ;
   private String edtUVID_ATRCONTARTHU_ItemName_Internalname ;
   private String edtUVID_ATRCONTARTHU_ItemName_Jsonclick ;
   private String edtUVID_ATRCONTARTHU_Comment_Internalname ;
   private String edtUVID_ATRCONTARTHU_ContraMu_Internalname ;
   private String A185UVID_ATRCONTARTHU_ContraMu ;
   private String edtUVID_ATRCONTARTHU_ContraMu_Jsonclick ;
   private String edtUVID_ATRCONTARTHU_CoMuSize_Internalname ;
   private String edtUVID_ATRCONTARTHU_CoMuSize_Jsonclick ;
   private String edtUVID_ATRCONTARTHU_MuestDes_Internalname ;
   private String A187UVID_ATRCONTARTHU_MuestDes ;
   private String edtUVID_ATRCONTARTHU_MuestDes_Jsonclick ;
   private String edtUVID_ATRCONTARTHU_MuDeSize_Internalname ;
   private String edtUVID_ATRCONTARTHU_MuDeSize_Jsonclick ;
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
   private String sMode10 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z174UVID_ATRCONTARTHCreateDate ;
   private java.util.Date Z176UVID_ATRCONTARTHUpdateDate ;
   private java.util.Date A174UVID_ATRCONTARTHCreateDate ;
   private java.util.Date A176UVID_ATRCONTARTHUpdateDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n163UVID_ATRCONTARTHDocNum ;
   private boolean n164UVID_ATRCONTARTHPeriod ;
   private boolean n165UVID_ATRCONTARTHInstance ;
   private boolean n166UVID_ATRCONTARTHSeries ;
   private boolean n167UVID_ATRCONTARTHHandwrtten ;
   private boolean n168UVID_ATRCONTARTHCanceled ;
   private boolean n169UVID_ATRCONTARTHObject ;
   private boolean n170UVID_ATRCONTARTHLogInst ;
   private boolean n171UVID_ATRCONTARTHUserSign ;
   private boolean n172UVID_ATRCONTARTHTransfered ;
   private boolean n173UVID_ATRCONTARTHStatus ;
   private boolean n174UVID_ATRCONTARTHCreateDate ;
   private boolean n175UVID_ATRCONTARTHCreateTime ;
   private boolean n176UVID_ATRCONTARTHUpdateDate ;
   private boolean n177UVID_ATRCONTARTHUpdateTime ;
   private boolean n178UVID_ATRCONTARTHDataSource ;
   private boolean n179UVID_ATRCONTARTHRequestStatus ;
   private boolean n180UVID_ATRCONTARTHCreator ;
   private boolean n181UVID_ATRCONTARTHRemark ;
   private boolean n182UVID_ATRCONTARTHU_ItemCode ;
   private boolean n183UVID_ATRCONTARTHU_ItemName ;
   private boolean n184UVID_ATRCONTARTHU_Comment ;
   private boolean n185UVID_ATRCONTARTHU_ContraMu ;
   private boolean n186UVID_ATRCONTARTHU_CoMuSize ;
   private boolean n187UVID_ATRCONTARTHU_MuestDes ;
   private boolean n188UVID_ATRCONTARTHU_MuDeSize ;
   private boolean Gx_longc ;
   private String A181UVID_ATRCONTARTHRemark ;
   private String Z181UVID_ATRCONTARTHRemark ;
   private String Z169UVID_ATRCONTARTHObject ;
   private String Z180UVID_ATRCONTARTHCreator ;
   private String Z182UVID_ATRCONTARTHU_ItemCode ;
   private String Z183UVID_ATRCONTARTHU_ItemName ;
   private String Z184UVID_ATRCONTARTHU_Comment ;
   private String A169UVID_ATRCONTARTHObject ;
   private String A180UVID_ATRCONTARTHCreator ;
   private String A182UVID_ATRCONTARTHU_ItemCode ;
   private String A183UVID_ATRCONTARTHU_ItemName ;
   private String A184UVID_ATRCONTARTHU_Comment ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_fusquim_sap ;
   private int[] T000B4_A162UVID_ATRCONTARTHDocEntry ;
   private int[] T000B4_A163UVID_ATRCONTARTHDocNum ;
   private boolean[] T000B4_n163UVID_ATRCONTARTHDocNum ;
   private int[] T000B4_A164UVID_ATRCONTARTHPeriod ;
   private boolean[] T000B4_n164UVID_ATRCONTARTHPeriod ;
   private short[] T000B4_A165UVID_ATRCONTARTHInstance ;
   private boolean[] T000B4_n165UVID_ATRCONTARTHInstance ;
   private int[] T000B4_A166UVID_ATRCONTARTHSeries ;
   private boolean[] T000B4_n166UVID_ATRCONTARTHSeries ;
   private String[] T000B4_A167UVID_ATRCONTARTHHandwrtten ;
   private boolean[] T000B4_n167UVID_ATRCONTARTHHandwrtten ;
   private String[] T000B4_A168UVID_ATRCONTARTHCanceled ;
   private boolean[] T000B4_n168UVID_ATRCONTARTHCanceled ;
   private String[] T000B4_A169UVID_ATRCONTARTHObject ;
   private boolean[] T000B4_n169UVID_ATRCONTARTHObject ;
   private int[] T000B4_A170UVID_ATRCONTARTHLogInst ;
   private boolean[] T000B4_n170UVID_ATRCONTARTHLogInst ;
   private int[] T000B4_A171UVID_ATRCONTARTHUserSign ;
   private boolean[] T000B4_n171UVID_ATRCONTARTHUserSign ;
   private String[] T000B4_A172UVID_ATRCONTARTHTransfered ;
   private boolean[] T000B4_n172UVID_ATRCONTARTHTransfered ;
   private String[] T000B4_A173UVID_ATRCONTARTHStatus ;
   private boolean[] T000B4_n173UVID_ATRCONTARTHStatus ;
   private java.util.Date[] T000B4_A174UVID_ATRCONTARTHCreateDate ;
   private boolean[] T000B4_n174UVID_ATRCONTARTHCreateDate ;
   private short[] T000B4_A175UVID_ATRCONTARTHCreateTime ;
   private boolean[] T000B4_n175UVID_ATRCONTARTHCreateTime ;
   private java.util.Date[] T000B4_A176UVID_ATRCONTARTHUpdateDate ;
   private boolean[] T000B4_n176UVID_ATRCONTARTHUpdateDate ;
   private short[] T000B4_A177UVID_ATRCONTARTHUpdateTime ;
   private boolean[] T000B4_n177UVID_ATRCONTARTHUpdateTime ;
   private String[] T000B4_A178UVID_ATRCONTARTHDataSource ;
   private boolean[] T000B4_n178UVID_ATRCONTARTHDataSource ;
   private String[] T000B4_A179UVID_ATRCONTARTHRequestStatus ;
   private boolean[] T000B4_n179UVID_ATRCONTARTHRequestStatus ;
   private String[] T000B4_A180UVID_ATRCONTARTHCreator ;
   private boolean[] T000B4_n180UVID_ATRCONTARTHCreator ;
   private String[] T000B4_A181UVID_ATRCONTARTHRemark ;
   private boolean[] T000B4_n181UVID_ATRCONTARTHRemark ;
   private String[] T000B4_A182UVID_ATRCONTARTHU_ItemCode ;
   private boolean[] T000B4_n182UVID_ATRCONTARTHU_ItemCode ;
   private String[] T000B4_A183UVID_ATRCONTARTHU_ItemName ;
   private boolean[] T000B4_n183UVID_ATRCONTARTHU_ItemName ;
   private String[] T000B4_A184UVID_ATRCONTARTHU_Comment ;
   private boolean[] T000B4_n184UVID_ATRCONTARTHU_Comment ;
   private String[] T000B4_A185UVID_ATRCONTARTHU_ContraMu ;
   private boolean[] T000B4_n185UVID_ATRCONTARTHU_ContraMu ;
   private long[] T000B4_A186UVID_ATRCONTARTHU_CoMuSize ;
   private boolean[] T000B4_n186UVID_ATRCONTARTHU_CoMuSize ;
   private String[] T000B4_A187UVID_ATRCONTARTHU_MuestDes ;
   private boolean[] T000B4_n187UVID_ATRCONTARTHU_MuestDes ;
   private long[] T000B4_A188UVID_ATRCONTARTHU_MuDeSize ;
   private boolean[] T000B4_n188UVID_ATRCONTARTHU_MuDeSize ;
   private int[] T000B5_A162UVID_ATRCONTARTHDocEntry ;
   private int[] T000B3_A162UVID_ATRCONTARTHDocEntry ;
   private int[] T000B3_A163UVID_ATRCONTARTHDocNum ;
   private boolean[] T000B3_n163UVID_ATRCONTARTHDocNum ;
   private int[] T000B3_A164UVID_ATRCONTARTHPeriod ;
   private boolean[] T000B3_n164UVID_ATRCONTARTHPeriod ;
   private short[] T000B3_A165UVID_ATRCONTARTHInstance ;
   private boolean[] T000B3_n165UVID_ATRCONTARTHInstance ;
   private int[] T000B3_A166UVID_ATRCONTARTHSeries ;
   private boolean[] T000B3_n166UVID_ATRCONTARTHSeries ;
   private String[] T000B3_A167UVID_ATRCONTARTHHandwrtten ;
   private boolean[] T000B3_n167UVID_ATRCONTARTHHandwrtten ;
   private String[] T000B3_A168UVID_ATRCONTARTHCanceled ;
   private boolean[] T000B3_n168UVID_ATRCONTARTHCanceled ;
   private String[] T000B3_A169UVID_ATRCONTARTHObject ;
   private boolean[] T000B3_n169UVID_ATRCONTARTHObject ;
   private int[] T000B3_A170UVID_ATRCONTARTHLogInst ;
   private boolean[] T000B3_n170UVID_ATRCONTARTHLogInst ;
   private int[] T000B3_A171UVID_ATRCONTARTHUserSign ;
   private boolean[] T000B3_n171UVID_ATRCONTARTHUserSign ;
   private String[] T000B3_A172UVID_ATRCONTARTHTransfered ;
   private boolean[] T000B3_n172UVID_ATRCONTARTHTransfered ;
   private String[] T000B3_A173UVID_ATRCONTARTHStatus ;
   private boolean[] T000B3_n173UVID_ATRCONTARTHStatus ;
   private java.util.Date[] T000B3_A174UVID_ATRCONTARTHCreateDate ;
   private boolean[] T000B3_n174UVID_ATRCONTARTHCreateDate ;
   private short[] T000B3_A175UVID_ATRCONTARTHCreateTime ;
   private boolean[] T000B3_n175UVID_ATRCONTARTHCreateTime ;
   private java.util.Date[] T000B3_A176UVID_ATRCONTARTHUpdateDate ;
   private boolean[] T000B3_n176UVID_ATRCONTARTHUpdateDate ;
   private short[] T000B3_A177UVID_ATRCONTARTHUpdateTime ;
   private boolean[] T000B3_n177UVID_ATRCONTARTHUpdateTime ;
   private String[] T000B3_A178UVID_ATRCONTARTHDataSource ;
   private boolean[] T000B3_n178UVID_ATRCONTARTHDataSource ;
   private String[] T000B3_A179UVID_ATRCONTARTHRequestStatus ;
   private boolean[] T000B3_n179UVID_ATRCONTARTHRequestStatus ;
   private String[] T000B3_A180UVID_ATRCONTARTHCreator ;
   private boolean[] T000B3_n180UVID_ATRCONTARTHCreator ;
   private String[] T000B3_A181UVID_ATRCONTARTHRemark ;
   private boolean[] T000B3_n181UVID_ATRCONTARTHRemark ;
   private String[] T000B3_A182UVID_ATRCONTARTHU_ItemCode ;
   private boolean[] T000B3_n182UVID_ATRCONTARTHU_ItemCode ;
   private String[] T000B3_A183UVID_ATRCONTARTHU_ItemName ;
   private boolean[] T000B3_n183UVID_ATRCONTARTHU_ItemName ;
   private String[] T000B3_A184UVID_ATRCONTARTHU_Comment ;
   private boolean[] T000B3_n184UVID_ATRCONTARTHU_Comment ;
   private String[] T000B3_A185UVID_ATRCONTARTHU_ContraMu ;
   private boolean[] T000B3_n185UVID_ATRCONTARTHU_ContraMu ;
   private long[] T000B3_A186UVID_ATRCONTARTHU_CoMuSize ;
   private boolean[] T000B3_n186UVID_ATRCONTARTHU_CoMuSize ;
   private String[] T000B3_A187UVID_ATRCONTARTHU_MuestDes ;
   private boolean[] T000B3_n187UVID_ATRCONTARTHU_MuestDes ;
   private long[] T000B3_A188UVID_ATRCONTARTHU_MuDeSize ;
   private boolean[] T000B3_n188UVID_ATRCONTARTHU_MuDeSize ;
   private int[] T000B6_A162UVID_ATRCONTARTHDocEntry ;
   private int[] T000B7_A162UVID_ATRCONTARTHDocEntry ;
   private int[] T000B2_A162UVID_ATRCONTARTHDocEntry ;
   private int[] T000B2_A163UVID_ATRCONTARTHDocNum ;
   private boolean[] T000B2_n163UVID_ATRCONTARTHDocNum ;
   private int[] T000B2_A164UVID_ATRCONTARTHPeriod ;
   private boolean[] T000B2_n164UVID_ATRCONTARTHPeriod ;
   private short[] T000B2_A165UVID_ATRCONTARTHInstance ;
   private boolean[] T000B2_n165UVID_ATRCONTARTHInstance ;
   private int[] T000B2_A166UVID_ATRCONTARTHSeries ;
   private boolean[] T000B2_n166UVID_ATRCONTARTHSeries ;
   private String[] T000B2_A167UVID_ATRCONTARTHHandwrtten ;
   private boolean[] T000B2_n167UVID_ATRCONTARTHHandwrtten ;
   private String[] T000B2_A168UVID_ATRCONTARTHCanceled ;
   private boolean[] T000B2_n168UVID_ATRCONTARTHCanceled ;
   private String[] T000B2_A169UVID_ATRCONTARTHObject ;
   private boolean[] T000B2_n169UVID_ATRCONTARTHObject ;
   private int[] T000B2_A170UVID_ATRCONTARTHLogInst ;
   private boolean[] T000B2_n170UVID_ATRCONTARTHLogInst ;
   private int[] T000B2_A171UVID_ATRCONTARTHUserSign ;
   private boolean[] T000B2_n171UVID_ATRCONTARTHUserSign ;
   private String[] T000B2_A172UVID_ATRCONTARTHTransfered ;
   private boolean[] T000B2_n172UVID_ATRCONTARTHTransfered ;
   private String[] T000B2_A173UVID_ATRCONTARTHStatus ;
   private boolean[] T000B2_n173UVID_ATRCONTARTHStatus ;
   private java.util.Date[] T000B2_A174UVID_ATRCONTARTHCreateDate ;
   private boolean[] T000B2_n174UVID_ATRCONTARTHCreateDate ;
   private short[] T000B2_A175UVID_ATRCONTARTHCreateTime ;
   private boolean[] T000B2_n175UVID_ATRCONTARTHCreateTime ;
   private java.util.Date[] T000B2_A176UVID_ATRCONTARTHUpdateDate ;
   private boolean[] T000B2_n176UVID_ATRCONTARTHUpdateDate ;
   private short[] T000B2_A177UVID_ATRCONTARTHUpdateTime ;
   private boolean[] T000B2_n177UVID_ATRCONTARTHUpdateTime ;
   private String[] T000B2_A178UVID_ATRCONTARTHDataSource ;
   private boolean[] T000B2_n178UVID_ATRCONTARTHDataSource ;
   private String[] T000B2_A179UVID_ATRCONTARTHRequestStatus ;
   private boolean[] T000B2_n179UVID_ATRCONTARTHRequestStatus ;
   private String[] T000B2_A180UVID_ATRCONTARTHCreator ;
   private boolean[] T000B2_n180UVID_ATRCONTARTHCreator ;
   private String[] T000B2_A181UVID_ATRCONTARTHRemark ;
   private boolean[] T000B2_n181UVID_ATRCONTARTHRemark ;
   private String[] T000B2_A182UVID_ATRCONTARTHU_ItemCode ;
   private boolean[] T000B2_n182UVID_ATRCONTARTHU_ItemCode ;
   private String[] T000B2_A183UVID_ATRCONTARTHU_ItemName ;
   private boolean[] T000B2_n183UVID_ATRCONTARTHU_ItemName ;
   private String[] T000B2_A184UVID_ATRCONTARTHU_Comment ;
   private boolean[] T000B2_n184UVID_ATRCONTARTHU_Comment ;
   private String[] T000B2_A185UVID_ATRCONTARTHU_ContraMu ;
   private boolean[] T000B2_n185UVID_ATRCONTARTHU_ContraMu ;
   private long[] T000B2_A186UVID_ATRCONTARTHU_CoMuSize ;
   private boolean[] T000B2_n186UVID_ATRCONTARTHU_CoMuSize ;
   private String[] T000B2_A187UVID_ATRCONTARTHU_MuestDes ;
   private boolean[] T000B2_n187UVID_ATRCONTARTHU_MuestDes ;
   private long[] T000B2_A188UVID_ATRCONTARTHU_MuDeSize ;
   private boolean[] T000B2_n188UVID_ATRCONTARTHU_MuDeSize ;
   private IDataStoreProvider pr_default ;
   private int[] T000B11_A162UVID_ATRCONTARTHDocEntry ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class uvid_atrcontarth__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000B2", "SELECT [DocEntry], [DocNum], [Period], [Instance], [Series], [Handwrtten], [Canceled], [Object], [LogInst], [UserSign], [Transfered], [Status], [CreateDate], [CreateTime], [UpdateDate], [UpdateTime], [DataSource], [RequestStatus], [Creator], [Remark], [U_ItemCode], [U_ItemName], [U_Comment], [U_ContraMu], [U_CoMuSize], [U_MuestDes], [U_MuDeSize] FROM dbo.[@VID_ATRCONTARTH] WITH (UPDLOCK) WHERE [DocEntry] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B3", "SELECT [DocEntry], [DocNum], [Period], [Instance], [Series], [Handwrtten], [Canceled], [Object], [LogInst], [UserSign], [Transfered], [Status], [CreateDate], [CreateTime], [UpdateDate], [UpdateTime], [DataSource], [RequestStatus], [Creator], [Remark], [U_ItemCode], [U_ItemName], [U_Comment], [U_ContraMu], [U_CoMuSize], [U_MuestDes], [U_MuDeSize] FROM dbo.[@VID_ATRCONTARTH] WITH (NOLOCK) WHERE [DocEntry] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B4", "SELECT TM1.[DocEntry], TM1.[DocNum], TM1.[Period], TM1.[Instance], TM1.[Series], TM1.[Handwrtten], TM1.[Canceled], TM1.[Object], TM1.[LogInst], TM1.[UserSign], TM1.[Transfered], TM1.[Status], TM1.[CreateDate], TM1.[CreateTime], TM1.[UpdateDate], TM1.[UpdateTime], TM1.[DataSource], TM1.[RequestStatus], TM1.[Creator], TM1.[Remark], TM1.[U_ItemCode], TM1.[U_ItemName], TM1.[U_Comment], TM1.[U_ContraMu], TM1.[U_CoMuSize], TM1.[U_MuestDes], TM1.[U_MuDeSize] FROM dbo.[@VID_ATRCONTARTH] TM1 WITH (NOLOCK) WHERE TM1.[DocEntry] = ? ORDER BY TM1.[DocEntry]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000B5", "SELECT [DocEntry] FROM dbo.[@VID_ATRCONTARTH] WITH (NOLOCK) WHERE [DocEntry] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B6", "SELECT TOP 1 [DocEntry] FROM dbo.[@VID_ATRCONTARTH] WITH (NOLOCK) WHERE ( [DocEntry] > ?) ORDER BY [DocEntry]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000B7", "SELECT TOP 1 [DocEntry] FROM dbo.[@VID_ATRCONTARTH] WITH (NOLOCK) WHERE ( [DocEntry] < ?) ORDER BY [DocEntry] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000B8", "INSERT INTO dbo.[@VID_ATRCONTARTH]([DocEntry], [DocNum], [Period], [Instance], [Series], [Handwrtten], [Canceled], [Object], [LogInst], [UserSign], [Transfered], [Status], [CreateDate], [CreateTime], [UpdateDate], [UpdateTime], [DataSource], [RequestStatus], [Creator], [Remark], [U_ItemCode], [U_ItemName], [U_Comment], [U_ContraMu], [U_CoMuSize], [U_MuestDes], [U_MuDeSize]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000B9", "UPDATE dbo.[@VID_ATRCONTARTH] SET [DocNum]=?, [Period]=?, [Instance]=?, [Series]=?, [Handwrtten]=?, [Canceled]=?, [Object]=?, [LogInst]=?, [UserSign]=?, [Transfered]=?, [Status]=?, [CreateDate]=?, [CreateTime]=?, [UpdateDate]=?, [UpdateTime]=?, [DataSource]=?, [RequestStatus]=?, [Creator]=?, [Remark]=?, [U_ItemCode]=?, [U_ItemName]=?, [U_Comment]=?, [U_ContraMu]=?, [U_CoMuSize]=?, [U_MuestDes]=?, [U_MuDeSize]=?  WHERE [DocEntry] = ?", GX_NOMASK)
         ,new UpdateCursor("T000B10", "DELETE FROM dbo.[@VID_ATRCONTARTH]  WHERE [DocEntry] = ?", GX_NOMASK)
         ,new ForEachCursor("T000B11", "SELECT [DocEntry] FROM dbo.[@VID_ATRCONTARTH] WITH (NOLOCK) ORDER BY [DocEntry]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 1) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getLongVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 1) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 1) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 1) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getLongVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 1) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 1) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 1) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getLongVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 1) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 1) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[24], false);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[28], false);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 1);
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
                  stmt.setNull( 20 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(20, (String)parms[38]);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 20);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[42], 100);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[44], 254);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 1);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(25, ((Number) parms[48]).longValue(), 0);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 1);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(27, ((Number) parms[52]).longValue(), 0);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 1);
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
                  stmt.setNull( 19 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(19, (String)parms[37]);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 20);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 100);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 254);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(24, ((Number) parms[47]).longValue(), 0);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(26, ((Number) parms[51]).longValue(), 0);
               }
               stmt.setInt(27, ((Number) parms[52]).intValue());
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

final  class uvid_atrcontarth__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

