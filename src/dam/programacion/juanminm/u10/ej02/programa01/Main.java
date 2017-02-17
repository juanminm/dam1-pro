/*
 * 1.- Escribe un programa que acceda aleatoriamente a un fichero de texto.
 * El programa debe preguntar al usuario posiciones del fichero y convertir a
 * mayúsculas el carácter leído en esa posición.
 * El programa acabará cuando la posición solicitada sea -1
 */
package dam.programacion.juanminm.u10.ej02.programa01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        String fichero = "texto.txt";
        RandomAccessFile fa = null;

        try {
            fa = new RandomAccessFile(fichero, "rw");
            int pos;

            do {
                Scanner scan = new Scanner(System.in);

                System.out.printf("Introduzca la posición en el fichero "
                        + "(-1 = Salir): ");
                pos = scan.nextInt();
                fa.seek(pos);

                if (pos != -1 || fa.getFilePointer() < fa.length()) {
                    int caracter = fa.read();

                    fa.seek(fa.getFilePointer() - 1);
                    fa.write(Character.toUpperCase(caracter));
                }
            } while(pos != -1);


        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (fa != null) {
                    fa.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
