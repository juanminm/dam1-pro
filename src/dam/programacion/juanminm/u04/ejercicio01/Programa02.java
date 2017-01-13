/*
 * 2. Escribe un programa que calcule el área y la longitud de una
 * circunferencia en función del radio (leído desde teclado). Se ha de escribir
 * un método para calcular el área y otro para la longitud. Las fórmulas del
 * área y la longitud de una circunferencia: A=π*r^2 y L=2*π * r
 */
package dam.programacion.juanminm.u04.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa02 {

    static double calcularArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    static double calcularCircunferencia(double r) {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r;

        System.out.print("Introduzca el radio del circulo: ");
        r = scan.nextDouble();

        System.out.println("El area del circulo es: " + calcularArea(r));
        System.out.println("La longitud de la circunferencia del circulo es: "
                + calcularCircunferencia(r));
    }
}
