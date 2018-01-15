/*
               File: SdtCabEntrada_CabEntradaItem
        Description: CabEntrada
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:37.83
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

public final  class SdtCabEntrada_CabEntradaItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtCabEntrada_CabEntradaItem( )
   {
      this(  new ModelContext(SdtCabEntrada_CabEntradaItem.class));
   }

   public SdtCabEntrada_CabEntradaItem( ModelContext context )
   {
      super( context, "SdtCabEntrada_CabEntradaItem");
   }

   public SdtCabEntrada_CabEntradaItem( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtCabEntrada_CabEntradaItem");
   }

   public SdtCabEntrada_CabEntradaItem( StructSdtCabEntrada_CabEntradaItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CabEntradaMercanciaId") )
            {
               gxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OcDocEntry") )
            {
               gxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProvCarCode") )
            {
               gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProvCardName") )
            {
               gxTv_SdtCabEntrada_CabEntradaItem_Provcardname = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OcDocDate") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OcDocDueDate") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmpSlpName") )
            {
               gxTv_SdtCabEntrada_CabEntradaItem_Empslpname = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Empresa") )
            {
               gxTv_SdtCabEntrada_CabEntradaItem_Empresa = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UserName") )
            {
               gxTv_SdtCabEntrada_CabEntradaItem_Username = oReader.getValue() ;
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
         sName = "CabEntrada.CabEntradaItem" ;
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
      oWriter.writeElement("CabEntradaMercanciaId", GXutil.trim( GXutil.str( gxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("OcDocEntry", GXutil.trim( GXutil.str( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry, 9, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("ProvCarCode", GXutil.rtrim( gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("ProvCardName", GXutil.rtrim( gxTv_SdtCabEntrada_CabEntradaItem_Provcardname));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate) )
      {
         oWriter.writeStartElement("OcDocDate");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("OcDocDate", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate) )
      {
         oWriter.writeStartElement("OcDocDueDate");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("OcDocDueDate", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
      }
      oWriter.writeElement("EmpSlpName", GXutil.rtrim( gxTv_SdtCabEntrada_CabEntradaItem_Empslpname));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("Empresa", GXutil.rtrim( gxTv_SdtCabEntrada_CabEntradaItem_Empresa));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("UserName", GXutil.rtrim( gxTv_SdtCabEntrada_CabEntradaItem_Username));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("CabEntradaMercanciaId", gxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid, false);
      AddObjectProperty("OcDocEntry", gxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry, false);
      AddObjectProperty("ProvCarCode", gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode, false);
      AddObjectProperty("ProvCardName", gxTv_SdtCabEntrada_CabEntradaItem_Provcardname, false);
      datetime_STZ = gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("OcDocDate", sDateCnv, false);
      datetime_STZ = gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("OcDocDueDate", sDateCnv, false);
      AddObjectProperty("EmpSlpName", gxTv_SdtCabEntrada_CabEntradaItem_Empslpname, false);
      AddObjectProperty("Empresa", gxTv_SdtCabEntrada_CabEntradaItem_Empresa, false);
      AddObjectProperty("UserName", gxTv_SdtCabEntrada_CabEntradaItem_Username, false);
   }

   public int getgxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid ;
   }

   public void setgxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid( int value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid = value ;
   }

   public int getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry ;
   }

   public void setgxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry( int value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry = value ;
   }

   public String getgxTv_SdtCabEntrada_CabEntradaItem_Provcarcode( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode ;
   }

   public void setgxTv_SdtCabEntrada_CabEntradaItem_Provcarcode( String value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode = value ;
   }

   public String getgxTv_SdtCabEntrada_CabEntradaItem_Provcardname( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Provcardname ;
   }

   public void setgxTv_SdtCabEntrada_CabEntradaItem_Provcardname( String value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Provcardname = value ;
   }

   public java.util.Date getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate ;
   }

   public void setgxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate( java.util.Date value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate = value ;
   }

   public java.util.Date getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate ;
   }

   public void setgxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate( java.util.Date value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate = value ;
   }

   public String getgxTv_SdtCabEntrada_CabEntradaItem_Empslpname( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Empslpname ;
   }

   public void setgxTv_SdtCabEntrada_CabEntradaItem_Empslpname( String value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Empslpname = value ;
   }

   public String getgxTv_SdtCabEntrada_CabEntradaItem_Empresa( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Empresa ;
   }

   public void setgxTv_SdtCabEntrada_CabEntradaItem_Empresa( String value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Empresa = value ;
   }

   public String getgxTv_SdtCabEntrada_CabEntradaItem_Username( )
   {
      return gxTv_SdtCabEntrada_CabEntradaItem_Username ;
   }

   public void setgxTv_SdtCabEntrada_CabEntradaItem_Username( String value )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Username = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode = "" ;
      gxTv_SdtCabEntrada_CabEntradaItem_Provcardname = "" ;
      gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtCabEntrada_CabEntradaItem_Empslpname = "" ;
      gxTv_SdtCabEntrada_CabEntradaItem_Empresa = "" ;
      gxTv_SdtCabEntrada_CabEntradaItem_Username = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.wms.SdtCabEntrada_CabEntradaItem Clone( )
   {
      return (com.wms.SdtCabEntrada_CabEntradaItem)(clone()) ;
   }

   public void setStruct( com.wms.StructSdtCabEntrada_CabEntradaItem struct )
   {
      setgxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid(struct.getCabentradamercanciaid());
      setgxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry(struct.getOcdocentry());
      setgxTv_SdtCabEntrada_CabEntradaItem_Provcarcode(struct.getProvcarcode());
      setgxTv_SdtCabEntrada_CabEntradaItem_Provcardname(struct.getProvcardname());
      setgxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate(struct.getOcdocdate());
      setgxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate(struct.getOcdocduedate());
      setgxTv_SdtCabEntrada_CabEntradaItem_Empslpname(struct.getEmpslpname());
      setgxTv_SdtCabEntrada_CabEntradaItem_Empresa(struct.getEmpresa());
      setgxTv_SdtCabEntrada_CabEntradaItem_Username(struct.getUsername());
   }

   public com.wms.StructSdtCabEntrada_CabEntradaItem getStruct( )
   {
      com.wms.StructSdtCabEntrada_CabEntradaItem struct = new com.wms.StructSdtCabEntrada_CabEntradaItem ();
      struct.setCabentradamercanciaid(getgxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid());
      struct.setOcdocentry(getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry());
      struct.setProvcarcode(getgxTv_SdtCabEntrada_CabEntradaItem_Provcarcode());
      struct.setProvcardname(getgxTv_SdtCabEntrada_CabEntradaItem_Provcardname());
      struct.setOcdocdate(getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate());
      struct.setOcdocduedate(getgxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate());
      struct.setEmpslpname(getgxTv_SdtCabEntrada_CabEntradaItem_Empslpname());
      struct.setEmpresa(getgxTv_SdtCabEntrada_CabEntradaItem_Empresa());
      struct.setUsername(getgxTv_SdtCabEntrada_CabEntradaItem_Username());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtCabEntrada_CabEntradaItem_Cabentradamercanciaid ;
   protected int gxTv_SdtCabEntrada_CabEntradaItem_Ocdocentry ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtCabEntrada_CabEntradaItem_Ocdocdate ;
   protected java.util.Date gxTv_SdtCabEntrada_CabEntradaItem_Ocdocduedate ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtCabEntrada_CabEntradaItem_Provcarcode ;
   protected String gxTv_SdtCabEntrada_CabEntradaItem_Provcardname ;
   protected String gxTv_SdtCabEntrada_CabEntradaItem_Empslpname ;
   protected String gxTv_SdtCabEntrada_CabEntradaItem_Empresa ;
   protected String gxTv_SdtCabEntrada_CabEntradaItem_Username ;
}

