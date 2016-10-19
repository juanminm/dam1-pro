/*
 * 9. Escribe un programa que solicite al usuario un número entero positivo. El
 * programa debe presentar en pantalla la descomposición en factores primos de
 * dicho número.
 *
 * Por ejemplo, si el número es 36 debe escribir 36 = 2 * 2 * 3 * 3
 */
package dam.programacion.juanminm.ejercicioud202;

import java.util.Scanner;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, i, restante;

        System.out.print("Introduzca el número a factorizar: ");
        num = s.nextInt();
        restante = num;

        System.out.print("\n" + num + " = ");
        for (i = 2; i<=restante; i++) {
            while (restante % i == 0) {
                if (restante == num) {
                    System.out.print(i);
                } else {
                    System.out.print(" * " + i);
                }

                restante /= i;
            }
        }
    }
}
