import deob.ObfuscatedName;

@ObfuscatedName("wx")
public class Namespace implements SerializableEnum {

    @ObfuscatedName("wx.u")
    public static final Namespace field7328 = new Namespace(0, 0, "", "");

    @ObfuscatedName("wx.j")
    public static final Namespace field7327 = new Namespace(7, 1, "", "");

    @ObfuscatedName("wx.a")
    public static final Namespace field7329 = new Namespace(6, 2, "", "");

    @ObfuscatedName("wx.s")
    public static final Namespace field7331 = new Namespace(5, 3, "", "");

    @ObfuscatedName("wx.c")
    public static final Namespace field7333 = new Namespace(3, 4, "", "");

    @ObfuscatedName("wx.m")
    public static final Namespace field7332 = new Namespace(2, 5, "", "");

    @ObfuscatedName("wx.t")
    public static final Namespace field7330 = new Namespace(1, 6, "", "");

    @ObfuscatedName("wx.l")
    public static final Namespace field7334 = new Namespace(4, -1, "", "", true, new Namespace[]{field7328, field7327, field7329, field7333, field7331});

    @ObfuscatedName("wx.f")
    public final int field7335;

    @ObfuscatedName("wx.d")
    public final int field7336;

    @ObfuscatedName("wx.z")
    public final String field7337;

    public Namespace(int arg0, int arg1, String arg2, String arg3) {
        this.field7335 = arg0;
        this.field7336 = arg1;
        this.field7337 = arg3;
    }

    public Namespace(int arg0, int arg1, String arg2, String arg3, boolean arg4, Namespace[] arg5) {
        this.field7335 = arg0;
        this.field7336 = arg1;
        this.field7337 = arg3;
    }

    @ObfuscatedName("wx.j(B)I")
    public int method6339() {
        return this.field7336;
    }

    public String toString() {
        return this.field7337;
    }
}
