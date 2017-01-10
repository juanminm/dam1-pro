package dam.programacion.juanminm.ejercicioud07e02;

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
