/*
 * 1.a.- Realiza una clase, de nombre Examen, para guardar información sobre
 *       los exámenes de un centro educativo. La información que se guarda de
 *       un examen es: el nombre de la asignatura, el aula, la fecha y la hora.
 *       Para guardar la fecha y la hora hay que realizar dos clases, Fecha y
 *       Hora.
 *
 *       La clase Fecha guarda día, mes y año. Todos los valores se reciben en
 *       el constructor por parámetro. Además, esta clase debe tener un método
 *       que devuelva cada uno de los atributos y un método toString() que
 *       devuelva la información de la fecha en forma de String.
 *
 *       La clase Hora guarda hora y minuto. También recibe los valores para los
 *       atributos por parámetro en el constructor, tiene métodos que devuelven
 *       cada uno de los atributos y un método toString().
 *
 * 1.b.- Realiza una aplicación que cree un objeto de tipo Examen, lo muestre
 *       por pantalla, modifique su fecha y hora y lo vuelva a mostrar por
 *       pantalla.
 */
package dam.programacion.juanminm.u09.ejercicio01.programa01;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        String asignatura = "Programación";
        String aula = "Aula I5";
        Fecha fecha = new Fecha(15, 2, 2017);
        Hora hora = new Hora(8, 0);
        Examen examen = new Examen(asignatura, aula, fecha, hora);
        System.out.println("*** Examen creado ***");

        System.out.println("Asignatura: " + examen.getAsignatura());
        System.out.println("Aula: " + examen.getAula());
        System.out.println("Fecha: " + examen.getFecha().toString());
        System.out.println("Hora: " + examen.getHora().toString());

        examen.getFecha().setDia(21);
        examen.getHora().setHora(11);
        examen.getHora().setMinuto(15);
        System.out.println("\n*** Examen Modificado***");

        System.out.println("Asignatura: " + examen.getAsignatura());
        System.out.println("Aula: " + examen.getAula());
        System.out.println("Fecha: " + examen.getFecha().toString());
        System.out.println("Hora: " + examen.getHora().toString());
    }
}
