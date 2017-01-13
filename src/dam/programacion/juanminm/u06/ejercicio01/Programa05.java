/*
 * 5. Escribe un método que, dada una cadena de caracteres, cuente cuántas veces
 * aparece la misma en dicho texto. Por ejemplo, para la cadena “En un lugar de
 * la mancha, de cuyo nombre no puedo acordarme”, si se cuenta cuántas veces
 * aparece “o”, o dicho de otra forma, cuántas palabras acaban en o, debería
 * indicar que son 3.
 */
package dam.programacion.juanminm.u06.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa05 {
    public static void contarCadenas(String cadena, String terminoBusqueda) {
        int contador = 0;
        int posicion = 0;

        while (posicion != -1) {
            posicion = cadena.indexOf(terminoBusqueda, posicion);

            if (posicion != -1) {
                posicion++;
                contador++;
            }
        }

        System.out.printf("El termino \"%s\" en el texto \"%s\" aparece %d"
                + " veces.%n",
                terminoBusqueda, cadena, contador);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena, terminoBusqueda;

        System.out.print("Introduzca una cadena de caracteres: ");
        cadena = scan.nextLine();
        System.out.print("Introduzca el termino de busqueda: ");
        terminoBusqueda = scan.nextLine();

        contarCadenas(cadena, terminoBusqueda);
    }
}
