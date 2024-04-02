package com.jagex;

import deob.ObfuscatedName;
import java.nio.ByteBuffer;

@ObfuscatedName("hx")
public class class235 {

	@ObfuscatedName("hx.u")
	public final class683 field2469;

	@ObfuscatedName("hx.j")
	public final class673 field2465;

	@ObfuscatedName("hx.a")
	public final int field2466;

	@ObfuscatedName("hx.s")
	public final int field2467;

	@ObfuscatedName("hx.c")
	public final byte[] field2468;

	@ObfuscatedName("hx.m")
	public final int field2472;

	@ObfuscatedName("hx.t")
	public final int field2470;

	@ObfuscatedName("hx.l")
	public final int field2471;

	@ObfuscatedName("hx.f")
	public class234[][] field2464;

	public class235(class683 arg0, class673 arg1) {
		this.field2469 = arg0;
		this.field2465 = arg1;
		this.field2466 = (this.field2465.field387 * 569721097 * this.field2465.field385 * 1570646497 >> this.field2469.field8326) + 2;
		this.field2467 = (this.field2465.field386 * -1903733271 * this.field2465.field385 * 1570646497 >> this.field2469.field8326) + 2;
		this.field2468 = new byte[this.field2467 * this.field2466];
		this.field2471 = this.field2469.field8326 + 7 - this.field2465.field388 * -452021343;
		this.field2472 = this.field2465.field387 * 569721097 >> this.field2471;
		this.field2470 = this.field2465.field386 * -1903733271 >> this.field2471;
	}

	@ObfuscatedName("hx.u()V")
	public void method4374() {
		this.field2464 = new class234[this.field2472][this.field2470];
		for (int var1 = 0; var1 < this.field2470; var1++) {
			for (int var2 = 0; var2 < this.field2472; var2++) {
				this.field2464[var2][var1] = new class234(this.field2469, this, this.field2465, var2, var1, this.field2471, var2 * 128 + 1, var1 * 128 + 1);
				if (this.field2464[var2][var1].field2449 == 0) {
					this.field2464[var2][var1] = null;
				}
			}
		}
	}

