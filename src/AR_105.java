import java.util.Scanner;

/**
 * Problema 105 - Ventas
 * @platform aceptaelreto.com
 * @link https://aceptaelreto.com/problem/statement.php?id=105
 * @author Sergio Llorente
 * @date 20/11/2024
 */

public class AR_105 {

    /**
     * Funcion que devuelve el dia de la semana correspondiente al número introducido
     * @param numero
     * @return Dia de la semana
     */
    public static String diaSemana(int numero) {
        String dia = "?";
        switch (numero) {
            case 1:
                dia = "MARTES";
                break;
            case 2:
                dia = "MIERCOLES";
                break;
            case 3:
                dia = "JUEVES";
                break;
            case 4:
                dia = "VIERNES";
                break;
            case 5:
                dia = "SABADO";
                break;
            case 6:
                dia = "DOMINGO";
                break;
            default:
                dia = "?";
                break;
        };
        return dia;
    }


    public static void main(String[] args) {
        // Creo el Scanner y la bandera
        Scanner myScanner = new Scanner(System.in);
        boolean running = true;
        // Mientras la primera entrada de una semana no sea -1 se seguiran evaluando semanas
        while (running) {
            // Por cada semana reseteo las variables
            double ganancia; // Valor diario
            double menorGanancia = Integer.MAX_VALUE;
            String menorDia = "";
            double mayorGanancia = Integer.MIN_VALUE;
            String mayorDia = "";
            double mediaSemanal = 0; // Suma de todos los valores diarios
            String rentabilidad = "";
            for (int i = 1; i <= 6; i++) {
                // Por cada dia de la semana (6) hago las comprobaciones
                ganancia = myScanner.nextDouble();
                // Si el primer dia hay una ganancia de -1 el programa acaba.
                if (ganancia == -1 && i == 1){
                    running = false;
                    return;
                    // Si no compruebo si es la menor o mayor ganancia de la semana
                } else {
                    if (ganancia > mayorGanancia) {
                        mayorGanancia = ganancia;
                        // Si quiero actualizar la variable mayorDia o menorDia ejecuto la función
                        // diaSemana() que devuelve un dia dependiendo del indice del bucle
                        mayorDia = diaSemana(i);
                    } else if (ganancia == mayorGanancia) {
                        mayorDia = "EMPATE";
                    }

                    if (ganancia < menorGanancia) {
                        menorGanancia = ganancia;
                        menorDia = diaSemana(i);
                    } else if (ganancia == menorGanancia) {
                        menorDia = "EMPATE";
                    }

                    // Cada dia sumo la ganancia a la media semanal
                    mediaSemanal += ganancia;

                    // Si es domingo (6), calculo que la media de la semana
                    // (la suma de todas las ganancias diarias / numero de dias)
                    // es mayor o menor que las ganancias del domingo
                    if (i == 6) {
                        if (mediaSemanal/6 < ganancia) {
                            rentabilidad = "SI";
                        } else {
                            rentabilidad = "NO";
                        }
                    }
                }
            }
            // Al finalizar la semana reporto los resultados
            System.out.println(mayorDia + " " + menorDia + " " + rentabilidad);
        }
    }
}
