import deob.ObfuscatedName;

@ObfuscatedName("lt")
public class QuickChatCatTypeList {

    @ObfuscatedName("lt.u")
    public final Js5 field3704;

    @ObfuscatedName("lt.j")
    public final Js5 field3705;

    @ObfuscatedName("lt.a")
    public final SoftLruHashTable field3706 = new SoftLruHashTable(64);

    public QuickChatCatTypeList(Language arg0, Js5 arg1, Js5 arg2) {
        this.field3704 = arg1;
        this.field3705 = arg2;
        if (this.field3704 != null) {
            this.field3704.getGroupCapacity(0);
        }
        if (this.field3705 != null) {
            this.field3705.getGroupCapacity(0);
        }
    }

    @ObfuscatedName("lt.u(IB)Lajx;")
    public QuickChatCatType method5933(int arg0) {
        QuickChatCatType var2 = (QuickChatCatType) this.field3706.get((long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = this.field3705.fetchFile(0, arg0 & 0x7FFF);
        } else {
            var3 = this.field3704.fetchFile(0, arg0);
        }
        QuickChatCatType var4 = new QuickChatCatType();
        if (var3 != null) {
            var4.method16690(new Packet(var3));
        }
        if (arg0 >= 32768) {
            var4.method16694();
        }
        this.field3706.method7937(var4, (long) arg0);
        return var4;
    }
}
