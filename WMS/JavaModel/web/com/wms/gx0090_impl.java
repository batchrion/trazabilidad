/*
               File: gx0090_impl
        Description: Selection List UVID_ATRCONTARTD
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:23.78
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

public final  class gx0090_impl extends GXDataArea
{
   public gx0090_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0090_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0090_impl.class ));
   }

   public gx0090_impl( int remoteHandle ,
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
            AV6cUVID_ATRCONTARTDDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cLineId2 = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cVisOrder2 = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cUVID_ATRCONTARTDObject = httpContext.GetNextPar( ) ;
            AV10cUVID_ATRCONTARTDLogInst = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11cUVID_ATRCONTARTDU_Cualitat = httpContext.GetNextPar( ) ;
            AV12cU_TipoMues2 = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTDDocEntry, AV7cLineId2, AV8cVisOrder2, AV9cUVID_ATRCONTARTDObject, AV10cUVID_ATRCONTARTDLogInst, AV11cUVID_ATRCONTARTDU_Cualitat, AV12cU_TipoMues2) ;
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
            AV13pUVID_ATRCONTARTDDocEntry = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_ATRCONTARTDDocEntry, 9, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14pLineId2 = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pLineId2", GXutil.ltrim( GXutil.str( AV14pLineId2, 9, 0)));
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
      pa0Z2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0Z2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210232389");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.gx0090") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUVID_ATRCONTARTDDocEntry,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pLineId2,9,0)))+"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTDDOCENTRY", GXutil.ltrim( localUtil.ntoc( AV6cUVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLINEID2", GXutil.ltrim( localUtil.ntoc( AV7cLineId2, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCVISORDER2", GXutil.ltrim( localUtil.ntoc( AV8cVisOrder2, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTDOBJECT", AV9cUVID_ATRCONTARTDObject);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTDLOGINST", GXutil.ltrim( localUtil.ntoc( AV10cUVID_ATRCONTARTDLogInst, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUVID_ATRCONTARTDU_CUALITAT", GXutil.rtrim( AV11cUVID_ATRCONTARTDU_Cualitat));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCU_TIPOMUES2", AV12cU_TipoMues2);
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPUVID_ATRCONTARTDDOCENTRY", GXutil.ltrim( localUtil.ntoc( AV13pUVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPLINEID2", GXutil.ltrim( localUtil.ntoc( AV14pLineId2, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTDDOCENTRYFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontartddocentryfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "LINEID2FILTERCONTAINER_Class", GXutil.rtrim( divLineid2filtercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "VISORDER2FILTERCONTAINER_Class", GXutil.rtrim( divVisorder2filtercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTDOBJECTFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontartdobjectfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTDLOGINSTFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontartdloginstfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTDU_CUALITATFILTERCONTAINER_Class", GXutil.rtrim( divUvid_atrcontartdu_cualitatfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_TIPOMUES2FILTERCONTAINER_Class", GXutil.rtrim( divU_tipomues2filtercontainer_Class));
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
         we0Z2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0Z2( ) ;
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
      return formatLink("com.wms.gx0090") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pUVID_ATRCONTARTDDocEntry,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pLineId2,9,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx0090" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List UVID_ATRCONTARTD" ;
   }

   public void wb0Z0( )
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
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontartddocentryfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontartddocentryfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontartddocentryfilter_Internalname, "UVID_ATRCONTARTDDoc Entry", "", "", lblLbluvid_atrcontartddocentryfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0090.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontartddocentry_Internalname, "Doc Entry", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontartddocentry_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cUVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtavCuvid_atrcontartddocentry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cUVID_ATRCONTARTDDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cUVID_ATRCONTARTDDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontartddocentry_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontartddocentry_Visible, edtavCuvid_atrcontartddocentry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0090.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divLineid2filtercontainer_Internalname, 1, 0, "px", 0, "px", divLineid2filtercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbllineid2filter_Internalname, "Line Id2", "", "", lblLbllineid2filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0090.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavClineid2_Internalname, "Line Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavClineid2_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cLineId2, (byte)(9), (byte)(0), ",", "")), ((edtavClineid2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cLineId2), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cLineId2), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClineid2_Jsonclick, 0, "Attribute", "", "", "", edtavClineid2_Visible, edtavClineid2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0090.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divVisorder2filtercontainer_Internalname, 1, 0, "px", 0, "px", divVisorder2filtercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblvisorder2filter_Internalname, "Vis Order2", "", "", lblLblvisorder2filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0090.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCvisorder2_Internalname, "Vis Order", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCvisorder2_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cVisOrder2, (byte)(9), (byte)(0), ",", "")), ((edtavCvisorder2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cVisOrder2), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cVisOrder2), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCvisorder2_Jsonclick, 0, "Attribute", "", "", "", edtavCvisorder2_Visible, edtavCvisorder2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0090.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontartdobjectfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontartdobjectfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontartdobjectfilter_Internalname, "UVID_ATRCONTARTDObject", "", "", lblLbluvid_atrcontartdobjectfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0090.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontartdobject_Internalname, "Object", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontartdobject_Internalname, AV9cUVID_ATRCONTARTDObject, GXutil.rtrim( localUtil.format( AV9cUVID_ATRCONTARTDObject, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontartdobject_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontartdobject_Visible, edtavCuvid_atrcontartdobject_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0090.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontartdloginstfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontartdloginstfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontartdloginstfilter_Internalname, "UVID_ATRCONTARTDLog Inst", "", "", lblLbluvid_atrcontartdloginstfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0090.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontartdloginst_Internalname, "Log Inst", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontartdloginst_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cUVID_ATRCONTARTDLogInst, (byte)(9), (byte)(0), ",", "")), ((edtavCuvid_atrcontartdloginst_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cUVID_ATRCONTARTDLogInst), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cUVID_ATRCONTARTDLogInst), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontartdloginst_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontartdloginst_Visible, edtavCuvid_atrcontartdloginst_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0090.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divUvid_atrcontartdu_cualitatfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUvid_atrcontartdu_cualitatfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLbluvid_atrcontartdu_cualitatfilter_Internalname, "UVID_ATRCONTARTDU_Cualitat", "", "", lblLbluvid_atrcontartdu_cualitatfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0090.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCuvid_atrcontartdu_cualitat_Internalname, "U_Cualitat", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCuvid_atrcontartdu_cualitat_Internalname, GXutil.rtrim( AV11cUVID_ATRCONTARTDU_Cualitat), GXutil.rtrim( localUtil.format( AV11cUVID_ATRCONTARTDU_Cualitat, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuvid_atrcontartdu_cualitat_Jsonclick, 0, "Attribute", "", "", "", edtavCuvid_atrcontartdu_cualitat_Visible, edtavCuvid_atrcontartdu_cualitat_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0090.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divU_tipomues2filtercontainer_Internalname, 1, 0, "px", 0, "px", divU_tipomues2filtercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblu_tipomues2filter_Internalname, "U_Tipo Mues2", "", "", lblLblu_tipomues2filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e170z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0090.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCu_tipomues2_Internalname, "U_Tipo Mues", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCu_tipomues2_Internalname, AV12cU_TipoMues2, GXutil.rtrim( localUtil.format( AV12cU_TipoMues2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCu_tipomues2_Jsonclick, 0, "Attribute", "", "", "", edtavCu_tipomues2_Visible, edtavCu_tipomues2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0090.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e180z1_client"+"'", TempTags, "", 2, "HLP_Gx0090.htm");
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
            httpContext.writeValue( "U_Cualitat") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_AQL") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A128UVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129LineId2, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A145VisOrder2, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtVisOrder2_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A146UVID_ATRCONTARTDObject);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A147UVID_ATRCONTARTDLogInst, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A150UVID_ATRCONTARTDU_Cualitat));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A153U_AQL2);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0090.htm");
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

   public void start0Z2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List UVID_ATRCONTARTD", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0Z0( ) ;
   }

   public void ws0Z2( )
   {
      start0Z2( ) ;
      evt0Z2( ) ;
   }

   public void evt0Z2( )
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
                           A128UVID_ATRCONTARTDDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTDDocEntry_Internalname), ",", ".")) ;
                           A129LineId2 = (int)(localUtil.ctol( httpContext.cgiGet( edtLineId2_Internalname), ",", ".")) ;
                           A145VisOrder2 = (int)(localUtil.ctol( httpContext.cgiGet( edtVisOrder2_Internalname), ",", ".")) ;
                           n145VisOrder2 = false ;
                           A146UVID_ATRCONTARTDObject = httpContext.cgiGet( edtUVID_ATRCONTARTDObject_Internalname) ;
                           n146UVID_ATRCONTARTDObject = false ;
                           A147UVID_ATRCONTARTDLogInst = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_ATRCONTARTDLogInst_Internalname), ",", ".")) ;
                           n147UVID_ATRCONTARTDLogInst = false ;
                           A150UVID_ATRCONTARTDU_Cualitat = httpContext.cgiGet( edtUVID_ATRCONTARTDU_Cualitat_Internalname) ;
                           n150UVID_ATRCONTARTDU_Cualitat = false ;
                           A153U_AQL2 = httpContext.cgiGet( edtU_AQL2_Internalname) ;
                           n153U_AQL2 = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e190Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e200Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cuvid_atrcontartddocentry Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTDDOCENTRY"), ",", ".") != AV6cUVID_ATRCONTARTDDocEntry )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clineid2 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLINEID2"), ",", ".") != AV7cLineId2 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cvisorder2 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCVISORDER2"), ",", ".") != AV8cVisOrder2 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_atrcontartdobject Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTDOBJECT"), AV9cUVID_ATRCONTARTDObject) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_atrcontartdloginst Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTDLOGINST"), ",", ".") != AV10cUVID_ATRCONTARTDLogInst )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuvid_atrcontartdu_cualitat Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTDU_CUALITAT"), AV11cUVID_ATRCONTARTDU_Cualitat) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cu_tipomues2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_TIPOMUES2"), AV12cU_TipoMues2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e210Z2 ();
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

   public void we0Z2( )
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

   public void pa0Z2( )
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
                                  int AV6cUVID_ATRCONTARTDDocEntry ,
                                  int AV7cLineId2 ,
                                  int AV8cVisOrder2 ,
                                  String AV9cUVID_ATRCONTARTDObject ,
                                  int AV10cUVID_ATRCONTARTDLogInst ,
                                  String AV11cUVID_ATRCONTARTDU_Cualitat ,
                                  String AV12cU_TipoMues2 )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0Z2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTDDOCENTRY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A128UVID_ATRCONTARTDDocEntry), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTDDOCENTRY", GXutil.ltrim( localUtil.ntoc( A128UVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_LINEID2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129LineId2), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "LINEID2", GXutil.ltrim( localUtil.ntoc( A129LineId2, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_VISORDER2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A145VisOrder2), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "VISORDER2", GXutil.ltrim( localUtil.ntoc( A145VisOrder2, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTDOBJECT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A146UVID_ATRCONTARTDObject, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTDOBJECT", A146UVID_ATRCONTARTDObject);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTDLOGINST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A147UVID_ATRCONTARTDLogInst), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTDLOGINST", GXutil.ltrim( localUtil.ntoc( A147UVID_ATRCONTARTDLogInst, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTDU_CUALITAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A150UVID_ATRCONTARTDU_Cualitat, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_ATRCONTARTDU_CUALITAT", GXutil.rtrim( A150UVID_ATRCONTARTDU_Cualitat));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_AQL2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A153U_AQL2, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_AQL2", A153U_AQL2);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0Z2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0Z2( )
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
                                              new Integer(AV8cVisOrder2) ,
                                              AV9cUVID_ATRCONTARTDObject ,
                                              new Integer(AV10cUVID_ATRCONTARTDLogInst) ,
                                              AV11cUVID_ATRCONTARTDU_Cualitat ,
                                              AV12cU_TipoMues2 ,
                                              new Integer(A145VisOrder2) ,
                                              A146UVID_ATRCONTARTDObject ,
                                              new Integer(A147UVID_ATRCONTARTDLogInst) ,
                                              A150UVID_ATRCONTARTDU_Cualitat ,
                                              A152U_TipoMues2 ,
                                              new Integer(AV6cUVID_ATRCONTARTDDocEntry) ,
                                              new Integer(AV7cLineId2) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT
                                              }
         } ) ;
         lV9cUVID_ATRCONTARTDObject = GXutil.concat( GXutil.rtrim( AV9cUVID_ATRCONTARTDObject), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cUVID_ATRCONTARTDObject", AV9cUVID_ATRCONTARTDObject);
         lV11cUVID_ATRCONTARTDU_Cualitat = GXutil.padr( GXutil.rtrim( AV11cUVID_ATRCONTARTDU_Cualitat), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cUVID_ATRCONTARTDU_Cualitat", AV11cUVID_ATRCONTARTDU_Cualitat);
         lV12cU_TipoMues2 = GXutil.concat( GXutil.rtrim( AV12cU_TipoMues2), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cU_TipoMues2", AV12cU_TipoMues2);
         /* Using cursor H000Z2 */
         pr_fusquim_sap.execute(0, new Object[] {new Integer(AV6cUVID_ATRCONTARTDDocEntry), new Integer(AV7cLineId2), new Integer(AV8cVisOrder2), lV9cUVID_ATRCONTARTDObject, new Integer(AV10cUVID_ATRCONTARTDLogInst), lV11cUVID_ATRCONTARTDU_Cualitat, lV12cU_TipoMues2, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_fusquim_sap.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A152U_TipoMues2 = H000Z2_A152U_TipoMues2[0] ;
            n152U_TipoMues2 = H000Z2_n152U_TipoMues2[0] ;
            A153U_AQL2 = H000Z2_A153U_AQL2[0] ;
            n153U_AQL2 = H000Z2_n153U_AQL2[0] ;
            A150UVID_ATRCONTARTDU_Cualitat = H000Z2_A150UVID_ATRCONTARTDU_Cualitat[0] ;
            n150UVID_ATRCONTARTDU_Cualitat = H000Z2_n150UVID_ATRCONTARTDU_Cualitat[0] ;
            A147UVID_ATRCONTARTDLogInst = H000Z2_A147UVID_ATRCONTARTDLogInst[0] ;
            n147UVID_ATRCONTARTDLogInst = H000Z2_n147UVID_ATRCONTARTDLogInst[0] ;
            A146UVID_ATRCONTARTDObject = H000Z2_A146UVID_ATRCONTARTDObject[0] ;
            n146UVID_ATRCONTARTDObject = H000Z2_n146UVID_ATRCONTARTDObject[0] ;
            A145VisOrder2 = H000Z2_A145VisOrder2[0] ;
            n145VisOrder2 = H000Z2_n145VisOrder2[0] ;
            A129LineId2 = H000Z2_A129LineId2[0] ;
            A128UVID_ATRCONTARTDDocEntry = H000Z2_A128UVID_ATRCONTARTDDocEntry[0] ;
            /* Execute user event: Load */
            e200Z2 ();
            pr_fusquim_sap.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_fusquim_sap.getStatus(0) == 101) ? 1 : 0)) ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_fusquim_sap.close(0);
         wbEnd = (short)(84) ;
         wb0Z0( ) ;
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
                                           new Integer(AV8cVisOrder2) ,
                                           AV9cUVID_ATRCONTARTDObject ,
                                           new Integer(AV10cUVID_ATRCONTARTDLogInst) ,
                                           AV11cUVID_ATRCONTARTDU_Cualitat ,
                                           AV12cU_TipoMues2 ,
                                           new Integer(A145VisOrder2) ,
                                           A146UVID_ATRCONTARTDObject ,
                                           new Integer(A147UVID_ATRCONTARTDLogInst) ,
                                           A150UVID_ATRCONTARTDU_Cualitat ,
                                           A152U_TipoMues2 ,
                                           new Integer(AV6cUVID_ATRCONTARTDDocEntry) ,
                                           new Integer(AV7cLineId2) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT
                                           }
      } ) ;
      lV9cUVID_ATRCONTARTDObject = GXutil.concat( GXutil.rtrim( AV9cUVID_ATRCONTARTDObject), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cUVID_ATRCONTARTDObject", AV9cUVID_ATRCONTARTDObject);
      lV11cUVID_ATRCONTARTDU_Cualitat = GXutil.padr( GXutil.rtrim( AV11cUVID_ATRCONTARTDU_Cualitat), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cUVID_ATRCONTARTDU_Cualitat", AV11cUVID_ATRCONTARTDU_Cualitat);
      lV12cU_TipoMues2 = GXutil.concat( GXutil.rtrim( AV12cU_TipoMues2), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cU_TipoMues2", AV12cU_TipoMues2);
      /* Using cursor H000Z3 */
      pr_fusquim_sap.execute(1, new Object[] {new Integer(AV6cUVID_ATRCONTARTDDocEntry), new Integer(AV7cLineId2), new Integer(AV8cVisOrder2), lV9cUVID_ATRCONTARTDObject, new Integer(AV10cUVID_ATRCONTARTDLogInst), lV11cUVID_ATRCONTARTDU_Cualitat, lV12cU_TipoMues2});
      GRID1_nRecordCount = H000Z3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTDDocEntry, AV7cLineId2, AV8cVisOrder2, AV9cUVID_ATRCONTARTDObject, AV10cUVID_ATRCONTARTDLogInst, AV11cUVID_ATRCONTARTDU_Cualitat, AV12cU_TipoMues2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTDDocEntry, AV7cLineId2, AV8cVisOrder2, AV9cUVID_ATRCONTARTDObject, AV10cUVID_ATRCONTARTDLogInst, AV11cUVID_ATRCONTARTDU_Cualitat, AV12cU_TipoMues2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTDDocEntry, AV7cLineId2, AV8cVisOrder2, AV9cUVID_ATRCONTARTDObject, AV10cUVID_ATRCONTARTDLogInst, AV11cUVID_ATRCONTARTDU_Cualitat, AV12cU_TipoMues2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTDDocEntry, AV7cLineId2, AV8cVisOrder2, AV9cUVID_ATRCONTARTDObject, AV10cUVID_ATRCONTARTDLogInst, AV11cUVID_ATRCONTARTDU_Cualitat, AV12cU_TipoMues2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cUVID_ATRCONTARTDDocEntry, AV7cLineId2, AV8cVisOrder2, AV9cUVID_ATRCONTARTDObject, AV10cUVID_ATRCONTARTDLogInst, AV11cUVID_ATRCONTARTDU_Cualitat, AV12cU_TipoMues2) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0Z0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e190Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontartddocentry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontartddocentry_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUVID_ATRCONTARTDDOCENTRY");
            GX_FocusControl = edtavCuvid_atrcontartddocentry_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cUVID_ATRCONTARTDDocEntry = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cUVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( AV6cUVID_ATRCONTARTDDocEntry, 9, 0)));
         }
         else
         {
            AV6cUVID_ATRCONTARTDDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontartddocentry_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cUVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( AV6cUVID_ATRCONTARTDDocEntry, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClineid2_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClineid2_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLINEID2");
            GX_FocusControl = edtavClineid2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cLineId2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cLineId2", GXutil.ltrim( GXutil.str( AV7cLineId2, 9, 0)));
         }
         else
         {
            AV7cLineId2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavClineid2_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cLineId2", GXutil.ltrim( GXutil.str( AV7cLineId2, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCvisorder2_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCvisorder2_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCVISORDER2");
            GX_FocusControl = edtavCvisorder2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cVisOrder2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cVisOrder2", GXutil.ltrim( GXutil.str( AV8cVisOrder2, 9, 0)));
         }
         else
         {
            AV8cVisOrder2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavCvisorder2_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cVisOrder2", GXutil.ltrim( GXutil.str( AV8cVisOrder2, 9, 0)));
         }
         AV9cUVID_ATRCONTARTDObject = httpContext.cgiGet( edtavCuvid_atrcontartdobject_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cUVID_ATRCONTARTDObject", AV9cUVID_ATRCONTARTDObject);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontartdloginst_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontartdloginst_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUVID_ATRCONTARTDLOGINST");
            GX_FocusControl = edtavCuvid_atrcontartdloginst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cUVID_ATRCONTARTDLogInst = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cUVID_ATRCONTARTDLogInst", GXutil.ltrim( GXutil.str( AV10cUVID_ATRCONTARTDLogInst, 9, 0)));
         }
         else
         {
            AV10cUVID_ATRCONTARTDLogInst = (int)(localUtil.ctol( httpContext.cgiGet( edtavCuvid_atrcontartdloginst_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cUVID_ATRCONTARTDLogInst", GXutil.ltrim( GXutil.str( AV10cUVID_ATRCONTARTDLogInst, 9, 0)));
         }
         AV11cUVID_ATRCONTARTDU_Cualitat = httpContext.cgiGet( edtavCuvid_atrcontartdu_cualitat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cUVID_ATRCONTARTDU_Cualitat", AV11cUVID_ATRCONTARTDU_Cualitat);
         AV12cU_TipoMues2 = httpContext.cgiGet( edtavCu_tipomues2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cU_TipoMues2", AV12cU_TipoMues2);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTDDOCENTRY"), ",", ".") != AV6cUVID_ATRCONTARTDDocEntry )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLINEID2"), ",", ".") != AV7cLineId2 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCVISORDER2"), ",", ".") != AV8cVisOrder2 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTDOBJECT"), AV9cUVID_ATRCONTARTDObject) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTDLOGINST"), ",", ".") != AV10cUVID_ATRCONTARTDLogInst )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUVID_ATRCONTARTDU_CUALITAT"), AV11cUVID_ATRCONTARTDU_Cualitat) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_TIPOMUES2"), AV12cU_TipoMues2) != 0 )
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
      e190Z2 ();
      if (returnInSub) return;
   }

   public void e190Z2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "UVID_ATRCONTARTD", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV15ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e200Z2( )
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
      e210Z2 ();
      if (returnInSub) return;
   }

   public void e210Z2( )
   {
      /* Enter Routine */
      AV13pUVID_ATRCONTARTDDocEntry = A128UVID_ATRCONTARTDDocEntry ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_ATRCONTARTDDocEntry, 9, 0)));
      AV14pLineId2 = A129LineId2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pLineId2", GXutil.ltrim( GXutil.str( AV14pLineId2, 9, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pUVID_ATRCONTARTDDocEntry),new Integer(AV14pLineId2)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pUVID_ATRCONTARTDDocEntry = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pUVID_ATRCONTARTDDocEntry", GXutil.ltrim( GXutil.str( AV13pUVID_ATRCONTARTDDocEntry, 9, 0)));
      AV14pLineId2 = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pLineId2", GXutil.ltrim( GXutil.str( AV14pLineId2, 9, 0)));
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
      pa0Z2( ) ;
      ws0Z2( ) ;
      we0Z2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20181121023267");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gx0090.js", "?20181121023267");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtUVID_ATRCONTARTDDocEntry_Internalname = "UVID_ATRCONTARTDDOCENTRY_"+sGXsfl_84_idx ;
      edtLineId2_Internalname = "LINEID2_"+sGXsfl_84_idx ;
      edtVisOrder2_Internalname = "VISORDER2_"+sGXsfl_84_idx ;
      edtUVID_ATRCONTARTDObject_Internalname = "UVID_ATRCONTARTDOBJECT_"+sGXsfl_84_idx ;
      edtUVID_ATRCONTARTDLogInst_Internalname = "UVID_ATRCONTARTDLOGINST_"+sGXsfl_84_idx ;
      edtUVID_ATRCONTARTDU_Cualitat_Internalname = "UVID_ATRCONTARTDU_CUALITAT_"+sGXsfl_84_idx ;
      edtU_AQL2_Internalname = "U_AQL2_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtUVID_ATRCONTARTDDocEntry_Internalname = "UVID_ATRCONTARTDDOCENTRY_"+sGXsfl_84_fel_idx ;
      edtLineId2_Internalname = "LINEID2_"+sGXsfl_84_fel_idx ;
      edtVisOrder2_Internalname = "VISORDER2_"+sGXsfl_84_fel_idx ;
      edtUVID_ATRCONTARTDObject_Internalname = "UVID_ATRCONTARTDOBJECT_"+sGXsfl_84_fel_idx ;
      edtUVID_ATRCONTARTDLogInst_Internalname = "UVID_ATRCONTARTDLOGINST_"+sGXsfl_84_fel_idx ;
      edtUVID_ATRCONTARTDU_Cualitat_Internalname = "UVID_ATRCONTARTDU_CUALITAT_"+sGXsfl_84_fel_idx ;
      edtU_AQL2_Internalname = "U_AQL2_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb0Z0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A128UVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129LineId2, (byte)(9), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_ATRCONTARTDDocEntry_Internalname,GXutil.ltrim( localUtil.ntoc( A128UVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A128UVID_ATRCONTARTDDocEntry), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_ATRCONTARTDDocEntry_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLineId2_Internalname,GXutil.ltrim( localUtil.ntoc( A129LineId2, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A129LineId2), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLineId2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtVisOrder2_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A128UVID_ATRCONTARTDDocEntry, (byte)(9), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129LineId2, (byte)(9), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtVisOrder2_Internalname, "Link", edtVisOrder2_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVisOrder2_Internalname,GXutil.ltrim( localUtil.ntoc( A145VisOrder2, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A145VisOrder2), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtVisOrder2_Link,"","","",edtVisOrder2_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_ATRCONTARTDObject_Internalname,A146UVID_ATRCONTARTDObject,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_ATRCONTARTDObject_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_ATRCONTARTDLogInst_Internalname,GXutil.ltrim( localUtil.ntoc( A147UVID_ATRCONTARTDLogInst, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A147UVID_ATRCONTARTDLogInst), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_ATRCONTARTDLogInst_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_ATRCONTARTDU_Cualitat_Internalname,GXutil.rtrim( A150UVID_ATRCONTARTDU_Cualitat),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_ATRCONTARTDU_Cualitat_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_AQL2_Internalname,A153U_AQL2,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_AQL2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTDDOCENTRY"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A128UVID_ATRCONTARTDDocEntry), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_LINEID2"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A129LineId2), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_VISORDER2"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A145VisOrder2), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTDOBJECT"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A146UVID_ATRCONTARTDObject, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTDLOGINST"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A147UVID_ATRCONTARTDLogInst), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_ATRCONTARTDU_CUALITAT"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A150UVID_ATRCONTARTDU_Cualitat, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_AQL2"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A153U_AQL2, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLbluvid_atrcontartddocentryfilter_Internalname = "LBLUVID_ATRCONTARTDDOCENTRYFILTER" ;
      edtavCuvid_atrcontartddocentry_Internalname = "vCUVID_ATRCONTARTDDOCENTRY" ;
      divUvid_atrcontartddocentryfiltercontainer_Internalname = "UVID_ATRCONTARTDDOCENTRYFILTERCONTAINER" ;
      lblLbllineid2filter_Internalname = "LBLLINEID2FILTER" ;
      edtavClineid2_Internalname = "vCLINEID2" ;
      divLineid2filtercontainer_Internalname = "LINEID2FILTERCONTAINER" ;
      lblLblvisorder2filter_Internalname = "LBLVISORDER2FILTER" ;
      edtavCvisorder2_Internalname = "vCVISORDER2" ;
      divVisorder2filtercontainer_Internalname = "VISORDER2FILTERCONTAINER" ;
      lblLbluvid_atrcontartdobjectfilter_Internalname = "LBLUVID_ATRCONTARTDOBJECTFILTER" ;
      edtavCuvid_atrcontartdobject_Internalname = "vCUVID_ATRCONTARTDOBJECT" ;
      divUvid_atrcontartdobjectfiltercontainer_Internalname = "UVID_ATRCONTARTDOBJECTFILTERCONTAINER" ;
      lblLbluvid_atrcontartdloginstfilter_Internalname = "LBLUVID_ATRCONTARTDLOGINSTFILTER" ;
      edtavCuvid_atrcontartdloginst_Internalname = "vCUVID_ATRCONTARTDLOGINST" ;
      divUvid_atrcontartdloginstfiltercontainer_Internalname = "UVID_ATRCONTARTDLOGINSTFILTERCONTAINER" ;
      lblLbluvid_atrcontartdu_cualitatfilter_Internalname = "LBLUVID_ATRCONTARTDU_CUALITATFILTER" ;
      edtavCuvid_atrcontartdu_cualitat_Internalname = "vCUVID_ATRCONTARTDU_CUALITAT" ;
      divUvid_atrcontartdu_cualitatfiltercontainer_Internalname = "UVID_ATRCONTARTDU_CUALITATFILTERCONTAINER" ;
      lblLblu_tipomues2filter_Internalname = "LBLU_TIPOMUES2FILTER" ;
      edtavCu_tipomues2_Internalname = "vCU_TIPOMUES2" ;
      divU_tipomues2filtercontainer_Internalname = "U_TIPOMUES2FILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtUVID_ATRCONTARTDDocEntry_Internalname = "UVID_ATRCONTARTDDOCENTRY" ;
      edtLineId2_Internalname = "LINEID2" ;
      edtVisOrder2_Internalname = "VISORDER2" ;
      edtUVID_ATRCONTARTDObject_Internalname = "UVID_ATRCONTARTDOBJECT" ;
      edtUVID_ATRCONTARTDLogInst_Internalname = "UVID_ATRCONTARTDLOGINST" ;
      edtUVID_ATRCONTARTDU_Cualitat_Internalname = "UVID_ATRCONTARTDU_CUALITAT" ;
      edtU_AQL2_Internalname = "U_AQL2" ;
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
      edtU_AQL2_Jsonclick = "" ;
      edtUVID_ATRCONTARTDU_Cualitat_Jsonclick = "" ;
      edtUVID_ATRCONTARTDLogInst_Jsonclick = "" ;
      edtUVID_ATRCONTARTDObject_Jsonclick = "" ;
      edtVisOrder2_Jsonclick = "" ;
      edtLineId2_Jsonclick = "" ;
      edtUVID_ATRCONTARTDDocEntry_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtVisOrder2_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCu_tipomues2_Jsonclick = "" ;
      edtavCu_tipomues2_Enabled = 1 ;
      edtavCu_tipomues2_Visible = 1 ;
      edtavCuvid_atrcontartdu_cualitat_Jsonclick = "" ;
      edtavCuvid_atrcontartdu_cualitat_Enabled = 1 ;
      edtavCuvid_atrcontartdu_cualitat_Visible = 1 ;
      edtavCuvid_atrcontartdloginst_Jsonclick = "" ;
      edtavCuvid_atrcontartdloginst_Enabled = 1 ;
      edtavCuvid_atrcontartdloginst_Visible = 1 ;
      edtavCuvid_atrcontartdobject_Jsonclick = "" ;
      edtavCuvid_atrcontartdobject_Enabled = 1 ;
      edtavCuvid_atrcontartdobject_Visible = 1 ;
      edtavCvisorder2_Jsonclick = "" ;
      edtavCvisorder2_Enabled = 1 ;
      edtavCvisorder2_Visible = 1 ;
      edtavClineid2_Jsonclick = "" ;
      edtavClineid2_Enabled = 1 ;
      edtavClineid2_Visible = 1 ;
      edtavCuvid_atrcontartddocentry_Jsonclick = "" ;
      edtavCuvid_atrcontartddocentry_Enabled = 1 ;
      edtavCuvid_atrcontartddocentry_Visible = 1 ;
      divU_tipomues2filtercontainer_Class = "AdvancedContainerItem" ;
      divUvid_atrcontartdu_cualitatfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_atrcontartdloginstfiltercontainer_Class = "AdvancedContainerItem" ;
      divUvid_atrcontartdobjectfiltercontainer_Class = "AdvancedContainerItem" ;
      divVisorder2filtercontainer_Class = "AdvancedContainerItem" ;
      divLineid2filtercontainer_Class = "AdvancedContainerItem" ;
      divUvid_atrcontartddocentryfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List UVID_ATRCONTARTD" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_ATRCONTARTDDocEntry',fld:'vCUVID_ATRCONTARTDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cLineId2',fld:'vCLINEID2',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cVisOrder2',fld:'vCVISORDER2',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_ATRCONTARTDObject',fld:'vCUVID_ATRCONTARTDOBJECT',pic:'',nv:''},{av:'AV10cUVID_ATRCONTARTDLogInst',fld:'vCUVID_ATRCONTARTDLOGINST',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cUVID_ATRCONTARTDU_Cualitat',fld:'vCUVID_ATRCONTARTDU_CUALITAT',pic:'',nv:''},{av:'AV12cU_TipoMues2',fld:'vCU_TIPOMUES2',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e180Z1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTDDOCENTRYFILTER.CLICK","{handler:'e110Z1',iparms:[{av:'divUvid_atrcontartddocentryfiltercontainer_Class',ctrl:'UVID_ATRCONTARTDDOCENTRYFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontartddocentryfiltercontainer_Class',ctrl:'UVID_ATRCONTARTDDOCENTRYFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontartddocentry_Visible',ctrl:'vCUVID_ATRCONTARTDDOCENTRY',prop:'Visible'}]}");
      setEventMetadata("LBLLINEID2FILTER.CLICK","{handler:'e120Z1',iparms:[{av:'divLineid2filtercontainer_Class',ctrl:'LINEID2FILTERCONTAINER',prop:'Class'}],oparms:[{av:'divLineid2filtercontainer_Class',ctrl:'LINEID2FILTERCONTAINER',prop:'Class'},{av:'edtavClineid2_Visible',ctrl:'vCLINEID2',prop:'Visible'}]}");
      setEventMetadata("LBLVISORDER2FILTER.CLICK","{handler:'e130Z1',iparms:[{av:'divVisorder2filtercontainer_Class',ctrl:'VISORDER2FILTERCONTAINER',prop:'Class'}],oparms:[{av:'divVisorder2filtercontainer_Class',ctrl:'VISORDER2FILTERCONTAINER',prop:'Class'},{av:'edtavCvisorder2_Visible',ctrl:'vCVISORDER2',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTDOBJECTFILTER.CLICK","{handler:'e140Z1',iparms:[{av:'divUvid_atrcontartdobjectfiltercontainer_Class',ctrl:'UVID_ATRCONTARTDOBJECTFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontartdobjectfiltercontainer_Class',ctrl:'UVID_ATRCONTARTDOBJECTFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontartdobject_Visible',ctrl:'vCUVID_ATRCONTARTDOBJECT',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTDLOGINSTFILTER.CLICK","{handler:'e150Z1',iparms:[{av:'divUvid_atrcontartdloginstfiltercontainer_Class',ctrl:'UVID_ATRCONTARTDLOGINSTFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontartdloginstfiltercontainer_Class',ctrl:'UVID_ATRCONTARTDLOGINSTFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontartdloginst_Visible',ctrl:'vCUVID_ATRCONTARTDLOGINST',prop:'Visible'}]}");
      setEventMetadata("LBLUVID_ATRCONTARTDU_CUALITATFILTER.CLICK","{handler:'e160Z1',iparms:[{av:'divUvid_atrcontartdu_cualitatfiltercontainer_Class',ctrl:'UVID_ATRCONTARTDU_CUALITATFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUvid_atrcontartdu_cualitatfiltercontainer_Class',ctrl:'UVID_ATRCONTARTDU_CUALITATFILTERCONTAINER',prop:'Class'},{av:'edtavCuvid_atrcontartdu_cualitat_Visible',ctrl:'vCUVID_ATRCONTARTDU_CUALITAT',prop:'Visible'}]}");
      setEventMetadata("LBLU_TIPOMUES2FILTER.CLICK","{handler:'e170Z1',iparms:[{av:'divU_tipomues2filtercontainer_Class',ctrl:'U_TIPOMUES2FILTERCONTAINER',prop:'Class'}],oparms:[{av:'divU_tipomues2filtercontainer_Class',ctrl:'U_TIPOMUES2FILTERCONTAINER',prop:'Class'},{av:'edtavCu_tipomues2_Visible',ctrl:'vCU_TIPOMUES2',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e210Z2',iparms:[{av:'A128UVID_ATRCONTARTDDocEntry',fld:'UVID_ATRCONTARTDDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0},{av:'A129LineId2',fld:'LINEID2',pic:'ZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pUVID_ATRCONTARTDDocEntry',fld:'vPUVID_ATRCONTARTDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV14pLineId2',fld:'vPLINEID2',pic:'ZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_ATRCONTARTDDocEntry',fld:'vCUVID_ATRCONTARTDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cLineId2',fld:'vCLINEID2',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cVisOrder2',fld:'vCVISORDER2',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_ATRCONTARTDObject',fld:'vCUVID_ATRCONTARTDOBJECT',pic:'',nv:''},{av:'AV10cUVID_ATRCONTARTDLogInst',fld:'vCUVID_ATRCONTARTDLOGINST',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cUVID_ATRCONTARTDU_Cualitat',fld:'vCUVID_ATRCONTARTDU_CUALITAT',pic:'',nv:''},{av:'AV12cU_TipoMues2',fld:'vCU_TIPOMUES2',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_ATRCONTARTDDocEntry',fld:'vCUVID_ATRCONTARTDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cLineId2',fld:'vCLINEID2',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cVisOrder2',fld:'vCVISORDER2',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_ATRCONTARTDObject',fld:'vCUVID_ATRCONTARTDOBJECT',pic:'',nv:''},{av:'AV10cUVID_ATRCONTARTDLogInst',fld:'vCUVID_ATRCONTARTDLOGINST',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cUVID_ATRCONTARTDU_Cualitat',fld:'vCUVID_ATRCONTARTDU_CUALITAT',pic:'',nv:''},{av:'AV12cU_TipoMues2',fld:'vCU_TIPOMUES2',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_ATRCONTARTDDocEntry',fld:'vCUVID_ATRCONTARTDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cLineId2',fld:'vCLINEID2',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cVisOrder2',fld:'vCVISORDER2',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_ATRCONTARTDObject',fld:'vCUVID_ATRCONTARTDOBJECT',pic:'',nv:''},{av:'AV10cUVID_ATRCONTARTDLogInst',fld:'vCUVID_ATRCONTARTDLOGINST',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cUVID_ATRCONTARTDU_Cualitat',fld:'vCUVID_ATRCONTARTDU_CUALITAT',pic:'',nv:''},{av:'AV12cU_TipoMues2',fld:'vCU_TIPOMUES2',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cUVID_ATRCONTARTDDocEntry',fld:'vCUVID_ATRCONTARTDDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cLineId2',fld:'vCLINEID2',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cVisOrder2',fld:'vCVISORDER2',pic:'ZZZZZZZZ9',nv:0},{av:'AV9cUVID_ATRCONTARTDObject',fld:'vCUVID_ATRCONTARTDOBJECT',pic:'',nv:''},{av:'AV10cUVID_ATRCONTARTDLogInst',fld:'vCUVID_ATRCONTARTDLOGINST',pic:'ZZZZZZZZ9',nv:0},{av:'AV11cUVID_ATRCONTARTDU_Cualitat',fld:'vCUVID_ATRCONTARTDU_CUALITAT',pic:'',nv:''},{av:'AV12cU_TipoMues2',fld:'vCU_TIPOMUES2',pic:'',nv:''}],oparms:[]}");
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
      AV9cUVID_ATRCONTARTDObject = "" ;
      AV11cUVID_ATRCONTARTDU_Cualitat = "" ;
      AV12cU_TipoMues2 = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbluvid_atrcontartddocentryfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbllineid2filter_Jsonclick = "" ;
      lblLblvisorder2filter_Jsonclick = "" ;
      lblLbluvid_atrcontartdobjectfilter_Jsonclick = "" ;
      lblLbluvid_atrcontartdloginstfilter_Jsonclick = "" ;
      lblLbluvid_atrcontartdu_cualitatfilter_Jsonclick = "" ;
      lblLblu_tipomues2filter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A146UVID_ATRCONTARTDObject = "" ;
      A150UVID_ATRCONTARTDU_Cualitat = "" ;
      A153U_AQL2 = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Linkselection_GXI = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV9cUVID_ATRCONTARTDObject = "" ;
      lV11cUVID_ATRCONTARTDU_Cualitat = "" ;
      lV12cU_TipoMues2 = "" ;
      A152U_TipoMues2 = "" ;
      H000Z2_A152U_TipoMues2 = new String[] {""} ;
      H000Z2_n152U_TipoMues2 = new boolean[] {false} ;
      H000Z2_A153U_AQL2 = new String[] {""} ;
      H000Z2_n153U_AQL2 = new boolean[] {false} ;
      H000Z2_A150UVID_ATRCONTARTDU_Cualitat = new String[] {""} ;
      H000Z2_n150UVID_ATRCONTARTDU_Cualitat = new boolean[] {false} ;
      H000Z2_A147UVID_ATRCONTARTDLogInst = new int[1] ;
      H000Z2_n147UVID_ATRCONTARTDLogInst = new boolean[] {false} ;
      H000Z2_A146UVID_ATRCONTARTDObject = new String[] {""} ;
      H000Z2_n146UVID_ATRCONTARTDObject = new boolean[] {false} ;
      H000Z2_A145VisOrder2 = new int[1] ;
      H000Z2_n145VisOrder2 = new boolean[] {false} ;
      H000Z2_A129LineId2 = new int[1] ;
      H000Z2_A128UVID_ATRCONTARTDDocEntry = new int[1] ;
      H000Z3_AGRID1_nRecordCount = new long[1] ;
      AV15ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.gx0090__fusquim_sap(),
         new Object[] {
             new Object[] {
            H000Z2_A152U_TipoMues2, H000Z2_n152U_TipoMues2, H000Z2_A153U_AQL2, H000Z2_n153U_AQL2, H000Z2_A150UVID_ATRCONTARTDU_Cualitat, H000Z2_n150UVID_ATRCONTARTDU_Cualitat, H000Z2_A147UVID_ATRCONTARTDLogInst, H000Z2_n147UVID_ATRCONTARTDLogInst, H000Z2_A146UVID_ATRCONTARTDObject, H000Z2_n146UVID_ATRCONTARTDObject,
            H000Z2_A145VisOrder2, H000Z2_n145VisOrder2, H000Z2_A129LineId2, H000Z2_A128UVID_ATRCONTARTDDocEntry
            }
            , new Object[] {
            H000Z3_AGRID1_nRecordCount
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
   private int AV6cUVID_ATRCONTARTDDocEntry ;
   private int AV7cLineId2 ;
   private int AV8cVisOrder2 ;
   private int AV10cUVID_ATRCONTARTDLogInst ;
   private int AV13pUVID_ATRCONTARTDDocEntry ;
   private int AV14pLineId2 ;
   private int edtavCuvid_atrcontartddocentry_Enabled ;
   private int edtavCuvid_atrcontartddocentry_Visible ;
   private int edtavClineid2_Enabled ;
   private int edtavClineid2_Visible ;
   private int edtavCvisorder2_Enabled ;
   private int edtavCvisorder2_Visible ;
   private int edtavCuvid_atrcontartdobject_Visible ;
   private int edtavCuvid_atrcontartdobject_Enabled ;
   private int edtavCuvid_atrcontartdloginst_Enabled ;
   private int edtavCuvid_atrcontartdloginst_Visible ;
   private int edtavCuvid_atrcontartdu_cualitat_Visible ;
   private int edtavCuvid_atrcontartdu_cualitat_Enabled ;
   private int edtavCu_tipomues2_Visible ;
   private int edtavCu_tipomues2_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A128UVID_ATRCONTARTDDocEntry ;
   private int A129LineId2 ;
   private int A145VisOrder2 ;
   private int A147UVID_ATRCONTARTDLogInst ;
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
   private String divUvid_atrcontartddocentryfiltercontainer_Class ;
   private String divLineid2filtercontainer_Class ;
   private String divVisorder2filtercontainer_Class ;
   private String divUvid_atrcontartdobjectfiltercontainer_Class ;
   private String divUvid_atrcontartdloginstfiltercontainer_Class ;
   private String divUvid_atrcontartdu_cualitatfiltercontainer_Class ;
   private String divU_tipomues2filtercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV11cUVID_ATRCONTARTDU_Cualitat ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divUvid_atrcontartddocentryfiltercontainer_Internalname ;
   private String lblLbluvid_atrcontartddocentryfilter_Internalname ;
   private String lblLbluvid_atrcontartddocentryfilter_Jsonclick ;
   private String edtavCuvid_atrcontartddocentry_Internalname ;
   private String TempTags ;
   private String edtavCuvid_atrcontartddocentry_Jsonclick ;
   private String divLineid2filtercontainer_Internalname ;
   private String lblLbllineid2filter_Internalname ;
   private String lblLbllineid2filter_Jsonclick ;
   private String edtavClineid2_Internalname ;
   private String edtavClineid2_Jsonclick ;
   private String divVisorder2filtercontainer_Internalname ;
   private String lblLblvisorder2filter_Internalname ;
   private String lblLblvisorder2filter_Jsonclick ;
   private String edtavCvisorder2_Internalname ;
   private String edtavCvisorder2_Jsonclick ;
   private String divUvid_atrcontartdobjectfiltercontainer_Internalname ;
   private String lblLbluvid_atrcontartdobjectfilter_Internalname ;
   private String lblLbluvid_atrcontartdobjectfilter_Jsonclick ;
   private String edtavCuvid_atrcontartdobject_Internalname ;
   private String edtavCuvid_atrcontartdobject_Jsonclick ;
   private String divUvid_atrcontartdloginstfiltercontainer_Internalname ;
   private String lblLbluvid_atrcontartdloginstfilter_Internalname ;
   private String lblLbluvid_atrcontartdloginstfilter_Jsonclick ;
   private String edtavCuvid_atrcontartdloginst_Internalname ;
   private String edtavCuvid_atrcontartdloginst_Jsonclick ;
   private String divUvid_atrcontartdu_cualitatfiltercontainer_Internalname ;
   private String lblLbluvid_atrcontartdu_cualitatfilter_Internalname ;
   private String lblLbluvid_atrcontartdu_cualitatfilter_Jsonclick ;
   private String edtavCuvid_atrcontartdu_cualitat_Internalname ;
   private String edtavCuvid_atrcontartdu_cualitat_Jsonclick ;
   private String divU_tipomues2filtercontainer_Internalname ;
   private String lblLblu_tipomues2filter_Internalname ;
   private String lblLblu_tipomues2filter_Jsonclick ;
   private String edtavCu_tipomues2_Internalname ;
   private String edtavCu_tipomues2_Jsonclick ;
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
   private String edtVisOrder2_Link ;
   private String A150UVID_ATRCONTARTDU_Cualitat ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtUVID_ATRCONTARTDDocEntry_Internalname ;
   private String edtLineId2_Internalname ;
   private String edtVisOrder2_Internalname ;
   private String edtUVID_ATRCONTARTDObject_Internalname ;
   private String edtUVID_ATRCONTARTDLogInst_Internalname ;
   private String edtUVID_ATRCONTARTDU_Cualitat_Internalname ;
   private String edtU_AQL2_Internalname ;
   private String scmdbuf ;
   private String lV11cUVID_ATRCONTARTDU_Cualitat ;
   private String AV15ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtUVID_ATRCONTARTDDocEntry_Jsonclick ;
   private String edtLineId2_Jsonclick ;
   private String edtVisOrder2_Jsonclick ;
   private String edtUVID_ATRCONTARTDObject_Jsonclick ;
   private String edtUVID_ATRCONTARTDLogInst_Jsonclick ;
   private String edtUVID_ATRCONTARTDU_Cualitat_Jsonclick ;
   private String edtU_AQL2_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n145VisOrder2 ;
   private boolean n146UVID_ATRCONTARTDObject ;
   private boolean n147UVID_ATRCONTARTDLogInst ;
   private boolean n150UVID_ATRCONTARTDU_Cualitat ;
   private boolean n153U_AQL2 ;
   private boolean n152U_TipoMues2 ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV9cUVID_ATRCONTARTDObject ;
   private String AV12cU_TipoMues2 ;
   private String A146UVID_ATRCONTARTDObject ;
   private String A153U_AQL2 ;
   private String AV18Linkselection_GXI ;
   private String lV9cUVID_ATRCONTARTDObject ;
   private String lV12cU_TipoMues2 ;
   private String A152U_TipoMues2 ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_fusquim_sap ;
   private String[] H000Z2_A152U_TipoMues2 ;
   private boolean[] H000Z2_n152U_TipoMues2 ;
   private String[] H000Z2_A153U_AQL2 ;
   private boolean[] H000Z2_n153U_AQL2 ;
   private String[] H000Z2_A150UVID_ATRCONTARTDU_Cualitat ;
   private boolean[] H000Z2_n150UVID_ATRCONTARTDU_Cualitat ;
   private int[] H000Z2_A147UVID_ATRCONTARTDLogInst ;
   private boolean[] H000Z2_n147UVID_ATRCONTARTDLogInst ;
   private String[] H000Z2_A146UVID_ATRCONTARTDObject ;
   private boolean[] H000Z2_n146UVID_ATRCONTARTDObject ;
   private int[] H000Z2_A145VisOrder2 ;
   private boolean[] H000Z2_n145VisOrder2 ;
   private int[] H000Z2_A129LineId2 ;
   private int[] H000Z2_A128UVID_ATRCONTARTDDocEntry ;
   private long[] H000Z3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0090__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV8cVisOrder2 ,
                                          String AV9cUVID_ATRCONTARTDObject ,
                                          int AV10cUVID_ATRCONTARTDLogInst ,
                                          String AV11cUVID_ATRCONTARTDU_Cualitat ,
                                          String AV12cU_TipoMues2 ,
                                          int A145VisOrder2 ,
                                          String A146UVID_ATRCONTARTDObject ,
                                          int A147UVID_ATRCONTARTDLogInst ,
                                          String A150UVID_ATRCONTARTDU_Cualitat ,
                                          String A152U_TipoMues2 ,
                                          int AV6cUVID_ATRCONTARTDDocEntry ,
                                          int AV7cLineId2 )
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
      sSelectString = " [U_TipoMues], [U_AQL], [U_Cualitat], [LogInst], [Object], [VisOrder], [LineId]," ;
      sSelectString = sSelectString + " [DocEntry]" ;
      sFromString = " FROM dbo.[@VID_ATRCONTARTD] WITH (NOLOCK)" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE ([DocEntry] >= ? and [LineId] >= ?)" ;
      if ( ! (0==AV8cVisOrder2) )
      {
         sWhereString = sWhereString + " and ([VisOrder] >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cUVID_ATRCONTARTDObject)==0) )
      {
         sWhereString = sWhereString + " and ([Object] like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cUVID_ATRCONTARTDLogInst) )
      {
         sWhereString = sWhereString + " and ([LogInst] >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cUVID_ATRCONTARTDU_Cualitat)==0) )
      {
         sWhereString = sWhereString + " and ([U_Cualitat] like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cU_TipoMues2)==0) )
      {
         sWhereString = sWhereString + " and ([U_TipoMues] like ?)" ;
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

   protected Object[] conditional_H000Z3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV8cVisOrder2 ,
                                          String AV9cUVID_ATRCONTARTDObject ,
                                          int AV10cUVID_ATRCONTARTDLogInst ,
                                          String AV11cUVID_ATRCONTARTDU_Cualitat ,
                                          String AV12cU_TipoMues2 ,
                                          int A145VisOrder2 ,
                                          String A146UVID_ATRCONTARTDObject ,
                                          int A147UVID_ATRCONTARTDLogInst ,
                                          String A150UVID_ATRCONTARTDU_Cualitat ,
                                          String A152U_TipoMues2 ,
                                          int AV6cUVID_ATRCONTARTDDocEntry ,
                                          int AV7cLineId2 )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM dbo.[@VID_ATRCONTARTD] WITH (NOLOCK)" ;
      scmdbuf = scmdbuf + " WHERE ([DocEntry] >= ? and [LineId] >= ?)" ;
      if ( ! (0==AV8cVisOrder2) )
      {
         sWhereString = sWhereString + " and ([VisOrder] >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cUVID_ATRCONTARTDObject)==0) )
      {
         sWhereString = sWhereString + " and ([Object] like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cUVID_ATRCONTARTDLogInst) )
      {
         sWhereString = sWhereString + " and ([LogInst] >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cUVID_ATRCONTARTDU_Cualitat)==0) )
      {
         sWhereString = sWhereString + " and ([U_Cualitat] like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cU_TipoMues2)==0) )
      {
         sWhereString = sWhereString + " and ([U_TipoMues] like ?)" ;
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
                  return conditional_H000Z2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() );
            case 1 :
                  return conditional_H000Z3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000Z3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7) ;
               ((int[]) buf[13])[0] = rslt.getInt(8) ;
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
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 8);
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
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 8);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

