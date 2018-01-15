/*
               File: RegistroInspeccionHGeneral
        Description: Registro Inspeccion HGeneral
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 5, 2018 15:0:54.19
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.wms.registroinspeccionhgeneral")
public final  class registroinspeccionhgeneral extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new registroinspeccionhgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new registroinspeccionhgeneral_impl(context);
   }

   public String getServletInfo( )
   {
      return "Registro Inspeccion HGeneral";
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

