
import deob.ObfuscatedName;

@ObfuscatedName("zp")
public abstract class class703 extends CutsceneAction {

	@ObfuscatedName("zp.j")
	public final int field8498;

	@ObfuscatedName("zp.a")
	public final int field8496;

	@ObfuscatedName("zp.s")
	public final int field8497;

	public class703(Packet arg0) {
		super(arg0);
		this.field8498 = arg0.method15239();
		this.field8496 = arg0.method15239();
		this.field8497 = arg0.method15220();
	}

	@ObfuscatedName("zp.s(B)Z")
	public boolean method2883() {
		EffectAnimType var1 = Statics.field4213.method11082(this.field8498);
		boolean var2 = var1.method11104();
		class509 var3 = Statics.field566.method11144(var1.field5252);
		return var2 & var3.method11129();
	}
}
