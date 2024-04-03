import deob.ObfuscatedName;

@ObfuscatedName("kx")
public class ScaleRotTrans {

    @ObfuscatedName("kx.u")
    public Quaternion field3463 = new Quaternion();

    @ObfuscatedName("kx.j")
    public Vector3 trans = new Vector3();

    public ScaleRotTrans() {
    }

    public ScaleRotTrans(ScaleRotTrans arg0) {
        this.method5191(arg0);
    }

    @ObfuscatedName("kx.u(Lkx;)V")
    public void method5191(ScaleRotTrans arg0) {
        this.field3463.method5214(arg0.field3463);
        this.trans.method5334(arg0.trans);
    }

    @ObfuscatedName("kx.j()V")
    public final void method5192() {
        this.field3463.method5220();
        this.trans.method5329();
        this.trans.method5318(this.field3463);
    }

    @ObfuscatedName("kx.a(Lkx;)V")
    public final void method5190(ScaleRotTrans arg0) {
        this.field3463.method5266(arg0.field3463);
        this.trans.method5318(arg0.field3463);
        this.trans.method5299(arg0.trans);
    }

    public String toString() {
        return "[" + this.field3463.toString() + "|" + this.trans.toString() + "]";
    }
}
