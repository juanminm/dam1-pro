/*
 * Ejercicio 15.
 *
 * Escribe un programa que defina un enumerado para los días de la semana. En
 * el programa define una variable del enumerado y asígnale el valor del día
 * que corresponda al martes. A continuación, escribe por pantalla dicha
 * variable y escribe el valor del enumerado correspondiente al domingo.
 */
package dam.programacion.juanminm.u02.ej01;

public class Programa15 {
    public enum DiaSemana { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO }
    public static void main(String[] args) {
        DiaSemana martes = DiaSemana.MARTES;

        System.out.println(martes);
        System.out.println(DiaSemana.DOMINGO);
    }

}
