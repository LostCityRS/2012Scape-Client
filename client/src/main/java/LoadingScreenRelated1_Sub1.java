import deob.ObfuscatedName;

@ObfuscatedName("aho")
public class LoadingScreenRelated1_Sub1 extends LoadingScreenRelated4_Sub1 {

    @ObfuscatedName("aho.w")
    public final int field10137;

    public LoadingScreenRelated1_Sub1(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field10137 = arg15;
    }

    @ObfuscatedName("afu.n(Laet;I)Liq;")
    public static LoadingScreenProgressDisplayConfig method15894(Packet arg0) {
        LoadingScreenRelated4_Sub1 var1 = (LoadingScreenRelated4_Sub1) LoadingScreenRelated4_Sub1.method4623(arg0);
        int var2 = arg0.g2s();
        return new LoadingScreenRelated1_Sub1(var1.field2605, var1.field2603, var1.field2604, var1.field2608, var1.field2602, var1.field2607, var1.field2610, var1.field2609, var1.field2606, var1.field8822, var1.field8820, var1.field8821, var1.field8824, var1.field8823, var1.field8819, var2);
    }

    @ObfuscatedName("aho.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return LoadingScreenElementType.field2628;
    }
}
