package com.jagex;

import deob.ObfuscatedName;
import java.util.Arrays;

@ObfuscatedName("ka")
public final class class320 {

	@ObfuscatedName("ka.u")
	public float[] field3480 = new float[16];

	@ObfuscatedName("ka.j")
	public static final class320 field3479 = new class320();

	public class320(class320 arg0) {
		this.method5412(arg0);
	}

	public class320() {
		this.method5453();
	}

	@ObfuscatedName("ka.u()V")
	public void method5453() {
		this.field3480[0] = 1.0F;
		this.field3480[1] = 0.0F;
		this.field3480[2] = 0.0F;
		this.field3480[3] = 0.0F;
		this.field3480[4] = 0.0F;
		this.field3480[5] = 1.0F;
		this.field3480[6] = 0.0F;
		this.field3480[7] = 0.0F;
		this.field3480[8] = 0.0F;
		this.field3480[9] = 0.0F;
		this.field3480[10] = 1.0F;
		this.field3480[11] = 0.0F;
		this.field3480[12] = 0.0F;
		this.field3480[13] = 0.0F;
		this.field3480[14] = 0.0F;
		this.field3480[15] = 1.0F;
	}

	@ObfuscatedName("ka.j(Lka;)V")
	public void method5412(class320 arg0) {
		System.arraycopy(arg0.field3480, 0, this.field3480, 0, 16);
	}

	@ObfuscatedName("ka.a(Lka;Lka;)V")
	public void method5383(class320 arg0, class320 arg1) {
		float var3 = arg0.field3480[3] * arg1.field3480[12] + arg0.field3480[2] * arg1.field3480[8] + arg0.field3480[0] * arg1.field3480[0] + arg0.field3480[1] * arg1.field3480[4];
		float var4 = arg0.field3480[3] * arg1.field3480[13] + arg0.field3480[2] * arg1.field3480[9] + arg0.field3480[0] * arg1.field3480[1] + arg0.field3480[1] * arg1.field3480[5];
		float var5 = arg0.field3480[3] * arg1.field3480[14] + arg0.field3480[2] * arg1.field3480[10] + arg0.field3480[0] * arg1.field3480[2] + arg0.field3480[1] * arg1.field3480[6];
		float var6 = arg0.field3480[3] * arg1.field3480[15] + arg0.field3480[2] * arg1.field3480[11] + arg0.field3480[0] * arg1.field3480[3] + arg0.field3480[1] * arg1.field3480[7];
		float var7 = arg0.field3480[7] * arg1.field3480[12] + arg0.field3480[6] * arg1.field3480[8] + arg0.field3480[4] * arg1.field3480[0] + arg0.field3480[5] * arg1.field3480[4];
		float var8 = arg0.field3480[7] * arg1.field3480[13] + arg0.field3480[6] * arg1.field3480[9] + arg0.field3480[4] * arg1.field3480[1] + arg0.field3480[5] * arg1.field3480[5];
		float var9 = arg0.field3480[7] * arg1.field3480[14] + arg0.field3480[6] * arg1.field3480[10] + arg0.field3480[4] * arg1.field3480[2] + arg0.field3480[5] * arg1.field3480[6];
		float var10 = arg0.field3480[7] * arg1.field3480[15] + arg0.field3480[6] * arg1.field3480[11] + arg0.field3480[4] * arg1.field3480[3] + arg0.field3480[5] * arg1.field3480[7];
		float var11 = arg0.field3480[11] * arg1.field3480[12] + arg0.field3480[10] * arg1.field3480[8] + arg0.field3480[8] * arg1.field3480[0] + arg0.field3480[9] * arg1.field3480[4];
		float var12 = arg0.field3480[11] * arg1.field3480[13] + arg0.field3480[10] * arg1.field3480[9] + arg0.field3480[8] * arg1.field3480[1] + arg0.field3480[9] * arg1.field3480[5];
		float var13 = arg0.field3480[11] * arg1.field3480[14] + arg0.field3480[10] * arg1.field3480[10] + arg0.field3480[8] * arg1.field3480[2] + arg0.field3480[9] * arg1.field3480[6];
		float var14 = arg0.field3480[11] * arg1.field3480[15] + arg0.field3480[10] * arg1.field3480[11] + arg0.field3480[8] * arg1.field3480[3] + arg0.field3480[9] * arg1.field3480[7];
		float var15 = arg0.field3480[15] * arg1.field3480[12] + arg0.field3480[14] * arg1.field3480[8] + arg0.field3480[12] * arg1.field3480[0] + arg0.field3480[13] * arg1.field3480[4];
		float var16 = arg0.field3480[15] * arg1.field3480[13] + arg0.field3480[14] * arg1.field3480[9] + arg0.field3480[12] * arg1.field3480[1] + arg0.field3480[13] * arg1.field3480[5];
		float var17 = arg0.field3480[15] * arg1.field3480[14] + arg0.field3480[14] * arg1.field3480[10] + arg0.field3480[12] * arg1.field3480[2] + arg0.field3480[13] * arg1.field3480[6];
		float var18 = arg0.field3480[15] * arg1.field3480[15] + arg0.field3480[14] * arg1.field3480[11] + arg0.field3480[12] * arg1.field3480[3] + arg0.field3480[13] * arg1.field3480[7];
		this.field3480[0] = var3;
		this.field3480[1] = var4;
		this.field3480[2] = var5;
		this.field3480[3] = var6;
		this.field3480[4] = var7;
		this.field3480[5] = var8;
		this.field3480[6] = var9;
		this.field3480[7] = var10;
		this.field3480[8] = var11;
		this.field3480[9] = var12;
		this.field3480[10] = var13;
		this.field3480[11] = var14;
		this.field3480[12] = var15;
		this.field3480[13] = var16;
		this.field3480[14] = var17;
		this.field3480[15] = var18;
	}

