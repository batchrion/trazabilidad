/*
               File: RegistroInspeccion
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.wms.registroinspeccion")
public final  class registroinspeccion extends GXWebObjectStub
{
   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(com.wms.GXcfg.class);
      com.wms.registroinspeccion_impl pgm = new com.wms.registroinspeccion_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new registroinspeccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new registroinspeccion_impl(context);
   }

   public String getServletInfo( )
   {
      return "Registro de Inspección";
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

}

