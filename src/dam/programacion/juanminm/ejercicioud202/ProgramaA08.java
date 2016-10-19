/*
 * Escribe un programa para calcular la edad de una persona solicitando la
 * fecha actual y la fecha de su nacimiento.
 */
package dam.programacion.juanminm.ejercicioud202;

/**
 *
 * @author mati
 */
import java.util.Scanner;

public class ProgramaA08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean fallo = false;
        int diaActual = 0;
        int mesActual = 0;
        int añoActual = 0;

        int diaNacimiento = 0;
        int mesNacimiento = 0;
        int añoNacimiento = 0;

        int edad;

        System.out.println("Introduzca la fecha de hoy. ");

        /*
         * Comprobación de que el año es valido. Se asume que una persona no
         * vive más de 150 años.
         */
        do {
            System.out.print("Año: ");
            añoActual = scan.nextInt();

            if (añoActual <= 1850) {
                System.out.println("No puedes introducir fechas menores que "
                        + "1850.");
            }

        } while (añoActual <= 1850);

        do {
            System.out.print("Mes: ");
            mesActual = scan.nextInt();

            if (mesActual < 1 || mesActual > 12) {
                System.out.println("El més introducido no es el correcto.");
            }

        } while (mesActual < 1 || mesActual > 12);

        /*
         * Validación de dia, solo pueden ser de 1 a 31 independiente del
         * año.
         *
         * Se asume que la translación de la Tierra alrededor del Sol es la
         * misma que cuando se creo este programa y que no ha surgido ninguna
         * variación en la orbita por ningun objeto másivo que haya pasado por
         * el sistema Solar.
         */
        do {
            System.out.print("Dia: ");
            diaActual = scan.nextInt();

            if (mesActual == 2) {
                if ((añoActual % 4 == 0 && añoActual % 100 != 0 || añoActual % 400 == 0)
                        && (diaActual < 1 || diaActual > 29)) {
                    /*
                     * Valída el valor de dia para el mes de febrero en un año
                     * bisieto.
                     */
                    System.out.println("El día introducido no es el correcto. "
                            + "Valores entre 1 y 29 para febrero en un año "
                            + "bisiesto.");

                    fallo = true;
                } else if (diaActual < 1 || diaActual > 28) {
                    /*
                     * Valída el valor del dia para el mes de febrero en un año
                     * no bisieto.
                     */
                    System.out.println("El día introducido no es el correcto. "
                            + "Valores entre 1 y 28 para febrero en un año "
                            + "no bisiesto.");

                    fallo = true;
                }
            } else if ((mesActual <= 7 && mesActual % 2 == 0
                    || mesActual > 7 && mesActual % 2 == 1)
                    && (mesActual < 1 || mesActual > 30)) {
                /*
                 * Valída para los meses que terminan en el dia 30. De
                 * enero a julio el mes es un número par. De agosto a
                 * diciembre, el mes es un numero impar.
                 */
                System.out.println("El día introducido no es el correcto. "
                        + "Valores entre 1 y 30 para el mes introducito.");
            } else if ((mesActual <= 7 && mesActual % 2 == 1
                    || mesActual > 7 && mesActual % 2 == 0)
                    && (mesActual < 1 || mesActual > 31)) {
                /*
                 * Valída para los meses que terminan en el dia 31. De
                 * enero a julio el mes es un número impar. De agosto a
                 * diciembre, el mes es un numero par.
                 */
                System.out.println("El día introducido no es el correcto. "
                        + "Valores entre 1 y 31 para el mes introducito.");
                fallo = true;
            } else {
                // El dia introducido es correcto.
                fallo = false;
            }
        } while (diaActual < 1 || diaActual > 31 || fallo);

        /*
         * Repetición de lo mismo pero para el año de nacimiento. Sería más
         * rápido usando una función para la verificación de fechas.
         */
        System.out.println("Introduzca la fecha de tu nacimiento: ");
        do {
            System.out.print("Año: ");
            añoNacimiento = scan.nextInt();

            if (añoNacimiento <= 1850) {
                System.out.println("No puedes introducir fechas menores que "
                        + "1850.");
            }

        } while (añoActual <= 1850);

        do {
            System.out.print("Mes: ");
            mesNacimiento = scan.nextInt();

            if (mesNacimiento < 1 || mesNacimiento > 12) {
                System.out.println("El més introducido no es el correcto.");
            }

        } while (mesNacimiento < 1 || mesNacimiento > 12);

        do {
            System.out.print("Dia: ");
            diaNacimiento = scan.nextInt();

            if (mesNacimiento == 2) {
                if ((añoNacimiento % 4 == 0 && añoNacimiento % 100 != 0
                        || añoNacimiento % 400 == 0) && (diaNacimiento < 1
                        || diaNacimiento > 29)) {
                    System.out.println("El día introducido no es el correcto. "
                            + "Valores entre 1 y 29 para febrero en un año "
                            + "bisiesto.");

                    fallo = true;
                } else if (diaNacimiento < 1 || diaNacimiento > 28) {
                   System.out.println("El día introducido no es el correcto. "
                            + "Valores entre 1 y 28 para febrero en un año "
                            + "no bisiesto.");

                    fallo = true;
                }
            } else if ((mesNacimiento <= 7 && mesNacimiento % 2 == 0
                    || mesNacimiento > 7 && mesNacimiento % 2 == 1)
                    && (diaNacimiento < 1 || diaNacimiento > 30)) {
               System.out.println("El día introducido no es el correcto. "
                        + "Valores entre 1 y 30 para el mes introducito.");
               fallo = true;
            } else if ((mesNacimiento <= 7 && mesNacimiento % 2 == 1
                    || mesNacimiento > 7 && mesNacimiento % 2 == 0)
                    && (diaNacimiento < 1 || diaNacimiento > 31)) {
                System.out.println("El día introducido no es el correcto. "
                        + "Valores entre 1 y 31 para el mes introducito.");
                fallo = true;
            } else {
                fallo = false;
            }
        } while (diaNacimiento < 1 || diaNacimiento > 31 || fallo);

        if (mesActual > mesNacimiento || mesActual == mesNacimiento
                && diaActual >= diaNacimiento) {
            edad = añoActual - añoNacimiento;
        } else {
            edad = añoActual - añoNacimiento - 1;
        }

        System.out.println("Tu edad es: " + edad);
    }
}