/*
               File: BodegaCuar
        Description: Bodega Cuar
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 11, 2018 11:27:20.1
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.wms.bodegacuar")
public final  class bodegacuar extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new bodegacuar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new bodegacuar_impl(context);
   }

   public String getServletInfo( )
   {
      return "Bodega Cuar";
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

