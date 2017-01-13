/*
 * 20. Escribe una clase, de nombre APIManejoArrays1, cuyo método main()
 *     implemente un programa que lleve a cabo las siguientes acciones:
 *
 *     a) Declarar y construir un array de cadenas de objetos String de nombre
 *        arrStr que contenga las siguientes cadenas: “impresora”, “peto”,
 *        “mar”, “orilla” y “Orihuela”
 *     b) Ordenar el array arrStr alfabéticamente teniendo en cuenta que las
 *        letras mayúsculas figuran en el código Unicode antes que las
 *        minúsculas. Mostrar por pantalla el resultado de la ordenación.
 *     c) Ordenar el array arrStr alfabéticamente sin distinguir entre letras
 *        mayúsculas y minúsculas. Mostrar por pantalla el resultado de la
 *        ordenación.
 *     d) Ordenar el array arrStr con un comparador que determine que una cadena
 *        con más caracteres precede a otra que tenga menos. Mostrar por
 *        pantalla el resultado de la ordenación.
 *     e) Ordenar el array arrStr con un comparador que determine que una cadena
 *        con más vocales sigue a otra que tenga menos. Mostrar por pantalla en
 *        resultado de la ordenación.
 */
package dam.programacion.juanminm.u06.ejercicio04;

import java.util.Arrays;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class APIManejoArrays2 {
    public static void main(String[] args) {
        /*
         * a) Declarar y construir un array de cadenas de objetos String de
         *    nombre arrStr que contenga las siguientes cadenas: “impresora”,
         *    “peto”, “mar”, “orilla” y “Orihuela”
         */
        String[] arrStr = {"impresora", "peto", "mar", "orilla", "Orihuela"};

        /*
         * b) Ordenar el array arrStr alfabéticamente teniendo en cuenta que las
         *    letras mayúsculas figuran en el código Unicode antes que las
         *    minúsculas. Mostrar por pantalla el resultado de la ordenación.
         */
        Arrays.sort(arrStr);

        for (String filas : arrStr) {
            System.out.printf("%s ", filas);
        }
        System.out.printf("%n");

        /*
         * c) Ordenar el array arrStr alfabéticamente sin distinguir entre
         *    letras mayúsculas y minúsculas. Mostrar por pantalla el resultado
         *    de la ordenación.
         */
        Arrays.sort(arrStr, String.CASE_INSENSITIVE_ORDER);

        for (String filas : arrStr) {
            System.out.printf("%s ", filas);
        }
        System.out.printf("%n");

        /*
         * d) Ordenar el array arrStr con un comparador que determine que una
         *    cadena con más caracteres precede a otra que tenga menos. Mostrar
         *    por pantalla el resultado de la ordenación.
         */
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = i + 1; j < arrStr.length; j++) {
                if (arrStr[i].length() < arrStr[j].length()) {
                    String aux = arrStr[i];

                    arrStr[i] = arrStr[j];
                    arrStr[j] = aux;
                }
            }
        }

        for (String filas : arrStr) {
            System.out.printf("%s ", filas);
        }
        System.out.printf("%n");

        /*
         * e) Ordenar el array arrStr con un comparador que determine que una
         *    cadena con más vocales sigue a otra que tenga menos. Mostrar por
         *    pantalla en resultado de la ordenación.
         */
        int contarVocalesStrA;
        int contarVocalesStrB;

        for (int i = 0; i < arrStr.length; i++) {
            contarVocalesStrA = 0;

            for (int j = 0; j < arrStr[i].length(); j++) {
                if (arrStr[i].toLowerCase().charAt(j) == 'a'
                        || arrStr[i].toLowerCase().charAt(j) == 'e'
                        || arrStr[i].toLowerCase().charAt(j) == 'i'
                        || arrStr[i].toLowerCase().charAt(j) == 'o'
                        || arrStr[i].toLowerCase().charAt(j) == 'u') {
                    contarVocalesStrA++;
                }
            }

            for (int k = i + 1; k < arrStr.length; k++) {
                contarVocalesStrB = 0;

                for (int l = 0; l < arrStr[k].length(); l++) {
                    if (arrStr[k].toLowerCase().charAt(l) == 'a'
                            || arrStr[k].toLowerCase().charAt(l) == 'e'
                            || arrStr[k].toLowerCase().charAt(l) == 'i'
                            || arrStr[k].toLowerCase().charAt(l) == 'o'
                            || arrStr[k].toLowerCase().charAt(l) == 'u') {
                        contarVocalesStrB++;
                    }
                }

                if (contarVocalesStrA > contarVocalesStrB) {
                    String aux = arrStr[i];

                    arrStr[i] = arrStr[k];
                    arrStr[k] = aux;
                }
            }
        }

        for (String filas : arrStr) {
            System.out.printf("%s ", filas);
        }
        System.out.printf("%n");
    }
}
