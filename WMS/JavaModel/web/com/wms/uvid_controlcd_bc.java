/*
               File: uvid_controlcd_bc
        Description: UVID_CONTROLCD
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:57.1
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class uvid_controlcd_bc extends GXWebPanel implements IGxSilentTrn
{
   public uvid_controlcd_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public uvid_controlcd_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( uvid_controlcd_bc.class ));
   }

   public uvid_controlcd_bc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow038( ) ;
      standaloneNotModal( ) ;
      initializeNonKey038( ) ;
      standaloneModal( ) ;
      addRow038( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z41UVID_CONTROLCDDocEntry = A41UVID_CONTROLCDDocEntry ;
            Z42LineId = A42LineId ;
            SetMode( "UPD") ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_030( )
   {
      beforeValidate038( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls038( ) ;
         }
         else
         {
            checkExtendedTable038( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors038( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm038( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z106VisOrder = A106VisOrder ;
         Z107UVID_CONTROLCDObject = A107UVID_CONTROLCDObject ;
         Z108UVID_CONTROLCDLogInst = A108UVID_CONTROLCDLogInst ;
         Z109U_CodAtr = A109U_CodAtr ;
         Z110U_NameAtr = A110U_NameAtr ;
         Z111U_Cualitat = A111U_Cualitat ;
         Z112U_Critico = A112U_Critico ;
         Z113U_TipoMues = A113U_TipoMues ;
         Z114U_Rango = A114U_Rango ;
         Z115U_TipoDef = A115U_TipoDef ;
         Z116U_AQL = A116U_AQL ;
         Z117U_TiempoDu = A117U_TiempoDu ;
         Z118U_StandAtr = A118U_StandAtr ;
         Z119U_Minimo = A119U_Minimo ;
         Z120U_Maximo = A120U_Maximo ;
         Z121U_Medicion = A121U_Medicion ;
         Z122U_CodEquip = A122U_CodEquip ;
         Z123UVID_CONTROLCDU_Comment = A123UVID_CONTROLCDU_Comment ;
         Z124U_Comment2 = A124U_Comment2 ;
         Z125UVID_CONTROLCDU_Estado = A125UVID_CONTROLCDU_Estado ;
      }
      if ( GX_JID == -1 )
      {
         Z41UVID_CONTROLCDDocEntry = A41UVID_CONTROLCDDocEntry ;
         Z42LineId = A42LineId ;
         Z106VisOrder = A106VisOrder ;
         Z107UVID_CONTROLCDObject = A107UVID_CONTROLCDObject ;
         Z108UVID_CONTROLCDLogInst = A108UVID_CONTROLCDLogInst ;
         Z109U_CodAtr = A109U_CodAtr ;
         Z110U_NameAtr = A110U_NameAtr ;
         Z111U_Cualitat = A111U_Cualitat ;
         Z112U_Critico = A112U_Critico ;
         Z113U_TipoMues = A113U_TipoMues ;
         Z114U_Rango = A114U_Rango ;
         Z115U_TipoDef = A115U_TipoDef ;
         Z116U_AQL = A116U_AQL ;
         Z117U_TiempoDu = A117U_TiempoDu ;
         Z118U_StandAtr = A118U_StandAtr ;
         Z119U_Minimo = A119U_Minimo ;
         Z120U_Maximo = A120U_Maximo ;
         Z121U_Medicion = A121U_Medicion ;
         Z122U_CodEquip = A122U_CodEquip ;
         Z123UVID_CONTROLCDU_Comment = A123UVID_CONTROLCDU_Comment ;
         Z124U_Comment2 = A124U_Comment2 ;
         Z125UVID_CONTROLCDU_Estado = A125UVID_CONTROLCDU_Estado ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load038( )
   {
      /* Using cursor BC00034 */
      pr_fusquim_sap.execute(2, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
      if ( (pr_fusquim_sap.getStatus(2) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A106VisOrder = BC00034_A106VisOrder[0] ;
         A107UVID_CONTROLCDObject = BC00034_A107UVID_CONTROLCDObject[0] ;
         A108UVID_CONTROLCDLogInst = BC00034_A108UVID_CONTROLCDLogInst[0] ;
         A109U_CodAtr = BC00034_A109U_CodAtr[0] ;
         A110U_NameAtr = BC00034_A110U_NameAtr[0] ;
         A111U_Cualitat = BC00034_A111U_Cualitat[0] ;
         A112U_Critico = BC00034_A112U_Critico[0] ;
         A113U_TipoMues = BC00034_A113U_TipoMues[0] ;
         A114U_Rango = BC00034_A114U_Rango[0] ;
         A115U_TipoDef = BC00034_A115U_TipoDef[0] ;
         A116U_AQL = BC00034_A116U_AQL[0] ;
         A117U_TiempoDu = BC00034_A117U_TiempoDu[0] ;
         A118U_StandAtr = BC00034_A118U_StandAtr[0] ;
         A119U_Minimo = BC00034_A119U_Minimo[0] ;
         A120U_Maximo = BC00034_A120U_Maximo[0] ;
         A121U_Medicion = BC00034_A121U_Medicion[0] ;
         A122U_CodEquip = BC00034_A122U_CodEquip[0] ;
         A123UVID_CONTROLCDU_Comment = BC00034_A123UVID_CONTROLCDU_Comment[0] ;
         A124U_Comment2 = BC00034_A124U_Comment2[0] ;
         A125UVID_CONTROLCDU_Estado = BC00034_A125UVID_CONTROLCDU_Estado[0] ;
         zm038( -1) ;
      }
      pr_fusquim_sap.close(2);
      onLoadActions038( ) ;
   }

   public void onLoadActions038( )
   {
   }

   public void checkExtendedTable038( )
   {
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors038( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey038( )
   {
      /* Using cursor BC00035 */
      pr_fusquim_sap.execute(3, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
      if ( (pr_fusquim_sap.getStatus(3) != 101) )
      {
         RcdFound8 = (short)(1) ;
      }
      else
      {
         RcdFound8 = (short)(0) ;
      }
      pr_fusquim_sap.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00036 */
      pr_fusquim_sap.execute(4, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
      if ( (pr_fusquim_sap.getStatus(4) != 101) )
      {
         zm038( 1) ;
         RcdFound8 = (short)(1) ;
         A41UVID_CONTROLCDDocEntry = BC00036_A41UVID_CONTROLCDDocEntry[0] ;
         A42LineId = BC00036_A42LineId[0] ;
         A106VisOrder = BC00036_A106VisOrder[0] ;
         A107UVID_CONTROLCDObject = BC00036_A107UVID_CONTROLCDObject[0] ;
         A108UVID_CONTROLCDLogInst = BC00036_A108UVID_CONTROLCDLogInst[0] ;
         A109U_CodAtr = BC00036_A109U_CodAtr[0] ;
         A110U_NameAtr = BC00036_A110U_NameAtr[0] ;
         A111U_Cualitat = BC00036_A111U_Cualitat[0] ;
         A112U_Critico = BC00036_A112U_Critico[0] ;
         A113U_TipoMues = BC00036_A113U_TipoMues[0] ;
         A114U_Rango = BC00036_A114U_Rango[0] ;
         A115U_TipoDef = BC00036_A115U_TipoDef[0] ;
         A116U_AQL = BC00036_A116U_AQL[0] ;
         A117U_TiempoDu = BC00036_A117U_TiempoDu[0] ;
         A118U_StandAtr = BC00036_A118U_StandAtr[0] ;
         A119U_Minimo = BC00036_A119U_Minimo[0] ;
         A120U_Maximo = BC00036_A120U_Maximo[0] ;
         A121U_Medicion = BC00036_A121U_Medicion[0] ;
         A122U_CodEquip = BC00036_A122U_CodEquip[0] ;
         A123UVID_CONTROLCDU_Comment = BC00036_A123UVID_CONTROLCDU_Comment[0] ;
         A124U_Comment2 = BC00036_A124U_Comment2[0] ;
         A125UVID_CONTROLCDU_Estado = BC00036_A125UVID_CONTROLCDU_Estado[0] ;
         Z41UVID_CONTROLCDDocEntry = A41UVID_CONTROLCDDocEntry ;
         Z42LineId = A42LineId ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load038( ) ;
         if ( AnyError == 1 )
         {
            RcdFound8 = (short)(0) ;
            initializeNonKey038( ) ;
         }
         Gx_mode = sMode8 ;
      }
      else
      {
         RcdFound8 = (short)(0) ;
         initializeNonKey038( ) ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode8 ;
      }
      pr_fusquim_sap.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey038( ) ;
      if ( RcdFound8 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_030( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency038( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00037 */
         pr_fusquim_sap.execute(5, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
         if ( (pr_fusquim_sap.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_CONTROLCD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_fusquim_sap.getStatus(5) == 101) || ( Z106VisOrder != BC00037_A106VisOrder[0] ) || ( GXutil.strcmp(Z107UVID_CONTROLCDObject, BC00037_A107UVID_CONTROLCDObject[0]) != 0 ) || ( Z108UVID_CONTROLCDLogInst != BC00037_A108UVID_CONTROLCDLogInst[0] ) || ( GXutil.strcmp(Z109U_CodAtr, BC00037_A109U_CodAtr[0]) != 0 ) || ( GXutil.strcmp(Z110U_NameAtr, BC00037_A110U_NameAtr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z111U_Cualitat, BC00037_A111U_Cualitat[0]) != 0 ) || ( GXutil.strcmp(Z112U_Critico, BC00037_A112U_Critico[0]) != 0 ) || ( GXutil.strcmp(Z113U_TipoMues, BC00037_A113U_TipoMues[0]) != 0 ) || ( GXutil.strcmp(Z114U_Rango, BC00037_A114U_Rango[0]) != 0 ) || ( GXutil.strcmp(Z115U_TipoDef, BC00037_A115U_TipoDef[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z116U_AQL, BC00037_A116U_AQL[0]) != 0 ) || ( Z117U_TiempoDu != BC00037_A117U_TiempoDu[0] ) || ( Z118U_StandAtr != BC00037_A118U_StandAtr[0] ) || ( Z119U_Minimo != BC00037_A119U_Minimo[0] ) || ( Z120U_Maximo != BC00037_A120U_Maximo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z121U_Medicion != BC00037_A121U_Medicion[0] ) || ( GXutil.strcmp(Z122U_CodEquip, BC00037_A122U_CodEquip[0]) != 0 ) || ( GXutil.strcmp(Z123UVID_CONTROLCDU_Comment, BC00037_A123UVID_CONTROLCDU_Comment[0]) != 0 ) || ( GXutil.strcmp(Z124U_Comment2, BC00037_A124U_Comment2[0]) != 0 ) || ( GXutil.strcmp(Z125UVID_CONTROLCDU_Estado, BC00037_A125UVID_CONTROLCDU_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"@VID_CONTROLCD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert038( )
   {
      beforeValidate038( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable038( ) ;
      }
      if ( AnyError == 0 )
      {
         zm038( 0) ;
         checkOptimisticConcurrency038( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm038( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert038( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00038 */
                  pr_fusquim_sap.execute(6, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId), new Integer(A106VisOrder), A107UVID_CONTROLCDObject, new Integer(A108UVID_CONTROLCDLogInst), A109U_CodAtr, A110U_NameAtr, A111U_Cualitat, A112U_Critico, A113U_TipoMues, A114U_Rango, A115U_TipoDef, A116U_AQL, new Long(A117U_TiempoDu), new Long(A118U_StandAtr), new Long(A119U_Minimo), new Long(A120U_Maximo), new Long(A121U_Medicion), A122U_CodEquip, A123UVID_CONTROLCDU_Comment, A124U_Comment2, A125UVID_CONTROLCDU_Estado});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_CONTROLCD") ;
                  if ( (pr_fusquim_sap.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load038( ) ;
         }
         endLevel038( ) ;
      }
      closeExtendedTableCursors038( ) ;
   }

   public void update038( )
   {
      beforeValidate038( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable038( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency038( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm038( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate038( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00039 */
                  pr_fusquim_sap.execute(7, new Object[] {new Integer(A106VisOrder), A107UVID_CONTROLCDObject, new Integer(A108UVID_CONTROLCDLogInst), A109U_CodAtr, A110U_NameAtr, A111U_Cualitat, A112U_Critico, A113U_TipoMues, A114U_Rango, A115U_TipoDef, A116U_AQL, new Long(A117U_TiempoDu), new Long(A118U_StandAtr), new Long(A119U_Minimo), new Long(A120U_Maximo), new Long(A121U_Medicion), A122U_CodEquip, A123UVID_CONTROLCDU_Comment, A124U_Comment2, A125UVID_CONTROLCDU_Estado, new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_CONTROLCD") ;
                  if ( (pr_fusquim_sap.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"@VID_CONTROLCD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate038( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel038( ) ;
      }
      closeExtendedTableCursors038( ) ;
   }

   public void deferredUpdate038( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate038( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency038( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls038( ) ;
         afterConfirm038( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete038( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000310 */
               pr_fusquim_sap.execute(8, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("@VID_CONTROLCD") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), "SuccessfullyDeleted", 0, "", true);
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode8 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel038( ) ;
      Gx_mode = sMode8 ;
   }

   public void onDeleteControls038( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel038( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_fusquim_sap.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete038( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart038( )
   {
      /* Using cursor BC000311 */
      pr_fusquim_sap.execute(9, new Object[] {new Integer(A41UVID_CONTROLCDDocEntry), new Integer(A42LineId)});
      RcdFound8 = (short)(0) ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A41UVID_CONTROLCDDocEntry = BC000311_A41UVID_CONTROLCDDocEntry[0] ;
         A42LineId = BC000311_A42LineId[0] ;
         A106VisOrder = BC000311_A106VisOrder[0] ;
         A107UVID_CONTROLCDObject = BC000311_A107UVID_CONTROLCDObject[0] ;
         A108UVID_CONTROLCDLogInst = BC000311_A108UVID_CONTROLCDLogInst[0] ;
         A109U_CodAtr = BC000311_A109U_CodAtr[0] ;
         A110U_NameAtr = BC000311_A110U_NameAtr[0] ;
         A111U_Cualitat = BC000311_A111U_Cualitat[0] ;
         A112U_Critico = BC000311_A112U_Critico[0] ;
         A113U_TipoMues = BC000311_A113U_TipoMues[0] ;
         A114U_Rango = BC000311_A114U_Rango[0] ;
         A115U_TipoDef = BC000311_A115U_TipoDef[0] ;
         A116U_AQL = BC000311_A116U_AQL[0] ;
         A117U_TiempoDu = BC000311_A117U_TiempoDu[0] ;
         A118U_StandAtr = BC000311_A118U_StandAtr[0] ;
         A119U_Minimo = BC000311_A119U_Minimo[0] ;
         A120U_Maximo = BC000311_A120U_Maximo[0] ;
         A121U_Medicion = BC000311_A121U_Medicion[0] ;
         A122U_CodEquip = BC000311_A122U_CodEquip[0] ;
         A123UVID_CONTROLCDU_Comment = BC000311_A123UVID_CONTROLCDU_Comment[0] ;
         A124U_Comment2 = BC000311_A124U_Comment2[0] ;
         A125UVID_CONTROLCDU_Estado = BC000311_A125UVID_CONTROLCDU_Estado[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext038( )
   {
      /* Scan next routine */
      pr_fusquim_sap.readNext(9);
      RcdFound8 = (short)(0) ;
      scanKeyLoad038( ) ;
   }

   public void scanKeyLoad038( )
   {
      sMode8 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_fusquim_sap.getStatus(9) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A41UVID_CONTROLCDDocEntry = BC000311_A41UVID_CONTROLCDDocEntry[0] ;
         A42LineId = BC000311_A42LineId[0] ;
         A106VisOrder = BC000311_A106VisOrder[0] ;
         A107UVID_CONTROLCDObject = BC000311_A107UVID_CONTROLCDObject[0] ;
         A108UVID_CONTROLCDLogInst = BC000311_A108UVID_CONTROLCDLogInst[0] ;
         A109U_CodAtr = BC000311_A109U_CodAtr[0] ;
         A110U_NameAtr = BC000311_A110U_NameAtr[0] ;
         A111U_Cualitat = BC000311_A111U_Cualitat[0] ;
         A112U_Critico = BC000311_A112U_Critico[0] ;
         A113U_TipoMues = BC000311_A113U_TipoMues[0] ;
         A114U_Rango = BC000311_A114U_Rango[0] ;
         A115U_TipoDef = BC000311_A115U_TipoDef[0] ;
         A116U_AQL = BC000311_A116U_AQL[0] ;
         A117U_TiempoDu = BC000311_A117U_TiempoDu[0] ;
         A118U_StandAtr = BC000311_A118U_StandAtr[0] ;
         A119U_Minimo = BC000311_A119U_Minimo[0] ;
         A120U_Maximo = BC000311_A120U_Maximo[0] ;
         A121U_Medicion = BC000311_A121U_Medicion[0] ;
         A122U_CodEquip = BC000311_A122U_CodEquip[0] ;
         A123UVID_CONTROLCDU_Comment = BC000311_A123UVID_CONTROLCDU_Comment[0] ;
         A124U_Comment2 = BC000311_A124U_Comment2[0] ;
         A125UVID_CONTROLCDU_Estado = BC000311_A125UVID_CONTROLCDU_Estado[0] ;
      }
      Gx_mode = sMode8 ;
   }

   public void scanKeyEnd038( )
   {
      pr_fusquim_sap.close(9);
   }

   public void afterConfirm038( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert038( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate038( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete038( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete038( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate038( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes038( )
   {
   }

   public void addRow038( )
   {
      VarsToRow8( bcUVID_CONTROLCD) ;
   }

   public void readRow038( )
   {
      RowToVars8( bcUVID_CONTROLCD, 1) ;
   }

   public void initializeNonKey038( )
   {
      A106VisOrder = 0 ;
      A107UVID_CONTROLCDObject = "" ;
      A108UVID_CONTROLCDLogInst = 0 ;
      A109U_CodAtr = "" ;
      A110U_NameAtr = "" ;
      A111U_Cualitat = "" ;
      A112U_Critico = "" ;
      A113U_TipoMues = "" ;
      A114U_Rango = "" ;
      A115U_TipoDef = "" ;
      A116U_AQL = "" ;
      A117U_TiempoDu = 0 ;
      A118U_StandAtr = 0 ;
      A119U_Minimo = 0 ;
      A120U_Maximo = 0 ;
      A121U_Medicion = 0 ;
      A122U_CodEquip = "" ;
      A123UVID_CONTROLCDU_Comment = "" ;
      A124U_Comment2 = "" ;
      A125UVID_CONTROLCDU_Estado = "" ;
      Z106VisOrder = 0 ;
      Z107UVID_CONTROLCDObject = "" ;
      Z108UVID_CONTROLCDLogInst = 0 ;
      Z109U_CodAtr = "" ;
      Z110U_NameAtr = "" ;
      Z111U_Cualitat = "" ;
      Z112U_Critico = "" ;
      Z113U_TipoMues = "" ;
      Z114U_Rango = "" ;
      Z115U_TipoDef = "" ;
      Z116U_AQL = "" ;
      Z117U_TiempoDu = 0 ;
      Z118U_StandAtr = 0 ;
      Z119U_Minimo = 0 ;
      Z120U_Maximo = 0 ;
      Z121U_Medicion = 0 ;
      Z122U_CodEquip = "" ;
      Z123UVID_CONTROLCDU_Comment = "" ;
      Z124U_Comment2 = "" ;
      Z125UVID_CONTROLCDU_Estado = "" ;
   }

   public void initAll038( )
   {
      A41UVID_CONTROLCDDocEntry = 0 ;
      A42LineId = 0 ;
      initializeNonKey038( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow8( com.wms.SdtUVID_CONTROLCD obj8 )
   {
      obj8.setgxTv_SdtUVID_CONTROLCD_Mode( Gx_mode );
      obj8.setgxTv_SdtUVID_CONTROLCD_Visorder( A106VisOrder );
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject( A107UVID_CONTROLCDObject );
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst( A108UVID_CONTROLCDLogInst );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_codatr( A109U_CodAtr );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_nameatr( A110U_NameAtr );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_cualitat( A111U_Cualitat );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_critico( A112U_Critico );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_tipomues( A113U_TipoMues );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_rango( A114U_Rango );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_tipodef( A115U_TipoDef );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_aql( A116U_AQL );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_tiempodu( A117U_TiempoDu );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_standatr( A118U_StandAtr );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_minimo( A119U_Minimo );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_maximo( A120U_Maximo );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_medicion( A121U_Medicion );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_codequip( A122U_CodEquip );
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment( A123UVID_CONTROLCDU_Comment );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_comment2( A124U_Comment2 );
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado( A125UVID_CONTROLCDU_Estado );
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry( A41UVID_CONTROLCDDocEntry );
      obj8.setgxTv_SdtUVID_CONTROLCD_Lineid( A42LineId );
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z( Z41UVID_CONTROLCDDocEntry );
      obj8.setgxTv_SdtUVID_CONTROLCD_Lineid_Z( Z42LineId );
      obj8.setgxTv_SdtUVID_CONTROLCD_Visorder_Z( Z106VisOrder );
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z( Z107UVID_CONTROLCDObject );
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z( Z108UVID_CONTROLCDLogInst );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_codatr_Z( Z109U_CodAtr );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_nameatr_Z( Z110U_NameAtr );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_cualitat_Z( Z111U_Cualitat );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_critico_Z( Z112U_Critico );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_tipomues_Z( Z113U_TipoMues );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_rango_Z( Z114U_Rango );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_tipodef_Z( Z115U_TipoDef );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_aql_Z( Z116U_AQL );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_tiempodu_Z( Z117U_TiempoDu );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_standatr_Z( Z118U_StandAtr );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_minimo_Z( Z119U_Minimo );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_maximo_Z( Z120U_Maximo );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_medicion_Z( Z121U_Medicion );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_codequip_Z( Z122U_CodEquip );
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z( Z123UVID_CONTROLCDU_Comment );
      obj8.setgxTv_SdtUVID_CONTROLCD_U_comment2_Z( Z124U_Comment2 );
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z( Z125UVID_CONTROLCDU_Estado );
      obj8.setgxTv_SdtUVID_CONTROLCD_Mode( Gx_mode );
   }

   public void KeyVarsToRow8( com.wms.SdtUVID_CONTROLCD obj8 )
   {
      obj8.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry( A41UVID_CONTROLCDDocEntry );
      obj8.setgxTv_SdtUVID_CONTROLCD_Lineid( A42LineId );
   }

   public void RowToVars8( com.wms.SdtUVID_CONTROLCD obj8 ,
                           int forceLoad )
   {
      Gx_mode = obj8.getgxTv_SdtUVID_CONTROLCD_Mode() ;
      A106VisOrder = obj8.getgxTv_SdtUVID_CONTROLCD_Visorder() ;
      A107UVID_CONTROLCDObject = obj8.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject() ;
      A108UVID_CONTROLCDLogInst = obj8.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst() ;
      A109U_CodAtr = obj8.getgxTv_SdtUVID_CONTROLCD_U_codatr() ;
      A110U_NameAtr = obj8.getgxTv_SdtUVID_CONTROLCD_U_nameatr() ;
      A111U_Cualitat = obj8.getgxTv_SdtUVID_CONTROLCD_U_cualitat() ;
      A112U_Critico = obj8.getgxTv_SdtUVID_CONTROLCD_U_critico() ;
      A113U_TipoMues = obj8.getgxTv_SdtUVID_CONTROLCD_U_tipomues() ;
      A114U_Rango = obj8.getgxTv_SdtUVID_CONTROLCD_U_rango() ;
      A115U_TipoDef = obj8.getgxTv_SdtUVID_CONTROLCD_U_tipodef() ;
      A116U_AQL = obj8.getgxTv_SdtUVID_CONTROLCD_U_aql() ;
      A117U_TiempoDu = obj8.getgxTv_SdtUVID_CONTROLCD_U_tiempodu() ;
      A118U_StandAtr = obj8.getgxTv_SdtUVID_CONTROLCD_U_standatr() ;
      A119U_Minimo = obj8.getgxTv_SdtUVID_CONTROLCD_U_minimo() ;
      A120U_Maximo = obj8.getgxTv_SdtUVID_CONTROLCD_U_maximo() ;
      A121U_Medicion = obj8.getgxTv_SdtUVID_CONTROLCD_U_medicion() ;
      A122U_CodEquip = obj8.getgxTv_SdtUVID_CONTROLCD_U_codequip() ;
      A123UVID_CONTROLCDU_Comment = obj8.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment() ;
      A124U_Comment2 = obj8.getgxTv_SdtUVID_CONTROLCD_U_comment2() ;
      A125UVID_CONTROLCDU_Estado = obj8.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado() ;
      A41UVID_CONTROLCDDocEntry = obj8.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry() ;
      A42LineId = obj8.getgxTv_SdtUVID_CONTROLCD_Lineid() ;
      Z41UVID_CONTROLCDDocEntry = obj8.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z() ;
      Z42LineId = obj8.getgxTv_SdtUVID_CONTROLCD_Lineid_Z() ;
      Z106VisOrder = obj8.getgxTv_SdtUVID_CONTROLCD_Visorder_Z() ;
      Z107UVID_CONTROLCDObject = obj8.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z() ;
      Z108UVID_CONTROLCDLogInst = obj8.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z() ;
      Z109U_CodAtr = obj8.getgxTv_SdtUVID_CONTROLCD_U_codatr_Z() ;
      Z110U_NameAtr = obj8.getgxTv_SdtUVID_CONTROLCD_U_nameatr_Z() ;
      Z111U_Cualitat = obj8.getgxTv_SdtUVID_CONTROLCD_U_cualitat_Z() ;
      Z112U_Critico = obj8.getgxTv_SdtUVID_CONTROLCD_U_critico_Z() ;
      Z113U_TipoMues = obj8.getgxTv_SdtUVID_CONTROLCD_U_tipomues_Z() ;
      Z114U_Rango = obj8.getgxTv_SdtUVID_CONTROLCD_U_rango_Z() ;
      Z115U_TipoDef = obj8.getgxTv_SdtUVID_CONTROLCD_U_tipodef_Z() ;
      Z116U_AQL = obj8.getgxTv_SdtUVID_CONTROLCD_U_aql_Z() ;
      Z117U_TiempoDu = obj8.getgxTv_SdtUVID_CONTROLCD_U_tiempodu_Z() ;
      Z118U_StandAtr = obj8.getgxTv_SdtUVID_CONTROLCD_U_standatr_Z() ;
      Z119U_Minimo = obj8.getgxTv_SdtUVID_CONTROLCD_U_minimo_Z() ;
      Z120U_Maximo = obj8.getgxTv_SdtUVID_CONTROLCD_U_maximo_Z() ;
      Z121U_Medicion = obj8.getgxTv_SdtUVID_CONTROLCD_U_medicion_Z() ;
      Z122U_CodEquip = obj8.getgxTv_SdtUVID_CONTROLCD_U_codequip_Z() ;
      Z123UVID_CONTROLCDU_Comment = obj8.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z() ;
      Z124U_Comment2 = obj8.getgxTv_SdtUVID_CONTROLCD_U_comment2_Z() ;
      Z125UVID_CONTROLCDU_Estado = obj8.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z() ;
      Gx_mode = obj8.getgxTv_SdtUVID_CONTROLCD_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A41UVID_CONTROLCDDocEntry = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      A42LineId = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey038( ) ;
      scanKeyStart038( ) ;
      if ( RcdFound8 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z41UVID_CONTROLCDDocEntry = A41UVID_CONTROLCDDocEntry ;
         Z42LineId = A42LineId ;
      }
      zm038( -1) ;
      onLoadActions038( ) ;
      addRow038( ) ;
      scanKeyEnd038( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars8( bcUVID_CONTROLCD, 0) ;
      scanKeyStart038( ) ;
      if ( RcdFound8 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z41UVID_CONTROLCDDocEntry = A41UVID_CONTROLCDDocEntry ;
         Z42LineId = A42LineId ;
      }
      zm038( -1) ;
      onLoadActions038( ) ;
      addRow038( ) ;
      scanKeyEnd038( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey038( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert038( ) ;
      }
      else
      {
         if ( RcdFound8 == 1 )
         {
            if ( ( A41UVID_CONTROLCDDocEntry != Z41UVID_CONTROLCDDocEntry ) || ( A42LineId != Z42LineId ) )
            {
               A41UVID_CONTROLCDDocEntry = Z41UVID_CONTROLCDDocEntry ;
               A42LineId = Z42LineId ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update038( ) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( ( A41UVID_CONTROLCDDocEntry != Z41UVID_CONTROLCDDocEntry ) || ( A42LineId != Z42LineId ) )
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert038( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert038( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars8( bcUVID_CONTROLCD, 0) ;
      saveImpl( ) ;
      VarsToRow8( bcUVID_CONTROLCD) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars8( bcUVID_CONTROLCD, 0) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert038( ) ;
      afterTrn( ) ;
      VarsToRow8( bcUVID_CONTROLCD) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         saveImpl( ) ;
      }
      else
      {
         com.wms.SdtUVID_CONTROLCD auxBC = new com.wms.SdtUVID_CONTROLCD( remoteHandle, context) ;
         auxBC.Load(A41UVID_CONTROLCDDocEntry, A42LineId);
         auxBC.updateDirties(bcUVID_CONTROLCD);
         auxBC.Save();
         IGxSilentTrn auxTrn = auxBC.getTransaction() ;
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         Gx_mode = auxTrn.GetMode() ;
         httpContext.GX_msglist = LclMsgLst ;
         afterTrn( ) ;
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars8( bcUVID_CONTROLCD, 0) ;
      updateImpl( ) ;
      VarsToRow8( bcUVID_CONTROLCD) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars8( bcUVID_CONTROLCD, 0) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert038( ) ;
      if ( AnyError == 1 )
      {
         AnyError = (short)(0) ;
         httpContext.GX_msglist.removeAllItems();
         updateImpl( ) ;
      }
      else
      {
         afterTrn( ) ;
      }
      VarsToRow8( bcUVID_CONTROLCD) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars8( bcUVID_CONTROLCD, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey038( ) ;
      if ( RcdFound8 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A41UVID_CONTROLCDDocEntry != Z41UVID_CONTROLCDDocEntry ) || ( A42LineId != Z42LineId ) )
         {
            A41UVID_CONTROLCDDocEntry = Z41UVID_CONTROLCDDocEntry ;
            A42LineId = Z42LineId ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( ( A41UVID_CONTROLCDDocEntry != Z41UVID_CONTROLCDDocEntry ) || ( A42LineId != Z42LineId ) )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      pr_fusquim_sap.close(1);
      pr_fusquim_sap.close(0);
      Application.rollback(context, remoteHandle, "FUSQUIM_SAP",pr_fusquim_sap, "uvid_controlcd_bc");
      Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "uvid_controlcd_bc");
      VarsToRow8( bcUVID_CONTROLCD) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcUVID_CONTROLCD.getgxTv_SdtUVID_CONTROLCD_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcUVID_CONTROLCD.setgxTv_SdtUVID_CONTROLCD_Mode( Gx_mode );
   }

   public void SetSDT( com.wms.SdtUVID_CONTROLCD sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcUVID_CONTROLCD )
      {
         bcUVID_CONTROLCD = sdt ;
         if ( GXutil.strcmp(bcUVID_CONTROLCD.getgxTv_SdtUVID_CONTROLCD_Mode(), "") == 0 )
         {
            bcUVID_CONTROLCD.setgxTv_SdtUVID_CONTROLCD_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow8( bcUVID_CONTROLCD) ;
         }
         else
         {
            RowToVars8( bcUVID_CONTROLCD, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcUVID_CONTROLCD.getgxTv_SdtUVID_CONTROLCD_Mode(), "") == 0 )
         {
            bcUVID_CONTROLCD.setgxTv_SdtUVID_CONTROLCD_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars8( bcUVID_CONTROLCD, 1) ;
   }

   public SdtUVID_CONTROLCD getUVID_CONTROLCD_BC( )
   {
      return bcUVID_CONTROLCD ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      Z107UVID_CONTROLCDObject = "" ;
      A107UVID_CONTROLCDObject = "" ;
      Z109U_CodAtr = "" ;
      A109U_CodAtr = "" ;
      Z110U_NameAtr = "" ;
      A110U_NameAtr = "" ;
      Z111U_Cualitat = "" ;
      A111U_Cualitat = "" ;
      Z112U_Critico = "" ;
      A112U_Critico = "" ;
      Z113U_TipoMues = "" ;
      A113U_TipoMues = "" ;
      Z114U_Rango = "" ;
      A114U_Rango = "" ;
      Z115U_TipoDef = "" ;
      A115U_TipoDef = "" ;
      Z116U_AQL = "" ;
      A116U_AQL = "" ;
      Z122U_CodEquip = "" ;
      A122U_CodEquip = "" ;
      Z123UVID_CONTROLCDU_Comment = "" ;
      A123UVID_CONTROLCDU_Comment = "" ;
      Z124U_Comment2 = "" ;
      A124U_Comment2 = "" ;
      Z125UVID_CONTROLCDU_Estado = "" ;
      A125UVID_CONTROLCDU_Estado = "" ;
      BC00034_A41UVID_CONTROLCDDocEntry = new int[1] ;
      BC00034_A42LineId = new int[1] ;
      BC00034_A106VisOrder = new int[1] ;
      BC00034_A107UVID_CONTROLCDObject = new String[] {""} ;
      BC00034_A108UVID_CONTROLCDLogInst = new int[1] ;
      BC00034_A109U_CodAtr = new String[] {""} ;
      BC00034_A110U_NameAtr = new String[] {""} ;
      BC00034_A111U_Cualitat = new String[] {""} ;
      BC00034_A112U_Critico = new String[] {""} ;
      BC00034_A113U_TipoMues = new String[] {""} ;
      BC00034_A114U_Rango = new String[] {""} ;
      BC00034_A115U_TipoDef = new String[] {""} ;
      BC00034_A116U_AQL = new String[] {""} ;
      BC00034_A117U_TiempoDu = new long[1] ;
      BC00034_A118U_StandAtr = new long[1] ;
      BC00034_A119U_Minimo = new long[1] ;
      BC00034_A120U_Maximo = new long[1] ;
      BC00034_A121U_Medicion = new long[1] ;
      BC00034_A122U_CodEquip = new String[] {""} ;
      BC00034_A123UVID_CONTROLCDU_Comment = new String[] {""} ;
      BC00034_A124U_Comment2 = new String[] {""} ;
      BC00034_A125UVID_CONTROLCDU_Estado = new String[] {""} ;
      BC00035_A41UVID_CONTROLCDDocEntry = new int[1] ;
      BC00035_A42LineId = new int[1] ;
      BC00036_A41UVID_CONTROLCDDocEntry = new int[1] ;
      BC00036_A42LineId = new int[1] ;
      BC00036_A106VisOrder = new int[1] ;
      BC00036_A107UVID_CONTROLCDObject = new String[] {""} ;
      BC00036_A108UVID_CONTROLCDLogInst = new int[1] ;
      BC00036_A109U_CodAtr = new String[] {""} ;
      BC00036_A110U_NameAtr = new String[] {""} ;
      BC00036_A111U_Cualitat = new String[] {""} ;
      BC00036_A112U_Critico = new String[] {""} ;
      BC00036_A113U_TipoMues = new String[] {""} ;
      BC00036_A114U_Rango = new String[] {""} ;
      BC00036_A115U_TipoDef = new String[] {""} ;
      BC00036_A116U_AQL = new String[] {""} ;
      BC00036_A117U_TiempoDu = new long[1] ;
      BC00036_A118U_StandAtr = new long[1] ;
      BC00036_A119U_Minimo = new long[1] ;
      BC00036_A120U_Maximo = new long[1] ;
      BC00036_A121U_Medicion = new long[1] ;
      BC00036_A122U_CodEquip = new String[] {""} ;
      BC00036_A123UVID_CONTROLCDU_Comment = new String[] {""} ;
      BC00036_A124U_Comment2 = new String[] {""} ;
      BC00036_A125UVID_CONTROLCDU_Estado = new String[] {""} ;
      sMode8 = "" ;
      BC00037_A41UVID_CONTROLCDDocEntry = new int[1] ;
      BC00037_A42LineId = new int[1] ;
      BC00037_A106VisOrder = new int[1] ;
      BC00037_A107UVID_CONTROLCDObject = new String[] {""} ;
      BC00037_A108UVID_CONTROLCDLogInst = new int[1] ;
      BC00037_A109U_CodAtr = new String[] {""} ;
      BC00037_A110U_NameAtr = new String[] {""} ;
      BC00037_A111U_Cualitat = new String[] {""} ;
      BC00037_A112U_Critico = new String[] {""} ;
      BC00037_A113U_TipoMues = new String[] {""} ;
      BC00037_A114U_Rango = new String[] {""} ;
      BC00037_A115U_TipoDef = new String[] {""} ;
      BC00037_A116U_AQL = new String[] {""} ;
      BC00037_A117U_TiempoDu = new long[1] ;
      BC00037_A118U_StandAtr = new long[1] ;
      BC00037_A119U_Minimo = new long[1] ;
      BC00037_A120U_Maximo = new long[1] ;
      BC00037_A121U_Medicion = new long[1] ;
      BC00037_A122U_CodEquip = new String[] {""} ;
      BC00037_A123UVID_CONTROLCDU_Comment = new String[] {""} ;
      BC00037_A124U_Comment2 = new String[] {""} ;
      BC00037_A125UVID_CONTROLCDU_Estado = new String[] {""} ;
      BC000311_A41UVID_CONTROLCDDocEntry = new int[1] ;
      BC000311_A42LineId = new int[1] ;
      BC000311_A106VisOrder = new int[1] ;
      BC000311_A107UVID_CONTROLCDObject = new String[] {""} ;
      BC000311_A108UVID_CONTROLCDLogInst = new int[1] ;
      BC000311_A109U_CodAtr = new String[] {""} ;
      BC000311_A110U_NameAtr = new String[] {""} ;
      BC000311_A111U_Cualitat = new String[] {""} ;
      BC000311_A112U_Critico = new String[] {""} ;
      BC000311_A113U_TipoMues = new String[] {""} ;
      BC000311_A114U_Rango = new String[] {""} ;
      BC000311_A115U_TipoDef = new String[] {""} ;
      BC000311_A116U_AQL = new String[] {""} ;
      BC000311_A117U_TiempoDu = new long[1] ;
      BC000311_A118U_StandAtr = new long[1] ;
      BC000311_A119U_Minimo = new long[1] ;
      BC000311_A120U_Maximo = new long[1] ;
      BC000311_A121U_Medicion = new long[1] ;
      BC000311_A122U_CodEquip = new String[] {""} ;
      BC000311_A123UVID_CONTROLCDU_Comment = new String[] {""} ;
      BC000311_A124U_Comment2 = new String[] {""} ;
      BC000311_A125UVID_CONTROLCDU_Estado = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_fusquim_sap = new DataStoreProvider(context, remoteHandle, new com.wms.uvid_controlcd_bc__fusquim_sap(),
         new Object[] {
             new Object[] {
            BC00032_A41UVID_CONTROLCDDocEntry, BC00032_A42LineId, BC00032_A106VisOrder, BC00032_A107UVID_CONTROLCDObject, BC00032_A108UVID_CONTROLCDLogInst, BC00032_A109U_CodAtr, BC00032_A110U_NameAtr, BC00032_A111U_Cualitat, BC00032_A112U_Critico, BC00032_A113U_TipoMues,
            BC00032_A114U_Rango, BC00032_A115U_TipoDef, BC00032_A116U_AQL, BC00032_A117U_TiempoDu, BC00032_A118U_StandAtr, BC00032_A119U_Minimo, BC00032_A120U_Maximo, BC00032_A121U_Medicion, BC00032_A122U_CodEquip, BC00032_A123UVID_CONTROLCDU_Comment,
            BC00032_A124U_Comment2, BC00032_A125UVID_CONTROLCDU_Estado
            }
            , new Object[] {
            BC00033_A41UVID_CONTROLCDDocEntry, BC00033_A42LineId, BC00033_A106VisOrder, BC00033_A107UVID_CONTROLCDObject, BC00033_A108UVID_CONTROLCDLogInst, BC00033_A109U_CodAtr, BC00033_A110U_NameAtr, BC00033_A111U_Cualitat, BC00033_A112U_Critico, BC00033_A113U_TipoMues,
            BC00033_A114U_Rango, BC00033_A115U_TipoDef, BC00033_A116U_AQL, BC00033_A117U_TiempoDu, BC00033_A118U_StandAtr, BC00033_A119U_Minimo, BC00033_A120U_Maximo, BC00033_A121U_Medicion, BC00033_A122U_CodEquip, BC00033_A123UVID_CONTROLCDU_Comment,
            BC00033_A124U_Comment2, BC00033_A125UVID_CONTROLCDU_Estado
            }
            , new Object[] {
            BC00034_A41UVID_CONTROLCDDocEntry, BC00034_A42LineId, BC00034_A106VisOrder, BC00034_A107UVID_CONTROLCDObject, BC00034_A108UVID_CONTROLCDLogInst, BC00034_A109U_CodAtr, BC00034_A110U_NameAtr, BC00034_A111U_Cualitat, BC00034_A112U_Critico, BC00034_A113U_TipoMues,
            BC00034_A114U_Rango, BC00034_A115U_TipoDef, BC00034_A116U_AQL, BC00034_A117U_TiempoDu, BC00034_A118U_StandAtr, BC00034_A119U_Minimo, BC00034_A120U_Maximo, BC00034_A121U_Medicion, BC00034_A122U_CodEquip, BC00034_A123UVID_CONTROLCDU_Comment,
            BC00034_A124U_Comment2, BC00034_A125UVID_CONTROLCDU_Estado
            }
            , new Object[] {
            BC00035_A41UVID_CONTROLCDDocEntry, BC00035_A42LineId
            }
            , new Object[] {
            BC00036_A41UVID_CONTROLCDDocEntry, BC00036_A42LineId, BC00036_A106VisOrder, BC00036_A107UVID_CONTROLCDObject, BC00036_A108UVID_CONTROLCDLogInst, BC00036_A109U_CodAtr, BC00036_A110U_NameAtr, BC00036_A111U_Cualitat, BC00036_A112U_Critico, BC00036_A113U_TipoMues,
            BC00036_A114U_Rango, BC00036_A115U_TipoDef, BC00036_A116U_AQL, BC00036_A117U_TiempoDu, BC00036_A118U_StandAtr, BC00036_A119U_Minimo, BC00036_A120U_Maximo, BC00036_A121U_Medicion, BC00036_A122U_CodEquip, BC00036_A123UVID_CONTROLCDU_Comment,
            BC00036_A124U_Comment2, BC00036_A125UVID_CONTROLCDU_Estado
            }
            , new Object[] {
            BC00037_A41UVID_CONTROLCDDocEntry, BC00037_A42LineId, BC00037_A106VisOrder, BC00037_A107UVID_CONTROLCDObject, BC00037_A108UVID_CONTROLCDLogInst, BC00037_A109U_CodAtr, BC00037_A110U_NameAtr, BC00037_A111U_Cualitat, BC00037_A112U_Critico, BC00037_A113U_TipoMues,
            BC00037_A114U_Rango, BC00037_A115U_TipoDef, BC00037_A116U_AQL, BC00037_A117U_TiempoDu, BC00037_A118U_StandAtr, BC00037_A119U_Minimo, BC00037_A120U_Maximo, BC00037_A121U_Medicion, BC00037_A122U_CodEquip, BC00037_A123UVID_CONTROLCDU_Comment,
            BC00037_A124U_Comment2, BC00037_A125UVID_CONTROLCDU_Estado
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000311_A41UVID_CONTROLCDDocEntry, BC000311_A42LineId, BC000311_A106VisOrder, BC000311_A107UVID_CONTROLCDObject, BC000311_A108UVID_CONTROLCDLogInst, BC000311_A109U_CodAtr, BC000311_A110U_NameAtr, BC000311_A111U_Cualitat, BC000311_A112U_Critico, BC000311_A113U_TipoMues,
            BC000311_A114U_Rango, BC000311_A115U_TipoDef, BC000311_A116U_AQL, BC000311_A117U_TiempoDu, BC000311_A118U_StandAtr, BC000311_A119U_Minimo, BC000311_A120U_Maximo, BC000311_A121U_Medicion, BC000311_A122U_CodEquip, BC000311_A123UVID_CONTROLCDU_Comment,
            BC000311_A124U_Comment2, BC000311_A125UVID_CONTROLCDU_Estado
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.uvid_controlcd_bc__default(),
         new Object[] {
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound8 ;
   private int trnEnded ;
   private int Z41UVID_CONTROLCDDocEntry ;
   private int A41UVID_CONTROLCDDocEntry ;
   private int Z42LineId ;
   private int A42LineId ;
   private int GX_JID ;
   private int Z106VisOrder ;
   private int A106VisOrder ;
   private int Z108UVID_CONTROLCDLogInst ;
   private int A108UVID_CONTROLCDLogInst ;
   private long Z117U_TiempoDu ;
   private long A117U_TiempoDu ;
   private long Z118U_StandAtr ;
   private long A118U_StandAtr ;
   private long Z119U_Minimo ;
   private long A119U_Minimo ;
   private long Z120U_Maximo ;
   private long A120U_Maximo ;
   private long Z121U_Medicion ;
   private long A121U_Medicion ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String Z111U_Cualitat ;
   private String A111U_Cualitat ;
   private String Z112U_Critico ;
   private String A112U_Critico ;
   private String Z115U_TipoDef ;
   private String A115U_TipoDef ;
   private String Z125UVID_CONTROLCDU_Estado ;
   private String A125UVID_CONTROLCDU_Estado ;
   private String sMode8 ;
   private boolean Gx_longc ;
   private String Z107UVID_CONTROLCDObject ;
   private String A107UVID_CONTROLCDObject ;
   private String Z109U_CodAtr ;
   private String A109U_CodAtr ;
   private String Z110U_NameAtr ;
   private String A110U_NameAtr ;
   private String Z113U_TipoMues ;
   private String A113U_TipoMues ;
   private String Z114U_Rango ;
   private String A114U_Rango ;
   private String Z116U_AQL ;
   private String A116U_AQL ;
   private String Z122U_CodEquip ;
   private String A122U_CodEquip ;
   private String Z123UVID_CONTROLCDU_Comment ;
   private String A123UVID_CONTROLCDU_Comment ;
   private String Z124U_Comment2 ;
   private String A124U_Comment2 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.wms.SdtUVID_CONTROLCD bcUVID_CONTROLCD ;
   private IDataStoreProvider pr_fusquim_sap ;
   private int[] BC00034_A41UVID_CONTROLCDDocEntry ;
   private int[] BC00034_A42LineId ;
   private int[] BC00034_A106VisOrder ;
   private String[] BC00034_A107UVID_CONTROLCDObject ;
   private int[] BC00034_A108UVID_CONTROLCDLogInst ;
   private String[] BC00034_A109U_CodAtr ;
   private String[] BC00034_A110U_NameAtr ;
   private String[] BC00034_A111U_Cualitat ;
   private String[] BC00034_A112U_Critico ;
   private String[] BC00034_A113U_TipoMues ;
   private String[] BC00034_A114U_Rango ;
   private String[] BC00034_A115U_TipoDef ;
   private String[] BC00034_A116U_AQL ;
   private long[] BC00034_A117U_TiempoDu ;
   private long[] BC00034_A118U_StandAtr ;
   private long[] BC00034_A119U_Minimo ;
   private long[] BC00034_A120U_Maximo ;
   private long[] BC00034_A121U_Medicion ;
   private String[] BC00034_A122U_CodEquip ;
   private String[] BC00034_A123UVID_CONTROLCDU_Comment ;
   private String[] BC00034_A124U_Comment2 ;
   private String[] BC00034_A125UVID_CONTROLCDU_Estado ;
   private int[] BC00035_A41UVID_CONTROLCDDocEntry ;
   private int[] BC00035_A42LineId ;
   private int[] BC00036_A41UVID_CONTROLCDDocEntry ;
   private int[] BC00036_A42LineId ;
   private int[] BC00036_A106VisOrder ;
   private String[] BC00036_A107UVID_CONTROLCDObject ;
   private int[] BC00036_A108UVID_CONTROLCDLogInst ;
   private String[] BC00036_A109U_CodAtr ;
   private String[] BC00036_A110U_NameAtr ;
   private String[] BC00036_A111U_Cualitat ;
   private String[] BC00036_A112U_Critico ;
   private String[] BC00036_A113U_TipoMues ;
   private String[] BC00036_A114U_Rango ;
   private String[] BC00036_A115U_TipoDef ;
   private String[] BC00036_A116U_AQL ;
   private long[] BC00036_A117U_TiempoDu ;
   private long[] BC00036_A118U_StandAtr ;
   private long[] BC00036_A119U_Minimo ;
   private long[] BC00036_A120U_Maximo ;
   private long[] BC00036_A121U_Medicion ;
   private String[] BC00036_A122U_CodEquip ;
   private String[] BC00036_A123UVID_CONTROLCDU_Comment ;
   private String[] BC00036_A124U_Comment2 ;
   private String[] BC00036_A125UVID_CONTROLCDU_Estado ;
   private int[] BC00037_A41UVID_CONTROLCDDocEntry ;
   private int[] BC00037_A42LineId ;
   private int[] BC00037_A106VisOrder ;
   private String[] BC00037_A107UVID_CONTROLCDObject ;
   private int[] BC00037_A108UVID_CONTROLCDLogInst ;
   private String[] BC00037_A109U_CodAtr ;
   private String[] BC00037_A110U_NameAtr ;
   private String[] BC00037_A111U_Cualitat ;
   private String[] BC00037_A112U_Critico ;
   private String[] BC00037_A113U_TipoMues ;
   private String[] BC00037_A114U_Rango ;
   private String[] BC00037_A115U_TipoDef ;
   private String[] BC00037_A116U_AQL ;
   private long[] BC00037_A117U_TiempoDu ;
   private long[] BC00037_A118U_StandAtr ;
   private long[] BC00037_A119U_Minimo ;
   private long[] BC00037_A120U_Maximo ;
   private long[] BC00037_A121U_Medicion ;
   private String[] BC00037_A122U_CodEquip ;
   private String[] BC00037_A123UVID_CONTROLCDU_Comment ;
   private String[] BC00037_A124U_Comment2 ;
   private String[] BC00037_A125UVID_CONTROLCDU_Estado ;
   private int[] BC000311_A41UVID_CONTROLCDDocEntry ;
   private int[] BC000311_A42LineId ;
   private int[] BC000311_A106VisOrder ;
   private String[] BC000311_A107UVID_CONTROLCDObject ;
   private int[] BC000311_A108UVID_CONTROLCDLogInst ;
   private String[] BC000311_A109U_CodAtr ;
   private String[] BC000311_A110U_NameAtr ;
   private String[] BC000311_A111U_Cualitat ;
   private String[] BC000311_A112U_Critico ;
   private String[] BC000311_A113U_TipoMues ;
   private String[] BC000311_A114U_Rango ;
   private String[] BC000311_A115U_TipoDef ;
   private String[] BC000311_A116U_AQL ;
   private long[] BC000311_A117U_TiempoDu ;
   private long[] BC000311_A118U_StandAtr ;
   private long[] BC000311_A119U_Minimo ;
   private long[] BC000311_A120U_Maximo ;
   private long[] BC000311_A121U_Medicion ;
   private String[] BC000311_A122U_CodEquip ;
   private String[] BC000311_A123UVID_CONTROLCDU_Comment ;
   private String[] BC000311_A124U_Comment2 ;
   private String[] BC000311_A125UVID_CONTROLCDU_Estado ;
   private IDataStoreProvider pr_default ;
   private int[] BC00032_A41UVID_CONTROLCDDocEntry ;
   private int[] BC00032_A42LineId ;
   private int[] BC00032_A106VisOrder ;
   private String[] BC00032_A107UVID_CONTROLCDObject ;
   private int[] BC00032_A108UVID_CONTROLCDLogInst ;
   private String[] BC00032_A109U_CodAtr ;
   private String[] BC00032_A110U_NameAtr ;
   private String[] BC00032_A111U_Cualitat ;
   private String[] BC00032_A112U_Critico ;
   private String[] BC00032_A113U_TipoMues ;
   private String[] BC00032_A114U_Rango ;
   private String[] BC00032_A115U_TipoDef ;
   private String[] BC00032_A116U_AQL ;
   private long[] BC00032_A117U_TiempoDu ;
   private long[] BC00032_A118U_StandAtr ;
   private long[] BC00032_A119U_Minimo ;
   private long[] BC00032_A120U_Maximo ;
   private long[] BC00032_A121U_Medicion ;
   private String[] BC00032_A122U_CodEquip ;
   private String[] BC00032_A123UVID_CONTROLCDU_Comment ;
   private String[] BC00032_A124U_Comment2 ;
   private String[] BC00032_A125UVID_CONTROLCDU_Estado ;
   private int[] BC00033_A41UVID_CONTROLCDDocEntry ;
   private int[] BC00033_A42LineId ;
   private int[] BC00033_A106VisOrder ;
   private String[] BC00033_A107UVID_CONTROLCDObject ;
   private int[] BC00033_A108UVID_CONTROLCDLogInst ;
   private String[] BC00033_A109U_CodAtr ;
   private String[] BC00033_A110U_NameAtr ;
   private String[] BC00033_A111U_Cualitat ;
   private String[] BC00033_A112U_Critico ;
   private String[] BC00033_A113U_TipoMues ;
   private String[] BC00033_A114U_Rango ;
   private String[] BC00033_A115U_TipoDef ;
   private String[] BC00033_A116U_AQL ;
   private long[] BC00033_A117U_TiempoDu ;
   private long[] BC00033_A118U_StandAtr ;
   private long[] BC00033_A119U_Minimo ;
   private long[] BC00033_A120U_Maximo ;
   private long[] BC00033_A121U_Medicion ;
   private String[] BC00033_A122U_CodEquip ;
   private String[] BC00033_A123UVID_CONTROLCDU_Comment ;
   private String[] BC00033_A124U_Comment2 ;
   private String[] BC00033_A125UVID_CONTROLCDU_Estado ;
}

final  class uvid_controlcd_bc__fusquim_sap extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00032", "SELECT [DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_Rango], [U_TipoDef], [U_AQL], [U_TiempoDu], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Medicion], [U_CodEquip], [U_Comment], [U_Comment2], [U_Estado] FROM dbo.[@VID_CONTROLCD] WITH (UPDLOCK) WHERE [DocEntry] = ? AND [LineId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00033", "SELECT [DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_Rango], [U_TipoDef], [U_AQL], [U_TiempoDu], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Medicion], [U_CodEquip], [U_Comment], [U_Comment2], [U_Estado] FROM dbo.[@VID_CONTROLCD] WITH (NOLOCK) WHERE [DocEntry] = ? AND [LineId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00034", "SELECT TM1.[DocEntry], TM1.[LineId], TM1.[VisOrder], TM1.[Object], TM1.[LogInst], TM1.[U_CodAtr], TM1.[U_NameAtr], TM1.[U_Cualitat], TM1.[U_Critico], TM1.[U_TipoMues], TM1.[U_Rango], TM1.[U_TipoDef], TM1.[U_AQL], TM1.[U_TiempoDu], TM1.[U_StandAtr], TM1.[U_Minimo], TM1.[U_Maximo], TM1.[U_Medicion], TM1.[U_CodEquip], TM1.[U_Comment], TM1.[U_Comment2], TM1.[U_Estado] FROM dbo.[@VID_CONTROLCD] TM1 WITH (NOLOCK) WHERE TM1.[DocEntry] = ? and TM1.[LineId] = ? ORDER BY TM1.[DocEntry], TM1.[LineId]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC00035", "SELECT [DocEntry], [LineId] FROM dbo.[@VID_CONTROLCD] WITH (NOLOCK) WHERE [DocEntry] = ? AND [LineId] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00036", "SELECT [DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_Rango], [U_TipoDef], [U_AQL], [U_TiempoDu], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Medicion], [U_CodEquip], [U_Comment], [U_Comment2], [U_Estado] FROM dbo.[@VID_CONTROLCD] WITH (NOLOCK) WHERE [DocEntry] = ? AND [LineId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00037", "SELECT [DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_Rango], [U_TipoDef], [U_AQL], [U_TiempoDu], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Medicion], [U_CodEquip], [U_Comment], [U_Comment2], [U_Estado] FROM dbo.[@VID_CONTROLCD] WITH (UPDLOCK) WHERE [DocEntry] = ? AND [LineId] = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00038", "INSERT INTO dbo.[@VID_CONTROLCD]([DocEntry], [LineId], [VisOrder], [Object], [LogInst], [U_CodAtr], [U_NameAtr], [U_Cualitat], [U_Critico], [U_TipoMues], [U_Rango], [U_TipoDef], [U_AQL], [U_TiempoDu], [U_StandAtr], [U_Minimo], [U_Maximo], [U_Medicion], [U_CodEquip], [U_Comment], [U_Comment2], [U_Estado]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00039", "UPDATE dbo.[@VID_CONTROLCD] SET [VisOrder]=?, [Object]=?, [LogInst]=?, [U_CodAtr]=?, [U_NameAtr]=?, [U_Cualitat]=?, [U_Critico]=?, [U_TipoMues]=?, [U_Rango]=?, [U_TipoDef]=?, [U_AQL]=?, [U_TiempoDu]=?, [U_StandAtr]=?, [U_Minimo]=?, [U_Maximo]=?, [U_Medicion]=?, [U_CodEquip]=?, [U_Comment]=?, [U_Comment2]=?, [U_Estado]=?  WHERE [DocEntry] = ? AND [LineId] = ?", GX_NOMASK)
         ,new UpdateCursor("BC000310", "DELETE FROM dbo.[@VID_CONTROLCD]  WHERE [DocEntry] = ? AND [LineId] = ?", GX_NOMASK)
         ,new ForEachCursor("BC000311", "SELECT TM1.[DocEntry], TM1.[LineId], TM1.[VisOrder], TM1.[Object], TM1.[LogInst], TM1.[U_CodAtr], TM1.[U_NameAtr], TM1.[U_Cualitat], TM1.[U_Critico], TM1.[U_TipoMues], TM1.[U_Rango], TM1.[U_TipoDef], TM1.[U_AQL], TM1.[U_TiempoDu], TM1.[U_StandAtr], TM1.[U_Minimo], TM1.[U_Maximo], TM1.[U_Medicion], TM1.[U_CodEquip], TM1.[U_Comment], TM1.[U_Comment2], TM1.[U_Estado] FROM dbo.[@VID_CONTROLCD] TM1 WITH (NOLOCK) WHERE TM1.[DocEntry] = ? and TM1.[LineId] = ? ORDER BY TM1.[DocEntry], TM1.[LineId]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getString(12, 1) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((long[]) buf[13])[0] = rslt.getLong(14) ;
               ((long[]) buf[14])[0] = rslt.getLong(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((long[]) buf[16])[0] = rslt.getLong(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getString(22, 1) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getString(12, 1) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((long[]) buf[13])[0] = rslt.getLong(14) ;
               ((long[]) buf[14])[0] = rslt.getLong(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((long[]) buf[16])[0] = rslt.getLong(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getString(22, 1) ;
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getString(12, 1) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((long[]) buf[13])[0] = rslt.getLong(14) ;
               ((long[]) buf[14])[0] = rslt.getLong(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((long[]) buf[16])[0] = rslt.getLong(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getString(22, 1) ;
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getString(12, 1) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((long[]) buf[13])[0] = rslt.getLong(14) ;
               ((long[]) buf[14])[0] = rslt.getLong(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((long[]) buf[16])[0] = rslt.getLong(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getString(22, 1) ;
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getString(12, 1) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((long[]) buf[13])[0] = rslt.getLong(14) ;
               ((long[]) buf[14])[0] = rslt.getLong(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((long[]) buf[16])[0] = rslt.getLong(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getString(22, 1) ;
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getString(12, 1) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((long[]) buf[13])[0] = rslt.getLong(14) ;
               ((long[]) buf[14])[0] = rslt.getLong(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((long[]) buf[16])[0] = rslt.getLong(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getString(22, 1) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
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
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setVarchar(4, (String)parms[3], 20, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setVarchar(8, (String)parms[7], 8, false);
               stmt.setVarchar(9, (String)parms[8], 20, false);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setVarchar(11, (String)parms[10], 8, false);
               stmt.setBigDecimal(12, ((Number) parms[11]).longValue(), 0);
               stmt.setBigDecimal(13, ((Number) parms[12]).longValue(), 0);
               stmt.setBigDecimal(14, ((Number) parms[13]).longValue(), 0);
               stmt.setBigDecimal(15, ((Number) parms[14]).longValue(), 0);
               stmt.setBigDecimal(16, ((Number) parms[15]).longValue(), 0);
               stmt.setVarchar(17, (String)parms[16], 8, false);
               stmt.setVarchar(18, (String)parms[17], 254, false);
               stmt.setVarchar(19, (String)parms[18], 254, false);
               stmt.setString(20, (String)parms[19], 1);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "FUSQUIM_SAP";
   }

}

final  class uvid_controlcd_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

