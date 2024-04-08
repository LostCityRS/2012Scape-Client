import deob.ObfuscatedName;

@ObfuscatedName("mz")
public class CompassPoint implements SerializableEnum {

    @ObfuscatedName("mz.u")
    public static final CompassPoint field3909 = new CompassPoint(6, 0);

    @ObfuscatedName("mz.j")
    public static final CompassPoint field3915 = new CompassPoint(5, 1);

    @ObfuscatedName("mz.a")
    public static final CompassPoint field3910 = new CompassPoint(2, 2);

    @ObfuscatedName("mz.s")
    public static final CompassPoint field3914 = new CompassPoint(1, 3);

    @ObfuscatedName("mz.c")
    public static final CompassPoint field3912 = new CompassPoint(3, 4);

    @ObfuscatedName("mz.m")
    public static final CompassPoint field3913 = new CompassPoint(4, 5);

    @ObfuscatedName("mz.t")
    public static final CompassPoint field3911 = new CompassPoint(0, 6);

    @ObfuscatedName("mz.l")
    public static final CompassPoint field3908 = new CompassPoint(7, 7);

    @ObfuscatedName("gq.u(B)[Lmz;")
    public static CompassPoint[] values() {
        return new CompassPoint[]{field3908, field3915, field3912, field3914, field3909, field3910, field3913, field3911};
    }

    @ObfuscatedName("mz.f")
    public final int field3916;

    @ObfuscatedName("mz.d")
    public final int field3917;

    public CompassPoint(int arg0, int arg1) {
        this.field3916 = arg0;
        this.field3917 = arg1;
    }

    @ObfuscatedName("mz.j(B)I")
    public int getId() {
        return this.field3917;
    }

    @ObfuscatedName("mz.a(I)Lmz;")
    public CompassPoint method6342() {
        switch (this.field3916) {
            case 0:
                return field3910;
            case 1:
                return field3908;
            case 2:
                return field3911;
            case 3:
                return field3909;
            case 4:
                return field3915;
            case 5:
                return field3913;
            case 6:
                return field3912;
            case 7:
                return field3914;
            default:
                throw new IllegalStateException();
        }
    }
}
