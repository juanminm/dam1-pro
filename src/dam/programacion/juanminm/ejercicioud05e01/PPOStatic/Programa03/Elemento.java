package dam.programacion.juanminm.ejercicioud05e01.PPOStatic.Programa03;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Elemento {
    private String nombre;
    private static int NUMERO_ELEMENTOS = 0;

    public Elemento(String nombre) {
        this.nombre = nombre;
        NUMERO_ELEMENTOS++;
    }

    public void numeroDeElementos() {
        System.out.println("Número de elementos: " + NUMERO_ELEMENTOS);
    }
}
