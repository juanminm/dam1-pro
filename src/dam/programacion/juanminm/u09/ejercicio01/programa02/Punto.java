package dam.programacion.juanminm.u09.ejercicio01.programa02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Punto {
    private double x;
    private double y;

    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto destino) {
        double distancia = Math.sqrt(Math.pow(destino.getX() - this.x, 2)
                + Math.pow(destino.getY() - this.y, 2));

        return distancia;
    }

    @Override
    public String toString() {
        String s = "(" + this.x + ", " + this.y + ")";

        return s;
    }
}
