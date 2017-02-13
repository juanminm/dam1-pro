package dam.programacion.juanminm.u07.ej02;

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
