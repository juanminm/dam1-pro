/*
 * 1. Escribe un programa para representar el consumo de energía de una
 * instalación eléctrica. Para ello se dispondrá de una clase que representa los
 * aparatos conectados en la instalación, Cada aparato tiene un consumo
 * eléctrico determinado. Al encender un aparato eléctrico, el consumo de
 * energía se incrementa en la potencia de dicho aparato. Al apagarlo se
 * decrementa el consumo. Inicialmente, los aparatos están todos apagados.
 * Además, se desea consultar el consumo total de la instalación.
 *
 * Hacer un programa que declare tres aparatos eléctricos, una bombilla de 100
 * watios, un radiador de 2000 watios y una plancha de 1200 watios. El programa
 * imprimirá el consumo nada más crear los objetos. Posteriormente, se enciende
 * la bombilla y la plancha, y el programa imprime el consumo. Luego se apaga la
 * plancha y se enciende le radiador y se vuelve a imprimir el consumo.
 */
package dam.programacion.juanminm.u05.ejercicio01.PPOStatic.Programa01;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Main {
    public static void main(String[] args) {
        AparatoElectronico bombilla = new AparatoElectronico("Bombilla", 100);
        AparatoElectronico radiador = new AparatoElectronico("Radiador", 2000);
        AparatoElectronico plancha = new AparatoElectronico("Planca", 1200);

        bombilla.encender();
        plancha.encender();
        AparatoElectronico.getConsumoTotal();
        plancha.apagar();
        radiador.encender();
        AparatoElectronico.getConsumoTotal();
    }
}
