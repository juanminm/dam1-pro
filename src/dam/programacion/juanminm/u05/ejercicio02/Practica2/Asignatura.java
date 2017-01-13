/*
 * 1. Desarrollar una clase llamada Asignatura que:
 *   - Tenga dos atributos prívate de tipo int (el identificador) y de tipo
 *     double (la calificación).
 *   - Tenga un constructor con un parámetro de tipo int.
 *   - Tenga un getvalor para cada uno de los atributos.
 *   - Tenga un setvalor para la calificación.
 */
package dam.programacion.juanminm.u05.ejercicio02.Practica2;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Asignatura {
    private int identificador;
    private double calificacion;

    public Asignatura(int identificador) {
        this.identificador = identificador;
    }

    public int obtenerIdentificador() {
        return identificador;
    }

    public double obtenerCalificacion() {
        return calificacion;
    }

    public void insertarCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
