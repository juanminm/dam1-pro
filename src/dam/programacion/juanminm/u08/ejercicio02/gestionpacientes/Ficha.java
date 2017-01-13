package dam.programacion.juanminm.u08.ejercicio02.gestionpacientes;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Ficha {
    private String nombre;
    private String apellidos;
    private int edad;

    public Ficha(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public int obtenerEdad() {
        return edad;
    }
}
