package dam.programacion.juanminm.ejercicioud05e01.PPOStatic.Programa01;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class AparatoElectronico {
    private String nombre;
    private double consumo;
    private boolean encendido;
    private static double CONSUMO_TOTAL = 0;

    public AparatoElectronico(String nombre, double consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
        encendido = false;

        System.out.println("Consumo de " + this.nombre + ": " + this.consumo + "W");
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            CONSUMO_TOTAL -= consumo;

            System.out.println(nombre + " apagado/a.");
        }
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            CONSUMO_TOTAL += consumo;

            System.out.println(nombre + " encendido/a.");
        }
    }

    public void getConsumoTotal() {
        System.out.println("Consumo total: " + CONSUMO_TOTAL + "W");
    }
}
