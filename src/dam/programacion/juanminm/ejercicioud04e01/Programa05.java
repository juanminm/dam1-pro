/*
 * 5. Diseña un método que devuelva el mayor de cuatro números que se le pasan
 * como argumento
 */
package dam.programacion.juanminm.ejercicioud04e01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa05 {
    static int obtenerMayor (int a, int b, int c, int d) {
        if(a >= b && a >= c && a >= d) {
            return a;
        } else if (b >= c && b >= d) {
            return b;
        } else if (c >= d) {
            return c;
        } else {
            return d;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("Introduzca el primer número a comparar: ");
        a = scan.nextInt();
        System.out.print("Introduzca el segundo número a comparar: ");
        b = scan.nextInt();
        System.out.print("Introduzca el tercer número a comparar: ");
        c = scan.nextInt();
        System.out.print("Introduzca el cuarto número a comparar: ");
        d = scan.nextInt();

        System.out.println("El número mayor es: " + obtenerMayor(a, b, c, d));
    }
}