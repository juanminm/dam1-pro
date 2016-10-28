/*
 * Ejercicio 8.
 *
 * Escribe un programa que visualice en pantalla cuánto le dará su banco
 * después de seis meses si pone 2000€ en una cuenta a plazo fijo al 2,75%
 * anual. Recuerda que al pagarte los intereses el banco le retendrá el 18%
 * para hacienda. Escribe los mensajes apropiados para entender todos los
 * cálculos.
 */
package dam.programacion.juanminm.ejercicioud02u01;

public class Programa08 {
  public static void main(String[] args) {
    System.out.println("Cantidad depositada: " + 2000f);
    System.out.println("Interes anual: 2.75%");
    System.out.println("Intereses en 6 meses: " + (2000 * 2.75f/100 *
        6/12));
    System.out.println("Retención de hacienda: " + (2000 * 2.75f/100 *
        6/12 * 18/100));
    System.out.println("Devolucion: " + (2000 * 2.75f/100 *
        6/12 - 2000 * 2.75f/100 * 6/12 * 18/100));
    System.out.println("Total final: " + (2000f + 2000 * 2.75f/100 *
        6/12 - 2000 * 2.75f/100 * 6/12 * 18/100));
  }
}
