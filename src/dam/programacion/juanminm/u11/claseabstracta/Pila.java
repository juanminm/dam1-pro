/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u11.claseabstracta01;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Pila extends CollecionSimple {

    public Pila() {
    }

    @Override
    public void añadir(Object o) {
        getLista().addFirst(o);
    }
}
