package dam.programacion.juanminm.u09.ej01.programa03;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Disco extends Multimedia {
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
