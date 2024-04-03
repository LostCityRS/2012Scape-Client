import deob.ObfuscatedName;

@ObfuscatedName("aie")
public class ClanSettingsDelta_Sub1 extends ClanSettingsDeltaEntry {

    // $FF: synthetic field
    public final ClanSettingsDelta this$0;

    @ObfuscatedName("aie.s")
    public long field10183;

    @ObfuscatedName("aie.c")
    public String field10182;

    public ClanSettingsDelta_Sub1(ClanSettingsDelta arg0) {
        this.this$0 = arg0;
        this.field10183 = -1L;
        this.field10182 = null;
    }

    @ObfuscatedName("aie.u(Laet;I)V")
    public void method14956(Packet arg0) {
        if (arg0.method15220() != 255) {
            arg0.field9626--;
            this.field10183 = arg0.method15246();
        }
        this.field10182 = arg0.method15219();
    }

    @ObfuscatedName("aie.j(Lga;B)V")
    public void method14955(ClanSettings arg0) {
        arg0.method4051(this.field10183, this.field10182);
    }
}
