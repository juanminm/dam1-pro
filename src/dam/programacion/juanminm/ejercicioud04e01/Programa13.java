/*
 * 13. Escribe un programa que solicite un número y visualizar en pantalla si
 * es o no un número perfecto.
 * Un número se considera perfecto cuando la suma de sus divisores, excepto el
 * mismo, es igual al propio número.
 */
package dam.programacion.juanminm.ejercicioud04e01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa13 {
    static boolean esPerfecto(int numero) {
        boolean esPerfecto = false;
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        if (sumaDivisores == numero) {
            esPerfecto = true;
        }

        return esPerfecto;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un número para comprobar si es "
                + "perfecto: ");
        numero = scan.nextInt();

        if (esPerfecto(numero)) {
            System.out.println("El número " + numero + " es un numero "
                    + "perfecto.");
        } else {
            System.out.println("El número " + numero + " no es un numero "
                    + "perfecto.");
        }
    }
}
