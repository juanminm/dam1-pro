/*
 * 2. Calcular la suma de los números comprendidos entre uno y mil.
 */
package dam.programacion.juanminm.u02.ej02;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB02 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 1000; i++) {
            suma += i;
        }

        System.out.println("La suma de los numeros entre 1 y 1000 es " + suma);
    }
}
