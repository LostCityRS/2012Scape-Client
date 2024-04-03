package jaclib.memory;

import deob.ObfuscatedName;

public class NativeBuffer implements Buffer, Source {

    @ObfuscatedName("jaclib/memory/NativeBuffer.u")
    public int field368 = -1;

    @ObfuscatedName("jaclib/memory/NativeBuffer.j")
    public long field369;

    @ObfuscatedName("jaclib/memory/NativeBuffer.u()I")
    public final int method31() {
        return this.field368;
    }

    @ObfuscatedName("jaclib/memory/NativeBuffer.j()J")
    public final long method32() {
        return this.field369;
    }

    @ObfuscatedName("jaclib/memory/NativeBuffer.a([BIII)V")
    public void method13(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field369 == 0L | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.field368) {
            throw new RuntimeException();
        }
        this.put(this.field369, arg0, arg1, arg2, arg3);
    }

    public final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

    public final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
