import deob.ObfuscatedName;

@ObfuscatedName("aiz")
public class ClanSettingsDelta_Sub10 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("aiz.s")
    public int field10185;

    @ObfuscatedName("aiz.c")
    public long field10184;

    public ClanSettingsDelta_Sub10(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("aiz.u(Laet;I)V")
    public void method14956(Packet arg0) {
        this.field10185 = arg0.g4();
        this.field10184 = arg0.g8();
    }

    @ObfuscatedName("aiz.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.method4062(this.field10185, this.field10184);
    }
}
