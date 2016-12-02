/*
 * 3. Crea un vector V numérico de 50 elementos y otro P de 20 elementos. Genera
 * luego M(50,20) de tal forma que M(I,J) es igual a V(I) * P(J)
 */
package dam.programacion.juanminm.ejercicioud06e03;

import java.util.Random;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vectorV = new int[50];
        int[] vectorP = new int[20];
        int[][] vectorM = new int[50][20];

        for(int i = 0; i < vectorV.length; i++) {
            vectorV[i] = random.nextInt(50)+1;
        }

        for(int i = 0; i < vectorP.length; i++) {
            vectorP[i] = random.nextInt(50)+1;
        }

        for (int i = 0; i < vectorM.length; i++) {
            for (int j = 0; j < vectorM[i].length; j++) {
                vectorM[i][j] = vectorV[i] * vectorP[j];
            }
        }

        System.out.printf("Vector V:%n");
        for (int num: vectorV) {
            System.out.printf("%d ", num);
        }
        System.out.printf("%n");

        System.out.printf("Vector P:%n");
        for (int num: vectorP) {
            System.out.printf("%d ", num);
        }
        System.out.printf("%n");

        System.out.printf("Vector M:%n");
        for (int[] fila: vectorM) {
            for (int columna: fila) {
                System.out.printf("%4d ", columna);
            }
            System.out.printf("%n");
        }
    }
}
