import deob.ObfuscatedName;

@ObfuscatedName("gd")
public class ClanChannelDelta {

    @ObfuscatedName("gd.u")
    public long field2393;

    @ObfuscatedName("gd.j")
    public long field2392 = -1L;

    @ObfuscatedName("gd.a")
    public IterableQueue field2394 = new IterableQueue();

    public ClanChannelDelta(Packet arg0) {
        this.method4116(arg0);
    }

    @ObfuscatedName("gd.u(Laet;I)V")
    public void method4116(Packet arg0) {
        this.field2393 = arg0.g8();
        this.field2392 = arg0.g8();
        for (int var2 = arg0.g1(); var2 != 0; var2 = arg0.g1()) {
            ClanChannelDeltaEntry var3;
            if (var2 == 1) {
                var3 = new ClanChannelDelta_Sub1(this);
            } else if (var2 == 4) {
                var3 = new ClanChannelDelta_Sub2(this);
            } else if (var2 == 3) {
                var3 = new ClanChannelDelta_Sub3(this);
            } else if (var2 == 2) {
                var3 = new ClanChannelDelta_Sub4(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method14985(arg0);
            this.field2394.addTail(var3);
        }
    }

    @ObfuscatedName("gd.j(Ladh;B)V")
    public void method4115(ClanChannel arg0) {
        if (this.field2393 != arg0.field4228 || this.field2392 != arg0.field9435) {
            throw new RuntimeException("");
        }
        for (ClanChannelDeltaEntry var2 = (ClanChannelDeltaEntry) this.field2394.head(); var2 != null; var2 = (ClanChannelDeltaEntry) this.field2394.next()) {
            var2.method14986(arg0);
        }
        arg0.field9435++;
    }
}
