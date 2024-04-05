import deob.ObfuscatedName;

@ObfuscatedName("gs")
public class ClanSettingsDelta {

    @ObfuscatedName("gs.u")
    public long field2379;

    @ObfuscatedName("gs.j")
    public int field2375 = -1;

    @ObfuscatedName("gs.a")
    public LinkedList field2376 = new LinkedList();

    public ClanSettingsDelta(Packet arg0) {
        this.method4110(arg0);
    }

    @ObfuscatedName("gs.u(Laet;B)V")
    public void method4110(Packet arg0) {
        this.field2379 = arg0.g8();
        this.field2375 = arg0.g4s();
        for (int var2 = arg0.g1(); var2 != 0; var2 = arg0.g1()) {
            ClanSettingsDeltaEntry var3;
            if (var2 == 3) {
                var3 = new ClanSettingsDelta_Sub1(this);
            } else if (var2 == 1) {
                var3 = new ClanSettingsDelta_Sub2(this);
            } else if (var2 == 13) {
                var3 = new ClanSettingsDelta_Sub3(this);
            } else if (var2 == 4) {
                var3 = new ClanSettingsDelta_Sub4(this);
            } else if (var2 == 6) {
                var3 = new ClanSettingsDelta_Sub5(this);
            } else if (var2 == 5) {
                var3 = new ClanSettingsDelta_Sub6(this);
            } else if (var2 == 2) {
                var3 = new ClanSettingsDelta_Sub7(this);
            } else if (var2 == 7) {
                var3 = new ClanSettingsDelta_Sub8(this);
            } else if (var2 == 8) {
                var3 = new ClanSettingsDelta_Sub9(this);
            } else if (var2 == 9) {
                var3 = new ClanSettingsDelta_Sub10(this);
            } else if (var2 == 10) {
                var3 = new ClanSettingsDelta_Sub11(this);
            } else if (var2 == 11) {
                var3 = new ClanSettingsDelta_Sub12(this);
            } else if (var2 == 12) {
                var3 = new ClanSettingsDelta_Sub13(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method14956(arg0);
            this.field2376.addTail(var3);
        }
    }

    @ObfuscatedName("gs.j(Lga;I)V")
    public void method4109(ClanSettings arg0) {
        if (this.field2379 != arg0.field2347 || this.field2375 != arg0.field2348) {
            throw new RuntimeException("");
        }
        for (ClanSettingsDeltaEntry var2 = (ClanSettingsDeltaEntry) this.field2376.head(); var2 != null; var2 = (ClanSettingsDeltaEntry) this.field2376.next()) {
            var2.method14955(arg0);
        }
        arg0.field2348++;
    }
}
