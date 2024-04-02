
import deob.ObfuscatedName;

@ObfuscatedName("ahr")
public class CutsceneAction_Sub13 extends CutsceneAction_Sub25 {

	@ObfuscatedName("ahr.c")
	public final int field10037;

	@ObfuscatedName("ahr.m")
	public final int field10036;

	@ObfuscatedName("ahr.t")
	public final int field10038;

	public CutsceneAction_Sub13(Packet arg0) {
		super(arg0);
		this.field10037 = arg0.method15239();
		this.field10036 = arg0.method15220();
		this.field10038 = arg0.method15239();
	}

	@ObfuscatedName("ahr.j(I)V")
	public void method2873() {
		Statics.field1537[this.field10037].method2854().method13950(this.field8498, this.field8497 << 16, this.field8496, this.field10038, false, this.field10036);
	}
}
