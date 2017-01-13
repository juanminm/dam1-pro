/*
 * 5. Visualizar los números de 1 a 100 e indicar al final: Cuantos hay pares y su
 * suma. Cuantos hay impares y su suma. Cuantos hay que sean múltiplos de
 * cuatro y de siete y su suma.
 */
package dam.programacion.juanminm.u02.ejercicio02;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB05 {
    public static void main(String[] args) {
        int pares = 0, sumaPares = 0, impares = 0, sumaImpares = 0,
                multiplos4y7 = 0, sumaMultiplos4y7 = 0;

        for (int i = 1; i <= 100; i++) {
            if (i == 100) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }

            if (i % 2 == 0) {
                pares++;
                sumaPares += i;
            } else {
                impares++;
                sumaImpares += i;
            }

            if (i % 4 == 0 && i % 7 == 0) {
                multiplos4y7++;
                sumaMultiplos4y7 += i;
            }
        }

        System.out.println("\nHay " + pares + " números pares cuya suma es " + sumaPares);
        System.out.println("Hay " + impares + " números impares cuya suma es " + sumaImpares);
        System.out.println("Hay " + multiplos4y7 + " números multipos de 4 y de 7 cuya suma es " + sumaMultiplos4y7);
    }
}
