/*
 * 3. Escribe un método que, dada una cadena de caracteres, devuelve la mitad
 * inicial de la cadena. Escribe un programa que pruebe el método con las
 * cadenas “Hola que tal” y “Adiós”.
 */
package dam.programacion.juanminm.ejercicioud06e01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa3 {
    public static String devolverMitadCadena(String cadena) {
        int longitudMitad = cadena.length() / 2;

        return cadena.substring(0, longitudMitad);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena;

        System.out.print("Introduzca una cadena de caracteres: ");
        cadena = scan.nextLine();

        System.out.println(devolverMitadCadena(cadena));
    }
}
