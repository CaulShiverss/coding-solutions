import java.util.Scanner;

/**
 * Problema 664 - Gálibo
 * @platform aceptaelreto.com
 * @link https://aceptaelreto.com/problem/statement.php?id=664
 * @author Sergio Llorente
 * @date 28/11/2024
 */

public class AR_664 {
    public static void main(String[] args) {
        // Creo el Scanner y la Flag
        Scanner myScanner = new Scanner(System.in);
        boolean running = true;
        // ----- Bucle del Programa -----
        while (running) {
            int puentes = myScanner.nextInt(); // Leo cuantos puentes hay
            int alturaMaxima = Integer.MAX_VALUE;
            int alturaMaximaTrayecto = Integer.MIN_VALUE;
            int altura = 0;
            // Si no hay puentes salgo del programa
            if (puentes == 0) {
                running = false;
            } else {
                // ----- Bucle de Puentes -----
                for (int i = 1; i <= puentes; i++) {
                    int carriles = myScanner.nextInt(); // Leo los carriles

                    // ----- Bucle de Carriles -----
                    for (int j = 1; j <= carriles; j++) {
                        altura = myScanner.nextInt(); // Leo la altura máxima de un carril
                        // Por cada carril compruebo más altos que la altura maxima
                        if (altura > alturaMaximaTrayecto) {
                            alturaMaximaTrayecto = altura;
                        }
                    }

                    // Por cada puente compruebo si su altura máxima es menor que el anterior puente
                    if (alturaMaximaTrayecto < alturaMaxima) {
                        alturaMaxima = alturaMaximaTrayecto; // Si es menor actualizo la alturaMaxima
                    }
                    // Reseteo la variable para el proximo puente
                    alturaMaximaTrayecto = Integer.MIN_VALUE;
                }
                // Imprimo la alturaMaxima que puede tener un camión
                System.out.println(alturaMaxima);
            }
        }
    }
}

