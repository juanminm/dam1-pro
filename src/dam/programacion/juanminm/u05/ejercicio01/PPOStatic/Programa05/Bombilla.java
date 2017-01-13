package dam.programacion.juanminm.u05.ejercicio01.PPOStatic.Programa05;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Bombilla {
    private boolean interruptor;
    private static boolean interruptorGeneral = false;

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

   public static void encenderInterruptorGeneral() {
        interruptorGeneral = true;
    }

    public static void apagarInterruptorGeneral() {
        interruptorGeneral = false;
    }

    public static void alternarInterruptorGeneral() {
        if (interruptorGeneral) {
            apagarInterruptorGeneral();
        } else {
            encenderInterruptorGeneral();
        }
    }

    public void obtenerEstado() {
        if (interruptorGeneral && interruptor) {
            System.out.println("La bombilla está encendida.");
        } else {
            System.out.println("La bombilla está apagada.");
        }
    }

}
