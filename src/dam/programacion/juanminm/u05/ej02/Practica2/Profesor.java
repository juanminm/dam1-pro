/*
 * 3. Desarrollar una clase llamada Profesor que:
 *   - Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que
 *     no devuelve nada. Pondrá una calificación aleatoria a cada una de las
 *     asignaturas del alumno.
 *   - Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y
 *     devuelve un double.
 */
package dam.programacion.juanminm.u05.ej02.Practica2;

import java.util.Random;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Profesor {
    public void ponerNotas(Alumno alumno) {
        Random rnd = new Random();
        Asignatura asignatura1, asignatura2, asignatura3;

        asignatura1 = alumno.obtenerAsignatura1();
        asignatura2 = alumno.obtenerAsignatura2();
        asignatura3 = alumno.obtenerAsignatura3();

        asignatura1.insertarCalificacion(rnd.nextDouble()*10);
        asignatura2.insertarCalificacion(rnd.nextDouble()*10);
        asignatura3.insertarCalificacion(rnd.nextDouble()*10);
    }

    public double calcularMedia(Alumno alumno) {
        Asignatura asignatura1, asignatura2, asignatura3;
        double nota1, nota2, nota3, media;

        asignatura1 = alumno.obtenerAsignatura1();
        asignatura2 = alumno.obtenerAsignatura2();
        asignatura3 = alumno.obtenerAsignatura3();

        nota1 = asignatura1.obtenerCalificacion();
        nota2 = asignatura2.obtenerCalificacion();
        nota3 = asignatura3.obtenerCalificacion();

        media = (nota1 + nota2 + nota3)/3;

        return media;
    }
}
