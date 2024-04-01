package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aaj")
public abstract class class735 extends class216 {

	@ObfuscatedName("aaj.j")
	public class322 field8746;

	@ObfuscatedName("aaj.a")
	public float field8747 = 0.0F;

	@ObfuscatedName("aaj.s")
	public float field8748 = 0.0F;

	public class735(class199 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aaj.i(Lkz;II)V")
	public void method14126(class322 arg0, int arg1) {
		this.field8746 = arg0;
		this.field8747 = 0.0F;
		this.field8748 = 0.0F;
	}

	@ObfuscatedName("aaj.u(FLmv;[[[IB)V")
	public void method4014(float arg0, class361 arg1, int[][][] arg2) {
		float var4 = this.field8746.method5514();
		if (this.field8747 >= var4) {
			return;
		}
		this.field8748 = this.method14121(var4, this.field8748, arg0);
		this.field8747 += this.field8748;
		if (this.field8747 > var4) {
			this.field8747 = var4;
		}
	}

	@ObfuscatedName("aaj.j(B)Z")
	public boolean method4030() {
		return this.field8746 != null;
	}

	@ObfuscatedName("aaj.a(I)Lko;")
	public class317 method4016() {
		return class317.method5290(this.field8746.method5528(this.field8747));
	}

	@ObfuscatedName("aaj.s(B)Ladu;")
	public class810 method4017() {
		class317 var1 = this.field8746.method5528(this.field8747);
		return new class810(0, (int) var1.field3475, (int) var1.field3476, (int) var1.field3477);
	}

	@ObfuscatedName("aaj.k(B)F")
	public float method14129() {
		return this.field8746.method5516(this.field8747);
	}

	@ObfuscatedName("aaj.c(Lfi;III)V")
	public void method4029(class195 arg0, int arg1, int arg2) {
		class317 var4 = this.field8746.method5528(this.field8747);
		arg0.field2212 = (int) var4.field3475 - arg1;
		arg0.field2211 = (int) -var4.field3476;
		arg0.field2213 = (int) var4.field3477 - arg2;
	}

	@ObfuscatedName("aaj.m(Laet;B)V")
	public void method4018(class814 arg0) {
		this.field8746 = new class322(arg0);
		this.field8747 = 0.0F;
		this.field8748 = 0.0F;
	}

	@ObfuscatedName("aaj.v(FFFI)F")
	public abstract float method14121(float arg0, float arg1, float arg2);
}
