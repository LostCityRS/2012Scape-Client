package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agw")
public abstract class class871 extends class546 {

	@ObfuscatedName("agw.j")
	public class322 field9894;

	@ObfuscatedName("agw.a")
	public float field9895 = 0.0F;

	@ObfuscatedName("agw.s")
	public float field9893 = 0.0F;

	public class871(class199 arg0) {
		super(arg0);
	}

	@ObfuscatedName("agw.b(Lkz;IS)V")
	public void method15935(class322 arg0, int arg1) {
		this.field9894 = arg0;
		this.field9895 = 0.0F;
		this.field9893 = 0.0F;
	}

	@ObfuscatedName("agw.u(FB)V")
	public void method11540(float arg0) {
		float var2 = this.field9894.method5514();
		if (this.field9895 >= var2) {
			return;
		}
		this.field9893 = this.method15934(var2, this.field9893, arg0);
		this.field9895 += this.field9893;
		if (this.field9895 > var2) {
			this.field9895 = var2;
		}
	}

	@ObfuscatedName("agw.j(I)Z")
	public boolean method11541() {
		return this.field9894 != null;
	}

	@ObfuscatedName("agw.a(S)Lko;")
	public class317 method11550() {
		return class317.method5290(this.field9894.method5528(this.field9895));
	}

	@ObfuscatedName("agw.s(Lfi;Lkc;III)V")
	public void method11543(class195 arg0, class314 arg1, int arg2, int arg3) {
		class317 var5 = class317.method5290(this.field6645.method3720());
		var5.field3475 -= arg2;
		var5.field3477 -= arg3;
		class317 var6 = class317.method5290(this.field9894.method5528(this.field9895));
		var6.field3475 -= arg2;
		var6.field3477 -= arg3;
		float var7 = this.field9894.method5518(this.field9895);
		class317 var8 = class317.method5377(var6, var5);
		var8.method5313();
		class316 var9 = new class316();
		var9.method5215(var8, var7);
		class317 var10 = class317.method5294(0.0F, 1.0F, 0.0F);
		class317 var11 = class317.method5308(var8, var10);
		class317 var12 = class317.method5308(var11, var8);
		var12.method5318(var9);
		var5.field3476 *= -1.0F;
		var6.field3476 *= -1.0F;
		arg1.method5103(var5.field3475, var5.field3476, var5.field3477, var6.field3475, var6.field3476, var6.field3477, var12.field3475, var12.field3476, var12.field3477);
		var5.method5291();
		var6.method5291();
		var12.method5291();
	}

	@ObfuscatedName("agw.c(Laet;I)V")
	public void method11542(class814 arg0) {
		this.field9894 = new class322(arg0);
		this.field9895 = 0.0F;
		this.field9893 = 0.0F;
	}

	@ObfuscatedName("agw.x(FFFI)F")
	public abstract float method15934(float arg0, float arg1, float arg2);
}
