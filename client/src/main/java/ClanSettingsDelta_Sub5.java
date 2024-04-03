import deob.ObfuscatedName;

@ObfuscatedName("ain")
public class ClanSettingsDelta_Sub5 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("ain.s")
    public int field10207;

    public ClanSettingsDelta_Sub5(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
        this.field10207 = -1;
    }

    @ObfuscatedName("ain.u(Laet;I)V")
    public void method14956(Packet arg0) {
        this.field10207 = arg0.method15239();
    }

    @ObfuscatedName("ain.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.method4063(this.field10207);
    }
}
