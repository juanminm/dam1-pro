/*
 * 4.- Solicita al usuario un número entero inicial y un número entero final.
 *
 *   - Se creará un fichero llamado dni.txt en el que cada línea contendrá un
 *     número de DNI desde el valor inicial al final. El DNI será un string de 8
 *     dígitos para lo cual, añadiremos los ceros a la izquierda necesarios.
 *   - Se creará un fichero llamado nif.txt al que al string del DNI se le añade
 *     la letra NIF correspondiente. El algoritmo para la letra NIF:
 *     Dado el array
 *         String letras = "TRWAGMYFPDXBNJZSQVHLCKE"
 *
 *     La letra-nif para un determinado DNI es la que ocupa la posición
 *     correspondiente al resto de dividir el DNI por 23:
 *         Letra_nif = letras.charAt(numero_dni % 23)
 */
package dam.programacion.juanminm.u10.ej01.programa04;

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
    private static void crearArchivoDNI(String out, int inicio, int fin) {
        BufferedWriter bw = null;

        try {
            long tamaño;

            bw = new BufferedWriter(new FileWriter(out));

            for (int i = inicio; i <= fin; i++) {
                String cadenaDni = String.valueOf(i);

                while(cadenaDni.length() < 8) {
                    cadenaDni = "0" + cadenaDni;
                }

                bw.write(cadenaDni);
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static void crearArchivoNIF(String in, String out) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            String dni;

            br = new BufferedReader(new FileReader(in));
            bw = new BufferedWriter(new FileWriter(out));

            dni = br.readLine();

            while (dni != null) {
                String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
                char letraNIF = letras.charAt(Integer.valueOf(dni) % 23);
                String nif = dni + letraNIF;

                bw.write(nif);
                bw.newLine();
                dni = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int posInit;
        int posEnd;

        System.out.print("Posición inicial: ");
        posInit = scan.nextInt();
        System.out.print("Posición final: ");
        posEnd = scan.nextInt();
        scan.nextLine();

        crearArchivoDNI("dni.txt", posInit, posEnd);

        crearArchivoNIF("dni.txt", "nif.txt");
    }
}
