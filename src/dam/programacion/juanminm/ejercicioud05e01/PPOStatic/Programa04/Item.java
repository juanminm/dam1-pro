package dam.programacion.juanminm.ejercicioud05e01.PPOStatic.Programa04;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Item {
    private String nombre;
    private int identificador;
    private static int ULTIMO_IDENTIFICADOR = 0;

    public Item(String nombre) {
        this.nombre = nombre;
        identificador = ULTIMO_IDENTIFICADOR + 1;

        ULTIMO_IDENTIFICADOR = identificador;
    }

    public void getNombre() {
        System.out.println(nombre);
    }

    public void getIdentificador() {
        System.out.println(identificador);
    }
}
