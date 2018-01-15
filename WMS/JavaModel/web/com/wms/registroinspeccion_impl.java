/*
               File: registroinspeccion_impl
        Description: Registro de Inspección
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 15, 2018 15:39:48.96
       Program type: Main program
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class registroinspeccion_impl extends GXDataArea
{
   public registroinspeccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public registroinspeccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registroinspeccion_impl.class ));
   }

   public registroinspeccion_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      cmbavU_whscode = new HTMLChoice();
      chkavU_reanalis = UIFactory.getCheckbox(this);
      chkavU_contramu = UIFactory.getCheckbox(this);
      chkavU_muestdes = UIFactory.getCheckbox(this);
      chkavCtluvid_controlcdu_estado = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_97 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_97_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_97_idx = httpContext.GetNextPar( ) ;
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
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( ) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_GXsfl_119 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_119_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_119_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid2") == 0 )
         {
            httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26QAttributeDetail);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid2_refresh( AV26QAttributeDetail) ;
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

   public byte executeStartEvent( )
   {
      pa0W2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0W2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20181151539496");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "");
      httpContext.AddJavascriptSource("Tab/TabRender.js", "");
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.registroinspeccion") +"\">") ;
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
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Qattributedetail", AV26QAttributeDetail);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Qattributedetail", AV26QAttributeDetail);
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_97", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_97, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_119", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_119, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vQATTRIBUTEDETAIL", AV26QAttributeDetail);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vQATTRIBUTEDETAIL", AV26QAttributeDetail);
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "TAB1_Class", GXutil.rtrim( Tab1_Class));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "TAB1_Pagecount", GXutil.ltrim( localUtil.ntoc( Tab1_Pagecount, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "TAB1_Historymanagement", GXutil.booltostr( Tab1_Historymanagement));
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.wms.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we0W2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0W2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.wms.registroinspeccion")  ;
   }

   public String getPgmname( )
   {
      return "RegistroInspeccion" ;
   }

   public String getPgmdesc( )
   {
      return "Registro de Inspección" ;
   }

   public void wb0W0( )
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
         com.wms.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         com.wms.GxWebStd.gx_group_start( httpContext, grpGroup1_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_RegistroInspeccion.htm");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divGroup1table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-md-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, cmbavU_whscode.getInternalname(), "Bodega Origen", "col-sm-3 col-md-4 RequiredAttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         /* ComboBox */
         com.wms.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavU_whscode, cmbavU_whscode.getInternalname(), GXutil.rtrim( AV5U_WhsCode), 1, cmbavU_whscode.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbavU_whscode.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "RequiredAttribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,11);\"", "", true, "HLP_RegistroInspeccion.htm");
         cmbavU_whscode.setValue( GXutil.rtrim( AV5U_WhsCode) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavU_whscode.getInternalname(), "Values", cmbavU_whscode.ToJavascriptSource(), true);
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-md-5 col-md-offset-3", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_nodoc_Internalname, "Nro Doc", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_nodoc_Internalname, GXutil.ltrim( localUtil.ntoc( AV17U_NoDoc, (byte)(9), (byte)(0), ",", "")), ((edtavU_nodoc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17U_NoDoc), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17U_NoDoc), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,14);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_nodoc_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_nodoc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_itemcode_Internalname, "Producto", "col-sm-3 col-md-4 RequiredAttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_itemcode_Internalname, AV6U_ItemCode, GXutil.rtrim( localUtil.format( AV6U_ItemCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_itemcode_Jsonclick, 0, "RequiredAttribute", "", "", "", 1, edtavU_itemcode_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.wms.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage1_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110w1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-md-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
         com.wms.GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'VALIDAR\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-md-5 col-md-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_feccontr_Internalname, "Fecha Control", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavU_feccontr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_feccontr_Internalname, localUtil.ttoc( AV18U_FecContr, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV18U_FecContr, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_feccontr_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_feccontr_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtavU_feccontr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavU_feccontr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccion.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-md-5 col-md-offset-1", "left", "top", "", "", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-7", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavUvid_atrcontarthu_itemname_Internalname, AV30UVID_ATRCONTARTHU_ItemName, GXutil.rtrim( localUtil.format( AV30UVID_ATRCONTARTHU_ItemName, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUvid_atrcontarthu_itemname_Jsonclick, 0, "Attribute", "", "", "", 1, edtavUvid_atrcontarthu_itemname_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-5", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_nolote_Internalname, "Lote     ", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_nolote_Internalname, AV7U_NoLote, GXutil.rtrim( localUtil.format( AV7U_NoLote, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_nolote_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_nolote_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_fecingr_Internalname, "Fecha de Ingreso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavU_fecingr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_fecingr_Internalname, localUtil.ttoc( AV12U_FecIngr, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV12U_FecIngr, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_fecingr_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_fecingr_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtavU_fecingr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavU_fecingr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccion.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_corrlote_Internalname, "Inspecciones realizadas", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_corrlote_Internalname, GXutil.ltrim( localUtil.ntoc( AV19U_CorrLote, (byte)(9), (byte)(0), ",", "")), ((edtavU_corrlote_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19U_CorrLote), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV19U_CorrLote), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_corrlote_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_corrlote_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_cantidad_Internalname, "Cantidad producto", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_cantidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV8U_Cantidad, (byte)(18), (byte)(0), ",", "")), ((edtavU_cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_cantidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_cantidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_um_Internalname, "Unidad de Medida", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_um_Internalname, AV13U_UM, GXutil.rtrim( localUtil.format( AV13U_UM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_um_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_um_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_fecultin_Internalname, "Fecha Control Ant.", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavU_fecultin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_fecultin_Internalname, localUtil.ttoc( AV21U_FecUltIn, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV21U_FecUltIn, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_fecultin_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_fecultin_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtavU_fecultin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavU_fecultin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccion.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_bultosmu_Internalname, "Bultos a muestrear", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_bultosmu_Internalname, GXutil.ltrim( localUtil.ntoc( AV10U_BultosMu, (byte)(9), (byte)(0), ",", "")), ((edtavU_bultosmu_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10U_BultosMu), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10U_BultosMu), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_bultosmu_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_bultosmu_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_fecini_Internalname, "Fecha Inicio", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavU_fecini_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_fecini_Internalname, localUtil.ttoc( AV14U_FecIni, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV14U_FecIni, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_fecini_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_fecini_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtavU_fecini_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavU_fecini_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccion.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_cccode_Internalname, "Centro de Costo", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_cccode_Internalname, AV22U_CCCode, GXutil.rtrim( localUtil.format( AV22U_CCCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_cccode_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_cccode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_bultos_Internalname, "Número de bultos", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_bultos_Internalname, GXutil.ltrim( localUtil.ntoc( AV9U_Bultos, (byte)(9), (byte)(0), ",", "")), ((edtavU_bultos_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9U_Bultos), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9U_Bultos), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_bultos_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_bultos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_fecfin_Internalname, "Fecha Fin", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavU_fecfin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_fecfin_Internalname, localUtil.ttoc( AV15U_FecFin, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV15U_FecFin, "99/99/9999 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_fecfin_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_fecfin_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_bitmap( httpContext, edtavU_fecfin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavU_fecfin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RegistroInspeccion.htm");
         httpContext.writeTextNL( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_prjcode_Internalname, "Proyecto", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_prjcode_Internalname, AV23U_PrjCode, GXutil.rtrim( localUtil.format( AV23U_PrjCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_prjcode_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_prjcode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_traslado_Internalname, "Traslado", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_traslado_Internalname, GXutil.rtrim( AV11U_Traslado), GXutil.rtrim( localUtil.format( AV11U_Traslado, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_traslado_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_traslado_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, chkavU_reanalis.getInternalname(), "Es Reanálisis", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_checkbox_ctrl( httpContext, chkavU_reanalis.getInternalname(), GXutil.booltostr( AV16U_Reanalis), "", "Es Reanálisis", 1, chkavU_reanalis.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(76, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, chkavU_contramu.getInternalname(), "Contra muestra", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_checkbox_ctrl( httpContext, chkavU_contramu.getInternalname(), GXutil.booltostr( AV24U_ContraMu), "", "Contra muestra", 1, chkavU_contramu.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(79, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-md-4 col-md-offset-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-md-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_corranal_Internalname, "Reanálisis realizados", "col-sm-3 col-md-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_corranal_Internalname, GXutil.ltrim( localUtil.ntoc( AV20U_CorrAnal, (byte)(9), (byte)(0), ",", "")), ((edtavU_corranal_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20U_CorrAnal), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV20U_CorrAnal), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavU_corranal_Jsonclick, 0, "Attribute", "", "", "", 1, edtavU_corranal_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-md-4", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, chkavU_muestdes.getInternalname(), "Muestra destructiva", "col-sm-3 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_97_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_checkbox_ctrl( httpContext, chkavU_muestdes.getInternalname(), GXutil.booltostr( AV25U_MuestDes), "", "Muestra destructiva", 1, chkavU_muestdes.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(86, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"TAB1Container"+"\"></div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB1Container"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTabpage1_title_Internalname, "TabPage1", "", "", lblTabpage1_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_RegistroInspeccion.htm");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabPage1") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB1Container"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divTabpage1table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"97\">") ;
            sStyleString = "" ;
            com.wms.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "Grid", 0, "", "", 1, 2, sStyleString, "", 0);
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 42, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "#") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 95, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código Atr.") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 415, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Atributo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 40, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cualitativo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 40, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Crítico") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Aprobado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Medición") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tam. muestra") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Rango") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tiempo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo muestra") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Stand Atr") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Minimo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Maximo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "Grid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtllineid2_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlu_codatr2_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtluvid_atrcontartdu_nameatr_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtluvid_atrcontartdu_cualitat_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlu_critico2_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV31Tam_Muestra, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTam_muestra_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlu_rango_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlu_standatr2_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlu_minimo2_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlu_maximo2_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 97 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_97 = (short)(nGXsfl_97_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV43GXV1 = nGXsfl_97_idx ;
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
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB1Container"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTabpage2_title_Internalname, "TabPage2", "", "", lblTabpage2_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_RegistroInspeccion.htm");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabPage2") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB1Container"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divTabpage2table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" data-gxgridid=\"119\">") ;
            sStyleString = "" ;
            com.wms.GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "Grid", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid2_Backcolorstyle == 0 )
            {
               subGrid2_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid2_Class) > 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Title" ;
               }
            }
            else
            {
               subGrid2_Titlebackstyle = (byte)(1) ;
               if ( subGrid2_Backcolorstyle == 1 )
               {
                  subGrid2_Titlebackcolor = subGrid2_Allbackcolor ;
                  if ( GXutil.len( subGrid2_Class) > 0 )
                  {
                     subGrid2_Linesclass = subGrid2_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid2_Class) > 0 )
                  {
                     subGrid2_Linesclass = subGrid2_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "docentry") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid2Container.AddObjectProperty("GridName", "Grid2");
         }
         else
         {
            Grid2Container.AddObjectProperty("GridName", "Grid2");
            Grid2Container.AddObjectProperty("Class", "Grid");
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("CmpContext", "");
            Grid2Container.AddObjectProperty("InMasterPage", "false");
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40docentry, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 119 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_119 = (short)(nGXsfl_119_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.wms.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.wms.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB1Container"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTabpage3_title_Internalname, "TabPage3", "", "", lblTabpage3_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_RegistroInspeccion.htm");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabPage3") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB1Container"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divTabpage3table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttGuardar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 97, 2, 0)+","+"null"+");", "Guardar", bttGuardar_Jsonclick, 5, "Guardar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'GUARDAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RegistroInspeccion.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start0W2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Registro de Inspección", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0W0( ) ;
   }

   public void ws0W2( )
   {
      start0W2( ) ;
      evt0W2( ) ;
   }

   public void evt0W2( )
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
                        }
                        else if ( GXutil.strcmp(sEvt, "VU_ITEMCODE.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e120W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'GUARDAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Guardar' */
                           e130W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'VALIDAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Validar' */
                           e140W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_97_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_97_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_97_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_972( ) ;
                           AV43GXV1 = nGXsfl_97_idx ;
                           if ( ( AV26QAttributeDetail.size() >= AV43GXV1 ) && ( AV43GXV1 > 0 ) )
                           {
                              AV26QAttributeDetail.currentItem( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)) );
                              AV31Tam_Muestra = (short)(localUtil.ctol( httpContext.cgiGet( edtavTam_muestra_Internalname), ",", ".")) ;
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e150W2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
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
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 )
                        {
                           nGXsfl_119_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_119_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_119_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_1193( ) ;
                           AV40docentry = (short)(localUtil.ctol( httpContext.cgiGet( edtavDocentry_Internalname), ",", ".")) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e160W3 ();
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

   public void we0W2( )
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

   public void pa0W2( )
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
         cmbavU_whscode.setName( "vU_WHSCODE" );
         cmbavU_whscode.setWebtags( "" );
         cmbavU_whscode.addItem("CUART MP", "CUART MP", (short)(0));
         cmbavU_whscode.addItem("CUART PT", "CUART PT", (short)(0));
         if ( cmbavU_whscode.getItemCount() > 0 )
         {
            AV5U_WhsCode = cmbavU_whscode.getValidValue(AV5U_WhsCode) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5U_WhsCode", AV5U_WhsCode);
         }
         chkavU_reanalis.setName( "vU_REANALIS" );
         chkavU_reanalis.setWebtags( "" );
         chkavU_reanalis.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavU_reanalis.getInternalname(), "TitleCaption", chkavU_reanalis.getCaption(), true);
         chkavU_reanalis.setCheckedValue( "false" );
         chkavU_contramu.setName( "vU_CONTRAMU" );
         chkavU_contramu.setWebtags( "" );
         chkavU_contramu.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavU_contramu.getInternalname(), "TitleCaption", chkavU_contramu.getCaption(), true);
         chkavU_contramu.setCheckedValue( "false" );
         chkavU_muestdes.setName( "vU_MUESTDES" );
         chkavU_muestdes.setWebtags( "" );
         chkavU_muestdes.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavU_muestdes.getInternalname(), "TitleCaption", chkavU_muestdes.getCaption(), true);
         chkavU_muestdes.setCheckedValue( "false" );
         GXCCtl = "CTLUVID_CONTROLCDU_ESTADO_" + sGXsfl_97_idx ;
         chkavCtluvid_controlcdu_estado.setName( GXCCtl );
         chkavCtluvid_controlcdu_estado.setWebtags( "" );
         chkavCtluvid_controlcdu_estado.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavCtluvid_controlcdu_estado.getInternalname(), "TitleCaption", chkavCtluvid_controlcdu_estado.getCaption(), !bGXsfl_97_Refreshing);
         chkavCtluvid_controlcdu_estado.setCheckedValue( "R" );
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = cmbavU_whscode.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_972( ) ;
      while ( nGXsfl_97_idx <= nRC_GXsfl_97 )
      {
         sendrow_972( ) ;
         nGXsfl_97_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_97_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_97_idx+1)) ;
         sGXsfl_97_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_97_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_972( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1193( ) ;
      while ( nGXsfl_119_idx <= nRC_GXsfl_119 )
      {
         sendrow_1193( ) ;
         nGXsfl_119_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_119_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_119_idx+1)) ;
         sGXsfl_119_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_119_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1193( ) ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void gxgrgrid1_refresh( )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0W2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void gxgrgrid2_refresh( GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem> AV26QAttributeDetail )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID2_nCurrentRecord = 0 ;
      rf0W3( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid2_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavU_whscode.getItemCount() > 0 )
      {
         AV5U_WhsCode = cmbavU_whscode.getValidValue(AV5U_WhsCode) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5U_WhsCode", AV5U_WhsCode);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0W2( ) ;
      rf0W3( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtllineid2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtllineid2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtllineid2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_codatr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_codatr2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_codatr2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtluvid_atrcontartdu_nameatr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtluvid_atrcontartdu_nameatr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtluvid_atrcontartdu_nameatr_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtluvid_atrcontartdu_cualitat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtluvid_atrcontartdu_cualitat_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtluvid_atrcontartdu_cualitat_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_critico2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_critico2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_critico2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavTam_muestra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTam_muestra_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTam_muestra_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_rango_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_rango_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_rango_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_standatr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_standatr2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_standatr2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_minimo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_minimo2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_minimo2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_maximo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_maximo2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_maximo2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
   }

   public void rf0W2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(97) ;
      nGXsfl_97_idx = (short)(1) ;
      sGXsfl_97_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_97_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_972( ) ;
      bGXsfl_97_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "Grid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_972( ) ;
         e150W2 ();
         wbEnd = (short)(97) ;
         wb0W0( ) ;
      }
      bGXsfl_97_Refreshing = true ;
   }

   public void rf0W3( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid2Container.ClearRows();
      }
      wbStart = (short)(119) ;
      nGXsfl_119_idx = (short)(1) ;
      sGXsfl_119_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_119_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1193( ) ;
      bGXsfl_119_Refreshing = true ;
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", "Grid");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1193( ) ;
         e160W3 ();
         wbEnd = (short)(119) ;
         wb0W0( ) ;
      }
      bGXsfl_119_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public int subgrid2_pagecount( )
   {
      return -1 ;
   }

   public int subgrid2_recordcount( )
   {
      return -1 ;
   }

   public int subgrid2_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid2_currentpage( )
   {
      return -1 ;
   }

   public void strup0W0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavCtllineid2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtllineid2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtllineid2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_codatr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_codatr2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_codatr2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtluvid_atrcontartdu_nameatr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtluvid_atrcontartdu_nameatr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtluvid_atrcontartdu_nameatr_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtluvid_atrcontartdu_cualitat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtluvid_atrcontartdu_cualitat_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtluvid_atrcontartdu_cualitat_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_critico2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_critico2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_critico2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavTam_muestra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTam_muestra_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTam_muestra_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_rango_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_rango_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_rango_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_standatr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_standatr2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_standatr2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_minimo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_minimo2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_minimo2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      edtavCtlu_maximo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlu_maximo2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlu_maximo2_Enabled, 5, 0)), !bGXsfl_97_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Qattributedetail"), AV26QAttributeDetail);
         /* Read variables values. */
         cmbavU_whscode.setName( cmbavU_whscode.getInternalname() );
         cmbavU_whscode.setValue( httpContext.cgiGet( cmbavU_whscode.getInternalname()) );
         AV5U_WhsCode = httpContext.cgiGet( cmbavU_whscode.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5U_WhsCode", AV5U_WhsCode);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavU_nodoc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavU_nodoc_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vU_NODOC");
            GX_FocusControl = edtavU_nodoc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17U_NoDoc = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17U_NoDoc", GXutil.ltrim( GXutil.str( AV17U_NoDoc, 9, 0)));
         }
         else
         {
            AV17U_NoDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtavU_nodoc_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17U_NoDoc", GXutil.ltrim( GXutil.str( AV17U_NoDoc, 9, 0)));
         }
         AV6U_ItemCode = httpContext.cgiGet( edtavU_itemcode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6U_ItemCode", AV6U_ItemCode);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavU_feccontr_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vU_FECCONTR");
            GX_FocusControl = edtavU_feccontr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18U_FecContr = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV18U_FecContr", localUtil.ttoc( AV18U_FecContr, 10, 8, 0, 3, "/", ":", " "));
         }
         else
         {
            AV18U_FecContr = localUtil.ctot( httpContext.cgiGet( edtavU_feccontr_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18U_FecContr", localUtil.ttoc( AV18U_FecContr, 10, 8, 0, 3, "/", ":", " "));
         }
         AV30UVID_ATRCONTARTHU_ItemName = httpContext.cgiGet( edtavUvid_atrcontarthu_itemname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30UVID_ATRCONTARTHU_ItemName", AV30UVID_ATRCONTARTHU_ItemName);
         AV7U_NoLote = httpContext.cgiGet( edtavU_nolote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7U_NoLote", AV7U_NoLote);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavU_fecingr_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vU_FECINGR");
            GX_FocusControl = edtavU_fecingr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV12U_FecIngr", localUtil.ttoc( AV12U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
         }
         else
         {
            AV12U_FecIngr = localUtil.ctot( httpContext.cgiGet( edtavU_fecingr_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12U_FecIngr", localUtil.ttoc( AV12U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavU_corrlote_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavU_corrlote_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vU_CORRLOTE");
            GX_FocusControl = edtavU_corrlote_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19U_CorrLote = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19U_CorrLote", GXutil.ltrim( GXutil.str( AV19U_CorrLote, 9, 0)));
         }
         else
         {
            AV19U_CorrLote = (int)(localUtil.ctol( httpContext.cgiGet( edtavU_corrlote_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19U_CorrLote", GXutil.ltrim( GXutil.str( AV19U_CorrLote, 9, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavU_cantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavU_cantidad_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vU_CANTIDAD");
            GX_FocusControl = edtavU_cantidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8U_Cantidad = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8U_Cantidad", GXutil.ltrim( GXutil.str( AV8U_Cantidad, 18, 0)));
         }
         else
         {
            AV8U_Cantidad = localUtil.ctol( httpContext.cgiGet( edtavU_cantidad_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8U_Cantidad", GXutil.ltrim( GXutil.str( AV8U_Cantidad, 18, 0)));
         }
         AV13U_UM = httpContext.cgiGet( edtavU_um_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13U_UM", AV13U_UM);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavU_fecultin_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vU_FECULTIN");
            GX_FocusControl = edtavU_fecultin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV21U_FecUltIn", localUtil.ttoc( AV21U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
         }
         else
         {
            AV21U_FecUltIn = localUtil.ctot( httpContext.cgiGet( edtavU_fecultin_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21U_FecUltIn", localUtil.ttoc( AV21U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavU_bultosmu_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavU_bultosmu_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vU_BULTOSMU");
            GX_FocusControl = edtavU_bultosmu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10U_BultosMu = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10U_BultosMu", GXutil.ltrim( GXutil.str( AV10U_BultosMu, 9, 0)));
         }
         else
         {
            AV10U_BultosMu = (int)(localUtil.ctol( httpContext.cgiGet( edtavU_bultosmu_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10U_BultosMu", GXutil.ltrim( GXutil.str( AV10U_BultosMu, 9, 0)));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavU_fecini_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vU_FECINI");
            GX_FocusControl = edtavU_fecini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14U_FecIni = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV14U_FecIni", localUtil.ttoc( AV14U_FecIni, 10, 8, 0, 3, "/", ":", " "));
         }
         else
         {
            AV14U_FecIni = localUtil.ctot( httpContext.cgiGet( edtavU_fecini_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14U_FecIni", localUtil.ttoc( AV14U_FecIni, 10, 8, 0, 3, "/", ":", " "));
         }
         AV22U_CCCode = httpContext.cgiGet( edtavU_cccode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22U_CCCode", AV22U_CCCode);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavU_bultos_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavU_bultos_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vU_BULTOS");
            GX_FocusControl = edtavU_bultos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9U_Bultos = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9U_Bultos", GXutil.ltrim( GXutil.str( AV9U_Bultos, 9, 0)));
         }
         else
         {
            AV9U_Bultos = (int)(localUtil.ctol( httpContext.cgiGet( edtavU_bultos_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9U_Bultos", GXutil.ltrim( GXutil.str( AV9U_Bultos, 9, 0)));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavU_fecfin_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vU_FECFIN");
            GX_FocusControl = edtavU_fecfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15U_FecFin = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV15U_FecFin", localUtil.ttoc( AV15U_FecFin, 10, 8, 0, 3, "/", ":", " "));
         }
         else
         {
            AV15U_FecFin = localUtil.ctot( httpContext.cgiGet( edtavU_fecfin_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15U_FecFin", localUtil.ttoc( AV15U_FecFin, 10, 8, 0, 3, "/", ":", " "));
         }
         AV23U_PrjCode = httpContext.cgiGet( edtavU_prjcode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23U_PrjCode", AV23U_PrjCode);
         AV11U_Traslado = httpContext.cgiGet( edtavU_traslado_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11U_Traslado", AV11U_Traslado);
         AV16U_Reanalis = GXutil.strtobool( httpContext.cgiGet( chkavU_reanalis.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16U_Reanalis", AV16U_Reanalis);
         AV24U_ContraMu = GXutil.strtobool( httpContext.cgiGet( chkavU_contramu.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24U_ContraMu", AV24U_ContraMu);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavU_corranal_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavU_corranal_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vU_CORRANAL");
            GX_FocusControl = edtavU_corranal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20U_CorrAnal = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20U_CorrAnal", GXutil.ltrim( GXutil.str( AV20U_CorrAnal, 9, 0)));
         }
         else
         {
            AV20U_CorrAnal = (int)(localUtil.ctol( httpContext.cgiGet( edtavU_corranal_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20U_CorrAnal", GXutil.ltrim( GXutil.str( AV20U_CorrAnal, 9, 0)));
         }
         AV25U_MuestDes = GXutil.strtobool( httpContext.cgiGet( chkavU_muestdes.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25U_MuestDes", AV25U_MuestDes);
         /* Read saved values. */
         nRC_GXsfl_97 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_97"), ",", ".")) ;
         nRC_GXsfl_119 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_119"), ",", ".")) ;
         Tab1_Class = httpContext.cgiGet( "TAB1_Class") ;
         Tab1_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "TAB1_Pagecount"), ",", ".")) ;
         Tab1_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "TAB1_Historymanagement")) ;
         nRC_GXsfl_97 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_97"), ",", ".")) ;
         nGXsfl_97_fel_idx = (short)(0) ;
         while ( nGXsfl_97_fel_idx < nRC_GXsfl_97 )
         {
            nGXsfl_97_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_97_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_97_fel_idx+1)) ;
            sGXsfl_97_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_97_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_972( ) ;
            AV43GXV1 = nGXsfl_97_fel_idx ;
            if ( ( AV26QAttributeDetail.size() >= AV43GXV1 ) && ( AV43GXV1 > 0 ) )
            {
               AV26QAttributeDetail.currentItem( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)) );
               AV31Tam_Muestra = (short)(localUtil.ctol( httpContext.cgiGet( edtavTam_muestra_Internalname), ",", ".")) ;
            }
         }
         if ( nGXsfl_97_fel_idx == 0 )
         {
            nGXsfl_97_idx = (short)(1) ;
            sGXsfl_97_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_97_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_972( ) ;
         }
         nGXsfl_97_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   public void e120W2( )
   {
      AV43GXV1 = nGXsfl_97_idx ;
      if ( AV26QAttributeDetail.size() >= AV43GXV1 )
      {
         AV26QAttributeDetail.currentItem( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)) );
      }
      /* U_itemcode_Isvalid Routine */
      GXt_char1 = AV30UVID_ATRCONTARTHU_ItemName ;
      GXv_char2[0] = GXt_char1 ;
      new com.wms.getproductname(remoteHandle, context).execute( AV6U_ItemCode, GXv_char2) ;
      registroinspeccion_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6U_ItemCode", AV6U_ItemCode);
      AV30UVID_ATRCONTARTHU_ItemName = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30UVID_ATRCONTARTHU_ItemName", AV30UVID_ATRCONTARTHU_ItemName);
      GXt_objcol_SdtQAttributeDetail_QAttributeDetailItem3 = AV26QAttributeDetail ;
      GXv_objcol_SdtQAttributeDetail_QAttributeDetailItem4[0] = GXt_objcol_SdtQAttributeDetail_QAttributeDetailItem3 ;
      new com.wms.getqattributes(remoteHandle, context).execute( AV6U_ItemCode, GXv_objcol_SdtQAttributeDetail_QAttributeDetailItem4) ;
      GXt_objcol_SdtQAttributeDetail_QAttributeDetailItem3 = GXv_objcol_SdtQAttributeDetail_QAttributeDetailItem4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6U_ItemCode", AV6U_ItemCode);
      AV26QAttributeDetail = GXt_objcol_SdtQAttributeDetail_QAttributeDetailItem3 ;
      gx_BV97 = true ;
      AV31Tam_Muestra = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavTam_muestra_Internalname, GXutil.ltrim( GXutil.str( AV31Tam_Muestra, 4, 0)));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(119) ;
      }
      sendrow_1193( ) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_119_Refreshing )
      {
         httpContext.doAjaxLoad(119, Grid2Row);
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26QAttributeDetail", AV26QAttributeDetail);
      nGXsfl_97_bak_idx = nGXsfl_97_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_97_idx = nGXsfl_97_bak_idx ;
      sGXsfl_97_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_97_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_972( ) ;
   }

   public void e130W2( )
   {
      AV43GXV1 = nGXsfl_97_idx ;
      if ( AV26QAttributeDetail.size() >= AV43GXV1 )
      {
         AV26QAttributeDetail.currentItem( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)) );
      }
      /* 'Guardar' Routine */
      new com.wms.guardarregistroinspeccion(remoteHandle, context).execute( AV26QAttributeDetail) ;
   }

   public void e140W2( )
   {
      /* 'Validar' Routine */
      AV6U_ItemCode = AV33WebSession.getValue("CodArticulo") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6U_ItemCode", AV6U_ItemCode);
      GX_FocusControl = edtavU_itemcode_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
   }

   private void e150W2( )
   {
      /* Grid1_Load Routine */
      AV43GXV1 = (short)(1) ;
      while ( AV43GXV1 <= AV26QAttributeDetail.size() )
      {
         AV26QAttributeDetail.currentItem( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(97) ;
         }
         sendrow_972( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_97_Refreshing )
         {
            httpContext.doAjaxLoad(97, Grid1Row);
         }
         AV43GXV1 = (short)(AV43GXV1+1) ;
      }
   }

   private void e160W3( )
   {
      /* Grid2_Load Routine */
      AV57GXV2 = 1 ;
      while ( AV57GXV2 <= AV26QAttributeDetail.size() )
      {
         AV39QAttributeDetailItem = (com.wms.SdtQAttributeDetail_QAttributeDetailItem)((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV57GXV2));
         AV40docentry = (short)(AV39QAttributeDetailItem.getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry()) ;
         AV38lineid = AV39QAttributeDetailItem.getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2() ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(119) ;
         }
         sendrow_1193( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_119_Refreshing )
         {
            httpContext.doAjaxLoad(119, Grid2Row);
         }
         AV57GXV2 = (int)(AV57GXV2+1) ;
      }
   }

   public void setparameters( Object[] obj )
   {
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
      pa0W2( ) ;
      ws0W2( ) ;
      we0W2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?10473670");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811515395227");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("registroinspeccion.js", "?201811515395227");
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "");
      httpContext.AddJavascriptSource("Tab/TabRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_972( )
   {
      edtavCtllineid2_Internalname = "CTLLINEID2_"+sGXsfl_97_idx ;
      edtavCtlu_codatr2_Internalname = "CTLU_CODATR2_"+sGXsfl_97_idx ;
      edtavCtluvid_atrcontartdu_nameatr_Internalname = "CTLUVID_ATRCONTARTDU_NAMEATR_"+sGXsfl_97_idx ;
      edtavCtluvid_atrcontartdu_cualitat_Internalname = "CTLUVID_ATRCONTARTDU_CUALITAT_"+sGXsfl_97_idx ;
      edtavCtlu_critico2_Internalname = "CTLU_CRITICO2_"+sGXsfl_97_idx ;
      chkavCtluvid_controlcdu_estado.setInternalname( "CTLUVID_CONTROLCDU_ESTADO_"+sGXsfl_97_idx );
      edtavCtlu_medicion_Internalname = "CTLU_MEDICION_"+sGXsfl_97_idx ;
      edtavTam_muestra_Internalname = "vTAM_MUESTRA_"+sGXsfl_97_idx ;
      edtavCtlu_rango_Internalname = "CTLU_RANGO_"+sGXsfl_97_idx ;
      edtavCtlu_tiempodu_Internalname = "CTLU_TIEMPODU_"+sGXsfl_97_idx ;
      edtavCtlu_tipomues_Internalname = "CTLU_TIPOMUES_"+sGXsfl_97_idx ;
      edtavCtlu_standatr2_Internalname = "CTLU_STANDATR2_"+sGXsfl_97_idx ;
      edtavCtlu_minimo2_Internalname = "CTLU_MINIMO2_"+sGXsfl_97_idx ;
      edtavCtlu_maximo2_Internalname = "CTLU_MAXIMO2_"+sGXsfl_97_idx ;
   }

   public void subsflControlProps_fel_972( )
   {
      edtavCtllineid2_Internalname = "CTLLINEID2_"+sGXsfl_97_fel_idx ;
      edtavCtlu_codatr2_Internalname = "CTLU_CODATR2_"+sGXsfl_97_fel_idx ;
      edtavCtluvid_atrcontartdu_nameatr_Internalname = "CTLUVID_ATRCONTARTDU_NAMEATR_"+sGXsfl_97_fel_idx ;
      edtavCtluvid_atrcontartdu_cualitat_Internalname = "CTLUVID_ATRCONTARTDU_CUALITAT_"+sGXsfl_97_fel_idx ;
      edtavCtlu_critico2_Internalname = "CTLU_CRITICO2_"+sGXsfl_97_fel_idx ;
      chkavCtluvid_controlcdu_estado.setInternalname( "CTLUVID_CONTROLCDU_ESTADO_"+sGXsfl_97_fel_idx );
      edtavCtlu_medicion_Internalname = "CTLU_MEDICION_"+sGXsfl_97_fel_idx ;
      edtavTam_muestra_Internalname = "vTAM_MUESTRA_"+sGXsfl_97_fel_idx ;
      edtavCtlu_rango_Internalname = "CTLU_RANGO_"+sGXsfl_97_fel_idx ;
      edtavCtlu_tiempodu_Internalname = "CTLU_TIEMPODU_"+sGXsfl_97_fel_idx ;
      edtavCtlu_tipomues_Internalname = "CTLU_TIPOMUES_"+sGXsfl_97_fel_idx ;
      edtavCtlu_standatr2_Internalname = "CTLU_STANDATR2_"+sGXsfl_97_fel_idx ;
      edtavCtlu_minimo2_Internalname = "CTLU_MINIMO2_"+sGXsfl_97_fel_idx ;
      edtavCtlu_maximo2_Internalname = "CTLU_MAXIMO2_"+sGXsfl_97_fel_idx ;
   }

   public void sendrow_972( )
   {
      subsflControlProps_972( ) ;
      wb0W0( ) ;
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
         if ( ((int)((nGXsfl_97_idx) % (2))) == 0 )
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
         httpContext.writeText( " class=\""+"Grid"+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_97_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtllineid2_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2(), (byte)(9), (byte)(0), ",", "")),((edtavCtllineid2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2()), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2()), "ZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtllineid2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtllineid2_Enabled),new Integer(0),"text","",new Integer(42),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlu_codatr2_Internalname,((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlu_codatr2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlu_codatr2_Enabled),new Integer(0),"text","",new Integer(95),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtluvid_atrcontartdu_nameatr_Internalname,((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtluvid_atrcontartdu_nameatr_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtluvid_atrcontartdu_nameatr_Enabled),new Integer(0),"text","",new Integer(415),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtluvid_atrcontartdu_cualitat_Internalname,GXutil.rtrim( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtluvid_atrcontartdu_cualitat_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtluvid_atrcontartdu_cualitat_Enabled),new Integer(0),"text","",new Integer(40),"px",new Integer(40),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlu_critico2_Internalname,GXutil.rtrim( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlu_critico2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlu_critico2_Enabled),new Integer(0),"text","",new Integer(40),"px",new Integer(40),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Check box */
      TempTags = " " + ((chkavCtluvid_controlcdu_estado.getEnabled()!=0)&&(chkavCtluvid_controlcdu_estado.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 103,'',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtluvid_controlcdu_estado.getInternalname(),((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado(),"","",new Integer(-1),new Integer(1),"A","",StyleString,ClassString,"WWColumn",TempTags+((chkavCtluvid_controlcdu_estado.getEnabled()!=0)&&(chkavCtluvid_controlcdu_estado.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(103, this, 'A', 'R');gx.evt.onchange(this);\" " : " ")+((chkavCtluvid_controlcdu_estado.getEnabled()!=0)&&(chkavCtluvid_controlcdu_estado.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,103);\"" : " ")});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlu_medicion_Enabled!=0)&&(edtavCtlu_medicion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 104,'',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlu_medicion_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion(), (byte)(18), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion()), "ZZZZZZZZZZZZZZZZZ9")),TempTags+((edtavCtlu_medicion_Enabled!=0)&&(edtavCtlu_medicion_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlu_medicion_Enabled!=0)&&(edtavCtlu_medicion_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,104);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlu_medicion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTam_muestra_Internalname,GXutil.ltrim( localUtil.ntoc( AV31Tam_Muestra, (byte)(4), (byte)(0), ",", "")),((edtavTam_muestra_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31Tam_Muestra), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV31Tam_Muestra), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTam_muestra_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTam_muestra_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlu_rango_Internalname,((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlu_rango_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlu_rango_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlu_tiempodu_Enabled!=0)&&(edtavCtlu_tiempodu_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlu_tiempodu_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu(), (byte)(18), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu()), "ZZZZZZZZZZZZZZZZZ9")),TempTags+((edtavCtlu_tiempodu_Enabled!=0)&&(edtavCtlu_tiempodu_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlu_tiempodu_Enabled!=0)&&(edtavCtlu_tiempodu_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,107);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlu_tiempodu_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlu_tipomues_Enabled!=0)&&(edtavCtlu_tipomues_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlu_tipomues_Internalname,((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues(),"",TempTags+((edtavCtlu_tipomues_Enabled!=0)&&(edtavCtlu_tipomues_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlu_tipomues_Enabled!=0)&&(edtavCtlu_tipomues_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,108);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlu_tipomues_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlu_standatr2_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2(), (byte)(18), (byte)(0), ",", "")),((edtavCtlu_standatr2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2()), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2()), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlu_standatr2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlu_standatr2_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlu_minimo2_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2(), (byte)(18), (byte)(0), ",", "")),((edtavCtlu_minimo2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2()), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2()), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlu_minimo2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlu_minimo2_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlu_maximo2_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2(), (byte)(18), (byte)(0), ",", "")),((edtavCtlu_maximo2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2()), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2()), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlu_maximo2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlu_maximo2_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(97),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLLINEID2"+"_"+sGXsfl_97_idx, getSecureSignedToken( sGXsfl_97_idx, localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2()), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLU_CODATR2"+"_"+sGXsfl_97_idx, getSecureSignedToken( sGXsfl_97_idx, GXutil.rtrim( localUtil.format( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2(), ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLUVID_ATRCONTARTDU_NAMEATR"+"_"+sGXsfl_97_idx, getSecureSignedToken( sGXsfl_97_idx, GXutil.rtrim( localUtil.format( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr(), ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLUVID_ATRCONTARTDU_CUALITAT"+"_"+sGXsfl_97_idx, getSecureSignedToken( sGXsfl_97_idx, GXutil.rtrim( localUtil.format( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat(), ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLU_CRITICO2"+"_"+sGXsfl_97_idx, getSecureSignedToken( sGXsfl_97_idx, GXutil.rtrim( localUtil.format( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2(), ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLU_RANGO"+"_"+sGXsfl_97_idx, getSecureSignedToken( sGXsfl_97_idx, GXutil.rtrim( localUtil.format( ((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango(), ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLU_STANDATR2"+"_"+sGXsfl_97_idx, getSecureSignedToken( sGXsfl_97_idx, localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2()), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLU_MINIMO2"+"_"+sGXsfl_97_idx, getSecureSignedToken( sGXsfl_97_idx, localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2()), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLU_MAXIMO2"+"_"+sGXsfl_97_idx, getSecureSignedToken( sGXsfl_97_idx, localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtQAttributeDetail_QAttributeDetailItem)AV26QAttributeDetail.elementAt(-1+AV43GXV1)).getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2()), "ZZZZZZZZZZZZZZZZZ9")));
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_97_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_97_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_97_idx+1)) ;
      sGXsfl_97_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_97_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_972( ) ;
      /* End function sendrow_972 */
   }

   public void subsflControlProps_1193( )
   {
      edtavDocentry_Internalname = "vDOCENTRY_"+sGXsfl_119_idx ;
   }

   public void subsflControlProps_fel_1193( )
   {
      edtavDocentry_Internalname = "vDOCENTRY_"+sGXsfl_119_fel_idx ;
   }

   public void sendrow_1193( )
   {
      subsflControlProps_1193( ) ;
      wb0W0( ) ;
      Grid2Row = GXWebRow.GetNew(context,Grid2Container) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0x0) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_119_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr ") ;
         httpContext.writeText( " class=\""+"Grid"+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_119_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDocentry_Internalname,GXutil.ltrim( localUtil.ntoc( AV40docentry, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(AV40docentry), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDocentry_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(119),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right"});
      Grid2Container.AddRow(Grid2Row);
      nGXsfl_119_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_119_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_119_idx+1)) ;
      sGXsfl_119_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_119_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1193( ) ;
      /* End function sendrow_1193 */
   }

   public void init_default_properties( )
   {
      cmbavU_whscode.setInternalname( "vU_WHSCODE" );
      edtavU_nodoc_Internalname = "vU_NODOC" ;
      edtavU_itemcode_Internalname = "vU_ITEMCODE" ;
      imgImage1_Internalname = "IMAGE1" ;
      imgImage2_Internalname = "IMAGE2" ;
      edtavU_feccontr_Internalname = "vU_FECCONTR" ;
      edtavUvid_atrcontarthu_itemname_Internalname = "vUVID_ATRCONTARTHU_ITEMNAME" ;
      edtavU_nolote_Internalname = "vU_NOLOTE" ;
      edtavU_fecingr_Internalname = "vU_FECINGR" ;
      edtavU_corrlote_Internalname = "vU_CORRLOTE" ;
      edtavU_cantidad_Internalname = "vU_CANTIDAD" ;
      edtavU_um_Internalname = "vU_UM" ;
      edtavU_fecultin_Internalname = "vU_FECULTIN" ;
      edtavU_bultosmu_Internalname = "vU_BULTOSMU" ;
      edtavU_fecini_Internalname = "vU_FECINI" ;
      edtavU_cccode_Internalname = "vU_CCCODE" ;
      edtavU_bultos_Internalname = "vU_BULTOS" ;
      edtavU_fecfin_Internalname = "vU_FECFIN" ;
      edtavU_prjcode_Internalname = "vU_PRJCODE" ;
      edtavU_traslado_Internalname = "vU_TRASLADO" ;
      chkavU_reanalis.setInternalname( "vU_REANALIS" );
      chkavU_contramu.setInternalname( "vU_CONTRAMU" );
      edtavU_corranal_Internalname = "vU_CORRANAL" ;
      chkavU_muestdes.setInternalname( "vU_MUESTDES" );
      divGroup1table_Internalname = "GROUP1TABLE" ;
      grpGroup1_Internalname = "GROUP1" ;
      lblTabpage1_title_Internalname = "TABPAGE1_TITLE" ;
      edtavCtllineid2_Internalname = "CTLLINEID2" ;
      edtavCtlu_codatr2_Internalname = "CTLU_CODATR2" ;
      edtavCtluvid_atrcontartdu_nameatr_Internalname = "CTLUVID_ATRCONTARTDU_NAMEATR" ;
      edtavCtluvid_atrcontartdu_cualitat_Internalname = "CTLUVID_ATRCONTARTDU_CUALITAT" ;
      edtavCtlu_critico2_Internalname = "CTLU_CRITICO2" ;
      chkavCtluvid_controlcdu_estado.setInternalname( "CTLUVID_CONTROLCDU_ESTADO" );
      edtavCtlu_medicion_Internalname = "CTLU_MEDICION" ;
      edtavTam_muestra_Internalname = "vTAM_MUESTRA" ;
      edtavCtlu_rango_Internalname = "CTLU_RANGO" ;
      edtavCtlu_tiempodu_Internalname = "CTLU_TIEMPODU" ;
      edtavCtlu_tipomues_Internalname = "CTLU_TIPOMUES" ;
      edtavCtlu_standatr2_Internalname = "CTLU_STANDATR2" ;
      edtavCtlu_minimo2_Internalname = "CTLU_MINIMO2" ;
      edtavCtlu_maximo2_Internalname = "CTLU_MAXIMO2" ;
      divTabpage1table_Internalname = "TABPAGE1TABLE" ;
      lblTabpage2_title_Internalname = "TABPAGE2_TITLE" ;
      edtavDocentry_Internalname = "vDOCENTRY" ;
      divTabpage2table_Internalname = "TABPAGE2TABLE" ;
      lblTabpage3_title_Internalname = "TABPAGE3_TITLE" ;
      divTabpage3table_Internalname = "TABPAGE3TABLE" ;
      Tab1_Internalname = "TAB1" ;
      bttGuardar_Internalname = "GUARDAR" ;
      divSection1_Internalname = "SECTION1" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavDocentry_Jsonclick = "" ;
      edtavCtlu_maximo2_Jsonclick = "" ;
      edtavCtlu_minimo2_Jsonclick = "" ;
      edtavCtlu_standatr2_Jsonclick = "" ;
      edtavCtlu_tipomues_Jsonclick = "" ;
      edtavCtlu_tipomues_Visible = -1 ;
      edtavCtlu_tipomues_Enabled = 1 ;
      edtavCtlu_tiempodu_Jsonclick = "" ;
      edtavCtlu_tiempodu_Visible = -1 ;
      edtavCtlu_tiempodu_Enabled = 1 ;
      edtavCtlu_rango_Jsonclick = "" ;
      edtavTam_muestra_Jsonclick = "" ;
      edtavCtlu_medicion_Jsonclick = "" ;
      edtavCtlu_medicion_Visible = -1 ;
      edtavCtlu_medicion_Enabled = 1 ;
      chkavCtluvid_controlcdu_estado.setVisible( -1 );
      chkavCtluvid_controlcdu_estado.setEnabled( 1 );
      edtavCtlu_critico2_Jsonclick = "" ;
      edtavCtluvid_atrcontartdu_cualitat_Jsonclick = "" ;
      edtavCtluvid_atrcontartdu_nameatr_Jsonclick = "" ;
      edtavCtlu_codatr2_Jsonclick = "" ;
      edtavCtllineid2_Jsonclick = "" ;
      edtavCtlu_maximo2_Enabled = -1 ;
      edtavCtlu_minimo2_Enabled = -1 ;
      edtavCtlu_standatr2_Enabled = -1 ;
      edtavCtlu_rango_Enabled = -1 ;
      edtavCtlu_critico2_Enabled = -1 ;
      edtavCtluvid_atrcontartdu_cualitat_Enabled = -1 ;
      edtavCtluvid_atrcontartdu_nameatr_Enabled = -1 ;
      edtavCtlu_codatr2_Enabled = -1 ;
      edtavCtllineid2_Enabled = -1 ;
      chkavCtluvid_controlcdu_estado.setCaption( "" );
      chkavU_muestdes.setCaption( "Muestra destructiva" );
      chkavU_contramu.setCaption( "Contra muestra" );
      chkavU_reanalis.setCaption( "Es Reanálisis" );
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Class = "Grid" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavCtlu_maximo2_Enabled = 0 ;
      edtavCtlu_minimo2_Enabled = 0 ;
      edtavCtlu_standatr2_Enabled = 0 ;
      edtavCtlu_rango_Enabled = 0 ;
      edtavTam_muestra_Enabled = 0 ;
      edtavCtlu_critico2_Enabled = 0 ;
      edtavCtluvid_atrcontartdu_cualitat_Enabled = 0 ;
      edtavCtluvid_atrcontartdu_nameatr_Enabled = 0 ;
      edtavCtlu_codatr2_Enabled = 0 ;
      edtavCtllineid2_Enabled = 0 ;
      subGrid1_Class = "Grid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      chkavU_muestdes.setEnabled( 1 );
      edtavU_corranal_Jsonclick = "" ;
      edtavU_corranal_Enabled = 1 ;
      chkavU_contramu.setEnabled( 1 );
      chkavU_reanalis.setEnabled( 1 );
      edtavU_traslado_Jsonclick = "" ;
      edtavU_traslado_Enabled = 1 ;
      edtavU_prjcode_Jsonclick = "" ;
      edtavU_prjcode_Enabled = 1 ;
      edtavU_fecfin_Jsonclick = "" ;
      edtavU_fecfin_Enabled = 1 ;
      edtavU_bultos_Jsonclick = "" ;
      edtavU_bultos_Enabled = 1 ;
      edtavU_cccode_Jsonclick = "" ;
      edtavU_cccode_Enabled = 1 ;
      edtavU_fecini_Jsonclick = "" ;
      edtavU_fecini_Enabled = 1 ;
      edtavU_bultosmu_Jsonclick = "" ;
      edtavU_bultosmu_Enabled = 1 ;
      edtavU_fecultin_Jsonclick = "" ;
      edtavU_fecultin_Enabled = 1 ;
      edtavU_um_Jsonclick = "" ;
      edtavU_um_Enabled = 1 ;
      edtavU_cantidad_Jsonclick = "" ;
      edtavU_cantidad_Enabled = 1 ;
      edtavU_corrlote_Jsonclick = "" ;
      edtavU_corrlote_Enabled = 1 ;
      edtavU_fecingr_Jsonclick = "" ;
      edtavU_fecingr_Enabled = 1 ;
      edtavU_nolote_Jsonclick = "" ;
      edtavU_nolote_Enabled = 1 ;
      edtavUvid_atrcontarthu_itemname_Jsonclick = "" ;
      edtavUvid_atrcontarthu_itemname_Enabled = 1 ;
      edtavU_feccontr_Jsonclick = "" ;
      edtavU_feccontr_Enabled = 1 ;
      edtavU_itemcode_Jsonclick = "" ;
      edtavU_itemcode_Enabled = 1 ;
      edtavU_nodoc_Jsonclick = "" ;
      edtavU_nodoc_Enabled = 1 ;
      cmbavU_whscode.setJsonclick( "" );
      cmbavU_whscode.setEnabled( 1 );
      Tab1_Historymanagement = GXutil.toBoolean( 0) ;
      Tab1_Pagecount = 3 ;
      Tab1_Class = "Tab" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Registro de Inspección" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'AV26QAttributeDetail',fld:'vQATTRIBUTEDETAIL',grid:97,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("VU_ITEMCODE.ISVALID","{handler:'e120W2',iparms:[{av:'AV6U_ItemCode',fld:'vU_ITEMCODE',pic:'',nv:''},{av:'AV26QAttributeDetail',fld:'vQATTRIBUTEDETAIL',grid:97,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'AV30UVID_ATRCONTARTHU_ItemName',fld:'vUVID_ATRCONTARTHU_ITEMNAME',pic:'',nv:''},{av:'AV26QAttributeDetail',fld:'vQATTRIBUTEDETAIL',grid:97,pic:'',nv:null},{av:'AV31Tam_Muestra',fld:'vTAM_MUESTRA',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("'GUARDAR'","{handler:'e130W2',iparms:[{av:'AV26QAttributeDetail',fld:'vQATTRIBUTEDETAIL',grid:97,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("'BUSCAR'","{handler:'e110W1',iparms:[{av:'cmbavU_whscode'},{av:'AV5U_WhsCode',fld:'vU_WHSCODE',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'VALIDAR'","{handler:'e140W2',iparms:[],oparms:[{av:'AV6U_ItemCode',fld:'vU_ITEMCODE',pic:'',nv:''}]}");
      setEventMetadata("GRID2.LOAD","{handler:'e160W3',iparms:[{av:'AV26QAttributeDetail',fld:'vQATTRIBUTEDETAIL',grid:97,pic:'',nv:null}],oparms:[{av:'AV40docentry',fld:'vDOCENTRY',pic:'ZZZ9',nv:0}]}");
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
      GXKey = "" ;
      AV26QAttributeDetail = new GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem>(com.wms.SdtQAttributeDetail_QAttributeDetailItem.class, "QAttributeDetail.QAttributeDetailItem", "WMS", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      AV5U_WhsCode = "" ;
      AV6U_ItemCode = "" ;
      ClassString = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      imgImage1_Jsonclick = "" ;
      imgImage2_Jsonclick = "" ;
      AV18U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      AV30UVID_ATRCONTARTHU_ItemName = "" ;
      AV7U_NoLote = "" ;
      AV12U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      AV13U_UM = "" ;
      AV21U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      AV14U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      AV22U_CCCode = "" ;
      AV15U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      AV23U_PrjCode = "" ;
      AV11U_Traslado = "" ;
      lblTabpage1_title_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTabpage2_title_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      subGrid2_Linesclass = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      lblTabpage3_title_Jsonclick = "" ;
      bttGuardar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_objcol_SdtQAttributeDetail_QAttributeDetailItem3 = new GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem>(com.wms.SdtQAttributeDetail_QAttributeDetailItem.class, "QAttributeDetail.QAttributeDetailItem", "WMS", remoteHandle);
      GXv_objcol_SdtQAttributeDetail_QAttributeDetailItem4 = new GXBaseCollection [1] ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      AV33WebSession = httpContext.getWebSession();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      AV39QAttributeDetailItem = new com.wms.SdtQAttributeDetail_QAttributeDetailItem(remoteHandle, context);
      ROClassString = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtllineid2_Enabled = 0 ;
      edtavCtlu_codatr2_Enabled = 0 ;
      edtavCtluvid_atrcontartdu_nameatr_Enabled = 0 ;
      edtavCtluvid_atrcontartdu_cualitat_Enabled = 0 ;
      edtavCtlu_critico2_Enabled = 0 ;
      edtavTam_muestra_Enabled = 0 ;
      edtavCtlu_rango_Enabled = 0 ;
      edtavCtlu_standatr2_Enabled = 0 ;
      edtavCtlu_minimo2_Enabled = 0 ;
      edtavCtlu_maximo2_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Titlebackstyle ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte nDonePA ;
   private byte GRID1_nEOF ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backstyle ;
   private byte GRID2_nEOF ;
   private short nRC_GXsfl_97 ;
   private short nGXsfl_97_idx=1 ;
   private short nRC_GXsfl_119 ;
   private short nGXsfl_119_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV31Tam_Muestra ;
   private short AV43GXV1 ;
   private short AV40docentry ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_97_fel_idx=1 ;
   private short nGXsfl_97_bak_idx=1 ;
   private int Tab1_Pagecount ;
   private int AV17U_NoDoc ;
   private int edtavU_nodoc_Enabled ;
   private int edtavU_itemcode_Enabled ;
   private int edtavU_feccontr_Enabled ;
   private int edtavUvid_atrcontarthu_itemname_Enabled ;
   private int edtavU_nolote_Enabled ;
   private int edtavU_fecingr_Enabled ;
   private int AV19U_CorrLote ;
   private int edtavU_corrlote_Enabled ;
   private int edtavU_cantidad_Enabled ;
   private int edtavU_um_Enabled ;
   private int edtavU_fecultin_Enabled ;
   private int AV10U_BultosMu ;
   private int edtavU_bultosmu_Enabled ;
   private int edtavU_fecini_Enabled ;
   private int edtavU_cccode_Enabled ;
   private int AV9U_Bultos ;
   private int edtavU_bultos_Enabled ;
   private int edtavU_fecfin_Enabled ;
   private int edtavU_prjcode_Enabled ;
   private int edtavU_traslado_Enabled ;
   private int AV20U_CorrAnal ;
   private int edtavU_corranal_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtllineid2_Enabled ;
   private int edtavCtlu_codatr2_Enabled ;
   private int edtavCtluvid_atrcontartdu_nameatr_Enabled ;
   private int edtavCtluvid_atrcontartdu_cualitat_Enabled ;
   private int edtavCtlu_critico2_Enabled ;
   private int edtavTam_muestra_Enabled ;
   private int edtavCtlu_rango_Enabled ;
   private int edtavCtlu_standatr2_Enabled ;
   private int edtavCtlu_minimo2_Enabled ;
   private int edtavCtlu_maximo2_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Titlebackcolor ;
   private int subGrid2_Allbackcolor ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int AV57GXV2 ;
   private int AV38lineid ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavCtlu_medicion_Enabled ;
   private int edtavCtlu_medicion_Visible ;
   private int edtavCtlu_tiempodu_Enabled ;
   private int edtavCtlu_tiempodu_Visible ;
   private int edtavCtlu_tipomues_Enabled ;
   private int edtavCtlu_tipomues_Visible ;
   private int subGrid2_Backcolor ;
   private long AV8U_Cantidad ;
   private long GRID1_nCurrentRecord ;
   private long GRID2_nCurrentRecord ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_97_idx="0001" ;
   private String GXKey ;
   private String sGXsfl_119_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Tab1_Class ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String grpGroup1_Internalname ;
   private String divGroup1table_Internalname ;
   private String TempTags ;
   private String edtavU_nodoc_Internalname ;
   private String edtavU_nodoc_Jsonclick ;
   private String edtavU_itemcode_Internalname ;
   private String edtavU_itemcode_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgImage1_Internalname ;
   private String imgImage1_Jsonclick ;
   private String imgImage2_Internalname ;
   private String imgImage2_Jsonclick ;
   private String edtavU_feccontr_Internalname ;
   private String edtavU_feccontr_Jsonclick ;
   private String edtavUvid_atrcontarthu_itemname_Internalname ;
   private String edtavUvid_atrcontarthu_itemname_Jsonclick ;
   private String edtavU_nolote_Internalname ;
   private String edtavU_nolote_Jsonclick ;
   private String edtavU_fecingr_Internalname ;
   private String edtavU_fecingr_Jsonclick ;
   private String edtavU_corrlote_Internalname ;
   private String edtavU_corrlote_Jsonclick ;
   private String edtavU_cantidad_Internalname ;
   private String edtavU_cantidad_Jsonclick ;
   private String edtavU_um_Internalname ;
   private String edtavU_um_Jsonclick ;
   private String edtavU_fecultin_Internalname ;
   private String edtavU_fecultin_Jsonclick ;
   private String edtavU_bultosmu_Internalname ;
   private String edtavU_bultosmu_Jsonclick ;
   private String edtavU_fecini_Internalname ;
   private String edtavU_fecini_Jsonclick ;
   private String edtavU_cccode_Internalname ;
   private String edtavU_cccode_Jsonclick ;
   private String edtavU_bultos_Internalname ;
   private String edtavU_bultos_Jsonclick ;
   private String edtavU_fecfin_Internalname ;
   private String edtavU_fecfin_Jsonclick ;
   private String edtavU_prjcode_Internalname ;
   private String edtavU_prjcode_Jsonclick ;
   private String edtavU_traslado_Internalname ;
   private String AV11U_Traslado ;
   private String edtavU_traslado_Jsonclick ;
   private String edtavU_corranal_Internalname ;
   private String edtavU_corranal_Jsonclick ;
   private String lblTabpage1_title_Internalname ;
   private String lblTabpage1_title_Jsonclick ;
   private String divTabpage1table_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String lblTabpage2_title_Internalname ;
   private String lblTabpage2_title_Jsonclick ;
   private String divTabpage2table_Internalname ;
   private String subGrid2_Internalname ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String lblTabpage3_title_Internalname ;
   private String lblTabpage3_title_Jsonclick ;
   private String divTabpage3table_Internalname ;
   private String divSection1_Internalname ;
   private String bttGuardar_Internalname ;
   private String bttGuardar_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTam_muestra_Internalname ;
   private String edtavDocentry_Internalname ;
   private String GXCCtl ;
   private String edtavCtllineid2_Internalname ;
   private String edtavCtlu_codatr2_Internalname ;
   private String edtavCtluvid_atrcontartdu_nameatr_Internalname ;
   private String edtavCtluvid_atrcontartdu_cualitat_Internalname ;
   private String edtavCtlu_critico2_Internalname ;
   private String edtavCtlu_rango_Internalname ;
   private String edtavCtlu_standatr2_Internalname ;
   private String edtavCtlu_minimo2_Internalname ;
   private String edtavCtlu_maximo2_Internalname ;
   private String sGXsfl_97_fel_idx="0001" ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String edtavCtlu_medicion_Internalname ;
   private String edtavCtlu_tiempodu_Internalname ;
   private String edtavCtlu_tipomues_Internalname ;
   private String ROClassString ;
   private String edtavCtllineid2_Jsonclick ;
   private String edtavCtlu_codatr2_Jsonclick ;
   private String edtavCtluvid_atrcontartdu_nameatr_Jsonclick ;
   private String edtavCtluvid_atrcontartdu_cualitat_Jsonclick ;
   private String edtavCtlu_critico2_Jsonclick ;
   private String edtavCtlu_medicion_Jsonclick ;
   private String edtavTam_muestra_Jsonclick ;
   private String edtavCtlu_rango_Jsonclick ;
   private String edtavCtlu_tiempodu_Jsonclick ;
   private String edtavCtlu_tipomues_Jsonclick ;
   private String edtavCtlu_standatr2_Jsonclick ;
   private String edtavCtlu_minimo2_Jsonclick ;
   private String edtavCtlu_maximo2_Jsonclick ;
   private String sGXsfl_119_fel_idx="0001" ;
   private String edtavDocentry_Jsonclick ;
   private String Tab1_Internalname ;
   private java.util.Date AV18U_FecContr ;
   private java.util.Date AV12U_FecIngr ;
   private java.util.Date AV21U_FecUltIn ;
   private java.util.Date AV14U_FecIni ;
   private java.util.Date AV15U_FecFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Tab1_Historymanagement ;
   private boolean wbLoad ;
   private boolean AV16U_Reanalis ;
   private boolean AV24U_ContraMu ;
   private boolean AV25U_MuestDes ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_97_Refreshing=false ;
   private boolean bGXsfl_119_Refreshing=false ;
   private boolean gx_BV97 ;
   private String AV5U_WhsCode ;
   private String AV6U_ItemCode ;
   private String AV30UVID_ATRCONTARTHU_ItemName ;
   private String AV7U_NoLote ;
   private String AV13U_UM ;
   private String AV22U_CCCode ;
   private String AV23U_PrjCode ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV33WebSession ;
   private HTMLChoice cmbavU_whscode ;
   private ICheckbox chkavU_reanalis ;
   private ICheckbox chkavU_contramu ;
   private ICheckbox chkavU_muestdes ;
   private ICheckbox chkavCtluvid_controlcdu_estado ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem> AV26QAttributeDetail ;
   private GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem> GXt_objcol_SdtQAttributeDetail_QAttributeDetailItem3 ;
   private GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem> GXv_objcol_SdtQAttributeDetail_QAttributeDetailItem4[] ;
   private com.wms.SdtQAttributeDetail_QAttributeDetailItem AV39QAttributeDetailItem ;
}

