/*
               File: gx00b0_impl
        Description: Selection List Bodega Cuar
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 11, 2018 11:27:22.17
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

public final  class gx00b0_impl extends GXDataArea
{
   public gx00b0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00b0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00b0_impl.class ));
   }

   public gx00b0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_84 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_84_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_84_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV6cItemCode = httpContext.GetNextPar( ) ;
            AV7cItemName = httpContext.GetNextPar( ) ;
            AV8cOnHand = GXutil.lval( httpContext.GetNextPar( )) ;
            AV9cCntUnitMsr = httpContext.GetNextPar( ) ;
            AV10cAvgPrice = GXutil.lval( httpContext.GetNextPar( )) ;
            AV11cvalidFor = httpContext.GetNextPar( ) ;
            AV12cInvntItem = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cItemCode, AV7cItemName, AV8cOnHand, AV9cCntUnitMsr, AV10cAvgPrice, AV11cvalidFor, AV12cInvntItem) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
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
            AV13pItemCode = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pItemCode", AV13pItemCode);
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj = new com.wms.rwdpromptmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,true);
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

   public byte executeStartEvent( )
   {
      pa132( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start132( ) ;
      }
      return gxajaxcallmode ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxcfg.js", "?201811111272229");
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
      if ( nGXWrapped == 0 )
      {
         bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.gx00b0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13pItemCode))+"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCITEMCODE", AV6cItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCITEMNAME", AV7cItemName);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCONHAND", GXutil.ltrim( localUtil.ntoc( AV8cOnHand, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCNTUNITMSR", AV9cCntUnitMsr);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCAVGPRICE", GXutil.ltrim( localUtil.ntoc( AV10cAvgPrice, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCVALIDFOR", GXutil.rtrim( AV11cvalidFor));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVNTITEM", GXutil.rtrim( AV12cInvntItem));
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPITEMCODE", AV13pItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ITEMCODEFILTERCONTAINER_Class", GXutil.rtrim( divItemcodefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ITEMNAMEFILTERCONTAINER_Class", GXutil.rtrim( divItemnamefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ONHANDFILTERCONTAINER_Class", GXutil.rtrim( divOnhandfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "CNTUNITMSRFILTERCONTAINER_Class", GXutil.rtrim( divCntunitmsrfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "AVGPRICEFILTERCONTAINER_Class", GXutil.rtrim( divAvgpricefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "VALIDFORFILTERCONTAINER_Class", GXutil.rtrim( divValidforfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "INVNTITEMFILTERCONTAINER_Class", GXutil.rtrim( divInvntitemfiltercontainer_Class));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.wms.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we132( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt132( ) ;
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
      return formatLink("com.wms.gx00b0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13pItemCode)) ;
   }

   public String getPgmname( )
   {
      return "Gx00B0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Bodega Cuar" ;
   }

   public void wb130( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         com.wms.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divItemcodefiltercontainer_Internalname, 1, 0, "px", 0, "px", divItemcodefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblitemcodefilter_Internalname, "Item Code", "", "", lblLblitemcodefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11131_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCitemcode_Internalname, "Item Code", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCitemcode_Internalname, AV6cItemCode, GXutil.rtrim( localUtil.format( AV6cItemCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCitemcode_Jsonclick, 0, "Attribute", "", "", "", edtavCitemcode_Visible, edtavCitemcode_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divItemnamefiltercontainer_Internalname, 1, 0, "px", 0, "px", divItemnamefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblitemnamefilter_Internalname, "Item Name", "", "", lblLblitemnamefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12131_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCitemname_Internalname, "Item Name", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCitemname_Internalname, AV7cItemName, GXutil.rtrim( localUtil.format( AV7cItemName, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCitemname_Jsonclick, 0, "Attribute", "", "", "", edtavCitemname_Visible, edtavCitemname_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divOnhandfiltercontainer_Internalname, 1, 0, "px", 0, "px", divOnhandfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblonhandfilter_Internalname, "On Hand", "", "", lblLblonhandfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13131_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavConhand_Internalname, "On Hand", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavConhand_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cOnHand, (byte)(18), (byte)(0), ",", "")), ((edtavConhand_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cOnHand), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cOnHand), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavConhand_Jsonclick, 0, "Attribute", "", "", "", edtavConhand_Visible, edtavConhand_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divCntunitmsrfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCntunitmsrfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblcntunitmsrfilter_Internalname, "Cnt Unit Msr", "", "", lblLblcntunitmsrfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14131_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCcntunitmsr_Internalname, "Cnt Unit Msr", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCcntunitmsr_Internalname, AV9cCntUnitMsr, GXutil.rtrim( localUtil.format( AV9cCntUnitMsr, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcntunitmsr_Jsonclick, 0, "Attribute", "", "", "", edtavCcntunitmsr_Visible, edtavCcntunitmsr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divAvgpricefiltercontainer_Internalname, 1, 0, "px", 0, "px", divAvgpricefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblavgpricefilter_Internalname, "Avg Price", "", "", lblLblavgpricefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15131_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCavgprice_Internalname, "Avg Price", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCavgprice_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cAvgPrice, (byte)(18), (byte)(0), ",", "")), ((edtavCavgprice_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cAvgPrice), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cAvgPrice), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCavgprice_Jsonclick, 0, "Attribute", "", "", "", edtavCavgprice_Visible, edtavCavgprice_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divValidforfiltercontainer_Internalname, 1, 0, "px", 0, "px", divValidforfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblvalidforfilter_Internalname, "valid For", "", "", lblLblvalidforfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16131_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCvalidfor_Internalname, "valid For", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCvalidfor_Internalname, GXutil.rtrim( AV11cvalidFor), GXutil.rtrim( localUtil.format( AV11cvalidFor, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCvalidfor_Jsonclick, 0, "Attribute", "", "", "", edtavCvalidfor_Visible, edtavCvalidfor_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divInvntitemfiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvntitemfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblinvntitemfilter_Internalname, "Invnt Item", "", "", lblLblinvntitemfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17131_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCinvntitem_Internalname, "Invnt Item", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCinvntitem_Internalname, GXutil.rtrim( AV12cInvntItem), GXutil.rtrim( localUtil.format( AV12cInvntItem, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvntitem_Jsonclick, 0, "Attribute", "", "", "", edtavCinvntitem_Visible, edtavCinvntitem_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18131_client"+"'", TempTags, "", 2, "HLP_Gx00B0.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"84\">") ;
            sStyleString = "" ;
            com.wms.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Item Code") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "On Hand") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Avg Price") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "valid For") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Invnt Item") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Whs Code") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A189ItemCode);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A191OnHand, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A193AvgPrice, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A194validFor));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A195InvntItem));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A196BodegaCuarWhsCode, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 84 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_84 = (short)(nGXsfl_84_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.wms.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.wms.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00B0.htm");
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

   public void start132( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Bodega Cuar", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup130( ) ;
   }

   public void ws132( )
   {
      start132( ) ;
      evt132( ) ;
   }

   public void evt132( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_84_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_842( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A189ItemCode = httpContext.cgiGet( edtItemCode_Internalname) ;
                           A191OnHand = localUtil.ctol( httpContext.cgiGet( edtOnHand_Internalname), ",", ".") ;
                           A193AvgPrice = localUtil.ctol( httpContext.cgiGet( edtAvgPrice_Internalname), ",", ".") ;
                           A194validFor = httpContext.cgiGet( edtvalidFor_Internalname) ;
                           A195InvntItem = httpContext.cgiGet( edtInvntItem_Internalname) ;
                           A196BodegaCuarWhsCode = (short)(localUtil.ctol( httpContext.cgiGet( edtBodegaCuarWhsCode_Internalname), ",", ".")) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19132 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e20132 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Citemcode Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCITEMCODE"), AV6cItemCode) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Citemname Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCITEMNAME"), AV7cItemName) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Conhand Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCONHAND"), ",", ".") != AV8cOnHand )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccntunitmsr Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCNTUNITMSR"), AV9cCntUnitMsr) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cavgprice Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCAVGPRICE"), ",", ".") != AV10cAvgPrice )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cvalidfor Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCVALIDFOR"), AV11cvalidFor) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvntitem Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVNTITEM"), AV12cInvntItem) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e21132 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we132( )
   {
      if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.wms.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa132( )
   {
      if ( nDonePA == 0 )
      {
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
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_842( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         sendrow_842( ) ;
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV6cItemCode ,
                                  String AV7cItemName ,
                                  long AV8cOnHand ,
                                  String AV9cCntUnitMsr ,
                                  long AV10cAvgPrice ,
                                  String AV11cvalidFor ,
                                  String AV12cInvntItem )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf132( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_ITEMCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A189ItemCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ITEMCODE", A189ItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_ONHAND", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A191OnHand), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ONHAND", GXutil.ltrim( localUtil.ntoc( A191OnHand, (byte)(18), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_AVGPRICE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A193AvgPrice), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "AVGPRICE", GXutil.ltrim( localUtil.ntoc( A193AvgPrice, (byte)(18), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_VALIDFOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A194validFor, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "VALIDFOR", GXutil.rtrim( A194validFor));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVNTITEM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A195InvntItem, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "INVNTITEM", GXutil.rtrim( A195InvntItem));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODEGACUARWHSCODE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A196BodegaCuarWhsCode), "ZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "BODEGACUARWHSCODE", GXutil.ltrim( localUtil.ntoc( A196BodegaCuarWhsCode, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf132( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf132( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(84) ;
      nGXsfl_84_idx = (short)(1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_842( ) ;
      bGXsfl_84_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_842( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_fusquim_sap.dynParam(0, new Object[]{ new Object[]{
                                              AV7cItemName ,
                                              new Long(AV8cOnHand) ,
                                              AV9cCntUnitMsr ,
                                              new Long(AV10cAvgPrice) ,
                                              AV11cvalidFor ,
                                              AV12cInvntItem ,
                                              A190ItemName ,
                                              new Long(A191OnHand) ,
                                              A192CntUnitMsr ,
                                              new Long(A193AvgPrice) ,
                                              A194validFor ,
                                              A195InvntItem ,
                                              A189ItemCode ,
                                              AV6cItemCode } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV6cItemCode = GXutil.concat( GXutil.rtrim( AV6cItemCode), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cItemCode", AV6cItemCode);
         lV7cItemName = GXutil.concat( GXutil.rtrim( AV7cItemName), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cItemName", AV7cItemName);
         lV9cCntUnitMsr = GXutil.concat( GXutil.rtrim( AV9cCntUnitMsr), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cCntUnitMsr", AV9cCntUnitMsr);
         lV11cvalidFor = GXutil.padr( GXutil.rtrim( AV11cvalidFor), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cvalidFor", AV11cvalidFor);
         lV12cInvntItem = GXutil.padr( GXutil.rtrim( AV12cInvntItem), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cInvntItem", AV12cInvntItem);
         /* Using cursor H00132 */
         pr_fusquim_sap.execute(0, new Object[] {lV6cItemCode, lV7cItemName, new Long(AV8cOnHand), lV9cCntUnitMsr, new Long(AV10cAvgPrice), lV11cvalidFor, lV12cInvntItem, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_fusquim_sap.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A192CntUnitMsr = H00132_A192CntUnitMsr[0] ;
            A190ItemName = H00132_A190ItemName[0] ;
            A196BodegaCuarWhsCode = H00132_A196BodegaCuarWhsCode[0] ;
            A195InvntItem = H00132_A195InvntItem[0] ;
            A194validFor = H00132_A194validFor[0] ;
            A193AvgPrice = H00132_A193AvgPrice[0] ;
            A191OnHand = H00132_A191OnHand[0] ;
            A189ItemCode = H00132_A189ItemCode[0] ;
            /* Execute user event: Load */
            e20132 ();
            pr_fusquim_sap.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_fusquim_sap.getStatus(0) == 101) ? 1 : 0)) ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_fusquim_sap.close(0);
         wbEnd = (short)(84) ;
         wb130( ) ;
      }
      bGXsfl_84_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      pr_fusquim_sap.dynParam(1, new Object[]{ new Object[]{
                                           AV7cItemName ,
                                           new Long(AV8cOnHand) ,
                                           AV9cCntUnitMsr ,
                                           new Long(AV10cAvgPrice) ,
                                           AV11cvalidFor ,
                                           AV12cInvntItem ,
                                           A190ItemName ,
                                           new Long(A191OnHand) ,
                                           A192CntUnitMsr ,
                                           new Long(A193AvgPrice) ,
                                           A194validFor ,
                                           A195InvntItem ,
                                           A189ItemCode ,
                                           AV6cItemCode } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV6cItemCode = GXutil.concat( GXutil.rtrim( AV6cItemCode), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cItemCode", AV6cItemCode);
      lV7cItemName = GXutil.concat( GXutil.rtrim( AV7cItemName), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cItemName", AV7cItemName);
      lV9cCntUnitMsr = GXutil.concat( GXutil.rtrim( AV9cCntUnitMsr), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cCntUnitMsr", AV9cCntUnitMsr);
      lV11cvalidFor = GXutil.padr( GXutil.rtrim( AV11cvalidFor), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cvalidFor", AV11cvalidFor);
      lV12cInvntItem = GXutil.padr( GXutil.rtrim( AV12cInvntItem), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cInvntItem", AV12cInvntItem);
      /* Using cursor H00133 */
      pr_fusquim_sap.execute(1, new Object[] {lV6cItemCode, lV7cItemName, new Long(AV8cOnHand), lV9cCntUnitMsr, new Long(AV10cAvgPrice), lV11cvalidFor, lV12cInvntItem});
      GRID1_nRecordCount = H00133_AGRID1_nRecordCount[0] ;
      pr_fusquim_sap.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cItemCode, AV7cItemName, AV8cOnHand, AV9cCntUnitMsr, AV10cAvgPrice, AV11cvalidFor, AV12cInvntItem) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cItemCode, AV7cItemName, AV8cOnHand, AV9cCntUnitMsr, AV10cAvgPrice, AV11cvalidFor, AV12cInvntItem) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cItemCode, AV7cItemName, AV8cOnHand, AV9cCntUnitMsr, AV10cAvgPrice, AV11cvalidFor, AV12cInvntItem) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cItemCode, AV7cItemName, AV8cOnHand, AV9cCntUnitMsr, AV10cAvgPrice, AV11cvalidFor, AV12cInvntItem) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cItemCode, AV7cItemName, AV8cOnHand, AV9cCntUnitMsr, AV10cAvgPrice, AV11cvalidFor, AV12cInvntItem) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup130( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19132 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cItemCode = httpContext.cgiGet( edtavCitemcode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cItemCode", AV6cItemCode);
         AV7cItemName = httpContext.cgiGet( edtavCitemname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cItemName", AV7cItemName);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavConhand_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavConhand_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCONHAND");
            GX_FocusControl = edtavConhand_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cOnHand = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cOnHand", GXutil.ltrim( GXutil.str( AV8cOnHand, 18, 0)));
         }
         else
         {
            AV8cOnHand = localUtil.ctol( httpContext.cgiGet( edtavConhand_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cOnHand", GXutil.ltrim( GXutil.str( AV8cOnHand, 18, 0)));
         }
         AV9cCntUnitMsr = httpContext.cgiGet( edtavCcntunitmsr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cCntUnitMsr", AV9cCntUnitMsr);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCavgprice_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCavgprice_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCAVGPRICE");
            GX_FocusControl = edtavCavgprice_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cAvgPrice = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cAvgPrice", GXutil.ltrim( GXutil.str( AV10cAvgPrice, 18, 0)));
         }
         else
         {
            AV10cAvgPrice = localUtil.ctol( httpContext.cgiGet( edtavCavgprice_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cAvgPrice", GXutil.ltrim( GXutil.str( AV10cAvgPrice, 18, 0)));
         }
         AV11cvalidFor = httpContext.cgiGet( edtavCvalidfor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cvalidFor", AV11cvalidFor);
         AV12cInvntItem = httpContext.cgiGet( edtavCinvntitem_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cInvntItem", AV12cInvntItem);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCITEMCODE"), AV6cItemCode) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCITEMNAME"), AV7cItemName) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCONHAND"), ",", ".") != AV8cOnHand )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCNTUNITMSR"), AV9cCntUnitMsr) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCAVGPRICE"), ",", ".") != AV10cAvgPrice )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCVALIDFOR"), AV11cvalidFor) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVNTITEM"), AV12cInvntItem) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e19132 ();
      if (returnInSub) return;
   }

   public void e19132( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Bodega Cuar", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e20132( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_842( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_84_Refreshing )
      {
         httpContext.doAjaxLoad(84, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e21132 ();
      if (returnInSub) return;
   }

   public void e21132( )
   {
      /* Enter Routine */
      AV13pItemCode = A189ItemCode ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pItemCode", AV13pItemCode);
      httpContext.setWebReturnParms(new Object[] {AV13pItemCode});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pItemCode = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pItemCode", AV13pItemCode);
   }

   public String getresponse( String sGXDynURL )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa132( ) ;
      ws132( ) ;
      we132( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?831865");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811111272454");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gx00b0.js", "?201811111272454");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtItemCode_Internalname = "ITEMCODE_"+sGXsfl_84_idx ;
      edtOnHand_Internalname = "ONHAND_"+sGXsfl_84_idx ;
      edtAvgPrice_Internalname = "AVGPRICE_"+sGXsfl_84_idx ;
      edtvalidFor_Internalname = "VALIDFOR_"+sGXsfl_84_idx ;
      edtInvntItem_Internalname = "INVNTITEM_"+sGXsfl_84_idx ;
      edtBodegaCuarWhsCode_Internalname = "BODEGACUARWHSCODE_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtItemCode_Internalname = "ITEMCODE_"+sGXsfl_84_fel_idx ;
      edtOnHand_Internalname = "ONHAND_"+sGXsfl_84_fel_idx ;
      edtAvgPrice_Internalname = "AVGPRICE_"+sGXsfl_84_fel_idx ;
      edtvalidFor_Internalname = "VALIDFOR_"+sGXsfl_84_fel_idx ;
      edtInvntItem_Internalname = "INVNTITEM_"+sGXsfl_84_fel_idx ;
      edtBodegaCuarWhsCode_Internalname = "BODEGACUARWHSCODE_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb130( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_84_idx <= subgrid1_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_84_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A189ItemCode)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItemCode_Internalname,A189ItemCode,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtItemCode_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOnHand_Internalname,GXutil.ltrim( localUtil.ntoc( A191OnHand, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A191OnHand), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOnHand_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAvgPrice_Internalname,GXutil.ltrim( localUtil.ntoc( A193AvgPrice, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A193AvgPrice), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAvgPrice_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtvalidFor_Internalname,GXutil.rtrim( A194validFor),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtvalidFor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvntItem_Internalname,GXutil.rtrim( A195InvntItem),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvntItem_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBodegaCuarWhsCode_Internalname,GXutil.ltrim( localUtil.ntoc( A196BodegaCuarWhsCode, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A196BodegaCuarWhsCode), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBodegaCuarWhsCode_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_ITEMCODE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A189ItemCode, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_ONHAND"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A191OnHand), "ZZZZZZZZZZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_AVGPRICE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A193AvgPrice), "ZZZZZZZZZZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_VALIDFOR"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A194validFor, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVNTITEM"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A195InvntItem, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODEGACUARWHSCODE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A196BodegaCuarWhsCode), "ZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblitemcodefilter_Internalname = "LBLITEMCODEFILTER" ;
      edtavCitemcode_Internalname = "vCITEMCODE" ;
      divItemcodefiltercontainer_Internalname = "ITEMCODEFILTERCONTAINER" ;
      lblLblitemnamefilter_Internalname = "LBLITEMNAMEFILTER" ;
      edtavCitemname_Internalname = "vCITEMNAME" ;
      divItemnamefiltercontainer_Internalname = "ITEMNAMEFILTERCONTAINER" ;
      lblLblonhandfilter_Internalname = "LBLONHANDFILTER" ;
      edtavConhand_Internalname = "vCONHAND" ;
      divOnhandfiltercontainer_Internalname = "ONHANDFILTERCONTAINER" ;
      lblLblcntunitmsrfilter_Internalname = "LBLCNTUNITMSRFILTER" ;
      edtavCcntunitmsr_Internalname = "vCCNTUNITMSR" ;
      divCntunitmsrfiltercontainer_Internalname = "CNTUNITMSRFILTERCONTAINER" ;
      lblLblavgpricefilter_Internalname = "LBLAVGPRICEFILTER" ;
      edtavCavgprice_Internalname = "vCAVGPRICE" ;
      divAvgpricefiltercontainer_Internalname = "AVGPRICEFILTERCONTAINER" ;
      lblLblvalidforfilter_Internalname = "LBLVALIDFORFILTER" ;
      edtavCvalidfor_Internalname = "vCVALIDFOR" ;
      divValidforfiltercontainer_Internalname = "VALIDFORFILTERCONTAINER" ;
      lblLblinvntitemfilter_Internalname = "LBLINVNTITEMFILTER" ;
      edtavCinvntitem_Internalname = "vCINVNTITEM" ;
      divInvntitemfiltercontainer_Internalname = "INVNTITEMFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtItemCode_Internalname = "ITEMCODE" ;
      edtOnHand_Internalname = "ONHAND" ;
      edtAvgPrice_Internalname = "AVGPRICE" ;
      edtvalidFor_Internalname = "VALIDFOR" ;
      edtInvntItem_Internalname = "INVNTITEM" ;
      edtBodegaCuarWhsCode_Internalname = "BODEGACUARWHSCODE" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divMain_Internalname = "MAIN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtBodegaCuarWhsCode_Jsonclick = "" ;
      edtInvntItem_Jsonclick = "" ;
      edtvalidFor_Jsonclick = "" ;
      edtAvgPrice_Jsonclick = "" ;
      edtOnHand_Jsonclick = "" ;
      edtItemCode_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCinvntitem_Jsonclick = "" ;
      edtavCinvntitem_Enabled = 1 ;
      edtavCinvntitem_Visible = 1 ;
      edtavCvalidfor_Jsonclick = "" ;
      edtavCvalidfor_Enabled = 1 ;
      edtavCvalidfor_Visible = 1 ;
      edtavCavgprice_Jsonclick = "" ;
      edtavCavgprice_Enabled = 1 ;
      edtavCavgprice_Visible = 1 ;
      edtavCcntunitmsr_Jsonclick = "" ;
      edtavCcntunitmsr_Enabled = 1 ;
      edtavCcntunitmsr_Visible = 1 ;
      edtavConhand_Jsonclick = "" ;
      edtavConhand_Enabled = 1 ;
      edtavConhand_Visible = 1 ;
      edtavCitemname_Jsonclick = "" ;
      edtavCitemname_Enabled = 1 ;
      edtavCitemname_Visible = 1 ;
      edtavCitemcode_Jsonclick = "" ;
      edtavCitemcode_Enabled = 1 ;
      edtavCitemcode_Visible = 1 ;
      divInvntitemfiltercontainer_Class = "AdvancedContainerItem" ;
      divValidforfiltercontainer_Class = "AdvancedContainerItem" ;
      divAvgpricefiltercontainer_Class = "AdvancedContainerItem" ;
      divCntunitmsrfiltercontainer_Class = "AdvancedContainerItem" ;
      divOnhandfiltercontainer_Class = "AdvancedContainerItem" ;
      divItemnamefiltercontainer_Class = "AdvancedContainerItem" ;
      divItemcodefiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Bodega Cuar" );
      subGrid1_Rows = 10 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cItemCode',fld:'vCITEMCODE',pic:'',nv:''},{av:'AV7cItemName',fld:'vCITEMNAME',pic:'',nv:''},{av:'AV8cOnHand',fld:'vCONHAND',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cCntUnitMsr',fld:'vCCNTUNITMSR',pic:'',nv:''},{av:'AV10cAvgPrice',fld:'vCAVGPRICE',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cvalidFor',fld:'vCVALIDFOR',pic:'',nv:''},{av:'AV12cInvntItem',fld:'vCINVNTITEM',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e18131',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLITEMCODEFILTER.CLICK","{handler:'e11131',iparms:[{av:'divItemcodefiltercontainer_Class',ctrl:'ITEMCODEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divItemcodefiltercontainer_Class',ctrl:'ITEMCODEFILTERCONTAINER',prop:'Class'},{av:'edtavCitemcode_Visible',ctrl:'vCITEMCODE',prop:'Visible'}]}");
      setEventMetadata("LBLITEMNAMEFILTER.CLICK","{handler:'e12131',iparms:[{av:'divItemnamefiltercontainer_Class',ctrl:'ITEMNAMEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divItemnamefiltercontainer_Class',ctrl:'ITEMNAMEFILTERCONTAINER',prop:'Class'},{av:'edtavCitemname_Visible',ctrl:'vCITEMNAME',prop:'Visible'}]}");
      setEventMetadata("LBLONHANDFILTER.CLICK","{handler:'e13131',iparms:[{av:'divOnhandfiltercontainer_Class',ctrl:'ONHANDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divOnhandfiltercontainer_Class',ctrl:'ONHANDFILTERCONTAINER',prop:'Class'},{av:'edtavConhand_Visible',ctrl:'vCONHAND',prop:'Visible'}]}");
      setEventMetadata("LBLCNTUNITMSRFILTER.CLICK","{handler:'e14131',iparms:[{av:'divCntunitmsrfiltercontainer_Class',ctrl:'CNTUNITMSRFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCntunitmsrfiltercontainer_Class',ctrl:'CNTUNITMSRFILTERCONTAINER',prop:'Class'},{av:'edtavCcntunitmsr_Visible',ctrl:'vCCNTUNITMSR',prop:'Visible'}]}");
      setEventMetadata("LBLAVGPRICEFILTER.CLICK","{handler:'e15131',iparms:[{av:'divAvgpricefiltercontainer_Class',ctrl:'AVGPRICEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAvgpricefiltercontainer_Class',ctrl:'AVGPRICEFILTERCONTAINER',prop:'Class'},{av:'edtavCavgprice_Visible',ctrl:'vCAVGPRICE',prop:'Visible'}]}");
      setEventMetadata("LBLVALIDFORFILTER.CLICK","{handler:'e16131',iparms:[{av:'divValidforfiltercontainer_Class',ctrl:'VALIDFORFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divValidforfiltercontainer_Class',ctrl:'VALIDFORFILTERCONTAINER',prop:'Class'},{av:'edtavCvalidfor_Visible',ctrl:'vCVALIDFOR',prop:'Visible'}]}");
      setEventMetadata("LBLINVNTITEMFILTER.CLICK","{handler:'e17131',iparms:[{av:'divInvntitemfiltercontainer_Class',ctrl:'INVNTITEMFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvntitemfiltercontainer_Class',ctrl:'INVNTITEMFILTERCONTAINER',prop:'Class'},{av:'edtavCinvntitem_Visible',ctrl:'vCINVNTITEM',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e21132',iparms:[{av:'A189ItemCode',fld:'ITEMCODE',pic:'',hsh:true,nv:''}],oparms:[{av:'AV13pItemCode',fld:'vPITEMCODE',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cItemCode',fld:'vCITEMCODE',pic:'',nv:''},{av:'AV7cItemName',fld:'vCITEMNAME',pic:'',nv:''},{av:'AV8cOnHand',fld:'vCONHAND',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cCntUnitMsr',fld:'vCCNTUNITMSR',pic:'',nv:''},{av:'AV10cAvgPrice',fld:'vCAVGPRICE',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cvalidFor',fld:'vCVALIDFOR',pic:'',nv:''},{av:'AV12cInvntItem',fld:'vCINVNTITEM',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cItemCode',fld:'vCITEMCODE',pic:'',nv:''},{av:'AV7cItemName',fld:'vCITEMNAME',pic:'',nv:''},{av:'AV8cOnHand',fld:'vCONHAND',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cCntUnitMsr',fld:'vCCNTUNITMSR',pic:'',nv:''},{av:'AV10cAvgPrice',fld:'vCAVGPRICE',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cvalidFor',fld:'vCVALIDFOR',pic:'',nv:''},{av:'AV12cInvntItem',fld:'vCINVNTITEM',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cItemCode',fld:'vCITEMCODE',pic:'',nv:''},{av:'AV7cItemName',fld:'vCITEMNAME',pic:'',nv:''},{av:'AV8cOnHand',fld:'vCONHAND',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cCntUnitMsr',fld:'vCCNTUNITMSR',pic:'',nv:''},{av:'AV10cAvgPrice',fld:'vCAVGPRICE',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cvalidFor',fld:'vCVALIDFOR',pic:'',nv:''},{av:'AV12cInvntItem',fld:'vCINVNTITEM',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cItemCode',fld:'vCITEMCODE',pic:'',nv:''},{av:'AV7cItemName',fld:'vCITEMNAME',pic:'',nv:''},{av:'AV8cOnHand',fld:'vCONHAND',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cCntUnitMsr',fld:'vCCNTUNITMSR',pic:'',nv:''},{av:'AV10cAvgPrice',fld:'vCAVGPRICE',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cvalidFor',fld:'vCVALIDFOR',pic:'',nv:''},{av:'AV12cInvntItem',fld:'vCINVNTITEM',pic:'',nv:''}],oparms:[]}");
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
      AV6cItemCode = "" ;
      AV7cItemName = "" ;
      AV9cCntUnitMsr = "" ;
      AV11cvalidFor = "" ;
      AV12cInvntItem = "" ;
      GXKey = "" ;
      AV13pItemCode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblitemcodefilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblitemnamefilter_Jsonclick = "" ;
      lblLblonhandfilter_Jsonclick = "" ;
      lblLblcntunitmsrfilter_Jsonclick = "" ;
      lblLblavgpricefilter_Jsonclick = "" ;
      lblLblvalidforfilter_Jsonclick = "" ;
      lblLblinvntitemfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A189ItemCode = "" ;
      A194validFor = "" ;
      A195InvntItem = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV6cItemCode = "" ;
      lV7cItemName = "" ;
      lV9cCntUnitMsr = "" ;
      lV11cvalidFor = "" ;
      lV12cInvntItem = "" ;
      A190ItemName = "" ;
      A192CntUnitMsr = "" ;
      H00132_A192CntUnitMsr = new String[] {""} ;
      H00132_A190ItemName = new String[] {""} ;
      H00132_A196BodegaCuarWhsCode = new short[1] ;
      H00132_A195InvntItem = new String[] {""} ;
      H00132_A194validFor = new String[] {""} ;
      H00132_A193AvgPrice = new long[1] ;
      H00132_A191OnHand = new long[1] ;
      H00132_A189ItemCode = new String[] {""} ;
      H00133_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.gx00b0__fusquim_sap(),
         new Object[] {
             new Object[] {
            H00132_A192CntUnitMsr, H00132_A190ItemName, H00132_A196BodegaCuarWhsCode, H00132_A195InvntItem, H00132_A194validFor, H00132_A193AvgPrice, H00132_A191OnHand, H00132_A189ItemCode
            }
            , new Object[] {
            H00133_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_84 ;
   private short nGXsfl_84_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A196BodegaCuarWhsCode ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCitemcode_Visible ;
   private int edtavCitemcode_Enabled ;
   private int edtavCitemname_Visible ;
   private int edtavCitemname_Enabled ;
   private int edtavConhand_Enabled ;
   private int edtavConhand_Visible ;
   private int edtavCcntunitmsr_Visible ;
   private int edtavCcntunitmsr_Enabled ;
   private int edtavCavgprice_Enabled ;
   private int edtavCavgprice_Visible ;
   private int edtavCvalidfor_Visible ;
   private int edtavCvalidfor_Enabled ;
   private int edtavCinvntitem_Visible ;
   private int edtavCinvntitem_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV8cOnHand ;
   private long AV10cAvgPrice ;
   private long GRID1_nFirstRecordOnPage ;
   private long A191OnHand ;
   private long A193AvgPrice ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divItemcodefiltercontainer_Class ;
   private String divItemnamefiltercontainer_Class ;
   private String divOnhandfiltercontainer_Class ;
   private String divCntunitmsrfiltercontainer_Class ;
   private String divAvgpricefiltercontainer_Class ;
   private String divValidforfiltercontainer_Class ;
   private String divInvntitemfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV11cvalidFor ;
   private String AV12cInvntItem ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divItemcodefiltercontainer_Internalname ;
   private String lblLblitemcodefilter_Internalname ;
   private String lblLblitemcodefilter_Jsonclick ;
   private String edtavCitemcode_Internalname ;
   private String TempTags ;
   private String edtavCitemcode_Jsonclick ;
   private String divItemnamefiltercontainer_Internalname ;
   private String lblLblitemnamefilter_Internalname ;
   private String lblLblitemnamefilter_Jsonclick ;
   private String edtavCitemname_Internalname ;
   private String edtavCitemname_Jsonclick ;
   private String divOnhandfiltercontainer_Internalname ;
   private String lblLblonhandfilter_Internalname ;
   private String lblLblonhandfilter_Jsonclick ;
   private String edtavConhand_Internalname ;
   private String edtavConhand_Jsonclick ;
   private String divCntunitmsrfiltercontainer_Internalname ;
   private String lblLblcntunitmsrfilter_Internalname ;
   private String lblLblcntunitmsrfilter_Jsonclick ;
   private String edtavCcntunitmsr_Internalname ;
   private String edtavCcntunitmsr_Jsonclick ;
   private String divAvgpricefiltercontainer_Internalname ;
   private String lblLblavgpricefilter_Internalname ;
   private String lblLblavgpricefilter_Jsonclick ;
   private String edtavCavgprice_Internalname ;
   private String edtavCavgprice_Jsonclick ;
   private String divValidforfiltercontainer_Internalname ;
   private String lblLblvalidforfilter_Internalname ;
   private String lblLblvalidforfilter_Jsonclick ;
   private String edtavCvalidfor_Internalname ;
   private String edtavCvalidfor_Jsonclick ;
   private String divInvntitemfiltercontainer_Internalname ;
   private String lblLblinvntitemfilter_Internalname ;
   private String lblLblinvntitemfilter_Jsonclick ;
   private String edtavCinvntitem_Internalname ;
   private String edtavCinvntitem_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String A194validFor ;
   private String A195InvntItem ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtItemCode_Internalname ;
   private String edtOnHand_Internalname ;
   private String edtAvgPrice_Internalname ;
   private String edtvalidFor_Internalname ;
   private String edtInvntItem_Internalname ;
   private String edtBodegaCuarWhsCode_Internalname ;
   private String scmdbuf ;
   private String lV11cvalidFor ;
   private String lV12cInvntItem ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtItemCode_Jsonclick ;
   private String edtOnHand_Jsonclick ;
   private String edtAvgPrice_Jsonclick ;
   private String edtvalidFor_Jsonclick ;
   private String edtInvntItem_Jsonclick ;
   private String edtBodegaCuarWhsCode_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV6cItemCode ;
   private String AV7cItemName ;
   private String AV9cCntUnitMsr ;
   private String AV13pItemCode ;
   private String A189ItemCode ;
   private String AV17Linkselection_GXI ;
   private String lV6cItemCode ;
   private String lV7cItemName ;
   private String lV9cCntUnitMsr ;
   private String A190ItemName ;
   private String A192CntUnitMsr ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_fusquim_sap ;
   private String[] H00132_A192CntUnitMsr ;
   private String[] H00132_A190ItemName ;
   private short[] H00132_A196BodegaCuarWhsCode ;
   private String[] H00132_A195InvntItem ;
   private String[] H00132_A194validFor ;
   private long[] H00132_A193AvgPrice ;
   private long[] H00132_A191OnHand ;
   private String[] H00132_A189ItemCode ;
   private long[] H00133_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00b0__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00132( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cItemName ,
                                          long AV8cOnHand ,
                                          String AV9cCntUnitMsr ,
                                          long AV10cAvgPrice ,
                                          String AV11cvalidFor ,
                                          String AV12cInvntItem ,
                                          String A190ItemName ,
                                          long A191OnHand ,
                                          String A192CntUnitMsr ,
                                          long A193AvgPrice ,
                                          String A194validFor ,
                                          String A195InvntItem ,
                                          String A189ItemCode ,
                                          String AV6cItemCode )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [10] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " [CntUnitMsr], [ItemName], [WhsCode], [InvntItem], [validFor], [AvgPrice], [OnHand]," ;
      sSelectString = sSelectString + " [ItemCode]" ;
      sFromString = " FROM dbo.[VStockCuar] WITH (NOLOCK)" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE ([ItemCode] like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cItemName)==0) )
      {
         sWhereString = sWhereString + " and ([ItemName] like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cOnHand) )
      {
         sWhereString = sWhereString + " and ([OnHand] >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cCntUnitMsr)==0) )
      {
         sWhereString = sWhereString + " and ([CntUnitMsr] like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cAvgPrice) )
      {
         sWhereString = sWhereString + " and ([AvgPrice] >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cvalidFor)==0) )
      {
         sWhereString = sWhereString + " and ([validFor] like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cInvntItem)==0) )
      {
         sWhereString = sWhereString + " and ([InvntItem] like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY [ItemCode]" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT CAST((SELECT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) AS INTEGER) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00133( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cItemName ,
                                          long AV8cOnHand ,
                                          String AV9cCntUnitMsr ,
                                          long AV10cAvgPrice ,
                                          String AV11cvalidFor ,
                                          String AV12cInvntItem ,
                                          String A190ItemName ,
                                          long A191OnHand ,
                                          String A192CntUnitMsr ,
                                          long A193AvgPrice ,
                                          String A194validFor ,
                                          String A195InvntItem ,
                                          String A189ItemCode ,
                                          String AV6cItemCode )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM dbo.[VStockCuar] WITH (NOLOCK)" ;
      scmdbuf = scmdbuf + " WHERE ([ItemCode] like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cItemName)==0) )
      {
         sWhereString = sWhereString + " and ([ItemName] like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cOnHand) )
      {
         sWhereString = sWhereString + " and ([OnHand] >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cCntUnitMsr)==0) )
      {
         sWhereString = sWhereString + " and ([CntUnitMsr] like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cAvgPrice) )
      {
         sWhereString = sWhereString + " and ([AvgPrice] >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cvalidFor)==0) )
      {
         sWhereString = sWhereString + " and ([validFor] like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cInvntItem)==0) )
      {
         sWhereString = sWhereString + " and ([InvntItem] like ?)" ;
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H00132(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_H00133(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00132", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00133", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 1) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 50);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[12]).longValue(), 0);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[14]).longValue(), 0);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 50);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[9]).longValue(), 0);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[11]).longValue(), 0);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

