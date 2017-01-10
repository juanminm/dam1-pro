package dam.programacion.juanminm.ejercicioud07e02;

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
            throw new DirCorreoIncorrectaExcepcion();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String direccionCorreo = scanner.next();

        try {
            enviarMensaje(direccionCorreo);
        } catch (DirCorreoIncorrectaExcepcion e) {
            System.out.println("Dirección de correo " + direccionCorreo + " no "
                    + "válida.");
        }
    }
}
