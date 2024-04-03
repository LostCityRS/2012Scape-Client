import deob.ObfuscatedName;

@ObfuscatedName("iq")
public class LoadingScreenProgressDisplayConfig implements LoadingScreenElementConfig {

    @ObfuscatedName("iq.u")
    public final LoadingScreenAlignmentX field2605;

    @ObfuscatedName("iq.j")
    public final LoadingScreenAlignmentY field2603;

    @ObfuscatedName("iq.a")
    public final int field2604;

    @ObfuscatedName("iq.s")
    public final int field2608;

    @ObfuscatedName("iq.c")
    public final int field2602;

    @ObfuscatedName("iq.m")
    public final int field2607;

    @ObfuscatedName("iq.t")
    public final int field2610;

    @ObfuscatedName("iq.l")
    public final int field2609;

    @ObfuscatedName("iq.f")
    public final int field2606;

    public LoadingScreenProgressDisplayConfig(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2605 = arg0;
        this.field2603 = arg1;
        this.field2604 = arg2;
        this.field2608 = arg3;
        this.field2602 = arg4;
        this.field2607 = arg5;
        this.field2610 = arg6;
        this.field2609 = arg7;
        this.field2606 = arg8;
    }

    @ObfuscatedName("dl.u(Laet;I)Liq;")
    public static LoadingScreenProgressDisplayConfig method2603(Packet arg0) {
        LoadingScreenAlignmentX var1 = LoadingScreenAlignmentX.method15177()[arg0.g1()];
        LoadingScreenAlignmentY var2 = LoadingScreenAlignmentY.method3623()[arg0.g1()];
        int var3 = arg0.g2s();
        int var4 = arg0.g2s();
        int var5 = arg0.g2();
        int var6 = arg0.g2();
        int var7 = arg0.g2s();
        int var8 = arg0.gSmart2or4null();
        int var9 = arg0.g4s();
        return new LoadingScreenProgressDisplayConfig(var1, var2, var3, var4, var5, var6, var7, var8, var9);
    }

    @ObfuscatedName("iq.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return null;
    }
}
