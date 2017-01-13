/*
 * 4. Escribe una clase de nombre ClaseExcep1 que incluya un método denominado
 *    dividirEntreArray. Este método recibirá por parámetro un número entero y
 *    un array de elementos del mismo tipo. El método mostrará por pantalla el
 *    resultado de la división entre el número recibido y cada uno de los
 *    elementos del array. A continuación, se escribirá un programa que invoque
 *    al método con el número 2 y un array con los elementos -2, -1, 0, 1 y 2.
 *
 *    - Reescribe el método anterior para capturar la excepción derivada del
 *      intento de división entre 0, de forma que no se interrumpa la ejecución
 *      del programa y se continúe dividiendo entre los otros elementos del
 *      array.
 *
 *    - Reescribe el código anterior con las sentencias de código necesarias
 *      para que la excepción no llegue a producirse (comprobar que el divisor
 *      debe ser distinto de cero)
 */
package dam.programacion.juanminm.u07.ejercicio02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class ClassExcep1 {
    public static void dividirEntreArray1(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(num / arr[i]);
        }
    }

    public static void dividirEntreArray2(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(num / arr[i]);
            } catch (ArithmeticException e) {
                System.out.println("Indefinido.");
            }
        }
    }

    public static void dividirEntreArray3(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(num / arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int num = 60;
        int[] arr = {-2, -1, 0, 1, 2};

        //dividirEntreArray1(num, arr);
        dividirEntreArray2(num, arr);
        dividirEntreArray3(num, arr);
    }
}