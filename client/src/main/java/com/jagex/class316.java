package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("kn")
public final class class316 {

	@ObfuscatedName("kn.u")
	public static class316[] field3468 = new class316[0];

	@ObfuscatedName("kn.s")
	public float field3465;

	@ObfuscatedName("kn.c")
	public float field3469;

	@ObfuscatedName("kn.m")
	public float field3470;

	@ObfuscatedName("kn.t")
	public float field3471;

	static {
		new class316();
	}

	@ObfuscatedName("kn.u(I)V")
	public static void method5208(int arg0) {
		Statics.field3466 = arg0;
		field3468 = new class316[arg0];
		Statics.field3467 = 0;
	}

	@ObfuscatedName("kn.j()Lkn;")
	public static class316 method5206() {
		class316[] var0 = field3468;
		synchronized (field3468) {
			if (Statics.field3467 == 0) {
				return new class316();
			} else {
				field3468[--Statics.field3467].method5274();
				return field3468[Statics.field3467];
			}
		}
	}

	@ObfuscatedName("kn.a(FFFF)Lkn;")
	public static class316 method5207(float arg0, float arg1, float arg2, float arg3) {
		class316[] var4 = field3468;
		synchronized (field3468) {
			if (Statics.field3467 == 0) {
				return new class316(arg0, arg1, arg2, arg3);
			} else {
				field3468[--Statics.field3467].method5213(arg0, arg1, arg2, arg3);
				return field3468[Statics.field3467];
			}
		}
	}

	@ObfuscatedName("kn.s(Lkn;)Lkn;")
	public static class316 method5234(class316 arg0) {
		class316[] var1 = field3468;
		synchronized (field3468) {
			if (Statics.field3467 == 0) {
				return new class316(arg0);
			} else {
				field3468[--Statics.field3467].method5214(arg0);
				return field3468[Statics.field3467];
			}
		}
	}

	@ObfuscatedName("kn.c()V")
	public void method5209() {
		class316[] var1 = field3468;
		synchronized (field3468) {
			if (Statics.field3467 < Statics.field3466 - 1) {
				field3468[Statics.field3467++] = this;
			}
		}
	}

	public class316() {
		this.method5274();
	}

	public class316(float arg0, float arg1, float arg2, float arg3) {
		this.method5213(arg0, arg1, arg2, arg3);
	}

	public class316(class316 arg0) {
		this.method5214(arg0);
	}

	public class316(float arg0, float arg1, float arg2) {
		this.method5217(arg0, arg1, arg2);
	}

	@ObfuscatedName("kn.m(Laet;)V")
	public void method5245(class814 arg0) {
		this.field3465 = arg0.method15324();
		this.field3469 = arg0.method15324();
		this.field3470 = arg0.method15324();
		this.field3471 = arg0.method15324();
	}

	@ObfuscatedName("kn.t(FFFF)V")
	public void method5213(float arg0, float arg1, float arg2, float arg3) {
		this.field3465 = arg0;
		this.field3469 = arg1;
		this.field3470 = arg2;
		this.field3471 = arg3;
	}

	@ObfuscatedName("kn.l(Lkn;)V")
	public void method5214(class316 arg0) {
		this.field3465 = arg0.field3465;
		this.field3469 = arg0.field3469;
		this.field3470 = arg0.field3470;
		this.field3471 = arg0.field3471;
	}

	@ObfuscatedName("kn.f(Lko;F)V")
	public void method5215(class317 arg0, float arg1) {
		this.method5216(arg0.field3475, arg0.field3476, arg0.field3477, arg1);
	}

