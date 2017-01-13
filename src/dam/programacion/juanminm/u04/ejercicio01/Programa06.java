/*
 * 6. Escribe un método que acepte dos argumentos: el carácter que se desea
 * imprimir y el número de veces que se imprime
 */
package dam.programacion.juanminm.u04.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa06 {
    static void repetirCaracter(char caracter, int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.print(caracter);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int veces;
        char caracter;

        System.out.print("Introduzca el caracter a repetir: ");
        caracter = scan.nextLine().charAt(0);
        System.out.print("Introduzca las veces a repetir: ");
        veces = scan.nextInt();

        repetirCaracter(caracter, veces);
    }
}
