/*
 * 10. Escribe un método que acepte un entero y calcule su factorial n!
 */
package dam.programacion.juanminm.ejercicioud401;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa10 {
    static int factorial(int numero) {
        int factorial = 1;

        for(int i = 0; i <= numero; i++) {
            if (i == 0) {
                factorial *= 1;
            } else {
                factorial *= i;
            }
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un numero para calcular su factorial: ");
        numero = scan.nextInt();
        System.out.println("El factorial de " + numero + " es "
                + factorial(numero));
    }
}
