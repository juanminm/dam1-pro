/*
 * 4. Escribe un método que, dada una cadena de caracteres, sustituya todas las
 * ocurrencias del texto “es” por “no por”. Escribe un segundo método que
 * sustituya todos los grupos de dígitos por un único carácter asterisco, es
 * decir, si la cadena de caracteres es “esto1234es5678bueno900” el primer
 * método debe devolver “no porto1234no por5678bueno900” y el segundo debe
 * devolver “esto*es*bueno*”. Escribe el programa que permita comprobar que
 * funciona correctamente.
 *
 * Nota:    La expresión regular \\d+ significa un dígito o más.
 *          Puedo usar replaceAll(“\\d+”,“*”);
 *          Más información sobre expresiones regulares en Java:
 *
 * http://chuwiki.chuidiang.org/index.php?title=Expresiones_Regulares_en_Java
 * http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html#sum
 */
package dam.programacion.juanminm.ejercicioud06e01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa4 {
    public static String reemplazarTexto(String cadena) {
        return cadena.replaceAll("es", "no por");
    }

    public static String reemplazarDigitos(String cadena) {
        return cadena.replaceAll("\\d+", "*");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena;

        System.out.print("Introduzca una cadena de caracteres: ");
        cadena = scan.nextLine();

        System.out.println(reemplazarTexto(cadena));
        System.out.println(reemplazarDigitos(cadena));
    }
}
