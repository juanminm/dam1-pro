/*
 * 19. Escribe una clase, de nombre APIManejoArrays1, cuyo método main()
 *     implemente un programa que lleve a cabo las siguiente acciones:
 *
 *     a) Declarar y construir un array de 30 enteros, de nombre arrInt1. Hacer
 *        que el array almacene en las 10 primeras posiciones 10 ceros, en las
 *        10 siguientes 10 unos y en las 10 últimas de nuevo 10 ceros. Mostrar
 *        el contenido del array.
 *     b) Declarar y construir un array de 6 caracteres, de nombre arrChar. El
 *        array almacenará en la primera mitad de las posiciones el carácter a y
 *        en segunda mitad el carácter b. Mostrar el contenido del array.
 *     c) Declarar y construir un array de 10 enteros, de nombre arrInt2. Hacer
 *        que el array almacene en sus posiciones los dígitos del 9 al 0 para
 *        mostrar después su contenido. Ordenar el array ascendentemente y
 *        mostrar de nuevo su contenido.
 */
package dam.programacion.juanminm.ejercicioud06e04;

import java.util.Arrays;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class APIManejoArrays1 {
    public static void main(String[] args) {
        /*
         * a) Declarar y construir un array de 30 enteros, de nombre arrInt1.
         *    Hacer que el array almacene en las 10 primeras posiciones 10
         *    ceros, en las 10 siguientes 10 unos y en las 10 últimas de nuevo
         *    10 ceros. Mostrar el contenido del array.
         */
        int[] arrInt1 = new int[30];

        for (int i = 0; i < arrInt1.length; i++) {
            if (i < 10 || i > 19) {
                arrInt1[i] = 0;
            } else {
                arrInt1[i] = 1;
            }
        }

        for (int filas : arrInt1) {
            System.out.printf("%d ", filas);
        }
        System.out.printf("%n");

        /* b) Declarar y construir un array de 6 caracteres, de nombre arrChar.
         *    El array almacenará en la primera mitad de las posiciones el
         *    carácter a y en segunda mitad el carácter b. Mostrar el contenido
         *    del array.
         */
        char[] arrChar = new char[6];

        for (int i = 0; i < arrChar.length; i++) {
            if (i < 3) {
                arrChar[i] = 'a';
            } else {
                arrChar[i] = 'b';
            }
        }

        for (char filas : arrChar) {
            System.out.printf("%c ", filas);
        }
        System.out.printf("%n");

        /*
         * c) Declarar y construir un array de 10 enteros, de nombre arrInt2.
         *    Hacer que el array almacene en sus posiciones los dígitos del 9 al
         *    0 para mostrar después su contenido. Ordenar el array
         *    ascendentemente y mostrar de nuevo su contenido.
         */
        int[] arrInt2 = new int[10];

        for (int i = 0; i < arrInt2.length; i++) {
            arrInt2[i] = 9 - i;
        }

        for (int filas : arrInt2) {
            System.out.printf("%d ", filas);
        }
        System.out.printf("%n");

        Arrays.sort(arrInt2);

        for (int filas : arrInt2) {
            System.out.printf("%d ", filas);
        }
    }
}
