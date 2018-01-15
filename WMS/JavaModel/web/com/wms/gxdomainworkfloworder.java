/*
               File: WorkflowOrder
        Description: WorkflowOrder
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.67
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;

public final  class gxdomainworkfloworder
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new Byte((byte)1), "ID_ASC");
      domain.put(new Byte((byte)2), "ID_DESC");
      domain.put(new Byte((byte)3), "NAME_ASC");
      domain.put(new Byte((byte)4), "NAME_DESC");
      domain.put(new Byte((byte)5), "VERSION_ASC");
      domain.put(new Byte((byte)6), "VERSION_DESC");
      domain.put(new Byte((byte)7), "STATE_ASC");
      domain.put(new Byte((byte)8), "STATE_DESC");
      domain.put(new Byte((byte)9), "CREATED_ASC");
      domain.put(new Byte((byte)10), "CREATED_DESC");
      domain.put(new Byte((byte)11), "UPDATED_ASC");
      domain.put(new Byte((byte)12), "UPDATED_DESC");
      domain.put(new Byte((byte)13), "AUTHOR_ASC");
      domain.put(new Byte((byte)14), "AUTHOR_DESC");
      domain.put(new Byte((byte)15), "TYPE_ASC");
      domain.put(new Byte((byte)16), "TYPE_DESC");
      domain.put(new Byte((byte)17), "USER_ASC");
      domain.put(new Byte((byte)18), "USER_DESC");
      domain.put(new Byte((byte)19), "TIMESTAMP_ASC");
      domain.put(new Byte((byte)20), "TIMESTAMP_DESC");
      domain.put(new Byte((byte)21), "SUBJECT_ASC");
      domain.put(new Byte((byte)22), "SUBJECT_DESC");
      domain.put(new Byte((byte)23), "TARGET_ASC");
      domain.put(new Byte((byte)24), "TARGET_DESC");
      domain.put(new Byte((byte)25), "ACTIVITY_ASC");
      domain.put(new Byte((byte)26), "ACTIVITY_DESC");
      domain.put(new Byte((byte)27), "PROCESS_DEFINITION_ASC");
      domain.put(new Byte((byte)28), "PROCESS_DEFINITION_DESC");
      domain.put(new Byte((byte)29), "DOCUMENT_DEFINITION_ASC");
      domain.put(new Byte((byte)30), "DOCUMENT_DEFINITION_DESC");
      domain.put(new Byte((byte)31), "OBJECT_TYPE_ASC");
      domain.put(new Byte((byte)32), "OBJECT_TYPE_DESC");
      domain.put(new Byte((byte)33), "SOURCE_ASC");
      domain.put(new Byte((byte)34), "SOURCE_DESC");
      domain.put(new Byte((byte)35), "PRIORITY_ASC");
      domain.put(new Byte((byte)36), "PRIORITY_DESC");
      domain.put(new Byte((byte)37), "WITH_WARNING_ASC");
      domain.put(new Byte((byte)38), "WITH_WARNING_DESC");
      domain.put(new Byte((byte)39), "NONE");
      domain.put(new Byte((byte)40), "ENDED_ASC");
      domain.put(new Byte((byte)41), "ENDED_DESC");
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

