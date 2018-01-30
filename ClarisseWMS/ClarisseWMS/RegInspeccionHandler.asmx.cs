using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace ClarisseWMS
{
    /// <summary>
    /// Descripción breve de RegInspeccionHandler
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio Web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class RegInspeccionHandler : System.Web.Services.WebService
    {

        [WebMethod]
        public string addRegInspeccionDetail(RegInspeccionHeader regHeader, int docEntry, int lineId, int visOrder, string objeto, int logInst, string codAtr, string nameAtr, char cualitat, char critico, string tipoMues, string rango, char tipoDef, string aql, int tiempoDu, int standAtr, int minimo, int maximo, int medicion, string codEquipo, string instrucciones, string comentario)
        {
            RegInspeccionDetail rid = new RegInspeccionDetail();
            rid.docEntry = docEntry;
            rid.lineId = lineId;
            rid.visOrder = visOrder;
            rid.objeto = objeto;
            rid.logInst = logInst;
            rid.codAtr = codAtr;
            rid.nameAtr = nameAtr;
            rid.cualitat = cualitat;
            rid.tipoMues = tipoMues;
            rid.rango = rango;
            rid.tipoDef = tipoDef;
            rid.aql = aql;
            rid.tiempoDu = tiempoDu;
            rid.standAtr = standAtr;
            rid.minimo = minimo;
            rid.maximo = maximo;
            rid.codEquipo = codEquipo;
            rid.instrucciones = instrucciones;
            rid.comentario = comentario;
            regHeader.detalle.Add(rid);
            return "string";
        }            
        
        [WebMethod]
        public string addRegInspeccionHeader(int docNum, string objeto, char transfered, char status, string itemCode, string itemName, string whsCode, string whsDest, int numTras, int numCon, int numMusd, string noLote, int corrLote, int corrAnal, int cantidad, int bultos, int bultosMu, string unidadM, DateTime fecContr, DateTime fecIni, DateTime fecFin, char estado, char traslado, string tipResul, char contraMu, int coMuSize, char muesDes, int muDeSize, string ctaCalidad, string cCCode, string prjCode, string comment, char reanalis)
        {
            RegInspeccionHeader rih = new RegInspeccionHeader();
            rih.docNum = docNum;
            rih.objeto = objeto;
            rih.transfered = transfered;
            rih.status = status;
            rih.itemCode = itemCode;
            rih.itemName = itemName;
            rih.whsCode = whsCode;
            rih.whsDest = whsDest;
            rih.numTras = numTras;
            rih.numCon = numCon;
            rih.numMusd = numMusd;
            rih.noLote = noLote;
            rih.corrLote = corrLote;
            rih.corrAnal = corrAnal;
            rih.cantidad = cantidad;
            return "string";
        }
    }
}
