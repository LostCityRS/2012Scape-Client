import deob.ObfuscatedName;

@ObfuscatedName("aja")
public abstract class CameraEffect extends SecondaryNode {

    @ObfuscatedName("aja.t")
    public final int field10351;

    @ObfuscatedName("aet.u(ILfc;Laet;I)Laja;")
    public static CameraEffect method15441(int arg0, class179 arg1, Packet arg2) {
        if (class179.field2122 == arg1) {
            return new Shake(arg0, arg2);
        } else if (class179.field2120 == arg1) {
            return new ZTilt(arg0, arg2);
        } else {
            return null;
        }
    }

    public CameraEffect(int arg0) {
        this.field10351 = arg0;
    }

    @ObfuscatedName("aja.j(FI)V")
    public abstract void method16667(float arg0);

    @ObfuscatedName("aja.a(Lfi;Lkc;Lka;B)V")
    public abstract void method16668(Vector3i arg0, Matrix4x3 arg1, Matrix4x4 arg2);

    @ObfuscatedName("aja.s(Laet;I)V")
    public abstract void method16671(Packet arg0);
}
