/*
 * 6. Escribe un programa que permita introducir vector de diez elementos
 * numéricos, visualizarlo y luego indicar cuales elementos son pares y ocupan
 * una posición par, indicar contenido y posición.
 * Repetir para contenido múltiplo de tres y posición impar
 */
package dam.programacion.juanminm.u06.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayNum = new int[10];
        int suma = 0;
        int contarNumParPosPar = 0;
        int contarMultiplo3PosImpar = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.printf("Introduzca el %dº número: ", i + 1);
            arrayNum[i] = scan.nextInt();
        }
        System.out.println();

        for (int num: arrayNum) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 == 0 && i % 2 == 0) {
                System.out.printf("Pos %d: %d%n", i, arrayNum[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 3 == 0 && i % 2 == 1) {
                System.out.printf("Pos %d: %d%n", i, arrayNum[i]);
            }
        }
    }
}
