/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u11.interfaces.e4;

import dam.programacion.juanminm.u11.interfaces.e1.ColeccionSimple;
import java.util.ArrayList;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class PilaArrayList extends ArrayList<Object> implements ColeccionSimple {

    private static final long serialVersionUID = 1L;

    public PilaArrayList() {
    }

    @Override
    public boolean estaVacía() {
        return isEmpty();
    }

    @Override
    public Object extraer() {
        return remove(0);
    }

    @Override
    public Object primero() {
        return get(0);
    }

    public boolean añadir(Object o) {
        add(0, o);
        return true;
    }

}
