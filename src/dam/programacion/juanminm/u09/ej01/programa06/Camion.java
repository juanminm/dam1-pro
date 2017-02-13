package dam.programacion.juanminm.u09.ej01.programa06;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Camion extends Vehículo {
    private Remolque remolque;

    public Camion(String m) {
        super(m);
    }

    public void ponRemolque(Remolque r) {
        remolque = r;
    }

    public void quitaRemolque() {
        remolque = null;
    }

    @Override
    public String toString() {
        String s = String.format("%s%n%s", super.toString(),
                remolque.toString());

        return s;
    }

    @Override
    public void acelerar(double a) {
        try {
            if (remolque == null || getVelocidad() + a <= 100) {
                super.acelerar(a);
            } else {
                throw new DemasiadoRapidoException();
            }
        } catch(DemasiadoRapidoException e) {
            System.err.println(e.getMessage());
        }
    }
}
