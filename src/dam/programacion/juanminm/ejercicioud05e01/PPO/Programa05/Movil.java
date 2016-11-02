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

    public double obtenerPos(double tiempo) {
        return 2*(posX+2.4*tiempo)+1;
    }
}
