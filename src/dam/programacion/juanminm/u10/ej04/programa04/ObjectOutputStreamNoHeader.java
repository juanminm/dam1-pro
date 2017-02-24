/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u10.ej04.programa04;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ObjectOutputStreamNoHeader extends ObjectOutputStream {

    public ObjectOutputStreamNoHeader(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }

}
