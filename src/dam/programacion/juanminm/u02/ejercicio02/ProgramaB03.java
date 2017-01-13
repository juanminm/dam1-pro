/*
 * 3. Mostrar los impares de 1 a 99 indicando al final cuantos son. Repetir para
 * los pares y para los múltiplos de cinco.
 */
package dam.programacion.juanminm.u02.ejercicio02;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB03 {
    public static void main(String[] args) {
        int impares = 0, pares = 0, multiplos5 = 0;

        System.out.println("Numeros impares entre el 1 y el 99.");
        for (int i = 1; i <= 99; i += 2) {
            if (impares == 0) {
                System.out.print(i);
            } else {
                System.out.print(", " + i);
            }

            impares++;
        }

        System.out.println("\nLa cantidad de impares es " + impares);
        System.out.println("\nNumeros pares entre el 1 y el 99.");
        for (int i = 2; i <= 99; i += 2) {
            if (pares == 0) {
                System.out.print(i);
            } else {
                System.out.print(", " + i);
            }

            pares++;
        }

        System.out.println("\nLa cantidad de pares es " + pares);
        System.out.println("\nMultiplos de 5 del 1 al 99.");
        for (int i = 1; i <= 99; i += 1) {
            if (i % 5 == 0) {
                if (multiplos5 == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(", " + i);
                }

                multiplos5++;
            }
        }
        System.out.println("\nLa cantidad de multiplos de 5 es " + multiplos5);
    }
}
