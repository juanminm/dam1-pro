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
public class Programa2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        String string2;

        System.out.println("Introduzca una cadena de caracteres: ");
        string = scan.nextLine();

        string2 = string.replaceAll("[a-zñç]", "a");
        System.out.println(string2);
    }
}
