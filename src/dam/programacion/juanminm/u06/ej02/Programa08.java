/*
 * 8. Escribe un programa que permita introducir vector de veinte elementos y
 * visualizar, indicar luego posición y contenido de todos aquellos que sean
 * mayores que diez. Indicando cuantos elementos hay que cumplen esta condición.
 */
package dam.programacion.juanminm.u06.ej02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayNum = new int[20];
        int contador = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.printf("Introduzca el %dº número: ", i + 1);
            arrayNum[i] = scan.nextInt();
        }
        System.out.println();

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] >= 10) {
                System.out.printf("Pos %d: %d%n", i, arrayNum[i]);
                contador++;
            }
        }
        System.out.printf("Hay %d diezes.%n", contador);
    }
}
