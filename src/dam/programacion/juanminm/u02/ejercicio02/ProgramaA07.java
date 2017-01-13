/*
 * 6. Escribe un programa que calcule la cuota que se debe abonar en el club de
 * golf. La cuota es de 500 €. Tendrán un 50% de descuento las personas mayores
 * de 65 años y un 25% los menores de 18 años si los padres no son socios y 35%
 * si los padres son socios.
 */
package dam.programacion.juanminm.u02.ejercicio02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
import java.util.Scanner;

public class ProgramaA07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad;
        double cuota = 500;
        String padresSocios;

        System.out.print("Introduzca su edad: ");
        edad = scan.nextInt();

        if (edad < 18) {
            System.out.print("Vemos que eres menor de edad. ¿Son tus padres socios? (Sí/No): ");
            padresSocios = scan.next();

            if (padresSocios.equalsIgnoreCase("Sí")) {
                cuota = cuota * 65/100;
            } else {
                cuota = cuota * 75/100;
            }
        } else if (edad >= 65) {
            cuota = cuota * 50/100;
        }

        System.out.println("La cuota a abonar al club es de: " + cuota + "€");
    }
}
