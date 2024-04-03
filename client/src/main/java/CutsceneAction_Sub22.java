import deob.ObfuscatedName;

@ObfuscatedName("zo")
public class CutsceneAction_Sub22 extends CutsceneAction {

    @ObfuscatedName("zo.j")
    public final int field8506;

    @ObfuscatedName("zo.a")
    public final int field8507;

    @ObfuscatedName("zo.s")
    public final String field8505;

    @ObfuscatedName("zo.c")
    public final int field8508;

    @ObfuscatedName("zo.m")
    public final int field8509;

    public CutsceneAction_Sub22(Packet arg0) {
        super(arg0);
        this.field8506 = arg0.method15239();
        this.field8507 = arg0.method15239();
        this.field8505 = arg0.method15337();
        this.field8508 = arg0.method15379();
        this.field8509 = arg0.method15239();
    }

    @ObfuscatedName("zo.j(I)V")
    public void method2873() {
        client.method6854(Statics.field7324, this.field8506, this.field8507, client.method8663(this.field8506, this.field8507, Statics.field7324), this.field8509, this.field8508, this.field8505);
    }
}
