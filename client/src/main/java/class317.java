
import deob.ObfuscatedName;

@ObfuscatedName("ko")
public class class317 {

	@ObfuscatedName("ko.u")
	public static class317[] field3473;

	@ObfuscatedName("ko.s")
	public float field3475;

	@ObfuscatedName("ko.c")
	public float field3476;

	@ObfuscatedName("ko.m")
	public float field3477;

	static {
		new class317(0.0F, 0.0F, 0.0F);
		field3473 = new class317[0];
	}

	@ObfuscatedName("ko.u(I)V")
	public static void method5323(int arg0) {
		Statics.field3474 = arg0;
		field3473 = new class317[arg0];
		Statics.field3472 = 0;
	}

	@ObfuscatedName("ko.j()Lko;")
	public static class317 method5288() {
		class317[] var0 = field3473;
		synchronized (field3473) {
			if (Statics.field3472 == 0) {
				return new class317();
			} else {
				field3473[--Statics.field3472].method5370();
				return field3473[Statics.field3472];
			}
		}
	}

	@ObfuscatedName("ko.a(FFF)Lko;")
	public static class317 method5294(float arg0, float arg1, float arg2) {
		class317[] var3 = field3473;
		synchronized (field3473) {
			if (Statics.field3472 == 0) {
				return new class317(arg0, arg1, arg2);
			} else {
				field3473[--Statics.field3472].method5373(arg0, arg1, arg2);
				return field3473[Statics.field3472];
			}
		}
	}

	@ObfuscatedName("ko.s(Lko;)Lko;")
	public static class317 method5290(class317 arg0) {
		class317[] var1 = field3473;
		synchronized (field3473) {
			if (Statics.field3472 == 0) {
				return new class317(arg0);
			} else {
				field3473[--Statics.field3472].method5334(arg0);
				return field3473[Statics.field3472];
			}
		}
	}

	@ObfuscatedName("ko.c()V")
	public void method5291() {
		class317[] var1 = field3473;
		synchronized (field3473) {
			if (Statics.field3472 < Statics.field3474 - 1) {
				field3473[Statics.field3472++] = this;
			}
		}
	}

	public class317() {
	}

	public class317(float arg0, float arg1, float arg2) {
		this.field3475 = arg0;
		this.field3476 = arg1;
		this.field3477 = arg2;
	}

	public class317(class317 arg0) {
		this.field3475 = arg0.field3475;
		this.field3476 = arg0.field3476;
		this.field3477 = arg0.field3477;
	}

	public class317(class814 arg0) {
		this.field3475 = arg0.method15324();
		this.field3476 = arg0.method15324();
		this.field3477 = arg0.method15324();
	}

	@ObfuscatedName("ko.m(Laet;)V")
	public void method5292(class814 arg0) {
		this.field3475 = arg0.method15324();
		this.field3476 = arg0.method15324();
		this.field3477 = arg0.method15324();
	}

	@ObfuscatedName("ko.t(FFF)V")
	public void method5373(float arg0, float arg1, float arg2) {
		this.field3475 = arg0;
		this.field3476 = arg1;
		this.field3477 = arg2;
	}

	@ObfuscatedName("ko.l(Lko;)V")
	public void method5334(class317 arg0) {
		this.method5373(arg0.field3475, arg0.field3476, arg0.field3477);
	}

	@ObfuscatedName("ko.f()V")
	public final void method5370() {
		this.field3477 = 0.0F;
		this.field3476 = 0.0F;
		this.field3475 = 0.0F;
	}

	@ObfuscatedName("ko.d(Lko;)Z")
	public boolean method5296(class317 arg0) {
		return this.field3475 == arg0.field3475 && this.field3476 == arg0.field3476 && this.field3477 == arg0.field3477;
	}

	@ObfuscatedName("ko.z()V")
	public final void method5329() {
		this.field3475 = -this.field3475;
		this.field3476 = -this.field3476;
		this.field3477 = -this.field3477;
	}

	@ObfuscatedName("ko.n()V")
	public final void method5313() {
		float var1 = 1.0F / this.method5338();
		this.field3475 *= var1;
		this.field3476 *= var1;
		this.field3477 *= var1;
	}

	@ObfuscatedName("ko.o(Lko;)V")
	public final void method5299(class317 arg0) {
		this.field3475 += arg0.field3475;
		this.field3476 += arg0.field3476;
		this.field3477 += arg0.field3477;
	}

	@ObfuscatedName("ko.q(Lko;F)V")
	public final void method5289(class317 arg0, float arg1) {
		this.field3475 += arg0.field3475 * arg1;
		this.field3476 += arg0.field3476 * arg1;
		this.field3477 += arg0.field3477 * arg1;
	}

	@ObfuscatedName("ko.p(Lko;Lko;)Lko;")
	public static final class317 method5301(class317 arg0, class317 arg1) {
		class317 var2 = method5290(arg0);
		var2.method5299(arg1);
		return var2;
	}

	@ObfuscatedName("ko.w(Lko;)V")
	public final void method5302(class317 arg0) {
		this.field3475 -= arg0.field3475;
		this.field3476 -= arg0.field3476;
		this.field3477 -= arg0.field3477;
	}

	@ObfuscatedName("ko.b(FFF)V")
	public final void method5346(float arg0, float arg1, float arg2) {
		this.field3475 -= arg0;
		this.field3476 -= arg1;
		this.field3477 -= arg2;
	}

