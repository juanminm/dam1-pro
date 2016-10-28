/*
 * 1. Escribe un método que devuelva la suma de dos enteros.
 */
package dam.programacion.juanminm.ejercicioud04e01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa01 {

    static int suma(int operando1, int operando2) {
        return operando1 + operando2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operando1, operando2;

        System.out.print("Introduzca el primer operando a sumar: ");
        operando1 = scan.nextInt();
        System.out.print("Introduzca el segundo operando a sumar: ");
        operando2 = scan.nextInt();

        System.out.println("La suma de ambos números es: " + suma(operando1,
                operando2));
    }
}
