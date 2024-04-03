import deob.ObfuscatedName;

@ObfuscatedName("aak")
public class CutsceneAction_Sub21 extends CutsceneAction {

    @ObfuscatedName("aak.j")
    public final int field8529;

    @ObfuscatedName("aak.a")
    public final int field8528;

    @ObfuscatedName("aak.s")
    public final int field8527;

    public CutsceneAction_Sub21(Packet arg0) {
        super(arg0);
        this.field8529 = arg0.g2();
        this.field8528 = arg0.g2();
        this.field8527 = arg0.g1();
    }

    @ObfuscatedName("aak.j(I)V")
    public void method2873() {
        CutsceneEntity var1 = Statics.field1537[this.field8529];
        CutsceneRoute var2 = Statics.field5181[this.field8528];
        var2.method2891(var1, this.field8527);
    }
}
