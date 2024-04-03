import deob.ObfuscatedName;

@ObfuscatedName("aga")
public class LookatPoint extends Lookat {

    @ObfuscatedName("aga.j")
    public final Vector3 field9883 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

    @ObfuscatedName("aga.a")
    public final Vector3 field9882 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

    @ObfuscatedName("aga.s")
    public final Vector3 field9884 = new Vector3();

    public LookatPoint(Camera arg0) {
        super(arg0);
    }

    @ObfuscatedName("aga.b(Ladu;I)V")
    public void method15915(CoordFine arg0) {
        this.field9882.field3475 = arg0.field9594;
        this.field9882.field3476 = arg0.field9597;
        this.field9882.field3477 = arg0.field9598;
        if (Float.isNaN(this.field9883.field3475)) {
            this.field9883.method5334(this.field9882);
            this.field9884.method5370();
        }
    }

    @ObfuscatedName("aga.u(FB)V")
    public void method11540(float arg0) {
        this.field6645.method3811(false, arg0, this.field9883, this.field6645.method3726(), this.field9882, this.field9884);
    }

    @ObfuscatedName("aga.j(I)Z")
    public boolean method11541() {
        return !Float.isNaN(this.field9883.field3475);
    }

    @ObfuscatedName("aga.s(Lfi;Lkc;III)V")
    public void method11543(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3) {
        Vector3 var5 = Vector3.method5290(this.field6645.method3720());
        var5.field3475 -= arg2;
        var5.field3477 -= arg3;
        var5.field3476 *= -1.0F;
        Vector3 var6 = Vector3.method5290(this.field9883);
        var6.field3475 -= arg2;
        var6.field3477 -= arg3;
        var6.field3476 *= -1.0F;
        arg1.method5103(var5.field3475, var5.field3476, var5.field3477, var6.field3475, var6.field3476, var6.field3477, 0.0F, 1.0F, 0.0F);
        var5.method5291();
        var6.method5291();
    }

    @ObfuscatedName("aga.a(S)Lko;")
    public Vector3 method11550() {
        return Vector3.method5290(this.field9883);
    }

    @ObfuscatedName("aga.c(Laet;I)V")
    public void method11542(Packet arg0) {
        this.field9882.method5292(arg0);
    }
}
