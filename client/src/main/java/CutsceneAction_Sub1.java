import deob.ObfuscatedName;

@ObfuscatedName("zg")
public class CutsceneAction_Sub1 extends CutsceneAction {

    @ObfuscatedName("zg.j")
    public final int field8520;

    @ObfuscatedName("zg.a")
    public final int field8521;

    @ObfuscatedName("zg.s")
    public final int field8522;

    @ObfuscatedName("zg.c")
    public final int field8523;

    @ObfuscatedName("zg.m")
    public SynthSound field8524;

    public CutsceneAction_Sub1(Packet arg0) {
        super(arg0);
        this.field8520 = arg0.method15239();
        this.field8521 = arg0.method15220();
        this.field8522 = arg0.method15220();
        this.field8523 = arg0.method15220();
    }

    @ObfuscatedName("zg.j(I)V")
    public void method2873() {
        this.field8524 = SoundPlayer.method1717(this.field8520, this.field8523, 0, this.field8521, false, this.field8522);
    }

    @ObfuscatedName("zg.a(B)V")
    public void method2874() {
        if (this.field8524 != null) {
            Statics.method15704(this.field8524);
            this.field8524 = null;
        }
    }
}
