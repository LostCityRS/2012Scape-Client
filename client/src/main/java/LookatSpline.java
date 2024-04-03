import deob.ObfuscatedName;

@ObfuscatedName("agw")
public abstract class LookatSpline extends Lookat {

    @ObfuscatedName("agw.j")
    public Spline field9894;

    @ObfuscatedName("agw.a")
    public float field9895 = 0.0F;

    @ObfuscatedName("agw.s")
    public float field9893 = 0.0F;

    public LookatSpline(Camera arg0) {
        super(arg0);
    }

    @ObfuscatedName("agw.b(Lkz;IS)V")
    public void method15935(Spline arg0, int arg1) {
        this.field9894 = arg0;
        this.field9895 = 0.0F;
        this.field9893 = 0.0F;
    }

    @ObfuscatedName("agw.u(FB)V")
    public void method11540(float arg0) {
        float var2 = this.field9894.method5514();
        if (this.field9895 >= var2) {
            return;
        }
        this.field9893 = this.method15934(var2, this.field9893, arg0);
        this.field9895 += this.field9893;
        if (this.field9895 > var2) {
            this.field9895 = var2;
        }
    }

    @ObfuscatedName("agw.j(I)Z")
    public boolean method11541() {
        return this.field9894 != null;
    }

    @ObfuscatedName("agw.a(S)Lko;")
    public Vector3 method11550() {
        return Vector3.create(this.field9894.method5528(this.field9895));
    }

    @ObfuscatedName("agw.s(Lfi;Lkc;III)V")
    public void method11543(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3) {
        Vector3 var5 = Vector3.create(this.field6645.method3720());
        var5.x -= arg2;
        var5.z -= arg3;
        Vector3 var6 = Vector3.create(this.field9894.method5528(this.field9895));
        var6.x -= arg2;
        var6.z -= arg3;
        float var7 = this.field9894.method5518(this.field9895);
        Vector3 var8 = Vector3.method5377(var6, var5);
        var8.method5313();
        Quaternion var9 = new Quaternion();
        var9.method5215(var8, var7);
        Vector3 var10 = Vector3.method5294(0.0F, 1.0F, 0.0F);
        Vector3 var11 = Vector3.method5308(var8, var10);
        Vector3 var12 = Vector3.method5308(var11, var8);
        var12.method5318(var9);
        var5.y *= -1.0F;
        var6.y *= -1.0F;
        arg1.method5103(var5.x, var5.y, var5.z, var6.x, var6.y, var6.z, var12.x, var12.y, var12.z);
        var5.release();
        var6.release();
        var12.release();
    }

    @ObfuscatedName("agw.c(Laet;I)V")
    public void method11542(Packet arg0) {
        this.field9894 = new Spline(arg0);
        this.field9895 = 0.0F;
        this.field9893 = 0.0F;
    }

    @ObfuscatedName("agw.x(FFFI)F")
    public abstract float method15934(float arg0, float arg1, float arg2);
}
