import java.util.Scanner;

public class AR_532 {
    /**
     * Funcion que recibe el precio neto y el total de un producto y te devuelve el precio del envase
     * @param neto Peso Neto
     * @param total Peso Total
     * @return Peso del Envase
     */
    static int parsePeso(int neto, int total) {
        return total - neto;
    }

    public static void main(String[] args) {
        //Variables a usar
        Scanner myScanner = new Scanner(System.in);
        int pesoNeto;
        int pesoTotal;
        int envase;
        int casos = myScanner.nextInt();

        //Bucle que itera por todos los casos de prueba
        for (int i = 1; i <= casos; i++) {
            pesoNeto = myScanner.nextInt();
            pesoTotal = myScanner.nextInt();
            //LLamo a la funcion que resuelve el precio
            envase = parsePeso(pesoNeto, pesoTotal);
            //Imprimo el resultado
            System.out.println(envase);
        }
    }
}
