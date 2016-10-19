/*
 * 1. Mostrar los números 48, 50, 52, 54,.........., 100.
 */
package dam.programacion.juanminm.ejercicioud202;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class ProgramaB01 {
    public static void main(String[] args) {
        for (int i = 48; i<=100; i +=2) {
            
            if (i < 100) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
            
        }
    }
}
