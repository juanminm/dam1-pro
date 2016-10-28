/*
 * 3. Escribe un método que devuelva el mayor de dos números
 */
package dam.programacion.juanminm.ejercicioud04e01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa03 {
    static int obtenerMayor (int a, int b) {
        return a >= b ? a : b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.print("Introduzca el primer número a comparar: ");
        a = scan.nextInt();
        System.out.print("Introduzca el segundo número a comparar: ");
        b = scan.nextInt();

        System.out.println("El número mayor es: " + obtenerMayor(a, b));
    }
}
