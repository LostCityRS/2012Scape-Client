import deob.ObfuscatedName;

@ObfuscatedName("aar")
public class CutsceneAction_Sub10 extends CutsceneAction {

    @ObfuscatedName("aar.j")
    public final int field8525;

    @ObfuscatedName("aar.a")
    public final int field8526;

    public CutsceneAction_Sub10(Packet arg0) {
        super(arg0);
        this.field8525 = arg0.g2();
        this.field8526 = arg0.g4s();
    }

    @ObfuscatedName("aar.j(I)V")
    public void method2873() {
        client.field8992 = client.loopCycle;
        client.field8993 = client.loopCycle + this.field8525;
        Statics.field4666 = client.field8994;
        Statics.field6400 = client.field9147;
        Statics.field6565 = client.field8996;
        Statics.field2631 = client.field8997;
        client.field8994 = this.field8526 >>> 24;
        client.field9147 = this.field8526 >>> 16 & 0xFF;
        client.field8996 = this.field8526 >>> 8 & 0xFF;
        client.field8997 = this.field8526 & 0xFF;
    }
}
