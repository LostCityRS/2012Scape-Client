
import deob.ObfuscatedName;

@ObfuscatedName("pn")
public class BASTypeList {

	@ObfuscatedName("pn.u")
	public final Js5 field4734;

	@ObfuscatedName("pn.j")
	public final WeightedCache field4732 = new WeightedCache(64);

	@ObfuscatedName("pn.a")
	public static final BASType field4733 = new BASType();

	@ObfuscatedName("pn.s")
	public final WearposDefaults field4735;

	public BASTypeList(ModeGame arg0, Language arg1, Js5 arg2, WearposDefaults arg3) {
		this.field4734 = arg2;
		this.field4734.method5637(class161.field1657.field1668);
		this.field4735 = arg3;
	}

	@ObfuscatedName("pn.u(II)Lps;")
	public BASType method7784(int arg0) {
		WeightedCache var2 = this.field4732;
		BASType var3;
		synchronized (this.field4732) {
			var3 = (BASType) this.field4732.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		Js5 var5 = this.field4734;
		byte[] var6;
		synchronized (this.field4734) {
			var6 = this.field4734.method5627(class161.field1657.field1668, arg0);
		}
		BASType var8 = new BASType();
		var8.field4698 = this;
		if (var6 != null) {
			var8.method7752(new Packet(var6));
		}
		WeightedCache var9 = this.field4732;
		synchronized (this.field4732) {
			this.field4732.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("pn.j(I)V")
	public void method7774() {
		WeightedCache var1 = this.field4732;
		synchronized (this.field4732) {
			this.field4732.method7922();
		}
	}

	@ObfuscatedName("pn.a(IB)V")
	public void method7775(int arg0) {
		WeightedCache var2 = this.field4732;
		synchronized (this.field4732) {
			this.field4732.method7921(arg0);
		}
	}

	@ObfuscatedName("pn.s(I)V")
	public void method7776() {
		WeightedCache var1 = this.field4732;
		synchronized (this.field4732) {
			this.field4732.method7925();
		}
	}
}
