import deob.ObfuscatedName;

@ObfuscatedName("aab")
public class CutsceneAction_Sub9 extends CutsceneAction {

    @ObfuscatedName("aab.j")
    public final int field8534;

    @ObfuscatedName("aab.a")
    public final int field8532;

    @ObfuscatedName("aab.s")
    public final int field8536;

    @ObfuscatedName("aab.c")
    public final int field8535;

    @ObfuscatedName("aab.m")
    public SynthSound field8533;

    public CutsceneAction_Sub9(Packet arg0) {
        super(arg0);
        this.field8534 = arg0.method15239();
        this.field8532 = arg0.method15220();
        this.field8536 = arg0.method15220();
        this.field8535 = arg0.method15220();
    }

    @ObfuscatedName("aab.j(I)V")
    public void method2873() {
        this.field8533 = SoundPlayer.method14082(this.field8534, this.field8535, 0, this.field8532, this.field8536);
    }

    @ObfuscatedName("aab.a(B)V")
    public void method2874() {
        if (this.field8533 != null) {
            Statics.method15704(this.field8533);
            this.field8533 = null;
        }
    }
}
