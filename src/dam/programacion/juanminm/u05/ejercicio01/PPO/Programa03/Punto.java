 package dam.programacion.juanminm.u05.ejercicio01.PPO.Programa03;

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

    public double getCoordenadaX() {
        return x;
    }

    public double getCoordenadaY() {
        return y;
    }

    public double distancia() {
        double distancia;

        distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        return distancia;
    }

    public double distancia(Punto punto) {
        double ladoX;
        double ladoY;
        double distancia;

        ladoX = punto.x - this.x;
        ladoY = punto.y - this.y;

        distancia = Math.sqrt(Math.pow(ladoX, 2) + Math.pow(ladoY, 2));

        return distancia;
    }

}
