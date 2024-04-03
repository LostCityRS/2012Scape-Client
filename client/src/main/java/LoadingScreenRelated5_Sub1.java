import deob.ObfuscatedName;

@ObfuscatedName("abm")
public class LoadingScreenRelated5_Sub1 extends LoadingScreenProgressDisplayConfig {

    @ObfuscatedName("abm.d")
    public final int field8825;

    @ObfuscatedName("abm.z")
    public final int field8826;

    public LoadingScreenRelated5_Sub1(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field8825 = arg10;
        this.field8826 = arg11;
    }

    @ObfuscatedName("dl.s(Laet;B)Liq;")
    public static LoadingScreenProgressDisplayConfig method2607(Packet arg0) {
        LoadingScreenProgressDisplayConfig var1 = LoadingScreenProgressDisplayConfig.method2603(arg0);
        int var2 = arg0.method15379();
        int var3 = arg0.method15379();
        int var4 = arg0.method15411();
        return new LoadingScreenRelated5_Sub1(var1.field2605, var1.field2603, var1.field2604, var1.field2608, var1.field2602, var1.field2607, var1.field2610, var1.field2609, var1.field2606, var2, var3, var4);
    }

    @ObfuscatedName("abm.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return LoadingScreenElementType.field2621;
    }
}
