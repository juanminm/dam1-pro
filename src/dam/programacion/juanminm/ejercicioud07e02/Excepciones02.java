/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.ejercicioud07e02;

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
