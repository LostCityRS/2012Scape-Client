import deob.ObfuscatedName;

@ObfuscatedName("fh")
public class CameraControlMode {

    @ObfuscatedName("fh.u")
    public static final CameraControlMode field2202 = new CameraControlMode(0);

    @ObfuscatedName("fh.j")
    public static final CameraControlMode field2203 = new CameraControlMode(1);

    @ObfuscatedName("fh.a")
    public int field2201;

    public CameraControlMode(int arg0) {
        this.field2201 = arg0;
    }

    @ObfuscatedName("p.u(II)Lfh;")
    public static CameraControlMode method1411(int arg0) {
        if (field2202.field2201 == arg0) {
            return field2202;
        } else if (field2203.field2201 == arg0) {
            return field2203;
        } else {
            return null;
        }
    }
}
