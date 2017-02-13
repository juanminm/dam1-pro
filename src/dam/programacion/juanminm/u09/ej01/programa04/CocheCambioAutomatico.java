package dam.programacion.juanminm.u09.ej01.programa04;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class CocheCambioAutomatico extends Coche {
    public CocheCambioAutomatico(String matricula) {
        super(matricula);
    }

    @Override
    public void acelerar(double aumento) {
        super.acelerar(aumento);
        cambiaMarcha(getMarcha() + 1);
    }

    @Override
    public void frenar(double decremento) {
        super.frenar(decremento);

        if (getVelocidad() == 0) {
            cambiaMarcha(0);
        } else if (getMarcha() > 1) {
            cambiaMarcha(getMarcha() - 1);
        }
    }
}
