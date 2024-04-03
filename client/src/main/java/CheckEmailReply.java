import deob.ObfuscatedName;

@ObfuscatedName("tc")
public class CheckEmailReply implements SerializableEnum {

    @ObfuscatedName("tc.u")
    public static final CheckEmailReply field6457 = new CheckEmailReply(-2);

    @ObfuscatedName("tc.j")
    public static final CheckEmailReply field6453 = new CheckEmailReply(-3);

    @ObfuscatedName("tc.a")
    public static final CheckEmailReply field6454 = new CheckEmailReply(2);

    @ObfuscatedName("tc.s")
    public static final CheckEmailReply field6455 = new CheckEmailReply(3);

    @ObfuscatedName("tc.c")
    public static final CheckEmailReply field6456 = new CheckEmailReply(21);

    @ObfuscatedName("tc.m")
    public static final CheckEmailReply field6452 = new CheckEmailReply(20);

    @ObfuscatedName("tc.t")
    public final int field6458;

    @ObfuscatedName("qz.u(I)[Ltc;")
    public static CheckEmailReply[] method8272() {
        return new CheckEmailReply[]{field6453, field6454, field6455, field6452, field6457, field6456};
    }

    public CheckEmailReply(int arg0) {
        this.field6458 = arg0;
    }

    @ObfuscatedName("tc.j(B)I")
    public int method6339() {
        return this.field6458;
    }
}
