package dam.programacion.juanminm.u11.claseabstracta01;

import java.util.LinkedList;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public abstract class CollecionSimple {
    private LinkedList<Object> lista;

    public CollecionSimple() {
        lista = new LinkedList<Object>();
    }

    public abstract void añadir(Object o);

    public Object extraer() {
        return lista.removeFirst();
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public Object primero() {
        return lista.getFirst();
    }

    @Override
    public String toString() {
        return lista.toString();
    }

    protected LinkedList<Object> getLista() {
        return lista;
    }
}
