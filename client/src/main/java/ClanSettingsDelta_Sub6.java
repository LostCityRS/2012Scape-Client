import deob.ObfuscatedName;

@ObfuscatedName("aic")
public class ClanSettingsDelta_Sub6 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("aic.s")
    public int field10189;

    public ClanSettingsDelta_Sub6(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
        this.field10189 = -1;
    }

    @ObfuscatedName("aic.u(Laet;I)V")
    public void method14956(Packet arg0) {
        this.field10189 = arg0.g2();
    }

    @ObfuscatedName("aic.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.method4049(this.field10189);
    }
}
