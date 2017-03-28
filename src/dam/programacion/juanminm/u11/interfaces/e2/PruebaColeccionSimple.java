/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u11.interfaces.e2;

import dam.programacion.juanminm.u11.interfaces.e1.*;

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
        PilaArray pa = new PilaArray(15);

        rellenar(pa);
        System.out.println("Contenido pila:\n" + pa.toString());
        imprimirYVaciar(pa);
        System.out.println("Contenido pila:\n" + pa.toString());
    }
}
