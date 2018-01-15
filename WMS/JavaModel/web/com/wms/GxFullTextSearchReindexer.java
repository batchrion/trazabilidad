/*
               File: GxFullTextSearchReindexer
        Description: No description for object
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:26:59.69
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class GxFullTextSearchReindexer
{
   public static int Reindex( int remoteHandle )
   {
      GxSilentTrnSdt obj ;
      IGxSilentTrn trn ;
      boolean result ;
      obj = new com.wms.SdtUVID_CONTROLCD(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      return 1 ;
   }

}

