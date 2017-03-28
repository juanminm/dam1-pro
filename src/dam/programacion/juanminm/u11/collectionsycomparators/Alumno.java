package dam.programacion.juanminm.u11.collectionsycomparators;

import java.io.Serializable;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Alumno implements Serializable, Comparable {
    private static final long serialVersionUID = 1L;

    private int carnet;
    private String nombre;
    private String apellidos;
    private float nota1;
    private float nota2;
    private float nota3;

    public Alumno() {
    }

    public Alumno(int carnet, String nombre, String apellidos, float nota1,
            float nota2, float nota3) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno) o;

        return nombre.compareTo(a.getNombre());
    }

}
