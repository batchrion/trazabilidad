using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ClarisseWMS
{
    public class RegistroInspeccion
    {
        public string bodegaOrigen { get; set; }
        public string producto { get; set; }
        public string lote { get; set; }
        public double cantidadProducto { get; set; }
        public int numeroBultos { get; set; }
        public int muestraBultos { get; set; }
        public char traslado { get; set; }
        public DateTime fechaIngreso { get; set; }
        public string unidadMedida { get; set; }
        public DateTime fechaInicio { get; set; }
        public DateTime fechaFin { get; set; }
        public char reanalisis { get; set; }
        public int corrAnal { get; set; }
        public int docnum { get; set; }
        public DateTime fechaControl { get; set; }
        public int corrLote { get; set; }
        public DateTime fechaUltIn { get; set; }
        public string centroCosto { get; set; }
        public string tipoResultado { get; set; }
        public string bodegaDestino { get; set; }
        public string proyecto { get; set; }
        public char contraMuestra { get; set; }
        public char muestDes { get; set; }
        public char resultado { get; set; }
        public string comentario { get; set; }
        public string cuentaCalidad { get; set; }

        public RegistroInspeccion()
        {
            
        }
    }
}