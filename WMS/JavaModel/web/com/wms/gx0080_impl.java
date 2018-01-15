/*
               File: gx0080_impl
        Description: Selection List UVID CONTROLCD1
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:27.56
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

public final  class gx0080_impl extends GXDataArea
{
   public gx0080_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0080_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0080_impl.class ));
   }

   public gx0080_impl( int remoteHandle ,
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
            AV6cUVID_CONTROLCDDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cLineId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cVisOrder = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cUVID_CONTROLCDObject = httpContext.GetNextPar( ) ;
            AV10cUVID_CONTROLCDLogInst = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11cU_CodAtr = httpContext.GetNextPar( ) ;
            AV12cU_NameAtr = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCDDocEntry, AV7cLineId, AV8cVisOrder, AV9cUVID_CONTROLCDObject, AV10cUVID_CONTROLCDLogInst, AV11cU_CodAtr, AV12cU_NameAtr) ;
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
            AV13pUVID_CONTROLCDDocEntry = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_CONTROLCDDocEntry, 9, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14pLineId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pLineId", GXutil.ltrim( GXutil.str( AV14pLineId, 9, 0)));
            }
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
      pa0Y2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0Y2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210232768");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.gx0080") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUVID_CONTROLCDDocEntry,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pLineId,9,0)))+"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_CONTROLCDDOCENTRY", GXutil.ltrim( localUtil.ntoc( AV6cUVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLINEID", GXutil.ltrim( localUtil.ntoc( AV7cLineId, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCVISORDER", GXutil.ltrim( localUtil.ntoc( AV8cVisOrder, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_CONTROLCDOBJECT", AV9cUVID_CONTROLCDObject);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_CONTROLCDLOGINST", GXutil.ltrim( localUtil.ntoc( AV10cUVID_CONTROLCDLogInst, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCU_CODATR", AV11cU_CodAtr);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCU_NAMEATR", AV12cU_NameAtr);
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPUVID_CONTROLCDDOCENTRY", GXutil.ltrim( localUtil.ntoc( AV13pUVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPLINEID", GXutil.ltrim( localUtil.ntoc( AV14pLineId, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCDDOCENTRYFILTERCONTAINER_Class", GXutil.rtrim( divUvid_controlcddocentryfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "LINEIDFILTERCONTAINER_Class", GXutil.rtrim( divLineidfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "VISORDERFILTERCONTAINER_Class", GXutil.rtrim( divVisorderfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCDOBJECTFILTERCONTAINER_Class", GXutil.rtrim( divUvid_controlcdobjectfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCDLOGINSTFILTERCONTAINER_Class", GXutil.rtrim( divUvid_controlcdloginstfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_CODATRFILTERCONTAINER_Class", GXutil.rtrim( divU_codatrfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_NAMEATRFILTERCONTAINER_Class", GXutil.rtrim( divU_nameatrfiltercontainer_Class));
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
         we0Y2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0Y2( ) ;
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
      return formatLink("com.wms.gx0080") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUVID_CONTROLCDDocEntry,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pLineId,9,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx0080" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List UVID CONTROLCD1" ;
   }

   public void wb0Y0( )
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
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_controlcddocentryfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_controlcddocentryfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_controlcddocentryfilter_Internalname, "UVID_CONTROLCDDoc Entry", "", "", lblLbluvid_controlcddocentryfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110y1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0080.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_controlcddocentry_Internalname, "Doc Entry", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_controlcddocentry_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cUVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtavCuvid_controlcddocentry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cUVID_CONTROLCDDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cUVID_CONTROLCDDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_controlcddocentry_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_controlcddocentry_Visible, edtavCuvid_controlcddocentry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0080.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divLineidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divLineidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbllineidfilter_Internalname, "Line Id", "", "", lblLbllineidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120y1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0080.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavClineid_Internalname, "Line Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavClineid_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cLineId, (byte)(9), (byte)(0), ",", "")), ((edtavClineid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cLineId), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cLineId), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClineid_Jsonclick, 0, "Attribute", "", "", "", edtavClineid_Visible, edtavClineid_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0080.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divVisorderfiltercontainer_Internalname, 1, 0, "px", 0, "px", divVisorderfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblvisorderfilter_Internalname, "Vis Order", "", "", lblLblvisorderfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130y1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0080.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCvisorder_Internalname, "Vis Order", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCvisorder_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cVisOrder, (byte)(9), (byte)(0), ",", "")), ((edtavCvisorder_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cVisOrder), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cVisOrder), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCvisorder_Jsonclick, 0, "Attribute", "", "", "", edtavCvisorder_Visible, edtavCvisorder_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0080.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_controlcdobjectfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_controlcdobjectfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_controlcdobjectfilter_Internalname, "UVID_CONTROLCDObject", "", "", lblLbluvid_controlcdobjectfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140y1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0080.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_controlcdobject_Internalname, "Object", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_controlcdobject_Internalname, AV9cUVID_CONTROLCDObject, GXutil.rtrim( localUtil.format( AV9cUVID_CONTROLCDObject, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_controlcdobject_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_controlcdobject_Visible, edtavCuvid_controlcdobject_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0080.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_controlcdloginstfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_controlcdloginstfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_controlcdloginstfilter_Internalname, "UVID_CONTROLCDLog Inst", "", "", lblLbluvid_controlcdloginstfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150y1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0080.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_controlcdloginst_Internalname, "Log Inst", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_controlcdloginst_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cUVID_CONTROLCDLogInst, (byte)(9), (byte)(0), ",", "")), ((edtavCuvid_controlcdloginst_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cUVID_CONTROLCDLogInst), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cUVID_CONTROLCDLogInst), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_controlcdloginst_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_controlcdloginst_Visible, edtavCuvid_controlcdloginst_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0080.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divU_codatrfiltercontainer_Internalname, 1, 0, "px", 0, "px", divU_codatrfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblu_codatrfilter_Internalname, "U_Cod Atr", "", "", lblLblu_codatrfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160y1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0080.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCu_codatr_Internalname, "U_Cod Atr", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCu_codatr_Internalname, AV11cU_CodAtr, GXutil.rtrim( localUtil.format( AV11cU_CodAtr, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCu_codatr_Jsonclick, 0, "Attribute", "", "", "", edtavCu_codatr_Visible, edtavCu_codatr_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0080.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divU_nameatrfiltercontainer_Internalname, 1, 0, "px", 0, "px", divU_nameatrfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblu_nameatrfilter_Internalname, "U_Name Atr", "", "", lblLblu_nameatrfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e170y1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0080.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCu_nameatr_Internalname, "U_Name Atr", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCu_nameatr_Internalname, AV12cU_NameAtr, GXutil.rtrim( localUtil.format( AV12cU_NameAtr, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCu_nameatr_Jsonclick, 0, "Attribute", "", "", "", edtavCu_nameatr_Visible, edtavCu_nameatr_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0080.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e180y1_client"+"'", TempTags, "", 2, "HLP_Gx0080.htm");
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Line Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Vis Order") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Object") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Log Inst") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Cod Atr") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Cualitat") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Critico") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A41UVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A42LineId, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A106VisOrder, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtVisOrder_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A107UVID_CONTROLCDObject);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A108UVID_CONTROLCDLogInst, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A109U_CodAtr);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A111U_Cualitat));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A112U_Critico));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0080.htm");
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

   public void start0Y2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List UVID CONTROLCD1", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0Y0( ) ;
   }

   public void ws0Y2( )
   {
      start0Y2( ) ;
      evt0Y2( ) ;
   }

   public void evt0Y2( )
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
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A41UVID_CONTROLCDDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCDDocEntry_Internalname), ",", ".")) ;
                           A42LineId = (int)(localUtil.ctol( httpContext.cgiGet( edtLineId_Internalname), ",", ".")) ;
                           A106VisOrder = (int)(localUtil.ctol( httpContext.cgiGet( edtVisOrder_Internalname), ",", ".")) ;
                           A107UVID_CONTROLCDObject = httpContext.cgiGet( edtUVID_CONTROLCDObject_Internalname) ;
                           A108UVID_CONTROLCDLogInst = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCDLogInst_Internalname), ",", ".")) ;
                           A109U_CodAtr = httpContext.cgiGet( edtU_CodAtr_Internalname) ;
                           A111U_Cualitat = httpContext.cgiGet( edtU_Cualitat_Internalname) ;
                           A112U_Critico = httpContext.cgiGet( edtU_Critico_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e190Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e200Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cuvid_controlcddocentry Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_CONTROLCDDOCENTRY"), ",", ".") != AV6cUVID_CONTROLCDDocEntry )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clineid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLINEID"), ",", ".") != AV7cLineId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cvisorder Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCVISORDER"), ",", ".") != AV8cVisOrder )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_controlcdobject Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUVID_CONTROLCDOBJECT"), AV9cUVID_CONTROLCDObject) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_controlcdloginst Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_CONTROLCDLOGINST"), ",", ".") != AV10cUVID_CONTROLCDLogInst )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cu_codatr Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_CODATR"), AV11cU_CodAtr) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cu_nameatr Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_NAMEATR"), AV12cU_NameAtr) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e210Y2 ();
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

   public void we0Y2( )
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

   public void pa0Y2( )
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
                                  int AV6cUVID_CONTROLCDDocEntry ,
                                  int AV7cLineId ,
                                  int AV8cVisOrder ,
                                  String AV9cUVID_CONTROLCDObject ,
                                  int AV10cUVID_CONTROLCDLogInst ,
                                  String AV11cU_CodAtr ,
                                  String AV12cU_NameAtr )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0Y2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCDDOCENTRY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A41UVID_CONTROLCDDocEntry), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCDDOCENTRY", GXutil.ltrim( localUtil.ntoc( A41UVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_LINEID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A42LineId), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "LINEID", GXutil.ltrim( localUtil.ntoc( A42LineId, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_VISORDER", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A106VisOrder), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "VISORDER", GXutil.ltrim( localUtil.ntoc( A106VisOrder, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCDOBJECT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A107UVID_CONTROLCDObject, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCDOBJECT", A107UVID_CONTROLCDObject);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCDLOGINST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A108UVID_CONTROLCDLogInst), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCDLOGINST", GXutil.ltrim( localUtil.ntoc( A108UVID_CONTROLCDLogInst, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CODATR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A109U_CodAtr, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_CODATR", A109U_CodAtr);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CUALITAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A111U_Cualitat, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_CUALITAT", GXutil.rtrim( A111U_Cualitat));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CRITICO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A112U_Critico, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_CRITICO", GXutil.rtrim( A112U_Critico));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0Y2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0Y2( )
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
                                              new Integer(AV8cVisOrder) ,
                                              AV9cUVID_CONTROLCDObject ,
                                              new Integer(AV10cUVID_CONTROLCDLogInst) ,
                                              AV11cU_CodAtr ,
                                              AV12cU_NameAtr ,
                                              new Integer(A106VisOrder) ,
                                              A107UVID_CONTROLCDObject ,
                                              new Integer(A108UVID_CONTROLCDLogInst) ,
                                              A109U_CodAtr ,
                                              A110U_NameAtr ,
                                              new Integer(AV6cUVID_CONTROLCDDocEntry) ,
                                              new Integer(AV7cLineId) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT
                                              }
         } ) ;
         lV9cUVID_CONTROLCDObject = GXutil.concat( GXutil.rtrim( AV9cUVID_CONTROLCDObject), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cUVID_CONTROLCDObject", AV9cUVID_CONTROLCDObject);
         lV11cU_CodAtr = GXutil.concat( GXutil.rtrim( AV11cU_CodAtr), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cU_CodAtr", AV11cU_CodAtr);
         lV12cU_NameAtr = GXutil.concat( GXutil.rtrim( AV12cU_NameAtr), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cU_NameAtr", AV12cU_NameAtr);
         /* Using cursor H000Y2 */
         pr_fusquim_sap.execute(0, new Object[] {new Integer(AV6cUVID_CONTROLCDDocEntry), new Integer(AV7cLineId), new Integer(AV8cVisOrder), lV9cUVID_CONTROLCDObject, new Integer(AV10cUVID_CONTROLCDLogInst), lV11cU_CodAtr, lV12cU_NameAtr, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_fusquim_sap.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A110U_NameAtr = H000Y2_A110U_NameAtr[0] ;
            A112U_Critico = H000Y2_A112U_Critico[0] ;
            A111U_Cualitat = H000Y2_A111U_Cualitat[0] ;
            A109U_CodAtr = H000Y2_A109U_CodAtr[0] ;
            A108UVID_CONTROLCDLogInst = H000Y2_A108UVID_CONTROLCDLogInst[0] ;
            A107UVID_CONTROLCDObject = H000Y2_A107UVID_CONTROLCDObject[0] ;
            A106VisOrder = H000Y2_A106VisOrder[0] ;
            A42LineId = H000Y2_A42LineId[0] ;
            A41UVID_CONTROLCDDocEntry = H000Y2_A41UVID_CONTROLCDDocEntry[0] ;
            /* Execute user event: Load */
            e200Y2 ();
            pr_fusquim_sap.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_fusquim_sap.getStatus(0) == 101) ? 1 : 0)) ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_fusquim_sap.close(0);
         wbEnd = (short)(84) ;
         wb0Y0( ) ;
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
                                           new Integer(AV8cVisOrder) ,
                                           AV9cUVID_CONTROLCDObject ,
                                           new Integer(AV10cUVID_CONTROLCDLogInst) ,
                                           AV11cU_CodAtr ,
                                           AV12cU_NameAtr ,
                                           new Integer(A106VisOrder) ,
                                           A107UVID_CONTROLCDObject ,
                                           new Integer(A108UVID_CONTROLCDLogInst) ,
                                           A109U_CodAtr ,
                                           A110U_NameAtr ,
                                           new Integer(AV6cUVID_CONTROLCDDocEntry) ,
                                           new Integer(AV7cLineId) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT
                                           }
      } ) ;
      lV9cUVID_CONTROLCDObject = GXutil.concat( GXutil.rtrim( AV9cUVID_CONTROLCDObject), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cUVID_CONTROLCDObject", AV9cUVID_CONTROLCDObject);
      lV11cU_CodAtr = GXutil.concat( GXutil.rtrim( AV11cU_CodAtr), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cU_CodAtr", AV11cU_CodAtr);
      lV12cU_NameAtr = GXutil.concat( GXutil.rtrim( AV12cU_NameAtr), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cU_NameAtr", AV12cU_NameAtr);
      /* Using cursor H000Y3 */
      pr_fusquim_sap.execute(1, new Object[] {new Integer(AV6cUVID_CONTROLCDDocEntry), new Integer(AV7cLineId), new Integer(AV8cVisOrder), lV9cUVID_CONTROLCDObject, new Integer(AV10cUVID_CONTROLCDLogInst), lV11cU_CodAtr, lV12cU_NameAtr});
      GRID1_nRecordCount = H000Y3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCDDocEntry, AV7cLineId, AV8cVisOrder, AV9cUVID_CONTROLCDObject, AV10cUVID_CONTROLCDLogInst, AV11cU_CodAtr, AV12cU_NameAtr) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCDDocEntry, AV7cLineId, AV8cVisOrder, AV9cUVID_CONTROLCDObject, AV10cUVID_CONTROLCDLogInst, AV11cU_CodAtr, AV12cU_NameAtr) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCDDocEntry, AV7cLineId, AV8cVisOrder, AV9cUVID_CONTROLCDObject, AV10cUVID_CONTROLCDLogInst, AV11cU_CodAtr, AV12cU_NameAtr) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCDDocEntry, AV7cLineId, AV8cVisOrder, AV9cUVID_CONTROLCDObject, AV10cUVID_CONTROLCDLogInst, AV11cU_CodAtr, AV12cU_NameAtr) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_CONTROLCDDocEntry, AV7cLineId, AV8cVisOrder, AV9cUVID_CONTROLCDObject, AV10cUVID_CONTROLCDLogInst, AV11cU_CodAtr, AV12cU_NameAtr) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0Y0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e190Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_controlcddocentry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_controlcddocentry_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUVID_CONTROLCDDOCENTRY");
            GX_FocusControl = edtavCuvid_controlcddocentry_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cUVID_CONTROLCDDocEntry = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cUVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( AV6cUVID_CONTROLCDDocEntry, 9, 0)));
         }
         else
         {
            AV6cUVID_CONTROLCDDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtavCuvid_controlcddocentry_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cUVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( AV6cUVID_CONTROLCDDocEntry, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClineid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClineid_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLINEID");
            GX_FocusControl = edtavClineid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cLineId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cLineId", GXutil.ltrim( GXutil.str( AV7cLineId, 9, 0)));
         }
         else
         {
            AV7cLineId = (int)(localUtil.ctol( httpContext.cgiGet( edtavClineid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cLineId", GXutil.ltrim( GXutil.str( AV7cLineId, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCvisorder_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCvisorder_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCVISORDER");
            GX_FocusControl = edtavCvisorder_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cVisOrder = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cVisOrder", GXutil.ltrim( GXutil.str( AV8cVisOrder, 9, 0)));
         }
         else
         {
            AV8cVisOrder = (int)(localUtil.ctol( httpContext.cgiGet( edtavCvisorder_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cVisOrder", GXutil.ltrim( GXutil.str( AV8cVisOrder, 9, 0)));
         }
         AV9cUVID_CONTROLCDObject = httpContext.cgiGet( edtavCuvid_controlcdobject_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cUVID_CONTROLCDObject", AV9cUVID_CONTROLCDObject);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_controlcdloginst_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_controlcdloginst_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUVID_CONTROLCDLOGINST");
            GX_FocusControl = edtavCuvid_controlcdloginst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cUVID_CONTROLCDLogInst = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cUVID_CONTROLCDLogInst", GXutil.ltrim( GXutil.str( AV10cUVID_CONTROLCDLogInst, 9, 0)));
         }
         else
         {
            AV10cUVID_CONTROLCDLogInst = (int)(localUtil.ctol( httpContext.cgiGet( edtavCuvid_controlcdloginst_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cUVID_CONTROLCDLogInst", GXutil.ltrim( GXutil.str( AV10cUVID_CONTROLCDLogInst, 9, 0)));
         }
         AV11cU_CodAtr = httpContext.cgiGet( edtavCu_codatr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cU_CodAtr", AV11cU_CodAtr);
         AV12cU_NameAtr = httpContext.cgiGet( edtavCu_nameatr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cU_NameAtr", AV12cU_NameAtr);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_CONTROLCDDOCENTRY"), ",", ".") != AV6cUVID_CONTROLCDDocEntry )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLINEID"), ",", ".") != AV7cLineId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCVISORDER"), ",", ".") != AV8cVisOrder )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUVID_CONTROLCDOBJECT"), AV9cUVID_CONTROLCDObject) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_CONTROLCDLOGINST"), ",", ".") != AV10cUVID_CONTROLCDLogInst )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_CODATR"), AV11cU_CodAtr) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_NAMEATR"), AV12cU_NameAtr) != 0 )
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
      e190Y2 ();
      if (returnInSub) return;
   }

   public void e190Y2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "UVID CONTROLCD1", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV15ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e200Y2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV18Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
      e210Y2 ();
      if (returnInSub) return;
   }

   public void e210Y2( )
   {
      /* Enter Routine */
      AV13pUVID_CONTROLCDDocEntry = A41UVID_CONTROLCDDocEntry ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_CONTROLCDDocEntry, 9, 0)));
      AV14pLineId = A42LineId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pLineId", GXutil.ltrim( GXutil.str( AV14pLineId, 9, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pUVID_CONTROLCDDocEntry),new Integer(AV14pLineId)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pUVID_CONTROLCDDocEntry = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_CONTROLCDDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_CONTROLCDDocEntry, 9, 0)));
      AV14pLineId = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pLineId", GXutil.ltrim( GXutil.str( AV14pLineId, 9, 0)));
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
      pa0Y2( ) ;
      ws0Y2( ) ;
      we0Y2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1022385");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210232998");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gx0080.js", "?201811210232998");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtUVID_CONTROLCDDocEntry_Internalname = "UVID_CONTROLCDDOCENTRY_"+sGXsfl_84_idx ;
      edtLineId_Internalname = "LINEID_"+sGXsfl_84_idx ;
      edtVisOrder_Internalname = "VISORDER_"+sGXsfl_84_idx ;
      edtUVID_CONTROLCDObject_Internalname = "UVID_CONTROLCDOBJECT_"+sGXsfl_84_idx ;
      edtUVID_CONTROLCDLogInst_Internalname = "UVID_CONTROLCDLOGINST_"+sGXsfl_84_idx ;
      edtU_CodAtr_Internalname = "U_CODATR_"+sGXsfl_84_idx ;
      edtU_Cualitat_Internalname = "U_CUALITAT_"+sGXsfl_84_idx ;
      edtU_Critico_Internalname = "U_CRITICO_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtUVID_CONTROLCDDocEntry_Internalname = "UVID_CONTROLCDDOCENTRY_"+sGXsfl_84_fel_idx ;
      edtLineId_Internalname = "LINEID_"+sGXsfl_84_fel_idx ;
      edtVisOrder_Internalname = "VISORDER_"+sGXsfl_84_fel_idx ;
      edtUVID_CONTROLCDObject_Internalname = "UVID_CONTROLCDOBJECT_"+sGXsfl_84_fel_idx ;
      edtUVID_CONTROLCDLogInst_Internalname = "UVID_CONTROLCDLOGINST_"+sGXsfl_84_fel_idx ;
      edtU_CodAtr_Internalname = "U_CODATR_"+sGXsfl_84_fel_idx ;
      edtU_Cualitat_Internalname = "U_CUALITAT_"+sGXsfl_84_fel_idx ;
      edtU_Critico_Internalname = "U_CRITICO_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb0Y0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A41UVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A42LineId, (byte)(9), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV18Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_CONTROLCDDocEntry_Internalname,GXutil.ltrim( localUtil.ntoc( A41UVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A41UVID_CONTROLCDDocEntry), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_CONTROLCDDocEntry_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLineId_Internalname,GXutil.ltrim( localUtil.ntoc( A42LineId, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A42LineId), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLineId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtVisOrder_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A41UVID_CONTROLCDDocEntry, (byte)(9), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A42LineId, (byte)(9), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtVisOrder_Internalname, "Link", edtVisOrder_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVisOrder_Internalname,GXutil.ltrim( localUtil.ntoc( A106VisOrder, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A106VisOrder), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtVisOrder_Link,"","","",edtVisOrder_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_CONTROLCDObject_Internalname,A107UVID_CONTROLCDObject,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_CONTROLCDObject_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_CONTROLCDLogInst_Internalname,GXutil.ltrim( localUtil.ntoc( A108UVID_CONTROLCDLogInst, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A108UVID_CONTROLCDLogInst), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_CONTROLCDLogInst_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_CodAtr_Internalname,A109U_CodAtr,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_CodAtr_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_Cualitat_Internalname,GXutil.rtrim( A111U_Cualitat),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_Cualitat_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_Critico_Internalname,GXutil.rtrim( A112U_Critico),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_Critico_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCDDOCENTRY"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A41UVID_CONTROLCDDocEntry), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_LINEID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A42LineId), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_VISORDER"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A106VisOrder), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCDOBJECT"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A107UVID_CONTROLCDObject, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCDLOGINST"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A108UVID_CONTROLCDLogInst), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CODATR"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A109U_CodAtr, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CUALITAT"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A111U_Cualitat, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CRITICO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A112U_Critico, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLbluvid_controlcddocentryfilter_Internalname = "LBLUVID_CONTROLCDDOCENTRYFILTER" ;
      edtavCuvid_controlcddocentry_Internalname = "vCUVID_CONTROLCDDOCENTRY" ;
      divUvid_controlcddocentryfiltercontainer_Internalname = "UVID_CONTROLCDDOCENTRYFILTERCONTAINER" ;
      lblLbllineidfilter_Internalname = "LBLLINEIDFILTER" ;
      edtavClineid_Internalname = "vCLINEID" ;
      divLineidfiltercontainer_Internalname = "LINEIDFILTERCONTAINER" ;
      lblLblvisorderfilter_Internalname = "LBLVISORDERFILTER" ;
      edtavCvisorder_Internalname = "vCVISORDER" ;
      divVisorderfiltercontainer_Internalname = "VISORDERFILTERCONTAINER" ;
      lblLbluvid_controlcdobjectfilter_Internalname = "LBLUVID_CONTROLCDOBJECTFILTER" ;
      edtavCuvid_controlcdobject_Internalname = "vCUVID_CONTROLCDOBJECT" ;
      divUvid_controlcdobjectfiltercontainer_Internalname = "UVID_CONTROLCDOBJECTFILTERCONTAINER" ;
      lblLbluvid_controlcdloginstfilter_Internalname = "LBLUVID_CONTROLCDLOGINSTFILTER" ;
      edtavCuvid_controlcdloginst_Internalname = "vCUVID_CONTROLCDLOGINST" ;
      divUvid_controlcdloginstfiltercontainer_Internalname = "UVID_CONTROLCDLOGINSTFILTERCONTAINER" ;
      lblLblu_codatrfilter_Internalname = "LBLU_CODATRFILTER" ;
      edtavCu_codatr_Internalname = "vCU_CODATR" ;
      divU_codatrfiltercontainer_Internalname = "U_CODATRFILTERCONTAINER" ;
      lblLblu_nameatrfilter_Internalname = "LBLU_NAMEATRFILTER" ;
      edtavCu_nameatr_Internalname = "vCU_NAMEATR" ;
      divU_nameatrfiltercontainer_Internalname = "U_NAMEATRFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtUVID_CONTROLCDDocEntry_Internalname = "UVID_CONTROLCDDOCENTRY" ;
      edtLineId_Internalname = "LINEID" ;
      edtVisOrder_Internalname = "VISORDER" ;
      edtUVID_CONTROLCDObject_Internalname = "UVID_CONTROLCDOBJECT" ;
      edtUVID_CONTROLCDLogInst_Internalname = "UVID_CONTROLCDLOGINST" ;
      edtU_CodAtr_Internalname = "U_CODATR" ;
      edtU_Cualitat_Internalname = "U_CUALITAT" ;
      edtU_Critico_Internalname = "U_CRITICO" ;
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
      edtU_Critico_Jsonclick = "" ;
      edtU_Cualitat_Jsonclick = "" ;
      edtU_CodAtr_Jsonclick = "" ;
      edtUVID_CONTROLCDLogInst_Jsonclick = "" ;
      edtUVID_CONTROLCDObject_Jsonclick = "" ;
      edtVisOrder_Jsonclick = "" ;
      edtLineId_Jsonclick = "" ;
      edtUVID_CONTROLCDDocEntry_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtVisOrder_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCu_nameatr_Jsonclick = "" ;
      edtavCu_nameatr_Enabled = 1 ;
      edtavCu_nameatr_Visible = 1 ;
      edtavCu_codatr_Jsonclick = "" ;
      edtavCu_codatr_Enabled = 1 ;
      edtavCu_codatr_Visible = 1 ;
      edtavCuvid_controlcdloginst_Jsonclick = "" ;
      edtavCuvid_controlcdloginst_Enabled = 1 ;
      edtavCuvid_controlcdloginst_Visible = 1 ;
      edtavCuvid_controlcdobject_Jsonclick = "" ;
      edtavCuvid_controlcdobject_Enabled = 1 ;
      edtavCuvid_controlcdobject_Visible = 1 ;
      edtavCvisorder_Jsonclick = "" ;
      edtavCvisorder_Enabled = 1 ;
      edtavCvisorder_Visible = 1 ;
      edtavClineid_Jsonclick = "" ;
      edtavClineid_Enabled = 1 ;
      edtavClineid_Visible = 1 ;
      edtavCuvid_controlcddocentry_Jsonclick = "" ;
      edtavCuvid_controlcddocentry_Enabled = 1 ;
      edtavCuvid_controlcddocentry_Visible = 1 ;
      divU_nameatrfiltercontainer_Class = "AdvancedContainerItem" ;
      divU_codatrfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_controlcdloginstfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_controlcdobjectfiltercontainer_Class = "AdvancedContainerItem" ;
      divVisorderfiltercontainer_Class = "AdvancedContainerItem" ;
      divLineidfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_controlcddocentryfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List UVID CONTROLCD1" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_CONTROLCDDocEntry',fld:'vCUVID_CONTROLCDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cLineId',fld:'vCLINEID',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cVisOrder',fld:'vCVISORDER',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_CONTROLCDObject',fld:'vCUVID_CONTROLCDOBJECT',pic:'',nv:''},{av:'AV10cUVID_CONTROLCDLogInst',fld:'vCUVID_CONTROLCDLOGINST',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cU_CodAtr',fld:'vCU_CODATR',pic:'',nv:''},{av:'AV12cU_NameAtr',fld:'vCU_NAMEATR',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e180Y1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLUVID_CONTROLCDDOCENTRYFILTER.CLICK","{handler:'e110Y1',iparms:[{av:'divUvid_controlcddocentryfiltercontainer_Class',ctrl:'UVID_CONTROLCDDOCENTRYFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_controlcddocentryfiltercontainer_Class',ctrl:'UVID_CONTROLCDDOCENTRYFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_controlcddocentry_Visible',ctrl:'vCUVID_CONTROLCDDOCENTRY',prop:'Visible'}]}");
      setEventMetadata("LBLLINEIDFILTER.CLICK","{handler:'e120Y1',iparms:[{av:'divLineidfiltercontainer_Class',ctrl:'LINEIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divLineidfiltercontainer_Class',ctrl:'LINEIDFILTERCONTAINER',prop:'Class'},{av:'edtavClineid_Visible',ctrl:'vCLINEID',prop:'Visible'}]}");
      setEventMetadata("LBLVISORDERFILTER.CLICK","{handler:'e130Y1',iparms:[{av:'divVisorderfiltercontainer_Class',ctrl:'VISORDERFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divVisorderfiltercontainer_Class',ctrl:'VISORDERFILTERCONTAINER',prop:'Class'},{av:'edtavCvisorder_Visible',ctrl:'vCVISORDER',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_CONTROLCDOBJECTFILTER.CLICK","{handler:'e140Y1',iparms:[{av:'divUvid_controlcdobjectfiltercontainer_Class',ctrl:'UVID_CONTROLCDOBJECTFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_controlcdobjectfiltercontainer_Class',ctrl:'UVID_CONTROLCDOBJECTFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_controlcdobject_Visible',ctrl:'vCUVID_CONTROLCDOBJECT',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_CONTROLCDLOGINSTFILTER.CLICK","{handler:'e150Y1',iparms:[{av:'divUvid_controlcdloginstfiltercontainer_Class',ctrl:'UVID_CONTROLCDLOGINSTFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_controlcdloginstfiltercontainer_Class',ctrl:'UVID_CONTROLCDLOGINSTFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_controlcdloginst_Visible',ctrl:'vCUVID_CONTROLCDLOGINST',prop:'Visible'}]}");
      setEventMetadata("LBLU_CODATRFILTER.CLICK","{handler:'e160Y1',iparms:[{av:'divU_codatrfiltercontainer_Class',ctrl:'U_CODATRFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divU_codatrfiltercontainer_Class',ctrl:'U_CODATRFILTERCONTAINER',prop:'Class'},{av:'edtavCu_codatr_Visible',ctrl:'vCU_CODATR',prop:'Visible'}]}");
      setEventMetadata("LBLU_NAMEATRFILTER.CLICK","{handler:'e170Y1',iparms:[{av:'divU_nameatrfiltercontainer_Class',ctrl:'U_NAMEATRFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divU_nameatrfiltercontainer_Class',ctrl:'U_NAMEATRFILTERCONTAINER',prop:'Class'},{av:'edtavCu_nameatr_Visible',ctrl:'vCU_NAMEATR',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e210Y2',iparms:[{av:'A41UVID_CONTROLCDDocEntry',fld:'UVID_CONTROLCDDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0},{av:'A42LineId',fld:'LINEID',pic:'ZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pUVID_CONTROLCDDocEntry',fld:'vPUVID_CONTROLCDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV14pLineId',fld:'vPLINEID',pic:'ZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_CONTROLCDDocEntry',fld:'vCUVID_CONTROLCDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cLineId',fld:'vCLINEID',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cVisOrder',fld:'vCVISORDER',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_CONTROLCDObject',fld:'vCUVID_CONTROLCDOBJECT',pic:'',nv:''},{av:'AV10cUVID_CONTROLCDLogInst',fld:'vCUVID_CONTROLCDLOGINST',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cU_CodAtr',fld:'vCU_CODATR',pic:'',nv:''},{av:'AV12cU_NameAtr',fld:'vCU_NAMEATR',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_CONTROLCDDocEntry',fld:'vCUVID_CONTROLCDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cLineId',fld:'vCLINEID',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cVisOrder',fld:'vCVISORDER',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_CONTROLCDObject',fld:'vCUVID_CONTROLCDOBJECT',pic:'',nv:''},{av:'AV10cUVID_CONTROLCDLogInst',fld:'vCUVID_CONTROLCDLOGINST',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cU_CodAtr',fld:'vCU_CODATR',pic:'',nv:''},{av:'AV12cU_NameAtr',fld:'vCU_NAMEATR',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_CONTROLCDDocEntry',fld:'vCUVID_CONTROLCDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cLineId',fld:'vCLINEID',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cVisOrder',fld:'vCVISORDER',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_CONTROLCDObject',fld:'vCUVID_CONTROLCDOBJECT',pic:'',nv:''},{av:'AV10cUVID_CONTROLCDLogInst',fld:'vCUVID_CONTROLCDLOGINST',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cU_CodAtr',fld:'vCU_CODATR',pic:'',nv:''},{av:'AV12cU_NameAtr',fld:'vCU_NAMEATR',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_CONTROLCDDocEntry',fld:'vCUVID_CONTROLCDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cLineId',fld:'vCLINEID',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cVisOrder',fld:'vCVISORDER',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_CONTROLCDObject',fld:'vCUVID_CONTROLCDOBJECT',pic:'',nv:''},{av:'AV10cUVID_CONTROLCDLogInst',fld:'vCUVID_CONTROLCDLOGINST',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cU_CodAtr',fld:'vCU_CODATR',pic:'',nv:''},{av:'AV12cU_NameAtr',fld:'vCU_NAMEATR',pic:'',nv:''}],oparms:[]}");
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
      AV9cUVID_CONTROLCDObject = "" ;
      AV11cU_CodAtr = "" ;
      AV12cU_NameAtr = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbluvid_controlcddocentryfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbllineidfilter_Jsonclick = "" ;
      lblLblvisorderfilter_Jsonclick = "" ;
      lblLbluvid_controlcdobjectfilter_Jsonclick = "" ;
      lblLbluvid_controlcdloginstfilter_Jsonclick = "" ;
      lblLblu_codatrfilter_Jsonclick = "" ;
      lblLblu_nameatrfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A107UVID_CONTROLCDObject = "" ;
      A109U_CodAtr = "" ;
      A111U_Cualitat = "" ;
      A112U_Critico = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Linkselection_GXI = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV9cUVID_CONTROLCDObject = "" ;
      lV11cU_CodAtr = "" ;
      lV12cU_NameAtr = "" ;
      A110U_NameAtr = "" ;
      H000Y2_A110U_NameAtr = new String[] {""} ;
      H000Y2_A112U_Critico = new String[] {""} ;
      H000Y2_A111U_Cualitat = new String[] {""} ;
      H000Y2_A109U_CodAtr = new String[] {""} ;
      H000Y2_A108UVID_CONTROLCDLogInst = new int[1] ;
      H000Y2_A107UVID_CONTROLCDObject = new String[] {""} ;
      H000Y2_A106VisOrder = new int[1] ;
      H000Y2_A42LineId = new int[1] ;
      H000Y2_A41UVID_CONTROLCDDocEntry = new int[1] ;
      H000Y3_AGRID1_nRecordCount = new long[1] ;
      AV15ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.gx0080__fusquim_sap(),
         new Object[] {
             new Object[] {
            H000Y2_A110U_NameAtr, H000Y2_A112U_Critico, H000Y2_A111U_Cualitat, H000Y2_A109U_CodAtr, H000Y2_A108UVID_CONTROLCDLogInst, H000Y2_A107UVID_CONTROLCDObject, H000Y2_A106VisOrder, H000Y2_A42LineId, H000Y2_A41UVID_CONTROLCDDocEntry
            }
            , new Object[] {
            H000Y3_AGRID1_nRecordCount
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
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int AV6cUVID_CONTROLCDDocEntry ;
   private int AV7cLineId ;
   private int AV8cVisOrder ;
   private int AV10cUVID_CONTROLCDLogInst ;
   private int AV13pUVID_CONTROLCDDocEntry ;
   private int AV14pLineId ;
   private int edtavCuvid_controlcddocentry_Enabled ;
   private int edtavCuvid_controlcddocentry_Visible ;
   private int edtavClineid_Enabled ;
   private int edtavClineid_Visible ;
   private int edtavCvisorder_Enabled ;
   private int edtavCvisorder_Visible ;
   private int edtavCuvid_controlcdobject_Visible ;
   private int edtavCuvid_controlcdobject_Enabled ;
   private int edtavCuvid_controlcdloginst_Enabled ;
   private int edtavCuvid_controlcdloginst_Visible ;
   private int edtavCu_codatr_Visible ;
   private int edtavCu_codatr_Enabled ;
   private int edtavCu_nameatr_Visible ;
   private int edtavCu_nameatr_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A41UVID_CONTROLCDDocEntry ;
   private int A42LineId ;
   private int A106VisOrder ;
   private int A108UVID_CONTROLCDLogInst ;
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
   private String divUvid_controlcddocentryfiltercontainer_Class ;
   private String divLineidfiltercontainer_Class ;
   private String divVisorderfiltercontainer_Class ;
   private String divUvid_controlcdobjectfiltercontainer_Class ;
   private String divUvid_controlcdloginstfiltercontainer_Class ;
   private String divU_codatrfiltercontainer_Class ;
   private String divU_nameatrfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divUvid_controlcddocentryfiltercontainer_Internalname ;
   private String lblLbluvid_controlcddocentryfilter_Internalname ;
   private String lblLbluvid_controlcddocentryfilter_Jsonclick ;
   private String edtavCuvid_controlcddocentry_Internalname ;
   private String TempTags ;
   private String edtavCuvid_controlcddocentry_Jsonclick ;
   private String divLineidfiltercontainer_Internalname ;
   private String lblLbllineidfilter_Internalname ;
   private String lblLbllineidfilter_Jsonclick ;
   private String edtavClineid_Internalname ;
   private String edtavClineid_Jsonclick ;
   private String divVisorderfiltercontainer_Internalname ;
   private String lblLblvisorderfilter_Internalname ;
   private String lblLblvisorderfilter_Jsonclick ;
   private String edtavCvisorder_Internalname ;
   private String edtavCvisorder_Jsonclick ;
   private String divUvid_controlcdobjectfiltercontainer_Internalname ;
   private String lblLbluvid_controlcdobjectfilter_Internalname ;
   private String lblLbluvid_controlcdobjectfilter_Jsonclick ;
   private String edtavCuvid_controlcdobject_Internalname ;
   private String edtavCuvid_controlcdobject_Jsonclick ;
   private String divUvid_controlcdloginstfiltercontainer_Internalname ;
   private String lblLbluvid_controlcdloginstfilter_Internalname ;
   private String lblLbluvid_controlcdloginstfilter_Jsonclick ;
   private String edtavCuvid_controlcdloginst_Internalname ;
   private String edtavCuvid_controlcdloginst_Jsonclick ;
   private String divU_codatrfiltercontainer_Internalname ;
   private String lblLblu_codatrfilter_Internalname ;
   private String lblLblu_codatrfilter_Jsonclick ;
   private String edtavCu_codatr_Internalname ;
   private String edtavCu_codatr_Jsonclick ;
   private String divU_nameatrfiltercontainer_Internalname ;
   private String lblLblu_nameatrfilter_Internalname ;
   private String lblLblu_nameatrfilter_Jsonclick ;
   private String edtavCu_nameatr_Internalname ;
   private String edtavCu_nameatr_Jsonclick ;
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
   private String edtVisOrder_Link ;
   private String A111U_Cualitat ;
   private String A112U_Critico ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtUVID_CONTROLCDDocEntry_Internalname ;
   private String edtLineId_Internalname ;
   private String edtVisOrder_Internalname ;
   private String edtUVID_CONTROLCDObject_Internalname ;
   private String edtUVID_CONTROLCDLogInst_Internalname ;
   private String edtU_CodAtr_Internalname ;
   private String edtU_Cualitat_Internalname ;
   private String edtU_Critico_Internalname ;
   private String scmdbuf ;
   private String AV15ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtUVID_CONTROLCDDocEntry_Jsonclick ;
   private String edtLineId_Jsonclick ;
   private String edtVisOrder_Jsonclick ;
   private String edtUVID_CONTROLCDObject_Jsonclick ;
   private String edtUVID_CONTROLCDLogInst_Jsonclick ;
   private String edtU_CodAtr_Jsonclick ;
   private String edtU_Cualitat_Jsonclick ;
   private String edtU_Critico_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV9cUVID_CONTROLCDObject ;
   private String AV11cU_CodAtr ;
   private String AV12cU_NameAtr ;
   private String A107UVID_CONTROLCDObject ;
   private String A109U_CodAtr ;
   private String AV18Linkselection_GXI ;
   private String lV9cUVID_CONTROLCDObject ;
   private String lV11cU_CodAtr ;
   private String lV12cU_NameAtr ;
   private String A110U_NameAtr ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_fusquim_sap ;
   private String[] H000Y2_A110U_NameAtr ;
   private String[] H000Y2_A112U_Critico ;
   private String[] H000Y2_A111U_Cualitat ;
   private String[] H000Y2_A109U_CodAtr ;
   private int[] H000Y2_A108UVID_CONTROLCDLogInst ;
   private String[] H000Y2_A107UVID_CONTROLCDObject ;
   private int[] H000Y2_A106VisOrder ;
   private int[] H000Y2_A42LineId ;
   private int[] H000Y2_A41UVID_CONTROLCDDocEntry ;
   private long[] H000Y3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0080__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV8cVisOrder ,
                                          String AV9cUVID_CONTROLCDObject ,
                                          int AV10cUVID_CONTROLCDLogInst ,
                                          String AV11cU_CodAtr ,
                                          String AV12cU_NameAtr ,
                                          int A106VisOrder ,
                                          String A107UVID_CONTROLCDObject ,
                                          int A108UVID_CONTROLCDLogInst ,
                                          String A109U_CodAtr ,
                                          String A110U_NameAtr ,
                                          int AV6cUVID_CONTROLCDDocEntry ,
                                          int AV7cLineId )
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
      sSelectString = " [U_NameAtr], [U_Critico], [U_Cualitat], [U_CodAtr], [LogInst], [Object], [VisOrder]," ;
      sSelectString = sSelectString + " [LineId], [DocEntry]" ;
      sFromString = " FROM dbo.[@VID_CONTROLCD] WITH (NOLOCK)" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE ([DocEntry] >= ? and [LineId] >= ?)" ;
      if ( ! (0==AV8cVisOrder) )
      {
         sWhereString = sWhereString + " and ([VisOrder] >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cUVID_CONTROLCDObject)==0) )
      {
         sWhereString = sWhereString + " and ([Object] like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cUVID_CONTROLCDLogInst) )
      {
         sWhereString = sWhereString + " and ([LogInst] >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cU_CodAtr)==0) )
      {
         sWhereString = sWhereString + " and ([U_CodAtr] like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cU_NameAtr)==0) )
      {
         sWhereString = sWhereString + " and ([U_NameAtr] like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY [DocEntry], [LineId]" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT CAST((SELECT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) AS INTEGER) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000Y3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV8cVisOrder ,
                                          String AV9cUVID_CONTROLCDObject ,
                                          int AV10cUVID_CONTROLCDLogInst ,
                                          String AV11cU_CodAtr ,
                                          String AV12cU_NameAtr ,
                                          int A106VisOrder ,
                                          String A107UVID_CONTROLCDObject ,
                                          int A108UVID_CONTROLCDLogInst ,
                                          String A109U_CodAtr ,
                                          String A110U_NameAtr ,
                                          int AV6cUVID_CONTROLCDDocEntry ,
                                          int AV7cLineId )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM dbo.[@VID_CONTROLCD] WITH (NOLOCK)" ;
      scmdbuf = scmdbuf + " WHERE ([DocEntry] >= ? and [LineId] >= ?)" ;
      if ( ! (0==AV8cVisOrder) )
      {
         sWhereString = sWhereString + " and ([VisOrder] >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cUVID_CONTROLCDObject)==0) )
      {
         sWhereString = sWhereString + " and ([Object] like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cUVID_CONTROLCDLogInst) )
      {
         sWhereString = sWhereString + " and ([LogInst] >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cU_CodAtr)==0) )
      {
         sWhereString = sWhereString + " and ([U_CodAtr] like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cU_NameAtr)==0) )
      {
         sWhereString = sWhereString + " and ([U_NameAtr] like ?)" ;
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
                  return conditional_H000Y2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() );
            case 1 :
                  return conditional_H000Y3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000Y3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
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
                  stmt.setVarchar(sIdx, (String)parms[13], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 50);
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
                  stmt.setVarchar(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 50);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

