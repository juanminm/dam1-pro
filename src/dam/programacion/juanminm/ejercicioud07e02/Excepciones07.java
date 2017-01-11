package dam.programacion.juanminm.ejercicioud07e02;

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
