import deob.ObfuscatedName;

@ObfuscatedName("fg")
public class PositionMode {

    @ObfuscatedName("fg.u")
    public static final PositionMode field2192 = new PositionMode(0);

    @ObfuscatedName("fg.j")
    public static final PositionMode field2193 = new PositionMode(1);

    @ObfuscatedName("fg.a")
    public static final PositionMode field2191 = new PositionMode(2);

    @ObfuscatedName("fg.s")
    public static final PositionMode field2194 = new PositionMode(3);

    @ObfuscatedName("fg.c")
    public int field2195;

    public PositionMode(int arg0) {
        this.field2195 = arg0;
    }

    @ObfuscatedName("ec.u(II)Lfg;")
    public static PositionMode method3450(int arg0) {
        if (field2192.field2195 == arg0) {
            return field2192;
        } else if (field2193.field2195 == arg0) {
            return field2193;
        } else if (field2191.field2195 == arg0) {
            return field2191;
        } else if (field2194.field2195 == arg0) {
            return field2194;
        } else {
            return null;
        }
    }
}
