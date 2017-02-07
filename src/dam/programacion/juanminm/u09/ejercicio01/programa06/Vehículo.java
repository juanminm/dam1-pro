package dam.programacion.juanminm.u09.ejercicio01.programa06;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Vehículo {
    private String matricula;
    private double velocidad;

    public Vehículo(String m) {
        matricula = m;
        velocidad = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return String.format("Matricula: %s%nVelocidad: %.2f km/h", matricula,
                velocidad);
    }

    public void acelerar(double a) {
        velocidad += a;
    }
}
