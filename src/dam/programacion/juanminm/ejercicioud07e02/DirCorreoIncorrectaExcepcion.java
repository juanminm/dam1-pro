package dam.programacion.juanminm.ejercicioud07e02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class DirCorreoIncorrectaExcepcion extends Exception {
    public DirCorreoIncorrectaExcepcion() {
        super("Dirección invalida.");
    }

    public DirCorreoIncorrectaExcepcion(String msg) {
        super(msg);
    }
}
