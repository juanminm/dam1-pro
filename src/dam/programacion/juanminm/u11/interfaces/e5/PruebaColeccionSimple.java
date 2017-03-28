/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u11.interfaces.e5;

import dam.programacion.juanminm.u11.interfaces.e1.ColeccionSimple;
import dam.programacion.juanminm.u11.interfaces.e3.Cola;
import dam.programacion.juanminm.u11.interfaces.e4.PilaArrayList;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class PruebaColeccionSimple {

    public static void rellenar(ColeccionSimple cs) {
        for (int i = 1; i <= 10; i++) {
            cs.añadir(i);
        }
    }

    public static void imprimirYVaciar(ColeccionSimple cs) {
        while(!cs.estaVacía()) {
            System.out.println(cs.extraer());
        }
    }

    public static void main(String[] args) {
        Cola c = new Cola();
        rellenar(c);
        System.out.println("Contenido de la cola:\n" + c.toString());
        imprimirYVaciar(c);
        System.out.println("Contenido de la cola:\n" + c.toString());

        PilaArrayList pal = new PilaArrayList();
        rellenar(pal);
        System.out.println("Contenido de la lista:\n" + pal.toString());
        imprimirYVaciar(pal);
        System.out.println("Contenido de la lista:\n" + pal.toString());
    }
}
