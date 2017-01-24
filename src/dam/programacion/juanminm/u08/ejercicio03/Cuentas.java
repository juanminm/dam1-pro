package dam.programacion.juanminm.u08.ejercicio03;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Cuentas {
    private ArrayList<Ccuenta> listaCuentas = new ArrayList();
    private int total = 0;

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

            try {
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
            } catch (InputMismatchException e) {
                System.out.println("Opción invalida.");
                opcion = -1;
            }
        } while (opcion < 0 && opcion > 2);

        return cuenta;
    }



    public int nuevaCuenta() {
        boolean ctrl = true;
        Scanner scan = new Scanner(System.in);
        Ccuenta nueva = null;

        do {
            try {
                ctrl = true;
                String nombre;
                String numero;
                double saldo;
                double tipoDeInteres;

                System.out.print("Introduce el nombre: ");
                nombre = scan.nextLine();

                System.out.print("Introduce el número de cuenta: ");
                numero = scan.next();

                for (int i = 0; i < listaCuentas.size(); i++) {
                    if (listaCuentas.get(i).getCuenta().equals(numero)) {
                        throw new Exception("Cuenta repetida.");
                    }
                }

                System.out.print("Introduzca el saldo inicial de la cuenta: ");
                saldo = scan.nextDouble();

                System.out.print("Introduzca el tipo de interes de la"
                        + "cuenta: ");
                tipoDeInteres = scan.nextDouble();

                nueva = new Ccuenta(nombre, numero, saldo,
                        tipoDeInteres);

                System.out.println("Cuenta creada.");
                listaCuentas.add(nueva);
                System.out.println("Cuenta añadida.");
                total++;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                ctrl = false;
            }
        } while(!ctrl);

        return listaCuentas.indexOf(nueva);
    }

    public void modificarCuenta() {
        Ccuenta cuenta = buscarCuenta();
        Scanner scan = new Scanner(System.in);

        if (cuenta == null) {
            System.out.println("La cuenta no existe.");
        } else {
            try {
                System.out.print("¿Modificar el saldo de la cuenta? (s/N):");

                switch(scan.next().toLowerCase()) {
                    case "s":
                    case "si":
                    case "sí":
                        System.out.print("Introduca la nueva cantidad: ");
                        cuenta.setSaldo(scan.nextDouble());
                        break;
                    case "n":
                    case "no":
                    case "":
                        break;
                    default:
                        throw new Exception("Opción invalida.");
                }

                System.out.print("¿Modificar el tipo de interés? (s/N):");
                switch(scan.next().toLowerCase()) {
                    case "s":
                    case "si":
                    case "sí":
                        System.out.print("Introduca la nueva cantidad: ");
                        cuenta.setTipoDeInteres(scan.nextDouble());
                        break;
                    case "n":
                    case "no":
                    case "":
                        break;
                    default:
                        throw new Exception("Opción invalida.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void anularCuenta() {
        Ccuenta cuenta = buscarCuenta();
        Scanner scan = new Scanner(System.in);

        if (cuenta == null) {
            System.out.println("La cuenta no existe.");
        } else if (cuenta.getSaldo() != 0) {
            System.out.println("La cuenta aun contiene saldo.");
        } else {
            listaCuentas.remove(cuenta);
        }
    }

    public void consultarCuenta() {
        Ccuenta cuenta = buscarCuenta();
        Scanner scan = new Scanner(System.in);

        if (cuenta == null) {
            System.out.println("La cuenta no existe.");
        } else {
            System.out.printf("%-19s %s", "Cliente", cuenta.getNombre());
            System.out.printf("%-19s %s", "Número de cuenta", cuenta.getCuenta());
            System.out.printf("%-19s %f", "Saldo", cuenta.getSaldo());
            System.out.printf("%-19s %f", "Tipo de interes", cuenta.getTipoDeInteres());
        }
    }
}
