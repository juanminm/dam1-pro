/*
 * 14. Escribe un programa que permita, a partir de un vector V de 50 elementos,
 * crear e imprimir un vector P con los elementos de V cuyo contenido sea par.
 * Si no lo hubiera visualizar el mensaje adecuado.
 */
package dam.programacion.juanminm.u06.ejercicio02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        boolean esPar;
        int posArrayV = 0;

        int[] arrayV = new int[50];
        int[] arrayP = new int[50];

        for (int i = 0; i < arrayV.length; i++) {
//            System.out.printf("Introduzca el %dº número: ", i);
//            arrayV[i-1] = scan.nextInt();
            arrayV[i] = random.nextInt(50)+1;
        }
        System.out.println();

       for (int num: arrayV) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        for (int i = 0; i < arrayP.length; i++) {
            esPar = false;
            if (posArrayV < arrayV.length) {
                for (int j = posArrayV; j < arrayV.length; j++) {
                    if (!esPar) {
                        if (arrayV[j] % 2 == 0) {
                            arrayP[i] = arrayV[j];
                            esPar = true;
                        }
                        posArrayV = j + 1;
                    }
                }
            }
        }

        for (int num: arrayP) {
            System.out.printf("%d ", num);
        }
    }
}
