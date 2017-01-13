/*
 * 9. Escribe un programa que permita introducir un vector de veinte elementos y
 * visualizar el vector completo indicando posición y contenido del elemento
 * mayor. En caso de repetición prevalece el primero.
 */
package dam.programacion.juanminm.u06.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayNum = new int[20];
        int posicionMayor = 0;
        int numMayor = Integer.MIN_VALUE;

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.printf("Introduzca el %dº número: ", i + 1);
            arrayNum[i] = scan.nextInt();
        }

        for (int i = 0; i < arrayNum.length; i++) {
            if (numMayor < arrayNum[i]) {
                numMayor = arrayNum[i];
                posicionMayor = i;
            }
        }
        System.out.printf("Posicion del mayor: %10d%n", posicionMayor);
        System.out.printf("Valor del mayor:    %10d%n", numMayor);
    }
}
