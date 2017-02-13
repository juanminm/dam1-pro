/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u08.ej02.gestionpacientes;

import java.util.ArrayList;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Archivador {
    private ArrayList<Ficha> listaFichas = new ArrayList();

    public void guardar(Ficha ficha) {
        listaFichas.add(ficha);
    }

    public void eliminar(Ficha ficha) {
        listaFichas.remove(ficha);
    }

    public void listar() {
        System.out.printf("Número de fichas: %d%n", listaFichas.size());

        System.out.printf("------------------------%n");

        for (int i = 0; i < listaFichas.size(); i++) {
            System.out.printf("Ficha %d:%n", i+1);
            System.out.printf("  %-9s %s%n", "Nombre:",
                    listaFichas.get(i).obtenerNombre());
            System.out.printf("  %-9s %s%n", "Apellido:",
                    listaFichas.get(i).obtenerApellidos());
            System.out.printf("  %-9s %d%n", "Edad:",
                    listaFichas.get(i).obtenerEdad());
            System.out.println();
        }
    }
}
