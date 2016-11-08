/*
 * 7. Desarrollar una clase llamada Garaje que:
 *   - Tendrá tres atributos, un coche, un String con la avería asociada y el
 *     número de coches que ha ido atendiendo.
 *   - El garaje solo podrá atender a un coche en cada momento. Controlar esta
 *     premisa.
 *   - Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y la
 *     avería asociada. El garaje solo podrá atender a un coche en cada momento. Si ya está atendiendo uno, que devuelva un false.
 *   - Tenga un método devolverCoche que dejará al garaje en estado de aceptar
 *     un nuevo coche.
 */
package dam.programacion.juanminm.ejercicioud05e02.Practica3;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Garaje {
    private Coche coche;
    private String averia;
    private int numeroCoches = 0;
    private boolean existeCoche = false;

    public void aceptarCoche(Coche coche, String averia) {
        if (!existeCoche) {
            this.coche = coche;
            this.averia = averia;
            numeroCoches++;
            existeCoche = true;
        } else {
            System.out.printf("Ya hay un coche.%n");
        }
    }

    public void devolverCoche() {
        if (existeCoche) {
            this.coche = null;
            this.averia = null;
            existeCoche = false;
        } else {
            System.out.printf("No hay ningun coche a devolver.%n");
        }

    }
}
