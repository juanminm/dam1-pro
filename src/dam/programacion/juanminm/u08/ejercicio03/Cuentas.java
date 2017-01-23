package dam.programacion.juanminm.u08.ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Cuentas {
    private ArrayList<Ccuenta> listaCuentas = new ArrayList();
    private int total;

    private Ccuenta posCuentaNombre(String nombre) {
        boolean cuentaEncontrada = false;
        int i = 0;
        Ccuenta cuenta = null;

        while (!cuentaEncontrada && i < listaCuentas.size()) {
            if (listaCuentas.get(i).getNombre().equals(nombre)) {
                cuenta = listaCuentas.get(i);
                cuentaEncontrada = true;
            }
        }

        return cuenta;
    }

    private Ccuenta posCuenta(String numcta) {
        boolean cuentaEncontrada = false;
        int i = 0;
        Ccuenta cuenta = null;

        while (!cuentaEncontrada && i < listaCuentas.size()) {
            if (listaCuentas.get(i).getCuenta().equals(numcta)) {
                cuenta = listaCuentas.get(i);
                cuentaEncontrada = true;
            }
        }

        return cuenta;
    }

    public Ccuenta buscarCuenta() {
        int opcion;
        Scanner scan = new Scanner(System.in);
        Ccuenta cuenta = null;

        do {
            System.out.println("Metodos de busqueda:");
            System.out.println("  1. Por nombre.");
            System.out.println("  2. Por número de cuenta.");
            System.out.println("  0. Salir.");
            System.out.print("\nIntroduzca el metodo: ");
            opcion = scan.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("\nIntroduzca el nombre del cliente: ");
                    cuenta = posCuentaNombre(scan.nextLine());

                    break;
                case 2:
                    System.out.print("\nIntroduzca el número de cuenta: ");
                    cuenta = posCuenta(scan.nextLine());

                    break;
                case 0:
                    System.out.println("Cancelada la operación.");
                    break;
                default:
                    System.err.println("La opción es incorrecta. Intenta de"
                            + "nuevo.\n");
                    break;
            }
        } while (opcion != 0 && opcion > 2);

        return cuenta;
    }
}
