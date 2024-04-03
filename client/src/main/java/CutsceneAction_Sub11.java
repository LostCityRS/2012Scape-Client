import deob.ObfuscatedName;

@ObfuscatedName("zq")
public class CutsceneAction_Sub11 extends CutsceneAction {

    @ObfuscatedName("zq.j")
    public final int field8485;

    @ObfuscatedName("zq.a")
    public final int field8488;

    @ObfuscatedName("zq.s")
    public final int field8487;

    @ObfuscatedName("zq.c")
    public final int field8490;

    @ObfuscatedName("zq.m")
    public final int field8489;

    @ObfuscatedName("zq.t")
    public final int field8486;

    public CutsceneAction_Sub11(Packet arg0) {
        super(arg0);
        this.field8485 = arg0.g2();
        this.field8488 = arg0.g2();
        this.field8487 = arg0.g2();
        this.field8490 = arg0.g2();
        this.field8489 = arg0.g2();
        this.field8486 = arg0.g2();
    }

    @ObfuscatedName("zq.j(I)V")
    public void method2873() {
        Statics.field10534[this.field8485].method2821(0);
        Statics.field10534[this.field8488].method2821(1);
        client.cameraSplinePos = 0;
        client.cameraSplinePosOffset = this.field8487 * 4;
        client.cameraSplineRate = 0;
        client.cameraSplineStart = this.field8489;
        client.cameraSplineEnd = this.field8486;
        client.field9034 = 1;
        client.field8995 = this.field8490 * 4;
        Statics.cameraState = 1;
        client.method6648();
        client.field8989 = true;
    }
}
