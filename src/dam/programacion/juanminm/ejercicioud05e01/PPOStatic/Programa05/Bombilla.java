package dam.programacion.juanminm.ejercicioud05e01.PPOStatic.Programa05;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Bombilla {
    private boolean interruptor;
    private static boolean INTERRUPTOR_GENERAL = false;

    public Bombilla() {
        interruptor = false;
    }

    public void encender() {
        interruptor = true;
    }

    public void apagar() {
        interruptor = false;
    }

    public void alternar() {
        if (interruptor) {
            apagar();
        } else {
            encender();
        }
    }

   public void encenderInterruptorGeneral() {
        INTERRUPTOR_GENERAL = true;
    }

    public void apagarInterruptorGeneral() {
        INTERRUPTOR_GENERAL = false;
    }

    public void alternarInterruptorGeneral() {
        if (INTERRUPTOR_GENERAL) {
            apagarInterruptorGeneral();
        } else {
            encenderInterruptorGeneral();
        }
    }

    public void obtenerEstado() {
        if (INTERRUPTOR_GENERAL && interruptor) {
            System.out.println("La bombilla está encendida.");
        } else {
            System.out.println("La bombilla está apagada.");
        }
    }

}
