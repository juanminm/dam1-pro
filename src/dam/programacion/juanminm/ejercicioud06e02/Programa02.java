/*
 * 2. Escribe un programa que permita introducir un vector de diez elementos
 * alfanuméricos y luego visualizar los que ocupen la posición par.
 * Repetir para los de posición impar
 */
package dam.programacion.juanminm.ejercicioud06e02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrayNum = new String[10];

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Introduzca el %dº número: ", i);
            arrayNum[i-1] = scan.next();
        }
        System.out.println();

        for (int i = 0; i < arrayNum.length; i += 2) {
            System.out.print(arrayNum[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < arrayNum.length; i += 2) {
            System.out.print(arrayNum[i] + " ");
        }

    }
}
