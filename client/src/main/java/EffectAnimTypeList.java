
import deob.ObfuscatedName;

@ObfuscatedName("rv")
public class EffectAnimTypeList {

	@ObfuscatedName("rv.u")
	public final Js5 field5246;

	@ObfuscatedName("rv.j")
	public final Js5 field5244;

	@ObfuscatedName("rv.a")
	public final WeightedCache field5247 = new WeightedCache(64);

	@ObfuscatedName("rv.s")
	public final WeightedCache field5245 = new WeightedCache(60);

	@ObfuscatedName("rv.c")
	public int field5248;

	public EffectAnimTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		this.field5246 = arg2;
		this.field5244 = arg3;
		int var5 = this.field5246.method5638() - 1;
		class161.field1638.method3071();
		this.field5246.method5637(var5);
	}

	@ObfuscatedName("rv.u(II)Lse;")
	public EffectAnimType method11082(int arg0) {
		WeightedCache var2 = this.field5247;
		EffectAnimType var3;
		synchronized (this.field5247) {
			var3 = (EffectAnimType) this.field5247.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		Js5 var5 = this.field5246;
		byte[] var6;
		synchronized (this.field5246) {
			var6 = this.field5246.method5627(class161.field1638.method3073(arg0), class161.field1638.method3075(arg0));
		}
		EffectAnimType var8 = new EffectAnimType();
		var8.field5256 = this;
		var8.field5250 = arg0;
		if (var6 != null) {
			var8.method11100(new Packet(var6));
		}
		WeightedCache var9 = this.field5247;
		synchronized (this.field5247) {
			this.field5247.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("rv.j(II)V")
	public void method11084(int arg0) {
		this.field5248 = arg0;
		WeightedCache var2 = this.field5245;
		synchronized (this.field5245) {
			this.field5245.method7922();
		}
	}

	@ObfuscatedName("rv.a(I)V")
	public void method11088() {
		WeightedCache var1 = this.field5247;
		synchronized (this.field5247) {
			this.field5247.method7922();
		}
		WeightedCache var3 = this.field5245;
		synchronized (this.field5245) {
			this.field5245.method7922();
		}
	}

	@ObfuscatedName("rv.s(II)V")
	public void method11085(int arg0) {
		WeightedCache var2 = this.field5247;
		synchronized (this.field5247) {
			this.field5247.method7921(arg0);
		}
		WeightedCache var4 = this.field5245;
		synchronized (this.field5245) {
			this.field5245.method7921(arg0);
		}
	}

	@ObfuscatedName("rv.c(I)V")
	public void method11087() {
		WeightedCache var1 = this.field5247;
		synchronized (this.field5247) {
			this.field5247.method7925();
		}
		WeightedCache var3 = this.field5245;
		synchronized (this.field5245) {
			this.field5245.method7925();
		}
	}
}
