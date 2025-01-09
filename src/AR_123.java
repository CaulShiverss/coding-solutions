import java.util.Scanner;

public class AR_123 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean running = true;
        String verbo;
        String tiempo;
        while (running) {
            verbo = myScanner.next();
            tiempo = myScanner.next();
            if (tiempo.equals("T")) {
                running = false;
            } else {
                int conjugacion = conjugacion(verbo);
                String[] terminaciones = terminaciones(tiempo, conjugacion);
                String res = conjugar(verbo, terminaciones);
                System.out.println(res);
            }
        }
    }

    static int conjugacion(String verbo) {
        int conjugacion = 0;
        String terminacion = verbo.substring(verbo.length() -2);
        switch (terminacion) {
            case "ar":
                conjugacion = 1;
                break;
            case "er":
                conjugacion = 2;
                break;
            case "ir":
                conjugacion = 3;
                break;
            default:
                throw new IllegalArgumentException("Terminación no válida: " + terminacion);
        }
        return conjugacion;
    }

    static String[] terminaciones(String tiempo, int conjugacion) {
        String[] res;
        String terminacion = tiempo + conjugacion; // Combina el tiempo y la conjugación (ej: "A2")

        // Definición de terminaciones
        String[] a1 = {"o", "as", "a", "amos", "ais", "an"};
        String[] a2 = {"o", "es", "e", "emos", "eis", "en"};
        String[] a3 = {"o", "es", "e", "imos", "is", "en"};
        String[] p1 = {"e", "aste", "o", "amos", "asteis", "aron"};
        String[] p2 = {"i", "iste", "io", "imos", "isteis", "ieron"};
        String[] p3 = {"i", "iste", "io", "imos", "isteis", "ieron"};
        String[] f1 = {"are", "aras", "ara", "aremos", "areis", "aran"};
        String[] f2 = {"ere", "eras", "era", "eremos", "ereis", "eran"};
        String[] f3 = {"ire", "iras", "ira", "iremos", "ireis", "iran"};

        // Selección de terminaciones según el tiempo y la conjugación
        switch (terminacion) {
            case "A1":
                res = a1;
                break;
            case "A2":
                res = a2;
                break;
            case "A3":
                res = a3;
                break;
            case "P1":
                res = p1;
                break;
            case "P2":
                res = p2;
                break;
            case "P3":
                res = p3;
                break;
            case "F1":
                res = f1;
                break;
            case "F2":
                res = f2;
                break;
            case "F3":
                res = f3;
                break;
            default:
                throw new IllegalArgumentException("Tiempo o conjugación no válida: " + terminacion);
        }
        return res; // Retorna el arreglo de terminaciones
    }

    static String conjugar(String verbo, String[] terminaciones) {
        StringBuilder sb = new StringBuilder();
        String verboParsed = verbo.substring(0, verbo.length() - 2);
        String[] pronombres = {"yo", "tu", "el", "nosotros", "vosotros", "ellos"};
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                sb.append(pronombres[i] + " " + verboParsed+terminaciones[i]);
            } else {
                sb.append(pronombres[i] + " " + verboParsed+terminaciones[i] + "\n");
            }
        }
        return sb.toString();
    }
}