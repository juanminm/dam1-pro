package dam.programacion.juanminm.u09.ejercicio01.programa01;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Examen {
    private String asignatura;
    private String aula;
    private Fecha fecha;
    private Hora hora;

    public Examen(String asignatura, String aula, Fecha fecha, Hora hora) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getAula() {
        return aula;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
}
