package dam.programacion.juanminm.ejercicioud07e02;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Entrenamiento {
    public static void main(String[] args) {
        Corredor corredor = new Corredor(50);
        int agotado = 0;

        while (agotado < 3) {
            if (corredor.getEnergia() < 10) {
                agotado++;

                switch(agotado) {
                    case 1:
                        corredor.recargarEnergia(30);
                        break;
                    case 2:
                        corredor.recargarEnergia(10);
                        break;
                }
            } else {
                corredor.correr();
            }
        }
    }
}
