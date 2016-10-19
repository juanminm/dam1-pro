/*
 * Escribe un método que acepte tres argumentos: un carácter y dos enteros. El
 * carácter se debe imprimir. El primer entero indica el número de veces que se
 * imprimirá el carácter en la línea y el segundo entero indica el número de
 * líneas que deben imprimir-se.
 */
package dam.programacion.juanminm.ejercicioud401;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa07 {
    static void repetirCaracterLineas(char caracter, int veces, int lineas) {
        for (int i = 1; i <= lineas; i++) {
            for (int j = 1; j <= veces; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char caracter;
        int veces;
        int lineas;

        System.out.print("Introduzca el caracter a repetir: ");
        caracter = scan.nextLine().charAt(0);
        System.out.print("Introduzca las veces a repetir: ");
        veces = scan.nextInt();
        System.out.print("Introduzca el número de lineas a repetir: ");
        lineas = scan.nextInt();

        repetirCaracterLineas(caracter, veces, lineas);
    }
}
