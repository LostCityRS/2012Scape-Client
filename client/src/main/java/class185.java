import deob.ObfuscatedName;

@ObfuscatedName("fx")
public class class185 {

    @ObfuscatedName("fx.u")
    public static final class185 field2148 = new class185(0, 4);

    @ObfuscatedName("fx.j")
    public static final class185 field2146 = new class185(1, 5);

    @ObfuscatedName("fx.a")
    public static final class185 field2147 = new class185(2, 6);

    @ObfuscatedName("fx.s")
    public final int field2145;

    @ObfuscatedName("fx.c")
    public final int field2149;

    public class185(int arg0, int arg1) {
        this.field2145 = arg0;
        this.field2149 = arg1 * 8;
    }

    @ObfuscatedName("kb.j(II)Lfx;")
    public static class185 method5012(int arg0) {
        class185[] var1 = Statics.method4877();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class185 var3 = var1[var2];
            if (var3.field2145 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
