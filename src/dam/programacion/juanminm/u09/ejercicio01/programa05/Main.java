package dam.programacion.juanminm.u09.ejercicio01.programa05;

import dam.programacion.juanminm.u09.ejercicio01.programa03.*;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    private static int calcularDuracionTotal(ListaMultimedia lista) {
        int duracionTotal = 0;

        for (int i = 0; i < lista.size(); i++) {
            duracionTotal += lista.get(i).getDuracion();
        }

        return duracionTotal;
    }

    private static int contarDiscosRock(ListaMultimedia lista) {
        int cantidad = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Disco) {
                if (((Disco)lista.get(i)).getGenero().equalsIgnoreCase("rock")) {
                    cantidad++;
                }
            }
        }

        return cantidad;
    }

    private static int contarPeliculasSinActriz(ListaMultimedia lista) {
        int cantidad = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Pelicula) {
                if (((Pelicula)lista.get(i)).getActrizPrincipal() == null) {
                    cantidad++;
                }
            }
        }

        return cantidad;
    }

    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(10);
        Disco disco1 = new Disco("Can't hlep falling", "Elvis Presley", 3,
                Multimedia.Formato.MP3, "Rock");
        Disco disco2 = new Disco("Sonata", "Mozart", 6, Multimedia.Formato.WAV,
                "Clasica");
        Disco disco3 = new Disco("My Name is Skrillex", "Skrillex", 4,
                Multimedia.Formato.MP3, "Electronica");
        Pelicula pelicula1 = new Pelicula(
                "Star Wars: Episodio VII - El Despertar de la Fuerza",
                "George Lucas", 80, Multimedia.Formato.AVI, "John Boyega",
                "Daisly Ridley");
        Pelicula pelicula2 = new Pelicula("Avatar", "James Cameron", 76,
                Multimedia.Formato.MOV, "Sam Worthington", "Zoe Saldaña");
        Pelicula pelicula3 = new Pelicula("Zootopia", "Byron Howard", 108,
                Multimedia.Formato.AVI, "Jason Bateman", "Ginnifer Goodwin");

        lista.add(disco1);
        lista.add(disco2);
        lista.add(disco3);
        lista.add(pelicula1);
        lista.add(pelicula2);
        lista.add(pelicula3);

        System.out.printf("Lista multimedia:%n %s%n", lista.toString());
        System.out.printf("Duración total: %d%n", calcularDuracionTotal(lista));
        System.out.printf("Hay %d disco(s) de genero Rock.%n",
                contarDiscosRock(lista));
        System.out.printf("Hay %d peliculas sin actriz principal.%n",
                contarPeliculasSinActriz(lista));
    }
}
