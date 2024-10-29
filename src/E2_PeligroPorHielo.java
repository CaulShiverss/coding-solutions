import java.util.Scanner;

/**
 * Problema 608 - Peligro Por Hielo
 * @platform aceptaelreto.com
 * @link https://aceptaelreto.com/problem/statement.php?id=608
 * @author Sergio Llorente
 * @date 28/10/2024
 */

public class E2_PeligroPorHielo {
    public static void main(String[] args) {

        // Declaracion del Scanner y el Centinela
        Scanner myScanner = new Scanner(System.in);
        boolean running = true;

        // Bucle del programa
        while (running) {

            // Declaracion de variables
            boolean avisoDisponible = true;
            int temperatura;
            int totalTemperaturas;
            int avisos = 0;

            // Leo el primer numero de la serie que indica cuantas temperaturas se han recogido
            totalTemperaturas = myScanner.nextInt();

            // Si es cero detengo el programa
            if (totalTemperaturas == 0) {
                running = false;

            } else {
                // Con un bucle for leo las todas las temperaturas de la serie, indicadas por totalTemperaturas
                for (int i = 1; i <= totalTemperaturas; i++) {
                    temperatura = myScanner.nextInt();
                    // Si la temperatura es menor o igual que 4 y el aviso está disponible sumamos 1 a avisos y deshabilitamos el aviso
                    if (temperatura <= 4 && avisoDisponible) {
                        avisos++;
                        avisoDisponible = false;
                    // Si la temperatura es mayor que 6 habilitamos el aviso
                    } else if (temperatura > 6) {
                        avisoDisponible = true;
                    }
                }
                // Al final de cada serie imprimo cuantas veces ha sonado el aviso
                System.out.println(avisos);
            }
        }
    }
}
