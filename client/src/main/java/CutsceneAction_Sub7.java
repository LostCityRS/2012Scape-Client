import deob.ObfuscatedName;

@ObfuscatedName("ze")
public class CutsceneAction_Sub7 extends CutsceneAction {

    @ObfuscatedName("ze.j")
    public final int field8450;

    @ObfuscatedName("ze.a")
    public final int field8451;

    @ObfuscatedName("ze.s")
    public final int field8452;

    @ObfuscatedName("ze.c")
    public final int field8453;

    @ObfuscatedName("ze.m")
    public final int field8454;

    public CutsceneAction_Sub7(Packet arg0) {
        super(arg0);
        this.field8450 = arg0.method15239();
        this.field8451 = arg0.method15239();
        this.field8452 = arg0.method15239();
        this.field8453 = arg0.method15239();
        this.field8454 = arg0.method15239();
    }

    @ObfuscatedName("ze.j(I)V")
    public void method2873() {
        client.method8600(this.field8450, this.field8452, this.field8451, 100, 100, false);
        client.method8486(this.field8453, this.field8454, 0);
        client.field8989 = true;
    }
}
