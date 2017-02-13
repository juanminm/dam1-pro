package dam.programacion.juanminm.u09.ej01.programa06;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Coche extends Vehículo {
    private int numPuertas;

    public Coche(String m, int numPuertas) {
        super(m);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}
