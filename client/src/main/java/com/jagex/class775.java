package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("acj")
public class class775 extends class399 {

	@ObfuscatedName("acj.s")
	public final int field9314;

	@ObfuscatedName("acj.c")
	public final int field9315;

	@ObfuscatedName("acj.m")
	public int field9316;

	@ObfuscatedName("acj.t")
	public boolean field9317;

	@ObfuscatedName("acj.l")
	public int[] field9318;

	public class775(int arg0, int arg1, int[] arg2, boolean arg3) {
		this.field9314 = arg0;
		this.field9315 = arg1;
		this.field9318 = arg2;
		if (arg3) {
			int[] var5 = new int[this.field9315];
			int[] var6 = new int[this.field9315];
			int[] var7 = new int[this.field9315];
			int[] var8 = new int[this.field9315];
			if (Statics.field9319 == null || Statics.field9319.length != this.field9318.length) {
				Statics.field9319 = new int[this.field9318.length];
			}
			int var9 = this.field9315;
			int var10 = this.field9315;
			int var11 = var9 - 1;
			int var12 = var10 - 1;
			int var13 = var9 * var10;
			int var14 = var9;
			int var15 = var9;
			for (int var16 = 2; var16 >= 0; var16--) {
				for (int var17 = var11; var17 >= 0; var17--) {
					var14--;
					int var18 = this.field9318[var14];
					var5[var17] += var18 >> 24 & 0xFF;
					var6[var17] += var18 >> 16 & 0xFF;
					var7[var17] += var18 >> 8 & 0xFF;
					var8[var17] += var18 & 0xFF;
				}
				if (var14 == 0) {
					var14 = var13;
				}
			}
			int var19 = var13;
			for (int var20 = var12; var20 >= 0; var20--) {
				int var21 = 1;
				int var22 = 1;
				int var23 = 0;
				int var24 = 0;
				int var25 = 0;
				int var26 = 0;
				for (int var27 = 2; var27 >= 0; var27--) {
					var22--;
					var26 += var5[var22];
					var25 += var6[var22];
					var23 += var7[var22];
					var24 += var8[var22];
					if (var22 == 0) {
						var22 = var9;
					}
				}
				for (int var28 = var11; var28 >= 0; var28--) {
					var22--;
					var21--;
					int var29 = var26 / 9;
					int var30 = var25 / 9;
					int var31 = var23 / 9;
					int var32 = var24 / 9;
					var19--;
					Statics.field9319[var19] = var29 << 24 | var30 << 16 | var31 << 8 | var32;
					var26 += var5[var22] - var5[var21];
					var25 += var6[var22] - var6[var21];
					var24 += var8[var22] - var8[var21];
					var23 += var7[var22] - var7[var21];
					if (var22 == 0) {
						var22 = var9;
					}
					if (var21 == 0) {
						var21 = var9;
					}
				}
				for (int var33 = var11; var33 >= 0; var33--) {
					var14--;
					int var34 = this.field9318[var14];
					var15--;
					int var35 = this.field9318[var15];
					var5[var33] += (var34 >> 24 & 0xFF) - (var35 >> 24 & 0xFF);
					var6[var33] += (var34 >> 16 & 0xFF) - (var35 >> 16 & 0xFF);
					var7[var33] += (var34 >> 8 & 0xFF) - (var35 >> 8 & 0xFF);
					var8[var33] += (var34 & 0xFF) - (var35 & 0xFF);
				}
				if (var14 == 0) {
					var14 = var13;
				}
				if (var15 == 0) {
					var15 = var13;
				}
			}
			int[] var36 = this.field9318;
			this.field9318 = Statics.field9319;
			Statics.field9319 = var36;
		}
	}

	@ObfuscatedName("acj.u()[I")
	public int[] method14814() {
		return this.field9318;
	}

	@ObfuscatedName("acj.j(II)V")
	public void method14815(int arg0, int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (Statics.field9319 == null || Statics.field9319.length != this.field9318.length) {
			Statics.field9319 = new int[this.field9318.length];
		}
		int var3 = this.field9318.length;
		int var4 = arg0;
		int var5 = this.field9315 - 1;
		int var6 = this.field9315 * arg1;
		int var7 = var3 - 1;
		for (int var8 = 0; var8 < var3; var8 += this.field9315) {
			int var9 = var6 + var8 & var7;
			for (int var10 = 0; var10 < this.field9315; var10++) {
				int var11 = var8 + var10;
				int var12 = (var4 + var10 & var5) + var9;
				Statics.field9319[var11] = this.field9318[var12];
			}
		}
		int[] var13 = this.field9318;
		this.field9318 = Statics.field9319;
		Statics.field9319 = var13;
	}
}