	@ObfuscatedName("kn.d(FFFF)V")
	public void method5216(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) Math.sin((double) (arg3 * 0.5F));
		float var6 = (float) Math.cos((double) (arg3 * 0.5F));
		this.field3465 = arg0 * var5;
		this.field3469 = arg1 * var5;
		this.field3470 = arg2 * var5;
		this.field3471 = var6;
	}

	@ObfuscatedName("kn.z(FFF)V")
	public void method5217(float arg0, float arg1, float arg2) {
		this.method5216(0.0F, 1.0F, 0.0F, arg0);
		class316 var4 = method5206();
		var4.method5216(1.0F, 0.0F, 0.0F, arg1);
		this.method5266(var4);
		var4.method5216(0.0F, 0.0F, 1.0F, arg2);
		this.method5266(var4);
		var4.method5209();
	}

	@ObfuscatedName("kn.n()V")
	public final void method5274() {
		this.field3470 = 0.0F;
		this.field3469 = 0.0F;
		this.field3465 = 0.0F;
		this.field3471 = 1.0F;
	}

	@ObfuscatedName("kn.o()V")
	public final void method5219() {
		this.field3465 = -this.field3465;
		this.field3469 = -this.field3469;
		this.field3470 = -this.field3470;
		this.field3471 = -this.field3471;
	}

	@ObfuscatedName("kn.q()V")
	public final void method5220() {
		this.field3465 = -this.field3465;
		this.field3469 = -this.field3469;
		this.field3470 = -this.field3470;
	}

	@ObfuscatedName("kn.p(Lkn;)Lkn;")
	public static final class316 method5221(class316 arg0) {
		class316 var1 = method5234(arg0);
		var1.method5220();
		return var1;
	}

	@ObfuscatedName("kn.w()V")
	public final void method5255() {
		float var1 = 1.0F / method5262(this);
		this.field3465 *= var1;
		this.field3469 *= var1;
		this.field3470 *= var1;
		this.field3471 *= var1;
	}

	@ObfuscatedName("kn.b(Lkn;)V")
	public final void method5223(class316 arg0) {
		this.field3465 += arg0.field3465;
		this.field3469 += arg0.field3469;
		this.field3470 += arg0.field3470;
		this.field3471 += arg0.field3471;
	}

	@ObfuscatedName("kn.x(Lkn;)F")
	public final float method5224(class316 arg0) {
		return this.field3471 * arg0.field3471 + this.field3470 * arg0.field3470 + this.field3469 * arg0.field3469 + this.field3465 * arg0.field3465;
	}

	@ObfuscatedName("kn.i(Lkn;Lkn;)F")
	public static final float method5225(class316 arg0, class316 arg1) {
		return arg0.method5224(arg1);
	}

	@ObfuscatedName("kn.v(Lkn;)F")
	public static final float method5262(class316 arg0) {
		return (float) Math.sqrt((double) method5225(arg0, arg0));
	}

	@ObfuscatedName("kn.k(Lkn;)V")
	public final void method5266(class316 arg0) {
		this.method5213(this.field3470 * arg0.field3469 + this.field3471 * arg0.field3465 + this.field3465 * arg0.field3471 - this.field3469 * arg0.field3470, this.field3465 * arg0.field3470 + this.field3471 * arg0.field3469 + (this.field3469 * arg0.field3471 - this.field3470 * arg0.field3465), this.field3471 * arg0.field3470 + (this.field3470 * arg0.field3471 + this.field3469 * arg0.field3465 - this.field3465 * arg0.field3469), this.field3471 * arg0.field3471 - this.field3465 * arg0.field3465 - this.field3469 * arg0.field3469 - this.field3470 * arg0.field3470);
	}

	@ObfuscatedName("kn.h(Lkn;Lkn;)Lkn;")
	public static final class316 method5228(class316 arg0, class316 arg1) {
		class316 var2 = method5234(arg0);
		var2.method5266(arg1);
		return var2;
	}

	@ObfuscatedName("kn.r(F)V")
	public final void method5244(float arg0) {
		this.field3465 *= arg0;
		this.field3469 *= arg0;
		this.field3470 *= arg0;
		this.field3471 *= arg0;
	}

	@ObfuscatedName("kn.g(Lkn;F)Lkn;")
	public static final class316 method5222(class316 arg0, float arg1) {
		class316 var2 = method5234(arg0);
		var2.method5244(arg1);
		return var2;
	}

	@ObfuscatedName("kn.y(Lkn;F)V")
	public final void method5231(class316 arg0, float arg1) {
		if (this.method5224(arg0) < 0.0F) {
			this.method5219();
		}
		this.method5244(1.0F - arg1);
		class316 var3 = method5222(arg0, arg1);
		this.method5223(var3);
		var3.method5209();
		this.method5255();
	}

	public String toString() {
		return this.field3465 + "," + this.field3469 + "," + this.field3470 + "," + this.field3471;
	}
}
