package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zv")
public class class685 extends class140 {

	@ObfuscatedName("zv.u")
	public int field8415;

	@ObfuscatedName("zv.j")
	public int field8409;

	@ObfuscatedName("zv.a")
	public int field8413;

	@ObfuscatedName("zv.s")
	public int field8411;

	@ObfuscatedName("zv.c")
	public int field8412;

	@ObfuscatedName("zv.m")
	public int field8414;

	@ObfuscatedName("zv.t")
	public int[] field8410;

	@ObfuscatedName("zv.l")
	public byte[] field8408;

	@ObfuscatedName("zv.f")
	public byte[] field8416;

	@ObfuscatedName("zv.u()Z")
	public boolean method2749() {
		return true;
	}

	@ObfuscatedName("zv.j()Z")
	public boolean method2720() {
		return this.field8416 != null;
	}

	@ObfuscatedName("zv.a()I")
	public int method2721() {
		return this.field8415;
	}

	@ObfuscatedName("zv.s()I")
	public int method2763() {
		return this.field8409;
	}

	@ObfuscatedName("zv.d()I")
	public int method2762() {
		return this.field8415 + this.field8413 + this.field8411;
	}

	@ObfuscatedName("zv.z()I")
	public int method2728() {
		return this.field8412 + this.field8409 + this.field8414;
	}

	@ObfuscatedName("zv.c()I")
	public int method2722() {
		return this.field8413;
	}

	@ObfuscatedName("zv.m()I")
	public int method2732() {
		return this.field8411;
	}

	@ObfuscatedName("zv.t()I")
	public int method2724() {
		return this.field8412;
	}

	@ObfuscatedName("zv.l()I")
	public int method2734() {
		return this.field8414;
	}

	@ObfuscatedName("zv.f()V")
	public void method2776() {
		this.field8414 = 0;
		this.field8412 = 0;
		this.field8411 = 0;
		this.field8413 = 0;
	}

	@ObfuscatedName("zv.n(I)V")
	public void method2729(int arg0) {
		int var2 = this.method2762();
		int var3 = this.method2728();
		if (this.field8415 == var2 && this.field8409 == var3) {
			return;
		}
		int var4 = arg0;
		if (arg0 > this.field8413) {
			var4 = this.field8413;
		}
		int var5 = arg0;
		if (this.field8413 + arg0 + this.field8415 > var2) {
			var5 = var2 - this.field8413 - this.field8415;
		}
		int var6 = arg0;
		if (arg0 > this.field8412) {
			var6 = this.field8412;
		}
		int var7 = arg0;
		if (this.field8412 + arg0 + this.field8409 > var3) {
			var7 = var3 - this.field8412 - this.field8409;
		}
		int var8 = this.field8415 + var4 + var5;
		int var9 = this.field8409 + var6 + var7;
		byte[] var10 = new byte[var8 * var9];
		if (this.field8416 == null) {
			for (int var11 = 0; var11 < this.field8409; var11++) {
				int var12 = this.field8415 * var11;
				int var13 = (var6 + var11) * var8 + var4;
				for (int var14 = 0; var14 < this.field8415; var14++) {
					var10[var13++] = this.field8408[var12++];
				}
			}
		} else {
			byte[] var15 = new byte[var8 * var9];
			for (int var16 = 0; var16 < this.field8409; var16++) {
				int var17 = this.field8415 * var16;
				int var18 = (var6 + var16) * var8 + var4;
				for (int var19 = 0; var19 < this.field8415; var19++) {
					var15[var18] = this.field8416[var17];
					var10[var18++] = this.field8408[var17++];
				}
			}
			this.field8416 = var15;
		}
		this.field8413 -= var4;
		this.field8412 -= var6;
		this.field8411 -= var5;
		this.field8414 -= var7;
		this.field8415 = var8;
		this.field8409 = var9;
		this.field8408 = var10;
	}

