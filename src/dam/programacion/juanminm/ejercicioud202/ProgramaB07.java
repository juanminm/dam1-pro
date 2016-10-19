/*
 * 7. Escribe un programa que calcule la potencia de un número real (a) elevado
 * a un número entero (b). Tenga en cuenta que tanto a como b pueden valer 0 o
 * pueden ser números negativos.
 */
package dam.programacion.juanminm.ejercicioud202;

import java.util.Scanner;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        double resultado = 1;

        System.out.print("Introduzca el número base: ");
        a = s.nextInt();
        System.out.print("Introduzca la potencia: ");
        b = s.nextInt();

        if (a == 0 && b <= 0) {
            System.out.println("ERR: Indefinido.");
        } else {
            if (b < 0) {
                for (int i = -b; i > 0; i--) {
                    resultado *= (float) 1/a;
                }
            } else if (b == 0) {
                resultado = 1;
            } else {
                for (int i = -b; i > 0; i--) {
                    resultado *= (double) a;
                }
            }

            System.out.println("Resultado es " + resultado);
        }
    }
}
