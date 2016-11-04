/*
 * 5. Se desea representar las bombillas que pueda haber en una casa. Cada
 * bombilla tiene asociada un interruptor y sólo uno. Así mismo, existe un
 * interruptor general de la casa. Un interruptor tiene dos estados, ON y OFF.
 * Una bombilla luce si el interruptor general de la casa está ON y su
 * interruptor asociado también. Escribe una clase de nombre Bombilla que
 * permita modelar la información anterior. Para ello, la clase dispondrá de:
 *
 *  - un método para cambiar el estado del interruptor de la bombilla.
 *  - Un método para cambiar el estado del interruptor general de la casa.
 *  - Un método que determina si una bombilla está luciendo o no.
 *
 * Escribe un programa que utilice la clase Bombilla del apartado anterior.
 * Para ello, se creará una Bombilla y se visualizará por pantalla si luce o no.
 * Luego se pulsa el interruptor de la Bombilla y se vuelve a visualizar el
 * estado de la misma. Por último, se pulsa el interruptor general y se
 * visualiza el estado.
 */
package dam.programacion.juanminm.ejercicioud05e01.PPOStatic.Programa05;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla();

        bombilla.obtenerEstado();
        bombilla.alternar();
        bombilla.obtenerEstado();
        Bombilla.alternarInterruptorGeneral();
        bombilla.obtenerEstado();
    }
}
