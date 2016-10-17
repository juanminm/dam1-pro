/*
 * 2. Escribe un programa que solicite la edad de una persona y muestre un
 * mensaje por pantalla que indique si es mayor o menor que 2
 */
package dam.programacion.juanminm.Ejercicio02UD2;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
import java.util.Scanner;

public class ProgramaA02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad;
        
        System.out.println("Introduzca su edad: ");
        edad = scan.nextInt();
        
        if (edad >= 25) {
            System.out.println("Eres mayor de 25 años.");
        } else {
            System.out.println("Eres menor de 25 años.");
        }
    }
}
