/*
 * 11. Escribe un programa que juegue con el usuario a adivinar un número. El
 * ordenador debe generar un número entre 1 y 100 y el usuario tiene que
 * intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor,
 * el ordenador debe decirle al usuario si el número que tiene que adivinar es
 * mayor o menor que el que ha introducido. Cuando consiga adivinarlo debe
 * indicárselo y visualizar el número de veces que el usuario ha intentado
 * adivinar el número. Si el usuario introduce algo que no es un número debe
 * indicarlo de esta forma en pantalla.
 */
package dam.programacion.juanminm.u02.ej02;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB11 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        String userInput;
        boolean esNumero;
        int i, intentos = 0;
        int numero = random.nextInt(100) + 1;

        System.out.println("He generado un número entre el 1 y el 100. Intenta "
                + "adivinarlo.");

        do {
            System.out.print("Introduce el número: ");
            userInput = scan.next();

            try {
                i = Integer.parseInt(userInput);
                esNumero = true;
            } catch (NumberFormatException nfe) {
                System.out.println("No has introducido ningun número.");
                i = 0;
                esNumero = false;
            }

            if (esNumero) {
                if (i < numero) {
                    System.out.println("El número introducido es pequeño.");
                    intentos++;
                } else if (i > numero) {
                    System.out.println("El número introducido es mayor.");
                    intentos++;
                } else if (i == numero) {
                    System.out.println("¡Acertaste! El número era " + numero + ". "
                            + "Has neceitados " + intentos + " intentos.");
                }
            }
        } while (numero != i);
    }
}
