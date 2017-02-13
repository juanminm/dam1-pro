/*
 * 4. Escribe un programa que solicite  dos números reales y los escriba
 * ordenados de menor a mayor
 */
package dam.programacion.juanminm.u02.ej02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
import java.util.Scanner;

public class ProgramaA04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero1, numero2;

        System.out.print("Introduzca el primer numero: ");
        numero1 = scan.nextDouble();
        System.out.print("Introduzca el segundo numero: ");
        numero2 = scan.nextDouble();

        if (numero1 >= numero2) {
            System.out.println(numero1 + ", " + numero2);
        } else {
            System.out.println(numero2 + ", " + numero1);
        }
    }
}
