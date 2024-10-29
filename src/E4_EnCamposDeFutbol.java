import java.util.Scanner;

/**
 * Problema 403 - En Campos de Futbol
 * @platform aceptaelreto.com
 * @link https://aceptaelreto.com/problem/statement.php?id=403
 * @author Sergio Llorente
 * @date 28/10/2024
 */

public class E4_EnCamposDeFutbol {
    public static void main(String[] args) {

        // Declaro el Scanner y las variables con el tamaño maximo y minimo de un campo
        Scanner myScanner = new Scanner(System.in);
        int campoPequeño = 90*45;
        int campoGrande = 120*90;

        // Obtengo en numero de casos que voy a procesar
        int casos = myScanner.nextInt();

        // Bucle que itere por todos los casos
        for (int i = 1; i <= casos; i++) {
            // Cojo la medida total y la estimacion en campos
            int medida = myScanner.nextInt();
            int estimacion = myScanner.nextInt();
            // Calculo cual seria la medida minima y la maxima
            int superficieMinima = campoPequeño * estimacion;
            int superficieMaxima = campoGrande * estimacion;

            // Si la medida total es mayor que la medida minima y mayor que la maxima imprimo "SI". Si no imprimo "NO"
            if (medida >= superficieMinima && medida <= superficieMaxima) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
