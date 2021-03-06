package dam.programacion.juanminm.u11.collectionsycomparators;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {

    private static final ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

    private static void pasarALista() {
        File archivoAlumnos = new File("alumnos.dat");

        if (!archivoAlumnos.exists()) {
            System.out.printf("El archivo %s no existe. Creando un nuevo "
                    + "archivo.%n", archivoAlumnos.getName());

            try {
                archivoAlumnos.createNewFile();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        } else {
            ObjectInputStream ois = null;

            try {
                ois = new ObjectInputStream(new BufferedInputStream(
                        new FileInputStream(archivoAlumnos)));

                System.out.println("Cargando archivo...");
                while (true) {
                    Alumno alumno = (Alumno) ois.readObject();
                    listaAlumnos.add(alumno);
                }
            } catch (EOFException ex) {
                System.out.println("¡Archivo cargado!");
            } catch (ClassNotFoundException | IOException ex) {
                System.err.println(ex.getMessage());
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }

    private static void ponerDatos() {
        int carnet = 0;
        String nombre;
        String apellidos;
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        boolean valido = false;
        String opcion;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Carnet del estudiante: ");

            if (scan.hasNextInt()) {
                carnet = scan.nextInt();
                scan.nextLine();
                valido = true;
            } else {
                System.err.println("Valor invalido.");
            }
        } while (!valido);

        System.out.print("Nombre del estudiante: ");
        nombre = scan.nextLine();

        System.out.print("Apellidos del estudiante: ");
        apellidos = scan.nextLine();

        valido = false;
        do {
            System.out.print("Nota primera del estudiante: ");

            if (scan.hasNextFloat()) {
                nota1 = scan.nextFloat();
                valido = true;
            } else {
                System.err.println("Valor invalido.");
            }
            scan.nextLine();
        } while (!valido);

        valido = false;
        do {
            System.out.print("Nota segunda del estudiante: ");

            if (scan.hasNextFloat()) {
                nota2 = scan.nextFloat();
                valido = true;
            } else {
                System.err.println("Valor invalido.");
            }
            scan.nextLine();
        } while (!valido);

        valido = false;
        do {
            System.out.print("Nota tercera del estudiante: ");

            if (scan.hasNextFloat()) {
                nota3 = scan.nextFloat();
                valido = true;
            } else {
                System.err.println("Valor invalido.");
            }
            scan.nextLine();
        } while (!valido);

        valido = false;
        do {
            System.out.println("Confirma que los datos son correctos:%n");
            System.out.printf("  Carnet: %d%n", carnet);
            System.out.printf("  Nombre: %s%n", nombre);
            System.out.printf("  Apellidos: %s%n", apellidos);
            System.out.printf("  Notas: %f, %f, %f%n", nota1, nota2, nota3);

            System.out.print("¿Cambiar numero de (C)arnet, (N)ombre, "
                    + "(A)pellidos, primera (1), segunda (2), tercera (3) "
                    + "nota o (V)ale/(S)alir.");
            opcion = scan.nextLine();

            switch (opcion.toLowerCase()) {
                case "c":
                    System.out.print("Carnet del estudiante: ");

                    if (scan.hasNextInt()) {
                        carnet = scan.nextInt();
                        scan.nextLine();
                    } else {
                        System.err.println("Valor invalido.");
                    }
                    break;
                case "n":
                    System.out.print("Nombre del estudiante: ");
                    nombre = scan.nextLine();
                    break;
                case "a":
                    System.out.print("Apellidos del estudiante: ");
                    apellidos = scan.nextLine();
                    break;
                case "1":
                    System.out.print("Nota primera del estudiante: ");

                    if (scan.hasNextFloat()) {
                        nota1 = scan.nextFloat();
                        scan.nextLine();
                        valido = true;
                    } else {
                        System.err.println("Valor invalido.");
                    }

                    break;
                case "2":
                    System.out.print("Nota segunda del estudiante: ");

                    if (scan.hasNextFloat()) {
                        nota2 = scan.nextFloat();
                        scan.nextLine();
                        valido = true;
                    } else {
                        System.err.println("Valor invalido.");
                    }

                    break;
                case "3":
                    System.out.print("Nota tercera del estudiante: ");

                    if (scan.hasNextFloat()) {
                        nota3 = scan.nextFloat();
                        scan.nextLine();
                        valido = true;
                    } else {
                        System.err.println("Valor invalido.");
                    }

                    break;
                case "v":
                    listaAlumnos.add(new Alumno(carnet, nombre, apellidos,
                            nota1, nota2, nota3));
                    System.out.println("Ha sido almacenado.");
                    valido = true;
                    break;
                case "s":
                    System.out.println("Operacion cancelada.");
                    valido = true;
                    break;
                default:
                    System.err.println("Opción invalida.");
                    break;
            }
        } while (!valido);
        System.out.println("Pulse ENTER para continuar");
        scan.nextLine();
    }

    private static void buscar() {
        Scanner scan = new Scanner(System.in);
        String nombre;

        System.out.print("Nombre a buscar: ");
        nombre = scan.nextLine();

        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().equals(nombre)) {
                Alumno alumno = listaAlumnos.get(i);

                System.out.printf("Carnet: %d%n", alumno.getCarnet());
                System.out.printf("Apellidos, Nombre: %s, %s%n",
                        alumno.getApellidos(), alumno.getNombre());
                System.out.printf("Notas: %f, %f, %f%n%n", alumno.getNota1(),
                        alumno.getNota2(), alumno.getNota3());
            }
        }

        System.out.println("Pulse ENTER para continuar");
        scan.nextLine();
    }

    private static void modificar() {
        Scanner scan = new Scanner(System.in);
        int carnet;
        int i;
        Alumno alumno = null;

        System.out.print("Introduzca el número de carnet: ");
        carnet = scan.nextInt();

        i = 0;
        do {
            if (listaAlumnos.get(i).getCarnet() == carnet) {
                alumno = listaAlumnos.get(i);
            }

            i++;
        } while (alumno == null && i < listaAlumnos.size());

        if (alumno == null) {
            System.out.println("Alumno no existente.");
        } else {
            String opcion;
            boolean valido;
            boolean cambios = false;
            boolean continuar = false;
            String nombre = alumno.getNombre();
            String apellidos = alumno.getApellidos();
            float nota1 = alumno.getNota1();
            float nota2 = alumno.getNota2();
            float nota3 = alumno.getNota3();

            do {

                System.out.print("¿Cambiar (N)ombre, "
                        + "(A)pellidos, (P)rimera, (S)egunda, (T)ercera "
                        + "nota o (C)ontinuar? ");
                opcion = scan.nextLine();

                switch (opcion.toLowerCase()) {
                    case "n":
                        System.out.print("Nombre del estudiante: ");
                        nombre = scan.nextLine();
                        break;
                    case "a":
                        System.out.print("Apellidos del estudiante: ");
                        apellidos = scan.nextLine();
                        break;
                    case "p":
                        valido = false;
                        do {
                            System.out.print("Nota primera del estudiante: ");

                            if (scan.hasNextFloat()) {
                                nota1 = scan.nextFloat();
                                valido = true;
                            } else {
                                System.err.println("Valor invalido.");
                            }
                            scan.nextLine();
                        } while (!valido);
                        break;
                    case "s":
                        valido = false;
                        do {
                            System.out.print("Nota segunda del estudiante: ");

                            if (scan.hasNextFloat()) {
                                nota2 = scan.nextFloat();
                                valido = true;
                            } else {
                                System.err.println("Valor invalido.");
                            }
                            scan.nextLine();
                        } while (!valido);

                        break;
                    case "t":
                        valido = false;
                        do {
                            System.out.print("Nota tercera del estudiante: ");

                            if (scan.hasNextFloat()) {
                                nota3 = scan.nextFloat();
                                valido = true;
                            } else {
                                System.err.println("Valor invalido.");
                            }
                            scan.nextLine();
                        } while (!valido);
                        break;
                    case "c":
                    case "":
                        continuar = true;
                        break;
                    default:
                        System.err.println("Opción invalida.");
                        break;
                }
            } while (!continuar);

            if (cambios) {
                System.out.println("Los nuevos datos son:%n");
                System.out.printf("  Carnet: %d%n", carnet);
                System.out.printf("  Nombre: %s%n", nombre);
                System.out.printf("  Apellidos: %s%n", apellidos);
                System.out.printf("  Notas: %f, %f, %f%n", nota1, nota2, nota3);

                valido = false;
                do {
                    System.out.print("¿Confirmar cambios? (s/N) ");
                    opcion = scan.nextLine();

                    switch (opcion.toLowerCase()) {
                        case "s":
                            alumno.setNombre(nombre);
                            alumno.setApellidos(apellidos);
                            alumno.setNota1(nota1);
                            alumno.setNota2(nota2);
                            alumno.setNota3(nota3);
                            valido = true;
                            break;
                        case "n":
                        case "":
                            valido = true;
                            break;
                        default:
                            System.err.println("Opción invalida");
                            break;
                    }
                } while (!valido);
            } else {
                System.out.println("No han habido cambios.");
            }
            System.out.println("Pulse ENTER para continuar");
            scan.nextLine();
        }
    }

    private static void borrar() {
        Scanner scan = new Scanner(System.in);
        int carnet;
        int i;
        Alumno alumno = null;
        String opcion;
        boolean valido = false;

        System.out.print("Carnet a buscar: ");
        carnet = scan.nextInt();
        scan.nextLine();

        i = 0;
        do {
            if (listaAlumnos.get(i).getCarnet() == carnet) {
                alumno = listaAlumnos.get(i);
            }
            i++;
        } while (alumno == null && i < listaAlumnos.size());

        if (alumno != null) {
            System.out.println("Alumno encontrado:");
            System.out.println();
            System.out.printf("Carnet: %d%n", alumno.getCarnet());
            System.out.printf("Apellidos, Nombre: %s, %s%n",
                    alumno.getApellidos(), alumno.getNombre());
            System.out.printf("Notas: %f, %f, %f%n%n", alumno.getNota1(),
                    alumno.getNota2(), alumno.getNota3());

            do {
                System.out.println("¿De verdad desea eliminarlo? (s/N)");
                opcion = scan.nextLine();

                switch (opcion.toLowerCase()) {
                    case "s":
                        listaAlumnos.remove(alumno);
                        System.out.println("Alumno borrado.");
                        valido = true;
                        break;
                    case "n":
                    case "":
                        System.out.println("Operación cancelada.");
                        valido = true;
                        break;
                    default:
                        System.err.println("Opción invalida.");
                }
            } while (!valido);
        } else {
            System.out.println("Alumno no encontrado.");
        }

        System.out.println("Pulse ENTER para continuar");
        scan.nextLine();
    }

    private static void llenarArchivo() {
        Scanner scan = new Scanner(System.in);
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream("alumnos.dat")));

            for (int i = 0; i < listaAlumnos.size(); i++) {
                oos.writeObject(listaAlumnos.get(i));
            }
            System.out.println("El archivo ha sido guardado. Pulse ENTER para "
                    + "continuar...");
            scan.nextLine();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
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

    private static void pasarFichero5() {
        Scanner scan = new Scanner(System.in);
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream("alumnos5.dat")));

            for (int i = 0; i < listaAlumnos.size(); i++) {
                Alumno alumno = listaAlumnos.get(i);

                if ((alumno.getNota1() + alumno.getNota2()
                        + alumno.getNota3()) / 3 >= 5) {
                    oos.writeObject(alumno);
                }
            }
            System.out.println("El archivo ha sido guardado. Pulse ENTER para "
                    + "continuar...");
            scan.nextLine();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
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

    private static void visualizarFichero5() {
        Scanner scan = new Scanner(System.in);
        File archivoAlumnos = new File("alumnos5.dat");

        if (!archivoAlumnos.exists()) {
            System.out.printf("El archivo %s no existe.", archivoAlumnos.getName());
        } else {
            ObjectInputStream ois = null;
            int count = 0;

            try {
                ois = new ObjectInputStream(new BufferedInputStream(
                        new FileInputStream(archivoAlumnos)));

                System.out.println("Archivo cargado.");

                while (true) {
                    Alumno alumno = (Alumno) ois.readObject();

                    System.out.printf("Carnet: %d%n", alumno.getCarnet());
                    System.out.printf("Apellidos, Nombre: %s, %s%n",
                            alumno.getApellidos(), alumno.getNombre());
                    System.out.printf("Notas: %f, %f, %f%n%n", alumno.getNota1(),
                            alumno.getNota2(), alumno.getNota3());

                    count++;
                }
            } catch (EOFException ex) {
            } catch (ClassNotFoundException | IOException ex) {
                System.err.println(ex.getMessage());
            } finally {
                if (count == 0) {
                    System.out.println("El archivo está vacio.");
                }

                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }

                System.out.println("Pulse ENTER para "
                        + "continuar...");
                scan.nextLine();
            }
        }
    }

    private static void ordenarPorApellidos() {
        Collections.sort(listaAlumnos, new ApellidosComparator());
    }

    private static void ordenarPorNotaMediaMayor() {
        Collections.sort(listaAlumnos, new NotaMediaMayorComparator());
    }

    private static void ordenarPorNotaMediaMenor() {
        Collections.sort(listaAlumnos, new NotaMediaMenorComparator());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Comprobando que existe el archivo de datos...");
        pasarALista();

        System.out.println("Bienvenido al Administrador Multimedia.");
        System.out.println();
        do {
            int opcion;

            System.out.println("Opciones a elegir: ");
            System.out.println("1.- Introducir datos.");
            System.out.println("2.- Buscar");
            System.out.println("3.- Modificar.");
            System.out.println("4.- Borrar.");
            System.out.println("5.- Guardar aprobados.");
            System.out.println("6.- Visualizar aprobrados.");
            System.out.println("7.- Ordenar por apellidos.");
            System.out.println("8.- Ordenar por nota alta.");
            System.out.println("9.- Ordenar por nota bajar.");
            System.out.println("10.- Guardar.");
            System.out.println("11.- Salir.");
            System.out.println();
            System.out.print("¿Que desea hacer? ");

            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    ponerDatos();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    modificar();
                    break;
                case 4:
                    borrar();
                    break;
                case 5:
                    pasarFichero5();
                    break;
                case 6:
                    visualizarFichero5();
                    break;
                case 7:
                    ordenarPorApellidos();
                    break;
                case 8:
                    ordenarPorNotaMediaMayor();
                    break;
                case 9:
                    ordenarPorNotaMediaMenor();
                    break;
                case 10:
                    llenarArchivo();
                    break;
                case 11:
                    salir = true;
                    break;
                default:
                    System.err.println("Opción invalida.");
            }
        } while (!salir);
    }
}