	@ObfuscatedName("ka.s(Lka;)V")
	public void method5384(class320 arg0) {
		float var2 = this.field3480[3] * arg0.field3480[12] + this.field3480[2] * arg0.field3480[8] + this.field3480[0] * arg0.field3480[0] + this.field3480[1] * arg0.field3480[4];
		float var3 = this.field3480[3] * arg0.field3480[13] + this.field3480[2] * arg0.field3480[9] + this.field3480[0] * arg0.field3480[1] + this.field3480[1] * arg0.field3480[5];
		float var4 = this.field3480[3] * arg0.field3480[14] + this.field3480[2] * arg0.field3480[10] + this.field3480[0] * arg0.field3480[2] + this.field3480[1] * arg0.field3480[6];
		float var5 = this.field3480[3] * arg0.field3480[15] + this.field3480[2] * arg0.field3480[11] + this.field3480[0] * arg0.field3480[3] + this.field3480[1] * arg0.field3480[7];
		float var6 = this.field3480[7] * arg0.field3480[12] + this.field3480[6] * arg0.field3480[8] + this.field3480[4] * arg0.field3480[0] + this.field3480[5] * arg0.field3480[4];
		float var7 = this.field3480[7] * arg0.field3480[13] + this.field3480[6] * arg0.field3480[9] + this.field3480[4] * arg0.field3480[1] + this.field3480[5] * arg0.field3480[5];
		float var8 = this.field3480[7] * arg0.field3480[14] + this.field3480[6] * arg0.field3480[10] + this.field3480[4] * arg0.field3480[2] + this.field3480[5] * arg0.field3480[6];
		float var9 = this.field3480[7] * arg0.field3480[15] + this.field3480[6] * arg0.field3480[11] + this.field3480[4] * arg0.field3480[3] + this.field3480[5] * arg0.field3480[7];
		float var10 = this.field3480[11] * arg0.field3480[12] + this.field3480[10] * arg0.field3480[8] + this.field3480[8] * arg0.field3480[0] + this.field3480[9] * arg0.field3480[4];
		float var11 = this.field3480[11] * arg0.field3480[13] + this.field3480[10] * arg0.field3480[9] + this.field3480[8] * arg0.field3480[1] + this.field3480[9] * arg0.field3480[5];
		float var12 = this.field3480[11] * arg0.field3480[14] + this.field3480[10] * arg0.field3480[10] + this.field3480[8] * arg0.field3480[2] + this.field3480[9] * arg0.field3480[6];
		float var13 = this.field3480[11] * arg0.field3480[15] + this.field3480[10] * arg0.field3480[11] + this.field3480[8] * arg0.field3480[3] + this.field3480[9] * arg0.field3480[7];
		float var14 = this.field3480[15] * arg0.field3480[12] + this.field3480[14] * arg0.field3480[8] + this.field3480[12] * arg0.field3480[0] + this.field3480[13] * arg0.field3480[4];
		float var15 = this.field3480[15] * arg0.field3480[13] + this.field3480[14] * arg0.field3480[9] + this.field3480[12] * arg0.field3480[1] + this.field3480[13] * arg0.field3480[5];
		float var16 = this.field3480[15] * arg0.field3480[14] + this.field3480[14] * arg0.field3480[10] + this.field3480[12] * arg0.field3480[2] + this.field3480[13] * arg0.field3480[6];
		float var17 = this.field3480[15] * arg0.field3480[15] + this.field3480[14] * arg0.field3480[11] + this.field3480[12] * arg0.field3480[3] + this.field3480[13] * arg0.field3480[7];
		this.field3480[0] = var2;
		this.field3480[1] = var3;
		this.field3480[2] = var4;
		this.field3480[3] = var5;
		this.field3480[4] = var6;
		this.field3480[5] = var7;
		this.field3480[6] = var8;
		this.field3480[7] = var9;
		this.field3480[8] = var10;
		this.field3480[9] = var11;
		this.field3480[10] = var12;
		this.field3480[11] = var13;
		this.field3480[12] = var14;
		this.field3480[13] = var15;
		this.field3480[14] = var16;
		this.field3480[15] = var17;
	}

