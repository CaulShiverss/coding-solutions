import java.util.Scanner;
import java.util.Stack;

/**
 * Problema 141 - Ventas
 * @platform aceptaelreto.com
 * @link https://aceptaelreto.com/problem/statement.php?id=141
 * @author Sergio Llorente
 * @date 10/2/2025
 */

public class AC_141 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Arrays de char que usaré para comprobaciones
        char[] abiertos = {'(', '{', '['};
        char[] cerrados = {')', '}', ']'};

        // Bucle que itera por los casos de prueba
        while (myScanner.hasNextLine()) {
            // Declaro la pila e inicializo las variables por cada prueba
            Stack<Character> pila = new Stack<>();
            boolean correcto = true;
            String linea = myScanner.nextLine();
            char[] lineaArr = linea.toCharArray();
            // Si la linea está vacia salimos del programa
            if (linea.isEmpty()) {
                break;
            } else {
                // Bucle por los caracteres de la linea
                for (int i = 0; i < lineaArr.length; i++) {
                    // Compruebo si el caracter es un simbolo abierto
                    for (char abierto : abiertos) {
                        if (lineaArr[i] == abierto) {
                            // Si lo és lo añadimos a la pila
                            pila.push(abierto);
                        }
                    }
                    // Compruebo si el caracter es un simbolo cerrado
                    for (char cerrado : cerrados) {
                        if (lineaArr[i] == cerrado) {
                            if (!pila.empty()) {
                                // Si lo es y la pila no está vacia comprobamos que coincida el caracter con el de la cima de la pila
                                String mix = Character.toString(pila.peek()) + lineaArr[i];
                                // Si la suma de estos dos caracteres no coinciden, ponemos a falso el boolean
                                if (!(mix.equals("()") || mix.equals("[]") || mix.equals("{}"))) {
                                    correcto = false;
                                } else {
                                    // Si coinciden quitamos el caracter de la pila
                                    pila.pop();
                                }
                            } else {
                                correcto = false;
                            }
                        }
                    }
                }
                // Si la pila ha acabado con algún simbolo sería erronea la serie
                if (!pila.empty()) {
                    correcto = false;
                }
                // Imprimimos el resultado
                System.out.println((correcto) ? "YES" : "NO");
            }
        }
    }
}
