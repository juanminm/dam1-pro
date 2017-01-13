/*
 * Ejercicio 11.
 *
 * Escribe un programa que defina dos variables enteras para describir las
 * longitudes de los lados de un rectángulo. El programa debe calcular y
 * escribir en la pantalla las longitudes de los lados, el perímetro y el área
 * del rectángulo. (Supón que el rectángulo mide 15 cm de alto y 25 cm de
 * ancho.)
 */
package dam.programacion.juanminm.u02.ejercicio01;

public class Programa11 {
    public static void main(String[] args) {
        int ancho = 15;
        int alto = 25;

        System.out.println("Longitud (anchura): " + ancho + " cm");
        System.out.println("Longitud (altura): " + alto + " cm");
        System.out.println("Perímetro: " + (2*ancho + 2*alto) + " cm");
        System.out.println("Area: " + (ancho * alto) + " cm2");
    }
}
