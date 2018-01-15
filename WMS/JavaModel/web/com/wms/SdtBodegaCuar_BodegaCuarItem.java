/*
               File: SdtBodegaCuar_BodegaCuarItem
        Description: BodegaCuar
             Author: GeneXus Java Generator version 15_0_3-111985
       Generated on: January 11, 2018 14:12:26.68
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

public final  class SdtBodegaCuar_BodegaCuarItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtBodegaCuar_BodegaCuarItem( )
   {
      this(  new ModelContext(SdtBodegaCuar_BodegaCuarItem.class));
   }

   public SdtBodegaCuar_BodegaCuarItem( ModelContext context )
   {
      super( context, "SdtBodegaCuar_BodegaCuarItem");
   }

   public SdtBodegaCuar_BodegaCuarItem( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtBodegaCuar_BodegaCuarItem");
   }

   public SdtBodegaCuar_BodegaCuarItem( StructSdtBodegaCuar_BodegaCuarItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItemCode") )
            {
               gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItemName") )
            {
               gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "WhsCode") )
            {
               gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OnHand") )
            {
               gxTv_SdtBodegaCuar_BodegaCuarItem_Onhand = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CntUnitMsr") )
            {
               gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AvgPrice") )
            {
               gxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "validFor") )
            {
               gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InvntItem") )
            {
               gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem = oReader.getValue() ;
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
         sName = "BodegaCuar.BodegaCuarItem" ;
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
      oWriter.writeElement("ItemCode", GXutil.rtrim( gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("ItemName", GXutil.rtrim( gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("WhsCode", GXutil.rtrim( gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("OnHand", GXutil.trim( GXutil.str( gxTv_SdtBodegaCuar_BodegaCuarItem_Onhand, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("CntUnitMsr", GXutil.rtrim( gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("AvgPrice", GXutil.trim( GXutil.str( gxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("validFor", GXutil.rtrim( gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor));
      if ( GXutil.strcmp(sNameSpace, "WMS") != 0 )
      {
         oWriter.writeAttribute("xmlns", "WMS");
      }
      oWriter.writeElement("InvntItem", GXutil.rtrim( gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem));
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
      AddObjectProperty("ItemCode", gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode, false);
      AddObjectProperty("ItemName", gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname, false);
      AddObjectProperty("WhsCode", gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode, false);
      AddObjectProperty("OnHand", GXutil.ltrim( GXutil.str( gxTv_SdtBodegaCuar_BodegaCuarItem_Onhand, 18, 0)), false);
      AddObjectProperty("CntUnitMsr", gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr, false);
      AddObjectProperty("AvgPrice", GXutil.ltrim( GXutil.str( gxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice, 18, 0)), false);
      AddObjectProperty("validFor", gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor, false);
      AddObjectProperty("InvntItem", gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem, false);
   }

   public String getgxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode ;
   }

   public void setgxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode = value ;
   }

   public String getgxTv_SdtBodegaCuar_BodegaCuarItem_Itemname( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname ;
   }

   public void setgxTv_SdtBodegaCuar_BodegaCuarItem_Itemname( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname = value ;
   }

   public String getgxTv_SdtBodegaCuar_BodegaCuarItem_Whscode( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode ;
   }

   public void setgxTv_SdtBodegaCuar_BodegaCuarItem_Whscode( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode = value ;
   }

   public long getgxTv_SdtBodegaCuar_BodegaCuarItem_Onhand( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Onhand ;
   }

   public void setgxTv_SdtBodegaCuar_BodegaCuarItem_Onhand( long value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Onhand = value ;
   }

   public String getgxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr ;
   }

   public void setgxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr = value ;
   }

   public long getgxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice ;
   }

   public void setgxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice( long value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice = value ;
   }

   public String getgxTv_SdtBodegaCuar_BodegaCuarItem_Validfor( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor ;
   }

   public void setgxTv_SdtBodegaCuar_BodegaCuarItem_Validfor( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor = value ;
   }

   public String getgxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem( )
   {
      return gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem ;
   }

   public void setgxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem( String value )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode = "" ;
      gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname = "" ;
      gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode = "" ;
      gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr = "" ;
      gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor = "" ;
      gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem = "" ;
      sTagName = "" ;
   }

   public com.wms.SdtBodegaCuar_BodegaCuarItem Clone( )
   {
      return (com.wms.SdtBodegaCuar_BodegaCuarItem)(clone()) ;
   }

   public void setStruct( com.wms.StructSdtBodegaCuar_BodegaCuarItem struct )
   {
      setgxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode(struct.getItemcode());
      setgxTv_SdtBodegaCuar_BodegaCuarItem_Itemname(struct.getItemname());
      setgxTv_SdtBodegaCuar_BodegaCuarItem_Whscode(struct.getWhscode());
      setgxTv_SdtBodegaCuar_BodegaCuarItem_Onhand(struct.getOnhand());
      setgxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr(struct.getCntunitmsr());
      setgxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice(struct.getAvgprice());
      setgxTv_SdtBodegaCuar_BodegaCuarItem_Validfor(struct.getValidfor());
      setgxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem(struct.getInvntitem());
   }

   public com.wms.StructSdtBodegaCuar_BodegaCuarItem getStruct( )
   {
      com.wms.StructSdtBodegaCuar_BodegaCuarItem struct = new com.wms.StructSdtBodegaCuar_BodegaCuarItem ();
      struct.setItemcode(getgxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode());
      struct.setItemname(getgxTv_SdtBodegaCuar_BodegaCuarItem_Itemname());
      struct.setWhscode(getgxTv_SdtBodegaCuar_BodegaCuarItem_Whscode());
      struct.setOnhand(getgxTv_SdtBodegaCuar_BodegaCuarItem_Onhand());
      struct.setCntunitmsr(getgxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr());
      struct.setAvgprice(getgxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice());
      struct.setValidfor(getgxTv_SdtBodegaCuar_BodegaCuarItem_Validfor());
      struct.setInvntitem(getgxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtBodegaCuar_BodegaCuarItem_Onhand ;
   protected long gxTv_SdtBodegaCuar_BodegaCuarItem_Avgprice ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Validfor ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Invntitem ;
   protected String sTagName ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Itemcode ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Itemname ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Whscode ;
   protected String gxTv_SdtBodegaCuar_BodegaCuarItem_Cntunitmsr ;
}

