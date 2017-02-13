package dam.programacion.juanminm.u09.ej01.programa03;

import javax.management.MBeanAttributeInfo;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class ListaMultimedia {
    private Multimedia[] listaMultimedia;
    private int size = 0;

    public ListaMultimedia(int  n) {
        listaMultimedia = new Multimedia[n];
    }

    public int size() {
        return size;
    }

    public boolean add(Multimedia m) {
        if (size == listaMultimedia.length) {
            return false;
        } else {
            listaMultimedia[size] = m;
            size++;
            return true;
        }
    }

    public Multimedia get(int posicion) {
        return listaMultimedia[posicion];
    }

    public int indexOf(Multimedia m) {
        int index = -1;

        for(int i = 0; i < listaMultimedia.length; i++) {
            if (m == listaMultimedia[i]) {
                index = i;
            }
        }

        return index;
    }

    @Override
    public String toString() {
        String s = "";

        for(Multimedia multimedia : listaMultimedia) {
            if (multimedia != null) {
                s += multimedia.toString() + "\n";
            }
        }

        return s;
    }
}
