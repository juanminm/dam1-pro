/*
 * 5. Escribe un programa que permita introducir una calificación (entre cero y
 * diez) e imprima su equivalente alfabético, según la siguiente tabla.
 *
 *    De 3 ------------------------> M.D.
 *    Desde 3 y menor que 5 -------> INS.
 *    Desde 5 y menor que 6 -------> SUF.
 *    Desde 6 y menor que 7 -------> BIEN
 *    Desde 7 y menor que 9 -------> NOT.
 *    Desde 9 hasta 10 ------------> SOB.
 */
package dam.programacion.juanminm.ejercicioud02u02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
import java.util.Scanner;

public class ProgramaA05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        float nota;

        System.out.print("Introduzca la nota: ");
        nota = scan.nextFloat();
        if (nota < 4) {
            System.out.println("M.D.");
        } else if (nota < 5) {
            System.out.println("INS.");
        } else if (nota < 6) {
            System.out.println("SUF.");
        } else if (nota < 7) {
            System.out.println("BIEN");
        } else if (nota < 9) {
            System.out.println("NOT.");
        } else {
            System.out.println("SOB.");
        }
    }
}
