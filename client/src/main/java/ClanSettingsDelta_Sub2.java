import deob.ObfuscatedName;

@ObfuscatedName("aim")
public class ClanSettingsDelta_Sub2 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("aim.s")
    public long field10180;

    @ObfuscatedName("aim.c")
    public String field10181;

    public ClanSettingsDelta_Sub2(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
        this.field10180 = -1L;
        this.field10181 = null;
    }

    @ObfuscatedName("aim.u(Laet;I)V")
    public void method14956(Packet arg0) {
        if (arg0.g1() != 255) {
            arg0.pos--;
            this.field10180 = arg0.g8();
        }
        this.field10181 = arg0.fastgstr();
    }

    @ObfuscatedName("aim.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.method4070(this.field10180, this.field10181, 0);
    }
}
