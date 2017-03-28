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
public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String codigo, String titulo, int año) {
        super(codigo, titulo, año);
        this.prestado = false;
    }

    @Override
    public String toString() {
        String s = super.toString() + ", "
                + (prestado ? "Prestado" : "No prestado");

        return s;
    }

    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }

}
