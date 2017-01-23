package dam.programacion.juanminm.u08.ejercicio03;

import java.util.ArrayList;

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
}
