import java.util.Scanner;

/**
 * Problema 481 - Ajedrez Asistido Por Computadora
 * @platform aceptaelreto.com
 * @link https://aceptaelreto.com/problem/statement.php?id=481
 * @author Sergio Llorente
 * @date 29/10/2024
 */

public class E6_AjedrezAsistidoPorComputador {
    public static void main(String[] args) {

        // Creo el Scanner, la bandera y la variable donde irá la casilla
        Scanner myScanner = new Scanner(System.in);
        boolean running = true;
        String casilla = " ";

        // Ejecuto el programa hasta que lea un 0
        while (running) {
            // Leo el primer numero que indica la fila y el segundo que indica la columna
            int fila = myScanner.nextInt();
            int columna = myScanner.nextInt();
            // Switch que asigna una letra a el numero de fila
            switch (fila) {
                case 1:
                    casilla = "h" + columna;
                    break;
                case 2:
                    casilla = "g" + columna;
                    break;
                case 3:
                    casilla = "f" + columna;
                    break;
                case 4:
                    casilla = "e" + columna;
                    break;
                case 5:
                    casilla = "d" + columna;
                    break;
                case 6:
                    casilla = "c" + columna;
                    break;
                case 7:
                    casilla = "b" + columna;
                    break;
                case 8:
                    casilla = "a" + columna;
                    break;
                case 0:
                    running = false;
            }
            // Si la fila no es 0 imprimo la casilla
            if (fila != 0) {
                System.out.println(casilla);
            }
        }
    }
}
