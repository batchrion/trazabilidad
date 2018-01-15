/*
               File: CabEntradaMercancia
        Description: Cab Entrada Mercancia
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:45.18
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.wms.cabentradamercancia")
public final  class cabentradamercancia extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cabentradamercancia_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cabentradamercancia_impl(context);
   }

   public String getServletInfo( )
   {
      return "Cab Entrada Mercancia";
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

