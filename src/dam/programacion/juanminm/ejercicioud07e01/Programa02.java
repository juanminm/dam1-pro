/*
 * 2.- Unidad 3 Ejercicio 01. Diseña un algoritmo que lea 3 números de teclado y
 *     si se han introducido en orden descendente lo indique con un mensaje.
 */
package dam.programacion.juanminm.ejercicioud07e01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        boolean validInt = false;

        do {
            try {
                System.out.printf("Introduca el primer número: ");
                a = scan.nextInt();
                System.out.printf("Introduca el segundo número: ");
                b = scan.nextInt();
                System.out.printf("Introduca el tercer número: ");
                c = scan.nextInt();
                if (a > b && b > c) {
                    System.out.printf("Has introducido %d, %d y %d en orden"
                            + "descentente.%n", a, b, c);
                } else {
                    System.out.printf("No has introducido %d, %d y %d en orden"
                            + "descentente.%n", a, b, c);
                }
                validInt = true;
            } catch (InputMismatchException e) {
                System.err.printf("ERROR. El valor introducido debe ser un"
                        + "entero.%n");
                scan.nextLine();
            }

        } while (!validInt);
    }
}

