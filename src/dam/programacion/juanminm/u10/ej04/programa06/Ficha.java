package dam.programacion.juanminm.u10.ej04.programa06;

import java.io.Serializable;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Ficha implements Serializable {
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