	@ObfuscatedName("ka.c(Lkc;)V")
	public void method5385(class314 arg0) {
		this.field3480[0] = arg0.field3453;
		this.field3480[1] = arg0.field3452;
		this.field3480[2] = arg0.field3456;
		this.field3480[3] = 0.0F;
		this.field3480[4] = arg0.field3454;
		this.field3480[5] = arg0.field3451;
		this.field3480[6] = arg0.field3462;
		this.field3480[7] = 0.0F;
		this.field3480[8] = arg0.field3457;
		this.field3480[9] = arg0.field3461;
		this.field3480[10] = arg0.field3459;
		this.field3480[11] = 0.0F;
		this.field3480[12] = arg0.field3460;
		this.field3480[13] = arg0.field3450;
		this.field3480[14] = arg0.field3458;
		this.field3480[15] = 1.0F;
	}

	@ObfuscatedName("ka.m()F")
	public float method5386() {
		return this.field3480[3] * this.field3480[6] * this.field3480[9] * this.field3480[12] + (this.field3480[3] * this.field3480[5] * this.field3480[8] * this.field3480[14] + this.field3480[3] * this.field3480[4] * this.field3480[10] * this.field3480[13] + (this.field3480[2] * this.field3480[7] * this.field3480[8] * this.field3480[13] + this.field3480[2] * this.field3480[5] * this.field3480[11] * this.field3480[12] + (this.field3480[2] * this.field3480[4] * this.field3480[9] * this.field3480[15] + this.field3480[1] * this.field3480[7] * this.field3480[10] * this.field3480[12] + (this.field3480[1] * this.field3480[6] * this.field3480[8] * this.field3480[15] + this.field3480[1] * this.field3480[4] * this.field3480[11] * this.field3480[14] + (this.field3480[0] * this.field3480[7] * this.field3480[9] * this.field3480[14] + this.field3480[0] * this.field3480[6] * this.field3480[11] * this.field3480[13] + (this.field3480[0] * this.field3480[5] * this.field3480[10] * this.field3480[15] - this.field3480[0] * this.field3480[5] * this.field3480[11] * this.field3480[14] - this.field3480[0] * this.field3480[6] * this.field3480[9] * this.field3480[15]) - this.field3480[0] * this.field3480[7] * this.field3480[10] * this.field3480[13] - this.field3480[1] * this.field3480[4] * this.field3480[10] * this.field3480[15]) - this.field3480[1] * this.field3480[6] * this.field3480[11] * this.field3480[12] - this.field3480[1] * this.field3480[7] * this.field3480[8] * this.field3480[14]) - this.field3480[2] * this.field3480[4] * this.field3480[11] * this.field3480[13] - this.field3480[2] * this.field3480[5] * this.field3480[8] * this.field3480[15]) - this.field3480[2] * this.field3480[7] * this.field3480[9] * this.field3480[12] - this.field3480[3] * this.field3480[4] * this.field3480[9] * this.field3480[14]) - this.field3480[3] * this.field3480[5] * this.field3480[10] * this.field3480[12] - this.field3480[3] * this.field3480[6] * this.field3480[8] * this.field3480[13]);
	}

