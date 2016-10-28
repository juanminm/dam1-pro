/*
 * 3. Clase PUNTO
 *
 * a) Definir una clase que represente un punto en un espacio bidimensional.
 *    La clase debe disponer de un constructor con las coordenadas del punto y
 *    métodos accesores a las coordenadas
 * b) Escribe un programa que instancie cuatro puntos: el primero situado en el
 *    origen, el segundo situado en (5,3), el tercero en (2, -1) y el cuarto
 *    estará situado en el punto medio entre el segundo y el tercero.
 * c) Añade a la clase Punto un constructor sin pará metros, que permita
 *    construir puntos en el origen de coordenadas
 * d) Añade un método a la clase Punto que calcule la distancia a otro punto
 * e) Escribir un programa que cree un punto en (4,3) y visualice la distancia
 *    del punto al origen de coordenadas
 * f) Escribe la clase Punto con dos métodos llamados distancia. Uno de ellos
      calcula la distancia a otro punto y el otro calcula la distancia al
      origen
 */
package dam.programacion.juanminm.ejercicioud05e01.Programa03;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(5, 3);
        Punto punto3 = new Punto(2, -1);
        Punto punto4;

        punto4 = new Punto((punto2.getCoordenadaX() + punto3.getCoordenadaX())/2,
                (punto2.getCoordenadaY() + punto3.getCoordenadaY())/2);
    }
}
