/*
               File: WorkflowEventSource
        Description: WorkflowEventSource
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.58
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;

public final  class gxdomainworkfloweventsource
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"Workflow Document Manager"), "DOCUMENT_MANAGER");
      domain.put(new String((String)"Workflow Data Manager"), "DATA_MANAGER");
      domain.put(new String((String)"Workflow Resource Manager"), "RESOURCE_MANAGER");
      domain.put(new String((String)"Workflow Process Manager"), "PROCESS_MANAGER");
      domain.put(new String((String)"Workflow Deadine Scheduler"), "DEADLINE_SCHEDULER");
      domain.put(new String((String)"Workflow Server"), "SERVER");
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

