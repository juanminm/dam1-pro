/*
 * 1.- A partir de dos ficheros de texto se creará un tercer fichero cuyo
 * contenido se obtendrá uniendo la información de estos ficheros. Cada línea
 * del fichero creado estará formado por la unión de la misma línea de los dos
 * ficheros leídos.
 * Se solicitará al usuario el nombre de los ficheros y la tira de separación
 * entre ambas líneas.
 */
package dam.programacion.juanminm.u10.ej01.programa01;

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
        Scanner scan = new Scanner(System.in);
        String fichero1;
        String fichero2;
        String fichero3;
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        BufferedWriter bw = null;


        try {
            String texto1;
            String texto2;

            System.out.print("Introduzca la ubicación del primer fichero: ");
            br1 = new BufferedReader(new FileReader(scan.nextLine()));
            System.out.print("Introduzca la ubicación del segundo fichero: ");
            br2 = new BufferedReader(new FileReader(scan.nextLine()));
            System.out.print("Introduzca la ubicación del fichero a guardar: ");
            bw = new BufferedWriter(new FileWriter(scan.nextLine()));

            texto1 = br1.readLine();
            texto2 = br2.readLine();

            while (texto1 != null || texto2 != null) {
                String separador = " * ";
                String texto3;

                if (texto1 == null) {
                    texto1 = "";
                }

                if (texto2 == null) {
                    texto2 = "";
                }

                texto3 = texto1 + separador + texto2;
                bw.write(texto3);
                bw.newLine();

                texto1 = br1.readLine();
                texto2 = br2.readLine();
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
