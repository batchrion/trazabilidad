/*
               File: UVID_CONTROLCD1Conversion
        Description: Conversion for table UVID_CONTROLCD1
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 8, 2018 11:53:45.1
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class uvid_controlcd1conversion extends GXProcedure
{
   public uvid_controlcd1conversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( uvid_controlcd1conversion.class ), "" );
   }

   public uvid_controlcd1conversion( int remoteHandle ,
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
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor UVID_CONTR2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A125UVID_CONTROLCDU_Estado = UVID_CONTR2_A125UVID_CONTROLCDU_Estado[0] ;
         n125UVID_CONTROLCDU_Estado = UVID_CONTR2_n125UVID_CONTROLCDU_Estado[0] ;
         A124U_Comment2 = UVID_CONTR2_A124U_Comment2[0] ;
         n124U_Comment2 = UVID_CONTR2_n124U_Comment2[0] ;
         A123UVID_CONTROLCDU_Comment = UVID_CONTR2_A123UVID_CONTROLCDU_Comment[0] ;
         n123UVID_CONTROLCDU_Comment = UVID_CONTR2_n123UVID_CONTROLCDU_Comment[0] ;
         A122U_CodEquip = UVID_CONTR2_A122U_CodEquip[0] ;
         n122U_CodEquip = UVID_CONTR2_n122U_CodEquip[0] ;
         A121U_Medicion = UVID_CONTR2_A121U_Medicion[0] ;
         n121U_Medicion = UVID_CONTR2_n121U_Medicion[0] ;
         A120U_Maximo = UVID_CONTR2_A120U_Maximo[0] ;
         n120U_Maximo = UVID_CONTR2_n120U_Maximo[0] ;
         A119U_Minimo = UVID_CONTR2_A119U_Minimo[0] ;
         n119U_Minimo = UVID_CONTR2_n119U_Minimo[0] ;
         A118U_StandAtr = UVID_CONTR2_A118U_StandAtr[0] ;
         n118U_StandAtr = UVID_CONTR2_n118U_StandAtr[0] ;
         A117U_TiempoDu = UVID_CONTR2_A117U_TiempoDu[0] ;
         n117U_TiempoDu = UVID_CONTR2_n117U_TiempoDu[0] ;
         A116U_AQL = UVID_CONTR2_A116U_AQL[0] ;
         n116U_AQL = UVID_CONTR2_n116U_AQL[0] ;
         A115U_TipoDef = UVID_CONTR2_A115U_TipoDef[0] ;
         n115U_TipoDef = UVID_CONTR2_n115U_TipoDef[0] ;
         A114U_Rango = UVID_CONTR2_A114U_Rango[0] ;
         n114U_Rango = UVID_CONTR2_n114U_Rango[0] ;
         A113U_TipoMues = UVID_CONTR2_A113U_TipoMues[0] ;
         n113U_TipoMues = UVID_CONTR2_n113U_TipoMues[0] ;
         A112U_Critico = UVID_CONTR2_A112U_Critico[0] ;
         n112U_Critico = UVID_CONTR2_n112U_Critico[0] ;
         A111U_Cualitat = UVID_CONTR2_A111U_Cualitat[0] ;
         n111U_Cualitat = UVID_CONTR2_n111U_Cualitat[0] ;
         A110U_NameAtr = UVID_CONTR2_A110U_NameAtr[0] ;
         n110U_NameAtr = UVID_CONTR2_n110U_NameAtr[0] ;
         A109U_CodAtr = UVID_CONTR2_A109U_CodAtr[0] ;
         n109U_CodAtr = UVID_CONTR2_n109U_CodAtr[0] ;
         A108UVID_CONTROLCDLogInst = UVID_CONTR2_A108UVID_CONTROLCDLogInst[0] ;
         n108UVID_CONTROLCDLogInst = UVID_CONTR2_n108UVID_CONTROLCDLogInst[0] ;
         A107UVID_CONTROLCDObject = UVID_CONTR2_A107UVID_CONTROLCDObject[0] ;
         n107UVID_CONTROLCDObject = UVID_CONTR2_n107UVID_CONTROLCDObject[0] ;
         A106VisOrder = UVID_CONTR2_A106VisOrder[0] ;
         n106VisOrder = UVID_CONTR2_n106VisOrder[0] ;
         A42LineId = UVID_CONTR2_A42LineId[0] ;
         A41UVID_CONTROLCDDocEntry = UVID_CONTR2_A41UVID_CONTROLCDDocEntry[0] ;
         /*
            INSERT RECORD ON TABLE GXA0008

         */
         AV2UVID_CONTROLCDDocEntry = A41UVID_CONTROLCDDocEntry ;
         AV3LineId = A42LineId ;
         if ( UVID_CONTR2_n106VisOrder[0] )
         {
            AV4VisOrder = 0 ;
         }
         else
         {
            AV4VisOrder = A106VisOrder ;
         }
         if ( UVID_CONTR2_n107UVID_CONTROLCDObject[0] )
         {
            AV5UVID_CONTROLCDObject = " " ;
         }
         else
         {
            AV5UVID_CONTROLCDObject = A107UVID_CONTROLCDObject ;
         }
         if ( UVID_CONTR2_n108UVID_CONTROLCDLogInst[0] )
         {
            AV6UVID_CONTROLCDLogInst = 0 ;
         }
         else
         {
            AV6UVID_CONTROLCDLogInst = A108UVID_CONTROLCDLogInst ;
         }
         if ( UVID_CONTR2_n109U_CodAtr[0] )
         {
            AV7U_CodAtr = " " ;
         }
         else
         {
            AV7U_CodAtr = A109U_CodAtr ;
         }
         if ( UVID_CONTR2_n110U_NameAtr[0] )
         {
            AV8U_NameAtr = " " ;
         }
         else
         {
            AV8U_NameAtr = A110U_NameAtr ;
         }
         if ( UVID_CONTR2_n111U_Cualitat[0] )
         {
            AV9U_Cualitat = " " ;
         }
         else
         {
            AV9U_Cualitat = A111U_Cualitat ;
         }
         if ( UVID_CONTR2_n112U_Critico[0] )
         {
            AV10U_Critico = " " ;
         }
         else
         {
            AV10U_Critico = A112U_Critico ;
         }
         if ( UVID_CONTR2_n113U_TipoMues[0] )
         {
            AV11U_TipoMues = " " ;
         }
         else
         {
            AV11U_TipoMues = A113U_TipoMues ;
         }
         if ( UVID_CONTR2_n114U_Rango[0] )
         {
            AV12U_Rango = " " ;
         }
         else
         {
            AV12U_Rango = A114U_Rango ;
         }
         if ( UVID_CONTR2_n115U_TipoDef[0] )
         {
            AV13U_TipoDef = " " ;
         }
         else
         {
            AV13U_TipoDef = A115U_TipoDef ;
         }
         if ( UVID_CONTR2_n116U_AQL[0] )
         {
            AV14U_AQL = " " ;
         }
         else
         {
            AV14U_AQL = A116U_AQL ;
         }
         if ( UVID_CONTR2_n117U_TiempoDu[0] )
         {
            AV15U_TiempoDu = 0 ;
         }
         else
         {
            AV15U_TiempoDu = A117U_TiempoDu ;
         }
         if ( UVID_CONTR2_n118U_StandAtr[0] )
         {
            AV16U_StandAtr = 0 ;
         }
         else
         {
            AV16U_StandAtr = A118U_StandAtr ;
         }
         if ( UVID_CONTR2_n119U_Minimo[0] )
         {
            AV17U_Minimo = 0 ;
         }
         else
         {
            AV17U_Minimo = A119U_Minimo ;
         }
         if ( UVID_CONTR2_n120U_Maximo[0] )
         {
            AV18U_Maximo = 0 ;
         }
         else
         {
            AV18U_Maximo = A120U_Maximo ;
         }
         if ( UVID_CONTR2_n121U_Medicion[0] )
         {
            AV19U_Medicion = 0 ;
         }
         else
         {
            AV19U_Medicion = A121U_Medicion ;
         }
         if ( UVID_CONTR2_n122U_CodEquip[0] )
         {
            AV20U_CodEquip = " " ;
         }
         else
         {
            AV20U_CodEquip = A122U_CodEquip ;
         }
         if ( UVID_CONTR2_n123UVID_CONTROLCDU_Comment[0] )
         {
            AV21UVID_CONTROLCDU_Comment = " " ;
         }
         else
         {
            AV21UVID_CONTROLCDU_Comment = A123UVID_CONTROLCDU_Comment ;
         }
         if ( UVID_CONTR2_n124U_Comment2[0] )
         {
            AV22U_Comment2 = " " ;
         }
         else
         {
            AV22U_Comment2 = A124U_Comment2 ;
         }
         if ( UVID_CONTR2_n125UVID_CONTROLCDU_Estado[0] )
         {
            AV23UVID_CONTROLCDU_Estado = " " ;
         }
         else
         {
            AV23UVID_CONTROLCDU_Estado = A125UVID_CONTROLCDU_Estado ;
         }
         /* Using cursor UVID_CONTR3 */
         pr_default.execute(1, new Object[] {new Integer(AV2UVID_CONTROLCDDocEntry), new Integer(AV3LineId), new Integer(AV4VisOrder), AV5UVID_CONTROLCDObject, new Integer(AV6UVID_CONTROLCDLogInst), AV7U_CodAtr, AV8U_NameAtr, AV9U_Cualitat, AV10U_Critico, AV11U_TipoMues, AV12U_Rango, AV13U_TipoDef, AV14U_AQL, new Long(AV15U_TiempoDu), new Long(AV16U_StandAtr), new Long(AV17U_Minimo), new Long(AV18U_Maximo), new Long(AV19U_Medicion), AV20U_CodEquip, AV21UVID_CONTROLCDU_Comment, AV22U_Comment2, AV23UVID_CONTROLCDU_Estado});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0008") ;
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         pr_default.readNext(0);
      }
      pr_default.close(0);
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
      scmdbuf = "" ;
      UVID_CONTR2_A125UVID_CONTROLCDU_Estado = new String[] {""} ;
      UVID_CONTR2_n125UVID_CONTROLCDU_Estado = new boolean[] {false} ;
      UVID_CONTR2_A124U_Comment2 = new String[] {""} ;
      UVID_CONTR2_n124U_Comment2 = new boolean[] {false} ;
      UVID_CONTR2_A123UVID_CONTROLCDU_Comment = new String[] {""} ;
      UVID_CONTR2_n123UVID_CONTROLCDU_Comment = new boolean[] {false} ;
      UVID_CONTR2_A122U_CodEquip = new String[] {""} ;
      UVID_CONTR2_n122U_CodEquip = new boolean[] {false} ;
      UVID_CONTR2_A121U_Medicion = new long[1] ;
      UVID_CONTR2_n121U_Medicion = new boolean[] {false} ;
      UVID_CONTR2_A120U_Maximo = new long[1] ;
      UVID_CONTR2_n120U_Maximo = new boolean[] {false} ;
      UVID_CONTR2_A119U_Minimo = new long[1] ;
      UVID_CONTR2_n119U_Minimo = new boolean[] {false} ;
      UVID_CONTR2_A118U_StandAtr = new long[1] ;
      UVID_CONTR2_n118U_StandAtr = new boolean[] {false} ;
      UVID_CONTR2_A117U_TiempoDu = new long[1] ;
      UVID_CONTR2_n117U_TiempoDu = new boolean[] {false} ;
      UVID_CONTR2_A116U_AQL = new String[] {""} ;
      UVID_CONTR2_n116U_AQL = new boolean[] {false} ;
      UVID_CONTR2_A115U_TipoDef = new String[] {""} ;
      UVID_CONTR2_n115U_TipoDef = new boolean[] {false} ;
      UVID_CONTR2_A114U_Rango = new String[] {""} ;
      UVID_CONTR2_n114U_Rango = new boolean[] {false} ;
      UVID_CONTR2_A113U_TipoMues = new String[] {""} ;
      UVID_CONTR2_n113U_TipoMues = new boolean[] {false} ;
      UVID_CONTR2_A112U_Critico = new String[] {""} ;
      UVID_CONTR2_n112U_Critico = new boolean[] {false} ;
      UVID_CONTR2_A111U_Cualitat = new String[] {""} ;
      UVID_CONTR2_n111U_Cualitat = new boolean[] {false} ;
      UVID_CONTR2_A110U_NameAtr = new String[] {""} ;
      UVID_CONTR2_n110U_NameAtr = new boolean[] {false} ;
      UVID_CONTR2_A109U_CodAtr = new String[] {""} ;
      UVID_CONTR2_n109U_CodAtr = new boolean[] {false} ;
      UVID_CONTR2_A108UVID_CONTROLCDLogInst = new int[1] ;
      UVID_CONTR2_n108UVID_CONTROLCDLogInst = new boolean[] {false} ;
      UVID_CONTR2_A107UVID_CONTROLCDObject = new String[] {""} ;
      UVID_CONTR2_n107UVID_CONTROLCDObject = new boolean[] {false} ;
      UVID_CONTR2_A106VisOrder = new int[1] ;
      UVID_CONTR2_n106VisOrder = new boolean[] {false} ;
      UVID_CONTR2_A42LineId = new int[1] ;
      UVID_CONTR2_A41UVID_CONTROLCDDocEntry = new int[1] ;
      A125UVID_CONTROLCDU_Estado = "" ;
      A124U_Comment2 = "" ;
      A123UVID_CONTROLCDU_Comment = "" ;
      A122U_CodEquip = "" ;
      A116U_AQL = "" ;
      A115U_TipoDef = "" ;
      A114U_Rango = "" ;
      A113U_TipoMues = "" ;
      A112U_Critico = "" ;
      A111U_Cualitat = "" ;
      A110U_NameAtr = "" ;
      A109U_CodAtr = "" ;
      A107UVID_CONTROLCDObject = "" ;
      AV5UVID_CONTROLCDObject = "" ;
      AV7U_CodAtr = "" ;
      AV8U_NameAtr = "" ;
      AV9U_Cualitat = "" ;
      AV10U_Critico = "" ;
      AV11U_TipoMues = "" ;
      AV12U_Rango = "" ;
      AV13U_TipoDef = "" ;
      AV14U_AQL = "" ;
      AV20U_CodEquip = "" ;
      AV21UVID_CONTROLCDU_Comment = "" ;
      AV22U_Comment2 = "" ;
      AV23UVID_CONTROLCDU_Estado = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.uvid_controlcd1conversion__default(),
         new Object[] {
             new Object[] {
            UVID_CONTR2_A125UVID_CONTROLCDU_Estado, UVID_CONTR2_n125UVID_CONTROLCDU_Estado, UVID_CONTR2_A124U_Comment2, UVID_CONTR2_n124U_Comment2, UVID_CONTR2_A123UVID_CONTROLCDU_Comment, UVID_CONTR2_n123UVID_CONTROLCDU_Comment, UVID_CONTR2_A122U_CodEquip, UVID_CONTR2_n122U_CodEquip, UVID_CONTR2_A121U_Medicion, UVID_CONTR2_n121U_Medicion,
            UVID_CONTR2_A120U_Maximo, UVID_CONTR2_n120U_Maximo, UVID_CONTR2_A119U_Minimo, UVID_CONTR2_n119U_Minimo, UVID_CONTR2_A118U_StandAtr, UVID_CONTR2_n118U_StandAtr, UVID_CONTR2_A117U_TiempoDu, UVID_CONTR2_n117U_TiempoDu, UVID_CONTR2_A116U_AQL, UVID_CONTR2_n116U_AQL,
            UVID_CONTR2_A115U_TipoDef, UVID_CONTR2_n115U_TipoDef, UVID_CONTR2_A114U_Rango, UVID_CONTR2_n114U_Rango, UVID_CONTR2_A113U_TipoMues, UVID_CONTR2_n113U_TipoMues, UVID_CONTR2_A112U_Critico, UVID_CONTR2_n112U_Critico, UVID_CONTR2_A111U_Cualitat, UVID_CONTR2_n111U_Cualitat,
            UVID_CONTR2_A110U_NameAtr, UVID_CONTR2_n110U_NameAtr, UVID_CONTR2_A109U_CodAtr, UVID_CONTR2_n109U_CodAtr, UVID_CONTR2_A108UVID_CONTROLCDLogInst, UVID_CONTR2_n108UVID_CONTROLCDLogInst, UVID_CONTR2_A107UVID_CONTROLCDObject, UVID_CONTR2_n107UVID_CONTROLCDObject, UVID_CONTR2_A106VisOrder, UVID_CONTR2_n106VisOrder,
            UVID_CONTR2_A42LineId, UVID_CONTR2_A41UVID_CONTROLCDDocEntry
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A108UVID_CONTROLCDLogInst ;
   private int A106VisOrder ;
   private int A42LineId ;
   private int A41UVID_CONTROLCDDocEntry ;
   private int GIGXA0008 ;
   private int AV2UVID_CONTROLCDDocEntry ;
   private int AV3LineId ;
   private int AV4VisOrder ;
   private int AV6UVID_CONTROLCDLogInst ;
   private long A121U_Medicion ;
   private long A120U_Maximo ;
   private long A119U_Minimo ;
   private long A118U_StandAtr ;
   private long A117U_TiempoDu ;
   private long AV15U_TiempoDu ;
   private long AV16U_StandAtr ;
   private long AV17U_Minimo ;
   private long AV18U_Maximo ;
   private long AV19U_Medicion ;
   private String scmdbuf ;
   private String A125UVID_CONTROLCDU_Estado ;
   private String A115U_TipoDef ;
   private String A112U_Critico ;
   private String A111U_Cualitat ;
   private String AV9U_Cualitat ;
   private String AV10U_Critico ;
   private String AV13U_TipoDef ;
   private String AV23UVID_CONTROLCDU_Estado ;
   private String Gx_emsg ;
   private boolean n125UVID_CONTROLCDU_Estado ;
   private boolean n124U_Comment2 ;
   private boolean n123UVID_CONTROLCDU_Comment ;
   private boolean n122U_CodEquip ;
   private boolean n121U_Medicion ;
   private boolean n120U_Maximo ;
   private boolean n119U_Minimo ;
   private boolean n118U_StandAtr ;
   private boolean n117U_TiempoDu ;
   private boolean n116U_AQL ;
   private boolean n115U_TipoDef ;
   private boolean n114U_Rango ;
   private boolean n113U_TipoMues ;
   private boolean n112U_Critico ;
   private boolean n111U_Cualitat ;
   private boolean n110U_NameAtr ;
   private boolean n109U_CodAtr ;
   private boolean n108UVID_CONTROLCDLogInst ;
   private boolean n107UVID_CONTROLCDObject ;
   private boolean n106VisOrder ;
   private String A124U_Comment2 ;
   private String A123UVID_CONTROLCDU_Comment ;
   private String A122U_CodEquip ;
   private String A116U_AQL ;
   private String A114U_Rango ;
   private String A113U_TipoMues ;
   private String A110U_NameAtr ;
   private String A109U_CodAtr ;
   private String A107UVID_CONTROLCDObject ;
   private String AV5UVID_CONTROLCDObject ;
   private String AV7U_CodAtr ;
   private String AV8U_NameAtr ;
   private String AV11U_TipoMues ;
   private String AV12U_Rango ;
   private String AV14U_AQL ;
   private String AV20U_CodEquip ;
   private String AV21UVID_CONTROLCDU_Comment ;
   private String AV22U_Comment2 ;
   private IDataStoreProvider pr_default ;
   private String[] UVID_CONTR2_A125UVID_CONTROLCDU_Estado ;
   private boolean[] UVID_CONTR2_n125UVID_CONTROLCDU_Estado ;
   private String[] UVID_CONTR2_A124U_Comment2 ;
   private boolean[] UVID_CONTR2_n124U_Comment2 ;
   private String[] UVID_CONTR2_A123UVID_CONTROLCDU_Comment ;
   private boolean[] UVID_CONTR2_n123UVID_CONTROLCDU_Comment ;
   private String[] UVID_CONTR2_A122U_CodEquip ;
   private boolean[] UVID_CONTR2_n122U_CodEquip ;
   private long[] UVID_CONTR2_A121U_Medicion ;
   private boolean[] UVID_CONTR2_n121U_Medicion ;
   private long[] UVID_CONTR2_A120U_Maximo ;
   private boolean[] UVID_CONTR2_n120U_Maximo ;
   private long[] UVID_CONTR2_A119U_Minimo ;
   private boolean[] UVID_CONTR2_n119U_Minimo ;
   private long[] UVID_CONTR2_A118U_StandAtr ;
   private boolean[] UVID_CONTR2_n118U_StandAtr ;
   private long[] UVID_CONTR2_A117U_TiempoDu ;
   private boolean[] UVID_CONTR2_n117U_TiempoDu ;
   private String[] UVID_CONTR2_A116U_AQL ;
   private boolean[] UVID_CONTR2_n116U_AQL ;
   private String[] UVID_CONTR2_A115U_TipoDef ;
   private boolean[] UVID_CONTR2_n115U_TipoDef ;
   private String[] UVID_CONTR2_A114U_Rango ;
   private boolean[] UVID_CONTR2_n114U_Rango ;
   private String[] UVID_CONTR2_A113U_TipoMues ;
   private boolean[] UVID_CONTR2_n113U_TipoMues ;
   private String[] UVID_CONTR2_A112U_Critico ;
   private boolean[] UVID_CONTR2_n112U_Critico ;
   private String[] UVID_CONTR2_A111U_Cualitat ;
   private boolean[] UVID_CONTR2_n111U_Cualitat ;
   private String[] UVID_CONTR2_A110U_NameAtr ;
   private boolean[] UVID_CONTR2_n110U_NameAtr ;
   private String[] UVID_CONTR2_A109U_CodAtr ;
   private boolean[] UVID_CONTR2_n109U_CodAtr ;
   private int[] UVID_CONTR2_A108UVID_CONTROLCDLogInst ;
   private boolean[] UVID_CONTR2_n108UVID_CONTROLCDLogInst ;
   private String[] UVID_CONTR2_A107UVID_CONTROLCDObject ;
   private boolean[] UVID_CONTR2_n107UVID_CONTROLCDObject ;
   private int[] UVID_CONTR2_A106VisOrder ;
   private boolean[] UVID_CONTR2_n106VisOrder ;
   private int[] UVID_CONTR2_A42LineId ;
   private int[] UVID_CONTR2_A41UVID_CONTROLCDDocEntry ;
}

final  class uvid_controlcd1conversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("UVID_CONTR2", "SELECT [U_Estado], [U_Comment2], [U_Comment], [U_CodEquip], [U_Medicion], [U_Maximo], [U_Minimo], [U_StandAtr], [U_TiempoDu], [U_AQL], [U_TipoDef], [U_Rango], [U_TipoMues], [U_Critico], [U_Cualitat], [U_NameAtr], [U_CodAtr], [LogInst], [Object], [VisOrder], [LineId], [DocEntry] FROM dbo.[@VID_CONTROLCD] ORDER BY [DocEntry], [LineId] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("UVID_CONTR3", "INSERT INTO [GXA0008]([UVID_CONTROLCDDocEntry], [LineId], [VisOrder], [UVID_CONTROLCDObject], [UVID_CONTROLCDLogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_Rango], [U_TipoDef], [U_AQL], [U_TiempoDu], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Medicion], [U_CodEquip], [UVID_CONTROLCDU_Comment], [U_Comment2], [UVID_CONTROLCDU_Estado]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 1) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 1) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(18) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21) ;
               ((int[]) buf[41])[0] = rslt.getInt(22) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setVarchar(4, (String)parms[3], 20, false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setVarchar(6, (String)parms[5], 20, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setVarchar(10, (String)parms[9], 8, false);
               stmt.setVarchar(11, (String)parms[10], 20, false);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setVarchar(13, (String)parms[12], 8, false);
               stmt.setBigDecimal(14, ((Number) parms[13]).longValue(), 0);
               stmt.setBigDecimal(15, ((Number) parms[14]).longValue(), 0);
               stmt.setBigDecimal(16, ((Number) parms[15]).longValue(), 0);
               stmt.setBigDecimal(17, ((Number) parms[16]).longValue(), 0);
               stmt.setBigDecimal(18, ((Number) parms[17]).longValue(), 0);
               stmt.setVarchar(19, (String)parms[18], 8, false);
               stmt.setVarchar(20, (String)parms[19], 254, false);
               stmt.setVarchar(21, (String)parms[20], 254, false);
               stmt.setString(22, (String)parms[21], 1);
               return;
      }
   }

}

