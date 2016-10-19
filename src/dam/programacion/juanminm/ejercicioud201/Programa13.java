/*
 * Ejercicio 13.
 *
 * Escribe un programa que visualice en pantalla cuánto le dará su banco
 * después de seis meses si pone 2000€ en una cuenta a plazo fijo al 2,75%
 * anual. Recuerda que al pagarte los intereses el banco le retendrá el 18%
 * para hacienda. Utiliza variables para manejar las cantidades y realizar los
 * cálculos. Escribe los mensajes apropiados para entender todos los cálculos.
 */
package dam.programacion.juanminm.ejercicioud201;

public class Programa13 {
    public static void main(String[] args) {
        float cantidad, intereses, retencion;

        cantidad = 2000f;
        intereses = 2000 * 2.75f/100 * 6/12;
        retencion = -(intereses * 18/100);

        System.out.println("Cantidad depositada: " + cantidad);
        System.out.println("Interes anual: 2.75%");
        System.out.println("Intereses en 6 meses: " + intereses);
        System.out.println("Retención de hacienda: " + retencion);
        System.out.println("Devolucion: " + (intereses - retencion));
        System.out.println("Total final: " + (cantidad + intereses - retencion));
    }
}
