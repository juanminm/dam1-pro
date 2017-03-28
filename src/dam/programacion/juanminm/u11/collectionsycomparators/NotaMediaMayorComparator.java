/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u11.collectionsycomparators;

import java.util.Comparator;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class NotaMediaMayorComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;

        Float notaMediaAlumno1 = (a1.getNota1() + a1.getNota2() + a1.getNota3())
                / 3;
        Float notaMediaAlumno2 = (a2.getNota1() + a2.getNota2() + a2.getNota3())
                / 3;

        return notaMediaAlumno1.compareTo(notaMediaAlumno2);
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
