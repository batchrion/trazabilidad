/*
               File: WorkflowWorkitemState
        Description: WorkflowWorkitemState
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.77
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;

public final  class gxdomainworkflowworkitemstate
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"open.active.ready"), "OPEN_ACTIVE_READY");
      domain.put(new String((String)"open.active.assigned"), "OPEN_ACTIVE_ASSIGNED");
      domain.put(new String((String)"open.active.in_process"), "OPEN_ACTIVE_INPROCESS");
      domain.put(new String((String)"closed.completed"), "CLOSED_COMPLETED");
      domain.put(new String((String)"open.suspended"), "OPEN_SUSPENDED");
      domain.put(new String((String)"closed"), "CLOSED");
      domain.put(new String((String)"open"), "OPEN");
      domain.put(new String((String)"open.active"), "OPEN_ACTIVE");
      domain.put(new String((String)"closed.abnormal"), "CLOSED_ABNORMAL");
      domain.put(new String((String)"closed.abnormal.aborted"), "CLOSED_ABNORMAL_ABORTED");
      domain.put(new String((String)"closed.abnormal.terminated"), "CLOSED_ABNORMAL_TERMINATED");
      domain.put(new String((String)"closed.abnormal.expired"), "CLOSED_ABNORMAL_EXPIRED");
      domain.put(new String((String)"closed.abnormal.delegated"), "CLOSED_ABNORMAL_DELEGATED");
      domain.put(new String((String)"closed.abnormal.skipped"), "CLOSED_ABNORMAL_SKIPPED");
      domain.put(new String((String)"closed.abnormal.undone"), "CLOSED_ABNORMAL_UNDONE");
      domain.put(new String((String)"closed.abnormal.canceled"), "CLOSED_ ABNORMAL_ CANCELED");
      domain.put(new String((String)"closed.abnormal.interrupted"), "CLOSED_ ABNORMAL_ INTERRUPTED");
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

