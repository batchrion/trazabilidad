using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ClarisseWMS
{
    public class RegInspeccionDetail
    {
        public int docEntry { get; set; }

        public int lineId { get; set; }

        public int visOrder { get; set; }

        public string objeto { get; set; }

        public int logInst { get; set; }

        public string codAtr { get; set; }

        public string nameAtr { get; set; }

        public char cualitat { get; set; }

        public char critico { get; set; }

        public string tipoMues { get; set; }

        public string rango { get; set; }

        public char tipoDef { get; set; }

        public string aql { get; set; }

        public int tiempoDu { get; set; }

        public int standAtr { get; set; }

        public int minimo { get; set; }

        public int maximo { get; set; }

        public int medicion { get; set; }

        public string codEquipo { get; set; }

        public string instrucciones { get; set; }

        public string comentario { get; set; }

        public RegInspeccionDetail()
        {
        }

        public RegInspeccionDetail(int docEntry, int lineId, int visOrder, string objeto, int logInst, string codAtr, string nameAtr, char cualitat, char critico, string tipoMues, string rango, char tipoDef, string aql, int tiempoDu, int standAtr, int minimo, int maximo, int medicion, string codEquipo, string instrucciones, string comentario)
        {
            this.docEntry = docEntry;
            this.lineId = lineId;
            this.visOrder = visOrder;
            this.objeto = objeto;
            this.logInst = logInst;
            this.codAtr = codAtr;
            this.nameAtr = nameAtr;
            this.cualitat = cualitat;
            this.critico = critico;
            this.tipoMues = tipoMues;
            this.rango = rango;
            this.tipoDef = tipoDef;
            this.aql = aql;
            this.tiempoDu = tiempoDu;
            this.standAtr = standAtr;
            this.minimo = minimo;
            this.maximo = maximo;
            this.medicion = medicion;
            this.codEquipo = codEquipo;
            this.instrucciones = instrucciones;
            this.comentario = comentario;
        }
    }
}