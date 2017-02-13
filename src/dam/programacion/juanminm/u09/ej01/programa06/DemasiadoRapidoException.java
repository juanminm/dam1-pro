package dam.programacion.juanminm.u09.ej01.programa06;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class DemasiadoRapidoException extends Exception {

    public DemasiadoRapidoException() {
        super("El camion no puede superar más de 100 km/h si tiene un "
                + "remolque.");
    }

}
