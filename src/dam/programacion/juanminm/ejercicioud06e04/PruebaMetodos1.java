/*
 * Escribe una clase de nombre PruebaMetodos1 con los métodos estáticos que se
 * proponen a continuación. Incluir en el método main() de la clase las
 * sentencias necesarias para comprobar el correcto  funcionamiento de dichos
 * métodos.
 *
 *  1. Escribe un método, de nombre mostrarArrayPantalla2, que reciba por
 *     parámetro un array de enteros y muestre sus valores por pantalla
 *     separados por comas.
 *
 *  2. Escribe un método, de nombre obtenerArrayComoString, que reciba un array
 *     de enteros por parámetro y devuelva una cadena de caracteres con su
 *     contenido.
 *
 *  3. Escribe un método, de nombre completarArray3, que reciba un array de
 *     enteros por parámetro y lo rellene de forma que contenga tantos números
 *     pares, a partir del cero, como permita su capacidad.
 *
 *  4. Escribe un método, de nombre obtenerSumaArray, que reciba por parámetro
 *     un array de enteros y devuelva la suma de sus elementos.
 *
 *  5. Escribe un método, de nombre arrayPotencias2, que cree un array y lo
 *     rellene con potencias de 2. Las potencias de 2 comenzarán en 2º y el
 *     número total de ellas se recibirá por parámetro. El método devolverá el
 *     array creado.
 *
 *  6. Escribe un método que reciba como parámetro un array de cadenas y
 *     devuelva la cadena resultante de concatenar todas las contenidas en el
 *     array.
 *
 *  7. Escribe un método, de nombre obtenerSumaLongCadArray, que reciba por
 *     parámetro un array de cadenas y devuelva el número total de caracteres de
 *     todas las cadenas del array.
 *
 *  8. Escribe un método, de nombre obtenerLongCadenas, que reciba por parámetro
 *     un array de cadenas y devuelva un array de enteros con los tamaños de las
 *     cadenas contenidas en el array.
 *
 *  9. Escribe un método, de nombre obtenerArrCad5Vocales, que reciba por
 *     parámetro un array de cadenas y devuelva un array con las que contengan
 *     las 5 vocales. Para la consideración de un carácter como vocal no se
 *     tendrá en cuenta si está en mayúsculas o minúsculas.
 *
 * 10. Escribe un método, de nombre obtenerArrayOrdAlfab, que reciba por
 *     parámetro un array de cadenas de caracteres y las ordene alfabéticamente.
 *     La ordenación no se verá afectada por la expresión de los caracteres
 *     expresados en mayúsculas o minúsculas. Es decir, las cadenas “ALBACETE”,
 *     “antonio”, y “BURGOS” quedarán ordenadas en este mismo orden.
 */
package dam.programacion.juanminm.ejercicioud06e04;

