/*
               File: wwdetentradamercancia_impl
        Description: Work With Det Entrada Mercancia
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:20.58
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

public final  class wwdetentradamercancia_impl extends GXDataArea
{
   public wwdetentradamercancia_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwdetentradamercancia_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwdetentradamercancia_impl.class ));
   }

   public wwdetentradamercancia_impl( int remoteHandle ,
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
            AV13OcDocEntry = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV14Update = httpContext.GetNextPar( ) ;
            AV15Delete = httpContext.GetNextPar( ) ;
            AV19Pgmname = httpContext.GetNextPar( ) ;
            A24CabEntradaMercanciaId = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV13OcDocEntry, AV14Update, AV15Delete, AV19Pgmname, A24CabEntradaMercanciaId) ;
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
      pa0J2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0J2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210232066");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.wwdetentradamercancia") +"\">") ;
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
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GXH_vOCDOCENTRY", GXutil.ltrim( localUtil.ntoc( AV13OcDocEntry, (byte)(9), (byte)(0), ",", "")));
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
         we0J2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0J2( ) ;
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
      return formatLink("com.wms.wwdetentradamercancia")  ;
   }

   public String getPgmname( )
   {
      return "WWDetEntradaMercancia" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Det Entrada Mercancia" ;
   }

   public void wb0J0( )
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
         com.wms.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Det Entrada Mercancias", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWDetEntradaMercancia.htm");
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
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 25, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWDetEntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-sm-pull-3", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavOcdocentry_Internalname, "Oc Doc Entry", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_25_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavOcdocentry_Internalname, GXutil.ltrim( localUtil.ntoc( AV13OcDocEntry, (byte)(9), (byte)(0), ",", "")), ((edtavOcdocentry_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13OcDocEntry), "ZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13OcDocEntry), "ZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Oc Doc Entry", edtavOcdocentry_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavOcdocentry_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_WWDetEntradaMercancia.htm");
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
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "N�mero OC") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "N�mero de L�nea") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cod. Art�culo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Art�culo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cant. Solicitada") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cant. Recibida") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cant. Pendiente") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha de Entrega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado de L�nea") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Empresa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Lote") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1OcDocEntry, (byte)(9), (byte)(0), ".", "")));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtOcDocEntry_Link));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11OC1LineNum, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A12ItmItemCode);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A13ItmItemName);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A14WhsCode);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A15PPDetLinCantidad, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A27PPDetLinRecibida, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A16PPDetLinPendiente, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A23PPDetLinStatus));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A10Empresa);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A26Lote);
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

   public void start0J2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Det Entrada Mercancia", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0J0( ) ;
   }

   public void ws0J2( )
   {
      start0J2( ) ;
      evt0J2( ) ;
   }

   public void evt0J2( )
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
                           e110J2 ();
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
                           A24CabEntradaMercanciaId = (int)(localUtil.ctol( httpContext.cgiGet( edtCabEntradaMercanciaId_Internalname), ",", ".")) ;
                           A1OcDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtOcDocEntry_Internalname), ",", ".")) ;
                           A11OC1LineNum = (int)(localUtil.ctol( httpContext.cgiGet( edtOC1LineNum_Internalname), ",", ".")) ;
                           A12ItmItemCode = httpContext.cgiGet( edtItmItemCode_Internalname) ;
                           A13ItmItemName = httpContext.cgiGet( edtItmItemName_Internalname) ;
                           A14WhsCode = httpContext.cgiGet( edtWhsCode_Internalname) ;
                           A15PPDetLinCantidad = localUtil.ctol( httpContext.cgiGet( edtPPDetLinCantidad_Internalname), ",", ".") ;
                           A27PPDetLinRecibida = localUtil.ctol( httpContext.cgiGet( edtPPDetLinRecibida_Internalname), ",", ".") ;
                           A16PPDetLinPendiente = localUtil.ctol( httpContext.cgiGet( edtPPDetLinPendiente_Internalname), ",", ".") ;
                           A17PPDetFechaEntrega = localUtil.ctot( httpContext.cgiGet( edtPPDetFechaEntrega_Internalname), 0) ;
                           A23PPDetLinStatus = httpContext.cgiGet( edtPPDetLinStatus_Internalname) ;
                           A10Empresa = httpContext.cgiGet( edtEmpresa_Internalname) ;
                           A26Lote = httpContext.cgiGet( edtLote_Internalname) ;
                           n26Lote = false ;
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
                                 e120J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e130J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e140J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ocdocentry Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vOCDOCENTRY"), ",", ".") != AV13OcDocEntry )
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

   public void we0J2( )
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

   public void pa0J2( )
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
            GX_FocusControl = edtavOcdocentry_Internalname ;
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
                                 int AV13OcDocEntry ,
                                 String AV14Update ,
                                 String AV15Delete ,
                                 String AV19Pgmname ,
                                 int A24CabEntradaMercanciaId )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID_nCurrentRecord = 0 ;
      rf0J2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CABENTRADAMERCANCIAID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "CABENTRADAMERCANCIAID", GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_OC1LINENUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A11OC1LineNum), "ZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "OC1LINENUM", GXutil.ltrim( localUtil.ntoc( A11OC1LineNum, (byte)(9), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_ITMITEMCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A12ItmItemCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ITMITEMCODE", A12ItmItemCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_ITMITEMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13ItmItemName, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "ITMITEMNAME", A13ItmItemName);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_WHSCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14WhsCode, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "WHSCODE", A14WhsCode);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PPDETLINCANTIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A15PPDetLinCantidad), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "PPDETLINCANTIDAD", GXutil.ltrim( localUtil.ntoc( A15PPDetLinCantidad, (byte)(18), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PPDETLINRECIBIDA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A27PPDetLinRecibida), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "PPDETLINRECIBIDA", GXutil.ltrim( localUtil.ntoc( A27PPDetLinRecibida, (byte)(18), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PPDETLINPENDIENTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A16PPDetLinPendiente), "ZZZZZZZZZZZZZZZZZ9")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "PPDETLINPENDIENTE", GXutil.ltrim( localUtil.ntoc( A16PPDetLinPendiente, (byte)(18), (byte)(0), ".", "")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PPDETFECHAENTREGA", getSecureSignedToken( "", localUtil.format( A17PPDetFechaEntrega, "99/99/9999 99:99:99")));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "PPDETFECHAENTREGA", localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PPDETLINSTATUS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A23PPDetLinStatus, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "PPDETLINSTATUS", GXutil.rtrim( A23PPDetLinStatus));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRESA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A10Empresa, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "EMPRESA", A10Empresa);
      com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_LOTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A26Lote, ""))));
      com.wms.GxWebStd.gx_hidden_field( httpContext, "LOTE", A26Lote);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0J2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV19Pgmname = "WWDetEntradaMercancia" ;
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUpdate_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDelete_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
   }

   public void rf0J2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(25) ;
      /* Execute user event: Refresh */
      e130J2 ();
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
                                              new Integer(AV13OcDocEntry) ,
                                              new Integer(A1OcDocEntry) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT
                                              }
         } ) ;
         /* Using cursor H000J2 */
         pr_default.execute(0, new Object[] {new Integer(AV13OcDocEntry), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_25_idx = (short)(1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_252( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A26Lote = H000J2_A26Lote[0] ;
            n26Lote = H000J2_n26Lote[0] ;
            A10Empresa = H000J2_A10Empresa[0] ;
            A23PPDetLinStatus = H000J2_A23PPDetLinStatus[0] ;
            A17PPDetFechaEntrega = H000J2_A17PPDetFechaEntrega[0] ;
            A16PPDetLinPendiente = H000J2_A16PPDetLinPendiente[0] ;
            A27PPDetLinRecibida = H000J2_A27PPDetLinRecibida[0] ;
            A15PPDetLinCantidad = H000J2_A15PPDetLinCantidad[0] ;
            A14WhsCode = H000J2_A14WhsCode[0] ;
            A13ItmItemName = H000J2_A13ItmItemName[0] ;
            A12ItmItemCode = H000J2_A12ItmItemCode[0] ;
            A11OC1LineNum = H000J2_A11OC1LineNum[0] ;
            A1OcDocEntry = H000J2_A1OcDocEntry[0] ;
            A24CabEntradaMercanciaId = H000J2_A24CabEntradaMercanciaId[0] ;
            e140J2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(25) ;
         wb0J0( ) ;
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
                                           new Integer(AV13OcDocEntry) ,
                                           new Integer(A1OcDocEntry) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT
                                           }
      } ) ;
      /* Using cursor H000J3 */
      pr_default.execute(1, new Object[] {new Integer(AV13OcDocEntry)});
      GRID_nRecordCount = H000J3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13OcDocEntry, AV14Update, AV15Delete, AV19Pgmname, A24CabEntradaMercanciaId) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13OcDocEntry, AV14Update, AV15Delete, AV19Pgmname, A24CabEntradaMercanciaId) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13OcDocEntry, AV14Update, AV15Delete, AV19Pgmname, A24CabEntradaMercanciaId) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13OcDocEntry, AV14Update, AV15Delete, AV19Pgmname, A24CabEntradaMercanciaId) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13OcDocEntry, AV14Update, AV15Delete, AV19Pgmname, A24CabEntradaMercanciaId) ;
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0J0( )
   {
      /* Before Start, stand alone formulas. */
      AV19Pgmname = "WWDetEntradaMercancia" ;
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUpdate_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDelete_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e120J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOcdocentry_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOcdocentry_Internalname), ",", ".") > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOCDOCENTRY");
            GX_FocusControl = edtavOcdocentry_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13OcDocEntry = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OcDocEntry", GXutil.ltrim( GXutil.str( AV13OcDocEntry, 9, 0)));
         }
         else
         {
            AV13OcDocEntry = (int)(localUtil.ctol( httpContext.cgiGet( edtavOcdocentry_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OcDocEntry", GXutil.ltrim( GXutil.str( AV13OcDocEntry, 9, 0)));
         }
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
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vOCDOCENTRY"), ",", ".") != AV13OcDocEntry )
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
      e120J2 ();
      if (returnInSub) return;
   }

   public void e120J2( )
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
      Form.setCaption( "Det Entrada Mercancias" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e130J2( )
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

   private void e140J2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.wms.detentradamercancia") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A24CabEntradaMercanciaId,6,0))) ;
      edtavDelete_Link = formatLink("com.wms.detentradamercancia") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A24CabEntradaMercanciaId,6,0))) ;
      edtOcDocEntry_Link = formatLink("com.wms.viewdetentradamercancia") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A24CabEntradaMercanciaId,6,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
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

   public void e110J2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.wms.detentradamercancia") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
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
            AV13OcDocEntry = (int)(GXutil.lval( ((com.wms.SdtGridState_FilterValue)AV8GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OcDocEntry", GXutil.ltrim( GXutil.str( AV13OcDocEntry, 9, 0)));
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
      AV9GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV13OcDocEntry, 9, 0) );
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
      AV11TrnContext.setgxTv_SdtTransactionContext_Transactionname( "DetEntradaMercancia" );
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
      pa0J2( ) ;
      ws0J2( ) ;
      we0J2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1022385");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201811210232171");
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
         httpContext.AddJavascriptSource("wwdetentradamercancia.js", "?201811210232171");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_252( )
   {
      edtCabEntradaMercanciaId_Internalname = "CABENTRADAMERCANCIAID_"+sGXsfl_25_idx ;
      edtOcDocEntry_Internalname = "OCDOCENTRY_"+sGXsfl_25_idx ;
      edtOC1LineNum_Internalname = "OC1LINENUM_"+sGXsfl_25_idx ;
      edtItmItemCode_Internalname = "ITMITEMCODE_"+sGXsfl_25_idx ;
      edtItmItemName_Internalname = "ITMITEMNAME_"+sGXsfl_25_idx ;
      edtWhsCode_Internalname = "WHSCODE_"+sGXsfl_25_idx ;
      edtPPDetLinCantidad_Internalname = "PPDETLINCANTIDAD_"+sGXsfl_25_idx ;
      edtPPDetLinRecibida_Internalname = "PPDETLINRECIBIDA_"+sGXsfl_25_idx ;
      edtPPDetLinPendiente_Internalname = "PPDETLINPENDIENTE_"+sGXsfl_25_idx ;
      edtPPDetFechaEntrega_Internalname = "PPDETFECHAENTREGA_"+sGXsfl_25_idx ;
      edtPPDetLinStatus_Internalname = "PPDETLINSTATUS_"+sGXsfl_25_idx ;
      edtEmpresa_Internalname = "EMPRESA_"+sGXsfl_25_idx ;
      edtLote_Internalname = "LOTE_"+sGXsfl_25_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_25_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_25_idx ;
   }

   public void subsflControlProps_fel_252( )
   {
      edtCabEntradaMercanciaId_Internalname = "CABENTRADAMERCANCIAID_"+sGXsfl_25_fel_idx ;
      edtOcDocEntry_Internalname = "OCDOCENTRY_"+sGXsfl_25_fel_idx ;
      edtOC1LineNum_Internalname = "OC1LINENUM_"+sGXsfl_25_fel_idx ;
      edtItmItemCode_Internalname = "ITMITEMCODE_"+sGXsfl_25_fel_idx ;
      edtItmItemName_Internalname = "ITMITEMNAME_"+sGXsfl_25_fel_idx ;
      edtWhsCode_Internalname = "WHSCODE_"+sGXsfl_25_fel_idx ;
      edtPPDetLinCantidad_Internalname = "PPDETLINCANTIDAD_"+sGXsfl_25_fel_idx ;
      edtPPDetLinRecibida_Internalname = "PPDETLINRECIBIDA_"+sGXsfl_25_fel_idx ;
      edtPPDetLinPendiente_Internalname = "PPDETLINPENDIENTE_"+sGXsfl_25_fel_idx ;
      edtPPDetFechaEntrega_Internalname = "PPDETFECHAENTREGA_"+sGXsfl_25_fel_idx ;
      edtPPDetLinStatus_Internalname = "PPDETLINSTATUS_"+sGXsfl_25_fel_idx ;
      edtEmpresa_Internalname = "EMPRESA_"+sGXsfl_25_fel_idx ;
      edtLote_Internalname = "LOTE_"+sGXsfl_25_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_25_fel_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_25_fel_idx ;
   }

   public void sendrow_252( )
   {
      subsflControlProps_252( ) ;
      wb0J0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCabEntradaMercanciaId_Internalname,GXutil.ltrim( localUtil.ntoc( A24CabEntradaMercanciaId, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCabEntradaMercanciaId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOcDocEntry_Internalname,GXutil.ltrim( localUtil.ntoc( A1OcDocEntry, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A1OcDocEntry), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtOcDocEntry_Link,"","","",edtOcDocEntry_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOC1LineNum_Internalname,GXutil.ltrim( localUtil.ntoc( A11OC1LineNum, (byte)(9), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A11OC1LineNum), "ZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOC1LineNum_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItmItemCode_Internalname,A12ItmItemCode,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtItmItemCode_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItmItemName_Internalname,A13ItmItemName,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtItmItemName_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWhsCode_Internalname,A14WhsCode,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtWhsCode_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPPDetLinCantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A15PPDetLinCantidad, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A15PPDetLinCantidad), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPPDetLinCantidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPPDetLinRecibida_Internalname,GXutil.ltrim( localUtil.ntoc( A27PPDetLinRecibida, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A27PPDetLinRecibida), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPPDetLinRecibida_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPPDetLinPendiente_Internalname,GXutil.ltrim( localUtil.ntoc( A16PPDetLinPendiente, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A16PPDetLinPendiente), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPPDetLinPendiente_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPPDetFechaEntrega_Internalname,localUtil.ttoc( A17PPDetFechaEntrega, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A17PPDetFechaEntrega, "99/99/9999 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPPDetFechaEntrega_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPPDetLinStatus_Internalname,GXutil.rtrim( A23PPDetLinStatus),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPPDetLinStatus_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpresa_Internalname,A10Empresa,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpresa_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLote_Internalname,A26Lote,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLote_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_CABENTRADAMERCANCIAID"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A24CabEntradaMercanciaId), "ZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_OC1LINENUM"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A11OC1LineNum), "ZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_ITMITEMCODE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A12ItmItemCode, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_ITMITEMNAME"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A13ItmItemName, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_WHSCODE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A14WhsCode, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PPDETLINCANTIDAD"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A15PPDetLinCantidad), "ZZZZZZZZZZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PPDETLINRECIBIDA"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A27PPDetLinRecibida), "ZZZZZZZZZZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PPDETLINPENDIENTE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(A16PPDetLinPendiente), "ZZZZZZZZZZZZZZZZZ9")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PPDETFECHAENTREGA"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( A17PPDetFechaEntrega, "99/99/9999 99:99:99")));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_PPDETLINSTATUS"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A23PPDetLinStatus, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRESA"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A10Empresa, ""))));
         com.wms.GxWebStd.gx_hidden_field( httpContext, "gxhash_LOTE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( A26Lote, ""))));
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
      edtavOcdocentry_Internalname = "vOCDOCENTRY" ;
      divTabletop_Internalname = "TABLETOP" ;
      edtCabEntradaMercanciaId_Internalname = "CABENTRADAMERCANCIAID" ;
      edtOcDocEntry_Internalname = "OCDOCENTRY" ;
      edtOC1LineNum_Internalname = "OC1LINENUM" ;
      edtItmItemCode_Internalname = "ITMITEMCODE" ;
      edtItmItemName_Internalname = "ITMITEMNAME" ;
      edtWhsCode_Internalname = "WHSCODE" ;
      edtPPDetLinCantidad_Internalname = "PPDETLINCANTIDAD" ;
      edtPPDetLinRecibida_Internalname = "PPDETLINRECIBIDA" ;
      edtPPDetLinPendiente_Internalname = "PPDETLINPENDIENTE" ;
      edtPPDetFechaEntrega_Internalname = "PPDETFECHAENTREGA" ;
      edtPPDetLinStatus_Internalname = "PPDETLINSTATUS" ;
      edtEmpresa_Internalname = "EMPRESA" ;
      edtLote_Internalname = "LOTE" ;
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
      edtLote_Jsonclick = "" ;
      edtEmpresa_Jsonclick = "" ;
      edtPPDetLinStatus_Jsonclick = "" ;
      edtPPDetFechaEntrega_Jsonclick = "" ;
      edtPPDetLinPendiente_Jsonclick = "" ;
      edtPPDetLinRecibida_Jsonclick = "" ;
      edtPPDetLinCantidad_Jsonclick = "" ;
      edtWhsCode_Jsonclick = "" ;
      edtItmItemName_Jsonclick = "" ;
      edtItmItemCode_Jsonclick = "" ;
      edtOC1LineNum_Jsonclick = "" ;
      edtOcDocEntry_Jsonclick = "" ;
      edtCabEntradaMercanciaId_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      edtOcDocEntry_Link = "" ;
      edtavDelete_Enabled = 0 ;
      edtavUpdate_Enabled = 0 ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavOcdocentry_Jsonclick = "" ;
      edtavOcdocentry_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Det Entrada Mercancia" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV14Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV15Delete',fld:'vDELETE',pic:'',nv:''},{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',hsh:true,nv:0},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV13OcDocEntry',fld:'vOCDOCENTRY',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e140J2',iparms:[{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'},{av:'edtOcDocEntry_Link',ctrl:'OCDOCENTRY',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e110J2',iparms:[{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV14Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV15Delete',fld:'vDELETE',pic:'',nv:''},{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',hsh:true,nv:0},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV13OcDocEntry',fld:'vOCDOCENTRY',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV14Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV15Delete',fld:'vDELETE',pic:'',nv:''},{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',hsh:true,nv:0},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV13OcDocEntry',fld:'vOCDOCENTRY',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV14Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV15Delete',fld:'vDELETE',pic:'',nv:''},{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',hsh:true,nv:0},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV13OcDocEntry',fld:'vOCDOCENTRY',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV14Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV15Delete',fld:'vDELETE',pic:'',nv:''},{av:'A24CabEntradaMercanciaId',fld:'CABENTRADAMERCANCIAID',pic:'ZZZZZ9',hsh:true,nv:0},{av:'AV19Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV13OcDocEntry',fld:'vOCDOCENTRY',pic:'ZZZZZZZZ9',nv:0}],oparms:[]}");
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
      A12ItmItemCode = "" ;
      A13ItmItemName = "" ;
      A14WhsCode = "" ;
      A17PPDetFechaEntrega = GXutil.resetTime( GXutil.nullDate() );
      A23PPDetLinStatus = "" ;
      A10Empresa = "" ;
      A26Lote = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      H000J2_A26Lote = new String[] {""} ;
      H000J2_n26Lote = new boolean[] {false} ;
      H000J2_A10Empresa = new String[] {""} ;
      H000J2_A23PPDetLinStatus = new String[] {""} ;
      H000J2_A17PPDetFechaEntrega = new java.util.Date[] {GXutil.nullDate()} ;
      H000J2_A16PPDetLinPendiente = new long[1] ;
      H000J2_A27PPDetLinRecibida = new long[1] ;
      H000J2_A15PPDetLinCantidad = new long[1] ;
      H000J2_A14WhsCode = new String[] {""} ;
      H000J2_A13ItmItemName = new String[] {""} ;
      H000J2_A12ItmItemCode = new String[] {""} ;
      H000J2_A11OC1LineNum = new int[1] ;
      H000J2_A1OcDocEntry = new int[1] ;
      H000J2_A24CabEntradaMercanciaId = new int[1] ;
      H000J3_AGRID_nRecordCount = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV8GridState = new com.wms.SdtGridState(remoteHandle, context);
      AV6Session = httpContext.getWebSession();
      AV9GridStateFilterValue = new com.wms.SdtGridState_FilterValue(remoteHandle, context);
      AV11TrnContext = new com.wms.SdtTransactionContext(remoteHandle, context);
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.wwdetentradamercancia__default(),
         new Object[] {
             new Object[] {
            H000J2_A26Lote, H000J2_n26Lote, H000J2_A10Empresa, H000J2_A23PPDetLinStatus, H000J2_A17PPDetFechaEntrega, H000J2_A16PPDetLinPendiente, H000J2_A27PPDetLinRecibida, H000J2_A15PPDetLinCantidad, H000J2_A14WhsCode, H000J2_A13ItmItemName,
            H000J2_A12ItmItemCode, H000J2_A11OC1LineNum, H000J2_A1OcDocEntry, H000J2_A24CabEntradaMercanciaId
            }
            , new Object[] {
            H000J3_AGRID_nRecordCount
            }
         }
      );
      AV19Pgmname = "WWDetEntradaMercancia" ;
      /* GeneXus formulas. */
      AV19Pgmname = "WWDetEntradaMercancia" ;
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
   private int AV13OcDocEntry ;
   private int A24CabEntradaMercanciaId ;
   private int edtavOcdocentry_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A1OcDocEntry ;
   private int A11OC1LineNum ;
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
   private long A15PPDetLinCantidad ;
   private long A27PPDetLinRecibida ;
   private long A16PPDetLinPendiente ;
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
   private String edtavOcdocentry_Internalname ;
   private String edtavOcdocentry_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtOcDocEntry_Link ;
   private String A23PPDetLinStatus ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCabEntradaMercanciaId_Internalname ;
   private String edtOcDocEntry_Internalname ;
   private String edtOC1LineNum_Internalname ;
   private String edtItmItemCode_Internalname ;
   private String edtItmItemName_Internalname ;
   private String edtWhsCode_Internalname ;
   private String edtPPDetLinCantidad_Internalname ;
   private String edtPPDetLinRecibida_Internalname ;
   private String edtPPDetLinPendiente_Internalname ;
   private String edtPPDetFechaEntrega_Internalname ;
   private String edtPPDetLinStatus_Internalname ;
   private String edtEmpresa_Internalname ;
   private String edtLote_Internalname ;
   private String edtavUpdate_Internalname ;
   private String edtavDelete_Internalname ;
   private String scmdbuf ;
   private String sGXsfl_25_fel_idx="0001" ;
   private String ROClassString ;
   private String edtCabEntradaMercanciaId_Jsonclick ;
   private String edtOcDocEntry_Jsonclick ;
   private String edtOC1LineNum_Jsonclick ;
   private String edtItmItemCode_Jsonclick ;
   private String edtItmItemName_Jsonclick ;
   private String edtWhsCode_Jsonclick ;
   private String edtPPDetLinCantidad_Jsonclick ;
   private String edtPPDetLinRecibida_Jsonclick ;
   private String edtPPDetLinPendiente_Jsonclick ;
   private String edtPPDetFechaEntrega_Jsonclick ;
   private String edtPPDetLinStatus_Jsonclick ;
   private String edtEmpresa_Jsonclick ;
   private String edtLote_Jsonclick ;
   private String edtavUpdate_Jsonclick ;
   private String edtavDelete_Jsonclick ;
   private java.util.Date A17PPDetFechaEntrega ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n26Lote ;
   private boolean bGXsfl_25_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String A12ItmItemCode ;
   private String A13ItmItemName ;
   private String A14WhsCode ;
   private String A10Empresa ;
   private String A26Lote ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV6Session ;
   private IDataStoreProvider pr_default ;
   private String[] H000J2_A26Lote ;
   private boolean[] H000J2_n26Lote ;
   private String[] H000J2_A10Empresa ;
   private String[] H000J2_A23PPDetLinStatus ;
   private java.util.Date[] H000J2_A17PPDetFechaEntrega ;
   private long[] H000J2_A16PPDetLinPendiente ;
   private long[] H000J2_A27PPDetLinRecibida ;
   private long[] H000J2_A15PPDetLinCantidad ;
   private String[] H000J2_A14WhsCode ;
   private String[] H000J2_A13ItmItemName ;
   private String[] H000J2_A12ItmItemCode ;
   private int[] H000J2_A11OC1LineNum ;
   private int[] H000J2_A1OcDocEntry ;
   private int[] H000J2_A24CabEntradaMercanciaId ;
   private long[] H000J3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.wms.SdtGridState AV8GridState ;
   private com.wms.SdtGridState_FilterValue AV9GridStateFilterValue ;
   private com.wms.SdtTransactionContext AV11TrnContext ;
}

