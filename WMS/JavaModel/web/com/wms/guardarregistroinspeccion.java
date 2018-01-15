/*
               File: GuardarRegistroInspeccion
        Description: Guardar Registro Inspeccion
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:49.4
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class guardarregistroinspeccion extends GXProcedure
{
   public guardarregistroinspeccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( guardarregistroinspeccion.class ), "" );
   }

   public guardarregistroinspeccion( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem> aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem> aP0 )
   {
      guardarregistroinspeccion.this.AV8QAttributeDetail = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<com.wms.SdtQAttributeDetail_QAttributeDetailItem> AV8QAttributeDetail ;
}