	@ObfuscatedName("zv.o(I)V")
	public void method2730(int arg0) {
		int var2 = -1;
		if (this.field8410.length < 255) {
			for (int var3 = 0; var3 < this.field8410.length; var3++) {
				if (this.field8410[var3] == arg0) {
					var2 = var3;
					break;
				}
			}
			if (var2 == -1) {
				var2 = this.field8410.length;
				int[] var4 = new int[this.field8410.length + 1];
				System.arraycopy(this.field8410, 0, var4, 0, this.field8410.length);
				this.field8410 = var4;
				var4[var2] = arg0;
			}
		} else {
			int var5 = Integer.MAX_VALUE;
			int var6 = arg0 >> 16 & 0xFF;
			int var7 = arg0 >> 8 & 0xFF;
			int var8 = arg0 & 0xFF;
			for (int var9 = 0; var9 < this.field8410.length; var9++) {
				int var10 = this.field8410[var9];
				int var11 = var10 >> 16 & 0xFF;
				int var12 = var10 >> 8 & 0xFF;
				int var13 = var10 & 0xFF;
				int var14 = var6 - var11;
				if (var14 < 0) {
					var14 = -var14;
				}
				int var15 = var7 - var12;
				if (var15 < 0) {
					var15 = -var15;
				}
				int var16 = var8 - var13;
				if (var16 < 0) {
					var16 = -var16;
				}
				int var17 = var14 + var15 + var16;
				if (var17 < var5) {
					var5 = var17;
					var2 = var9;
				}
			}
		}
		int var18 = 0;
		byte[] var19 = new byte[this.field8415 * this.field8409];
		for (int var20 = 0; var20 < this.field8409; var20++) {
			for (int var21 = 0; var21 < this.field8415; var21++) {
				int var22 = this.field8408[var18] & 0xFF;
				if (this.field8410[var22] == 0) {
					if (var21 > 0 && this.field8410[this.field8408[var18 - 1] & 0xFF] != 0) {
						var22 = var2;
					} else if (var20 > 0 && this.field8410[this.field8408[var18 - this.field8415] & 0xFF] != 0) {
						var22 = var2;
					} else if (var21 < this.field8415 - 1 && this.field8410[this.field8408[var18 + 1] & 0xFF] != 0) {
						var22 = var2;
					} else if (var20 < this.field8409 - 1 && this.field8410[this.field8408[this.field8415 + var18] & 0xFF] != 0) {
						var22 = var2;
					}
				}
				var19[var18++] = (byte) var22;
			}
		}
		this.field8408 = var19;
	}

	@ObfuscatedName("zv.q(I)V")
	public void method2731(int arg0) {
		int var2 = -1;
		if (this.field8410.length < 255) {
			for (int var3 = 0; var3 < this.field8410.length; var3++) {
				if (this.field8410[var3] == arg0) {
					var2 = var3;
					break;
				}
			}
			if (var2 == -1) {
				var2 = this.field8410.length;
				int[] var4 = new int[this.field8410.length + 1];
				System.arraycopy(this.field8410, 0, var4, 0, this.field8410.length);
				this.field8410 = var4;
				var4[var2] = arg0;
			}
		} else {
			int var5 = Integer.MAX_VALUE;
			int var6 = arg0 >> 16 & 0xFF;
			int var7 = arg0 >> 8 & 0xFF;
			int var8 = arg0 & 0xFF;
			for (int var9 = 0; var9 < this.field8410.length; var9++) {
				int var10 = this.field8410[var9];
				int var11 = var10 >> 16 & 0xFF;
				int var12 = var10 >> 8 & 0xFF;
				int var13 = var10 & 0xFF;
				int var14 = var6 - var11;
				if (var14 < 0) {
					var14 = -var14;
				}
				int var15 = var7 - var12;
				if (var15 < 0) {
					var15 = -var15;
				}
				int var16 = var8 - var13;
				if (var16 < 0) {
					var16 = -var16;
				}
				int var17 = var14 + var15 + var16;
				if (var17 < var5) {
					var5 = var17;
					var2 = var9;
				}
			}
		}
		for (int var18 = this.field8409 - 1; var18 > 0; var18--) {
			int var19 = this.field8415 * var18;
			for (int var20 = this.field8415 - 1; var20 > 0; var20--) {
				if (this.field8410[this.field8408[var19 + var20] & 0xFF] == 0 && this.field8410[this.field8408[var19 + var20 - 1 - this.field8415] & 0xFF] != 0) {
					this.field8408[var19 + var20] = (byte) var2;
				}
			}
		}
	}

	@ObfuscatedName("zv.p()V")
	public void method2757() {
		byte[] var1 = this.field8408;
		if (this.field8416 == null) {
			for (int var2 = this.field8409 - 1; var2 >= 0; var2--) {
				int var3 = this.field8415 * var2;
				int var4 = (var2 + 1) * this.field8415;
				while (var3 < var4) {
					var4--;
					byte var5 = var1[var3];
					var1[var3] = var1[var4];
					var1[var4] = var5;
					var3++;
				}
			}
		} else {
			byte[] var6 = this.field8416;
			for (int var7 = this.field8409 - 1; var7 >= 0; var7--) {
				int var8 = this.field8415 * var7;
				int var9 = (var7 + 1) * this.field8415;
				while (var8 < var9) {
					var9--;
					byte var10 = var1[var8];
					var1[var8] = var1[var9];
					var1[var9] = var10;
					byte var11 = var6[var8];
					var6[var8] = var6[var9];
					var6[var9] = var11;
					var8++;
				}
			}
		}
		int var12 = this.field8413;
		this.field8413 = this.field8411;
		this.field8411 = var12;
	}

