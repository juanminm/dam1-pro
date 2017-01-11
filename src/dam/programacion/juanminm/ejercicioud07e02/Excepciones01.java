/*
 * 1. Escribe un programa que lance y capture una excepción de la clase
 *    Exception
 */
package dam.programacion.juanminm.ejercicioud07e02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Excepciones01 {
    public static void main(String[] args) {
        try {
            throw new Exception("Excepción lanzada.");
        } catch (Exception e) {
            System.out.println("Excepción capturada.");
        }
    }
}