final  class wwdetentradamercancia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV13OcDocEntry ,
                                          int A1OcDocEntry )
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
      sSelectString = " [Lote], [Empresa], [PPDetLinStatus], [PPDetFechaEntrega], [PPDetLinPendiente], [PPDetLinRecibida]," ;
      sSelectString = sSelectString + " [PPDetLinCantidad], [WhsCode], [ItmItemName], [ItmItemCode], [OC1LineNum], [OcDocEntry]," ;
      sSelectString = sSelectString + " [CabEntradaMercanciaId]" ;
      sFromString = " FROM [CabEntradaMercancia] WITH (NOLOCK)" ;
      sOrderString = "" ;
      if ( ! (0==AV13OcDocEntry) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and ([OcDocEntry] >= ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " ([OcDocEntry] >= ?)" ;
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
      sOrderString = sOrderString + " ORDER BY [OcDocEntry]" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT CAST((SELECT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) AS INTEGER) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000J3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          int AV13OcDocEntry ,
                                          int A1OcDocEntry )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [1] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM [CabEntradaMercancia] WITH (NOLOCK)" ;
      if ( ! (0==AV13OcDocEntry) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and ([OcDocEntry] >= ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " ([OcDocEntry] >= ?)" ;
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
                  return conditional_H000J2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() );
            case 1 :
                  return conditional_H000J3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000J3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 1) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((long[]) buf[7])[0] = rslt.getLong(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((int[]) buf[11])[0] = rslt.getInt(11) ;
               ((int[]) buf[12])[0] = rslt.getInt(12) ;
               ((int[]) buf[13])[0] = rslt.getInt(13) ;
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
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[1]).intValue());
               }
               return;
      }
   }

}

