import deob.ObfuscatedName;

@ObfuscatedName("aaq")
public class PositionPoint extends Position {

    @ObfuscatedName("aaq.j")
    public int field8731;

    @ObfuscatedName("aaq.a")
    public final Vector3 field8730 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

    @ObfuscatedName("aaq.s")
    public final Vector3 field8732 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

    @ObfuscatedName("aaq.c")
    public final Vector3 field8733 = new Vector3();

    public PositionPoint(Camera arg0) {
        super(arg0);
    }

    @ObfuscatedName("aaq.i(Ladu;I)V")
    public void method14091(CoordFine arg0) {
        this.field8732.x = arg0.field9594;
        this.field8732.field3476 = arg0.field9597;
        this.field8732.z = arg0.field9598;
        if (Float.isNaN(this.field8730.x)) {
            this.field8730.method5334(this.field8732);
            this.field8733.method5370();
        }
        this.field8731 = arg0.field9595;
    }

    @ObfuscatedName("aaq.u(FLmv;[[[IB)V")
    public void method4014(float arg0, CollisionMap arg1, int[][][] arg2) {
        this.field2340.method3811(true, arg0, this.field8730, this.field2340.method3726(), this.field8732, this.field8733);
    }

    @ObfuscatedName("aaq.j(B)Z")
    public boolean method4030() {
        return !Float.isNaN(this.field8730.x);
    }

    @ObfuscatedName("aaq.a(I)Lko;")
    public Vector3 method4016() {
        return Vector3.create(this.field8730);
    }

    @ObfuscatedName("aaq.s(B)Ladu;")
    public CoordFine method4017() {
        return new CoordFine(this.field8731, (int) this.field8730.x, (int) this.field8730.field3476, (int) this.field8730.z);
    }

    @ObfuscatedName("aaq.c(Lfi;III)V")
    public void method4029(Vector3i arg0, int arg1, int arg2) {
        arg0.field2212 = (int) this.field8730.x - arg1;
        arg0.field2211 = (int) -this.field8730.field3476;
        arg0.field2213 = (int) this.field8730.z - arg2;
    }

    @ObfuscatedName("aaq.m(Laet;B)V")
    public void method4018(Packet arg0) {
        this.field8732.method5292(arg0);
    }
}
