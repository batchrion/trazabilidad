/*
               File: WorkflowActionPerformed
        Description: WorkflowActionPerformed
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.26
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;

public final  class gxdomainworkflowactionperformed
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Short((short)1), "NEW");
      domain.put(new Short((short)2), "UPDATE");
      domain.put(new Short((short)3), "DELETE");
      domain.put(new Short((short)4), "READ");
      domain.put(new Short((short)5), "CHECK_IN");
      domain.put(new Short((short)6), "CHECK_OUT");
      domain.put(new Short((short)7), "UNDO_CHECK_OUT");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        short key )
   {
      if (domain.containsKey( key ))
      {
         return (String)domain.get( key );
      }
      else
      {
         return "";
      }
   }

   public static GXSimpleCollection<Short> getValues( )
   {
      GXSimpleCollection<Short> value = new GXSimpleCollection<Short>(Short.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Short) itr.next());
      }
      return value;
   }

}

