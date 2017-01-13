/*
 * 2. Desarrollar una clase llamada Circulo que:
 * - Tenga dos atributos prívate de tipo Punto y double.
 * - Tenga un constructor con dos parámetros de tipo Punto y double que
 *   inicialice los dos atributos.
 * - Tenga un constructor por defecto (sin parámetros) que inicialice los dos
 *   atributos al valor que se quiera.
 * - Tenga un constructor con tres parámetros de tipo double que inicialice los
 *   dos atributos.
 * - Tenga un getvalor para cada uno de los atributos.
 * - Tenga un método calcularDistanciaDesde que recibe un parámetro de tipo
 *   Punto y que devuelve un double.
 * - Tenga un método calcularArea que no recibe ningún parámetro y devuelve un
 *   double.
 * - Tenga un método calcularPeímetro que no recibe ningún parámetro y devuelve
 *   un double.
 */
package dam.programacion.juanminm.u05.ejercicio02.Practica1;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo() {
        centro = new Punto();
        radio = 0;
    }

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo(double x, double y, double radio) {
        this.centro = new Punto(x, y);
        this.radio = radio;
    }

    public double obtenerCentroX() {
        return centro.obtenerX();
    }

    public double obtenerCentroY() {
        return centro.obtenerY();
    }

    public void obtenerCentro() {
        System.out.printf("(%f, %f)%n", obtenerCentroX(), obtenerCentroY());
    }

    public double calcularDistanciaDesde(Punto destino) {
        return Math.sqrt(
            Math.pow(destino.obtenerX() - centro.obtenerX(), 2)
            + Math.pow(destino.obtenerY() - centro.obtenerY(), 2)
        );
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
