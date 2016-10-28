/*
 * 9. Se llama media armónica de dos números el resultado obtenido al calcular
 * los inversos de los números, calcular la media y calcular el inverso del 
 * resultado. Escribe un método que acepte dos argumentos double y devuelva la
 * media armónica de los números. 
 */
package dam.programacion.juanminm.ejercicioud04e01;

import java.util.Scanner;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Programa09 {
    static double mediaArmonica(double x, double y) {
        return 2/(1/x + 1/y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y;
        
        System.out.print(
                "== alculo de media armonica entre dos numeros ==\n" +
                "Introduzca el primer número: "
        );
        x = scan.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        y = scan.nextDouble();
        
        System.out.println("La media armonica de " + x + " y " + y + " es " 
                + mediaArmonica(x, y));
    }
}
