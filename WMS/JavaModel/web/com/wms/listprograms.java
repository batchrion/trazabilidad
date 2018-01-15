/*
               File: ListPrograms
        Description: List Programs
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:41.28
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listprograms extends GXProcedure
{
   public listprograms( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listprograms.class ), "" );
   }

   public listprograms( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.wms.SdtProgramNames_ProgramName> executeUdp( )
   {
      listprograms.this.aP0 = aP0;
      listprograms.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.wms.SdtProgramNames_ProgramName>()};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.wms.SdtProgramNames_ProgramName>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.wms.SdtProgramNames_ProgramName>[] aP0 )
   {
      listprograms.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ProgramNames = new GXBaseCollection<com.wms.SdtProgramNames_ProgramName>(com.wms.SdtProgramNames_ProgramName.class, "ProgramNames.ProgramName", "WMS", remoteHandle) ;
      AV11name = "WWCabEntradaMercancia" ;
      AV12description = "Cab Entrada Mercancias" ;
      AV13link = formatLink("com.wms.wwcabentradamercancia")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11name = "WWDetEntradaMercancia" ;
      AV12description = "Det Entrada Mercancias" ;
      AV13link = formatLink("com.wms.wwdetentradamercancia")  ;
      /* Execute user subroutine: 'ADDPROGRAM' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ADDPROGRAM' Routine */
      AV8IsAuthorized = true ;
      GXt_boolean1 = AV8IsAuthorized ;
      GXv_boolean2[0] = GXt_boolean1 ;
      new com.wms.isauthorized(remoteHandle, context).execute( AV11name, GXv_boolean2) ;
      listprograms.this.GXt_boolean1 = GXv_boolean2[0] ;
      AV8IsAuthorized = GXt_boolean1 ;
      if ( AV8IsAuthorized )
      {
         AV10ProgramName = (com.wms.SdtProgramNames_ProgramName)new com.wms.SdtProgramNames_ProgramName(remoteHandle, context);
         AV10ProgramName.setgxTv_SdtProgramNames_ProgramName_Name( AV11name );
         AV10ProgramName.setgxTv_SdtProgramNames_ProgramName_Description( AV12description );
         AV10ProgramName.setgxTv_SdtProgramNames_ProgramName_Link( AV13link );
         AV9ProgramNames.add(AV10ProgramName, 0);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = listprograms.this.AV9ProgramNames;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9ProgramNames = new GXBaseCollection<com.wms.SdtProgramNames_ProgramName>(com.wms.SdtProgramNames_ProgramName.class, "ProgramNames.ProgramName", "WMS", remoteHandle);
      AV11name = "" ;
      AV12description = "" ;
      AV13link = "" ;
      GXv_boolean2 = new boolean [1] ;
      AV10ProgramName = new com.wms.SdtProgramNames_ProgramName(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private boolean returnInSub ;
   private boolean AV8IsAuthorized ;
   private boolean GXt_boolean1 ;
   private boolean GXv_boolean2[] ;
   private String AV11name ;
   private String AV12description ;
   private String AV13link ;
   private GXBaseCollection<com.wms.SdtProgramNames_ProgramName>[] aP0 ;
   private GXBaseCollection<com.wms.SdtProgramNames_ProgramName> AV9ProgramNames ;
   private com.wms.SdtProgramNames_ProgramName AV10ProgramName ;
}

