/*
 * Ejercicio 19
 *
 * Escribe un programa para calcular el consumo medio de un automóvil. Para
 * ello el programa debe solicitar información sobre las tres últimas veces que
 * se repostó combustible. De la primera solicitará el precio del litro del
 * combustible, el total pagado en llenar el depósito y el número de kilómetros
 * que marcaba el cuentakilómetros. De la segunda vez sólo solicitará el precio
 * del litro de combustible y el total pagado en llenar el depósito, y de la
 * tercera vez, solicitará el valor que indicaba el cuentakilómetros. Con estos
 * datos debe calcular el consumo por cada 100 km y el coste por kilómetro.
 */
package dam.programacion.juanminm.u02.ej01;

import java.util.Scanner;

public class Programa19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precioLitro, totalPrecio, kilometrosRecorridos;
        double precioLitro2, totalPrecio2, kilometrosRecorridos3;
        double consumo100KM, costeKilometro;

        System.out.println("Calculador de consumo medio de las ultimas tres "
                        + "paradas.");
        System.out.println();

        System.out.println("Introduzca el precio del computible, el total "
                        + "pagado y el número de kilometros que muestra el"
                        + "cuentakilometros en el primer repostaje");
        System.out.print("Precio del litro: ");
        precioLitro = scan.nextDouble();
        System.out.print("Total pagado: ");
        totalPrecio = scan.nextDouble();
        System.out.print("Cuentakilometros: ");
        kilometrosRecorridos = scan.nextDouble();

        System.out.println("Introduzca el precio del combustible y el total "
                        + "pagado y el número de kilometros recorridos en el segundo "
                        + "repostaje.");
        System.out.print("Precio del litro: ");
        precioLitro2 = scan.nextDouble();
        System.out.print("Total pagado: ");
        totalPrecio2 = scan.nextDouble();

        System.out.println("Introduzca el número de kilometros que muestra el"
                        + "cuentakilometros en el tercer repostaje.");
        System.out.print("Cuentakilometros: ");
        kilometrosRecorridos3 = scan.nextDouble();

        consumo100KM = (totalPrecio / precioLitro / kilometrosRecorridos +
                        totalPrecio2 / precioLitro2 / kilometrosRecorridos3) / 2 * 100;

        costeKilometro = (totalPrecio / kilometrosRecorridos + precioLitro2 /
                        kilometrosRecorridos3) / 2;

        System.out.println("El consumo medio por 100km es de: " +
                        consumo100KM);
        System.out.println("El coste medio por kilometro es de: " +
                        costeKilometro);
        scan.close();
    }
}
