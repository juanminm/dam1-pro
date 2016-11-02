/*
 * 5. PARA AMPLIAR. Escribe un programa que permita modelar el movimiento
 *    rectilíneo uniforme de un móvil en un plano
 *
 *   - El móvil puede seguir una trayectoria en cualquier recta del plano
 *   - Se conoce la posición inicial del móvil, así como su velocidad lineal
 *
 * Escribe, asimismo, un programa que ejercite dichas clases, de forma que se
 * instancie un móvil que:
 *
 *   - se mueve a una velocidad de 2.4 metros/segundo
 *   - parte de la posición (2.1, 5.2)
 *   - se mueve sobre la recta y = 2x + 1
 *   - El móvil se irá moviendo en incrementos de tiempo arbitrarios
 *   - El programa ha de determinar las posiciones en las que se encuentra el
 *     móvil tras el paso de 3.5, 4, y 6.2 unidades de tiempo respectivamente y
 *     las imprimirá por pantalla
 *   - Nota : Evidentemente, el punto de partida del móvil ha de pertenecer a
 *     la recta que define el movimiento
 */

package dam.programacion.juanminm.ejercicioud05e01.PPO.Programa05;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        Movil movil = new Movil();

        System.out.print("Posicion tras 3.5 seg: ");
        movil.obtenerPos(3.5);
        System.out.print("Posicion tras 4 seg: ");
        movil.obtenerPos(4);
        System.out.print("Posicion tras 6.2 seg: ");
        movil.obtenerPos(6.2);
    }
}
