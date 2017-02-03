/*
 * 4.a.- Escribe una clase Coche de la que van a heredar CocheCambioManual y
 * CocheCambioAutomatico. Los atributos de los coches son la matrícula, la
 * velocidad y la marcha. Para este ejercicio no se permite la marcha atrás,
 * por tanto no se permiten ni velocidad negativa, ni marcha negativa. En el
 * constructor se recibe el valor de la matrícula por parámetro y se
 * inicializa el valor de la velocidad y la marcha a 0. Además tendrá los
 * siguientes métodos:
 *
 *   getMatrícula(): que devuelve el valor de la matrícula.
 *
 *   getMarcha(): devuelve el valor de la marcha.
 *
 *   getVelocidad(): devuelve el valor de la velocidad.
 *
 *   acelerar(): recibe por parámetro un valor al acelerar el coche.
 *
 *   frenar(): recibe por parámetro un valor al frenar el coche.
 *
 *   toString(): devuelve en forma de String la información del coche.
 *
 *   cambiaMarcha(): recibe por parámetro la marcha a la que se tiene que
 *   cambiar el coche. Este método es protected, para que puedan acceder a él
 *   las clases que heredan de Coche, pero no las clases de otros paquetes.
 *
 * 4.b.- La clase CocheCambioManual sobrescribe el método cambiaMarcha() y lo
 * hace público, para que pueda ser llamado desde cualquier clase. No permite
 * que se cambie a una marcha negativa.
 *
 * 4.c.- La clase CocheCambioAutomatico sobrescribe los métodos acelerar() y
 * frenar() para que cambie automáticamente de marcha conforme se va acelerando
 * y frenando.
 */
package dam.programacion.juanminm.u09.ejercicio01.programa04;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void cocheAutomatico(String matricula) {
        CocheCambioAutomatico coche = new CocheCambioAutomatico(matricula);

        System.out.println(coche.toString());
        System.out.println("Acelerando coche...");
        coche.acelerar(60);
        System.out.println(coche.toString());
    }

    public static void cocheManual(String matricula) {
        CocheCambioManual coche = new CocheCambioManual(matricula);

        System.out.println(coche.toString());
        System.out.println("Cambiando marcha a 3...");
        coche.cambiaMarcha(3);
        System.out.println("Acelerando coche...");
        coche.acelerar(60);
        System.out.println(coche.toString());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String matricula;

        System.out.print("Introduzca la matricula del coche: ");
        matricula = scan.nextLine();

        System.out.print("¿El coche tiene cambio 'manual' o 'automatico'?");
        switch(scan.next().toLowerCase()) {
            case "automatico":
            case "auto":
                cocheAutomatico(matricula);
                break;
            case "man":
            case "manual":
                cocheManual(matricula);
                break;
        }
    }
}
