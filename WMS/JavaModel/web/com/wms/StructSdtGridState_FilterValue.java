/*
               File: StructSdtGridState_FilterValue
        Description: GridState
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:38.6
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.genexus.*;

public final  class StructSdtGridState_FilterValue implements Cloneable, java.io.Serializable
{
   public StructSdtGridState_FilterValue( )
   {
      gxTv_SdtGridState_FilterValue_Value = "" ;
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

   public String getValue( )
   {
      return gxTv_SdtGridState_FilterValue_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtGridState_FilterValue_Value = value ;
   }

   protected String gxTv_SdtGridState_FilterValue_Value ;
}

