/*
 * 2. Escribe un método que, dado un String, devuelve otro objeto String en el
 * que se cambian todas las vocales minúsculas del original por la letra 'a'.
 * Escribe un programa que permita comprobar el funcionamiento.
 */
package dam.programacion.juanminm.ejercicioud06e01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa02 {
    public static String reemplazarVocales(String cadena) {
        return cadena.replaceAll("[a-zñç]", "a");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena;

        System.out.println("Introduzca una cadena de caracteres: ");
        cadena = scan.nextLine();

        System.out.println(reemplazarVocales(cadena));
    }
}
