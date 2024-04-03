import deob.ObfuscatedName;

@ObfuscatedName("fz")
public class CameraProjectionMode {

    @ObfuscatedName("fz.u")
    public static final CameraProjectionMode field2205 = new CameraProjectionMode(0);

    @ObfuscatedName("fz.j")
    public static final CameraProjectionMode field2206 = new CameraProjectionMode(1);

    @ObfuscatedName("fz.a")
    public static final CameraProjectionMode field2207 = new CameraProjectionMode(2);

    @ObfuscatedName("fz.s")
    public int field2208;

    public CameraProjectionMode(int arg0) {
        this.field2208 = arg0;
    }

    @ObfuscatedName("re.u(II)Lfz;")
    public static CameraProjectionMode method8664(int arg0) {
        if (field2205.field2208 == arg0) {
            return field2205;
        } else if (field2206.field2208 == arg0) {
            return field2206;
        } else if (field2207.field2208 == arg0) {
            return field2207;
        } else {
            return null;
        }
    }
}
