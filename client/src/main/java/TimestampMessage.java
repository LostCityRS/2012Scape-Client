import deob.ObfuscatedName;

@ObfuscatedName("acv")
public class TimestampMessage extends Link {

    @ObfuscatedName("acv.a")
    public int field9262 = (int) (MonotonicTime.get() / 1000L);

    @ObfuscatedName("acv.s")
    public String field9263;

    @ObfuscatedName("acv.c")
    public short field9264;

    public TimestampMessage(String arg0, int arg1) {
        this.field9263 = arg0;
        this.field9264 = (short) arg1;
    }
}
