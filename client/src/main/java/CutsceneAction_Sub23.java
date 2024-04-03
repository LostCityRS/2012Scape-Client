import deob.ObfuscatedName;

@ObfuscatedName("zn")
public class CutsceneAction_Sub23 extends CutsceneAction {

    @ObfuscatedName("zn.j")
    public final int field8457;

    @ObfuscatedName("zn.a")
    public final int field8456;

    public CutsceneAction_Sub23(Packet arg0) {
        super(arg0);
        this.field8457 = arg0.method15239();
        this.field8456 = arg0.method15239();
    }

    @ObfuscatedName("zn.j(I)V")
    public void method2873() {
        Statics.field1537[this.field8457].method2854().method13946(this.field8456, true);
    }
}
