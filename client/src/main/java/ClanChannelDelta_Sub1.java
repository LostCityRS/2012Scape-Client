import deob.ObfuscatedName;

@ObfuscatedName("air")
public class ClanChannelDelta_Sub1 extends ClanChannelDeltaEntry {

    // $FF: synthetic field
    public final ClanChannelDelta this$0;

    @ObfuscatedName("air.s")
    public String field10223;

    @ObfuscatedName("air.c")
    public int field10221;

    @ObfuscatedName("air.m")
    public byte field10222;

    public ClanChannelDelta_Sub1(ClanChannelDelta arg0) {
        this.this$0 = arg0;
        this.field10223 = null;
    }

    @ObfuscatedName("air.u(Laet;B)V")
    public void method14985(Packet arg0) {
        if (arg0.g1() != 255) {
            arg0.pos--;
            arg0.g8();
        }
        this.field10223 = arg0.fastgstr();
        this.field10221 = arg0.g2();
        this.field10222 = arg0.g1b();
        arg0.g8();
    }

    @ObfuscatedName("air.j(Ladh;B)V")
    public void method14986(ClanChannel arg0) {
        ClanChannelUser var2 = new ClanChannelUser();
        var2.field2343 = this.field10223;
        var2.field2341 = this.field10221;
        var2.field2342 = this.field10222;
        arg0.method14981(var2);
    }
}
