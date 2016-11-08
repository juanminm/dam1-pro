/*
 * 5. Desarrollar una clase llamada Motor que:
 *   - Tenga dos atributos prívate de tipo int (litros de aceite) y de tipo int
 *     (CV)
 *   - Tenga un constructor con un parámetro de tipo int para los CV. Los
 *     litros de aceite por defecto serán 0.
 *   - Tenga un getvalor para cada uno de los atributos.
 *   - Tenga un setvalor para los litros.
 */
package dam.programacion.juanminm.ejercicioud05e02.Practica3;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Motor {
    private int litrosDeAceite, CV;

    public Motor(int CV) {
        this.CV = CV;
        litrosDeAceite = 0;
    }

    public int obtenerLitrosDeAceite() {
        return litrosDeAceite;
    }

    public int obtenerCV() {
        return CV;
    }

    public void introducirLitrosDeAceite(int litrosDeAceite) {
        this.litrosDeAceite = litrosDeAceite;
    }
}
