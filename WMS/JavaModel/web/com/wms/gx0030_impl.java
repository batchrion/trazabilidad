/*
               File: gx0030_impl
        Description: Selection List UVID_CONTROLCH
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 5, 2018 11:41:14.79
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

public final  class gx0030_impl extends GXDataArea
{
   public gx0030_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0030_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0030_impl.class ));
   }

   public gx0030_impl( int remoteHandle ,
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
            AV6cUVID_CONTROLCHDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cDocNum = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cPeriod = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cInstance = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10cSeries = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11cHandwrtten = httpContext.GetNextPar( ) ;
            AV12cCanceled = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCHDocEntry, AV7cDocNum, AV8cPeriod, AV9cInstance, AV10cSeries, AV11cHandwrtten, AV12cCanceled) ;
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
            AV13pUVID_CONTROLCHDocEntry = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_CONTROLCHDocEntry, 9, 0)));
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
      pa0Q2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0Q2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20181511411490");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.gx0030") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUVID_CONTROLCHDocEntry,9,0)))+"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_CONTROLCHDOCENTRY", GXutil.ltrim( localUtil.ntoc( AV6cUVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDOCNUM", GXutil.ltrim( localUtil.ntoc( AV7cDocNum, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPERIOD", GXutil.ltrim( localUtil.ntoc( AV8cPeriod, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINSTANCE", GXutil.ltrim( localUtil.ntoc( AV9cInstance, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSERIES", GXutil.ltrim( localUtil.ntoc( AV10cSeries, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCHANDWRTTEN", GXutil.rtrim( AV11cHandwrtten));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCANCELED", GXutil.rtrim( AV12cCanceled));
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPUVID_CONTROLCHDOCENTRY", GXutil.ltrim( localUtil.ntoc( AV13pUVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCHDOCENTRYFILTERCONTAINER_Class", GXutil.rtrim( divUvid_controlchdocentryfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "DOCNUMFILTERCONTAINER_Class", GXutil.rtrim( divDocnumfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "PERIODFILTERCONTAINER_Class", GXutil.rtrim( divPeriodfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "INSTANCEFILTERCONTAINER_Class", GXutil.rtrim( divInstancefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "SERIESFILTERCONTAINER_Class", GXutil.rtrim( divSeriesfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "HANDWRTTENFILTERCONTAINER_Class", GXutil.rtrim( divHandwrttenfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "CANCELEDFILTERCONTAINER_Class", GXutil.rtrim( divCanceledfiltercontainer_Class));
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
         we0Q2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0Q2( ) ;
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
      return formatLink("com.wms.gx0030") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUVID_CONTROLCHDocEntry,9,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx0030" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List UVID_CONTROLCH" ;
   }

   public void wb0Q0( )
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
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_controlchdocentryfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_controlchdocentryfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_controlchdocentryfilter_Internalname, "UVID_CONTROLCHDoc Entry", "", "", lblLbluvid_controlchdocentryfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110q1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0030.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_controlchdocentry_Internalname, "Doc Entry", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_controlchdocentry_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cUVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtavCuvid_controlchdocentry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cUVID_CONTROLCHDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cUVID_CONTROLCHDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_controlchdocentry_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_controlchdocentry_Visible, edtavCuvid_controlchdocentry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0030.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divDocnumfiltercontainer_Internalname, 1, 0, "px", 0, "px", divDocnumfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbldocnumfilter_Internalname, "Doc Num", "", "", lblLbldocnumfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120q1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0030.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCdocnum_Internalname, "Doc Num", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCdocnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cDocNum, (byte)(9), (byte)(0), ",", "")), ((edtavCdocnum_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cDocNum), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cDocNum), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdocnum_Jsonclick, 0, "Attribute", "", "", "", edtavCdocnum_Visible, edtavCdocnum_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0030.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divPeriodfiltercontainer_Internalname, 1, 0, "px", 0, "px", divPeriodfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblperiodfilter_Internalname, "Period", "", "", lblLblperiodfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130q1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0030.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCperiod_Internalname, "Period", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCperiod_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cPeriod, (byte)(9), (byte)(0), ",", "")), ((edtavCperiod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cPeriod), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cPeriod), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCperiod_Jsonclick, 0, "Attribute", "", "", "", edtavCperiod_Visible, edtavCperiod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0030.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divInstancefiltercontainer_Internalname, 1, 0, "px", 0, "px", divInstancefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblinstancefilter_Internalname, "Instance", "", "", lblLblinstancefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140q1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0030.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCinstance_Internalname, "Instance", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCinstance_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cInstance, (byte)(4), (byte)(0), ",", "")), ((edtavCinstance_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cInstance), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cInstance), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinstance_Jsonclick, 0, "Attribute", "", "", "", edtavCinstance_Visible, edtavCinstance_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0030.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divSeriesfiltercontainer_Internalname, 1, 0, "px", 0, "px", divSeriesfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblseriesfilter_Internalname, "Series", "", "", lblLblseriesfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150q1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0030.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCseries_Internalname, "Series", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCseries_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cSeries, (byte)(9), (byte)(0), ",", "")), ((edtavCseries_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cSeries), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cSeries), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCseries_Jsonclick, 0, "Attribute", "", "", "", edtavCseries_Visible, edtavCseries_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0030.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divHandwrttenfiltercontainer_Internalname, 1, 0, "px", 0, "px", divHandwrttenfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblhandwrttenfilter_Internalname, "Handwrtten", "", "", lblLblhandwrttenfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160q1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0030.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavChandwrtten_Internalname, "Handwrtten", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavChandwrtten_Internalname, GXutil.rtrim( AV11cHandwrtten), GXutil.rtrim( localUtil.format( AV11cHandwrtten, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavChandwrtten_Jsonclick, 0, "Attribute", "", "", "", edtavChandwrtten_Visible, edtavChandwrtten_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0030.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divCanceledfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCanceledfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblcanceledfilter_Internalname, "Canceled", "", "", lblLblcanceledfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e170q1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0030.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCcanceled_Internalname, "Canceled", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCcanceled_Internalname, GXutil.rtrim( AV12cCanceled), GXutil.rtrim( localUtil.format( AV12cCanceled, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcanceled_Jsonclick, 0, "Attribute", "", "", "", edtavCcanceled_Visible, edtavCcanceled_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0030.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e180q1_client"+"'", TempTags, "", 2, "HLP_Gx0030.htm");
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Doc Entry") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Doc Num") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Period") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Instance") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Series") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Handwrtten") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Canceled") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Object") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Log Inst") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Status") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44DocNum, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtDocNum_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A45Period, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A46Instance, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47Series, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A48Handwrtten));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A49Canceled));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A50UVID_CONTROLCHObject);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51UVID_CONTROLCHLogInst, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A54Status));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0030.htm");
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

   public void start0Q2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List UVID_CONTROLCH", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0Q0( ) ;
   }

   public void ws0Q2( )
   {
      start0Q2( ) ;
      evt0Q2( ) ;
   }

   public void evt0Q2( )
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
                           A43UVID_CONTROLCHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCHDocEntry_Internalname), ",", ".")) ;
                           A44DocNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDocNum_Internalname), ",", ".")) ;
                           n44DocNum = false ;
                           A45Period = (int)(localUtil.ctol( httpContext.cgiGet( edtPeriod_Internalname), ",", ".")) ;
                           n45Period = false ;
                           A46Instance = (short)(localUtil.ctol( httpContext.cgiGet( edtInstance_Internalname), ",", ".")) ;
                           n46Instance = false ;
                           A47Series = (int)(localUtil.ctol( httpContext.cgiGet( edtSeries_Internalname), ",", ".")) ;
                           n47Series = false ;
                           A48Handwrtten = httpContext.cgiGet( edtHandwrtten_Internalname) ;
                           n48Handwrtten = false ;
                           A49Canceled = httpContext.cgiGet( edtCanceled_Internalname) ;
                           n49Canceled = false ;
                           A50UVID_CONTROLCHObject = httpContext.cgiGet( edtUVID_CONTROLCHObject_Internalname) ;
                           n50UVID_CONTROLCHObject = false ;
                           A51UVID_CONTROLCHLogInst = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCHLogInst_Internalname), ",", ".")) ;
                           n51UVID_CONTROLCHLogInst = false ;
                           A54Status = httpContext.cgiGet( edtStatus_Internalname) ;
                           n54Status = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e190Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e200Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cuvid_controlchdocentry Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_CONTROLCHDOCENTRY"), ",", ".") != AV6cUVID_CONTROLCHDocEntry )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdocnum Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDOCNUM"), ",", ".") != AV7cDocNum )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cperiod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPERIOD"), ",", ".") != AV8cPeriod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinstance Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCINSTANCE"), ",", ".") != AV9cInstance )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cseries Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCSERIES"), ",", ".") != AV10cSeries )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Chandwrtten Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCHANDWRTTEN"), AV11cHandwrtten) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccanceled Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCANCELED"), AV12cCanceled) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e210Q2 ();
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

   public void we0Q2( )
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

   public void pa0Q2( )
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
                                  int AV6cUVID_CONTROLCHDocEntry ,
                                  int AV7cDocNum ,
                                  int AV8cPeriod ,
                                  short AV9cInstance ,
                                  int AV10cSeries ,
                                  String AV11cHandwrtten ,
                                  String AV12cCanceled )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0Q2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHDOCENTRY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCHDOCENTRY", GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_DOCNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A44DocNum), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "DOCNUM", GXutil.ltrim( localUtil.ntoc( A44DocNum, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PERIOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A45Period), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "PERIOD", GXutil.ltrim( localUtil.ntoc( A45Period, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_INSTANCE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A46Instance), "ZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "INSTANCE", GXutil.ltrim( localUtil.ntoc( A46Instance, (byte)(4), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_SERIES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A47Series), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "SERIES", GXutil.ltrim( localUtil.ntoc( A47Series, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_HANDWRTTEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A48Handwrtten, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "HANDWRTTEN", GXutil.rtrim( A48Handwrtten));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CANCELED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A49Canceled, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "CANCELED", GXutil.rtrim( A49Canceled));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHOBJECT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A50UVID_CONTROLCHObject, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCHOBJECT", A50UVID_CONTROLCHObject);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHLOGINST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A51UVID_CONTROLCHLogInst), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCHLOGINST", GXutil.ltrim( localUtil.ntoc( A51UVID_CONTROLCHLogInst, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_STATUS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A54Status, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "STATUS", GXutil.rtrim( A54Status));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0Q2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0Q2( )
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
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              new Integer(AV7cDocNum) ,
                                              new Integer(AV8cPeriod) ,
                                              new Short(AV9cInstance) ,
                                              new Integer(AV10cSeries) ,
                                              AV11cHandwrtten ,
                                              AV12cCanceled ,
                                              new Integer(A44DocNum) ,
                                              new Integer(A45Period) ,
                                              new Short(A46Instance) ,
                                              new Integer(A47Series) ,
                                              A48Handwrtten ,
                                              A49Canceled ,
                                              new Integer(AV6cUVID_CONTROLCHDocEntry) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                              }
         } ) ;
         lV11cHandwrtten = GXutil.padr( GXutil.rtrim( AV11cHandwrtten), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cHandwrtten", AV11cHandwrtten);
         lV12cCanceled = GXutil.padr( GXutil.rtrim( AV12cCanceled), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cCanceled", AV12cCanceled);
         /* Using cursor H000Q2 */
         pr_default.execute(0, new Object[] {new Integer(AV6cUVID_CONTROLCHDocEntry), new Integer(AV7cDocNum), new Integer(AV8cPeriod), new Short(AV9cInstance), new Integer(AV10cSeries), lV11cHandwrtten, lV12cCanceled, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A54Status = H000Q2_A54Status[0] ;
            n54Status = H000Q2_n54Status[0] ;
            A51UVID_CONTROLCHLogInst = H000Q2_A51UVID_CONTROLCHLogInst[0] ;
            n51UVID_CONTROLCHLogInst = H000Q2_n51UVID_CONTROLCHLogInst[0] ;
            A50UVID_CONTROLCHObject = H000Q2_A50UVID_CONTROLCHObject[0] ;
            n50UVID_CONTROLCHObject = H000Q2_n50UVID_CONTROLCHObject[0] ;
            A49Canceled = H000Q2_A49Canceled[0] ;
            n49Canceled = H000Q2_n49Canceled[0] ;
            A48Handwrtten = H000Q2_A48Handwrtten[0] ;
            n48Handwrtten = H000Q2_n48Handwrtten[0] ;
            A47Series = H000Q2_A47Series[0] ;
            n47Series = H000Q2_n47Series[0] ;
            A46Instance = H000Q2_A46Instance[0] ;
            n46Instance = H000Q2_n46Instance[0] ;
            A45Period = H000Q2_A45Period[0] ;
            n45Period = H000Q2_n45Period[0] ;
            A44DocNum = H000Q2_A44DocNum[0] ;
            n44DocNum = H000Q2_n44DocNum[0] ;
            A43UVID_CONTROLCHDocEntry = H000Q2_A43UVID_CONTROLCHDocEntry[0] ;
            /* Execute user event: Load */
            e200Q2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb0Q0( ) ;
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           new Integer(AV7cDocNum) ,
                                           new Integer(AV8cPeriod) ,
                                           new Short(AV9cInstance) ,
                                           new Integer(AV10cSeries) ,
                                           AV11cHandwrtten ,
                                           AV12cCanceled ,
                                           new Integer(A44DocNum) ,
                                           new Integer(A45Period) ,
                                           new Short(A46Instance) ,
                                           new Integer(A47Series) ,
                                           A48Handwrtten ,
                                           A49Canceled ,
                                           new Integer(AV6cUVID_CONTROLCHDocEntry) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                           }
      } ) ;
      lV11cHandwrtten = GXutil.padr( GXutil.rtrim( AV11cHandwrtten), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cHandwrtten", AV11cHandwrtten);
      lV12cCanceled = GXutil.padr( GXutil.rtrim( AV12cCanceled), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cCanceled", AV12cCanceled);
      /* Using cursor H000Q3 */
      pr_default.execute(1, new Object[] {new Integer(AV6cUVID_CONTROLCHDocEntry), new Integer(AV7cDocNum), new Integer(AV8cPeriod), new Short(AV9cInstance), new Integer(AV10cSeries), lV11cHandwrtten, lV12cCanceled});
      GRID1_nRecordCount = H000Q3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCHDocEntry, AV7cDocNum, AV8cPeriod, AV9cInstance, AV10cSeries, AV11cHandwrtten, AV12cCanceled) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCHDocEntry, AV7cDocNum, AV8cPeriod, AV9cInstance, AV10cSeries, AV11cHandwrtten, AV12cCanceled) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCHDocEntry, AV7cDocNum, AV8cPeriod, AV9cInstance, AV10cSeries, AV11cHandwrtten, AV12cCanceled) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCHDocEntry, AV7cDocNum, AV8cPeriod, AV9cInstance, AV10cSeries, AV11cHandwrtten, AV12cCanceled) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCHDocEntry, AV7cDocNum, AV8cPeriod, AV9cInstance, AV10cSeries, AV11cHandwrtten, AV12cCanceled) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0Q0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e190Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_controlchdocentry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_controlchdocentry_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUVID_CONTROLCHDOCENTRY");
            GX_FocusControl = edtavCuvid_controlchdocentry_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cUVID_CONTROLCHDocEntry = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cUVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( AV6cUVID_CONTROLCHDocEntry, 9, 0)));
         }
         else
         {
            AV6cUVID_CONTROLCHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtavCuvid_controlchdocentry_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cUVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( AV6cUVID_CONTROLCHDocEntry, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCdocnum_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCdocnum_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCDOCNUM");
            GX_FocusControl = edtavCdocnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cDocNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cDocNum", GXutil.ltrim( GXutil.str( AV7cDocNum, 9, 0)));
         }
         else
         {
            AV7cDocNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavCdocnum_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cDocNum", GXutil.ltrim( GXutil.str( AV7cDocNum, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCperiod_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCperiod_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCPERIOD");
            GX_FocusControl = edtavCperiod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cPeriod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cPeriod", GXutil.ltrim( GXutil.str( AV8cPeriod, 9, 0)));
         }
         else
         {
            AV8cPeriod = (int)(localUtil.ctol( httpContext.cgiGet( edtavCperiod_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cPeriod", GXutil.ltrim( GXutil.str( AV8cPeriod, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCinstance_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCinstance_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCINSTANCE");
            GX_FocusControl = edtavCinstance_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cInstance = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cInstance", GXutil.ltrim( GXutil.str( AV9cInstance, 4, 0)));
         }
         else
         {
            AV9cInstance = (short)(localUtil.ctol( httpContext.cgiGet( edtavCinstance_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cInstance", GXutil.ltrim( GXutil.str( AV9cInstance, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCseries_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCseries_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCSERIES");
            GX_FocusControl = edtavCseries_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cSeries = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cSeries", GXutil.ltrim( GXutil.str( AV10cSeries, 9, 0)));
         }
         else
         {
            AV10cSeries = (int)(localUtil.ctol( httpContext.cgiGet( edtavCseries_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cSeries", GXutil.ltrim( GXutil.str( AV10cSeries, 9, 0)));
         }
         AV11cHandwrtten = httpContext.cgiGet( edtavChandwrtten_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cHandwrtten", AV11cHandwrtten);
         AV12cCanceled = httpContext.cgiGet( edtavCcanceled_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cCanceled", AV12cCanceled);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_CONTROLCHDOCENTRY"), ",", ".") != AV6cUVID_CONTROLCHDocEntry )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDOCNUM"), ",", ".") != AV7cDocNum )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPERIOD"), ",", ".") != AV8cPeriod )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCINSTANCE"), ",", ".") != AV9cInstance )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCSERIES"), ",", ".") != AV10cSeries )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCHANDWRTTEN"), AV11cHandwrtten) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCANCELED"), AV12cCanceled) != 0 )
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
      e190Q2 ();
      if (returnInSub) return;
   }

   public void e190Q2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "UVID_CONTROLCH", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e200Q2( )
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
      e210Q2 ();
      if (returnInSub) return;
   }

   public void e210Q2( )
   {
      /* Enter Routine */
      AV13pUVID_CONTROLCHDocEntry = A43UVID_CONTROLCHDocEntry ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_CONTROLCHDocEntry, 9, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pUVID_CONTROLCHDocEntry)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pUVID_CONTROLCHDocEntry = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_CONTROLCHDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_CONTROLCHDocEntry, 9, 0)));
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
      pa0Q2( ) ;
      ws0Q2( ) ;
      we0Q2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?11405179");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20181511411688");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gx0030.js", "?20181511411688");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtUVID_CONTROLCHDocEntry_Internalname = "UVID_CONTROLCHDOCENTRY_"+sGXsfl_84_idx ;
      edtDocNum_Internalname = "DOCNUM_"+sGXsfl_84_idx ;
      edtPeriod_Internalname = "PERIOD_"+sGXsfl_84_idx ;
      edtInstance_Internalname = "INSTANCE_"+sGXsfl_84_idx ;
      edtSeries_Internalname = "SERIES_"+sGXsfl_84_idx ;
      edtHandwrtten_Internalname = "HANDWRTTEN_"+sGXsfl_84_idx ;
      edtCanceled_Internalname = "CANCELED_"+sGXsfl_84_idx ;
      edtUVID_CONTROLCHObject_Internalname = "UVID_CONTROLCHOBJECT_"+sGXsfl_84_idx ;
      edtUVID_CONTROLCHLogInst_Internalname = "UVID_CONTROLCHLOGINST_"+sGXsfl_84_idx ;
      edtStatus_Internalname = "STATUS_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtUVID_CONTROLCHDocEntry_Internalname = "UVID_CONTROLCHDOCENTRY_"+sGXsfl_84_fel_idx ;
      edtDocNum_Internalname = "DOCNUM_"+sGXsfl_84_fel_idx ;
      edtPeriod_Internalname = "PERIOD_"+sGXsfl_84_fel_idx ;
      edtInstance_Internalname = "INSTANCE_"+sGXsfl_84_fel_idx ;
      edtSeries_Internalname = "SERIES_"+sGXsfl_84_fel_idx ;
      edtHandwrtten_Internalname = "HANDWRTTEN_"+sGXsfl_84_fel_idx ;
      edtCanceled_Internalname = "CANCELED_"+sGXsfl_84_fel_idx ;
      edtUVID_CONTROLCHObject_Internalname = "UVID_CONTROLCHOBJECT_"+sGXsfl_84_fel_idx ;
      edtUVID_CONTROLCHLogInst_Internalname = "UVID_CONTROLCHLOGINST_"+sGXsfl_84_fel_idx ;
      edtStatus_Internalname = "STATUS_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb0Q0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_CONTROLCHDocEntry_Internalname,GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_CONTROLCHDocEntry_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtDocNum_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtDocNum_Internalname, "Link", edtDocNum_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDocNum_Internalname,GXutil.ltrim( localUtil.ntoc( A44DocNum, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A44DocNum), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtDocNum_Link,"","","",edtDocNum_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPeriod_Internalname,GXutil.ltrim( localUtil.ntoc( A45Period, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A45Period), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPeriod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInstance_Internalname,GXutil.ltrim( localUtil.ntoc( A46Instance, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A46Instance), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInstance_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSeries_Internalname,GXutil.ltrim( localUtil.ntoc( A47Series, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A47Series), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSeries_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHandwrtten_Internalname,GXutil.rtrim( A48Handwrtten),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHandwrtten_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCanceled_Internalname,GXutil.rtrim( A49Canceled),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCanceled_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_CONTROLCHObject_Internalname,A50UVID_CONTROLCHObject,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_CONTROLCHObject_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_CONTROLCHLogInst_Internalname,GXutil.ltrim( localUtil.ntoc( A51UVID_CONTROLCHLogInst, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A51UVID_CONTROLCHLogInst), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_CONTROLCHLogInst_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStatus_Internalname,GXutil.rtrim( A54Status),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStatus_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHDOCENTRY"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_DOCNUM"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A44DocNum), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PERIOD"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A45Period), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_INSTANCE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A46Instance), "ZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_SERIES"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A47Series), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_HANDWRTTEN"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A48Handwrtten, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CANCELED"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A49Canceled, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHOBJECT"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A50UVID_CONTROLCHObject, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHLOGINST"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A51UVID_CONTROLCHLogInst), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_STATUS"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A54Status, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLbluvid_controlchdocentryfilter_Internalname = "LBLUVID_CONTROLCHDOCENTRYFILTER" ;
      edtavCuvid_controlchdocentry_Internalname = "vCUVID_CONTROLCHDOCENTRY" ;
      divUvid_controlchdocentryfiltercontainer_Internalname = "UVID_CONTROLCHDOCENTRYFILTERCONTAINER" ;
      lblLbldocnumfilter_Internalname = "LBLDOCNUMFILTER" ;
      edtavCdocnum_Internalname = "vCDOCNUM" ;
      divDocnumfiltercontainer_Internalname = "DOCNUMFILTERCONTAINER" ;
      lblLblperiodfilter_Internalname = "LBLPERIODFILTER" ;
      edtavCperiod_Internalname = "vCPERIOD" ;
      divPeriodfiltercontainer_Internalname = "PERIODFILTERCONTAINER" ;
      lblLblinstancefilter_Internalname = "LBLINSTANCEFILTER" ;
      edtavCinstance_Internalname = "vCINSTANCE" ;
      divInstancefiltercontainer_Internalname = "INSTANCEFILTERCONTAINER" ;
      lblLblseriesfilter_Internalname = "LBLSERIESFILTER" ;
      edtavCseries_Internalname = "vCSERIES" ;
      divSeriesfiltercontainer_Internalname = "SERIESFILTERCONTAINER" ;
      lblLblhandwrttenfilter_Internalname = "LBLHANDWRTTENFILTER" ;
      edtavChandwrtten_Internalname = "vCHANDWRTTEN" ;
      divHandwrttenfiltercontainer_Internalname = "HANDWRTTENFILTERCONTAINER" ;
      lblLblcanceledfilter_Internalname = "LBLCANCELEDFILTER" ;
      edtavCcanceled_Internalname = "vCCANCELED" ;
      divCanceledfiltercontainer_Internalname = "CANCELEDFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtUVID_CONTROLCHDocEntry_Internalname = "UVID_CONTROLCHDOCENTRY" ;
      edtDocNum_Internalname = "DOCNUM" ;
      edtPeriod_Internalname = "PERIOD" ;
      edtInstance_Internalname = "INSTANCE" ;
      edtSeries_Internalname = "SERIES" ;
      edtHandwrtten_Internalname = "HANDWRTTEN" ;
      edtCanceled_Internalname = "CANCELED" ;
      edtUVID_CONTROLCHObject_Internalname = "UVID_CONTROLCHOBJECT" ;
      edtUVID_CONTROLCHLogInst_Internalname = "UVID_CONTROLCHLOGINST" ;
      edtStatus_Internalname = "STATUS" ;
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
      edtStatus_Jsonclick = "" ;
      edtUVID_CONTROLCHLogInst_Jsonclick = "" ;
      edtUVID_CONTROLCHObject_Jsonclick = "" ;
      edtCanceled_Jsonclick = "" ;
      edtHandwrtten_Jsonclick = "" ;
      edtSeries_Jsonclick = "" ;
      edtInstance_Jsonclick = "" ;
      edtPeriod_Jsonclick = "" ;
      edtDocNum_Jsonclick = "" ;
      edtUVID_CONTROLCHDocEntry_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtDocNum_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCcanceled_Jsonclick = "" ;
      edtavCcanceled_Enabled = 1 ;
      edtavCcanceled_Visible = 1 ;
      edtavChandwrtten_Jsonclick = "" ;
      edtavChandwrtten_Enabled = 1 ;
      edtavChandwrtten_Visible = 1 ;
      edtavCseries_Jsonclick = "" ;
      edtavCseries_Enabled = 1 ;
      edtavCseries_Visible = 1 ;
      edtavCinstance_Jsonclick = "" ;
      edtavCinstance_Enabled = 1 ;
      edtavCinstance_Visible = 1 ;
      edtavCperiod_Jsonclick = "" ;
      edtavCperiod_Enabled = 1 ;
      edtavCperiod_Visible = 1 ;
      edtavCdocnum_Jsonclick = "" ;
      edtavCdocnum_Enabled = 1 ;
      edtavCdocnum_Visible = 1 ;
      edtavCuvid_controlchdocentry_Jsonclick = "" ;
      edtavCuvid_controlchdocentry_Enabled = 1 ;
      edtavCuvid_controlchdocentry_Visible = 1 ;
      divCanceledfiltercontainer_Class = "AdvancedContainerItem" ;
      divHandwrttenfiltercontainer_Class = "AdvancedContainerItem" ;
      divSeriesfiltercontainer_Class = "AdvancedContainerItem" ;
      divInstancefiltercontainer_Class = "AdvancedContainerItem" ;
      divPeriodfiltercontainer_Class = "AdvancedContainerItem" ;
      divDocnumfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_controlchdocentryfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List UVID_CONTROLCH" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_CONTROLCHDocEntry',fld:'vCUVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cDocNum',fld:'vCDOCNUM',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cPeriod',fld:'vCPERIOD',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cInstance',fld:'vCINSTANCE',pic:'ZZZ9',nv:0},{av:'AV10cSeries',fld:'vCSERIES',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cHandwrtten',fld:'vCHANDWRTTEN',pic:'',nv:''},{av:'AV12cCanceled',fld:'vCCANCELED',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e180Q1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLUVID_CONTROLCHDOCENTRYFILTER.CLICK","{handler:'e110Q1',iparms:[{av:'divUvid_controlchdocentryfiltercontainer_Class',ctrl:'UVID_CONTROLCHDOCENTRYFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_controlchdocentryfiltercontainer_Class',ctrl:'UVID_CONTROLCHDOCENTRYFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_controlchdocentry_Visible',ctrl:'vCUVID_CONTROLCHDOCENTRY',prop:'Visible'}]}");
      setEventMetadata("LBLDOCNUMFILTER.CLICK","{handler:'e120Q1',iparms:[{av:'divDocnumfiltercontainer_Class',ctrl:'DOCNUMFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDocnumfiltercontainer_Class',ctrl:'DOCNUMFILTERCONTAINER',prop:'Class'},{av:'edtavCdocnum_Visible',ctrl:'vCDOCNUM',prop:'Visible'}]}");
      setEventMetadata("LBLPERIODFILTER.CLICK","{handler:'e130Q1',iparms:[{av:'divPeriodfiltercontainer_Class',ctrl:'PERIODFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divPeriodfiltercontainer_Class',ctrl:'PERIODFILTERCONTAINER',prop:'Class'},{av:'edtavCperiod_Visible',ctrl:'vCPERIOD',prop:'Visible'}]}");
      setEventMetadata("LBLINSTANCEFILTER.CLICK","{handler:'e140Q1',iparms:[{av:'divInstancefiltercontainer_Class',ctrl:'INSTANCEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInstancefiltercontainer_Class',ctrl:'INSTANCEFILTERCONTAINER',prop:'Class'},{av:'edtavCinstance_Visible',ctrl:'vCINSTANCE',prop:'Visible'}]}");
      setEventMetadata("LBLSERIESFILTER.CLICK","{handler:'e150Q1',iparms:[{av:'divSeriesfiltercontainer_Class',ctrl:'SERIESFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divSeriesfiltercontainer_Class',ctrl:'SERIESFILTERCONTAINER',prop:'Class'},{av:'edtavCseries_Visible',ctrl:'vCSERIES',prop:'Visible'}]}");
      setEventMetadata("LBLHANDWRTTENFILTER.CLICK","{handler:'e160Q1',iparms:[{av:'divHandwrttenfiltercontainer_Class',ctrl:'HANDWRTTENFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divHandwrttenfiltercontainer_Class',ctrl:'HANDWRTTENFILTERCONTAINER',prop:'Class'},{av:'edtavChandwrtten_Visible',ctrl:'vCHANDWRTTEN',prop:'Visible'}]}");
      setEventMetadata("LBLCANCELEDFILTER.CLICK","{handler:'e170Q1',iparms:[{av:'divCanceledfiltercontainer_Class',ctrl:'CANCELEDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCanceledfiltercontainer_Class',ctrl:'CANCELEDFILTERCONTAINER',prop:'Class'},{av:'edtavCcanceled_Visible',ctrl:'vCCANCELED',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e210Q2',iparms:[{av:'A43UVID_CONTROLCHDocEntry',fld:'UVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pUVID_CONTROLCHDocEntry',fld:'vPUVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_CONTROLCHDocEntry',fld:'vCUVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cDocNum',fld:'vCDOCNUM',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cPeriod',fld:'vCPERIOD',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cInstance',fld:'vCINSTANCE',pic:'ZZZ9',nv:0},{av:'AV10cSeries',fld:'vCSERIES',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cHandwrtten',fld:'vCHANDWRTTEN',pic:'',nv:''},{av:'AV12cCanceled',fld:'vCCANCELED',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_CONTROLCHDocEntry',fld:'vCUVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cDocNum',fld:'vCDOCNUM',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cPeriod',fld:'vCPERIOD',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cInstance',fld:'vCINSTANCE',pic:'ZZZ9',nv:0},{av:'AV10cSeries',fld:'vCSERIES',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cHandwrtten',fld:'vCHANDWRTTEN',pic:'',nv:''},{av:'AV12cCanceled',fld:'vCCANCELED',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_CONTROLCHDocEntry',fld:'vCUVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cDocNum',fld:'vCDOCNUM',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cPeriod',fld:'vCPERIOD',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cInstance',fld:'vCINSTANCE',pic:'ZZZ9',nv:0},{av:'AV10cSeries',fld:'vCSERIES',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cHandwrtten',fld:'vCHANDWRTTEN',pic:'',nv:''},{av:'AV12cCanceled',fld:'vCCANCELED',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_CONTROLCHDocEntry',fld:'vCUVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cDocNum',fld:'vCDOCNUM',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cPeriod',fld:'vCPERIOD',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cInstance',fld:'vCINSTANCE',pic:'ZZZ9',nv:0},{av:'AV10cSeries',fld:'vCSERIES',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cHandwrtten',fld:'vCHANDWRTTEN',pic:'',nv:''},{av:'AV12cCanceled',fld:'vCCANCELED',pic:'',nv:''}],oparms:[]}");
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
      AV11cHandwrtten = "" ;
      AV12cCanceled = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbluvid_controlchdocentryfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbldocnumfilter_Jsonclick = "" ;
      lblLblperiodfilter_Jsonclick = "" ;
      lblLblinstancefilter_Jsonclick = "" ;
      lblLblseriesfilter_Jsonclick = "" ;
      lblLblhandwrttenfilter_Jsonclick = "" ;
      lblLblcanceledfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A48Handwrtten = "" ;
      A49Canceled = "" ;
      A50UVID_CONTROLCHObject = "" ;
      A54Status = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV11cHandwrtten = "" ;
      lV12cCanceled = "" ;
      H000Q2_A54Status = new String[] {""} ;
      H000Q2_n54Status = new boolean[] {false} ;
      H000Q2_A51UVID_CONTROLCHLogInst = new int[1] ;
      H000Q2_n51UVID_CONTROLCHLogInst = new boolean[] {false} ;
      H000Q2_A50UVID_CONTROLCHObject = new String[] {""} ;
      H000Q2_n50UVID_CONTROLCHObject = new boolean[] {false} ;
      H000Q2_A49Canceled = new String[] {""} ;
      H000Q2_n49Canceled = new boolean[] {false} ;
      H000Q2_A48Handwrtten = new String[] {""} ;
      H000Q2_n48Handwrtten = new boolean[] {false} ;
      H000Q2_A47Series = new int[1] ;
      H000Q2_n47Series = new boolean[] {false} ;
      H000Q2_A46Instance = new short[1] ;
      H000Q2_n46Instance = new boolean[] {false} ;
      H000Q2_A45Period = new int[1] ;
      H000Q2_n45Period = new boolean[] {false} ;
      H000Q2_A44DocNum = new int[1] ;
      H000Q2_n44DocNum = new boolean[] {false} ;
      H000Q2_A43UVID_CONTROLCHDocEntry = new int[1] ;
      H000Q3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.gx0030__default(),
         new Object[] {
             new Object[] {
            H000Q2_A54Status, H000Q2_n54Status, H000Q2_A51UVID_CONTROLCHLogInst, H000Q2_n51UVID_CONTROLCHLogInst, H000Q2_A50UVID_CONTROLCHObject, H000Q2_n50UVID_CONTROLCHObject, H000Q2_A49Canceled, H000Q2_n49Canceled, H000Q2_A48Handwrtten, H000Q2_n48Handwrtten,
            H000Q2_A47Series, H000Q2_n47Series, H000Q2_A46Instance, H000Q2_n46Instance, H000Q2_A45Period, H000Q2_n45Period, H000Q2_A44DocNum, H000Q2_n44DocNum, H000Q2_A43UVID_CONTROLCHDocEntry
            }
            , new Object[] {
            H000Q3_AGRID1_nRecordCount
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
   private short AV9cInstance ;
   private short wbEnd ;
   private short wbStart ;
   private short A46Instance ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int AV6cUVID_CONTROLCHDocEntry ;
   private int AV7cDocNum ;
   private int AV8cPeriod ;
   private int AV10cSeries ;
   private int AV13pUVID_CONTROLCHDocEntry ;
   private int edtavCuvid_controlchdocentry_Enabled ;
   private int edtavCuvid_controlchdocentry_Visible ;
   private int edtavCdocnum_Enabled ;
   private int edtavCdocnum_Visible ;
   private int edtavCperiod_Enabled ;
   private int edtavCperiod_Visible ;
   private int edtavCinstance_Enabled ;
   private int edtavCinstance_Visible ;
   private int edtavCseries_Enabled ;
   private int edtavCseries_Visible ;
   private int edtavChandwrtten_Visible ;
   private int edtavChandwrtten_Enabled ;
   private int edtavCcanceled_Visible ;
   private int edtavCcanceled_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A43UVID_CONTROLCHDocEntry ;
   private int A44DocNum ;
   private int A45Period ;
   private int A47Series ;
   private int A51UVID_CONTROLCHLogInst ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divUvid_controlchdocentryfiltercontainer_Class ;
   private String divDocnumfiltercontainer_Class ;
   private String divPeriodfiltercontainer_Class ;
   private String divInstancefiltercontainer_Class ;
   private String divSeriesfiltercontainer_Class ;
   private String divHandwrttenfiltercontainer_Class ;
   private String divCanceledfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV11cHandwrtten ;
   private String AV12cCanceled ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divUvid_controlchdocentryfiltercontainer_Internalname ;
   private String lblLbluvid_controlchdocentryfilter_Internalname ;
   private String lblLbluvid_controlchdocentryfilter_Jsonclick ;
   private String edtavCuvid_controlchdocentry_Internalname ;
   private String TempTags ;
   private String edtavCuvid_controlchdocentry_Jsonclick ;
   private String divDocnumfiltercontainer_Internalname ;
   private String lblLbldocnumfilter_Internalname ;
   private String lblLbldocnumfilter_Jsonclick ;
   private String edtavCdocnum_Internalname ;
   private String edtavCdocnum_Jsonclick ;
   private String divPeriodfiltercontainer_Internalname ;
   private String lblLblperiodfilter_Internalname ;
   private String lblLblperiodfilter_Jsonclick ;
   private String edtavCperiod_Internalname ;
   private String edtavCperiod_Jsonclick ;
   private String divInstancefiltercontainer_Internalname ;
   private String lblLblinstancefilter_Internalname ;
   private String lblLblinstancefilter_Jsonclick ;
   private String edtavCinstance_Internalname ;
   private String edtavCinstance_Jsonclick ;
   private String divSeriesfiltercontainer_Internalname ;
   private String lblLblseriesfilter_Internalname ;
   private String lblLblseriesfilter_Jsonclick ;
   private String edtavCseries_Internalname ;
   private String edtavCseries_Jsonclick ;
   private String divHandwrttenfiltercontainer_Internalname ;
   private String lblLblhandwrttenfilter_Internalname ;
   private String lblLblhandwrttenfilter_Jsonclick ;
   private String edtavChandwrtten_Internalname ;
   private String edtavChandwrtten_Jsonclick ;
   private String divCanceledfiltercontainer_Internalname ;
   private String lblLblcanceledfilter_Internalname ;
   private String lblLblcanceledfilter_Jsonclick ;
   private String edtavCcanceled_Internalname ;
   private String edtavCcanceled_Jsonclick ;
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
   private String edtDocNum_Link ;
   private String A48Handwrtten ;
   private String A49Canceled ;
   private String A54Status ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtUVID_CONTROLCHDocEntry_Internalname ;
   private String edtDocNum_Internalname ;
   private String edtPeriod_Internalname ;
   private String edtInstance_Internalname ;
   private String edtSeries_Internalname ;
   private String edtHandwrtten_Internalname ;
   private String edtCanceled_Internalname ;
   private String edtUVID_CONTROLCHObject_Internalname ;
   private String edtUVID_CONTROLCHLogInst_Internalname ;
   private String edtStatus_Internalname ;
   private String scmdbuf ;
   private String lV11cHandwrtten ;
   private String lV12cCanceled ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtUVID_CONTROLCHDocEntry_Jsonclick ;
   private String edtDocNum_Jsonclick ;
   private String edtPeriod_Jsonclick ;
   private String edtInstance_Jsonclick ;
   private String edtSeries_Jsonclick ;
   private String edtHandwrtten_Jsonclick ;
   private String edtCanceled_Jsonclick ;
   private String edtUVID_CONTROLCHObject_Jsonclick ;
   private String edtUVID_CONTROLCHLogInst_Jsonclick ;
   private String edtStatus_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n44DocNum ;
   private boolean n45Period ;
   private boolean n46Instance ;
   private boolean n47Series ;
   private boolean n48Handwrtten ;
   private boolean n49Canceled ;
   private boolean n50UVID_CONTROLCHObject ;
   private boolean n51UVID_CONTROLCHLogInst ;
   private boolean n54Status ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String A50UVID_CONTROLCHObject ;
   private String AV17Linkselection_GXI ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H000Q2_A54Status ;
   private boolean[] H000Q2_n54Status ;
   private int[] H000Q2_A51UVID_CONTROLCHLogInst ;
   private boolean[] H000Q2_n51UVID_CONTROLCHLogInst ;
   private String[] H000Q2_A50UVID_CONTROLCHObject ;
   private boolean[] H000Q2_n50UVID_CONTROLCHObject ;
   private String[] H000Q2_A49Canceled ;
   private boolean[] H000Q2_n49Canceled ;
   private String[] H000Q2_A48Handwrtten ;
   private boolean[] H000Q2_n48Handwrtten ;
   private int[] H000Q2_A47Series ;
   private boolean[] H000Q2_n47Series ;
   private short[] H000Q2_A46Instance ;
   private boolean[] H000Q2_n46Instance ;
   private int[] H000Q2_A45Period ;
   private boolean[] H000Q2_n45Period ;
   private int[] H000Q2_A44DocNum ;
   private boolean[] H000Q2_n44DocNum ;
   private int[] H000Q2_A43UVID_CONTROLCHDocEntry ;
   private long[] H000Q3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0030__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV7cDocNum ,
                                          int AV8cPeriod ,
                                          short AV9cInstance ,
                                          int AV10cSeries ,
                                          String AV11cHandwrtten ,
                                          String AV12cCanceled ,
                                          int A44DocNum ,
                                          int A45Period ,
                                          short A46Instance ,
                                          int A47Series ,
                                          String A48Handwrtten ,
                                          String A49Canceled ,
                                          int AV6cUVID_CONTROLCHDocEntry )
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
      sSelectString = " [Status], [LogInst], [Object], [Canceled], [Handwrtten], [Series], [Instance], [Period]," ;
      sSelectString = sSelectString + " [DocNum], [DocEntry]" ;
      sFromString = " FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK)" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE ([DocEntry] >= ?)" ;
      if ( ! (0==AV7cDocNum) )
      {
         sWhereString = sWhereString + " and ([DocNum] >= ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cPeriod) )
      {
         sWhereString = sWhereString + " and ([Period] >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cInstance) )
      {
         sWhereString = sWhereString + " and ([Instance] >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cSeries) )
      {
         sWhereString = sWhereString + " and ([Series] >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cHandwrtten)==0) )
      {
         sWhereString = sWhereString + " and ([Handwrtten] like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cCanceled)==0) )
      {
         sWhereString = sWhereString + " and ([Canceled] like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY [DocEntry]" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT CAST((SELECT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) AS INTEGER) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000Q3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV7cDocNum ,
                                          int AV8cPeriod ,
                                          short AV9cInstance ,
                                          int AV10cSeries ,
                                          String AV11cHandwrtten ,
                                          String AV12cCanceled ,
                                          int A44DocNum ,
                                          int A45Period ,
                                          short A46Instance ,
                                          int A47Series ,
                                          String A48Handwrtten ,
                                          String A49Canceled ,
                                          int AV6cUVID_CONTROLCHDocEntry )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK)" ;
      scmdbuf = scmdbuf + " WHERE ([DocEntry] >= ?)" ;
      if ( ! (0==AV7cDocNum) )
      {
         sWhereString = sWhereString + " and ([DocNum] >= ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cPeriod) )
      {
         sWhereString = sWhereString + " and ([Period] >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cInstance) )
      {
         sWhereString = sWhereString + " and ([Instance] >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cSeries) )
      {
         sWhereString = sWhereString + " and ([Series] >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cHandwrtten)==0) )
      {
         sWhereString = sWhereString + " and ([Handwrtten] like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cCanceled)==0) )
      {
         sWhereString = sWhereString + " and ([Canceled] like ?)" ;
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
                  return conditional_H000Q2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H000Q3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000Q3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10) ;
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
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
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

}

