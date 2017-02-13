/*
 * 2.- A partir de dos ficheros de texto se creará un tercer fichero cuyo
 * contenido se obtendrá uniendo la información de estos ficheros. Las líneas
 * del fichero creado contendrán todas las combinaciones de líneas del primer
 * fichero con las líneas del segundo. Se solicitará al usuario el nombre de los
 * ficheros y la tira de separación entre ambas líneas.
 */
package dam.programacion.juanminm.u10.ej01.programa02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        BufferedWriter bw = null;

        try {
            Scanner scan = new Scanner(System.in);
            String fichero2;
            String texto1;

            System.out.print("Introduzca la ubicación del primer fichero: ");
            br1 = new BufferedReader(new FileReader(scan.nextLine()));
            System.out.print("Introduzca la ubicación del segundo fichero: ");
            fichero2 = scan.nextLine();
            System.out.print("Introduzca la ubicación del fichero a guardar: ");
            bw = new BufferedWriter(new FileWriter(scan.nextLine()));

            texto1 = br1.readLine();

            while (texto1 != null) {
                String texto2;

                br2 = new BufferedReader(new FileReader(fichero2));
                texto2 = br2.readLine();

                while (texto2 != null) {
                    String separador = " * ";
                    String texto3 = texto1 + separador + texto2;

                    bw.write(texto3);
                    bw.newLine();

                    texto2 = br2.readLine();
                }

                texto1 = br1.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (br1 != null) {
                    br1.close();
                }

                if (br2 != null) {
                    br2.close();
                }

                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
