/*
 * 7. Escribe una clase, de nombre Corredor, teniendo en cuenta las siguientes
 *    especificaciones:
 *
 *    - La clase tendrá un atributo entero de nombre energía
 *
 *    - La clase tendrá un método constructor que reciba por parámetro una
 *      cantidad de energía que asignará al atributo
 *
 *    - La clase tendrá un método, de nombre recargarEnergia, que recibirá por
 *      parámetro una cantidad de energía que será sumada al atributo energía
 *
 *    - La clase tendrá un método, de nombre correr, que mostrará por pantalla
 *      un mensaje y decrementará la energía en 10 unidades. Antes de proceder
 *      al decremento, el método comprobará que la energía del corredor es igual
 *      o superior a 10 unidades. Si no es así, el método lanzará una excepción
 *      de tipo AgotadoException
 *
 * Para crear la excepción AgotadoException (en el fichero Corredor.java):
 *
 *     class AgotadoException extends Exception{
 *         public AgotadoException (String msj){
 *             super (msj);
 *         }
 *     }
 */
package dam.programacion.juanminm.u07.ejercicio02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Excepciones07 {
    public static void main(String[] args) {
        Corredor corredor = new Corredor(26);

        System.out.printf("Energia inicial del corredor: %d%n",
                corredor.getEnergia());

        corredor.correr();
        corredor.correr();
        corredor.correr();
        corredor.recargarEnergia(4);
        corredor.correr();
        corredor.correr();
        corredor.recargarEnergia(30);
        corredor.correr();
    }
}
