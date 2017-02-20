package dam.programacion.juanminm.u10.ej02.programa03;

import java.io.Serializable;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Agenda implements Serializable {
    private String nombre;
    private String direccion;
    private long telefono;
    private String email;

    public Agenda() {
        nombre = null;
        direccion = null;
        telefono = 0;
        email = null;
    }


    public Agenda(String nombre, String direccion, long telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
