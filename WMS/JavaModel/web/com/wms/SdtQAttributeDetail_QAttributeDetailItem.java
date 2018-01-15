/*
               File: SdtQAttributeDetail_QAttributeDetailItem
        Description: QAttributeDetail
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:23:38.18
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

public final  class SdtQAttributeDetail_QAttributeDetailItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtQAttributeDetail_QAttributeDetailItem( )
   {
      this(  new ModelContext(SdtQAttributeDetail_QAttributeDetailItem.class));
   }

   public SdtQAttributeDetail_QAttributeDetailItem( ModelContext context )
   {
      super( context, "SdtQAttributeDetail_QAttributeDetailItem");
   }

   public SdtQAttributeDetail_QAttributeDetailItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtQAttributeDetail_QAttributeDetailItem");
   }

   public SdtQAttributeDetail_QAttributeDetailItem( StructSdtQAttributeDetail_QAttributeDetailItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_ATRCONTARTDDocEntry") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_CodAtr2") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_ATRCONTARTDU_NameAtr") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Critico2") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_CodEquip2") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDU_Estado") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Medicion") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Rango") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_TiempoDu") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_TipoMues") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LineId2") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2 = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_ATRCONTARTDU_Cualitat") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_StandAtr2") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2 = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Minimo2") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2 = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Maximo2") )
            {
               gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2 = GXutil.lval( oReader.getValue()) ;
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
         sName = "QAttributeDetail.QAttributeDetailItem" ;
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
      oWriter.writeElement("UVID_ATRCONTARTDDocEntry", GXutil.trim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry, 9, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_CodAtr2", GXutil.rtrim( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("UVID_ATRCONTARTDU_NameAtr", GXutil.rtrim( gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Critico2", GXutil.rtrim( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_CodEquip2", GXutil.rtrim( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("UVID_CONTROLCDU_Estado", GXutil.rtrim( gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Medicion", GXutil.trim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Rango", GXutil.rtrim( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_TiempoDu", GXutil.trim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_TipoMues", GXutil.rtrim( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("LineId2", GXutil.trim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2, 9, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("UVID_ATRCONTARTDU_Cualitat", GXutil.rtrim( gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_StandAtr2", GXutil.trim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Minimo2", GXutil.trim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Maximo2", GXutil.trim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2, 18, 0)));
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
      AddObjectProperty("UVID_ATRCONTARTDDocEntry", gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry, false);
      AddObjectProperty("U_CodAtr2", gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2, false);
      AddObjectProperty("UVID_ATRCONTARTDU_NameAtr", gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr, false);
      AddObjectProperty("U_Critico2", gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2, false);
      AddObjectProperty("U_CodEquip2", gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2, false);
      AddObjectProperty("UVID_CONTROLCDU_Estado", gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado, false);
      AddObjectProperty("U_Medicion", GXutil.ltrim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion, 18, 0)), false);
      AddObjectProperty("U_Rango", gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango, false);
      AddObjectProperty("U_TiempoDu", GXutil.ltrim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu, 18, 0)), false);
      AddObjectProperty("U_TipoMues", gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues, false);
      AddObjectProperty("LineId2", gxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2, false);
      AddObjectProperty("UVID_ATRCONTARTDU_Cualitat", gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat, false);
      AddObjectProperty("U_StandAtr2", GXutil.ltrim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2, 18, 0)), false);
      AddObjectProperty("U_Minimo2", GXutil.ltrim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2, 18, 0)), false);
      AddObjectProperty("U_Maximo2", GXutil.ltrim( GXutil.str( gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2, 18, 0)), false);
   }

   public int getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry( int value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry = value ;
   }

   public String getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2 ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2( String value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2 = value ;
   }

   public String getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr( String value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr = value ;
   }

   public String getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2 ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2( String value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2 = value ;
   }

   public String getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2 ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2( String value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2 = value ;
   }

   public String getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado( String value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado = value ;
   }

   public long getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion( long value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion = value ;
   }

   public String getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango( String value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango = value ;
   }

   public long getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu( long value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu = value ;
   }

   public String getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues( String value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues = value ;
   }

   public int getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2 ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2( int value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2 = value ;
   }

   public String getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat( String value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat = value ;
   }

   public long getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2 ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2( long value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2 = value ;
   }

   public long getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2 ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2( long value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2 = value ;
   }

   public long getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2( )
   {
      return gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2 ;
   }

   public void setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2( long value )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2 = "" ;
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr = "" ;
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2 = "" ;
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2 = "" ;
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado = "" ;
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango = "" ;
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues = "" ;
      gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat = "" ;
      sTagName = "" ;
   }

   public com.wms.SdtQAttributeDetail_QAttributeDetailItem Clone( )
   {
      return (com.wms.SdtQAttributeDetail_QAttributeDetailItem)(clone()) ;
   }

   public void setStruct( com.wms.StructSdtQAttributeDetail_QAttributeDetailItem struct )
   {
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry(struct.getUvid_atrcontartddocentry());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2(struct.getU_codatr2());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr(struct.getUvid_atrcontartdu_nameatr());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2(struct.getU_critico2());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2(struct.getU_codequip2());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado(struct.getUvid_controlcdu_estado());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion(struct.getU_medicion());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango(struct.getU_rango());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu(struct.getU_tiempodu());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues(struct.getU_tipomues());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2(struct.getLineid2());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat(struct.getUvid_atrcontartdu_cualitat());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2(struct.getU_standatr2());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2(struct.getU_minimo2());
      setgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2(struct.getU_maximo2());
   }

   public com.wms.StructSdtQAttributeDetail_QAttributeDetailItem getStruct( )
   {
      com.wms.StructSdtQAttributeDetail_QAttributeDetailItem struct = new com.wms.StructSdtQAttributeDetail_QAttributeDetailItem ();
      struct.setUvid_atrcontartddocentry(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry());
      struct.setU_codatr2(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2());
      struct.setUvid_atrcontartdu_nameatr(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr());
      struct.setU_critico2(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2());
      struct.setU_codequip2(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2());
      struct.setUvid_controlcdu_estado(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado());
      struct.setU_medicion(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion());
      struct.setU_rango(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango());
      struct.setU_tiempodu(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu());
      struct.setU_tipomues(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues());
      struct.setLineid2(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2());
      struct.setUvid_atrcontartdu_cualitat(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat());
      struct.setU_standatr2(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2());
      struct.setU_minimo2(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2());
      struct.setU_maximo2(getgxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartddocentry ;
   protected int gxTv_SdtQAttributeDetail_QAttributeDetailItem_Lineid2 ;
   protected long gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_medicion ;
   protected long gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tiempodu ;
   protected long gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_standatr2 ;
   protected long gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_minimo2 ;
   protected long gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_maximo2 ;
   protected String gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_critico2 ;
   protected String gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_controlcdu_estado ;
   protected String gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_cualitat ;
   protected String sTagName ;
   protected String gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codatr2 ;
   protected String gxTv_SdtQAttributeDetail_QAttributeDetailItem_Uvid_atrcontartdu_nameatr ;
   protected String gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_codequip2 ;
   protected String gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_rango ;
   protected String gxTv_SdtQAttributeDetail_QAttributeDetailItem_U_tipomues ;
}

