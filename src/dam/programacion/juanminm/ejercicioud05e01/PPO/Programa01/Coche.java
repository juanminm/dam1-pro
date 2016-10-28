/*
 * 1. Clase COCHE
 * a) Definir una clase que represente a un coche. En la definición se debe
 *    incluir:
 *   - El modelo
 *   - El color
 *   - Si la pintura es metalizada o no
 *   - La matrícula
 *   - El tipo de coche que puede ser MINI, UTILITARIO, FAMILIAR o DEPORTIVO
 *   - El año de fabricación
 *   - La modalidad del seguro, que puede ser a terceros o a todo riesgo
 *
 * b) Añadir a la clase Coche del ejercicio 1 un método de nombre imprimeCoche
 * que imprima el modelo y el color del coche.
 */
package dam.programacion.juanminm.ejercicioud05e01.PPO.Programa01;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Coche {
    private String modelo;
    private String color;
    private String pintura;
    private String matricula;
    private String tipo;
    private int fechaFabricacion;
    private String modalidadSeguro;

    public void imprimeCoche() {
        System.out.println("Modelo: " + modelo + "\nColor: " + color);
    }
}
