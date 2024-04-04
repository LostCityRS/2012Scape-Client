import deob.ObfuscatedName;

@ObfuscatedName("aau")
public class LoadingScreenRelated5 extends LoadingScreenProgressDisplay {

    @ObfuscatedName("aau.t")
    public Sprite field8728;

    public LoadingScreenRelated5(Js5 arg0, Js5 arg1, LoadingScreenRelated5_Sub1 arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("aau.u(B)V")
    public void method3936() {
        super.method3936();
        this.field8728 = MainLoadingScreen.method1624(this.field2310, ((LoadingScreenRelated5_Sub1) this.field2311).field8826);
    }

    @ObfuscatedName("aau.d(ZIII)V")
    public void method3955(boolean arg0, int arg1, int arg2) {
        int var4 = this.method3956() * this.field2311.field2602 / 10000;
        int[] var5 = new int[4];
        Statics.renderer.qa(var5);
        Statics.renderer.r(arg1, arg2 + 2, arg1 + var4, this.field2311.field2607 + arg2);
        this.field8728.method2511(arg1, arg2 + 2, this.field2311.field2602, this.field2311.field2607);
        Statics.renderer.r(var5[0], var5[1], var5[2], var5[3]);
    }

    @ObfuscatedName("aau.f(ZIIS)V")
    public void method3957(boolean arg0, int arg1, int arg2) {
        Statics.renderer.drawRectangle(arg1 - 2, arg2, this.field2311.field2602 + 4, this.field2311.field2607 + 2, ((LoadingScreenRelated5_Sub1) this.field2311).field8825, 0);
        Statics.renderer.drawRectangle(arg1 - 1, arg2 + 1, this.field2311.field2602 + 2, this.field2311.field2607, 0, 0);
    }

    @ObfuscatedName("aau.a(I)Z")
    public boolean method3931() {
        return super.method3931() ? this.field2310.method5630(((LoadingScreenRelated5_Sub1) this.field2311).field8826) : false;
    }
}
