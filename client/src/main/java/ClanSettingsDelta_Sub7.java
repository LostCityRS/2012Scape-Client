import deob.ObfuscatedName;

@ObfuscatedName("ais")
public class ClanSettingsDelta_Sub7 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("ais.s")
    public int field10186;

    @ObfuscatedName("ais.c")
    public byte field10187;

    public ClanSettingsDelta_Sub7(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
        this.field10186 = -1;
    }

    @ObfuscatedName("ais.u(Laet;I)V")
    public void method14956(Packet arg0) {
        this.field10186 = arg0.g2();
        this.field10187 = arg0.g1b();
    }

    @ObfuscatedName("ais.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.method4052(this.field10186, this.field10187);
    }
}
