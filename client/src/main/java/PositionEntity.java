import deob.ObfuscatedName;

@ObfuscatedName("aav")
public class PositionEntity extends Position {

    @ObfuscatedName("aav.j")
    public CameraTrackable field8741;

    @ObfuscatedName("aav.a")
    public final Vector3 field8736 = new Vector3();

    @ObfuscatedName("aav.s")
    public final Quaternion field8737 = new Quaternion();

    @ObfuscatedName("aav.c")
    public boolean field8738;

    @ObfuscatedName("aav.m")
    public int field8742 = 200;

    @ObfuscatedName("aav.t")
    public int field8740;

    @ObfuscatedName("aav.l")
    public final Vector3 field8739 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

    @ObfuscatedName("aav.f")
    public final Vector3 field8735 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

    @ObfuscatedName("aav.d")
    public final Vector3 field8743 = new Vector3();

    @ObfuscatedName("aav.z")
    public final Quaternion field8744 = new Quaternion();

    public PositionEntity(Camera arg0) {
        super(arg0);
    }

    @ObfuscatedName("aav.i(Lfs;Lko;Lkn;ZILmv;[[[IB)V")
    public void method14097(CameraTrackable arg0, Vector3 arg1, Quaternion arg2, boolean arg3, int arg4, CollisionMap arg5, int[][][] arg6) {
        this.field8741 = arg0;
        this.field8736.method5334(arg1);
        this.field8737.method5214(arg2);
        this.field8738 = arg3;
        this.field8742 = arg4;
        this.field8740 = this.field8741.method3684().field9595;
        this.method14099(arg5, arg6);
    }

    @ObfuscatedName("aav.u(FLmv;[[[IB)V")
    public void method4014(float arg0, CollisionMap arg1, int[][][] arg2) {
        if (this.field8741 == null) {
            return;
        }
        this.method14099(arg1, arg2);
        Quaternion var4 = this.method14098();
        this.field8744.method5231(var4, this.field2340.method3729());
        var4.method5209();
        this.field8735.method5334(this.field8741.method3684().method15209());
        this.field2340.method3811(true, arg0, this.field8739, this.field2340.method3726(), this.field8735, this.field8743);
    }

    @ObfuscatedName("aav.v(B)Lkn;")
    public Quaternion method14098() {
        Quaternion var1 = Quaternion.method5234(this.field8737);
        if (this.field8738) {
            Vector3 var2 = this.field8741.method3683();
            if (var2.method5338() < (float) this.field8742) {
                var2 = Vector3.method5294(0.0F, 0.0F, 1.0F);
                Quaternion var3 = this.field8741.method3680();
                var2.method5318(var3);
            }
            var2.field3476 = 0.0F;
            float var4 = (float) Math.atan2((double) var2.field3475, (double) var2.field3477);
            var2.method5291();
            Quaternion var5 = new Quaternion();
            var5.method5216(0.0F, 1.0F, 0.0F, var4);
            var1.method5266(var5);
        }
        return var1;
    }

    @ObfuscatedName("aav.k(Lmv;[[[IB)V")
    public void method14099(CollisionMap arg0, int[][][] arg1) {
        if (this.method4030() && (this.field2340.method3734() || this.field2340.method3765())) {
            Quaternion var3 = this.method14098();
            if (this.field2340.method3765() && arg1 != null) {
            }
            var3.method5209();
        }
    }

    @ObfuscatedName("aav.j(B)Z")
    public boolean method4030() {
        return !Float.isNaN(this.field8739.field3475);
    }

    @ObfuscatedName("aav.a(I)Lko;")
    public Vector3 method4016() {
        Vector3 var1 = Vector3.method5290(this.field8736);
        var1.method5318(this.field8744);
        Vector3 var2 = Vector3.method5301(this.field8739, var1);
        var1.method5291();
        return var2;
    }

    @ObfuscatedName("aav.s(B)Ladu;")
    public CoordFine method4017() {
        Vector3 var1 = this.method4016();
        CoordFine var2 = new CoordFine(this.field8740, (int) var1.field3475, (int) var1.field3476, (int) var1.field3477);
        var1.method5291();
        return var2;
    }

    @ObfuscatedName("aav.h(I)Lko;")
    public Vector3 method14100() {
        return this.field8739;
    }

    @ObfuscatedName("aav.r(I)Lko;")
    public Vector3 method14101() {
        return this.field8736;
    }

    @ObfuscatedName("aav.g(I)F")
    public float method14116() {
        return CameraHelpers.method7588(this.field8737);
    }

    @ObfuscatedName("aav.y(B)F")
    public float method14103() {
        return CameraHelpers.method1721(this.field8737);
    }

    @ObfuscatedName("aav.c(Lfi;III)V")
    public void method4029(Vector3i arg0, int arg1, int arg2) {
        Vector3 var4 = this.method4016();
        arg0.field2212 = (int) var4.field3475 - arg1;
        arg0.field2211 = (int) -var4.field3476;
        arg0.field2213 = (int) var4.field3477 - arg2;
        var4.method5291();
    }

    @ObfuscatedName("aav.m(Laet;B)V")
    public void method4018(Packet arg0) {
        CameraTrackableType var2 = CameraTrackableType.method4728(arg0.g1());
        int var3 = arg0.g2();
        this.field8736.method5292(arg0);
        this.field8737.method5245(arg0);
        if (arg0.g1() == 1) {
            this.field8738 = true;
        } else {
            this.field8738 = false;
        }
        this.field8742 = arg0.g2();
        this.field8741 = this.field2340.method3717().method1355(var2, var3);
    }
}
