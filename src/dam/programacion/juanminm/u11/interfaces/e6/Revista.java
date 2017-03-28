/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u11.interfaces.e6;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Revista extends Publicacion {

    private int numero;

    public Revista(String codigo, String titulo, int año, int numero) {
        super(codigo, titulo, año);
        this.numero = numero;
    }

    @Override
    public String toString() {
        String s = super.toString() + ", " + numero;
        return s;
    }

}
