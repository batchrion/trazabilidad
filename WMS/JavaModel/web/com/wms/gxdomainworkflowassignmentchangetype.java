/*
               File: WorkflowAssignmentChangeType
        Description: WorkflowAssignmentChangeType
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.46
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;

public final  class gxdomainworkflowassignmentchangetype
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Byte((byte)1), "FROM_USER_TO_USER");
      domain.put(new Byte((byte)2), "FROM_USER_TO_ROLE");
      domain.put(new Byte((byte)3), "FROM_USER_TO_NA");
      domain.put(new Byte((byte)4), "FROM_ROLE_TO_USER");
      domain.put(new Byte((byte)5), "FROM_ROLE_TO_ROLE");
      domain.put(new Byte((byte)6), "FROM_ROLE_TO_NA");
      domain.put(new Byte((byte)7), "FROM_NA_TO_USER");
      domain.put(new Byte((byte)8), "FROM_NA_TO_ROLE");
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

