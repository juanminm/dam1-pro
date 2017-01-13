/*
 * 6. Escribe un método, de nombre enviarMensaje, que reciba por parámetro una
 *    cadena de caracteres correspondiente a una dirección de correo
 *    electrónico. El método comprobará que la dirección recibida es correcta
 *    elevando la excepción DirCorreoIncorrectaExcepcion en caso contrario. La
 *    comprobación consistirá en verificar que la dirección contiene el carácter
 *    (@), algún carácter después de él antes del carácter (.) y algún carácter
 *    después de éste
 */
package dam.programacion.juanminm.u07.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Excepciones06 {
    public static void enviarMensaje(String direccion)
            throws DirCorreoIncorrectaExcepcion {
        if (direccion.matches(".+@.+\\..+")) {
            System.out.println("Direccion correcta.");
        } else {
            throw new DirCorreoIncorrectaExcepcion("Dirección de correo \""
                    + direccion + "\" no válida.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String direccionCorreo = scanner.next();

        try {
            enviarMensaje(direccionCorreo);
        } catch (DirCorreoIncorrectaExcepcion e) {
            System.err.printf("%s%n", e.getMessage());
        }
    }
}
