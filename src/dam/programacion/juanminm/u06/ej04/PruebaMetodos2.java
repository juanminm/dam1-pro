/*
 * Escribe una clase de nombre PruebaMetodos2 con los métodos estáticos que se
 * proponen a continuación. Incluir en el método main() de la clase las
 * sentencias necesarias para comprobar el correcto funcionamiento de dichos
 * métodos.
 *
 * 11. Escribe un método, de nombre rellenarMatrizSecuencia2D, que reciba una
 *     matriz de enteros por parámetro y la rellene para que sus posiciones
 *     almacenen un valor que se irá incrementando en una unidad por columnas.
 *     La matriz se rellenará de manera que dos elementos consecutivos según la
 *     primera dimensión almacenen dos valores también consecutivos. Una matriz
 *     de 5 elementos en la primera dimensión y 5 en la segunda quedaría como
 *     sigue:
 *
 *     0   5   10  15  20
 *     1   6   11  16  21
 *     2   7   12  17  22
 *     3   8   13  18  23
 *     4   9   14  19  24
 *
 * 12. Escribe un método, de nombre mostrarMatrizID, que reciba por parámetro un
 *     array bidimensional (matriz) de enteros y muestre sus elementos por
 *     pantalla de forma que la primera dimensión de la matriz se corresponda
 *     con las filas y la segunda con las columnas.
 *
 * 13. Escribe un método, de nombre matrizIntComoString, que reciba por
 *     parámetro un array bidimensional (matriz) de enteros y devuelva una
 *     cadena con la representación textual de la matriz recibida. La cadena
 *     dispondrá los elementos de la matriz de forma que la primera dimensión se
 *     corresponda con las filas y la segunda con las columnas.
 *
 * 14. Escribe un método, de nombre rellenarMatrizAsteriscos, que reciba por
 *     parámetro un valor entero que especificará el número de filas de
 *     asteriscos que albergará la matriz. La primera fila contendrá un solo
 *     asterisco situado en la posición central según la segunda dimensión de la
 *     matriz. Cada nueva fila contendrá dos asteriscos más y también se
 *     encontrarán centrados según la segunda dimensión de la matriz. El aspecto
 *     final que debe presentar la matriz si se recibe un número de filas de
 *     asteriscos sería el siguiente:
 *
 *                 *
 *              *  *  *
 *           *  *  *  *  *
 *        *  *  *  *  *  *  *
 *     *  *  *  *  *  *  *  *  *
 *
 * 15. Escribe un método, de nombre obtenerSumaElementosMatriz, que reciba por
 *     parámetro un array bidimensional de números enteros y devuelva la suma de
 *     todos sus elementos.
 *
 * 16. Escribe un método, de nombre obtenerDiagonales, que reciba por parámetro
 *     una matriz de valores enteros y devuelva una matriz con los valores de
 *     las dos diagonales principales de la matriz recibida.
 *
 * 17. Escribe un método, de nombre obtenerLaterales, que reciba por parámetro
 *     una matriz de valores enteros y devuelva una matriz con los valores de
 *     los cuatro laterales -superior, izquierdo, derecho e inferior-, de la
 *     matriz recibida
 *
 * 18. Escribe un programa que obtenga y muestre por pantalla una matriz de
 *     enteros con el siguiente aspecto
 *
 *     1 2 3 4 5
 *     1 2 3 4
 *     1 2 3
 *     1 2
 *     1
 *
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
 *
 * 20. Escribe una clase, de nombre APIManejoArrays1, cuyo método main()
 *     implemente un programa que lleve a cabo las siguientes acciones:
 *
 *     a) Declarar y construir un arrayde cadenas de objetos String de nombre
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
 *
 * 21. Sea la clase Alumno que se presenta a continuación:
 *
 *     public class Alumno {
 *         int númeroPersonal:
 *         String apellido1, apellido2, nombre:
 *         int numAsignaturas:
 *         double[] notasFinales:
 *         double notaMediaFinal:
 *         public Alumno(int numPer, String ap1, String ap2, String nom,
 *                 int num Asig) {
 *             númeroPersonal = numPer:
 *             apellido1 = ap1:
 *             apellido2 = ap2:
 *             nombre = nom:
 *             numAsignaturas = numAsig:
 *             notasFinales = new double[numAsignaturas]:
 *        }
 *
 *        public Alumno(int numPer, String ap1, String ap2, String nom,
 *                int numAsig, double[] notasF, double nmf) {
 *            númeroPersonal = numPer:
 *            apellido1 = ap1:
 *            apellido2 = ap2:
 *            nombre = nom:
 *            numAsignaturas = numAsig:
 *            notasFinales = notasF:
 *            notaMediaFInal = nmf:
 *        }
 *
 *        public String toString() {
 *            String resul:
 *            resul = “NP: “ + númeroPersonal + “\n” + “ Nombre: “ + nombre +
 *                    “ Apellido1: “ + apellido1 + “ Apellido2: “ + apellido2 +
 *                    “\n” + “ Nota Media Final: “ + notaMediaFinal + “\n”:
 *            return resul:
 *        }
 *
 *        public double obtenerNotaMediaFinal() {
 *            return notaMediaFinal:
 *        }
 *    }
 *
 *    - Añade a la clase un método, de nombre asignarNotas, que reciba por
 *      parámetro una matriz de valores reales con las notas que el alumno ha
 *      obtenido en dos evaluaciones realizadas. La primera dimensión de la
 *      matriz corresponderá al número de evaluaciones y, por tanto, sólo podrá
 *      contener 2 posiciones. La segunda dimensión corresponde a las
 *      calificaciones obtenidas por el alumno en cada una de las asignaturas.
 *      El método calculará la nota final para cada una de las asignaturas
 *      teniendo en cuenta que la nota de la primera evaluación tiene un peso
 *      del 60% y la de la segunda evaluación el 40% restante. El método también
 *      determinará la nota media final del alumno.
 *
 *    - Añade a la clase un método, de nombre pasaDeCurso, que indique si el
 *      alumno podrá acceder al siguiente curso. Se considera que un alumno
 *      puede pasar de curso si su nota media final es mayor o igual de 5.0 y
 *      tiene menos de 3 asignaturas suspensas.
 */
