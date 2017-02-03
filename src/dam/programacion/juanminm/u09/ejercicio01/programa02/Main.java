/*
 * 2.a. - Escribe una clase Punto() que contenga los siguientes métodos:
 *
 *   a) los constructores y los métodos getX(), getY(), setX(), setY() y
 *      distancia()
 *
 *   b) Un método toString() que devuelva la información del Punto de la siguiente
 *      manera (x,y).
 *
 * 2.b.- Utilizando la clase Punto del ejercicio anterior, escribe una clase
 *   Polígono. Esta clase tiene como atributo un array de objetos Punto.
 *   Se consideran adyacentes los objetos Punto que estén en celdas consecutivas
 *   del array y los puntos que están en la primera y última celda. Esta clase
 *   ha de tener los siguientes métodos:
 *
 *   a) El constructor, recibirá por parámetro un array con los objetos Punto
 *      que definen el Polígono.
 *
 *   b) trasladar(), recibe por parámetro el desplazamiento en la coordenada x y
 *      el desplazamiento en la coordenada y.
 *
 *   c) escalar(), recibe por parámetro el factor de escala para la coordenada x
 *      y el factor de escala para la coordenada y.
 *
 *   d) numVértices(), devuelve el número de vértices del Polígono.
 *
 *   e) toString(), devuelve la información de los puntos del Polígono, uno en
 *      cada línea.
 *
 *   f) perímetro(). Devuelve el perímetro del polígono.
 *
 * 2.c.- Escribe una aplicación en la que:
 *
 *   a) Cree un Polígono de cuatro vértices, que serán (0,0), (2,0), (2,2),
 *      (0,2) y de color rojo.
 *
 *   b) Muestra la información del polígono y su perímetro por pantalla.
 *
 *   c) Trasladar el polígono 4 en el eje x y -3 en el eje y.
 *
 *   d) Muestra la información del polígono por pantalla.
 */
package dam.programacion.juanminm.u09.ejercicio01.programa02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(2, 0);
        Punto punto3 = new Punto(2, 2);
        Punto punto4 = new Punto(0, 2);
        Punto[] puntos = {punto1, punto2, punto3, punto4};
        Poligono cuadrado = new Poligono(puntos);

        System.out.println("*** Poligono creado ***");

        System.out.println("Mostrando la información...");
        System.out.println(cuadrado.toString());
        System.out.println("Perimetro: " + cuadrado.perimetro());

        cuadrado.trasladar(4, -3);
        System.out.println("*** Poligono creado ***");

        System.out.println(cuadrado.toString());
        System.out.println("Perimetro: " + cuadrado.perimetro());
    }
}
