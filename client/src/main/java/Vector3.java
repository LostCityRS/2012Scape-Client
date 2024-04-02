
import deob.ObfuscatedName;

@ObfuscatedName("ko")
public class Vector3 {

	@ObfuscatedName("ko.u")
	public static Vector3[] field3473;

	@ObfuscatedName("ko.s")
	public float field3475;

	@ObfuscatedName("ko.c")
	public float field3476;

	@ObfuscatedName("ko.m")
	public float field3477;

	static {
		new Vector3(0.0F, 0.0F, 0.0F);
		field3473 = new Vector3[0];
	}

	@ObfuscatedName("ko.u(I)V")
	public static void method5323(int arg0) {
		Statics.field3474 = arg0;
		field3473 = new Vector3[arg0];
		Statics.field3472 = 0;
	}

	@ObfuscatedName("ko.j()Lko;")
	public static Vector3 method5288() {
		Vector3[] var0 = field3473;
		synchronized (field3473) {
			if (Statics.field3472 == 0) {
				return new Vector3();
			} else {
				field3473[--Statics.field3472].method5370();
				return field3473[Statics.field3472];
			}
		}
	}

	@ObfuscatedName("ko.a(FFF)Lko;")
	public static Vector3 method5294(float arg0, float arg1, float arg2) {
		Vector3[] var3 = field3473;
		synchronized (field3473) {
			if (Statics.field3472 == 0) {
				return new Vector3(arg0, arg1, arg2);
			} else {
				field3473[--Statics.field3472].method5373(arg0, arg1, arg2);
				return field3473[Statics.field3472];
			}
		}
	}

	@ObfuscatedName("ko.s(Lko;)Lko;")
	public static Vector3 method5290(Vector3 arg0) {
		Vector3[] var1 = field3473;
		synchronized (field3473) {
			if (Statics.field3472 == 0) {
				return new Vector3(arg0);
			} else {
				field3473[--Statics.field3472].method5334(arg0);
				return field3473[Statics.field3472];
			}
		}
	}

	@ObfuscatedName("ko.c()V")
	public void method5291() {
		Vector3[] var1 = field3473;
		synchronized (field3473) {
			if (Statics.field3472 < Statics.field3474 - 1) {
				field3473[Statics.field3472++] = this;
			}
		}
	}

	public Vector3() {
	}

	public Vector3(float arg0, float arg1, float arg2) {
		this.field3475 = arg0;
		this.field3476 = arg1;
		this.field3477 = arg2;
	}

	public Vector3(Vector3 arg0) {
		this.field3475 = arg0.field3475;
		this.field3476 = arg0.field3476;
		this.field3477 = arg0.field3477;
	}

	public Vector3(Packet arg0) {
		this.field3475 = arg0.method15324();
		this.field3476 = arg0.method15324();
		this.field3477 = arg0.method15324();
	}