	@ObfuscatedName("ka.t()V")
	public void method5387() {
		float var1 = 1.0F / this.method5386();
		float var2 = (this.field3480[7] * this.field3480[9] * this.field3480[14] + this.field3480[6] * this.field3480[11] * this.field3480[13] + (this.field3480[5] * this.field3480[10] * this.field3480[15] - this.field3480[5] * this.field3480[11] * this.field3480[14] - this.field3480[6] * this.field3480[9] * this.field3480[15]) - this.field3480[7] * this.field3480[10] * this.field3480[13]) * var1;
		float var3 = (this.field3480[3] * this.field3480[10] * this.field3480[13] + (this.field3480[2] * this.field3480[9] * this.field3480[15] + this.field3480[10] * -this.field3480[1] * this.field3480[15] + this.field3480[1] * this.field3480[11] * this.field3480[14] - this.field3480[2] * this.field3480[11] * this.field3480[13] - this.field3480[3] * this.field3480[9] * this.field3480[14])) * var1;
		float var4 = (this.field3480[3] * this.field3480[5] * this.field3480[14] + this.field3480[2] * this.field3480[7] * this.field3480[13] + (this.field3480[1] * this.field3480[6] * this.field3480[15] - this.field3480[1] * this.field3480[7] * this.field3480[14] - this.field3480[2] * this.field3480[5] * this.field3480[15]) - this.field3480[3] * this.field3480[6] * this.field3480[13]) * var1;
		float var5 = (this.field3480[3] * this.field3480[6] * this.field3480[9] + (this.field3480[2] * this.field3480[5] * this.field3480[11] + this.field3480[6] * -this.field3480[1] * this.field3480[11] + this.field3480[1] * this.field3480[7] * this.field3480[10] - this.field3480[2] * this.field3480[7] * this.field3480[9] - this.field3480[3] * this.field3480[5] * this.field3480[10])) * var1;
		float var6 = (this.field3480[7] * this.field3480[10] * this.field3480[12] + (this.field3480[6] * this.field3480[8] * this.field3480[15] + this.field3480[10] * -this.field3480[4] * this.field3480[15] + this.field3480[4] * this.field3480[11] * this.field3480[14] - this.field3480[6] * this.field3480[11] * this.field3480[12] - this.field3480[7] * this.field3480[8] * this.field3480[14])) * var1;
		float var7 = (this.field3480[3] * this.field3480[8] * this.field3480[14] + this.field3480[2] * this.field3480[11] * this.field3480[12] + (this.field3480[0] * this.field3480[10] * this.field3480[15] - this.field3480[0] * this.field3480[11] * this.field3480[14] - this.field3480[2] * this.field3480[8] * this.field3480[15]) - this.field3480[3] * this.field3480[10] * this.field3480[12]) * var1;
		float var8 = (this.field3480[3] * this.field3480[6] * this.field3480[12] + (this.field3480[2] * this.field3480[4] * this.field3480[15] + this.field3480[6] * -this.field3480[0] * this.field3480[15] + this.field3480[0] * this.field3480[7] * this.field3480[14] - this.field3480[2] * this.field3480[7] * this.field3480[12] - this.field3480[3] * this.field3480[4] * this.field3480[14])) * var1;
		float var9 = (this.field3480[3] * this.field3480[4] * this.field3480[10] + this.field3480[2] * this.field3480[7] * this.field3480[8] + (this.field3480[0] * this.field3480[6] * this.field3480[11] - this.field3480[0] * this.field3480[7] * this.field3480[10] - this.field3480[2] * this.field3480[4] * this.field3480[11]) - this.field3480[3] * this.field3480[6] * this.field3480[8]) * var1;
		float var10 = (this.field3480[7] * this.field3480[8] * this.field3480[13] + this.field3480[5] * this.field3480[11] * this.field3480[12] + (this.field3480[4] * this.field3480[9] * this.field3480[15] - this.field3480[4] * this.field3480[11] * this.field3480[13] - this.field3480[5] * this.field3480[8] * this.field3480[15]) - this.field3480[7] * this.field3480[9] * this.field3480[12]) * var1;
		float var11 = (this.field3480[3] * this.field3480[9] * this.field3480[12] + (this.field3480[1] * this.field3480[8] * this.field3480[15] + this.field3480[9] * -this.field3480[0] * this.field3480[15] + this.field3480[0] * this.field3480[11] * this.field3480[13] - this.field3480[1] * this.field3480[11] * this.field3480[12] - this.field3480[3] * this.field3480[8] * this.field3480[13])) * var1;
		float var12 = (this.field3480[3] * this.field3480[4] * this.field3480[13] + this.field3480[1] * this.field3480[7] * this.field3480[12] + (this.field3480[0] * this.field3480[5] * this.field3480[15] - this.field3480[0] * this.field3480[7] * this.field3480[13] - this.field3480[1] * this.field3480[4] * this.field3480[15]) - this.field3480[3] * this.field3480[5] * this.field3480[12]) * var1;
		float var13 = (this.field3480[3] * this.field3480[5] * this.field3480[8] + (this.field3480[1] * this.field3480[4] * this.field3480[11] + this.field3480[5] * -this.field3480[0] * this.field3480[11] + this.field3480[0] * this.field3480[7] * this.field3480[9] - this.field3480[1] * this.field3480[7] * this.field3480[8] - this.field3480[3] * this.field3480[4] * this.field3480[9])) * var1;
		float var14 = (this.field3480[6] * this.field3480[9] * this.field3480[12] + (this.field3480[5] * this.field3480[8] * this.field3480[14] + this.field3480[9] * -this.field3480[4] * this.field3480[14] + this.field3480[4] * this.field3480[10] * this.field3480[13] - this.field3480[5] * this.field3480[10] * this.field3480[12] - this.field3480[6] * this.field3480[8] * this.field3480[13])) * var1;
		float var15 = (this.field3480[2] * this.field3480[8] * this.field3480[13] + this.field3480[1] * this.field3480[10] * this.field3480[12] + (this.field3480[0] * this.field3480[9] * this.field3480[14] - this.field3480[0] * this.field3480[10] * this.field3480[13] - this.field3480[1] * this.field3480[8] * this.field3480[14]) - this.field3480[2] * this.field3480[9] * this.field3480[12]) * var1;
		float var16 = (this.field3480[2] * this.field3480[5] * this.field3480[12] + (this.field3480[1] * this.field3480[4] * this.field3480[14] + this.field3480[5] * -this.field3480[0] * this.field3480[14] + this.field3480[0] * this.field3480[6] * this.field3480[13] - this.field3480[1] * this.field3480[6] * this.field3480[12] - this.field3480[2] * this.field3480[4] * this.field3480[13])) * var1;
		float var17 = (this.field3480[2] * this.field3480[4] * this.field3480[9] + this.field3480[1] * this.field3480[6] * this.field3480[8] + (this.field3480[0] * this.field3480[5] * this.field3480[10] - this.field3480[0] * this.field3480[6] * this.field3480[9] - this.field3480[1] * this.field3480[4] * this.field3480[10]) - this.field3480[2] * this.field3480[5] * this.field3480[8]) * var1;
		this.field3480[0] = var2;
		this.field3480[1] = var3;
		this.field3480[2] = var4;
		this.field3480[3] = var5;
		this.field3480[4] = var6;
		this.field3480[5] = var7;
		this.field3480[6] = var8;
		this.field3480[7] = var9;
		this.field3480[8] = var10;
		this.field3480[9] = var11;
		this.field3480[10] = var12;
		this.field3480[11] = var13;
		this.field3480[12] = var14;
		this.field3480[13] = var15;
		this.field3480[14] = var16;
		this.field3480[15] = var17;
	}

