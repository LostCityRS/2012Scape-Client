
import deob.ObfuscatedName;

@ObfuscatedName("zi")
public class CutsceneAction_Sub24 extends CutsceneAction {

	@ObfuscatedName("zi.j")
	public final int field8462;

	@ObfuscatedName("zi.a")
	public final int field8461;

	@ObfuscatedName("zi.s")
	public final int field8460;

	@ObfuscatedName("zi.c")
	public final int field8463;

	@ObfuscatedName("zi.m")
	public final int field8464;

	public CutsceneAction_Sub24(Packet arg0) {
		super(arg0);
		this.field8462 = arg0.method15239();
		int var2 = arg0.method15379();
		this.field8461 = var2 >>> 16;
		this.field8460 = var2 & 0xFFFF;
		this.field8463 = arg0.method15220();
		this.field8464 = arg0.method15254();
	}

	@ObfuscatedName("zi.j(I)V")
	public void method2873() {
		Statics.field1537[this.field8462].method2851(this.field8461, this.field8460, this.field8463, this.field8464);
	}
}
