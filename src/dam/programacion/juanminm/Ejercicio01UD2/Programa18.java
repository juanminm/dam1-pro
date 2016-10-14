/*
 * Ejercicio 18.
 * 
 * Escribe un programa que solicite al usuario el tamaño del lado de un
 * triángulo equilátero y calcule su perímetro y su área. 
 */
package dam.programacion.juanminm.Ejercicio01UD2;

import java.lang.Math;
import java.util.Scanner;

public class Programa18 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	double lado, altura, perimetro, area;
    	
    	System.out.print("Introduzca la longitud de lado del triángulo"
    			+ "equilátero: ");
    	lado = scan.nextDouble();
    	altura = Math.sqrt(3) * lado / 2;
    	perimetro = 3 * lado;
    	area = lado * (Math.sqrt(3) * lado / 2) / 2;
    	
    	System.out.println("El perimetro del triangulo es: " + perimetro);
    	System.out.println("El área es: " + area);
    	scan.close();
    }
}
