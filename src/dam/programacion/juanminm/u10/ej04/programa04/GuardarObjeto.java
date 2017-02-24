/*
 * 2. - Crea un programa o método que permita al usuario introducir datos como
 * objetos de la clase y se guarden en el fichero de datos agendaObject.dat
 */
package dam.programacion.juanminm.u10.ej04.programa04;

import dam.programacion.juanminm.u10.ej04.programa01.Agenda;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class GuardarObjeto {

    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        ObjectOutputStreamNoHeader oosnh = null;

        try {
            Scanner scan = new Scanner(System.in);
            String seguir;
            File archivo = new File("agendaObject.dat");

            if (archivo.exists()) {
                oosnh = new ObjectOutputStreamNoHeader(new BufferedOutputStream(
                        new FileOutputStream(archivo, true)));
            } else {
                oos = new ObjectOutputStream(new BufferedOutputStream(
                        new FileOutputStream(archivo)));
            }

            do {
                String nombre;
                String direccion;
                ArrayList<String> listaTelefono = new ArrayList();
                String email;

                System.out.println("Registrar en la agenta");
                System.out.print("Nombre: ");
                nombre = scan.nextLine();
                System.out.print("Dirección: ");
                direccion = scan.nextLine();
                System.out.print("Email: ");
                email = scan.nextLine();

                do {
                    System.out.print("Teléfono: ");
                    listaTelefono.add(scan.nextLine());

                    System.out.print("¿Añadir otro telefono? (s/N): ");
                    seguir = scan.nextLine();
                } while(seguir.equalsIgnoreCase("s"));

                if (oos != null) {
                    oos.writeObject(new Agenda(nombre, direccion, listaTelefono,
                            email));
                } else if (oosnh != null) {
                    oosnh.writeObject(new Agenda(nombre, direccion,
                            listaTelefono, email));
                }

                System.out.print("¿Crear nuevo registro? (s/N): ");
                seguir = scan.nextLine();

            } while (seguir.equalsIgnoreCase("s"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }

                if (oosnh != null) {
                    oosnh.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
