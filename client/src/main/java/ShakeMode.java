import deob.ObfuscatedName;

@ObfuscatedName("fp")
public class ShakeMode {

    @ObfuscatedName("fp.u")
    public static final ShakeMode field2127 = new ShakeMode(0);

    @ObfuscatedName("fp.j")
    public static final ShakeMode field2125 = new ShakeMode(1);

    @ObfuscatedName("fp.a")
    public static final ShakeMode field2130 = new ShakeMode(2);

    @ObfuscatedName("fp.s")
    public static final ShakeMode field2126 = new ShakeMode(3);

    @ObfuscatedName("fp.c")
    public static final ShakeMode field2128 = new ShakeMode(4);

    @ObfuscatedName("fp.m")
    public static final ShakeMode field2129 = new ShakeMode(5);

    @ObfuscatedName("fp.t")
    public int field2124;

    public ShakeMode(int arg0) {
        this.field2124 = arg0;
    }

    @ObfuscatedName("of.u(IB)Lfp;")
    public static ShakeMode method7070(int arg0) {
        if (field2127.field2124 == arg0) {
            return field2127;
        } else if (field2125.field2124 == arg0) {
            return field2125;
        } else if (field2130.field2124 == arg0) {
            return field2130;
        } else if (field2126.field2124 == arg0) {
            return field2126;
        } else if (field2128.field2124 == arg0) {
            return field2128;
        } else if (field2129.field2124 == arg0) {
            return field2129;
        } else {
            return null;
        }
    }
}
