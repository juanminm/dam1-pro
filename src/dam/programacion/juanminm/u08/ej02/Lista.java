package dam.programacion.juanminm.u08.ej02;

import java.util.LinkedList;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Lista {
    private LinkedList listaElementos;

    public Lista() {
        this.listaElementos = new LinkedList();
    }

    public void añadir(Object elemento) {
        listaElementos.add(elemento);
    }

    public void listar() {
        for (Object elemento : listaElementos) {
            System.out.printf("%s%n", elemento.toString());
        }
    }

}