	@ObfuscatedName("ka.l(FFFF)V")
	public void method5435(float arg0, float arg1, float arg2, float arg3) {
		this.field3480[0] = arg0;
		this.field3480[1] = 0.0F;
		this.field3480[2] = 0.0F;
		this.field3480[3] = 0.0F;
		this.field3480[4] = 0.0F;
		this.field3480[5] = arg1;
		this.field3480[6] = 0.0F;
		this.field3480[7] = 0.0F;
		this.field3480[8] = 0.0F;
		this.field3480[9] = 0.0F;
		this.field3480[10] = arg2;
		this.field3480[11] = 0.0F;
		this.field3480[12] = 0.0F;
		this.field3480[13] = 0.0F;
		this.field3480[14] = 0.0F;
		this.field3480[15] = arg3;
	}

	@ObfuscatedName("ka.f()Z")
	public boolean method5406() {
		return this.field3480[0] == 1.0F && this.field3480[1] == 0.0F && this.field3480[2] == 0.0F && this.field3480[3] == 0.0F && this.field3480[4] == 0.0F && this.field3480[5] == 1.0F && this.field3480[6] == 0.0F && this.field3480[7] == 0.0F && this.field3480[8] == 0.0F && this.field3480[9] == 0.0F && this.field3480[10] == 1.0F && this.field3480[11] == 0.0F && this.field3480[12] == 0.0F && this.field3480[13] == 0.0F && this.field3480[14] == 0.0F && this.field3480[15] == 1.0F;
	}

	@ObfuscatedName("ka.d(FFF[F)V")
	public void method5390(float arg0, float arg1, float arg2, float[] arg3) {
		arg3[0] = this.field3480[8] * arg2 + this.field3480[0] * arg0 + this.field3480[4] * arg1 + this.field3480[12];
		arg3[1] = this.field3480[9] * arg2 + this.field3480[1] * arg0 + this.field3480[5] * arg1 + this.field3480[13];
		arg3[2] = this.field3480[10] * arg2 + this.field3480[2] * arg0 + this.field3480[6] * arg1 + this.field3480[14];
		if (arg3.length > 3) {
			arg3[3] = this.field3480[11] * arg2 + this.field3480[3] * arg0 + this.field3480[7] * arg1 + this.field3480[15];
		}
	}

