/*
 * 4. Escribe un método que devuelva el mayor de tres números
 */
package dam.programacion.juanminm.u04.ej01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa04 {
    static int obtenerMayor (int a, int b, int c) {
        if(a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        System.out.print("Introduzca el primer número a comparar: ");
        a = scan.nextInt();
        System.out.print("Introduzca el segundo número a comparar: ");
        b = scan.nextInt();
        System.out.print("Introduzca el tercer número a comparar: ");
        c = scan.nextInt();

        System.out.println("El número mayor es: " + obtenerMayor(a, b, c));
    }
}