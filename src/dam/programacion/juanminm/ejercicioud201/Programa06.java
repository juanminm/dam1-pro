/*
 * Ejercicio 6.
 * 
 * Escribe un programa que visualice en pantalla cuánto le costará comprar 
 * unas deportivas cuyo precio de catálogo es de 85,00 €, si sabe que puede 
 * conseguir una rebaja del 15%.
 */
package dam.programacion.juanminm.ejercicioud201;

public class Programa06 {
  public static void main(String[] args) {
    System.out.println("El precio de las deportivas con el descuento es " +
        (85.0 * (100-15)/100) + "€");
  }
}
