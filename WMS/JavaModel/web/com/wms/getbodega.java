/*
               File: GetBodega
        Description: Get Bodega
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 11, 2018 14:12:25.59
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getbodega extends GXProcedure
{
   public getbodega( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getbodega.class ), "" );
   }

   public getbodega( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.wms.SdtBodegaCuar_BodegaCuarItem> executeUdp( String aP0 )
   {
      getbodega.this.AV10Bodega = aP0;
      getbodega.this.aP1 = aP1;
      getbodega.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.wms.SdtBodegaCuar_BodegaCuarItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<com.wms.SdtBodegaCuar_BodegaCuarItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<com.wms.SdtBodegaCuar_BodegaCuarItem>[] aP1 )
   {
      getbodega.this.AV10Bodega = aP0;
      getbodega.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000L2 */
      pr_fusquim_sap.execute(0, new Object[] {AV10Bodega});
      while ( (pr_fusquim_sap.getStatus(0) != 101) )
      {
         A199CodBodega = P000L2_A199CodBodega[0] ;
         A197CodArticulo = P000L2_A197CodArticulo[0] ;
         A198Articulo = P000L2_A198Articulo[0] ;
         A200Stock = P000L2_A200Stock[0] ;
         A201UnidadMedida = P000L2_A201UnidadMedida[0] ;
         A202Precio = P000L2_A202Precio[0] ;
         A194validFor = P000L2_A194validFor[0] ;
         A195InvntItem = P000L2_A195InvntItem[0] ;
         A203Fila = P000L2_A203Fila[0] ;
         AV9BodegaCuarItem.setgxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode( A197CodArticulo );
         AV9BodegaCuarItem.setgxTv_SdtBodegaCuar_BodegaCuarItem_Itemname( A198Articulo );
         AV9BodegaCuarItem.setgxTv_SdtBodegaCuar_BodegaCuarItem_Whscode( A199CodBodega );
         AV9BodegaCuarItem.setgxTv_SdtBodegaCuar_BodegaCuarItem_Onhand( A200Stock );
         AV9BodegaCuarItem.setgxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr( A201UnidadMedida );
         AV9BodegaCuarItem.setgxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice( A202Precio );
         AV9BodegaCuarItem.setgxTv_SdtBodegaCuar_BodegaCuarItem_Validfor( A194validFor );
         AV9BodegaCuarItem.setgxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem( A195InvntItem );
         AV8BodegaCuar.add(AV9BodegaCuarItem.Clone(), 0);
         pr_fusquim_sap.readNext(0);
      }
      pr_fusquim_sap.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = getbodega.this.AV8BodegaCuar;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8BodegaCuar = new GXBaseCollection<com.wms.SdtBodegaCuar_BodegaCuarItem>(com.wms.SdtBodegaCuar_BodegaCuarItem.class, "BodegaCuar.BodegaCuarItem", "WMS", remoteHandle);
      scmdbuf = "" ;
      P000L2_A199CodBodega = new String[] {""} ;
      P000L2_A197CodArticulo = new String[] {""} ;
      P000L2_A198Articulo = new String[] {""} ;
      P000L2_A200Stock = new long[1] ;
      P000L2_A201UnidadMedida = new String[] {""} ;
      P000L2_A202Precio = new long[1] ;
      P000L2_A194validFor = new String[] {""} ;
      P000L2_A195InvntItem = new String[] {""} ;
      P000L2_A203Fila = new long[1] ;
      A199CodBodega = "" ;
      A197CodArticulo = "" ;
      A198Articulo = "" ;
      A201UnidadMedida = "" ;
      A194validFor = "" ;
      A195InvntItem = "" ;
      AV9BodegaCuarItem = new com.wms.SdtBodegaCuar_BodegaCuarItem(remoteHandle, context);
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.getbodega__fusquim_sap(),
         new Object[] {
             new Object[] {
            P000L2_A199CodBodega, P000L2_A197CodArticulo, P000L2_A198Articulo, P000L2_A200Stock, P000L2_A201UnidadMedida, P000L2_A202Precio, P000L2_A194validFor, P000L2_A195InvntItem, P000L2_A203Fila
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A200Stock ;
   private long A202Precio ;
   private long A203Fila ;
   private String scmdbuf ;
   private String A194validFor ;
   private String A195InvntItem ;
   private String AV10Bodega ;
   private String A199CodBodega ;
   private String A197CodArticulo ;
   private String A198Articulo ;
   private String A201UnidadMedida ;
   private com.wms.SdtBodegaCuar_BodegaCuarItem AV9BodegaCuarItem ;
   private GXBaseCollection<com.wms.SdtBodegaCuar_BodegaCuarItem>[] aP1 ;
   private IDataStoreProvider pr_fusquim_sap ;
   private String[] P000L2_A199CodBodega ;
   private String[] P000L2_A197CodArticulo ;
   private String[] P000L2_A198Articulo ;
   private long[] P000L2_A200Stock ;
   private String[] P000L2_A201UnidadMedida ;
   private long[] P000L2_A202Precio ;
   private String[] P000L2_A194validFor ;
   private String[] P000L2_A195InvntItem ;
   private long[] P000L2_A203Fila ;
   private GXBaseCollection<com.wms.SdtBodegaCuar_BodegaCuarItem> AV8BodegaCuar ;
}

final  class getbodega__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000L2", "SELECT [CodBodega], [CodArticulo], [Articulo], [Stock], [UnidadMedida], [Precio], [validFor], [InvntItem], [Fila] FROM dbo.[VStockCuar] WITH (NOLOCK) WHERE [CodBodega] = ? ORDER BY [Fila] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((long[]) buf[8])[0] = rslt.getLong(9) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 10);
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

