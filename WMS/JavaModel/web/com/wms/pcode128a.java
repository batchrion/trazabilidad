/*
               File: PCode128A
        Description: Code128 A
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:42.41
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcode128a extends GXProcedure
{
   public pcode128a( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcode128a.class ), "" );
   }

   public pcode128a( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      pcode128a.this.AV9CadenaIn = aP0;
      pcode128a.this.aP1 = aP1;
      pcode128a.this.aP1 = new String[] {""};
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
      pcode128a.this.AV9CadenaIn = aP0;
      pcode128a.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22cadena = AV9CadenaIn ;
      AV28vasc[1-1] = "" ;
      AV24co = 1 ;
      while ( AV24co <= 255 )
      {
         AV28vasc[(int)(AV24co)-1] = GXutil.chr( (short)(AV24co)) ;
         AV24co = (long)(AV24co+1) ;
      }
      AV18suma = 103 ;
      AV19caracterinicial = GXutil.chr( (short)(123)) ;
      AV20vuelta = AV19caracterinicial ;
      AV21caracterfinal = GXutil.chr( (short)(126)) ;
      AV24co = 1 ;
      while ( AV24co <= GXutil.len( GXutil.trim( AV22cadena)) )
      {
         AV23letra = GXutil.substring( AV22cadena, (int)(AV24co), 1) ;
         /* Execute user subroutine: 'CONV' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV27valorascii = AV15CodigoCnv ;
         AV27valorascii = (long)(AV27valorascii-((AV27valorascii<123) ? 32 : 70)) ;
         AV18suma = (long)(AV18suma+(AV27valorascii*AV24co)) ;
         AV20vuelta = AV20vuelta + ((GXutil.strcmp(AV23letra, " ")==0) ? GXutil.chr( (short)(174)) : AV23letra) ;
         AV24co = (long)(AV24co+1) ;
      }
      AV26resto = (long)(AV18suma-GXutil.Int( AV18suma/ (double) (103))*103) ;
      AV25checksum = ((AV26resto>0) ? AV26resto : 0) ;
      AV25checksum = (long)(AV25checksum+((AV25checksum>90) ? 70 : ((AV25checksum==0) ? 174 : 32))) ;
      AV20vuelta = AV20vuelta + GXutil.chr( (short)(AV25checksum)) + AV21caracterfinal ;
      AV11CadenaOut = GXutil.trim( AV20vuelta) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'CONV' Routine */
      AV12I = (short)(1) ;
      AV15CodigoCnv = 0 ;
      while ( AV12I <= 255 )
      {
         if ( GXutil.strcmp(AV23letra, AV28vasc[AV12I-1]) == 0 )
         {
            AV15CodigoCnv = AV12I ;
         }
         AV12I = (short)(AV12I+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcode128a.this.AV11CadenaOut;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11CadenaOut = "" ;
      AV22cadena = "" ;
      AV28vasc = new String [255] ;
      GX_I = 1 ;
      while ( GX_I <= 255 )
      {
         AV28vasc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV19caracterinicial = "" ;
      AV20vuelta = "" ;
      AV21caracterfinal = "" ;
      AV23letra = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12I ;
   private short Gx_err ;
   private int GX_I ;
   private long AV24co ;
   private long AV18suma ;
   private long AV27valorascii ;
   private long AV15CodigoCnv ;
   private long AV26resto ;
   private long AV25checksum ;
   private String AV9CadenaIn ;
   private String AV11CadenaOut ;
   private String AV22cadena ;
   private String AV28vasc[] ;
   private String AV19caracterinicial ;
   private String AV20vuelta ;
   private String AV21caracterfinal ;
   private String AV23letra ;
   private boolean returnInSub ;
   private String[] aP1 ;
}

