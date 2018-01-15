/*
               File: PReportOne2
        Description: Report One2
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:42.68
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.wms.apreportone2")
public final  class apreportone2 extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new apreportone2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new apreportone2_impl(context);
   }

   public String getServletInfo( )
   {
      return "Report One2";
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

