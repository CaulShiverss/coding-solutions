import java.util.Scanner;

public class AC_131 {
    /**
     * Funcion que calcula cuantos viajes tarda una persona en llenar la piscina
     * @param piscina
     * @param barreno
     * @param perdida
     * @return
     */
    private static int dameViajes(int piscina, int barreno, int perdida) {
        int viajes = 0;
        int agua = 0;
        // Si la perdida es mayor que el barreño sería una perdida infinita, devuelvo un entero grande para que gane el otro
        if (perdida > barreno) {
            viajes = Integer.MAX_VALUE;
        } else {
            // Mienras la piscina no esté llena le añadimos el barreño y restamos la perdida
            while (agua < piscina) {
                agua += barreno;
                agua -= perdida;
                viajes++;
            }
        }
        // Devuelvoel numero de viajes
        return viajes;
    }

    public static void main(String[] args) {

        // Variables a usar
        Scanner myScanner = new Scanner(System.in);
        int yo;
        int vecino;
        int piscina;
        int piscina_vecino;
        int barreno;
        int barreno_vecino;
        int perdida;
        int perdida_vecino;

        // Mientras una piscina no sea 0, ejecuto el bucle
        while (true) {
            // Recojo las variables
            piscina = myScanner.nextInt();
            barreno = myScanner.nextInt();
            perdida = myScanner.nextInt();
            piscina_vecino = myScanner.nextInt();
            barreno_vecino = myScanner.nextInt();
            perdida_vecino = myScanner.nextInt();

            if (piscina == 0 || piscina_vecino == 0)
                break;

            // LLamo a la funcion con los dos casos
            yo = dameViajes(piscina, barreno, perdida);
            vecino = dameViajes(piscina_vecino, barreno_vecino, perdida_vecino);

            // Según quien ha tardado menos viajes reporto el ganador
            if (yo == vecino) {
                System.out.println("EMPATE " + yo);
            } else if (yo < vecino) {
                System.out.println("YO " + yo);
            } else {
                System.out.println("VECINO " + vecino);
            }
        }
    }
}