	@ObfuscatedName("ko.x(Lko;Lko;)Lko;")
	public static final class317 method5377(class317 arg0, class317 arg1) {
		class317 var2 = method5290(arg0);
		var2.method5302(arg1);
		return var2;
	}

	@ObfuscatedName("ko.i(Lko;)F")
	public final float method5362(class317 arg0) {
		return this.field3477 * arg0.field3477 + this.field3476 * arg0.field3476 + this.field3475 * arg0.field3475;
	}

	@ObfuscatedName("ko.v(Lko;Lko;)F")
	public static final float method5306(class317 arg0, class317 arg1) {
		return arg0.method5362(arg1);
	}

	@ObfuscatedName("ko.k(Lko;)V")
	public final void method5307(class317 arg0) {
		this.method5373(this.field3476 * arg0.field3477 - this.field3477 * arg0.field3476, this.field3477 * arg0.field3475 - this.field3475 * arg0.field3477, this.field3475 * arg0.field3476 - this.field3476 * arg0.field3475);
	}

	@ObfuscatedName("ko.h(Lko;Lko;)Lko;")
	public static final class317 method5308(class317 arg0, class317 arg1) {
		class317 var2 = method5290(arg0);
		var2.method5307(arg1);
		return var2;
	}

	@ObfuscatedName("ko.r()F")
	public final float method5338() {
		return (float) Math.sqrt((double) (this.field3477 * this.field3477 + this.field3476 * this.field3476 + this.field3475 * this.field3475));
	}

	@ObfuscatedName("ko.g()V")
	public final void method5310() {
		if (this.field3475 < 0.0F) {
			this.field3475 *= -1.0F;
		}
		if (this.field3476 < 0.0F) {
			this.field3476 *= -1.0F;
		}
		if (this.field3477 < 0.0F) {
			this.field3477 *= -1.0F;
		}
	}

	@ObfuscatedName("ko.y(Lko;)V")
	public final void method5311(class317 arg0) {
		this.field3475 *= arg0.field3475;
		this.field3476 *= arg0.field3476;
		this.field3477 *= arg0.field3477;
	}

	@ObfuscatedName("ko.e(Lko;Lko;)Lko;")
	public static final class317 method5312(class317 arg0, class317 arg1) {
		class317 var2 = method5290(arg0);
		var2.method5311(arg1);
		return var2;
	}

	@ObfuscatedName("ko.ay(F)V")
	public final void method5357(float arg0) {
		this.field3475 *= arg0;
		this.field3476 *= arg0;
		this.field3477 *= arg0;
	}

	@ObfuscatedName("ko.af(Lko;)V")
	public final void method5314(class317 arg0) {
		this.field3475 /= arg0.field3475;
		this.field3476 /= arg0.field3476;
		this.field3477 /= arg0.field3477;
	}

	@ObfuscatedName("ko.ar(Lko;Lko;)Lko;")
	public static final class317 method5315(class317 arg0, class317 arg1) {
		class317 var2 = method5290(arg0);
		var2.method5314(arg1);
		return var2;
	}

	@ObfuscatedName("ko.an(F)V")
	public final void method5309(float arg0) {
		this.field3475 /= arg0;
		this.field3476 /= arg0;
		this.field3477 /= arg0;
	}

	@ObfuscatedName("ko.ap(Lko;F)Lko;")
	public static final class317 method5317(class317 arg0, float arg1) {
		class317 var2 = method5290(arg0);
		var2.method5357(arg1);
		return var2;
	}

	@ObfuscatedName("ko.ag(Lkn;)V")
	public final void method5318(class316 arg0) {
		class316 var2 = class316.method5207(this.field3475, this.field3476, this.field3477, 0.0F);
		class316 var3 = class316.method5221(arg0);
		class316 var4 = class316.method5228(var3, var2);
		var4.method5266(arg0);
		this.method5373(var4.field3465, var4.field3469, var4.field3470);
		var2.method5209();
		var3.method5209();
		var4.method5209();
	}

	@ObfuscatedName("ko.as(Lkc;)V")
	public final void method5319(class314 arg0) {
		float var2 = this.field3475;
		float var3 = this.field3476;
		this.field3475 = this.field3477 * arg0.field3457 + arg0.field3454 * var3 + arg0.field3453 * var2 + arg0.field3460;
		this.field3476 = this.field3477 * arg0.field3461 + arg0.field3452 * var2 + arg0.field3451 * var3 + arg0.field3450;
		this.field3477 = this.field3477 * arg0.field3459 + arg0.field3462 * var3 + arg0.field3456 * var2 + arg0.field3458;
	}

	@ObfuscatedName("ko.ai(Lkc;)V")
	public final void method5324(class314 arg0) {
		float var2 = this.field3475;
		float var3 = this.field3476;
		this.field3475 = this.field3477 * arg0.field3457 + arg0.field3454 * var3 + arg0.field3453 * var2;
		this.field3476 = this.field3477 * arg0.field3461 + arg0.field3452 * var2 + arg0.field3451 * var3;
		this.field3477 = this.field3477 * arg0.field3459 + arg0.field3462 * var3 + arg0.field3456 * var2;
	}

	@ObfuscatedName("ko.ao(Lko;F)V")
	public final void method5321(class317 arg0, float arg1) {
		this.method5357(1.0F - arg1);
		this.method5299(method5317(arg0, arg1));
	}

	public String toString() {
		return this.field3475 + ", " + this.field3476 + ", " + this.field3477;
	}
}
