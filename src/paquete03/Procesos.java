/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;



/**
 *
 * @author Pole
 */
public class Procesos {

    public static double calcularLimiteTotal(double[] limites) {
        double suma = 0;
        for (double l : limites) {
            suma = suma + l;
        }
        return suma;
    }
    
    public static double[] calcularDiferencias(double[] totalDia, double limiteDiario) {
        double[] diferencia = new double[7];
        for (int j = 0; j < 7; j++) {
            diferencia[j] = totalDia[j] - limiteDiario;
        }
        return diferencia;
        
    }

    public static double[] calcularPromedios(double[][] registro) {
        
        double[] promedios = new double[3];

        
        for (int i = 0; i < 3; i++) {
            double suma = 0;

            
            for (int j = 0; j < 7; j++) {
                suma = suma + registro[i][j];
            }

            promedios[i] = suma / 7;
        }

        return promedios;
    }

    public static double[] calcularTotales(double[][] reg) {
        double[] totales = new double[7];
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 3; i++) {
                totales[j] = totales[j] + reg[i][j];
            }
        }
        return totales;
    } // esta funcion suma las horas usadas por dia

    public static int[] contarResultados(String[][] status) {
        int[] conteo = {0, 0}; // {cumplio, no cumplio}
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 3; i++) {
                if (status[i][j].equals("Cumplió")) {
                    conteo[0]++;
                } else {
                    conteo[1]++;
                }
            }
        }
        return conteo;
    }

}
