package dam.programacion.juanminm.u08.ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class CuentasBancarias {
    public static void main(String[] args) {
        int opcion;
        Cuentas cuentas = new Cuentas();

        do {
            System.out.println("======== BANCO UNIVERSAL =======");
            System.out.println();
            System.out.println("1. Alta de cuentas");
            System.out.println("2. Consulta de una cuenta");
            System.out.println("3. Modificar cuentas");
            System.out.println("4. Anular cuentas");
            System.out.println("5. Listado de cuentas");
            System.out.println("0. Salir");
            System.out.println();
            System.out.print("Selecciona una opción: ");

            try {
                Scanner scan = new Scanner(System.in);
                opcion = scan.nextInt();

                switch (opcion) {
                    case 1:
                        cuentas.nuevaCuenta();
                        break;
                    case 2:
                        cuentas.consultarCuenta();
                        break;
                    case 3:
                        cuentas.modificarCuenta();
                        break;
                    case 4:
                        cuentas.anularCuenta();
                        break;
                    case 5:
                        cuentas.visualizarCuentas();
                        break;
                    case 0:
                        System.out.println("Adiós.");
                        break;
                    default:
                        System.out.println("Opción invalidad");
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Opción invalidad.");
                opcion = -1;
            }
        } while (opcion != 0);
    }
}