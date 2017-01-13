/*
 * Ejercicio 17.
 *
 * Escribe un programa que solicite al usuario una cantidad en segundos y la
 * convierta a días, horas, minutos y segundos.
 */
package dam.programacion.juanminm.u02.ejercicio01;

import java.util.Scanner;

public class Programa17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tiempo;
        int segundos;
        int minutos;
        int horas;
        int dias;

        System.out.print("Introduzca una cantidad de tiempo en segundos: ");
        tiempo = scan.nextInt();

        segundos = tiempo % 60;
        minutos = tiempo/60 % 60;
        horas = tiempo/(60*60) % 24;
        dias = tiempo/(60*60*24);

        System.out.println(dias + "d " + horas + "h " + minutos + "min " +
        		segundos + "s");

        scan.close();
    }
}
