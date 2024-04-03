import deob.ObfuscatedName;

@ObfuscatedName("ait")
public class ClanSettingsDelta_Sub9 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("ait.s")
    public int field10206;

    @ObfuscatedName("ait.c")
    public int field10205;

    public ClanSettingsDelta_Sub9(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("ait.u(Laet;I)V")
    public void method14956(Packet arg0) {
        this.field10206 = arg0.g4s();
        this.field10205 = arg0.g4s();
    }

    @ObfuscatedName("ait.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.method4060(this.field10206, this.field10205);
    }
}
