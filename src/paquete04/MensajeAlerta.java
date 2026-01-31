/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author Pole
 */
public class MensajeAlerta {

    public static void mensajeAlerta(double hora, double limite, String momento) {
        if (hora > limite) {
            System.out.println("¡¡ALERTA!!: Superaste el límite de la " + momento);

            switch (momento) {
                case "Mañana":
                    System.out.println("Consejo: Prioriza tu hidratación y "
                            + "desayuno antes que las notificaciones.\n"
                            + "------------------------------------");
                    break;

                case "Tarde":
                    System.out.println("Consejo: Establece un bloque de 'Trabajo "
                            + "Profundo' de 60 minutos sin notificaciones.\n"
                            + "------------------------------------");
                    break;

                case "Noche":
                    System.out.println("Consejo: Evita la luz azul antes de dormir.\n"
                            + "------------------------------------");
                    break;

                default:
            }

        } else {
            System.out.println("¡Muy bien! Respetaste el límite de la " + momento + "\n"
                    + "------------------------------------");
        }
    }

}