import java.util.Arrays;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class PruebaMetodos1 {

    /*
     * 1. Escribe un método, de nombre mostrarArrayPantalla2, que reciba por
     *    parámetro un array de enteros y muestre sus valores por pantalla
     *    separados por comas.
     */
    private static void mostrarArrayPantalla2(int[] arrayNum) {
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.printf("%d", arrayNum[i]);

            if (i < arrayNum.length - 1) {
                System.out.printf(", ");
            }
        }
        System.out.printf("%n");
    }

    /*
     * 2. Escribe un método, de nombre obtenerArrayComoString, que reciba un
     *    array de enteros por parámetro y devuelva una cadena de caracteres con
     *    su contenido.
     */
    private static String obtenerArrayComoString(int[] arrayNum) {
        String arrayComoString = "";

        for (int i = 0; i < arrayNum.length; i++) {
            arrayComoString += arrayNum[i];

            if (i < arrayNum.length - 1) {
                arrayComoString += " ";
            }
        }

        return arrayComoString;
    }

    /*
     * 3. Escribe un método, de nombre completarArray3, que reciba un array de
     *    enteros por parámetro y lo rellene de forma que contenga tantos
     *    números pares, a partir del cero, como permita su capacidad.
     */
    private static void completarArray3(int[] arrayNum) {
        int contadorNumeroPar = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = contadorNumeroPar;
            contadorNumeroPar += 2;
        }
    }

    /*
     * 4. Escribe un método, de nombre obtenerSumaArray, que reciba por
     *    parámetro un array de enteros y devuelva la suma de sus elementos.
     */
    private static int obtenerSumaArray(int[] arrayNum) {
        int suma = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            suma += arrayNum[i];
        }


        return suma;
    }

    /*
     * 5. Escribe un método, de nombre arrayPotencias2, que cree un array y lo
     *    rellene con potencias de 2. Las potencias de 2 comenzarán en 2º y el
     *    número total de ellas se recibirá por parámetro. El método devolverá
     *    el array creado.
     */
    private static int[] arrayPotencias2(int numeroPotencias) {
        int[] arrayPotencias = new int[numeroPotencias];

        for (int i = 0; i < arrayPotencias.length; i++) {
            arrayPotencias[i] = (int) Math.pow(2, 2+i);
        }

        return arrayPotencias;
    }

    /*
     * 6. Escribe un método que reciba como parámetro un array de cadenas y
     *    devuelva la cadena resultante de concatenar todas las contenidas en el
     *    array.
     */
    private static String concatenarStringArrayAString(String[] arrayString) {
        String cadenaConcatenada = "";

        for (String cadena : arrayString) {
            cadenaConcatenada += cadena;
        }

        return cadenaConcatenada;
    }

    /*
     * 7. Escribe un método, de nombre obtenerSumaLongCadArray, que reciba por
     *    parámetro un array de cadenas y devuelva el número total de
     *    caracteres de todas las cadenas del array.
     */
    private static int obtenerSumaLongCadArray(String[] arrayString) {
        int longitud = 0;

        for (String cadena : arrayString) {
            longitud += cadena.length();
        }

        return longitud;
    }

    /*
     * 8. Escribe un método, de nombre obtenerLongCadenas, que reciba por
     *    parámetro un array de cadenas y devuelva un array de enteros con los
     *    tamaños de las cadenas contenidas en el array.
     */
    private static int[] obtenerLongCadenas(String[] arrayString) {
        int[] longitudCadenas = new int[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            longitudCadenas[i] = arrayString[i].length();
        }

        return longitudCadenas;
    }

    /*
     * 9. Escribe un método, de nombre obtenerArrCad5Vocales, que reciba por
     *    parámetro un array de cadenas y devuelva un array con las que
     *    contengan las 5 vocales. Para la consideración de un carácter como
     *    vocal no se tendrá en cuenta si está en mayúsculas o minúsculas.
     */
    private static String[] obtenerArrCad5Vocales(String[] arrayString) {
        String[] arrayCad5Vocales = new String[arrayString.length];
        int j = 0;

        for (int i = 0; i < arrayCad5Vocales.length && j < arrayString.length;
                i++) {
            boolean cincoVocalesDetectadas = false;

            while (j < arrayString.length && !cincoVocalesDetectadas) {
                if (arrayString[j].toLowerCase().matches(".*a.*") &&
                        arrayString[j].toLowerCase().matches(".*e.*") &&
                        arrayString[j].toLowerCase().matches(".*i.*") &&
                        arrayString[j].toLowerCase().matches(".*o.*") &&
                        arrayString[j].toLowerCase().matches(".*u.*")) {
                    arrayCad5Vocales[i] = arrayString[j];
                    cincoVocalesDetectadas = true;
                }
                j++;
            }
        }

        return arrayCad5Vocales;
    }

    public static void main(String[] args) {
        int[] arrayNum1 = {1, 5, 6, 9, 10};
        int[] arrayNum2 = {50, 30, 2, 95, 6};
        int[] arrayNum3 = new int[30];
        int[] arrayNum4 = {94, 64, 631, 73, 28};
        int numPotencias = 10;
        String[] arrayString1 = {"El perro de ", "San Roque no", " tiene ",
            "rabo por", "que Ram", "on Ramirez se lo", " ha cortado", "."};
        String[] arrayString2 = {"En un l", "ugar de la Manc", "ha de ",
            "cuyo nombr", "e no", " quiero a", "cordarme."};
        String[] arrayString3 = {"How often have I said t", "o you that when",
            "you have e", "liminated the impossible", ", whatever ", "remains,",
            " however improbab", "le, must", "be the truth?"};
        String[] arrayString4 = {"Supercalifragilisticoespialodoso","raton",
            "murcielago","arco iris"};

        System.out.printf("Resultado de mostrarArrayPantalla2:%n");
        mostrarArrayPantalla2(arrayNum1);

        System.out.printf("%nResultado de obtenerArrayComoString:%n%s%n",
                obtenerArrayComoString(arrayNum2));

        completarArray3(arrayNum3);
        System.out.printf("%nResultado de completarArray3:%n");
        mostrarArrayPantalla2(arrayNum3);

        System.out.printf("%nResultado de obtenerSumaArray:%n%d%n",
                obtenerSumaArray(arrayNum4));

        System.out.printf("%nResultado de arrayPotencias2:%n%s%n",
                obtenerArrayComoString(arrayPotencias2(numPotencias)));

        System.out.printf("%nResultado de concatenarStringArrayAString:%n%s%n",
                concatenarStringArrayAString(arrayString1));

        System.out.printf("%nResutlado de obtenerSumaLongCadArray:%n%d%n",
                obtenerSumaLongCadArray(arrayString2));

        System.out.printf("%nResultado de obtenerLongCadenas:%n");
        mostrarArrayPantalla2(obtenerLongCadenas(arrayString3));

        System.out.printf("%nResultado de obtenerArrCad5Vocales:%n%s%n",
                Arrays.toString(obtenerArrCad5Vocales(arrayString4)));
    }

}