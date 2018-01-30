using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Configuration;

namespace ClarisseWMS
{
    /// <summary>
    /// Descripción breve de RegistroInspeccion
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio Web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class RegistroInspeccion : System.Web.Services.WebService
    {
        public SAPbobsCOM.Company oCompany;
        public SAPbobsCOM.UserTable oUserTable;
        public int retVal;

        [WebMethod]
        public string HelloWorld()
        {
            return ConectarBD();
        }

        public string ConectarBD()
        {
            oCompany = new SAPbobsCOM.Company();
            oCompany.Server = ConfigurationManager.AppSettings["Server"];
            oCompany.CompanyDB = ConfigurationManager.AppSettings["Company"];
            oCompany.UserName = ConfigurationManager.AppSettings["UserName"];
            oCompany.Password = ConfigurationManager.AppSettings["Password"];
            oCompany.DbServerType = SAPbobsCOM.BoDataServerTypes.dst_MSSQL2012;
            oCompany.DbUserName = ConfigurationManager.AppSettings["DbUserName"];
            oCompany.DbPassword = ConfigurationManager.AppSettings["DbPassword"];

            if (oCompany.Connected == true)
                oCompany.Disconnect();

            retVal = oCompany.Connect();
            if (retVal != 0)
            {
                string retStr = oCompany.GetLastErrorDescription();
                return "Error " + retVal + " " + retStr;
            }
            else
                //return "Conectado a " + oCompany.CompanyName;
                return InsertarRegistroInspeccion();
        }

        public bool TransferirStock(string origen, string destino, string producto, string lote, double cantidad)
        {
            string numTrans;

            //Hacer la transferencia
            SAPbobsCOM.StockTransfer stockTransfer = (SAPbobsCOM.StockTransfer) oCompany.GetBusinessObject(SAPbobsCOM.BoObjectTypes.oStockTransfer);
            stockTransfer.DocDate = DateTime.Now;
            stockTransfer.FromWarehouse = origen;
            stockTransfer.ToWarehouse = destino;
            stockTransfer.Lines.ItemCode = producto;
            stockTransfer.Lines.WarehouseCode = destino;
            stockTransfer.Lines.Quantity = cantidad;
            stockTransfer.Lines.BatchNumbers.BatchNumber = lote;
            stockTransfer.Lines.BatchNumbers.Quantity = cantidad;
            stockTransfer.Lines.BatchNumbers.Add();
            
            stockTransfer.Lines.Add();

            stockTransfer.Add();
            numTrans = oCompany.GetNewObjectKey();

            if (stockTransfer.Add() == 0)
                return true;
            else
                return false;
            
    
            //Traer el número de transferencia
          //numTrans = oCompany.GetNewObjectKey();
            
        }

        public void AddRecord(RegInspeccionHeader cabRegistro)
        {
            SAPbobsCOM.GeneralService oGeneralService;

            SAPbobsCOM.GeneralData oGeneralData;

            SAPbobsCOM.CompanyService oCompService;

            oCompService = oCompany.GetCompanyService();

            oCompany.StartTransaction();

            oGeneralService = oCompService.GetGeneralService("VID_CONTROLCH");

            oGeneralData = (SAPbobsCOM.GeneralData)oGeneralService.GetDataInterface(SAPbobsCOM.GeneralServiceDataInterfaces.gsGeneralData);

            //Setting Data to Master Data Table Fields
            oGeneralData.SetProperty("U_FecIngr", cabRegistro.fecIngr);

            oGeneralData.SetProperty("U_FecContr", cabRegistro.fecContr);

            oGeneralData.SetProperty("U_FecIni", cabRegistro.fecIni);

            oGeneralData.SetProperty("U_FecFin", cabRegistro.fecFin);


            oGeneralData.SetProperty("DocNum", cabRegistro.docNum);

            oGeneralData.SetProperty("U_ItemCode", cabRegistro.itemCode);

            oGeneralData.SetProperty("U_NumTras", cabRegistro.numTras);

            oGeneralData.SetProperty("U_ItemName", cabRegistro.itemName);

            oGeneralData.SetProperty("U_WhsCode", cabRegistro.whsCode);

            oGeneralData.SetProperty("U_WhsDest", cabRegistro.whsDest);

            oGeneralData.SetProperty("U_NoLote", cabRegistro.noLote);

            oGeneralData.SetProperty("U_CorrLote", cabRegistro.corrLote);

            oGeneralData.SetProperty("U_Cantidad", cabRegistro.cantidad);

            oGeneralData.SetProperty("U_Bultos", cabRegistro.bultos);

            oGeneralData.SetProperty("U_BultosMu", cabRegistro.bultosMu);

            oGeneralData.SetProperty("U_ContraMu", cabRegistro.contraMu);

            oGeneralData.SetProperty("U_MuestDes", cabRegistro.muesDes);

            oGeneralData.SetProperty("U_Traslado", cabRegistro.traslado);

            oGeneralData.SetProperty("U_Reanalis", cabRegistro.reanalis);

            oGeneralData.SetProperty("U_CorrAnal", cabRegistro.corrAnal);

            oGeneralData.SetProperty("U_FecUltIn", cabRegistro.fecUltIn);

            oGeneralData.SetProperty("U_UM", cabRegistro.unidadM);

            oGeneralData.SetProperty("U_CtaCalid", cabRegistro.ctaCalidad);

            oGeneralData.SetProperty("U_CCCode", cabRegistro.cCCode);

            oGeneralData.SetProperty("U_Estado", cabRegistro.estado);

            oGeneralData.SetProperty("U_TipResul", cabRegistro.tipResul);

            oGeneralData.SetProperty("U_PrjCode", cabRegistro.prjCode);

            oGeneralData.SetProperty("U_Comment", cabRegistro.comment);

            oGeneralData.SetProperty("U_NumTras", cabRegistro.numTras);

        }
                                                                                                                                                                                                                              
        public string InsertarRegistroInspeccion()
        {

            bool resultado = TransferirStock("DISP PRO", "CUART MP", "21019908", "MP117060263", 50);
            string numTrans;

            if (resultado == true)
                numTrans = oCompany.GetNewObjectKey();
            else
                return "Error " + oCompany.GetLastErrorCode() + "-" + oCompany.GetLastErrorDescription();
            
            SAPbobsCOM.GeneralService oGeneralService;

            SAPbobsCOM.GeneralData oGeneralData;

            SAPbobsCOM.GeneralData oChild;

            SAPbobsCOM.GeneralDataCollection oChildren;

            //SAPbobsCOM.GeneralDataParams oGeneralParams;

            SAPbobsCOM.CompanyService oCompService;

            oCompService = oCompany.GetCompanyService();

            oCompany.StartTransaction();

            oGeneralService = oCompService.GetGeneralService("VID_CONTROLCH");

            oGeneralData = (SAPbobsCOM.GeneralData)oGeneralService.GetDataInterface(SAPbobsCOM.GeneralServiceDataInterfaces.gsGeneralData);

            //Setting Data to Master Data Table Fields
            oGeneralData.SetProperty("U_FecIngr", "2017-06-30");

            oGeneralData.SetProperty("U_FecContr", "2017-07-03");

            oGeneralData.SetProperty("U_FecIni", "2017-07-03");

            oGeneralData.SetProperty("U_FecFin", "2017-07-03");

            
            oGeneralData.SetProperty("DocNum", 1);

            oGeneralData.SetProperty("U_ItemCode", "73200004");

            oGeneralData.SetProperty("U_NumTras", numTrans);

            oGeneralData.SetProperty("U_ItemName", "CAJA P/EMB Nº3 200X135X225 mm DULZERO 500ml");

            oGeneralData.SetProperty("U_WhsCode", "CUART MP");

            oGeneralData.SetProperty("U_WhsDest", "DISP PRO");

            oGeneralData.SetProperty("U_NoLote", "MEC217060012");

            oGeneralData.SetProperty("U_CorrLote", 0);

            oGeneralData.SetProperty("U_Cantidad", 3880);

            oGeneralData.SetProperty("U_Bultos", 10);

            oGeneralData.SetProperty("U_BultosMu", 4);

            oGeneralData.SetProperty("U_ContraMu", "Y");

            oGeneralData.SetProperty("U_MuestDes", "Y");

            oGeneralData.SetProperty("U_Traslado", "Y");

            oGeneralData.SetProperty("U_Reanalis", "N");

            oGeneralData.SetProperty("U_CorrAnal", 0);

            oGeneralData.SetProperty("U_FecUltIn", "2017-03-05");

            oGeneralData.SetProperty("U_UM", "UNIDAD");

            oGeneralData.SetProperty("U_CtaCalid", "6010301036");

            oGeneralData.SetProperty("U_CCCode", "CC");

            oGeneralData.SetProperty("U_Estado", "A");

            oGeneralData.SetProperty("U_TipResul", "A100");

            oGeneralData.SetProperty("U_PrjCode", "");

            oGeneralData.SetProperty("U_Comment", "Cumple con todos analisis requeridos.admision:3.358");

            oGeneralData.SetProperty("U_NumTras", numTrans);

            
            oChildren = oGeneralData.Child("VID_CONTROLCD");
            
            oChild = oChildren.Add();

            oChild.SetProperty("U_CodAtr", "The_Code");

            oChild.SetProperty("U_NameAtr", "Attribute name");

            oChild.SetProperty("U_Cualitat", "Y");

            oChild.SetProperty("U_Critico", "Y");

            oChild.SetProperty("U_TipoMues", "69");

            oChild.SetProperty("U_CodEquip", "E");

            oChild.SetProperty("U_Estado", "A");

            oChild.SetProperty("U_TipoDef", "D");

            oChild.SetProperty("U_AQL", "aql");

            oChild.SetProperty("U_Rango", "1 - 1");

            oChild.SetProperty("U_TiempoDu", "4");
            
            //Agregar el registro
            oGeneralService.Add(oGeneralData);

            if (oCompany.InTransaction)
            {
                oCompany.EndTransaction(SAPbobsCOM.BoWfTransOpt.wf_Commit);

            }

            return "Record " +oCompany.GetNewObjectKey() + " added.";
            
        }
    }
}
