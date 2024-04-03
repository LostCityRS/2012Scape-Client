import deob.ObfuscatedName;

@ObfuscatedName("aiy")
public class ClanChannelDelta_Sub2 extends ClanChannelDeltaEntry {

    // $FF: synthetic field
    public final ClanChannelDelta this$0;

    @ObfuscatedName("aiy.s")
    public String field10220;

    @ObfuscatedName("aiy.c")
    public byte field10218;

    @ObfuscatedName("aiy.m")
    public byte field10219;

    public ClanChannelDelta_Sub2(ClanChannelDelta arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("aiy.u(Laet;B)V")
    public void method14985(Packet arg0) {
        this.field10220 = arg0.method15219();
        if (this.field10220 != null) {
            arg0.method15220();
            this.field10218 = arg0.method15238();
            this.field10219 = arg0.method15238();
        }
    }

    @ObfuscatedName("aiy.j(Ladh;B)V")
    public void method14986(ClanChannel arg0) {
        arg0.field9427 = this.field10220;
        if (this.field10220 != null) {
            arg0.field9434 = this.field10218;
            arg0.field9432 = this.field10219;
        }
    }
}
