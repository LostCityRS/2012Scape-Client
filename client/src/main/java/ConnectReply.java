import deob.ObfuscatedName;

@ObfuscatedName("ty")
public class ConnectReply implements SerializableEnum {

    @ObfuscatedName("ty.u")
    public static final ConnectReply field6427 = new ConnectReply(-1);

    @ObfuscatedName("ty.j")
    public static final ConnectReply field6425 = new ConnectReply(-2);

    @ObfuscatedName("ty.a")
    public static final ConnectReply field6432 = new ConnectReply(-3);

    @ObfuscatedName("ty.s")
    public static final ConnectReply field6429 = new ConnectReply(-4);

    @ObfuscatedName("ty.c")
    public static final ConnectReply field6428 = new ConnectReply(-5);

    @ObfuscatedName("ty.m")
    public static final ConnectReply field6424 = new ConnectReply(2);

    @ObfuscatedName("ty.t")
    public static final ConnectReply field6430 = new ConnectReply(3);

    @ObfuscatedName("ty.l")
    public static final ConnectReply field6431 = new ConnectReply(7);

    @ObfuscatedName("ty.f")
    public static final ConnectReply field6426 = new ConnectReply(9);

    @ObfuscatedName("ty.d")
    public static final ConnectReply field6433 = new ConnectReply(37);

    @ObfuscatedName("ty.z")
    public final int field6434;

    @ObfuscatedName("rz.u(S)[Lty;")
    public static ConnectReply[] method8658() {
        return new ConnectReply[]{field6432, field6425, field6433, field6426, field6431, field6427, field6430, field6428, field6424, field6429};
    }

    public ConnectReply(int arg0) {
        this.field6434 = arg0;
    }

    @ObfuscatedName("ty.j(B)I")
    public int getId() {
        return this.field6434;
    }
}
