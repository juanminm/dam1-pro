/*
 * 3.a.- Escribe una clase Multimedia para almacenar información de objetos de
 *   tipo multimedia (películas, discos, mp3...). Esta clase contiene título,
 *   autor, formato y duración como atributos. El formato puede ser uno de los
 *   siguientes: wav, mp3, midi, avi, mov, mpg, cdAudio y dvd. El valor de todos
 *   los atributos se pasa por parámetro en el momento de crear el objeto. Esta
 *   clase tiene, además, un método para devolver cada uno de los atributos y un
 *   método toString() que devuelve la información del objeto. Por último un
 *   método equals() que recibe un objeto de tipo Multimedia y devuelve true en
 *   caso de que el título y el autor sean iguales a los del objeto que llama al
 *   método y false en caso contrario.
 *
 * 3.b.- Escribe una clase Película que herede de la clase Multimedia anterior.
 *   La clase Película tiene, además de los atributos heredados, un actor
 *   principal y una actriz principal. Se permite que uno de los dos sea nulo,
 *   pero no los dos. La clase debe tener dos métodos para obtener los dos
 *   nuevos atributos y debe sobrescribir el método toString() para que
 *   devuelva, además de la información heredada, la nueva información.
 *
 * 3.c.- Escribe una clase ListaMultimedia para almacenar objetos de tipo
 *   multimedia. La clase debe tener un atributo que sea un array de objetos
 *   Multimedia y un entero para contar cuántos objetos hay almacenados. Además,
 *   tiene un constructor y los siguientes métodos:
 *
 *   a) el constructor recibe por parámetro un entero indicando el número máximo
 *      de objetos que va a almacenar.
 *
 *   b) int size(): devuelve el número de objetos que hay en la lista.
 *
 *   c) boolean add(Multimedia m): añade el objeto al final de la lista y
 *      devuelve true, en caso de que la lista esté llena devolverá false.
 *
 *   d) Multimedia get(int posición): devuelve el objeto situado en la posición
 *      especificada.
 *
 *   e) int indexOf(Multimedia m): devuelve la posición del objeto que se
 *      introduce por parámetro, si no se encuentra, devolverá -1.
 *
 *   f) String toString() devuelve la información de los objetos que están en la
 *      lista.
 *
 * 3.d.- Escribe una aplicación donde:
 *
 *   a) Se crea un objeto de tipo ListaMultimedia de tamaño máximo 10.
 *
 *   b) Se pidan tres películas y se añadan a la lista.
 *
 *   c) Se muestre la lista por pantalla.
 *
 *   d) Se cree un objeto de tipo Película introduciendo el título y el autor de
 *      una de las películas de la lista. Para el resto de los argumentos se
 *      utilizan valores no significativos.
 *
 *   e) Busca la posición de este objeto en la lista.
 *
 *   f) Obtenga el objeto que está en esa posición y lo muestre por pantalla
 *      junto con la posición en la que se encuentra.
 *
 * 3.f.- Escribe una clase Disco que herede de la clase Multimedia ya
 *   realizada. La clase Disco tiene, aparte de los elementos heredados, un
 *   atributo para almacenar el género al que pertenece (rock, pop, punk, etc.).
 *   La clase debe tener un método para obtener el nuevo atributo y debe
 *   sobrescribir el método toString() para que devuelva, además de la
 *   información heredada, la nueva información.
 *
 * 3.g.- Escribe una aplicación donde:
 *
 *   a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10.
 *
 *   b) Se creen tres discos y se añadan a la lista.
 *
 *   c) Se muestre la lista por pantalla.
 *
 *   d) Se cree un objeto de tipo Disco introduciendo el título y el autor de
 *      uno de los discos de la lista, para el resto de los argumentos se
 *      utilizan valores no significativos.
 *
 *   e) Busca la posición de este objeto en la lista.
 *
 *   f) Obtenga el objeto que está en esa posición y lo muestre por pantalla
 *      junto con la posición en la que se encuentra.
 */
