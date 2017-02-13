/*
 * 4. Escribe una clase de nombre Item, que acepta un nombre en su constructor.
 * Cada ítem debe disponer de un número que servirá como identificador único de
 * cada objeto. La clase ítem dispondrá de un método para obtener el
 * identificador y otro para obtener el nombre. Haga un programa de prueba que
 * genere tres ítems, “uno”, “dos” y “tres” y luego escriba los nombres e
 * identificadores de cada ítem.
 */
package dam.programacion.juanminm.u05.ej01.PPOStatic.Programa04;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        Item uno = new Item("uno");
        Item dos = new Item("dos");
        Item tres = new Item("tres");

        tres.getIdentificador();
        uno.getIdentificador();
    }
}
