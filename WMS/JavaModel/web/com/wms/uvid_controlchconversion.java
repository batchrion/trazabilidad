/*
               File: UVID_CONTROLCHConversion
        Description: Conversion for table UVID_CONTROLCH
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 5, 2018 11:50:47.16
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class uvid_controlchconversion extends GXProcedure
{
   public uvid_controlchconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( uvid_controlchconversion.class ), "" );
   }

   public uvid_controlchconversion( int remoteHandle ,
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
         A104U_Reanalis = UVID_CONTR2_A104U_Reanalis[0] ;
         n104U_Reanalis = UVID_CONTR2_n104U_Reanalis[0] ;
         A94U_PrjCode = UVID_CONTR2_A94U_PrjCode[0] ;
         n94U_PrjCode = UVID_CONTR2_n94U_PrjCode[0] ;
         A93U_CCCode = UVID_CONTR2_A93U_CCCode[0] ;
         n93U_CCCode = UVID_CONTR2_n93U_CCCode[0] ;
         A86U_Traslado = UVID_CONTR2_A86U_Traslado[0] ;
         n86U_Traslado = UVID_CONTR2_n86U_Traslado[0] ;
         A82U_FecFin = UVID_CONTR2_A82U_FecFin[0] ;
         n82U_FecFin = UVID_CONTR2_n82U_FecFin[0] ;
         A81U_FecIni = UVID_CONTR2_A81U_FecIni[0] ;
         n81U_FecIni = UVID_CONTR2_n81U_FecIni[0] ;
         A80U_FecContr = UVID_CONTR2_A80U_FecContr[0] ;
         n80U_FecContr = UVID_CONTR2_n80U_FecContr[0] ;
         A78U_UM = UVID_CONTR2_A78U_UM[0] ;
         n78U_UM = UVID_CONTR2_n78U_UM[0] ;
         A77U_FecUltIn = UVID_CONTR2_A77U_FecUltIn[0] ;
         n77U_FecUltIn = UVID_CONTR2_n77U_FecUltIn[0] ;
         A76U_FecIngr = UVID_CONTR2_A76U_FecIngr[0] ;
         n76U_FecIngr = UVID_CONTR2_n76U_FecIngr[0] ;
         A75U_BultosMu = UVID_CONTR2_A75U_BultosMu[0] ;
         n75U_BultosMu = UVID_CONTR2_n75U_BultosMu[0] ;
         A74U_Bultos = UVID_CONTR2_A74U_Bultos[0] ;
         n74U_Bultos = UVID_CONTR2_n74U_Bultos[0] ;
         A73U_Cantidad = UVID_CONTR2_A73U_Cantidad[0] ;
         n73U_Cantidad = UVID_CONTR2_n73U_Cantidad[0] ;
         A72U_CorrAnal = UVID_CONTR2_A72U_CorrAnal[0] ;
         n72U_CorrAnal = UVID_CONTR2_n72U_CorrAnal[0] ;
         A71U_CorrLote = UVID_CONTR2_A71U_CorrLote[0] ;
         n71U_CorrLote = UVID_CONTR2_n71U_CorrLote[0] ;
         A70U_NoLote = UVID_CONTR2_A70U_NoLote[0] ;
         n70U_NoLote = UVID_CONTR2_n70U_NoLote[0] ;
         A65U_WhsCode = UVID_CONTR2_A65U_WhsCode[0] ;
         n65U_WhsCode = UVID_CONTR2_n65U_WhsCode[0] ;
         A63U_ItemCode = UVID_CONTR2_A63U_ItemCode[0] ;
         n63U_ItemCode = UVID_CONTR2_n63U_ItemCode[0] ;
         A105U_NroOF = UVID_CONTR2_A105U_NroOF[0] ;
         n105U_NroOF = UVID_CONTR2_n105U_NroOF[0] ;
         A103U_AtrT4 = UVID_CONTR2_A103U_AtrT4[0] ;
         n103U_AtrT4 = UVID_CONTR2_n103U_AtrT4[0] ;
         A102U_AtrT3 = UVID_CONTR2_A102U_AtrT3[0] ;
         n102U_AtrT3 = UVID_CONTR2_n102U_AtrT3[0] ;
         A101U_AtrT2 = UVID_CONTR2_A101U_AtrT2[0] ;
         n101U_AtrT2 = UVID_CONTR2_n101U_AtrT2[0] ;
         A100U_AtrT1 = UVID_CONTR2_A100U_AtrT1[0] ;
         n100U_AtrT1 = UVID_CONTR2_n100U_AtrT1[0] ;
         A99U_AtrQ4 = UVID_CONTR2_A99U_AtrQ4[0] ;
         n99U_AtrQ4 = UVID_CONTR2_n99U_AtrQ4[0] ;
         A98U_AtrQ3 = UVID_CONTR2_A98U_AtrQ3[0] ;
         n98U_AtrQ3 = UVID_CONTR2_n98U_AtrQ3[0] ;
         A97U_AtrQ2 = UVID_CONTR2_A97U_AtrQ2[0] ;
         n97U_AtrQ2 = UVID_CONTR2_n97U_AtrQ2[0] ;
         A96U_AtrQ1 = UVID_CONTR2_A96U_AtrQ1[0] ;
         n96U_AtrQ1 = UVID_CONTR2_n96U_AtrQ1[0] ;
         A95UVID_CONTROLCHU_Comment = UVID_CONTR2_A95UVID_CONTROLCHU_Comment[0] ;
         n95UVID_CONTROLCHU_Comment = UVID_CONTR2_n95UVID_CONTROLCHU_Comment[0] ;
         A92U_CtaCalid = UVID_CONTR2_A92U_CtaCalid[0] ;
         n92U_CtaCalid = UVID_CONTR2_n92U_CtaCalid[0] ;
         A91U_MuDeSize = UVID_CONTR2_A91U_MuDeSize[0] ;
         n91U_MuDeSize = UVID_CONTR2_n91U_MuDeSize[0] ;
         A90U_MuestDes = UVID_CONTR2_A90U_MuestDes[0] ;
         n90U_MuestDes = UVID_CONTR2_n90U_MuestDes[0] ;
         A89U_CoMuSize = UVID_CONTR2_A89U_CoMuSize[0] ;
         n89U_CoMuSize = UVID_CONTR2_n89U_CoMuSize[0] ;
         A88U_ContraMu = UVID_CONTR2_A88U_ContraMu[0] ;
         n88U_ContraMu = UVID_CONTR2_n88U_ContraMu[0] ;
         A87U_TipResul = UVID_CONTR2_A87U_TipResul[0] ;
         n87U_TipResul = UVID_CONTR2_n87U_TipResul[0] ;
         A85UVID_CONTROLCHU_Estado = UVID_CONTR2_A85UVID_CONTROLCHU_Estado[0] ;
         n85UVID_CONTROLCHU_Estado = UVID_CONTR2_n85UVID_CONTROLCHU_Estado[0] ;
         A84U_DocOrig = UVID_CONTR2_A84U_DocOrig[0] ;
         n84U_DocOrig = UVID_CONTR2_n84U_DocOrig[0] ;
         A83U_Usuario = UVID_CONTR2_A83U_Usuario[0] ;
         n83U_Usuario = UVID_CONTR2_n83U_Usuario[0] ;
         A79U_NoDoc = UVID_CONTR2_A79U_NoDoc[0] ;
         n79U_NoDoc = UVID_CONTR2_n79U_NoDoc[0] ;
         A69U_NumMusd = UVID_CONTR2_A69U_NumMusd[0] ;
         n69U_NumMusd = UVID_CONTR2_n69U_NumMusd[0] ;
         A68U_NumCon = UVID_CONTR2_A68U_NumCon[0] ;
         n68U_NumCon = UVID_CONTR2_n68U_NumCon[0] ;
         A67U_NumTras = UVID_CONTR2_A67U_NumTras[0] ;
         n67U_NumTras = UVID_CONTR2_n67U_NumTras[0] ;
         A66U_WhsDest = UVID_CONTR2_A66U_WhsDest[0] ;
         n66U_WhsDest = UVID_CONTR2_n66U_WhsDest[0] ;
         A64U_ItemName = UVID_CONTR2_A64U_ItemName[0] ;
         n64U_ItemName = UVID_CONTR2_n64U_ItemName[0] ;
         A62Remark = UVID_CONTR2_A62Remark[0] ;
         n62Remark = UVID_CONTR2_n62Remark[0] ;
         A61Creator = UVID_CONTR2_A61Creator[0] ;
         n61Creator = UVID_CONTR2_n61Creator[0] ;
         A60RequestStatus = UVID_CONTR2_A60RequestStatus[0] ;
         n60RequestStatus = UVID_CONTR2_n60RequestStatus[0] ;
         A59DataSource = UVID_CONTR2_A59DataSource[0] ;
         n59DataSource = UVID_CONTR2_n59DataSource[0] ;
         A58UpdateTime = UVID_CONTR2_A58UpdateTime[0] ;
         n58UpdateTime = UVID_CONTR2_n58UpdateTime[0] ;
         A57UpdateDate = UVID_CONTR2_A57UpdateDate[0] ;
         n57UpdateDate = UVID_CONTR2_n57UpdateDate[0] ;
         A56CreateTime = UVID_CONTR2_A56CreateTime[0] ;
         n56CreateTime = UVID_CONTR2_n56CreateTime[0] ;
         A55CreateDate = UVID_CONTR2_A55CreateDate[0] ;
         n55CreateDate = UVID_CONTR2_n55CreateDate[0] ;
         A54Status = UVID_CONTR2_A54Status[0] ;
         n54Status = UVID_CONTR2_n54Status[0] ;
         A53Transfered = UVID_CONTR2_A53Transfered[0] ;
         n53Transfered = UVID_CONTR2_n53Transfered[0] ;
         A52UserSign = UVID_CONTR2_A52UserSign[0] ;
         n52UserSign = UVID_CONTR2_n52UserSign[0] ;
         A51UVID_CONTROLCHLogInst = UVID_CONTR2_A51UVID_CONTROLCHLogInst[0] ;
         n51UVID_CONTROLCHLogInst = UVID_CONTR2_n51UVID_CONTROLCHLogInst[0] ;
         A50UVID_CONTROLCHObject = UVID_CONTR2_A50UVID_CONTROLCHObject[0] ;
         n50UVID_CONTROLCHObject = UVID_CONTR2_n50UVID_CONTROLCHObject[0] ;
         A49Canceled = UVID_CONTR2_A49Canceled[0] ;
         n49Canceled = UVID_CONTR2_n49Canceled[0] ;
         A48Handwrtten = UVID_CONTR2_A48Handwrtten[0] ;
         n48Handwrtten = UVID_CONTR2_n48Handwrtten[0] ;
         A47Series = UVID_CONTR2_A47Series[0] ;
         n47Series = UVID_CONTR2_n47Series[0] ;
         A46Instance = UVID_CONTR2_A46Instance[0] ;
         n46Instance = UVID_CONTR2_n46Instance[0] ;
         A45Period = UVID_CONTR2_A45Period[0] ;
         n45Period = UVID_CONTR2_n45Period[0] ;
         A44DocNum = UVID_CONTR2_A44DocNum[0] ;
         n44DocNum = UVID_CONTR2_n44DocNum[0] ;
         A43UVID_CONTROLCHDocEntry = UVID_CONTR2_A43UVID_CONTROLCHDocEntry[0] ;
         A104U_Reanalis = UVID_CONTR2_A104U_Reanalis[0] ;
         n104U_Reanalis = UVID_CONTR2_n104U_Reanalis[0] ;
         A94U_PrjCode = UVID_CONTR2_A94U_PrjCode[0] ;
         n94U_PrjCode = UVID_CONTR2_n94U_PrjCode[0] ;
         A93U_CCCode = UVID_CONTR2_A93U_CCCode[0] ;
         n93U_CCCode = UVID_CONTR2_n93U_CCCode[0] ;
         A86U_Traslado = UVID_CONTR2_A86U_Traslado[0] ;
         n86U_Traslado = UVID_CONTR2_n86U_Traslado[0] ;
         A82U_FecFin = UVID_CONTR2_A82U_FecFin[0] ;
         n82U_FecFin = UVID_CONTR2_n82U_FecFin[0] ;
         A81U_FecIni = UVID_CONTR2_A81U_FecIni[0] ;
         n81U_FecIni = UVID_CONTR2_n81U_FecIni[0] ;
         A80U_FecContr = UVID_CONTR2_A80U_FecContr[0] ;
         n80U_FecContr = UVID_CONTR2_n80U_FecContr[0] ;
         A78U_UM = UVID_CONTR2_A78U_UM[0] ;
         n78U_UM = UVID_CONTR2_n78U_UM[0] ;
         A77U_FecUltIn = UVID_CONTR2_A77U_FecUltIn[0] ;
         n77U_FecUltIn = UVID_CONTR2_n77U_FecUltIn[0] ;
         A76U_FecIngr = UVID_CONTR2_A76U_FecIngr[0] ;
         n76U_FecIngr = UVID_CONTR2_n76U_FecIngr[0] ;
         A75U_BultosMu = UVID_CONTR2_A75U_BultosMu[0] ;
         n75U_BultosMu = UVID_CONTR2_n75U_BultosMu[0] ;
         A74U_Bultos = UVID_CONTR2_A74U_Bultos[0] ;
         n74U_Bultos = UVID_CONTR2_n74U_Bultos[0] ;
         A73U_Cantidad = UVID_CONTR2_A73U_Cantidad[0] ;
         n73U_Cantidad = UVID_CONTR2_n73U_Cantidad[0] ;
         A72U_CorrAnal = UVID_CONTR2_A72U_CorrAnal[0] ;
         n72U_CorrAnal = UVID_CONTR2_n72U_CorrAnal[0] ;
         A71U_CorrLote = UVID_CONTR2_A71U_CorrLote[0] ;
         n71U_CorrLote = UVID_CONTR2_n71U_CorrLote[0] ;
         A70U_NoLote = UVID_CONTR2_A70U_NoLote[0] ;
         n70U_NoLote = UVID_CONTR2_n70U_NoLote[0] ;
         A65U_WhsCode = UVID_CONTR2_A65U_WhsCode[0] ;
         n65U_WhsCode = UVID_CONTR2_n65U_WhsCode[0] ;
         A63U_ItemCode = UVID_CONTR2_A63U_ItemCode[0] ;
         n63U_ItemCode = UVID_CONTR2_n63U_ItemCode[0] ;
         /*
            INSERT RECORD ON TABLE GXA0003

         */
         AV2UVID_CONTROLCHDocEntry = A43UVID_CONTROLCHDocEntry ;
         if ( UVID_CONTR2_n44DocNum[0] )
         {
            AV3DocNum = 0 ;
            nV3DocNum = false ;
            nV3DocNum = true ;
         }
         else
         {
            AV3DocNum = A44DocNum ;
            nV3DocNum = false ;
         }
         if ( UVID_CONTR2_n45Period[0] )
         {
            AV4Period = 0 ;
            nV4Period = false ;
            nV4Period = true ;
         }
         else
         {
            AV4Period = A45Period ;
            nV4Period = false ;
         }
         if ( UVID_CONTR2_n46Instance[0] )
         {
            AV5Instance = (short)(0) ;
            nV5Instance = false ;
            nV5Instance = true ;
         }
         else
         {
            AV5Instance = A46Instance ;
            nV5Instance = false ;
         }
         if ( UVID_CONTR2_n47Series[0] )
         {
            AV6Series = 0 ;
            nV6Series = false ;
            nV6Series = true ;
         }
         else
         {
            AV6Series = A47Series ;
            nV6Series = false ;
         }
         if ( UVID_CONTR2_n48Handwrtten[0] )
         {
            AV7Handwrtten = "" ;
            nV7Handwrtten = false ;
            nV7Handwrtten = true ;
         }
         else
         {
            AV7Handwrtten = A48Handwrtten ;
            nV7Handwrtten = false ;
         }
         if ( UVID_CONTR2_n49Canceled[0] )
         {
            AV8Canceled = "" ;
            nV8Canceled = false ;
            nV8Canceled = true ;
         }
         else
         {
            AV8Canceled = A49Canceled ;
            nV8Canceled = false ;
         }
         if ( UVID_CONTR2_n50UVID_CONTROLCHObject[0] )
         {
            AV9UVID_CONTROLCHObject = "" ;
            nV9UVID_CONTROLCHObject = false ;
            nV9UVID_CONTROLCHObject = true ;
         }
         else
         {
            AV9UVID_CONTROLCHObject = A50UVID_CONTROLCHObject ;
            nV9UVID_CONTROLCHObject = false ;
         }
         if ( UVID_CONTR2_n51UVID_CONTROLCHLogInst[0] )
         {
            AV10UVID_CONTROLCHLogInst = 0 ;
            nV10UVID_CONTROLCHLogInst = false ;
            nV10UVID_CONTROLCHLogInst = true ;
         }
         else
         {
            AV10UVID_CONTROLCHLogInst = A51UVID_CONTROLCHLogInst ;
            nV10UVID_CONTROLCHLogInst = false ;
         }
         if ( UVID_CONTR2_n52UserSign[0] )
         {
            AV11UserSign = 0 ;
            nV11UserSign = false ;
            nV11UserSign = true ;
         }
         else
         {
            AV11UserSign = A52UserSign ;
            nV11UserSign = false ;
         }
         if ( UVID_CONTR2_n53Transfered[0] )
         {
            AV12Transfered = "" ;
            nV12Transfered = false ;
            nV12Transfered = true ;
         }
         else
         {
            AV12Transfered = A53Transfered ;
            nV12Transfered = false ;
         }
         if ( UVID_CONTR2_n54Status[0] )
         {
            AV13Status = "" ;
            nV13Status = false ;
            nV13Status = true ;
         }
         else
         {
            AV13Status = A54Status ;
            nV13Status = false ;
         }
         if ( UVID_CONTR2_n55CreateDate[0] )
         {
            AV14CreateDate = GXutil.resetTime( GXutil.nullDate() );
            nV14CreateDate = false ;
            nV14CreateDate = true ;
         }
         else
         {
            AV14CreateDate = A55CreateDate ;
            nV14CreateDate = false ;
         }
         if ( UVID_CONTR2_n56CreateTime[0] )
         {
            AV15CreateTime = (short)(0) ;
            nV15CreateTime = false ;
            nV15CreateTime = true ;
         }
         else
         {
            AV15CreateTime = A56CreateTime ;
            nV15CreateTime = false ;
         }
         if ( UVID_CONTR2_n57UpdateDate[0] )
         {
            AV16UpdateDate = GXutil.resetTime( GXutil.nullDate() );
            nV16UpdateDate = false ;
            nV16UpdateDate = true ;
         }
         else
         {
            AV16UpdateDate = A57UpdateDate ;
            nV16UpdateDate = false ;
         }
         if ( UVID_CONTR2_n58UpdateTime[0] )
         {
            AV17UpdateTime = (short)(0) ;
            nV17UpdateTime = false ;
            nV17UpdateTime = true ;
         }
         else
         {
            AV17UpdateTime = A58UpdateTime ;
            nV17UpdateTime = false ;
         }
         if ( UVID_CONTR2_n59DataSource[0] )
         {
            AV18DataSource = "" ;
            nV18DataSource = false ;
            nV18DataSource = true ;
         }
         else
         {
            AV18DataSource = A59DataSource ;
            nV18DataSource = false ;
         }
         if ( UVID_CONTR2_n60RequestStatus[0] )
         {
            AV19RequestStatus = "" ;
            nV19RequestStatus = false ;
            nV19RequestStatus = true ;
         }
         else
         {
            AV19RequestStatus = A60RequestStatus ;
            nV19RequestStatus = false ;
         }
         if ( UVID_CONTR2_n61Creator[0] )
         {
            AV20Creator = "" ;
            nV20Creator = false ;
            nV20Creator = true ;
         }
         else
         {
            AV20Creator = A61Creator ;
            nV20Creator = false ;
         }
         if ( UVID_CONTR2_n62Remark[0] )
         {
            AV21Remark = "" ;
            nV21Remark = false ;
            nV21Remark = true ;
         }
         else
         {
            AV21Remark = A62Remark ;
            nV21Remark = false ;
         }
         if ( UVID_CONTR2_n64U_ItemName[0] )
         {
            AV22U_ItemName = "" ;
            nV22U_ItemName = false ;
            nV22U_ItemName = true ;
         }
         else
         {
            AV22U_ItemName = A64U_ItemName ;
            nV22U_ItemName = false ;
         }
         if ( UVID_CONTR2_n66U_WhsDest[0] )
         {
            AV23U_WhsDest = "" ;
            nV23U_WhsDest = false ;
            nV23U_WhsDest = true ;
         }
         else
         {
            AV23U_WhsDest = A66U_WhsDest ;
            nV23U_WhsDest = false ;
         }
         if ( UVID_CONTR2_n67U_NumTras[0] )
         {
            AV24U_NumTras = "" ;
            nV24U_NumTras = false ;
            nV24U_NumTras = true ;
         }
         else
         {
            AV24U_NumTras = A67U_NumTras ;
            nV24U_NumTras = false ;
         }
         if ( UVID_CONTR2_n68U_NumCon[0] )
         {
            AV25U_NumCon = "" ;
            nV25U_NumCon = false ;
            nV25U_NumCon = true ;
         }
         else
         {
            AV25U_NumCon = A68U_NumCon ;
            nV25U_NumCon = false ;
         }
         if ( UVID_CONTR2_n69U_NumMusd[0] )
         {
            AV26U_NumMusd = "" ;
            nV26U_NumMusd = false ;
            nV26U_NumMusd = true ;
         }
         else
         {
            AV26U_NumMusd = A69U_NumMusd ;
            nV26U_NumMusd = false ;
         }
         if ( UVID_CONTR2_n79U_NoDoc[0] )
         {
            AV27U_NoDoc = 0 ;
         }
         else
         {
            AV27U_NoDoc = A79U_NoDoc ;
         }
         if ( UVID_CONTR2_n83U_Usuario[0] )
         {
            AV28U_Usuario = "" ;
            nV28U_Usuario = false ;
            nV28U_Usuario = true ;
         }
         else
         {
            AV28U_Usuario = A83U_Usuario ;
            nV28U_Usuario = false ;
         }
         if ( UVID_CONTR2_n84U_DocOrig[0] )
         {
            AV29U_DocOrig = 0 ;
            nV29U_DocOrig = false ;
            nV29U_DocOrig = true ;
         }
         else
         {
            AV29U_DocOrig = A84U_DocOrig ;
            nV29U_DocOrig = false ;
         }
         if ( UVID_CONTR2_n85UVID_CONTROLCHU_Estado[0] )
         {
            AV30UVID_CONTROLCHU_Estado = "" ;
            nV30UVID_CONTROLCHU_Estado = false ;
            nV30UVID_CONTROLCHU_Estado = true ;
         }
         else
         {
            AV30UVID_CONTROLCHU_Estado = A85UVID_CONTROLCHU_Estado ;
            nV30UVID_CONTROLCHU_Estado = false ;
         }
         if ( UVID_CONTR2_n87U_TipResul[0] )
         {
            AV31U_TipResul = "" ;
            nV31U_TipResul = false ;
            nV31U_TipResul = true ;
         }
         else
         {
            AV31U_TipResul = A87U_TipResul ;
            nV31U_TipResul = false ;
         }
         if ( UVID_CONTR2_n88U_ContraMu[0] )
         {
            AV32U_ContraMu = "" ;
            nV32U_ContraMu = false ;
            nV32U_ContraMu = true ;
         }
         else
         {
            AV32U_ContraMu = A88U_ContraMu ;
            nV32U_ContraMu = false ;
         }
         if ( UVID_CONTR2_n89U_CoMuSize[0] )
         {
            AV33U_CoMuSize = 0 ;
            nV33U_CoMuSize = false ;
            nV33U_CoMuSize = true ;
         }
         else
         {
            AV33U_CoMuSize = A89U_CoMuSize ;
            nV33U_CoMuSize = false ;
         }
         if ( UVID_CONTR2_n90U_MuestDes[0] )
         {
            AV34U_MuestDes = "" ;
            nV34U_MuestDes = false ;
            nV34U_MuestDes = true ;
         }
         else
         {
            AV34U_MuestDes = A90U_MuestDes ;
            nV34U_MuestDes = false ;
         }
         if ( UVID_CONTR2_n91U_MuDeSize[0] )
         {
            AV35U_MuDeSize = 0 ;
            nV35U_MuDeSize = false ;
            nV35U_MuDeSize = true ;
         }
         else
         {
            AV35U_MuDeSize = A91U_MuDeSize ;
            nV35U_MuDeSize = false ;
         }
         if ( UVID_CONTR2_n92U_CtaCalid[0] )
         {
            AV36U_CtaCalid = "" ;
            nV36U_CtaCalid = false ;
            nV36U_CtaCalid = true ;
         }
         else
         {
            AV36U_CtaCalid = A92U_CtaCalid ;
            nV36U_CtaCalid = false ;
         }
         if ( UVID_CONTR2_n95UVID_CONTROLCHU_Comment[0] )
         {
            AV37UVID_CONTROLCHU_Comment = "" ;
            nV37UVID_CONTROLCHU_Comment = false ;
            nV37UVID_CONTROLCHU_Comment = true ;
         }
         else
         {
            AV37UVID_CONTROLCHU_Comment = A95UVID_CONTROLCHU_Comment ;
            nV37UVID_CONTROLCHU_Comment = false ;
         }
         if ( UVID_CONTR2_n96U_AtrQ1[0] )
         {
            AV38U_AtrQ1 = 0 ;
            nV38U_AtrQ1 = false ;
            nV38U_AtrQ1 = true ;
         }
         else
         {
            AV38U_AtrQ1 = A96U_AtrQ1 ;
            nV38U_AtrQ1 = false ;
         }
         if ( UVID_CONTR2_n97U_AtrQ2[0] )
         {
            AV39U_AtrQ2 = 0 ;
            nV39U_AtrQ2 = false ;
            nV39U_AtrQ2 = true ;
         }
         else
         {
            AV39U_AtrQ2 = A97U_AtrQ2 ;
            nV39U_AtrQ2 = false ;
         }
         if ( UVID_CONTR2_n98U_AtrQ3[0] )
         {
            AV40U_AtrQ3 = 0 ;
            nV40U_AtrQ3 = false ;
            nV40U_AtrQ3 = true ;
         }
         else
         {
            AV40U_AtrQ3 = A98U_AtrQ3 ;
            nV40U_AtrQ3 = false ;
         }
         if ( UVID_CONTR2_n99U_AtrQ4[0] )
         {
            AV41U_AtrQ4 = 0 ;
            nV41U_AtrQ4 = false ;
            nV41U_AtrQ4 = true ;
         }
         else
         {
            AV41U_AtrQ4 = A99U_AtrQ4 ;
            nV41U_AtrQ4 = false ;
         }
         if ( UVID_CONTR2_n100U_AtrT1[0] )
         {
            AV42U_AtrT1 = "" ;
            nV42U_AtrT1 = false ;
            nV42U_AtrT1 = true ;
         }
         else
         {
            AV42U_AtrT1 = A100U_AtrT1 ;
            nV42U_AtrT1 = false ;
         }
         if ( UVID_CONTR2_n101U_AtrT2[0] )
         {
            AV43U_AtrT2 = "" ;
            nV43U_AtrT2 = false ;
            nV43U_AtrT2 = true ;
         }
         else
         {
            AV43U_AtrT2 = A101U_AtrT2 ;
            nV43U_AtrT2 = false ;
         }
         if ( UVID_CONTR2_n102U_AtrT3[0] )
         {
            AV44U_AtrT3 = "" ;
            nV44U_AtrT3 = false ;
            nV44U_AtrT3 = true ;
         }
         else
         {
            AV44U_AtrT3 = A102U_AtrT3 ;
            nV44U_AtrT3 = false ;
         }
         if ( UVID_CONTR2_n103U_AtrT4[0] )
         {
            AV45U_AtrT4 = "" ;
            nV45U_AtrT4 = false ;
            nV45U_AtrT4 = true ;
         }
         else
         {
            AV45U_AtrT4 = A103U_AtrT4 ;
            nV45U_AtrT4 = false ;
         }
         if ( UVID_CONTR2_n105U_NroOF[0] )
         {
            AV46U_NroOF = 0 ;
            nV46U_NroOF = false ;
            nV46U_NroOF = true ;
         }
         else
         {
            AV46U_NroOF = A105U_NroOF ;
            nV46U_NroOF = false ;
         }
         if ( UVID_CONTR2_n63U_ItemCode[0] )
         {
            AV47U_ItemCode = " " ;
         }
         else
         {
            AV47U_ItemCode = A63U_ItemCode ;
         }
         if ( UVID_CONTR2_n65U_WhsCode[0] )
         {
            AV48U_WhsCode = " " ;
         }
         else
         {
            AV48U_WhsCode = A65U_WhsCode ;
         }
         if ( UVID_CONTR2_n70U_NoLote[0] )
         {
            AV49U_NoLote = " " ;
         }
         else
         {
            AV49U_NoLote = A70U_NoLote ;
         }
         if ( UVID_CONTR2_n71U_CorrLote[0] )
         {
            AV50U_CorrLote = 0 ;
         }
         else
         {
            AV50U_CorrLote = A71U_CorrLote ;
         }
         if ( UVID_CONTR2_n72U_CorrAnal[0] )
         {
            AV51U_CorrAnal = 0 ;
         }
         else
         {
            AV51U_CorrAnal = A72U_CorrAnal ;
         }
         if ( UVID_CONTR2_n73U_Cantidad[0] )
         {
            AV52U_Cantidad = 0 ;
         }
         else
         {
            AV52U_Cantidad = A73U_Cantidad ;
         }
         if ( UVID_CONTR2_n74U_Bultos[0] )
         {
            AV53U_Bultos = 0 ;
         }
         else
         {
            AV53U_Bultos = A74U_Bultos ;
         }
         if ( UVID_CONTR2_n75U_BultosMu[0] )
         {
            AV54U_BultosMu = 0 ;
         }
         else
         {
            AV54U_BultosMu = A75U_BultosMu ;
         }
         if ( UVID_CONTR2_n76U_FecIngr[0] )
         {
            AV55U_FecIngr = localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ;
         }
         else
         {
            AV55U_FecIngr = A76U_FecIngr ;
         }
         if ( UVID_CONTR2_n77U_FecUltIn[0] )
         {
            AV56U_FecUltIn = localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ;
         }
         else
         {
            AV56U_FecUltIn = A77U_FecUltIn ;
         }
         if ( UVID_CONTR2_n78U_UM[0] )
         {
            AV57U_UM = " " ;
         }
         else
         {
            AV57U_UM = A78U_UM ;
         }
         if ( UVID_CONTR2_n80U_FecContr[0] )
         {
            AV58U_FecContr = localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ;
         }
         else
         {
            AV58U_FecContr = A80U_FecContr ;
         }
         if ( UVID_CONTR2_n81U_FecIni[0] )
         {
            AV59U_FecIni = localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ;
         }
         else
         {
            AV59U_FecIni = A81U_FecIni ;
         }
         if ( UVID_CONTR2_n82U_FecFin[0] )
         {
            AV60U_FecFin = localUtil.ymdhmsToT( (short)(1753), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ;
         }
         else
         {
            AV60U_FecFin = A82U_FecFin ;
         }
         if ( UVID_CONTR2_n86U_Traslado[0] )
         {
            AV61U_Traslado = " " ;
         }
         else
         {
            AV61U_Traslado = A86U_Traslado ;
         }
         if ( UVID_CONTR2_n93U_CCCode[0] )
         {
            AV62U_CCCode = " " ;
         }
         else
         {
            AV62U_CCCode = A93U_CCCode ;
         }
         if ( UVID_CONTR2_n94U_PrjCode[0] )
         {
            AV63U_PrjCode = " " ;
         }
         else
         {
            AV63U_PrjCode = A94U_PrjCode ;
         }
         if ( UVID_CONTR2_n104U_Reanalis[0] )
         {
            AV64U_Reanalis = " " ;
         }
         else
         {
            AV64U_Reanalis = A104U_Reanalis ;
         }
         /* Using cursor UVID_CONTR3 */
         pr_default.execute(1, new Object[] {new Integer(AV2UVID_CONTROLCHDocEntry), new Boolean(nV3DocNum), new Integer(AV3DocNum), new Boolean(nV4Period), new Integer(AV4Period), new Boolean(nV5Instance), new Short(AV5Instance), new Boolean(nV6Series), new Integer(AV6Series), new Boolean(nV7Handwrtten), AV7Handwrtten, new Boolean(nV8Canceled), AV8Canceled, new Boolean(nV9UVID_CONTROLCHObject), AV9UVID_CONTROLCHObject, new Boolean(nV10UVID_CONTROLCHLogInst), new Integer(AV10UVID_CONTROLCHLogInst), new Boolean(nV11UserSign), new Integer(AV11UserSign), new Boolean(nV12Transfered), AV12Transfered, new Boolean(nV13Status), AV13Status, new Boolean(nV14CreateDate), AV14CreateDate, new Boolean(nV15CreateTime), new Short(AV15CreateTime), new Boolean(nV16UpdateDate), AV16UpdateDate, new Boolean(nV17UpdateTime), new Short(AV17UpdateTime), new Boolean(nV18DataSource), AV18DataSource, new Boolean(nV19RequestStatus), AV19RequestStatus, new Boolean(nV20Creator), AV20Creator, new Boolean(nV21Remark), AV21Remark, new Boolean(nV22U_ItemName), AV22U_ItemName, new Boolean(nV23U_WhsDest), AV23U_WhsDest, new Boolean(nV24U_NumTras), AV24U_NumTras, new Boolean(nV25U_NumCon), AV25U_NumCon, new Boolean(nV26U_NumMusd), AV26U_NumMusd, new Integer(AV27U_NoDoc), new Boolean(nV28U_Usuario), AV28U_Usuario, new Boolean(nV29U_DocOrig), new Integer(AV29U_DocOrig), new Boolean(nV30UVID_CONTROLCHU_Estado), AV30UVID_CONTROLCHU_Estado, new Boolean(nV31U_TipResul), AV31U_TipResul, new Boolean(nV32U_ContraMu), AV32U_ContraMu, new Boolean(nV33U_CoMuSize), new Long(AV33U_CoMuSize), new Boolean(nV34U_MuestDes), AV34U_MuestDes, new Boolean(nV35U_MuDeSize), new Long(AV35U_MuDeSize), new Boolean(nV36U_CtaCalid), AV36U_CtaCalid, new Boolean(nV37UVID_CONTROLCHU_Comment), AV37UVID_CONTROLCHU_Comment, new Boolean(nV38U_AtrQ1), new Long(AV38U_AtrQ1), new Boolean(nV39U_AtrQ2), new Long(AV39U_AtrQ2), new Boolean(nV40U_AtrQ3), new Long(AV40U_AtrQ3), new Boolean(nV41U_AtrQ4), new Long(AV41U_AtrQ4), new Boolean(nV42U_AtrT1), AV42U_AtrT1, new Boolean(nV43U_AtrT2), AV43U_AtrT2, new Boolean(nV44U_AtrT3), AV44U_AtrT3, new Boolean(nV45U_AtrT4), AV45U_AtrT4, new Boolean(nV46U_NroOF), new Integer(AV46U_NroOF), AV47U_ItemCode, AV48U_WhsCode, AV49U_NoLote, new Integer(AV50U_CorrLote), new Integer(AV51U_CorrAnal), new Long(AV52U_Cantidad), new Integer(AV53U_Bultos), new Integer(AV54U_BultosMu), AV55U_FecIngr, AV56U_FecUltIn, AV57U_UM, AV58U_FecContr, AV59U_FecIni, AV60U_FecFin, AV61U_Traslado, AV62U_CCCode, AV63U_PrjCode, AV64U_Reanalis});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0003") ;
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
      UVID_CONTR2_A104U_Reanalis = new String[] {""} ;
      UVID_CONTR2_n104U_Reanalis = new boolean[] {false} ;
      UVID_CONTR2_A94U_PrjCode = new String[] {""} ;
      UVID_CONTR2_n94U_PrjCode = new boolean[] {false} ;
      UVID_CONTR2_A93U_CCCode = new String[] {""} ;
      UVID_CONTR2_n93U_CCCode = new boolean[] {false} ;
      UVID_CONTR2_A86U_Traslado = new String[] {""} ;
      UVID_CONTR2_n86U_Traslado = new boolean[] {false} ;
      UVID_CONTR2_A82U_FecFin = new java.util.Date[] {GXutil.nullDate()} ;
      UVID_CONTR2_n82U_FecFin = new boolean[] {false} ;
      UVID_CONTR2_A81U_FecIni = new java.util.Date[] {GXutil.nullDate()} ;
      UVID_CONTR2_n81U_FecIni = new boolean[] {false} ;
      UVID_CONTR2_A80U_FecContr = new java.util.Date[] {GXutil.nullDate()} ;
      UVID_CONTR2_n80U_FecContr = new boolean[] {false} ;
      UVID_CONTR2_A78U_UM = new String[] {""} ;
      UVID_CONTR2_n78U_UM = new boolean[] {false} ;
      UVID_CONTR2_A77U_FecUltIn = new java.util.Date[] {GXutil.nullDate()} ;
      UVID_CONTR2_n77U_FecUltIn = new boolean[] {false} ;
      UVID_CONTR2_A76U_FecIngr = new java.util.Date[] {GXutil.nullDate()} ;
      UVID_CONTR2_n76U_FecIngr = new boolean[] {false} ;
      UVID_CONTR2_A75U_BultosMu = new int[1] ;
      UVID_CONTR2_n75U_BultosMu = new boolean[] {false} ;
      UVID_CONTR2_A74U_Bultos = new int[1] ;
      UVID_CONTR2_n74U_Bultos = new boolean[] {false} ;
      UVID_CONTR2_A73U_Cantidad = new long[1] ;
      UVID_CONTR2_n73U_Cantidad = new boolean[] {false} ;
      UVID_CONTR2_A72U_CorrAnal = new int[1] ;
      UVID_CONTR2_n72U_CorrAnal = new boolean[] {false} ;
      UVID_CONTR2_A71U_CorrLote = new int[1] ;
      UVID_CONTR2_n71U_CorrLote = new boolean[] {false} ;
      UVID_CONTR2_A70U_NoLote = new String[] {""} ;
      UVID_CONTR2_n70U_NoLote = new boolean[] {false} ;
      UVID_CONTR2_A65U_WhsCode = new String[] {""} ;
      UVID_CONTR2_n65U_WhsCode = new boolean[] {false} ;
      UVID_CONTR2_A63U_ItemCode = new String[] {""} ;
      UVID_CONTR2_n63U_ItemCode = new boolean[] {false} ;
      UVID_CONTR2_A105U_NroOF = new int[1] ;
      UVID_CONTR2_n105U_NroOF = new boolean[] {false} ;
      UVID_CONTR2_A103U_AtrT4 = new String[] {""} ;
      UVID_CONTR2_n103U_AtrT4 = new boolean[] {false} ;
      UVID_CONTR2_A102U_AtrT3 = new String[] {""} ;
      UVID_CONTR2_n102U_AtrT3 = new boolean[] {false} ;
      UVID_CONTR2_A101U_AtrT2 = new String[] {""} ;
      UVID_CONTR2_n101U_AtrT2 = new boolean[] {false} ;
      UVID_CONTR2_A100U_AtrT1 = new String[] {""} ;
      UVID_CONTR2_n100U_AtrT1 = new boolean[] {false} ;
      UVID_CONTR2_A99U_AtrQ4 = new long[1] ;
      UVID_CONTR2_n99U_AtrQ4 = new boolean[] {false} ;
      UVID_CONTR2_A98U_AtrQ3 = new long[1] ;
      UVID_CONTR2_n98U_AtrQ3 = new boolean[] {false} ;
      UVID_CONTR2_A97U_AtrQ2 = new long[1] ;
      UVID_CONTR2_n97U_AtrQ2 = new boolean[] {false} ;
      UVID_CONTR2_A96U_AtrQ1 = new long[1] ;
      UVID_CONTR2_n96U_AtrQ1 = new boolean[] {false} ;
      UVID_CONTR2_A95UVID_CONTROLCHU_Comment = new String[] {""} ;
      UVID_CONTR2_n95UVID_CONTROLCHU_Comment = new boolean[] {false} ;
      UVID_CONTR2_A92U_CtaCalid = new String[] {""} ;
      UVID_CONTR2_n92U_CtaCalid = new boolean[] {false} ;
      UVID_CONTR2_A91U_MuDeSize = new long[1] ;
      UVID_CONTR2_n91U_MuDeSize = new boolean[] {false} ;
      UVID_CONTR2_A90U_MuestDes = new String[] {""} ;
      UVID_CONTR2_n90U_MuestDes = new boolean[] {false} ;
      UVID_CONTR2_A89U_CoMuSize = new long[1] ;
      UVID_CONTR2_n89U_CoMuSize = new boolean[] {false} ;
      UVID_CONTR2_A88U_ContraMu = new String[] {""} ;
      UVID_CONTR2_n88U_ContraMu = new boolean[] {false} ;
      UVID_CONTR2_A87U_TipResul = new String[] {""} ;
      UVID_CONTR2_n87U_TipResul = new boolean[] {false} ;
      UVID_CONTR2_A85UVID_CONTROLCHU_Estado = new String[] {""} ;
      UVID_CONTR2_n85UVID_CONTROLCHU_Estado = new boolean[] {false} ;
      UVID_CONTR2_A84U_DocOrig = new int[1] ;
      UVID_CONTR2_n84U_DocOrig = new boolean[] {false} ;
      UVID_CONTR2_A83U_Usuario = new String[] {""} ;
      UVID_CONTR2_n83U_Usuario = new boolean[] {false} ;
      UVID_CONTR2_A79U_NoDoc = new int[1] ;
      UVID_CONTR2_n79U_NoDoc = new boolean[] {false} ;
      UVID_CONTR2_A69U_NumMusd = new String[] {""} ;
      UVID_CONTR2_n69U_NumMusd = new boolean[] {false} ;
      UVID_CONTR2_A68U_NumCon = new String[] {""} ;
      UVID_CONTR2_n68U_NumCon = new boolean[] {false} ;
      UVID_CONTR2_A67U_NumTras = new String[] {""} ;
      UVID_CONTR2_n67U_NumTras = new boolean[] {false} ;
      UVID_CONTR2_A66U_WhsDest = new String[] {""} ;
      UVID_CONTR2_n66U_WhsDest = new boolean[] {false} ;
      UVID_CONTR2_A64U_ItemName = new String[] {""} ;
      UVID_CONTR2_n64U_ItemName = new boolean[] {false} ;
      UVID_CONTR2_A62Remark = new String[] {""} ;
      UVID_CONTR2_n62Remark = new boolean[] {false} ;
      UVID_CONTR2_A61Creator = new String[] {""} ;
      UVID_CONTR2_n61Creator = new boolean[] {false} ;
      UVID_CONTR2_A60RequestStatus = new String[] {""} ;
      UVID_CONTR2_n60RequestStatus = new boolean[] {false} ;
      UVID_CONTR2_A59DataSource = new String[] {""} ;
      UVID_CONTR2_n59DataSource = new boolean[] {false} ;
      UVID_CONTR2_A58UpdateTime = new short[1] ;
      UVID_CONTR2_n58UpdateTime = new boolean[] {false} ;
      UVID_CONTR2_A57UpdateDate = new java.util.Date[] {GXutil.nullDate()} ;
      UVID_CONTR2_n57UpdateDate = new boolean[] {false} ;
      UVID_CONTR2_A56CreateTime = new short[1] ;
      UVID_CONTR2_n56CreateTime = new boolean[] {false} ;
      UVID_CONTR2_A55CreateDate = new java.util.Date[] {GXutil.nullDate()} ;
      UVID_CONTR2_n55CreateDate = new boolean[] {false} ;
      UVID_CONTR2_A54Status = new String[] {""} ;
      UVID_CONTR2_n54Status = new boolean[] {false} ;
      UVID_CONTR2_A53Transfered = new String[] {""} ;
      UVID_CONTR2_n53Transfered = new boolean[] {false} ;
      UVID_CONTR2_A52UserSign = new int[1] ;
      UVID_CONTR2_n52UserSign = new boolean[] {false} ;
      UVID_CONTR2_A51UVID_CONTROLCHLogInst = new int[1] ;
      UVID_CONTR2_n51UVID_CONTROLCHLogInst = new boolean[] {false} ;
      UVID_CONTR2_A50UVID_CONTROLCHObject = new String[] {""} ;
      UVID_CONTR2_n50UVID_CONTROLCHObject = new boolean[] {false} ;
      UVID_CONTR2_A49Canceled = new String[] {""} ;
      UVID_CONTR2_n49Canceled = new boolean[] {false} ;
      UVID_CONTR2_A48Handwrtten = new String[] {""} ;
      UVID_CONTR2_n48Handwrtten = new boolean[] {false} ;
      UVID_CONTR2_A47Series = new int[1] ;
      UVID_CONTR2_n47Series = new boolean[] {false} ;
      UVID_CONTR2_A46Instance = new short[1] ;
      UVID_CONTR2_n46Instance = new boolean[] {false} ;
      UVID_CONTR2_A45Period = new int[1] ;
      UVID_CONTR2_n45Period = new boolean[] {false} ;
      UVID_CONTR2_A44DocNum = new int[1] ;
      UVID_CONTR2_n44DocNum = new boolean[] {false} ;
      UVID_CONTR2_A43UVID_CONTROLCHDocEntry = new int[1] ;
      A104U_Reanalis = "" ;
      A94U_PrjCode = "" ;
      A93U_CCCode = "" ;
      A86U_Traslado = "" ;
      A82U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      A81U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      A80U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      A78U_UM = "" ;
      A77U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      A76U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      A70U_NoLote = "" ;
      A65U_WhsCode = "" ;
      A63U_ItemCode = "" ;
      A103U_AtrT4 = "" ;
      A102U_AtrT3 = "" ;
      A101U_AtrT2 = "" ;
      A100U_AtrT1 = "" ;
      A95UVID_CONTROLCHU_Comment = "" ;
      A92U_CtaCalid = "" ;
      A90U_MuestDes = "" ;
      A88U_ContraMu = "" ;
      A87U_TipResul = "" ;
      A85UVID_CONTROLCHU_Estado = "" ;
      A83U_Usuario = "" ;
      A69U_NumMusd = "" ;
      A68U_NumCon = "" ;
      A67U_NumTras = "" ;
      A66U_WhsDest = "" ;
      A64U_ItemName = "" ;
      A62Remark = "" ;
      A61Creator = "" ;
      A60RequestStatus = "" ;
      A59DataSource = "" ;
      A57UpdateDate = GXutil.resetTime( GXutil.nullDate() );
      A55CreateDate = GXutil.resetTime( GXutil.nullDate() );
      A54Status = "" ;
      A53Transfered = "" ;
      A50UVID_CONTROLCHObject = "" ;
      A49Canceled = "" ;
      A48Handwrtten = "" ;
      AV7Handwrtten = "" ;
      AV8Canceled = "" ;
      AV9UVID_CONTROLCHObject = "" ;
      AV12Transfered = "" ;
      AV13Status = "" ;
      AV14CreateDate = GXutil.resetTime( GXutil.nullDate() );
      AV16UpdateDate = GXutil.resetTime( GXutil.nullDate() );
      AV18DataSource = "" ;
      AV19RequestStatus = "" ;
      AV20Creator = "" ;
      AV21Remark = "" ;
      AV22U_ItemName = "" ;
      AV23U_WhsDest = "" ;
      AV24U_NumTras = "" ;
      AV25U_NumCon = "" ;
      AV26U_NumMusd = "" ;
      AV28U_Usuario = "" ;
      AV30UVID_CONTROLCHU_Estado = "" ;
      AV31U_TipResul = "" ;
      AV32U_ContraMu = "" ;
      AV34U_MuestDes = "" ;
      AV36U_CtaCalid = "" ;
      AV37UVID_CONTROLCHU_Comment = "" ;
      AV42U_AtrT1 = "" ;
      AV43U_AtrT2 = "" ;
      AV44U_AtrT3 = "" ;
      AV45U_AtrT4 = "" ;
      AV47U_ItemCode = "" ;
      AV48U_WhsCode = "" ;
      AV49U_NoLote = "" ;
      AV55U_FecIngr = GXutil.resetTime( GXutil.nullDate() );
      AV56U_FecUltIn = GXutil.resetTime( GXutil.nullDate() );
      AV57U_UM = "" ;
      AV58U_FecContr = GXutil.resetTime( GXutil.nullDate() );
      AV59U_FecIni = GXutil.resetTime( GXutil.nullDate() );
      AV60U_FecFin = GXutil.resetTime( GXutil.nullDate() );
      AV61U_Traslado = "" ;
      AV62U_CCCode = "" ;
      AV63U_PrjCode = "" ;
      AV64U_Reanalis = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.uvid_controlchconversion__default(),
         new Object[] {
             new Object[] {
            UVID_CONTR2_A104U_Reanalis, UVID_CONTR2_n104U_Reanalis, UVID_CONTR2_A94U_PrjCode, UVID_CONTR2_n94U_PrjCode, UVID_CONTR2_A93U_CCCode, UVID_CONTR2_n93U_CCCode, UVID_CONTR2_A86U_Traslado, UVID_CONTR2_n86U_Traslado, UVID_CONTR2_A82U_FecFin, UVID_CONTR2_n82U_FecFin,
            UVID_CONTR2_A81U_FecIni, UVID_CONTR2_n81U_FecIni, UVID_CONTR2_A80U_FecContr, UVID_CONTR2_n80U_FecContr, UVID_CONTR2_A78U_UM, UVID_CONTR2_n78U_UM, UVID_CONTR2_A77U_FecUltIn, UVID_CONTR2_n77U_FecUltIn, UVID_CONTR2_A76U_FecIngr, UVID_CONTR2_n76U_FecIngr,
            UVID_CONTR2_A75U_BultosMu, UVID_CONTR2_n75U_BultosMu, UVID_CONTR2_A74U_Bultos, UVID_CONTR2_n74U_Bultos, UVID_CONTR2_A73U_Cantidad, UVID_CONTR2_n73U_Cantidad, UVID_CONTR2_A72U_CorrAnal, UVID_CONTR2_n72U_CorrAnal, UVID_CONTR2_A71U_CorrLote, UVID_CONTR2_n71U_CorrLote,
            UVID_CONTR2_A70U_NoLote, UVID_CONTR2_n70U_NoLote, UVID_CONTR2_A65U_WhsCode, UVID_CONTR2_n65U_WhsCode, UVID_CONTR2_A63U_ItemCode, UVID_CONTR2_n63U_ItemCode, UVID_CONTR2_A105U_NroOF, UVID_CONTR2_n105U_NroOF, UVID_CONTR2_A103U_AtrT4, UVID_CONTR2_n103U_AtrT4,
            UVID_CONTR2_A102U_AtrT3, UVID_CONTR2_n102U_AtrT3, UVID_CONTR2_A101U_AtrT2, UVID_CONTR2_n101U_AtrT2, UVID_CONTR2_A100U_AtrT1, UVID_CONTR2_n100U_AtrT1, UVID_CONTR2_A99U_AtrQ4, UVID_CONTR2_n99U_AtrQ4, UVID_CONTR2_A98U_AtrQ3, UVID_CONTR2_n98U_AtrQ3,
            UVID_CONTR2_A97U_AtrQ2, UVID_CONTR2_n97U_AtrQ2, UVID_CONTR2_A96U_AtrQ1, UVID_CONTR2_n96U_AtrQ1, UVID_CONTR2_A95UVID_CONTROLCHU_Comment, UVID_CONTR2_n95UVID_CONTROLCHU_Comment, UVID_CONTR2_A92U_CtaCalid, UVID_CONTR2_n92U_CtaCalid, UVID_CONTR2_A91U_MuDeSize, UVID_CONTR2_n91U_MuDeSize,
            UVID_CONTR2_A90U_MuestDes, UVID_CONTR2_n90U_MuestDes, UVID_CONTR2_A89U_CoMuSize, UVID_CONTR2_n89U_CoMuSize, UVID_CONTR2_A88U_ContraMu, UVID_CONTR2_n88U_ContraMu, UVID_CONTR2_A87U_TipResul, UVID_CONTR2_n87U_TipResul, UVID_CONTR2_A85UVID_CONTROLCHU_Estado, UVID_CONTR2_n85UVID_CONTROLCHU_Estado,
            UVID_CONTR2_A84U_DocOrig, UVID_CONTR2_n84U_DocOrig, UVID_CONTR2_A83U_Usuario, UVID_CONTR2_n83U_Usuario, UVID_CONTR2_A79U_NoDoc, UVID_CONTR2_n79U_NoDoc, UVID_CONTR2_A69U_NumMusd, UVID_CONTR2_n69U_NumMusd, UVID_CONTR2_A68U_NumCon, UVID_CONTR2_n68U_NumCon,
            UVID_CONTR2_A67U_NumTras, UVID_CONTR2_n67U_NumTras, UVID_CONTR2_A66U_WhsDest, UVID_CONTR2_n66U_WhsDest, UVID_CONTR2_A64U_ItemName, UVID_CONTR2_n64U_ItemName, UVID_CONTR2_A62Remark, UVID_CONTR2_n62Remark, UVID_CONTR2_A61Creator, UVID_CONTR2_n61Creator,
            UVID_CONTR2_A60RequestStatus, UVID_CONTR2_n60RequestStatus, UVID_CONTR2_A59DataSource, UVID_CONTR2_n59DataSource, UVID_CONTR2_A58UpdateTime, UVID_CONTR2_n58UpdateTime, UVID_CONTR2_A57UpdateDate, UVID_CONTR2_n57UpdateDate, UVID_CONTR2_A56CreateTime, UVID_CONTR2_n56CreateTime,
            UVID_CONTR2_A55CreateDate, UVID_CONTR2_n55CreateDate, UVID_CONTR2_A54Status, UVID_CONTR2_n54Status, UVID_CONTR2_A53Transfered, UVID_CONTR2_n53Transfered, UVID_CONTR2_A52UserSign, UVID_CONTR2_n52UserSign, UVID_CONTR2_A51UVID_CONTROLCHLogInst, UVID_CONTR2_n51UVID_CONTROLCHLogInst,
            UVID_CONTR2_A50UVID_CONTROLCHObject, UVID_CONTR2_n50UVID_CONTROLCHObject, UVID_CONTR2_A49Canceled, UVID_CONTR2_n49Canceled, UVID_CONTR2_A48Handwrtten, UVID_CONTR2_n48Handwrtten, UVID_CONTR2_A47Series, UVID_CONTR2_n47Series, UVID_CONTR2_A46Instance, UVID_CONTR2_n46Instance,
            UVID_CONTR2_A45Period, UVID_CONTR2_n45Period, UVID_CONTR2_A44DocNum, UVID_CONTR2_n44DocNum, UVID_CONTR2_A43UVID_CONTROLCHDocEntry
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A58UpdateTime ;
   private short A56CreateTime ;
   private short A46Instance ;
   private short AV5Instance ;
   private short AV15CreateTime ;
   private short AV17UpdateTime ;
   private short Gx_err ;
   private int A75U_BultosMu ;
   private int A74U_Bultos ;
   private int A72U_CorrAnal ;
   private int A71U_CorrLote ;
   private int A105U_NroOF ;
   private int A84U_DocOrig ;
   private int A79U_NoDoc ;
   private int A52UserSign ;
   private int A51UVID_CONTROLCHLogInst ;
   private int A47Series ;
   private int A45Period ;
   private int A44DocNum ;
   private int A43UVID_CONTROLCHDocEntry ;
   private int GIGXA0003 ;
   private int AV2UVID_CONTROLCHDocEntry ;
   private int AV3DocNum ;
   private int AV4Period ;
   private int AV6Series ;
   private int AV10UVID_CONTROLCHLogInst ;
   private int AV11UserSign ;
   private int AV27U_NoDoc ;
   private int AV29U_DocOrig ;
   private int AV46U_NroOF ;
   private int AV50U_CorrLote ;
   private int AV51U_CorrAnal ;
   private int AV53U_Bultos ;
   private int AV54U_BultosMu ;
   private long A73U_Cantidad ;
   private long A99U_AtrQ4 ;
   private long A98U_AtrQ3 ;
   private long A97U_AtrQ2 ;
   private long A96U_AtrQ1 ;
   private long A91U_MuDeSize ;
   private long A89U_CoMuSize ;
   private long AV33U_CoMuSize ;
   private long AV35U_MuDeSize ;
   private long AV38U_AtrQ1 ;
   private long AV39U_AtrQ2 ;
   private long AV40U_AtrQ3 ;
   private long AV41U_AtrQ4 ;
   private long AV52U_Cantidad ;
   private String scmdbuf ;
   private String A104U_Reanalis ;
   private String A86U_Traslado ;
   private String A90U_MuestDes ;
   private String A88U_ContraMu ;
   private String A85UVID_CONTROLCHU_Estado ;
   private String A60RequestStatus ;
   private String A59DataSource ;
   private String A54Status ;
   private String A53Transfered ;
   private String A49Canceled ;
   private String A48Handwrtten ;
   private String AV7Handwrtten ;
   private String AV8Canceled ;
   private String AV12Transfered ;
   private String AV13Status ;
   private String AV18DataSource ;
   private String AV19RequestStatus ;
   private String AV30UVID_CONTROLCHU_Estado ;
   private String AV32U_ContraMu ;
   private String AV34U_MuestDes ;
   private String AV61U_Traslado ;
   private String AV64U_Reanalis ;
   private String Gx_emsg ;
   private java.util.Date A82U_FecFin ;
   private java.util.Date A81U_FecIni ;
   private java.util.Date A80U_FecContr ;
   private java.util.Date A77U_FecUltIn ;
   private java.util.Date A76U_FecIngr ;
   private java.util.Date A57UpdateDate ;
   private java.util.Date A55CreateDate ;
   private java.util.Date AV14CreateDate ;
   private java.util.Date AV16UpdateDate ;
   private java.util.Date AV55U_FecIngr ;
   private java.util.Date AV56U_FecUltIn ;
   private java.util.Date AV58U_FecContr ;
   private java.util.Date AV59U_FecIni ;
   private java.util.Date AV60U_FecFin ;
   private boolean n104U_Reanalis ;
   private boolean n94U_PrjCode ;
   private boolean n93U_CCCode ;
   private boolean n86U_Traslado ;
   private boolean n82U_FecFin ;
   private boolean n81U_FecIni ;
   private boolean n80U_FecContr ;
   private boolean n78U_UM ;
   private boolean n77U_FecUltIn ;
   private boolean n76U_FecIngr ;
   private boolean n75U_BultosMu ;
   private boolean n74U_Bultos ;
   private boolean n73U_Cantidad ;
   private boolean n72U_CorrAnal ;
   private boolean n71U_CorrLote ;
   private boolean n70U_NoLote ;
   private boolean n65U_WhsCode ;
   private boolean n63U_ItemCode ;
   private boolean n105U_NroOF ;
   private boolean n103U_AtrT4 ;
   private boolean n102U_AtrT3 ;
   private boolean n101U_AtrT2 ;
   private boolean n100U_AtrT1 ;
   private boolean n99U_AtrQ4 ;
   private boolean n98U_AtrQ3 ;
   private boolean n97U_AtrQ2 ;
   private boolean n96U_AtrQ1 ;
   private boolean n95UVID_CONTROLCHU_Comment ;
   private boolean n92U_CtaCalid ;
   private boolean n91U_MuDeSize ;
   private boolean n90U_MuestDes ;
   private boolean n89U_CoMuSize ;
   private boolean n88U_ContraMu ;
   private boolean n87U_TipResul ;
   private boolean n85UVID_CONTROLCHU_Estado ;
   private boolean n84U_DocOrig ;
   private boolean n83U_Usuario ;
   private boolean n79U_NoDoc ;
   private boolean n69U_NumMusd ;
   private boolean n68U_NumCon ;
   private boolean n67U_NumTras ;
   private boolean n66U_WhsDest ;
   private boolean n64U_ItemName ;
   private boolean n62Remark ;
   private boolean n61Creator ;
   private boolean n60RequestStatus ;
   private boolean n59DataSource ;
   private boolean n58UpdateTime ;
   private boolean n57UpdateDate ;
   private boolean n56CreateTime ;
   private boolean n55CreateDate ;
   private boolean n54Status ;
   private boolean n53Transfered ;
   private boolean n52UserSign ;
   private boolean n51UVID_CONTROLCHLogInst ;
   private boolean n50UVID_CONTROLCHObject ;
   private boolean n49Canceled ;
   private boolean n48Handwrtten ;
   private boolean n47Series ;
   private boolean n46Instance ;
   private boolean n45Period ;
   private boolean n44DocNum ;
   private boolean nV3DocNum ;
   private boolean nV4Period ;
   private boolean nV5Instance ;
   private boolean nV6Series ;
   private boolean nV7Handwrtten ;
   private boolean nV8Canceled ;
   private boolean nV9UVID_CONTROLCHObject ;
   private boolean nV10UVID_CONTROLCHLogInst ;
   private boolean nV11UserSign ;
   private boolean nV12Transfered ;
   private boolean nV13Status ;
   private boolean nV14CreateDate ;
   private boolean nV15CreateTime ;
   private boolean nV16UpdateDate ;
   private boolean nV17UpdateTime ;
   private boolean nV18DataSource ;
   private boolean nV19RequestStatus ;
   private boolean nV20Creator ;
   private boolean nV21Remark ;
   private boolean nV22U_ItemName ;
   private boolean nV23U_WhsDest ;
   private boolean nV24U_NumTras ;
   private boolean nV25U_NumCon ;
   private boolean nV26U_NumMusd ;
   private boolean nV28U_Usuario ;
   private boolean nV29U_DocOrig ;
   private boolean nV30UVID_CONTROLCHU_Estado ;
   private boolean nV31U_TipResul ;
   private boolean nV32U_ContraMu ;
   private boolean nV33U_CoMuSize ;
   private boolean nV34U_MuestDes ;
   private boolean nV35U_MuDeSize ;
   private boolean nV36U_CtaCalid ;
   private boolean nV37UVID_CONTROLCHU_Comment ;
   private boolean nV38U_AtrQ1 ;
   private boolean nV39U_AtrQ2 ;
   private boolean nV40U_AtrQ3 ;
   private boolean nV41U_AtrQ4 ;
   private boolean nV42U_AtrT1 ;
   private boolean nV43U_AtrT2 ;
   private boolean nV44U_AtrT3 ;
   private boolean nV45U_AtrT4 ;
   private boolean nV46U_NroOF ;
   private String A62Remark ;
   private String AV21Remark ;
   private String A94U_PrjCode ;
   private String A93U_CCCode ;
   private String A78U_UM ;
   private String A70U_NoLote ;
   private String A65U_WhsCode ;
   private String A63U_ItemCode ;
   private String A103U_AtrT4 ;
   private String A102U_AtrT3 ;
   private String A101U_AtrT2 ;
   private String A100U_AtrT1 ;
   private String A95UVID_CONTROLCHU_Comment ;
   private String A92U_CtaCalid ;
   private String A87U_TipResul ;
   private String A83U_Usuario ;
   private String A69U_NumMusd ;
   private String A68U_NumCon ;
   private String A67U_NumTras ;
   private String A66U_WhsDest ;
   private String A64U_ItemName ;
   private String A61Creator ;
   private String A50UVID_CONTROLCHObject ;
   private String AV9UVID_CONTROLCHObject ;
   private String AV20Creator ;
   private String AV22U_ItemName ;
   private String AV23U_WhsDest ;
   private String AV24U_NumTras ;
   private String AV25U_NumCon ;
   private String AV26U_NumMusd ;
   private String AV28U_Usuario ;
   private String AV31U_TipResul ;
   private String AV36U_CtaCalid ;
   private String AV37UVID_CONTROLCHU_Comment ;
   private String AV42U_AtrT1 ;
   private String AV43U_AtrT2 ;
   private String AV44U_AtrT3 ;
   private String AV45U_AtrT4 ;
   private String AV47U_ItemCode ;
   private String AV48U_WhsCode ;
   private String AV49U_NoLote ;
   private String AV57U_UM ;
   private String AV62U_CCCode ;
   private String AV63U_PrjCode ;
   private IDataStoreProvider pr_default ;
   private String[] UVID_CONTR2_A104U_Reanalis ;
   private boolean[] UVID_CONTR2_n104U_Reanalis ;
   private String[] UVID_CONTR2_A94U_PrjCode ;
   private boolean[] UVID_CONTR2_n94U_PrjCode ;
   private String[] UVID_CONTR2_A93U_CCCode ;
   private boolean[] UVID_CONTR2_n93U_CCCode ;
   private String[] UVID_CONTR2_A86U_Traslado ;
   private boolean[] UVID_CONTR2_n86U_Traslado ;
   private java.util.Date[] UVID_CONTR2_A82U_FecFin ;
   private boolean[] UVID_CONTR2_n82U_FecFin ;
   private java.util.Date[] UVID_CONTR2_A81U_FecIni ;
   private boolean[] UVID_CONTR2_n81U_FecIni ;
   private java.util.Date[] UVID_CONTR2_A80U_FecContr ;
   private boolean[] UVID_CONTR2_n80U_FecContr ;
   private String[] UVID_CONTR2_A78U_UM ;
   private boolean[] UVID_CONTR2_n78U_UM ;
   private java.util.Date[] UVID_CONTR2_A77U_FecUltIn ;
   private boolean[] UVID_CONTR2_n77U_FecUltIn ;
   private java.util.Date[] UVID_CONTR2_A76U_FecIngr ;
   private boolean[] UVID_CONTR2_n76U_FecIngr ;
   private int[] UVID_CONTR2_A75U_BultosMu ;
   private boolean[] UVID_CONTR2_n75U_BultosMu ;
   private int[] UVID_CONTR2_A74U_Bultos ;
   private boolean[] UVID_CONTR2_n74U_Bultos ;
   private long[] UVID_CONTR2_A73U_Cantidad ;
   private boolean[] UVID_CONTR2_n73U_Cantidad ;
   private int[] UVID_CONTR2_A72U_CorrAnal ;
   private boolean[] UVID_CONTR2_n72U_CorrAnal ;
   private int[] UVID_CONTR2_A71U_CorrLote ;
   private boolean[] UVID_CONTR2_n71U_CorrLote ;
   private String[] UVID_CONTR2_A70U_NoLote ;
   private boolean[] UVID_CONTR2_n70U_NoLote ;
   private String[] UVID_CONTR2_A65U_WhsCode ;
   private boolean[] UVID_CONTR2_n65U_WhsCode ;
   private String[] UVID_CONTR2_A63U_ItemCode ;
   private boolean[] UVID_CONTR2_n63U_ItemCode ;
   private int[] UVID_CONTR2_A105U_NroOF ;
   private boolean[] UVID_CONTR2_n105U_NroOF ;
   private String[] UVID_CONTR2_A103U_AtrT4 ;
   private boolean[] UVID_CONTR2_n103U_AtrT4 ;
   private String[] UVID_CONTR2_A102U_AtrT3 ;
   private boolean[] UVID_CONTR2_n102U_AtrT3 ;
   private String[] UVID_CONTR2_A101U_AtrT2 ;
   private boolean[] UVID_CONTR2_n101U_AtrT2 ;
   private String[] UVID_CONTR2_A100U_AtrT1 ;
   private boolean[] UVID_CONTR2_n100U_AtrT1 ;
   private long[] UVID_CONTR2_A99U_AtrQ4 ;
   private boolean[] UVID_CONTR2_n99U_AtrQ4 ;
   private long[] UVID_CONTR2_A98U_AtrQ3 ;
   private boolean[] UVID_CONTR2_n98U_AtrQ3 ;
   private long[] UVID_CONTR2_A97U_AtrQ2 ;
   private boolean[] UVID_CONTR2_n97U_AtrQ2 ;
   private long[] UVID_CONTR2_A96U_AtrQ1 ;
   private boolean[] UVID_CONTR2_n96U_AtrQ1 ;
   private String[] UVID_CONTR2_A95UVID_CONTROLCHU_Comment ;
   private boolean[] UVID_CONTR2_n95UVID_CONTROLCHU_Comment ;
   private String[] UVID_CONTR2_A92U_CtaCalid ;
   private boolean[] UVID_CONTR2_n92U_CtaCalid ;
   private long[] UVID_CONTR2_A91U_MuDeSize ;
   private boolean[] UVID_CONTR2_n91U_MuDeSize ;
   private String[] UVID_CONTR2_A90U_MuestDes ;
   private boolean[] UVID_CONTR2_n90U_MuestDes ;
   private long[] UVID_CONTR2_A89U_CoMuSize ;
   private boolean[] UVID_CONTR2_n89U_CoMuSize ;
   private String[] UVID_CONTR2_A88U_ContraMu ;
   private boolean[] UVID_CONTR2_n88U_ContraMu ;
   private String[] UVID_CONTR2_A87U_TipResul ;
   private boolean[] UVID_CONTR2_n87U_TipResul ;
   private String[] UVID_CONTR2_A85UVID_CONTROLCHU_Estado ;
   private boolean[] UVID_CONTR2_n85UVID_CONTROLCHU_Estado ;
   private int[] UVID_CONTR2_A84U_DocOrig ;
   private boolean[] UVID_CONTR2_n84U_DocOrig ;
   private String[] UVID_CONTR2_A83U_Usuario ;
   private boolean[] UVID_CONTR2_n83U_Usuario ;
   private int[] UVID_CONTR2_A79U_NoDoc ;
   private boolean[] UVID_CONTR2_n79U_NoDoc ;
   private String[] UVID_CONTR2_A69U_NumMusd ;
   private boolean[] UVID_CONTR2_n69U_NumMusd ;
   private String[] UVID_CONTR2_A68U_NumCon ;
   private boolean[] UVID_CONTR2_n68U_NumCon ;
   private String[] UVID_CONTR2_A67U_NumTras ;
   private boolean[] UVID_CONTR2_n67U_NumTras ;
   private String[] UVID_CONTR2_A66U_WhsDest ;
   private boolean[] UVID_CONTR2_n66U_WhsDest ;
   private String[] UVID_CONTR2_A64U_ItemName ;
   private boolean[] UVID_CONTR2_n64U_ItemName ;
   private String[] UVID_CONTR2_A62Remark ;
   private boolean[] UVID_CONTR2_n62Remark ;
   private String[] UVID_CONTR2_A61Creator ;
   private boolean[] UVID_CONTR2_n61Creator ;
   private String[] UVID_CONTR2_A60RequestStatus ;
   private boolean[] UVID_CONTR2_n60RequestStatus ;
   private String[] UVID_CONTR2_A59DataSource ;
   private boolean[] UVID_CONTR2_n59DataSource ;
   private short[] UVID_CONTR2_A58UpdateTime ;
   private boolean[] UVID_CONTR2_n58UpdateTime ;
   private java.util.Date[] UVID_CONTR2_A57UpdateDate ;
   private boolean[] UVID_CONTR2_n57UpdateDate ;
   private short[] UVID_CONTR2_A56CreateTime ;
   private boolean[] UVID_CONTR2_n56CreateTime ;
   private java.util.Date[] UVID_CONTR2_A55CreateDate ;
   private boolean[] UVID_CONTR2_n55CreateDate ;
   private String[] UVID_CONTR2_A54Status ;
   private boolean[] UVID_CONTR2_n54Status ;
   private String[] UVID_CONTR2_A53Transfered ;
   private boolean[] UVID_CONTR2_n53Transfered ;
   private int[] UVID_CONTR2_A52UserSign ;
   private boolean[] UVID_CONTR2_n52UserSign ;
   private int[] UVID_CONTR2_A51UVID_CONTROLCHLogInst ;
   private boolean[] UVID_CONTR2_n51UVID_CONTROLCHLogInst ;
   private String[] UVID_CONTR2_A50UVID_CONTROLCHObject ;
   private boolean[] UVID_CONTR2_n50UVID_CONTROLCHObject ;
   private String[] UVID_CONTR2_A49Canceled ;
   private boolean[] UVID_CONTR2_n49Canceled ;
   private String[] UVID_CONTR2_A48Handwrtten ;
   private boolean[] UVID_CONTR2_n48Handwrtten ;
   private int[] UVID_CONTR2_A47Series ;
   private boolean[] UVID_CONTR2_n47Series ;
   private short[] UVID_CONTR2_A46Instance ;
   private boolean[] UVID_CONTR2_n46Instance ;
   private int[] UVID_CONTR2_A45Period ;
   private boolean[] UVID_CONTR2_n45Period ;
   private int[] UVID_CONTR2_A44DocNum ;
   private boolean[] UVID_CONTR2_n44DocNum ;
   private int[] UVID_CONTR2_A43UVID_CONTROLCHDocEntry ;
}

final  class uvid_controlchconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("UVID_CONTR2", "SELECT T2.[U_Reanalis], T2.[U_PrjCode], T2.[U_CCCode], T2.[U_Traslado], T2.[U_FecFin], T2.[U_FecIni], T2.[U_FecContr], T2.[U_UM], T2.[U_FecUltIn], T2.[U_FecIngr], T2.[U_BultosMu], T2.[U_Bultos], T2.[U_Cantidad], T2.[U_CorrAnal], T2.[U_CorrLote], T2.[U_NoLote], T2.[U_WhsCode], T2.[U_ItemCode], T1.[U_NroOF], T1.[U_AtrT4], T1.[U_AtrT3], T1.[U_AtrT2], T1.[U_AtrT1], T1.[U_AtrQ4], T1.[U_AtrQ3], T1.[U_AtrQ2], T1.[U_AtrQ1], T1.[U_Comment], T1.[U_CtaCalid], T1.[U_MuDeSize], T1.[U_MuestDes], T1.[U_CoMuSize], T1.[U_ContraMu], T1.[U_TipResul], T1.[U_Estado], T1.[U_DocOrig], T1.[U_Usuario], T1.[U_NoDoc], T1.[U_NumMusd], T1.[U_NumCon], T1.[U_NumTras], T1.[U_WhsDest], T1.[U_ItemName], T1.[Remark], T1.[Creator], T1.[RequestStatus], T1.[DataSource], T1.[UpdateTime], T1.[UpdateDate], T1.[CreateTime], T1.[CreateDate], T1.[Status], T1.[Transfered], T1.[UserSign], T1.[LogInst], T1.[Object], T1.[Canceled], T1.[Handwrtten], T1.[Series], T1.[Instance], T1.[Period], T1.[DocNum], T1.[DocEntry] FROM (dbo.[@VID_CONTROLCH] T1 LEFT JOIN [RegistroInspeccionH] T2 ON T2.[U_NoDoc] = T1.[U_NoDoc]) ORDER BY T1.[DocEntry] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("UVID_CONTR3", "INSERT INTO [GXA0003]([UVID_CONTROLCHDocEntry], [DocNum], [Period], [Instance], [Series], [Handwrtten], [Canceled], [UVID_CONTROLCHObject], [UVID_CONTROLCHLogInst], [UserSign], [Transfered], [Status], [CreateDate], [CreateTime], [UpdateDate], [UpdateTime], [DataSource], [RequestStatus], [Creator], [Remark], [U_ItemName], [U_WhsDest], [U_NumTras], [U_NumCon], [U_NumMusd], [U_NoDoc], [U_Usuario], [U_DocOrig], [UVID_CONTROLCHU_Estado], [U_TipResul], [U_ContraMu], [U_CoMuSize], [U_MuestDes], [U_MuDeSize], [U_CtaCalid], [UVID_CONTROLCHU_Comment], [U_AtrQ1], [U_AtrQ2], [U_AtrQ3], [U_AtrQ4], [U_AtrT1], [U_AtrT2], [U_AtrT3], [U_AtrT4], [U_NroOF], [U_ItemCode], [U_WhsCode], [U_NoLote], [U_CorrLote], [U_CorrAnal], [U_Cantidad], [U_Bultos], [U_BultosMu], [U_FecIngr], [U_FecUltIn], [U_UM], [U_FecContr], [U_FecIni], [U_FecFin], [U_Traslado], [U_CCCode], [U_PrjCode], [U_Reanalis]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((String[]) buf[6])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(14) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(19) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((long[]) buf[46])[0] = rslt.getLong(24) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((long[]) buf[48])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((long[]) buf[50])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((long[]) buf[52])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((long[]) buf[58])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(31, 1) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((long[]) buf[62])[0] = rslt.getLong(32) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(33, 1) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(35, 1) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(36) ;
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((int[]) buf[74])[0] = rslt.getInt(38) ;
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getVarchar(43) ;
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getLongVarchar(44) ;
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(46, 1) ;
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(47, 1) ;
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((short[]) buf[94])[0] = rslt.getShort(48) ;
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[96])[0] = rslt.getGXDateTime(49) ;
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((short[]) buf[98])[0] = rslt.getShort(50) ;
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[100])[0] = rslt.getGXDateTime(51) ;
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(52, 1) ;
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(53, 1) ;
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((int[]) buf[106])[0] = rslt.getInt(54) ;
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((int[]) buf[108])[0] = rslt.getInt(55) ;
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(56) ;
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(57, 1) ;
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(58, 1) ;
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((int[]) buf[116])[0] = rslt.getInt(59) ;
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((short[]) buf[118])[0] = rslt.getShort(60) ;
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((int[]) buf[120])[0] = rslt.getInt(61) ;
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((int[]) buf[122])[0] = rslt.getInt(62) ;
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((int[]) buf[124])[0] = rslt.getInt(63) ;
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[24], false);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[28], false);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 8);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(20, (String)parms[38]);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 100);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[42], 8);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[44], 8);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[46], 8);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[48], 8);
               }
               stmt.setInt(26, ((Number) parms[49]).intValue());
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[51], 20);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[53]).intValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[57], 8);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[59], 1);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(32, ((Number) parms[61]).longValue(), 0);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(34, ((Number) parms[65]).longValue(), 0);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[67], 20);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[69], 254);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(37, ((Number) parms[71]).longValue(), 0);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(38, ((Number) parms[73]).longValue(), 0);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(39, ((Number) parms[75]).longValue(), 0);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(40, ((Number) parms[77]).longValue(), 0);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[79], 254);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[81], 254);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[83], 254);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[85], 254);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(45, ((Number) parms[87]).intValue());
               }
               stmt.setVarchar(46, (String)parms[88], 20, false);
               stmt.setVarchar(47, (String)parms[89], 8, false);
               stmt.setVarchar(48, (String)parms[90], 32, false);
               stmt.setInt(49, ((Number) parms[91]).intValue());
               stmt.setInt(50, ((Number) parms[92]).intValue());
               stmt.setBigDecimal(51, ((Number) parms[93]).longValue(), 0);
               stmt.setInt(52, ((Number) parms[94]).intValue());
               stmt.setInt(53, ((Number) parms[95]).intValue());
               stmt.setDateTime(54, (java.util.Date)parms[96], false);
               stmt.setDateTime(55, (java.util.Date)parms[97], false);
               stmt.setVarchar(56, (String)parms[98], 15, false);
               stmt.setDateTime(57, (java.util.Date)parms[99], false);
               stmt.setDateTime(58, (java.util.Date)parms[100], false);
               stmt.setDateTime(59, (java.util.Date)parms[101], false);
               stmt.setString(60, (String)parms[102], 1);
               stmt.setVarchar(61, (String)parms[103], 8, false);
               stmt.setVarchar(62, (String)parms[104], 8, false);
               stmt.setString(63, (String)parms[105], 1);
               return;
      }
   }

}

