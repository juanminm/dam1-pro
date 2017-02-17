/*
 * 2.- Crea una clase que escriba una secuencia de números primos en un fichero
 * y crea otra clase que lea la mitad superior de los números escritos.
 */
package dam.programacion.juanminm.u10.ej02.programa02;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fichero = null;
        PrimeWriter pw;
        PrimeReader pr;

        System.out.print("Introduzca el nombre del fichero: ");
        fichero = scan.next();

        pw = new PrimeWriter(fichero);
        pw.crearFichero();

        pr = new PrimeReader(fichero);
        pr.leerArchivo();
    }
}
