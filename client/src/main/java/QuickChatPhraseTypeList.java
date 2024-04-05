import deob.ObfuscatedName;

@ObfuscatedName("vx")
public class QuickChatPhraseTypeList {

    @ObfuscatedName("vx.u")
    public final Js5 field6827;

    @ObfuscatedName("vx.j")
    public final Js5 field6826;

    @ObfuscatedName("vx.a")
    public int field6825 = 0;

    @ObfuscatedName("vx.s")
    public int field6832 = 0;

    @ObfuscatedName("vx.c")
    public final SoftLruHashTable field6829 = new SoftLruHashTable(64);

    @ObfuscatedName("vx.l")
    public QuickChatDynamicProvider field6830 = null;

    public QuickChatPhraseTypeList(Language arg0, Js5 arg1, Js5 arg2, QuickChatDynamicProvider arg3) {
        this.field6827 = arg1;
        this.field6826 = arg2;
        this.field6830 = arg3;
        if (this.field6827 != null) {
            this.field6825 = this.field6827.getGroupCapacity(1);
        }
        if (this.field6826 != null) {
            this.field6832 = this.field6826.getGroupCapacity(1);
        }
    }

    @ObfuscatedName("vx.u(II)Lajt;")
    public QuickChatPhraseType method12176(int arg0) {
        QuickChatPhraseType var2 = (QuickChatPhraseType) this.field6829.get((long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = this.field6826.fetchFile(1, arg0 & 0x7FFF);
        } else {
            var3 = this.field6827.fetchFile(1, arg0);
        }
        QuickChatPhraseType var4 = new QuickChatPhraseType();
        var4.field10394 = this;
        if (var3 != null) {
            var4.method16746(new Packet(var3));
        }
        if (arg0 >= 32768) {
            var4.method16754();
        }
        this.field6829.method7937(var4, (long) arg0);
        return var4;
    }

    @ObfuscatedName("vx.j(Lqz;[IJ)Ljava/lang/String;")
    public String method12175(QuickChatDynamicCommand arg0, int[] arg1, long arg2) {
        if (this.field6830 != null) {
            String var5 = this.field6830.method4638(arg0, arg1, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg2);
    }
}
