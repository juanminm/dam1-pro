package dam.programacion.juanminm.u09.ej01.programa01;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        String s = dia + "/" + mes + "/" + año;
        return s;
    }
}
