/*
 * 1.- Ejercicio01. Lectura de un numero, hasta que se lee un contenido válido.
 */
package dam.programacion.juanminm.ejercicioud07e01;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.printf("Introduzca el primer número: ");
        try {
            num = scan.nextInt();

            System.out.printf("El nímero introducido es: %d%n", num);
        } catch (InputMismatchException e) {
            System.err.printf("El valor introducido no es un número.%n");
        }
    }
}

