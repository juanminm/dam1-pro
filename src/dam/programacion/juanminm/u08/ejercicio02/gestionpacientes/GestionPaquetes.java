/*
 * 2. - Desarrollar un sistema de gestión de pacientes:
 *
 * Tendremos un archivador dónde iremos guardando todas las fichas de los
 * pacientes. Las fichas contienen la siguiente información: nombre, apellidos y
 * edad.
 *
 * Todas las fichas que vayamos creando, se podrán guardar o eliminar del
 * archivador. Al archivador también le podremos pedir un listado. Este listado
 * consistirá en visualizar por pantalla el número de fichas guardadas, así como
 * el contenido de las fichas.
 *
 * La clase GestionPacientes tiene un método main en el que se crea un
 * archivador, dos o tres fichas que se guardarán en el archivador, se listará
 * el contenido, se eliminará alguna ficha y se volverá a listar su contenido.
 *
 * Todas las clases se guardarán en el paquete gestionpacientes */
package dam.programacion.juanminm.u08.ejercicio02.gestionpacientes;

import java.util.ArrayList;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class GestionPaquetes {
    public static void main(String[] args) {
        Archivador archivador = new Archivador();
        Ficha ficha1 = new Ficha("Juan Miguel", "Navarro Martínez", 23);
        Ficha ficha2 = new Ficha("Pepito", "Delgado Gonzalez", 28);
        Ficha ficha3 = new Ficha("Linus", "Torvalds", 47);

        archivador.guardar(ficha1);
        archivador.guardar(ficha2);
        archivador.guardar(ficha3);
        archivador.listar();
        archivador.eliminar(ficha2);
        archivador.listar();
    }
}