	@ObfuscatedName("hx.j(Lfq;III[[ZZ)V")
	public void method4375(class200 arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
		this.field2469.method526(false);
		float var7 = 1.0F / (float) (this.field2469.field8263 * 128);
		if (arg5) {
			for (int var8 = 0; var8 < this.field2470; var8++) {
				int var9 = var8 << this.field2471;
				int var10 = var8 + 1 << this.field2471;
				label144: for (int var11 = 0; var11 < this.field2472; var11++) {
					if (this.field2464[var11][var8] != null) {
						int var12 = var11 << this.field2471;
						int var13 = var11 + 1 << this.field2471;
						for (int var14 = var12; var14 < var13; var14++) {
							if (var14 - arg1 >= -arg3 && var14 - arg1 <= arg3) {
								for (int var15 = var9; var15 < var10; var15++) {
									if (var15 - arg2 >= -arg3 && var15 - arg2 <= arg3 && arg4[var14 - arg1 + arg3][var15 - arg2 + arg3]) {
										arg0.field2248.method5435(var7, var7, 1.0F, 1.0F);
										arg0.field2248.field3480[12] = -var11;
										arg0.field2248.field3480[13] = -var8;
										this.field2464[var11][var8].method4363(arg0);
										continue label144;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] var16 = new int[this.field2472 * this.field2470];
			ByteBuffer var17 = this.field2469.field8244;
			var17.clear();
			int var18 = 0;
			for (int var19 = 0; var19 < this.field2470; var19++) {
				int var20 = var19 << this.field2471;
				int var21 = var19 + 1 << this.field2471;
				for (int var22 = 0; var22 < this.field2472; var22++) {
					class234 var23 = this.field2464[var22][var19];
					int var24 = 0;
					if (var23 != null) {
						int var25 = var22 << this.field2471;
						int var26 = var22 + 1 << this.field2471;
						for (int var27 = var20; var27 < var21; var27++) {
							if (var27 - arg2 >= -arg3 && var27 - arg2 <= arg3) {
								int var28 = this.field2465.field387 * 569721097 * var27 + var25;
								for (int var29 = var25; var29 < var26; var29++) {
									if (var29 - arg1 >= -arg3 && var29 - arg1 <= arg3 && arg4[var29 - arg1 + arg3][var27 - arg2 + arg3]) {
										short[] var30 = this.field2465.field7724[var28];
										if (var30 != null) {
											for (int var31 = 0; var31 < var30.length; var31++) {
												var17.putShort(var30[var31]);
												var24++;
											}
										}
									}
									var28++;
								}
							}
						}
					}
					var16[var18] = var24;
					var18++;
				}
			}
			if (var17.position() != 0) {
				int var32 = var17.position();
				class258 var33 = this.field2469.method13559(var32 / 2);
				var33.method4452(0, var32, this.field2469.field8245);
				int var34 = 0;
				int var35 = 0;
				for (int var36 = 0; var36 < this.field2470; var36++) {
					for (int var37 = 0; var37 < this.field2472; var37++) {
						if (var16[var35] != 0) {
							arg0.field2248.method5435(var7, var7, 1.0F, 1.0F);
							arg0.field2248.field3480[12] = -var37;
							arg0.field2248.field3480[13] = -var36;
							this.field2464[var37][var36].method4371(arg0, var33, var34, var16[var35] / 3);
							var34 += var16[var35];
						}
						var35++;
					}
				}
			}
		}
		this.field2469.method526(true);
	}

	@ObfuscatedName("hx.a(Lna;II)V")
	public void method4381(class30 arg0, int arg1, int arg2) {
		class999 var4 = (class999) arg0;
		int var5 = var4.field10586 + 1 + arg1;
		int var6 = var4.field10585 + 1 + arg2;
		int var7 = this.field2466 * var6 + var5;
		int var8 = 0;
		int var9 = var4.field10583;
		int var10 = var4.field10584;
		int var11 = this.field2466 - var10;
		int var12 = 0;
		if (var6 <= 0) {
			int var13 = 1 - var6;
			var9 -= var13;
			var8 += var10 * var13;
			var7 += this.field2466 * var13;
			var6 = 1;
		}
		if (var6 + var9 >= this.field2467) {
			int var14 = var6 + var9 + 1 - this.field2467;
			var9 -= var14;
		}
		if (var5 <= 0) {
			int var15 = 1 - var5;
			var10 -= var15;
			var8 += var15;
			var7 += var15;
			var12 += var15;
			var11 += var15;
			var5 = 1;
		}
		if (var5 + var10 >= this.field2466) {
			int var16 = var5 + var10 + 1 - this.field2466;
			var10 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var10 > 0 && var9 > 0) {
			method4380(this.field2468, var4.field10581, var8, var7, var10, var9, var11, var12);
			this.method4379(var5, var6, var10, var9);
		}
	}

	@ObfuscatedName("hx.s(Lna;II)V")
	public void method4377(class30 arg0, int arg1, int arg2) {
		class999 var4 = (class999) arg0;
		int var5 = var4.field10586 + 1 + arg1;
		int var6 = var4.field10585 + 1 + arg2;
		int var7 = this.field2466 * var6 + var5;
		int var8 = 0;
		int var9 = var4.field10583;
		int var10 = var4.field10584;
		int var11 = this.field2466 - var10;
		int var12 = 0;
		if (var6 <= 0) {
			int var13 = 1 - var6;
			var9 -= var13;
			var8 += var10 * var13;
			var7 += this.field2466 * var13;
			var6 = 1;
		}
		if (var6 + var9 >= this.field2467) {
			int var14 = var6 + var9 + 1 - this.field2467;
			var9 -= var14;
		}
		if (var5 <= 0) {
			int var15 = 1 - var5;
			var10 -= var15;
			var8 += var15;
			var7 += var15;
			var12 += var15;
			var11 += var15;
			var5 = 1;
		}
		if (var5 + var10 >= this.field2466) {
			int var16 = var5 + var10 + 1 - this.field2466;
			var10 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var10 > 0 && var9 > 0) {
			method4390(this.field2468, var4.field10581, var8, var7, var10, var9, var11, var12);
			this.method4379(var5, var6, var10, var9);
		}
	}

	@ObfuscatedName("hx.c(Lna;II)Z")
	public boolean method4378(class30 arg0, int arg1, int arg2) {
		class999 var4 = (class999) arg0;
		int var5 = var4.field10586 + 1 + arg1;
		int var6 = var4.field10585 + 1 + arg2;
		int var7 = this.field2466 * var6 + var5;
		int var8 = var4.field10583;
		int var9 = var4.field10584;
		int var10 = this.field2466 - var9;
		if (var6 <= 0) {
			int var11 = 1 - var6;
			var8 -= var11;
			var7 += this.field2466 * var11;
			var6 = 1;
		}
		if (var6 + var8 >= this.field2467) {
			int var12 = var6 + var8 + 1 - this.field2467;
			var8 -= var12;
		}
		if (var5 <= 0) {
			int var13 = 1 - var5;
			var9 -= var13;
			var7 += var13;
			var10 += var13;
			var5 = 1;
		}
		if (var5 + var9 >= this.field2466) {
			int var14 = var5 + var9 + 1 - this.field2466;
			var9 -= var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			byte var15 = 8;
			int var16 = (var15 - 1) * this.field2466 + var10;
			return method4382(this.field2468, var7, var9, var8, var16, var15);
		} else {
			return false;
		}
	}

	@ObfuscatedName("hx.m(IIII)V")
	public void method4379(int arg0, int arg1, int arg2, int arg3) {
		if (this.field2464 == null) {
			return;
		}
		int var5 = arg0 - 1 >> 7;
		int var6 = arg0 - 1 + arg2 - 1 >> 7;
		int var7 = arg1 - 1 >> 7;
		int var8 = arg1 - 1 + arg3 - 1 >> 7;
		for (int var9 = var5; var9 <= var6; var9++) {
			class234[] var10 = this.field2464[var9];
			for (int var11 = var7; var11 <= var8; var11++) {
				if (var10[var11] != null) {
					var10[var11].field2455 = true;
				}
			}
		}
	}

	@ObfuscatedName("hx.t([B[BIIIIII)V")
	public static final void method4380(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var9 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			int var10001;
			for (int var11 = var8; var11 < 0; var11++) {
				var10001 = arg3++;
				arg0[var10001] += arg1[arg2++];
				int var13 = arg3++;
				arg0[var13] += arg1[arg2++];
				int var14 = arg3++;
				arg0[var14] += arg1[arg2++];
				int var15 = arg3++;
				arg0[var15] += arg1[arg2++];
			}
			for (int var12 = var9; var12 < 0; var12++) {
				var10001 = arg3++;
				arg0[var10001] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("hx.l([B[BIIIIII)V")
	public static final void method4390(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var9 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			int var10001;
			for (int var11 = var8; var11 < 0; var11++) {
				var10001 = arg3++;
				arg0[var10001] -= arg1[arg2++];
				int var13 = arg3++;
				arg0[var13] -= arg1[arg2++];
				int var14 = arg3++;
				arg0[var14] -= arg1[arg2++];
				int var15 = arg3++;
				arg0[var15] -= arg1[arg2++];
			}
			for (int var12 = var9; var12 < 0; var12++) {
				var10001 = arg3++;
				arg0[var10001] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("hx.f([BIIIII)Z")
	public static final boolean method4382(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg2 % arg5;
		int var7;
		if (var6 == 0) {
			var7 = 0;
		} else {
			var7 = arg5 - var6;
		}
		int var8 = -((arg3 + arg5 - 1) / arg5);
		int var9 = -((arg2 + arg5 - 1) / arg5);
		for (int var10 = var8; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			int var12 = arg1 - var7;
			if (arg0[var12 - 1] == 0) {
				return true;
			}
			arg1 = arg4 + var12;
		}
		return false;
	}
}
