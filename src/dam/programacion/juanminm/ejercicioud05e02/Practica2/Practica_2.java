/*
 * 1. Desarrollar una clase llamada Asignatura que:
 *   - Tenga dos atributos prívate de tipo int (el identificador) y de tipo
 *     double (la calificación).
 *   - Tenga un constructor con un parámetro de tipo int.
 *   - Tenga un getvalor para cada uno de los atributos.
 *   - Tenga un setvalor para la calificación.
 *
 * 2. Desarrollar una clase llamada Alumno que:
 *   - Tenga tres atributos prívate de tipo Asignatura.
 *   - Tenga un constructor con tres parámetros de tipo Asignatura que
 *     inicialice los tres atributos.
 *   - Tenga un constructor con tres parámetros de tipo int que inicialice los
 *     tres atributos.
 *   - Tenga un getvalor para cada uno de los atributos.
 *
 * 3. Desarrollar una clase llamada Profesor que:
 *   - Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que
 *     no devuelve nada. Pondrá una calificación aleatoria a cada una de las
 *     asignaturas del alumno.
 *   - Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y
 *     devuelve un double.
 *
 * 4. Desarrollar una clase llamada Practica_2 que en su método main:
 *   - Cree e inicialice tres Asignaturas
 *   - Cree un Alumno con las tres Asignaturas.
 *   - Cree un Profesor que le ponga calificaciones al Alumno y muestre por
 *     pantalla la media del Alumno.
 */
package dam.programacion.juanminm.ejercicioud05e02.Practica2;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Practica_2 {
    public static void main(String[] args) {
        Asignatura asignatura1 = new Asignatura(1),
                   asignatura2 = new Asignatura(2),
                   asignatura3 = new Asignatura(3);
        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);
        Profesor profesor = new Profesor();

        profesor.ponerNotas(alumno);
        System.out.printf("Nota media del alumno: %4.2f%n",
                profesor.calcularMedia(alumno));
    }
}
