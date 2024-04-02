
import deob.ObfuscatedName;

@ObfuscatedName("zq")
public class class701 extends CutsceneAction {

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

	public class701(Packet arg0) {
		super(arg0);
		this.field8485 = arg0.method15239();
		this.field8488 = arg0.method15239();
		this.field8487 = arg0.method15239();
		this.field8490 = arg0.method15239();
		this.field8489 = arg0.method15239();
		this.field8486 = arg0.method15239();
	}

	@ObfuscatedName("zq.j(I)V")
	public void method2873() {
		Statics.field10534[this.field8485].method2821(0);
		Statics.field10534[this.field8488].method2821(1);
		client.field9033 = 0;
		client.field9035 = this.field8487 * 4;
		client.field9219 = 0;
		client.field9038 = this.field8489;
		client.field9039 = this.field8486;
		client.field9034 = 1;
		client.field8995 = this.field8490 * 4;
		Statics.field2671 = 1;
		client.method6648();
		client.field8989 = true;
	}
}
