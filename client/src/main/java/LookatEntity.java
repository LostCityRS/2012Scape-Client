import deob.ObfuscatedName;

@ObfuscatedName("agg")
public class LookatEntity extends Lookat {

    @ObfuscatedName("agg.j")
    public CameraTrackable field9887;

    @ObfuscatedName("agg.a")
    public final Vector3 field9888 = new Vector3();

    @ObfuscatedName("agg.s")
    public boolean field9892;

    @ObfuscatedName("agg.c")
    public final Vector3 field9890 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

    @ObfuscatedName("agg.m")
    public final Vector3 field9891 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

    @ObfuscatedName("agg.t")
    public final Vector3 field9889 = new Vector3();

    public LookatEntity(Camera arg0) {
        super(arg0);
    }

    @ObfuscatedName("agg.b(Lfs;Lko;ZI)V")
    public void method15927(CameraTrackable arg0, Vector3 arg1, boolean arg2) {
        this.field9887 = arg0;
        this.field9888.method5334(arg1);
        this.field9892 = arg2;
        arg0.method3684();
    }

    @ObfuscatedName("agg.u(FB)V")
    public void method11540(float arg0) {
        if (this.field9887 != null) {
            this.field9891.method5334(this.field9887.method3684().method15209());
            this.field6645.method3811(false, arg0, this.field9890, this.field6645.method3726(), this.field9891, this.field9889);
        }
    }

    @ObfuscatedName("agg.j(I)Z")
    public boolean method11541() {
        return !Float.isNaN(this.field9890.x);
    }

    @ObfuscatedName("agg.s(Lfi;Lkc;III)V")
    public void method11543(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3) {
        Vector3 var5 = Vector3.create(this.field6645.method3720());
        var5.x -= arg2;
        var5.z -= arg3;
        var5.field3476 *= -1.0F;
        Vector3 var6 = this.method11550();
        var6.x -= arg2;
        var6.z -= arg3;
        var6.field3476 *= -1.0F;
        arg1.method5103(var5.x, var5.field3476, var5.z, var6.x, var6.field3476, var6.z, 0.0F, 1.0F, 0.0F);
        var5.method5291();
        var6.method5291();
    }

    @ObfuscatedName("agg.a(S)Lko;")
    public Vector3 method11550() {
        Vector3 var1 = Vector3.create(this.field9890);
        Vector3 var2 = Vector3.create(this.field9888);
        if (this.field9892) {
            var2.method5318(this.field9887.method3680());
        }
        var1.method5299(var2);
        var2.method5291();
        return var1;
    }

    @ObfuscatedName("agg.c(Laet;I)V")
    public void method11542(Packet arg0) {
        CameraTrackableType var2 = CameraTrackableType.method4728(arg0.g1());
        int var3 = arg0.g2();
        this.field9887 = this.field6645.method3717().method1355(var2, var3);
        this.field9888.method5292(arg0);
        if (arg0.g1() == 1) {
            this.field9892 = true;
        } else {
            this.field9892 = false;
        }
    }
}
