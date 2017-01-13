/*
 * 5. Escribe un método, de nombre mostrarCadenasArray, que reciba por parámetro
 *    un array con cadenas de caracteres. El método mostrará por pantalla el
 *    primer carácter de cada una de las cadenas contenidas en el array.
 *
 *    - Se debe evitar que se produzca una excepción NullPointerException si
 *      alguna de las posiciones del array contiene una referencia no
 *      inicializada (valor null)
 */
package dam.programacion.juanminm.u07.ejercicio02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Excepciones05 {
    public static void mostrarCadenasArray(String[] arr) {
        for (String arr1 : arr) {
            try {
                System.out.println(arr1.charAt(0));
            } catch(NullPointerException e) {
                System.out.println("Valor nulo.");
            } catch(StringIndexOutOfBoundsException e) {
                System.out.println("Cadena vacia.");
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Richard M. Stallman", "Steve Jobs", "Bill Gates",
        "Linus Torvalds", "Ian Murdock", "", "Daniel K. Gillmord", null,
        "Werner Noch"};

        mostrarCadenasArray(arr);
    }
}
