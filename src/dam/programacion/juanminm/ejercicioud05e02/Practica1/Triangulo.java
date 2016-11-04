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
package dam.programacion.juanminm.ejercicioud05e02.Practica1;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Triangulo {
    private double catetoBase;
    private double catetoAltura;
    private double hipotenusa;

    public Triangulo() {
        catetoBase = 1;
        catetoAltura = 1;
        hipotenusa = calcularHipotenusa(catetoBase, catetoAltura);
    }

    public Triangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
        catetoBase = puntoA.calcularDistanciaDesde(puntoB);
        catetoAltura = puntoA.calcularDistanciaDesde(puntoC);
        hipotenusa = puntoB.calcularDistanciaDesde(puntoC);
    }

    private double calcularHipotenusa(double catetoBase, double catetoAltura) {
        return Math.sqrt(Math.pow(catetoBase, 2) + Math.pow(catetoAltura, 2));
    }
}
