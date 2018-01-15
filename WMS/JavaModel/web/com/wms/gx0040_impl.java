/*
               File: gx0040_impl
        Description: Selection List Registro Inspeccion H
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 5, 2018 11:41:11.55
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

public final  class gx0040_impl extends GXDataArea
{
   public gx0040_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0040_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0040_impl.class ));
   }

   public gx0040_impl( int remoteHandle ,
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
            AV6cU_NoDoc = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cU_WhsCode = httpContext.GetNextPar( ) ;
            AV8cU_ItemCode = httpContext.GetNextPar( ) ;
            AV9cU_NoLote = httpContext.GetNextPar( ) ;
            AV10cU_Cantidad = GXutil.lval( httpContext.GetNextPar( )) ;
            AV11cU_Bultos = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV12cU_BultosMu = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cU_NoDoc, AV7cU_WhsCode, AV8cU_ItemCode, AV9cU_NoLote, AV10cU_Cantidad, AV11cU_Bultos, AV12cU_BultosMu) ;
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
            AV13pU_NoDoc = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pU_NoDoc", GXutil.ltrim( GXutil.str( AV13pU_NoDoc, 9, 0)));
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
      pa0O2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0O2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20181511411166");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.gx0040") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pU_NoDoc,9,0)))+"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCU_NODOC", GXutil.ltrim( localUtil.ntoc( AV6cU_NoDoc, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCU_WHSCODE", AV7cU_WhsCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCU_ITEMCODE", AV8cU_ItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCU_NOLOTE", AV9cU_NoLote);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCU_CANTIDAD", GXutil.ltrim( localUtil.ntoc( AV10cU_Cantidad, (byte)(18), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCU_BULTOS", GXutil.ltrim( localUtil.ntoc( AV11cU_Bultos, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCU_BULTOSMU", GXutil.ltrim( localUtil.ntoc( AV12cU_BultosMu, (byte)(9), (byte)(0), ",", "")));
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPU_NODOC", GXutil.ltrim( localUtil.ntoc( AV13pU_NoDoc, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_NODOCFILTERCONTAINER_Class", GXutil.rtrim( divU_nodocfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_WHSCODEFILTERCONTAINER_Class", GXutil.rtrim( divU_whscodefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_ITEMCODEFILTERCONTAINER_Class", GXutil.rtrim( divU_itemcodefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_NOLOTEFILTERCONTAINER_Class", GXutil.rtrim( divU_nolotefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_CANTIDADFILTERCONTAINER_Class", GXutil.rtrim( divU_cantidadfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_BULTOSFILTERCONTAINER_Class", GXutil.rtrim( divU_bultosfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_BULTOSMUFILTERCONTAINER_Class", GXutil.rtrim( divU_bultosmufiltercontainer_Class));
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
         we0O2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0O2( ) ;
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
      return formatLink("com.wms.gx0040") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pU_NoDoc,9,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx0040" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Registro Inspeccion H" ;
   }

   public void wb0O0( )
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
         com.wms.GxWebStd.gx_div_start( httpContext, divU_nodocfiltercontainer_Internalname, 1, 0, "px", 0, "px", divU_nodocfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblu_nodocfilter_Internalname, "U_No Doc", "", "", lblLblu_nodocfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0040.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCu_nodoc_Internalname, "Número de Doc.", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCu_nodoc_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cU_NoDoc, (byte)(9), (byte)(0), ",", "")), ((edtavCu_nodoc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cU_NoDoc), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cU_NoDoc), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCu_nodoc_Jsonclick, 0, "Attribute", "", "", "", edtavCu_nodoc_Visible, edtavCu_nodoc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0040.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divU_whscodefiltercontainer_Internalname, 1, 0, "px", 0, "px", divU_whscodefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblu_whscodefilter_Internalname, "U_Whs Code", "", "", lblLblu_whscodefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0040.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCu_whscode_Internalname, "Bodega Origen", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCu_whscode_Internalname, AV7cU_WhsCode, GXutil.rtrim( localUtil.format( AV7cU_WhsCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCu_whscode_Jsonclick, 0, "Attribute", "", "", "", edtavCu_whscode_Visible, edtavCu_whscode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0040.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divU_itemcodefiltercontainer_Internalname, 1, 0, "px", 0, "px", divU_itemcodefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblu_itemcodefilter_Internalname, "U_Item Code", "", "", lblLblu_itemcodefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0040.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCu_itemcode_Internalname, "Producto", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCu_itemcode_Internalname, AV8cU_ItemCode, GXutil.rtrim( localUtil.format( AV8cU_ItemCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCu_itemcode_Jsonclick, 0, "Attribute", "", "", "", edtavCu_itemcode_Visible, edtavCu_itemcode_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0040.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divU_nolotefiltercontainer_Internalname, 1, 0, "px", 0, "px", divU_nolotefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblu_nolotefilter_Internalname, "U_No Lote", "", "", lblLblu_nolotefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0040.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCu_nolote_Internalname, "Lote", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCu_nolote_Internalname, AV9cU_NoLote, GXutil.rtrim( localUtil.format( AV9cU_NoLote, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCu_nolote_Jsonclick, 0, "Attribute", "", "", "", edtavCu_nolote_Visible, edtavCu_nolote_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0040.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divU_cantidadfiltercontainer_Internalname, 1, 0, "px", 0, "px", divU_cantidadfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblu_cantidadfilter_Internalname, "U_Cantidad", "", "", lblLblu_cantidadfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0040.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCu_cantidad_Internalname, "Cantidad Producto", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCu_cantidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cU_Cantidad, (byte)(18), (byte)(0), ",", "")), ((edtavCu_cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cU_Cantidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cU_Cantidad), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCu_cantidad_Jsonclick, 0, "Attribute", "", "", "", edtavCu_cantidad_Visible, edtavCu_cantidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0040.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divU_bultosfiltercontainer_Internalname, 1, 0, "px", 0, "px", divU_bultosfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblu_bultosfilter_Internalname, "U_Bultos", "", "", lblLblu_bultosfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0040.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCu_bultos_Internalname, "Número de bultos", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCu_bultos_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cU_Bultos, (byte)(9), (byte)(0), ",", "")), ((edtavCu_bultos_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11cU_Bultos), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11cU_Bultos), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCu_bultos_Jsonclick, 0, "Attribute", "", "", "", edtavCu_bultos_Visible, edtavCu_bultos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0040.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divU_bultosmufiltercontainer_Internalname, 1, 0, "px", 0, "px", divU_bultosmufiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblu_bultosmufilter_Internalname, "U_Bultos Mu", "", "", lblLblu_bultosmufilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e170o1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0040.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCu_bultosmu_Internalname, "Bultos a muestrear", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCu_bultosmu_Internalname, GXutil.ltrim( localUtil.ntoc( AV12cU_BultosMu, (byte)(9), (byte)(0), ",", "")), ((edtavCu_bultosmu_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12cU_BultosMu), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12cU_BultosMu), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCu_bultosmu_Jsonclick, 0, "Attribute", "", "", "", edtavCu_bultosmu_Visible, edtavCu_bultosmu_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0040.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e180o1_client"+"'", TempTags, "", 2, "HLP_Gx0040.htm");
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
            httpContext.writeValue( "U_No Doc") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Whs Code") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Item Code") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_No Lote") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Bultos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Bultos Mu") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Traslado") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A65U_WhsCode);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtU_WhsCode_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A63U_ItemCode);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A70U_NoLote);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A73U_Cantidad, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A74U_Bultos, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A75U_BultosMu, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A86U_Traslado));
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0040.htm");
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

   public void start0O2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Registro Inspeccion H", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0O0( ) ;
   }

   public void ws0O2( )
   {
      start0O2( ) ;
      evt0O2( ) ;
   }

   public void evt0O2( )
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
                           A79U_NoDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtU_NoDoc_Internalname), ",", ".")) ;
                           A65U_WhsCode = httpContext.cgiGet( edtU_WhsCode_Internalname) ;
                           A63U_ItemCode = httpContext.cgiGet( edtU_ItemCode_Internalname) ;
                           A70U_NoLote = httpContext.cgiGet( edtU_NoLote_Internalname) ;
                           A73U_Cantidad = localUtil.ctol( httpContext.cgiGet( edtU_Cantidad_Internalname), ",", ".") ;
                           A74U_Bultos = (int)(localUtil.ctol( httpContext.cgiGet( edtU_Bultos_Internalname), ",", ".")) ;
                           A75U_BultosMu = (int)(localUtil.ctol( httpContext.cgiGet( edtU_BultosMu_Internalname), ",", ".")) ;
                           A86U_Traslado = httpContext.cgiGet( edtU_Traslado_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e190O2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e200O2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cu_nodoc Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCU_NODOC"), ",", ".") != AV6cU_NoDoc )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cu_whscode Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_WHSCODE"), AV7cU_WhsCode) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cu_itemcode Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_ITEMCODE"), AV8cU_ItemCode) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cu_nolote Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_NOLOTE"), AV9cU_NoLote) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cu_cantidad Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCU_CANTIDAD"), ",", ".") != AV10cU_Cantidad )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cu_bultos Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCU_BULTOS"), ",", ".") != AV11cU_Bultos )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cu_bultosmu Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCU_BULTOSMU"), ",", ".") != AV12cU_BultosMu )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e210O2 ();
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

   public void we0O2( )
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

   public void pa0O2( )
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
                                  int AV6cU_NoDoc ,
                                  String AV7cU_WhsCode ,
                                  String AV8cU_ItemCode ,
                                  String AV9cU_NoLote ,
                                  long AV10cU_Cantidad ,
                                  int AV11cU_Bultos ,
                                  int AV12cU_BultosMu )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0O2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_NODOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_NODOC", GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_WHSCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A65U_WhsCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_WHSCODE", A65U_WhsCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_ITEMCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A63U_ItemCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_ITEMCODE", A63U_ItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_NOLOTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A70U_NoLote, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_NOLOTE", A70U_NoLote);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CANTIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_CANTIDAD", GXutil.ltrim( localUtil.ntoc( A73U_Cantidad, (byte)(18), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_BULTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_BULTOS", GXutil.ltrim( localUtil.ntoc( A74U_Bultos, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_BULTOSMU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_BULTOSMU", GXutil.ltrim( localUtil.ntoc( A75U_BultosMu, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_TRASLADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A86U_Traslado, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_TRASLADO", GXutil.rtrim( A86U_Traslado));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0O2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0O2( )
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
                                              AV7cU_WhsCode ,
                                              AV8cU_ItemCode ,
                                              AV9cU_NoLote ,
                                              new Long(AV10cU_Cantidad) ,
                                              new Integer(AV11cU_Bultos) ,
                                              new Integer(AV12cU_BultosMu) ,
                                              A65U_WhsCode ,
                                              A63U_ItemCode ,
                                              A70U_NoLote ,
                                              new Long(A73U_Cantidad) ,
                                              new Integer(A74U_Bultos) ,
                                              new Integer(A75U_BultosMu) ,
                                              new Integer(AV6cU_NoDoc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT
                                              }
         } ) ;
         lV7cU_WhsCode = GXutil.concat( GXutil.rtrim( AV7cU_WhsCode), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cU_WhsCode", AV7cU_WhsCode);
         lV8cU_ItemCode = GXutil.concat( GXutil.rtrim( AV8cU_ItemCode), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cU_ItemCode", AV8cU_ItemCode);
         lV9cU_NoLote = GXutil.concat( GXutil.rtrim( AV9cU_NoLote), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cU_NoLote", AV9cU_NoLote);
         /* Using cursor H000O2 */
         pr_default.execute(0, new Object[] {new Integer(AV6cU_NoDoc), lV7cU_WhsCode, lV8cU_ItemCode, lV9cU_NoLote, new Long(AV10cU_Cantidad), new Integer(AV11cU_Bultos), new Integer(AV12cU_BultosMu), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A86U_Traslado = H000O2_A86U_Traslado[0] ;
            A75U_BultosMu = H000O2_A75U_BultosMu[0] ;
            A74U_Bultos = H000O2_A74U_Bultos[0] ;
            A73U_Cantidad = H000O2_A73U_Cantidad[0] ;
            A70U_NoLote = H000O2_A70U_NoLote[0] ;
            A63U_ItemCode = H000O2_A63U_ItemCode[0] ;
            A65U_WhsCode = H000O2_A65U_WhsCode[0] ;
            A79U_NoDoc = H000O2_A79U_NoDoc[0] ;
            /* Execute user event: Load */
            e200O2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb0O0( ) ;
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
                                           AV7cU_WhsCode ,
                                           AV8cU_ItemCode ,
                                           AV9cU_NoLote ,
                                           new Long(AV10cU_Cantidad) ,
                                           new Integer(AV11cU_Bultos) ,
                                           new Integer(AV12cU_BultosMu) ,
                                           A65U_WhsCode ,
                                           A63U_ItemCode ,
                                           A70U_NoLote ,
                                           new Long(A73U_Cantidad) ,
                                           new Integer(A74U_Bultos) ,
                                           new Integer(A75U_BultosMu) ,
                                           new Integer(AV6cU_NoDoc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT
                                           }
      } ) ;
      lV7cU_WhsCode = GXutil.concat( GXutil.rtrim( AV7cU_WhsCode), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cU_WhsCode", AV7cU_WhsCode);
      lV8cU_ItemCode = GXutil.concat( GXutil.rtrim( AV8cU_ItemCode), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cU_ItemCode", AV8cU_ItemCode);
      lV9cU_NoLote = GXutil.concat( GXutil.rtrim( AV9cU_NoLote), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cU_NoLote", AV9cU_NoLote);
      /* Using cursor H000O3 */
      pr_default.execute(1, new Object[] {new Integer(AV6cU_NoDoc), lV7cU_WhsCode, lV8cU_ItemCode, lV9cU_NoLote, new Long(AV10cU_Cantidad), new Integer(AV11cU_Bultos), new Integer(AV12cU_BultosMu)});
      GRID1_nRecordCount = H000O3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cU_NoDoc, AV7cU_WhsCode, AV8cU_ItemCode, AV9cU_NoLote, AV10cU_Cantidad, AV11cU_Bultos, AV12cU_BultosMu) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cU_NoDoc, AV7cU_WhsCode, AV8cU_ItemCode, AV9cU_NoLote, AV10cU_Cantidad, AV11cU_Bultos, AV12cU_BultosMu) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cU_NoDoc, AV7cU_WhsCode, AV8cU_ItemCode, AV9cU_NoLote, AV10cU_Cantidad, AV11cU_Bultos, AV12cU_BultosMu) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cU_NoDoc, AV7cU_WhsCode, AV8cU_ItemCode, AV9cU_NoLote, AV10cU_Cantidad, AV11cU_Bultos, AV12cU_BultosMu) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cU_NoDoc, AV7cU_WhsCode, AV8cU_ItemCode, AV9cU_NoLote, AV10cU_Cantidad, AV11cU_Bultos, AV12cU_BultosMu) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0O0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e190O2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCu_nodoc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCu_nodoc_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCU_NODOC");
            GX_FocusControl = edtavCu_nodoc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cU_NoDoc = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cU_NoDoc", GXutil.ltrim( GXutil.str( AV6cU_NoDoc, 9, 0)));
         }
         else
         {
            AV6cU_NoDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtavCu_nodoc_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cU_NoDoc", GXutil.ltrim( GXutil.str( AV6cU_NoDoc, 9, 0)));
         }
         AV7cU_WhsCode = httpContext.cgiGet( edtavCu_whscode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cU_WhsCode", AV7cU_WhsCode);
         AV8cU_ItemCode = httpContext.cgiGet( edtavCu_itemcode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cU_ItemCode", AV8cU_ItemCode);
         AV9cU_NoLote = httpContext.cgiGet( edtavCu_nolote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cU_NoLote", AV9cU_NoLote);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCu_cantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCu_cantidad_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCU_CANTIDAD");
            GX_FocusControl = edtavCu_cantidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cU_Cantidad = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cU_Cantidad", GXutil.ltrim( GXutil.str( AV10cU_Cantidad, 18, 0)));
         }
         else
         {
            AV10cU_Cantidad = localUtil.ctol( httpContext.cgiGet( edtavCu_cantidad_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cU_Cantidad", GXutil.ltrim( GXutil.str( AV10cU_Cantidad, 18, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCu_bultos_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCu_bultos_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCU_BULTOS");
            GX_FocusControl = edtavCu_bultos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cU_Bultos = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cU_Bultos", GXutil.ltrim( GXutil.str( AV11cU_Bultos, 9, 0)));
         }
         else
         {
            AV11cU_Bultos = (int)(localUtil.ctol( httpContext.cgiGet( edtavCu_bultos_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cU_Bultos", GXutil.ltrim( GXutil.str( AV11cU_Bultos, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCu_bultosmu_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCu_bultosmu_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCU_BULTOSMU");
            GX_FocusControl = edtavCu_bultosmu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cU_BultosMu = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cU_BultosMu", GXutil.ltrim( GXutil.str( AV12cU_BultosMu, 9, 0)));
         }
         else
         {
            AV12cU_BultosMu = (int)(localUtil.ctol( httpContext.cgiGet( edtavCu_bultosmu_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cU_BultosMu", GXutil.ltrim( GXutil.str( AV12cU_BultosMu, 9, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCU_NODOC"), ",", ".") != AV6cU_NoDoc )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_WHSCODE"), AV7cU_WhsCode) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_ITEMCODE"), AV8cU_ItemCode) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCU_NOLOTE"), AV9cU_NoLote) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCU_CANTIDAD"), ",", ".") != AV10cU_Cantidad )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCU_BULTOS"), ",", ".") != AV11cU_Bultos )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCU_BULTOSMU"), ",", ".") != AV12cU_BultosMu )
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
      e190O2 ();
      if (returnInSub) return;
   }

   public void e190O2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Registro Inspeccion H", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e200O2( )
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
      e210O2 ();
      if (returnInSub) return;
   }

   public void e210O2( )
   {
      /* Enter Routine */
      AV13pU_NoDoc = A79U_NoDoc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pU_NoDoc", GXutil.ltrim( GXutil.str( AV13pU_NoDoc, 9, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pU_NoDoc)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pU_NoDoc = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pU_NoDoc", GXutil.ltrim( GXutil.str( AV13pU_NoDoc, 9, 0)));
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
      pa0O2( ) ;
      ws0O2( ) ;
      we0O2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20181511411354");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gx0040.js", "?20181511411356");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtU_NoDoc_Internalname = "U_NODOC_"+sGXsfl_84_idx ;
      edtU_WhsCode_Internalname = "U_WHSCODE_"+sGXsfl_84_idx ;
      edtU_ItemCode_Internalname = "U_ITEMCODE_"+sGXsfl_84_idx ;
      edtU_NoLote_Internalname = "U_NOLOTE_"+sGXsfl_84_idx ;
      edtU_Cantidad_Internalname = "U_CANTIDAD_"+sGXsfl_84_idx ;
      edtU_Bultos_Internalname = "U_BULTOS_"+sGXsfl_84_idx ;
      edtU_BultosMu_Internalname = "U_BULTOSMU_"+sGXsfl_84_idx ;
      edtU_Traslado_Internalname = "U_TRASLADO_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtU_NoDoc_Internalname = "U_NODOC_"+sGXsfl_84_fel_idx ;
      edtU_WhsCode_Internalname = "U_WHSCODE_"+sGXsfl_84_fel_idx ;
      edtU_ItemCode_Internalname = "U_ITEMCODE_"+sGXsfl_84_fel_idx ;
      edtU_NoLote_Internalname = "U_NOLOTE_"+sGXsfl_84_fel_idx ;
      edtU_Cantidad_Internalname = "U_CANTIDAD_"+sGXsfl_84_fel_idx ;
      edtU_Bultos_Internalname = "U_BULTOS_"+sGXsfl_84_fel_idx ;
      edtU_BultosMu_Internalname = "U_BULTOSMU_"+sGXsfl_84_fel_idx ;
      edtU_Traslado_Internalname = "U_TRASLADO_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb0O0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_NoDoc_Internalname,GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_NoDoc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtU_WhsCode_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtU_WhsCode_Internalname, "Link", edtU_WhsCode_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_WhsCode_Internalname,A65U_WhsCode,"","","'"+""+"'"+",false,"+"'"+""+"'",edtU_WhsCode_Link,"","","",edtU_WhsCode_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_ItemCode_Internalname,A63U_ItemCode,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_ItemCode_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_NoLote_Internalname,A70U_NoLote,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_NoLote_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(32),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_Cantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A73U_Cantidad, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_Cantidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_Bultos_Internalname,GXutil.ltrim( localUtil.ntoc( A74U_Bultos, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_Bultos_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_BultosMu_Internalname,GXutil.ltrim( localUtil.ntoc( A75U_BultosMu, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_BultosMu_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_Traslado_Internalname,GXutil.rtrim( A86U_Traslado),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_Traslado_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_NODOC"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_WHSCODE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A65U_WhsCode, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_ITEMCODE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A63U_ItemCode, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_NOLOTE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A70U_NoLote, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CANTIDAD"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_BULTOS"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_BULTOSMU"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_TRASLADO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A86U_Traslado, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblu_nodocfilter_Internalname = "LBLU_NODOCFILTER" ;
      edtavCu_nodoc_Internalname = "vCU_NODOC" ;
      divU_nodocfiltercontainer_Internalname = "U_NODOCFILTERCONTAINER" ;
      lblLblu_whscodefilter_Internalname = "LBLU_WHSCODEFILTER" ;
      edtavCu_whscode_Internalname = "vCU_WHSCODE" ;
      divU_whscodefiltercontainer_Internalname = "U_WHSCODEFILTERCONTAINER" ;
      lblLblu_itemcodefilter_Internalname = "LBLU_ITEMCODEFILTER" ;
      edtavCu_itemcode_Internalname = "vCU_ITEMCODE" ;
      divU_itemcodefiltercontainer_Internalname = "U_ITEMCODEFILTERCONTAINER" ;
      lblLblu_nolotefilter_Internalname = "LBLU_NOLOTEFILTER" ;
      edtavCu_nolote_Internalname = "vCU_NOLOTE" ;
      divU_nolotefiltercontainer_Internalname = "U_NOLOTEFILTERCONTAINER" ;
      lblLblu_cantidadfilter_Internalname = "LBLU_CANTIDADFILTER" ;
      edtavCu_cantidad_Internalname = "vCU_CANTIDAD" ;
      divU_cantidadfiltercontainer_Internalname = "U_CANTIDADFILTERCONTAINER" ;
      lblLblu_bultosfilter_Internalname = "LBLU_BULTOSFILTER" ;
      edtavCu_bultos_Internalname = "vCU_BULTOS" ;
      divU_bultosfiltercontainer_Internalname = "U_BULTOSFILTERCONTAINER" ;
      lblLblu_bultosmufilter_Internalname = "LBLU_BULTOSMUFILTER" ;
      edtavCu_bultosmu_Internalname = "vCU_BULTOSMU" ;
      divU_bultosmufiltercontainer_Internalname = "U_BULTOSMUFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtU_NoDoc_Internalname = "U_NODOC" ;
      edtU_WhsCode_Internalname = "U_WHSCODE" ;
      edtU_ItemCode_Internalname = "U_ITEMCODE" ;
      edtU_NoLote_Internalname = "U_NOLOTE" ;
      edtU_Cantidad_Internalname = "U_CANTIDAD" ;
      edtU_Bultos_Internalname = "U_BULTOS" ;
      edtU_BultosMu_Internalname = "U_BULTOSMU" ;
      edtU_Traslado_Internalname = "U_TRASLADO" ;
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
      edtU_Traslado_Jsonclick = "" ;
      edtU_BultosMu_Jsonclick = "" ;
      edtU_Bultos_Jsonclick = "" ;
      edtU_Cantidad_Jsonclick = "" ;
      edtU_NoLote_Jsonclick = "" ;
      edtU_ItemCode_Jsonclick = "" ;
      edtU_WhsCode_Jsonclick = "" ;
      edtU_NoDoc_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtU_WhsCode_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCu_bultosmu_Jsonclick = "" ;
      edtavCu_bultosmu_Enabled = 1 ;
      edtavCu_bultosmu_Visible = 1 ;
      edtavCu_bultos_Jsonclick = "" ;
      edtavCu_bultos_Enabled = 1 ;
      edtavCu_bultos_Visible = 1 ;
      edtavCu_cantidad_Jsonclick = "" ;
      edtavCu_cantidad_Enabled = 1 ;
      edtavCu_cantidad_Visible = 1 ;
      edtavCu_nolote_Jsonclick = "" ;
      edtavCu_nolote_Enabled = 1 ;
      edtavCu_nolote_Visible = 1 ;
      edtavCu_itemcode_Jsonclick = "" ;
      edtavCu_itemcode_Enabled = 1 ;
      edtavCu_itemcode_Visible = 1 ;
      edtavCu_whscode_Jsonclick = "" ;
      edtavCu_whscode_Enabled = 1 ;
      edtavCu_whscode_Visible = 1 ;
      edtavCu_nodoc_Jsonclick = "" ;
      edtavCu_nodoc_Enabled = 1 ;
      edtavCu_nodoc_Visible = 1 ;
      divU_bultosmufiltercontainer_Class = "AdvancedContainerItem" ;
      divU_bultosfiltercontainer_Class = "AdvancedContainerItem" ;
      divU_cantidadfiltercontainer_Class = "AdvancedContainerItem" ;
      divU_nolotefiltercontainer_Class = "AdvancedContainerItem" ;
      divU_itemcodefiltercontainer_Class = "AdvancedContainerItem" ;
      divU_whscodefiltercontainer_Class = "AdvancedContainerItem" ;
      divU_nodocfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Registro Inspeccion H" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cU_NoDoc',fld:'vCU_NODOC',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cU_WhsCode',fld:'vCU_WHSCODE',pic:'',nv:''},{av:'AV8cU_ItemCode',fld:'vCU_ITEMCODE',pic:'',nv:''},{av:'AV9cU_NoLote',fld:'vCU_NOLOTE',pic:'',nv:''},{av:'AV10cU_Cantidad',fld:'vCU_CANTIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cU_Bultos',fld:'vCU_BULTOS',pic:'ZZZZZZZZ9',nv:0},{av:'AV12cU_BultosMu',fld:'vCU_BULTOSMU',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e180O1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLU_NODOCFILTER.CLICK","{handler:'e110O1',iparms:[{av:'divU_nodocfiltercontainer_Class',ctrl:'U_NODOCFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divU_nodocfiltercontainer_Class',ctrl:'U_NODOCFILTERCONTAINER',prop:'Class'},{av:'edtavCu_nodoc_Visible',ctrl:'vCU_NODOC',prop:'Visible'}]}");
      setEventMetadata("LBLU_WHSCODEFILTER.CLICK","{handler:'e120O1',iparms:[{av:'divU_whscodefiltercontainer_Class',ctrl:'U_WHSCODEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divU_whscodefiltercontainer_Class',ctrl:'U_WHSCODEFILTERCONTAINER',prop:'Class'},{av:'edtavCu_whscode_Visible',ctrl:'vCU_WHSCODE',prop:'Visible'}]}");
      setEventMetadata("LBLU_ITEMCODEFILTER.CLICK","{handler:'e130O1',iparms:[{av:'divU_itemcodefiltercontainer_Class',ctrl:'U_ITEMCODEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divU_itemcodefiltercontainer_Class',ctrl:'U_ITEMCODEFILTERCONTAINER',prop:'Class'},{av:'edtavCu_itemcode_Visible',ctrl:'vCU_ITEMCODE',prop:'Visible'}]}");
      setEventMetadata("LBLU_NOLOTEFILTER.CLICK","{handler:'e140O1',iparms:[{av:'divU_nolotefiltercontainer_Class',ctrl:'U_NOLOTEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divU_nolotefiltercontainer_Class',ctrl:'U_NOLOTEFILTERCONTAINER',prop:'Class'},{av:'edtavCu_nolote_Visible',ctrl:'vCU_NOLOTE',prop:'Visible'}]}");
      setEventMetadata("LBLU_CANTIDADFILTER.CLICK","{handler:'e150O1',iparms:[{av:'divU_cantidadfiltercontainer_Class',ctrl:'U_CANTIDADFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divU_cantidadfiltercontainer_Class',ctrl:'U_CANTIDADFILTERCONTAINER',prop:'Class'},{av:'edtavCu_cantidad_Visible',ctrl:'vCU_CANTIDAD',prop:'Visible'}]}");
      setEventMetadata("LBLU_BULTOSFILTER.CLICK","{handler:'e160O1',iparms:[{av:'divU_bultosfiltercontainer_Class',ctrl:'U_BULTOSFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divU_bultosfiltercontainer_Class',ctrl:'U_BULTOSFILTERCONTAINER',prop:'Class'},{av:'edtavCu_bultos_Visible',ctrl:'vCU_BULTOS',prop:'Visible'}]}");
      setEventMetadata("LBLU_BULTOSMUFILTER.CLICK","{handler:'e170O1',iparms:[{av:'divU_bultosmufiltercontainer_Class',ctrl:'U_BULTOSMUFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divU_bultosmufiltercontainer_Class',ctrl:'U_BULTOSMUFILTERCONTAINER',prop:'Class'},{av:'edtavCu_bultosmu_Visible',ctrl:'vCU_BULTOSMU',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e210O2',iparms:[{av:'A79U_NoDoc',fld:'U_NODOC',pic:'ZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pU_NoDoc',fld:'vPU_NODOC',pic:'ZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cU_NoDoc',fld:'vCU_NODOC',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cU_WhsCode',fld:'vCU_WHSCODE',pic:'',nv:''},{av:'AV8cU_ItemCode',fld:'vCU_ITEMCODE',pic:'',nv:''},{av:'AV9cU_NoLote',fld:'vCU_NOLOTE',pic:'',nv:''},{av:'AV10cU_Cantidad',fld:'vCU_CANTIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cU_Bultos',fld:'vCU_BULTOS',pic:'ZZZZZZZZ9',nv:0},{av:'AV12cU_BultosMu',fld:'vCU_BULTOSMU',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cU_NoDoc',fld:'vCU_NODOC',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cU_WhsCode',fld:'vCU_WHSCODE',pic:'',nv:''},{av:'AV8cU_ItemCode',fld:'vCU_ITEMCODE',pic:'',nv:''},{av:'AV9cU_NoLote',fld:'vCU_NOLOTE',pic:'',nv:''},{av:'AV10cU_Cantidad',fld:'vCU_CANTIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cU_Bultos',fld:'vCU_BULTOS',pic:'ZZZZZZZZ9',nv:0},{av:'AV12cU_BultosMu',fld:'vCU_BULTOSMU',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cU_NoDoc',fld:'vCU_NODOC',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cU_WhsCode',fld:'vCU_WHSCODE',pic:'',nv:''},{av:'AV8cU_ItemCode',fld:'vCU_ITEMCODE',pic:'',nv:''},{av:'AV9cU_NoLote',fld:'vCU_NOLOTE',pic:'',nv:''},{av:'AV10cU_Cantidad',fld:'vCU_CANTIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cU_Bultos',fld:'vCU_BULTOS',pic:'ZZZZZZZZ9',nv:0},{av:'AV12cU_BultosMu',fld:'vCU_BULTOSMU',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cU_NoDoc',fld:'vCU_NODOC',pic:'ZZZZZZZZ9',nv:0},{av:'AV7cU_WhsCode',fld:'vCU_WHSCODE',pic:'',nv:''},{av:'AV8cU_ItemCode',fld:'vCU_ITEMCODE',pic:'',nv:''},{av:'AV9cU_NoLote',fld:'vCU_NOLOTE',pic:'',nv:''},{av:'AV10cU_Cantidad',fld:'vCU_CANTIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11cU_Bultos',fld:'vCU_BULTOS',pic:'ZZZZZZZZ9',nv:0},{av:'AV12cU_BultosMu',fld:'vCU_BULTOSMU',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
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
      AV7cU_WhsCode = "" ;
      AV8cU_ItemCode = "" ;
      AV9cU_NoLote = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblu_nodocfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblu_whscodefilter_Jsonclick = "" ;
      lblLblu_itemcodefilter_Jsonclick = "" ;
      lblLblu_nolotefilter_Jsonclick = "" ;
      lblLblu_cantidadfilter_Jsonclick = "" ;
      lblLblu_bultosfilter_Jsonclick = "" ;
      lblLblu_bultosmufilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A65U_WhsCode = "" ;
      A63U_ItemCode = "" ;
      A70U_NoLote = "" ;
      A86U_Traslado = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV7cU_WhsCode = "" ;
      lV8cU_ItemCode = "" ;
      lV9cU_NoLote = "" ;
      H000O2_A86U_Traslado = new String[] {""} ;
      H000O2_A75U_BultosMu = new int[1] ;
      H000O2_A74U_Bultos = new int[1] ;
      H000O2_A73U_Cantidad = new long[1] ;
      H000O2_A70U_NoLote = new String[] {""} ;
      H000O2_A63U_ItemCode = new String[] {""} ;
      H000O2_A65U_WhsCode = new String[] {""} ;
      H000O2_A79U_NoDoc = new int[1] ;
      H000O3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.gx0040__default(),
         new Object[] {
             new Object[] {
            H000O2_A86U_Traslado, H000O2_A75U_BultosMu, H000O2_A74U_Bultos, H000O2_A73U_Cantidad, H000O2_A70U_NoLote, H000O2_A63U_ItemCode, H000O2_A65U_WhsCode, H000O2_A79U_NoDoc
            }
            , new Object[] {
            H000O3_AGRID1_nRecordCount
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
   private int AV6cU_NoDoc ;
   private int AV11cU_Bultos ;
   private int AV12cU_BultosMu ;
   private int AV13pU_NoDoc ;
   private int edtavCu_nodoc_Enabled ;
   private int edtavCu_nodoc_Visible ;
   private int edtavCu_whscode_Visible ;
   private int edtavCu_whscode_Enabled ;
   private int edtavCu_itemcode_Visible ;
   private int edtavCu_itemcode_Enabled ;
   private int edtavCu_nolote_Visible ;
   private int edtavCu_nolote_Enabled ;
   private int edtavCu_cantidad_Enabled ;
   private int edtavCu_cantidad_Visible ;
   private int edtavCu_bultos_Enabled ;
   private int edtavCu_bultos_Visible ;
   private int edtavCu_bultosmu_Enabled ;
   private int edtavCu_bultosmu_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A79U_NoDoc ;
   private int A74U_Bultos ;
   private int A75U_BultosMu ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV10cU_Cantidad ;
   private long GRID1_nFirstRecordOnPage ;
   private long A73U_Cantidad ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divU_nodocfiltercontainer_Class ;
   private String divU_whscodefiltercontainer_Class ;
   private String divU_itemcodefiltercontainer_Class ;
   private String divU_nolotefiltercontainer_Class ;
   private String divU_cantidadfiltercontainer_Class ;
   private String divU_bultosfiltercontainer_Class ;
   private String divU_bultosmufiltercontainer_Class ;
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
   private String divU_nodocfiltercontainer_Internalname ;
   private String lblLblu_nodocfilter_Internalname ;
   private String lblLblu_nodocfilter_Jsonclick ;
   private String edtavCu_nodoc_Internalname ;
   private String TempTags ;
   private String edtavCu_nodoc_Jsonclick ;
   private String divU_whscodefiltercontainer_Internalname ;
   private String lblLblu_whscodefilter_Internalname ;
   private String lblLblu_whscodefilter_Jsonclick ;
   private String edtavCu_whscode_Internalname ;
   private String edtavCu_whscode_Jsonclick ;
   private String divU_itemcodefiltercontainer_Internalname ;
   private String lblLblu_itemcodefilter_Internalname ;
   private String lblLblu_itemcodefilter_Jsonclick ;
   private String edtavCu_itemcode_Internalname ;
   private String edtavCu_itemcode_Jsonclick ;
   private String divU_nolotefiltercontainer_Internalname ;
   private String lblLblu_nolotefilter_Internalname ;
   private String lblLblu_nolotefilter_Jsonclick ;
   private String edtavCu_nolote_Internalname ;
   private String edtavCu_nolote_Jsonclick ;
   private String divU_cantidadfiltercontainer_Internalname ;
   private String lblLblu_cantidadfilter_Internalname ;
   private String lblLblu_cantidadfilter_Jsonclick ;
   private String edtavCu_cantidad_Internalname ;
   private String edtavCu_cantidad_Jsonclick ;
   private String divU_bultosfiltercontainer_Internalname ;
   private String lblLblu_bultosfilter_Internalname ;
   private String lblLblu_bultosfilter_Jsonclick ;
   private String edtavCu_bultos_Internalname ;
   private String edtavCu_bultos_Jsonclick ;
   private String divU_bultosmufiltercontainer_Internalname ;
   private String lblLblu_bultosmufilter_Internalname ;
   private String lblLblu_bultosmufilter_Jsonclick ;
   private String edtavCu_bultosmu_Internalname ;
   private String edtavCu_bultosmu_Jsonclick ;
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
   private String edtU_WhsCode_Link ;
   private String A86U_Traslado ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtU_NoDoc_Internalname ;
   private String edtU_WhsCode_Internalname ;
   private String edtU_ItemCode_Internalname ;
   private String edtU_NoLote_Internalname ;
   private String edtU_Cantidad_Internalname ;
   private String edtU_Bultos_Internalname ;
   private String edtU_BultosMu_Internalname ;
   private String edtU_Traslado_Internalname ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtU_NoDoc_Jsonclick ;
   private String edtU_WhsCode_Jsonclick ;
   private String edtU_ItemCode_Jsonclick ;
   private String edtU_NoLote_Jsonclick ;
   private String edtU_Cantidad_Jsonclick ;
   private String edtU_Bultos_Jsonclick ;
   private String edtU_BultosMu_Jsonclick ;
   private String edtU_Traslado_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV7cU_WhsCode ;
   private String AV8cU_ItemCode ;
   private String AV9cU_NoLote ;
   private String A65U_WhsCode ;
   private String A63U_ItemCode ;
   private String A70U_NoLote ;
   private String AV17Linkselection_GXI ;
   private String lV7cU_WhsCode ;
   private String lV8cU_ItemCode ;
   private String lV9cU_NoLote ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H000O2_A86U_Traslado ;
   private int[] H000O2_A75U_BultosMu ;
   private int[] H000O2_A74U_Bultos ;
   private long[] H000O2_A73U_Cantidad ;
   private String[] H000O2_A70U_NoLote ;
   private String[] H000O2_A63U_ItemCode ;
   private String[] H000O2_A65U_WhsCode ;
   private int[] H000O2_A79U_NoDoc ;
   private long[] H000O3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0040__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000O2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cU_WhsCode ,
                                          String AV8cU_ItemCode ,
                                          String AV9cU_NoLote ,
                                          long AV10cU_Cantidad ,
                                          int AV11cU_Bultos ,
                                          int AV12cU_BultosMu ,
                                          String A65U_WhsCode ,
                                          String A63U_ItemCode ,
                                          String A70U_NoLote ,
                                          long A73U_Cantidad ,
                                          int A74U_Bultos ,
                                          int A75U_BultosMu ,
                                          int AV6cU_NoDoc )
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
      sSelectString = " [U_Traslado], [U_BultosMu], [U_Bultos], [U_Cantidad], [U_NoLote], [U_ItemCode]," ;
      sSelectString = sSelectString + " [U_WhsCode], [U_NoDoc]" ;
      sFromString = " FROM [RegistroInspeccionH] WITH (NOLOCK)" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE ([U_NoDoc] >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cU_WhsCode)==0) )
      {
         sWhereString = sWhereString + " and ([U_WhsCode] like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cU_ItemCode)==0) )
      {
         sWhereString = sWhereString + " and ([U_ItemCode] like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cU_NoLote)==0) )
      {
         sWhereString = sWhereString + " and ([U_NoLote] like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cU_Cantidad) )
      {
         sWhereString = sWhereString + " and ([U_Cantidad] >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cU_Bultos) )
      {
         sWhereString = sWhereString + " and ([U_Bultos] >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (0==AV12cU_BultosMu) )
      {
         sWhereString = sWhereString + " and ([U_BultosMu] >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY [U_NoDoc]" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT CAST((SELECT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) AS INTEGER) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000O3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cU_WhsCode ,
                                          String AV8cU_ItemCode ,
                                          String AV9cU_NoLote ,
                                          long AV10cU_Cantidad ,
                                          int AV11cU_Bultos ,
                                          int AV12cU_BultosMu ,
                                          String A65U_WhsCode ,
                                          String A63U_ItemCode ,
                                          String A70U_NoLote ,
                                          long A73U_Cantidad ,
                                          int A74U_Bultos ,
                                          int A75U_BultosMu ,
                                          int AV6cU_NoDoc )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM [RegistroInspeccionH] WITH (NOLOCK)" ;
      scmdbuf = scmdbuf + " WHERE ([U_NoDoc] >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cU_WhsCode)==0) )
      {
         sWhereString = sWhereString + " and ([U_WhsCode] like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cU_ItemCode)==0) )
      {
         sWhereString = sWhereString + " and ([U_ItemCode] like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cU_NoLote)==0) )
      {
         sWhereString = sWhereString + " and ([U_NoLote] like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cU_Cantidad) )
      {
         sWhereString = sWhereString + " and ([U_Cantidad] >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cU_Bultos) )
      {
         sWhereString = sWhereString + " and ([U_Bultos] >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (0==AV12cU_BultosMu) )
      {
         sWhereString = sWhereString + " and ([U_BultosMu] >= ?)" ;
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
                  return conditional_H000O2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H000O3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000O2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000O3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
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
                  stmt.setVarchar(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 32);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[14]).longValue(), 0);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
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
                  stmt.setVarchar(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 32);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[11]).longValue(), 0);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
      }
   }

}

