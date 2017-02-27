package dam.programacion.juanminm.u10.ej04.programa05;

import java.io.Serializable;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Disco extends Multimedia implements Serializable {
    private static final long serialVersionUID = 1L;

    private String genero;

    public Disco(String titulo, String autor, int duracion,
            Formato formato) {
        super(titulo, autor, duracion, formato);
    }

    public Disco(String titulo, String autor, int duracion, Formato formato,
            String genero) {
        super(titulo, autor, duracion, formato);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        String s = super.toString() + "Genero: " + genero + "\n";
        return s;
    }
}
