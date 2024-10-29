import java.util.Scanner;

/**
 * Problema 605 - Ordenando El Armario
 * @platform aceptaelreto.com
 * @link https://aceptaelreto.com/problem/statement.php?id=605
 * @author Sergio Llorente
 * @date 28/10/2024
 */

public class E1_OrdenandoElArmario {
    public static void main(String[] args) {

        // Declaracion de el Scanner y el Centinela
        Scanner myScanner = new Scanner(System.in);
        boolean running = true;

        // Bucle del Programa
        while (running) {

            // Declaracion de variables
            int verano = 0;
            int invierno = 0;
            String ropa;

            // Mientras el caracter no sea un "." ejecuto el bucle
            do {
                ropa = myScanner.next();
                switch (ropa) {
                    // Si el caracter es "V" sumo 1 a verano
                    case "V":
                        verano++;
                        break;
                    // Si el caracter es "I" sumo 1 a invierno
                    case "I":
                        invierno++;
                        break;
                    // Si el caracter es "A" sumo 1 a ambos
                    case "A":
                        verano++;
                        invierno++;
                        break;
                }
            } while (!(ropa.equals(".")));

            // Por cada serie de caracteres imprimo si han habido más prendas de VERANO o INVIERNO
            if (verano > invierno) {
                System.out.println("VERANO");
            } else if (invierno > verano) {
                System.out.println("INVIERNO");
              // Si ambas variable están a 0 significa que el primer caracter fué un ".", por lo tanto salimos del programa
            } else if (invierno == 0 && verano == 0){
                running = false;
              // Si ambas variables tienen el mismo valor reportamos un empate
            } else {
                System.out.println("EMPATE");
            }
        }
    }
}
