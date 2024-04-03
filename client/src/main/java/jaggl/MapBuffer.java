package jaggl;

import deob.ObfuscatedName;
import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer {

    @ObfuscatedName("jaggl/MapBuffer.a")
    public int field202;

    @ObfuscatedName("jaggl/MapBuffer.a([BIII)V")
    public void method13(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field202 == 0) {
            throw new RuntimeException();
        }
        super.method13(arg0, arg1, arg2, arg3);
    }
}
