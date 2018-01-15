/*
               File: SdtGridState
        Description: GridState
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.98
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

public final  class SdtGridState extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtGridState( )
   {
      this(  new ModelContext(SdtGridState.class));
   }

   public SdtGridState( ModelContext context )
   {
      super( context, "SdtGridState");
   }

   public SdtGridState( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtGridState");
   }

   public SdtGridState( StructSdtGridState struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CurrentPage") )
            {
               gxTv_SdtGridState_Currentpage = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OrderedBy") )
            {
               gxTv_SdtGridState_Orderedby = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HidingSearch") )
            {
               gxTv_SdtGridState_Hidingsearch = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FilterValues") )
            {
               if ( gxTv_SdtGridState_Filtervalues == null )
               {
                  gxTv_SdtGridState_Filtervalues = new GXBaseCollection<com.wms.SdtGridState_FilterValue>(com.wms.SdtGridState_FilterValue.class, "GridState.FilterValue", "WMS", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtGridState_Filtervalues.readxmlcollection(oReader, "FilterValues", "FilterValue") ;
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
         sName = "GridState" ;
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
      oWriter.writeElement("CurrentPage", GXutil.trim( GXutil.str( gxTv_SdtGridState_Currentpage, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("OrderedBy", GXutil.trim( GXutil.str( gxTv_SdtGridState_Orderedby, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("HidingSearch", GXutil.trim( GXutil.str( gxTv_SdtGridState_Hidingsearch, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      if ( gxTv_SdtGridState_Filtervalues != null )
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
         gxTv_SdtGridState_Filtervalues.writexmlcollection(oWriter, "FilterValues", sNameSpace1, "FilterValue", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("CurrentPage", gxTv_SdtGridState_Currentpage, false);
      AddObjectProperty("OrderedBy", gxTv_SdtGridState_Orderedby, false);
      AddObjectProperty("HidingSearch", gxTv_SdtGridState_Hidingsearch, false);
      if ( gxTv_SdtGridState_Filtervalues != null )
      {
         AddObjectProperty("FilterValues", gxTv_SdtGridState_Filtervalues, false);
      }
   }

   public short getgxTv_SdtGridState_Currentpage( )
   {
      return gxTv_SdtGridState_Currentpage ;
   }

   public void setgxTv_SdtGridState_Currentpage( short value )
   {
      gxTv_SdtGridState_Currentpage = value ;
   }

   public short getgxTv_SdtGridState_Orderedby( )
   {
      return gxTv_SdtGridState_Orderedby ;
   }

   public void setgxTv_SdtGridState_Orderedby( short value )
   {
      gxTv_SdtGridState_Orderedby = value ;
   }

   public byte getgxTv_SdtGridState_Hidingsearch( )
   {
      return gxTv_SdtGridState_Hidingsearch ;
   }

   public void setgxTv_SdtGridState_Hidingsearch( byte value )
   {
      gxTv_SdtGridState_Hidingsearch = value ;
   }

   public GXBaseCollection<com.wms.SdtGridState_FilterValue> getgxTv_SdtGridState_Filtervalues( )
   {
      if ( gxTv_SdtGridState_Filtervalues == null )
      {
         gxTv_SdtGridState_Filtervalues = new GXBaseCollection<com.wms.SdtGridState_FilterValue>(com.wms.SdtGridState_FilterValue.class, "GridState.FilterValue", "WMS", remoteHandle);
      }
      return gxTv_SdtGridState_Filtervalues ;
   }

   public void setgxTv_SdtGridState_Filtervalues( GXBaseCollection<com.wms.SdtGridState_FilterValue> value )
   {
      gxTv_SdtGridState_Filtervalues = value ;
   }

   public void setgxTv_SdtGridState_Filtervalues_SetNull( )
   {
      gxTv_SdtGridState_Filtervalues = null ;
   }

   public boolean getgxTv_SdtGridState_Filtervalues_IsNull( )
   {
      if ( gxTv_SdtGridState_Filtervalues == null )
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
      sTagName = "" ;
   }

   public com.wms.SdtGridState Clone( )
   {
      return (com.wms.SdtGridState)(clone()) ;
   }

   public void setStruct( com.wms.StructSdtGridState struct )
   {
      setgxTv_SdtGridState_Currentpage(struct.getCurrentpage());
      setgxTv_SdtGridState_Orderedby(struct.getOrderedby());
      setgxTv_SdtGridState_Hidingsearch(struct.getHidingsearch());
      GXBaseCollection<com.wms.SdtGridState_FilterValue> gxTv_SdtGridState_Filtervalues_aux = new GXBaseCollection<com.wms.SdtGridState_FilterValue>(com.wms.SdtGridState_FilterValue.class, "GridState.FilterValue", "WMS", remoteHandle) ;
      GXBaseCollection<com.wms.SdtGridState_FilterValue> gxTv_SdtGridState_Filtervalues_aux1 = new GXBaseCollection<com.wms.SdtGridState_FilterValue>(com.wms.SdtGridState_FilterValue.class, "GridState.FilterValue", "WMS", remoteHandle) ;
      gxTv_SdtGridState_Filtervalues_aux1.setStruct(struct.getFiltervalues());
      for (int i = 0; i < gxTv_SdtGridState_Filtervalues_aux1.size(); i++)
      {
         gxTv_SdtGridState_Filtervalues_aux.add(new com.wms.SdtGridState_FilterValue(gxTv_SdtGridState_Filtervalues_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtGridState_Filtervalues(gxTv_SdtGridState_Filtervalues_aux);
   }

   public com.wms.StructSdtGridState getStruct( )
   {
      com.wms.StructSdtGridState struct = new com.wms.StructSdtGridState ();
      struct.setCurrentpage(getgxTv_SdtGridState_Currentpage());
      struct.setOrderedby(getgxTv_SdtGridState_Orderedby());
      struct.setHidingsearch(getgxTv_SdtGridState_Hidingsearch());
      Vector aux_vectorgxTv_SdtGridState_Filtervalues = getgxTv_SdtGridState_Filtervalues().getStruct();
      Vector aux_vector1gxTv_SdtGridState_Filtervalues = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtGridState_Filtervalues.size(); i++)
      {
         aux_vector1gxTv_SdtGridState_Filtervalues.addElement(((com.wms.SdtGridState_FilterValue)aux_vectorgxTv_SdtGridState_Filtervalues.elementAt(i)).getStruct());
      }
      struct.setFiltervalues(aux_vector1gxTv_SdtGridState_Filtervalues);
      return struct ;
   }

   protected byte gxTv_SdtGridState_Hidingsearch ;
   protected short gxTv_SdtGridState_Currentpage ;
   protected short gxTv_SdtGridState_Orderedby ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected GXBaseCollection<com.wms.SdtGridState_FilterValue> gxTv_SdtGridState_Filtervalues_aux ;
   protected GXBaseCollection<com.wms.SdtGridState_FilterValue> gxTv_SdtGridState_Filtervalues_aux1 ;
   protected GXBaseCollection<com.wms.SdtGridState_FilterValue> gxTv_SdtGridState_Filtervalues=null ;
}

