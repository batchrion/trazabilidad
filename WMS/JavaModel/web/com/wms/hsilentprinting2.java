/*
               File: HSilentPrinting2
        Description: Silent Printing2
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:19.17
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.wms.hsilentprinting2")
public final  class hsilentprinting2 extends GXWebObjectStub
{
   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(com.wms.GXcfg.class);
      com.wms.hsilentprinting2_impl pgm = new com.wms.hsilentprinting2_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hsilentprinting2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hsilentprinting2_impl(context);
   }

   public String getServletInfo( )
   {
      return "Silent Printing2";
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

