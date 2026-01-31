/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete03.Evaluar;
import paquete04.MensajeAlerta;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Pole
 */
public class Datos {
    public static Scanner entrada = new Scanner(System.in);

    public static String[] obtenerDias() {
        return new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    }

    public static String[] obtenerMomentos() {
        return new String[]{"Mañana", "Tarde", "Noche"};
    }

    public static double[] configurarLimites(String[] momentos) {
        entrada.useLocale(Locale.US);
        double[] limites = new double[3];
        System.out.println("--- CONFIGURACIÓN DE METAS DIARIAS ---");
        
        double suma = 0;
        
        for (int i = 0; i < 3; i++) {
            
            limites[i] = paquete03.Evaluar.leerLimiteDiario(momentos[i]);
            suma += limites[i];
        }
        System.out.printf("El límite diario es: %.1f",suma);
        return limites;
    }
    
    public static double[][] capturarUso(String[] dias, String[] momentos, double[] limites) {
        double[][] matriz = new double[3][7];
        for (int j = 0; j < 7; j++) {
            System.out.println("\n--- REGISTRO: " + dias[j] + " ---");
            for (int i = 0; i < 3; i++) {
                matriz[i][j] = Evaluar.leerHoraValida(momentos[i]);
                MensajeAlerta.mensajeAlerta(matriz[i][j], limites[i], momentos[i]);
            }
        }
        return matriz;
    }
}
