/*
               File: WorkflowTimerType
        Description: WorkflowTimerType
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.76
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;

public final  class gxdomainworkflowtimertype
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"D"), "DEADLINE");
      domain.put(new String((String)"W"), "WARNING");
      domain.put(new String((String)""), "NONE");
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

