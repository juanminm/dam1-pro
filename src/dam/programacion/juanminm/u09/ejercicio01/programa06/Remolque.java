package dam.programacion.juanminm.u09.ejercicio01.programa06;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
class Remolque {
    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return String.format("Peso: %d kg", peso);
    }
}