	@ObfuscatedName("ka.z([F)V")
	public void method5470(float[] arg0) {
		float var2 = arg0[0];
		float var3 = arg0[1];
		float var4 = arg0[2];
		arg0[0] = this.field3480[8] * var4 + this.field3480[0] * var2 + this.field3480[4] * var3 + this.field3480[12];
		arg0[1] = this.field3480[9] * var4 + this.field3480[1] * var2 + this.field3480[5] * var3 + this.field3480[13];
		arg0[2] = this.field3480[10] * var4 + this.field3480[2] * var2 + this.field3480[6] * var3 + this.field3480[14];
	}

	@ObfuscatedName("ka.n(FFF[F)V")
	public void method5392(float arg0, float arg1, float arg2, float[] arg3) {
		arg3[0] = this.field3480[8] * arg2 + this.field3480[0] * arg0 + this.field3480[4] * arg1;
		arg3[1] = this.field3480[9] * arg2 + this.field3480[1] * arg0 + this.field3480[5] * arg1;
		arg3[2] = this.field3480[10] * arg2 + this.field3480[2] * arg0 + this.field3480[6] * arg1;
		if (arg3.length > 3) {
			arg3[3] = this.field3480[11] * arg2 + this.field3480[3] * arg0 + this.field3480[7] * arg1;
		}
	}

	@ObfuscatedName("ka.o(FFFFFF)V")
	public void method5393(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.field3480[0] = 2.0F / (arg1 - arg0);
		this.field3480[1] = 0.0F;
		this.field3480[2] = 0.0F;
		this.field3480[3] = 0.0F;
		this.field3480[4] = 0.0F;
		this.field3480[5] = 2.0F / (arg3 - arg2);
		this.field3480[6] = 0.0F;
		this.field3480[7] = 0.0F;
		this.field3480[8] = 0.0F;
		this.field3480[9] = 0.0F;
		this.field3480[10] = 2.0F / (arg5 - arg4);
		this.field3480[11] = 0.0F;
		this.field3480[12] = -(arg0 + arg1) / (arg1 - arg0);
		this.field3480[13] = -(arg2 + arg3) / (arg3 - arg2);
		this.field3480[14] = -(arg4 + arg5) / (arg5 - arg4);
		this.field3480[15] = 1.0F;
	}

	@ObfuscatedName("ka.q(FFFF)V")
	public void method5394(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		float var6 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method5417(-var5, var5, -var6, var6, arg0, arg1);
	}

	@ObfuscatedName("ka.p(FFF)V")
	public void method5395(float arg0, float arg1, float arg2) {
		this.method5393(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@ObfuscatedName("ka.w(FFFFFF)V")
	public void method5417(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.field3480[0] = arg4 * 2.0F / (arg1 - arg0);
		this.field3480[1] = 0.0F;
		this.field3480[2] = 0.0F;
		this.field3480[3] = 0.0F;
		this.field3480[4] = 0.0F;
		this.field3480[5] = arg4 * 2.0F / (arg3 - arg2);
		this.field3480[6] = 0.0F;
		this.field3480[7] = 0.0F;
		this.field3480[8] = (arg0 + arg1) / (arg1 - arg0);
		this.field3480[9] = (arg2 + arg3) / (arg3 - arg2);
		this.field3480[10] = (arg4 + arg5) / (arg5 - arg4);
		this.field3480[11] = 1.0F;
		this.field3480[12] = 0.0F;
		this.field3480[13] = 0.0F;
		this.field3480[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.field3480[15] = 0.0F;
	}

	@ObfuscatedName("ka.b(FFFFFFFF)V")
	public void method5397(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
		this.field3480[0] = arg2 * 2.0F / arg6;
		this.field3480[1] = 0.0F;
		this.field3480[2] = 0.0F;
		this.field3480[3] = 0.0F;
		this.field3480[4] = 0.0F;
		this.field3480[5] = arg3 * 2.0F / arg7;
		this.field3480[6] = 0.0F;
		this.field3480[7] = 0.0F;
		this.field3480[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.field3480[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.field3480[10] = (arg4 + arg5) / (arg5 - arg4);
		this.field3480[11] = 1.0F;
		this.field3480[12] = 0.0F;
		this.field3480[13] = 0.0F;
		this.field3480[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.field3480[15] = 0.0F;
	}

	@ObfuscatedName("ka.x(FFFFFFFFF)V")
	public void method5398(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
		this.method5393(-(arg0 * arg8) / arg2, (arg6 - arg0) * arg8 / arg2, -(arg1 * arg8) / arg3, (arg7 - arg1) * arg8 / arg3, arg4, arg5);
	}

	@ObfuscatedName("ka.i()F")
	public float method5399() {
		return -(this.field3480[15] + this.field3480[14]) / (this.field3480[11] + this.field3480[10]);
	}

	@ObfuscatedName("ka.v()F")
	public float method5400() {
		return (this.field3480[14] - this.field3480[15]) / (this.field3480[11] - this.field3480[10]);
	}

	@ObfuscatedName("ka.k([F)[F")
	public float[] method5401(float[] arg0) {
		float var2 = this.field3480[3] + this.field3480[0];
		float var3 = this.field3480[7] + this.field3480[4];
		float var4 = this.field3480[11] + this.field3480[8];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field3480[15] + this.field3480[12]) / var5);
		return arg0;
	}

	@ObfuscatedName("ka.h([F)[F")
	public float[] method5434(float[] arg0) {
		float var2 = this.field3480[3] - this.field3480[0];
		float var3 = this.field3480[7] - this.field3480[4];
		float var4 = this.field3480[11] - this.field3480[8];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field3480[15] - this.field3480[12]) / var5);
		return arg0;
	}

	@ObfuscatedName("ka.r([F)[F")
	public float[] method5403(float[] arg0) {
		float var2 = this.field3480[3] + this.field3480[1];
		float var3 = this.field3480[7] + this.field3480[5];
		float var4 = this.field3480[11] + this.field3480[9];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field3480[15] + this.field3480[13]) / var5);
		return arg0;
	}

