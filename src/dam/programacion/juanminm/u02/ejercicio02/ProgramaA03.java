/*
 * 3. Escriba un programa en el que se solicite un número entero al usuario y
 * el programa escribirá un mensaje por pantalla que indique si se trata de un
 * número par o de un número impar
 */
package dam.programacion.juanminm.u02.ejercicio02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
import java.util.Scanner;

public class ProgramaA03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un número: ");
        numero = scan.nextInt();

        if ( numero % 2 == 0) {
            System.out.printf("El número %d es par.\n", numero);
        } else {
            System.out.printf("El número %d es impar.\n", numero);
        }
    }
}
