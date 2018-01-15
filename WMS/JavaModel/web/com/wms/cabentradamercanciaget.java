/*
               File: CabEntradaMercanciaGet
        Description: Cab Entrada Mercancia Get
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:42.88
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cabentradamercanciaget extends GXProcedure
{
   public cabentradamercanciaget( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cabentradamercanciaget.class ), "" );
   }

   public cabentradamercanciaget( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem> executeUdp( int aP0 )
   {
      cabentradamercanciaget.this.AV9NumeroOC = aP0;
      cabentradamercanciaget.this.aP1 = aP1;
      cabentradamercanciaget.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( int aP0 ,
                        GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int aP0 ,
                             GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem>[] aP1 )
   {
      cabentradamercanciaget.this.AV9NumeroOC = aP0;
      cabentradamercanciaget.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000E2 */
      pr_default.execute(0, new Object[] {new Integer(AV9NumeroOC)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1OcDocEntry = P000E2_A1OcDocEntry[0] ;
         A24CabEntradaMercanciaId = P000E2_A24CabEntradaMercanciaId[0] ;
         A3ProvCarCode = P000E2_A3ProvCarCode[0] ;
         A4ProvCardName = P000E2_A4ProvCardName[0] ;
         A5OcDocDate = P000E2_A5OcDocDate[0] ;
         A6OcDocDueDate = P000E2_A6OcDocDueDate[0] ;
         A8EmpSlpName = P000E2_A8EmpSlpName[0] ;
         A10Empresa = P000E2_A10Empresa[0] ;
         A25UserName = P000E2_A25UserName[0] ;
         AV11CabEntradaItem.setgxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid( A24CabEntradaMercanciaId );
         AV11CabEntradaItem.setgxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry( A1OcDocEntry );
         AV11CabEntradaItem.setgxTv_SdtCabEntrada_CabEntradaItem_Provcarcode( A3ProvCarCode );
         AV11CabEntradaItem.setgxTv_SdtCabEntrada_CabEntradaItem_Provcardname( A4ProvCardName );
         AV11CabEntradaItem.setgxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate( A5OcDocDate );
         AV11CabEntradaItem.setgxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate( A6OcDocDueDate );
         AV11CabEntradaItem.setgxTv_SdtCabEntrada_CabEntradaItem_Empslpname( A8EmpSlpName );
         AV11CabEntradaItem.setgxTv_SdtCabEntrada_CabEntradaItem_Empresa( A10Empresa );
         AV11CabEntradaItem.setgxTv_SdtCabEntrada_CabEntradaItem_Username( A25UserName );
         AV10CabEntrada.add(AV11CabEntradaItem.Clone(), 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = cabentradamercanciaget.this.AV10CabEntrada;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10CabEntrada = new GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem>(com.wms.SdtCabEntrada_CabEntradaItem.class, "CabEntrada.CabEntradaItem", "WMS", remoteHandle);
      scmdbuf = "" ;
      P000E2_A1OcDocEntry = new int[1] ;
      P000E2_A24CabEntradaMercanciaId = new int[1] ;
      P000E2_A3ProvCarCode = new String[] {""} ;
      P000E2_A4ProvCardName = new String[] {""} ;
      P000E2_A5OcDocDate = new java.util.Date[] {GXutil.nullDate()} ;
      P000E2_A6OcDocDueDate = new java.util.Date[] {GXutil.nullDate()} ;
      P000E2_A8EmpSlpName = new String[] {""} ;
      P000E2_A10Empresa = new String[] {""} ;
      P000E2_A25UserName = new String[] {""} ;
      A3ProvCarCode = "" ;
      A4ProvCardName = "" ;
      A5OcDocDate = GXutil.resetTime( GXutil.nullDate() );
      A6OcDocDueDate = GXutil.resetTime( GXutil.nullDate() );
      A8EmpSlpName = "" ;
      A10Empresa = "" ;
      A25UserName = "" ;
      AV11CabEntradaItem = new com.wms.SdtCabEntrada_CabEntradaItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.cabentradamercanciaget__default(),
         new Object[] {
             new Object[] {
            P000E2_A1OcDocEntry, P000E2_A24CabEntradaMercanciaId, P000E2_A3ProvCarCode, P000E2_A4ProvCardName, P000E2_A5OcDocDate, P000E2_A6OcDocDueDate, P000E2_A8EmpSlpName, P000E2_A10Empresa, P000E2_A25UserName
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9NumeroOC ;
   private int A1OcDocEntry ;
   private int A24CabEntradaMercanciaId ;
   private String scmdbuf ;
   private java.util.Date A5OcDocDate ;
   private java.util.Date A6OcDocDueDate ;
   private String A3ProvCarCode ;
   private String A4ProvCardName ;
   private String A8EmpSlpName ;
   private String A10Empresa ;
   private String A25UserName ;
   private com.wms.SdtCabEntrada_CabEntradaItem AV11CabEntradaItem ;
   private GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P000E2_A1OcDocEntry ;
   private int[] P000E2_A24CabEntradaMercanciaId ;
   private String[] P000E2_A3ProvCarCode ;
   private String[] P000E2_A4ProvCardName ;
   private java.util.Date[] P000E2_A5OcDocDate ;
   private java.util.Date[] P000E2_A6OcDocDueDate ;
   private String[] P000E2_A8EmpSlpName ;
   private String[] P000E2_A10Empresa ;
   private String[] P000E2_A25UserName ;
   private GXBaseCollection<com.wms.SdtCabEntrada_CabEntradaItem> AV10CabEntrada ;
}

final  class cabentradamercanciaget__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000E2", "SELECT [OcDocEntry], [CabEntradaMercanciaId], [ProvCarCode], [ProvCardName], [OcDocDate], [OcDocDueDate], [EmpSlpName], [Empresa], [UserName] FROM [CabEntradaMercancia] WITH (NOLOCK) WHERE [OcDocEntry] = ? ORDER BY [CabEntradaMercanciaId] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

