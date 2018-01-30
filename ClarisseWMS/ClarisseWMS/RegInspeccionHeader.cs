using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ClarisseWMS
{
    public class RegInspeccionHeader
    {
        public int docNum { get; set; }

        public string objeto { get; set; }

        public char transfered { get; set; }

        public char status { get; set; }

        public string itemCode { get; set; }

        public string itemName { get; set; }

        public string whsCode { get; set; }

        public string whsDest { get; set; }

        public int numTras { get; set; }

        public int numCon { get; set; }

        public int numMusd { get; set; }

        public string noLote { get; set; }

        public int corrLote { get; set; }

        public int corrAnal { get; set; }

        public double cantidad { get; set; }

        public int bultos { get; set; }

        public int bultosMu { get; set; }

        public string unidadM { get; set; }

        public DateTime fecIngr { get; set; }

        public DateTime fecContr { get; set; }

        public DateTime fecIni { get; set; }

        public DateTime fecFin { get; set; }

        public DateTime fecUltIn { get; set; }

        public char estado { get; set; }

        public char traslado { get; set; }

        public string tipResul { get; set; }

        public char contraMu { get; set; }

        public int coMuSize { get; set; }

        public char muesDes { get; set; }

        public int muDeSize { get; set; }

        public string ctaCalidad { get; set; }

        public string cCCode { get; set; }

        public string prjCode { get; set; }

        public string comment { get; set; }

        public char reanalis { get; set; }

        public List<RegInspeccionDetail> detalle { get; set; }

        public RegInspeccionHeader()
        {
        }

        public RegInspeccionHeader(int docNum, string objeto, char transfered, char status, string itemCode, string itemName, string whsCode, string whsDest, int numTras, int numCon, int numMusd, string noLote, int corrLote, int corrAnal, double cantidad, int bultos, int bultosMu, string unidadM, DateTime fecIngr, DateTime fecContr, DateTime fecIni, DateTime fecFin, DateTime fecUltIn, char estado, char traslado, string tipResul, char contraMu, int coMuSize, char muesDes, int muDeSize, string ctaCalidad, string cCCode, string prjCode, string comment, char reanalis)
        {
            this.docNum = docNum;
            this.objeto = objeto;
            this.transfered = transfered;
            this.status = status;
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.whsCode = whsCode;
            this.whsDest = whsDest;
            this.numTras = numTras;
            this.numCon = numCon;
            this.numMusd = numMusd;
            this.noLote = noLote;
            this.corrLote = corrLote;
            this.corrAnal = corrAnal;
            this.cantidad = cantidad;
            this.bultos = bultos;
            this.bultosMu = bultosMu;
            this.unidadM = unidadM;
            this.fecIngr = fecIngr;
            this.fecContr = fecContr;
            this.fecIni = fecIni;
            this.fecFin = fecFin;
            this.estado = estado;
            this.traslado = traslado;
            this.tipResul = tipResul;
            this.contraMu = contraMu;
            this.coMuSize = coMuSize;
            this.muesDes = muesDes;
            this.muDeSize = muDeSize;
            this.ctaCalidad = ctaCalidad;
            this.cCCode = cCCode;
            this.prjCode = prjCode;
            this.comment = comment;
            this.reanalis = reanalis;
        }
    }
}