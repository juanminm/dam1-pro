/*
 * 5. Escribe un programa que permita leer una secuencia de 50 números,
 * guardarlos en un vector. Calcular e imprimir la suma de aquellos cuyo
 * contenido sea par.
 */
package dam.programacion.juanminm.ejercicioud06e02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa05 {
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
