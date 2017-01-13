/*
 * 3. Desarrollar una clase llamada Triangulo que:
 * - Tenga tres atributos prívate de tipo Punto.
 * - Tenga un constructor con tres parámetros de tipo Punto que inicialice los
 *   dos atributos.
 * - Tenga un constructos por defecto (sin parámetros) que inicialice los tres
 *   atributos al valor que se quiera.
 * - Tenga un constructor con seis parámetros de tipo double que inicialice los
 *   tres atributos.
 * - Tenga un getvalor para cada uno de los atributos.
 * - Tenga un método calcularDistanciaDesde que recibe un parámetro de tipo
 *   Punto y que devuelve un doublé.
 * - Tenga un método calcularArea que no recibe ningún parámetro y devuelve un
 *   double.
 * - Tenga un método calcularPerimetro que no recibe ningún parámetro y devuelve
 *   un double.
 */
package dam.programacion.juanminm.u05.ejercicio02.Practica1;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Triangulo {
    private Punto puntoA;
    private Punto puntoB;
    private Punto puntoC;

    public Triangulo() {
        puntoA = new Punto(0,0);
        puntoB = new Punto(0,1);
        puntoC = new Punto(1,0);
    }

    public Triangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        this.puntoC = puntoC;
    }

    public Triangulo(double coordenadaXPuntoA, double coordenadaYPuntoA,
            double coordenadaXPuntoB, double coordenadaYPuntoB,
            double coordenadaXPuntoC, double coordenadaYPuntoC
            ) {
        puntoA = new Punto(coordenadaXPuntoA, coordenadaYPuntoA);
        puntoB = new Punto(coordenadaXPuntoB, coordenadaYPuntoB);
        puntoC = new Punto(coordenadaXPuntoC, coordenadaYPuntoC);
    }

    public Punto obtenerPuntoA() {
        return puntoA;
    }

    public Punto obtenerPuntoB() {
        return puntoB;
    }

    public Punto obtenerPuntoC() {
        return puntoC;
    }

    public double calcularDistanciaDesde(Punto punto) {
        double distancia;
        Punto centro;
        double centroX = (this.puntoA.obtenerX() + this.puntoB.obtenerX()
                + this.puntoC.obtenerX())/3;
        double centroY = (this.puntoA.obtenerY() + this.puntoB.obtenerY()
                + this.puntoC.obtenerY())/3;

        centro = new Punto(centroX, centroY);

        distancia = centro.calcularDistanciaDesde(punto);

        return distancia;
    }

    public double calcularArea(){
        /*
         * La Fórmula del área de Gauss se representa como:
         *
         * A = 1/2 * |x1y2 + x2y3 + x3y1 - x2y1 - x3y2 - x1y3|
         *   = 1/2 * |x1(y2-y3) + x2(y3-y1) + x3(y1-y2)|
         */
        return Math.abs((puntoA.obtenerX()*(puntoB.obtenerY()-puntoC.obtenerY())
                + puntoB.obtenerX()*(puntoC.obtenerY()-puntoA.obtenerY())
                + puntoC.obtenerX()*(puntoA.obtenerY()-puntoB.obtenerY())))/2;
    }

    public double calcularPerimetro() {
        return puntoA.calcularDistanciaDesde(puntoB)
                + puntoA.calcularDistanciaDesde(puntoC)
                + puntoB.calcularDistanciaDesde(puntoC);
    }
}
