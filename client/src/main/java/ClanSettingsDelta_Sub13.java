import deob.ObfuscatedName;

@ObfuscatedName("aii")
public class ClanSettingsDelta_Sub13 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("aii.s")
    public String field10196;

    public ClanSettingsDelta_Sub13(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("aii.u(Laet;I)V")
    public void method14956(Packet arg0) {
        this.field10196 = arg0.gjstr();
        arg0.g4s();
    }

    @ObfuscatedName("aii.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.field2349 = this.field10196;
    }
}
