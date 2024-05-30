import deob.ObfuscatedName;

@ObfuscatedName("fx")
public class DrawDistance {

    @ObfuscatedName("fx.u")
    public static final DrawDistance field2148 = new DrawDistance(0, 4);

    @ObfuscatedName("fx.j")
    public static final DrawDistance field2146 = new DrawDistance(1, 5);

    @ObfuscatedName("fx.a")
    public static final DrawDistance field2147 = new DrawDistance(2, 6);

    @ObfuscatedName("fx.s")
    public final int field2145;

    @ObfuscatedName("fx.c")
    public final int field2149;

    public DrawDistance(int arg0, int arg1) {
        this.field2145 = arg0;
        this.field2149 = arg1 * 8;
    }

    @ObfuscatedName("ju.u(I)[Lfx;")
    public static DrawDistance[] method4877() {
        return new DrawDistance[]{field2148, field2146, field2147};
    }

    @ObfuscatedName("kb.j(II)Lfx;")
    public static DrawDistance method5012(int arg0) {
        DrawDistance[] var1 = method4877();
        for (int var2 = 0; var2 < var1.length; var2++) {
            DrawDistance var3 = var1[var2];
            if (var3.field2145 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
