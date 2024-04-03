import deob.ObfuscatedName;

@ObfuscatedName("ig")
public class LoadingScreenClearConfig implements LoadingScreenElementConfig {

    @ObfuscatedName("ig.u")
    public final int field2590;

    public LoadingScreenClearConfig(int arg0) {
        this.field2590 = arg0;
    }

    @ObfuscatedName("tj.u(Laet;I)Lig;")
    public static LoadingScreenClearConfig method11849(Packet arg0) {
        int var1 = arg0.g4s();
        return new LoadingScreenClearConfig(var1);
    }

    @ObfuscatedName("ig.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return LoadingScreenElementType.field2623;
    }
}
