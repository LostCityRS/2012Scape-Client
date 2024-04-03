import deob.ObfuscatedName;

@ObfuscatedName("zs")
public class CutsceneAction_Sub18 extends CutsceneAction {

    @ObfuscatedName("zs.j")
    public final int field8474;

    @ObfuscatedName("zs.a")
    public final int field8473;

    @ObfuscatedName("zs.s")
    public final int field8472;

    @ObfuscatedName("zs.c")
    public final int field8475;

    @ObfuscatedName("zs.m")
    public final int field8476;

    public CutsceneAction_Sub18(Packet arg0) {
        super(arg0);
        this.field8474 = arg0.g2();
        int var2 = arg0.g1();
        if ((var2 & 0x1) == 0) {
            this.field8473 = -1;
            this.field8472 = -1;
        } else {
            this.field8473 = arg0.g2();
            this.field8472 = arg0.g2();
        }
        if ((var2 & 0x2) == 0) {
            this.field8475 = -1;
            this.field8476 = -1;
        } else {
            this.field8475 = arg0.g2();
            this.field8476 = arg0.g2();
        }
        if ((var2 & 0x4) != 0) {
            int var3 = arg0.g2();
            int var4 = arg0.g2();
            int var5 = var3 * 255 / var4;
            if (var3 > 0 && var5 < 1) {
                boolean var6 = true;
            }
        }
    }

    @ObfuscatedName("zs.j(I)V")
    public void method2873() {
        PathingEntity var1 = Statics.field1537[this.field8474].method2854();
        var1.method13953(this.field8473, this.field8472, this.field8475, this.field8476, client.field9213, 0);
    }
}
