/*
 * 3.- Unidad 3 ejercicio 03. Diseña un algoritmo, que indique si dos números
 *     introducidos desde el teclado son iguales y en caso de no serlo indicar
 *     cual es el mayor de ellos.
 */
package dam.programacion.juanminm.u07.ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;

        try {
            System.out.printf("Introduzca el primer número: ");
            a = scan.nextInt();
            System.out.printf("Introduzca el segundo número: ");
            b = scan.nextInt();

            if (a == b) {
                System.out.printf("Ambos números son iguales.");
            } else if (a > b) {
                System.out.printf("El primer número, %d, es mayor que el "
                        + "segundo, %d.%n", a, b);
            } else {
                System.out.printf("El segundo número, %d, es mayor que el "
                        + "primero, %d.$n", b, a);
            }
        } catch (InputMismatchException e) {
            System.err.println("El valor introducido no es un número.");
        }
    }
}

