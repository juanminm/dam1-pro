/*
 * 6. - Modifica el ejercicio archivador de pacientes de la unidad 08 para
 * guardar y leer la lista de pacientes en un fichero.
 */
package dam.programacion.juanminm.u10.ej04.programa06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
public class GestionPaquetes {
    public static Archivador abrirFichero() {
        ObjectInputStream ois = null;
        Scanner scan = new Scanner(System.in);

        try {
            Archivador archivador;
            ois = new ObjectInputStream(new BufferedInputStream(
                        new FileInputStream("archivador.ser")));

            archivador = (Archivador) ois.readObject();
            System.out.println("El archivo ha sido leido. Pulse ENTER para "
                    + "continuar...");
            scan.nextLine();

            return archivador;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());

            return null;
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

    public static void guardarFichero(Archivador archivador) {
        ObjectOutputStream oos = null;
        Scanner scan = new Scanner(System.in);

        try {

            oos = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream("archivador.ser")));

            oos.writeObject(archivador);
            System.out.println("El archivo ha sido guardado. Pulse ENTER para "
                    + "continuar...");
            scan.nextLine();
        } catch (IOException e) {
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

    private static Archivador guardarFicha(Archivador archivador) {
        Scanner scan = new Scanner(System.in);
        boolean terminar = false;

        do {
            String nombre;
            String apellidos;
            int edad;

            System.out.print("Nombre del paciente: ");
            nombre = scan.nextLine();

            System.out.print("Apellidos del paciente: ");
            apellidos = scan.nextLine();

            System.out.print("Edad del paciente: ");
            edad = scan.nextInt();
            scan.nextLine();

            archivador.guardar(new Ficha(nombre, apellidos, edad));

            System.out.println("El nuevo paciente ha sido almacenado.");
            System.out.println("¿Registrar nueva ficha o "
                    + "finalizar? (r/F) ");

            switch(scan.nextLine().toLowerCase()) {
                case "r":
                    break;
                case "f":
                case "":
                    terminar = true;
                    break;
                default:
                    System.out.println("Opción invalida. Terminando...");
                    terminar = true;
            }
        } while(!terminar);

        return archivador;
    }

    private static void leerArchivador(Archivador archivador) {
        Scanner scan = new Scanner(System.in);

        try {
            archivador.listar();
        } catch (NullPointerException e) {
            System.out.println("El archivador no existe o está vacio.");
        } finally {
            System.out.println("Pulse ENTER para continuar...");
            scan.nextLine();
        }
    }

    private static Archivador eliminarFicha(Archivador archivador) {
        Scanner scan = new Scanner(System.in);
        int numeroFicha;
        Ficha ficha;

        System.out.print("Introduzca el número de ficha a eliminar: ");
        numeroFicha = scan.nextInt();
        scan.nextLine();

        try {
            ficha = archivador.getListaFichas().get(numeroFicha);

            archivador.eliminar(ficha);
            System.out.println("La ficha ha sido eliminada.");
            return archivador;
        } catch(IndexOutOfBoundsException e) {
            System.err.println("La ficha buscada no existe.");
            return archivador;
        } finally {
            System.out.println("Pulse ENTER para continuar...");
            scan.nextLine();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Archivador archivador = new Archivador();
        boolean salir = false;

        System.out.println("Bienvenido al Administrador Multimedia.");
        System.out.println();
        do {
            int opcion;

            System.out.println("Opciones a elegir: ");
            System.out.println("  1. Abrir archivo.");
            System.out.println("  2. Guardar arvhivo.");
            System.out.println("  3. Almacenar registros en archivador.");
            System.out.println("  4. Mostrar registros en el archivador.");
            System.out.println("  5. Eliminar registros en el archivador.");
            System.out.println("  0. Salir de la aplicación.");
            System.out.println();
            System.out.print("¿Que desea hacer? ");

            opcion = scan.nextInt();
            scan.nextLine();

            switch(opcion) {
                case 1:
                    archivador = abrirFichero();
                    break;
                case 2:
                    guardarFichero(archivador);
                    break;
                case 3:
                    archivador = guardarFicha(archivador);
                    break;
                case 4:
                    leerArchivador(archivador);
                    break;
                case 5:
                    archivador = eliminarFicha(archivador);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.err.println("Opción invalida.");
            }
        } while (!salir);
    }
}
