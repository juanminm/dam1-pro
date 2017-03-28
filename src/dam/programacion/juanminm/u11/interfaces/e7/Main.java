/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u11.interfaces.e7;

import dam.programacion.juanminm.u11.interfaces.e6.Libro;
import dam.programacion.juanminm.u11.interfaces.e6.Prestable;
import dam.programacion.juanminm.u11.interfaces.e6.Publicacion;
import dam.programacion.juanminm.u11.interfaces.e6.Revista;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {

    public static int cuantaPestados(Publicacion[] p) {
        int contador = 0;

        for (Publicacion p1 : p) {
            if (p1 instanceof Prestable && ((Prestable) p1).prestado()) {
                contador++;
            }
        }

        return contador;
    }

    public static int publicacionesAnterioresA(Publicacion[] p, int año) {
        int contador = 0;

        for (Publicacion p1 : p) {
            if (p1.getAño() < año) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Libro l1 = new Libro("32A5-B6", "Las momias de la oscuridad",
                1837);
        Libro l2 = new Libro("34PG-A3", "El secreto de Canthervich",
                1992);
        Revista r1 = new Revista("210W-I1", "Political Times", 2003, 7);
        Revista r2 = new Revista("P702-N6", "Suntime Plaza", 1973, 29);
        Publicacion[] p = {l1, l2, r1, r2};


        l1.prestar();
        System.out.println("Libros prestadas: " + cuantaPestados(p));
        System.out.println("Publicaciones anteriores a 1980: "
                + publicacionesAnterioresA(p, 1980));

    }
}
