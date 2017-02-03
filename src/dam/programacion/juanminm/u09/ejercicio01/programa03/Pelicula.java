package dam.programacion.juanminm.u09.ejercicio01.programa03;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, int duracion,
            Formato formato) {
        super(titulo, autor, duracion, formato);
    }

    public Pelicula(String titulo, String autor, int duracion, Formato formato,
            String actor, String actriz) {
        super(titulo, autor, duracion, formato);
        this.actorPrincipal = actor;
        this.actrizPrincipal = actriz;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        String s = super.toString();

        if (actorPrincipal != null) {
            s += "Actor: " + actorPrincipal + "\n";
        }

        if (actrizPrincipal != null) {
            s += "Actriz: " + actrizPrincipal + "\n";
        }

        return s;
    }
}
