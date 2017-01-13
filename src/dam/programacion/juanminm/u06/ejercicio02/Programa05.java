/*
 * 5. Escribe un programa que permita leer una secuencia de 50 números,
 * guardarlos en un vector. Calcular e imprimir la suma de aquellos cuyo
 * contenido sea par.
 */
package dam.programacion.juanminm.u06.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayNum = new int[50];
        int suma = 0;

        for (int i = 0; i <= arrayNum.length; i++) {
            System.out.printf("Introduzca el %dº número: ", i + 1);
            arrayNum[i] = scan.nextInt();
        }
        System.out.println();

        for (int num: arrayNum) {
            if (num % 2 == 0) {
                suma += num;
            }
        }
        System.out.printf("La suma es: %d%n", suma);
    }
}
