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
package dam.programacion.juanminm.ejercicioud06e04;

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
    }
}
