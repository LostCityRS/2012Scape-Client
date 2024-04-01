package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aga")
public class class868 extends class546 {

	@ObfuscatedName("aga.j")
	public final class317 field9883 = new class317(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("aga.a")
	public final class317 field9882 = new class317(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("aga.s")
	public final class317 field9884 = new class317();

	public class868(class199 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aga.b(Ladu;I)V")
	public void method15915(class810 arg0) {
		this.field9882.field3475 = arg0.field9594;
		this.field9882.field3476 = arg0.field9597;
		this.field9882.field3477 = arg0.field9598;
		if (Float.isNaN(this.field9883.field3475)) {
			this.field9883.method5334(this.field9882);
			this.field9884.method5370();
		}
	}

	@ObfuscatedName("aga.u(FB)V")
	public void method11540(float arg0) {
		this.field6645.method3811(false, arg0, this.field9883, this.field6645.method3726(), this.field9882, this.field9884);
	}

	@ObfuscatedName("aga.j(I)Z")
	public boolean method11541() {
		return !Float.isNaN(this.field9883.field3475);
	}

	@ObfuscatedName("aga.s(Lfi;Lkc;III)V")
	public void method11543(class195 arg0, class314 arg1, int arg2, int arg3) {
		class317 var5 = class317.method5290(this.field6645.method3720());
		var5.field3475 -= arg2;
		var5.field3477 -= arg3;
		var5.field3476 *= -1.0F;
		class317 var6 = class317.method5290(this.field9883);
		var6.field3475 -= arg2;
		var6.field3477 -= arg3;
		var6.field3476 *= -1.0F;
		arg1.method5103(var5.field3475, var5.field3476, var5.field3477, var6.field3475, var6.field3476, var6.field3477, 0.0F, 1.0F, 0.0F);
		var5.method5291();
		var6.method5291();
	}

	@ObfuscatedName("aga.a(S)Lko;")
	public class317 method11550() {
		return class317.method5290(this.field9883);
	}

	@ObfuscatedName("aga.c(Laet;I)V")
	public void method11542(class814 arg0) {
		this.field9882.method5292(arg0);
	}
}
