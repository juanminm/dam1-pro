/*
 * 6. Escribe un programa que solicite un valor real que indica una cantidad de
 * dinero en euros. El programa debe mostrar por pantalla la mínima cantidad de
 * monedas de cada tipo en que se debe devolver la cantidad de dinero indicada.
 */
package dam.programacion.juanminm.ejercicioud02u02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
import java.util.Scanner;

public class ProgramaA06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int centimos;
        int monedas2Euro = 0, monedas1Euro = 0, monedas50Cent = 0,
                monedas20Cent = 0, monedas10Cent = 0, monedas5Cent = 0,
                monedas2Cent = 0, monedas1Cent = 0;

        System.out.print("Introduzca una cantidad en euros: ");
        centimos = (int)(scan.nextDouble()*100);

        do {
            if (centimos >= 200) {
                monedas2Euro = centimos / 200;
                centimos = centimos % 200;
            } else if (centimos >= 100) {
                monedas1Euro = centimos / 100;
                centimos = centimos % 100;
            } else if (centimos >= 50) {
                monedas50Cent = centimos / 50;
                centimos = centimos % 50;
            } else if (centimos >= 20) {
                monedas20Cent = centimos / 20;
                centimos = centimos % 20;
            } else if (centimos >= 10) {
                monedas10Cent = centimos / 10;
                centimos = centimos % 10;
            } else if (centimos >= 5) {
                monedas5Cent = centimos / 5;
                centimos = centimos % 5;
            } else if (centimos >= 2) {
                monedas2Cent = centimos / 2;
                centimos = centimos % 2;
            } else {
                monedas1Cent = 1;
                centimos = 0;
            }
        } while (centimos != 0);

        System.out.println("Monedas de 2€:      " + monedas2Euro);
        System.out.println("Monedas de 1€:      " + monedas1Euro);
        System.out.println("Monedas de 50 cent: " + monedas50Cent);
        System.out.println("Monedas de 20 cent: " + monedas20Cent);
        System.out.println("Monedas de 10 cent: " + monedas10Cent);
        System.out.println("Monedas de 5 cent:  " + monedas5Cent);
        System.out.println("Monedas de 2 cent:  " + monedas2Cent);
        System.out.println("Monedas de 1 cent:  " + monedas1Cent);
    }
}
