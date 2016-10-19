/*
 * 8. Escribe un programa que solicite un número entero e indique si se trata 
 * de un número primo o no.
 */
package dam.programacion.juanminm.ejercicioud202;

import java.util.Scanner;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB08 {
    public static void main(String[] args) {
        int num;
        boolean esPrimo = true;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduzca un número para comprobar si es primo: ");
        num = s.nextInt();
        
        if (num != 2 && num % 2 != 0) {
            for (int i = 3; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                }
            }
        } else {
            esPrimo = false;
        }
        
        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
    }
}
