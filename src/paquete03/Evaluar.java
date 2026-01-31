/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Pole
 */
public class Evaluar {

    public static Scanner entrada = new Scanner(System.in);

    public static double leerLimiteDiario(String m) {
        entrada.useLocale(Locale.US);
        double h;
        do {
            System.out.print("Ingrese el limite de horas para la " + m + ": ");
            h = entrada.nextDouble();

            if (h <= 0) {
                System.out.println(">> Error: Debe ser mayor a 0.");
            }

        } while (h <= 0);

        return h;
    }

    public static double leerHoraValida(String m) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double h;
        do {
            System.out.print("Ingrese las horas de uso para la " + m + ": ");
            h = entrada.nextDouble();

            if (h <= 0) {
                System.out.println(">> Error: Debe ser mayor a 0.");
            }

        } while (h <= 0);

        return h;
    }

    public static String[][] evaluar(double[][] reg, double[] lim) {

        String[][] estado = new String[3][7];

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 3; i++) {

                if (reg[i][j] <= lim[i]) {

                    estado[i][j] = "Cumplió";
                } else {

                    estado[i][j] = "No cumplió";
                }

            }
        }
        return estado;
    }

}
