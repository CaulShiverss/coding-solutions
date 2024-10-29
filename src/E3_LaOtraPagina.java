import java.util.Scanner;

/**
 * Problema 621 - La Otra Página
 * @platform aceptaelreto.com
 * @link https://aceptaelreto.com/problem/statement.php?id=621
 * @author Sergio Llorente
 * @date 28/10/2024
 */

public class E3_LaOtraPagina {
    public static void main(String[] args) {

        // Declaro las variables que voy a utilizar
        Scanner myScanner = new Scanner(System.in);
        int pagina = 0;
        int numeroPaginas = myScanner.nextInt();

        // Bucle For que itera por las páginas que le proporcionas, determinadas por el primer numero
        for (int i = 1; i <= numeroPaginas; i++) {
            // Si hay un entero lee el numero, si es par le suma 1 y si es impar le resta 1
            if (myScanner.hasNextInt()) {
                pagina = myScanner.nextInt();
                if (pagina % 2 == 0) {
                    System.out.println(pagina + 1);
                } else if (pagina % 2 == 1) {
                    System.out.println(pagina - 1);
                }
            }
        }
        myScanner.close();
    }
}
