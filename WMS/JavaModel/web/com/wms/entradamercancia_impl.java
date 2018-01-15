/*
               File: entradamercancia_impl
        Description: Entrada Mercancia
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:19.53
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

public final  class entradamercancia_impl extends GXDataArea
{
   public entradamercancia_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradamercancia_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradamercancia_impl.class ));
   }

   public entradamercancia_impl( int remoteHandle ,
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
            nRC_GXsfl_13 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_13_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_13_idx = httpContext.GetNextPar( ) ;
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
      pa0M2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0M2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201811210231956");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.wms.entradamercancia") +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Cabentrada", AV7CabEntrada);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Cabentrada", AV7CabEntrada);
      }
      com.wms.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_13", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_13, (byte)(4), (byte)(0), ",", "")));
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
         we0M2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0M2( ) ;
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
      return formatLink("com.wms.entradamercancia")  ;
   }

   public String getPgmname( )
   {
      return "EntradaMercancia" ;
   }

   public String getPgmdesc( )
   {
      return "Entrada Mercancia" ;
   }

   public void wb0M0( )
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
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.wms.GxWebStd.gx_label_element( httpContext, edtavNumerooc_Internalname, "Numero OC", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'" + sGXsfl_13_idx + "',0)\"" ;
         com.wms.GxWebStd.gx_single_line_edit( httpContext, edtavNumerooc_Internalname, GXutil.ltrim( localUtil.ntoc( AV6NumeroOC, (byte)(6), (byte)(0), ",", "")), ((edtavNumerooc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6NumeroOC), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6NumeroOC), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,7);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNumerooc_Jsonclick, 0, "Attribute", "", "", "", 1, edtavNumerooc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_EntradaMercancia.htm");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.wms.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         com.wms.GxWebStd.gx_button_ctrl( httpContext, bttGetentradamerc_Internalname, "gx.evt.setGridEvt("+GXutil.str( 13, 2, 0)+","+"null"+");", "Get Entrada Merc", bttGetentradamerc_Jsonclick, 5, "Get Entrada Merc", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'GETENTRADAMERC\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaMercancia.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"13\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Entrada Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Número OC") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cod. Proveedor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Proveedor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha de Emisión") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha de Vencimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Solicitado por") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Empresa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Recibido por") ;
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
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 13 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_13 = (short)(nGXsfl_13_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV10GXV1 = nGXsfl_13_idx ;
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
         com.wms.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start0M2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_3-111985", (short)(0)) ;
         Form.getMeta().addItem("description", "Entrada Mercancia", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0M0( ) ;
   }

   public void ws0M2( )
   {
      start0M2( ) ;
      evt0M2( ) ;
   }

   public void evt0M2( )
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
                        else if ( GXutil.strcmp(sEvt, "'GETENTRADAMERC'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'GetEntradaMerc' */
                           e110M2 ();
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
                           nGXsfl_13_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_13_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_13_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_132( ) ;
                           AV10GXV1 = nGXsfl_13_idx ;
                           if ( ( AV7CabEntrada.size() >= AV10GXV1 ) && ( AV10GXV1 > 0 ) )
                           {
                              AV7CabEntrada.currentItem( ((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e120M2 ();
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we0M2( )
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

   public void pa0M2( )
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
            GX_FocusControl = edtavNumerooc_Internalname ;
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
      subsflControlProps_132( ) ;
      while ( nGXsfl_13_idx <= nRC_GXsfl_13 )
      {
         sendrow_132( ) ;
         nGXsfl_13_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_13_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_13_idx+1)) ;
         sGXsfl_13_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_13_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_132( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( )
   {
      initialize_formulas( ) ;
      com.wms.GxWebStd.set_html_headers( httpContext, 0, "", "");
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      GRID1_nCurrentRecord = 0 ;
      rf0M2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0M2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0M2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(13) ;
      nGXsfl_13_idx = (short)(1) ;
      sGXsfl_13_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_13_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_132( ) ;
      bGXsfl_13_Refreshing = true ;
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
         subsflControlProps_132( ) ;
         e120M2 ();
         wbEnd = (short)(13) ;
         wb0M0( ) ;
      }
      bGXsfl_13_Refreshing = true ;
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

   public void strup0M0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Cabentrada"), AV7CabEntrada);
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerooc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerooc_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMEROOC");
            GX_FocusControl = edtavNumerooc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6NumeroOC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6NumeroOC", GXutil.ltrim( GXutil.str( AV6NumeroOC, 6, 0)));
         }
         else
         {
            AV6NumeroOC = (int)(localUtil.ctol( httpContext.cgiGet( edtavNumerooc_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6NumeroOC", GXutil.ltrim( GXutil.str( AV6NumeroOC, 6, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_13 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_13"), ",", ".")) ;
         nRC_GXsfl_13 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_13"), ",", ".")) ;
         nGXsfl_13_fel_idx = (short)(0) ;
         while ( nGXsfl_13_fel_idx < nRC_GXsfl_13 )
         {
            nGXsfl_13_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_13_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_13_fel_idx+1)) ;
            sGXsfl_13_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_13_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_132( ) ;
            AV10GXV1 = nGXsfl_13_fel_idx ;
            if ( ( AV7CabEntrada.size() >= AV10GXV1 ) && ( AV10GXV1 > 0 ) )
            {
               AV7CabEntrada.currentItem( ((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)) );
            }
         }
         if ( nGXsfl_13_fel_idx == 0 )
         {
            nGXsfl_13_idx = (short)(1) ;
            sGXsfl_13_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_13_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_132( ) ;
         }
         nGXsfl_13_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   public void e110M2( )
   {
      AV10GXV1 = nGXsfl_13_idx ;
      if ( AV7CabEntrada.size() >= AV10GXV1 )
      {
         AV7CabEntrada.currentItem( ((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)) );
      }
      /* 'GetEntradaMerc' Routine */
      GXt_objcol_SdtCabEntrada_CabEntradaItem1 = AV7CabEntrada ;
      GXv_objcol_SdtCabEntrada_CabEntradaItem2[0] = GXt_objcol_SdtCabEntrada_CabEntradaItem1 ;
      new com.wms.cabentradamercanciaget(remoteHandle, context).execute( AV6NumeroOC, GXv_objcol_SdtCabEntrada_CabEntradaItem2) ;
      GXt_objcol_SdtCabEntrada_CabEntradaItem1 = GXv_objcol_SdtCabEntrada_CabEntradaItem2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6NumeroOC", GXutil.ltrim( GXutil.str( AV6NumeroOC, 6, 0)));
      AV7CabEntrada = GXt_objcol_SdtCabEntrada_CabEntradaItem1 ;
      gx_BV13 = true ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7CabEntrada", AV7CabEntrada);
      nGXsfl_13_bak_idx = nGXsfl_13_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_13_idx = nGXsfl_13_bak_idx ;
      sGXsfl_13_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_13_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_132( ) ;
   }

   private void e120M2( )
   {
      /* Grid1_Load Routine */
      AV10GXV1 = (short)(1) ;
      while ( AV10GXV1 <= AV7CabEntrada.size() )
      {
         AV7CabEntrada.currentItem( ((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(13) ;
         }
         sendrow_132( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_13_Refreshing )
         {
            httpContext.doAjaxLoad(13, Grid1Row);
         }
         AV10GXV1 = (short)(AV10GXV1+1) ;
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
      pa0M2( ) ;
      ws0M2( ) ;
      we0M2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20181121023201");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 111985));
      httpContext.AddJavascriptSource("entradamercancia.js", "?20181121023201");
      /* End function include_jscripts */
   }

   public void subsflControlProps_132( )
   {
      edtavCtlcabentradamercanciaid_Internalname = "CTLCABENTRADAMERCANCIAID_"+sGXsfl_13_idx ;
      edtavCtlocdocentry_Internalname = "CTLOCDOCENTRY_"+sGXsfl_13_idx ;
      edtavCtlprovcarcode_Internalname = "CTLPROVCARCODE_"+sGXsfl_13_idx ;
      edtavCtlprovcardname_Internalname = "CTLPROVCARDNAME_"+sGXsfl_13_idx ;
      edtavCtlocdocdate_Internalname = "CTLOCDOCDATE_"+sGXsfl_13_idx ;
      edtavCtlocdocduedate_Internalname = "CTLOCDOCDUEDATE_"+sGXsfl_13_idx ;
      edtavCtlempslpname_Internalname = "CTLEMPSLPNAME_"+sGXsfl_13_idx ;
      edtavCtlempresa_Internalname = "CTLEMPRESA_"+sGXsfl_13_idx ;
      edtavCtlusername_Internalname = "CTLUSERNAME_"+sGXsfl_13_idx ;
   }

   public void subsflControlProps_fel_132( )
   {
      edtavCtlcabentradamercanciaid_Internalname = "CTLCABENTRADAMERCANCIAID_"+sGXsfl_13_fel_idx ;
      edtavCtlocdocentry_Internalname = "CTLOCDOCENTRY_"+sGXsfl_13_fel_idx ;
      edtavCtlprovcarcode_Internalname = "CTLPROVCARCODE_"+sGXsfl_13_fel_idx ;
      edtavCtlprovcardname_Internalname = "CTLPROVCARDNAME_"+sGXsfl_13_fel_idx ;
      edtavCtlocdocdate_Internalname = "CTLOCDOCDATE_"+sGXsfl_13_fel_idx ;
      edtavCtlocdocduedate_Internalname = "CTLOCDOCDUEDATE_"+sGXsfl_13_fel_idx ;
      edtavCtlempslpname_Internalname = "CTLEMPSLPNAME_"+sGXsfl_13_fel_idx ;
      edtavCtlempresa_Internalname = "CTLEMPRESA_"+sGXsfl_13_fel_idx ;
      edtavCtlusername_Internalname = "CTLUSERNAME_"+sGXsfl_13_fel_idx ;
   }

   public void sendrow_132( )
   {
      subsflControlProps_132( ) ;
      wb0M0( ) ;
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
         if ( ((int)((nGXsfl_13_idx) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_13_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlcabentradamercanciaid_Enabled!=0)&&(edtavCtlcabentradamercanciaid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 14,'',false,'"+sGXsfl_13_idx+"',13)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcabentradamercanciaid_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid(), (byte)(6), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid()), "ZZZZZ9")),TempTags+((edtavCtlcabentradamercanciaid_Enabled!=0)&&(edtavCtlcabentradamercanciaid_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlcabentradamercanciaid_Enabled!=0)&&(edtavCtlcabentradamercanciaid_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,14);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcabentradamercanciaid_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(13),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlocdocentry_Enabled!=0)&&(edtavCtlocdocentry_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 15,'',false,'"+sGXsfl_13_idx+"',13)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlocdocentry_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry(), (byte)(9), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry()), "ZZZZZZZZ9")),TempTags+((edtavCtlocdocentry_Enabled!=0)&&(edtavCtlocdocentry_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlocdocentry_Enabled!=0)&&(edtavCtlocdocentry_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,15);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlocdocentry_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(13),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlprovcarcode_Enabled!=0)&&(edtavCtlprovcarcode_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 16,'',false,'"+sGXsfl_13_idx+"',13)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlprovcarcode_Internalname,((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Provcarcode(),"",TempTags+((edtavCtlprovcarcode_Enabled!=0)&&(edtavCtlprovcarcode_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlprovcarcode_Enabled!=0)&&(edtavCtlprovcarcode_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,16);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlprovcarcode_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(13),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlprovcardname_Enabled!=0)&&(edtavCtlprovcardname_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 17,'',false,'"+sGXsfl_13_idx+"',13)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlprovcardname_Internalname,((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Provcardname(),"",TempTags+((edtavCtlprovcardname_Enabled!=0)&&(edtavCtlprovcardname_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlprovcardname_Enabled!=0)&&(edtavCtlprovcardname_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,17);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlprovcardname_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(13),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlocdocdate_Enabled!=0)&&(edtavCtlocdocdate_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 18,'',false,'"+sGXsfl_13_idx+"',13)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlocdocdate_Internalname,localUtil.ttoc( ((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate(), 10, 8, 0, 3, "/", ":", " "),localUtil.format( ((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate(), "99/99/9999 99:99:99"),TempTags+((edtavCtlocdocdate_Enabled!=0)&&(edtavCtlocdocdate_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlocdocdate_Enabled!=0)&&(edtavCtlocdocdate_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,18);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlocdocdate_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(13),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlocdocduedate_Enabled!=0)&&(edtavCtlocdocduedate_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 19,'',false,'"+sGXsfl_13_idx+"',13)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlocdocduedate_Internalname,localUtil.ttoc( ((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate(), 10, 8, 0, 3, "/", ":", " "),localUtil.format( ((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate(), "99/99/9999 99:99:99"),TempTags+((edtavCtlocdocduedate_Enabled!=0)&&(edtavCtlocdocduedate_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlocdocduedate_Enabled!=0)&&(edtavCtlocdocduedate_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 10,'DMY',8,24,'spa',false,0);"+";gx.evt.onblur(this,19);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlocdocduedate_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(13),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlempslpname_Enabled!=0)&&(edtavCtlempslpname_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 20,'',false,'"+sGXsfl_13_idx+"',13)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlempslpname_Internalname,((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Empslpname(),"",TempTags+((edtavCtlempslpname_Enabled!=0)&&(edtavCtlempslpname_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlempslpname_Enabled!=0)&&(edtavCtlempslpname_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,20);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlempslpname_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(155),new Integer(0),new Integer(0),new Integer(13),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlempresa_Enabled!=0)&&(edtavCtlempresa_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 21,'',false,'"+sGXsfl_13_idx+"',13)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlempresa_Internalname,((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Empresa(),"",TempTags+((edtavCtlempresa_Enabled!=0)&&(edtavCtlempresa_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlempresa_Enabled!=0)&&(edtavCtlempresa_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,21);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlempresa_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(13),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlusername_Enabled!=0)&&(edtavCtlusername_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 22,'',false,'"+sGXsfl_13_idx+"',13)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlusername_Internalname,((com.wms.SdtCabEntrada_CabEntradaItem)AV7CabEntrada.elementAt(-1+AV10GXV1)).getgxTv_SdtCabEntrada_CabEntradaItem_Username(),"",TempTags+((edtavCtlusername_Enabled!=0)&&(edtavCtlusername_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlusername_Enabled!=0)&&(edtavCtlusername_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,22);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlusername_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(13),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_13_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_13_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_13_idx+1)) ;
      sGXsfl_13_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_13_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_132( ) ;
      /* End function sendrow_132 */
   }

   public void init_default_properties( )
   {
      edtavNumerooc_Internalname = "vNUMEROOC" ;
      bttGetentradamerc_Internalname = "GETENTRADAMERC" ;
      edtavCtlcabentradamercanciaid_Internalname = "CTLCABENTRADAMERCANCIAID" ;
      edtavCtlocdocentry_Internalname = "CTLOCDOCENTRY" ;
      edtavCtlprovcarcode_Internalname = "CTLPROVCARCODE" ;
      edtavCtlprovcardname_Internalname = "CTLPROVCARDNAME" ;
      edtavCtlocdocdate_Internalname = "CTLOCDOCDATE" ;
      edtavCtlocdocduedate_Internalname = "CTLOCDOCDUEDATE" ;
      edtavCtlempslpname_Internalname = "CTLEMPSLPNAME" ;
      edtavCtlempresa_Internalname = "CTLEMPRESA" ;
      edtavCtlusername_Internalname = "CTLUSERNAME" ;
      divMaintable_Internalname = "MAINTABLE" ;
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
      edtavCtlusername_Jsonclick = "" ;
      edtavCtlusername_Visible = -1 ;
      edtavCtlusername_Enabled = 1 ;
      edtavCtlempresa_Jsonclick = "" ;
      edtavCtlempresa_Visible = -1 ;
      edtavCtlempresa_Enabled = 1 ;
      edtavCtlempslpname_Jsonclick = "" ;
      edtavCtlempslpname_Visible = -1 ;
      edtavCtlempslpname_Enabled = 1 ;
      edtavCtlocdocduedate_Jsonclick = "" ;
      edtavCtlocdocduedate_Visible = -1 ;
      edtavCtlocdocduedate_Enabled = 1 ;
      edtavCtlocdocdate_Jsonclick = "" ;
      edtavCtlocdocdate_Visible = -1 ;
      edtavCtlocdocdate_Enabled = 1 ;
      edtavCtlprovcardname_Jsonclick = "" ;
      edtavCtlprovcardname_Visible = -1 ;
      edtavCtlprovcardname_Enabled = 1 ;
      edtavCtlprovcarcode_Jsonclick = "" ;
      edtavCtlprovcarcode_Visible = -1 ;
      edtavCtlprovcarcode_Enabled = 1 ;
      edtavCtlocdocentry_Jsonclick = "" ;
      edtavCtlocdocentry_Visible = -1 ;
      edtavCtlocdocentry_Enabled = 1 ;
      edtavCtlcabentradamercanciaid_Jsonclick = "" ;
      edtavCtlcabentradamercanciaid_Visible = -1 ;
      edtavCtlcabentradamercanciaid_Enabled = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Class = "Grid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavNumerooc_Jsonclick = "" ;
      edtavNumerooc_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Entrada Mercancia" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV7CabEntrada',fld:'vCABENTRADA',grid:13,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("'GETENTRADAMERC'","{handler:'e110M2',iparms:[{av:'AV6NumeroOC',fld:'vNUMEROOC',pic:'ZZZZZ9',nv:0},{av:'AV7CabEntrada',fld:'vCABENTRADA',grid:13,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'AV7CabEntrada',fld:'vCABENTRADA',grid:13,pic:'',nv:null}]}");
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
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV7CabEntrada = new GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem>(com.wms.SdtCabEntrada_CabEntradaItem.class, "CabEntrada.CabEntradaItem", "WMS", remoteHandle);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttGetentradamerc_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      GXt_objcol_SdtCabEntrada_CabEntradaItem1 = new GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem>(com.wms.SdtCabEntrada_CabEntradaItem.class, "CabEntrada.CabEntradaItem", "WMS", remoteHandle);
      GXv_objcol_SdtCabEntrada_CabEntradaItem2 = new GXBaseCollection [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      ROClassString = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
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
   private byte nDonePA ;
   private byte GRID1_nEOF ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_13 ;
   private short nGXsfl_13_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV10GXV1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_13_fel_idx=1 ;
   private short nGXsfl_13_bak_idx=1 ;
   private int AV6NumeroOC ;
   private int edtavNumerooc_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavCtlcabentradamercanciaid_Enabled ;
   private int edtavCtlcabentradamercanciaid_Visible ;
   private int edtavCtlocdocentry_Enabled ;
   private int edtavCtlocdocentry_Visible ;
   private int edtavCtlprovcarcode_Enabled ;
   private int edtavCtlprovcarcode_Visible ;
   private int edtavCtlprovcardname_Enabled ;
   private int edtavCtlprovcardname_Visible ;
   private int edtavCtlocdocdate_Enabled ;
   private int edtavCtlocdocdate_Visible ;
   private int edtavCtlocdocduedate_Enabled ;
   private int edtavCtlocdocduedate_Visible ;
   private int edtavCtlempslpname_Enabled ;
   private int edtavCtlempslpname_Visible ;
   private int edtavCtlempresa_Enabled ;
   private int edtavCtlempresa_Visible ;
   private int edtavCtlusername_Enabled ;
   private int edtavCtlusername_Visible ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_13_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String edtavNumerooc_Internalname ;
   private String TempTags ;
   private String edtavNumerooc_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String bttGetentradamerc_Internalname ;
   private String bttGetentradamerc_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sGXsfl_13_fel_idx="0001" ;
   private String edtavCtlcabentradamercanciaid_Internalname ;
   private String edtavCtlocdocentry_Internalname ;
   private String edtavCtlprovcarcode_Internalname ;
   private String edtavCtlprovcardname_Internalname ;
   private String edtavCtlocdocdate_Internalname ;
   private String edtavCtlocdocduedate_Internalname ;
   private String edtavCtlempslpname_Internalname ;
   private String edtavCtlempresa_Internalname ;
   private String edtavCtlusername_Internalname ;
   private String ROClassString ;
   private String edtavCtlcabentradamercanciaid_Jsonclick ;
   private String edtavCtlocdocentry_Jsonclick ;
   private String edtavCtlprovcarcode_Jsonclick ;
   private String edtavCtlprovcardname_Jsonclick ;
   private String edtavCtlocdocdate_Jsonclick ;
   private String edtavCtlocdocduedate_Jsonclick ;
   private String edtavCtlempslpname_Jsonclick ;
   private String edtavCtlempresa_Jsonclick ;
   private String edtavCtlusername_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_13_Refreshing=false ;
   private boolean gx_BV13 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem> AV7CabEntrada ;
   private GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem> GXt_objcol_SdtCabEntrada_CabEntradaItem1 ;
   private GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem> GXv_objcol_SdtCabEntrada_CabEntradaItem2[] ;
}

