package dam.programacion.juanminm.ejercicioud05e01.PPO.Programa05;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Movil {
    private double posX;
    private double posY;
    private double velocidad;

    public Movil() {
        posX = 2.1;
        posY = 5.2;
        velocidad = 2.4;
    }

    public void obtenerPos(double tiempo) {
        System.out.println("(" + (posX+2.4*tiempo) + ", "
                + (2*(posX+2.4*tiempo)+1) + ")");
    }
}
