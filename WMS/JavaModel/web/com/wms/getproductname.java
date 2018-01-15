/*
               File: GetProductName
        Description: Get Product Name
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:59:26.14
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getproductname extends GXProcedure
{
   public getproductname( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getproductname.class ), "" );
   }

   public getproductname( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      getproductname.this.AV8ItemCode = aP0;
      getproductname.this.aP1 = aP1;
      getproductname.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      getproductname.this.AV8ItemCode = aP0;
      getproductname.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000J2 */
      pr_fusquim_sap.execute(0, new Object[] {AV8ItemCode});
      while ( (pr_fusquim_sap.getStatus(0) != 101) )
      {
         A197CodArticulo = P000J2_A197CodArticulo[0] ;
         A198Articulo = P000J2_A198Articulo[0] ;
         A203Fila = P000J2_A203Fila[0] ;
         AV9ItemName = A198Articulo ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_fusquim_sap.readNext(0);
      }
      pr_fusquim_sap.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = getproductname.this.AV9ItemName;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9ItemName = "" ;
      scmdbuf = "" ;
      P000J2_A197CodArticulo = new String[] {""} ;
      P000J2_A198Articulo = new String[] {""} ;
      P000J2_A203Fila = new long[1] ;
      A197CodArticulo = "" ;
      A198Articulo = "" ;
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.getproductname__fusquim_sap(),
         new Object[] {
             new Object[] {
            P000J2_A197CodArticulo, P000J2_A198Articulo, P000J2_A203Fila
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A203Fila ;
   private String scmdbuf ;
   private String AV8ItemCode ;
   private String AV9ItemName ;
   private String A197CodArticulo ;
   private String A198Articulo ;
   private String[] aP1 ;
   private IDataStoreProvider pr_fusquim_sap ;
   private String[] P000J2_A197CodArticulo ;
   private String[] P000J2_A198Articulo ;
   private long[] P000J2_A203Fila ;
}

final  class getproductname__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000J2", "SELECT TOP 1 [CodArticulo], [Articulo], [Fila] FROM dbo.[VStockCuar] WITH (NOLOCK) WHERE [CodArticulo] = ? ORDER BY [Fila] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
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
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

