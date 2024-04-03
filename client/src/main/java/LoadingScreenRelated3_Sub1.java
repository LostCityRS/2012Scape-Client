import deob.ObfuscatedName;

@ObfuscatedName("ix")
public class LoadingScreenRelated3_Sub1 implements LoadingScreenElementConfig {

    @ObfuscatedName("ix.u")
    public final String field2635;

    @ObfuscatedName("ix.j")
    public final LoadingScreenAlignmentX field2645;

    @ObfuscatedName("ix.a")
    public final LoadingScreenAlignmentY field2641;

    @ObfuscatedName("ix.s")
    public final int field2637;

    @ObfuscatedName("ix.c")
    public final int field2638;

    @ObfuscatedName("ix.m")
    public final int field2639;

    @ObfuscatedName("ix.t")
    public final int field2636;

    @ObfuscatedName("ix.l")
    public final int field2634;

    @ObfuscatedName("ix.f")
    public final int field2642;

    @ObfuscatedName("ix.d")
    public final int field2643;

    @ObfuscatedName("ix.z")
    public final int field2644;

    @ObfuscatedName("ix.n")
    public final int field2640;

    @ObfuscatedName("ix.o")
    public final int field2646;

    public LoadingScreenRelated3_Sub1(String arg0, LoadingScreenAlignmentX arg1, LoadingScreenAlignmentY arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field2635 = arg0;
        this.field2645 = arg1;
        this.field2641 = arg2;
        this.field2637 = arg3;
        this.field2638 = arg4;
        this.field2639 = arg5;
        this.field2636 = arg6;
        this.field2634 = arg7;
        this.field2642 = arg8;
        this.field2643 = arg9;
        this.field2644 = arg10;
        this.field2640 = arg11;
        this.field2646 = arg12;
    }

    @ObfuscatedName("dr.u(Laet;I)Lix;")
    public static LoadingScreenRelated3_Sub1 method2822(Packet arg0) {
        String var1 = arg0.method15337();
        LoadingScreenAlignmentX var2 = LoadingScreenAlignmentX.method15177()[arg0.method15220()];
        LoadingScreenAlignmentY var3 = LoadingScreenAlignmentY.method3623()[arg0.method15220()];
        int var4 = arg0.method15240();
        int var5 = arg0.method15240();
        int var6 = arg0.method15220();
        int var7 = arg0.method15220();
        int var8 = arg0.method15220();
        int var9 = arg0.method15239();
        int var10 = arg0.method15239();
        int var11 = arg0.method15411();
        int var12 = arg0.method15379();
        int var13 = arg0.method15379();
        return new LoadingScreenRelated3_Sub1(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
    }

    @ObfuscatedName("ix.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return LoadingScreenElementType.field2619;
    }
}
