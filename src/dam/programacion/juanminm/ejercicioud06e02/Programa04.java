/*
 * 4. Escribe un programa que permita introducir vector numérico de diez
 * elementos, visualizarlo y luego visualizar los elementos cuyo contenido sea
 * par, indicando su posición.
 * Repetir para impar.
 */
package dam.programacion.juanminm.ejercicioud06e02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayNum = new int[10];

        for (int i = 0; i <= arrayNum.length; i++) {
            System.out.printf("Introduzca el %dº número: ", i + 1);
            arrayNum[i] = scan.nextInt();
        }
        System.out.println();

        for (int num: arrayNum) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        for (int i = 0; i < arrayNum.length; i += 1) {
            if (arrayNum[i] % 2 == 0) {
                System.out.printf("Pos %d: %d%n", i, arrayNum[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < arrayNum.length; i += 1) {
            if (arrayNum[i] % 2 == 1) {
                System.out.printf("Pos %d: %d%n", i, arrayNum[i]);
            }
        }
    }
}
