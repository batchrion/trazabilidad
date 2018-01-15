/*
               File: reorg
        Description: Table Manager
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 8, 2018 11:48:48.55
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.util.*;

public final  class reorg extends GXProcedure
{
   public reorg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reorg.class ), "" );
   }

   public reorg( int remoteHandle ,
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
      if ( previousCheck() )
      {
         executeReorganization( ) ;
      }
   }

   private void FirstActions( )
   {
      /* Load data into tables. */
   }

   public void ReorganizeUVID_CONTROLCD1( ) throws SQLException
   {
      String cmdBufferCreate = "" ;
      String cmdBuffer ;
      /* Indices for table UVID_CONTROLCD1 */
      try
      {
         cmdBufferCreate = " CREATE TABLE [GXA0008] ([UVID_CONTROLCDDocEntry]  int NOT NULL , [LineId]  int NOT ";
         cmdBufferCreate += "  NULL , [VisOrder]  int NOT NULL , [UVID_CONTROLCDObject]  varchar(20) NOT NULL , ";
         cmdBufferCreate += "  [UVID_CONTROLCDLogInst]  int NOT NULL , [U_CodAtr]  varchar(20) NOT NULL , [U_NameAtr] ";
         cmdBufferCreate += "   varchar(50) NOT NULL , [U_Cualitat]  char(1) NOT NULL , [U_Critico]  char(1) NOT ";
         cmdBufferCreate += "  NULL , [U_TipoMues]  varchar(8) NOT NULL , [U_Rango]  varchar(20) NOT NULL , [U_TipoDef] ";
         cmdBufferCreate += "   char(1) NOT NULL , [U_AQL]  varchar(8) NOT NULL , [U_TiempoDu]  decimal( 18) NOT ";
         cmdBufferCreate += "  NULL , [U_StandAtr]  decimal( 18) NOT NULL , [U_Minimo]  decimal( 18) NOT NULL , ";
         cmdBufferCreate += "  [U_Maximo]  decimal( 18) NOT NULL , [U_Medicion]  decimal( 18) NOT NULL , [U_CodEquip] ";
         cmdBufferCreate += "   varchar(8) NOT NULL , [UVID_CONTROLCDU_Comment]  varchar(254) NOT NULL , [U_Comment2] ";
         cmdBufferCreate += "   varchar(254) NOT NULL , [UVID_CONTROLCDU_Estado]  char(1) NOT NULL )  ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            DropTableConstraints( "[GXA0008]") ;
            cmdBuffer = " DROP TABLE [GXA0008] ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               DropTableConstraints( "[GXA0008]") ;
               cmdBuffer = " DROP VIEW [GXA0008] ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  DropTableConstraints( "[GXA0008]") ;
                  cmdBuffer = " DROP FUNCTION [GXA0008] ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "reorg");
      new com.wms.uvid_controlcd1conversion(remoteHandle, context).execute( ) ;
      DBConnectionManager.getInstance(context).dropAllCursors(remoteHandle);
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "reorg");
      try
      {
         try
         {
            DropTableConstraints( "[UVID_CONTROLCD1]") ;
            cmdBuffer = " DROP TABLE [UVID_CONTROLCD1] ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               DropTableConstraints( "[UVID_CONTROLCD1]") ;
               cmdBuffer = " DROP VIEW [UVID_CONTROLCD1] ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  DropTableConstraints( "[UVID_CONTROLCD1]") ;
                  cmdBuffer = " DROP FUNCTION [UVID_CONTROLCD1] ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
      }
      catch ( Exception ex )
      {
      }
      cmdBuffer = " {CALL sp_rename('[GXA0008]', 'UVID_CONTROLCD1')} ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " ALTER TABLE [UVID_CONTROLCD1] ADD PRIMARY KEY([UVID_CONTROLCDDocEntry], [LineId]) ";
      cmdBuffer += "  ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      try
      {
         DropTableConstraints( "[UVID_CONTROLCD]") ;
         cmdBuffer = " DROP TABLE [UVID_CONTROLCD] ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException sqlex1)
      {
         try
         {
            DropTableConstraints( "[UVID_CONTROLCD]") ;
            cmdBuffer = " DROP VIEW [UVID_CONTROLCD] ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex2)
         {
            try
            {
               DropTableConstraints( "[UVID_CONTROLCD]") ;
               cmdBuffer = " DROP FUNCTION [UVID_CONTROLCD] ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex3)
            {
            }
         }
      }
   }

   private void tablesCount( )
   {
   }

   private boolean previousCheck( )
   {
      if ( ! GXReorganization.isResumeMode( ) )
      {
         if ( GXutil.dbmsVersion( context, remoteHandle, "DEFAULT") < 10 )
         {
            GXReorganization.setCheckError ( localUtil.getMessages().getMessage("GXM_bad_DBMS_version", new Object[] {"2012"}) ) ;
            return false ;
         }
      }
      if ( ! GXReorganization.mustRunCheck( ) )
      {
         return true ;
      }
      if ( GXutil.isSQLSERVER2005( context, remoteHandle, "DEFAULT") )
      {
         /* Using cursor P00012 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            sSchemaVar = P00012_AsSchemaVar[0] ;
            nsSchemaVar = P00012_nsSchemaVar[0] ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P00023 */
         pr_default.execute(1);
         while ( (pr_default.getStatus(1) != 101) )
         {
            sSchemaVar = P00023_AsSchemaVar[0] ;
            nsSchemaVar = P00023_nsSchemaVar[0] ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      return true ;
   }

   private boolean ColumnExist( String sTableName ,
                                String sMySchemaName ,
                                String sMyColumnName )
   {
      boolean result ;
      result = false ;
      /* Using cursor P00034 */
      pr_default.execute(2, new Object[] {sTableName, sMySchemaName, sMyColumnName});
      while ( (pr_default.getStatus(2) != 101) )
      {
         tablename = P00034_Atablename[0] ;
         ntablename = P00034_ntablename[0] ;
         schemaname = P00034_Aschemaname[0] ;
         nschemaname = P00034_nschemaname[0] ;
         columnname = P00034_Acolumnname[0] ;
         ncolumnname = P00034_ncolumnname[0] ;
         result = true ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      return result ;
   }

   private void executeOnlyTablesReorganization( )
   {
      callSubmit( "ReorganizeUVID_CONTROLCD1" ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"UVID_CONTROLCD1",""}) ,  1 , new Object[]{ });
   }

   private void executeOnlyRisReorganization( )
   {
   }

   private void executeTablesReorganization( )
   {
      executeOnlyTablesReorganization( ) ;
      executeOnlyRisReorganization( ) ;
      ReorgSubmitThreadPool.startProcess();
   }

   private void setPrecedence( )
   {
      setPrecedencetables( ) ;
      setPrecedenceris( ) ;
   }

   private void setPrecedencetables( )
   {
      GXReorganization.addMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"UVID_CONTROLCD1",""}) );
      ReorgSubmitThreadPool.addBlock( "ReorganizeUVID_CONTROLCD1" );
   }

   private void setPrecedenceris( )
   {
   }

   private void executeReorganization( )
   {
      if ( ErrCode == 0 )
      {
         tablesCount( ) ;
         if ( ! GXReorganization.getRecordCount( ) )
         {
            FirstActions( ) ;
            setPrecedence( ) ;
            executeTablesReorganization( ) ;
         }
      }
   }

   public synchronized void DropTableConstraints( String sTableName ) throws SQLException
   {
      String cmdBuffer ;
      /* Using cursor P00045 */
      pr_default.execute(3, new Object[] {sTableName});
      while ( (pr_default.getStatus(3) != 101) )
      {
         constid = P00045_Aconstid[0] ;
         nconstid = P00045_nconstid[0] ;
         fkeyid = P00045_Afkeyid[0] ;
         nfkeyid = P00045_nfkeyid[0] ;
         rkeyid = P00045_Arkeyid[0] ;
         nrkeyid = P00045_nrkeyid[0] ;
         cmdBuffer = "ALTER TABLE " + "[" + fkeyid + "] DROP CONSTRAINT " + constid ;
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void UtilsCleanup( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void submitReorg( int submitId ,
                            Object [] submitParms ) throws SQLException
   {
      UserInformation submitUI = Application.getConnectionManager().createUserInformation(Namespace.getNamespace(context.getNAME_SPACE()));
      switch ( submitId )
      {
            case 1 :
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"UVID_CONTROLCD1",""})+" STARTED" );
               ReorganizeUVID_CONTROLCD1( ) ;
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"UVID_CONTROLCD1",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
      }
   }

   public void initialize( )
   {
      sSchemaVar = "" ;
      nsSchemaVar = false ;
      scmdbuf = "" ;
      P00012_AsSchemaVar = new String[] {""} ;
      P00012_nsSchemaVar = new boolean[] {false} ;
      P00023_AsSchemaVar = new String[] {""} ;
      P00023_nsSchemaVar = new boolean[] {false} ;
      sTableName = "" ;
      sMySchemaName = "" ;
      sMyColumnName = "" ;
      tablename = "" ;
      ntablename = false ;
      schemaname = "" ;
      nschemaname = false ;
      columnname = "" ;
      ncolumnname = false ;
      P00034_Atablename = new String[] {""} ;
      P00034_ntablename = new boolean[] {false} ;
      P00034_Aschemaname = new String[] {""} ;
      P00034_nschemaname = new boolean[] {false} ;
      P00034_Acolumnname = new String[] {""} ;
      P00034_ncolumnname = new boolean[] {false} ;
      constid = "" ;
      nconstid = false ;
      fkeyid = "" ;
      nfkeyid = false ;
      P00045_Aconstid = new String[] {""} ;
      P00045_nconstid = new boolean[] {false} ;
      P00045_Afkeyid = new String[] {""} ;
      P00045_nfkeyid = new boolean[] {false} ;
      P00045_Arkeyid = new int[1] ;
      P00045_nrkeyid = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.wms.reorg__default(),
         new Object[] {
             new Object[] {
            P00012_AsSchemaVar
            }
            , new Object[] {
            P00023_AsSchemaVar
            }
            , new Object[] {
            P00034_Atablename, P00034_Aschemaname, P00034_Acolumnname
            }
            , new Object[] {
            P00045_Aconstid, P00045_Afkeyid, P00045_Arkeyid
            }
         }
      );
      /* GeneXus formulas. */
   }

   protected short ErrCode ;
   protected int rkeyid ;
   protected String sSchemaVar ;
   protected String scmdbuf ;
   protected String sTableName ;
   protected String sMySchemaName ;
   protected String sMyColumnName ;
   protected boolean nsSchemaVar ;
   protected boolean ntablename ;
   protected boolean nschemaname ;
   protected boolean ncolumnname ;
   protected boolean nconstid ;
   protected boolean nfkeyid ;
   protected boolean nrkeyid ;
   protected String tablename ;
   protected String schemaname ;
   protected String columnname ;
   protected String constid ;
   protected String fkeyid ;
   protected IDataStoreProvider pr_default ;
   protected String[] P00012_AsSchemaVar ;
   protected boolean[] P00012_nsSchemaVar ;
   protected String[] P00023_AsSchemaVar ;
   protected boolean[] P00023_nsSchemaVar ;
   protected String[] P00034_Atablename ;
   protected boolean[] P00034_ntablename ;
   protected String[] P00034_Aschemaname ;
   protected boolean[] P00034_nschemaname ;
   protected String[] P00034_Acolumnname ;
   protected boolean[] P00034_ncolumnname ;
   protected String[] P00045_Aconstid ;
   protected boolean[] P00045_nconstid ;
   protected String[] P00045_Afkeyid ;
   protected boolean[] P00045_nfkeyid ;
   protected int[] P00045_Arkeyid ;
   protected boolean[] P00045_nrkeyid ;
}

final  class reorg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00012", "SELECT SCHEMA_NAME() ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00023", "SELECT USER_NAME() ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00034", "SELECT [TABLE_NAME], [TABLE_SCHEMA], [COLUMN_NAME] FROM INFORMATION_SCHEMA.COLUMNS WHERE ([TABLE_NAME] = ?) AND ([TABLE_SCHEMA] = ?) AND ([COLUMN_NAME] = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00045", "SELECT OBJECT_NAME(object_id), OBJECT_NAME(parent_object_id), [referenced_object_id] FROM sys.foreign_keys WHERE [referenced_object_id] = OBJECT_ID(RTRIM(LTRIM(?))) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 255) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 255) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               stmt.setString(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 255);
               stmt.setString(3, (String)parms[2], 255);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 255);
               return;
      }
   }

}

