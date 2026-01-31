/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;
import paquete03.Procesos;
/**
 *
 * @author Pole
 */
public class Reporte {
    public static void generarReporte(double[][] registro, String[][] estado, double[] totales, double[] promedios, 
                                      String[] dias, String[] momentos,
                                      double[] dif) {
        
        String reporte = "";
        reporte = reporte + "\n============ REPORTE SEMANAL DE BIENESTAR DIGITAL ============\n";
        for (int j = 0; j < 7; j++) {
            reporte = reporte + "DÍA: " + dias[j] + "\n";

            for (int i = 0; i < 3; i++) {
                reporte = reporte + "  > " + momentos[i] + ": " + registro[i][j] + " hrs. [" + estado[i][j] + "]\n";
            }

            
            reporte = reporte + "TOTAL DEL DÍA: " + totales[j] + " hrs.\n";
            
            if (dif[j] > 0) {
                reporte = reporte + "RESULTADO: Fallaste por " + String.format("%.2f", dif[j]) + " hrs.\n";
            } else {
                reporte = reporte + "RESULTADO: ¡Excelente! Te sobraron " + String.format("%.2f", Math.abs(dif[j])) + " hrs.\n";
            }
            reporte = reporte + "---------------------------------------------------------\n";
        }

        reporte = reporte + "============ RESUMEN DE HÁBITOS (PROMEDIOS) ============\n";
        
        for (int i = 0; i < 3; i++) {
            reporte = reporte + "Promedio en la " + momentos[i] + ": " + String.format("%.2f", promedios[i]) + " hrs.\n";
        }

        
        int[] resultados = Procesos.contarResultados(estado);
        reporte = reporte + "============ METAS DE LA SEMANA ============\n";
        reporte = reporte + "CUMPLIDAS: " + resultados[0] + "\nFALLIDAS: " + resultados[1] + "\n";

        System.out.println(reporte);
    }
    
    
}
