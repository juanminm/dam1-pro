/*
 * 6.a.- Se va a implementar un simulador de Vehículo. Existen dos tipos de
 *   Vehículo: Coche y Camión.
 *
 *   a) Sus características comunes son la matrícula y la velocidad. En el
 *      momento de crearlos, la matrícula se recibe por parámetro y la velocidad
 *      se inicializa a 0. El método toString() de los vehículos devuelve
 *      información acerca de la matrícula y la velocidad. Además se pueden
 *      acelerar, pasando por parámetro la cantidad en km/h que se tiene que
 *      acelerar.
 *
 *   b) Los coches tienen además un atributo para el número de puertas, que se
 *      recibe también por parámetro en el momento de crearlo. Tiene además un
 *      método que devuelve el número de puertas.
 *
 *   c) Los camiones tienen un atributo de tipo Remolque que inicializa a null
 *      (para indicar que no tiene remolque). Además tiene un método
 *      ponRemolque(), que recibe el Remolque por parámetro, y otro
 *      quitaRemolque(). Cuando se muestre la información de un camión que lleve
 *      remolque, además de la matrícula y velocidad del camión, debe aparecer
 *      la información del remolque.
 *
 *   d) En esta clase hay que sobrescribir el método acelerar de manera que si
 *      el camión tiene remolque y la velocidad más la aceleración superan los
 *      100 km/h se lance una excepción de tipo DemasiadoRapidoException.
 *
 *   e) Hay que implementar la clase Remolque. Esta clase tiene un atributo de
 *      tipo entero que es el peso y cuyo valor se le da en el momento de crear
 *      el objeto. Debe tener un método toString() que devuelva la información
 *      del remolque.
 *
 *   f) Implementar la clase DemasiadoRapidoException.
 *
 * Implementar este diseño con la estructura más convincente.
 *
 * 6.b.- Utilizando las clases del ejercicio anterior, implementa una aplicación
 *   que haga lo siguiente:
 *
 *   a) Declare y cree un array de 4 vehículos.
 *
 *   b) Cree 2 camiones y 2 coches y los añada al array.
 *
 *   c) Suponiendo que no se sabe en qué celdas los coches y en cuáles los
 *      camiones:
 *
 *      1. Ponga un remolque de 5000 Kg a los camiones del array.
 *      2. Acelere todos los vehículos.
 *      3. Escriba por pantalla la información de todos los vehículos.
 */
package dam.programacion.juanminm.u09.ejercicio01.programa06;

import java.util.Random;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Main {
    private static void ponerRemolque(Vehículo v) {
        if (v instanceof Camion) {
            Remolque r = new Remolque(5000);

            ((Camion) v).ponRemolque(r);
        }
    }

    private static void acelerarVehiculo(Vehículo v, double d) {
        v.acelerar(d);
    }

    private static void mostrarInformacion(Vehículo[] vArr) {
        for (Vehículo v : vArr) {
            System.out.printf("%s%n%n", v.toString());
        }
    }

    public static void main(String[] args) {
        Vehículo[] vehiculoArr = new Vehículo[4];
        Camion camion1 = new Camion("34-R94");
        Camion camion2 = new Camion("8W-725");
        Coche coche1 = new Coche("3482 CE", 4);
        Coche coche2 = new Coche("4958 WV", 6);
        Random rnd = new Random();

        vehiculoArr[0] = camion1;
        vehiculoArr[1] = coche2;
        vehiculoArr[2] = coche1;
        vehiculoArr[3] = camion2;

        for (int i = 0; i < vehiculoArr.length; i++) {
            ponerRemolque(vehiculoArr[i]);

            acelerarVehiculo(vehiculoArr[i], rnd.nextDouble()*150);
        }

        mostrarInformacion(vehiculoArr);
    }
}