package dam.programacion.juanminm.u06.ej04;

import java.util.Arrays;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class PruebaMetodos2 {

    /*
     * 11. Escribe un método, de nombre rellenarMatrizSecuencia2D, que reciba
     *     una matriz de enteros por parámetro y la rellene para que sus
     *     posiciones almacenen un valor que se irá incrementando en una unidad
     *     por columnas. La matriz se rellenará de manera que dos elementos
     *     consecutivos según la primera dimensión almacenen dos valores también
     *     consecutivos. Una matriz de 5 elementos en la primera dimensión y 5
     *     en la segunda quedaría como sigue:
     *
     *     0   5   10  15  20
     *     1   6   11  16  21
     *     2   7   12  17  22
     *     3   8   13  18  23
     *     4   9   14  19  24
     */
    private static void rellenarMatrizSecuencia2D(int[][] matrizInt) {
        int i = 0;
        int j = 0;
        int num = 0;


        while(j < matrizInt[i].length) {
            while (i < matrizInt.length) {
                matrizInt[i][j] = num++;
                i++;
            }

            i = 0;
            j++;
        }
    }

    /*
     * 12. Escribe un método, de nombre mostrarMatrizID, que reciba por
     *     parámetro un array bidimensional (matriz) de enteros y muestre sus
     *     elementos por pantalla de forma que la primera dimensión de la matriz
     *     se corresponda con las filas y la segunda con las columnas.
     */
    private static void mostrarMatrizID(int[][] matrizInt) {
        for (int[] filas : matrizInt) {
            for (int columnas : filas) {
                System.out.printf("%d ", columnas);
            }
            System.out.printf("%n");
        }
    }

    /*
     * 13. Escribe un método, de nombre matrizIntComoString, que reciba por
     *     parámetro un array bidimensional (matriz) de enteros y devuelva una
     *     cadena con la representación textual de la matriz recibida. La cadena
     *     dispondrá los elementos de la matriz de forma que la primera
     *     dimensión se corresponda con las filas y la segunda con las columnas.
     */
    private static String matrizIntComoString(int[][] matrizInt) {
        String str = "";

        for (int[] filas : matrizInt) {
            for (int columnas : filas) {
                str += columnas + " ";
            }

            str += "\n";
        }

        return str;
    }

    /*
     * 14. Escribe un método, de nombre rellenarMatrizAsteriscos, que reciba por
     *     parámetro un valor entero que especificará el número de filas de
     *     asteriscos que albergará la matriz. La primera fila contendrá un solo
     *     asterisco situado en la posición central según la segunda dimensión
     *     de la matriz. Cada nueva fila contendrá dos asteriscos más y también
     *     se encontrarán centrados según la segunda dimensión de la matriz. El
     *     aspecto final que debe presentar la matriz si se recibe un número de
     *     filas de asteriscos sería el siguiente:
     *
     *                 *
     *              *  *  *
     *           *  *  *  *  *
     *        *  *  *  *  *  *  *
     *     *  *  *  *  *  *  *  *  *
     */
    private static String rellenarMatrizAsteriscos(int filas) {
        int columnas = 2 * filas - 1;
        String[][] matrizAst = new String[filas][columnas];
        String str = "";

        for (int i = 0; i < matrizAst.length; i++) {
            for (int j = 0; j < matrizAst[i].length; j++) {
                int medio = columnas / 2;

                if (j >= medio - i && j <= medio + i) {
                    matrizAst[i][j] = "*";
                } else {
                    matrizAst[i][j] = " ";
                }
            }
        }

        for (String[] filas2 : matrizAst) {
            for (String columnas2 : filas2) {
                str += columnas2 + " ";
            }

            str += "\n";
        }

        return str;
    }

    /*
     * 15. Escribe un método, de nombre obtenerSumaElementosMatriz, que reciba
     *     por parámetro un array bidimensional de números enteros y devuelva la
     *     suma de todos sus elementos.
     */
    private static int obtenerSumaElementosMatriz(int[][] matrizInt) {
        int sum = 0;

        for (int[] filas : matrizInt) {
            for (int columnas : filas) {
                sum += columnas;
            }
        }

        return sum;
    }

    /*
     * 16. Escribe un método, de nombre obtenerDiagonales, que reciba por
     *     parámetro una matriz de valores enteros y devuelva una matriz con los
     *     valores de las dos diagonales principales de la matriz recibida.
     */
    private static int[][] obtenerDiagonales(int[][] matrizInt) {
        boolean matrizEsCuadrada = true;

        for (int[] matrizInt1 : matrizInt) {
            if (matrizInt.length != matrizInt1.length) {
                matrizEsCuadrada = false;
            }
        }

        if (!matrizEsCuadrada) {
            System.out.printf("La matríz debe de ser cuadrada.");
            return null;
        } else {
            int longitud = matrizInt.length;
            int[][] matrizDiagonal = new int[longitud][longitud];

            for (int i = 0; i < matrizInt.length; i++) {
                for (int j = 0; j < matrizInt[i].length; j++) {
                    if (j == i || j == (matrizInt.length - (i + 1))) {
                        matrizDiagonal[i][j] = matrizInt[i][j];
                    }
                }
            }

            return matrizDiagonal;
        }
    }

    /*
     * 17. Escribe un método, de nombre obtenerLaterales, que reciba por
     *     parámetro una matriz de valores enteros y devuelva una matriz con los
     *     valores de los cuatro laterales -superior, izquierdo, derecho e
     *     inferior-, de la matriz recibida
     */
    private static int[][] obtenerLaterales(int[][] matrizInt) {
        boolean matrizEsCuadrada = true;

        for (int[] matrizInt1 : matrizInt) {
            if (matrizInt.length != matrizInt1.length) {
                matrizEsCuadrada = false;
            }
        }

        if (!matrizEsCuadrada) {
            System.out.printf("La matríz debe de ser cuadrada.");
            return null;
        } else {
            int longitud = matrizInt.length;
            int[][] matrizDiagonal = new int[longitud][longitud];

            for (int i = 0; i < matrizInt.length; i++) {
                for (int j = 0; j < matrizInt[i].length; j++) {
                    if (i == 0 || j == 0 || i == (matrizInt.length - 1)
                            || j == (matrizInt[i].length - 1)) {
                        matrizDiagonal[i][j] = matrizInt[i][j];
                    }
                }
            }

            return matrizDiagonal;
        }
    }

    /*
     * 18. Escribe un programa que obtenga y muestre por pantalla una matriz de
     *     enteros con el siguiente aspecto
     *
     *     1 2 3 4 5
     *     1 2 3 4
     *     1 2 3
     *     1 2
     *     1
     */
    public static void escaleraInvertidaEnteros(int escalones) {
        int[][] matrizEscalera = new int[escalones][];

        for (int i = 0; i < matrizEscalera.length; i++) {
            matrizEscalera[i] = new int[escalones - i];

            for (int j = 0; j < matrizEscalera[i].length; j++) {
                matrizEscalera[i][j] = j + 1;
            }
        }

        for (int[] filas : matrizEscalera) {
            for (int columnas : filas) {
                System.out.printf("%d ", columnas);
            }

            System.out.printf("%n");
        }

    }

    public static void main(String[] args) {
        int[][] matrizInt1 = new int[5][5];
        int[][] matrizInt2 = {{3, 2, 1}, {9, 3, 7}, {8, 10, 5}};
        int[][] matrizInt3 = {{10, 3, 5, 9}, {8, 13, 2, 21}, {7, 8, 5, 15},
            {14, 23, 29, 8}};


        System.out.printf("Rellenando matriz entera con"
                + "rellenarMatrizSecuencia2D...%n");
        rellenarMatrizSecuencia2D(matrizInt1);

        System.out.printf("Mostrando la matriz anterior conmostrarMatrizID:"
                + "%n");
        mostrarMatrizID(matrizInt1);

        System.out.printf("Mostrando el resultado de matrizIntComoString:"
                + "%n%s%n", matrizIntComoString(matrizInt2));

        System.out.printf("Rellenando y mostrando una matriz hecha de"
                + "astericos:%n%s%n", rellenarMatrizAsteriscos(4));

        System.out.printf("La suma del contenido de la matríz...%n%s%n... es: "
                + "%d%n", matrizIntComoString(matrizInt3),
                obtenerSumaElementosMatriz(matrizInt3));

        System.out.printf("Mostrando las diagonales de la matriz anteriorcon "
                + "obtenerDiagonales:%n");
        mostrarMatrizID(obtenerDiagonales(matrizInt3));

        System.out.printf("Mostrando las diagonales de la matriz anteriorcon "
                + "obtenerLaterales:%n");
        mostrarMatrizID(obtenerLaterales(matrizInt3));

        System.out.printf("Mostrnado una matriz escalera de 10 escalones usando"
                + " escaleraInvertidaEnteros:%n");
        escaleraInvertidaEnteros(10);
    }

}
