/*
 * Ejercicio 10.
 *
 * Dadas las siguientes expresiones aritméticas, calcula cuál es el resultado
 * de evaluarlas. Supón que las variables a y b que aparecen son del tipo int y
 * a tiene el valor de 2 y b tiene el valor de 4.
 *
 *  a) –a + 5 % b – a * a
 *  b) 5 + 3 % 7 * b * a – b % a
 *  c) (a+1) * (b + 1) – b / a
 */
package dam.programacion.juanminm.ejercicioud02u01;

public class Programa10 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        System.out.println("-a + 5 % b - a * a = " + (-a + 5 % b - a * a));
        System.out.println("5 + 3 % 7 * b * a - b % a = " + (5 + 3 % 7 * b * a - b % a));
        System.out.println("(a + 1) * (b + 1) - b / a = " + ((a + 1) * (b + 1) - b / a));
    }
}
