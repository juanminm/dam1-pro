package dam.programacion.juanminm.u10.ej02.programa02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class PrimeWriter {
    private final String fichero;

    public PrimeWriter(String fichero) {
        this.fichero = fichero;
    }

    private static boolean esPrimo(int n) {
        int i = 5;

        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }

            i += 6;
        }

        return true;
    }
    public void crearFichero() {
        File archivo;
        RandomAccessFile raf = null;

        try {
            archivo = new File(fichero);
            raf = new RandomAccessFile(archivo, "rw");

            for (int i = 0; i < 100; i++) {
               if (esPrimo(i)) {
                   raf.writeInt(i);
               }
           }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if(raf != null) {
                    raf.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}