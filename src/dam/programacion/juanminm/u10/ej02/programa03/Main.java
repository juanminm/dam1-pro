/*
 * 3.- Crea un programa o método que escriba registros de una agenda en el
 * fichero de datos agenda.dat
 *
 * Los datos de la agenda son:
 *
 *   String nombre
 *   String direccion
 *   long telefono
 *   String email
 */
package dam.programacion.juanminm.u10.ej02.programa03;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {

    public static void main(String[] args) {
        ObjectOutputStream oos = null;

        try {
            Scanner scan = new Scanner(System.in);
            String seguir;
            oos = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream("agenda.dat")));

            do {
                String nombre;
                String direccion;
                long telefono;
                String email;

                System.out.println("Registrar en la agenta");
                System.out.print("Nombre: ");
                nombre = scan.nextLine();
                System.out.print("Dirección: ");
                direccion = scan.nextLine();
                System.out.print("Telefono: ");
                telefono = scan.nextLong();
                scan.nextLine();
                System.out.print("Email: ");
                email = scan.nextLine();

                oos.writeObject(new Agenda(nombre, direccion, telefono, email));

                System.out.print("¿Crear nuevo registro? (Sí/No): ");
                seguir = scan.nextLine();

            } while (seguir.equalsIgnoreCase("si")
                    || seguir.equalsIgnoreCase("sí"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
