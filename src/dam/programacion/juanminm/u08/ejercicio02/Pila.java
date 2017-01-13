package dam.programacion.juanminm.u08.ejercicio02;

import java.util.LinkedList;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Pila {
    private LinkedList listaElementos;

    public Pila() {
        this.listaElementos = new LinkedList();
    }

    public void añadir(Object elemento) {
        listaElementos.add(0, elemento);
    }

    public void listar() {
        for (Object elemento : listaElementos) {
            System.out.printf("%s%n", elemento.toString());
        }
    }
}
