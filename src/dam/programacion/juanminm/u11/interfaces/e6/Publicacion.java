package dam.programacion.juanminm.u11.interfaces.e6;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Publicacion {

    private String codigo;
    private String titulo;
    private int año;

    public Publicacion(String codigo, String titulo, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        String s = codigo + ", " + titulo + "," + año;
        return s;
    }
}
