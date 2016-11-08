/*
 * 5. Desarrollar una clase llamada Motor que:
 *   - Tenga dos atributos prívate de tipo int (litros de aceite) y de tipo int
 *     (CV)
 *   - Tenga un constructor con un parámetro de tipo int para los CV. Los
 *     litros de aceite por defecto serán 0.
 *   - Tenga un getvalor para cada uno de los atributos.
 *   - Tenga un setvalor para los litros.
 *
 * 6. Desarrollar una clase llamada Coche que:
 *   - Tenga un atributo prívate de tipo Motor, un atributo de tipo String
 *     (marca), otro de tipo String (modelo) y otro de tipo double con el
 *     precio acumulado con las averías.
 *   - Tenga un constructor con dos parámetros de tipo String que inicialice la
 *     marca y el modelo.
 *   - Tenga un getvalor para cada uno de los atributos.
 *   - Un método acumularAveria que incrementará el importe gastado en
 *     averías.
 *
 * 7. Desarrollar una clase llamada Garaje que:
 *   - Tendrá tres atributos, un coche, un String con la avería asociada y el
 *     número de coches que ha ido atendiendo.
 *   - El garaje solo podrá atender a un coche en cada momento. Controlar esta
 *     premisa.
 *   - Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y la
 *     avería asociada. El garaje solo podrá atender a un coche en cada momento. Si ya está atendiendo uno, que devuelva un false.
 *   - Tenga un método devolverCoche que dejará al garaje en estado de aceptar
 *     un nuevo coche.
 *
 * 8. Desarrollar una clase llamada Practica3 que en su método main:
 *   - Cree un garaje.
 *   - Cree 2 coches.
 *   - El garaje irá cogiendo los coches y devolviéndolos, acumulando un
 *     importe aleatorio (Math.random()) de la avería tratada.
 *   - Si la avería del coche es “aceite” incrementar en 10 los litro de aceite.
 *   - Los coches entrarán al menos 2 veces en el garaje.
 *   - Mostrar la información de los coches al final de main
 */
package dam.programacion.juanminm.ejercicioud05e02.Practica3;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Practica_3 {

}
