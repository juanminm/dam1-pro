/*
 * 3. Escribe una clase llamada Elemento, que disponga de un atributo con su
 * nombre. La clase debe contener un método llamado númeroDeElementos que
 * devuelve el número total de elementos que se han instanciado.
 */
package dam.programacion.juanminm.u05.ej01.PPOStatic.Programa03;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        Elemento elem1 = new Elemento("Elemento 1");
        Elemento elem2 = new Elemento("Elemento 2");
        Elemento elem3 = new Elemento("Elemento 3");

        Elemento.numeroDeElementos();
    }
}
