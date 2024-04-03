import deob.ObfuscatedName;

import java.io.InputStream;

@ObfuscatedName("agb")
public class BrokenInputStream extends InputStream {

    public int read() {
        PreciseSleep.method7052(30000L);
        return -1;
    }
}
