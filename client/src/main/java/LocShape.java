import deob.ObfuscatedName;

@ObfuscatedName("tn")
public class LocShape implements SerializableEnum {

    @ObfuscatedName("tn.u")
    public static final LocShape field6591 = new LocShape(0, 0);

    @ObfuscatedName("tn.j")
    public static final LocShape field6575 = new LocShape(1, 0);

    @ObfuscatedName("tn.a")
    public static final LocShape field6569 = new LocShape(2, 0);

    @ObfuscatedName("tn.s")
    public static final LocShape field6570 = new LocShape(3, 0);

    @ObfuscatedName("tn.c")
    public static final LocShape field6567 = new LocShape(9, 2);

    @ObfuscatedName("tn.m")
    public static final LocShape field6577 = new LocShape(4, 1);

    @ObfuscatedName("tn.t")
    public static final LocShape field6573 = new LocShape(5, 1);

    @ObfuscatedName("tn.l")
    public static final LocShape field6574 = new LocShape(6, 1);

    @ObfuscatedName("tn.f")
    public static final LocShape field6581 = new LocShape(7, 1);

    @ObfuscatedName("tn.d")
    public static final LocShape field6576 = new LocShape(8, 1);

    @ObfuscatedName("tn.z")
    public static final LocShape field6578 = new LocShape(12, 2);

    @ObfuscatedName("tn.n")
    public static final LocShape field6568 = new LocShape(13, 2);

    @ObfuscatedName("tn.o")
    public static final LocShape field6579 = new LocShape(14, 2);

    @ObfuscatedName("tn.q")
    public static final LocShape field6580 = new LocShape(15, 2);

    @ObfuscatedName("tn.p")
    public static final LocShape field6587 = new LocShape(16, 2);

    @ObfuscatedName("tn.w")
    public static final LocShape field6571 = new LocShape(17, 2);

    @ObfuscatedName("tn.b")
    public static final LocShape field6583 = new LocShape(18, 2);

    @ObfuscatedName("tn.x")
    public static final LocShape field6584 = new LocShape(19, 2);

    @ObfuscatedName("tn.i")
    public static final LocShape field6585 = new LocShape(20, 2);

    @ObfuscatedName("tn.v")
    public static final LocShape field6586 = new LocShape(21, 2);

    @ObfuscatedName("tn.k")
    public static final LocShape field6572 = new LocShape(10, 2);

    @ObfuscatedName("tn.h")
    public static final LocShape field6588 = new LocShape(11, 2);

    @ObfuscatedName("tn.r")
    public static final LocShape field6589 = new LocShape(22, 3);

    @ObfuscatedName("tn.g")
    public final int field6590;

    @ObfuscatedName("tn.y")
    public final int field6582;

    @ObfuscatedName("ml.u(I)[Ltn;")
    public static LocShape[] method6247() {
        return new LocShape[]{field6574, field6580, field6584, field6589, field6572, field6578, field6583, field6571, field6569, field6573, field6575, field6585, field6579, field6567, field6576, field6588, field6591, field6586, field6577, field6581, field6568, field6587, field6570};
    }

    public LocShape(int arg0, int arg1) {
        this.field6590 = arg0;
        this.field6582 = arg1;
    }

    @ObfuscatedName("tn.j(B)I")
    public int method6339() {
        return this.field6590;
    }

    @ObfuscatedName("dp.a(II)Z")
    public static boolean method2616(int arg0) {
        return arg0 >= field6591.field6590 && arg0 <= field6570.field6590 || field6567.field6590 == arg0;
    }

    @ObfuscatedName("ex.m(IB)Z")
    public static boolean method3309(int arg0) {
        return arg0 >= field6577.field6590 && arg0 <= field6576.field6590;
    }

    @ObfuscatedName("sk.t(II)Z")
    public static boolean method11327(int arg0) {
        return arg0 >= field6578.field6590 && arg0 <= field6571.field6590;
    }

    @ObfuscatedName("tf.l(II)Z")
    public static boolean method11666(int arg0) {
        return arg0 >= field6583.field6590 && arg0 <= field6586.field6590;
    }
}
