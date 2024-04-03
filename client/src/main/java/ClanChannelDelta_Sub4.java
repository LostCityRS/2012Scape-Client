import deob.ObfuscatedName;

@ObfuscatedName("aiw")
public class ClanChannelDelta_Sub4 extends ClanChannelDeltaEntry {

    // $FF: synthetic field
    public final ClanChannelDelta this$0;

    @ObfuscatedName("aiw.s")
    public int field10214;

    @ObfuscatedName("aiw.c")
    public byte field10213;

    @ObfuscatedName("aiw.m")
    public int field10215;

    @ObfuscatedName("aiw.t")
    public String field10216;

    public ClanChannelDelta_Sub4(ClanChannelDelta arg0) {
        this.this$0 = arg0;
        this.field10214 = -1;
    }

    @ObfuscatedName("aiw.u(Laet;B)V")
    public void method14985(Packet arg0) {
        this.field10214 = arg0.method15239();
        this.field10213 = arg0.method15238();
        this.field10215 = arg0.method15239();
        arg0.method15246();
        this.field10216 = arg0.method15337();
    }

    @ObfuscatedName("aiw.j(Ladh;B)V")
    public void method14986(ClanChannel arg0) {
        ClanChannelUser var2 = arg0.field9429[this.field10214];
        var2.field2342 = this.field10213;
        var2.field2341 = this.field10215;
        var2.field2343 = this.field10216;
    }
}
