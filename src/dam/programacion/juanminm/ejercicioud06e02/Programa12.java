/*
 * 12. Escribe un programa que permita, partiendo de un vector de diez elementos
 * numéricos V, generar un vector P con los elementos de V en orden inverso.
 * Visualizar los dos vectores al final.
 */
package dam.programacion.juanminm.ejercicioud06e02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayNum = new int[10];

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Introduzca el %dº número: ", i);
            arrayNum[i-1] = scan.nextInt();
        }
        System.out.println();

        for (int num: arrayNum) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
