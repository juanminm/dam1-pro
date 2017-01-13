/*
 * 3.-Desarrollar la implementación de una pila LIFO (Last Input First Output) y
 * de una cola FIFO (First Input First Output).
 *
 * Nos basaremos en la clase java.util.LinkedList.
 *
 * Las implementaciones deben ser genéricas, es decir, deben aceptar cualquier
 * tipo de objeto.
 *
 * La clase Ejercicio3 tiene un método main en el que se crearán un objeto Pila
 * y un objeto Lista. Se les añadiráb los mismos elementos y en el mismo orden y
 * luego se mostrarán por pantalla en el orden que los devuelvan cada una.
 */
package dam.programacion.juanminm.u08.ejercicio02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Lista cola = new Lista();

        pila.añadir("cola");
        pila.añadir(2);
        pila.añadir(0.5f);
        pila.añadir('c');
        pila.añadir(-0.0304);

        cola.añadir("cola");
        cola.añadir(2);
        cola.añadir(0.5f);
        cola.añadir('c');
        cola.añadir(-0.0304);

        System.out.println("Listando pila LIFO...");
        pila.listar();

        System.out.println("");
        System.out.println("Listando cola FIFO...");
        cola.listar();
    }
}