package dam.programacion.juanminm.u09.ej01.programa03;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void pruebaClasePelicula() {
        ListaMultimedia listaMultimedia = new ListaMultimedia(10);
        Scanner scan = new Scanner(System.in);
        boolean encontrado = false;
        int posObjeto = 0;

        for (int i = 0; i < 3; i++) {
            Pelicula pelicula;
            String titulo;
            String autor;
            int duracion;
            Pelicula.Formato formato;
            String actor;
            String actriz;

            System.out.println("Pelicula nº " + (i + 1));
            System.out.print("  Introduzca el titulo: ");
            titulo = scan.nextLine();

            System.out.print("  Introduzca el autor: ");
            autor = scan.nextLine();

            System.out.print("  Duración de la película (minutos): ");
            duracion = scan.nextInt();
            scan.nextLine();

            System.out.println("  Formato de la pelicula. Formatos soportados:");

            int contador = 1;
            for(Pelicula.Formato soportado : Pelicula.Formato.values()) {
                System.out.print(soportado.getValue() + " ");
                contador++;

                if (contador > 5) {
                    System.out.println();
                    contador = 1;
                }
            }
            System.out.print("\n: ");
            formato = Pelicula.Formato.valueOf(scan.next().toUpperCase());
            scan.nextLine();

            System.out.print("Actor principal: ");
            actor = scan.nextLine();

            System.out.print("Actriz principal: ");
            actriz = scan.nextLine();

            pelicula = new Pelicula(titulo, autor, duracion,
                    formato, actor, actriz);

            listaMultimedia.add(pelicula);
        }

        System.out.println(listaMultimedia.toString());

        Pelicula peliculaABuscar = new Pelicula("Titanic", "J.J. Abrams", 0,
                null, null, null);

        while (posObjeto < listaMultimedia.size() && !encontrado) {
            if (peliculaABuscar.equals(listaMultimedia.get(posObjeto))) {
                encontrado = true;
            }

            posObjeto++;
        }

        System.out.println("Posición " + posObjeto);
        System.out.println(listaMultimedia.get(posObjeto).toString());
    }

    public static void pruebaClaseDisco() {
        ListaMultimedia listaMultimedia = new ListaMultimedia(10);
        Scanner scan = new Scanner(System.in);
        boolean encontrado = false;
        int posObjeto = 0;

        for (int i = 0; i < 3; i++) {
            Disco disco;
            String titulo;
            String autor;
            int duracion;
            Pelicula.Formato formato;
            String genero;

            System.out.println("Pelicula nº " + (i + 1));
            System.out.print("  Introduzca el titulo: ");
            titulo = scan.nextLine();

            System.out.print("  Introduzca el autor: ");
            autor = scan.nextLine();

            System.out.print("  Duración del disco (minutos): ");
            duracion = scan.nextInt();
            scan.nextLine();

            System.out.println("  Formato del disco. Formatos soportados:");

            int contador = 1;
            for(Pelicula.Formato soportado : Pelicula.Formato.values()) {
                System.out.print(soportado.getValue() + " ");
                contador++;

                if (contador > 5) {
                    System.out.println();
                    contador = 1;
                }
            }
            System.out.print("\n: ");
            formato = Pelicula.Formato.valueOf(scan.next().toUpperCase());
            scan.nextLine();

            System.out.print("Genero: ");
            genero = scan.nextLine();

            disco = new Disco(titulo, autor, duracion,
                    formato, genero);

            listaMultimedia.add(disco);
        }

        System.out.println(listaMultimedia.toString());

        Disco discoABuscar = new Disco("Star Wars", "George Lucas", 0,
                null, null);

        while (posObjeto < listaMultimedia.size() && !encontrado) {
            if (discoABuscar.equals(listaMultimedia.get(posObjeto))) {
                encontrado = true;
            }

            posObjeto++;
        }

        System.out.println("Disco " + posObjeto);
        System.out.println(listaMultimedia.get(posObjeto).toString());
    }

    public static void main(String[] args) {
        pruebaClasePelicula();

        pruebaClaseDisco();
    }
}
