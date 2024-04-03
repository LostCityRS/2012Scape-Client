import deob.ObfuscatedName;

@ObfuscatedName("zr")
public class CutsceneAction_Sub16 extends CutsceneAction {

    @ObfuscatedName("zr.j")
    public int field8478;

    @ObfuscatedName("zr.a")
    public final String field8480;

    @ObfuscatedName("zr.s")
    public final int field8479;

    @ObfuscatedName("zr.c")
    public final int field8477;

    public CutsceneAction_Sub16(Packet arg0) {
        super(arg0);
        this.field8478 = arg0.g2();
        this.field8480 = arg0.gjstr();
        this.field8479 = arg0.g4s();
        this.field8477 = arg0.g2();
    }

    @ObfuscatedName("zr.j(I)V")
    public void method2873() {
        Statics.field1537[this.field8478].method2854().method13998(this.field8480, this.field8479, 0, this.field8477);
    }
}
