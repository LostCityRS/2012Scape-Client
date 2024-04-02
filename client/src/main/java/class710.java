
import deob.ObfuscatedName;

@ObfuscatedName("aar")
public class class710 extends CutsceneAction {

	@ObfuscatedName("aar.j")
	public final int field8525;

	@ObfuscatedName("aar.a")
	public final int field8526;

	public class710(Packet arg0) {
		super(arg0);
		this.field8525 = arg0.method15239();
		this.field8526 = arg0.method15379();
	}

	@ObfuscatedName("aar.j(I)V")
	public void method2873() {
		client.field8992 = client.field9213;
		client.field8993 = client.field9213 + this.field8525;
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
