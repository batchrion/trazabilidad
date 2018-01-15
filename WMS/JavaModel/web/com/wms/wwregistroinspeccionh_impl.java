/*
               File: wwregistroinspeccionh_impl
        Description: Work With Registro Inspeccion H
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 5, 2018 15:0:56.29
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

public final  class wwregistroinspeccionh_impl extends GXDataArea
{
   public wwregistroinspeccionh_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwregistroinspeccionh_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwregistroinspeccionh_impl.class ));
   }

   public wwregistroinspeccionh_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
         {
            nRC_GXsfl_25 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_25_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_25_idx = httpContext.GetNextPar( ) ;
            AV14Update = httpContext.GetNextPar( ) ;
            AV15Delete = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
         {
            subGrid_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV13U_WhsCode = httpContext.GetNextPar( ) ;
            AV14Update = httpContext.GetNextPar( ) ;
            AV15Delete = httpContext.GetNextPar( ) ;
            AV19Pgmname = httpContext.GetNextPar( ) ;
            A43UVID_CONTROLCHDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV13U_WhsCode, AV14Update, AV15Delete, AV19Pgmname, A43UVID_CONTROLCHDocEntry) ;
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
      pa0U2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0U2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2018151505640");
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
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.wwregistroinspeccionh") +"\">") ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.wms.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vU_WHSCODE", AV13U_WhsCode);
      /* Send saved values. */
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_25", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_25, (byte)(4), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV19Pgmname));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
         we0U2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0U2( ) ;
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
      return formatLink("com.wms.wwregistroinspeccionh")  ;
   }

   public String getPgmname( )
   {
      return "WWRegistroInspeccionH" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Registro Inspeccion H" ;
   }

   public void wb0U0( )
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
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "BodyContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divTabletop_Internalname, 1, 0, "px", 0, "px", "TableTopSearch", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-7 col-sm-2 col-sm-offset-1", "left", "top", "", "", "div");
         /* Text block */
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Registro Inspeccion Hs", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWRegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-5 col-sm-3 col-sm-push-6 WWActionsCell", "Right", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "BtnAdd" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 25, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWRegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-sm-pull-3", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavU_whscode_Internalname, "U_Whs Code", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_25_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavU_whscode_Internalname, AV13U_WhsCode, GXutil.rtrim( localUtil.format( AV13U_WhsCode, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "U_Whs Code", edtavU_whscode_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavU_whscode_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_WWRegistroInspeccionH.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divGridcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 ViewGridCellAdvanced", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "ContainerFluid WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"25\">") ;
            sStyleString = "" ;
            com.wms.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid_Backcolorstyle == 0 )
            {
               subGrid_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
            else
            {
               subGrid_Titlebackstyle = (byte)(1) ;
               if ( subGrid_Backcolorstyle == 1 )
               {
                  subGrid_Titlebackcolor = subGrid_Allbackcolor ;
                  if ( GXutil.len( subGrid_Class) > 0 )
                  {
                     subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid_Class) > 0 )
                  {
                     subGrid_Linesclass = subGrid_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Doc Entry") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Fec Ingr") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_UM") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Fec Ini") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Fec Fin") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Reanalis") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Corr Anal") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_No Doc") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Fec Contr") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Corr Lote") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Fec Ult In") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_CCCode") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Prj Code") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Tip Resul") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Whs Dest") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "U_Comment") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TextActionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TextActionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            GridContainer.AddObjectProperty("GridName", "Grid");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               GridContainer = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               GridContainer.Clear();
            }
            GridContainer.SetWrapped(nGXWrapped);
            GridContainer.AddObjectProperty("GridName", "Grid");
            GridContainer.AddObjectProperty("Class", "WorkWith");
            GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("CmpContext", "");
            GridContainer.AddObjectProperty("InMasterPage", "false");
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A65U_WhsCode);
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtU_WhsCode_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A63U_ItemCode);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A70U_NoLote);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A73U_Cantidad, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A74U_Bultos, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A75U_BultosMu, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A86U_Traslado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A78U_UM);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A104U_Reanalis));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A72U_CorrAnal, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A71U_CorrLote, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A93U_CCCode);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A94U_PrjCode);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A85UVID_CONTROLCHU_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A87U_TipResul);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A66U_WhsDest);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A95UVID_CONTROLCHU_Comment);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV14Update));
            GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUpdate_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV15Delete));
            GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDelete_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavDelete_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 25 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_25 = (short)(nGXsfl_25_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.wms.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.wms.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
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

   public void start0U2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Registro Inspeccion H", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0U0( ) ;
   }

   public void ws0U2( )
   {
      start0U2( ) ;
      evt0U2( ) ;
   }

   public void evt0U2( )
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
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e110U2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_25_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_252( ) ;
                           A43UVID_CONTROLCHDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtUVID_CONTROLCHDocEntry_Internalname), ",", ".")) ;
                           A65U_WhsCode = httpContext.cgiGet( edtU_WhsCode_Internalname) ;
                           n65U_WhsCode = false ;
                           A63U_ItemCode = httpContext.cgiGet( edtU_ItemCode_Internalname) ;
                           n63U_ItemCode = false ;
                           A70U_NoLote = httpContext.cgiGet( edtU_NoLote_Internalname) ;
                           n70U_NoLote = false ;
                           A73U_Cantidad = localUtil.ctol( httpContext.cgiGet( edtU_Cantidad_Internalname), ",", ".") ;
                           n73U_Cantidad = false ;
                           A74U_Bultos = (int)(localUtil.ctol( httpContext.cgiGet( edtU_Bultos_Internalname), ",", ".")) ;
                           n74U_Bultos = false ;
                           A75U_BultosMu = (int)(localUtil.ctol( httpContext.cgiGet( edtU_BultosMu_Internalname), ",", ".")) ;
                           n75U_BultosMu = false ;
                           A86U_Traslado = httpContext.cgiGet( edtU_Traslado_Internalname) ;
                           n86U_Traslado = false ;
                           A76U_FecIngr = localUtil.ctot( httpContext.cgiGet( edtU_FecIngr_Internalname), 0) ;
                           n76U_FecIngr = false ;
                           A78U_UM = httpContext.cgiGet( edtU_UM_Internalname) ;
                           n78U_UM = false ;
                           A81U_FecIni = localUtil.ctot( httpContext.cgiGet( edtU_FecIni_Internalname), 0) ;
                           n81U_FecIni = false ;
                           A82U_FecFin = localUtil.ctot( httpContext.cgiGet( edtU_FecFin_Internalname), 0) ;
                           n82U_FecFin = false ;
                           A104U_Reanalis = httpContext.cgiGet( edtU_Reanalis_Internalname) ;
                           n104U_Reanalis = false ;
                           A72U_CorrAnal = (int)(localUtil.ctol( httpContext.cgiGet( edtU_CorrAnal_Internalname), ",", ".")) ;
                           n72U_CorrAnal = false ;
                           A79U_NoDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtU_NoDoc_Internalname), ",", ".")) ;
                           n79U_NoDoc = false ;
                           A80U_FecContr = localUtil.ctot( httpContext.cgiGet( edtU_FecContr_Internalname), 0) ;
                           n80U_FecContr = false ;
                           A71U_CorrLote = (int)(localUtil.ctol( httpContext.cgiGet( edtU_CorrLote_Internalname), ",", ".")) ;
                           n71U_CorrLote = false ;
                           A77U_FecUltIn = localUtil.ctot( httpContext.cgiGet( edtU_FecUltIn_Internalname), 0) ;
                           n77U_FecUltIn = false ;
                           A93U_CCCode = httpContext.cgiGet( edtU_CCCode_Internalname) ;
                           n93U_CCCode = false ;
                           A94U_PrjCode = httpContext.cgiGet( edtU_PrjCode_Internalname) ;
                           n94U_PrjCode = false ;
                           A85UVID_CONTROLCHU_Estado = httpContext.cgiGet( edtUVID_CONTROLCHU_Estado_Internalname) ;
                           n85UVID_CONTROLCHU_Estado = false ;
                           A87U_TipResul = httpContext.cgiGet( edtU_TipResul_Internalname) ;
                           n87U_TipResul = false ;
                           A66U_WhsDest = httpContext.cgiGet( edtU_WhsDest_Internalname) ;
                           n66U_WhsDest = false ;
                           A95UVID_CONTROLCHU_Comment = httpContext.cgiGet( edtUVID_CONTROLCHU_Comment_Internalname) ;
                           n95UVID_CONTROLCHU_Comment = false ;
                           AV14Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           AV15Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e120U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e130U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e140U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If U_whscode Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vU_WHSCODE"), AV13U_WhsCode) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we0U2( )
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

   public void pa0U2( )
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavU_whscode_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_252( ) ;
      while ( nGXsfl_25_idx <= nRC_GXsfl_25 )
      {
         sendrow_252( ) ;
         nGXsfl_25_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_25_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_25_idx+1)) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_252( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV13U_WhsCode ,
                                 String AV14Update ,
                                 String AV15Delete ,
                                 String AV19Pgmname ,
                                 int A43UVID_CONTROLCHDocEntry )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID_nCurrentRecord = 0 ;
      rf0U2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHDOCENTRY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCHDOCENTRY", GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ".", "")));
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_FECINGR", getSecureSignedToken( "", localUtil.format( A76U_FecIngr, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_FECINGR", localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_UM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A78U_UM, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_UM", A78U_UM);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_FECINI", getSecureSignedToken( "", localUtil.format( A81U_FecIni, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_FECINI", localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_FECFIN", getSecureSignedToken( "", localUtil.format( A82U_FecFin, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_FECFIN", localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_REANALIS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A104U_Reanalis, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_REANALIS", GXutil.rtrim( A104U_Reanalis));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CORRANAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_CORRANAL", GXutil.ltrim( localUtil.ntoc( A72U_CorrAnal, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_NODOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_NODOC", GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_FECCONTR", getSecureSignedToken( "", localUtil.format( A80U_FecContr, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_FECCONTR", localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CORRLOTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_CORRLOTE", GXutil.ltrim( localUtil.ntoc( A71U_CorrLote, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_FECULTIN", getSecureSignedToken( "", localUtil.format( A77U_FecUltIn, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_FECULTIN", localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CCCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A93U_CCCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_CCCODE", A93U_CCCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_PRJCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A94U_PrjCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_PRJCODE", A94U_PrjCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHU_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A85UVID_CONTROLCHU_Estado, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCHU_ESTADO", GXutil.rtrim( A85UVID_CONTROLCHU_Estado));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_TIPRESUL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A87U_TipResul, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_TIPRESUL", A87U_TipResul);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_WHSDEST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66U_WhsDest, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "U_WHSDEST", A66U_WhsDest);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHU_COMMENT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A95UVID_CONTROLCHU_Comment, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "UVID_CONTROLCHU_COMMENT", A95UVID_CONTROLCHU_Comment);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0U2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV19Pgmname = "WWRegistroInspeccionH" ;
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUpdate_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDelete_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
   }

   public void rf0U2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(25) ;
      /* Execute user event: Refresh */
      e130U2 ();
      nGXsfl_25_idx = (short)(1) ;
      sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_252( ) ;
      bGXsfl_25_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_252( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV13U_WhsCode ,
                                              A65U_WhsCode } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         } ) ;
         lV13U_WhsCode = GXutil.concat( GXutil.rtrim( AV13U_WhsCode), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13U_WhsCode", AV13U_WhsCode);
         /* Using cursor H000U2 */
         pr_default.execute(0, new Object[] {lV13U_WhsCode, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_25_idx = (short)(1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_252( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A95UVID_CONTROLCHU_Comment = H000U2_A95UVID_CONTROLCHU_Comment[0] ;
            n95UVID_CONTROLCHU_Comment = H000U2_n95UVID_CONTROLCHU_Comment[0] ;
            A66U_WhsDest = H000U2_A66U_WhsDest[0] ;
            n66U_WhsDest = H000U2_n66U_WhsDest[0] ;
            A87U_TipResul = H000U2_A87U_TipResul[0] ;
            n87U_TipResul = H000U2_n87U_TipResul[0] ;
            A85UVID_CONTROLCHU_Estado = H000U2_A85UVID_CONTROLCHU_Estado[0] ;
            n85UVID_CONTROLCHU_Estado = H000U2_n85UVID_CONTROLCHU_Estado[0] ;
            A94U_PrjCode = H000U2_A94U_PrjCode[0] ;
            n94U_PrjCode = H000U2_n94U_PrjCode[0] ;
            A93U_CCCode = H000U2_A93U_CCCode[0] ;
            n93U_CCCode = H000U2_n93U_CCCode[0] ;
            A77U_FecUltIn = H000U2_A77U_FecUltIn[0] ;
            n77U_FecUltIn = H000U2_n77U_FecUltIn[0] ;
            A71U_CorrLote = H000U2_A71U_CorrLote[0] ;
            n71U_CorrLote = H000U2_n71U_CorrLote[0] ;
            A80U_FecContr = H000U2_A80U_FecContr[0] ;
            n80U_FecContr = H000U2_n80U_FecContr[0] ;
            A79U_NoDoc = H000U2_A79U_NoDoc[0] ;
            n79U_NoDoc = H000U2_n79U_NoDoc[0] ;
            A72U_CorrAnal = H000U2_A72U_CorrAnal[0] ;
            n72U_CorrAnal = H000U2_n72U_CorrAnal[0] ;
            A104U_Reanalis = H000U2_A104U_Reanalis[0] ;
            n104U_Reanalis = H000U2_n104U_Reanalis[0] ;
            A82U_FecFin = H000U2_A82U_FecFin[0] ;
            n82U_FecFin = H000U2_n82U_FecFin[0] ;
            A81U_FecIni = H000U2_A81U_FecIni[0] ;
            n81U_FecIni = H000U2_n81U_FecIni[0] ;
            A78U_UM = H000U2_A78U_UM[0] ;
            n78U_UM = H000U2_n78U_UM[0] ;
            A76U_FecIngr = H000U2_A76U_FecIngr[0] ;
            n76U_FecIngr = H000U2_n76U_FecIngr[0] ;
            A86U_Traslado = H000U2_A86U_Traslado[0] ;
            n86U_Traslado = H000U2_n86U_Traslado[0] ;
            A75U_BultosMu = H000U2_A75U_BultosMu[0] ;
            n75U_BultosMu = H000U2_n75U_BultosMu[0] ;
            A74U_Bultos = H000U2_A74U_Bultos[0] ;
            n74U_Bultos = H000U2_n74U_Bultos[0] ;
            A73U_Cantidad = H000U2_A73U_Cantidad[0] ;
            n73U_Cantidad = H000U2_n73U_Cantidad[0] ;
            A70U_NoLote = H000U2_A70U_NoLote[0] ;
            n70U_NoLote = H000U2_n70U_NoLote[0] ;
            A63U_ItemCode = H000U2_A63U_ItemCode[0] ;
            n63U_ItemCode = H000U2_n63U_ItemCode[0] ;
            A65U_WhsCode = H000U2_A65U_WhsCode[0] ;
            n65U_WhsCode = H000U2_n65U_WhsCode[0] ;
            A43UVID_CONTROLCHDocEntry = H000U2_A43UVID_CONTROLCHDocEntry[0] ;
            e140U2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(25) ;
         wb0U0( ) ;
      }
      bGXsfl_25_Refreshing = true ;
   }

   public int subgrid_pagecount( )
   {
      GRID_nRecordCount = subgrid_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_recordsperpage( )))+1) ;
   }

   public int subgrid_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV13U_WhsCode ,
                                           A65U_WhsCode } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      } ) ;
      lV13U_WhsCode = GXutil.concat( GXutil.rtrim( AV13U_WhsCode), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13U_WhsCode", AV13U_WhsCode);
      /* Using cursor H000U3 */
      pr_default.execute(1, new Object[] {lV13U_WhsCode});
      GRID_nRecordCount = H000U3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13U_WhsCode, AV14Update, AV15Delete, AV19Pgmname, A43UVID_CONTROLCHDocEntry) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13U_WhsCode, AV14Update, AV15Delete, AV19Pgmname, A43UVID_CONTROLCHDocEntry) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13U_WhsCode, AV14Update, AV15Delete, AV19Pgmname, A43UVID_CONTROLCHDocEntry) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      GRID_nRecordCount = subgrid_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13U_WhsCode, AV14Update, AV15Delete, AV19Pgmname, A43UVID_CONTROLCHDocEntry) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13U_WhsCode, AV14Update, AV15Delete, AV19Pgmname, A43UVID_CONTROLCHDocEntry) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0U0( )
   {
      /* Before Start, stand alone formulas. */
      AV19Pgmname = "WWRegistroInspeccionH" ;
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUpdate_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDelete_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e120U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV13U_WhsCode = httpContext.cgiGet( edtavU_whscode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13U_WhsCode", AV13U_WhsCode);
         /* Read saved values. */
         nRC_GXsfl_25 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_25"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vU_WHSCODE"), AV13U_WhsCode) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e120U2 ();
      if (returnInSub) return;
   }

   public void e120U2( )
   {
      /* Start Routine */
      if ( ! new com.wms.isauthorized(remoteHandle, context).executeUdp( AV19Pgmname) )
      {
         callWebObject(formatLink("com.wms.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV19Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV14Update = "Modificar" ;
      AV15Delete = "Eliminar" ;
      Form.setCaption( "Registro Inspeccion Hs" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e130U2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
   }

   private void e140U2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.wms.registroinspeccionh") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43UVID_CONTROLCHDocEntry,9,0))) ;
      edtavDelete_Link = formatLink("com.wms.registroinspeccionh") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43UVID_CONTROLCHDocEntry,9,0))) ;
      edtU_WhsCode_Link = formatLink("com.wms.viewregistroinspeccionh") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43UVID_CONTROLCHDocEntry,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(25) ;
      }
      sendrow_252( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_25_Refreshing )
      {
         httpContext.doAjaxLoad(25, GridRow);
      }
   }

   public void e110U2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.wms.registroinspeccionh") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV8GridState.fromxml(AV6Session.getValue(AV19Pgmname+"GridState"), null, null);
         if ( AV8GridState.getgxTv_SdtGridState_Filtervalues().size() >= 1 )
         {
            AV13U_WhsCode = ((com.wms.SdtGridState_FilterValue)AV8GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13U_WhsCode", AV13U_WhsCode);
         }
         if ( AV8GridState.getgxTv_SdtGridState_Currentpage() > 0 )
         {
            AV10GridPageCount = subgrid_pagecount( ) ;
            if ( ( AV10GridPageCount > 0 ) && ( AV10GridPageCount < AV8GridState.getgxTv_SdtGridState_Currentpage() ) )
            {
               subgrid_gotopage( AV10GridPageCount) ;
            }
            else
            {
               subgrid_gotopage( AV8GridState.getgxTv_SdtGridState_Currentpage()) ;
            }
         }
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      AV8GridState.fromxml(AV6Session.getValue(AV19Pgmname+"GridState"), null, null);
      AV8GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV8GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV9GridStateFilterValue = (com.wms.SdtGridState_FilterValue)new com.wms.SdtGridState_FilterValue(remoteHandle, context);
      AV9GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV13U_WhsCode );
      AV8GridState.getgxTv_SdtGridState_Filtervalues().add(AV9GridStateFilterValue, 0);
      AV6Session.setValue(AV19Pgmname+"GridState", AV8GridState.toxml(false, true, "GridState", "WMS"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV11TrnContext = (com.wms.SdtTransactionContext)new com.wms.SdtTransactionContext(remoteHandle, context);
      AV11TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV19Pgmname );
      AV11TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV11TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV11TrnContext.setgxTv_SdtTransactionContext_Transactionname( "RegistroInspeccionH" );
      AV6Session.setValue("TrnContext", AV11TrnContext.toxml(false, true, "TransactionContext", "WMS"));
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
      pa0U2( ) ;
      ws0U2( ) ;
      we0U2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?11405179");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2018151505772");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
         httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 111985));
         httpContext.AddJavascriptSource("wwregistroinspeccionh.js", "?2018151505772");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_252( )
   {
      edtUVID_CONTROLCHDocEntry_Internalname = "UVID_CONTROLCHDOCENTRY_"+sGXsfl_25_idx ;
      edtU_WhsCode_Internalname = "U_WHSCODE_"+sGXsfl_25_idx ;
      edtU_ItemCode_Internalname = "U_ITEMCODE_"+sGXsfl_25_idx ;
      edtU_NoLote_Internalname = "U_NOLOTE_"+sGXsfl_25_idx ;
      edtU_Cantidad_Internalname = "U_CANTIDAD_"+sGXsfl_25_idx ;
      edtU_Bultos_Internalname = "U_BULTOS_"+sGXsfl_25_idx ;
      edtU_BultosMu_Internalname = "U_BULTOSMU_"+sGXsfl_25_idx ;
      edtU_Traslado_Internalname = "U_TRASLADO_"+sGXsfl_25_idx ;
      edtU_FecIngr_Internalname = "U_FECINGR_"+sGXsfl_25_idx ;
      edtU_UM_Internalname = "U_UM_"+sGXsfl_25_idx ;
      edtU_FecIni_Internalname = "U_FECINI_"+sGXsfl_25_idx ;
      edtU_FecFin_Internalname = "U_FECFIN_"+sGXsfl_25_idx ;
      edtU_Reanalis_Internalname = "U_REANALIS_"+sGXsfl_25_idx ;
      edtU_CorrAnal_Internalname = "U_CORRANAL_"+sGXsfl_25_idx ;
      edtU_NoDoc_Internalname = "U_NODOC_"+sGXsfl_25_idx ;
      edtU_FecContr_Internalname = "U_FECCONTR_"+sGXsfl_25_idx ;
      edtU_CorrLote_Internalname = "U_CORRLOTE_"+sGXsfl_25_idx ;
      edtU_FecUltIn_Internalname = "U_FECULTIN_"+sGXsfl_25_idx ;
      edtU_CCCode_Internalname = "U_CCCODE_"+sGXsfl_25_idx ;
      edtU_PrjCode_Internalname = "U_PRJCODE_"+sGXsfl_25_idx ;
      edtUVID_CONTROLCHU_Estado_Internalname = "UVID_CONTROLCHU_ESTADO_"+sGXsfl_25_idx ;
      edtU_TipResul_Internalname = "U_TIPRESUL_"+sGXsfl_25_idx ;
      edtU_WhsDest_Internalname = "U_WHSDEST_"+sGXsfl_25_idx ;
      edtUVID_CONTROLCHU_Comment_Internalname = "UVID_CONTROLCHU_COMMENT_"+sGXsfl_25_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_25_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_25_idx ;
   }

   public void subsflControlProps_fel_252( )
   {
      edtUVID_CONTROLCHDocEntry_Internalname = "UVID_CONTROLCHDOCENTRY_"+sGXsfl_25_fel_idx ;
      edtU_WhsCode_Internalname = "U_WHSCODE_"+sGXsfl_25_fel_idx ;
      edtU_ItemCode_Internalname = "U_ITEMCODE_"+sGXsfl_25_fel_idx ;
      edtU_NoLote_Internalname = "U_NOLOTE_"+sGXsfl_25_fel_idx ;
      edtU_Cantidad_Internalname = "U_CANTIDAD_"+sGXsfl_25_fel_idx ;
      edtU_Bultos_Internalname = "U_BULTOS_"+sGXsfl_25_fel_idx ;
      edtU_BultosMu_Internalname = "U_BULTOSMU_"+sGXsfl_25_fel_idx ;
      edtU_Traslado_Internalname = "U_TRASLADO_"+sGXsfl_25_fel_idx ;
      edtU_FecIngr_Internalname = "U_FECINGR_"+sGXsfl_25_fel_idx ;
      edtU_UM_Internalname = "U_UM_"+sGXsfl_25_fel_idx ;
      edtU_FecIni_Internalname = "U_FECINI_"+sGXsfl_25_fel_idx ;
      edtU_FecFin_Internalname = "U_FECFIN_"+sGXsfl_25_fel_idx ;
      edtU_Reanalis_Internalname = "U_REANALIS_"+sGXsfl_25_fel_idx ;
      edtU_CorrAnal_Internalname = "U_CORRANAL_"+sGXsfl_25_fel_idx ;
      edtU_NoDoc_Internalname = "U_NODOC_"+sGXsfl_25_fel_idx ;
      edtU_FecContr_Internalname = "U_FECCONTR_"+sGXsfl_25_fel_idx ;
      edtU_CorrLote_Internalname = "U_CORRLOTE_"+sGXsfl_25_fel_idx ;
      edtU_FecUltIn_Internalname = "U_FECULTIN_"+sGXsfl_25_fel_idx ;
      edtU_CCCode_Internalname = "U_CCCODE_"+sGXsfl_25_fel_idx ;
      edtU_PrjCode_Internalname = "U_PRJCODE_"+sGXsfl_25_fel_idx ;
      edtUVID_CONTROLCHU_Estado_Internalname = "UVID_CONTROLCHU_ESTADO_"+sGXsfl_25_fel_idx ;
      edtU_TipResul_Internalname = "U_TIPRESUL_"+sGXsfl_25_fel_idx ;
      edtU_WhsDest_Internalname = "U_WHSDEST_"+sGXsfl_25_fel_idx ;
      edtUVID_CONTROLCHU_Comment_Internalname = "UVID_CONTROLCHU_COMMENT_"+sGXsfl_25_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_25_fel_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_25_fel_idx ;
   }

   public void sendrow_252( )
   {
      subsflControlProps_252( ) ;
      wb0U0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_25_idx <= subgrid_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_25_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_25_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_CONTROLCHDocEntry_Internalname,GXutil.ltrim( localUtil.ntoc( A43UVID_CONTROLCHDocEntry, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_CONTROLCHDocEntry_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_WhsCode_Internalname,A65U_WhsCode,"","","'"+""+"'"+",false,"+"'"+""+"'",edtU_WhsCode_Link,"","","",edtU_WhsCode_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_ItemCode_Internalname,A63U_ItemCode,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_ItemCode_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_NoLote_Internalname,A70U_NoLote,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_NoLote_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(32),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_Cantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A73U_Cantidad, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_Cantidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_Bultos_Internalname,GXutil.ltrim( localUtil.ntoc( A74U_Bultos, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_Bultos_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_BultosMu_Internalname,GXutil.ltrim( localUtil.ntoc( A75U_BultosMu, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_BultosMu_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_Traslado_Internalname,GXutil.rtrim( A86U_Traslado),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_Traslado_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_FecIngr_Internalname,localUtil.ttoc( A76U_FecIngr, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A76U_FecIngr, "99/99/9999 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_FecIngr_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_UM_Internalname,A78U_UM,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_UM_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_FecIni_Internalname,localUtil.ttoc( A81U_FecIni, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A81U_FecIni, "99/99/9999 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_FecIni_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_FecFin_Internalname,localUtil.ttoc( A82U_FecFin, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A82U_FecFin, "99/99/9999 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_FecFin_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_Reanalis_Internalname,GXutil.rtrim( A104U_Reanalis),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_Reanalis_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_CorrAnal_Internalname,GXutil.ltrim( localUtil.ntoc( A72U_CorrAnal, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_CorrAnal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_NoDoc_Internalname,GXutil.ltrim( localUtil.ntoc( A79U_NoDoc, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_NoDoc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_FecContr_Internalname,localUtil.ttoc( A80U_FecContr, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A80U_FecContr, "99/99/9999 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_FecContr_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_CorrLote_Internalname,GXutil.ltrim( localUtil.ntoc( A71U_CorrLote, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_CorrLote_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_FecUltIn_Internalname,localUtil.ttoc( A77U_FecUltIn, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A77U_FecUltIn, "99/99/9999 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_FecUltIn_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_CCCode_Internalname,A93U_CCCode,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_CCCode_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_PrjCode_Internalname,A94U_PrjCode,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_PrjCode_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_CONTROLCHU_Estado_Internalname,GXutil.rtrim( A85UVID_CONTROLCHU_Estado),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_CONTROLCHU_Estado_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_TipResul_Internalname,A87U_TipResul,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_TipResul_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtU_WhsDest_Internalname,A66U_WhsDest,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtU_WhsDest_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUVID_CONTROLCHU_Comment_Internalname,A95UVID_CONTROLCHU_Comment,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUVID_CONTROLCHU_Comment_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(254),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TextActionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,GXutil.rtrim( AV14Update),"","","'"+""+"'"+",false,"+"'"+""+"'",edtavUpdate_Link,"","","",edtavUpdate_Jsonclick,new Integer(0),"TextActionAttribute","",ROClassString,"WWTextActionColumn",new Integer(-1),new Integer(edtavUpdate_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TextActionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,GXutil.rtrim( AV15Delete),"","","'"+""+"'"+",false,"+"'"+""+"'",edtavDelete_Link,"","","",edtavDelete_Jsonclick,new Integer(0),"TextActionAttribute","",ROClassString,"WWTextActionColumn",new Integer(-1),new Integer(edtavDelete_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHDOCENTRY"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A43UVID_CONTROLCHDocEntry), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_ITEMCODE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A63U_ItemCode, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_NOLOTE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A70U_NoLote, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CANTIDAD"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A73U_Cantidad), "ZZZZZZZZZZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_BULTOS"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A74U_Bultos), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_BULTOSMU"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A75U_BultosMu), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_TRASLADO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A86U_Traslado, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_FECINGR"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A76U_FecIngr, "99/99/9999 99:99:99")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_UM"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A78U_UM, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_FECINI"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A81U_FecIni, "99/99/9999 99:99:99")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_FECFIN"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A82U_FecFin, "99/99/9999 99:99:99")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_REANALIS"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A104U_Reanalis, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CORRANAL"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A72U_CorrAnal), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_NODOC"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A79U_NoDoc), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_FECCONTR"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A80U_FecContr, "99/99/9999 99:99:99")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CORRLOTE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A71U_CorrLote), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_FECULTIN"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A77U_FecUltIn, "99/99/9999 99:99:99")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_CCCODE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A93U_CCCode, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_PRJCODE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A94U_PrjCode, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHU_ESTADO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A85UVID_CONTROLCHU_Estado, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_TIPRESUL"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A87U_TipResul, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_U_WHSDEST"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A66U_WhsDest, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_UVID_CONTROLCHU_COMMENT"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A95UVID_CONTROLCHU_Comment, ""))));
         GridContainer.AddRow(GridRow);
         nGXsfl_25_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_25_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_25_idx+1)) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_252( ) ;
      }
      /* End function sendrow_252 */
   }

   public void init_default_properties( )
   {
      lblTitletext_Internalname = "TITLETEXT" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      edtavU_whscode_Internalname = "vU_WHSCODE" ;
      divTabletop_Internalname = "TABLETOP" ;
      edtUVID_CONTROLCHDocEntry_Internalname = "UVID_CONTROLCHDOCENTRY" ;
      edtU_WhsCode_Internalname = "U_WHSCODE" ;
      edtU_ItemCode_Internalname = "U_ITEMCODE" ;
      edtU_NoLote_Internalname = "U_NOLOTE" ;
      edtU_Cantidad_Internalname = "U_CANTIDAD" ;
      edtU_Bultos_Internalname = "U_BULTOS" ;
      edtU_BultosMu_Internalname = "U_BULTOSMU" ;
      edtU_Traslado_Internalname = "U_TRASLADO" ;
      edtU_FecIngr_Internalname = "U_FECINGR" ;
      edtU_UM_Internalname = "U_UM" ;
      edtU_FecIni_Internalname = "U_FECINI" ;
      edtU_FecFin_Internalname = "U_FECFIN" ;
      edtU_Reanalis_Internalname = "U_REANALIS" ;
      edtU_CorrAnal_Internalname = "U_CORRANAL" ;
      edtU_NoDoc_Internalname = "U_NODOC" ;
      edtU_FecContr_Internalname = "U_FECCONTR" ;
      edtU_CorrLote_Internalname = "U_CORRLOTE" ;
      edtU_FecUltIn_Internalname = "U_FECULTIN" ;
      edtU_CCCode_Internalname = "U_CCCODE" ;
      edtU_PrjCode_Internalname = "U_PRJCODE" ;
      edtUVID_CONTROLCHU_Estado_Internalname = "UVID_CONTROLCHU_ESTADO" ;
      edtU_TipResul_Internalname = "U_TIPRESUL" ;
      edtU_WhsDest_Internalname = "U_WHSDEST" ;
      edtUVID_CONTROLCHU_Comment_Internalname = "UVID_CONTROLCHU_COMMENT" ;
      edtavUpdate_Internalname = "vUPDATE" ;
      edtavDelete_Internalname = "vDELETE" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divGridcell_Internalname = "GRIDCELL" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavDelete_Jsonclick = "" ;
      edtavUpdate_Jsonclick = "" ;
      edtUVID_CONTROLCHU_Comment_Jsonclick = "" ;
      edtU_WhsDest_Jsonclick = "" ;
      edtU_TipResul_Jsonclick = "" ;
      edtUVID_CONTROLCHU_Estado_Jsonclick = "" ;
      edtU_PrjCode_Jsonclick = "" ;
      edtU_CCCode_Jsonclick = "" ;
      edtU_FecUltIn_Jsonclick = "" ;
      edtU_CorrLote_Jsonclick = "" ;
      edtU_FecContr_Jsonclick = "" ;
      edtU_NoDoc_Jsonclick = "" ;
      edtU_CorrAnal_Jsonclick = "" ;
      edtU_Reanalis_Jsonclick = "" ;
      edtU_FecFin_Jsonclick = "" ;
      edtU_FecIni_Jsonclick = "" ;
      edtU_UM_Jsonclick = "" ;
      edtU_FecIngr_Jsonclick = "" ;
      edtU_Traslado_Jsonclick = "" ;
      edtU_BultosMu_Jsonclick = "" ;
      edtU_Bultos_Jsonclick = "" ;
      edtU_Cantidad_Jsonclick = "" ;
      edtU_NoLote_Jsonclick = "" ;
      edtU_ItemCode_Jsonclick = "" ;
      edtU_WhsCode_Jsonclick = "" ;
      edtUVID_CONTROLCHDocEntry_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtU_WhsCode_Link = "" ;
      edtavDelete_Enabled = 0 ;
      edtavUpdate_Enabled = 0 ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavU_whscode_Jsonclick = "" ;
      edtavU_whscode_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Registro Inspeccion H" );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV14Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV15Delete',fld:'vDELETE',pic:'',nv:''},{av:'A43UVID_CONTROLCHDocEntry',fld:'UVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV13U_WhsCode',fld:'vU_WHSCODE',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e140U2',iparms:[{av:'A43UVID_CONTROLCHDocEntry',fld:'UVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtU_WhsCode_Link',ctrl:'U_WHSCODE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e110U2',iparms:[{av:'A43UVID_CONTROLCHDocEntry',fld:'UVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV14Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV15Delete',fld:'vDELETE',pic:'',nv:''},{av:'A43UVID_CONTROLCHDocEntry',fld:'UVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV13U_WhsCode',fld:'vU_WHSCODE',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV14Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV15Delete',fld:'vDELETE',pic:'',nv:''},{av:'A43UVID_CONTROLCHDocEntry',fld:'UVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV13U_WhsCode',fld:'vU_WHSCODE',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV14Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV15Delete',fld:'vDELETE',pic:'',nv:''},{av:'A43UVID_CONTROLCHDocEntry',fld:'UVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV13U_WhsCode',fld:'vU_WHSCODE',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV14Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV15Delete',fld:'vDELETE',pic:'',nv:''},{av:'A43UVID_CONTROLCHDocEntry',fld:'UVID_CONTROLCHDOCENTRY',pic:'ZZZZZZZZ9',hsh:true,nv:0},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV13U_WhsCode',fld:'vU_WHSCODE',pic:'',nv:''}],oparms:[]}");
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
      AV14Update = "" ;
      AV15Delete = "" ;
      AV13U_WhsCode = "" ;
      AV19Pgmname = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitletext_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A65U_WhsCode = "" ;
      A63U_ItemCode = "" ;
      A70U_NoLote = "" ;
      A86U_Traslado = "" ;
      A76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      A78U_UM = "" ;
      A81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      A82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      A104U_Reanalis = "" ;
      A80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      A77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      A93U_CCCode = "" ;
      A94U_PrjCode = "" ;
      A85UVID_CONTROLCHU_Estado = "" ;
      A87U_TipResul = "" ;
      A66U_WhsDest = "" ;
      A95UVID_CONTROLCHU_Comment = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV13U_WhsCode = "" ;
      H000U2_A95UVID_CONTROLCHU_Comment = new String[] {""} ;
      H000U2_n95UVID_CONTROLCHU_Comment = new boolean[] {false} ;
      H000U2_A66U_WhsDest = new String[] {""} ;
      H000U2_n66U_WhsDest = new boolean[] {false} ;
      H000U2_A87U_TipResul = new String[] {""} ;
      H000U2_n87U_TipResul = new boolean[] {false} ;
      H000U2_A85UVID_CONTROLCHU_Estado = new String[] {""} ;
      H000U2_n85UVID_CONTROLCHU_Estado = new boolean[] {false} ;
      H000U2_A94U_PrjCode = new String[] {""} ;
      H000U2_n94U_PrjCode = new boolean[] {false} ;
      H000U2_A93U_CCCode = new String[] {""} ;
      H000U2_n93U_CCCode = new boolean[] {false} ;
      H000U2_A77U_FecUltIn = new java.util.Date[] {GXutil.nullDate()} ;
      H000U2_n77U_FecUltIn = new boolean[] {false} ;
      H000U2_A71U_CorrLote = new int[1] ;
      H000U2_n71U_CorrLote = new boolean[] {false} ;
      H000U2_A80U_FecContr = new java.util.Date[] {GXutil.nullDate()} ;
      H000U2_n80U_FecContr = new boolean[] {false} ;
      H000U2_A79U_NoDoc = new int[1] ;
      H000U2_n79U_NoDoc = new boolean[] {false} ;
      H000U2_A72U_CorrAnal = new int[1] ;
      H000U2_n72U_CorrAnal = new boolean[] {false} ;
      H000U2_A104U_Reanalis = new String[] {""} ;
      H000U2_n104U_Reanalis = new boolean[] {false} ;
      H000U2_A82U_FecFin = new java.util.Date[] {GXutil.nullDate()} ;
      H000U2_n82U_FecFin = new boolean[] {false} ;
      H000U2_A81U_FecIni = new java.util.Date[] {GXutil.nullDate()} ;
      H000U2_n81U_FecIni = new boolean[] {false} ;
      H000U2_A78U_UM = new String[] {""} ;
      H000U2_n78U_UM = new boolean[] {false} ;
      H000U2_A76U_FecIngr = new java.util.Date[] {GXutil.nullDate()} ;
      H000U2_n76U_FecIngr = new boolean[] {false} ;
      H000U2_A86U_Traslado = new String[] {""} ;
      H000U2_n86U_Traslado = new boolean[] {false} ;
      H000U2_A75U_BultosMu = new int[1] ;
      H000U2_n75U_BultosMu = new boolean[] {false} ;
      H000U2_A74U_Bultos = new int[1] ;
      H000U2_n74U_Bultos = new boolean[] {false} ;
      H000U2_A73U_Cantidad = new long[1] ;
      H000U2_n73U_Cantidad = new boolean[] {false} ;
      H000U2_A70U_NoLote = new String[] {""} ;
      H000U2_n70U_NoLote = new boolean[] {false} ;
      H000U2_A63U_ItemCode = new String[] {""} ;
      H000U2_n63U_ItemCode = new boolean[] {false} ;
      H000U2_A65U_WhsCode = new String[] {""} ;
      H000U2_n65U_WhsCode = new boolean[] {false} ;
      H000U2_A43UVID_CONTROLCHDocEntry = new int[1] ;
      H000U3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV8GridState = new com.wms.SdtGridState(remoteHandle, context);
      AV6Session = httpContext.getWebSession();
      AV9GridStateFilterValue = new com.wms.SdtGridState_FilterValue(remoteHandle, context);
      AV11TrnContext = new com.wms.SdtTransactionContext(remoteHandle, context);
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.wwregistroinspeccionh__default(),
         new Object[] {
             new Object[] {
            H000U2_A95UVID_CONTROLCHU_Comment, H000U2_n95UVID_CONTROLCHU_Comment, H000U2_A66U_WhsDest, H000U2_n66U_WhsDest, H000U2_A87U_TipResul, H000U2_n87U_TipResul, H000U2_A85UVID_CONTROLCHU_Estado, H000U2_n85UVID_CONTROLCHU_Estado, H000U2_A94U_PrjCode, H000U2_n94U_PrjCode,
            H000U2_A93U_CCCode, H000U2_n93U_CCCode, H000U2_A77U_FecUltIn, H000U2_n77U_FecUltIn, H000U2_A71U_CorrLote, H000U2_n71U_CorrLote, H000U2_A80U_FecContr, H000U2_n80U_FecContr, H000U2_A79U_NoDoc, H000U2_n79U_NoDoc,
            H000U2_A72U_CorrAnal, H000U2_n72U_CorrAnal, H000U2_A104U_Reanalis, H000U2_n104U_Reanalis, H000U2_A82U_FecFin, H000U2_n82U_FecFin, H000U2_A81U_FecIni, H000U2_n81U_FecIni, H000U2_A78U_UM, H000U2_n78U_UM,
            H000U2_A76U_FecIngr, H000U2_n76U_FecIngr, H000U2_A86U_Traslado, H000U2_n86U_Traslado, H000U2_A75U_BultosMu, H000U2_n75U_BultosMu, H000U2_A74U_Bultos, H000U2_n74U_Bultos, H000U2_A73U_Cantidad, H000U2_n73U_Cantidad,
            H000U2_A70U_NoLote, H000U2_n70U_NoLote, H000U2_A63U_ItemCode, H000U2_n63U_ItemCode, H000U2_A65U_WhsCode, H000U2_n65U_WhsCode, H000U2_A43UVID_CONTROLCHDocEntry
            }
            , new Object[] {
            H000U3_AGRID_nRecordCount
            }
         }
      );
      AV19Pgmname = "WWRegistroInspeccionH" ;
      /* GeneXus formulas. */
      AV19Pgmname = "WWRegistroInspeccionH" ;
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      edtavDelete_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte GRID_nEOF ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte nDonePA ;
   private byte subGrid_Backstyle ;
   private short nRC_GXsfl_25 ;
   private short nGXsfl_25_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int A43UVID_CONTROLCHDocEntry ;
   private int edtavU_whscode_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A74U_Bultos ;
   private int A75U_BultosMu ;
   private int A72U_CorrAnal ;
   private int A79U_NoDoc ;
   private int A71U_CorrLote ;
   private int edtavUpdate_Enabled ;
   private int edtavDelete_Enabled ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV10GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A73U_Cantidad ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_25_idx="0001" ;
   private String AV14Update ;
   private String AV15Delete ;
   private String AV19Pgmname ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTabletop_Internalname ;
   private String lblTitletext_Internalname ;
   private String lblTitletext_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String edtavU_whscode_Internalname ;
   private String edtavU_whscode_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtU_WhsCode_Link ;
   private String A86U_Traslado ;
   private String A104U_Reanalis ;
   private String A85UVID_CONTROLCHU_Estado ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtUVID_CONTROLCHDocEntry_Internalname ;
   private String edtU_WhsCode_Internalname ;
   private String edtU_ItemCode_Internalname ;
   private String edtU_NoLote_Internalname ;
   private String edtU_Cantidad_Internalname ;
   private String edtU_Bultos_Internalname ;
   private String edtU_BultosMu_Internalname ;
   private String edtU_Traslado_Internalname ;
   private String edtU_FecIngr_Internalname ;
   private String edtU_UM_Internalname ;
   private String edtU_FecIni_Internalname ;
   private String edtU_FecFin_Internalname ;
   private String edtU_Reanalis_Internalname ;
   private String edtU_CorrAnal_Internalname ;
   private String edtU_NoDoc_Internalname ;
   private String edtU_FecContr_Internalname ;
   private String edtU_CorrLote_Internalname ;
   private String edtU_FecUltIn_Internalname ;
   private String edtU_CCCode_Internalname ;
   private String edtU_PrjCode_Internalname ;
   private String edtUVID_CONTROLCHU_Estado_Internalname ;
   private String edtU_TipResul_Internalname ;
   private String edtU_WhsDest_Internalname ;
   private String edtUVID_CONTROLCHU_Comment_Internalname ;
   private String edtavUpdate_Internalname ;
   private String edtavDelete_Internalname ;
   private String scmdbuf ;
   private String sGXsfl_25_fel_idx="0001" ;
   private String ROClassString ;
   private String edtUVID_CONTROLCHDocEntry_Jsonclick ;
   private String edtU_WhsCode_Jsonclick ;
   private String edtU_ItemCode_Jsonclick ;
   private String edtU_NoLote_Jsonclick ;
   private String edtU_Cantidad_Jsonclick ;
   private String edtU_Bultos_Jsonclick ;
   private String edtU_BultosMu_Jsonclick ;
   private String edtU_Traslado_Jsonclick ;
   private String edtU_FecIngr_Jsonclick ;
   private String edtU_UM_Jsonclick ;
   private String edtU_FecIni_Jsonclick ;
   private String edtU_FecFin_Jsonclick ;
   private String edtU_Reanalis_Jsonclick ;
   private String edtU_CorrAnal_Jsonclick ;
   private String edtU_NoDoc_Jsonclick ;
   private String edtU_FecContr_Jsonclick ;
   private String edtU_CorrLote_Jsonclick ;
   private String edtU_FecUltIn_Jsonclick ;
   private String edtU_CCCode_Jsonclick ;
   private String edtU_PrjCode_Jsonclick ;
   private String edtUVID_CONTROLCHU_Estado_Jsonclick ;
   private String edtU_TipResul_Jsonclick ;
   private String edtU_WhsDest_Jsonclick ;
   private String edtUVID_CONTROLCHU_Comment_Jsonclick ;
   private String edtavUpdate_Jsonclick ;
   private String edtavDelete_Jsonclick ;
   private java.util.Date A76U_FecIngr ;
   private java.util.Date A81U_FecIni ;
   private java.util.Date A82U_FecFin ;
   private java.util.Date A80U_FecContr ;
   private java.util.Date A77U_FecUltIn ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n65U_WhsCode ;
   private boolean n63U_ItemCode ;
   private boolean n70U_NoLote ;
   private boolean n73U_Cantidad ;
   private boolean n74U_Bultos ;
   private boolean n75U_BultosMu ;
   private boolean n86U_Traslado ;
   private boolean n76U_FecIngr ;
   private boolean n78U_UM ;
   private boolean n81U_FecIni ;
   private boolean n82U_FecFin ;
   private boolean n104U_Reanalis ;
   private boolean n72U_CorrAnal ;
   private boolean n79U_NoDoc ;
   private boolean n80U_FecContr ;
   private boolean n71U_CorrLote ;
   private boolean n77U_FecUltIn ;
   private boolean n93U_CCCode ;
   private boolean n94U_PrjCode ;
   private boolean n85UVID_CONTROLCHU_Estado ;
   private boolean n87U_TipResul ;
   private boolean n66U_WhsDest ;
   private boolean n95UVID_CONTROLCHU_Comment ;
   private boolean bGXsfl_25_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV13U_WhsCode ;
   private String A65U_WhsCode ;
   private String A63U_ItemCode ;
   private String A70U_NoLote ;
   private String A78U_UM ;
   private String A93U_CCCode ;
   private String A94U_PrjCode ;
   private String A87U_TipResul ;
   private String A66U_WhsDest ;
   private String A95UVID_CONTROLCHU_Comment ;
   private String lV13U_WhsCode ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV6Session ;
   private IDataStoreProvider pr_default ;
   private String[] H000U2_A95UVID_CONTROLCHU_Comment ;
   private boolean[] H000U2_n95UVID_CONTROLCHU_Comment ;
   private String[] H000U2_A66U_WhsDest ;
   private boolean[] H000U2_n66U_WhsDest ;
   private String[] H000U2_A87U_TipResul ;
   private boolean[] H000U2_n87U_TipResul ;
   private String[] H000U2_A85UVID_CONTROLCHU_Estado ;
   private boolean[] H000U2_n85UVID_CONTROLCHU_Estado ;
   private String[] H000U2_A94U_PrjCode ;
   private boolean[] H000U2_n94U_PrjCode ;
   private String[] H000U2_A93U_CCCode ;
   private boolean[] H000U2_n93U_CCCode ;
   private java.util.Date[] H000U2_A77U_FecUltIn ;
   private boolean[] H000U2_n77U_FecUltIn ;
   private int[] H000U2_A71U_CorrLote ;
   private boolean[] H000U2_n71U_CorrLote ;
   private java.util.Date[] H000U2_A80U_FecContr ;
   private boolean[] H000U2_n80U_FecContr ;
   private int[] H000U2_A79U_NoDoc ;
   private boolean[] H000U2_n79U_NoDoc ;
   private int[] H000U2_A72U_CorrAnal ;
   private boolean[] H000U2_n72U_CorrAnal ;
   private String[] H000U2_A104U_Reanalis ;
   private boolean[] H000U2_n104U_Reanalis ;
   private java.util.Date[] H000U2_A82U_FecFin ;
   private boolean[] H000U2_n82U_FecFin ;
   private java.util.Date[] H000U2_A81U_FecIni ;
   private boolean[] H000U2_n81U_FecIni ;
   private String[] H000U2_A78U_UM ;
   private boolean[] H000U2_n78U_UM ;
   private java.util.Date[] H000U2_A76U_FecIngr ;
   private boolean[] H000U2_n76U_FecIngr ;
   private String[] H000U2_A86U_Traslado ;
   private boolean[] H000U2_n86U_Traslado ;
   private int[] H000U2_A75U_BultosMu ;
   private boolean[] H000U2_n75U_BultosMu ;
   private int[] H000U2_A74U_Bultos ;
   private boolean[] H000U2_n74U_Bultos ;
   private long[] H000U2_A73U_Cantidad ;
   private boolean[] H000U2_n73U_Cantidad ;
   private String[] H000U2_A70U_NoLote ;
   private boolean[] H000U2_n70U_NoLote ;
   private String[] H000U2_A63U_ItemCode ;
   private boolean[] H000U2_n63U_ItemCode ;
   private String[] H000U2_A65U_WhsCode ;
   private boolean[] H000U2_n65U_WhsCode ;
   private int[] H000U2_A43UVID_CONTROLCHDocEntry ;
   private long[] H000U3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.wms.SdtGridState AV8GridState ;
   private com.wms.SdtGridState_FilterValue AV9GridStateFilterValue ;
   private com.wms.SdtTransactionContext AV11TrnContext ;
}

