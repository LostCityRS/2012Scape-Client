package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("kz")
public class class322 {

	@ObfuscatedName("kz.u")
	public class321[] field3484 = new class321[1];

	@ObfuscatedName("kz.j")
	public float[] field3485 = new float[2];

	public class322(class814 arg0) {
		int var2 = arg0.method15277();
		this.field3484[0] = new class321();
		this.field3484[0].method5492(0, new class317(arg0));
		this.field3484[0].method5492(1, new class317(arg0));
		this.field3485[0] = arg0.method15324();
		this.field3484[0].method5492(3, new class317(arg0));
		this.field3484[0].method5492(2, new class317(arg0));
		this.field3485[1] = arg0.method15324();
		for (int var3 = 2; var3 < var2; var3++) {
			class317 var4 = new class317(arg0);
			class317 var5 = new class317(arg0);
			this.method5526(var4, var5, arg0.method15324());
		}
	}

	@ObfuscatedName("kz.u(Lko;Lko;F)V")
	public void method5526(class317 arg0, class317 arg1, float arg2) {
		class321[] var4 = new class321[this.field3484.length + 1];
		System.arraycopy(this.field3484, 0, var4, 0, this.field3484.length);
		class321 var5 = new class321();
		class321 var6 = this.field3484[this.field3484.length - 1];
		var5.method5492(0, var6.method5493(3));
		class317 var7 = class317.method5377(var6.method5493(3), var6.method5493(2));
		var5.method5492(1, class317.method5301(var6.method5493(3), var7));
		var5.method5492(3, arg0);
		var5.method5492(2, arg1);
		var4[var4.length - 1] = var5;
		this.field3484 = var4;
		float[] var8 = new float[this.field3485.length + 1];
		System.arraycopy(this.field3485, 0, var8, 0, this.field3485.length);
		var8[var8.length - 1] = arg2;
		this.field3485 = var8;
	}

	@ObfuscatedName("kz.j(I)F")
	public float method5520(int arg0) {
		return this.field3485[arg0];
	}

	@ObfuscatedName("kz.a()F")
	public float method5514() {
		float var1 = 0.0F;
		for (int var2 = 0; var2 < this.field3484.length; var2++) {
			var1 += this.field3484[var2].method5495();
		}
		return var1;
	}

	@ObfuscatedName("kz.s(F)Lko;")
	public class317 method5528(float arg0) {
		float var2 = 0.0F;
		float var3 = 0.0F;
		for (int var4 = 0; var4 < this.field3484.length; var4++) {
			var3 += this.field3484[var4].method5495();
			if (arg0 < var3) {
				float var5 = this.field3484[var4].method5494(arg0 - var2);
				return this.field3484[var4].method5490(var5);
			}
			var2 = var3;
		}
		return this.field3484[this.field3484.length - 1].method5490(1.0F);
	}

	@ObfuscatedName("kz.c(F)F")
	public float method5516(float arg0) {
		float var2 = 0.0F;
		float var3 = 0.0F;
		for (int var4 = 0; var4 < this.field3484.length; var4++) {
			var3 += this.field3484[var4].method5495();
			if (arg0 < var3) {
				return this.field3484[var4].method5494(arg0 - var2) + (float) var4;
			}
			var2 = var3;
		}
		return (float) this.field3484.length;
	}

	@ObfuscatedName("kz.m(F)Lko;")
	public class317 method5517(float arg0) {
		int var2 = (int) arg0;
		return var2 < this.field3484.length ? this.field3484[var2].method5490(arg0 - (float) var2) : this.field3484[this.field3484.length - 1].method5490(1.0F);
	}

	@ObfuscatedName("kz.t(F)F")
	public float method5518(float arg0) {
		float var2 = 0.0F;
		float var3 = 0.0F;
		float var4 = this.method5520(0);
		float var5 = 0.0F;
		for (int var6 = 0; var6 < this.field3484.length; var6++) {
			var3 += this.field3484[var6].method5495();
			float var7 = this.method5520(var6 + 1);
			if (arg0 < var3) {
				float var8 = (arg0 - var2) / (var3 - var2);
				float var9 = var7 - var4;
				if ((double) var9 > 3.141592653589793D) {
					var9 -= 6.2831855F;
				} else if ((double) var9 < -3.141592653589793D) {
					var9 += 6.2831855F;
				}
				return var8 * var9 + var4;
			}
			var2 = var3;
			var4 = var7;
		}
		return this.field3485[this.field3485.length - 1];
	}

	@ObfuscatedName("kz.l(F)F")
	public float method5519(float arg0) {
		int var2 = (int) arg0;
		if (var2 + 1 < this.field3485.length) {
			float var3 = this.field3485[var2];
			float var4 = this.field3485[var2 + 1];
			float var5 = arg0 - (float) var2;
			return (1.0F - var5) * var3 + var4 * var5;
		} else {
			return this.field3485[this.field3485.length - 1];
		}
	}
}
