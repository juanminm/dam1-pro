/*
 * 1. Desarrollar una clase llamada Punto que:
 * - Tenga dos atributos prívate de tipo double.
 * - Tenga un constructor con dos parámetros de tipo double que inicialice los
 *   dos atributos.
 * - Tenga un constructor por defecto (sin parámetros) que inicialice los dos
 *   atributos al valor que se quiera.
 * - Tenga un getvalor para cada uno de los atributos.
 * - Tenga un método calcularDistanciaDesde que recibe un parámetro de tipo
 *   Punto y que devuelve un double.
 */
package dam.programacion.juanminm.ejercicioud05e02.Practica1;

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

    public double obtenerX() {
        return x;
    }

    public double obtenerY() {
        return y;
    }

    public double calcularDistanciaDesde(Punto destino) {
        return Math.sqrt(
            Math.pow(destino.x - this.x, 2) + Math.pow(destino.y - this.y, 2)
        );
    }
}
