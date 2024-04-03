import deob.ObfuscatedName;

@ObfuscatedName("oi")
public class SkyBoxType {

    @ObfuscatedName("oi.u")
    public int field4459 = -1;

    @ObfuscatedName("oi.j")
    public int field4458 = -1;

    @ObfuscatedName("oi.a")
    public int[] field4457;

    @ObfuscatedName("oi.s")
    public SkyBoxFillMode field4460 = SkyBoxFillMode.field4468;

    @ObfuscatedName("oi.c")
    public int field4461 = -1;

    @ObfuscatedName("oi.u(Laet;B)V")
    public void method7354(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method7355(arg0, var2);
        }
    }

    @ObfuscatedName("oi.j(Laet;II)V")
    public void method7355(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field4459 = arg0.g2();
        } else if (arg1 == 2) {
            this.field4457 = new int[arg0.g1()];
            for (int var3 = 0; var3 < this.field4457.length; var3++) {
                this.field4457[var3] = arg0.g2();
            }
        } else if (arg1 == 3) {
            this.field4458 = arg0.g1();
        } else if (arg1 == 4) {
            this.field4460 = (SkyBoxFillMode) SerializableEnums.decode(Statics.method14028(), arg0.g1());
        } else if (arg1 == 5) {
            this.field4461 = arg0.gSmart2or4null();
        }
    }
}
