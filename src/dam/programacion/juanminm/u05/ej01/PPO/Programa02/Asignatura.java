package dam.programacion.juanminm.u05.ej01.PPO.Programa02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Asignatura {
    private String nombre;
    private int codigo;
    private int curso;

    public Asignatura(String n, int co, int cu) {
        nombre = n;
        codigo = co;
        curso = cu;
    }

    public void getAsignatura() {
        System.out.println("Asignatura: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Curso: " + curso);
    }

}
