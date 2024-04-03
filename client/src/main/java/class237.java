import deob.ObfuscatedName;

@ObfuscatedName("ha")
public class class237 {

    @ObfuscatedName("ha.u")
    public static final class237 field2495 = new class237(3, 0, 3, DataType.field1506);

    @ObfuscatedName("ha.j")
    public static final class237 field2480 = new class237(8, 1, 3, DataType.field1506);

    @ObfuscatedName("ha.a")
    public static final class237 field2488 = new class237(0, 2, 4, DataType.field1501);

    @ObfuscatedName("ha.s")
    public static final class237 field2482 = new class237(10, 3, 1, DataType.field1506);

    @ObfuscatedName("ha.c")
    public static final class237 field2483 = new class237(5, 4, 2, DataType.field1506);

    @ObfuscatedName("ha.m")
    public static final class237 field2484 = new class237(7, 5, 3, DataType.field1506);

    @ObfuscatedName("ha.t")
    public static final class237 field2485 = new class237(4, 6, 4, DataType.field1506);

    @ObfuscatedName("ha.l")
    public static final class237 field2479 = new class237(11, 7, 4, DataType.field1506);

    @ObfuscatedName("ha.f")
    public static final class237 field2487 = new class237(6, 8, 4, DataType.field1506);

    @ObfuscatedName("ha.d")
    public static final class237 field2481 = new class237(9, 9, 4, DataType.field1506);

    @ObfuscatedName("ha.z")
    public static final class237 field2489 = new class237(1, 10, 3, DataType.field1506);

    @ObfuscatedName("ha.n")
    public static final class237 field2490 = new class237(2, 11, 3, DataType.field1506);

    @ObfuscatedName("ha.o")
    public final int field2491;

    @ObfuscatedName("ha.p")
    public static final int field2496 = IntMath.method2540(16);

    @ObfuscatedName("ha.w")
    public final int field2494;

    @ObfuscatedName("ha.b")
    public final int field2486;

    @ObfuscatedName("ha.x")
    public final int field2497;

    @ObfuscatedName("ha.i")
    public final DataType field2493;

    public class237(int arg0, int arg1, int arg2, DataType arg3) {
        this.field2491 = arg0;
        this.field2494 = arg1;
        this.field2497 = arg2;
        this.field2493 = arg3;
        this.field2486 = this.field2493.field1508 * this.field2497;
        if (this.field2494 >= 16) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ha.u(I)Lha;")
    public static class237 method4406(int arg0) {
        switch (arg0) {
            case 0:
                return field2495;
            case 1:
                return field2480;
            case 2:
                return field2488;
            case 3:
                return field2482;
            case 4:
                return field2483;
            case 5:
                return field2484;
            case 6:
                return field2485;
            default:
                return null;
        }
    }
}
