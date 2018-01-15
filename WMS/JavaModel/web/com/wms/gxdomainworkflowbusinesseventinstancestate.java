/*
               File: WorkflowBusinessEventInstanceState
        Description: WorkflowBusinessEventInstanceState
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.48
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;

public final  class gxdomainworkflowbusinesseventinstancestate
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"open.active.ready"), "OPEN_ ACTIVE_ READY");
      domain.put(new String((String)"open.active.in_process"), "OPEN_ ACTIVE_ INPROCESS");
      domain.put(new String((String)"closed.completed"), "CLOSED_COMPLETED");
      domain.put(new String((String)"closed"), "CLOSED");
      domain.put(new String((String)"open"), "OPEN");
      domain.put(new String((String)"open.active"), "OPEN_ACTIVE");
      domain.put(new String((String)"open.abnormal"), "OPEN_ ABNORMAL");
      domain.put(new String((String)"open.abnormal.aborted"), "OPEN_ABNORMAL_ABORTED");
      domain.put(new String((String)"open.abnormal.terminated"), "OPEN_ ABNORMAL_ TERMINATED");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        String key )
   {
      if (domain.containsKey( key.trim() ))
      {
         return (String)domain.get( key.trim() );
      }
      else
      {
         return "";
      }
   }

   public static GXSimpleCollection<String> getValues( )
   {
      GXSimpleCollection<String> value = new GXSimpleCollection<String>(String.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((String) itr.next());
      }
      return value;
   }

}

