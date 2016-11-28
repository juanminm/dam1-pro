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

        int[] arrayV = new int[10];
        int[] arrayP = new int[10];

        for (int i = 0; i < arrayV.length; i++) {
            System.out.printf("Introduzca el %dº número: ", i);
            arrayV[i] = scan.nextInt();
        }
        System.out.println();

        for (int i = 0; i < arrayP.length; i++) {
            int j = 9 - i;
            arrayP[i] = arrayV[j];
        }

        System.out.printf("Datos del vector V:%n");
        for (int num: arrayV) {
            System.out.printf("%d ", num);
        }

        System.out.printf("%n%nDatos del vector P:%n");
        for (int num: arrayP) {
            System.out.printf("%d ", num);
        }
        System.out.printf("%n");
    }
}
