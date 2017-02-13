/*
 * 1. Escribe un programa que permita introducir los valores de un vector de
 * diez elementos numéricos y luego imprimirlos.
 */
package dam.programacion.juanminm.u06.ej02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa01 {
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
    }
}
