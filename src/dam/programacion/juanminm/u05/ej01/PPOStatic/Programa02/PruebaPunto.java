/*
 * 2. Añade a la clase Punto una constante llamada ORIGEN que sea el origen de
 * coordenadas. La constante debe ser accesible de forma estática. Escribe un
 * programa, de nombre PruebaPunto, que determine la distancia de los puntos
 * (3,4), (0,4) y (2,-1) al origen usando la constante ORIGEN.
 */
package dam.programacion.juanminm.u05.ej01.PPOStatic.Programa02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class PruebaPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto(3, 4);
        Punto punto2 = new Punto(0, 4);
        Punto punto3 = new Punto(2, -1);

        System.out.println("La distancia de P1 (" + punto1.getCoordenadaX()
                + ", " + punto1.getCoordenadaY() + ") al origen es "
                + punto1.distancia());
        System.out.println("--------\n");
        System.out.println("La distancia de P2 (" + punto2.getCoordenadaX()
                + ", " + punto2.getCoordenadaY() + ") al origen es "
                + punto2.distancia());
        System.out.println("--------\n");
        System.out.println("La distancia de P3 (" + punto3.getCoordenadaX()
                + ", " + punto3.getCoordenadaY() + ") al origen es "
                + punto3.distancia());
    }
}
