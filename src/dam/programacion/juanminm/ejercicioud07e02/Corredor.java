package dam.programacion.juanminm.ejercicioud07e02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Corredor {
    private int energia;

    Corredor(int energia) {
        this.energia = energia;
    }

    public void recargarEnergia(int energia) {
        this.energia += energia;
    }

    public void correr() {
        try {
            if (energia >= 10) {
                this.energia -= 10;
                System.out.println("El corredor ha dado una vuelta.");
            } else {
                String message = "Energia es menor que 10.";
                throw new AgotadoException(message);
            }
        } catch (AgotadoException e) {
            System.err.println(e.getMessage());
        }
    }
}
