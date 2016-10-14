/*
 * Ejercicio 7.
 * 
 * Escribe un programa que visualice en pantalla cuánto le dará su banco 
 * después de seis meses si pone 2000€ en una cuenta a plazo fijo al 2,75%
 * anual. Recuerda que al pagarte los intereses el banco le retendrá el 18% 
 * para hacienda.
 */


public class EjercicioU2_07 {
  public static void main(String[] args) {
    System.out.println(2000.0 + (2000.0 * 2.75/100 * 6.0/12) * (100.0-18.0)/100);
    System.out.println((2000.0 + (2000.0 * 2.75/100 * 6.0/12)) * (100.0-18.0)/100);
  }
  
}
