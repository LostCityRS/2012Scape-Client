import deob.ObfuscatedName;

@ObfuscatedName("up")
public class PrivateChatFilter {

    @ObfuscatedName("up.u")
    public static final PrivateChatFilter field6696 = new PrivateChatFilter(0);

    @ObfuscatedName("up.j")
    public static final PrivateChatFilter field6697 = new PrivateChatFilter(1);

    @ObfuscatedName("up.a")
    public static final PrivateChatFilter field6698 = new PrivateChatFilter(2);

    @ObfuscatedName("up.s")
    public final int field6699;

    @ObfuscatedName("sl.u(I)[Lup;")
    public static PrivateChatFilter[] method11168() {
        return new PrivateChatFilter[]{field6698, field6696, field6697};
    }

    public PrivateChatFilter(int arg0) {
        this.field6699 = arg0;
    }

    @ObfuscatedName("ss.j(II)Lup;")
    public static PrivateChatFilter method11235(int arg0) {
        PrivateChatFilter[] var1 = method11168();
        for (int var2 = 0; var2 < var1.length; var2++) {
            PrivateChatFilter var3 = var1[var2];
            if (var3.field6699 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
