/*
 * 2. Desarrollar una clase llamada Alumno que:
 *   - Tenga tres atributos prívate de tipo Asignatura.
 *   - Tenga un constructor con tres parámetros de tipo Asignatura que
 *     inicialice los tres atributos.
 *   - Tenga un constructor con tres parámetros de tipo int que inicialice los
 *     tres atributos.
 *   - Tenga un getvalor para cada uno de los atributos.
 */
package dam.programacion.juanminm.ejercicioud05e02.Practica2;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Alumno {
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;

    public Alumno(Asignatura asignatura1, Asignatura asignatura2,
            Asignatura asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int identificador1, int identificador2, int identificador3) {
        this.asignatura1 = new Asignatura(identificador1);
        this.asignatura2 = new Asignatura(identificador2);
        this.asignatura3 = new Asignatura(identificador3);
    }

    public Asignatura obtenerAsignatura1() {
        return asignatura1;
    }

    public Asignatura obtenerAsignatura2() {
        return asignatura2;
    }

    public Asignatura obtenerAsignatura3() {
        return asignatura3;
    }

}
