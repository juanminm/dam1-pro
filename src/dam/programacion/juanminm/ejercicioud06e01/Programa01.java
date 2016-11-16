/*
 * 1. Escribe un programa que solicite tres cadenas de caracteres, una llamada
 * nombre, otra llamada primerApellido y segundoApellido. El programa debe crear
 * una cadena con el nombre completo y después mostrar por pantalla:
 *   - el nombre completo con todos los caracteres en minúsculas y luego en
 *     mayúsculas y su longitud
 *   - los dos primeros caracteres de la cadena (solo en el caso de que la
 *     longitud de esta sea de dos o más caracteres)
 *   - los dos últimos caracteres de la cadena (solo en el caso de que la
 *     longitud de esta sea de dos o más caracteres)
 *   - el número de ocurrencias en la cadena del último carácter
 *   - la cadena con todas las ocurrencias del primer carácter en mayúsculas
 *   - la cadena con tres asteriscos por delante y por detrás
 *   - la cadena invertida
 */
package dam.programacion.juanminm.ejercicioud06e01;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa01 {

    public static void contarOcurrenciasUltimoCaracter(String nombreCompleto) {
        int contador = 0;
        int posicion = 0;
        int ultimaPosicion = nombreCompleto.length()-1;
        char ultimoCaracter = nombreCompleto.charAt(ultimaPosicion);

        while (posicion != -1) {
            posicion = nombreCompleto.indexOf(ultimoCaracter, posicion);

            if (posicion != -1) {
                posicion++;
                contador++;
            }
        }

        System.out.printf("El ultimo caracter, %s, aparece %d veces.%n",
                ultimoCaracter, contador);
    }

    public static String invertirCadena(String nombreCompleto) {
        String nombreInvertido = "";
        int longitud = nombreCompleto.length() -1;

        for (int i = longitud; i >= 0; i--) {
            nombreInvertido += nombreCompleto.charAt(i);
        }

        return nombreInvertido;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre;
        String primerApellido;
        String segundoApellido;
        String nombreCompleto;
        String primerCaracter;

        System.out.print("Introduzca su nombre: ");
        nombre = scan.nextLine();
        System.out.print("Introduzca su primer apellido: ");
        primerApellido = scan.nextLine();
        System.out.print("Introduzca su segundo apellido: ");
        segundoApellido = scan.nextLine();

        nombreCompleto = nombre + " " + primerApellido + " " + segundoApellido;

        System.out.printf("%s%n", nombreCompleto.toLowerCase());
        System.out.printf("%s%n", nombreCompleto.toUpperCase());
        System.out.printf("Longitud: %s%n", nombreCompleto.length());

        if (nombreCompleto.length() >= 2) {
            System.out.printf("%s%n", nombreCompleto.substring(0, 2));
            System.out.printf("%s%n", nombreCompleto.substring(
                    nombreCompleto.length() - 2, nombreCompleto.length()
            ));
        }

        contarOcurrenciasUltimoCaracter(nombreCompleto);

        primerCaracter = Character.toString(nombreCompleto.charAt(0));
        System.out.println(nombreCompleto.replaceAll(
                primerCaracter.toLowerCase(), primerCaracter.toUpperCase()));

        System.out.printf("***%s***%n", nombreCompleto);

        System.out.printf("%s%n", invertirCadena(nombreCompleto));
    }
}
