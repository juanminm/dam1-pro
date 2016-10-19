/*
 * Ejercicio 12.
 *
 * Escribe un programa para calcular el área y el volumen de un cilindro. Para
 * ello declara una constante que guarda el valor de PI. Declara, también,
 * variables para el diámetro y la altura del cilindro. Supón para el ejemplo
 * que el cilindro tiene un diámetro de 15,5cm y una altura de 42,4cm.
 */
package dam.programacion.juanminm.ejercicioud201;

public class Programa12 {
    public static void main(String[] args) {
        final double PI = 3.14159265359;
        double diametro = 15.5;
        double altura = 42.4;

        System.out.println("Diametro: " + diametro + " cm");
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Area: " + (2 * PI * diametro/2 * (altura + diametro/2)) + " cm2");
        System.out.println("Volumen: " + (PI * Math.pow(diametro/2,2)*altura) + " cm3");
    }
}
