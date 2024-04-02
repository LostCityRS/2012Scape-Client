
import deob.ObfuscatedName;

@ObfuscatedName("aav")
public class class734 extends class216 {

	@ObfuscatedName("aav.j")
	public class198 field8741;

	@ObfuscatedName("aav.a")
	public final class317 field8736 = new class317();

	@ObfuscatedName("aav.s")
	public final class316 field8737 = new class316();

	@ObfuscatedName("aav.c")
	public boolean field8738;

	@ObfuscatedName("aav.m")
	public int field8742 = 200;

	@ObfuscatedName("aav.t")
	public int field8740;

	@ObfuscatedName("aav.l")
	public final class317 field8739 = new class317(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("aav.f")
	public final class317 field8735 = new class317(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("aav.d")
	public final class317 field8743 = new class317();

	@ObfuscatedName("aav.z")
	public final class316 field8744 = new class316();

	public class734(class199 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aav.i(Lfs;Lko;Lkn;ZILmv;[[[IB)V")
	public void method14097(class198 arg0, class317 arg1, class316 arg2, boolean arg3, int arg4, class361 arg5, int[][][] arg6) {
		this.field8741 = arg0;
		this.field8736.method5334(arg1);
		this.field8737.method5214(arg2);
		this.field8738 = arg3;
		this.field8742 = arg4;
		this.field8740 = this.field8741.method3684().field9595;
		this.method14099(arg5, arg6);
	}

	@ObfuscatedName("aav.u(FLmv;[[[IB)V")
	public void method4014(float arg0, class361 arg1, int[][][] arg2) {
		if (this.field8741 == null) {
			return;
		}
		this.method14099(arg1, arg2);
		class316 var4 = this.method14098();
		this.field8744.method5231(var4, this.field2340.method3729());
		var4.method5209();
		this.field8735.method5334(this.field8741.method3684().method15209());
		this.field2340.method3811(true, arg0, this.field8739, this.field2340.method3726(), this.field8735, this.field8743);
	}

	@ObfuscatedName("aav.v(B)Lkn;")
	public class316 method14098() {
		class316 var1 = class316.method5234(this.field8737);
		if (this.field8738) {
			class317 var2 = this.field8741.method3683();
			if (var2.method5338() < (float) this.field8742) {
				var2 = class317.method5294(0.0F, 0.0F, 1.0F);
				class316 var3 = this.field8741.method3680();
				var2.method5318(var3);
			}
			var2.field3476 = 0.0F;
			float var4 = (float) Math.atan2((double) var2.field3475, (double) var2.field3477);
			var2.method5291();
			class316 var5 = new class316();
			var5.method5216(0.0F, 1.0F, 0.0F, var4);
			var1.method5266(var5);
		}
		return var1;
	}

	@ObfuscatedName("aav.k(Lmv;[[[IB)V")
	public void method14099(class361 arg0, int[][][] arg1) {
		if (this.method4030() && (this.field2340.method3734() || this.field2340.method3765())) {
			class316 var3 = this.method14098();
			if (this.field2340.method3765() && arg1 != null) {
			}
			var3.method5209();
		}
	}

	@ObfuscatedName("aav.j(B)Z")
	public boolean method4030() {
		return !Float.isNaN(this.field8739.field3475);
	}

	@ObfuscatedName("aav.a(I)Lko;")
	public class317 method4016() {
		class317 var1 = class317.method5290(this.field8736);
		var1.method5318(this.field8744);
		class317 var2 = class317.method5301(this.field8739, var1);
		var1.method5291();
		return var2;
	}

	@ObfuscatedName("aav.s(B)Ladu;")
	public class810 method4017() {
		class317 var1 = this.method4016();
		class810 var2 = new class810(this.field8740, (int) var1.field3475, (int) var1.field3476, (int) var1.field3477);
		var1.method5291();
		return var2;
	}

	@ObfuscatedName("aav.h(I)Lko;")
	public class317 method14100() {
		return this.field8739;
	}

	@ObfuscatedName("aav.r(I)Lko;")
	public class317 method14101() {
		return this.field8736;
	}

	@ObfuscatedName("aav.g(I)F")
	public float method14116() {
		return class362.method7588(this.field8737);
	}

	@ObfuscatedName("aav.y(B)F")
	public float method14103() {
		return class362.method1721(this.field8737);
	}

	@ObfuscatedName("aav.c(Lfi;III)V")
	public void method4029(class195 arg0, int arg1, int arg2) {
		class317 var4 = this.method4016();
		arg0.field2212 = (int) var4.field3475 - arg1;
		arg0.field2211 = (int) -var4.field3476;
		arg0.field2213 = (int) var4.field3477 - arg2;
		var4.method5291();
	}

	@ObfuscatedName("aav.m(Laet;B)V")
	public void method4018(class814 arg0) {
		class197 var2 = class197.method4728(arg0.method15220());
		int var3 = arg0.method15239();
		this.field8736.method5292(arg0);
		this.field8737.method5245(arg0);
		if (arg0.method15220() == 1) {
			this.field8738 = true;
		} else {
			this.field8738 = false;
		}
		this.field8742 = arg0.method15239();
		this.field8741 = this.field2340.method3717().method1355(var2, var3);
	}
}
