/*
               File: SdtTransactionContext
        Description: TransactionContext
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:38.40
       Program type: Callable routine
          Main DBMS: sqlserver
*/
package com.wms ;
import com.wms.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTransactionContext extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtTransactionContext( )
   {
      this(  new ModelContext(SdtTransactionContext.class));
   }

   public SdtTransactionContext( ModelContext context )
   {
      super( context, "SdtTransactionContext");
   }

   public SdtTransactionContext( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtTransactionContext");
   }

   public SdtTransactionContext( StructSdtTransactionContext struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "CallerObject") )
            {
               gxTv_SdtTransactionContext_Callerobject = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CallerOnDelete") )
            {
               gxTv_SdtTransactionContext_Callerondelete = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CallerURL") )
            {
               gxTv_SdtTransactionContext_Callerurl = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TransactionName") )
            {
               gxTv_SdtTransactionContext_Transactionname = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Attributes") )
            {
               if ( gxTv_SdtTransactionContext_Attributes == null )
               {
                  gxTv_SdtTransactionContext_Attributes = new GXBaseCollection<com.wms.SdtTransactionContext_Attribute>(com.wms.SdtTransactionContext_Attribute.class, "TransactionContext.Attribute", "WMS", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtTransactionContext_Attributes.readxmlcollection(oReader, "Attributes", "Attribute") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( readOk == 0 )
            {
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "TransactionContext" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "WMS" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("CallerObject", GXutil.rtrim( gxTv_SdtTransactionContext_Callerobject));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("CallerOnDelete", GXutil.rtrim( GXutil.booltostr( gxTv_SdtTransactionContext_Callerondelete)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("CallerURL", GXutil.rtrim( gxTv_SdtTransactionContext_Callerurl));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("TransactionName", GXutil.rtrim( gxTv_SdtTransactionContext_Transactionname));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      if ( gxTv_SdtTransactionContext_Attributes != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "WMS") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "WMS" ;
         }
         else
         {
            sNameSpace1 = "WMS" ;
         }
         gxTv_SdtTransactionContext_Attributes.writexmlcollection(oWriter, "Attributes", sNameSpace1, "Attribute", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("CallerObject", gxTv_SdtTransactionContext_Callerobject, false);
      AddObjectProperty("CallerOnDelete", gxTv_SdtTransactionContext_Callerondelete, false);
      AddObjectProperty("CallerURL", gxTv_SdtTransactionContext_Callerurl, false);
      AddObjectProperty("TransactionName", gxTv_SdtTransactionContext_Transactionname, false);
      if ( gxTv_SdtTransactionContext_Attributes != null )
      {
         AddObjectProperty("Attributes", gxTv_SdtTransactionContext_Attributes, false);
      }
   }

   public String getgxTv_SdtTransactionContext_Callerobject( )
   {
      return gxTv_SdtTransactionContext_Callerobject ;
   }

   public void setgxTv_SdtTransactionContext_Callerobject( String value )
   {
      gxTv_SdtTransactionContext_Callerobject = value ;
   }

   public boolean getgxTv_SdtTransactionContext_Callerondelete( )
   {
      return gxTv_SdtTransactionContext_Callerondelete ;
   }

   public void setgxTv_SdtTransactionContext_Callerondelete( boolean value )
   {
      gxTv_SdtTransactionContext_Callerondelete = value ;
   }

   public String getgxTv_SdtTransactionContext_Callerurl( )
   {
      return gxTv_SdtTransactionContext_Callerurl ;
   }

   public void setgxTv_SdtTransactionContext_Callerurl( String value )
   {
      gxTv_SdtTransactionContext_Callerurl = value ;
   }

   public String getgxTv_SdtTransactionContext_Transactionname( )
   {
      return gxTv_SdtTransactionContext_Transactionname ;
   }

   public void setgxTv_SdtTransactionContext_Transactionname( String value )
   {
      gxTv_SdtTransactionContext_Transactionname = value ;
   }

   public GXBaseCollection<com.wms.SdtTransactionContext_Attribute> getgxTv_SdtTransactionContext_Attributes( )
   {
      if ( gxTv_SdtTransactionContext_Attributes == null )
      {
         gxTv_SdtTransactionContext_Attributes = new GXBaseCollection<com.wms.SdtTransactionContext_Attribute>(com.wms.SdtTransactionContext_Attribute.class, "TransactionContext.Attribute", "WMS", remoteHandle);
      }
      return gxTv_SdtTransactionContext_Attributes ;
   }

   public void setgxTv_SdtTransactionContext_Attributes( GXBaseCollection<com.wms.SdtTransactionContext_Attribute> value )
   {
      gxTv_SdtTransactionContext_Attributes = value ;
   }

   public void setgxTv_SdtTransactionContext_Attributes_SetNull( )
   {
      gxTv_SdtTransactionContext_Attributes = null ;
   }

   public boolean getgxTv_SdtTransactionContext_Attributes_IsNull( )
   {
      if ( gxTv_SdtTransactionContext_Attributes == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTransactionContext_Callerobject = "" ;
      gxTv_SdtTransactionContext_Callerurl = "" ;
      gxTv_SdtTransactionContext_Transactionname = "" ;
      sTagName = "" ;
   }

   public com.wms.SdtTransactionContext Clone( )
   {
      return (com.wms.SdtTransactionContext)(clone()) ;
   }

   public void setStruct( com.wms.StructSdtTransactionContext struct )
   {
      setgxTv_SdtTransactionContext_Callerobject(struct.getCallerobject());
      setgxTv_SdtTransactionContext_Callerondelete(struct.getCallerondelete());
      setgxTv_SdtTransactionContext_Callerurl(struct.getCallerurl());
      setgxTv_SdtTransactionContext_Transactionname(struct.getTransactionname());
      GXBaseCollection<com.wms.SdtTransactionContext_Attribute> gxTv_SdtTransactionContext_Attributes_aux = new GXBaseCollection<com.wms.SdtTransactionContext_Attribute>(com.wms.SdtTransactionContext_Attribute.class, "TransactionContext.Attribute", "WMS", remoteHandle) ;
      GXBaseCollection<com.wms.SdtTransactionContext_Attribute> gxTv_SdtTransactionContext_Attributes_aux1 = new GXBaseCollection<com.wms.SdtTransactionContext_Attribute>(com.wms.SdtTransactionContext_Attribute.class, "TransactionContext.Attribute", "WMS", remoteHandle) ;
      gxTv_SdtTransactionContext_Attributes_aux1.setStruct(struct.getAttributes());
      for (int i = 0; i < gxTv_SdtTransactionContext_Attributes_aux1.size(); i++)
      {
         gxTv_SdtTransactionContext_Attributes_aux.add(new com.wms.SdtTransactionContext_Attribute(gxTv_SdtTransactionContext_Attributes_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtTransactionContext_Attributes(gxTv_SdtTransactionContext_Attributes_aux);
   }

   public com.wms.StructSdtTransactionContext getStruct( )
   {
      com.wms.StructSdtTransactionContext struct = new com.wms.StructSdtTransactionContext ();
      struct.setCallerobject(getgxTv_SdtTransactionContext_Callerobject());
      struct.setCallerondelete(getgxTv_SdtTransactionContext_Callerondelete());
      struct.setCallerurl(getgxTv_SdtTransactionContext_Callerurl());
      struct.setTransactionname(getgxTv_SdtTransactionContext_Transactionname());
      Vector aux_vectorgxTv_SdtTransactionContext_Attributes = getgxTv_SdtTransactionContext_Attributes().getStruct();
      Vector aux_vector1gxTv_SdtTransactionContext_Attributes = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtTransactionContext_Attributes.size(); i++)
      {
         aux_vector1gxTv_SdtTransactionContext_Attributes.addElement(((com.wms.SdtTransactionContext_Attribute)aux_vectorgxTv_SdtTransactionContext_Attributes.elementAt(i)).getStruct());
      }
      struct.setAttributes(aux_vector1gxTv_SdtTransactionContext_Attributes);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtTransactionContext_Callerondelete ;
   protected String gxTv_SdtTransactionContext_Callerobject ;
   protected String gxTv_SdtTransactionContext_Callerurl ;
   protected String gxTv_SdtTransactionContext_Transactionname ;
   protected GXBaseCollection<com.wms.SdtTransactionContext_Attribute> gxTv_SdtTransactionContext_Attributes_aux ;
   protected GXBaseCollection<com.wms.SdtTransactionContext_Attribute> gxTv_SdtTransactionContext_Attributes_aux1 ;
   protected GXBaseCollection<com.wms.SdtTransactionContext_Attribute> gxTv_SdtTransactionContext_Attributes=null ;
}

