/*
 * 5. - Modifica el ejercicio Multimedia de la unidad 09 para guardar y leer la
 * lista Multimedia en un fichero
 */
package dam.programacion.juanminm.u10.ej04.programa05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {

    private static Pelicula crearPelicula(String titulo, String autor, int duracion,
            Multimedia.Formato formato) {
        Pelicula pelicula;
        String actor;
        String actriz;
        Scanner scan = new Scanner(System.in);

        System.out.print("Actor principal: ");
        actor = scan.nextLine();

        System.out.print("Actriz principal: ");
        actriz = scan.nextLine();

        pelicula = new Pelicula(titulo, autor, duracion,
                formato, actor, actriz);

        return pelicula;
    }

    private static Disco crearDisco(String titulo, String autor, int duracion,
            Multimedia.Formato formato) {
        Scanner scan = new Scanner(System.in);
        Disco disco;
        String genero;

        System.out.print("Genero: ");
        genero = scan.nextLine();

        disco = new Disco(titulo, autor, duracion,
                formato, genero);

        return disco;
    }

    public static void crearFichero() {
        ObjectOutputStream oos = null;

        try {
            Scanner scan = new Scanner(System.in);
            int tipoMultimedia = -1;
            String titulo;
            String autor;
            int duracion;
            Multimedia.Formato formato;
            oos = new ObjectOutputStream(new BufferedOutputStream(
                        new FileOutputStream("multimedia.ser")));
            boolean terminar = false;

            do {
                System.out.print("Tipo de multimedia (película o disco): ");
                switch(scan.nextLine().toLowerCase()) {
                    case "película":
                    case "pelicula":
                        tipoMultimedia = 0;
                        break;
                    case "disco":
                        tipoMultimedia = 1;
                        break;
                    default:
                        throw new UnknownMultimediaOptionException("Tipo de "
                                + "multimedia no valido.");
                }


                System.out.print("Introduzca el titulo: ");
                titulo = scan.nextLine();

                System.out.print("Introduzca el autor: ");
                autor = scan.nextLine();

                System.out.print("Duración en minutos: ");
                duracion = scan.nextInt();
                scan.nextLine();

                System.out.println("Formato multimedia. Formatos soportados:");

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

                switch(tipoMultimedia) {
                    case 0:
                        oos.writeObject(crearPelicula(titulo, autor, duracion,
                                formato));
                        break;
                    case 1:
                        oos.writeObject(crearDisco(titulo, autor, duracion,
                                formato));
                        break;
                }

                System.out.print("¿Crear un nuevo registro multimedia (C) o "
                        + "finalizar (F)? ");

                switch(scan.nextLine().toLowerCase()) {
                    case "C":
                        terminar = true;
                    case "F":
                        break;
                    default:
                        System.out.println("Opción invalida. Terminando...");
                        terminar = true;
                }
            } while (!terminar);
        } catch (UnknownMultimediaOptionException | IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

    public static void leerFichero() {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new BufferedInputStream(
                        new FileInputStream("multimedia.ser")));
            Multimedia m;
            Pelicula pelicula;
            Disco disco;

            while(true) {
                m = (Multimedia) ois.readObject();

                if (m instanceof Pelicula) {
                    pelicula = (Pelicula) m;

                    System.out.println(pelicula.toString());
                }

                if (m instanceof Disco) {
                    disco = (Disco) m;

                    System.out.println(disco.toString());
                }
            }
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Bienvenido al Administrador Multimedia.");
        System.out.println();
        do {
            System.out.println("¿Crear una lista (c), leer una lista (l) o "
                    + "salir (S)? ");


            switch(scan.nextLine().toLowerCase()) {
                case "c":
                    crearFichero();
                    break;
                case "l":
                    leerFichero();
                    break;
                case "s":
                    salir = true;
                    break;
                default:
                    System.err.println("Opción invalida.");
            }
        } while (!salir);
    }
}
