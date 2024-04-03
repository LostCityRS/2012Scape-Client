import deob.ObfuscatedName;

@ObfuscatedName("abv")
public class LoadingScreenRelated6_Sub1 extends LoadingScreenProgressDisplayConfig {

    @ObfuscatedName("abv.d")
    public final int field8828;

    @ObfuscatedName("abv.z")
    public final int field8827;

    public LoadingScreenRelated6_Sub1(LoadingScreenAlignmentX arg0, LoadingScreenAlignmentY arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field8828 = arg9;
        this.field8827 = arg10;
    }

    @ObfuscatedName("ur.s(Laet;I)Liq;")
    public static LoadingScreenProgressDisplayConfig method12157(Packet arg0) {
        LoadingScreenProgressDisplayConfig var1 = LoadingScreenProgressDisplayConfig.method2603(arg0);
        int var2 = arg0.g4s();
        int var3 = arg0.g4s();
        return new LoadingScreenRelated6_Sub1(var1.field2605, var1.field2603, var1.field2604, var1.field2608, var1.field2602, var1.field2607, var1.field2610, var1.field2609, var1.field2606, var2, var3);
    }

    @ObfuscatedName("abv.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return LoadingScreenElementType.field2620;
    }
}
