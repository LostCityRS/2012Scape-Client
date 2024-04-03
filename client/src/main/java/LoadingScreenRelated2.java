import deob.ObfuscatedName;

@ObfuscatedName("ge")
public class LoadingScreenRelated2 implements LoadingScreenElement {

    @ObfuscatedName("ge.u")
    public final LoadingScreenRelated2_Sub1 field2322;

    @ObfuscatedName("ge.j")
    public final Js5 field2321;

    @ObfuscatedName("ge.a")
    public Sprite field2323;

    public LoadingScreenRelated2(Js5 arg0, LoadingScreenRelated2_Sub1 arg1) {
        this.field2321 = arg0;
        this.field2322 = arg1;
    }

    @ObfuscatedName("ge.u(B)V")
    public void method3936() {
        this.field2323 = MainLoadingScreen.method1624(this.field2321, this.field2322.field2630);
    }

    @ObfuscatedName("ge.j(ZI)V")
    public void method3932(boolean arg0) {
        if (!arg0) {
            return;
        }
        int var2 = Statics.field4125 > client.field9067 ? Statics.field4125 : client.field9067;
        int var3 = Statics.field4677 > client.field9068 ? Statics.field4677 : client.field9068;
        int var4 = this.field2323.method1042();
        int var5 = this.field2323.method1047();
        int var6 = 0;
        int var7 = var2;
        int var8 = var2 * var5 / var4;
        int var9 = (var3 - var8) / 2;
        if (var8 > var3) {
            var9 = 0;
            var8 = var3;
            var7 = var3 * var4 / var5;
            var6 = (var2 - var7) / 2;
        }
        this.field2323.method2513(var6, var9, var7, var8);
    }

    @ObfuscatedName("ge.a(I)Z")
    public boolean method3931() {
        return this.field2321.method5630(this.field2322.field2630);
    }
}
