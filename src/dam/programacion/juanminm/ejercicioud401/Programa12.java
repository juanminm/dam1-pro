/*
 * 12. Escribe un programa en Java que, dado el nombre de una ersona y el
 * idioma de preferencia de esa persona, escriba en pantalla un saludo a esa
 * persona en el idioma elegido, con el estilo: ”Buenos días Pepe Sánchez”.
 *
 * Los idiomas disponibles serán
 * (a) Valenciano
 * (b) Castellano
 * (c) Inglés
 *
 * El saludo se mostrará desde un procedimiento al que se le pasan el nombre y
 * el código del idioma. Para el ejemplo anterior, la llamada sería:
 * saludo (”Pepe Sánchez ”, ’b’)
 */
package dam.programacion.juanminm.ejercicioud401;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Programa12 {
   static void saludo(String nombre, char idioma) {
       switch(idioma) {
           case 'a':
               System.out.println("Buenos dias, " + nombre);
               break;
           case 'b':
               System.out.println("Bon dia, " + nombre);
               break;
           case 'c':
               System.out.println("Good morning, " + nombre);
               break;
       }
   }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre;
        char idioma;

        System.out.print("Nombre/Nom/Name: ");
        nombre = scan.nextLine();
        System.out.print("Idioma/Language [Español (a) | Catala (b) |"
                + " English (c): ");
        idioma = scan.next().charAt(0);

        saludo(nombre, idioma);
    }
}
