package dam.programacion.juanminm.u09.ejercicio01.programa01;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        String s = "";

        if (hora < 10) {
            s += "0" + hora;
        } else {
            s += hora;
        }
        s += ":";

        if (minuto < 10) {
            s += "0" + minuto;
        } else {
            s += minuto;
        }

        return s;
    }
}
