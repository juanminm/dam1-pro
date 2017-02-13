/* 8. Escribe una método que acepte dos argumentos: el carácter que se desea 
 * imprimir y el número de líneas que se imprimen en forma triangular
 *                                      a 
 *                                     aaa 
 *                                    aaaaa 
 *                                   aaaaaaa 
 */
package dam.programacion.juanminm.u04.ej01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa08 {
    static void crearPiramide(char caracter, int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 1; j <= altura*2-1; j++) {
                if (altura - i <= j && j <= altura + i) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char caracter;
        int altura;

        System.out.print("Introduzca el caracter a repetir: ");
        caracter = scan.nextLine().charAt(0);
        System.out.print("Introduzca las veces a repetir: ");
        altura = scan.nextInt();

        crearPiramide(caracter, altura);
    }
}
