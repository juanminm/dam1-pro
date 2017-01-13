/*
 * 2. Indica la salida por pantalla que produciría el siguiente código:
 *
 *     public class Excepciones02 {
 *         public static int devuelveEntero(int num) {
 *             try {
 *                 if (num % 2 == 0) {
 *                     throw new Exception("Labzabdi excepción.");
 *                 }
 *                 return 1;
 *             } catch (Exception e) {
 *                 return 2;
 *             } finally {
 *                 return 3;
 *             }
 *         public static void main(String[] args) {
 *             for (int i = 0; i < 10; i++) {
 *                 System.out.println(devuelveEntero(i));
 *             }
 *         }
 *     }
 *
 *     - Modifica el código para que el resultado sea 1, 2, 1, 2...
 *
 *     - Obtén el mismo resultado programando sin excepciones
 */
package dam.programacion.juanminm.u07.ejercicio02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Excepciones02 {
    public static int devuelveEntero(int num) {

        /* Con exepciones */
        try {
            if (num % 2 == 0) {
                throw new Exception("Labzabdi excepción.");
            }
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }

        /* Mostrando 1,2,1,2 */
//        try {
//            if (num % 2 == 0) {
//                throw new Exception("Labzabdi excepción.");
//            }
//            return 2;
//        } catch (Exception e) {
//            return 1;
//        }

        /* Sin excepciones */
//        if (num % 2 == 0) {
//            return 1;
//        } else {
//            return 2;
//        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(devuelveEntero(i));
        }
    }
}