	@ObfuscatedName("zv.w()V")
	public void method2778() {
		byte[] var1 = this.field8408;
		if (this.field8416 == null) {
			for (int var2 = (this.field8409 >> 1) - 1; var2 >= 0; var2--) {
				int var3 = this.field8415 * var2;
				int var4 = (this.field8409 - var2 - 1) * this.field8415;
				for (int var5 = -this.field8415; var5 < 0; var5++) {
					byte var6 = var1[var3];
					var1[var3] = var1[var4];
					var1[var4] = var6;
					var3++;
					var4++;
				}
			}
		} else {
			byte[] var7 = this.field8416;
			for (int var8 = (this.field8409 >> 1) - 1; var8 >= 0; var8--) {
				int var9 = this.field8415 * var8;
				int var10 = (this.field8409 - var8 - 1) * this.field8415;
				for (int var11 = -this.field8415; var11 < 0; var11++) {
					byte var12 = var1[var9];
					var1[var9] = var1[var10];
					var1[var10] = var12;
					byte var13 = var7[var9];
					var7[var9] = var7[var10];
					var7[var10] = var13;
					var9++;
					var10++;
				}
			}
		}
		int var14 = this.field8412;
		this.field8412 = this.field8414;
		this.field8414 = var14;
	}

	@ObfuscatedName("zv.b()V")
	public void method2733() {
		byte[] var1 = new byte[this.field8415 * this.field8409];
		int var2 = 0;
		if (this.field8416 == null) {
			for (int var3 = 0; var3 < this.field8415; var3++) {
				for (int var4 = this.field8409 - 1; var4 >= 0; var4--) {
					var1[var2++] = this.field8408[this.field8415 * var4 + var3];
				}
			}
			this.field8408 = var1;
		} else {
			byte[] var5 = new byte[this.field8415 * this.field8409];
			for (int var6 = 0; var6 < this.field8415; var6++) {
				for (int var7 = this.field8409 - 1; var7 >= 0; var7--) {
					var1[var2] = this.field8408[this.field8415 * var7 + var6];
					var5[var2++] = this.field8416[this.field8415 * var7 + var6];
				}
			}
			this.field8408 = var1;
			this.field8416 = var5;
		}
		int var8 = this.field8412;
		this.field8412 = this.field8413;
		this.field8413 = this.field8414;
		this.field8414 = this.field8411;
		this.field8411 = this.field8412;
		int var9 = this.field8409;
		this.field8409 = this.field8415;
		this.field8415 = var9;
	}

	@ObfuscatedName("zv.x(Z)[I")
	public int[] method2735(boolean arg0) {
		int[] var3;
		if (arg0) {
			int var2 = this.method2762();
			var3 = new int[var2 * this.method2728()];
			if (this.field8416 == null) {
				for (int var8 = 0; var8 < this.field8409; var8++) {
					int var9 = this.field8415 * var8;
					int var10 = (this.field8412 + var8) * var2 + this.field8413;
					for (int var11 = 0; var11 < this.field8415; var11++) {
						int var12 = this.field8410[this.field8408[var9++] & 0xFF];
						if (var12 == 0) {
							var3[var10++] = 0;
						} else {
							var3[var10++] = var12 | 0xFF000000;
						}
					}
				}
			} else {
				for (int var4 = 0; var4 < this.field8409; var4++) {
					int var5 = this.field8415 * var4;
					int var6 = (this.field8412 + var4) * var2 + this.field8413;
					for (int var7 = 0; var7 < this.field8415; var7++) {
						var3[var6++] = this.field8416[var5] << 24 | this.field8410[this.field8408[var5] & 0xFF];
						var5++;
					}
				}
			}
		} else {
			var3 = new int[this.field8415 * this.field8409];
			int var13 = 0;
			int var14 = 0;
			if (this.field8416 == null) {
				for (int var17 = 0; var17 < this.field8409; var17++) {
					for (int var18 = 0; var18 < this.field8415; var18++) {
						int var19 = this.field8410[this.field8408[var13++] & 0xFF];
						var3[var14++] = var19 == 0 ? 0 : var19 | 0xFF000000;
					}
				}
			} else {
				for (int var15 = 0; var15 < this.field8409; var15++) {
					for (int var16 = 0; var16 < this.field8415; var16++) {
						var3[var14++] = this.field8416[var13] << 24 | this.field8410[this.field8408[var13] & 0xFF];
						var13++;
					}
				}
			}
		}
		return var3;
	}

	@ObfuscatedName("zv.i(III)V")
	public void method2719(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.field8410.length; var4++) {
			if (this.field8410[var4] != 1 && this.field8410[var4] != 16711935) {
				int var5 = this.field8410[var4] >> 16 & 0xFF;
				int var6 = arg0 + var5;
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > 255) {
					var6 = 255;
				}
				int var7 = this.field8410[var4] >> 8 & 0xFF;
				int var8 = arg1 + var7;
				if (var8 < 0) {
					var8 = 0;
				} else if (var8 > 255) {
					var8 = 255;
				}
				int var9 = this.field8410[var4] >> 0 & 0xFF;
				int var10 = arg2 + var9;
				if (var10 < 0) {
					var10 = 0;
				} else if (var10 > 255) {
					var10 = 255;
				}
				this.field8410[var4] = var6 << 16 | var8 << 8 | var10;
			}
		}
	}

	@ObfuscatedName("zv.v(II)I")
	public int method2737(int arg0, int arg1) {
		return this.field8410[this.field8408[this.field8415 * arg1 + arg0] & 0xFF];
	}
}
