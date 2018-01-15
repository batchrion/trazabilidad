/*
               File: PReportOne2
        Description: Stub for PReportOne2
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:42.59
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preportone2 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.wms.GXcfg.class);
      preportone2 pgm = new preportone2 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public preportone2( )
   {
      super( -1 , new ModelContext( preportone2.class ), "" );
      Application.init(com.wms.GXcfg.class);
   }

   public preportone2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preportone2.class ), "" );
   }

   public preportone2( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
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
}

