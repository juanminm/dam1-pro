package dam.programacion.juanminm.u11.interfaces.e1;

import java.util.NoSuchElementException;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class PilaArray implements ColeccionSimple {
    private Object[] array;
    private int contador;

    public PilaArray(int tamañoMaximo) {
        array = new Object[tamañoMaximo];
        contador = 0;
    }

    @Override
    public boolean estaVacía() {
        if (contador == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object extraer() {
        if(estaVacía()) {
            throw new NoSuchElementException();
        } else {
            return array[--contador];
        }
    }

    @Override
    public Object primero() {
        if(estaVacía()) {
            throw new NoSuchElementException();
        } else {
            return array[contador - 1];
        }
    }

    @Override
    public boolean añadir(Object o) {
        if(contador < array.length) {
            array[contador++] = o;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String s = "[";

        for (int i = contador - 1; i >= 0; i--) {
            s += array[i].toString();

            if (i != 0) {
                s += ",";
            }
        }

        return s += "]";
    }
}
