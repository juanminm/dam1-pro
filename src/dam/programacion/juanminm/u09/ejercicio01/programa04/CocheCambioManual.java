package dam.programacion.juanminm.u09.ejercicio01.programa04;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class CocheCambioManual extends Coche{

    public CocheCambioManual(String matricula) {
        super(matricula);
    }

    @Override
    public void cambiaMarcha(int nuevaMarcha) {
        if (nuevaMarcha < 0) {
            System.err.println("La marcha no puede ser negativa.");
        } else {
            super.cambiaMarcha(nuevaMarcha);
        }
    }
}
