/*
               File: uvid_controlch_impl
        Description: UVID_CONTROLCH
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:5.38
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

public final  class uvid_controlch_impl extends GXDataArea
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
         Form.getMeta().addItem("description", "UVID_CONTROLCH", (short)(0)) ;
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

   public uvid_controlch_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public uvid_controlch_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( uvid_controlch_impl.class ));
   }

   public uvid_controlch_impl( int remoteHandle ,
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
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "UVID_CONTROLCH", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.wms.gx0050"+"',["+"{Ctrl:gx.dom.el('"+"UVID_CONTROLCHDOCENTRY"+"'), id:'"+"UVID_CONTROLCHDOCENTRY"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCHDocEntry_Internalname, GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtUVID_CONTROLCHDocEntry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCHDocEntry_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_CONTROLCHDocEntry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtDocNum_Internalname, "Doc Num", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtDocNum_Internalname, GXutil.ltrim( localUtil.ntoc( A44DocNum, (byte)(9), (byte)(0), ",", "")), ((edtDocNum_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44DocNum), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A44DocNum), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocNum_Jsonclick, 0, "Attribute", "", "", "", 1, edtDocNum_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPeriod_Internalname, "Period", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPeriod_Internalname, GXutil.ltrim( localUtil.ntoc( A45Period, (byte)(9), (byte)(0), ",", "")), ((edtPeriod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A45Period), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A45Period), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPeriod_Jsonclick, 0, "Attribute", "", "", "", 1, edtPeriod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtInstance_Internalname, "Instance", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtInstance_Internalname, GXutil.ltrim( localUtil.ntoc( A46Instance, (byte)(4), (byte)(0), ",", "")), ((edtInstance_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A46Instance), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A46Instance), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInstance_Jsonclick, 0, "Attribute", "", "", "", 1, edtInstance_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtSeries_Internalname, "Series", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtSeries_Internalname, GXutil.ltrim( localUtil.ntoc( A47Series, (byte)(9), (byte)(0), ",", "")), ((edtSeries_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A47Series), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A47Series), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSeries_Jsonclick, 0, "Attribute", "", "", "", 1, edtSeries_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtHandwrtten_Internalname, "Handwrtten", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtHandwrtten_Internalname, GXutil.rtrim( A48Handwrtten), GXutil.rtrim( localUtil.format( A48Handwrtten, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHandwrtten_Jsonclick, 0, "Attribute", "", "", "", 1, edtHandwrtten_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtCanceled_Internalname, "Canceled", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCanceled_Internalname, GXutil.rtrim( A49Canceled), GXutil.rtrim( localUtil.format( A49Canceled, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCanceled_Jsonclick, 0, "Attribute", "", "", "", 1, edtCanceled_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCHObject_Internalname, "Object", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCHObject_Internalname, A50UVID_CONTROLCHObject, GXutil.rtrim( localUtil.format( A50UVID_CONTROLCHObject, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCHObject_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_CONTROLCHObject_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUVID_CONTROLCHLogInst_Internalname, "Log Inst", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCHLogInst_Internalname, GXutil.ltrim( localUtil.ntoc( A51UVID_CONTROLCHLogInst, (byte)(9), (byte)(0), ",", "")), ((edtUVID_CONTROLCHLogInst_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51UVID_CONTROLCHLogInst), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A51UVID_CONTROLCHLogInst), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCHLogInst_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_CONTROLCHLogInst_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUserSign_Internalname, "User Sign", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUserSign_Internalname, GXutil.ltrim( localUtil.ntoc( A52UserSign, (byte)(9), (byte)(0), ",", "")), ((edtUserSign_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52UserSign), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A52UserSign), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUserSign_Jsonclick, 0, "Attribute", "", "", "", 1, edtUserSign_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtTransfered_Internalname, "Transfered", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtTransfered_Internalname, GXutil.rtrim( A53Transfered), GXutil.rtrim( localUtil.format( A53Transfered, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransfered_Jsonclick, 0, "Attribute", "", "", "", 1, edtTransfered_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtStatus_Internalname, "Status", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtStatus_Internalname, GXutil.rtrim( A54Status), GXutil.rtrim( localUtil.format( A54Status, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStatus_Jsonclick, 0, "Attribute", "", "", "", 1, edtStatus_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtCreateDate_Internalname, "Create Date", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtCreateDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCreateDate_Internalname, localUtil.ttoc( A55CreateDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A55CreateDate, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCreateDate_Jsonclick, 0, "Attribute", "", "", "", 1, edtCreateDate_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtCreateDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCreateDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtCreateTime_Internalname, "Create Time", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCreateTime_Internalname, GXutil.ltrim( localUtil.ntoc( A56CreateTime, (byte)(4), (byte)(0), ",", "")), ((edtCreateTime_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A56CreateTime), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A56CreateTime), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCreateTime_Jsonclick, 0, "Attribute", "", "", "", 1, edtCreateTime_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUpdateDate_Internalname, "Update Date", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtUpdateDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUpdateDate_Internalname, localUtil.ttoc( A57UpdateDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A57UpdateDate, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUpdateDate_Jsonclick, 0, "Attribute", "", "", "", 1, edtUpdateDate_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtUpdateDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtUpdateDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUpdateTime_Internalname, "Update Time", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUpdateTime_Internalname, GXutil.ltrim( localUtil.ntoc( A58UpdateTime, (byte)(4), (byte)(0), ",", "")), ((edtUpdateTime_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A58UpdateTime), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A58UpdateTime), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUpdateTime_Jsonclick, 0, "Attribute", "", "", "", 1, edtUpdateTime_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtDataSource_Internalname, "Data Source", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtDataSource_Internalname, GXutil.rtrim( A59DataSource), GXutil.rtrim( localUtil.format( A59DataSource, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDataSource_Jsonclick, 0, "Attribute", "", "", "", 1, edtDataSource_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtRequestStatus_Internalname, "Request Status", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtRequestStatus_Internalname, GXutil.rtrim( A60RequestStatus), GXutil.rtrim( localUtil.format( A60RequestStatus, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRequestStatus_Jsonclick, 0, "Attribute", "", "", "", 1, edtRequestStatus_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtCreator_Internalname, "Creator", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCreator_Internalname, A61Creator, GXutil.rtrim( localUtil.format( A61Creator, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCreator_Jsonclick, 0, "Attribute", "", "", "", 1, edtCreator_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtRemark_Internalname, "Remark", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtRemark_Internalname, A62Remark, A62Remark, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRemark_Jsonclick, 0, "Attribute", "", "", "", 1, edtRemark_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(0), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_ItemCode_Internalname, A63U_ItemCode, GXutil.rtrim( localUtil.format( A63U_ItemCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_ItemCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_ItemCode_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_ItemName_Internalname, "U_Item Name", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_ItemName_Internalname, A64U_ItemName, GXutil.rtrim( localUtil.format( A64U_ItemName, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_ItemName_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_ItemName_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_WhsCode_Internalname, A65U_WhsCode, GXutil.rtrim( localUtil.format( A65U_WhsCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_WhsCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_WhsCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_WhsDest_Internalname, A66U_WhsDest, GXutil.rtrim( localUtil.format( A66U_WhsDest, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_WhsDest_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_WhsDest_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_NumTras_Internalname, "U_Num Tras", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NumTras_Internalname, A67U_NumTras, GXutil.rtrim( localUtil.format( A67U_NumTras, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NumTras_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_NumTras_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_NumCon_Internalname, "U_Num Con", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NumCon_Internalname, A68U_NumCon, GXutil.rtrim( localUtil.format( A68U_NumCon, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NumCon_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_NumCon_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_NumMusd_Internalname, "U_Num Musd", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NumMusd_Internalname, A69U_NumMusd, GXutil.rtrim( localUtil.format( A69U_NumMusd, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NumMusd_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_NumMusd_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NoLote_Internalname, A70U_NoLote, GXutil.rtrim( localUtil.format( A70U_NoLote, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NoLote_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_NoLote_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CorrLote_Internalname, GXutil.ltrim( localUtil.ntoc( A71U_CorrLote, (byte)(9), (byte)(0), ",", "")), ((edtU_CorrLote_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CorrLote_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CorrLote_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CorrAnal_Internalname, GXutil.ltrim( localUtil.ntoc( A72U_CorrAnal, (byte)(9), (byte)(0), ",", "")), ((edtU_CorrAnal_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CorrAnal_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CorrAnal_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Cantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A73U_Cantidad, (byte)(18), (byte)(0), ",", "")), ((edtU_Cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Cantidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Cantidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Bultos_Internalname, GXutil.ltrim( localUtil.ntoc( A74U_Bultos, (byte)(9), (byte)(0), ",", "")), ((edtU_Bultos_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Bultos_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Bultos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_BultosMu_Internalname, GXutil.ltrim( localUtil.ntoc( A75U_BultosMu, (byte)(9), (byte)(0), ",", "")), ((edtU_BultosMu_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_BultosMu_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_BultosMu_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtU_FecIngr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecIngr_Internalname, localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A76U_FecIngr, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecIngr_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_FecIngr_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecIngr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecIngr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecUltIn_Internalname, "U_Fec Ult In", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtU_FecUltIn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecUltIn_Internalname, localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A77U_FecUltIn, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecUltIn_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_FecUltIn_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecUltIn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecUltIn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_UM_Internalname, A78U_UM, GXutil.rtrim( localUtil.format( A78U_UM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,173);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_UM_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_UM_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NoDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ",", "")), ((edtU_NoDoc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,177);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NoDoc_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_NoDoc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtU_FecContr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecContr_Internalname, localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A80U_FecContr, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecContr_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_FecContr_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecContr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecContr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_FecIni_Internalname, "U_Fec Ini", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtU_FecIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecIni_Internalname, localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A81U_FecIni, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecIni_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_FecIni_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtU_FecFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_FecFin_Internalname, localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A82U_FecFin, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_FecFin_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_FecFin_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtU_FecFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtU_FecFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_Usuario_Internalname, "U_Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Usuario_Internalname, A83U_Usuario, GXutil.rtrim( localUtil.format( A83U_Usuario, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,193);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Usuario_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Usuario_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_DocOrig_Internalname, "U_Doc Orig", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_DocOrig_Internalname, GXutil.ltrim( localUtil.ntoc( A84U_DocOrig, (byte)(9), (byte)(0), ",", "")), ((edtU_DocOrig_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A84U_DocOrig), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A84U_DocOrig), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,197);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_DocOrig_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_DocOrig_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUVID_CONTROLCHU_Estado_Internalname, GXutil.rtrim( A85UVID_CONTROLCHU_Estado), GXutil.rtrim( localUtil.format( A85UVID_CONTROLCHU_Estado, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUVID_CONTROLCHU_Estado_Jsonclick, 0, "Attribute", "", "", "", 1, edtUVID_CONTROLCHU_Estado_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Traslado_Internalname, GXutil.rtrim( A86U_Traslado), GXutil.rtrim( localUtil.format( A86U_Traslado, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,205);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Traslado_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Traslado_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_TipResul_Internalname, A87U_TipResul, GXutil.rtrim( localUtil.format( A87U_TipResul, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_TipResul_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_TipResul_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_ContraMu_Internalname, "U_Contra Mu", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_ContraMu_Internalname, GXutil.rtrim( A88U_ContraMu), GXutil.rtrim( localUtil.format( A88U_ContraMu, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,213);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_ContraMu_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_ContraMu_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CoMuSize_Internalname, "U_Co Mu Size", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 217,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CoMuSize_Internalname, GXutil.ltrim( localUtil.ntoc( A89U_CoMuSize, (byte)(18), (byte)(0), ",", "")), ((edtU_CoMuSize_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A89U_CoMuSize), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A89U_CoMuSize), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,217);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CoMuSize_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CoMuSize_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_MuestDes_Internalname, "U_Muest Des", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_MuestDes_Internalname, GXutil.rtrim( A90U_MuestDes), GXutil.rtrim( localUtil.format( A90U_MuestDes, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_MuestDes_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_MuestDes_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_MuDeSize_Internalname, "U_Mu De Size", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_MuDeSize_Internalname, GXutil.ltrim( localUtil.ntoc( A91U_MuDeSize, (byte)(18), (byte)(0), ",", "")), ((edtU_MuDeSize_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A91U_MuDeSize), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A91U_MuDeSize), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,225);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_MuDeSize_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_MuDeSize_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_CtaCalid_Internalname, "U_Cta Calid", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CtaCalid_Internalname, A92U_CtaCalid, GXutil.rtrim( localUtil.format( A92U_CtaCalid, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CtaCalid_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CtaCalid_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 233,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_CCCode_Internalname, A93U_CCCode, GXutil.rtrim( localUtil.format( A93U_CCCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,233);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_CCCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_CCCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 237,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_PrjCode_Internalname, A94U_PrjCode, GXutil.rtrim( localUtil.format( A94U_PrjCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,237);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_PrjCode_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_PrjCode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtUVID_CONTROLCHU_Comment_Internalname, A95UVID_CONTROLCHU_Comment, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", (short)(0), 1, edtUVID_CONTROLCHU_Comment_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_AtrQ1_Internalname, "U_Atr Q1", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 245,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_AtrQ1_Internalname, GXutil.ltrim( localUtil.ntoc( A96U_AtrQ1, (byte)(18), (byte)(0), ",", "")), ((edtU_AtrQ1_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A96U_AtrQ1), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A96U_AtrQ1), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,245);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_AtrQ1_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_AtrQ1_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_AtrQ2_Internalname, "U_Atr Q2", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_AtrQ2_Internalname, GXutil.ltrim( localUtil.ntoc( A97U_AtrQ2, (byte)(18), (byte)(0), ",", "")), ((edtU_AtrQ2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A97U_AtrQ2), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A97U_AtrQ2), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_AtrQ2_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_AtrQ2_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_AtrQ3_Internalname, "U_Atr Q3", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 253,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_AtrQ3_Internalname, GXutil.ltrim( localUtil.ntoc( A98U_AtrQ3, (byte)(18), (byte)(0), ",", "")), ((edtU_AtrQ3_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A98U_AtrQ3), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A98U_AtrQ3), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,253);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_AtrQ3_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_AtrQ3_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_AtrQ4_Internalname, "U_Atr Q4", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 257,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_AtrQ4_Internalname, GXutil.ltrim( localUtil.ntoc( A99U_AtrQ4, (byte)(18), (byte)(0), ",", "")), ((edtU_AtrQ4_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A99U_AtrQ4), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A99U_AtrQ4), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,257);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_AtrQ4_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_AtrQ4_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_AtrT1_Internalname, "U_Atr T1", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtU_AtrT1_Internalname, A100U_AtrT1, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"", (short)(0), 1, edtU_AtrT1_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_AtrT2_Internalname, "U_Atr T2", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 265,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtU_AtrT2_Internalname, A101U_AtrT2, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,265);\"", (short)(0), 1, edtU_AtrT2_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_AtrT3_Internalname, "U_Atr T3", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtU_AtrT3_Internalname, A102U_AtrT3, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,269);\"", (short)(0), 1, edtU_AtrT3_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_AtrT4_Internalname, "U_Atr T4", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 273,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_html_textarea( httpContext, edtU_AtrT4_Internalname, A103U_AtrT4, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,273);\"", (short)(0), 1, edtU_AtrT4_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 277,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_Reanalis_Internalname, GXutil.rtrim( A104U_Reanalis), GXutil.rtrim( localUtil.format( A104U_Reanalis, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,277);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_Reanalis_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_Reanalis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_UVID_CONTROLCH.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtU_NroOF_Internalname, "U_Nro OF", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtU_NroOF_Internalname, GXutil.ltrim( localUtil.ntoc( A105U_NroOF, (byte)(9), (byte)(0), ",", "")), ((edtU_NroOF_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A105U_NroOF), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A105U_NroOF), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtU_NroOF_Jsonclick, 0, "Attribute", "", "", "", 1, edtU_NroOF_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_UVID_CONTROLCH.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 288,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_CONTROLCH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 290,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_UVID_CONTROLCH.htm");
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDocNum_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDocNum_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DOCNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDocNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44DocNum = 0 ;
               n44DocNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44DocNum", GXutil.ltrim( GXutil.str( A44DocNum, 9, 0)));
            }
            else
            {
               A44DocNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDocNum_Internalname), ",", ".")) ;
               n44DocNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44DocNum", GXutil.ltrim( GXutil.str( A44DocNum, 9, 0)));
            }
            n44DocNum = ((0==A44DocNum) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPeriod_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPeriod_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PERIOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPeriod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A45Period = 0 ;
               n45Period = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A45Period", GXutil.ltrim( GXutil.str( A45Period, 9, 0)));
            }
            else
            {
               A45Period = (int)(localUtil.ctol( httpContext.cgiGet( edtPeriod_Internalname), ",", ".")) ;
               n45Period = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A45Period", GXutil.ltrim( GXutil.str( A45Period, 9, 0)));
            }
            n45Period = ((0==A45Period) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInstance_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInstance_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INSTANCE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtInstance_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A46Instance = (short)(0) ;
               n46Instance = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A46Instance", GXutil.ltrim( GXutil.str( A46Instance, 4, 0)));
            }
            else
            {
               A46Instance = (short)(localUtil.ctol( httpContext.cgiGet( edtInstance_Internalname), ",", ".")) ;
               n46Instance = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A46Instance", GXutil.ltrim( GXutil.str( A46Instance, 4, 0)));
            }
            n46Instance = ((0==A46Instance) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSeries_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSeries_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SERIES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSeries_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A47Series = 0 ;
               n47Series = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A47Series", GXutil.ltrim( GXutil.str( A47Series, 9, 0)));
            }
            else
            {
               A47Series = (int)(localUtil.ctol( httpContext.cgiGet( edtSeries_Internalname), ",", ".")) ;
               n47Series = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A47Series", GXutil.ltrim( GXutil.str( A47Series, 9, 0)));
            }
            n47Series = ((0==A47Series) ? true : false) ;
            A48Handwrtten = httpContext.cgiGet( edtHandwrtten_Internalname) ;
            n48Handwrtten = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A48Handwrtten", A48Handwrtten);
            n48Handwrtten = ((GXutil.strcmp("", A48Handwrtten)==0) ? true : false) ;
            A49Canceled = httpContext.cgiGet( edtCanceled_Internalname) ;
            n49Canceled = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A49Canceled", A49Canceled);
            n49Canceled = ((GXutil.strcmp("", A49Canceled)==0) ? true : false) ;
            A50UVID_CONTROLCHObject = httpContext.cgiGet( edtUVID_CONTROLCHObject_Internalname) ;
            n50UVID_CONTROLCHObject = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A50UVID_CONTROLCHObject", A50UVID_CONTROLCHObject);
            n50UVID_CONTROLCHObject = ((GXutil.strcmp("", A50UVID_CONTROLCHObject)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCHLogInst_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCHLogInst_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UVID_CONTROLCHLOGINST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUVID_CONTROLCHLogInst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A51UVID_CONTROLCHLogInst = 0 ;
               n51UVID_CONTROLCHLogInst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A51UVID_CONTROLCHLogInst", GXutil.ltrim( GXutil.str( A51UVID_CONTROLCHLogInst, 9, 0)));
            }
            else
            {
               A51UVID_CONTROLCHLogInst = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCHLogInst_Internalname), ",", ".")) ;
               n51UVID_CONTROLCHLogInst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A51UVID_CONTROLCHLogInst", GXutil.ltrim( GXutil.str( A51UVID_CONTROLCHLogInst, 9, 0)));
            }
            n51UVID_CONTROLCHLogInst = ((0==A51UVID_CONTROLCHLogInst) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUserSign_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUserSign_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "USERSIGN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUserSign_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A52UserSign = 0 ;
               n52UserSign = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A52UserSign", GXutil.ltrim( GXutil.str( A52UserSign, 9, 0)));
            }
            else
            {
               A52UserSign = (int)(localUtil.ctol( httpContext.cgiGet( edtUserSign_Internalname), ",", ".")) ;
               n52UserSign = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A52UserSign", GXutil.ltrim( GXutil.str( A52UserSign, 9, 0)));
            }
            n52UserSign = ((0==A52UserSign) ? true : false) ;
            A53Transfered = httpContext.cgiGet( edtTransfered_Internalname) ;
            n53Transfered = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A53Transfered", A53Transfered);
            n53Transfered = ((GXutil.strcmp("", A53Transfered)==0) ? true : false) ;
            A54Status = httpContext.cgiGet( edtStatus_Internalname) ;
            n54Status = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A54Status", A54Status);
            n54Status = ((GXutil.strcmp("", A54Status)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtCreateDate_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CREATEDATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCreateDate_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A55CreateDate = GXutil.resetTime( GXutil.nullDate() );
               n55CreateDate = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A55CreateDate", localUtil.ttoc( A55CreateDate, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A55CreateDate = localUtil.ctot( httpContext.cgiGet( edtCreateDate_Internalname)) ;
               n55CreateDate = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A55CreateDate", localUtil.ttoc( A55CreateDate, 10, 8, 0, 3, "/", ":", " "));
            }
            n55CreateDate = (GXutil.dateCompare(GXutil.nullDate(), A55CreateDate) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCreateTime_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCreateTime_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CREATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCreateTime_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A56CreateTime = (short)(0) ;
               n56CreateTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A56CreateTime", GXutil.ltrim( GXutil.str( A56CreateTime, 4, 0)));
            }
            else
            {
               A56CreateTime = (short)(localUtil.ctol( httpContext.cgiGet( edtCreateTime_Internalname), ",", ".")) ;
               n56CreateTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A56CreateTime", GXutil.ltrim( GXutil.str( A56CreateTime, 4, 0)));
            }
            n56CreateTime = ((0==A56CreateTime) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtUpdateDate_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "UPDATEDATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUpdateDate_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A57UpdateDate = GXutil.resetTime( GXutil.nullDate() );
               n57UpdateDate = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A57UpdateDate", localUtil.ttoc( A57UpdateDate, 10, 8, 0, 3, "/", ":", " "));
            }
            else
            {
               A57UpdateDate = localUtil.ctot( httpContext.cgiGet( edtUpdateDate_Internalname)) ;
               n57UpdateDate = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A57UpdateDate", localUtil.ttoc( A57UpdateDate, 10, 8, 0, 3, "/", ":", " "));
            }
            n57UpdateDate = (GXutil.dateCompare(GXutil.nullDate(), A57UpdateDate) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUpdateTime_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUpdateTime_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UPDATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUpdateTime_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A58UpdateTime = (short)(0) ;
               n58UpdateTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A58UpdateTime", GXutil.ltrim( GXutil.str( A58UpdateTime, 4, 0)));
            }
            else
            {
               A58UpdateTime = (short)(localUtil.ctol( httpContext.cgiGet( edtUpdateTime_Internalname), ",", ".")) ;
               n58UpdateTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A58UpdateTime", GXutil.ltrim( GXutil.str( A58UpdateTime, 4, 0)));
            }
            n58UpdateTime = ((0==A58UpdateTime) ? true : false) ;
            A59DataSource = httpContext.cgiGet( edtDataSource_Internalname) ;
            n59DataSource = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A59DataSource", A59DataSource);
            n59DataSource = ((GXutil.strcmp("", A59DataSource)==0) ? true : false) ;
            A60RequestStatus = httpContext.cgiGet( edtRequestStatus_Internalname) ;
            n60RequestStatus = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A60RequestStatus", A60RequestStatus);
            n60RequestStatus = ((GXutil.strcmp("", A60RequestStatus)==0) ? true : false) ;
            A61Creator = httpContext.cgiGet( edtCreator_Internalname) ;
            n61Creator = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A61Creator", A61Creator);
            n61Creator = ((GXutil.strcmp("", A61Creator)==0) ? true : false) ;
            A62Remark = httpContext.cgiGet( edtRemark_Internalname) ;
            n62Remark = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A62Remark", A62Remark);
            n62Remark = ((GXutil.strcmp("", A62Remark)==0) ? true : false) ;
            A63U_ItemCode = httpContext.cgiGet( edtU_ItemCode_Internalname) ;
            n63U_ItemCode = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A63U_ItemCode", A63U_ItemCode);
            n63U_ItemCode = ((GXutil.strcmp("", A63U_ItemCode)==0) ? true : false) ;
            A64U_ItemName = httpContext.cgiGet( edtU_ItemName_Internalname) ;
            n64U_ItemName = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A64U_ItemName", A64U_ItemName);
            n64U_ItemName = ((GXutil.strcmp("", A64U_ItemName)==0) ? true : false) ;
            A65U_WhsCode = httpContext.cgiGet( edtU_WhsCode_Internalname) ;
            n65U_WhsCode = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65U_WhsCode", A65U_WhsCode);
            n65U_WhsCode = ((GXutil.strcmp("", A65U_WhsCode)==0) ? true : false) ;
            A66U_WhsDest = httpContext.cgiGet( edtU_WhsDest_Internalname) ;
            n66U_WhsDest = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A66U_WhsDest", A66U_WhsDest);
            n66U_WhsDest = ((GXutil.strcmp("", A66U_WhsDest)==0) ? true : false) ;
            A67U_NumTras = httpContext.cgiGet( edtU_NumTras_Internalname) ;
            n67U_NumTras = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A67U_NumTras", A67U_NumTras);
            n67U_NumTras = ((GXutil.strcmp("", A67U_NumTras)==0) ? true : false) ;
            A68U_NumCon = httpContext.cgiGet( edtU_NumCon_Internalname) ;
            n68U_NumCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A68U_NumCon", A68U_NumCon);
            n68U_NumCon = ((GXutil.strcmp("", A68U_NumCon)==0) ? true : false) ;
            A69U_NumMusd = httpContext.cgiGet( edtU_NumMusd_Internalname) ;
            n69U_NumMusd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69U_NumMusd", A69U_NumMusd);
            n69U_NumMusd = ((GXutil.strcmp("", A69U_NumMusd)==0) ? true : false) ;
            A70U_NoLote = httpContext.cgiGet( edtU_NoLote_Internalname) ;
            n70U_NoLote = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A70U_NoLote", A70U_NoLote);
            n70U_NoLote = ((GXutil.strcmp("", A70U_NoLote)==0) ? true : false) ;
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
            A78U_UM = httpContext.cgiGet( edtU_UM_Internalname) ;
            n78U_UM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A78U_UM", A78U_UM);
            n78U_UM = ((GXutil.strcmp("", A78U_UM)==0) ? true : false) ;
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
            A83U_Usuario = httpContext.cgiGet( edtU_Usuario_Internalname) ;
            n83U_Usuario = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A83U_Usuario", A83U_Usuario);
            n83U_Usuario = ((GXutil.strcmp("", A83U_Usuario)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_DocOrig_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_DocOrig_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_DOCORIG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_DocOrig_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A84U_DocOrig = 0 ;
               n84U_DocOrig = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A84U_DocOrig", GXutil.ltrim( GXutil.str( A84U_DocOrig, 9, 0)));
            }
            else
            {
               A84U_DocOrig = (int)(localUtil.ctol( httpContext.cgiGet( edtU_DocOrig_Internalname), ",", ".")) ;
               n84U_DocOrig = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A84U_DocOrig", GXutil.ltrim( GXutil.str( A84U_DocOrig, 9, 0)));
            }
            n84U_DocOrig = ((0==A84U_DocOrig) ? true : false) ;
            A85UVID_CONTROLCHU_Estado = httpContext.cgiGet( edtUVID_CONTROLCHU_Estado_Internalname) ;
            n85UVID_CONTROLCHU_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A85UVID_CONTROLCHU_Estado", A85UVID_CONTROLCHU_Estado);
            n85UVID_CONTROLCHU_Estado = ((GXutil.strcmp("", A85UVID_CONTROLCHU_Estado)==0) ? true : false) ;
            A86U_Traslado = httpContext.cgiGet( edtU_Traslado_Internalname) ;
            n86U_Traslado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A86U_Traslado", A86U_Traslado);
            n86U_Traslado = ((GXutil.strcmp("", A86U_Traslado)==0) ? true : false) ;
            A87U_TipResul = httpContext.cgiGet( edtU_TipResul_Internalname) ;
            n87U_TipResul = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A87U_TipResul", A87U_TipResul);
            n87U_TipResul = ((GXutil.strcmp("", A87U_TipResul)==0) ? true : false) ;
            A88U_ContraMu = httpContext.cgiGet( edtU_ContraMu_Internalname) ;
            n88U_ContraMu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A88U_ContraMu", A88U_ContraMu);
            n88U_ContraMu = ((GXutil.strcmp("", A88U_ContraMu)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_CoMuSize_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_CoMuSize_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_COMUSIZE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_CoMuSize_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A89U_CoMuSize = 0 ;
               n89U_CoMuSize = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A89U_CoMuSize", GXutil.ltrim( GXutil.str( A89U_CoMuSize, 18, 0)));
            }
            else
            {
               A89U_CoMuSize = localUtil.ctol( httpContext.cgiGet( edtU_CoMuSize_Internalname), ",", ".") ;
               n89U_CoMuSize = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A89U_CoMuSize", GXutil.ltrim( GXutil.str( A89U_CoMuSize, 18, 0)));
            }
            n89U_CoMuSize = ((0==A89U_CoMuSize) ? true : false) ;
            A90U_MuestDes = httpContext.cgiGet( edtU_MuestDes_Internalname) ;
            n90U_MuestDes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A90U_MuestDes", A90U_MuestDes);
            n90U_MuestDes = ((GXutil.strcmp("", A90U_MuestDes)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_MuDeSize_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_MuDeSize_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_MUDESIZE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_MuDeSize_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A91U_MuDeSize = 0 ;
               n91U_MuDeSize = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A91U_MuDeSize", GXutil.ltrim( GXutil.str( A91U_MuDeSize, 18, 0)));
            }
            else
            {
               A91U_MuDeSize = localUtil.ctol( httpContext.cgiGet( edtU_MuDeSize_Internalname), ",", ".") ;
               n91U_MuDeSize = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A91U_MuDeSize", GXutil.ltrim( GXutil.str( A91U_MuDeSize, 18, 0)));
            }
            n91U_MuDeSize = ((0==A91U_MuDeSize) ? true : false) ;
            A92U_CtaCalid = httpContext.cgiGet( edtU_CtaCalid_Internalname) ;
            n92U_CtaCalid = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A92U_CtaCalid", A92U_CtaCalid);
            n92U_CtaCalid = ((GXutil.strcmp("", A92U_CtaCalid)==0) ? true : false) ;
            A93U_CCCode = httpContext.cgiGet( edtU_CCCode_Internalname) ;
            n93U_CCCode = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A93U_CCCode", A93U_CCCode);
            n93U_CCCode = ((GXutil.strcmp("", A93U_CCCode)==0) ? true : false) ;
            A94U_PrjCode = httpContext.cgiGet( edtU_PrjCode_Internalname) ;
            n94U_PrjCode = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A94U_PrjCode", A94U_PrjCode);
            n94U_PrjCode = ((GXutil.strcmp("", A94U_PrjCode)==0) ? true : false) ;
            A95UVID_CONTROLCHU_Comment = httpContext.cgiGet( edtUVID_CONTROLCHU_Comment_Internalname) ;
            n95UVID_CONTROLCHU_Comment = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A95UVID_CONTROLCHU_Comment", A95UVID_CONTROLCHU_Comment);
            n95UVID_CONTROLCHU_Comment = ((GXutil.strcmp("", A95UVID_CONTROLCHU_Comment)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_AtrQ1_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_AtrQ1_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_ATRQ1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_AtrQ1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A96U_AtrQ1 = 0 ;
               n96U_AtrQ1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A96U_AtrQ1", GXutil.ltrim( GXutil.str( A96U_AtrQ1, 18, 0)));
            }
            else
            {
               A96U_AtrQ1 = localUtil.ctol( httpContext.cgiGet( edtU_AtrQ1_Internalname), ",", ".") ;
               n96U_AtrQ1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A96U_AtrQ1", GXutil.ltrim( GXutil.str( A96U_AtrQ1, 18, 0)));
            }
            n96U_AtrQ1 = ((0==A96U_AtrQ1) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_AtrQ2_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_AtrQ2_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_ATRQ2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_AtrQ2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A97U_AtrQ2 = 0 ;
               n97U_AtrQ2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A97U_AtrQ2", GXutil.ltrim( GXutil.str( A97U_AtrQ2, 18, 0)));
            }
            else
            {
               A97U_AtrQ2 = localUtil.ctol( httpContext.cgiGet( edtU_AtrQ2_Internalname), ",", ".") ;
               n97U_AtrQ2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A97U_AtrQ2", GXutil.ltrim( GXutil.str( A97U_AtrQ2, 18, 0)));
            }
            n97U_AtrQ2 = ((0==A97U_AtrQ2) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_AtrQ3_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_AtrQ3_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_ATRQ3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_AtrQ3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A98U_AtrQ3 = 0 ;
               n98U_AtrQ3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A98U_AtrQ3", GXutil.ltrim( GXutil.str( A98U_AtrQ3, 18, 0)));
            }
            else
            {
               A98U_AtrQ3 = localUtil.ctol( httpContext.cgiGet( edtU_AtrQ3_Internalname), ",", ".") ;
               n98U_AtrQ3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A98U_AtrQ3", GXutil.ltrim( GXutil.str( A98U_AtrQ3, 18, 0)));
            }
            n98U_AtrQ3 = ((0==A98U_AtrQ3) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_AtrQ4_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_AtrQ4_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_ATRQ4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_AtrQ4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A99U_AtrQ4 = 0 ;
               n99U_AtrQ4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A99U_AtrQ4", GXutil.ltrim( GXutil.str( A99U_AtrQ4, 18, 0)));
            }
            else
            {
               A99U_AtrQ4 = localUtil.ctol( httpContext.cgiGet( edtU_AtrQ4_Internalname), ",", ".") ;
               n99U_AtrQ4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A99U_AtrQ4", GXutil.ltrim( GXutil.str( A99U_AtrQ4, 18, 0)));
            }
            n99U_AtrQ4 = ((0==A99U_AtrQ4) ? true : false) ;
            A100U_AtrT1 = httpContext.cgiGet( edtU_AtrT1_Internalname) ;
            n100U_AtrT1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A100U_AtrT1", A100U_AtrT1);
            n100U_AtrT1 = ((GXutil.strcmp("", A100U_AtrT1)==0) ? true : false) ;
            A101U_AtrT2 = httpContext.cgiGet( edtU_AtrT2_Internalname) ;
            n101U_AtrT2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A101U_AtrT2", A101U_AtrT2);
            n101U_AtrT2 = ((GXutil.strcmp("", A101U_AtrT2)==0) ? true : false) ;
            A102U_AtrT3 = httpContext.cgiGet( edtU_AtrT3_Internalname) ;
            n102U_AtrT3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A102U_AtrT3", A102U_AtrT3);
            n102U_AtrT3 = ((GXutil.strcmp("", A102U_AtrT3)==0) ? true : false) ;
            A103U_AtrT4 = httpContext.cgiGet( edtU_AtrT4_Internalname) ;
            n103U_AtrT4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A103U_AtrT4", A103U_AtrT4);
            n103U_AtrT4 = ((GXutil.strcmp("", A103U_AtrT4)==0) ? true : false) ;
            A104U_Reanalis = httpContext.cgiGet( edtU_Reanalis_Internalname) ;
            n104U_Reanalis = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A104U_Reanalis", A104U_Reanalis);
            n104U_Reanalis = ((GXutil.strcmp("", A104U_Reanalis)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtU_NroOF_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtU_NroOF_Internalname), ",", ".") > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "U_NROOF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtU_NroOF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A105U_NroOF = 0 ;
               n105U_NroOF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A105U_NroOF", GXutil.ltrim( GXutil.str( A105U_NroOF, 9, 0)));
            }
            else
            {
               A105U_NroOF = (int)(localUtil.ctol( httpContext.cgiGet( edtU_NroOF_Internalname), ",", ".")) ;
               n105U_NroOF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A105U_NroOF", GXutil.ltrim( GXutil.str( A105U_NroOF, 9, 0)));
            }
            n105U_NroOF = ((0==A105U_NroOF) ? true : false) ;
            /* Read saved values. */
            Z43UVID_CONTROLCHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( "Z43UVID_CONTROLCHDocEntry"), ",", ".")) ;
            Z44DocNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z44DocNum"), ",", ".")) ;
            n44DocNum = ((0==A44DocNum) ? true : false) ;
            Z45Period = (int)(localUtil.ctol( httpContext.cgiGet( "Z45Period"), ",", ".")) ;
            n45Period = ((0==A45Period) ? true : false) ;
            Z46Instance = (short)(localUtil.ctol( httpContext.cgiGet( "Z46Instance"), ",", ".")) ;
            n46Instance = ((0==A46Instance) ? true : false) ;
            Z47Series = (int)(localUtil.ctol( httpContext.cgiGet( "Z47Series"), ",", ".")) ;
            n47Series = ((0==A47Series) ? true : false) ;
            Z48Handwrtten = httpContext.cgiGet( "Z48Handwrtten") ;
            n48Handwrtten = ((GXutil.strcmp("", A48Handwrtten)==0) ? true : false) ;
            Z49Canceled = httpContext.cgiGet( "Z49Canceled") ;
            n49Canceled = ((GXutil.strcmp("", A49Canceled)==0) ? true : false) ;
            Z50UVID_CONTROLCHObject = httpContext.cgiGet( "Z50UVID_CONTROLCHObject") ;
            n50UVID_CONTROLCHObject = ((GXutil.strcmp("", A50UVID_CONTROLCHObject)==0) ? true : false) ;
            Z51UVID_CONTROLCHLogInst = (int)(localUtil.ctol( httpContext.cgiGet( "Z51UVID_CONTROLCHLogInst"), ",", ".")) ;
            n51UVID_CONTROLCHLogInst = ((0==A51UVID_CONTROLCHLogInst) ? true : false) ;
            Z52UserSign = (int)(localUtil.ctol( httpContext.cgiGet( "Z52UserSign"), ",", ".")) ;
            n52UserSign = ((0==A52UserSign) ? true : false) ;
            Z53Transfered = httpContext.cgiGet( "Z53Transfered") ;
            n53Transfered = ((GXutil.strcmp("", A53Transfered)==0) ? true : false) ;
            Z54Status = httpContext.cgiGet( "Z54Status") ;
            n54Status = ((GXutil.strcmp("", A54Status)==0) ? true : false) ;
            Z55CreateDate = localUtil.ctot( httpContext.cgiGet( "Z55CreateDate"), 0) ;
            n55CreateDate = (GXutil.dateCompare(GXutil.nullDate(), A55CreateDate) ? true : false) ;
            Z56CreateTime = (short)(localUtil.ctol( httpContext.cgiGet( "Z56CreateTime"), ",", ".")) ;
            n56CreateTime = ((0==A56CreateTime) ? true : false) ;
            Z57UpdateDate = localUtil.ctot( httpContext.cgiGet( "Z57UpdateDate"), 0) ;
            n57UpdateDate = (GXutil.dateCompare(GXutil.nullDate(), A57UpdateDate) ? true : false) ;
            Z58UpdateTime = (short)(localUtil.ctol( httpContext.cgiGet( "Z58UpdateTime"), ",", ".")) ;
            n58UpdateTime = ((0==A58UpdateTime) ? true : false) ;
            Z59DataSource = httpContext.cgiGet( "Z59DataSource") ;
            n59DataSource = ((GXutil.strcmp("", A59DataSource)==0) ? true : false) ;
            Z60RequestStatus = httpContext.cgiGet( "Z60RequestStatus") ;
            n60RequestStatus = ((GXutil.strcmp("", A60RequestStatus)==0) ? true : false) ;
            Z61Creator = httpContext.cgiGet( "Z61Creator") ;
            n61Creator = ((GXutil.strcmp("", A61Creator)==0) ? true : false) ;
            Z63U_ItemCode = httpContext.cgiGet( "Z63U_ItemCode") ;
            n63U_ItemCode = ((GXutil.strcmp("", A63U_ItemCode)==0) ? true : false) ;
            Z64U_ItemName = httpContext.cgiGet( "Z64U_ItemName") ;
            n64U_ItemName = ((GXutil.strcmp("", A64U_ItemName)==0) ? true : false) ;
            Z65U_WhsCode = httpContext.cgiGet( "Z65U_WhsCode") ;
            n65U_WhsCode = ((GXutil.strcmp("", A65U_WhsCode)==0) ? true : false) ;
            Z66U_WhsDest = httpContext.cgiGet( "Z66U_WhsDest") ;
            n66U_WhsDest = ((GXutil.strcmp("", A66U_WhsDest)==0) ? true : false) ;
            Z67U_NumTras = httpContext.cgiGet( "Z67U_NumTras") ;
            n67U_NumTras = ((GXutil.strcmp("", A67U_NumTras)==0) ? true : false) ;
            Z68U_NumCon = httpContext.cgiGet( "Z68U_NumCon") ;
            n68U_NumCon = ((GXutil.strcmp("", A68U_NumCon)==0) ? true : false) ;
            Z69U_NumMusd = httpContext.cgiGet( "Z69U_NumMusd") ;
            n69U_NumMusd = ((GXutil.strcmp("", A69U_NumMusd)==0) ? true : false) ;
            Z70U_NoLote = httpContext.cgiGet( "Z70U_NoLote") ;
            n70U_NoLote = ((GXutil.strcmp("", A70U_NoLote)==0) ? true : false) ;
            Z71U_CorrLote = (int)(localUtil.ctol( httpContext.cgiGet( "Z71U_CorrLote"), ",", ".")) ;
            n71U_CorrLote = ((0==A71U_CorrLote) ? true : false) ;
            Z72U_CorrAnal = (int)(localUtil.ctol( httpContext.cgiGet( "Z72U_CorrAnal"), ",", ".")) ;
            n72U_CorrAnal = ((0==A72U_CorrAnal) ? true : false) ;
            Z73U_Cantidad = localUtil.ctol( httpContext.cgiGet( "Z73U_Cantidad"), ",", ".") ;
            n73U_Cantidad = ((0==A73U_Cantidad) ? true : false) ;
            Z74U_Bultos = (int)(localUtil.ctol( httpContext.cgiGet( "Z74U_Bultos"), ",", ".")) ;
            n74U_Bultos = ((0==A74U_Bultos) ? true : false) ;
            Z75U_BultosMu = (int)(localUtil.ctol( httpContext.cgiGet( "Z75U_BultosMu"), ",", ".")) ;
            n75U_BultosMu = ((0==A75U_BultosMu) ? true : false) ;
            Z76U_FecIngr = localUtil.ctot( httpContext.cgiGet( "Z76U_FecIngr"), 0) ;
            n76U_FecIngr = (GXutil.dateCompare(GXutil.nullDate(), A76U_FecIngr) ? true : false) ;
            Z77U_FecUltIn = localUtil.ctot( httpContext.cgiGet( "Z77U_FecUltIn"), 0) ;
            n77U_FecUltIn = (GXutil.dateCompare(GXutil.nullDate(), A77U_FecUltIn) ? true : false) ;
            Z78U_UM = httpContext.cgiGet( "Z78U_UM") ;
            n78U_UM = ((GXutil.strcmp("", A78U_UM)==0) ? true : false) ;
            Z79U_NoDoc = (int)(localUtil.ctol( httpContext.cgiGet( "Z79U_NoDoc"), ",", ".")) ;
            n79U_NoDoc = ((0==A79U_NoDoc) ? true : false) ;
            Z80U_FecContr = localUtil.ctot( httpContext.cgiGet( "Z80U_FecContr"), 0) ;
            n80U_FecContr = (GXutil.dateCompare(GXutil.nullDate(), A80U_FecContr) ? true : false) ;
            Z81U_FecIni = localUtil.ctot( httpContext.cgiGet( "Z81U_FecIni"), 0) ;
            n81U_FecIni = (GXutil.dateCompare(GXutil.nullDate(), A81U_FecIni) ? true : false) ;
            Z82U_FecFin = localUtil.ctot( httpContext.cgiGet( "Z82U_FecFin"), 0) ;
            n82U_FecFin = (GXutil.dateCompare(GXutil.nullDate(), A82U_FecFin) ? true : false) ;
            Z83U_Usuario = httpContext.cgiGet( "Z83U_Usuario") ;
            n83U_Usuario = ((GXutil.strcmp("", A83U_Usuario)==0) ? true : false) ;
            Z84U_DocOrig = (int)(localUtil.ctol( httpContext.cgiGet( "Z84U_DocOrig"), ",", ".")) ;
            n84U_DocOrig = ((0==A84U_DocOrig) ? true : false) ;
            Z85UVID_CONTROLCHU_Estado = httpContext.cgiGet( "Z85UVID_CONTROLCHU_Estado") ;
            n85UVID_CONTROLCHU_Estado = ((GXutil.strcmp("", A85UVID_CONTROLCHU_Estado)==0) ? true : false) ;
            Z86U_Traslado = httpContext.cgiGet( "Z86U_Traslado") ;
            n86U_Traslado = ((GXutil.strcmp("", A86U_Traslado)==0) ? true : false) ;
            Z87U_TipResul = httpContext.cgiGet( "Z87U_TipResul") ;
            n87U_TipResul = ((GXutil.strcmp("", A87U_TipResul)==0) ? true : false) ;
            Z88U_ContraMu = httpContext.cgiGet( "Z88U_ContraMu") ;
            n88U_ContraMu = ((GXutil.strcmp("", A88U_ContraMu)==0) ? true : false) ;
            Z89U_CoMuSize = localUtil.ctol( httpContext.cgiGet( "Z89U_CoMuSize"), ",", ".") ;
            n89U_CoMuSize = ((0==A89U_CoMuSize) ? true : false) ;
            Z90U_MuestDes = httpContext.cgiGet( "Z90U_MuestDes") ;
            n90U_MuestDes = ((GXutil.strcmp("", A90U_MuestDes)==0) ? true : false) ;
            Z91U_MuDeSize = localUtil.ctol( httpContext.cgiGet( "Z91U_MuDeSize"), ",", ".") ;
            n91U_MuDeSize = ((0==A91U_MuDeSize) ? true : false) ;
            Z92U_CtaCalid = httpContext.cgiGet( "Z92U_CtaCalid") ;
            n92U_CtaCalid = ((GXutil.strcmp("", A92U_CtaCalid)==0) ? true : false) ;
            Z93U_CCCode = httpContext.cgiGet( "Z93U_CCCode") ;
            n93U_CCCode = ((GXutil.strcmp("", A93U_CCCode)==0) ? true : false) ;
            Z94U_PrjCode = httpContext.cgiGet( "Z94U_PrjCode") ;
            n94U_PrjCode = ((GXutil.strcmp("", A94U_PrjCode)==0) ? true : false) ;
            Z95UVID_CONTROLCHU_Comment = httpContext.cgiGet( "Z95UVID_CONTROLCHU_Comment") ;
            n95UVID_CONTROLCHU_Comment = ((GXutil.strcmp("", A95UVID_CONTROLCHU_Comment)==0) ? true : false) ;
            Z96U_AtrQ1 = localUtil.ctol( httpContext.cgiGet( "Z96U_AtrQ1"), ",", ".") ;
            n96U_AtrQ1 = ((0==A96U_AtrQ1) ? true : false) ;
            Z97U_AtrQ2 = localUtil.ctol( httpContext.cgiGet( "Z97U_AtrQ2"), ",", ".") ;
            n97U_AtrQ2 = ((0==A97U_AtrQ2) ? true : false) ;
            Z98U_AtrQ3 = localUtil.ctol( httpContext.cgiGet( "Z98U_AtrQ3"), ",", ".") ;
            n98U_AtrQ3 = ((0==A98U_AtrQ3) ? true : false) ;
            Z99U_AtrQ4 = localUtil.ctol( httpContext.cgiGet( "Z99U_AtrQ4"), ",", ".") ;
            n99U_AtrQ4 = ((0==A99U_AtrQ4) ? true : false) ;
            Z100U_AtrT1 = httpContext.cgiGet( "Z100U_AtrT1") ;
            n100U_AtrT1 = ((GXutil.strcmp("", A100U_AtrT1)==0) ? true : false) ;
            Z101U_AtrT2 = httpContext.cgiGet( "Z101U_AtrT2") ;
            n101U_AtrT2 = ((GXutil.strcmp("", A101U_AtrT2)==0) ? true : false) ;
            Z102U_AtrT3 = httpContext.cgiGet( "Z102U_AtrT3") ;
            n102U_AtrT3 = ((GXutil.strcmp("", A102U_AtrT3)==0) ? true : false) ;
            Z103U_AtrT4 = httpContext.cgiGet( "Z103U_AtrT4") ;
            n103U_AtrT4 = ((GXutil.strcmp("", A103U_AtrT4)==0) ? true : false) ;
            Z104U_Reanalis = httpContext.cgiGet( "Z104U_Reanalis") ;
            n104U_Reanalis = ((GXutil.strcmp("", A104U_Reanalis)==0) ? true : false) ;
            Z105U_NroOF = (int)(localUtil.ctol( httpContext.cgiGet( "Z105U_NroOF"), ",", ".")) ;
            n105U_NroOF = ((0==A105U_NroOF) ? true : false) ;
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
            initAll045( ) ;
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
      disableAttributes045( ) ;
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

   public void resetCaption040( )
   {
   }

   public void zm045( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z44DocNum = T00043_A44DocNum[0] ;
            Z45Period = T00043_A45Period[0] ;
            Z46Instance = T00043_A46Instance[0] ;
            Z47Series = T00043_A47Series[0] ;
            Z48Handwrtten = T00043_A48Handwrtten[0] ;
            Z49Canceled = T00043_A49Canceled[0] ;
            Z50UVID_CONTROLCHObject = T00043_A50UVID_CONTROLCHObject[0] ;
            Z51UVID_CONTROLCHLogInst = T00043_A51UVID_CONTROLCHLogInst[0] ;
            Z52UserSign = T00043_A52UserSign[0] ;
            Z53Transfered = T00043_A53Transfered[0] ;
            Z54Status = T00043_A54Status[0] ;
            Z55CreateDate = T00043_A55CreateDate[0] ;
            Z56CreateTime = T00043_A56CreateTime[0] ;
            Z57UpdateDate = T00043_A57UpdateDate[0] ;
            Z58UpdateTime = T00043_A58UpdateTime[0] ;
            Z59DataSource = T00043_A59DataSource[0] ;
            Z60RequestStatus = T00043_A60RequestStatus[0] ;
            Z61Creator = T00043_A61Creator[0] ;
            Z63U_ItemCode = T00043_A63U_ItemCode[0] ;
            Z64U_ItemName = T00043_A64U_ItemName[0] ;
            Z65U_WhsCode = T00043_A65U_WhsCode[0] ;
            Z66U_WhsDest = T00043_A66U_WhsDest[0] ;
            Z67U_NumTras = T00043_A67U_NumTras[0] ;
            Z68U_NumCon = T00043_A68U_NumCon[0] ;
            Z69U_NumMusd = T00043_A69U_NumMusd[0] ;
            Z70U_NoLote = T00043_A70U_NoLote[0] ;
            Z71U_CorrLote = T00043_A71U_CorrLote[0] ;
            Z72U_CorrAnal = T00043_A72U_CorrAnal[0] ;
            Z73U_Cantidad = T00043_A73U_Cantidad[0] ;
            Z74U_Bultos = T00043_A74U_Bultos[0] ;
            Z75U_BultosMu = T00043_A75U_BultosMu[0] ;
            Z76U_FecIngr = T00043_A76U_FecIngr[0] ;
            Z77U_FecUltIn = T00043_A77U_FecUltIn[0] ;
            Z78U_UM = T00043_A78U_UM[0] ;
            Z79U_NoDoc = T00043_A79U_NoDoc[0] ;
            Z80U_FecContr = T00043_A80U_FecContr[0] ;
            Z81U_FecIni = T00043_A81U_FecIni[0] ;
            Z82U_FecFin = T00043_A82U_FecFin[0] ;
            Z83U_Usuario = T00043_A83U_Usuario[0] ;
            Z84U_DocOrig = T00043_A84U_DocOrig[0] ;
            Z85UVID_CONTROLCHU_Estado = T00043_A85UVID_CONTROLCHU_Estado[0] ;
            Z86U_Traslado = T00043_A86U_Traslado[0] ;
            Z87U_TipResul = T00043_A87U_TipResul[0] ;
            Z88U_ContraMu = T00043_A88U_ContraMu[0] ;
            Z89U_CoMuSize = T00043_A89U_CoMuSize[0] ;
            Z90U_MuestDes = T00043_A90U_MuestDes[0] ;
            Z91U_MuDeSize = T00043_A91U_MuDeSize[0] ;
            Z92U_CtaCalid = T00043_A92U_CtaCalid[0] ;
            Z93U_CCCode = T00043_A93U_CCCode[0] ;
            Z94U_PrjCode = T00043_A94U_PrjCode[0] ;
            Z95UVID_CONTROLCHU_Comment = T00043_A95UVID_CONTROLCHU_Comment[0] ;
            Z96U_AtrQ1 = T00043_A96U_AtrQ1[0] ;
            Z97U_AtrQ2 = T00043_A97U_AtrQ2[0] ;
            Z98U_AtrQ3 = T00043_A98U_AtrQ3[0] ;
            Z99U_AtrQ4 = T00043_A99U_AtrQ4[0] ;
            Z100U_AtrT1 = T00043_A100U_AtrT1[0] ;
            Z101U_AtrT2 = T00043_A101U_AtrT2[0] ;
            Z102U_AtrT3 = T00043_A102U_AtrT3[0] ;
            Z103U_AtrT4 = T00043_A103U_AtrT4[0] ;
            Z104U_Reanalis = T00043_A104U_Reanalis[0] ;
            Z105U_NroOF = T00043_A105U_NroOF[0] ;
         }
         else
         {
            Z44DocNum = A44DocNum ;
            Z45Period = A45Period ;
            Z46Instance = A46Instance ;
            Z47Series = A47Series ;
            Z48Handwrtten = A48Handwrtten ;
            Z49Canceled = A49Canceled ;
            Z50UVID_CONTROLCHObject = A50UVID_CONTROLCHObject ;
            Z51UVID_CONTROLCHLogInst = A51UVID_CONTROLCHLogInst ;
            Z52UserSign = A52UserSign ;
            Z53Transfered = A53Transfered ;
            Z54Status = A54Status ;
            Z55CreateDate = A55CreateDate ;
            Z56CreateTime = A56CreateTime ;
            Z57UpdateDate = A57UpdateDate ;
            Z58UpdateTime = A58UpdateTime ;
            Z59DataSource = A59DataSource ;
            Z60RequestStatus = A60RequestStatus ;
            Z61Creator = A61Creator ;
            Z63U_ItemCode = A63U_ItemCode ;
            Z64U_ItemName = A64U_ItemName ;
            Z65U_WhsCode = A65U_WhsCode ;
            Z66U_WhsDest = A66U_WhsDest ;
            Z67U_NumTras = A67U_NumTras ;
            Z68U_NumCon = A68U_NumCon ;
            Z69U_NumMusd = A69U_NumMusd ;
            Z70U_NoLote = A70U_NoLote ;
            Z71U_CorrLote = A71U_CorrLote ;
            Z72U_CorrAnal = A72U_CorrAnal ;
            Z73U_Cantidad = A73U_Cantidad ;
            Z74U_Bultos = A74U_Bultos ;
            Z75U_BultosMu = A75U_BultosMu ;
            Z76U_FecIngr = A76U_FecIngr ;
            Z77U_FecUltIn = A77U_FecUltIn ;
            Z78U_UM = A78U_UM ;
            Z79U_NoDoc = A79U_NoDoc ;
            Z80U_FecContr = A80U_FecContr ;
            Z81U_FecIni = A81U_FecIni ;
            Z82U_FecFin = A82U_FecFin ;
            Z83U_Usuario = A83U_Usuario ;
            Z84U_DocOrig = A84U_DocOrig ;
            Z85UVID_CONTROLCHU_Estado = A85UVID_CONTROLCHU_Estado ;
            Z86U_Traslado = A86U_Traslado ;
            Z87U_TipResul = A87U_TipResul ;
            Z88U_ContraMu = A88U_ContraMu ;
            Z89U_CoMuSize = A89U_CoMuSize ;
            Z90U_MuestDes = A90U_MuestDes ;
            Z91U_MuDeSize = A91U_MuDeSize ;
            Z92U_CtaCalid = A92U_CtaCalid ;
            Z93U_CCCode = A93U_CCCode ;
            Z94U_PrjCode = A94U_PrjCode ;
            Z95UVID_CONTROLCHU_Comment = A95UVID_CONTROLCHU_Comment ;
            Z96U_AtrQ1 = A96U_AtrQ1 ;
            Z97U_AtrQ2 = A97U_AtrQ2 ;
            Z98U_AtrQ3 = A98U_AtrQ3 ;
            Z99U_AtrQ4 = A99U_AtrQ4 ;
            Z100U_AtrT1 = A100U_AtrT1 ;
            Z101U_AtrT2 = A101U_AtrT2 ;
            Z102U_AtrT3 = A102U_AtrT3 ;
            Z103U_AtrT4 = A103U_AtrT4 ;
            Z104U_Reanalis = A104U_Reanalis ;
            Z105U_NroOF = A105U_NroOF ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z43UVID_CONTROLCHDocEntry = A43UVID_CONTROLCHDocEntry ;
         Z44DocNum = A44DocNum ;
         Z45Period = A45Period ;
         Z46Instance = A46Instance ;
         Z47Series = A47Series ;
         Z48Handwrtten = A48Handwrtten ;
         Z49Canceled = A49Canceled ;
         Z50UVID_CONTROLCHObject = A50UVID_CONTROLCHObject ;
         Z51UVID_CONTROLCHLogInst = A51UVID_CONTROLCHLogInst ;
         Z52UserSign = A52UserSign ;
         Z53Transfered = A53Transfered ;
         Z54Status = A54Status ;
         Z55CreateDate = A55CreateDate ;
         Z56CreateTime = A56CreateTime ;
         Z57UpdateDate = A57UpdateDate ;
         Z58UpdateTime = A58UpdateTime ;
         Z59DataSource = A59DataSource ;
         Z60RequestStatus = A60RequestStatus ;
         Z61Creator = A61Creator ;
         Z62Remark = A62Remark ;
         Z63U_ItemCode = A63U_ItemCode ;
         Z64U_ItemName = A64U_ItemName ;
         Z65U_WhsCode = A65U_WhsCode ;
         Z66U_WhsDest = A66U_WhsDest ;
         Z67U_NumTras = A67U_NumTras ;
         Z68U_NumCon = A68U_NumCon ;
         Z69U_NumMusd = A69U_NumMusd ;
         Z70U_NoLote = A70U_NoLote ;
         Z71U_CorrLote = A71U_CorrLote ;
         Z72U_CorrAnal = A72U_CorrAnal ;
         Z73U_Cantidad = A73U_Cantidad ;
         Z74U_Bultos = A74U_Bultos ;
         Z75U_BultosMu = A75U_BultosMu ;
         Z76U_FecIngr = A76U_FecIngr ;
         Z77U_FecUltIn = A77U_FecUltIn ;
         Z78U_UM = A78U_UM ;
         Z79U_NoDoc = A79U_NoDoc ;
         Z80U_FecContr = A80U_FecContr ;
         Z81U_FecIni = A81U_FecIni ;
         Z82U_FecFin = A82U_FecFin ;
         Z83U_Usuario = A83U_Usuario ;
         Z84U_DocOrig = A84U_DocOrig ;
         Z85UVID_CONTROLCHU_Estado = A85UVID_CONTROLCHU_Estado ;
         Z86U_Traslado = A86U_Traslado ;
         Z87U_TipResul = A87U_TipResul ;
         Z88U_ContraMu = A88U_ContraMu ;
         Z89U_CoMuSize = A89U_CoMuSize ;
         Z90U_MuestDes = A90U_MuestDes ;
         Z91U_MuDeSize = A91U_MuDeSize ;
         Z92U_CtaCalid = A92U_CtaCalid ;
         Z93U_CCCode = A93U_CCCode ;
         Z94U_PrjCode = A94U_PrjCode ;
         Z95UVID_CONTROLCHU_Comment = A95UVID_CONTROLCHU_Comment ;
         Z96U_AtrQ1 = A96U_AtrQ1 ;
         Z97U_AtrQ2 = A97U_AtrQ2 ;
         Z98U_AtrQ3 = A98U_AtrQ3 ;
         Z99U_AtrQ4 = A99U_AtrQ4 ;
         Z100U_AtrT1 = A100U_AtrT1 ;
         Z101U_AtrT2 = A101U_AtrT2 ;
         Z102U_AtrT3 = A102U_AtrT3 ;
         Z103U_AtrT4 = A103U_AtrT4 ;
         Z104U_Reanalis = A104U_Reanalis ;
         Z105U_NroOF = A105U_NroOF ;
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

   public void load045( )
   {
      /* Using cursor T00044 */
      pr_fusquim_sap.execute(2, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(2) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A44DocNum = T00044_A44DocNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44DocNum", GXutil.ltrim( GXutil.str( A44DocNum, 9, 0)));
         n44DocNum = T00044_n44DocNum[0] ;
         A45Period = T00044_A45Period[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45Period", GXutil.ltrim( GXutil.str( A45Period, 9, 0)));
         n45Period = T00044_n45Period[0] ;
         A46Instance = T00044_A46Instance[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Instance", GXutil.ltrim( GXutil.str( A46Instance, 4, 0)));
         n46Instance = T00044_n46Instance[0] ;
         A47Series = T00044_A47Series[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47Series", GXutil.ltrim( GXutil.str( A47Series, 9, 0)));
         n47Series = T00044_n47Series[0] ;
         A48Handwrtten = T00044_A48Handwrtten[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48Handwrtten", A48Handwrtten);
         n48Handwrtten = T00044_n48Handwrtten[0] ;
         A49Canceled = T00044_A49Canceled[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49Canceled", A49Canceled);
         n49Canceled = T00044_n49Canceled[0] ;
         A50UVID_CONTROLCHObject = T00044_A50UVID_CONTROLCHObject[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50UVID_CONTROLCHObject", A50UVID_CONTROLCHObject);
         n50UVID_CONTROLCHObject = T00044_n50UVID_CONTROLCHObject[0] ;
         A51UVID_CONTROLCHLogInst = T00044_A51UVID_CONTROLCHLogInst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51UVID_CONTROLCHLogInst", GXutil.ltrim( GXutil.str( A51UVID_CONTROLCHLogInst, 9, 0)));
         n51UVID_CONTROLCHLogInst = T00044_n51UVID_CONTROLCHLogInst[0] ;
         A52UserSign = T00044_A52UserSign[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52UserSign", GXutil.ltrim( GXutil.str( A52UserSign, 9, 0)));
         n52UserSign = T00044_n52UserSign[0] ;
         A53Transfered = T00044_A53Transfered[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53Transfered", A53Transfered);
         n53Transfered = T00044_n53Transfered[0] ;
         A54Status = T00044_A54Status[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54Status", A54Status);
         n54Status = T00044_n54Status[0] ;
         A55CreateDate = T00044_A55CreateDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55CreateDate", localUtil.ttoc( A55CreateDate, 10, 8, 0, 3, "/", ":", " "));
         n55CreateDate = T00044_n55CreateDate[0] ;
         A56CreateTime = T00044_A56CreateTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56CreateTime", GXutil.ltrim( GXutil.str( A56CreateTime, 4, 0)));
         n56CreateTime = T00044_n56CreateTime[0] ;
         A57UpdateDate = T00044_A57UpdateDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57UpdateDate", localUtil.ttoc( A57UpdateDate, 10, 8, 0, 3, "/", ":", " "));
         n57UpdateDate = T00044_n57UpdateDate[0] ;
         A58UpdateTime = T00044_A58UpdateTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58UpdateTime", GXutil.ltrim( GXutil.str( A58UpdateTime, 4, 0)));
         n58UpdateTime = T00044_n58UpdateTime[0] ;
         A59DataSource = T00044_A59DataSource[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59DataSource", A59DataSource);
         n59DataSource = T00044_n59DataSource[0] ;
         A60RequestStatus = T00044_A60RequestStatus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60RequestStatus", A60RequestStatus);
         n60RequestStatus = T00044_n60RequestStatus[0] ;
         A61Creator = T00044_A61Creator[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61Creator", A61Creator);
         n61Creator = T00044_n61Creator[0] ;
         A62Remark = T00044_A62Remark[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62Remark", A62Remark);
         n62Remark = T00044_n62Remark[0] ;
         A63U_ItemCode = T00044_A63U_ItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63U_ItemCode", A63U_ItemCode);
         n63U_ItemCode = T00044_n63U_ItemCode[0] ;
         A64U_ItemName = T00044_A64U_ItemName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64U_ItemName", A64U_ItemName);
         n64U_ItemName = T00044_n64U_ItemName[0] ;
         A65U_WhsCode = T00044_A65U_WhsCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65U_WhsCode", A65U_WhsCode);
         n65U_WhsCode = T00044_n65U_WhsCode[0] ;
         A66U_WhsDest = T00044_A66U_WhsDest[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66U_WhsDest", A66U_WhsDest);
         n66U_WhsDest = T00044_n66U_WhsDest[0] ;
         A67U_NumTras = T00044_A67U_NumTras[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67U_NumTras", A67U_NumTras);
         n67U_NumTras = T00044_n67U_NumTras[0] ;
         A68U_NumCon = T00044_A68U_NumCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68U_NumCon", A68U_NumCon);
         n68U_NumCon = T00044_n68U_NumCon[0] ;
         A69U_NumMusd = T00044_A69U_NumMusd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69U_NumMusd", A69U_NumMusd);
         n69U_NumMusd = T00044_n69U_NumMusd[0] ;
         A70U_NoLote = T00044_A70U_NoLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70U_NoLote", A70U_NoLote);
         n70U_NoLote = T00044_n70U_NoLote[0] ;
         A71U_CorrLote = T00044_A71U_CorrLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71U_CorrLote", GXutil.ltrim( GXutil.str( A71U_CorrLote, 9, 0)));
         n71U_CorrLote = T00044_n71U_CorrLote[0] ;
         A72U_CorrAnal = T00044_A72U_CorrAnal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A72U_CorrAnal", GXutil.ltrim( GXutil.str( A72U_CorrAnal, 9, 0)));
         n72U_CorrAnal = T00044_n72U_CorrAnal[0] ;
         A73U_Cantidad = T00044_A73U_Cantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73U_Cantidad", GXutil.ltrim( GXutil.str( A73U_Cantidad, 18, 0)));
         n73U_Cantidad = T00044_n73U_Cantidad[0] ;
         A74U_Bultos = T00044_A74U_Bultos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74U_Bultos", GXutil.ltrim( GXutil.str( A74U_Bultos, 9, 0)));
         n74U_Bultos = T00044_n74U_Bultos[0] ;
         A75U_BultosMu = T00044_A75U_BultosMu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75U_BultosMu", GXutil.ltrim( GXutil.str( A75U_BultosMu, 9, 0)));
         n75U_BultosMu = T00044_n75U_BultosMu[0] ;
         A76U_FecIngr = T00044_A76U_FecIngr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76U_FecIngr", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
         n76U_FecIngr = T00044_n76U_FecIngr[0] ;
         A77U_FecUltIn = T00044_A77U_FecUltIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A77U_FecUltIn", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
         n77U_FecUltIn = T00044_n77U_FecUltIn[0] ;
         A78U_UM = T00044_A78U_UM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78U_UM", A78U_UM);
         n78U_UM = T00044_n78U_UM[0] ;
         A79U_NoDoc = T00044_A79U_NoDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79U_NoDoc", GXutil.ltrim( GXutil.str( A79U_NoDoc, 9, 0)));
         n79U_NoDoc = T00044_n79U_NoDoc[0] ;
         A80U_FecContr = T00044_A80U_FecContr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80U_FecContr", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
         n80U_FecContr = T00044_n80U_FecContr[0] ;
         A81U_FecIni = T00044_A81U_FecIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81U_FecIni", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
         n81U_FecIni = T00044_n81U_FecIni[0] ;
         A82U_FecFin = T00044_A82U_FecFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82U_FecFin", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
         n82U_FecFin = T00044_n82U_FecFin[0] ;
         A83U_Usuario = T00044_A83U_Usuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83U_Usuario", A83U_Usuario);
         n83U_Usuario = T00044_n83U_Usuario[0] ;
         A84U_DocOrig = T00044_A84U_DocOrig[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84U_DocOrig", GXutil.ltrim( GXutil.str( A84U_DocOrig, 9, 0)));
         n84U_DocOrig = T00044_n84U_DocOrig[0] ;
         A85UVID_CONTROLCHU_Estado = T00044_A85UVID_CONTROLCHU_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A85UVID_CONTROLCHU_Estado", A85UVID_CONTROLCHU_Estado);
         n85UVID_CONTROLCHU_Estado = T00044_n85UVID_CONTROLCHU_Estado[0] ;
         A86U_Traslado = T00044_A86U_Traslado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A86U_Traslado", A86U_Traslado);
         n86U_Traslado = T00044_n86U_Traslado[0] ;
         A87U_TipResul = T00044_A87U_TipResul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87U_TipResul", A87U_TipResul);
         n87U_TipResul = T00044_n87U_TipResul[0] ;
         A88U_ContraMu = T00044_A88U_ContraMu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88U_ContraMu", A88U_ContraMu);
         n88U_ContraMu = T00044_n88U_ContraMu[0] ;
         A89U_CoMuSize = T00044_A89U_CoMuSize[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89U_CoMuSize", GXutil.ltrim( GXutil.str( A89U_CoMuSize, 18, 0)));
         n89U_CoMuSize = T00044_n89U_CoMuSize[0] ;
         A90U_MuestDes = T00044_A90U_MuestDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90U_MuestDes", A90U_MuestDes);
         n90U_MuestDes = T00044_n90U_MuestDes[0] ;
         A91U_MuDeSize = T00044_A91U_MuDeSize[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91U_MuDeSize", GXutil.ltrim( GXutil.str( A91U_MuDeSize, 18, 0)));
         n91U_MuDeSize = T00044_n91U_MuDeSize[0] ;
         A92U_CtaCalid = T00044_A92U_CtaCalid[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92U_CtaCalid", A92U_CtaCalid);
         n92U_CtaCalid = T00044_n92U_CtaCalid[0] ;
         A93U_CCCode = T00044_A93U_CCCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93U_CCCode", A93U_CCCode);
         n93U_CCCode = T00044_n93U_CCCode[0] ;
         A94U_PrjCode = T00044_A94U_PrjCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94U_PrjCode", A94U_PrjCode);
         n94U_PrjCode = T00044_n94U_PrjCode[0] ;
         A95UVID_CONTROLCHU_Comment = T00044_A95UVID_CONTROLCHU_Comment[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95UVID_CONTROLCHU_Comment", A95UVID_CONTROLCHU_Comment);
         n95UVID_CONTROLCHU_Comment = T00044_n95UVID_CONTROLCHU_Comment[0] ;
         A96U_AtrQ1 = T00044_A96U_AtrQ1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96U_AtrQ1", GXutil.ltrim( GXutil.str( A96U_AtrQ1, 18, 0)));
         n96U_AtrQ1 = T00044_n96U_AtrQ1[0] ;
         A97U_AtrQ2 = T00044_A97U_AtrQ2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97U_AtrQ2", GXutil.ltrim( GXutil.str( A97U_AtrQ2, 18, 0)));
         n97U_AtrQ2 = T00044_n97U_AtrQ2[0] ;
         A98U_AtrQ3 = T00044_A98U_AtrQ3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98U_AtrQ3", GXutil.ltrim( GXutil.str( A98U_AtrQ3, 18, 0)));
         n98U_AtrQ3 = T00044_n98U_AtrQ3[0] ;
         A99U_AtrQ4 = T00044_A99U_AtrQ4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99U_AtrQ4", GXutil.ltrim( GXutil.str( A99U_AtrQ4, 18, 0)));
         n99U_AtrQ4 = T00044_n99U_AtrQ4[0] ;
         A100U_AtrT1 = T00044_A100U_AtrT1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100U_AtrT1", A100U_AtrT1);
         n100U_AtrT1 = T00044_n100U_AtrT1[0] ;
         A101U_AtrT2 = T00044_A101U_AtrT2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101U_AtrT2", A101U_AtrT2);
         n101U_AtrT2 = T00044_n101U_AtrT2[0] ;
         A102U_AtrT3 = T00044_A102U_AtrT3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102U_AtrT3", A102U_AtrT3);
         n102U_AtrT3 = T00044_n102U_AtrT3[0] ;
         A103U_AtrT4 = T00044_A103U_AtrT4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103U_AtrT4", A103U_AtrT4);
         n103U_AtrT4 = T00044_n103U_AtrT4[0] ;
         A104U_Reanalis = T00044_A104U_Reanalis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104U_Reanalis", A104U_Reanalis);
         n104U_Reanalis = T00044_n104U_Reanalis[0] ;
         A105U_NroOF = T00044_A105U_NroOF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105U_NroOF", GXutil.ltrim( GXutil.str( A105U_NroOF, 9, 0)));
         n105U_NroOF = T00044_n105U_NroOF[0] ;
         zm045( -8) ;
      }
      pr_fusquim_sap.close(2);
      onLoadActions045( ) ;
   }

   public void onLoadActions045( )
   {
   }

   public void checkExtendedTable045( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A55CreateDate) || (( A55CreateDate.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A55CreateDate, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo Create Date fuera de rango", "OutOfRange", 1, "CREATEDATE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCreateDate_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A57UpdateDate) || (( A57UpdateDate.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A57UpdateDate, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo Update Date fuera de rango", "OutOfRange", 1, "UPDATEDATE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUpdateDate_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A76U_FecIngr) || (( A76U_FecIngr.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A76U_FecIngr, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo U_Fec Ingr fuera de rango", "OutOfRange", 1, "U_FECINGR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtU_FecIngr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A77U_FecUltIn) || (( A77U_FecUltIn.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A77U_FecUltIn, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo U_Fec Ult In fuera de rango", "OutOfRange", 1, "U_FECULTIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtU_FecUltIn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), A80U_FecContr) || (( A80U_FecContr.after( localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( GXutil.dateCompare(A80U_FecContr, localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0))) )) ) )
      {
         httpContext.GX_msglist.addItem("Campo U_Fec Contr fuera de rango", "OutOfRange", 1, "U_FECCONTR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtU_FecContr_Internalname ;
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
   }

   public void closeExtendedTableCursors045( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey045( )
   {
      /* Using cursor T00045 */
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
      /* Using cursor T00043 */
      pr_fusquim_sap.execute(1, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(1) != 101) )
      {
         zm045( 8) ;
         RcdFound5 = (short)(1) ;
         A43UVID_CONTROLCHDocEntry = T00043_A43UVID_CONTROLCHDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
         A44DocNum = T00043_A44DocNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44DocNum", GXutil.ltrim( GXutil.str( A44DocNum, 9, 0)));
         n44DocNum = T00043_n44DocNum[0] ;
         A45Period = T00043_A45Period[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45Period", GXutil.ltrim( GXutil.str( A45Period, 9, 0)));
         n45Period = T00043_n45Period[0] ;
         A46Instance = T00043_A46Instance[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Instance", GXutil.ltrim( GXutil.str( A46Instance, 4, 0)));
         n46Instance = T00043_n46Instance[0] ;
         A47Series = T00043_A47Series[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47Series", GXutil.ltrim( GXutil.str( A47Series, 9, 0)));
         n47Series = T00043_n47Series[0] ;
         A48Handwrtten = T00043_A48Handwrtten[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48Handwrtten", A48Handwrtten);
         n48Handwrtten = T00043_n48Handwrtten[0] ;
         A49Canceled = T00043_A49Canceled[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49Canceled", A49Canceled);
         n49Canceled = T00043_n49Canceled[0] ;
         A50UVID_CONTROLCHObject = T00043_A50UVID_CONTROLCHObject[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50UVID_CONTROLCHObject", A50UVID_CONTROLCHObject);
         n50UVID_CONTROLCHObject = T00043_n50UVID_CONTROLCHObject[0] ;
         A51UVID_CONTROLCHLogInst = T00043_A51UVID_CONTROLCHLogInst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51UVID_CONTROLCHLogInst", GXutil.ltrim( GXutil.str( A51UVID_CONTROLCHLogInst, 9, 0)));
         n51UVID_CONTROLCHLogInst = T00043_n51UVID_CONTROLCHLogInst[0] ;
         A52UserSign = T00043_A52UserSign[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52UserSign", GXutil.ltrim( GXutil.str( A52UserSign, 9, 0)));
         n52UserSign = T00043_n52UserSign[0] ;
         A53Transfered = T00043_A53Transfered[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53Transfered", A53Transfered);
         n53Transfered = T00043_n53Transfered[0] ;
         A54Status = T00043_A54Status[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54Status", A54Status);
         n54Status = T00043_n54Status[0] ;
         A55CreateDate = T00043_A55CreateDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55CreateDate", localUtil.ttoc( A55CreateDate, 10, 8, 0, 3, "/", ":", " "));
         n55CreateDate = T00043_n55CreateDate[0] ;
         A56CreateTime = T00043_A56CreateTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56CreateTime", GXutil.ltrim( GXutil.str( A56CreateTime, 4, 0)));
         n56CreateTime = T00043_n56CreateTime[0] ;
         A57UpdateDate = T00043_A57UpdateDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57UpdateDate", localUtil.ttoc( A57UpdateDate, 10, 8, 0, 3, "/", ":", " "));
         n57UpdateDate = T00043_n57UpdateDate[0] ;
         A58UpdateTime = T00043_A58UpdateTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58UpdateTime", GXutil.ltrim( GXutil.str( A58UpdateTime, 4, 0)));
         n58UpdateTime = T00043_n58UpdateTime[0] ;
         A59DataSource = T00043_A59DataSource[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59DataSource", A59DataSource);
         n59DataSource = T00043_n59DataSource[0] ;
         A60RequestStatus = T00043_A60RequestStatus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60RequestStatus", A60RequestStatus);
         n60RequestStatus = T00043_n60RequestStatus[0] ;
         A61Creator = T00043_A61Creator[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61Creator", A61Creator);
         n61Creator = T00043_n61Creator[0] ;
         A62Remark = T00043_A62Remark[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62Remark", A62Remark);
         n62Remark = T00043_n62Remark[0] ;
         A63U_ItemCode = T00043_A63U_ItemCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63U_ItemCode", A63U_ItemCode);
         n63U_ItemCode = T00043_n63U_ItemCode[0] ;
         A64U_ItemName = T00043_A64U_ItemName[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64U_ItemName", A64U_ItemName);
         n64U_ItemName = T00043_n64U_ItemName[0] ;
         A65U_WhsCode = T00043_A65U_WhsCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65U_WhsCode", A65U_WhsCode);
         n65U_WhsCode = T00043_n65U_WhsCode[0] ;
         A66U_WhsDest = T00043_A66U_WhsDest[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66U_WhsDest", A66U_WhsDest);
         n66U_WhsDest = T00043_n66U_WhsDest[0] ;
         A67U_NumTras = T00043_A67U_NumTras[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67U_NumTras", A67U_NumTras);
         n67U_NumTras = T00043_n67U_NumTras[0] ;
         A68U_NumCon = T00043_A68U_NumCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68U_NumCon", A68U_NumCon);
         n68U_NumCon = T00043_n68U_NumCon[0] ;
         A69U_NumMusd = T00043_A69U_NumMusd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69U_NumMusd", A69U_NumMusd);
         n69U_NumMusd = T00043_n69U_NumMusd[0] ;
         A70U_NoLote = T00043_A70U_NoLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70U_NoLote", A70U_NoLote);
         n70U_NoLote = T00043_n70U_NoLote[0] ;
         A71U_CorrLote = T00043_A71U_CorrLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71U_CorrLote", GXutil.ltrim( GXutil.str( A71U_CorrLote, 9, 0)));
         n71U_CorrLote = T00043_n71U_CorrLote[0] ;
         A72U_CorrAnal = T00043_A72U_CorrAnal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A72U_CorrAnal", GXutil.ltrim( GXutil.str( A72U_CorrAnal, 9, 0)));
         n72U_CorrAnal = T00043_n72U_CorrAnal[0] ;
         A73U_Cantidad = T00043_A73U_Cantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73U_Cantidad", GXutil.ltrim( GXutil.str( A73U_Cantidad, 18, 0)));
         n73U_Cantidad = T00043_n73U_Cantidad[0] ;
         A74U_Bultos = T00043_A74U_Bultos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74U_Bultos", GXutil.ltrim( GXutil.str( A74U_Bultos, 9, 0)));
         n74U_Bultos = T00043_n74U_Bultos[0] ;
         A75U_BultosMu = T00043_A75U_BultosMu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75U_BultosMu", GXutil.ltrim( GXutil.str( A75U_BultosMu, 9, 0)));
         n75U_BultosMu = T00043_n75U_BultosMu[0] ;
         A76U_FecIngr = T00043_A76U_FecIngr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76U_FecIngr", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
         n76U_FecIngr = T00043_n76U_FecIngr[0] ;
         A77U_FecUltIn = T00043_A77U_FecUltIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A77U_FecUltIn", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
         n77U_FecUltIn = T00043_n77U_FecUltIn[0] ;
         A78U_UM = T00043_A78U_UM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78U_UM", A78U_UM);
         n78U_UM = T00043_n78U_UM[0] ;
         A79U_NoDoc = T00043_A79U_NoDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79U_NoDoc", GXutil.ltrim( GXutil.str( A79U_NoDoc, 9, 0)));
         n79U_NoDoc = T00043_n79U_NoDoc[0] ;
         A80U_FecContr = T00043_A80U_FecContr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80U_FecContr", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
         n80U_FecContr = T00043_n80U_FecContr[0] ;
         A81U_FecIni = T00043_A81U_FecIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81U_FecIni", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
         n81U_FecIni = T00043_n81U_FecIni[0] ;
         A82U_FecFin = T00043_A82U_FecFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82U_FecFin", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
         n82U_FecFin = T00043_n82U_FecFin[0] ;
         A83U_Usuario = T00043_A83U_Usuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83U_Usuario", A83U_Usuario);
         n83U_Usuario = T00043_n83U_Usuario[0] ;
         A84U_DocOrig = T00043_A84U_DocOrig[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84U_DocOrig", GXutil.ltrim( GXutil.str( A84U_DocOrig, 9, 0)));
         n84U_DocOrig = T00043_n84U_DocOrig[0] ;
         A85UVID_CONTROLCHU_Estado = T00043_A85UVID_CONTROLCHU_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A85UVID_CONTROLCHU_Estado", A85UVID_CONTROLCHU_Estado);
         n85UVID_CONTROLCHU_Estado = T00043_n85UVID_CONTROLCHU_Estado[0] ;
         A86U_Traslado = T00043_A86U_Traslado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A86U_Traslado", A86U_Traslado);
         n86U_Traslado = T00043_n86U_Traslado[0] ;
         A87U_TipResul = T00043_A87U_TipResul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87U_TipResul", A87U_TipResul);
         n87U_TipResul = T00043_n87U_TipResul[0] ;
         A88U_ContraMu = T00043_A88U_ContraMu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88U_ContraMu", A88U_ContraMu);
         n88U_ContraMu = T00043_n88U_ContraMu[0] ;
         A89U_CoMuSize = T00043_A89U_CoMuSize[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89U_CoMuSize", GXutil.ltrim( GXutil.str( A89U_CoMuSize, 18, 0)));
         n89U_CoMuSize = T00043_n89U_CoMuSize[0] ;
         A90U_MuestDes = T00043_A90U_MuestDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90U_MuestDes", A90U_MuestDes);
         n90U_MuestDes = T00043_n90U_MuestDes[0] ;
         A91U_MuDeSize = T00043_A91U_MuDeSize[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91U_MuDeSize", GXutil.ltrim( GXutil.str( A91U_MuDeSize, 18, 0)));
         n91U_MuDeSize = T00043_n91U_MuDeSize[0] ;
         A92U_CtaCalid = T00043_A92U_CtaCalid[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92U_CtaCalid", A92U_CtaCalid);
         n92U_CtaCalid = T00043_n92U_CtaCalid[0] ;
         A93U_CCCode = T00043_A93U_CCCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93U_CCCode", A93U_CCCode);
         n93U_CCCode = T00043_n93U_CCCode[0] ;
         A94U_PrjCode = T00043_A94U_PrjCode[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94U_PrjCode", A94U_PrjCode);
         n94U_PrjCode = T00043_n94U_PrjCode[0] ;
         A95UVID_CONTROLCHU_Comment = T00043_A95UVID_CONTROLCHU_Comment[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95UVID_CONTROLCHU_Comment", A95UVID_CONTROLCHU_Comment);
         n95UVID_CONTROLCHU_Comment = T00043_n95UVID_CONTROLCHU_Comment[0] ;
         A96U_AtrQ1 = T00043_A96U_AtrQ1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96U_AtrQ1", GXutil.ltrim( GXutil.str( A96U_AtrQ1, 18, 0)));
         n96U_AtrQ1 = T00043_n96U_AtrQ1[0] ;
         A97U_AtrQ2 = T00043_A97U_AtrQ2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97U_AtrQ2", GXutil.ltrim( GXutil.str( A97U_AtrQ2, 18, 0)));
         n97U_AtrQ2 = T00043_n97U_AtrQ2[0] ;
         A98U_AtrQ3 = T00043_A98U_AtrQ3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98U_AtrQ3", GXutil.ltrim( GXutil.str( A98U_AtrQ3, 18, 0)));
         n98U_AtrQ3 = T00043_n98U_AtrQ3[0] ;
         A99U_AtrQ4 = T00043_A99U_AtrQ4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99U_AtrQ4", GXutil.ltrim( GXutil.str( A99U_AtrQ4, 18, 0)));
         n99U_AtrQ4 = T00043_n99U_AtrQ4[0] ;
         A100U_AtrT1 = T00043_A100U_AtrT1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100U_AtrT1", A100U_AtrT1);
         n100U_AtrT1 = T00043_n100U_AtrT1[0] ;
         A101U_AtrT2 = T00043_A101U_AtrT2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101U_AtrT2", A101U_AtrT2);
         n101U_AtrT2 = T00043_n101U_AtrT2[0] ;
         A102U_AtrT3 = T00043_A102U_AtrT3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102U_AtrT3", A102U_AtrT3);
         n102U_AtrT3 = T00043_n102U_AtrT3[0] ;
         A103U_AtrT4 = T00043_A103U_AtrT4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103U_AtrT4", A103U_AtrT4);
         n103U_AtrT4 = T00043_n103U_AtrT4[0] ;
         A104U_Reanalis = T00043_A104U_Reanalis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104U_Reanalis", A104U_Reanalis);
         n104U_Reanalis = T00043_n104U_Reanalis[0] ;
         A105U_NroOF = T00043_A105U_NroOF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105U_NroOF", GXutil.ltrim( GXutil.str( A105U_NroOF, 9, 0)));
         n105U_NroOF = T00043_n105U_NroOF[0] ;
         Z43UVID_CONTROLCHDocEntry = A43UVID_CONTROLCHDocEntry ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load045( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey045( ) ;
         }
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey045( ) ;
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
      getKey045( ) ;
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
      /* Using cursor T00046 */
      pr_fusquim_sap.execute(4, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(4) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T00046_A43UVID_CONTROLCHDocEntry[0] < A43UVID_CONTROLCHDocEntry ) ) )
         {
            pr_fusquim_sap.readNext(4);
         }
         if ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T00046_A43UVID_CONTROLCHDocEntry[0] > A43UVID_CONTROLCHDocEntry ) ) )
         {
            A43UVID_CONTROLCHDocEntry = T00046_A43UVID_CONTROLCHDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(4);
   }

   public void move_previous( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T00047 */
      pr_fusquim_sap.execute(5, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
      if ( (pr_fusquim_sap.getStatus(5) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T00047_A43UVID_CONTROLCHDocEntry[0] > A43UVID_CONTROLCHDocEntry ) ) )
         {
            pr_fusquim_sap.readNext(5);
         }
         if ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T00047_A43UVID_CONTROLCHDocEntry[0] < A43UVID_CONTROLCHDocEntry ) ) )
         {
            A43UVID_CONTROLCHDocEntry = T00047_A43UVID_CONTROLCHDocEntry[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey045( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtUVID_CONTROLCHDocEntry_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert045( ) ;
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
               update045( ) ;
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
               insert045( ) ;
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
                  insert045( ) ;
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
      GX_FocusControl = edtDocNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart045( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDocNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd045( ) ;
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
      GX_FocusControl = edtDocNum_Internalname ;
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
      GX_FocusControl = edtDocNum_Internalname ;
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
      scanStart045( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound5 != 0 )
         {
            scanNext045( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDocNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd045( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency045( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00042 */
         pr_fusquim_sap.execute(0, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry)});
         if ( (pr_fusquim_sap.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_CONTROLCH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_fusquim_sap.getStatus(0) == 101) || ( Z44DocNum != T00042_A44DocNum[0] ) || ( Z45Period != T00042_A45Period[0] ) || ( Z46Instance != T00042_A46Instance[0] ) || ( Z47Series != T00042_A47Series[0] ) || ( GXutil.strcmp(Z48Handwrtten, T00042_A48Handwrtten[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z49Canceled, T00042_A49Canceled[0]) != 0 ) || ( GXutil.strcmp(Z50UVID_CONTROLCHObject, T00042_A50UVID_CONTROLCHObject[0]) != 0 ) || ( Z51UVID_CONTROLCHLogInst != T00042_A51UVID_CONTROLCHLogInst[0] ) || ( Z52UserSign != T00042_A52UserSign[0] ) || ( GXutil.strcmp(Z53Transfered, T00042_A53Transfered[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z54Status, T00042_A54Status[0]) != 0 ) || !( GXutil.dateCompare(Z55CreateDate, T00042_A55CreateDate[0]) ) || ( Z56CreateTime != T00042_A56CreateTime[0] ) || !( GXutil.dateCompare(Z57UpdateDate, T00042_A57UpdateDate[0]) ) || ( Z58UpdateTime != T00042_A58UpdateTime[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z59DataSource, T00042_A59DataSource[0]) != 0 ) || ( GXutil.strcmp(Z60RequestStatus, T00042_A60RequestStatus[0]) != 0 ) || ( GXutil.strcmp(Z61Creator, T00042_A61Creator[0]) != 0 ) || ( GXutil.strcmp(Z63U_ItemCode, T00042_A63U_ItemCode[0]) != 0 ) || ( GXutil.strcmp(Z64U_ItemName, T00042_A64U_ItemName[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z65U_WhsCode, T00042_A65U_WhsCode[0]) != 0 ) || ( GXutil.strcmp(Z66U_WhsDest, T00042_A66U_WhsDest[0]) != 0 ) || ( GXutil.strcmp(Z67U_NumTras, T00042_A67U_NumTras[0]) != 0 ) || ( GXutil.strcmp(Z68U_NumCon, T00042_A68U_NumCon[0]) != 0 ) || ( GXutil.strcmp(Z69U_NumMusd, T00042_A69U_NumMusd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z70U_NoLote, T00042_A70U_NoLote[0]) != 0 ) || ( Z71U_CorrLote != T00042_A71U_CorrLote[0] ) || ( Z72U_CorrAnal != T00042_A72U_CorrAnal[0] ) || ( Z73U_Cantidad != T00042_A73U_Cantidad[0] ) || ( Z74U_Bultos != T00042_A74U_Bultos[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z75U_BultosMu != T00042_A75U_BultosMu[0] ) || !( GXutil.dateCompare(Z76U_FecIngr, T00042_A76U_FecIngr[0]) ) || !( GXutil.dateCompare(Z77U_FecUltIn, T00042_A77U_FecUltIn[0]) ) || ( GXutil.strcmp(Z78U_UM, T00042_A78U_UM[0]) != 0 ) || ( Z79U_NoDoc != T00042_A79U_NoDoc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z80U_FecContr, T00042_A80U_FecContr[0]) ) || !( GXutil.dateCompare(Z81U_FecIni, T00042_A81U_FecIni[0]) ) || !( GXutil.dateCompare(Z82U_FecFin, T00042_A82U_FecFin[0]) ) || ( GXutil.strcmp(Z83U_Usuario, T00042_A83U_Usuario[0]) != 0 ) || ( Z84U_DocOrig != T00042_A84U_DocOrig[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z85UVID_CONTROLCHU_Estado, T00042_A85UVID_CONTROLCHU_Estado[0]) != 0 ) || ( GXutil.strcmp(Z86U_Traslado, T00042_A86U_Traslado[0]) != 0 ) || ( GXutil.strcmp(Z87U_TipResul, T00042_A87U_TipResul[0]) != 0 ) || ( GXutil.strcmp(Z88U_ContraMu, T00042_A88U_ContraMu[0]) != 0 ) || ( Z89U_CoMuSize != T00042_A89U_CoMuSize[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z90U_MuestDes, T00042_A90U_MuestDes[0]) != 0 ) || ( Z91U_MuDeSize != T00042_A91U_MuDeSize[0] ) || ( GXutil.strcmp(Z92U_CtaCalid, T00042_A92U_CtaCalid[0]) != 0 ) || ( GXutil.strcmp(Z93U_CCCode, T00042_A93U_CCCode[0]) != 0 ) || ( GXutil.strcmp(Z94U_PrjCode, T00042_A94U_PrjCode[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z95UVID_CONTROLCHU_Comment, T00042_A95UVID_CONTROLCHU_Comment[0]) != 0 ) || ( Z96U_AtrQ1 != T00042_A96U_AtrQ1[0] ) || ( Z97U_AtrQ2 != T00042_A97U_AtrQ2[0] ) || ( Z98U_AtrQ3 != T00042_A98U_AtrQ3[0] ) || ( Z99U_AtrQ4 != T00042_A99U_AtrQ4[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z100U_AtrT1, T00042_A100U_AtrT1[0]) != 0 ) || ( GXutil.strcmp(Z101U_AtrT2, T00042_A101U_AtrT2[0]) != 0 ) || ( GXutil.strcmp(Z102U_AtrT3, T00042_A102U_AtrT3[0]) != 0 ) || ( GXutil.strcmp(Z103U_AtrT4, T00042_A103U_AtrT4[0]) != 0 ) || ( GXutil.strcmp(Z104U_Reanalis, T00042_A104U_Reanalis[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z105U_NroOF != T00042_A105U_NroOF[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"@VID_CONTROLCH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert045( )
   {
      beforeValidate045( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable045( ) ;
      }
      if ( AnyError == 0 )
      {
         zm045( 0) ;
         checkOptimisticConcurrency045( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm045( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert045( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00048 */
                  pr_fusquim_sap.execute(6, new Object[] {new Integer(A43UVID_CONTROLCHDocEntry), new Boolean(n44DocNum), new Integer(A44DocNum), new Boolean(n45Period), new Integer(A45Period), new Boolean(n46Instance), new Short(A46Instance), new Boolean(n47Series), new Integer(A47Series), new Boolean(n48Handwrtten), A48Handwrtten, new Boolean(n49Canceled), A49Canceled, new Boolean(n50UVID_CONTROLCHObject), A50UVID_CONTROLCHObject, new Boolean(n51UVID_CONTROLCHLogInst), new Integer(A51UVID_CONTROLCHLogInst), new Boolean(n52UserSign), new Integer(A52UserSign), new Boolean(n53Transfered), A53Transfered, new Boolean(n54Status), A54Status, new Boolean(n55CreateDate), A55CreateDate, new Boolean(n56CreateTime), new Short(A56CreateTime), new Boolean(n57UpdateDate), A57UpdateDate, new Boolean(n58UpdateTime), new Short(A58UpdateTime), new Boolean(n59DataSource), A59DataSource, new Boolean(n60RequestStatus), A60RequestStatus, new Boolean(n61Creator), A61Creator, new Boolean(n62Remark), A62Remark, new Boolean(n63U_ItemCode), A63U_ItemCode, new Boolean(n64U_ItemName), A64U_ItemName, new Boolean(n65U_WhsCode), A65U_WhsCode, new Boolean(n66U_WhsDest), A66U_WhsDest, new Boolean(n67U_NumTras), A67U_NumTras, new Boolean(n68U_NumCon), A68U_NumCon, new Boolean(n69U_NumMusd), A69U_NumMusd, new Boolean(n70U_NoLote), A70U_NoLote, new Boolean(n71U_CorrLote), new Integer(A71U_CorrLote), new Boolean(n72U_CorrAnal), new Integer(A72U_CorrAnal), new Boolean(n73U_Cantidad), new Long(A73U_Cantidad), new Boolean(n74U_Bultos), new Integer(A74U_Bultos), new Boolean(n75U_BultosMu), new Integer(A75U_BultosMu), new Boolean(n76U_FecIngr), A76U_FecIngr, new Boolean(n77U_FecUltIn), A77U_FecUltIn, new Boolean(n78U_UM), A78U_UM, new Boolean(n79U_NoDoc), new Integer(A79U_NoDoc), new Boolean(n80U_FecContr), A80U_FecContr, new Boolean(n81U_FecIni), A81U_FecIni, new Boolean(n82U_FecFin), A82U_FecFin, new Boolean(n83U_Usuario), A83U_Usuario, new Boolean(n84U_DocOrig), new Integer(A84U_DocOrig), new Boolean(n85UVID_CONTROLCHU_Estado), A85UVID_CONTROLCHU_Estado, new Boolean(n86U_Traslado), A86U_Traslado, new Boolean(n87U_TipResul), A87U_TipResul, new Boolean(n88U_ContraMu), A88U_ContraMu, new Boolean(n89U_CoMuSize), new Long(A89U_CoMuSize), new Boolean(n90U_MuestDes), A90U_MuestDes, new Boolean(n91U_MuDeSize), new Long(A91U_MuDeSize), new Boolean(n92U_CtaCalid), A92U_CtaCalid, new Boolean(n93U_CCCode), A93U_CCCode, new Boolean(n94U_PrjCode), A94U_PrjCode, new Boolean(n95UVID_CONTROLCHU_Comment), A95UVID_CONTROLCHU_Comment, new Boolean(n96U_AtrQ1), new Long(A96U_AtrQ1), new Boolean(n97U_AtrQ2), new Long(A97U_AtrQ2), new Boolean(n98U_AtrQ3), new Long(A98U_AtrQ3), new Boolean(n99U_AtrQ4), new Long(A99U_AtrQ4), new Boolean(n100U_AtrT1), A100U_AtrT1, new Boolean(n101U_AtrT2), A101U_AtrT2, new Boolean(n102U_AtrT3), A102U_AtrT3, new Boolean(n103U_AtrT4), A103U_AtrT4, new Boolean(n104U_Reanalis),
                  A104U_Reanalis, new Boolean(n105U_NroOF), new Integer(A105U_NroOF)});
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
                        resetCaption040( ) ;
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
            load045( ) ;
         }
         endLevel045( ) ;
      }
      closeExtendedTableCursors045( ) ;
   }

   public void update045( )
   {
      beforeValidate045( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable045( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency045( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm045( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate045( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00049 */
                  pr_fusquim_sap.execute(7, new Object[] {new Boolean(n44DocNum), new Integer(A44DocNum), new Boolean(n45Period), new Integer(A45Period), new Boolean(n46Instance), new Short(A46Instance), new Boolean(n47Series), new Integer(A47Series), new Boolean(n48Handwrtten), A48Handwrtten, new Boolean(n49Canceled), A49Canceled, new Boolean(n50UVID_CONTROLCHObject), A50UVID_CONTROLCHObject, new Boolean(n51UVID_CONTROLCHLogInst), new Integer(A51UVID_CONTROLCHLogInst), new Boolean(n52UserSign), new Integer(A52UserSign), new Boolean(n53Transfered), A53Transfered, new Boolean(n54Status), A54Status, new Boolean(n55CreateDate), A55CreateDate, new Boolean(n56CreateTime), new Short(A56CreateTime), new Boolean(n57UpdateDate), A57UpdateDate, new Boolean(n58UpdateTime), new Short(A58UpdateTime), new Boolean(n59DataSource), A59DataSource, new Boolean(n60RequestStatus), A60RequestStatus, new Boolean(n61Creator), A61Creator, new Boolean(n62Remark), A62Remark, new Boolean(n63U_ItemCode), A63U_ItemCode, new Boolean(n64U_ItemName), A64U_ItemName, new Boolean(n65U_WhsCode), A65U_WhsCode, new Boolean(n66U_WhsDest), A66U_WhsDest, new Boolean(n67U_NumTras), A67U_NumTras, new Boolean(n68U_NumCon), A68U_NumCon, new Boolean(n69U_NumMusd), A69U_NumMusd, new Boolean(n70U_NoLote), A70U_NoLote, new Boolean(n71U_CorrLote), new Integer(A71U_CorrLote), new Boolean(n72U_CorrAnal), new Integer(A72U_CorrAnal), new Boolean(n73U_Cantidad), new Long(A73U_Cantidad), new Boolean(n74U_Bultos), new Integer(A74U_Bultos), new Boolean(n75U_BultosMu), new Integer(A75U_BultosMu), new Boolean(n76U_FecIngr), A76U_FecIngr, new Boolean(n77U_FecUltIn), A77U_FecUltIn, new Boolean(n78U_UM), A78U_UM, new Boolean(n79U_NoDoc), new Integer(A79U_NoDoc), new Boolean(n80U_FecContr), A80U_FecContr, new Boolean(n81U_FecIni), A81U_FecIni, new Boolean(n82U_FecFin), A82U_FecFin, new Boolean(n83U_Usuario), A83U_Usuario, new Boolean(n84U_DocOrig), new Integer(A84U_DocOrig), new Boolean(n85UVID_CONTROLCHU_Estado), A85UVID_CONTROLCHU_Estado, new Boolean(n86U_Traslado), A86U_Traslado, new Boolean(n87U_TipResul), A87U_TipResul, new Boolean(n88U_ContraMu), A88U_ContraMu, new Boolean(n89U_CoMuSize), new Long(A89U_CoMuSize), new Boolean(n90U_MuestDes), A90U_MuestDes, new Boolean(n91U_MuDeSize), new Long(A91U_MuDeSize), new Boolean(n92U_CtaCalid), A92U_CtaCalid, new Boolean(n93U_CCCode), A93U_CCCode, new Boolean(n94U_PrjCode), A94U_PrjCode, new Boolean(n95UVID_CONTROLCHU_Comment), A95UVID_CONTROLCHU_Comment, new Boolean(n96U_AtrQ1), new Long(A96U_AtrQ1), new Boolean(n97U_AtrQ2), new Long(A97U_AtrQ2), new Boolean(n98U_AtrQ3), new Long(A98U_AtrQ3), new Boolean(n99U_AtrQ4), new Long(A99U_AtrQ4), new Boolean(n100U_AtrT1), A100U_AtrT1, new Boolean(n101U_AtrT2), A101U_AtrT2, new Boolean(n102U_AtrT3), A102U_AtrT3, new Boolean(n103U_AtrT4), A103U_AtrT4, new Boolean(n104U_Reanalis), A104U_Reanalis,
                  new Boolean(n105U_NroOF), new Integer(A105U_NroOF), new Integer(A43UVID_CONTROLCHDocEntry)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_CONTROLCH") ;
                  if ( (pr_fusquim_sap.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_CONTROLCH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate045( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption040( ) ;
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
         endLevel045( ) ;
      }
      closeExtendedTableCursors045( ) ;
   }

   public void deferredUpdate045( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate045( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency045( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls045( ) ;
         afterConfirm045( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete045( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000410 */
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
                        initAll045( ) ;
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
                     resetCaption040( ) ;
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
      endLevel045( ) ;
      Gx_mode = sMode5 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls045( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel045( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_fusquim_sap.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete045( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "uvid_controlch");
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "uvid_controlch");
         if ( AnyError == 0 )
         {
            confirmValues040( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "uvid_controlch");
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "uvid_controlch");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart045( )
   {
      /* Using cursor T000411 */
      pr_fusquim_sap.execute(9);
      RcdFound5 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A43UVID_CONTROLCHDocEntry = T000411_A43UVID_CONTROLCHDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext045( )
   {
      /* Scan next routine */
      pr_fusquim_sap.readNext(9);
      RcdFound5 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A43UVID_CONTROLCHDocEntry = T000411_A43UVID_CONTROLCHDocEntry[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
      }
   }

   public void scanEnd045( )
   {
      pr_fusquim_sap.close(9);
   }

   public void afterConfirm045( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert045( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate045( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete045( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete045( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate045( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes045( )
   {
      edtUVID_CONTROLCHDocEntry_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCHDocEntry_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCHDocEntry_Enabled, 5, 0)), true);
      edtDocNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocNum_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocNum_Enabled, 5, 0)), true);
      edtPeriod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPeriod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPeriod_Enabled, 5, 0)), true);
      edtInstance_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInstance_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInstance_Enabled, 5, 0)), true);
      edtSeries_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSeries_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSeries_Enabled, 5, 0)), true);
      edtHandwrtten_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHandwrtten_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtHandwrtten_Enabled, 5, 0)), true);
      edtCanceled_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCanceled_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCanceled_Enabled, 5, 0)), true);
      edtUVID_CONTROLCHObject_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCHObject_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCHObject_Enabled, 5, 0)), true);
      edtUVID_CONTROLCHLogInst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCHLogInst_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCHLogInst_Enabled, 5, 0)), true);
      edtUserSign_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUserSign_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUserSign_Enabled, 5, 0)), true);
      edtTransfered_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransfered_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTransfered_Enabled, 5, 0)), true);
      edtStatus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStatus_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtStatus_Enabled, 5, 0)), true);
      edtCreateDate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCreateDate_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCreateDate_Enabled, 5, 0)), true);
      edtCreateTime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCreateTime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCreateTime_Enabled, 5, 0)), true);
      edtUpdateDate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUpdateDate_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUpdateDate_Enabled, 5, 0)), true);
      edtUpdateTime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUpdateTime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUpdateTime_Enabled, 5, 0)), true);
      edtDataSource_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDataSource_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDataSource_Enabled, 5, 0)), true);
      edtRequestStatus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRequestStatus_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRequestStatus_Enabled, 5, 0)), true);
      edtCreator_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCreator_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCreator_Enabled, 5, 0)), true);
      edtRemark_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRemark_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRemark_Enabled, 5, 0)), true);
      edtU_ItemCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_ItemCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_ItemCode_Enabled, 5, 0)), true);
      edtU_ItemName_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_ItemName_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_ItemName_Enabled, 5, 0)), true);
      edtU_WhsCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_WhsCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_WhsCode_Enabled, 5, 0)), true);
      edtU_WhsDest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_WhsDest_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_WhsDest_Enabled, 5, 0)), true);
      edtU_NumTras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_NumTras_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_NumTras_Enabled, 5, 0)), true);
      edtU_NumCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_NumCon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_NumCon_Enabled, 5, 0)), true);
      edtU_NumMusd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_NumMusd_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_NumMusd_Enabled, 5, 0)), true);
      edtU_NoLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_NoLote_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_NoLote_Enabled, 5, 0)), true);
      edtU_CorrLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CorrLote_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CorrLote_Enabled, 5, 0)), true);
      edtU_CorrAnal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CorrAnal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CorrAnal_Enabled, 5, 0)), true);
      edtU_Cantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Cantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Cantidad_Enabled, 5, 0)), true);
      edtU_Bultos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Bultos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Bultos_Enabled, 5, 0)), true);
      edtU_BultosMu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_BultosMu_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_BultosMu_Enabled, 5, 0)), true);
      edtU_FecIngr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_FecIngr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_FecIngr_Enabled, 5, 0)), true);
      edtU_FecUltIn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_FecUltIn_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_FecUltIn_Enabled, 5, 0)), true);
      edtU_UM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_UM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_UM_Enabled, 5, 0)), true);
      edtU_NoDoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_NoDoc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_NoDoc_Enabled, 5, 0)), true);
      edtU_FecContr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_FecContr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_FecContr_Enabled, 5, 0)), true);
      edtU_FecIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_FecIni_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_FecIni_Enabled, 5, 0)), true);
      edtU_FecFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_FecFin_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_FecFin_Enabled, 5, 0)), true);
      edtU_Usuario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Usuario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Usuario_Enabled, 5, 0)), true);
      edtU_DocOrig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_DocOrig_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_DocOrig_Enabled, 5, 0)), true);
      edtUVID_CONTROLCHU_Estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCHU_Estado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCHU_Estado_Enabled, 5, 0)), true);
      edtU_Traslado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Traslado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Traslado_Enabled, 5, 0)), true);
      edtU_TipResul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_TipResul_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_TipResul_Enabled, 5, 0)), true);
      edtU_ContraMu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_ContraMu_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_ContraMu_Enabled, 5, 0)), true);
      edtU_CoMuSize_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CoMuSize_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CoMuSize_Enabled, 5, 0)), true);
      edtU_MuestDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_MuestDes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_MuestDes_Enabled, 5, 0)), true);
      edtU_MuDeSize_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_MuDeSize_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_MuDeSize_Enabled, 5, 0)), true);
      edtU_CtaCalid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CtaCalid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CtaCalid_Enabled, 5, 0)), true);
      edtU_CCCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_CCCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_CCCode_Enabled, 5, 0)), true);
      edtU_PrjCode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_PrjCode_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_PrjCode_Enabled, 5, 0)), true);
      edtUVID_CONTROLCHU_Comment_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUVID_CONTROLCHU_Comment_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUVID_CONTROLCHU_Comment_Enabled, 5, 0)), true);
      edtU_AtrQ1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_AtrQ1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_AtrQ1_Enabled, 5, 0)), true);
      edtU_AtrQ2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_AtrQ2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_AtrQ2_Enabled, 5, 0)), true);
      edtU_AtrQ3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_AtrQ3_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_AtrQ3_Enabled, 5, 0)), true);
      edtU_AtrQ4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_AtrQ4_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_AtrQ4_Enabled, 5, 0)), true);
      edtU_AtrT1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_AtrT1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_AtrT1_Enabled, 5, 0)), true);
      edtU_AtrT2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_AtrT2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_AtrT2_Enabled, 5, 0)), true);
      edtU_AtrT3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_AtrT3_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_AtrT3_Enabled, 5, 0)), true);
      edtU_AtrT4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_AtrT4_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_AtrT4_Enabled, 5, 0)), true);
      edtU_Reanalis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_Reanalis_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_Reanalis_Enabled, 5, 0)), true);
      edtU_NroOF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtU_NroOF_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtU_NroOF_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues040( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210231860");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.uvid_controlch") +"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z44DocNum", GXutil.ltrim( localUtil.ntoc( Z44DocNum, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z45Period", GXutil.ltrim( localUtil.ntoc( Z45Period, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z46Instance", GXutil.ltrim( localUtil.ntoc( Z46Instance, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z47Series", GXutil.ltrim( localUtil.ntoc( Z47Series, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z48Handwrtten", GXutil.rtrim( Z48Handwrtten));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z49Canceled", GXutil.rtrim( Z49Canceled));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z50UVID_CONTROLCHObject", Z50UVID_CONTROLCHObject);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z51UVID_CONTROLCHLogInst", GXutil.ltrim( localUtil.ntoc( Z51UVID_CONTROLCHLogInst, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z52UserSign", GXutil.ltrim( localUtil.ntoc( Z52UserSign, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z53Transfered", GXutil.rtrim( Z53Transfered));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z54Status", GXutil.rtrim( Z54Status));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z55CreateDate", localUtil.ttoc( Z55CreateDate, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z56CreateTime", GXutil.ltrim( localUtil.ntoc( Z56CreateTime, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z57UpdateDate", localUtil.ttoc( Z57UpdateDate, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z58UpdateTime", GXutil.ltrim( localUtil.ntoc( Z58UpdateTime, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z59DataSource", GXutil.rtrim( Z59DataSource));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z60RequestStatus", GXutil.rtrim( Z60RequestStatus));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z61Creator", Z61Creator);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z63U_ItemCode", Z63U_ItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z64U_ItemName", Z64U_ItemName);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z65U_WhsCode", Z65U_WhsCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z66U_WhsDest", Z66U_WhsDest);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z67U_NumTras", Z67U_NumTras);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z68U_NumCon", Z68U_NumCon);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z69U_NumMusd", Z69U_NumMusd);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z70U_NoLote", Z70U_NoLote);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z71U_CorrLote", GXutil.ltrim( localUtil.ntoc( Z71U_CorrLote, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z72U_CorrAnal", GXutil.ltrim( localUtil.ntoc( Z72U_CorrAnal, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z73U_Cantidad", GXutil.ltrim( localUtil.ntoc( Z73U_Cantidad, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z74U_Bultos", GXutil.ltrim( localUtil.ntoc( Z74U_Bultos, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z75U_BultosMu", GXutil.ltrim( localUtil.ntoc( Z75U_BultosMu, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z76U_FecIngr", localUtil.ttoc( Z76U_FecIngr, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z77U_FecUltIn", localUtil.ttoc( Z77U_FecUltIn, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z78U_UM", Z78U_UM);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z79U_NoDoc", GXutil.ltrim( localUtil.ntoc( Z79U_NoDoc, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z80U_FecContr", localUtil.ttoc( Z80U_FecContr, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z81U_FecIni", localUtil.ttoc( Z81U_FecIni, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z82U_FecFin", localUtil.ttoc( Z82U_FecFin, 10, 8, 0, 0, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z83U_Usuario", Z83U_Usuario);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z84U_DocOrig", GXutil.ltrim( localUtil.ntoc( Z84U_DocOrig, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z85UVID_CONTROLCHU_Estado", GXutil.rtrim( Z85UVID_CONTROLCHU_Estado));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z86U_Traslado", GXutil.rtrim( Z86U_Traslado));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z87U_TipResul", Z87U_TipResul);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z88U_ContraMu", GXutil.rtrim( Z88U_ContraMu));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z89U_CoMuSize", GXutil.ltrim( localUtil.ntoc( Z89U_CoMuSize, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z90U_MuestDes", GXutil.rtrim( Z90U_MuestDes));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z91U_MuDeSize", GXutil.ltrim( localUtil.ntoc( Z91U_MuDeSize, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z92U_CtaCalid", Z92U_CtaCalid);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z93U_CCCode", Z93U_CCCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z94U_PrjCode", Z94U_PrjCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z95UVID_CONTROLCHU_Comment", Z95UVID_CONTROLCHU_Comment);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z96U_AtrQ1", GXutil.ltrim( localUtil.ntoc( Z96U_AtrQ1, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z97U_AtrQ2", GXutil.ltrim( localUtil.ntoc( Z97U_AtrQ2, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z98U_AtrQ3", GXutil.ltrim( localUtil.ntoc( Z98U_AtrQ3, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z99U_AtrQ4", GXutil.ltrim( localUtil.ntoc( Z99U_AtrQ4, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z100U_AtrT1", Z100U_AtrT1);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z101U_AtrT2", Z101U_AtrT2);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z102U_AtrT3", Z102U_AtrT3);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z103U_AtrT4", Z103U_AtrT4);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z104U_Reanalis", GXutil.rtrim( Z104U_Reanalis));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z105U_NroOF", GXutil.ltrim( localUtil.ntoc( Z105U_NroOF, (byte)(9), (byte)(0), ",", "")));
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
      return formatLink("com.wms.uvid_controlch")  ;
   }

   public String getPgmname( )
   {
      return "UVID_CONTROLCH" ;
   }

   public String getPgmdesc( )
   {
      return "UVID_CONTROLCH" ;
   }

   public void initializeNonKey045( )
   {
      A44DocNum = 0 ;
      n44DocNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44DocNum", GXutil.ltrim( GXutil.str( A44DocNum, 9, 0)));
      n44DocNum = ((0==A44DocNum) ? true : false) ;
      A45Period = 0 ;
      n45Period = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A45Period", GXutil.ltrim( GXutil.str( A45Period, 9, 0)));
      n45Period = ((0==A45Period) ? true : false) ;
      A46Instance = (short)(0) ;
      n46Instance = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A46Instance", GXutil.ltrim( GXutil.str( A46Instance, 4, 0)));
      n46Instance = ((0==A46Instance) ? true : false) ;
      A47Series = 0 ;
      n47Series = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A47Series", GXutil.ltrim( GXutil.str( A47Series, 9, 0)));
      n47Series = ((0==A47Series) ? true : false) ;
      A48Handwrtten = "" ;
      n48Handwrtten = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A48Handwrtten", A48Handwrtten);
      n48Handwrtten = ((GXutil.strcmp("", A48Handwrtten)==0) ? true : false) ;
      A49Canceled = "" ;
      n49Canceled = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A49Canceled", A49Canceled);
      n49Canceled = ((GXutil.strcmp("", A49Canceled)==0) ? true : false) ;
      A50UVID_CONTROLCHObject = "" ;
      n50UVID_CONTROLCHObject = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A50UVID_CONTROLCHObject", A50UVID_CONTROLCHObject);
      n50UVID_CONTROLCHObject = ((GXutil.strcmp("", A50UVID_CONTROLCHObject)==0) ? true : false) ;
      A51UVID_CONTROLCHLogInst = 0 ;
      n51UVID_CONTROLCHLogInst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A51UVID_CONTROLCHLogInst", GXutil.ltrim( GXutil.str( A51UVID_CONTROLCHLogInst, 9, 0)));
      n51UVID_CONTROLCHLogInst = ((0==A51UVID_CONTROLCHLogInst) ? true : false) ;
      A52UserSign = 0 ;
      n52UserSign = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A52UserSign", GXutil.ltrim( GXutil.str( A52UserSign, 9, 0)));
      n52UserSign = ((0==A52UserSign) ? true : false) ;
      A53Transfered = "" ;
      n53Transfered = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A53Transfered", A53Transfered);
      n53Transfered = ((GXutil.strcmp("", A53Transfered)==0) ? true : false) ;
      A54Status = "" ;
      n54Status = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A54Status", A54Status);
      n54Status = ((GXutil.strcmp("", A54Status)==0) ? true : false) ;
      A55CreateDate = GXutil.resetTime( GXutil.nullDate() );
      n55CreateDate = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A55CreateDate", localUtil.ttoc( A55CreateDate, 10, 8, 0, 3, "/", ":", " "));
      n55CreateDate = (GXutil.dateCompare(GXutil.nullDate(), A55CreateDate) ? true : false) ;
      A56CreateTime = (short)(0) ;
      n56CreateTime = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A56CreateTime", GXutil.ltrim( GXutil.str( A56CreateTime, 4, 0)));
      n56CreateTime = ((0==A56CreateTime) ? true : false) ;
      A57UpdateDate = GXutil.resetTime( GXutil.nullDate() );
      n57UpdateDate = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A57UpdateDate", localUtil.ttoc( A57UpdateDate, 10, 8, 0, 3, "/", ":", " "));
      n57UpdateDate = (GXutil.dateCompare(GXutil.nullDate(), A57UpdateDate) ? true : false) ;
      A58UpdateTime = (short)(0) ;
      n58UpdateTime = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A58UpdateTime", GXutil.ltrim( GXutil.str( A58UpdateTime, 4, 0)));
      n58UpdateTime = ((0==A58UpdateTime) ? true : false) ;
      A59DataSource = "" ;
      n59DataSource = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A59DataSource", A59DataSource);
      n59DataSource = ((GXutil.strcmp("", A59DataSource)==0) ? true : false) ;
      A60RequestStatus = "" ;
      n60RequestStatus = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A60RequestStatus", A60RequestStatus);
      n60RequestStatus = ((GXutil.strcmp("", A60RequestStatus)==0) ? true : false) ;
      A61Creator = "" ;
      n61Creator = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A61Creator", A61Creator);
      n61Creator = ((GXutil.strcmp("", A61Creator)==0) ? true : false) ;
      A62Remark = "" ;
      n62Remark = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A62Remark", A62Remark);
      n62Remark = ((GXutil.strcmp("", A62Remark)==0) ? true : false) ;
      A63U_ItemCode = "" ;
      n63U_ItemCode = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A63U_ItemCode", A63U_ItemCode);
      n63U_ItemCode = ((GXutil.strcmp("", A63U_ItemCode)==0) ? true : false) ;
      A64U_ItemName = "" ;
      n64U_ItemName = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A64U_ItemName", A64U_ItemName);
      n64U_ItemName = ((GXutil.strcmp("", A64U_ItemName)==0) ? true : false) ;
      A65U_WhsCode = "" ;
      n65U_WhsCode = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65U_WhsCode", A65U_WhsCode);
      n65U_WhsCode = ((GXutil.strcmp("", A65U_WhsCode)==0) ? true : false) ;
      A66U_WhsDest = "" ;
      n66U_WhsDest = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A66U_WhsDest", A66U_WhsDest);
      n66U_WhsDest = ((GXutil.strcmp("", A66U_WhsDest)==0) ? true : false) ;
      A67U_NumTras = "" ;
      n67U_NumTras = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A67U_NumTras", A67U_NumTras);
      n67U_NumTras = ((GXutil.strcmp("", A67U_NumTras)==0) ? true : false) ;
      A68U_NumCon = "" ;
      n68U_NumCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A68U_NumCon", A68U_NumCon);
      n68U_NumCon = ((GXutil.strcmp("", A68U_NumCon)==0) ? true : false) ;
      A69U_NumMusd = "" ;
      n69U_NumMusd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69U_NumMusd", A69U_NumMusd);
      n69U_NumMusd = ((GXutil.strcmp("", A69U_NumMusd)==0) ? true : false) ;
      A70U_NoLote = "" ;
      n70U_NoLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A70U_NoLote", A70U_NoLote);
      n70U_NoLote = ((GXutil.strcmp("", A70U_NoLote)==0) ? true : false) ;
      A71U_CorrLote = 0 ;
      n71U_CorrLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A71U_CorrLote", GXutil.ltrim( GXutil.str( A71U_CorrLote, 9, 0)));
      n71U_CorrLote = ((0==A71U_CorrLote) ? true : false) ;
      A72U_CorrAnal = 0 ;
      n72U_CorrAnal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A72U_CorrAnal", GXutil.ltrim( GXutil.str( A72U_CorrAnal, 9, 0)));
      n72U_CorrAnal = ((0==A72U_CorrAnal) ? true : false) ;
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
      A76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      n76U_FecIngr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A76U_FecIngr", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
      n76U_FecIngr = (GXutil.dateCompare(GXutil.nullDate(), A76U_FecIngr) ? true : false) ;
      A77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      n77U_FecUltIn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A77U_FecUltIn", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
      n77U_FecUltIn = (GXutil.dateCompare(GXutil.nullDate(), A77U_FecUltIn) ? true : false) ;
      A78U_UM = "" ;
      n78U_UM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A78U_UM", A78U_UM);
      n78U_UM = ((GXutil.strcmp("", A78U_UM)==0) ? true : false) ;
      A79U_NoDoc = 0 ;
      n79U_NoDoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A79U_NoDoc", GXutil.ltrim( GXutil.str( A79U_NoDoc, 9, 0)));
      n79U_NoDoc = ((0==A79U_NoDoc) ? true : false) ;
      A80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      n80U_FecContr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A80U_FecContr", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
      n80U_FecContr = (GXutil.dateCompare(GXutil.nullDate(), A80U_FecContr) ? true : false) ;
      A81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      n81U_FecIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A81U_FecIni", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
      n81U_FecIni = (GXutil.dateCompare(GXutil.nullDate(), A81U_FecIni) ? true : false) ;
      A82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      n82U_FecFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A82U_FecFin", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
      n82U_FecFin = (GXutil.dateCompare(GXutil.nullDate(), A82U_FecFin) ? true : false) ;
      A83U_Usuario = "" ;
      n83U_Usuario = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A83U_Usuario", A83U_Usuario);
      n83U_Usuario = ((GXutil.strcmp("", A83U_Usuario)==0) ? true : false) ;
      A84U_DocOrig = 0 ;
      n84U_DocOrig = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A84U_DocOrig", GXutil.ltrim( GXutil.str( A84U_DocOrig, 9, 0)));
      n84U_DocOrig = ((0==A84U_DocOrig) ? true : false) ;
      A85UVID_CONTROLCHU_Estado = "" ;
      n85UVID_CONTROLCHU_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A85UVID_CONTROLCHU_Estado", A85UVID_CONTROLCHU_Estado);
      n85UVID_CONTROLCHU_Estado = ((GXutil.strcmp("", A85UVID_CONTROLCHU_Estado)==0) ? true : false) ;
      A86U_Traslado = "" ;
      n86U_Traslado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A86U_Traslado", A86U_Traslado);
      n86U_Traslado = ((GXutil.strcmp("", A86U_Traslado)==0) ? true : false) ;
      A87U_TipResul = "" ;
      n87U_TipResul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A87U_TipResul", A87U_TipResul);
      n87U_TipResul = ((GXutil.strcmp("", A87U_TipResul)==0) ? true : false) ;
      A88U_ContraMu = "" ;
      n88U_ContraMu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A88U_ContraMu", A88U_ContraMu);
      n88U_ContraMu = ((GXutil.strcmp("", A88U_ContraMu)==0) ? true : false) ;
      A89U_CoMuSize = 0 ;
      n89U_CoMuSize = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A89U_CoMuSize", GXutil.ltrim( GXutil.str( A89U_CoMuSize, 18, 0)));
      n89U_CoMuSize = ((0==A89U_CoMuSize) ? true : false) ;
      A90U_MuestDes = "" ;
      n90U_MuestDes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A90U_MuestDes", A90U_MuestDes);
      n90U_MuestDes = ((GXutil.strcmp("", A90U_MuestDes)==0) ? true : false) ;
      A91U_MuDeSize = 0 ;
      n91U_MuDeSize = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A91U_MuDeSize", GXutil.ltrim( GXutil.str( A91U_MuDeSize, 18, 0)));
      n91U_MuDeSize = ((0==A91U_MuDeSize) ? true : false) ;
      A92U_CtaCalid = "" ;
      n92U_CtaCalid = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A92U_CtaCalid", A92U_CtaCalid);
      n92U_CtaCalid = ((GXutil.strcmp("", A92U_CtaCalid)==0) ? true : false) ;
      A93U_CCCode = "" ;
      n93U_CCCode = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A93U_CCCode", A93U_CCCode);
      n93U_CCCode = ((GXutil.strcmp("", A93U_CCCode)==0) ? true : false) ;
      A94U_PrjCode = "" ;
      n94U_PrjCode = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A94U_PrjCode", A94U_PrjCode);
      n94U_PrjCode = ((GXutil.strcmp("", A94U_PrjCode)==0) ? true : false) ;
      A95UVID_CONTROLCHU_Comment = "" ;
      n95UVID_CONTROLCHU_Comment = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A95UVID_CONTROLCHU_Comment", A95UVID_CONTROLCHU_Comment);
      n95UVID_CONTROLCHU_Comment = ((GXutil.strcmp("", A95UVID_CONTROLCHU_Comment)==0) ? true : false) ;
      A96U_AtrQ1 = 0 ;
      n96U_AtrQ1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A96U_AtrQ1", GXutil.ltrim( GXutil.str( A96U_AtrQ1, 18, 0)));
      n96U_AtrQ1 = ((0==A96U_AtrQ1) ? true : false) ;
      A97U_AtrQ2 = 0 ;
      n97U_AtrQ2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A97U_AtrQ2", GXutil.ltrim( GXutil.str( A97U_AtrQ2, 18, 0)));
      n97U_AtrQ2 = ((0==A97U_AtrQ2) ? true : false) ;
      A98U_AtrQ3 = 0 ;
      n98U_AtrQ3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A98U_AtrQ3", GXutil.ltrim( GXutil.str( A98U_AtrQ3, 18, 0)));
      n98U_AtrQ3 = ((0==A98U_AtrQ3) ? true : false) ;
      A99U_AtrQ4 = 0 ;
      n99U_AtrQ4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A99U_AtrQ4", GXutil.ltrim( GXutil.str( A99U_AtrQ4, 18, 0)));
      n99U_AtrQ4 = ((0==A99U_AtrQ4) ? true : false) ;
      A100U_AtrT1 = "" ;
      n100U_AtrT1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A100U_AtrT1", A100U_AtrT1);
      n100U_AtrT1 = ((GXutil.strcmp("", A100U_AtrT1)==0) ? true : false) ;
      A101U_AtrT2 = "" ;
      n101U_AtrT2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A101U_AtrT2", A101U_AtrT2);
      n101U_AtrT2 = ((GXutil.strcmp("", A101U_AtrT2)==0) ? true : false) ;
      A102U_AtrT3 = "" ;
      n102U_AtrT3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A102U_AtrT3", A102U_AtrT3);
      n102U_AtrT3 = ((GXutil.strcmp("", A102U_AtrT3)==0) ? true : false) ;
      A103U_AtrT4 = "" ;
      n103U_AtrT4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A103U_AtrT4", A103U_AtrT4);
      n103U_AtrT4 = ((GXutil.strcmp("", A103U_AtrT4)==0) ? true : false) ;
      A104U_Reanalis = "" ;
      n104U_Reanalis = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A104U_Reanalis", A104U_Reanalis);
      n104U_Reanalis = ((GXutil.strcmp("", A104U_Reanalis)==0) ? true : false) ;
      A105U_NroOF = 0 ;
      n105U_NroOF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A105U_NroOF", GXutil.ltrim( GXutil.str( A105U_NroOF, 9, 0)));
      n105U_NroOF = ((0==A105U_NroOF) ? true : false) ;
      Z44DocNum = 0 ;
      Z45Period = 0 ;
      Z46Instance = (short)(0) ;
      Z47Series = 0 ;
      Z48Handwrtten = "" ;
      Z49Canceled = "" ;
      Z50UVID_CONTROLCHObject = "" ;
      Z51UVID_CONTROLCHLogInst = 0 ;
      Z52UserSign = 0 ;
      Z53Transfered = "" ;
      Z54Status = "" ;
      Z55CreateDate = GXutil.resetTime( GXutil.nullDate() );
      Z56CreateTime = (short)(0) ;
      Z57UpdateDate = GXutil.resetTime( GXutil.nullDate() );
      Z58UpdateTime = (short)(0) ;
      Z59DataSource = "" ;
      Z60RequestStatus = "" ;
      Z61Creator = "" ;
      Z63U_ItemCode = "" ;
      Z64U_ItemName = "" ;
      Z65U_WhsCode = "" ;
      Z66U_WhsDest = "" ;
      Z67U_NumTras = "" ;
      Z68U_NumCon = "" ;
      Z69U_NumMusd = "" ;
      Z70U_NoLote = "" ;
      Z71U_CorrLote = 0 ;
      Z72U_CorrAnal = 0 ;
      Z73U_Cantidad = 0 ;
      Z74U_Bultos = 0 ;
      Z75U_BultosMu = 0 ;
      Z76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      Z77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      Z78U_UM = "" ;
      Z79U_NoDoc = 0 ;
      Z80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      Z81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      Z82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      Z83U_Usuario = "" ;
      Z84U_DocOrig = 0 ;
      Z85UVID_CONTROLCHU_Estado = "" ;
      Z86U_Traslado = "" ;
      Z87U_TipResul = "" ;
      Z88U_ContraMu = "" ;
      Z89U_CoMuSize = 0 ;
      Z90U_MuestDes = "" ;
      Z91U_MuDeSize = 0 ;
      Z92U_CtaCalid = "" ;
      Z93U_CCCode = "" ;
      Z94U_PrjCode = "" ;
      Z95UVID_CONTROLCHU_Comment = "" ;
      Z96U_AtrQ1 = 0 ;
      Z97U_AtrQ2 = 0 ;
      Z98U_AtrQ3 = 0 ;
      Z99U_AtrQ4 = 0 ;
      Z100U_AtrT1 = "" ;
      Z101U_AtrT2 = "" ;
      Z102U_AtrT3 = "" ;
      Z103U_AtrT4 = "" ;
      Z104U_Reanalis = "" ;
      Z105U_NroOF = 0 ;
   }

   public void initAll045( )
   {
      A43UVID_CONTROLCHDocEntry = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A43UVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( A43UVID_CONTROLCHDocEntry, 9, 0)));
      initializeNonKey045( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210231936");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("uvid_controlch.js", "?201811210231936");
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
      edtDocNum_Internalname = "DOCNUM" ;
      edtPeriod_Internalname = "PERIOD" ;
      edtInstance_Internalname = "INSTANCE" ;
      edtSeries_Internalname = "SERIES" ;
      edtHandwrtten_Internalname = "HANDWRTTEN" ;
      edtCanceled_Internalname = "CANCELED" ;
      edtUVID_CONTROLCHObject_Internalname = "UVID_CONTROLCHOBJECT" ;
      edtUVID_CONTROLCHLogInst_Internalname = "UVID_CONTROLCHLOGINST" ;
      edtUserSign_Internalname = "USERSIGN" ;
      edtTransfered_Internalname = "TRANSFERED" ;
      edtStatus_Internalname = "STATUS" ;
      edtCreateDate_Internalname = "CREATEDATE" ;
      edtCreateTime_Internalname = "CREATETIME" ;
      edtUpdateDate_Internalname = "UPDATEDATE" ;
      edtUpdateTime_Internalname = "UPDATETIME" ;
      edtDataSource_Internalname = "DATASOURCE" ;
      edtRequestStatus_Internalname = "REQUESTSTATUS" ;
      edtCreator_Internalname = "CREATOR" ;
      edtRemark_Internalname = "REMARK" ;
      edtU_ItemCode_Internalname = "U_ITEMCODE" ;
      edtU_ItemName_Internalname = "U_ITEMNAME" ;
      edtU_WhsCode_Internalname = "U_WHSCODE" ;
      edtU_WhsDest_Internalname = "U_WHSDEST" ;
      edtU_NumTras_Internalname = "U_NUMTRAS" ;
      edtU_NumCon_Internalname = "U_NUMCON" ;
      edtU_NumMusd_Internalname = "U_NUMMUSD" ;
      edtU_NoLote_Internalname = "U_NOLOTE" ;
      edtU_CorrLote_Internalname = "U_CORRLOTE" ;
      edtU_CorrAnal_Internalname = "U_CORRANAL" ;
      edtU_Cantidad_Internalname = "U_CANTIDAD" ;
      edtU_Bultos_Internalname = "U_BULTOS" ;
      edtU_BultosMu_Internalname = "U_BULTOSMU" ;
      edtU_FecIngr_Internalname = "U_FECINGR" ;
      edtU_FecUltIn_Internalname = "U_FECULTIN" ;
      edtU_UM_Internalname = "U_UM" ;
      edtU_NoDoc_Internalname = "U_NODOC" ;
      edtU_FecContr_Internalname = "U_FECCONTR" ;
      edtU_FecIni_Internalname = "U_FECINI" ;
      edtU_FecFin_Internalname = "U_FECFIN" ;
      edtU_Usuario_Internalname = "U_USUARIO" ;
      edtU_DocOrig_Internalname = "U_DOCORIG" ;
      edtUVID_CONTROLCHU_Estado_Internalname = "UVID_CONTROLCHU_ESTADO" ;
      edtU_Traslado_Internalname = "U_TRASLADO" ;
      edtU_TipResul_Internalname = "U_TIPRESUL" ;
      edtU_ContraMu_Internalname = "U_CONTRAMU" ;
      edtU_CoMuSize_Internalname = "U_COMUSIZE" ;
      edtU_MuestDes_Internalname = "U_MUESTDES" ;
      edtU_MuDeSize_Internalname = "U_MUDESIZE" ;
      edtU_CtaCalid_Internalname = "U_CTACALID" ;
      edtU_CCCode_Internalname = "U_CCCODE" ;
      edtU_PrjCode_Internalname = "U_PRJCODE" ;
      edtUVID_CONTROLCHU_Comment_Internalname = "UVID_CONTROLCHU_COMMENT" ;
      edtU_AtrQ1_Internalname = "U_ATRQ1" ;
      edtU_AtrQ2_Internalname = "U_ATRQ2" ;
      edtU_AtrQ3_Internalname = "U_ATRQ3" ;
      edtU_AtrQ4_Internalname = "U_ATRQ4" ;
      edtU_AtrT1_Internalname = "U_ATRT1" ;
      edtU_AtrT2_Internalname = "U_ATRT2" ;
      edtU_AtrT3_Internalname = "U_ATRT3" ;
      edtU_AtrT4_Internalname = "U_ATRT4" ;
      edtU_Reanalis_Internalname = "U_REANALIS" ;
      edtU_NroOF_Internalname = "U_NROOF" ;
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
      Form.setCaption( "UVID_CONTROLCH" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtU_NroOF_Jsonclick = "" ;
      edtU_NroOF_Enabled = 1 ;
      edtU_Reanalis_Jsonclick = "" ;
      edtU_Reanalis_Enabled = 1 ;
      edtU_AtrT4_Enabled = 1 ;
      edtU_AtrT3_Enabled = 1 ;
      edtU_AtrT2_Enabled = 1 ;
      edtU_AtrT1_Enabled = 1 ;
      edtU_AtrQ4_Jsonclick = "" ;
      edtU_AtrQ4_Enabled = 1 ;
      edtU_AtrQ3_Jsonclick = "" ;
      edtU_AtrQ3_Enabled = 1 ;
      edtU_AtrQ2_Jsonclick = "" ;
      edtU_AtrQ2_Enabled = 1 ;
      edtU_AtrQ1_Jsonclick = "" ;
      edtU_AtrQ1_Enabled = 1 ;
      edtUVID_CONTROLCHU_Comment_Enabled = 1 ;
      edtU_PrjCode_Jsonclick = "" ;
      edtU_PrjCode_Enabled = 1 ;
      edtU_CCCode_Jsonclick = "" ;
      edtU_CCCode_Enabled = 1 ;
      edtU_CtaCalid_Jsonclick = "" ;
      edtU_CtaCalid_Enabled = 1 ;
      edtU_MuDeSize_Jsonclick = "" ;
      edtU_MuDeSize_Enabled = 1 ;
      edtU_MuestDes_Jsonclick = "" ;
      edtU_MuestDes_Enabled = 1 ;
      edtU_CoMuSize_Jsonclick = "" ;
      edtU_CoMuSize_Enabled = 1 ;
      edtU_ContraMu_Jsonclick = "" ;
      edtU_ContraMu_Enabled = 1 ;
      edtU_TipResul_Jsonclick = "" ;
      edtU_TipResul_Enabled = 1 ;
      edtU_Traslado_Jsonclick = "" ;
      edtU_Traslado_Enabled = 1 ;
      edtUVID_CONTROLCHU_Estado_Jsonclick = "" ;
      edtUVID_CONTROLCHU_Estado_Enabled = 1 ;
      edtU_DocOrig_Jsonclick = "" ;
      edtU_DocOrig_Enabled = 1 ;
      edtU_Usuario_Jsonclick = "" ;
      edtU_Usuario_Enabled = 1 ;
      edtU_FecFin_Jsonclick = "" ;
      edtU_FecFin_Enabled = 1 ;
      edtU_FecIni_Jsonclick = "" ;
      edtU_FecIni_Enabled = 1 ;
      edtU_FecContr_Jsonclick = "" ;
      edtU_FecContr_Enabled = 1 ;
      edtU_NoDoc_Jsonclick = "" ;
      edtU_NoDoc_Enabled = 1 ;
      edtU_UM_Jsonclick = "" ;
      edtU_UM_Enabled = 1 ;
      edtU_FecUltIn_Jsonclick = "" ;
      edtU_FecUltIn_Enabled = 1 ;
      edtU_FecIngr_Jsonclick = "" ;
      edtU_FecIngr_Enabled = 1 ;
      edtU_BultosMu_Jsonclick = "" ;
      edtU_BultosMu_Enabled = 1 ;
      edtU_Bultos_Jsonclick = "" ;
      edtU_Bultos_Enabled = 1 ;
      edtU_Cantidad_Jsonclick = "" ;
      edtU_Cantidad_Enabled = 1 ;
      edtU_CorrAnal_Jsonclick = "" ;
      edtU_CorrAnal_Enabled = 1 ;
      edtU_CorrLote_Jsonclick = "" ;
      edtU_CorrLote_Enabled = 1 ;
      edtU_NoLote_Jsonclick = "" ;
      edtU_NoLote_Enabled = 1 ;
      edtU_NumMusd_Jsonclick = "" ;
      edtU_NumMusd_Enabled = 1 ;
      edtU_NumCon_Jsonclick = "" ;
      edtU_NumCon_Enabled = 1 ;
      edtU_NumTras_Jsonclick = "" ;
      edtU_NumTras_Enabled = 1 ;
      edtU_WhsDest_Jsonclick = "" ;
      edtU_WhsDest_Enabled = 1 ;
      edtU_WhsCode_Jsonclick = "" ;
      edtU_WhsCode_Enabled = 1 ;
      edtU_ItemName_Jsonclick = "" ;
      edtU_ItemName_Enabled = 1 ;
      edtU_ItemCode_Jsonclick = "" ;
      edtU_ItemCode_Enabled = 1 ;
      edtRemark_Jsonclick = "" ;
      edtRemark_Enabled = 1 ;
      edtCreator_Jsonclick = "" ;
      edtCreator_Enabled = 1 ;
      edtRequestStatus_Jsonclick = "" ;
      edtRequestStatus_Enabled = 1 ;
      edtDataSource_Jsonclick = "" ;
      edtDataSource_Enabled = 1 ;
      edtUpdateTime_Jsonclick = "" ;
      edtUpdateTime_Enabled = 1 ;
      edtUpdateDate_Jsonclick = "" ;
      edtUpdateDate_Enabled = 1 ;
      edtCreateTime_Jsonclick = "" ;
      edtCreateTime_Enabled = 1 ;
      edtCreateDate_Jsonclick = "" ;
      edtCreateDate_Enabled = 1 ;
      edtStatus_Jsonclick = "" ;
      edtStatus_Enabled = 1 ;
      edtTransfered_Jsonclick = "" ;
      edtTransfered_Enabled = 1 ;
      edtUserSign_Jsonclick = "" ;
      edtUserSign_Enabled = 1 ;
      edtUVID_CONTROLCHLogInst_Jsonclick = "" ;
      edtUVID_CONTROLCHLogInst_Enabled = 1 ;
      edtUVID_CONTROLCHObject_Jsonclick = "" ;
      edtUVID_CONTROLCHObject_Enabled = 1 ;
      edtCanceled_Jsonclick = "" ;
      edtCanceled_Enabled = 1 ;
      edtHandwrtten_Jsonclick = "" ;
      edtHandwrtten_Enabled = 1 ;
      edtSeries_Jsonclick = "" ;
      edtSeries_Enabled = 1 ;
      edtInstance_Jsonclick = "" ;
      edtInstance_Enabled = 1 ;
      edtPeriod_Jsonclick = "" ;
      edtPeriod_Enabled = 1 ;
      edtDocNum_Jsonclick = "" ;
      edtDocNum_Enabled = 1 ;
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
      GX_FocusControl = edtDocNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Uvid_controlchdocentry( int GX_Parm1 ,
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
                                             String GX_Parm25 ,
                                             String GX_Parm26 ,
                                             String GX_Parm27 ,
                                             String GX_Parm28 ,
                                             int GX_Parm29 ,
                                             int GX_Parm30 ,
                                             long GX_Parm31 ,
                                             int GX_Parm32 ,
                                             int GX_Parm33 ,
                                             java.util.Date GX_Parm34 ,
                                             java.util.Date GX_Parm35 ,
                                             String GX_Parm36 ,
                                             int GX_Parm37 ,
                                             java.util.Date GX_Parm38 ,
                                             java.util.Date GX_Parm39 ,
                                             java.util.Date GX_Parm40 ,
                                             String GX_Parm41 ,
                                             int GX_Parm42 ,
                                             String GX_Parm43 ,
                                             String GX_Parm44 ,
                                             String GX_Parm45 ,
                                             String GX_Parm46 ,
                                             long GX_Parm47 ,
                                             String GX_Parm48 ,
                                             long GX_Parm49 ,
                                             String GX_Parm50 ,
                                             String GX_Parm51 ,
                                             String GX_Parm52 ,
                                             String GX_Parm53 ,
                                             long GX_Parm54 ,
                                             long GX_Parm55 ,
                                             long GX_Parm56 ,
                                             long GX_Parm57 ,
                                             String GX_Parm58 ,
                                             String GX_Parm59 ,
                                             String GX_Parm60 ,
                                             String GX_Parm61 ,
                                             String GX_Parm62 ,
                                             int GX_Parm63 )
   {
      A43UVID_CONTROLCHDocEntry = GX_Parm1 ;
      A44DocNum = GX_Parm2 ;
      n44DocNum = false ;
      A45Period = GX_Parm3 ;
      n45Period = false ;
      A46Instance = GX_Parm4 ;
      n46Instance = false ;
      A47Series = GX_Parm5 ;
      n47Series = false ;
      A48Handwrtten = GX_Parm6 ;
      n48Handwrtten = false ;
      A49Canceled = GX_Parm7 ;
      n49Canceled = false ;
      A50UVID_CONTROLCHObject = GX_Parm8 ;
      n50UVID_CONTROLCHObject = false ;
      A51UVID_CONTROLCHLogInst = GX_Parm9 ;
      n51UVID_CONTROLCHLogInst = false ;
      A52UserSign = GX_Parm10 ;
      n52UserSign = false ;
      A53Transfered = GX_Parm11 ;
      n53Transfered = false ;
      A54Status = GX_Parm12 ;
      n54Status = false ;
      A55CreateDate = GX_Parm13 ;
      n55CreateDate = false ;
      A56CreateTime = GX_Parm14 ;
      n56CreateTime = false ;
      A57UpdateDate = GX_Parm15 ;
      n57UpdateDate = false ;
      A58UpdateTime = GX_Parm16 ;
      n58UpdateTime = false ;
      A59DataSource = GX_Parm17 ;
      n59DataSource = false ;
      A60RequestStatus = GX_Parm18 ;
      n60RequestStatus = false ;
      A61Creator = GX_Parm19 ;
      n61Creator = false ;
      A62Remark = GX_Parm20 ;
      n62Remark = false ;
      A63U_ItemCode = GX_Parm21 ;
      n63U_ItemCode = false ;
      A64U_ItemName = GX_Parm22 ;
      n64U_ItemName = false ;
      A65U_WhsCode = GX_Parm23 ;
      n65U_WhsCode = false ;
      A66U_WhsDest = GX_Parm24 ;
      n66U_WhsDest = false ;
      A67U_NumTras = GX_Parm25 ;
      n67U_NumTras = false ;
      A68U_NumCon = GX_Parm26 ;
      n68U_NumCon = false ;
      A69U_NumMusd = GX_Parm27 ;
      n69U_NumMusd = false ;
      A70U_NoLote = GX_Parm28 ;
      n70U_NoLote = false ;
      A71U_CorrLote = GX_Parm29 ;
      n71U_CorrLote = false ;
      A72U_CorrAnal = GX_Parm30 ;
      n72U_CorrAnal = false ;
      A73U_Cantidad = GX_Parm31 ;
      n73U_Cantidad = false ;
      A74U_Bultos = GX_Parm32 ;
      n74U_Bultos = false ;
      A75U_BultosMu = GX_Parm33 ;
      n75U_BultosMu = false ;
      A76U_FecIngr = GX_Parm34 ;
      n76U_FecIngr = false ;
      A77U_FecUltIn = GX_Parm35 ;
      n77U_FecUltIn = false ;
      A78U_UM = GX_Parm36 ;
      n78U_UM = false ;
      A79U_NoDoc = GX_Parm37 ;
      n79U_NoDoc = false ;
      A80U_FecContr = GX_Parm38 ;
      n80U_FecContr = false ;
      A81U_FecIni = GX_Parm39 ;
      n81U_FecIni = false ;
      A82U_FecFin = GX_Parm40 ;
      n82U_FecFin = false ;
      A83U_Usuario = GX_Parm41 ;
      n83U_Usuario = false ;
      A84U_DocOrig = GX_Parm42 ;
      n84U_DocOrig = false ;
      A85UVID_CONTROLCHU_Estado = GX_Parm43 ;
      n85UVID_CONTROLCHU_Estado = false ;
      A86U_Traslado = GX_Parm44 ;
      n86U_Traslado = false ;
      A87U_TipResul = GX_Parm45 ;
      n87U_TipResul = false ;
      A88U_ContraMu = GX_Parm46 ;
      n88U_ContraMu = false ;
      A89U_CoMuSize = GX_Parm47 ;
      n89U_CoMuSize = false ;
      A90U_MuestDes = GX_Parm48 ;
      n90U_MuestDes = false ;
      A91U_MuDeSize = GX_Parm49 ;
      n91U_MuDeSize = false ;
      A92U_CtaCalid = GX_Parm50 ;
      n92U_CtaCalid = false ;
      A93U_CCCode = GX_Parm51 ;
      n93U_CCCode = false ;
      A94U_PrjCode = GX_Parm52 ;
      n94U_PrjCode = false ;
      A95UVID_CONTROLCHU_Comment = GX_Parm53 ;
      n95UVID_CONTROLCHU_Comment = false ;
      A96U_AtrQ1 = GX_Parm54 ;
      n96U_AtrQ1 = false ;
      A97U_AtrQ2 = GX_Parm55 ;
      n97U_AtrQ2 = false ;
      A98U_AtrQ3 = GX_Parm56 ;
      n98U_AtrQ3 = false ;
      A99U_AtrQ4 = GX_Parm57 ;
      n99U_AtrQ4 = false ;
      A100U_AtrT1 = GX_Parm58 ;
      n100U_AtrT1 = false ;
      A101U_AtrT2 = GX_Parm59 ;
      n101U_AtrT2 = false ;
      A102U_AtrT3 = GX_Parm60 ;
      n102U_AtrT3 = false ;
      A103U_AtrT4 = GX_Parm61 ;
      n103U_AtrT4 = false ;
      A104U_Reanalis = GX_Parm62 ;
      n104U_Reanalis = false ;
      A105U_NroOF = GX_Parm63 ;
      n105U_NroOF = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A44DocNum, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A45Period, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A46Instance, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A47Series, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A48Handwrtten));
      isValidOutput.add(GXutil.rtrim( A49Canceled));
      isValidOutput.add(A50UVID_CONTROLCHObject);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A51UVID_CONTROLCHLogInst, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A52UserSign, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A53Transfered));
      isValidOutput.add(GXutil.rtrim( A54Status));
      isValidOutput.add(localUtil.ttoc( A55CreateDate, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A56CreateTime, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( A57UpdateDate, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A58UpdateTime, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A59DataSource));
      isValidOutput.add(GXutil.rtrim( A60RequestStatus));
      isValidOutput.add(A61Creator);
      isValidOutput.add(A62Remark);
      isValidOutput.add(A63U_ItemCode);
      isValidOutput.add(A64U_ItemName);
      isValidOutput.add(A65U_WhsCode);
      isValidOutput.add(A66U_WhsDest);
      isValidOutput.add(A67U_NumTras);
      isValidOutput.add(A68U_NumCon);
      isValidOutput.add(A69U_NumMusd);
      isValidOutput.add(A70U_NoLote);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A71U_CorrLote, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A72U_CorrAnal, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A73U_Cantidad, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A74U_Bultos, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A75U_BultosMu, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(A78U_UM);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(A83U_Usuario);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A84U_DocOrig, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A85UVID_CONTROLCHU_Estado));
      isValidOutput.add(GXutil.rtrim( A86U_Traslado));
      isValidOutput.add(A87U_TipResul);
      isValidOutput.add(GXutil.rtrim( A88U_ContraMu));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A89U_CoMuSize, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A90U_MuestDes));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A91U_MuDeSize, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A92U_CtaCalid);
      isValidOutput.add(A93U_CCCode);
      isValidOutput.add(A94U_PrjCode);
      isValidOutput.add(A95UVID_CONTROLCHU_Comment);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A96U_AtrQ1, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A97U_AtrQ2, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A98U_AtrQ3, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A99U_AtrQ4, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A100U_AtrT1);
      isValidOutput.add(A101U_AtrT2);
      isValidOutput.add(A102U_AtrT3);
      isValidOutput.add(A103U_AtrT4);
      isValidOutput.add(GXutil.rtrim( A104U_Reanalis));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A105U_NroOF, (byte)(9), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z44DocNum, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z45Period, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z46Instance, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z47Series, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z48Handwrtten));
      isValidOutput.add(GXutil.rtrim( Z49Canceled));
      isValidOutput.add(Z50UVID_CONTROLCHObject);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z51UVID_CONTROLCHLogInst, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z52UserSign, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z53Transfered));
      isValidOutput.add(GXutil.rtrim( Z54Status));
      isValidOutput.add(localUtil.ttoc( Z55CreateDate, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z56CreateTime, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(localUtil.ttoc( Z57UpdateDate, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z58UpdateTime, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z59DataSource));
      isValidOutput.add(GXutil.rtrim( Z60RequestStatus));
      isValidOutput.add(Z61Creator);
      isValidOutput.add(Z62Remark);
      isValidOutput.add(Z63U_ItemCode);
      isValidOutput.add(Z64U_ItemName);
      isValidOutput.add(Z65U_WhsCode);
      isValidOutput.add(Z66U_WhsDest);
      isValidOutput.add(Z67U_NumTras);
      isValidOutput.add(Z68U_NumCon);
      isValidOutput.add(Z69U_NumMusd);
      isValidOutput.add(Z70U_NoLote);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z71U_CorrLote, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z72U_CorrAnal, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z73U_Cantidad, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z74U_Bultos, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z75U_BultosMu, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(localUtil.ttoc( Z76U_FecIngr, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(localUtil.ttoc( Z77U_FecUltIn, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(Z78U_UM);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z79U_NoDoc, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(localUtil.ttoc( Z80U_FecContr, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(localUtil.ttoc( Z81U_FecIni, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(localUtil.ttoc( Z82U_FecFin, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(Z83U_Usuario);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z84U_DocOrig, (byte)(9), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z85UVID_CONTROLCHU_Estado));
      isValidOutput.add(GXutil.rtrim( Z86U_Traslado));
      isValidOutput.add(Z87U_TipResul);
      isValidOutput.add(GXutil.rtrim( Z88U_ContraMu));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z89U_CoMuSize, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z90U_MuestDes));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z91U_MuDeSize, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(Z92U_CtaCalid);
      isValidOutput.add(Z93U_CCCode);
      isValidOutput.add(Z94U_PrjCode);
      isValidOutput.add(Z95UVID_CONTROLCHU_Comment);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z96U_AtrQ1, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z97U_AtrQ2, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z98U_AtrQ3, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z99U_AtrQ4, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(Z100U_AtrT1);
      isValidOutput.add(Z101U_AtrT2);
      isValidOutput.add(Z102U_AtrT3);
      isValidOutput.add(Z103U_AtrT4);
      isValidOutput.add(GXutil.rtrim( Z104U_Reanalis));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z105U_NroOF, (byte)(9), (byte)(0), ",", "")));
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
      Z48Handwrtten = "" ;
      Z49Canceled = "" ;
      Z50UVID_CONTROLCHObject = "" ;
      Z53Transfered = "" ;
      Z54Status = "" ;
      Z55CreateDate = GXutil.resetTime( GXutil.nullDate() );
      Z57UpdateDate = GXutil.resetTime( GXutil.nullDate() );
      Z59DataSource = "" ;
      Z60RequestStatus = "" ;
      Z61Creator = "" ;
      Z63U_ItemCode = "" ;
      Z64U_ItemName = "" ;
      Z65U_WhsCode = "" ;
      Z66U_WhsDest = "" ;
      Z67U_NumTras = "" ;
      Z68U_NumCon = "" ;
      Z69U_NumMusd = "" ;
      Z70U_NoLote = "" ;
      Z76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      Z77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      Z78U_UM = "" ;
      Z80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      Z81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      Z82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      Z83U_Usuario = "" ;
      Z85UVID_CONTROLCHU_Estado = "" ;
      Z86U_Traslado = "" ;
      Z87U_TipResul = "" ;
      Z88U_ContraMu = "" ;
      Z90U_MuestDes = "" ;
      Z92U_CtaCalid = "" ;
      Z93U_CCCode = "" ;
      Z94U_PrjCode = "" ;
      Z95UVID_CONTROLCHU_Comment = "" ;
      Z100U_AtrT1 = "" ;
      Z101U_AtrT2 = "" ;
      Z102U_AtrT3 = "" ;
      Z103U_AtrT4 = "" ;
      Z104U_Reanalis = "" ;
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
      A48Handwrtten = "" ;
      A49Canceled = "" ;
      A50UVID_CONTROLCHObject = "" ;
      A53Transfered = "" ;
      A54Status = "" ;
      A55CreateDate = GXutil.resetTime( GXutil.nullDate() );
      A57UpdateDate = GXutil.resetTime( GXutil.nullDate() );
      A59DataSource = "" ;
      A60RequestStatus = "" ;
      A61Creator = "" ;
      A62Remark = "" ;
      A63U_ItemCode = "" ;
      A64U_ItemName = "" ;
      A65U_WhsCode = "" ;
      A66U_WhsDest = "" ;
      A67U_NumTras = "" ;
      A68U_NumCon = "" ;
      A69U_NumMusd = "" ;
      A70U_NoLote = "" ;
      A76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      A77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      A78U_UM = "" ;
      A80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      A81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      A82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      A83U_Usuario = "" ;
      A85UVID_CONTROLCHU_Estado = "" ;
      A86U_Traslado = "" ;
      A87U_TipResul = "" ;
      A88U_ContraMu = "" ;
      A90U_MuestDes = "" ;
      A92U_CtaCalid = "" ;
      A93U_CCCode = "" ;
      A94U_PrjCode = "" ;
      A95UVID_CONTROLCHU_Comment = "" ;
      A100U_AtrT1 = "" ;
      A101U_AtrT2 = "" ;
      A102U_AtrT3 = "" ;
      A103U_AtrT4 = "" ;
      A104U_Reanalis = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Z62Remark = "" ;
      T00044_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00044_A44DocNum = new int[1] ;
      T00044_n44DocNum = new boolean[] {false} ;
      T00044_A45Period = new int[1] ;
      T00044_n45Period = new boolean[] {false} ;
      T00044_A46Instance = new short[1] ;
      T00044_n46Instance = new boolean[] {false} ;
      T00044_A47Series = new int[1] ;
      T00044_n47Series = new boolean[] {false} ;
      T00044_A48Handwrtten = new String[] {""} ;
      T00044_n48Handwrtten = new boolean[] {false} ;
      T00044_A49Canceled = new String[] {""} ;
      T00044_n49Canceled = new boolean[] {false} ;
      T00044_A50UVID_CONTROLCHObject = new String[] {""} ;
      T00044_n50UVID_CONTROLCHObject = new boolean[] {false} ;
      T00044_A51UVID_CONTROLCHLogInst = new int[1] ;
      T00044_n51UVID_CONTROLCHLogInst = new boolean[] {false} ;
      T00044_A52UserSign = new int[1] ;
      T00044_n52UserSign = new boolean[] {false} ;
      T00044_A53Transfered = new String[] {""} ;
      T00044_n53Transfered = new boolean[] {false} ;
      T00044_A54Status = new String[] {""} ;
      T00044_n54Status = new boolean[] {false} ;
      T00044_A55CreateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00044_n55CreateDate = new boolean[] {false} ;
      T00044_A56CreateTime = new short[1] ;
      T00044_n56CreateTime = new boolean[] {false} ;
      T00044_A57UpdateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00044_n57UpdateDate = new boolean[] {false} ;
      T00044_A58UpdateTime = new short[1] ;
      T00044_n58UpdateTime = new boolean[] {false} ;
      T00044_A59DataSource = new String[] {""} ;
      T00044_n59DataSource = new boolean[] {false} ;
      T00044_A60RequestStatus = new String[] {""} ;
      T00044_n60RequestStatus = new boolean[] {false} ;
      T00044_A61Creator = new String[] {""} ;
      T00044_n61Creator = new boolean[] {false} ;
      T00044_A62Remark = new String[] {""} ;
      T00044_n62Remark = new boolean[] {false} ;
      T00044_A63U_ItemCode = new String[] {""} ;
      T00044_n63U_ItemCode = new boolean[] {false} ;
      T00044_A64U_ItemName = new String[] {""} ;
      T00044_n64U_ItemName = new boolean[] {false} ;
      T00044_A65U_WhsCode = new String[] {""} ;
      T00044_n65U_WhsCode = new boolean[] {false} ;
      T00044_A66U_WhsDest = new String[] {""} ;
      T00044_n66U_WhsDest = new boolean[] {false} ;
      T00044_A67U_NumTras = new String[] {""} ;
      T00044_n67U_NumTras = new boolean[] {false} ;
      T00044_A68U_NumCon = new String[] {""} ;
      T00044_n68U_NumCon = new boolean[] {false} ;
      T00044_A69U_NumMusd = new String[] {""} ;
      T00044_n69U_NumMusd = new boolean[] {false} ;
      T00044_A70U_NoLote = new String[] {""} ;
      T00044_n70U_NoLote = new boolean[] {false} ;
      T00044_A71U_CorrLote = new int[1] ;
      T00044_n71U_CorrLote = new boolean[] {false} ;
      T00044_A72U_CorrAnal = new int[1] ;
      T00044_n72U_CorrAnal = new boolean[] {false} ;
      T00044_A73U_Cantidad = new long[1] ;
      T00044_n73U_Cantidad = new boolean[] {false} ;
      T00044_A74U_Bultos = new int[1] ;
      T00044_n74U_Bultos = new boolean[] {false} ;
      T00044_A75U_BultosMu = new int[1] ;
      T00044_n75U_BultosMu = new boolean[] {false} ;
      T00044_A76U_FecIngr = new java.util.Date[] {GXutil.nullDate()} ;
      T00044_n76U_FecIngr = new boolean[] {false} ;
      T00044_A77U_FecUltIn = new java.util.Date[] {GXutil.nullDate()} ;
      T00044_n77U_FecUltIn = new boolean[] {false} ;
      T00044_A78U_UM = new String[] {""} ;
      T00044_n78U_UM = new boolean[] {false} ;
      T00044_A79U_NoDoc = new int[1] ;
      T00044_n79U_NoDoc = new boolean[] {false} ;
      T00044_A80U_FecContr = new java.util.Date[] {GXutil.nullDate()} ;
      T00044_n80U_FecContr = new boolean[] {false} ;
      T00044_A81U_FecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00044_n81U_FecIni = new boolean[] {false} ;
      T00044_A82U_FecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T00044_n82U_FecFin = new boolean[] {false} ;
      T00044_A83U_Usuario = new String[] {""} ;
      T00044_n83U_Usuario = new boolean[] {false} ;
      T00044_A84U_DocOrig = new int[1] ;
      T00044_n84U_DocOrig = new boolean[] {false} ;
      T00044_A85UVID_CONTROLCHU_Estado = new String[] {""} ;
      T00044_n85UVID_CONTROLCHU_Estado = new boolean[] {false} ;
      T00044_A86U_Traslado = new String[] {""} ;
      T00044_n86U_Traslado = new boolean[] {false} ;
      T00044_A87U_TipResul = new String[] {""} ;
      T00044_n87U_TipResul = new boolean[] {false} ;
      T00044_A88U_ContraMu = new String[] {""} ;
      T00044_n88U_ContraMu = new boolean[] {false} ;
      T00044_A89U_CoMuSize = new long[1] ;
      T00044_n89U_CoMuSize = new boolean[] {false} ;
      T00044_A90U_MuestDes = new String[] {""} ;
      T00044_n90U_MuestDes = new boolean[] {false} ;
      T00044_A91U_MuDeSize = new long[1] ;
      T00044_n91U_MuDeSize = new boolean[] {false} ;
      T00044_A92U_CtaCalid = new String[] {""} ;
      T00044_n92U_CtaCalid = new boolean[] {false} ;
      T00044_A93U_CCCode = new String[] {""} ;
      T00044_n93U_CCCode = new boolean[] {false} ;
      T00044_A94U_PrjCode = new String[] {""} ;
      T00044_n94U_PrjCode = new boolean[] {false} ;
      T00044_A95UVID_CONTROLCHU_Comment = new String[] {""} ;
      T00044_n95UVID_CONTROLCHU_Comment = new boolean[] {false} ;
      T00044_A96U_AtrQ1 = new long[1] ;
      T00044_n96U_AtrQ1 = new boolean[] {false} ;
      T00044_A97U_AtrQ2 = new long[1] ;
      T00044_n97U_AtrQ2 = new boolean[] {false} ;
      T00044_A98U_AtrQ3 = new long[1] ;
      T00044_n98U_AtrQ3 = new boolean[] {false} ;
      T00044_A99U_AtrQ4 = new long[1] ;
      T00044_n99U_AtrQ4 = new boolean[] {false} ;
      T00044_A100U_AtrT1 = new String[] {""} ;
      T00044_n100U_AtrT1 = new boolean[] {false} ;
      T00044_A101U_AtrT2 = new String[] {""} ;
      T00044_n101U_AtrT2 = new boolean[] {false} ;
      T00044_A102U_AtrT3 = new String[] {""} ;
      T00044_n102U_AtrT3 = new boolean[] {false} ;
      T00044_A103U_AtrT4 = new String[] {""} ;
      T00044_n103U_AtrT4 = new boolean[] {false} ;
      T00044_A104U_Reanalis = new String[] {""} ;
      T00044_n104U_Reanalis = new boolean[] {false} ;
      T00044_A105U_NroOF = new int[1] ;
      T00044_n105U_NroOF = new boolean[] {false} ;
      T00045_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00043_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00043_A44DocNum = new int[1] ;
      T00043_n44DocNum = new boolean[] {false} ;
      T00043_A45Period = new int[1] ;
      T00043_n45Period = new boolean[] {false} ;
      T00043_A46Instance = new short[1] ;
      T00043_n46Instance = new boolean[] {false} ;
      T00043_A47Series = new int[1] ;
      T00043_n47Series = new boolean[] {false} ;
      T00043_A48Handwrtten = new String[] {""} ;
      T00043_n48Handwrtten = new boolean[] {false} ;
      T00043_A49Canceled = new String[] {""} ;
      T00043_n49Canceled = new boolean[] {false} ;
      T00043_A50UVID_CONTROLCHObject = new String[] {""} ;
      T00043_n50UVID_CONTROLCHObject = new boolean[] {false} ;
      T00043_A51UVID_CONTROLCHLogInst = new int[1] ;
      T00043_n51UVID_CONTROLCHLogInst = new boolean[] {false} ;
      T00043_A52UserSign = new int[1] ;
      T00043_n52UserSign = new boolean[] {false} ;
      T00043_A53Transfered = new String[] {""} ;
      T00043_n53Transfered = new boolean[] {false} ;
      T00043_A54Status = new String[] {""} ;
      T00043_n54Status = new boolean[] {false} ;
      T00043_A55CreateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n55CreateDate = new boolean[] {false} ;
      T00043_A56CreateTime = new short[1] ;
      T00043_n56CreateTime = new boolean[] {false} ;
      T00043_A57UpdateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n57UpdateDate = new boolean[] {false} ;
      T00043_A58UpdateTime = new short[1] ;
      T00043_n58UpdateTime = new boolean[] {false} ;
      T00043_A59DataSource = new String[] {""} ;
      T00043_n59DataSource = new boolean[] {false} ;
      T00043_A60RequestStatus = new String[] {""} ;
      T00043_n60RequestStatus = new boolean[] {false} ;
      T00043_A61Creator = new String[] {""} ;
      T00043_n61Creator = new boolean[] {false} ;
      T00043_A62Remark = new String[] {""} ;
      T00043_n62Remark = new boolean[] {false} ;
      T00043_A63U_ItemCode = new String[] {""} ;
      T00043_n63U_ItemCode = new boolean[] {false} ;
      T00043_A64U_ItemName = new String[] {""} ;
      T00043_n64U_ItemName = new boolean[] {false} ;
      T00043_A65U_WhsCode = new String[] {""} ;
      T00043_n65U_WhsCode = new boolean[] {false} ;
      T00043_A66U_WhsDest = new String[] {""} ;
      T00043_n66U_WhsDest = new boolean[] {false} ;
      T00043_A67U_NumTras = new String[] {""} ;
      T00043_n67U_NumTras = new boolean[] {false} ;
      T00043_A68U_NumCon = new String[] {""} ;
      T00043_n68U_NumCon = new boolean[] {false} ;
      T00043_A69U_NumMusd = new String[] {""} ;
      T00043_n69U_NumMusd = new boolean[] {false} ;
      T00043_A70U_NoLote = new String[] {""} ;
      T00043_n70U_NoLote = new boolean[] {false} ;
      T00043_A71U_CorrLote = new int[1] ;
      T00043_n71U_CorrLote = new boolean[] {false} ;
      T00043_A72U_CorrAnal = new int[1] ;
      T00043_n72U_CorrAnal = new boolean[] {false} ;
      T00043_A73U_Cantidad = new long[1] ;
      T00043_n73U_Cantidad = new boolean[] {false} ;
      T00043_A74U_Bultos = new int[1] ;
      T00043_n74U_Bultos = new boolean[] {false} ;
      T00043_A75U_BultosMu = new int[1] ;
      T00043_n75U_BultosMu = new boolean[] {false} ;
      T00043_A76U_FecIngr = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n76U_FecIngr = new boolean[] {false} ;
      T00043_A77U_FecUltIn = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n77U_FecUltIn = new boolean[] {false} ;
      T00043_A78U_UM = new String[] {""} ;
      T00043_n78U_UM = new boolean[] {false} ;
      T00043_A79U_NoDoc = new int[1] ;
      T00043_n79U_NoDoc = new boolean[] {false} ;
      T00043_A80U_FecContr = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n80U_FecContr = new boolean[] {false} ;
      T00043_A81U_FecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n81U_FecIni = new boolean[] {false} ;
      T00043_A82U_FecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n82U_FecFin = new boolean[] {false} ;
      T00043_A83U_Usuario = new String[] {""} ;
      T00043_n83U_Usuario = new boolean[] {false} ;
      T00043_A84U_DocOrig = new int[1] ;
      T00043_n84U_DocOrig = new boolean[] {false} ;
      T00043_A85UVID_CONTROLCHU_Estado = new String[] {""} ;
      T00043_n85UVID_CONTROLCHU_Estado = new boolean[] {false} ;
      T00043_A86U_Traslado = new String[] {""} ;
      T00043_n86U_Traslado = new boolean[] {false} ;
      T00043_A87U_TipResul = new String[] {""} ;
      T00043_n87U_TipResul = new boolean[] {false} ;
      T00043_A88U_ContraMu = new String[] {""} ;
      T00043_n88U_ContraMu = new boolean[] {false} ;
      T00043_A89U_CoMuSize = new long[1] ;
      T00043_n89U_CoMuSize = new boolean[] {false} ;
      T00043_A90U_MuestDes = new String[] {""} ;
      T00043_n90U_MuestDes = new boolean[] {false} ;
      T00043_A91U_MuDeSize = new long[1] ;
      T00043_n91U_MuDeSize = new boolean[] {false} ;
      T00043_A92U_CtaCalid = new String[] {""} ;
      T00043_n92U_CtaCalid = new boolean[] {false} ;
      T00043_A93U_CCCode = new String[] {""} ;
      T00043_n93U_CCCode = new boolean[] {false} ;
      T00043_A94U_PrjCode = new String[] {""} ;
      T00043_n94U_PrjCode = new boolean[] {false} ;
      T00043_A95UVID_CONTROLCHU_Comment = new String[] {""} ;
      T00043_n95UVID_CONTROLCHU_Comment = new boolean[] {false} ;
      T00043_A96U_AtrQ1 = new long[1] ;
      T00043_n96U_AtrQ1 = new boolean[] {false} ;
      T00043_A97U_AtrQ2 = new long[1] ;
      T00043_n97U_AtrQ2 = new boolean[] {false} ;
      T00043_A98U_AtrQ3 = new long[1] ;
      T00043_n98U_AtrQ3 = new boolean[] {false} ;
      T00043_A99U_AtrQ4 = new long[1] ;
      T00043_n99U_AtrQ4 = new boolean[] {false} ;
      T00043_A100U_AtrT1 = new String[] {""} ;
      T00043_n100U_AtrT1 = new boolean[] {false} ;
      T00043_A101U_AtrT2 = new String[] {""} ;
      T00043_n101U_AtrT2 = new boolean[] {false} ;
      T00043_A102U_AtrT3 = new String[] {""} ;
      T00043_n102U_AtrT3 = new boolean[] {false} ;
      T00043_A103U_AtrT4 = new String[] {""} ;
      T00043_n103U_AtrT4 = new boolean[] {false} ;
      T00043_A104U_Reanalis = new String[] {""} ;
      T00043_n104U_Reanalis = new boolean[] {false} ;
      T00043_A105U_NroOF = new int[1] ;
      T00043_n105U_NroOF = new boolean[] {false} ;
      sMode5 = "" ;
      T00046_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00047_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00042_A43UVID_CONTROLCHDocEntry = new int[1] ;
      T00042_A44DocNum = new int[1] ;
      T00042_n44DocNum = new boolean[] {false} ;
      T00042_A45Period = new int[1] ;
      T00042_n45Period = new boolean[] {false} ;
      T00042_A46Instance = new short[1] ;
      T00042_n46Instance = new boolean[] {false} ;
      T00042_A47Series = new int[1] ;
      T00042_n47Series = new boolean[] {false} ;
      T00042_A48Handwrtten = new String[] {""} ;
      T00042_n48Handwrtten = new boolean[] {false} ;
      T00042_A49Canceled = new String[] {""} ;
      T00042_n49Canceled = new boolean[] {false} ;
      T00042_A50UVID_CONTROLCHObject = new String[] {""} ;
      T00042_n50UVID_CONTROLCHObject = new boolean[] {false} ;
      T00042_A51UVID_CONTROLCHLogInst = new int[1] ;
      T00042_n51UVID_CONTROLCHLogInst = new boolean[] {false} ;
      T00042_A52UserSign = new int[1] ;
      T00042_n52UserSign = new boolean[] {false} ;
      T00042_A53Transfered = new String[] {""} ;
      T00042_n53Transfered = new boolean[] {false} ;
      T00042_A54Status = new String[] {""} ;
      T00042_n54Status = new boolean[] {false} ;
      T00042_A55CreateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n55CreateDate = new boolean[] {false} ;
      T00042_A56CreateTime = new short[1] ;
      T00042_n56CreateTime = new boolean[] {false} ;
      T00042_A57UpdateDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n57UpdateDate = new boolean[] {false} ;
      T00042_A58UpdateTime = new short[1] ;
      T00042_n58UpdateTime = new boolean[] {false} ;
      T00042_A59DataSource = new String[] {""} ;
      T00042_n59DataSource = new boolean[] {false} ;
      T00042_A60RequestStatus = new String[] {""} ;
      T00042_n60RequestStatus = new boolean[] {false} ;
      T00042_A61Creator = new String[] {""} ;
      T00042_n61Creator = new boolean[] {false} ;
      T00042_A62Remark = new String[] {""} ;
      T00042_n62Remark = new boolean[] {false} ;
      T00042_A63U_ItemCode = new String[] {""} ;
      T00042_n63U_ItemCode = new boolean[] {false} ;
      T00042_A64U_ItemName = new String[] {""} ;
      T00042_n64U_ItemName = new boolean[] {false} ;
      T00042_A65U_WhsCode = new String[] {""} ;
      T00042_n65U_WhsCode = new boolean[] {false} ;
      T00042_A66U_WhsDest = new String[] {""} ;
      T00042_n66U_WhsDest = new boolean[] {false} ;
      T00042_A67U_NumTras = new String[] {""} ;
      T00042_n67U_NumTras = new boolean[] {false} ;
      T00042_A68U_NumCon = new String[] {""} ;
      T00042_n68U_NumCon = new boolean[] {false} ;
      T00042_A69U_NumMusd = new String[] {""} ;
      T00042_n69U_NumMusd = new boolean[] {false} ;
      T00042_A70U_NoLote = new String[] {""} ;
      T00042_n70U_NoLote = new boolean[] {false} ;
      T00042_A71U_CorrLote = new int[1] ;
      T00042_n71U_CorrLote = new boolean[] {false} ;
      T00042_A72U_CorrAnal = new int[1] ;
      T00042_n72U_CorrAnal = new boolean[] {false} ;
      T00042_A73U_Cantidad = new long[1] ;
      T00042_n73U_Cantidad = new boolean[] {false} ;
      T00042_A74U_Bultos = new int[1] ;
      T00042_n74U_Bultos = new boolean[] {false} ;
      T00042_A75U_BultosMu = new int[1] ;
      T00042_n75U_BultosMu = new boolean[] {false} ;
      T00042_A76U_FecIngr = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n76U_FecIngr = new boolean[] {false} ;
      T00042_A77U_FecUltIn = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n77U_FecUltIn = new boolean[] {false} ;
      T00042_A78U_UM = new String[] {""} ;
      T00042_n78U_UM = new boolean[] {false} ;
      T00042_A79U_NoDoc = new int[1] ;
      T00042_n79U_NoDoc = new boolean[] {false} ;
      T00042_A80U_FecContr = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n80U_FecContr = new boolean[] {false} ;
      T00042_A81U_FecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n81U_FecIni = new boolean[] {false} ;
      T00042_A82U_FecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n82U_FecFin = new boolean[] {false} ;
      T00042_A83U_Usuario = new String[] {""} ;
      T00042_n83U_Usuario = new boolean[] {false} ;
      T00042_A84U_DocOrig = new int[1] ;
      T00042_n84U_DocOrig = new boolean[] {false} ;
      T00042_A85UVID_CONTROLCHU_Estado = new String[] {""} ;
      T00042_n85UVID_CONTROLCHU_Estado = new boolean[] {false} ;
      T00042_A86U_Traslado = new String[] {""} ;
      T00042_n86U_Traslado = new boolean[] {false} ;
      T00042_A87U_TipResul = new String[] {""} ;
      T00042_n87U_TipResul = new boolean[] {false} ;
      T00042_A88U_ContraMu = new String[] {""} ;
      T00042_n88U_ContraMu = new boolean[] {false} ;
      T00042_A89U_CoMuSize = new long[1] ;
      T00042_n89U_CoMuSize = new boolean[] {false} ;
      T00042_A90U_MuestDes = new String[] {""} ;
      T00042_n90U_MuestDes = new boolean[] {false} ;
      T00042_A91U_MuDeSize = new long[1] ;
      T00042_n91U_MuDeSize = new boolean[] {false} ;
      T00042_A92U_CtaCalid = new String[] {""} ;
      T00042_n92U_CtaCalid = new boolean[] {false} ;
      T00042_A93U_CCCode = new String[] {""} ;
      T00042_n93U_CCCode = new boolean[] {false} ;
      T00042_A94U_PrjCode = new String[] {""} ;
      T00042_n94U_PrjCode = new boolean[] {false} ;
      T00042_A95UVID_CONTROLCHU_Comment = new String[] {""} ;
      T00042_n95UVID_CONTROLCHU_Comment = new boolean[] {false} ;
      T00042_A96U_AtrQ1 = new long[1] ;
      T00042_n96U_AtrQ1 = new boolean[] {false} ;
      T00042_A97U_AtrQ2 = new long[1] ;
      T00042_n97U_AtrQ2 = new boolean[] {false} ;
      T00042_A98U_AtrQ3 = new long[1] ;
      T00042_n98U_AtrQ3 = new boolean[] {false} ;
      T00042_A99U_AtrQ4 = new long[1] ;
      T00042_n99U_AtrQ4 = new boolean[] {false} ;
      T00042_A100U_AtrT1 = new String[] {""} ;
      T00042_n100U_AtrT1 = new boolean[] {false} ;
      T00042_A101U_AtrT2 = new String[] {""} ;
      T00042_n101U_AtrT2 = new boolean[] {false} ;
      T00042_A102U_AtrT3 = new String[] {""} ;
      T00042_n102U_AtrT3 = new boolean[] {false} ;
      T00042_A103U_AtrT4 = new String[] {""} ;
      T00042_n103U_AtrT4 = new boolean[] {false} ;
      T00042_A104U_Reanalis = new String[] {""} ;
      T00042_n104U_Reanalis = new boolean[] {false} ;
      T00042_A105U_NroOF = new int[1] ;
      T00042_n105U_NroOF = new boolean[] {false} ;
      T000411_A43UVID_CONTROLCHDocEntry = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.uvid_controlch__fusquim_sap(),
         new Object[] {
             new Object[] {
            T00042_A43UVID_CONTROLCHDocEntry, T00042_A44DocNum, T00042_n44DocNum, T00042_A45Period, T00042_n45Period, T00042_A46Instance, T00042_n46Instance, T00042_A47Series, T00042_n47Series, T00042_A48Handwrtten,
            T00042_n48Handwrtten, T00042_A49Canceled, T00042_n49Canceled, T00042_A50UVID_CONTROLCHObject, T00042_n50UVID_CONTROLCHObject, T00042_A51UVID_CONTROLCHLogInst, T00042_n51UVID_CONTROLCHLogInst, T00042_A52UserSign, T00042_n52UserSign, T00042_A53Transfered,
            T00042_n53Transfered, T00042_A54Status, T00042_n54Status, T00042_A55CreateDate, T00042_n55CreateDate, T00042_A56CreateTime, T00042_n56CreateTime, T00042_A57UpdateDate, T00042_n57UpdateDate, T00042_A58UpdateTime,
            T00042_n58UpdateTime, T00042_A59DataSource, T00042_n59DataSource, T00042_A60RequestStatus, T00042_n60RequestStatus, T00042_A61Creator, T00042_n61Creator, T00042_A62Remark, T00042_n62Remark, T00042_A63U_ItemCode,
            T00042_n63U_ItemCode, T00042_A64U_ItemName, T00042_n64U_ItemName, T00042_A65U_WhsCode, T00042_n65U_WhsCode, T00042_A66U_WhsDest, T00042_n66U_WhsDest, T00042_A67U_NumTras, T00042_n67U_NumTras, T00042_A68U_NumCon,
            T00042_n68U_NumCon, T00042_A69U_NumMusd, T00042_n69U_NumMusd, T00042_A70U_NoLote, T00042_n70U_NoLote, T00042_A71U_CorrLote, T00042_n71U_CorrLote, T00042_A72U_CorrAnal, T00042_n72U_CorrAnal, T00042_A73U_Cantidad,
            T00042_n73U_Cantidad, T00042_A74U_Bultos, T00042_n74U_Bultos, T00042_A75U_BultosMu, T00042_n75U_BultosMu, T00042_A76U_FecIngr, T00042_n76U_FecIngr, T00042_A77U_FecUltIn, T00042_n77U_FecUltIn, T00042_A78U_UM,
            T00042_n78U_UM, T00042_A79U_NoDoc, T00042_n79U_NoDoc, T00042_A80U_FecContr, T00042_n80U_FecContr, T00042_A81U_FecIni, T00042_n81U_FecIni, T00042_A82U_FecFin, T00042_n82U_FecFin, T00042_A83U_Usuario,
            T00042_n83U_Usuario, T00042_A84U_DocOrig, T00042_n84U_DocOrig, T00042_A85UVID_CONTROLCHU_Estado, T00042_n85UVID_CONTROLCHU_Estado, T00042_A86U_Traslado, T00042_n86U_Traslado, T00042_A87U_TipResul, T00042_n87U_TipResul, T00042_A88U_ContraMu,
            T00042_n88U_ContraMu, T00042_A89U_CoMuSize, T00042_n89U_CoMuSize, T00042_A90U_MuestDes, T00042_n90U_MuestDes, T00042_A91U_MuDeSize, T00042_n91U_MuDeSize, T00042_A92U_CtaCalid, T00042_n92U_CtaCalid, T00042_A93U_CCCode,
            T00042_n93U_CCCode, T00042_A94U_PrjCode, T00042_n94U_PrjCode, T00042_A95UVID_CONTROLCHU_Comment, T00042_n95UVID_CONTROLCHU_Comment, T00042_A96U_AtrQ1, T00042_n96U_AtrQ1, T00042_A97U_AtrQ2, T00042_n97U_AtrQ2, T00042_A98U_AtrQ3,
            T00042_n98U_AtrQ3, T00042_A99U_AtrQ4, T00042_n99U_AtrQ4, T00042_A100U_AtrT1, T00042_n100U_AtrT1, T00042_A101U_AtrT2, T00042_n101U_AtrT2, T00042_A102U_AtrT3, T00042_n102U_AtrT3, T00042_A103U_AtrT4,
            T00042_n103U_AtrT4, T00042_A104U_Reanalis, T00042_n104U_Reanalis, T00042_A105U_NroOF, T00042_n105U_NroOF
            }
            , new Object[] {
            T00043_A43UVID_CONTROLCHDocEntry, T00043_A44DocNum, T00043_n44DocNum, T00043_A45Period, T00043_n45Period, T00043_A46Instance, T00043_n46Instance, T00043_A47Series, T00043_n47Series, T00043_A48Handwrtten,
            T00043_n48Handwrtten, T00043_A49Canceled, T00043_n49Canceled, T00043_A50UVID_CONTROLCHObject, T00043_n50UVID_CONTROLCHObject, T00043_A51UVID_CONTROLCHLogInst, T00043_n51UVID_CONTROLCHLogInst, T00043_A52UserSign, T00043_n52UserSign, T00043_A53Transfered,
            T00043_n53Transfered, T00043_A54Status, T00043_n54Status, T00043_A55CreateDate, T00043_n55CreateDate, T00043_A56CreateTime, T00043_n56CreateTime, T00043_A57UpdateDate, T00043_n57UpdateDate, T00043_A58UpdateTime,
            T00043_n58UpdateTime, T00043_A59DataSource, T00043_n59DataSource, T00043_A60RequestStatus, T00043_n60RequestStatus, T00043_A61Creator, T00043_n61Creator, T00043_A62Remark, T00043_n62Remark, T00043_A63U_ItemCode,
            T00043_n63U_ItemCode, T00043_A64U_ItemName, T00043_n64U_ItemName, T00043_A65U_WhsCode, T00043_n65U_WhsCode, T00043_A66U_WhsDest, T00043_n66U_WhsDest, T00043_A67U_NumTras, T00043_n67U_NumTras, T00043_A68U_NumCon,
            T00043_n68U_NumCon, T00043_A69U_NumMusd, T00043_n69U_NumMusd, T00043_A70U_NoLote, T00043_n70U_NoLote, T00043_A71U_CorrLote, T00043_n71U_CorrLote, T00043_A72U_CorrAnal, T00043_n72U_CorrAnal, T00043_A73U_Cantidad,
            T00043_n73U_Cantidad, T00043_A74U_Bultos, T00043_n74U_Bultos, T00043_A75U_BultosMu, T00043_n75U_BultosMu, T00043_A76U_FecIngr, T00043_n76U_FecIngr, T00043_A77U_FecUltIn, T00043_n77U_FecUltIn, T00043_A78U_UM,
            T00043_n78U_UM, T00043_A79U_NoDoc, T00043_n79U_NoDoc, T00043_A80U_FecContr, T00043_n80U_FecContr, T00043_A81U_FecIni, T00043_n81U_FecIni, T00043_A82U_FecFin, T00043_n82U_FecFin, T00043_A83U_Usuario,
            T00043_n83U_Usuario, T00043_A84U_DocOrig, T00043_n84U_DocOrig, T00043_A85UVID_CONTROLCHU_Estado, T00043_n85UVID_CONTROLCHU_Estado, T00043_A86U_Traslado, T00043_n86U_Traslado, T00043_A87U_TipResul, T00043_n87U_TipResul, T00043_A88U_ContraMu,
            T00043_n88U_ContraMu, T00043_A89U_CoMuSize, T00043_n89U_CoMuSize, T00043_A90U_MuestDes, T00043_n90U_MuestDes, T00043_A91U_MuDeSize, T00043_n91U_MuDeSize, T00043_A92U_CtaCalid, T00043_n92U_CtaCalid, T00043_A93U_CCCode,
            T00043_n93U_CCCode, T00043_A94U_PrjCode, T00043_n94U_PrjCode, T00043_A95UVID_CONTROLCHU_Comment, T00043_n95UVID_CONTROLCHU_Comment, T00043_A96U_AtrQ1, T00043_n96U_AtrQ1, T00043_A97U_AtrQ2, T00043_n97U_AtrQ2, T00043_A98U_AtrQ3,
            T00043_n98U_AtrQ3, T00043_A99U_AtrQ4, T00043_n99U_AtrQ4, T00043_A100U_AtrT1, T00043_n100U_AtrT1, T00043_A101U_AtrT2, T00043_n101U_AtrT2, T00043_A102U_AtrT3, T00043_n102U_AtrT3, T00043_A103U_AtrT4,
            T00043_n103U_AtrT4, T00043_A104U_Reanalis, T00043_n104U_Reanalis, T00043_A105U_NroOF, T00043_n105U_NroOF
            }
            , new Object[] {
            T00044_A43UVID_CONTROLCHDocEntry, T00044_A44DocNum, T00044_n44DocNum, T00044_A45Period, T00044_n45Period, T00044_A46Instance, T00044_n46Instance, T00044_A47Series, T00044_n47Series, T00044_A48Handwrtten,
            T00044_n48Handwrtten, T00044_A49Canceled, T00044_n49Canceled, T00044_A50UVID_CONTROLCHObject, T00044_n50UVID_CONTROLCHObject, T00044_A51UVID_CONTROLCHLogInst, T00044_n51UVID_CONTROLCHLogInst, T00044_A52UserSign, T00044_n52UserSign, T00044_A53Transfered,
            T00044_n53Transfered, T00044_A54Status, T00044_n54Status, T00044_A55CreateDate, T00044_n55CreateDate, T00044_A56CreateTime, T00044_n56CreateTime, T00044_A57UpdateDate, T00044_n57UpdateDate, T00044_A58UpdateTime,
            T00044_n58UpdateTime, T00044_A59DataSource, T00044_n59DataSource, T00044_A60RequestStatus, T00044_n60RequestStatus, T00044_A61Creator, T00044_n61Creator, T00044_A62Remark, T00044_n62Remark, T00044_A63U_ItemCode,
            T00044_n63U_ItemCode, T00044_A64U_ItemName, T00044_n64U_ItemName, T00044_A65U_WhsCode, T00044_n65U_WhsCode, T00044_A66U_WhsDest, T00044_n66U_WhsDest, T00044_A67U_NumTras, T00044_n67U_NumTras, T00044_A68U_NumCon,
            T00044_n68U_NumCon, T00044_A69U_NumMusd, T00044_n69U_NumMusd, T00044_A70U_NoLote, T00044_n70U_NoLote, T00044_A71U_CorrLote, T00044_n71U_CorrLote, T00044_A72U_CorrAnal, T00044_n72U_CorrAnal, T00044_A73U_Cantidad,
            T00044_n73U_Cantidad, T00044_A74U_Bultos, T00044_n74U_Bultos, T00044_A75U_BultosMu, T00044_n75U_BultosMu, T00044_A76U_FecIngr, T00044_n76U_FecIngr, T00044_A77U_FecUltIn, T00044_n77U_FecUltIn, T00044_A78U_UM,
            T00044_n78U_UM, T00044_A79U_NoDoc, T00044_n79U_NoDoc, T00044_A80U_FecContr, T00044_n80U_FecContr, T00044_A81U_FecIni, T00044_n81U_FecIni, T00044_A82U_FecFin, T00044_n82U_FecFin, T00044_A83U_Usuario,
            T00044_n83U_Usuario, T00044_A84U_DocOrig, T00044_n84U_DocOrig, T00044_A85UVID_CONTROLCHU_Estado, T00044_n85UVID_CONTROLCHU_Estado, T00044_A86U_Traslado, T00044_n86U_Traslado, T00044_A87U_TipResul, T00044_n87U_TipResul, T00044_A88U_ContraMu,
            T00044_n88U_ContraMu, T00044_A89U_CoMuSize, T00044_n89U_CoMuSize, T00044_A90U_MuestDes, T00044_n90U_MuestDes, T00044_A91U_MuDeSize, T00044_n91U_MuDeSize, T00044_A92U_CtaCalid, T00044_n92U_CtaCalid, T00044_A93U_CCCode,
            T00044_n93U_CCCode, T00044_A94U_PrjCode, T00044_n94U_PrjCode, T00044_A95UVID_CONTROLCHU_Comment, T00044_n95UVID_CONTROLCHU_Comment, T00044_A96U_AtrQ1, T00044_n96U_AtrQ1, T00044_A97U_AtrQ2, T00044_n97U_AtrQ2, T00044_A98U_AtrQ3,
            T00044_n98U_AtrQ3, T00044_A99U_AtrQ4, T00044_n99U_AtrQ4, T00044_A100U_AtrT1, T00044_n100U_AtrT1, T00044_A101U_AtrT2, T00044_n101U_AtrT2, T00044_A102U_AtrT3, T00044_n102U_AtrT3, T00044_A103U_AtrT4,
            T00044_n103U_AtrT4, T00044_A104U_Reanalis, T00044_n104U_Reanalis, T00044_A105U_NroOF, T00044_n105U_NroOF
            }
            , new Object[] {
            T00045_A43UVID_CONTROLCHDocEntry
            }
            , new Object[] {
            T00046_A43UVID_CONTROLCHDocEntry
            }
            , new Object[] {
            T00047_A43UVID_CONTROLCHDocEntry
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000411_A43UVID_CONTROLCHDocEntry
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.uvid_controlch__default(),
         new Object[] {
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z46Instance ;
   private short Z56CreateTime ;
   private short Z58UpdateTime ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A46Instance ;
   private short A56CreateTime ;
   private short A58UpdateTime ;
   private short RcdFound5 ;
   private int Z43UVID_CONTROLCHDocEntry ;
   private int Z44DocNum ;
   private int Z45Period ;
   private int Z47Series ;
   private int Z51UVID_CONTROLCHLogInst ;
   private int Z52UserSign ;
   private int Z71U_CorrLote ;
   private int Z72U_CorrAnal ;
   private int Z74U_Bultos ;
   private int Z75U_BultosMu ;
   private int Z79U_NoDoc ;
   private int Z84U_DocOrig ;
   private int Z105U_NroOF ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A43UVID_CONTROLCHDocEntry ;
   private int edtUVID_CONTROLCHDocEntry_Enabled ;
   private int A44DocNum ;
   private int edtDocNum_Enabled ;
   private int A45Period ;
   private int edtPeriod_Enabled ;
   private int edtInstance_Enabled ;
   private int A47Series ;
   private int edtSeries_Enabled ;
   private int edtHandwrtten_Enabled ;
   private int edtCanceled_Enabled ;
   private int edtUVID_CONTROLCHObject_Enabled ;
   private int A51UVID_CONTROLCHLogInst ;
   private int edtUVID_CONTROLCHLogInst_Enabled ;
   private int A52UserSign ;
   private int edtUserSign_Enabled ;
   private int edtTransfered_Enabled ;
   private int edtStatus_Enabled ;
   private int edtCreateDate_Enabled ;
   private int edtCreateTime_Enabled ;
   private int edtUpdateDate_Enabled ;
   private int edtUpdateTime_Enabled ;
   private int edtDataSource_Enabled ;
   private int edtRequestStatus_Enabled ;
   private int edtCreator_Enabled ;
   private int edtRemark_Enabled ;
   private int edtU_ItemCode_Enabled ;
   private int edtU_ItemName_Enabled ;
   private int edtU_WhsCode_Enabled ;
   private int edtU_WhsDest_Enabled ;
   private int edtU_NumTras_Enabled ;
   private int edtU_NumCon_Enabled ;
   private int edtU_NumMusd_Enabled ;
   private int edtU_NoLote_Enabled ;
   private int A71U_CorrLote ;
   private int edtU_CorrLote_Enabled ;
   private int A72U_CorrAnal ;
   private int edtU_CorrAnal_Enabled ;
   private int edtU_Cantidad_Enabled ;
   private int A74U_Bultos ;
   private int edtU_Bultos_Enabled ;
   private int A75U_BultosMu ;
   private int edtU_BultosMu_Enabled ;
   private int edtU_FecIngr_Enabled ;
   private int edtU_FecUltIn_Enabled ;
   private int edtU_UM_Enabled ;
   private int A79U_NoDoc ;
   private int edtU_NoDoc_Enabled ;
   private int edtU_FecContr_Enabled ;
   private int edtU_FecIni_Enabled ;
   private int edtU_FecFin_Enabled ;
   private int edtU_Usuario_Enabled ;
   private int A84U_DocOrig ;
   private int edtU_DocOrig_Enabled ;
   private int edtUVID_CONTROLCHU_Estado_Enabled ;
   private int edtU_Traslado_Enabled ;
   private int edtU_TipResul_Enabled ;
   private int edtU_ContraMu_Enabled ;
   private int edtU_CoMuSize_Enabled ;
   private int edtU_MuestDes_Enabled ;
   private int edtU_MuDeSize_Enabled ;
   private int edtU_CtaCalid_Enabled ;
   private int edtU_CCCode_Enabled ;
   private int edtU_PrjCode_Enabled ;
   private int edtUVID_CONTROLCHU_Comment_Enabled ;
   private int edtU_AtrQ1_Enabled ;
   private int edtU_AtrQ2_Enabled ;
   private int edtU_AtrQ3_Enabled ;
   private int edtU_AtrQ4_Enabled ;
   private int edtU_AtrT1_Enabled ;
   private int edtU_AtrT2_Enabled ;
   private int edtU_AtrT3_Enabled ;
   private int edtU_AtrT4_Enabled ;
   private int edtU_Reanalis_Enabled ;
   private int A105U_NroOF ;
   private int edtU_NroOF_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z73U_Cantidad ;
   private long Z89U_CoMuSize ;
   private long Z91U_MuDeSize ;
   private long Z96U_AtrQ1 ;
   private long Z97U_AtrQ2 ;
   private long Z98U_AtrQ3 ;
   private long Z99U_AtrQ4 ;
   private long A73U_Cantidad ;
   private long A89U_CoMuSize ;
   private long A91U_MuDeSize ;
   private long A96U_AtrQ1 ;
   private long A97U_AtrQ2 ;
   private long A98U_AtrQ3 ;
   private long A99U_AtrQ4 ;
   private String sPrefix ;
   private String Z48Handwrtten ;
   private String Z49Canceled ;
   private String Z53Transfered ;
   private String Z54Status ;
   private String Z59DataSource ;
   private String Z60RequestStatus ;
   private String Z85UVID_CONTROLCHU_Estado ;
   private String Z86U_Traslado ;
   private String Z88U_ContraMu ;
   private String Z90U_MuestDes ;
   private String Z104U_Reanalis ;
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
   private String edtDocNum_Internalname ;
   private String edtDocNum_Jsonclick ;
   private String edtPeriod_Internalname ;
   private String edtPeriod_Jsonclick ;
   private String edtInstance_Internalname ;
   private String edtInstance_Jsonclick ;
   private String edtSeries_Internalname ;
   private String edtSeries_Jsonclick ;
   private String edtHandwrtten_Internalname ;
   private String A48Handwrtten ;
   private String edtHandwrtten_Jsonclick ;
   private String edtCanceled_Internalname ;
   private String A49Canceled ;
   private String edtCanceled_Jsonclick ;
   private String edtUVID_CONTROLCHObject_Internalname ;
   private String edtUVID_CONTROLCHObject_Jsonclick ;
   private String edtUVID_CONTROLCHLogInst_Internalname ;
   private String edtUVID_CONTROLCHLogInst_Jsonclick ;
   private String edtUserSign_Internalname ;
   private String edtUserSign_Jsonclick ;
   private String edtTransfered_Internalname ;
   private String A53Transfered ;
   private String edtTransfered_Jsonclick ;
   private String edtStatus_Internalname ;
   private String A54Status ;
   private String edtStatus_Jsonclick ;
   private String edtCreateDate_Internalname ;
   private String edtCreateDate_Jsonclick ;
   private String edtCreateTime_Internalname ;
   private String edtCreateTime_Jsonclick ;
   private String edtUpdateDate_Internalname ;
   private String edtUpdateDate_Jsonclick ;
   private String edtUpdateTime_Internalname ;
   private String edtUpdateTime_Jsonclick ;
   private String edtDataSource_Internalname ;
   private String A59DataSource ;
   private String edtDataSource_Jsonclick ;
   private String edtRequestStatus_Internalname ;
   private String A60RequestStatus ;
   private String edtRequestStatus_Jsonclick ;
   private String edtCreator_Internalname ;
   private String edtCreator_Jsonclick ;
   private String edtRemark_Internalname ;
   private String edtRemark_Jsonclick ;
   private String edtU_ItemCode_Internalname ;
   private String edtU_ItemCode_Jsonclick ;
   private String edtU_ItemName_Internalname ;
   private String edtU_ItemName_Jsonclick ;
   private String edtU_WhsCode_Internalname ;
   private String edtU_WhsCode_Jsonclick ;
   private String edtU_WhsDest_Internalname ;
   private String edtU_WhsDest_Jsonclick ;
   private String edtU_NumTras_Internalname ;
   private String edtU_NumTras_Jsonclick ;
   private String edtU_NumCon_Internalname ;
   private String edtU_NumCon_Jsonclick ;
   private String edtU_NumMusd_Internalname ;
   private String edtU_NumMusd_Jsonclick ;
   private String edtU_NoLote_Internalname ;
   private String edtU_NoLote_Jsonclick ;
   private String edtU_CorrLote_Internalname ;
   private String edtU_CorrLote_Jsonclick ;
   private String edtU_CorrAnal_Internalname ;
   private String edtU_CorrAnal_Jsonclick ;
   private String edtU_Cantidad_Internalname ;
   private String edtU_Cantidad_Jsonclick ;
   private String edtU_Bultos_Internalname ;
   private String edtU_Bultos_Jsonclick ;
   private String edtU_BultosMu_Internalname ;
   private String edtU_BultosMu_Jsonclick ;
   private String edtU_FecIngr_Internalname ;
   private String edtU_FecIngr_Jsonclick ;
   private String edtU_FecUltIn_Internalname ;
   private String edtU_FecUltIn_Jsonclick ;
   private String edtU_UM_Internalname ;
   private String edtU_UM_Jsonclick ;
   private String edtU_NoDoc_Internalname ;
   private String edtU_NoDoc_Jsonclick ;
   private String edtU_FecContr_Internalname ;
   private String edtU_FecContr_Jsonclick ;
   private String edtU_FecIni_Internalname ;
   private String edtU_FecIni_Jsonclick ;
   private String edtU_FecFin_Internalname ;
   private String edtU_FecFin_Jsonclick ;
   private String edtU_Usuario_Internalname ;
   private String edtU_Usuario_Jsonclick ;
   private String edtU_DocOrig_Internalname ;
   private String edtU_DocOrig_Jsonclick ;
   private String edtUVID_CONTROLCHU_Estado_Internalname ;
   private String A85UVID_CONTROLCHU_Estado ;
   private String edtUVID_CONTROLCHU_Estado_Jsonclick ;
   private String edtU_Traslado_Internalname ;
   private String A86U_Traslado ;
   private String edtU_Traslado_Jsonclick ;
   private String edtU_TipResul_Internalname ;
   private String edtU_TipResul_Jsonclick ;
   private String edtU_ContraMu_Internalname ;
   private String A88U_ContraMu ;
   private String edtU_ContraMu_Jsonclick ;
   private String edtU_CoMuSize_Internalname ;
   private String edtU_CoMuSize_Jsonclick ;
   private String edtU_MuestDes_Internalname ;
   private String A90U_MuestDes ;
   private String edtU_MuestDes_Jsonclick ;
   private String edtU_MuDeSize_Internalname ;
   private String edtU_MuDeSize_Jsonclick ;
   private String edtU_CtaCalid_Internalname ;
   private String edtU_CtaCalid_Jsonclick ;
   private String edtU_CCCode_Internalname ;
   private String edtU_CCCode_Jsonclick ;
   private String edtU_PrjCode_Internalname ;
   private String edtU_PrjCode_Jsonclick ;
   private String edtUVID_CONTROLCHU_Comment_Internalname ;
   private String edtU_AtrQ1_Internalname ;
   private String edtU_AtrQ1_Jsonclick ;
   private String edtU_AtrQ2_Internalname ;
   private String edtU_AtrQ2_Jsonclick ;
   private String edtU_AtrQ3_Internalname ;
   private String edtU_AtrQ3_Jsonclick ;
   private String edtU_AtrQ4_Internalname ;
   private String edtU_AtrQ4_Jsonclick ;
   private String edtU_AtrT1_Internalname ;
   private String edtU_AtrT2_Internalname ;
   private String edtU_AtrT3_Internalname ;
   private String edtU_AtrT4_Internalname ;
   private String edtU_Reanalis_Internalname ;
   private String A104U_Reanalis ;
   private String edtU_Reanalis_Jsonclick ;
   private String edtU_NroOF_Internalname ;
   private String edtU_NroOF_Jsonclick ;
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
   private java.util.Date Z55CreateDate ;
   private java.util.Date Z57UpdateDate ;
   private java.util.Date Z76U_FecIngr ;
   private java.util.Date Z77U_FecUltIn ;
   private java.util.Date Z80U_FecContr ;
   private java.util.Date Z81U_FecIni ;
   private java.util.Date Z82U_FecFin ;
   private java.util.Date A55CreateDate ;
   private java.util.Date A57UpdateDate ;
   private java.util.Date A76U_FecIngr ;
   private java.util.Date A77U_FecUltIn ;
   private java.util.Date A80U_FecContr ;
   private java.util.Date A81U_FecIni ;
   private java.util.Date A82U_FecFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n44DocNum ;
   private boolean n45Period ;
   private boolean n46Instance ;
   private boolean n47Series ;
   private boolean n48Handwrtten ;
   private boolean n49Canceled ;
   private boolean n50UVID_CONTROLCHObject ;
   private boolean n51UVID_CONTROLCHLogInst ;
   private boolean n52UserSign ;
   private boolean n53Transfered ;
   private boolean n54Status ;
   private boolean n55CreateDate ;
   private boolean n56CreateTime ;
   private boolean n57UpdateDate ;
   private boolean n58UpdateTime ;
   private boolean n59DataSource ;
   private boolean n60RequestStatus ;
   private boolean n61Creator ;
   private boolean n62Remark ;
   private boolean n63U_ItemCode ;
   private boolean n64U_ItemName ;
   private boolean n65U_WhsCode ;
   private boolean n66U_WhsDest ;
   private boolean n67U_NumTras ;
   private boolean n68U_NumCon ;
   private boolean n69U_NumMusd ;
   private boolean n70U_NoLote ;
   private boolean n71U_CorrLote ;
   private boolean n72U_CorrAnal ;
   private boolean n73U_Cantidad ;
   private boolean n74U_Bultos ;
   private boolean n75U_BultosMu ;
   private boolean n76U_FecIngr ;
   private boolean n77U_FecUltIn ;
   private boolean n78U_UM ;
   private boolean n79U_NoDoc ;
   private boolean n80U_FecContr ;
   private boolean n81U_FecIni ;
   private boolean n82U_FecFin ;
   private boolean n83U_Usuario ;
   private boolean n84U_DocOrig ;
   private boolean n85UVID_CONTROLCHU_Estado ;
   private boolean n86U_Traslado ;
   private boolean n87U_TipResul ;
   private boolean n88U_ContraMu ;
   private boolean n89U_CoMuSize ;
   private boolean n90U_MuestDes ;
   private boolean n91U_MuDeSize ;
   private boolean n92U_CtaCalid ;
   private boolean n93U_CCCode ;
   private boolean n94U_PrjCode ;
   private boolean n95UVID_CONTROLCHU_Comment ;
   private boolean n96U_AtrQ1 ;
   private boolean n97U_AtrQ2 ;
   private boolean n98U_AtrQ3 ;
   private boolean n99U_AtrQ4 ;
   private boolean n100U_AtrT1 ;
   private boolean n101U_AtrT2 ;
   private boolean n102U_AtrT3 ;
   private boolean n103U_AtrT4 ;
   private boolean n104U_Reanalis ;
   private boolean n105U_NroOF ;
   private boolean Gx_longc ;
   private String A62Remark ;
   private String Z62Remark ;
   private String Z50UVID_CONTROLCHObject ;
   private String Z61Creator ;
   private String Z63U_ItemCode ;
   private String Z64U_ItemName ;
   private String Z65U_WhsCode ;
   private String Z66U_WhsDest ;
   private String Z67U_NumTras ;
   private String Z68U_NumCon ;
   private String Z69U_NumMusd ;
   private String Z70U_NoLote ;
   private String Z78U_UM ;
   private String Z83U_Usuario ;
   private String Z87U_TipResul ;
   private String Z92U_CtaCalid ;
   private String Z93U_CCCode ;
   private String Z94U_PrjCode ;
   private String Z95UVID_CONTROLCHU_Comment ;
   private String Z100U_AtrT1 ;
   private String Z101U_AtrT2 ;
   private String Z102U_AtrT3 ;
   private String Z103U_AtrT4 ;
   private String A50UVID_CONTROLCHObject ;
   private String A61Creator ;
   private String A63U_ItemCode ;
   private String A64U_ItemName ;
   private String A65U_WhsCode ;
   private String A66U_WhsDest ;
   private String A67U_NumTras ;
   private String A68U_NumCon ;
   private String A69U_NumMusd ;
   private String A70U_NoLote ;
   private String A78U_UM ;
   private String A83U_Usuario ;
   private String A87U_TipResul ;
   private String A92U_CtaCalid ;
   private String A93U_CCCode ;
   private String A94U_PrjCode ;
   private String A95UVID_CONTROLCHU_Comment ;
   private String A100U_AtrT1 ;
   private String A101U_AtrT2 ;
   private String A102U_AtrT3 ;
   private String A103U_AtrT4 ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_fusquim_sap ;
   private int[] T00044_A43UVID_CONTROLCHDocEntry ;
   private int[] T00044_A44DocNum ;
   private boolean[] T00044_n44DocNum ;
   private int[] T00044_A45Period ;
   private boolean[] T00044_n45Period ;
   private short[] T00044_A46Instance ;
   private boolean[] T00044_n46Instance ;
   private int[] T00044_A47Series ;
   private boolean[] T00044_n47Series ;
   private String[] T00044_A48Handwrtten ;
   private boolean[] T00044_n48Handwrtten ;
   private String[] T00044_A49Canceled ;
   private boolean[] T00044_n49Canceled ;
   private String[] T00044_A50UVID_CONTROLCHObject ;
   private boolean[] T00044_n50UVID_CONTROLCHObject ;
   private int[] T00044_A51UVID_CONTROLCHLogInst ;
   private boolean[] T00044_n51UVID_CONTROLCHLogInst ;
   private int[] T00044_A52UserSign ;
   private boolean[] T00044_n52UserSign ;
   private String[] T00044_A53Transfered ;
   private boolean[] T00044_n53Transfered ;
   private String[] T00044_A54Status ;
   private boolean[] T00044_n54Status ;
   private java.util.Date[] T00044_A55CreateDate ;
   private boolean[] T00044_n55CreateDate ;
   private short[] T00044_A56CreateTime ;
   private boolean[] T00044_n56CreateTime ;
   private java.util.Date[] T00044_A57UpdateDate ;
   private boolean[] T00044_n57UpdateDate ;
   private short[] T00044_A58UpdateTime ;
   private boolean[] T00044_n58UpdateTime ;
   private String[] T00044_A59DataSource ;
   private boolean[] T00044_n59DataSource ;
   private String[] T00044_A60RequestStatus ;
   private boolean[] T00044_n60RequestStatus ;
   private String[] T00044_A61Creator ;
   private boolean[] T00044_n61Creator ;
   private String[] T00044_A62Remark ;
   private boolean[] T00044_n62Remark ;
   private String[] T00044_A63U_ItemCode ;
   private boolean[] T00044_n63U_ItemCode ;
   private String[] T00044_A64U_ItemName ;
   private boolean[] T00044_n64U_ItemName ;
   private String[] T00044_A65U_WhsCode ;
   private boolean[] T00044_n65U_WhsCode ;
   private String[] T00044_A66U_WhsDest ;
   private boolean[] T00044_n66U_WhsDest ;
   private String[] T00044_A67U_NumTras ;
   private boolean[] T00044_n67U_NumTras ;
   private String[] T00044_A68U_NumCon ;
   private boolean[] T00044_n68U_NumCon ;
   private String[] T00044_A69U_NumMusd ;
   private boolean[] T00044_n69U_NumMusd ;
   private String[] T00044_A70U_NoLote ;
   private boolean[] T00044_n70U_NoLote ;
   private int[] T00044_A71U_CorrLote ;
   private boolean[] T00044_n71U_CorrLote ;
   private int[] T00044_A72U_CorrAnal ;
   private boolean[] T00044_n72U_CorrAnal ;
   private long[] T00044_A73U_Cantidad ;
   private boolean[] T00044_n73U_Cantidad ;
   private int[] T00044_A74U_Bultos ;
   private boolean[] T00044_n74U_Bultos ;
   private int[] T00044_A75U_BultosMu ;
   private boolean[] T00044_n75U_BultosMu ;
   private java.util.Date[] T00044_A76U_FecIngr ;
   private boolean[] T00044_n76U_FecIngr ;
   private java.util.Date[] T00044_A77U_FecUltIn ;
   private boolean[] T00044_n77U_FecUltIn ;
   private String[] T00044_A78U_UM ;
   private boolean[] T00044_n78U_UM ;
   private int[] T00044_A79U_NoDoc ;
   private boolean[] T00044_n79U_NoDoc ;
   private java.util.Date[] T00044_A80U_FecContr ;
   private boolean[] T00044_n80U_FecContr ;
   private java.util.Date[] T00044_A81U_FecIni ;
   private boolean[] T00044_n81U_FecIni ;
   private java.util.Date[] T00044_A82U_FecFin ;
   private boolean[] T00044_n82U_FecFin ;
   private String[] T00044_A83U_Usuario ;
   private boolean[] T00044_n83U_Usuario ;
   private int[] T00044_A84U_DocOrig ;
   private boolean[] T00044_n84U_DocOrig ;
   private String[] T00044_A85UVID_CONTROLCHU_Estado ;
   private boolean[] T00044_n85UVID_CONTROLCHU_Estado ;
   private String[] T00044_A86U_Traslado ;
   private boolean[] T00044_n86U_Traslado ;
   private String[] T00044_A87U_TipResul ;
   private boolean[] T00044_n87U_TipResul ;
   private String[] T00044_A88U_ContraMu ;
   private boolean[] T00044_n88U_ContraMu ;
   private long[] T00044_A89U_CoMuSize ;
   private boolean[] T00044_n89U_CoMuSize ;
   private String[] T00044_A90U_MuestDes ;
   private boolean[] T00044_n90U_MuestDes ;
   private long[] T00044_A91U_MuDeSize ;
   private boolean[] T00044_n91U_MuDeSize ;
   private String[] T00044_A92U_CtaCalid ;
   private boolean[] T00044_n92U_CtaCalid ;
   private String[] T00044_A93U_CCCode ;
   private boolean[] T00044_n93U_CCCode ;
   private String[] T00044_A94U_PrjCode ;
   private boolean[] T00044_n94U_PrjCode ;
   private String[] T00044_A95UVID_CONTROLCHU_Comment ;
   private boolean[] T00044_n95UVID_CONTROLCHU_Comment ;
   private long[] T00044_A96U_AtrQ1 ;
   private boolean[] T00044_n96U_AtrQ1 ;
   private long[] T00044_A97U_AtrQ2 ;
   private boolean[] T00044_n97U_AtrQ2 ;
   private long[] T00044_A98U_AtrQ3 ;
   private boolean[] T00044_n98U_AtrQ3 ;
   private long[] T00044_A99U_AtrQ4 ;
   private boolean[] T00044_n99U_AtrQ4 ;
   private String[] T00044_A100U_AtrT1 ;
   private boolean[] T00044_n100U_AtrT1 ;
   private String[] T00044_A101U_AtrT2 ;
   private boolean[] T00044_n101U_AtrT2 ;
   private String[] T00044_A102U_AtrT3 ;
   private boolean[] T00044_n102U_AtrT3 ;
   private String[] T00044_A103U_AtrT4 ;
   private boolean[] T00044_n103U_AtrT4 ;
   private String[] T00044_A104U_Reanalis ;
   private boolean[] T00044_n104U_Reanalis ;
   private int[] T00044_A105U_NroOF ;
   private boolean[] T00044_n105U_NroOF ;
   private int[] T00045_A43UVID_CONTROLCHDocEntry ;
   private int[] T00043_A43UVID_CONTROLCHDocEntry ;
   private int[] T00043_A44DocNum ;
   private boolean[] T00043_n44DocNum ;
   private int[] T00043_A45Period ;
   private boolean[] T00043_n45Period ;
   private short[] T00043_A46Instance ;
   private boolean[] T00043_n46Instance ;
   private int[] T00043_A47Series ;
   private boolean[] T00043_n47Series ;
   private String[] T00043_A48Handwrtten ;
   private boolean[] T00043_n48Handwrtten ;
   private String[] T00043_A49Canceled ;
   private boolean[] T00043_n49Canceled ;
   private String[] T00043_A50UVID_CONTROLCHObject ;
   private boolean[] T00043_n50UVID_CONTROLCHObject ;
   private int[] T00043_A51UVID_CONTROLCHLogInst ;
   private boolean[] T00043_n51UVID_CONTROLCHLogInst ;
   private int[] T00043_A52UserSign ;
   private boolean[] T00043_n52UserSign ;
   private String[] T00043_A53Transfered ;
   private boolean[] T00043_n53Transfered ;
   private String[] T00043_A54Status ;
   private boolean[] T00043_n54Status ;
   private java.util.Date[] T00043_A55CreateDate ;
   private boolean[] T00043_n55CreateDate ;
   private short[] T00043_A56CreateTime ;
   private boolean[] T00043_n56CreateTime ;
   private java.util.Date[] T00043_A57UpdateDate ;
   private boolean[] T00043_n57UpdateDate ;
   private short[] T00043_A58UpdateTime ;
   private boolean[] T00043_n58UpdateTime ;
   private String[] T00043_A59DataSource ;
   private boolean[] T00043_n59DataSource ;
   private String[] T00043_A60RequestStatus ;
   private boolean[] T00043_n60RequestStatus ;
   private String[] T00043_A61Creator ;
   private boolean[] T00043_n61Creator ;
   private String[] T00043_A62Remark ;
   private boolean[] T00043_n62Remark ;
   private String[] T00043_A63U_ItemCode ;
   private boolean[] T00043_n63U_ItemCode ;
   private String[] T00043_A64U_ItemName ;
   private boolean[] T00043_n64U_ItemName ;
   private String[] T00043_A65U_WhsCode ;
   private boolean[] T00043_n65U_WhsCode ;
   private String[] T00043_A66U_WhsDest ;
   private boolean[] T00043_n66U_WhsDest ;
   private String[] T00043_A67U_NumTras ;
   private boolean[] T00043_n67U_NumTras ;
   private String[] T00043_A68U_NumCon ;
   private boolean[] T00043_n68U_NumCon ;
   private String[] T00043_A69U_NumMusd ;
   private boolean[] T00043_n69U_NumMusd ;
   private String[] T00043_A70U_NoLote ;
   private boolean[] T00043_n70U_NoLote ;
   private int[] T00043_A71U_CorrLote ;
   private boolean[] T00043_n71U_CorrLote ;
   private int[] T00043_A72U_CorrAnal ;
   private boolean[] T00043_n72U_CorrAnal ;
   private long[] T00043_A73U_Cantidad ;
   private boolean[] T00043_n73U_Cantidad ;
   private int[] T00043_A74U_Bultos ;
   private boolean[] T00043_n74U_Bultos ;
   private int[] T00043_A75U_BultosMu ;
   private boolean[] T00043_n75U_BultosMu ;
   private java.util.Date[] T00043_A76U_FecIngr ;
   private boolean[] T00043_n76U_FecIngr ;
   private java.util.Date[] T00043_A77U_FecUltIn ;
   private boolean[] T00043_n77U_FecUltIn ;
   private String[] T00043_A78U_UM ;
   private boolean[] T00043_n78U_UM ;
   private int[] T00043_A79U_NoDoc ;
   private boolean[] T00043_n79U_NoDoc ;
   private java.util.Date[] T00043_A80U_FecContr ;
   private boolean[] T00043_n80U_FecContr ;
   private java.util.Date[] T00043_A81U_FecIni ;
   private boolean[] T00043_n81U_FecIni ;
   private java.util.Date[] T00043_A82U_FecFin ;
   private boolean[] T00043_n82U_FecFin ;
   private String[] T00043_A83U_Usuario ;
   private boolean[] T00043_n83U_Usuario ;
   private int[] T00043_A84U_DocOrig ;
   private boolean[] T00043_n84U_DocOrig ;
   private String[] T00043_A85UVID_CONTROLCHU_Estado ;
   private boolean[] T00043_n85UVID_CONTROLCHU_Estado ;
   private String[] T00043_A86U_Traslado ;
   private boolean[] T00043_n86U_Traslado ;
   private String[] T00043_A87U_TipResul ;
   private boolean[] T00043_n87U_TipResul ;
   private String[] T00043_A88U_ContraMu ;
   private boolean[] T00043_n88U_ContraMu ;
   private long[] T00043_A89U_CoMuSize ;
   private boolean[] T00043_n89U_CoMuSize ;
   private String[] T00043_A90U_MuestDes ;
   private boolean[] T00043_n90U_MuestDes ;
   private long[] T00043_A91U_MuDeSize ;
   private boolean[] T00043_n91U_MuDeSize ;
   private String[] T00043_A92U_CtaCalid ;
   private boolean[] T00043_n92U_CtaCalid ;
   private String[] T00043_A93U_CCCode ;
   private boolean[] T00043_n93U_CCCode ;
   private String[] T00043_A94U_PrjCode ;
   private boolean[] T00043_n94U_PrjCode ;
   private String[] T00043_A95UVID_CONTROLCHU_Comment ;
   private boolean[] T00043_n95UVID_CONTROLCHU_Comment ;
   private long[] T00043_A96U_AtrQ1 ;
   private boolean[] T00043_n96U_AtrQ1 ;
   private long[] T00043_A97U_AtrQ2 ;
   private boolean[] T00043_n97U_AtrQ2 ;
   private long[] T00043_A98U_AtrQ3 ;
   private boolean[] T00043_n98U_AtrQ3 ;
   private long[] T00043_A99U_AtrQ4 ;
   private boolean[] T00043_n99U_AtrQ4 ;
   private String[] T00043_A100U_AtrT1 ;
   private boolean[] T00043_n100U_AtrT1 ;
   private String[] T00043_A101U_AtrT2 ;
   private boolean[] T00043_n101U_AtrT2 ;
   private String[] T00043_A102U_AtrT3 ;
   private boolean[] T00043_n102U_AtrT3 ;
   private String[] T00043_A103U_AtrT4 ;
   private boolean[] T00043_n103U_AtrT4 ;
   private String[] T00043_A104U_Reanalis ;
   private boolean[] T00043_n104U_Reanalis ;
   private int[] T00043_A105U_NroOF ;
   private boolean[] T00043_n105U_NroOF ;
   private int[] T00046_A43UVID_CONTROLCHDocEntry ;
   private int[] T00047_A43UVID_CONTROLCHDocEntry ;
   private int[] T00042_A43UVID_CONTROLCHDocEntry ;
   private int[] T00042_A44DocNum ;
   private boolean[] T00042_n44DocNum ;
   private int[] T00042_A45Period ;
   private boolean[] T00042_n45Period ;
   private short[] T00042_A46Instance ;
   private boolean[] T00042_n46Instance ;
   private int[] T00042_A47Series ;
   private boolean[] T00042_n47Series ;
   private String[] T00042_A48Handwrtten ;
   private boolean[] T00042_n48Handwrtten ;
   private String[] T00042_A49Canceled ;
   private boolean[] T00042_n49Canceled ;
   private String[] T00042_A50UVID_CONTROLCHObject ;
   private boolean[] T00042_n50UVID_CONTROLCHObject ;
   private int[] T00042_A51UVID_CONTROLCHLogInst ;
   private boolean[] T00042_n51UVID_CONTROLCHLogInst ;
   private int[] T00042_A52UserSign ;
   private boolean[] T00042_n52UserSign ;
   private String[] T00042_A53Transfered ;
   private boolean[] T00042_n53Transfered ;
   private String[] T00042_A54Status ;
   private boolean[] T00042_n54Status ;
   private java.util.Date[] T00042_A55CreateDate ;
   private boolean[] T00042_n55CreateDate ;
   private short[] T00042_A56CreateTime ;
   private boolean[] T00042_n56CreateTime ;
   private java.util.Date[] T00042_A57UpdateDate ;
   private boolean[] T00042_n57UpdateDate ;
   private short[] T00042_A58UpdateTime ;
   private boolean[] T00042_n58UpdateTime ;
   private String[] T00042_A59DataSource ;
   private boolean[] T00042_n59DataSource ;
   private String[] T00042_A60RequestStatus ;
   private boolean[] T00042_n60RequestStatus ;
   private String[] T00042_A61Creator ;
   private boolean[] T00042_n61Creator ;
   private String[] T00042_A62Remark ;
   private boolean[] T00042_n62Remark ;
   private String[] T00042_A63U_ItemCode ;
   private boolean[] T00042_n63U_ItemCode ;
   private String[] T00042_A64U_ItemName ;
   private boolean[] T00042_n64U_ItemName ;
   private String[] T00042_A65U_WhsCode ;
   private boolean[] T00042_n65U_WhsCode ;
   private String[] T00042_A66U_WhsDest ;
   private boolean[] T00042_n66U_WhsDest ;
   private String[] T00042_A67U_NumTras ;
   private boolean[] T00042_n67U_NumTras ;
   private String[] T00042_A68U_NumCon ;
   private boolean[] T00042_n68U_NumCon ;
   private String[] T00042_A69U_NumMusd ;
   private boolean[] T00042_n69U_NumMusd ;
   private String[] T00042_A70U_NoLote ;
   private boolean[] T00042_n70U_NoLote ;
   private int[] T00042_A71U_CorrLote ;
   private boolean[] T00042_n71U_CorrLote ;
   private int[] T00042_A72U_CorrAnal ;
   private boolean[] T00042_n72U_CorrAnal ;
   private long[] T00042_A73U_Cantidad ;
   private boolean[] T00042_n73U_Cantidad ;
   private int[] T00042_A74U_Bultos ;
   private boolean[] T00042_n74U_Bultos ;
   private int[] T00042_A75U_BultosMu ;
   private boolean[] T00042_n75U_BultosMu ;
   private java.util.Date[] T00042_A76U_FecIngr ;
   private boolean[] T00042_n76U_FecIngr ;
   private java.util.Date[] T00042_A77U_FecUltIn ;
   private boolean[] T00042_n77U_FecUltIn ;
   private String[] T00042_A78U_UM ;
   private boolean[] T00042_n78U_UM ;
   private int[] T00042_A79U_NoDoc ;
   private boolean[] T00042_n79U_NoDoc ;
   private java.util.Date[] T00042_A80U_FecContr ;
   private boolean[] T00042_n80U_FecContr ;
   private java.util.Date[] T00042_A81U_FecIni ;
   private boolean[] T00042_n81U_FecIni ;
   private java.util.Date[] T00042_A82U_FecFin ;
   private boolean[] T00042_n82U_FecFin ;
   private String[] T00042_A83U_Usuario ;
   private boolean[] T00042_n83U_Usuario ;
   private int[] T00042_A84U_DocOrig ;
   private boolean[] T00042_n84U_DocOrig ;
   private String[] T00042_A85UVID_CONTROLCHU_Estado ;
   private boolean[] T00042_n85UVID_CONTROLCHU_Estado ;
   private String[] T00042_A86U_Traslado ;
   private boolean[] T00042_n86U_Traslado ;
   private String[] T00042_A87U_TipResul ;
   private boolean[] T00042_n87U_TipResul ;
   private String[] T00042_A88U_ContraMu ;
   private boolean[] T00042_n88U_ContraMu ;
   private long[] T00042_A89U_CoMuSize ;
   private boolean[] T00042_n89U_CoMuSize ;
   private String[] T00042_A90U_MuestDes ;
   private boolean[] T00042_n90U_MuestDes ;
   private long[] T00042_A91U_MuDeSize ;
   private boolean[] T00042_n91U_MuDeSize ;
   private String[] T00042_A92U_CtaCalid ;
   private boolean[] T00042_n92U_CtaCalid ;
   private String[] T00042_A93U_CCCode ;
   private boolean[] T00042_n93U_CCCode ;
   private String[] T00042_A94U_PrjCode ;
   private boolean[] T00042_n94U_PrjCode ;
   private String[] T00042_A95UVID_CONTROLCHU_Comment ;
   private boolean[] T00042_n95UVID_CONTROLCHU_Comment ;
   private long[] T00042_A96U_AtrQ1 ;
   private boolean[] T00042_n96U_AtrQ1 ;
   private long[] T00042_A97U_AtrQ2 ;
   private boolean[] T00042_n97U_AtrQ2 ;
   private long[] T00042_A98U_AtrQ3 ;
   private boolean[] T00042_n98U_AtrQ3 ;
   private long[] T00042_A99U_AtrQ4 ;
   private boolean[] T00042_n99U_AtrQ4 ;
   private String[] T00042_A100U_AtrT1 ;
   private boolean[] T00042_n100U_AtrT1 ;
   private String[] T00042_A101U_AtrT2 ;
   private boolean[] T00042_n101U_AtrT2 ;
   private String[] T00042_A102U_AtrT3 ;
   private boolean[] T00042_n102U_AtrT3 ;
   private String[] T00042_A103U_AtrT4 ;
   private boolean[] T00042_n103U_AtrT4 ;
   private String[] T00042_A104U_Reanalis ;
   private boolean[] T00042_n104U_Reanalis ;
   private int[] T00042_A105U_NroOF ;
   private boolean[] T00042_n105U_NroOF ;
   private IDataStoreProvider pr_default ;
   private int[] T000411_A43UVID_CONTROLCHDocEntry ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class uvid_controlch__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00042", "SELECT [DocEntry], [DocNum], [Period], [Instance], [Series], [Handwrtten], [Canceled], [Object], [LogInst], [UserSign], [Transfered], [Status], [CreateDate], [CreateTime], [UpdateDate], [UpdateTime], [DataSource], [RequestStatus], [Creator], [Remark], [U_ItemCode], [U_ItemName], [U_WhsCode], [U_WhsDest], [U_NumTras], [U_NumCon], [U_NumMusd], [U_NoLote], [U_CorrLote], [U_CorrAnal], [U_Cantidad], [U_Bultos], [U_BultosMu], [U_FecIngr], [U_FecUltIn], [U_UM], [U_NoDoc], [U_FecContr], [U_FecIni], [U_FecFin], [U_Usuario], [U_DocOrig], [U_Estado], [U_Traslado], [U_TipResul], [U_ContraMu], [U_CoMuSize], [U_MuestDes], [U_MuDeSize], [U_CtaCalid], [U_CCCode], [U_PrjCode], [U_Comment], [U_AtrQ1], [U_AtrQ2], [U_AtrQ3], [U_AtrQ4], [U_AtrT1], [U_AtrT2], [U_AtrT3], [U_AtrT4], [U_Reanalis], [U_NroOF] FROM dbo.[@VID_CONTROLCH] WITH (UPDLOCK) WHERE [DocEntry] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00043", "SELECT [DocEntry], [DocNum], [Period], [Instance], [Series], [Handwrtten], [Canceled], [Object], [LogInst], [UserSign], [Transfered], [Status], [CreateDate], [CreateTime], [UpdateDate], [UpdateTime], [DataSource], [RequestStatus], [Creator], [Remark], [U_ItemCode], [U_ItemName], [U_WhsCode], [U_WhsDest], [U_NumTras], [U_NumCon], [U_NumMusd], [U_NoLote], [U_CorrLote], [U_CorrAnal], [U_Cantidad], [U_Bultos], [U_BultosMu], [U_FecIngr], [U_FecUltIn], [U_UM], [U_NoDoc], [U_FecContr], [U_FecIni], [U_FecFin], [U_Usuario], [U_DocOrig], [U_Estado], [U_Traslado], [U_TipResul], [U_ContraMu], [U_CoMuSize], [U_MuestDes], [U_MuDeSize], [U_CtaCalid], [U_CCCode], [U_PrjCode], [U_Comment], [U_AtrQ1], [U_AtrQ2], [U_AtrQ3], [U_AtrQ4], [U_AtrT1], [U_AtrT2], [U_AtrT3], [U_AtrT4], [U_Reanalis], [U_NroOF] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) WHERE [DocEntry] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00044", "SELECT TM1.[DocEntry], TM1.[DocNum], TM1.[Period], TM1.[Instance], TM1.[Series], TM1.[Handwrtten], TM1.[Canceled], TM1.[Object], TM1.[LogInst], TM1.[UserSign], TM1.[Transfered], TM1.[Status], TM1.[CreateDate], TM1.[CreateTime], TM1.[UpdateDate], TM1.[UpdateTime], TM1.[DataSource], TM1.[RequestStatus], TM1.[Creator], TM1.[Remark], TM1.[U_ItemCode], TM1.[U_ItemName], TM1.[U_WhsCode], TM1.[U_WhsDest], TM1.[U_NumTras], TM1.[U_NumCon], TM1.[U_NumMusd], TM1.[U_NoLote], TM1.[U_CorrLote], TM1.[U_CorrAnal], TM1.[U_Cantidad], TM1.[U_Bultos], TM1.[U_BultosMu], TM1.[U_FecIngr], TM1.[U_FecUltIn], TM1.[U_UM], TM1.[U_NoDoc], TM1.[U_FecContr], TM1.[U_FecIni], TM1.[U_FecFin], TM1.[U_Usuario], TM1.[U_DocOrig], TM1.[U_Estado], TM1.[U_Traslado], TM1.[U_TipResul], TM1.[U_ContraMu], TM1.[U_CoMuSize], TM1.[U_MuestDes], TM1.[U_MuDeSize], TM1.[U_CtaCalid], TM1.[U_CCCode], TM1.[U_PrjCode], TM1.[U_Comment], TM1.[U_AtrQ1], TM1.[U_AtrQ2], TM1.[U_AtrQ3], TM1.[U_AtrQ4], TM1.[U_AtrT1], TM1.[U_AtrT2], TM1.[U_AtrT3], TM1.[U_AtrT4], TM1.[U_Reanalis], TM1.[U_NroOF] FROM dbo.[@VID_CONTROLCH] TM1 WITH (NOLOCK) WHERE TM1.[DocEntry] = ? ORDER BY TM1.[DocEntry]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00045", "SELECT [DocEntry] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) WHERE [DocEntry] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00046", "SELECT TOP 1 [DocEntry] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) WHERE ( [DocEntry] > ?) ORDER BY [DocEntry]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00047", "SELECT TOP 1 [DocEntry] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) WHERE ( [DocEntry] < ?) ORDER BY [DocEntry] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00048", "INSERT INTO dbo.[@VID_CONTROLCH]([DocEntry], [DocNum], [Period], [Instance], [Series], [Handwrtten], [Canceled], [Object], [LogInst], [UserSign], [Transfered], [Status], [CreateDate], [CreateTime], [UpdateDate], [UpdateTime], [DataSource], [RequestStatus], [Creator], [Remark], [U_ItemCode], [U_ItemName], [U_WhsCode], [U_WhsDest], [U_NumTras], [U_NumCon], [U_NumMusd], [U_NoLote], [U_CorrLote], [U_CorrAnal], [U_Cantidad], [U_Bultos], [U_BultosMu], [U_FecIngr], [U_FecUltIn], [U_UM], [U_NoDoc], [U_FecContr], [U_FecIni], [U_FecFin], [U_Usuario], [U_DocOrig], [U_Estado], [U_Traslado], [U_TipResul], [U_ContraMu], [U_CoMuSize], [U_MuestDes], [U_MuDeSize], [U_CtaCalid], [U_CCCode], [U_PrjCode], [U_Comment], [U_AtrQ1], [U_AtrQ2], [U_AtrQ3], [U_AtrQ4], [U_AtrT1], [U_AtrT2], [U_AtrT3], [U_AtrT4], [U_Reanalis], [U_NroOF]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00049", "UPDATE dbo.[@VID_CONTROLCH] SET [DocNum]=?, [Period]=?, [Instance]=?, [Series]=?, [Handwrtten]=?, [Canceled]=?, [Object]=?, [LogInst]=?, [UserSign]=?, [Transfered]=?, [Status]=?, [CreateDate]=?, [CreateTime]=?, [UpdateDate]=?, [UpdateTime]=?, [DataSource]=?, [RequestStatus]=?, [Creator]=?, [Remark]=?, [U_ItemCode]=?, [U_ItemName]=?, [U_WhsCode]=?, [U_WhsDest]=?, [U_NumTras]=?, [U_NumCon]=?, [U_NumMusd]=?, [U_NoLote]=?, [U_CorrLote]=?, [U_CorrAnal]=?, [U_Cantidad]=?, [U_Bultos]=?, [U_BultosMu]=?, [U_FecIngr]=?, [U_FecUltIn]=?, [U_UM]=?, [U_NoDoc]=?, [U_FecContr]=?, [U_FecIni]=?, [U_FecFin]=?, [U_Usuario]=?, [U_DocOrig]=?, [U_Estado]=?, [U_Traslado]=?, [U_TipResul]=?, [U_ContraMu]=?, [U_CoMuSize]=?, [U_MuestDes]=?, [U_MuDeSize]=?, [U_CtaCalid]=?, [U_CCCode]=?, [U_PrjCode]=?, [U_Comment]=?, [U_AtrQ1]=?, [U_AtrQ2]=?, [U_AtrQ3]=?, [U_AtrQ4]=?, [U_AtrT1]=?, [U_AtrT2]=?, [U_AtrT3]=?, [U_AtrT4]=?, [U_Reanalis]=?, [U_NroOF]=?  WHERE [DocEntry] = ?", GX_NOMASK)
         ,new UpdateCursor("T000410", "DELETE FROM dbo.[@VID_CONTROLCH]  WHERE [DocEntry] = ?", GX_NOMASK)
         ,new ForEachCursor("T000411", "SELECT [DocEntry] FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK) ORDER BY [DocEntry]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(29) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((int[]) buf[57])[0] = rslt.getInt(30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((long[]) buf[59])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((int[]) buf[61])[0] = rslt.getInt(32) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((int[]) buf[63])[0] = rslt.getInt(33) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[65])[0] = rslt.getGXDateTime(34) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[67])[0] = rslt.getGXDateTime(35) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((int[]) buf[71])[0] = rslt.getInt(37) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDateTime(38) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDateTime(39) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDateTime(40) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((int[]) buf[81])[0] = rslt.getInt(42) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(43, 1) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(44, 1) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(46, 1) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((long[]) buf[91])[0] = rslt.getLong(47) ;
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(48, 1) ;
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((long[]) buf[95])[0] = rslt.getLong(49) ;
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(50) ;
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getVarchar(51) ;
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getVarchar(52) ;
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getVarchar(53) ;
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((long[]) buf[105])[0] = rslt.getLong(54) ;
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((long[]) buf[107])[0] = rslt.getLong(55) ;
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((long[]) buf[109])[0] = rslt.getLong(56) ;
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((long[]) buf[111])[0] = rslt.getLong(57) ;
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getVarchar(58) ;
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getVarchar(59) ;
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((String[]) buf[117])[0] = rslt.getVarchar(60) ;
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getVarchar(61) ;
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(62, 1) ;
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((int[]) buf[123])[0] = rslt.getInt(63) ;
               ((boolean[]) buf[124])[0] = rslt.wasNull();
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
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(29) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((int[]) buf[57])[0] = rslt.getInt(30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((long[]) buf[59])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((int[]) buf[61])[0] = rslt.getInt(32) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((int[]) buf[63])[0] = rslt.getInt(33) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[65])[0] = rslt.getGXDateTime(34) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[67])[0] = rslt.getGXDateTime(35) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((int[]) buf[71])[0] = rslt.getInt(37) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDateTime(38) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDateTime(39) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDateTime(40) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((int[]) buf[81])[0] = rslt.getInt(42) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(43, 1) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(44, 1) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(46, 1) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((long[]) buf[91])[0] = rslt.getLong(47) ;
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(48, 1) ;
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((long[]) buf[95])[0] = rslt.getLong(49) ;
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(50) ;
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getVarchar(51) ;
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getVarchar(52) ;
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getVarchar(53) ;
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((long[]) buf[105])[0] = rslt.getLong(54) ;
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((long[]) buf[107])[0] = rslt.getLong(55) ;
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((long[]) buf[109])[0] = rslt.getLong(56) ;
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((long[]) buf[111])[0] = rslt.getLong(57) ;
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getVarchar(58) ;
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getVarchar(59) ;
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((String[]) buf[117])[0] = rslt.getVarchar(60) ;
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getVarchar(61) ;
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(62, 1) ;
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((int[]) buf[123])[0] = rslt.getInt(63) ;
               ((boolean[]) buf[124])[0] = rslt.wasNull();
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
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(29) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((int[]) buf[57])[0] = rslt.getInt(30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((long[]) buf[59])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((int[]) buf[61])[0] = rslt.getInt(32) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((int[]) buf[63])[0] = rslt.getInt(33) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[65])[0] = rslt.getGXDateTime(34) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[67])[0] = rslt.getGXDateTime(35) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((int[]) buf[71])[0] = rslt.getInt(37) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDateTime(38) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDateTime(39) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDateTime(40) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((int[]) buf[81])[0] = rslt.getInt(42) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(43, 1) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(44, 1) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(46, 1) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((long[]) buf[91])[0] = rslt.getLong(47) ;
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(48, 1) ;
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((long[]) buf[95])[0] = rslt.getLong(49) ;
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(50) ;
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getVarchar(51) ;
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getVarchar(52) ;
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getVarchar(53) ;
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((long[]) buf[105])[0] = rslt.getLong(54) ;
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((long[]) buf[107])[0] = rslt.getLong(55) ;
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((long[]) buf[109])[0] = rslt.getLong(56) ;
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((long[]) buf[111])[0] = rslt.getLong(57) ;
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getVarchar(58) ;
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getVarchar(59) ;
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((String[]) buf[117])[0] = rslt.getVarchar(60) ;
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getVarchar(61) ;
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(62, 1) ;
               ((boolean[]) buf[122])[0] = rslt.wasNull();
               ((int[]) buf[123])[0] = rslt.getInt(63) ;
               ((boolean[]) buf[124])[0] = rslt.wasNull();
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
                  stmt.setVarchar(23, (String)parms[44], 8);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[46], 8);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[48], 8);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[50], 8);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[52], 8);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[54], 32);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[56]).intValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[58]).intValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(31, ((Number) parms[60]).longValue(), 0);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[62]).intValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(33, ((Number) parms[64]).intValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(34, (java.util.Date)parms[66], false);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(35, (java.util.Date)parms[68], false);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[70], 15);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[72]).intValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(38, (java.util.Date)parms[74], false);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(39, (java.util.Date)parms[76], false);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(40, (java.util.Date)parms[78], false);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[80], 20);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(42, ((Number) parms[82]).intValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[84], 1);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[86], 1);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[88], 8);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[90], 1);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(47, ((Number) parms[92]).longValue(), 0);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[94], 1);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(49, ((Number) parms[96]).longValue(), 0);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(50, (String)parms[98], 20);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(51, (String)parms[100], 8);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(52, (String)parms[102], 8);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(53, (String)parms[104], 254);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(54, ((Number) parms[106]).longValue(), 0);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(55, ((Number) parms[108]).longValue(), 0);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(56, ((Number) parms[110]).longValue(), 0);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(57, ((Number) parms[112]).longValue(), 0);
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(58, (String)parms[114], 254);
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(59, (String)parms[116], 254);
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(60, (String)parms[118], 254);
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(61, (String)parms[120], 254);
               }
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[122], 1);
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(63, ((Number) parms[124]).intValue());
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
                  stmt.setVarchar(22, (String)parms[43], 8);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 8);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 8);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 8);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 8);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 32);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[55]).intValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[57]).intValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(30, ((Number) parms[59]).longValue(), 0);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[61]).intValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[63]).intValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(33, (java.util.Date)parms[65], false);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(34, (java.util.Date)parms[67], false);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[69], 15);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(36, ((Number) parms[71]).intValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(37, (java.util.Date)parms[73], false);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(38, (java.util.Date)parms[75], false);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(39, (java.util.Date)parms[77], false);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[79], 20);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(41, ((Number) parms[81]).intValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[83], 1);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[85], 1);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[87], 8);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[89], 1);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(46, ((Number) parms[91]).longValue(), 0);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[93], 1);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(48, ((Number) parms[95]).longValue(), 0);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(49, (String)parms[97], 20);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(50, (String)parms[99], 8);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(51, (String)parms[101], 8);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(52, (String)parms[103], 254);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(53, ((Number) parms[105]).longValue(), 0);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(54, ((Number) parms[107]).longValue(), 0);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(55, ((Number) parms[109]).longValue(), 0);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(56, ((Number) parms[111]).longValue(), 0);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(57, (String)parms[113], 254);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(58, (String)parms[115], 254);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(59, (String)parms[117], 254);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(60, (String)parms[119], 254);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[121], 1);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(62, ((Number) parms[123]).intValue());
               }
               stmt.setInt(63, ((Number) parms[124]).intValue());
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

final  class uvid_controlch__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

