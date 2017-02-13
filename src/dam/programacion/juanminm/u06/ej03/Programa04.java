/*
 * 4. Generar en cuadrado Latino de orden N. (Un cuadrado Latino de orden N es
 * una matriz cuadrada en la que la primera fila contiene los N primeros números
 * naturales, en orden, y cada una de las siguientes filas contiene la rotación
 * de la fila anterior un lugar a la derecha.
 *
 *   1 2 3 4 5
 *   5 1 2 3 4
 *   4 5 1 2 3
 *   3 4 5 1 2
 *   2 3 4 5 1
 */
package dam.programacion.juanminm.u06.ej03;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max;
        int valor;
        int[][] cuadroLatino;
        int tamañoCampo;

        System.out.printf("Introduzca el orden del cuadro Latino: ");
        max = scanner.nextInt();

        cuadroLatino = new int[max][max];

        for (int i = 0; i < cuadroLatino.length; i++) {
            for (int j = 0; j < cuadroLatino[i].length; j++) {
                /*
                 * Partimos con las siguientes clausulas:
                 *
                 *  1. El rango de los números de un cuadro Latíno es min 1 y
                 *     Max N.
                 *     Ej: cuadro de 2 es de 1 a 2.
                 *
                 *  2. m % N == (aN + m) % N; donde m < N y a un numero
                 *     arbitrario.
                 *     Ej: 3 + 5 * 0 % 5 =  3 + 0 % 5 =  3 % 5 = 3
                 *         3 + 5 * 1 % 5 =  3 + 5 % 5 =  8 % 5 = 3
                 *         3 + 5 * 3 % 5 = 3 + 15 % 5 = 18 % 5 = 3
                 *
                 *  3. m % N da un rango [0, N).
                 *     Ej: 0 % 2| = 0
                 *         1 % 2| = 1
                 *         2 % 2| = 0
                 *
                 *  4. (m - min) % (max - min + 1) + min da un rango [min, Max]
                 *
                 * Un cuadro Latino desplaza los número a la izquierda (-1) por
                 * fila, por lo que la matríz se puede visualizar de este modo
                 * (caso * N = 5):
                 *
                 *          j
                 *    0  1  2  3  4
                 *   -1  0  1  2  3
                 * i -2 -1  0  1  2
                 *   -3 -2 -1  0  1
                 *   -4 -3 -2 -1  0
                 *
                 * Eso quiere decir que el numero m es sumado 1 por cada columna
                 * y restado 1 por cada siguiente fila.
                 * Juntando con el hecho de que aN - m donde aN > m siempre dará
                 * positivo y descenderá de N a 1, se creará el cuadro latino.
                 *
                 * En nuestro caso, la variable valor actúa como m.
                 */
                valor = j - i + 1;
                cuadroLatino[i][j] = (max + valor - min) % (max - min + 1) + min;
            }
        }

        for (int[] filas: cuadroLatino) {
            for (int columnas: filas) {
                /*
                 * Lo siguiente simplemente es para dar formato segun los
                 * digitos del mayor número que será el valor del cuadro latino.
                 * Con el logaritmo de 10 se obtiene el valor de la potencia y
                 * se calculan los digitos sumando 1 al valor.
                 */
                tamañoCampo = (int) Math.log10(max) + 1;
                String formato = "%" + tamañoCampo + "d ";
                System.out.printf(formato, columnas);
            }
            System.out.printf("%n");
        }
    }
}
