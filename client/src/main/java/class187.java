
import deob.ObfuscatedName;

@ObfuscatedName("fj")
public class class187 {

	@ObfuscatedName("fj.u")
	public final Js5 field2161;

	@ObfuscatedName("fj.j")
	public final WeightedCache field2162 = new WeightedCache(16);

	public class187(ModeGame arg0, class519 arg1, Js5 arg2) {
		this.field2161 = arg2;
		this.field2161.method5637(class161.field1655.field1668);
	}

	@ObfuscatedName("fj.u(II)Lfy;")
	public class186 method3601(int arg0) {
		WeightedCache var2 = this.field2162;
		class186 var3;
		synchronized (this.field2162) {
			var3 = (class186) this.field2162.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		Js5 var5 = this.field2161;
		byte[] var6;
		synchronized (this.field2161) {
			var6 = this.field2161.method5627(class161.field1655.field1668, arg0);
		}
		class186 var8 = new class186();
		if (var6 != null) {
			var8.method3595(new Packet(var6));
		}
		WeightedCache var9 = this.field2162;
		synchronized (this.field2162) {
			this.field2162.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("fj.j(I)V")
	public void method3602() {
		WeightedCache var1 = this.field2162;
		synchronized (this.field2162) {
			this.field2162.method7922();
		}
	}

	@ObfuscatedName("fj.a(IB)V")
	public void method3608(int arg0) {
		WeightedCache var2 = this.field2162;
		synchronized (this.field2162) {
			this.field2162.method7921(arg0);
		}
	}

	@ObfuscatedName("fj.s(I)V")
	public void method3600() {
		WeightedCache var1 = this.field2162;
		synchronized (this.field2162) {
			this.field2162.method7925();
		}
	}
}
