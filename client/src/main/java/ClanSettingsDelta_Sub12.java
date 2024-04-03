import deob.ObfuscatedName;

@ObfuscatedName("aio")
public class ClanSettingsDelta_Sub12 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("aio.s")
    public int field10209;

    @ObfuscatedName("aio.c")
    public int field10210;

    @ObfuscatedName("aio.m")
    public int field10211;

    @ObfuscatedName("aio.t")
    public int field10212;

    public ClanSettingsDelta_Sub12(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("aio.u(Laet;I)V")
    public void method14956(Packet arg0) {
        this.field10209 = arg0.g4s();
        this.field10212 = arg0.g4s();
        this.field10210 = arg0.g1();
        this.field10211 = arg0.g1();
    }

    @ObfuscatedName("aio.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.method4040(this.field10209, this.field10212, this.field10210, this.field10211);
    }
}
