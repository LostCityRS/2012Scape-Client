import deob.ObfuscatedName;

@ObfuscatedName("iz")
public class LoadingScreenSpriteConfig implements LoadingScreenElementConfig {

    @ObfuscatedName("iz.u")
    public final int field2648;

    @ObfuscatedName("iz.j")
    public final LoadingScreenAlignmentX field2651;

    @ObfuscatedName("iz.a")
    public final LoadingScreenAlignmentY field2649;

    @ObfuscatedName("iz.s")
    public final int field2650;

    @ObfuscatedName("iz.c")
    public final int field2647;

    public LoadingScreenSpriteConfig(int arg0, LoadingScreenAlignmentX arg1, LoadingScreenAlignmentY arg2, int arg3, int arg4) {
        this.field2648 = arg0;
        this.field2651 = arg1;
        this.field2649 = arg2;
        this.field2650 = arg3;
        this.field2647 = arg4;
    }

    @ObfuscatedName("oe.u(Laet;I)Liz;")
    public static LoadingScreenSpriteConfig method7324(Packet arg0) {
        int var1 = arg0.method15411();
        LoadingScreenAlignmentX var2 = LoadingScreenAlignmentX.method15177()[arg0.method15220()];
        LoadingScreenAlignmentY var3 = LoadingScreenAlignmentY.method3623()[arg0.method15220()];
        int var4 = arg0.method15240();
        int var5 = arg0.method15240();
        return new LoadingScreenSpriteConfig(var1, var2, var3, var4, var5);
    }

    @ObfuscatedName("iz.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return LoadingScreenElementType.field2624;
    }
}
