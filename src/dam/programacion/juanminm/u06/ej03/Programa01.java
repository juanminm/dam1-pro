/*
 * 1. Introduce una matriz de 5 filas y 7 columnas y a continuación visualiza:
 *
 *   - Toda la matriz.
 *   - La fila cinco completa.
 *   - El elemento de la cuarta fila tercera columna y el elemento de la quinta
 *     fila tercera columna. Intercambiarlos el contenido de estos dos elementos
 *     y visualizarlos de nuevo.
 *   - La primera columna y la cuarta. Intercambiar el contenido de estas
 *     columnas y visualizar las de nuevo
 */
package dam.programacion.juanminm.u06.ej03;

import java.util.Random;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[5][7];
        int temp;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(5*7)+1;
            }
        }

        System.out.printf("Toda la matriz:%n");
        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.printf("%3d ", columna);
            }
            System.out.printf("%n");
        }


        System.out.printf("%nFila 5:%n");
        for (int columna : matriz[4]) {
            System.out.printf("%3d ", columna);
        }

        System.out.printf("%n%n");
        System.out.printf("Intercambiando cuarta fila, tercera columna con"
                + "quinta fila, cuarta columna:%n");
        temp = matriz[3][2];
        matriz[3][2] = matriz[4][3];
        matriz[4][3] = temp;

        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.printf("%3d ", columna);
            }
            System.out.printf("%n");
        }

        System.out.printf("%n");
        System.out.printf("Intercambiando primera columna con cuarta:%n");

        for (int i = 0; i < matriz.length; i++) {
            temp = matriz[i][1];
            matriz[i][0] = matriz[i][3];
            matriz[i][3] = temp;
        }

        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.printf("%3d ", columna);
            }
            System.out.printf("%n");
        }
    }
}
