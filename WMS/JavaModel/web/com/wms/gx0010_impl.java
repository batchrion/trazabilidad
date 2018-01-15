/*
               File: gx0010_impl
        Description: Selection List Cab Entrada Mercancia
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: November 30, 2017 10:10:1.70
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

public final  class gx0010_impl extends GXDataArea
{
   public gx0010_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0010_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0010_impl.class ));
   }

   public gx0010_impl( int remoteHandle ,
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
            AV6cCabEntradaMercanciaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cOcDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cProvCarCode = httpContext.GetNextPar( ) ;
            AV9cProvCardName = httpContext.GetNextPar( ) ;
            AV10cOcDocDate = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV11cOcDocDueDate = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV12cEmpresa = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cCabEntradaMercanciaId, AV7cOcDocEntry, AV8cProvCarCode, AV9cProvCardName, AV10cOcDocDate, AV11cOcDocDueDate, AV12cEmpresa) ;
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
            AV13pCabEntradaMercanciaId = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pCabEntradaMercanciaId", GXutil.ltrim( GXutil.str( AV13pCabEntradaMercanciaId, 6, 0)));
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
      pa0H2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0H2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201711301010181");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.gx0010") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pCabEntradaMercanciaId,6,0)))+"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCABENTRADAMERCANCIAID", GXutil.ltrim( localUtil.ntoc( AV6cCabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCOCDOCENTRY", GXutil.ltrim( localUtil.ntoc( AV7cOcDocEntry, (byte)(9), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPROVCARCODE", AV8cProvCarCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPROVCARDNAME", AV9cProvCardName);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCOCDOCDATE", localUtil.ttoc( AV10cOcDocDate, 10, 8, 0, 3, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCOCDOCDUEDATE", localUtil.ttoc( AV11cOcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEMPRESA", AV12cEmpresa);
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPCABENTRADAMERCANCIAID", GXutil.ltrim( localUtil.ntoc( AV13pCabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "CABENTRADAMERCANCIAIDFILTERCONTAINER_Class", GXutil.rtrim( divCabentradamercanciaidfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "OCDOCENTRYFILTERCONTAINER_Class", GXutil.rtrim( divOcdocentryfiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "PROVCARCODEFILTERCONTAINER_Class", GXutil.rtrim( divProvcarcodefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "PROVCARDNAMEFILTERCONTAINER_Class", GXutil.rtrim( divProvcardnamefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "OCDOCDATEFILTERCONTAINER_Class", GXutil.rtrim( divOcdocdatefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "OCDOCDUEDATEFILTERCONTAINER_Class", GXutil.rtrim( divOcdocduedatefiltercontainer_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "EMPRESAFILTERCONTAINER_Class", GXutil.rtrim( divEmpresafiltercontainer_Class));
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
         we0H2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0H2( ) ;
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
      return formatLink("com.wms.gx0010") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pCabEntradaMercanciaId,6,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx0010" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Cab Entrada Mercancia" ;
   }

   public void wb0H0( )
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
         com.wms.GxWebStd.gx_div_start( httpContext, divCabentradamercanciaidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCabentradamercanciaidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblcabentradamercanciaidfilter_Internalname, "Entrada Id", "", "", lblLblcabentradamercanciaidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110h1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0010.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCcabentradamercanciaid_Internalname, "Entrada Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCcabentradamercanciaid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cCabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")), ((edtavCcabentradamercanciaid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cCabEntradaMercanciaId), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cCabEntradaMercanciaId), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcabentradamercanciaid_Jsonclick, 0, "Attribute", "", "", "", edtavCcabentradamercanciaid_Visible, edtavCcabentradamercanciaid_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0010.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divOcdocentryfiltercontainer_Internalname, 1, 0, "px", 0, "px", divOcdocentryfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblocdocentryfilter_Internalname, "Oc Doc Entry", "", "", lblLblocdocentryfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120h1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0010.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCocdocentry_Internalname, "Número OC", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCocdocentry_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cOcDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtavCocdocentry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cOcDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cOcDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCocdocentry_Jsonclick, 0, "Attribute", "", "", "", edtavCocdocentry_Visible, edtavCocdocentry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0010.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divProvcarcodefiltercontainer_Internalname, 1, 0, "px", 0, "px", divProvcarcodefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblprovcarcodefilter_Internalname, "Prov Car Code", "", "", lblLblprovcarcodefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130h1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0010.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCprovcarcode_Internalname, "Cod. Proveedor", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCprovcarcode_Internalname, AV8cProvCarCode, GXutil.rtrim( localUtil.format( AV8cProvCarCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCprovcarcode_Jsonclick, 0, "Attribute", "", "", "", edtavCprovcarcode_Visible, edtavCprovcarcode_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0010.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divProvcardnamefiltercontainer_Internalname, 1, 0, "px", 0, "px", divProvcardnamefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblprovcardnamefilter_Internalname, "Prov Card Name", "", "", lblLblprovcardnamefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140h1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0010.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCprovcardname_Internalname, "Proveedor", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCprovcardname_Internalname, AV9cProvCardName, GXutil.rtrim( localUtil.format( AV9cProvCardName, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCprovcardname_Jsonclick, 0, "Attribute", "", "", "", edtavCprovcardname_Visible, edtavCprovcardname_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0010.htm");
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
         com.wms.GxWebStd.gx_div_start( httpContext, divOcdocdatefiltercontainer_Internalname, 1, 0, "px", 0, "px", divOcdocdatefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblocdocdatefilter_Internalname, "Oc Doc Date", "", "", lblLblocdocdatefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150h1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0010.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCocdocdate_Internalname, "Fecha de Emisión", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCocdocdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCocdocdate_Internalname, localUtil.ttoc( AV10cOcDocDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV10cOcDocDate, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCocdocdate_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCocdocdate_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0010.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.wms.GxWebStd.gx_div_start( httpContext, divOcdocduedatefiltercontainer_Internalname, 1, 0, "px", 0, "px", divOcdocduedatefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblocdocduedatefilter_Internalname, "Oc Doc Due Date", "", "", lblLblocdocduedatefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e160h1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0010.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCocdocduedate_Internalname, "Fecha de Vencimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCocdocduedate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCocdocduedate_Internalname, localUtil.ttoc( AV11cOcDocDueDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV11cOcDocDueDate, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCocdocduedate_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCocdocduedate_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_Gx0010.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.wms.GxWebStd.gx_div_start( httpContext, divEmpresafiltercontainer_Internalname, 1, 0, "px", 0, "px", divEmpresafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblLblempresafilter_Internalname, "Empresa", "", "", lblLblempresafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e170h1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0010.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavCempresa_Internalname, "Empresa", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavCempresa_Internalname, AV12cEmpresa, GXutil.rtrim( localUtil.format( AV12cEmpresa, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCempresa_Jsonclick, 0, "Attribute", "", "", "", edtavCempresa_Visible, edtavCempresa_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_Gx0010.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e180h1_client"+"'", TempTags, "", 2, "HLP_Gx0010.htm");
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
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Oc Doc Entry") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Prov Car Code") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Oc Doc Date") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Oc Doc Due Date") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Empresa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "por") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1OcDocEntry, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtOcDocEntry_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A3ProvCarCode);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A10Empresa);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A25UserName);
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0010.htm");
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

   public void start0H2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Cab Entrada Mercancia", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0H0( ) ;
   }

   public void ws0H2( )
   {
      start0H2( ) ;
      evt0H2( ) ;
   }

   public void evt0H2( )
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
                           A24CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( edtCabEntradaMercanciaId_Internalname), ",", ".")) ;
                           A1OcDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtOcDocEntry_Internalname), ",", ".")) ;
                           A3ProvCarCode = httpContext.cgiGet( edtProvCarCode_Internalname) ;
                           A5OcDocDate = localUtil.ctot( httpContext.cgiGet( edtOcDocDate_Internalname), 0) ;
                           A6OcDocDueDate = localUtil.ctot( httpContext.cgiGet( edtOcDocDueDate_Internalname), 0) ;
                           A10Empresa = httpContext.cgiGet( edtEmpresa_Internalname) ;
                           A25UserName = httpContext.cgiGet( edtUserName_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e190H2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e200H2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ccabentradamercanciaid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCABENTRADAMERCANCIAID"), ",", ".") != AV6cCabEntradaMercanciaId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cocdocentry Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCOCDOCENTRY"), ",", ".") != AV7cOcDocEntry )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cprovcarcode Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPROVCARCODE"), AV8cProvCarCode) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cprovcardname Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPROVCARDNAME"), AV9cProvCardName) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cocdocdate Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCOCDOCDATE"), 0), AV10cOcDocDate) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cocdocduedate Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCOCDOCDUEDATE"), 0), AV11cOcDocDueDate) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cempresa Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEMPRESA"), AV12cEmpresa) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e210H2 ();
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

   public void we0H2( )
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

   public void pa0H2( )
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
                                  int AV6cCabEntradaMercanciaId ,
                                  int AV7cOcDocEntry ,
                                  String AV8cProvCarCode ,
                                  String AV9cProvCardName ,
                                  java.util.Date AV10cOcDocDate ,
                                  java.util.Date AV11cOcDocDueDate ,
                                  String AV12cEmpresa )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0H2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CABENTRADAMERCANCIAID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "CABENTRADAMERCANCIAID", GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_OCDOCENTRY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "OCDOCENTRY", GXutil.ltrim( localUtil.ntoc( A1OcDocEntry, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROVCARCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A3ProvCarCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "PROVCARCODE", A3ProvCarCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_OCDOCDATE", getSecureSignedToken( "", localUtil.format( A5OcDocDate, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "OCDOCDATE", localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_OCDOCDUEDATE", getSecureSignedToken( "", localUtil.format( A6OcDocDueDate, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "OCDOCDUEDATE", localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRESA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A10Empresa, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "EMPRESA", A10Empresa);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_USERNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A25UserName, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "USERNAME", A25UserName);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0H2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0H2( )
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
                                              new Integer(AV7cOcDocEntry) ,
                                              AV8cProvCarCode ,
                                              AV9cProvCardName ,
                                              AV10cOcDocDate ,
                                              AV11cOcDocDueDate ,
                                              AV12cEmpresa ,
                                              new Integer(A1OcDocEntry) ,
                                              A3ProvCarCode ,
                                              A4ProvCardName ,
                                              A5OcDocDate ,
                                              A6OcDocDueDate ,
                                              A10Empresa ,
                                              new Integer(AV6cCabEntradaMercanciaId) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT
                                              }
         } ) ;
         lV8cProvCarCode = GXutil.concat( GXutil.rtrim( AV8cProvCarCode), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cProvCarCode", AV8cProvCarCode);
         lV9cProvCardName = GXutil.concat( GXutil.rtrim( AV9cProvCardName), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cProvCardName", AV9cProvCardName);
         lV12cEmpresa = GXutil.concat( GXutil.rtrim( AV12cEmpresa), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cEmpresa", AV12cEmpresa);
         /* Using cursor H000H2 */
         pr_default.execute(0, new Object[] {new Integer(AV6cCabEntradaMercanciaId), new Integer(AV7cOcDocEntry), lV8cProvCarCode, lV9cProvCardName, AV10cOcDocDate, AV11cOcDocDueDate, lV12cEmpresa, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A4ProvCardName = H000H2_A4ProvCardName[0] ;
            A25UserName = H000H2_A25UserName[0] ;
            A10Empresa = H000H2_A10Empresa[0] ;
            A6OcDocDueDate = H000H2_A6OcDocDueDate[0] ;
            A5OcDocDate = H000H2_A5OcDocDate[0] ;
            A3ProvCarCode = H000H2_A3ProvCarCode[0] ;
            A1OcDocEntry = H000H2_A1OcDocEntry[0] ;
            A24CabEntradaMercanciaId = H000H2_A24CabEntradaMercanciaId[0] ;
            /* Execute user event: Load */
            e200H2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb0H0( ) ;
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
                                           new Integer(AV7cOcDocEntry) ,
                                           AV8cProvCarCode ,
                                           AV9cProvCardName ,
                                           AV10cOcDocDate ,
                                           AV11cOcDocDueDate ,
                                           AV12cEmpresa ,
                                           new Integer(A1OcDocEntry) ,
                                           A3ProvCarCode ,
                                           A4ProvCardName ,
                                           A5OcDocDate ,
                                           A6OcDocDueDate ,
                                           A10Empresa ,
                                           new Integer(AV6cCabEntradaMercanciaId) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT
                                           }
      } ) ;
      lV8cProvCarCode = GXutil.concat( GXutil.rtrim( AV8cProvCarCode), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cProvCarCode", AV8cProvCarCode);
      lV9cProvCardName = GXutil.concat( GXutil.rtrim( AV9cProvCardName), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cProvCardName", AV9cProvCardName);
      lV12cEmpresa = GXutil.concat( GXutil.rtrim( AV12cEmpresa), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cEmpresa", AV12cEmpresa);
      /* Using cursor H000H3 */
      pr_default.execute(1, new Object[] {new Integer(AV6cCabEntradaMercanciaId), new Integer(AV7cOcDocEntry), lV8cProvCarCode, lV9cProvCardName, AV10cOcDocDate, AV11cOcDocDueDate, lV12cEmpresa});
      GRID1_nRecordCount = H000H3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCabEntradaMercanciaId, AV7cOcDocEntry, AV8cProvCarCode, AV9cProvCardName, AV10cOcDocDate, AV11cOcDocDueDate, AV12cEmpresa) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCabEntradaMercanciaId, AV7cOcDocEntry, AV8cProvCarCode, AV9cProvCardName, AV10cOcDocDate, AV11cOcDocDueDate, AV12cEmpresa) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCabEntradaMercanciaId, AV7cOcDocEntry, AV8cProvCarCode, AV9cProvCardName, AV10cOcDocDate, AV11cOcDocDueDate, AV12cEmpresa) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCabEntradaMercanciaId, AV7cOcDocEntry, AV8cProvCarCode, AV9cProvCardName, AV10cOcDocDate, AV11cOcDocDueDate, AV12cEmpresa) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCabEntradaMercanciaId, AV7cOcDocEntry, AV8cProvCarCode, AV9cProvCardName, AV10cOcDocDate, AV11cOcDocDueDate, AV12cEmpresa) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0H0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e190H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcabentradamercanciaid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcabentradamercanciaid_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCABENTRADAMERCANCIAID");
            GX_FocusControl = edtavCcabentradamercanciaid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cCabEntradaMercanciaId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cCabEntradaMercanciaId", GXutil.ltrim( GXutil.str( AV6cCabEntradaMercanciaId, 6, 0)));
         }
         else
         {
            AV6cCabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcabentradamercanciaid_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cCabEntradaMercanciaId", GXutil.ltrim( GXutil.str( AV6cCabEntradaMercanciaId, 6, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCocdocentry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCocdocentry_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOCDOCENTRY");
            GX_FocusControl = edtavCocdocentry_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cOcDocEntry = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cOcDocEntry", GXutil.ltrim( GXutil.str( AV7cOcDocEntry, 9, 0)));
         }
         else
         {
            AV7cOcDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtavCocdocentry_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cOcDocEntry", GXutil.ltrim( GXutil.str( AV7cOcDocEntry, 9, 0)));
         }
         AV8cProvCarCode = httpContext.cgiGet( edtavCprovcarcode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cProvCarCode", AV8cProvCarCode);
         AV9cProvCardName = httpContext.cgiGet( edtavCprovcardname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cProvCardName", AV9cProvCardName);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCocdocdate_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCOCDOCDATE");
            GX_FocusControl = edtavCocdocdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cOcDocDate = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10cOcDocDate", localUtil.ttoc( AV10cOcDocDate, 10, 8, 0, 3, "/", ":", " "));
         }
         else
         {
            AV10cOcDocDate = localUtil.ctot( httpContext.cgiGet( edtavCocdocdate_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cOcDocDate", localUtil.ttoc( AV10cOcDocDate, 10, 8, 0, 3, "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCocdocduedate_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCOCDOCDUEDATE");
            GX_FocusControl = edtavCocdocduedate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cOcDocDueDate = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV11cOcDocDueDate", localUtil.ttoc( AV11cOcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
         }
         else
         {
            AV11cOcDocDueDate = localUtil.ctot( httpContext.cgiGet( edtavCocdocduedate_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cOcDocDueDate", localUtil.ttoc( AV11cOcDocDueDate, 10, 8, 0, 3, "/", ":", " "));
         }
         AV12cEmpresa = httpContext.cgiGet( edtavCempresa_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cEmpresa", AV12cEmpresa);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCABENTRADAMERCANCIAID"), ",", ".") != AV6cCabEntradaMercanciaId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCOCDOCENTRY"), ",", ".") != AV7cOcDocEntry )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPROVCARCODE"), AV8cProvCarCode) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPROVCARDNAME"), AV9cProvCardName) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCOCDOCDATE"), 0), AV10cOcDocDate) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCOCDOCDUEDATE"), 0), AV11cOcDocDueDate) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEMPRESA"), AV12cEmpresa) != 0 )
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
      e190H2 ();
      if (returnInSub) return;
   }

   public void e190H2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Cab Entrada Mercancia", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e200H2( )
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
      e210H2 ();
      if (returnInSub) return;
   }

   public void e210H2( )
   {
      /* Enter Routine */
      AV13pCabEntradaMercanciaId = A24CabEntradaMercanciaId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pCabEntradaMercanciaId", GXutil.ltrim( GXutil.str( AV13pCabEntradaMercanciaId, 6, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pCabEntradaMercanciaId)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pCabEntradaMercanciaId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pCabEntradaMercanciaId", GXutil.ltrim( GXutil.str( AV13pCabEntradaMercanciaId, 6, 0)));
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
      pa0H2( ) ;
      ws0H2( ) ;
      we0H2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "?15125532");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1095272");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201711301010397");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gx0010.js", "?201711301010398");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtCabEntradaMercanciaId_Internalname = "CABENTRADAMERCANCIAID_"+sGXsfl_84_idx ;
      edtOcDocEntry_Internalname = "OCDOCENTRY_"+sGXsfl_84_idx ;
      edtProvCarCode_Internalname = "PROVCARCODE_"+sGXsfl_84_idx ;
      edtOcDocDate_Internalname = "OCDOCDATE_"+sGXsfl_84_idx ;
      edtOcDocDueDate_Internalname = "OCDOCDUEDATE_"+sGXsfl_84_idx ;
      edtEmpresa_Internalname = "EMPRESA_"+sGXsfl_84_idx ;
      edtUserName_Internalname = "USERNAME_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtCabEntradaMercanciaId_Internalname = "CABENTRADAMERCANCIAID_"+sGXsfl_84_fel_idx ;
      edtOcDocEntry_Internalname = "OCDOCENTRY_"+sGXsfl_84_fel_idx ;
      edtProvCarCode_Internalname = "PROVCARCODE_"+sGXsfl_84_fel_idx ;
      edtOcDocDate_Internalname = "OCDOCDATE_"+sGXsfl_84_fel_idx ;
      edtOcDocDueDate_Internalname = "OCDOCDUEDATE_"+sGXsfl_84_fel_idx ;
      edtEmpresa_Internalname = "EMPRESA_"+sGXsfl_84_fel_idx ;
      edtUserName_Internalname = "USERNAME_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb0H0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCabEntradaMercanciaId_Internalname,GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCabEntradaMercanciaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtOcDocEntry_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtOcDocEntry_Internalname, "Link", edtOcDocEntry_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOcDocEntry_Internalname,GXutil.ltrim( localUtil.ntoc( A1OcDocEntry, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtOcDocEntry_Link,"","","",edtOcDocEntry_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProvCarCode_Internalname,A3ProvCarCode,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProvCarCode_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOcDocDate_Internalname,localUtil.ttoc( A5OcDocDate, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A5OcDocDate, "99/99/9999 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOcDocDate_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOcDocDueDate_Internalname,localUtil.ttoc( A6OcDocDueDate, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A6OcDocDueDate, "99/99/9999 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOcDocDueDate_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresa_Internalname,A10Empresa,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresa_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUserName_Internalname,A25UserName,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUserName_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CABENTRADAMERCANCIAID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_OCDOCENTRY"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROVCARCODE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A3ProvCarCode, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_OCDOCDATE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( A5OcDocDate, "99/99/9999 99:99:99")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_OCDOCDUEDATE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( A6OcDocDueDate, "99/99/9999 99:99:99")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRESA"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A10Empresa, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_USERNAME"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A25UserName, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblcabentradamercanciaidfilter_Internalname = "LBLCABENTRADAMERCANCIAIDFILTER" ;
      edtavCcabentradamercanciaid_Internalname = "vCCABENTRADAMERCANCIAID" ;
      divCabentradamercanciaidfiltercontainer_Internalname = "CABENTRADAMERCANCIAIDFILTERCONTAINER" ;
      lblLblocdocentryfilter_Internalname = "LBLOCDOCENTRYFILTER" ;
      edtavCocdocentry_Internalname = "vCOCDOCENTRY" ;
      divOcdocentryfiltercontainer_Internalname = "OCDOCENTRYFILTERCONTAINER" ;
      lblLblprovcarcodefilter_Internalname = "LBLPROVCARCODEFILTER" ;
      edtavCprovcarcode_Internalname = "vCPROVCARCODE" ;
      divProvcarcodefiltercontainer_Internalname = "PROVCARCODEFILTERCONTAINER" ;
      lblLblprovcardnamefilter_Internalname = "LBLPROVCARDNAMEFILTER" ;
      edtavCprovcardname_Internalname = "vCPROVCARDNAME" ;
      divProvcardnamefiltercontainer_Internalname = "PROVCARDNAMEFILTERCONTAINER" ;
      lblLblocdocdatefilter_Internalname = "LBLOCDOCDATEFILTER" ;
      edtavCocdocdate_Internalname = "vCOCDOCDATE" ;
      divOcdocdatefiltercontainer_Internalname = "OCDOCDATEFILTERCONTAINER" ;
      lblLblocdocduedatefilter_Internalname = "LBLOCDOCDUEDATEFILTER" ;
      edtavCocdocduedate_Internalname = "vCOCDOCDUEDATE" ;
      divOcdocduedatefiltercontainer_Internalname = "OCDOCDUEDATEFILTERCONTAINER" ;
      lblLblempresafilter_Internalname = "LBLEMPRESAFILTER" ;
      edtavCempresa_Internalname = "vCEMPRESA" ;
      divEmpresafiltercontainer_Internalname = "EMPRESAFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtCabEntradaMercanciaId_Internalname = "CABENTRADAMERCANCIAID" ;
      edtOcDocEntry_Internalname = "OCDOCENTRY" ;
      edtProvCarCode_Internalname = "PROVCARCODE" ;
      edtOcDocDate_Internalname = "OCDOCDATE" ;
      edtOcDocDueDate_Internalname = "OCDOCDUEDATE" ;
      edtEmpresa_Internalname = "EMPRESA" ;
      edtUserName_Internalname = "USERNAME" ;
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
      edtUserName_Jsonclick = "" ;
      edtEmpresa_Jsonclick = "" ;
      edtOcDocDueDate_Jsonclick = "" ;
      edtOcDocDate_Jsonclick = "" ;
      edtProvCarCode_Jsonclick = "" ;
      edtOcDocEntry_Jsonclick = "" ;
      edtCabEntradaMercanciaId_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtOcDocEntry_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCempresa_Jsonclick = "" ;
      edtavCempresa_Enabled = 1 ;
      edtavCempresa_Visible = 1 ;
      edtavCocdocduedate_Jsonclick = "" ;
      edtavCocdocduedate_Enabled = 1 ;
      edtavCocdocdate_Jsonclick = "" ;
      edtavCocdocdate_Enabled = 1 ;
      edtavCprovcardname_Jsonclick = "" ;
      edtavCprovcardname_Enabled = 1 ;
      edtavCprovcardname_Visible = 1 ;
      edtavCprovcarcode_Jsonclick = "" ;
      edtavCprovcarcode_Enabled = 1 ;
      edtavCprovcarcode_Visible = 1 ;
      edtavCocdocentry_Jsonclick = "" ;
      edtavCocdocentry_Enabled = 1 ;
      edtavCocdocentry_Visible = 1 ;
      edtavCcabentradamercanciaid_Jsonclick = "" ;
      edtavCcabentradamercanciaid_Enabled = 1 ;
      edtavCcabentradamercanciaid_Visible = 1 ;
      divEmpresafiltercontainer_Class = "AdvancedContainerItem" ;
      divOcdocduedatefiltercontainer_Class = "AdvancedContainerItem" ;
      divOcdocdatefiltercontainer_Class = "AdvancedContainerItem" ;
      divProvcardnamefiltercontainer_Class = "AdvancedContainerItem" ;
      divProvcarcodefiltercontainer_Class = "AdvancedContainerItem" ;
      divOcdocentryfiltercontainer_Class = "AdvancedContainerItem" ;
      divCabentradamercanciaidfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Cab Entrada Mercancia" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cCabEntradaMercanciaId',fld:'vCCABENTRADAMERCANCIAID',pic:'ZZZZZ9',nv:0},{av:'AV7cOcDocEntry',fld:'vCOCDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cProvCarCode',fld:'vCPROVCARCODE',pic:'',nv:''},{av:'AV9cProvCardName',fld:'vCPROVCARDNAME',pic:'',nv:''},{av:'AV10cOcDocDate',fld:'vCOCDOCDATE',pic:'99/99/9999 99:99:99',nv:''},{av:'AV11cOcDocDueDate',fld:'vCOCDOCDUEDATE',pic:'99/99/9999 99:99:99',nv:''},{av:'AV12cEmpresa',fld:'vCEMPRESA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e180H1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLCABENTRADAMERCANCIAIDFILTER.CLICK","{handler:'e110H1',iparms:[{av:'divCabentradamercanciaidfiltercontainer_Class',ctrl:'CABENTRADAMERCANCIAIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCabentradamercanciaidfiltercontainer_Class',ctrl:'CABENTRADAMERCANCIAIDFILTERCONTAINER',prop:'Class'},{av:'edtavCcabentradamercanciaid_Visible',ctrl:'vCCABENTRADAMERCANCIAID',prop:'Visible'}]}");
      setEventMetadata("LBLOCDOCENTRYFILTER.CLICK","{handler:'e120H1',iparms:[{av:'divOcdocentryfiltercontainer_Class',ctrl:'OCDOCENTRYFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divOcdocentryfiltercontainer_Class',ctrl:'OCDOCENTRYFILTERCONTAINER',prop:'Class'},{av:'edtavCocdocentry_Visible',ctrl:'vCOCDOCENTRY',prop:'Visible'}]}");
      setEventMetadata("LBLPROVCARCODEFILTER.CLICK","{handler:'e130H1',iparms:[{av:'divProvcarcodefiltercontainer_Class',ctrl:'PROVCARCODEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divProvcarcodefiltercontainer_Class',ctrl:'PROVCARCODEFILTERCONTAINER',prop:'Class'},{av:'edtavCprovcarcode_Visible',ctrl:'vCPROVCARCODE',prop:'Visible'}]}");
      setEventMetadata("LBLPROVCARDNAMEFILTER.CLICK","{handler:'e140H1',iparms:[{av:'divProvcardnamefiltercontainer_Class',ctrl:'PROVCARDNAMEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divProvcardnamefiltercontainer_Class',ctrl:'PROVCARDNAMEFILTERCONTAINER',prop:'Class'},{av:'edtavCprovcardname_Visible',ctrl:'vCPROVCARDNAME',prop:'Visible'}]}");
      setEventMetadata("LBLOCDOCDATEFILTER.CLICK","{handler:'e150H1',iparms:[{av:'divOcdocdatefiltercontainer_Class',ctrl:'OCDOCDATEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divOcdocdatefiltercontainer_Class',ctrl:'OCDOCDATEFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLOCDOCDUEDATEFILTER.CLICK","{handler:'e160H1',iparms:[{av:'divOcdocduedatefiltercontainer_Class',ctrl:'OCDOCDUEDATEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divOcdocduedatefiltercontainer_Class',ctrl:'OCDOCDUEDATEFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLEMPRESAFILTER.CLICK","{handler:'e170H1',iparms:[{av:'divEmpresafiltercontainer_Class',ctrl:'EMPRESAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divEmpresafiltercontainer_Class',ctrl:'EMPRESAFILTERCONTAINER',prop:'Class'},{av:'edtavCempresa_Visible',ctrl:'vCEMPRESA',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e210H2',iparms:[{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pCabEntradaMercanciaId',fld:'vPCABENTRADAMERCANCIAID',pic:'ZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cCabEntradaMercanciaId',fld:'vCCABENTRADAMERCANCIAID',pic:'ZZZZZ9',nv:0},{av:'AV7cOcDocEntry',fld:'vCOCDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cProvCarCode',fld:'vCPROVCARCODE',pic:'',nv:''},{av:'AV9cProvCardName',fld:'vCPROVCARDNAME',pic:'',nv:''},{av:'AV10cOcDocDate',fld:'vCOCDOCDATE',pic:'99/99/9999 99:99:99',nv:''},{av:'AV11cOcDocDueDate',fld:'vCOCDOCDUEDATE',pic:'99/99/9999 99:99:99',nv:''},{av:'AV12cEmpresa',fld:'vCEMPRESA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cCabEntradaMercanciaId',fld:'vCCABENTRADAMERCANCIAID',pic:'ZZZZZ9',nv:0},{av:'AV7cOcDocEntry',fld:'vCOCDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cProvCarCode',fld:'vCPROVCARCODE',pic:'',nv:''},{av:'AV9cProvCardName',fld:'vCPROVCARDNAME',pic:'',nv:''},{av:'AV10cOcDocDate',fld:'vCOCDOCDATE',pic:'99/99/9999 99:99:99',nv:''},{av:'AV11cOcDocDueDate',fld:'vCOCDOCDUEDATE',pic:'99/99/9999 99:99:99',nv:''},{av:'AV12cEmpresa',fld:'vCEMPRESA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cCabEntradaMercanciaId',fld:'vCCABENTRADAMERCANCIAID',pic:'ZZZZZ9',nv:0},{av:'AV7cOcDocEntry',fld:'vCOCDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cProvCarCode',fld:'vCPROVCARCODE',pic:'',nv:''},{av:'AV9cProvCardName',fld:'vCPROVCARDNAME',pic:'',nv:''},{av:'AV10cOcDocDate',fld:'vCOCDOCDATE',pic:'99/99/9999 99:99:99',nv:''},{av:'AV11cOcDocDueDate',fld:'vCOCDOCDUEDATE',pic:'99/99/9999 99:99:99',nv:''},{av:'AV12cEmpresa',fld:'vCEMPRESA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cCabEntradaMercanciaId',fld:'vCCABENTRADAMERCANCIAID',pic:'ZZZZZ9',nv:0},{av:'AV7cOcDocEntry',fld:'vCOCDOCENTRY',pic:'ZZZZZZZZ9',nv:0},{av:'AV8cProvCarCode',fld:'vCPROVCARCODE',pic:'',nv:''},{av:'AV9cProvCardName',fld:'vCPROVCARDNAME',pic:'',nv:''},{av:'AV10cOcDocDate',fld:'vCOCDOCDATE',pic:'99/99/9999 99:99:99',nv:''},{av:'AV11cOcDocDueDate',fld:'vCOCDOCDUEDATE',pic:'99/99/9999 99:99:99',nv:''},{av:'AV12cEmpresa',fld:'vCEMPRESA',pic:'',nv:''}],oparms:[]}");
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
      AV8cProvCarCode = "" ;
      AV9cProvCardName = "" ;
      AV10cOcDocDate = GXutil.resetTime( GXutil.nullDate() );
      AV11cOcDocDueDate = GXutil.resetTime( GXutil.nullDate() );
      AV12cEmpresa = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblcabentradamercanciaidfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblocdocentryfilter_Jsonclick = "" ;
      lblLblprovcarcodefilter_Jsonclick = "" ;
      lblLblprovcardnamefilter_Jsonclick = "" ;
      lblLblocdocdatefilter_Jsonclick = "" ;
      lblLblocdocduedatefilter_Jsonclick = "" ;
      lblLblempresafilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A3ProvCarCode = "" ;
      A5OcDocDate = GXutil.resetTime( GXutil.nullDate() );
      A6OcDocDueDate = GXutil.resetTime( GXutil.nullDate() );
      A10Empresa = "" ;
      A25UserName = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV8cProvCarCode = "" ;
      lV9cProvCardName = "" ;
      lV12cEmpresa = "" ;
      A4ProvCardName = "" ;
      H000H2_A4ProvCardName = new String[] {""} ;
      H000H2_A25UserName = new String[] {""} ;
      H000H2_A10Empresa = new String[] {""} ;
      H000H2_A6OcDocDueDate = new java.util.Date[] {GXutil.nullDate()} ;
      H000H2_A5OcDocDate = new java.util.Date[] {GXutil.nullDate()} ;
      H000H2_A3ProvCarCode = new String[] {""} ;
      H000H2_A1OcDocEntry = new int[1] ;
      H000H2_A24CabEntradaMercanciaId = new int[1] ;
      H000H3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.gx0010__default(),
         new Object[] {
             new Object[] {
            H000H2_A4ProvCardName, H000H2_A25UserName, H000H2_A10Empresa, H000H2_A6OcDocDueDate, H000H2_A5OcDocDate, H000H2_A3ProvCarCode, H000H2_A1OcDocEntry, H000H2_A24CabEntradaMercanciaId
            }
            , new Object[] {
            H000H3_AGRID1_nRecordCount
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
   private int AV6cCabEntradaMercanciaId ;
   private int AV7cOcDocEntry ;
   private int AV13pCabEntradaMercanciaId ;
   private int edtavCcabentradamercanciaid_Enabled ;
   private int edtavCcabentradamercanciaid_Visible ;
   private int edtavCocdocentry_Enabled ;
   private int edtavCocdocentry_Visible ;
   private int edtavCprovcarcode_Visible ;
   private int edtavCprovcarcode_Enabled ;
   private int edtavCprovcardname_Visible ;
   private int edtavCprovcardname_Enabled ;
   private int edtavCocdocdate_Enabled ;
   private int edtavCocdocduedate_Enabled ;
   private int edtavCempresa_Visible ;
   private int edtavCempresa_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A24CabEntradaMercanciaId ;
   private int A1OcDocEntry ;
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
   private String divCabentradamercanciaidfiltercontainer_Class ;
   private String divOcdocentryfiltercontainer_Class ;
   private String divProvcarcodefiltercontainer_Class ;
   private String divProvcardnamefiltercontainer_Class ;
   private String divOcdocdatefiltercontainer_Class ;
   private String divOcdocduedatefiltercontainer_Class ;
   private String divEmpresafiltercontainer_Class ;
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
   private String divCabentradamercanciaidfiltercontainer_Internalname ;
   private String lblLblcabentradamercanciaidfilter_Internalname ;
   private String lblLblcabentradamercanciaidfilter_Jsonclick ;
   private String edtavCcabentradamercanciaid_Internalname ;
   private String TempTags ;
   private String edtavCcabentradamercanciaid_Jsonclick ;
   private String divOcdocentryfiltercontainer_Internalname ;
   private String lblLblocdocentryfilter_Internalname ;
   private String lblLblocdocentryfilter_Jsonclick ;
   private String edtavCocdocentry_Internalname ;
   private String edtavCocdocentry_Jsonclick ;
   private String divProvcarcodefiltercontainer_Internalname ;
   private String lblLblprovcarcodefilter_Internalname ;
   private String lblLblprovcarcodefilter_Jsonclick ;
   private String edtavCprovcarcode_Internalname ;
   private String edtavCprovcarcode_Jsonclick ;
   private String divProvcardnamefiltercontainer_Internalname ;
   private String lblLblprovcardnamefilter_Internalname ;
   private String lblLblprovcardnamefilter_Jsonclick ;
   private String edtavCprovcardname_Internalname ;
   private String edtavCprovcardname_Jsonclick ;
   private String divOcdocdatefiltercontainer_Internalname ;
   private String lblLblocdocdatefilter_Internalname ;
   private String lblLblocdocdatefilter_Jsonclick ;
   private String edtavCocdocdate_Internalname ;
   private String edtavCocdocdate_Jsonclick ;
   private String divOcdocduedatefiltercontainer_Internalname ;
   private String lblLblocdocduedatefilter_Internalname ;
   private String lblLblocdocduedatefilter_Jsonclick ;
   private String edtavCocdocduedate_Internalname ;
   private String edtavCocdocduedate_Jsonclick ;
   private String divEmpresafiltercontainer_Internalname ;
   private String lblLblempresafilter_Internalname ;
   private String lblLblempresafilter_Jsonclick ;
   private String edtavCempresa_Internalname ;
   private String edtavCempresa_Jsonclick ;
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
   private String edtOcDocEntry_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtCabEntradaMercanciaId_Internalname ;
   private String edtOcDocEntry_Internalname ;
   private String edtProvCarCode_Internalname ;
   private String edtOcDocDate_Internalname ;
   private String edtOcDocDueDate_Internalname ;
   private String edtEmpresa_Internalname ;
   private String edtUserName_Internalname ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtCabEntradaMercanciaId_Jsonclick ;
   private String edtOcDocEntry_Jsonclick ;
   private String edtProvCarCode_Jsonclick ;
   private String edtOcDocDate_Jsonclick ;
   private String edtOcDocDueDate_Jsonclick ;
   private String edtEmpresa_Jsonclick ;
   private String edtUserName_Jsonclick ;
   private java.util.Date AV10cOcDocDate ;
   private java.util.Date AV11cOcDocDueDate ;
   private java.util.Date A5OcDocDate ;
   private java.util.Date A6OcDocDueDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV8cProvCarCode ;
   private String AV9cProvCardName ;
   private String AV12cEmpresa ;
   private String A3ProvCarCode ;
   private String A10Empresa ;
   private String A25UserName ;
   private String AV17Linkselection_GXI ;
   private String lV8cProvCarCode ;
   private String lV9cProvCardName ;
   private String lV12cEmpresa ;
   private String A4ProvCardName ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H000H2_A4ProvCardName ;
   private String[] H000H2_A25UserName ;
   private String[] H000H2_A10Empresa ;
   private java.util.Date[] H000H2_A6OcDocDueDate ;
   private java.util.Date[] H000H2_A5OcDocDate ;
   private String[] H000H2_A3ProvCarCode ;
   private int[] H000H2_A1OcDocEntry ;
   private int[] H000H2_A24CabEntradaMercanciaId ;
   private long[] H000H3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV7cOcDocEntry ,
                                          String AV8cProvCarCode ,
                                          String AV9cProvCardName ,
                                          java.util.Date AV10cOcDocDate ,
                                          java.util.Date AV11cOcDocDueDate ,
                                          String AV12cEmpresa ,
                                          int A1OcDocEntry ,
                                          String A3ProvCarCode ,
                                          String A4ProvCardName ,
                                          java.util.Date A5OcDocDate ,
                                          java.util.Date A6OcDocDueDate ,
                                          String A10Empresa ,
                                          int AV6cCabEntradaMercanciaId )
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
      sSelectString = " [ProvCardName], [UserName], [Empresa], [OcDocDueDate], [OcDocDate], [ProvCarCode]," ;
      sSelectString = sSelectString + " [OcDocEntry], [CabEntradaMercanciaId]" ;
      sFromString = " FROM [CabEntradaMercancia] WITH (NOLOCK)" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE ([CabEntradaMercanciaId] >= ?)" ;
      if ( ! (0==AV7cOcDocEntry) )
      {
         sWhereString = sWhereString + " and ([OcDocEntry] >= ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cProvCarCode)==0) )
      {
         sWhereString = sWhereString + " and ([ProvCarCode] like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cProvCardName)==0) )
      {
         sWhereString = sWhereString + " and ([ProvCardName] like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cOcDocDate) )
      {
         sWhereString = sWhereString + " and ([OcDocDate] >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV11cOcDocDueDate) )
      {
         sWhereString = sWhereString + " and ([OcDocDueDate] >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cEmpresa)==0) )
      {
         sWhereString = sWhereString + " and ([Empresa] like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY [CabEntradaMercanciaId]" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT CAST((SELECT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) AS INTEGER) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000H3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV7cOcDocEntry ,
                                          String AV8cProvCarCode ,
                                          String AV9cProvCardName ,
                                          java.util.Date AV10cOcDocDate ,
                                          java.util.Date AV11cOcDocDueDate ,
                                          String AV12cEmpresa ,
                                          int A1OcDocEntry ,
                                          String A3ProvCarCode ,
                                          String A4ProvCardName ,
                                          java.util.Date A5OcDocDate ,
                                          java.util.Date A6OcDocDueDate ,
                                          String A10Empresa ,
                                          int AV6cCabEntradaMercanciaId )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM [CabEntradaMercancia] WITH (NOLOCK)" ;
      scmdbuf = scmdbuf + " WHERE ([CabEntradaMercanciaId] >= ?)" ;
      if ( ! (0==AV7cOcDocEntry) )
      {
         sWhereString = sWhereString + " and ([OcDocEntry] >= ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cProvCarCode)==0) )
      {
         sWhereString = sWhereString + " and ([ProvCarCode] like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cProvCardName)==0) )
      {
         sWhereString = sWhereString + " and ([ProvCardName] like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cOcDocDate) )
      {
         sWhereString = sWhereString + " and ([OcDocDate] >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV11cOcDocDueDate) )
      {
         sWhereString = sWhereString + " and ([OcDocDueDate] >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cEmpresa)==0) )
      {
         sWhereString = sWhereString + " and ([Empresa] like ?)" ;
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
                  return conditional_H000H2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H000H3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000H3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
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
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 15);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[14], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[15], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 7);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 15);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[12], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 7);
               }
               return;
      }
   }

}

