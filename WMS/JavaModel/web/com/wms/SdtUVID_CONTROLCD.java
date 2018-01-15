/*
               File: SdtUVID_CONTROLCD
        Description: UVID_CONTROLCD
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 12, 2018 10:22:58.91
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

public final  class SdtUVID_CONTROLCD extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtUVID_CONTROLCD( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtUVID_CONTROLCD.class));
   }

   public SdtUVID_CONTROLCD( int remoteHandle ,
                             ModelContext context )
   {
      super( context, "SdtUVID_CONTROLCD");
      initialize( remoteHandle) ;
   }

   public SdtUVID_CONTROLCD( int remoteHandle ,
                             StructSdtUVID_CONTROLCD struct )
   {
      this(remoteHandle);
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

   public void Load( int AV41UVID_CONTROLCDDocEntry ,
                     int AV42LineId )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Integer(AV41UVID_CONTROLCDDocEntry),new Integer(AV42LineId)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"UVID_CONTROLCDDocEntry", int.class}, new Object[]{"LineId", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties() ;
      metadata.set("Name", "UVID_CONTROLCD");
      metadata.set("BT", "@VID_CONTROLCD");
      metadata.set("PK", "[ \"UVID_CONTROLCDDocEntry\",\"LineId\" ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDDocEntry") )
            {
               gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LineId") )
            {
               gxTv_SdtUVID_CONTROLCD_Lineid = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VisOrder") )
            {
               gxTv_SdtUVID_CONTROLCD_Visorder = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDObject") )
            {
               gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDLogInst") )
            {
               gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_CodAtr") )
            {
               gxTv_SdtUVID_CONTROLCD_U_codatr = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_NameAtr") )
            {
               gxTv_SdtUVID_CONTROLCD_U_nameatr = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Cualitat") )
            {
               gxTv_SdtUVID_CONTROLCD_U_cualitat = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Critico") )
            {
               gxTv_SdtUVID_CONTROLCD_U_critico = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_TipoMues") )
            {
               gxTv_SdtUVID_CONTROLCD_U_tipomues = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Rango") )
            {
               gxTv_SdtUVID_CONTROLCD_U_rango = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_TipoDef") )
            {
               gxTv_SdtUVID_CONTROLCD_U_tipodef = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_AQL") )
            {
               gxTv_SdtUVID_CONTROLCD_U_aql = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_TiempoDu") )
            {
               gxTv_SdtUVID_CONTROLCD_U_tiempodu = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_StandAtr") )
            {
               gxTv_SdtUVID_CONTROLCD_U_standatr = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Minimo") )
            {
               gxTv_SdtUVID_CONTROLCD_U_minimo = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Maximo") )
            {
               gxTv_SdtUVID_CONTROLCD_U_maximo = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Medicion") )
            {
               gxTv_SdtUVID_CONTROLCD_U_medicion = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_CodEquip") )
            {
               gxTv_SdtUVID_CONTROLCD_U_codequip = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDU_Comment") )
            {
               gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Comment2") )
            {
               gxTv_SdtUVID_CONTROLCD_U_comment2 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDU_Estado") )
            {
               gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtUVID_CONTROLCD_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtUVID_CONTROLCD_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDDocEntry_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LineId_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_Lineid_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VisOrder_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_Visorder_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDObject_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDLogInst_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_CodAtr_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_codatr_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_NameAtr_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_nameatr_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Cualitat_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_cualitat_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Critico_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_critico_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_TipoMues_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_tipomues_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Rango_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_rango_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_TipoDef_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_tipodef_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_AQL_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_aql_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_TiempoDu_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_tiempodu_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_StandAtr_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_standatr_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Minimo_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_minimo_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Maximo_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_maximo_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Medicion_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_medicion_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_CodEquip_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_codequip_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDU_Comment_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "U_Comment2_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_U_comment2_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UVID_CONTROLCDU_Estado_Z") )
            {
               gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z = oReader.getValue() ;
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
         sName = "UVID_CONTROLCD" ;
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
      oWriter.writeElement("UVID_CONTROLCDDocEntry", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry, 9, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("LineId", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_Lineid, 9, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("VisOrder", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_Visorder, 9, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("UVID_CONTROLCDObject", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("UVID_CONTROLCDLogInst", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst, 9, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_CodAtr", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_codatr));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_NameAtr", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_nameatr));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Cualitat", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_cualitat));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Critico", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_critico));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_TipoMues", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_tipomues));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Rango", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_rango));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_TipoDef", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_tipodef));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_AQL", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_aql));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_TiempoDu", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_tiempodu, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_StandAtr", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_standatr, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Minimo", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_minimo, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Maximo", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_maximo, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Medicion", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_medicion, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_CodEquip", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_codequip));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("UVID_CONTROLCDU_Comment", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("U_Comment2", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_comment2));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("UVID_CONTROLCDU_Estado", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_Mode));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("UVID_CONTROLCDDocEntry_Z", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z, 9, 0)));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("LineId_Z", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_Lineid_Z, 9, 0)));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("VisOrder_Z", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_Visorder_Z, 9, 0)));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("UVID_CONTROLCDObject_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("UVID_CONTROLCDLogInst_Z", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z, 9, 0)));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_CodAtr_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_codatr_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_NameAtr_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_nameatr_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_Cualitat_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_cualitat_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_Critico_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_critico_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_TipoMues_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_tipomues_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_Rango_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_rango_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_TipoDef_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_tipodef_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_AQL_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_aql_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_TiempoDu_Z", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_tiempodu_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_StandAtr_Z", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_standatr_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_Minimo_Z", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_minimo_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_Maximo_Z", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_maximo_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_Medicion_Z", GXutil.trim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_medicion_Z, 18, 0)));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_CodEquip_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_codequip_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("UVID_CONTROLCDU_Comment_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("U_Comment2_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_U_comment2_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
         oWriter.writeElement("UVID_CONTROLCDU_Estado_Z", GXutil.rtrim( gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z));
         if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
         {
            oWriter.writeAttribute("xmlns", "WMS");
         }
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("UVID_CONTROLCDDocEntry", gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry, false);
      AddObjectProperty("LineId", gxTv_SdtUVID_CONTROLCD_Lineid, false);
      AddObjectProperty("VisOrder", gxTv_SdtUVID_CONTROLCD_Visorder, false);
      AddObjectProperty("UVID_CONTROLCDObject", gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject, false);
      AddObjectProperty("UVID_CONTROLCDLogInst", gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst, false);
      AddObjectProperty("U_CodAtr", gxTv_SdtUVID_CONTROLCD_U_codatr, false);
      AddObjectProperty("U_NameAtr", gxTv_SdtUVID_CONTROLCD_U_nameatr, false);
      AddObjectProperty("U_Cualitat", gxTv_SdtUVID_CONTROLCD_U_cualitat, false);
      AddObjectProperty("U_Critico", gxTv_SdtUVID_CONTROLCD_U_critico, false);
      AddObjectProperty("U_TipoMues", gxTv_SdtUVID_CONTROLCD_U_tipomues, false);
      AddObjectProperty("U_Rango", gxTv_SdtUVID_CONTROLCD_U_rango, false);
      AddObjectProperty("U_TipoDef", gxTv_SdtUVID_CONTROLCD_U_tipodef, false);
      AddObjectProperty("U_AQL", gxTv_SdtUVID_CONTROLCD_U_aql, false);
      AddObjectProperty("U_TiempoDu", GXutil.ltrim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_tiempodu, 18, 0)), false);
      AddObjectProperty("U_StandAtr", GXutil.ltrim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_standatr, 18, 0)), false);
      AddObjectProperty("U_Minimo", GXutil.ltrim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_minimo, 18, 0)), false);
      AddObjectProperty("U_Maximo", GXutil.ltrim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_maximo, 18, 0)), false);
      AddObjectProperty("U_Medicion", GXutil.ltrim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_medicion, 18, 0)), false);
      AddObjectProperty("U_CodEquip", gxTv_SdtUVID_CONTROLCD_U_codequip, false);
      AddObjectProperty("UVID_CONTROLCDU_Comment", gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment, false);
      AddObjectProperty("U_Comment2", gxTv_SdtUVID_CONTROLCD_U_comment2, false);
      AddObjectProperty("UVID_CONTROLCDU_Estado", gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtUVID_CONTROLCD_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtUVID_CONTROLCD_Initialized, false);
         AddObjectProperty("UVID_CONTROLCDDocEntry_Z", gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z, false);
         AddObjectProperty("LineId_Z", gxTv_SdtUVID_CONTROLCD_Lineid_Z, false);
         AddObjectProperty("VisOrder_Z", gxTv_SdtUVID_CONTROLCD_Visorder_Z, false);
         AddObjectProperty("UVID_CONTROLCDObject_Z", gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z, false);
         AddObjectProperty("UVID_CONTROLCDLogInst_Z", gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z, false);
         AddObjectProperty("U_CodAtr_Z", gxTv_SdtUVID_CONTROLCD_U_codatr_Z, false);
         AddObjectProperty("U_NameAtr_Z", gxTv_SdtUVID_CONTROLCD_U_nameatr_Z, false);
         AddObjectProperty("U_Cualitat_Z", gxTv_SdtUVID_CONTROLCD_U_cualitat_Z, false);
         AddObjectProperty("U_Critico_Z", gxTv_SdtUVID_CONTROLCD_U_critico_Z, false);
         AddObjectProperty("U_TipoMues_Z", gxTv_SdtUVID_CONTROLCD_U_tipomues_Z, false);
         AddObjectProperty("U_Rango_Z", gxTv_SdtUVID_CONTROLCD_U_rango_Z, false);
         AddObjectProperty("U_TipoDef_Z", gxTv_SdtUVID_CONTROLCD_U_tipodef_Z, false);
         AddObjectProperty("U_AQL_Z", gxTv_SdtUVID_CONTROLCD_U_aql_Z, false);
         AddObjectProperty("U_TiempoDu_Z", GXutil.ltrim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_tiempodu_Z, 18, 0)), false);
         AddObjectProperty("U_StandAtr_Z", GXutil.ltrim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_standatr_Z, 18, 0)), false);
         AddObjectProperty("U_Minimo_Z", GXutil.ltrim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_minimo_Z, 18, 0)), false);
         AddObjectProperty("U_Maximo_Z", GXutil.ltrim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_maximo_Z, 18, 0)), false);
         AddObjectProperty("U_Medicion_Z", GXutil.ltrim( GXutil.str( gxTv_SdtUVID_CONTROLCD_U_medicion_Z, 18, 0)), false);
         AddObjectProperty("U_CodEquip_Z", gxTv_SdtUVID_CONTROLCD_U_codequip_Z, false);
         AddObjectProperty("UVID_CONTROLCDU_Comment_Z", gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z, false);
         AddObjectProperty("U_Comment2_Z", gxTv_SdtUVID_CONTROLCD_U_comment2_Z, false);
         AddObjectProperty("UVID_CONTROLCDU_Estado_Z", gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z, false);
      }
   }

   public void updateDirties( com.wms.SdtUVID_CONTROLCD sdt )
   {
      if ( sdt.IsDirty("UVID_CONTROLCDDocEntry") )
      {
         gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry = sdt.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry() ;
      }
      if ( sdt.IsDirty("LineId") )
      {
         gxTv_SdtUVID_CONTROLCD_Lineid = sdt.getgxTv_SdtUVID_CONTROLCD_Lineid() ;
      }
      if ( sdt.IsDirty("VisOrder") )
      {
         gxTv_SdtUVID_CONTROLCD_Visorder = sdt.getgxTv_SdtUVID_CONTROLCD_Visorder() ;
      }
      if ( sdt.IsDirty("UVID_CONTROLCDObject") )
      {
         gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject = sdt.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject() ;
      }
      if ( sdt.IsDirty("UVID_CONTROLCDLogInst") )
      {
         gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst = sdt.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst() ;
      }
      if ( sdt.IsDirty("U_CodAtr") )
      {
         gxTv_SdtUVID_CONTROLCD_U_codatr = sdt.getgxTv_SdtUVID_CONTROLCD_U_codatr() ;
      }
      if ( sdt.IsDirty("U_NameAtr") )
      {
         gxTv_SdtUVID_CONTROLCD_U_nameatr = sdt.getgxTv_SdtUVID_CONTROLCD_U_nameatr() ;
      }
      if ( sdt.IsDirty("U_Cualitat") )
      {
         gxTv_SdtUVID_CONTROLCD_U_cualitat = sdt.getgxTv_SdtUVID_CONTROLCD_U_cualitat() ;
      }
      if ( sdt.IsDirty("U_Critico") )
      {
         gxTv_SdtUVID_CONTROLCD_U_critico = sdt.getgxTv_SdtUVID_CONTROLCD_U_critico() ;
      }
      if ( sdt.IsDirty("U_TipoMues") )
      {
         gxTv_SdtUVID_CONTROLCD_U_tipomues = sdt.getgxTv_SdtUVID_CONTROLCD_U_tipomues() ;
      }
      if ( sdt.IsDirty("U_Rango") )
      {
         gxTv_SdtUVID_CONTROLCD_U_rango = sdt.getgxTv_SdtUVID_CONTROLCD_U_rango() ;
      }
      if ( sdt.IsDirty("U_TipoDef") )
      {
         gxTv_SdtUVID_CONTROLCD_U_tipodef = sdt.getgxTv_SdtUVID_CONTROLCD_U_tipodef() ;
      }
      if ( sdt.IsDirty("U_AQL") )
      {
         gxTv_SdtUVID_CONTROLCD_U_aql = sdt.getgxTv_SdtUVID_CONTROLCD_U_aql() ;
      }
      if ( sdt.IsDirty("U_TiempoDu") )
      {
         gxTv_SdtUVID_CONTROLCD_U_tiempodu = sdt.getgxTv_SdtUVID_CONTROLCD_U_tiempodu() ;
      }
      if ( sdt.IsDirty("U_StandAtr") )
      {
         gxTv_SdtUVID_CONTROLCD_U_standatr = sdt.getgxTv_SdtUVID_CONTROLCD_U_standatr() ;
      }
      if ( sdt.IsDirty("U_Minimo") )
      {
         gxTv_SdtUVID_CONTROLCD_U_minimo = sdt.getgxTv_SdtUVID_CONTROLCD_U_minimo() ;
      }
      if ( sdt.IsDirty("U_Maximo") )
      {
         gxTv_SdtUVID_CONTROLCD_U_maximo = sdt.getgxTv_SdtUVID_CONTROLCD_U_maximo() ;
      }
      if ( sdt.IsDirty("U_Medicion") )
      {
         gxTv_SdtUVID_CONTROLCD_U_medicion = sdt.getgxTv_SdtUVID_CONTROLCD_U_medicion() ;
      }
      if ( sdt.IsDirty("U_CodEquip") )
      {
         gxTv_SdtUVID_CONTROLCD_U_codequip = sdt.getgxTv_SdtUVID_CONTROLCD_U_codequip() ;
      }
      if ( sdt.IsDirty("UVID_CONTROLCDU_Comment") )
      {
         gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment = sdt.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment() ;
      }
      if ( sdt.IsDirty("U_Comment2") )
      {
         gxTv_SdtUVID_CONTROLCD_U_comment2 = sdt.getgxTv_SdtUVID_CONTROLCD_U_comment2() ;
      }
      if ( sdt.IsDirty("UVID_CONTROLCDU_Estado") )
      {
         gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado = sdt.getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado() ;
      }
   }

   public int getgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry( )
   {
      return gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry( int value )
   {
      if ( gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry != value )
      {
         gxTv_SdtUVID_CONTROLCD_Mode = "INS" ;
         this.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Lineid_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Visorder_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_codatr_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_nameatr_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_cualitat_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_critico_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_tipomues_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_rango_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_tipodef_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_aql_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_tiempodu_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_standatr_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_minimo_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_maximo_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_medicion_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_codequip_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_comment2_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z_SetNull( );
      }
      SetDirty("Uvid_controlcddocentry");
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry = value ;
   }

   public int getgxTv_SdtUVID_CONTROLCD_Lineid( )
   {
      return gxTv_SdtUVID_CONTROLCD_Lineid ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Lineid( int value )
   {
      if ( gxTv_SdtUVID_CONTROLCD_Lineid != value )
      {
         gxTv_SdtUVID_CONTROLCD_Mode = "INS" ;
         this.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Lineid_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Visorder_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_codatr_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_nameatr_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_cualitat_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_critico_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_tipomues_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_rango_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_tipodef_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_aql_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_tiempodu_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_standatr_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_minimo_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_maximo_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_medicion_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_codequip_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_U_comment2_Z_SetNull( );
         this.setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z_SetNull( );
      }
      SetDirty("Lineid");
      gxTv_SdtUVID_CONTROLCD_Lineid = value ;
   }

   public int getgxTv_SdtUVID_CONTROLCD_Visorder( )
   {
      return gxTv_SdtUVID_CONTROLCD_Visorder ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Visorder( int value )
   {
      SetDirty("Visorder");
      gxTv_SdtUVID_CONTROLCD_Visorder = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject( )
   {
      return gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject( String value )
   {
      SetDirty("Uvid_controlcdobject");
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject = value ;
   }

   public int getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst( )
   {
      return gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst( int value )
   {
      SetDirty("Uvid_controlcdloginst");
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_codatr( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_codatr ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_codatr( String value )
   {
      SetDirty("U_codatr");
      gxTv_SdtUVID_CONTROLCD_U_codatr = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_nameatr( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_nameatr ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_nameatr( String value )
   {
      SetDirty("U_nameatr");
      gxTv_SdtUVID_CONTROLCD_U_nameatr = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_cualitat( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_cualitat ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_cualitat( String value )
   {
      SetDirty("U_cualitat");
      gxTv_SdtUVID_CONTROLCD_U_cualitat = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_critico( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_critico ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_critico( String value )
   {
      SetDirty("U_critico");
      gxTv_SdtUVID_CONTROLCD_U_critico = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_tipomues( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_tipomues ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_tipomues( String value )
   {
      SetDirty("U_tipomues");
      gxTv_SdtUVID_CONTROLCD_U_tipomues = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_rango( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_rango ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_rango( String value )
   {
      SetDirty("U_rango");
      gxTv_SdtUVID_CONTROLCD_U_rango = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_tipodef( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_tipodef ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_tipodef( String value )
   {
      SetDirty("U_tipodef");
      gxTv_SdtUVID_CONTROLCD_U_tipodef = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_aql( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_aql ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_aql( String value )
   {
      SetDirty("U_aql");
      gxTv_SdtUVID_CONTROLCD_U_aql = value ;
   }

   public long getgxTv_SdtUVID_CONTROLCD_U_tiempodu( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_tiempodu ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_tiempodu( long value )
   {
      SetDirty("U_tiempodu");
      gxTv_SdtUVID_CONTROLCD_U_tiempodu = value ;
   }

   public long getgxTv_SdtUVID_CONTROLCD_U_standatr( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_standatr ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_standatr( long value )
   {
      SetDirty("U_standatr");
      gxTv_SdtUVID_CONTROLCD_U_standatr = value ;
   }

   public long getgxTv_SdtUVID_CONTROLCD_U_minimo( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_minimo ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_minimo( long value )
   {
      SetDirty("U_minimo");
      gxTv_SdtUVID_CONTROLCD_U_minimo = value ;
   }

   public long getgxTv_SdtUVID_CONTROLCD_U_maximo( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_maximo ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_maximo( long value )
   {
      SetDirty("U_maximo");
      gxTv_SdtUVID_CONTROLCD_U_maximo = value ;
   }

   public long getgxTv_SdtUVID_CONTROLCD_U_medicion( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_medicion ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_medicion( long value )
   {
      SetDirty("U_medicion");
      gxTv_SdtUVID_CONTROLCD_U_medicion = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_codequip( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_codequip ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_codequip( String value )
   {
      SetDirty("U_codequip");
      gxTv_SdtUVID_CONTROLCD_U_codequip = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment( )
   {
      return gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment( String value )
   {
      SetDirty("Uvid_controlcdu_comment");
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_comment2( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_comment2 ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_comment2( String value )
   {
      SetDirty("U_comment2");
      gxTv_SdtUVID_CONTROLCD_U_comment2 = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado( )
   {
      return gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado( String value )
   {
      SetDirty("Uvid_controlcdu_estado");
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado = value ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_Mode( )
   {
      return gxTv_SdtUVID_CONTROLCD_Mode ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Mode( String value )
   {
      SetDirty("Mode");
      gxTv_SdtUVID_CONTROLCD_Mode = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Mode_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_Mode = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtUVID_CONTROLCD_Initialized( )
   {
      return gxTv_SdtUVID_CONTROLCD_Initialized ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Initialized( short value )
   {
      SetDirty("Initialized");
      gxTv_SdtUVID_CONTROLCD_Initialized = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Initialized_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_Initialized_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z( int value )
   {
      SetDirty("Uvid_controlcddocentry_Z");
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z = 0 ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtUVID_CONTROLCD_Lineid_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_Lineid_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Lineid_Z( int value )
   {
      SetDirty("Lineid_Z");
      gxTv_SdtUVID_CONTROLCD_Lineid_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Lineid_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_Lineid_Z = 0 ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_Lineid_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtUVID_CONTROLCD_Visorder_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_Visorder_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Visorder_Z( int value )
   {
      SetDirty("Visorder_Z");
      gxTv_SdtUVID_CONTROLCD_Visorder_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Visorder_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_Visorder_Z = 0 ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_Visorder_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z( String value )
   {
      SetDirty("Uvid_controlcdobject_Z");
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z( int value )
   {
      SetDirty("Uvid_controlcdloginst_Z");
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z = 0 ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_codatr_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_codatr_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_codatr_Z( String value )
   {
      SetDirty("U_codatr_Z");
      gxTv_SdtUVID_CONTROLCD_U_codatr_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_codatr_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_codatr_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_codatr_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_nameatr_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_nameatr_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_nameatr_Z( String value )
   {
      SetDirty("U_nameatr_Z");
      gxTv_SdtUVID_CONTROLCD_U_nameatr_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_nameatr_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_nameatr_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_nameatr_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_cualitat_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_cualitat_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_cualitat_Z( String value )
   {
      SetDirty("U_cualitat_Z");
      gxTv_SdtUVID_CONTROLCD_U_cualitat_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_cualitat_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_cualitat_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_cualitat_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_critico_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_critico_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_critico_Z( String value )
   {
      SetDirty("U_critico_Z");
      gxTv_SdtUVID_CONTROLCD_U_critico_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_critico_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_critico_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_critico_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_tipomues_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_tipomues_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_tipomues_Z( String value )
   {
      SetDirty("U_tipomues_Z");
      gxTv_SdtUVID_CONTROLCD_U_tipomues_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_tipomues_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_tipomues_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_tipomues_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_rango_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_rango_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_rango_Z( String value )
   {
      SetDirty("U_rango_Z");
      gxTv_SdtUVID_CONTROLCD_U_rango_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_rango_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_rango_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_rango_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_tipodef_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_tipodef_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_tipodef_Z( String value )
   {
      SetDirty("U_tipodef_Z");
      gxTv_SdtUVID_CONTROLCD_U_tipodef_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_tipodef_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_tipodef_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_tipodef_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_aql_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_aql_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_aql_Z( String value )
   {
      SetDirty("U_aql_Z");
      gxTv_SdtUVID_CONTROLCD_U_aql_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_aql_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_aql_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_aql_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtUVID_CONTROLCD_U_tiempodu_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_tiempodu_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_tiempodu_Z( long value )
   {
      SetDirty("U_tiempodu_Z");
      gxTv_SdtUVID_CONTROLCD_U_tiempodu_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_tiempodu_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_tiempodu_Z = 0 ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_tiempodu_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtUVID_CONTROLCD_U_standatr_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_standatr_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_standatr_Z( long value )
   {
      SetDirty("U_standatr_Z");
      gxTv_SdtUVID_CONTROLCD_U_standatr_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_standatr_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_standatr_Z = 0 ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_standatr_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtUVID_CONTROLCD_U_minimo_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_minimo_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_minimo_Z( long value )
   {
      SetDirty("U_minimo_Z");
      gxTv_SdtUVID_CONTROLCD_U_minimo_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_minimo_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_minimo_Z = 0 ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_minimo_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtUVID_CONTROLCD_U_maximo_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_maximo_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_maximo_Z( long value )
   {
      SetDirty("U_maximo_Z");
      gxTv_SdtUVID_CONTROLCD_U_maximo_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_maximo_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_maximo_Z = 0 ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_maximo_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtUVID_CONTROLCD_U_medicion_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_medicion_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_medicion_Z( long value )
   {
      SetDirty("U_medicion_Z");
      gxTv_SdtUVID_CONTROLCD_U_medicion_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_medicion_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_medicion_Z = 0 ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_medicion_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_codequip_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_codequip_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_codequip_Z( String value )
   {
      SetDirty("U_codequip_Z");
      gxTv_SdtUVID_CONTROLCD_U_codequip_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_codequip_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_codequip_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_codequip_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z( String value )
   {
      SetDirty("Uvid_controlcdu_comment_Z");
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_U_comment2_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_U_comment2_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_comment2_Z( String value )
   {
      SetDirty("U_comment2_Z");
      gxTv_SdtUVID_CONTROLCD_U_comment2_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_U_comment2_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_U_comment2_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_U_comment2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z( )
   {
      return gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z( String value )
   {
      SetDirty("Uvid_controlcdu_estado_Z");
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z = value ;
   }

   public void setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z_SetNull( )
   {
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z = "" ;
   }

   public boolean getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.wms.uvid_controlcd_bc obj ;
      obj = new com.wms.uvid_controlcd_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject = "" ;
      gxTv_SdtUVID_CONTROLCD_U_codatr = "" ;
      gxTv_SdtUVID_CONTROLCD_U_nameatr = "" ;
      gxTv_SdtUVID_CONTROLCD_U_cualitat = "" ;
      gxTv_SdtUVID_CONTROLCD_U_critico = "" ;
      gxTv_SdtUVID_CONTROLCD_U_tipomues = "" ;
      gxTv_SdtUVID_CONTROLCD_U_rango = "" ;
      gxTv_SdtUVID_CONTROLCD_U_tipodef = "" ;
      gxTv_SdtUVID_CONTROLCD_U_aql = "" ;
      gxTv_SdtUVID_CONTROLCD_U_codequip = "" ;
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment = "" ;
      gxTv_SdtUVID_CONTROLCD_U_comment2 = "" ;
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado = "" ;
      gxTv_SdtUVID_CONTROLCD_Mode = "" ;
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_U_codatr_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_U_nameatr_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_U_cualitat_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_U_critico_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_U_tipomues_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_U_rango_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_U_tipodef_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_U_aql_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_U_codequip_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_U_comment2_Z = "" ;
      gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z = "" ;
      sTagName = "" ;
   }

   public com.wms.SdtUVID_CONTROLCD Clone( )
   {
      com.wms.SdtUVID_CONTROLCD sdt ;
      com.wms.uvid_controlcd_bc obj ;
      sdt = (com.wms.SdtUVID_CONTROLCD)(clone()) ;
      obj = (com.wms.uvid_controlcd_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.wms.StructSdtUVID_CONTROLCD struct )
   {
      setgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry(struct.getUvid_controlcddocentry());
      setgxTv_SdtUVID_CONTROLCD_Lineid(struct.getLineid());
      setgxTv_SdtUVID_CONTROLCD_Visorder(struct.getVisorder());
      setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject(struct.getUvid_controlcdobject());
      setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst(struct.getUvid_controlcdloginst());
      setgxTv_SdtUVID_CONTROLCD_U_codatr(struct.getU_codatr());
      setgxTv_SdtUVID_CONTROLCD_U_nameatr(struct.getU_nameatr());
      setgxTv_SdtUVID_CONTROLCD_U_cualitat(struct.getU_cualitat());
      setgxTv_SdtUVID_CONTROLCD_U_critico(struct.getU_critico());
      setgxTv_SdtUVID_CONTROLCD_U_tipomues(struct.getU_tipomues());
      setgxTv_SdtUVID_CONTROLCD_U_rango(struct.getU_rango());
      setgxTv_SdtUVID_CONTROLCD_U_tipodef(struct.getU_tipodef());
      setgxTv_SdtUVID_CONTROLCD_U_aql(struct.getU_aql());
      setgxTv_SdtUVID_CONTROLCD_U_tiempodu(struct.getU_tiempodu());
      setgxTv_SdtUVID_CONTROLCD_U_standatr(struct.getU_standatr());
      setgxTv_SdtUVID_CONTROLCD_U_minimo(struct.getU_minimo());
      setgxTv_SdtUVID_CONTROLCD_U_maximo(struct.getU_maximo());
      setgxTv_SdtUVID_CONTROLCD_U_medicion(struct.getU_medicion());
      setgxTv_SdtUVID_CONTROLCD_U_codequip(struct.getU_codequip());
      setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment(struct.getUvid_controlcdu_comment());
      setgxTv_SdtUVID_CONTROLCD_U_comment2(struct.getU_comment2());
      setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado(struct.getUvid_controlcdu_estado());
      setgxTv_SdtUVID_CONTROLCD_Mode(struct.getMode());
      setgxTv_SdtUVID_CONTROLCD_Initialized(struct.getInitialized());
      setgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z(struct.getUvid_controlcddocentry_Z());
      setgxTv_SdtUVID_CONTROLCD_Lineid_Z(struct.getLineid_Z());
      setgxTv_SdtUVID_CONTROLCD_Visorder_Z(struct.getVisorder_Z());
      setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z(struct.getUvid_controlcdobject_Z());
      setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z(struct.getUvid_controlcdloginst_Z());
      setgxTv_SdtUVID_CONTROLCD_U_codatr_Z(struct.getU_codatr_Z());
      setgxTv_SdtUVID_CONTROLCD_U_nameatr_Z(struct.getU_nameatr_Z());
      setgxTv_SdtUVID_CONTROLCD_U_cualitat_Z(struct.getU_cualitat_Z());
      setgxTv_SdtUVID_CONTROLCD_U_critico_Z(struct.getU_critico_Z());
      setgxTv_SdtUVID_CONTROLCD_U_tipomues_Z(struct.getU_tipomues_Z());
      setgxTv_SdtUVID_CONTROLCD_U_rango_Z(struct.getU_rango_Z());
      setgxTv_SdtUVID_CONTROLCD_U_tipodef_Z(struct.getU_tipodef_Z());
      setgxTv_SdtUVID_CONTROLCD_U_aql_Z(struct.getU_aql_Z());
      setgxTv_SdtUVID_CONTROLCD_U_tiempodu_Z(struct.getU_tiempodu_Z());
      setgxTv_SdtUVID_CONTROLCD_U_standatr_Z(struct.getU_standatr_Z());
      setgxTv_SdtUVID_CONTROLCD_U_minimo_Z(struct.getU_minimo_Z());
      setgxTv_SdtUVID_CONTROLCD_U_maximo_Z(struct.getU_maximo_Z());
      setgxTv_SdtUVID_CONTROLCD_U_medicion_Z(struct.getU_medicion_Z());
      setgxTv_SdtUVID_CONTROLCD_U_codequip_Z(struct.getU_codequip_Z());
      setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z(struct.getUvid_controlcdu_comment_Z());
      setgxTv_SdtUVID_CONTROLCD_U_comment2_Z(struct.getU_comment2_Z());
      setgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z(struct.getUvid_controlcdu_estado_Z());
   }

   public com.wms.StructSdtUVID_CONTROLCD getStruct( )
   {
      com.wms.StructSdtUVID_CONTROLCD struct = new com.wms.StructSdtUVID_CONTROLCD ();
      struct.setUvid_controlcddocentry(getgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry());
      struct.setLineid(getgxTv_SdtUVID_CONTROLCD_Lineid());
      struct.setVisorder(getgxTv_SdtUVID_CONTROLCD_Visorder());
      struct.setUvid_controlcdobject(getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject());
      struct.setUvid_controlcdloginst(getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst());
      struct.setU_codatr(getgxTv_SdtUVID_CONTROLCD_U_codatr());
      struct.setU_nameatr(getgxTv_SdtUVID_CONTROLCD_U_nameatr());
      struct.setU_cualitat(getgxTv_SdtUVID_CONTROLCD_U_cualitat());
      struct.setU_critico(getgxTv_SdtUVID_CONTROLCD_U_critico());
      struct.setU_tipomues(getgxTv_SdtUVID_CONTROLCD_U_tipomues());
      struct.setU_rango(getgxTv_SdtUVID_CONTROLCD_U_rango());
      struct.setU_tipodef(getgxTv_SdtUVID_CONTROLCD_U_tipodef());
      struct.setU_aql(getgxTv_SdtUVID_CONTROLCD_U_aql());
      struct.setU_tiempodu(getgxTv_SdtUVID_CONTROLCD_U_tiempodu());
      struct.setU_standatr(getgxTv_SdtUVID_CONTROLCD_U_standatr());
      struct.setU_minimo(getgxTv_SdtUVID_CONTROLCD_U_minimo());
      struct.setU_maximo(getgxTv_SdtUVID_CONTROLCD_U_maximo());
      struct.setU_medicion(getgxTv_SdtUVID_CONTROLCD_U_medicion());
      struct.setU_codequip(getgxTv_SdtUVID_CONTROLCD_U_codequip());
      struct.setUvid_controlcdu_comment(getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment());
      struct.setU_comment2(getgxTv_SdtUVID_CONTROLCD_U_comment2());
      struct.setUvid_controlcdu_estado(getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado());
      struct.setMode(getgxTv_SdtUVID_CONTROLCD_Mode());
      struct.setInitialized(getgxTv_SdtUVID_CONTROLCD_Initialized());
      struct.setUvid_controlcddocentry_Z(getgxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z());
      struct.setLineid_Z(getgxTv_SdtUVID_CONTROLCD_Lineid_Z());
      struct.setVisorder_Z(getgxTv_SdtUVID_CONTROLCD_Visorder_Z());
      struct.setUvid_controlcdobject_Z(getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z());
      struct.setUvid_controlcdloginst_Z(getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z());
      struct.setU_codatr_Z(getgxTv_SdtUVID_CONTROLCD_U_codatr_Z());
      struct.setU_nameatr_Z(getgxTv_SdtUVID_CONTROLCD_U_nameatr_Z());
      struct.setU_cualitat_Z(getgxTv_SdtUVID_CONTROLCD_U_cualitat_Z());
      struct.setU_critico_Z(getgxTv_SdtUVID_CONTROLCD_U_critico_Z());
      struct.setU_tipomues_Z(getgxTv_SdtUVID_CONTROLCD_U_tipomues_Z());
      struct.setU_rango_Z(getgxTv_SdtUVID_CONTROLCD_U_rango_Z());
      struct.setU_tipodef_Z(getgxTv_SdtUVID_CONTROLCD_U_tipodef_Z());
      struct.setU_aql_Z(getgxTv_SdtUVID_CONTROLCD_U_aql_Z());
      struct.setU_tiempodu_Z(getgxTv_SdtUVID_CONTROLCD_U_tiempodu_Z());
      struct.setU_standatr_Z(getgxTv_SdtUVID_CONTROLCD_U_standatr_Z());
      struct.setU_minimo_Z(getgxTv_SdtUVID_CONTROLCD_U_minimo_Z());
      struct.setU_maximo_Z(getgxTv_SdtUVID_CONTROLCD_U_maximo_Z());
      struct.setU_medicion_Z(getgxTv_SdtUVID_CONTROLCD_U_medicion_Z());
      struct.setU_codequip_Z(getgxTv_SdtUVID_CONTROLCD_U_codequip_Z());
      struct.setUvid_controlcdu_comment_Z(getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z());
      struct.setU_comment2_Z(getgxTv_SdtUVID_CONTROLCD_U_comment2_Z());
      struct.setUvid_controlcdu_estado_Z(getgxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z());
      return struct ;
   }

   private short gxTv_SdtUVID_CONTROLCD_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry ;
   private int gxTv_SdtUVID_CONTROLCD_Lineid ;
   private int gxTv_SdtUVID_CONTROLCD_Visorder ;
   private int gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst ;
   private int gxTv_SdtUVID_CONTROLCD_Uvid_controlcddocentry_Z ;
   private int gxTv_SdtUVID_CONTROLCD_Lineid_Z ;
   private int gxTv_SdtUVID_CONTROLCD_Visorder_Z ;
   private int gxTv_SdtUVID_CONTROLCD_Uvid_controlcdloginst_Z ;
   private long gxTv_SdtUVID_CONTROLCD_U_tiempodu ;
   private long gxTv_SdtUVID_CONTROLCD_U_standatr ;
   private long gxTv_SdtUVID_CONTROLCD_U_minimo ;
   private long gxTv_SdtUVID_CONTROLCD_U_maximo ;
   private long gxTv_SdtUVID_CONTROLCD_U_medicion ;
   private long gxTv_SdtUVID_CONTROLCD_U_tiempodu_Z ;
   private long gxTv_SdtUVID_CONTROLCD_U_standatr_Z ;
   private long gxTv_SdtUVID_CONTROLCD_U_minimo_Z ;
   private long gxTv_SdtUVID_CONTROLCD_U_maximo_Z ;
   private long gxTv_SdtUVID_CONTROLCD_U_medicion_Z ;
   private String gxTv_SdtUVID_CONTROLCD_U_cualitat ;
   private String gxTv_SdtUVID_CONTROLCD_U_critico ;
   private String gxTv_SdtUVID_CONTROLCD_U_tipodef ;
   private String gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado ;
   private String gxTv_SdtUVID_CONTROLCD_Mode ;
   private String gxTv_SdtUVID_CONTROLCD_U_cualitat_Z ;
   private String gxTv_SdtUVID_CONTROLCD_U_critico_Z ;
   private String gxTv_SdtUVID_CONTROLCD_U_tipodef_Z ;
   private String gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_estado_Z ;
   private String sTagName ;
   private String gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject ;
   private String gxTv_SdtUVID_CONTROLCD_U_codatr ;
   private String gxTv_SdtUVID_CONTROLCD_U_nameatr ;
   private String gxTv_SdtUVID_CONTROLCD_U_tipomues ;
   private String gxTv_SdtUVID_CONTROLCD_U_rango ;
   private String gxTv_SdtUVID_CONTROLCD_U_aql ;
   private String gxTv_SdtUVID_CONTROLCD_U_codequip ;
   private String gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment ;
   private String gxTv_SdtUVID_CONTROLCD_U_comment2 ;
   private String gxTv_SdtUVID_CONTROLCD_Uvid_controlcdobject_Z ;
   private String gxTv_SdtUVID_CONTROLCD_U_codatr_Z ;
   private String gxTv_SdtUVID_CONTROLCD_U_nameatr_Z ;
   private String gxTv_SdtUVID_CONTROLCD_U_tipomues_Z ;
   private String gxTv_SdtUVID_CONTROLCD_U_rango_Z ;
   private String gxTv_SdtUVID_CONTROLCD_U_aql_Z ;
   private String gxTv_SdtUVID_CONTROLCD_U_codequip_Z ;
   private String gxTv_SdtUVID_CONTROLCD_Uvid_controlcdu_comment_Z ;
   private String gxTv_SdtUVID_CONTROLCD_U_comment2_Z ;
}

