import deob.ObfuscatedName;

@ObfuscatedName("ha")
public class VertexDeclarationElementComponent {

    @ObfuscatedName("ha.u")
    public static final VertexDeclarationElementComponent field2495 = new VertexDeclarationElementComponent(3, 0, 3, DataType.field1506);

    @ObfuscatedName("ha.j")
    public static final VertexDeclarationElementComponent field2480 = new VertexDeclarationElementComponent(8, 1, 3, DataType.field1506);

    @ObfuscatedName("ha.a")
    public static final VertexDeclarationElementComponent field2488 = new VertexDeclarationElementComponent(0, 2, 4, DataType.field1501);

    @ObfuscatedName("ha.s")
    public static final VertexDeclarationElementComponent field2482 = new VertexDeclarationElementComponent(10, 3, 1, DataType.field1506);

    @ObfuscatedName("ha.c")
    public static final VertexDeclarationElementComponent field2483 = new VertexDeclarationElementComponent(5, 4, 2, DataType.field1506);

    @ObfuscatedName("ha.m")
    public static final VertexDeclarationElementComponent field2484 = new VertexDeclarationElementComponent(7, 5, 3, DataType.field1506);

    @ObfuscatedName("ha.t")
    public static final VertexDeclarationElementComponent field2485 = new VertexDeclarationElementComponent(4, 6, 4, DataType.field1506);

    @ObfuscatedName("ha.l")
    public static final VertexDeclarationElementComponent field2479 = new VertexDeclarationElementComponent(11, 7, 4, DataType.field1506);

    @ObfuscatedName("ha.f")
    public static final VertexDeclarationElementComponent field2487 = new VertexDeclarationElementComponent(6, 8, 4, DataType.field1506);

    @ObfuscatedName("ha.d")
    public static final VertexDeclarationElementComponent field2481 = new VertexDeclarationElementComponent(9, 9, 4, DataType.field1506);

    @ObfuscatedName("ha.z")
    public static final VertexDeclarationElementComponent field2489 = new VertexDeclarationElementComponent(1, 10, 3, DataType.field1506);

    @ObfuscatedName("ha.n")
    public static final VertexDeclarationElementComponent field2490 = new VertexDeclarationElementComponent(2, 11, 3, DataType.field1506);

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

    public VertexDeclarationElementComponent(int arg0, int arg1, int arg2, DataType arg3) {
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
    public static VertexDeclarationElementComponent method4406(int arg0) {
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
