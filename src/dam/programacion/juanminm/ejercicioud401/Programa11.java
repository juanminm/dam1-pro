/*
 * 11. Escríbase un método que dados 4 números enteros pasados como parámetros,
 * compruebe si dicha secuencia de números es capicúa
 */
package dam.programacion.juanminm.ejercicioud401;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa11 {
    static boolean esCapicua(int a, int b, int c, int d) {
        String cadenaNumero;
        int longitudCadena;
        boolean capicua = true;
        char caracter, caracterReflejado;

        cadenaNumero = a + "" + b + "" + c + "" + d;
        longitudCadena = cadenaNumero.length();

        for(int i = 0; i < longitudCadena/2; i++) {
            caracter = cadenaNumero.charAt(i);
            caracterReflejado = cadenaNumero.charAt((longitudCadena-1) - i);
            if (caracter != caracterReflejado) {
                capicua = false;
            }
        }

        return capicua;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("Introduzca el primer numero: ");
        a = scan.nextInt();
        System.out.print("Introduzca el primer numero: ");
        b = scan.nextInt();
        System.out.print("Introduzca el primer numero: ");
        c = scan.nextInt();
        System.out.print("Introduzca el primer numero: ");
        d = scan.nextInt();

        if(esCapicua(a,b,c,d)) {
            System.out.println("La secuencia de números " + a + ", " + b
                    + ", " + c + ", " + d + " es capicua: " + a + b + c + d);
        } else {
            System.out.println("La secuencia de números " + a + ", " + b
                    + ", " + c + ", " + d + " no es capicua: " + a + b + c + d);
        }
    }
}
