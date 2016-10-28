/*
 * 2. Escribe un programa que disponga de una clase para representar las
 *    asignaturas de una carrera:
 *
 *   - Una asignatura tiene un nombre, un código numérico y curso en el cual
 *     se imparte
 *   - Los valores iniciales han de proporcionarse en el constructor
 *   - La clase ha de tener métodos para obtener los valores de los atributos
 *   - El programa ha de construir un objeto con los siguientes valores:
 *     nombre “Matemáticas”, código 1017, curso 1.
 *   - A continuación, el programa ha de imprimir los valores del objeto por
 *     pantalla
 */

package dam.programacion.juanminm.ejercicioud05e01.PPO.Programa02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        Asignatura Matematicas = new Asignatura("Matemáticas", 1017, 1);

        Matematicas.getAsignatura();
    }
}
