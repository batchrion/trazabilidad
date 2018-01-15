/*
               File: WorkflowProcessInstanceState
        Description: WorkflowProcessInstanceState
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.72
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;

public final  class gxdomainworkflowprocessinstancestate
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"open.running"), "OPEN_RUNNING");
      domain.put(new String((String)"open.notRunning"), "OPEN_NOTRUNNING");
      domain.put(new String((String)"open.notRunning.notStarted"), "OPEN_NOTRUNNING_NOTSTARTED");
      domain.put(new String((String)"open.notRunning.suspended"), "OPEN_NOTRUNNING_SUSPENDED");
      domain.put(new String((String)"open"), "OPEN");
      domain.put(new String((String)"closed"), "CLOSED");
      domain.put(new String((String)"closed.completed"), "CLOSED_COMPLETED");
      domain.put(new String((String)"closed.aborted"), "CLOSED_ABORTED");
      domain.put(new String((String)"closed.terminated"), "CLOSED_TERMINATED");
      domain.put(new String((String)"closed.canceled"), "CLOSED_ CANCELED");
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

