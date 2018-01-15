/*
               File: StructSdtProgramNames_ProgramName
        Description: ProgramNames
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:38.17
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.genexus.*;

public final  class StructSdtProgramNames_ProgramName implements Cloneable, java.io.Serializable
{
   public StructSdtProgramNames_ProgramName( )
   {
      gxTv_SdtProgramNames_ProgramName_Name = "" ;
      gxTv_SdtProgramNames_ProgramName_Description = "" ;
      gxTv_SdtProgramNames_ProgramName_Link = "" ;
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

   public String getName( )
   {
      return gxTv_SdtProgramNames_ProgramName_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtProgramNames_ProgramName_Name = value ;
   }

   public String getDescription( )
   {
      return gxTv_SdtProgramNames_ProgramName_Description ;
   }

   public void setDescription( String value )
   {
      gxTv_SdtProgramNames_ProgramName_Description = value ;
   }

   public String getLink( )
   {
      return gxTv_SdtProgramNames_ProgramName_Link ;
   }

   public void setLink( String value )
   {
      gxTv_SdtProgramNames_ProgramName_Link = value ;
   }

   protected String gxTv_SdtProgramNames_ProgramName_Name ;
   protected String gxTv_SdtProgramNames_ProgramName_Description ;
   protected String gxTv_SdtProgramNames_ProgramName_Link ;
}

