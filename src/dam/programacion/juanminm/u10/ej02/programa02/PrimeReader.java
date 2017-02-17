package dam.programacion.juanminm.u10.ej02.programa02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class PrimeReader {
    private final String fichero;

    public PrimeReader(String fichero) {
        this.fichero = fichero;
    }

    public void leerArchivo() {
        RandomAccessFile raf = null;

        try {
            String archivo = "primos.txt";
            raf = new RandomAccessFile(archivo, "r");
            long pos = 0;

            long mitad = raf.length() / 2;

            while (pos < mitad) {
                raf.seek(pos);
                int primo = raf.readInt();
                System.out.println(primo);

                pos = raf.getFilePointer();
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