package dam.programacion.juanminm.u10.ej04.programa06;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Archivador implements Serializable {
    private ArrayList<Ficha> listaFichas = new ArrayList();

    public ArrayList<Ficha> getListaFichas() {
        return listaFichas;
    }

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
            System.out.printf("Ficha %d:%n", i);
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
