/*
 * 2. Introduce una matriz de 7 x 5 y visualízala. A continuación:
 *
 *   - Crea una nueva matriz de 7 x 7 en donde las cinco primeras columnas sean
 *     las de la matriz origen.
 *   - Guarda en la columna sexta la suma de las cinco anteriores.
 *   - Guarda en la columna séptima la media de las cinco primeras.
 */
package dam.programacion.juanminm.u06.ejercicio03;

import java.util.Random;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa02 {
    public static void main(String[] args) {
        Random random = new Random();
        float[][] matriz = new float[7][5];
        float[][] matriz2 = new float[7][7];
        float temp;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextFloat()*7*5+1;
            }
        }

        System.out.printf("Toda la primera matriz:%n");
        for (float[] fila : matriz) {
            for (float columna : fila) {
                System.out.printf("%7.3f ", columna);
            }
            System.out.printf("%n");
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < 5; j++) {
                matriz2[i][j] = matriz[i][j];
            }
        }
        System.out.printf("%n");
        System.out.printf("Toda la segunda matriz:%n");
        for (float[] fila : matriz2) {
            for (float columna : fila) {
                System.out.printf("%7.3f ", columna);
            }
            System.out.printf("%n");
        }

        System.out.printf("%n");
        System.out.printf("Con la suma de las cinco primeras columnas en la "
                + "sexta columna.%n");
        for (int i = 0; i < matriz2.length; i++) {
            matriz2[i][5] = getSuma(matriz2, i);
        }

        for (float[] fila : matriz2) {
            for (float columna : fila) {
                System.out.printf("%7.3f ", columna);
            }
            System.out.printf("%n");
        }

        System.out.printf("%n");
        System.out.printf("Con la media de las cinco primeras columnas en la "
                + "septima columna.%n");
        for (int i = 0; i < matriz2.length; i++) {
            matriz2[i][6] = getMedia(matriz2, i);
        }

        for (float[] fila : matriz2) {
            for (float columna : fila) {
                System.out.printf("%7.3f ", columna);
            }
            System.out.printf("%n");
        }
    }

    private static float getSuma(float[][] matriz, int fila) {
        int sum = 0;

        for (int i = 0; i < matriz[fila].length; i++) {
            sum += matriz[fila][i];
        }

        return sum;
    }

    private static float getMedia(float[][] matriz, int fila) {
        float sum = 0;
        float contador = 0;

        for (int i = 0; i < matriz[fila].length; i++) {
            sum += matriz[fila][i];
            contador++;
        }

        return sum / contador;
    }
}
