/*
 * 6. Visualizar la tabla de multiplicar del uno al diez.
 */
package dam.programacion.juanminm.Ejercicio02UD2;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB06 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            System.out.println("Tabla de multiplicar del " + x);
            for (int y = 1; y <= 10; y++) {
                System.out.println(x + " x " + y + " = " + (x*y));
            }
            System.out.println();
        }        
    }
}
