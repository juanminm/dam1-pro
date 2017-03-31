/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u11.claseabstracta;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {

    public static void rellenar(CollecionSimple c) {
        for (int i=1; i<=10; i++) {
            c.añadir(i);
        }
    }

    public static void imprimirYVaciar(CollecionSimple c) {
        while(!c.estaVacia()) {
            System.out.println(c.extraer());
        }
    }

    public static void main(String[] args) {
        Pila p = new Pila();
        rellenar(p);
        System.out.println("Datos de la pila:");
        imprimirYVaciar(p);

        Cola c = new Cola();
        rellenar(c);
        System.out.println("Datos de la cola:");
        imprimirYVaciar(c);

        p.añadir("Primero");
        p.añadir(new Boolean(true));
        p.añadir(7.5);
        p.añadir(c);
        System.out.println("Datos de la pila");
        imprimirYVaciar(p);
    }
}
