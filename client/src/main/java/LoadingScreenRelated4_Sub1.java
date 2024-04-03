import deob.ObfuscatedName;

@ObfuscatedName("abq")
public class LoadingScreenRelated4_Sub1 extends LoadingScreenProgressDisplayConfig {

    @ObfuscatedName("abq.d")
    public final int field8822;

    @ObfuscatedName("abq.z")
    public final int field8820;

    @ObfuscatedName("abq.n")
    public final int field8821;

    @ObfuscatedName("abq.o")
    public final int field8824;

    @ObfuscatedName("abq.q")
    public final int field8823;

    @ObfuscatedName("abq.p")
    public final int field8819;

    public LoadingScreenRelated4_Sub1(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field8822 = arg9;
        this.field8820 = arg10;
        this.field8821 = arg11;
        this.field8824 = arg12;
        this.field8823 = arg13;
        this.field8819 = arg14;
    }

    @ObfuscatedName("iz.s(Laet;B)Liq;")
    public static LoadingScreenProgressDisplayConfig method4623(Packet arg0) {
        LoadingScreenProgressDisplayConfig var1 = LoadingScreenProgressDisplayConfig.method2603(arg0);
        int var2 = arg0.method15411();
        int var3 = arg0.method15411();
        int var4 = arg0.method15411();
        int var5 = arg0.method15411();
        int var6 = arg0.method15411();
        int var7 = arg0.method15411();
        return new LoadingScreenRelated4_Sub1(var1.field2605, var1.field2603, var1.field2604, var1.field2608, var1.field2602, var1.field2607, var1.field2610, var1.field2609, var1.field2606, var2, var3, var4, var5, var6, var7);
    }

    @ObfuscatedName("abq.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return LoadingScreenElementType.field2625;
    }
}
