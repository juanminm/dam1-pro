/*
 * 4. Introducir A y B que sea mayor que A. Visualizar los números de A hasta B
 * e indicar cuantos hay que sean pares
 */
package dam.programacion.juanminm.ejercicioud202;

import java.util.Scanner;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, pares = 0;

        System.out.print("Introduzca primer número: ");
        a = s.nextInt();

        do {
            System.out.print("Introduzca segundo número (debe ser mayor que el "
                    + "primero: ");
            b = s.nextInt();
        } while (a >= b);

        System.out.println("Los  numeros del " + a + " al " + b + " son:");
        for (int i = a; i <= b; i++) {
            if (i < b) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }

            if (i % 2 == 0) {
                pares++;
            }
        }

        System.out.println("\nHay " + pares + " pares entre el " + a + " y el "
                + b);
    }
}
