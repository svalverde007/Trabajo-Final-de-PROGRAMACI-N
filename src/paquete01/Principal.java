package paquete01;


import paquete02.Datos;
import paquete03.Procesos;
import paquete03.Evaluar;
import paquete04.Reporte;

public class Principal {

    public static void main(String[] args) {
        
        String[] dias = Datos.obtenerDias();
        String[] momentos = Datos.obtenerMomentos();
        double[] limites = Datos.configurarLimites(momentos);
        
        double[][] registro = Datos.capturarUso(dias, momentos, limites);
        
        String[][] diagnostico = Evaluar.evaluar(registro, limites);
        
        double[] totalesPorDia = Procesos.calcularTotales(registro); 
        
        double limTotalDiario = Procesos.calcularLimiteTotal(limites);
        double[] diferenciasDiarias = Procesos.calcularDiferencias(totalesPorDia, limTotalDiario);
        
        
        double[] promediosMomento = Procesos.calcularPromedios(registro);

        Reporte.generarReporte(registro, diagnostico, totalesPorDia, 
                promediosMomento, dias, momentos, diferenciasDiarias); 
    }
}

