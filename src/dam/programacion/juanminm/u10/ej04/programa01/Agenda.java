/*
 * 1. - Crea la clase miAgenda con los atributos:
 *     String nombre
 *     String direccion
 *     ArrayList<String> listaTelefono
 *     String email
 */
package dam.programacion.juanminm.u10.ej04.programa01;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Agenda implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombre;
    private String direccion;
    private ArrayList<String> listaTelefono;
    private String email;

    public Agenda() {
        nombre = null;
        direccion = null;
        listaTelefono = null;
        email = null;
    }

    public Agenda(String nombre, String direccion, ArrayList<String> fono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaTelefono = fono;
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

    public ArrayList<String> getListaTelefono() {
        return listaTelefono;
    }

    public void setListaTelefono(ArrayList<String> listaTelefono) {
        this.listaTelefono = listaTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
