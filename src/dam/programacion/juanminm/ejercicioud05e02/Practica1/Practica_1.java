/*
 * Practica 1
 * 1. Desarrollar una clase llamada Punto que:
 * - Tenga dos atributos prívate de tipo double.
 * - Tenga un constructor con dos parámetros de tipo double que inicialice los
 *   dos atributos.
 * - Tenga un constructor por defecto (sin parámetros) que inicialice los dos
 *   atributos al valor que se quiera.
 * - Tenga un getvalor para cada uno de los atributos.
 * - Tenga un método calcularDistanciaDesde que recibe un parámetro de tipo
 *   Punto y que devuelve un double.
 *
 * 2. Desarrollar una clase llamada Circulo que:
 * - Tenga dos atributos prívate de tipo Punto y double.
 * - enga un constructor con dos parámetros de tipo Punto y double que
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
 *
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
 *
 * 4. Desarrollar una clase llamada Practica_1 que en su método main:
 * - Cree e inicialice dos objetos de la clase Punto y muestre la distancia
 *   entre ambos.
 * - Cree un objeto de la clase Circulo y muestre su área, perímetro y distancia
 *   a uno de los dos puntos creados al comienzo.
 * - Cree un objeto de la clase Triangulo y muestre su área, perímetro y
 *   distancia a un nuevo punto.
 *
 * Nota 1: No seremos rigurosos con las matemáticas y supondremos que los
 * triángulos siempre son rectángulos.
 */
package dam.programacion.juanminm.ejercicioud05e02.Practica1;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Practica_1 {
    public static void main(String[] args) {
        Punto punto1, punto2, punto3;
        Circulo circulo;
        Triangulo triangulo;

        punto1 = new Punto(5, -3);
        punto2 = new Punto(3, 6);

        circulo = new Circulo(8, 10, 4);
        System.out.printf("%-36s %f %n", "Area del circulo:", circulo.calcularArea());
        System.out.printf("%-36s %f %n", "Perimetro del circulo:",
                circulo.calcularPerimetro());
        System.out.printf("%-36s %f %n", "Distancia del circulo al punto 1:",
                circulo.calcularDistanciaDesde(punto1));
        System.out.println();

        triangulo = new Triangulo(0, 4, -1, 3, 5, -2);
        punto3 = new Punto(0, 7);

        System.out.printf("%-36s %f %n", "Area del triangulo:", triangulo.calcularArea());
        System.out.printf("%-36s %f %n", "Perimetro del triangulo:",
                triangulo.calcularPerimetro());
        System.out.printf("%-36s %f %n", "Distancia del triangulo al punto 3:",
                triangulo.calcularDistanciaDesde(punto1));
    }
}
