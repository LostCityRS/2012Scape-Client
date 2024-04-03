import deob.ObfuscatedName;

@ObfuscatedName("te")
public class ModeWhat {

    @ObfuscatedName("te.u")
    public static final ModeWhat field6641 = new ModeWhat("LIVE", 0);

    @ObfuscatedName("te.j")
    public static final ModeWhat field6639 = new ModeWhat("BUILDLIVE", 3);

    @ObfuscatedName("te.a")
    public static final ModeWhat field6640 = new ModeWhat("RC", 1);

    @ObfuscatedName("te.s")
    public static final ModeWhat field6638 = new ModeWhat("WIP", 2);

    @ObfuscatedName("te.c")
    public static final ModeWhat field6642 = new ModeWhat("INTBETA", 4);

    @ObfuscatedName("te.m")
    public final String field6643;

    @ObfuscatedName("te.t")
    public final int field6644;

    @ObfuscatedName("ad.u(B)[Lte;")
    public static ModeWhat[] method1936() {
        return new ModeWhat[]{field6640, field6639, field6638, field6642, field6641};
    }

    public ModeWhat(String arg0, int arg1) {
        this.field6643 = arg0;
        this.field6644 = arg1;
    }

    @ObfuscatedName("pt.j(II)Lte;")
    public static ModeWhat method7734(int arg0) {
        ModeWhat[] var1 = method1936();
        for (int var2 = 0; var2 < var1.length; var2++) {
            ModeWhat var3 = var1[var2];
            if (var3.field6644 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
