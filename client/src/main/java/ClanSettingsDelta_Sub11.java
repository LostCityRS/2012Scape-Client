import deob.ObfuscatedName;

@ObfuscatedName("aix")
public class ClanSettingsDelta_Sub11 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("aix.s")
    public int field10195;

    @ObfuscatedName("aix.c")
    public String field10194;

    public ClanSettingsDelta_Sub11(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("aix.u(Laet;I)V")
    public void method14956(Packet arg0) {
        this.field10195 = arg0.g4();
        this.field10194 = arg0.gjstr();
    }

    @ObfuscatedName("aix.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.method4057(this.field10195, this.field10194);
    }
}
