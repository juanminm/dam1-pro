/*
 * 11. Escribe un programa que permita introducir un vector P de diez elementos
 * numéricos, visualizar su contenido, crear un vector V con los elementos de P
 * que sean mayores de diez. Visualizar luego el contenido de V.
 */
package dam.programacion.juanminm.u06.ej02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayP = new int[10];
        int[] arrayV = new int[10];
        boolean mayorQue10;
        int posArrayP = 0;

        for (int i = 0; i < arrayP.length; i++) {
            System.out.printf("Introduzca el %dº número: ", i + 1);
            arrayP[i] = scan.nextInt();
        }

        for (int num: arrayP) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        for (int i = 0; i < arrayV.length; i++) {
            mayorQue10 = false;
            if (posArrayP < arrayP.length) {
                for (int j = posArrayP; j < arrayP.length; j++) {
                    if (!mayorQue10) {
                        if (arrayP[j] > 10) {
                            arrayV[i] = arrayP[j];
                            mayorQue10 = true;
                        }
                        posArrayP = j + 1;
                    }
                }
            }
        }

        for (int num: arrayV) {
            System.out.printf("%d ", num);
        }
    }
}