	@ObfuscatedName("ka.g([F)[F")
	public float[] method5459(float[] arg0) {
		float var2 = this.field3480[3] - this.field3480[1];
		float var3 = this.field3480[7] - this.field3480[5];
		float var4 = this.field3480[11] - this.field3480[9];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field3480[15] - this.field3480[13]) / var5);
		return arg0;
	}

	@ObfuscatedName("ka.y([F)[F")
	public float[] method5405(float[] arg0) {
		float var2 = this.field3480[3] + this.field3480[2];
		float var3 = this.field3480[7] + this.field3480[6];
		float var4 = this.field3480[11] + this.field3480[10];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field3480[15] + this.field3480[14]) / var5);
		return arg0;
	}

	@ObfuscatedName("ka.e([F)[F")
	public float[] method5460(float[] arg0) {
		float var2 = this.field3480[3] - this.field3480[2];
		float var3 = this.field3480[7] - this.field3480[6];
		float var4 = this.field3480[11] - this.field3480[10];
		double var5 = Math.sqrt((double) (var4 * var4 + var2 * var2 + var3 * var3));
		arg0[0] = (float) ((double) var2 / var5);
		arg0[1] = (float) ((double) var3 / var5);
		arg0[2] = (float) ((double) var4 / var5);
		arg0[3] = (float) ((double) (this.field3480[15] - this.field3480[14]) / var5);
		return arg0;
	}

	@ObfuscatedName("ka.ay()V")
	public void method5407() {
		float var1 = this.field3480[0];
		float var2 = this.field3480[4];
		float var3 = this.field3480[8];
		float var4 = this.field3480[12];
		float var5 = this.field3480[1];
		float var6 = this.field3480[5];
		float var7 = this.field3480[9];
		float var8 = this.field3480[13];
		float var9 = this.field3480[2];
		float var10 = this.field3480[6];
		float var11 = this.field3480[10];
		float var12 = this.field3480[14];
		float var13 = this.field3480[3];
		float var14 = this.field3480[7];
		float var15 = this.field3480[11];
		float var16 = this.field3480[15];
		this.field3480[0] = var1;
		this.field3480[1] = var2;
		this.field3480[2] = var3;
		this.field3480[3] = var4;
		this.field3480[4] = var5;
		this.field3480[5] = var6;
		this.field3480[6] = var7;
		this.field3480[7] = var8;
		this.field3480[8] = var9;
		this.field3480[9] = var10;
		this.field3480[10] = var11;
		this.field3480[11] = var12;
		this.field3480[12] = var13;
		this.field3480[13] = var14;
		this.field3480[14] = var15;
		this.field3480[15] = var16;
	}

	@ObfuscatedName("ka.af([F)[F")
	public float[] method5408(float[] arg0) {
		System.arraycopy(this.field3480, 0, arg0, 0, 16);
		return arg0;
	}

	@ObfuscatedName("ka.ar([F)[F")
	public float[] method5409(float[] arg0) {
		System.arraycopy(this.field3480, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@ObfuscatedName("ka.an([F)[F")
	public float[] method5410(float[] arg0) {
		arg0[0] = this.field3480[0];
		arg0[1] = this.field3480[1];
		arg0[2] = this.field3480[2];
		arg0[3] = this.field3480[4];
		arg0[4] = this.field3480[5];
		arg0[5] = this.field3480[6];
		arg0[6] = this.field3480[8];
		arg0[7] = this.field3480[9];
		arg0[8] = this.field3480[10];
		return arg0;
	}

	@ObfuscatedName("ka.ap([F)[F")
	public float[] method5411(float[] arg0) {
		arg0[0] = this.field3480[0];
		arg0[1] = this.field3480[4];
		arg0[2] = this.field3480[8];
		arg0[3] = this.field3480[12];
		arg0[4] = this.field3480[1];
		arg0[5] = this.field3480[5];
		arg0[6] = this.field3480[9];
		arg0[7] = this.field3480[13];
		arg0[8] = this.field3480[2];
		arg0[9] = this.field3480[6];
		arg0[10] = this.field3480[10];
		arg0[11] = this.field3480[14];
		arg0[12] = this.field3480[3];
		arg0[13] = this.field3480[7];
		arg0[14] = this.field3480[11];
		arg0[15] = this.field3480[15];
		return arg0;
	}

	@ObfuscatedName("ka.ag([F)[F")
	public float[] method5458(float[] arg0) {
		arg0[0] = this.field3480[0];
		arg0[1] = this.field3480[1];
		arg0[2] = this.field3480[4];
		arg0[3] = this.field3480[5];
		arg0[4] = this.field3480[8];
		arg0[5] = this.field3480[9];
		arg0[6] = this.field3480[12];
		arg0[7] = this.field3480[13];
		return arg0;
	}

	@ObfuscatedName("ka.as([F)[F")
	public float[] method5413(float[] arg0) {
		arg0[0] = this.field3480[0];
		arg0[1] = this.field3480[4];
		arg0[2] = this.field3480[8];
		arg0[3] = this.field3480[12];
		arg0[4] = this.field3480[1];
		arg0[5] = this.field3480[5];
		arg0[6] = this.field3480[9];
		arg0[7] = this.field3480[13];
		return arg0;
	}

	@ObfuscatedName("ka.ai([F)[F")
	public float[] method5414(float[] arg0) {
		arg0[0] = this.field3480[0];
		arg0[1] = this.field3480[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.field3480[4];
		arg0[5] = this.field3480[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.field3480[12];
		arg0[9] = this.field3480[13];
		arg0[10] = this.field3480[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@ObfuscatedName("ka.ao(IIIFFF)V")
	public void method5415(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5) {
		if (arg0 == 0) {
			this.field3480[0] = arg1;
			this.field3480[5] = arg2;
			this.field3480[10] = 1.0F;
			float[] var12 = this.field3480;
			float[] var13 = this.field3480;
			float[] var14 = this.field3480;
			float[] var15 = this.field3480;
			float[] var16 = this.field3480;
			this.field3480[9] = 0.0F;
			var16[8] = 0.0F;
			var15[6] = 0.0F;
			var14[4] = 0.0F;
			var13[2] = 0.0F;
			var12[1] = 0.0F;
		} else {
			float var7 = class313.field3449[arg0 & 0x3FFF];
			float var8 = class313.field3448[arg0 & 0x3FFF];
			this.field3480[0] = (float) arg1 * var7;
			this.field3480[5] = (float) arg2 * var7;
			this.field3480[1] = (float) arg1 * var8;
			this.field3480[4] = (float) arg2 * -var8;
			this.field3480[10] = 1.0F;
			float[] var9 = this.field3480;
			float[] var10 = this.field3480;
			float[] var11 = this.field3480;
			this.field3480[9] = 0.0F;
			var11[8] = 0.0F;
			var10[6] = 0.0F;
			var9[2] = 0.0F;
		}
		float[] var17 = this.field3480;
		float[] var18 = this.field3480;
		this.field3480[11] = 0.0F;
		var18[7] = 0.0F;
		var17[3] = 0.0F;
		this.field3480[15] = 1.0F;
		this.field3480[12] = arg3;
		this.field3480[13] = arg4;
		this.field3480[14] = arg5;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < 4; var3++) {
				if (var3 > 0) {
					var1.append("\t");
				}
				var1.append(this.field3480[var2 * 4 + var3]);
			}
			var1.append("\n");
		}
		return var1.toString();
	}

	public int hashCode() {
		byte var1 = 1;
		return var1 * 31 + Arrays.hashCode(this.field3480);
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof class320)) {
			return false;
		}
		class320 var2 = (class320) arg0;
		for (int var3 = 0; var3 < 16; var3++) {
			if (this.field3480[var3] != var2.field3480[var3]) {
				return false;
			}
		}
		return true;
	}
}
