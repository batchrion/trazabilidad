/*
               File: StructSdtBodegaCuar_BodegaCuarItem
        Description: BodegaCuar
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 11, 2018 14:12:26.74
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.genexus.*;

public final  class StructSdtBodegaCuar_BodegaCuarItem implements Cloneable, java.io.Serializable
{
   public StructSdtBodegaCuar_BodegaCuarItem( )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode = "" ;
      gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname = "" ;
      gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode = "" ;
      gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr = "" ;
      gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor = "" ;
      gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem = "" ;
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

   public String getItemcode( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode ;
   }

   public void setItemcode( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode = value ;
   }

   public String getItemname( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname ;
   }

   public void setItemname( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname = value ;
   }

   public String getWhscode( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode ;
   }

   public void setWhscode( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode = value ;
   }

   public long getOnhand( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Onhand ;
   }

   public void setOnhand( long value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Onhand = value ;
   }

   public String getCntunitmsr( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr ;
   }

   public void setCntunitmsr( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr = value ;
   }

   public long getAvgprice( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice ;
   }

   public void setAvgprice( long value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice = value ;
   }

   public String getValidfor( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor ;
   }

   public void setValidfor( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor = value ;
   }

   public String getInvntitem( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem ;
   }

   public void setInvntitem( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem = value ;
   }

   protected long gxTv_SdtBodegaCuar_BodegaCuarItem_Onhand ;
   protected long gxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr ;
}

