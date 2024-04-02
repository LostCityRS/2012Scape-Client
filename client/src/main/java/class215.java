
import deob.ObfuscatedName;

@ObfuscatedName("gb")
public class class215 implements class214 {

	@ObfuscatedName("gb.u")
	public final class268 field2337;

	@ObfuscatedName("gb.j")
	public final class334 field2335;

	@ObfuscatedName("gb.a")
	public final class334 field2336;

	@ObfuscatedName("gb.s")
	public class15 field2334;

	public class215(class334 arg0, class334 arg1, class268 arg2) {
		this.field2337 = arg2;
		this.field2335 = arg0;
		this.field2336 = arg1;
	}

	@ObfuscatedName("gb.u(B)V")
	public void method3936() {
		class603 var1 = class603.method14876(this.field2336, this.field2337.field2644);
		this.field2334 = Statics.field5187.method712(var1, (class685[]) class125.method2593(this.field2335, this.field2337.field2644), true);
	}

	@ObfuscatedName("gb.j(ZI)V")
	public void method3932(boolean arg0) {
		if (arg0) {
			int var2 = this.field2337.field2645.method4586(this.field2337.field2642, client.field9067) + this.field2337.field2637;
			int var3 = this.field2337.field2641.method4574(this.field2337.field2643, client.field9068) + this.field2337.field2638;
			this.field2334.method836(this.field2337.field2635, var2, var3, this.field2337.field2642, this.field2337.field2643, this.field2337.field2640, this.field2337.field2646, this.field2337.field2639, this.field2337.field2636, this.field2337.field2634, null, null, null, 0, 0);
		}
	}

	@ObfuscatedName("gb.a(I)Z")
	public boolean method3931() {
		boolean var1 = true;
		if (!this.field2335.method5630(this.field2337.field2644)) {
			var1 = false;
		}
		if (!this.field2336.method5630(this.field2337.field2644)) {
			var1 = false;
		}
		return var1;
	}
}
