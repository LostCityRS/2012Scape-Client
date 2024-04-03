import deob.ObfuscatedName;

@ObfuscatedName("ib")
public class LoadingScreenRelated2_Sub1 implements LoadingScreenElementConfig {

    @ObfuscatedName("ib.u")
    public final int field2630;

    public LoadingScreenRelated2_Sub1(int arg0) {
        this.field2630 = arg0;
    }

    @ObfuscatedName("fr.u(Laet;I)Lib;")
    public static LoadingScreenRelated2_Sub1 method3522(Packet arg0) {
        int var1 = arg0.gSmart2or4null();
        return new LoadingScreenRelated2_Sub1(var1);
    }

    @ObfuscatedName("ib.j(I)Lio;")
    public LoadingScreenElementType method4543() {
        return LoadingScreenElementType.field2627;
    }
}