final  class wwregistroinspeccionh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000U2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV13U_WhsCode ,
                                          String A65U_WhsCode )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [4] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " [U_Comment], [U_WhsDest], [U_TipResul], [U_Estado], [U_PrjCode], [U_CCCode], [U_FecUltIn]," ;
      sSelectString = sSelectString + " [U_CorrLote], [U_FecContr], [U_NoDoc], [U_CorrAnal], [U_Reanalis], [U_FecFin], [U_FecIni]," ;
      sSelectString = sSelectString + " [U_UM], [U_FecIngr], [U_Traslado], [U_BultosMu], [U_Bultos], [U_Cantidad], [U_NoLote]," ;
      sSelectString = sSelectString + " [U_ItemCode], [U_WhsCode], [DocEntry]" ;
      sFromString = " FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV13U_WhsCode)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and ([U_WhsCode] like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " ([U_WhsCode] like ?)" ;
         }
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         sWhereString = " WHERE" + sWhereString ;
      }
      sOrderString = sOrderString + " ORDER BY [U_WhsCode]" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT CAST((SELECT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) AS INTEGER) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000U3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV13U_WhsCode ,
                                          String A65U_WhsCode )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [1] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM dbo.[@VID_CONTROLCH] WITH (NOLOCK)" ;
      if ( ! (GXutil.strcmp("", AV13U_WhsCode)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and ([U_WhsCode] like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " ([U_WhsCode] like ?)" ;
         }
      }
      else
      {
         GXv_int3[0] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
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
                  return conditional_H000U2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
            case 1 :
                  return conditional_H000U3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000U2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000U3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 1) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 1) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(18) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(19) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((long[]) buf[38])[0] = rslt.getLong(20) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((int[]) buf[46])[0] = rslt.getInt(24) ;
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
                  stmt.setVarchar(sIdx, (String)parms[4], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[1], 8);
               }
               return;
      }
   }

}

