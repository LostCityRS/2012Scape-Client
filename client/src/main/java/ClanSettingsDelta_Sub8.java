import deob.ObfuscatedName;

@ObfuscatedName("aia")
public class ClanSettingsDelta_Sub8 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("aia.s")
    public int field10193;

    @ObfuscatedName("aia.c")
    public int field10190;

    @ObfuscatedName("aia.m")
    public int field10191;

    @ObfuscatedName("aia.t")
    public int field10192;

    public ClanSettingsDelta_Sub8(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
        this.field10193 = -1;
    }

    @ObfuscatedName("aia.u(Laet;I)V")
    public void method14956(Packet arg0) {
        this.field10193 = arg0.method15239();
        this.field10190 = arg0.method15379();
        this.field10191 = arg0.method15220();
        this.field10192 = arg0.method15220();
    }

    @ObfuscatedName("aia.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.method4053(this.field10193, this.field10190, this.field10191, this.field10192);
    }
}
