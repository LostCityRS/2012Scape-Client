import deob.ObfuscatedName;

@ObfuscatedName("gk")
public class LoadingScreenNewsDisplay implements LoadingScreenElement {

    @ObfuscatedName("gk.u")
    public final LoadingScreenNewsDisplayConfig field2306;

    @ObfuscatedName("gk.j")
    public final LoadingScreenNewsManager field2307;

    public LoadingScreenNewsDisplay(LoadingScreenNewsManager arg0, LoadingScreenNewsDisplayConfig arg1) {
        this.field2306 = arg1;
        this.field2307 = arg0;
    }

    @ObfuscatedName("gk.a(I)Z")
    public boolean method3931() {
        return this.field2307.method3992();
    }

    @ObfuscatedName("gk.u(B)V")
    public void method3936() {
    }

    @ObfuscatedName("gk.j(ZI)V")
    public void method3932(boolean arg0) {
        LoadingScreenNewsEntry var2 = this.field2307.method3991(this.field2306.field2600);
        if (var2 == null) {
            return;
        }
        int var3 = this.field2306.field2599.method4586(this.field2306.field2598, client.field9067) + this.field2306.field2593;
        int var4 = this.field2306.field2592.method4574(this.field2306.field2601, client.field9068) + this.field2306.field2594;
        if (this.field2306.field2597) {
            Statics.renderer.drawRectangle(var3, var4, this.field2306.field2598, this.field2306.field2601, this.field2306.field2591, 0);
        }
        int var5 = var4 + this.method3946(Statics.field670, var2.field2315, var3, var4, 5) * 12;
        int var8 = var5 + 8;
        if (this.field2306.field2597) {
            Statics.renderer.method825(var3, var8, this.field2306.field2598 + var3 - 1, var8, this.field2306.field2591, 0);
        }
        var5 = var8 + 1;
        int var6 = var5 + this.method3946(Statics.field670, var2.field2316, var3, var5, 5) * 12;
        int var9 = var6 + 5;
        int var10000 = var9 + this.method3946(Statics.field670, var2.field2317, var3, var9, 5) * 12;
    }

    @ObfuscatedName("gk.f(Ll;Ljava/lang/String;IIII)I")
    public int method3946(Font arg0, String arg1, int arg2, int arg3, int arg4) {
        return arg0.method836(arg1, arg2 + arg4, arg3 + arg4, this.field2306.field2598 - arg4 * 2, this.field2306.field2601 - arg4 * 2, this.field2306.field2595, this.field2306.field2596, 0, 0, 0, null, null, null, 0, 0);
    }

    public static final void add(ClientScriptState arg0, byte arg1) {
        arg0.field5216 -= 2;
        int var2 = arg0.field5215[arg0.field5216];
        int var3 = arg0.field5215[arg0.field5216 + 1];
        arg0.field5215[++arg0.field5216 - 1] = Statics.field3779.method12176(var2).field10393[var3];
    }
}
