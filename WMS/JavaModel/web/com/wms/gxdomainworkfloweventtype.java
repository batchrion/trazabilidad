/*
               File: WorkflowEventType
        Description: WorkflowEventType
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.60
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;

public final  class gxdomainworkfloweventtype
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Byte((byte)1), "NEW_INSTANCE");
      domain.put(new Byte((byte)2), "STATE_CHANGE");
      domain.put(new Byte((byte)3), "PRIORITY_CHANGE");
      domain.put(new Byte((byte)4), "ASSIGNMENT_CHANGE");
      domain.put(new Byte((byte)5), "DATA_CHANGE");
      domain.put(new Byte((byte)6), "WARNING");
      domain.put(new Byte((byte)7), "DEADLINE");
      domain.put(new Byte((byte)10), "ERROR");
      domain.put(new Byte((byte)20), "CONDITION_NOT_SATISFIED");
      domain.put(new Byte((byte)21), "RESOURCE_ NOT_ AVAILABLE");
      domain.put(new Byte((byte)30), "EXTERNAL");
      domain.put(new Byte((byte)40), "ACTION_PERFORMED");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        byte key )
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

   public static GXSimpleCollection<Byte> getValues( )
   {
      GXSimpleCollection<Byte> value = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Byte) itr.next());
      }
      return value;
   }

}

