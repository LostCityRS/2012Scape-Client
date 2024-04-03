import deob.ObfuscatedName;

@ObfuscatedName("zx")
public class CutsceneAction_Sub8 extends CutsceneAction {

    @ObfuscatedName("zx.j")
    public final int field8510;

    @ObfuscatedName("zx.a")
    public final int field8511;

    @ObfuscatedName("zx.s")
    public SoundRelated14 field8512;

    public CutsceneAction_Sub8(Packet arg0) {
        super(arg0);
        this.field8510 = arg0.g2();
        this.field8511 = arg0.g1();
    }

    @ObfuscatedName("zx.j(I)V")
    public void method2873() {
        AudioRenderer.method4800(this.field8512, this.field8511);
    }

    @ObfuscatedName("zx.s(B)Z")
    public boolean method2883() {
        if (this.field8512 == null) {
            this.field8512 = new SoundRelated14(Statics.field9367, this.field8510);
        }
        return this.field8512.method2999();
    }
}
