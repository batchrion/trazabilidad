/*
               File: UVID_CONTROLCD
        Description: UVID_CONTROLCD
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:50.46
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.wms.uvid_controlcd")
public final  class uvid_controlcd extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new uvid_controlcd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new uvid_controlcd_impl(context);
   }

   public String getServletInfo( )
   {
      return "UVID_CONTROLCD";
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

