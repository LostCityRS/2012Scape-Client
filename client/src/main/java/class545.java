import deob.ObfuscatedName;

@ObfuscatedName("te")
public class class545 {

    @ObfuscatedName("te.u")
    public static final class545 field6641 = new class545("LIVE", 0);

    @ObfuscatedName("te.j")
    public static final class545 field6639 = new class545("BUILDLIVE", 3);

    @ObfuscatedName("te.a")
    public static final class545 field6640 = new class545("RC", 1);

    @ObfuscatedName("te.s")
    public static final class545 field6638 = new class545("WIP", 2);

    @ObfuscatedName("te.c")
    public static final class545 field6642 = new class545("INTBETA", 4);

    @ObfuscatedName("te.m")
    public final String field6643;

    @ObfuscatedName("te.t")
    public final int field6644;

    @ObfuscatedName("ad.u(B)[Lte;")
    public static class545[] method1936() {
        return new class545[]{field6640, field6639, field6638, field6642, field6641};
    }

    public class545(String arg0, int arg1) {
        this.field6643 = arg0;
        this.field6644 = arg1;
    }

    @ObfuscatedName("pt.j(II)Lte;")
    public static class545 method7734(int arg0) {
        class545[] var1 = method1936();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class545 var3 = var1[var2];
            if (var3.field6644 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
