package dam.programacion.juanminm.u05.ej01.PPOStatic.Programa03;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Elemento {
    private String nombre;
    private static int numeroElementos = 0;

    public Elemento(String nombre) {
        this.nombre = nombre;
        numeroElementos++;
    }

    public static void numeroDeElementos() {
        System.out.println("Número de elementos: " + numeroElementos);
    }
}
