import deob.ObfuscatedName;

@ObfuscatedName("zk")
public class CutsceneAction_Sub4 extends CutsceneAction {

    @ObfuscatedName("zk.j")
    public final int field8503;

    @ObfuscatedName("zk.a")
    public final int field8501;

    @ObfuscatedName("zk.s")
    public final int field8502;

    @ObfuscatedName("zk.c")
    public final int field8500;

    @ObfuscatedName("zk.m")
    public final int field8504;

    public CutsceneAction_Sub4(Packet arg0) {
        super(arg0);
        this.field8503 = arg0.method15239();
        int var2 = arg0.method15379();
        this.field8501 = var2 >>> 16;
        this.field8502 = var2 & 0xFFFF;
        this.field8500 = arg0.method15220();
        this.field8504 = arg0.method15220();
    }

    @ObfuscatedName("zk.j(I)V")
    public void method2873() {
        Statics.field1528[this.field8503].method2835(this.field8500, this.field8501, this.field8502, this.field8504);
    }
}
