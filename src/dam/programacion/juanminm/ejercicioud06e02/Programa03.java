/*
 * 3. Escribe un programa que permita introducir un vector de 20 elementos
 * numéricos y visualizarlos de cuatro en cuatro.
 */
package dam.programacion.juanminm.ejercicioud06e02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayNum = new int[20];

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Introduzca el %dº número: ", i);
            arrayNum[i-1] = scan.nextInt();
        }
        System.out.println();

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.printf("%d ", arrayNum[i]);

            if (i % 4 == 3) {
                System.out.println();
            }
        }
    }
}
