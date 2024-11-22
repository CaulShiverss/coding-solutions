import java.util.Scanner;

/**
 * Problema 313 - Fin de mes
 * @platform aceptaelreto.com
 * @link https://aceptaelreto.com/problem/statement.php?id=313
 * @author Sergio Llorente
 * @date 22/11/2024
 */

public class AR_313 {
    public static void main(String[] args) {
        // Creo es scanner y leo el numero de casos
        Scanner myScanner = new Scanner(System.in);
        int casos = myScanner.nextInt();
        // Ejecuto el bucle por cada caso
        for (int i = 1; i <= casos; i++) {
            // Leo el dinero al principio del més y las ganancias - gastos
            int dinero = myScanner.nextInt();
            int gastos = myScanner.nextInt();
            // Si la suma es mayor de 0 imprimes SI, si es menor NO
            if ((dinero + gastos) >= 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
