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
package dam.programacion.juanminm.u10.ej02.programa04;

import dam.programacion.juanminm.u10.ej02.programa03.Agenda;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {

    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new BufferedInputStream(
                    new FileInputStream("agenda.dat")));
            Agenda agenda;
            boolean fin = false;

            while(true) {
                agenda = (Agenda) ois.readObject();

                System.out.println("\nRegistro");
                System.out.println("Nombre:" + agenda.getNombre());
                System.out.println("Dirección: " + agenda.getDireccion());
                System.out.println("Telefono: " + agenda.getTelefono());
                System.out.println("Email: " + agenda.getEmail());
            }
        } catch (EOFException e) {
        } catch (ClassNotFoundException | IOException e) {
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
}
