import deob.ObfuscatedName;

@ObfuscatedName("kp")
public class Trig1 {

    @ObfuscatedName("kp.b")
    public static final int[] sin = new int[16384];

    @ObfuscatedName("kp.x")
    public static final int[] cos = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            sin[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            cos[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }

    public Trig1() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kp.u(I)F")
    public static float method5096(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
    }
}
