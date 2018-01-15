/*
               File: StructSdtTransactionContext_Attribute
        Description: TransactionContext
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:38.48
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.genexus.*;

public final  class StructSdtTransactionContext_Attribute implements Cloneable, java.io.Serializable
{
   public StructSdtTransactionContext_Attribute( )
   {
      gxTv_SdtTransactionContext_Attribute_Attributename = "" ;
      gxTv_SdtTransactionContext_Attribute_Attributevalue = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getAttributename( )
   {
      return gxTv_SdtTransactionContext_Attribute_Attributename ;
   }

   public void setAttributename( String value )
   {
      gxTv_SdtTransactionContext_Attribute_Attributename = value ;
   }

   public String getAttributevalue( )
   {
      return gxTv_SdtTransactionContext_Attribute_Attributevalue ;
   }

   public void setAttributevalue( String value )
   {
      gxTv_SdtTransactionContext_Attribute_Attributevalue = value ;
   }

   protected String gxTv_SdtTransactionContext_Attribute_Attributename ;
   protected String gxTv_SdtTransactionContext_Attribute_Attributevalue ;
}

