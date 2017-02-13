package dam.programacion.juanminm.u09.ej01.programa04;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Coche {
    private String matricula;
    private double velocidad;
    private int marcha;

    public Coche (String matricula) {
        this.matricula = matricula;
        velocidad = 0;
        marcha = 0;
    }

    public String getMatrícula() {
        return matricula;
    }

    public int getMarcha() {
        return marcha;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void acelerar(double aumento) {
        velocidad = velocidad + aumento;
    }

    public void frenar(double decremento) {
        if (decremento > velocidad) {
            System.err.println("La velocidad no puede ser negativa");
        } else {
            velocidad = velocidad - decremento;
        }
    }

    public String toString() {
        String s = "";

        s += "Matricula: " + matricula + "\n";
        s += "Velocidad: " + velocidad + "\n";
        s += "Marcha: " + marcha + "\n";

        return s;
    }

    protected void cambiaMarcha(int nuevaMarcha) {
        marcha = nuevaMarcha;
    }
}
