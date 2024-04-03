import deob.ObfuscatedName;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("agj")
public class BrokenOutputStream extends OutputStream {

    public void write(int arg0) throws IOException {
        throw new IOException();
    }
}
