/*
               File: GetQAttributes
        Description: Get QAttributes
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:44.86
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getqattributes extends GXProcedure
{
   public getqattributes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getqattributes.class ), "" );
   }

   public getqattributes( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem> executeUdp( String aP0 )
   {
      getqattributes.this.AV11ItemCode = aP0;
      getqattributes.this.aP1 = aP1;
      getqattributes.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem>[] aP1 )
   {
      getqattributes.this.AV11ItemCode = aP0;
      getqattributes.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000I2 */
      pr_fusquim_sap.execute(0, new Object[] {AV11ItemCode});
      while ( (pr_fusquim_sap.getStatus(0) != 101) )
      {
         A182UVID_ATRCONTARTHU_ItemCode = P000I2_A182UVID_ATRCONTARTHU_ItemCode[0] ;
         n182UVID_ATRCONTARTHU_ItemCode = P000I2_n182UVID_ATRCONTARTHU_ItemCode[0] ;
         A162UVID_ATRCONTARTHDocEntry = P000I2_A162UVID_ATRCONTARTHDocEntry[0] ;
         AV12DocEntry = A162UVID_ATRCONTARTHDocEntry ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_fusquim_sap.readNext(0);
      }
      pr_fusquim_sap.close(0);
      /* Using cursor P000I3 */
      pr_fusquim_sap.execute(1, new Object[] {new Integer(AV12DocEntry)});
      while ( (pr_fusquim_sap.getStatus(1) != 101) )
      {
         A128UVID_ATRCONTARTDDocEntry = P000I3_A128UVID_ATRCONTARTDDocEntry[0] ;
         A129LineId2 = P000I3_A129LineId2[0] ;
         A148U_CodAtr2 = P000I3_A148U_CodAtr2[0] ;
         A149UVID_ATRCONTARTDU_NameAtr = P000I3_A149UVID_ATRCONTARTDU_NameAtr[0] ;
         A151U_Critico2 = P000I3_A151U_Critico2[0] ;
         A159U_CodEquip2 = P000I3_A159U_CodEquip2[0] ;
         A150UVID_ATRCONTARTDU_Cualitat = P000I3_A150UVID_ATRCONTARTDU_Cualitat[0] ;
         n150UVID_ATRCONTARTDU_Cualitat = P000I3_n150UVID_ATRCONTARTDU_Cualitat[0] ;
         A155U_StandAtr2 = P000I3_A155U_StandAtr2[0] ;
         n155U_StandAtr2 = P000I3_n155U_StandAtr2[0] ;
         A156U_Minimo2 = P000I3_A156U_Minimo2[0] ;
         n156U_Minimo2 = P000I3_n156U_Minimo2[0] ;
         A157U_Maximo2 = P000I3_A157U_Maximo2[0] ;
         n157U_Maximo2 = P000I3_n157U_Maximo2[0] ;
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2( A129LineId2 );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry( A128UVID_ATRCONTARTDDocEntry );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2( A148U_CodAtr2 );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr( A149UVID_ATRCONTARTDU_NameAtr );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2( A151U_Critico2 );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2( A159U_CodEquip2 );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu( A117U_TiempoDu );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues( A113U_TipoMues );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat( A150UVID_ATRCONTARTDU_Cualitat );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2( A155U_StandAtr2 );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2( A156U_Minimo2 );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2( A157U_Maximo2 );
         AV9QAtrributeDetailItem.setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango( "1-1" );
         AV8QAttributeDetail.add(AV9QAtrributeDetailItem.Clone(), 0);
         pr_fusquim_sap.readNext(1);
      }
      pr_fusquim_sap.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = getqattributes.this.AV8QAttributeDetail;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8QAttributeDetail = new GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem>(com.wms.SdtQAttributeDetail_QAttributeDetailItem.class, "QAttributeDetail.QAttributeDetailItem", "WMS", remoteHandle);
      scmdbuf = "" ;
      P000I2_A182UVID_ATRCONTARTHU_ItemCode = new String[] {""} ;
      P000I2_n182UVID_ATRCONTARTHU_ItemCode = new boolean[] {false} ;
      P000I2_A162UVID_ATRCONTARTHDocEntry = new int[1] ;
      A182UVID_ATRCONTARTHU_ItemCode = "" ;
      P000I3_A128UVID_ATRCONTARTDDocEntry = new int[1] ;
      P000I3_A129LineId2 = new int[1] ;
      P000I3_A148U_CodAtr2 = new String[] {""} ;
      P000I3_A149UVID_ATRCONTARTDU_NameAtr = new String[] {""} ;
      P000I3_A151U_Critico2 = new String[] {""} ;
      P000I3_A159U_CodEquip2 = new String[] {""} ;
      P000I3_A150UVID_ATRCONTARTDU_Cualitat = new String[] {""} ;
      P000I3_n150UVID_ATRCONTARTDU_Cualitat = new boolean[] {false} ;
      P000I3_A155U_StandAtr2 = new long[1] ;
      P000I3_n155U_StandAtr2 = new boolean[] {false} ;
      P000I3_A156U_Minimo2 = new long[1] ;
      P000I3_n156U_Minimo2 = new boolean[] {false} ;
      P000I3_A157U_Maximo2 = new long[1] ;
      P000I3_n157U_Maximo2 = new boolean[] {false} ;
      A148U_CodAtr2 = "" ;
      A149UVID_ATRCONTARTDU_NameAtr = "" ;
      A151U_Critico2 = "" ;
      A159U_CodEquip2 = "" ;
      A150UVID_ATRCONTARTDU_Cualitat = "" ;
      AV9QAtrributeDetailItem = new com.wms.SdtQAttributeDetail_QAttributeDetailItem(remoteHandle, context);
      A113U_TipoMues = "" ;
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.getqattributes__fusquim_sap(),
         new Object[] {
             new Object[] {
            P000I2_A182UVID_ATRCONTARTHU_ItemCode, P000I2_n182UVID_ATRCONTARTHU_ItemCode, P000I2_A162UVID_ATRCONTARTHDocEntry
            }
            , new Object[] {
            P000I3_A128UVID_ATRCONTARTDDocEntry, P000I3_A129LineId2, P000I3_A148U_CodAtr2, P000I3_A149UVID_ATRCONTARTDU_NameAtr, P000I3_A151U_Critico2, P000I3_A159U_CodEquip2, P000I3_A150UVID_ATRCONTARTDU_Cualitat, P000I3_n150UVID_ATRCONTARTDU_Cualitat, P000I3_A155U_StandAtr2, P000I3_n155U_StandAtr2,
            P000I3_A156U_Minimo2, P000I3_n156U_Minimo2, P000I3_A157U_Maximo2, P000I3_n157U_Maximo2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A162UVID_ATRCONTARTHDocEntry ;
   private int AV12DocEntry ;
   private int A128UVID_ATRCONTARTDDocEntry ;
   private int A129LineId2 ;
   private long A155U_StandAtr2 ;
   private long A156U_Minimo2 ;
   private long A157U_Maximo2 ;
   private long A117U_TiempoDu ;
   private String scmdbuf ;
   private String A151U_Critico2 ;
   private String A150UVID_ATRCONTARTDU_Cualitat ;
   private boolean n182UVID_ATRCONTARTHU_ItemCode ;
   private boolean n150UVID_ATRCONTARTDU_Cualitat ;
   private boolean n155U_StandAtr2 ;
   private boolean n156U_Minimo2 ;
   private boolean n157U_Maximo2 ;
   private String AV11ItemCode ;
   private String A182UVID_ATRCONTARTHU_ItemCode ;
   private String A148U_CodAtr2 ;
   private String A149UVID_ATRCONTARTDU_NameAtr ;
   private String A159U_CodEquip2 ;
   private String A113U_TipoMues ;
   private com.wms.SdtQAttributeDetail_QAttributeDetailItem AV9QAtrributeDetailItem ;
   private GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem>[] aP1 ;
   private IDataStoreProvider pr_fusquim_sap ;
   private String[] P000I2_A182UVID_ATRCONTARTHU_ItemCode ;
   private boolean[] P000I2_n182UVID_ATRCONTARTHU_ItemCode ;
   private int[] P000I2_A162UVID_ATRCONTARTHDocEntry ;
   private int[] P000I3_A128UVID_ATRCONTARTDDocEntry ;
   private int[] P000I3_A129LineId2 ;
   private String[] P000I3_A148U_CodAtr2 ;
   private String[] P000I3_A149UVID_ATRCONTARTDU_NameAtr ;
   private String[] P000I3_A151U_Critico2 ;
   private String[] P000I3_A159U_CodEquip2 ;
   private String[] P000I3_A150UVID_ATRCONTARTDU_Cualitat ;
   private boolean[] P000I3_n150UVID_ATRCONTARTDU_Cualitat ;
   private long[] P000I3_A155U_StandAtr2 ;
   private boolean[] P000I3_n155U_StandAtr2 ;
   private long[] P000I3_A156U_Minimo2 ;
   private boolean[] P000I3_n156U_Minimo2 ;
   private long[] P000I3_A157U_Maximo2 ;
   private boolean[] P000I3_n157U_Maximo2 ;
   private GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem> AV8QAttributeDetail ;
}

final  class getqattributes__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000I2", "SELECT TOP 1 [U_ItemCode], [DocEntry] AS UVID_ATRCONTARTHDocEntry FROM dbo.[@VID_ATRCONTARTH] WITH (NOLOCK) WHERE [U_ItemCode] = ? ORDER BY [DocEntry] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P000I3", "SELECT [DocEntry] AS UVID_ATRCONTARTDDocEntry, [LineId], [U_CodAtr], [U_NameAtr], [U_Critico], [U_CodEquip], [U_Cualitat], [U_StandAtr], [U_Minimo], [U_Maximo] FROM dbo.[@VID_ATRCONTARTD] WITH (NOLOCK) WHERE [DocEntry] = ? ORDER BY [DocEntry] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 1) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

