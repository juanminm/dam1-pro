/*
 * Ejercicio 20
 * 
 * Escribe un programa que calcule cuánto te dará tu banco después de realizar
 * una imposición a plazo fijo. Para ello el programa debe pedir la cantidad 
 * que desea invertir en el banco, el tipo de interés anual que le paga el 
 * banco por el dinero y el plazo que se mantiene la inversión. El programa 
 * debe calcular el dinero que se obtiene después de dicho plazo. Recuerda que 
 * al pagarte los intereses el banco te retendrá el 18% para hacienda. Escribe 
 * los mensajes apropiados para que el usuario pueda seguir el proceso de 
 * cálculo realizado. 
 */
package dam.programacion.juanminm.ejercicioud201;

import java.util.Scanner;

public class Programa20 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	float cantidadInvertida;
    	float interesAnual;
    	float plazo;
    	float beneficio;
    	float devolucion;
    	float retencion;
    	
    	System.out.print("Cantidad invertida: ");
    	cantidadInvertida = scan.nextFloat();
    	System.out.print("Interes Anual: ");
    	interesAnual = scan.nextFloat();
    	System.out.print("Plazo en meses: ");
    	plazo = scan.nextFloat();
    	beneficio = cantidadInvertida * interesAnual/100 * plazo/12;
    	retencion = beneficio * 18/100;
    	devolucion = beneficio - retencion;
    			
    	System.out.println(devolucion);
    	System.out.println(cantidadInvertida + devolucion);
    	scan.close();
    }
}
