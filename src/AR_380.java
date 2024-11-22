import java.util.Scanner;

/**
 * Problema 380 - Ventas
 * @platform aceptaelreto.com
 * @link https://aceptaelreto.com/problem/statement.php?id=380
 * @author Sergio Llorente
 * @date 22/11/2024
 */

public class AR_380 {
    public static void main(String[] args) {
        // Creo el scanner y la bandera
        Scanner myScanner = new Scanner(System.in);
        boolean running = true;
        // Bucle Principal
        while (running) {
            int gastos = myScanner.nextInt();
            int totalGastos = 0;
            // Si el total de gastos es 0 acaba el programa
            if (gastos == 0) {
                running = false;
            } else {
                // Sumo todos los gastos de la boda a una variable
                for (int i = 1; i <= gastos; i++) {
                    totalGastos += myScanner.nextInt();
                }
                // Imprimo el gasto total
                System.out.println(totalGastos);
            }
        }
    }
}
