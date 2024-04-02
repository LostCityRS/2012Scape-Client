
import deob.ObfuscatedName;

@ObfuscatedName("oh")
public class PrimaryLayerEntityList {

	@ObfuscatedName("oh.u")
	public PrimaryLayerEntity field4642;

	@ObfuscatedName("oh.j")
	public PrimaryLayerEntityList field4641;

	@ObfuscatedName("oh.a")
	public static int field4643 = 0;

	@ObfuscatedName("up.u(Laku;I)Loh;")
	public static PrimaryLayerEntityList method11871(PrimaryLayerEntity arg0) {
		PrimaryLayerEntityList var1;
		if (Statics.field4644 == null) {
			var1 = new PrimaryLayerEntityList();
		} else {
			var1 = Statics.field4644;
			Statics.field4644 = Statics.field4644.field4641;
			var1.field4641 = null;
			field4643--;
		}
		var1.field4642 = arg0;
		return var1;
	}

	@ObfuscatedName("oh.j(I)V")
	public void method7646() {
		if (field4643 < 500) {
			this.field4642 = null;
			this.field4641 = Statics.field4644;
			Statics.field4644 = this;
			field4643++;
		}
	}
}
