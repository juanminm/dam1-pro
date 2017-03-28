package dam.programacion.juanminm.u11.interfaces.e3;

import dam.programacion.juanminm.u11.interfaces.e1.ColeccionSimple;
import java.util.LinkedList;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Cola implements ColeccionSimple {
    private LinkedList<Object> colaLista;

    public Cola() {
        colaLista = new LinkedList<Object>();
    }

    @Override
    public boolean añadir(Object o) {
        colaLista.add(o);
        return true;
    }

    @Override
    public boolean estaVacía() {
        return colaLista.isEmpty();
    }

    @Override
    public Object extraer() {
        return colaLista.removeFirst();
    }

    @Override
    public Object primero() {
        return colaLista.getFirst();
    }

    @Override
    public String toString() {
        return colaLista.toString();
    }

}
