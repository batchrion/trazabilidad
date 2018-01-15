/*
               File: stockcuar_impl
        Description: Stock Cuar
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:13.12
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

public final  class stockcuar_impl extends GXDataArea
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
         Form.getMeta().addItem("description", "Stock Cuar", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtFila_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public stockcuar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public stockcuar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( stockcuar_impl.class ));
   }

   public stockcuar_impl( int remoteHandle ,
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
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Stock Cuar", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_StockCuar.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StockCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StockCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StockCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StockCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.wms.gx00d0"+"',["+"{Ctrl:gx.dom.el('"+"FILA"+"'), id:'"+"FILA"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_StockCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtFila_Internalname, "Fila", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtFila_Internalname, GXutil.ltrim( localUtil.ntoc( A203Fila, (byte)(18), (byte)(0), ",", "")), ((edtFila_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A203Fila), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A203Fila), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFila_Jsonclick, 0, "Attribute", "", "", "", 1, edtFila_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_StockCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtCodArticulo_Internalname, "Cod Articulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCodArticulo_Internalname, A197CodArticulo, GXutil.rtrim( localUtil.format( A197CodArticulo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodArticulo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCodArticulo_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_StockCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtArticulo_Internalname, "Articulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtArticulo_Internalname, A198Articulo, GXutil.rtrim( localUtil.format( A198Articulo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArticulo_Jsonclick, 0, "Attribute", "", "", "", 1, edtArticulo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_StockCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtCodBodega_Internalname, "Cod Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtCodBodega_Internalname, A199CodBodega, GXutil.rtrim( localUtil.format( A199CodBodega, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodBodega_Jsonclick, 0, "Attribute", "", "", "", 1, edtCodBodega_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_StockCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtStock_Internalname, "Stock", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtStock_Internalname, GXutil.ltrim( localUtil.ntoc( A200Stock, (byte)(18), (byte)(0), ",", "")), ((edtStock_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A200Stock), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A200Stock), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStock_Jsonclick, 0, "Attribute", "", "", "", 1, edtStock_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_StockCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtUnidadMedida_Internalname, "Unidad Medida", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtUnidadMedida_Internalname, A201UnidadMedida, GXutil.rtrim( localUtil.format( A201UnidadMedida, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUnidadMedida_Jsonclick, 0, "Attribute", "", "", "", 1, edtUnidadMedida_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_StockCuar.htm");
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
         com.wms.GxWebStd.gx_label_element( httpContext, edtPrecio_Internalname, "Precio", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtPrecio_Internalname, GXutil.ltrim( localUtil.ntoc( A202Precio, (byte)(18), (byte)(0), ",", "")), ((edtPrecio_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A202Precio), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A202Precio), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrecio_Jsonclick, 0, "Attribute", "", "", "", 1, edtPrecio_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_StockCuar.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtvalidFor_Internalname, GXutil.rtrim( A194validFor), GXutil.rtrim( localUtil.format( A194validFor, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtvalidFor_Jsonclick, 0, "Attribute", "", "", "", 1, edtvalidFor_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_StockCuar.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtInvntItem_Internalname, GXutil.rtrim( A195InvntItem), GXutil.rtrim( localUtil.format( A195InvntItem, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvntItem_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvntItem_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_StockCuar.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StockCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StockCuar.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StockCuar.htm");
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFila_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFila_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FILA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFila_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A203Fila = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
            }
            else
            {
               A203Fila = localUtil.ctol( httpContext.cgiGet( edtFila_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
            }
            A197CodArticulo = httpContext.cgiGet( edtCodArticulo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A197CodArticulo", A197CodArticulo);
            A198Articulo = httpContext.cgiGet( edtArticulo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A198Articulo", A198Articulo);
            A199CodBodega = httpContext.cgiGet( edtCodBodega_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A199CodBodega", A199CodBodega);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtStock_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtStock_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "STOCK");
               AnyError = (short)(1) ;
               GX_FocusControl = edtStock_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A200Stock = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A200Stock", GXutil.ltrim( GXutil.str( A200Stock, 18, 0)));
            }
            else
            {
               A200Stock = localUtil.ctol( httpContext.cgiGet( edtStock_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A200Stock", GXutil.ltrim( GXutil.str( A200Stock, 18, 0)));
            }
            A201UnidadMedida = httpContext.cgiGet( edtUnidadMedida_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A201UnidadMedida", A201UnidadMedida);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrecio_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrecio_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRECIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrecio_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A202Precio = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A202Precio", GXutil.ltrim( GXutil.str( A202Precio, 18, 0)));
            }
            else
            {
               A202Precio = localUtil.ctol( httpContext.cgiGet( edtPrecio_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A202Precio", GXutil.ltrim( GXutil.str( A202Precio, 18, 0)));
            }
            A194validFor = httpContext.cgiGet( edtvalidFor_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194validFor", A194validFor);
            A195InvntItem = httpContext.cgiGet( edtInvntItem_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A195InvntItem", A195InvntItem);
            /* Read saved values. */
            Z203Fila = localUtil.ctol( httpContext.cgiGet( "Z203Fila"), ",", ".") ;
            Z197CodArticulo = httpContext.cgiGet( "Z197CodArticulo") ;
            Z198Articulo = httpContext.cgiGet( "Z198Articulo") ;
            Z199CodBodega = httpContext.cgiGet( "Z199CodBodega") ;
            Z200Stock = localUtil.ctol( httpContext.cgiGet( "Z200Stock"), ",", ".") ;
            Z201UnidadMedida = httpContext.cgiGet( "Z201UnidadMedida") ;
            Z202Precio = localUtil.ctol( httpContext.cgiGet( "Z202Precio"), ",", ".") ;
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
               A203Fila = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
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
            initAll0E13( ) ;
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
      disableAttributes0E13( ) ;
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

   public void resetCaption0E0( )
   {
   }

   public void zm0E13( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z197CodArticulo = T000E3_A197CodArticulo[0] ;
            Z198Articulo = T000E3_A198Articulo[0] ;
            Z199CodBodega = T000E3_A199CodBodega[0] ;
            Z200Stock = T000E3_A200Stock[0] ;
            Z201UnidadMedida = T000E3_A201UnidadMedida[0] ;
            Z202Precio = T000E3_A202Precio[0] ;
            Z194validFor = T000E3_A194validFor[0] ;
            Z195InvntItem = T000E3_A195InvntItem[0] ;
         }
         else
         {
            Z197CodArticulo = A197CodArticulo ;
            Z198Articulo = A198Articulo ;
            Z199CodBodega = A199CodBodega ;
            Z200Stock = A200Stock ;
            Z201UnidadMedida = A201UnidadMedida ;
            Z202Precio = A202Precio ;
            Z194validFor = A194validFor ;
            Z195InvntItem = A195InvntItem ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z203Fila = A203Fila ;
         Z197CodArticulo = A197CodArticulo ;
         Z198Articulo = A198Articulo ;
         Z199CodBodega = A199CodBodega ;
         Z200Stock = A200Stock ;
         Z201UnidadMedida = A201UnidadMedida ;
         Z202Precio = A202Precio ;
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

   public void load0E13( )
   {
      /* Using cursor T000E4 */
      pr_fusquim_sap.execute(2, new Object[] {new Long(A203Fila)});
      if ( (pr_fusquim_sap.getStatus(2) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A197CodArticulo = T000E4_A197CodArticulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197CodArticulo", A197CodArticulo);
         A198Articulo = T000E4_A198Articulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A198Articulo", A198Articulo);
         A199CodBodega = T000E4_A199CodBodega[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199CodBodega", A199CodBodega);
         A200Stock = T000E4_A200Stock[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200Stock", GXutil.ltrim( GXutil.str( A200Stock, 18, 0)));
         A201UnidadMedida = T000E4_A201UnidadMedida[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A201UnidadMedida", A201UnidadMedida);
         A202Precio = T000E4_A202Precio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A202Precio", GXutil.ltrim( GXutil.str( A202Precio, 18, 0)));
         A194validFor = T000E4_A194validFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194validFor", A194validFor);
         A195InvntItem = T000E4_A195InvntItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195InvntItem", A195InvntItem);
         zm0E13( -1) ;
      }
      pr_fusquim_sap.close(2);
      onLoadActions0E13( ) ;
   }

   public void onLoadActions0E13( )
   {
   }

   public void checkExtendedTable0E13( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors0E13( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0E13( )
   {
      /* Using cursor T000E5 */
      pr_fusquim_sap.execute(3, new Object[] {new Long(A203Fila)});
      if ( (pr_fusquim_sap.getStatus(3) != 101) )
      {
         RcdFound13 = (short)(1) ;
      }
      else
      {
         RcdFound13 = (short)(0) ;
      }
      pr_fusquim_sap.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000E3 */
      pr_fusquim_sap.execute(1, new Object[] {new Long(A203Fila)});
      if ( (pr_fusquim_sap.getStatus(1) != 101) )
      {
         zm0E13( 1) ;
         RcdFound13 = (short)(1) ;
         A203Fila = T000E3_A203Fila[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
         A197CodArticulo = T000E3_A197CodArticulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197CodArticulo", A197CodArticulo);
         A198Articulo = T000E3_A198Articulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A198Articulo", A198Articulo);
         A199CodBodega = T000E3_A199CodBodega[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199CodBodega", A199CodBodega);
         A200Stock = T000E3_A200Stock[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200Stock", GXutil.ltrim( GXutil.str( A200Stock, 18, 0)));
         A201UnidadMedida = T000E3_A201UnidadMedida[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A201UnidadMedida", A201UnidadMedida);
         A202Precio = T000E3_A202Precio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A202Precio", GXutil.ltrim( GXutil.str( A202Precio, 18, 0)));
         A194validFor = T000E3_A194validFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194validFor", A194validFor);
         A195InvntItem = T000E3_A195InvntItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195InvntItem", A195InvntItem);
         Z203Fila = A203Fila ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0E13( ) ;
         if ( AnyError == 1 )
         {
            RcdFound13 = (short)(0) ;
            initializeNonKey0E13( ) ;
         }
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound13 = (short)(0) ;
         initializeNonKey0E13( ) ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_fusquim_sap.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0E13( ) ;
      if ( RcdFound13 == 0 )
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
      RcdFound13 = (short)(0) ;
      /* Using cursor T000E6 */
      pr_fusquim_sap.execute(4, new Object[] {new Long(A203Fila)});
      if ( (pr_fusquim_sap.getStatus(4) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T000E6_A203Fila[0] < A203Fila ) ) )
         {
            pr_fusquim_sap.readNext(4);
         }
         if ( (pr_fusquim_sap.getStatus(4) != 101) && ( ( T000E6_A203Fila[0] > A203Fila ) ) )
         {
            A203Fila = T000E6_A203Fila[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
            RcdFound13 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(4);
   }

   public void move_previous( )
   {
      RcdFound13 = (short)(0) ;
      /* Using cursor T000E7 */
      pr_fusquim_sap.execute(5, new Object[] {new Long(A203Fila)});
      if ( (pr_fusquim_sap.getStatus(5) != 101) )
      {
         while ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T000E7_A203Fila[0] > A203Fila ) ) )
         {
            pr_fusquim_sap.readNext(5);
         }
         if ( (pr_fusquim_sap.getStatus(5) != 101) && ( ( T000E7_A203Fila[0] < A203Fila ) ) )
         {
            A203Fila = T000E7_A203Fila[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
            RcdFound13 = (short)(1) ;
         }
      }
      pr_fusquim_sap.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0E13( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtFila_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0E13( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound13 == 1 )
         {
            if ( A203Fila != Z203Fila )
            {
               A203Fila = Z203Fila ;
               httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FILA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFila_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFila_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0E13( ) ;
               GX_FocusControl = edtFila_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A203Fila != Z203Fila )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtFila_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0E13( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FILA");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFila_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtFila_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0E13( ) ;
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
      if ( A203Fila != Z203Fila )
      {
         A203Fila = Z203Fila ;
         httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FILA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFila_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFila_Internalname ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "FILA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFila_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCodArticulo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0E13( ) ;
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCodArticulo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0E13( ) ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCodArticulo_Internalname ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCodArticulo_Internalname ;
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
      scanStart0E13( ) ;
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound13 != 0 )
         {
            scanNext0E13( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCodArticulo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0E13( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0E13( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000E2 */
         pr_fusquim_sap.execute(0, new Object[] {new Long(A203Fila)});
         if ( (pr_fusquim_sap.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VSTOCKCUAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_fusquim_sap.getStatus(0) == 101) || ( GXutil.strcmp(Z197CodArticulo, T000E2_A197CodArticulo[0]) != 0 ) || ( GXutil.strcmp(Z198Articulo, T000E2_A198Articulo[0]) != 0 ) || ( GXutil.strcmp(Z199CodBodega, T000E2_A199CodBodega[0]) != 0 ) || ( Z200Stock != T000E2_A200Stock[0] ) || ( GXutil.strcmp(Z201UnidadMedida, T000E2_A201UnidadMedida[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z202Precio != T000E2_A202Precio[0] ) || ( GXutil.strcmp(Z194validFor, T000E2_A194validFor[0]) != 0 ) || ( GXutil.strcmp(Z195InvntItem, T000E2_A195InvntItem[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VSTOCKCUAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0E13( )
   {
      beforeValidate0E13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0E13( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0E13( 0) ;
         checkOptimisticConcurrency0E13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0E13( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0E13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000E8 */
                  pr_fusquim_sap.execute(6, new Object[] {new Long(A203Fila), A197CodArticulo, A198Articulo, A199CodBodega, new Long(A200Stock), A201UnidadMedida, new Long(A202Precio), A194validFor, A195InvntItem});
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
                        resetCaption0E0( ) ;
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
            load0E13( ) ;
         }
         endLevel0E13( ) ;
      }
      closeExtendedTableCursors0E13( ) ;
   }

   public void update0E13( )
   {
      beforeValidate0E13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0E13( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0E13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0E13( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0E13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000E9 */
                  pr_fusquim_sap.execute(7, new Object[] {A197CodArticulo, A198Articulo, A199CodBodega, new Long(A200Stock), A201UnidadMedida, new Long(A202Precio), A194validFor, A195InvntItem, new Long(A203Fila)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VStockCuar") ;
                  if ( (pr_fusquim_sap.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VSTOCKCUAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0E13( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption0E0( ) ;
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
         endLevel0E13( ) ;
      }
      closeExtendedTableCursors0E13( ) ;
   }

   public void deferredUpdate0E13( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0E13( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0E13( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0E13( ) ;
         afterConfirm0E13( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0E13( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000E10 */
               pr_fusquim_sap.execute(8, new Object[] {new Long(A203Fila)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VStockCuar") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound13 == 0 )
                     {
                        initAll0E13( ) ;
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
                     resetCaption0E0( ) ;
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
      sMode13 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0E13( ) ;
      Gx_mode = sMode13 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0E13( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0E13( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_fusquim_sap.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0E13( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "stockcuar");
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "stockcuar");
         if ( AnyError == 0 )
         {
            confirmValues0E0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "stockcuar");
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "stockcuar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0E13( )
   {
      /* Using cursor T000E11 */
      pr_fusquim_sap.execute(9);
      RcdFound13 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A203Fila = T000E11_A203Fila[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0E13( )
   {
      /* Scan next routine */
      pr_fusquim_sap.readNext(9);
      RcdFound13 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A203Fila = T000E11_A203Fila[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
      }
   }

   public void scanEnd0E13( )
   {
      pr_fusquim_sap.close(9);
   }

   public void afterConfirm0E13( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0E13( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0E13( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0E13( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0E13( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0E13( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0E13( )
   {
      edtFila_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFila_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFila_Enabled, 5, 0)), true);
      edtCodArticulo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodArticulo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCodArticulo_Enabled, 5, 0)), true);
      edtArticulo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArticulo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtArticulo_Enabled, 5, 0)), true);
      edtCodBodega_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodBodega_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCodBodega_Enabled, 5, 0)), true);
      edtStock_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStock_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtStock_Enabled, 5, 0)), true);
      edtUnidadMedida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUnidadMedida_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUnidadMedida_Enabled, 5, 0)), true);
      edtPrecio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrecio_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPrecio_Enabled, 5, 0)), true);
      edtvalidFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtvalidFor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtvalidFor_Enabled, 5, 0)), true);
      edtInvntItem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvntItem_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvntItem_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0E0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210231473");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.stockcuar") +"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z203Fila", GXutil.ltrim( localUtil.ntoc( Z203Fila, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z197CodArticulo", Z197CodArticulo);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z198Articulo", Z198Articulo);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z199CodBodega", Z199CodBodega);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z200Stock", GXutil.ltrim( localUtil.ntoc( Z200Stock, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z201UnidadMedida", Z201UnidadMedida);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "Z202Precio", GXutil.ltrim( localUtil.ntoc( Z202Precio, (byte)(18), (byte)(0), ",", "")));
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
      return formatLink("com.wms.stockcuar")  ;
   }

   public String getPgmname( )
   {
      return "StockCuar" ;
   }

   public String getPgmdesc( )
   {
      return "Stock Cuar" ;
   }

   public void initializeNonKey0E13( )
   {
      A197CodArticulo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A197CodArticulo", A197CodArticulo);
      A198Articulo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A198Articulo", A198Articulo);
      A199CodBodega = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A199CodBodega", A199CodBodega);
      A200Stock = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A200Stock", GXutil.ltrim( GXutil.str( A200Stock, 18, 0)));
      A201UnidadMedida = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A201UnidadMedida", A201UnidadMedida);
      A202Precio = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A202Precio", GXutil.ltrim( GXutil.str( A202Precio, 18, 0)));
      A194validFor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A194validFor", A194validFor);
      A195InvntItem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A195InvntItem", A195InvntItem);
      Z197CodArticulo = "" ;
      Z198Articulo = "" ;
      Z199CodBodega = "" ;
      Z200Stock = 0 ;
      Z201UnidadMedida = "" ;
      Z202Precio = 0 ;
      Z194validFor = "" ;
      Z195InvntItem = "" ;
   }

   public void initAll0E13( )
   {
      A203Fila = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A203Fila", GXutil.ltrim( GXutil.str( A203Fila, 18, 0)));
      initializeNonKey0E13( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210231481");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("stockcuar.js", "?201811210231481");
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
      edtFila_Internalname = "FILA" ;
      edtCodArticulo_Internalname = "CODARTICULO" ;
      edtArticulo_Internalname = "ARTICULO" ;
      edtCodBodega_Internalname = "CODBODEGA" ;
      edtStock_Internalname = "STOCK" ;
      edtUnidadMedida_Internalname = "UNIDADMEDIDA" ;
      edtPrecio_Internalname = "PRECIO" ;
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
      Form.setCaption( "Stock Cuar" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtInvntItem_Jsonclick = "" ;
      edtInvntItem_Enabled = 1 ;
      edtvalidFor_Jsonclick = "" ;
      edtvalidFor_Enabled = 1 ;
      edtPrecio_Jsonclick = "" ;
      edtPrecio_Enabled = 1 ;
      edtUnidadMedida_Jsonclick = "" ;
      edtUnidadMedida_Enabled = 1 ;
      edtStock_Jsonclick = "" ;
      edtStock_Enabled = 1 ;
      edtCodBodega_Jsonclick = "" ;
      edtCodBodega_Enabled = 1 ;
      edtArticulo_Jsonclick = "" ;
      edtArticulo_Enabled = 1 ;
      edtCodArticulo_Jsonclick = "" ;
      edtCodArticulo_Enabled = 1 ;
      edtFila_Jsonclick = "" ;
      edtFila_Enabled = 1 ;
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
      GX_FocusControl = edtCodArticulo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Fila( long GX_Parm1 ,
                           String GX_Parm2 ,
                           String GX_Parm3 ,
                           String GX_Parm4 ,
                           long GX_Parm5 ,
                           String GX_Parm6 ,
                           long GX_Parm7 ,
                           String GX_Parm8 ,
                           String GX_Parm9 )
   {
      A203Fila = GX_Parm1 ;
      A197CodArticulo = GX_Parm2 ;
      A198Articulo = GX_Parm3 ;
      A199CodBodega = GX_Parm4 ;
      A200Stock = GX_Parm5 ;
      A201UnidadMedida = GX_Parm6 ;
      A202Precio = GX_Parm7 ;
      A194validFor = GX_Parm8 ;
      A195InvntItem = GX_Parm9 ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A197CodArticulo);
      isValidOutput.add(A198Articulo);
      isValidOutput.add(A199CodBodega);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A200Stock, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A201UnidadMedida);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A202Precio, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A194validFor));
      isValidOutput.add(GXutil.rtrim( A195InvntItem));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z203Fila, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(Z197CodArticulo);
      isValidOutput.add(Z198Articulo);
      isValidOutput.add(Z199CodBodega);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z200Stock, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(Z201UnidadMedida);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z202Precio, (byte)(18), (byte)(0), ",", "")));
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
      Z197CodArticulo = "" ;
      Z198Articulo = "" ;
      Z199CodBodega = "" ;
      Z201UnidadMedida = "" ;
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
      A197CodArticulo = "" ;
      A198Articulo = "" ;
      A199CodBodega = "" ;
      A201UnidadMedida = "" ;
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
      T000E4_A203Fila = new long[1] ;
      T000E4_A197CodArticulo = new String[] {""} ;
      T000E4_A198Articulo = new String[] {""} ;
      T000E4_A199CodBodega = new String[] {""} ;
      T000E4_A200Stock = new long[1] ;
      T000E4_A201UnidadMedida = new String[] {""} ;
      T000E4_A202Precio = new long[1] ;
      T000E4_A194validFor = new String[] {""} ;
      T000E4_A195InvntItem = new String[] {""} ;
      T000E5_A203Fila = new long[1] ;
      T000E3_A203Fila = new long[1] ;
      T000E3_A197CodArticulo = new String[] {""} ;
      T000E3_A198Articulo = new String[] {""} ;
      T000E3_A199CodBodega = new String[] {""} ;
      T000E3_A200Stock = new long[1] ;
      T000E3_A201UnidadMedida = new String[] {""} ;
      T000E3_A202Precio = new long[1] ;
      T000E3_A194validFor = new String[] {""} ;
      T000E3_A195InvntItem = new String[] {""} ;
      sMode13 = "" ;
      T000E6_A203Fila = new long[1] ;
      T000E7_A203Fila = new long[1] ;
      T000E2_A203Fila = new long[1] ;
      T000E2_A197CodArticulo = new String[] {""} ;
      T000E2_A198Articulo = new String[] {""} ;
      T000E2_A199CodBodega = new String[] {""} ;
      T000E2_A200Stock = new long[1] ;
      T000E2_A201UnidadMedida = new String[] {""} ;
      T000E2_A202Precio = new long[1] ;
      T000E2_A194validFor = new String[] {""} ;
      T000E2_A195InvntItem = new String[] {""} ;
      T000E11_A203Fila = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.stockcuar__fusquim_sap(),
         new Object[] {
             new Object[] {
            T000E2_A203Fila, T000E2_A197CodArticulo, T000E2_A198Articulo, T000E2_A199CodBodega, T000E2_A200Stock, T000E2_A201UnidadMedida, T000E2_A202Precio, T000E2_A194validFor, T000E2_A195InvntItem
            }
            , new Object[] {
            T000E3_A203Fila, T000E3_A197CodArticulo, T000E3_A198Articulo, T000E3_A199CodBodega, T000E3_A200Stock, T000E3_A201UnidadMedida, T000E3_A202Precio, T000E3_A194validFor, T000E3_A195InvntItem
            }
            , new Object[] {
            T000E4_A203Fila, T000E4_A197CodArticulo, T000E4_A198Articulo, T000E4_A199CodBodega, T000E4_A200Stock, T000E4_A201UnidadMedida, T000E4_A202Precio, T000E4_A194validFor, T000E4_A195InvntItem
            }
            , new Object[] {
            T000E5_A203Fila
            }
            , new Object[] {
            T000E6_A203Fila
            }
            , new Object[] {
            T000E7_A203Fila
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000E11_A203Fila
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.stockcuar__default(),
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
   private short RcdFound13 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtFila_Enabled ;
   private int edtCodArticulo_Enabled ;
   private int edtArticulo_Enabled ;
   private int edtCodBodega_Enabled ;
   private int edtStock_Enabled ;
   private int edtUnidadMedida_Enabled ;
   private int edtPrecio_Enabled ;
   private int edtvalidFor_Enabled ;
   private int edtInvntItem_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z203Fila ;
   private long Z200Stock ;
   private long Z202Precio ;
   private long A203Fila ;
   private long A200Stock ;
   private long A202Precio ;
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
   private String edtFila_Internalname ;
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
   private String edtFila_Jsonclick ;
   private String edtCodArticulo_Internalname ;
   private String edtCodArticulo_Jsonclick ;
   private String edtArticulo_Internalname ;
   private String edtArticulo_Jsonclick ;
   private String edtCodBodega_Internalname ;
   private String edtCodBodega_Jsonclick ;
   private String edtStock_Internalname ;
   private String edtStock_Jsonclick ;
   private String edtUnidadMedida_Internalname ;
   private String edtUnidadMedida_Jsonclick ;
   private String edtPrecio_Internalname ;
   private String edtPrecio_Jsonclick ;
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
   private String sMode13 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private String Z197CodArticulo ;
   private String Z198Articulo ;
   private String Z199CodBodega ;
   private String Z201UnidadMedida ;
   private String A197CodArticulo ;
   private String A198Articulo ;
   private String A199CodBodega ;
   private String A201UnidadMedida ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_fusquim_sap ;
   private long[] T000E4_A203Fila ;
   private String[] T000E4_A197CodArticulo ;
   private String[] T000E4_A198Articulo ;
   private String[] T000E4_A199CodBodega ;
   private long[] T000E4_A200Stock ;
   private String[] T000E4_A201UnidadMedida ;
   private long[] T000E4_A202Precio ;
   private String[] T000E4_A194validFor ;
   private String[] T000E4_A195InvntItem ;
   private long[] T000E5_A203Fila ;
   private long[] T000E3_A203Fila ;
   private String[] T000E3_A197CodArticulo ;
   private String[] T000E3_A198Articulo ;
   private String[] T000E3_A199CodBodega ;
   private long[] T000E3_A200Stock ;
   private String[] T000E3_A201UnidadMedida ;
   private long[] T000E3_A202Precio ;
   private String[] T000E3_A194validFor ;
   private String[] T000E3_A195InvntItem ;
   private long[] T000E6_A203Fila ;
   private long[] T000E7_A203Fila ;
   private long[] T000E2_A203Fila ;
   private String[] T000E2_A197CodArticulo ;
   private String[] T000E2_A198Articulo ;
   private String[] T000E2_A199CodBodega ;
   private long[] T000E2_A200Stock ;
   private String[] T000E2_A201UnidadMedida ;
   private long[] T000E2_A202Precio ;
   private String[] T000E2_A194validFor ;
   private String[] T000E2_A195InvntItem ;
   private IDataStoreProvider pr_default ;
   private long[] T000E11_A203Fila ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class stockcuar__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000E2", "SELECT [Fila], [CodArticulo], [Articulo], [CodBodega], [Stock], [UnidadMedida], [Precio], [validFor], [InvntItem] FROM dbo.[VStockCuar] WITH (UPDLOCK) WHERE [Fila] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000E3", "SELECT [Fila], [CodArticulo], [Articulo], [CodBodega], [Stock], [UnidadMedida], [Precio], [validFor], [InvntItem] FROM dbo.[VStockCuar] WITH (NOLOCK) WHERE [Fila] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000E4", "SELECT TM1.[Fila], TM1.[CodArticulo], TM1.[Articulo], TM1.[CodBodega], TM1.[Stock], TM1.[UnidadMedida], TM1.[Precio], TM1.[validFor], TM1.[InvntItem] FROM dbo.[VStockCuar] TM1 WITH (NOLOCK) WHERE TM1.[Fila] = ? ORDER BY TM1.[Fila]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000E5", "SELECT [Fila] FROM dbo.[VStockCuar] WITH (NOLOCK) WHERE [Fila] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000E6", "SELECT TOP 1 [Fila] FROM dbo.[VStockCuar] WITH (NOLOCK) WHERE ( [Fila] > ?) ORDER BY [Fila]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000E7", "SELECT TOP 1 [Fila] FROM dbo.[VStockCuar] WITH (NOLOCK) WHERE ( [Fila] < ?) ORDER BY [Fila] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000E8", "INSERT INTO dbo.[VStockCuar]([Fila], [CodArticulo], [Articulo], [CodBodega], [Stock], [UnidadMedida], [Precio], [validFor], [InvntItem]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000E9", "UPDATE dbo.[VStockCuar] SET [CodArticulo]=?, [Articulo]=?, [CodBodega]=?, [Stock]=?, [UnidadMedida]=?, [Precio]=?, [validFor]=?, [InvntItem]=?  WHERE [Fila] = ?", GX_NOMASK)
         ,new UpdateCursor("T000E10", "DELETE FROM dbo.[VStockCuar]  WHERE [Fila] = ?", GX_NOMASK)
         ,new ForEachCursor("T000E11", "SELECT [Fila] FROM dbo.[VStockCuar] WITH (NOLOCK) ORDER BY [Fila]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 2 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 3 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 4 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 5 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 6 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setVarchar(4, (String)parms[3], 8, false);
               stmt.setBigDecimal(5, ((Number) parms[4]).longValue(), 0);
               stmt.setVarchar(6, (String)parms[5], 100, false);
               stmt.setBigDecimal(7, ((Number) parms[6]).longValue(), 0);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 100, false);
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setBigDecimal(4, ((Number) parms[3]).longValue(), 0);
               stmt.setVarchar(5, (String)parms[4], 100, false);
               stmt.setBigDecimal(6, ((Number) parms[5]).longValue(), 0);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setBigDecimal(9, ((Number) parms[8]).longValue(), 0);
               return;
            case 8 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

final  class stockcuar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

