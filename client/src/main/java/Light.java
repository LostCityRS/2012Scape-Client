import deob.ObfuscatedName;

@ObfuscatedName("acg")
public class Light extends Node {

    @ObfuscatedName("acg.s")
    public Vector3 field9369 = new Vector3();

    @ObfuscatedName("acg.c")
    public int field9370;

    @ObfuscatedName("acg.m")
    public int field9368;

    @ObfuscatedName("acg.t")
    public float field9371;

    public Light(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field9369.method5373((float) arg0, (float) arg1, (float) arg2);
        this.field9370 = arg3;
        this.field9368 = arg4;
        this.field9371 = arg5;
    }

    @ObfuscatedName("acg.u(B)I")
    public final int method14888() {
        return (int) this.field9369.x;
    }

    @ObfuscatedName("acg.j(I)I")
    public final int method14882() {
        return (int) this.field9369.y;
    }

    @ObfuscatedName("acg.a(I)I")
    public final int method14879() {
        return (int) this.field9369.z;
    }

    @ObfuscatedName("acg.s(I)I")
    public final int method14880() {
        return this.field9370;
    }

    @ObfuscatedName("acg.c(I)I")
    public final int method14881() {
        return this.field9368;
    }

    @ObfuscatedName("acg.m(B)F")
    public final float method14893() {
        return this.field9371;
    }

    @ObfuscatedName("acg.t(FI)V")
    public void method14883(float arg0) {
        this.field9371 = arg0;
    }

    @ObfuscatedName("acg.l(IIIB)V")
    public void method14884(int arg0, int arg1, int arg2) {
        this.field9369.method5373((float) arg0, (float) arg1, (float) arg2);
    }
}
