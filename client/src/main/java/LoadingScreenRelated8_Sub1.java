import deob.ObfuscatedName;

@ObfuscatedName("abh")
public class LoadingScreenRelated8_Sub1 extends LoadingScreenSpriteConfig {

    @ObfuscatedName("abh.m")
    public final int field8829;

    public LoadingScreenRelated8_Sub1(int arg0, LoadingScreenAlignmentX arg1, LoadingScreenAlignmentY arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field8829 = arg5;
    }

    @ObfuscatedName("wk.z(Laet;B)Liz;")
    public static LoadingScreenSpriteConfig method12717(Packet arg0) {
        LoadingScreenSpriteConfig var1 = LoadingScreenSpriteConfig.method7324(arg0);
        int var2 = arg0.method15242();
        return new LoadingScreenRelated8_Sub1(var1.field2648, var1.field2651, var1.field2649, var1.field2650, var1.field2647, var2);
    }

    @ObfuscatedName("abh.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return LoadingScreenElementType.field2622;
    }
}
