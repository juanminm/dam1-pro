package dam.programacion.juanminm.u08.ejercicio03;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Ccuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

    public Ccuenta() {
    }

    public Ccuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) {
        try {
            this.nombre = comprobarVacio(nombre);
            this.cuenta = comprobarVacio(cuenta);
            this.saldo = comprobarNegativo(saldo);
            this.tipoDeInteres = comprobarNegativo(tipoDeInteres);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private String comprobarVacio(String s) throws Exception {
        if (!(s == null || s.equals(""))) {
            return s;
        } else {
            throw new Exception("La cadena no puede ser vacia o nula.");
        }
    }

    private double comprobarNegativo(double d) throws Exception {
        if (d >= 0) {
            return d;
        } else {
            throw new Exception("El valor no puede ser negativo.");
        }
    }

    public void setNombre(String n) {
        try {
            nombre = comprobarVacio(n);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void setCuenta(String c) {
        try {
            cuenta = comprobarVacio(c);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void setSaldo(double s) {
        try {
            saldo = comprobarNegativo(s);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void setTipoDeInteres(double tdi) {
        try {
            saldo = comprobarNegativo(tdi);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getSueldo() {
        return saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void reintegro(double cantidad) {
        try {
            saldo = comprobarNegativo(saldo - cantidad);
        } catch(Exception e) {
            System.err.println(e.getCause());
        }
    }
}
