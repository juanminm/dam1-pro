/*
 * 7. Escribe un programa que permita introducir un vector de 50 elementos
 * numéricos e indique luego cual es el primer elemento cuyo contenido sea cero.
 * Si no lo hubiera, debe indicarlo.
 */
package dam.programacion.juanminm.u06.ej02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayNum = new int[50];
        int posCero = 0;
        boolean ceroEncontrado = false;

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.printf("Introduzca el %dº número: ", i + 1);
            arrayNum[i] = scan.nextInt();
        }
        System.out.println();

        for (int i = 1; i < arrayNum.length; i++) {
            if (arrayNum[i] == 0 && !ceroEncontrado) {
                posCero = i;
                ceroEncontrado = true;
            }
        }

        if (ceroEncontrado) {
            System.out.printf("El primer numero 0 fue encontrado en la"
                    + "posición %d del array.%n", posCero);
        } else {
            System.out.printf("No hay ningun 0 en el array.%n");
        }
    }
}