	@ObfuscatedName("ko.m(Laet;)V")
	public void method5292(Packet arg0) {
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
	public void method5334(Vector3 arg0) {
		this.method5373(arg0.field3475, arg0.field3476, arg0.field3477);
	}

	@ObfuscatedName("ko.f()V")
	public final void method5370() {
		this.field3477 = 0.0F;
		this.field3476 = 0.0F;
		this.field3475 = 0.0F;
	}

	@ObfuscatedName("ko.d(Lko;)Z")
	public boolean method5296(Vector3 arg0) {
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
	public final void method5299(Vector3 arg0) {
		this.field3475 += arg0.field3475;
		this.field3476 += arg0.field3476;
		this.field3477 += arg0.field3477;
	}

	@ObfuscatedName("ko.q(Lko;F)V")
	public final void method5289(Vector3 arg0, float arg1) {
		this.field3475 += arg0.field3475 * arg1;
		this.field3476 += arg0.field3476 * arg1;
		this.field3477 += arg0.field3477 * arg1;
	}

	@ObfuscatedName("ko.p(Lko;Lko;)Lko;")
	public static final Vector3 method5301(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = method5290(arg0);
		var2.method5299(arg1);
		return var2;
	}

	@ObfuscatedName("ko.w(Lko;)V")
	public final void method5302(Vector3 arg0) {
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
	public static final Vector3 method5377(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = method5290(arg0);
		var2.method5302(arg1);
		return var2;
	}

	@ObfuscatedName("ko.i(Lko;)F")
	public final float method5362(Vector3 arg0) {
		return this.field3477 * arg0.field3477 + this.field3476 * arg0.field3476 + this.field3475 * arg0.field3475;
	}

	@ObfuscatedName("ko.v(Lko;Lko;)F")
	public static final float method5306(Vector3 arg0, Vector3 arg1) {
		return arg0.method5362(arg1);
	}

	@ObfuscatedName("ko.k(Lko;)V")
	public final void method5307(Vector3 arg0) {
		this.method5373(this.field3476 * arg0.field3477 - this.field3477 * arg0.field3476, this.field3477 * arg0.field3475 - this.field3475 * arg0.field3477, this.field3475 * arg0.field3476 - this.field3476 * arg0.field3475);
	}

	@ObfuscatedName("ko.h(Lko;Lko;)Lko;")
	public static final Vector3 method5308(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = method5290(arg0);
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
	public final void method5311(Vector3 arg0) {
		this.field3475 *= arg0.field3475;
		this.field3476 *= arg0.field3476;
		this.field3477 *= arg0.field3477;
	}

	@ObfuscatedName("ko.e(Lko;Lko;)Lko;")
	public static final Vector3 method5312(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = method5290(arg0);
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
	public final void method5314(Vector3 arg0) {
		this.field3475 /= arg0.field3475;
		this.field3476 /= arg0.field3476;
		this.field3477 /= arg0.field3477;
	}

	@ObfuscatedName("ko.ar(Lko;Lko;)Lko;")
	public static final Vector3 method5315(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = method5290(arg0);
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
	public static final Vector3 method5317(Vector3 arg0, float arg1) {
		Vector3 var2 = method5290(arg0);
		var2.method5357(arg1);
		return var2;
	}

	@ObfuscatedName("ko.ag(Lkn;)V")
	public final void method5318(Quaternion arg0) {
		Quaternion var2 = Quaternion.method5207(this.field3475, this.field3476, this.field3477, 0.0F);
		Quaternion var3 = Quaternion.method5221(arg0);
		Quaternion var4 = Quaternion.method5228(var3, var2);
		var4.method5266(arg0);
		this.method5373(var4.field3465, var4.field3469, var4.field3470);
		var2.method5209();
		var3.method5209();
		var4.method5209();
	}

	@ObfuscatedName("ko.as(Lkc;)V")
	public final void method5319(Matrix4x3 arg0) {
		float var2 = this.field3475;
		float var3 = this.field3476;
		this.field3475 = this.field3477 * arg0.field3457 + arg0.field3454 * var3 + arg0.field3453 * var2 + arg0.field3460;
		this.field3476 = this.field3477 * arg0.field3461 + arg0.field3452 * var2 + arg0.field3451 * var3 + arg0.field3450;
		this.field3477 = this.field3477 * arg0.field3459 + arg0.field3462 * var3 + arg0.field3456 * var2 + arg0.field3458;
	}

	@ObfuscatedName("ko.ai(Lkc;)V")
	public final void method5324(Matrix4x3 arg0) {
		float var2 = this.field3475;
		float var3 = this.field3476;
		this.field3475 = this.field3477 * arg0.field3457 + arg0.field3454 * var3 + arg0.field3453 * var2;
		this.field3476 = this.field3477 * arg0.field3461 + arg0.field3452 * var2 + arg0.field3451 * var3;
		this.field3477 = this.field3477 * arg0.field3459 + arg0.field3462 * var3 + arg0.field3456 * var2;
	}

	@ObfuscatedName("ko.ao(Lko;F)V")
	public final void method5321(Vector3 arg0, float arg1) {
		this.method5357(1.0F - arg1);
		this.method5299(method5317(arg0, arg1));
	}

	public String toString() {
		return this.field3475 + ", " + this.field3476 + ", " + this.field3477;
	}
}