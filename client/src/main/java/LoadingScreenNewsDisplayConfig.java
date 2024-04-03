import deob.ObfuscatedName;

@ObfuscatedName("iw")
public class LoadingScreenNewsDisplayConfig implements LoadingScreenElementConfig {

    @ObfuscatedName("iw.u")
    public final LoadingScreenAlignmentX field2599;

    @ObfuscatedName("iw.j")
    public final LoadingScreenAlignmentY field2592;

    @ObfuscatedName("iw.a")
    public final int field2593;

    @ObfuscatedName("iw.s")
    public final int field2594;

    @ObfuscatedName("iw.c")
    public final int field2595;

    @ObfuscatedName("iw.m")
    public final int field2596;

    @ObfuscatedName("iw.t")
    public final int field2591;

    @ObfuscatedName("iw.l")
    public final int field2598;

    @ObfuscatedName("iw.f")
    public final int field2601;

    @ObfuscatedName("iw.d")
    public final int field2600;

    @ObfuscatedName("iw.z")
    public final boolean field2597;

    public LoadingScreenNewsDisplayConfig(int arg0, LoadingScreenAlignmentX arg1, LoadingScreenAlignmentY arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field2600 = arg0;
        this.field2599 = arg1;
        this.field2592 = arg2;
        this.field2593 = arg3;
        this.field2594 = arg4;
        this.field2598 = arg5;
        this.field2601 = arg6;
        this.field2595 = arg7;
        this.field2596 = arg8;
        this.field2591 = arg9;
        this.field2597 = arg10;
    }

    @ObfuscatedName("cu.u(Laet;B)Liw;")
    public static LoadingScreenNewsDisplayConfig method2548(Packet arg0) {
        int var1 = arg0.g1();
        LoadingScreenAlignmentX var2 = LoadingScreenAlignmentX.method15177()[arg0.g1()];
        LoadingScreenAlignmentY var3 = LoadingScreenAlignmentY.method3623()[arg0.g1()];
        int var4 = arg0.g2s();
        int var5 = arg0.g2s();
        int var6 = arg0.g2();
        int var7 = arg0.g2();
        int var8 = arg0.g4s();
        int var9 = arg0.g4s();
        int var10 = arg0.g4s();
        boolean var11 = arg0.g1() == 1;
        return new LoadingScreenNewsDisplayConfig(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
    }

    @ObfuscatedName("iw.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return LoadingScreenElementType.field2626;
    }
}
