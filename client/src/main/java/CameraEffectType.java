import deob.ObfuscatedName;

@ObfuscatedName("fc")
public class CameraEffectType {

    @ObfuscatedName("fc.u")
    public static final CameraEffectType field2122 = new CameraEffectType(0);

    @ObfuscatedName("fc.j")
    public static final CameraEffectType field2120 = new CameraEffectType(1);

    @ObfuscatedName("fc.a")
    public final int field2121;

    public CameraEffectType(int arg0) {
        this.field2121 = arg0;
    }

    @ObfuscatedName("pv.u(II)Lfc;")
    public static CameraEffectType method7654(int arg0) {
        if (field2122.field2121 == arg0) {
            return field2122;
        } else if (field2120.field2121 == arg0) {
            return field2120;
        } else {
            return null;
        }
    }
}
