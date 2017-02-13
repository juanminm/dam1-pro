package dam.programacion.juanminm.u09.ej01.programa02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Poligono {
    private Punto[] puntos;

    public Poligono(Punto[] puntos) {
        this.puntos = puntos;
    }

    public void trasladar(int x, int y) {
        for (int i = 0; i < puntos.length; i++) {
            puntos[i].setX(puntos[i].getX() + x);
            puntos[i].setY(puntos[i].getY() + y);
        }
    }

    public void escalar(int x, int y) {
        for (int i = 0; i < puntos.length; i++) {
            puntos[i].setX(puntos[i].getX() + x);
            puntos[i].setY(puntos[i].getY() + y);
        }
    }

    public int numVertices() {
        return puntos.length;
    }

    public String toString() {
        String s = "";

        for (int i = 0; i < puntos.length; i++) {
            s += "Punto " + i + ": " + puntos[i].toString() + "\n";
        }

        return s;
    }

    public double perimetro() {
        double p = 0;

        for (int i = 2; i < puntos.length; i++) {
            if (i != (puntos.length - 1)) {
                p += puntos[i].distancia(puntos[i - 1]);
            } else {
                p += puntos[i].distancia(puntos[1]);
            }
        }

        return p;
    }
}
