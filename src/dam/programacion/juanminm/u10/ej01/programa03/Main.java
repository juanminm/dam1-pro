/*
 * 3.- A partir de un fichero de texto se creará un fichero cuyo contenido se
 * obtendrá a partir del primero. El fichero creado contendrá solo las líneas
 * del primer fichero que superen o igualen un determinado número de caracteres.
 * Se solicitará al usuario el nombre de los ficheros y el tamaño mínimo que
 * debe tener la línea.
 */
package dam.programacion.juanminm.u10.ej01.programa03;

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
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            Scanner scan = new Scanner(System.in);
            int tamañoLinea;
            String texto;

            System.out.print("Introduzca la ubicación del fichero a leer: ");
            br = new BufferedReader(new FileReader(scan.nextLine()));
            System.out.print("Introduzca el tamaño de linea minimo: ");
            tamañoLinea = scan.nextInt();
            scan.nextLine();
            System.out.print("Introduzca la ubicación del fichero a guardar: ");
            bw = new BufferedWriter(new FileWriter(scan.nextLine()));

            texto = br.readLine();

            while (texto != null) {
                if (texto.length() >= tamañoLinea) {
                    bw.write(texto);
                    bw.newLine();
                }

                texto = br.readLine();
            }
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
