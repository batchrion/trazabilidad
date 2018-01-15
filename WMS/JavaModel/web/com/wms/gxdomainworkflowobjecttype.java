/*
               File: WorkflowObjectType
        Description: WorkflowObjectType
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.65
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;

public final  class gxdomainworkflowobjecttype
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Byte((byte)1), "WORKITEM");
      domain.put(new Byte((byte)2), "PROCESS_DEFINITION");
      domain.put(new Byte((byte)3), "PROCESS_INSTANCE");
      domain.put(new Byte((byte)4), "APPLICATION_DATA");
      domain.put(new Byte((byte)5), "SERVER");
      domain.put(new Byte((byte)6), "DOCUMENT_INSTANCE");
      domain.put(new Byte((byte)7), "DOCUMENT");
      domain.put(new Byte((byte)8), "EVENT");
      domain.put(new Byte((byte)9), "USER");
      domain.put(new Byte((byte)10), "ACTIVITY");
      domain.put(new Byte((byte)0), "BASE");
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

