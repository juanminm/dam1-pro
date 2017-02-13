/*
 * 6. Desarrollar una clase llamada Coche que:
 *   - Tenga un atributo prívate de tipo Motor, un atributo de tipo String
 *     (marca), otro de tipo String (modelo) y otro de tipo double con el
 *     precio acumulado con las averías.
 *   - Tenga un constructor con dos parámetros de tipo String que inicialice la
 *     marca y el modelo.
 *   - Tenga un getvalor para cada uno de los atributos.
 *   - Un método acumularAveria que incrementará el importe gastado en
 *     averías.
 */
package dam.programacion.juanminm.u05.ej02.Practica3;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Coche {
    private Motor motor;
    private String marca, modelo;
    private double precioAcumulado;

    public Coche(String marca, String modelo, int CV) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(CV);
    }

    public Motor obtenerMotor() {
        return motor;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public double obtenerPrecioAcumulado() {
        return precioAcumulado;
    }

    public void acumularAveria(double costeAveria) {
        precioAcumulado += costeAveria;
    }
}
