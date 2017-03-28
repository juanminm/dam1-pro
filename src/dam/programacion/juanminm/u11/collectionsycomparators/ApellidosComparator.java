package dam.programacion.juanminm.u11.collectionsycomparators;

import java.util.Comparator;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ApellidosComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;

        return a1.getApellidos().compareTo(a2.getApellidos());
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
