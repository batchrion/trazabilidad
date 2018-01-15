/*
               File: StructSdtCabEntrada_CabEntradaItem
        Description: CabEntrada
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.95
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.genexus.*;

public final  class StructSdtCabEntrada_CabEntradaItem implements Cloneable, java.io.Serializable
{
   public StructSdtCabEntrada_CabEntradaItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode = "" ;
      gxTv_SdtCabEntrada_CabEntradaItem_Provcardname = "" ;
      gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate = cal.getTime() ;
      gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate = cal.getTime() ;
      gxTv_SdtCabEntrada_CabEntradaItem_Empslpname = "" ;
      gxTv_SdtCabEntrada_CabEntradaItem_Empresa = "" ;
      gxTv_SdtCabEntrada_CabEntradaItem_Username = "" ;
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

   public int getCabentradamercanciaid( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid ;
   }

   public void setCabentradamercanciaid( int value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid = value ;
   }

   public int getOcdocentry( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry ;
   }

   public void setOcdocentry( int value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry = value ;
   }

   public String getProvcarcode( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode ;
   }

   public void setProvcarcode( String value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode = value ;
   }

   public String getProvcardname( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Provcardname ;
   }

   public void setProvcardname( String value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Provcardname = value ;
   }

   public java.util.Date getOcdocdate( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate ;
   }

   public void setOcdocdate( java.util.Date value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate = value ;
   }

   public java.util.Date getOcdocduedate( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate ;
   }

   public void setOcdocduedate( java.util.Date value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate = value ;
   }

   public String getEmpslpname( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Empslpname ;
   }

   public void setEmpslpname( String value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Empslpname = value ;
   }

   public String getEmpresa( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Empresa ;
   }

   public void setEmpresa( String value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Empresa = value ;
   }

   public String getUsername( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Username ;
   }

   public void setUsername( String value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Username = value ;
   }

   protected int gxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid ;
   protected int gxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry ;
   protected String gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode ;
   protected String gxTv_SdtCabEntrada_CabEntradaItem_Provcardname ;
   protected String gxTv_SdtCabEntrada_CabEntradaItem_Empslpname ;
   protected String gxTv_SdtCabEntrada_CabEntradaItem_Empresa ;
   protected String gxTv_SdtCabEntrada_CabEntradaItem_Username ;
   protected java.util.Date gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate ;
   protected java.util.Date gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate ;
}

