/*
 * 13. Escribe un programa que permita, partiendo de un Vector V de cincuenta
 * elementos, generar un vector P de cincuenta elementos de forma que:
 *
 *   P(1)=V(1),
 *   P(2)=V(1)+V(2),
 *   P(3)=V(1)+V(2)+V(3)
 *   ....
 *   P(50)= V(1)+V(2)+V(3)+...+V(50)
 */
package dam.programacion.juanminm.u06.ej02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] arrayV = new int[50];
        int[] arrayP = new int[50];

        for (int i = 0; i < arrayV.length; i++) {
//            System.out.printf("Introduzca el %dº número: ", i);
//            arrayV[i-1] = scan.nextInt();
            arrayV[i] = random.nextInt(50)+1;
        }
        System.out.println();

        for (int i = 0; i < arrayP.length; i++) {
            for (int j = 0; j <= i; j++) {
                arrayP[i] += arrayV[j];
            }
        }

        System.out.printf("Datos del vector V:%n");
        for (int i = 0; i < arrayV.length; i++) {
            System.out.printf("%4d ", arrayV[i]);

            if (i % 10 == 9) {
                System.out.printf("%n");
            }
        }

        System.out.printf("%n%nDatos del vector P:%n");
        for (int i = 0; i < arrayP.length; i++) {
            System.out.printf("%4d ", arrayP[i]);

            if (i % 10 == 9) {
                System.out.printf("%n");
            }
        }
        System.out.printf("%n");
    }
}
