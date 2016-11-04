 package dam.programacion.juanminm.ejercicioud05e01.PPOStatic.Programa02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Punto {
    private double x;
    private double y;
    private static double origenX = 0;
    private static double origenY = 0;

    public Punto() {
        x = origenX;
        y = origenY;
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
        Punto origen = new Punto();

        return distancia(origen);
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
