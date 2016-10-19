/*
 * Ejercicio 14.
 * 
 * Dadas las siguientes expresiones aritmético-lógicas calcula cuál es el
 * resultado de evaluarlas. 
 * 
 *   a) 25>20 && 13>5
 *   b) 10 + 4 < 15 -3 || 2 * 5 + 1 > 14 – 2 * 2
 *   c) 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1
 *   d) 10 <= 2 * 5 && 3<4 || ! (8>7) && 3*2 <= 4*2-1 
 */
package dam.programacion.juanminm.ejercicioud201;

public class Programa14 {
	public static void main(String[] args) {
        System.out.println("25>20 && 13>5: " + (25 > 20 && 13 > 5));
        System.out.println("10 + 4 < 15 -3 || 2 * 5 + 1 > 14 - 2 * 2: " +
        		(10 + 4 < 15 -3 || 2 * 5 + 1 > 14 - 2 * 2));
        System.out.println("4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1: " +
        			(4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1));
        System.out.println("10 <= 2 * 5 && 3 < 4 || !(8 > 7) && 3 * 2 <= 4*2- 1: " +
        			(10 <= 2 * 5 && 3 < 4 || !(8 > 7) && 3 * 2 <= 4*2 - 1));
    }
}
