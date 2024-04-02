
import deob.ObfuscatedName;

@ObfuscatedName("yi")
public class class684 extends class140 {

	@ObfuscatedName("yi.u")
	public int field8407;

	@ObfuscatedName("yi.j")
	public int field8405;

	@ObfuscatedName("yi.a")
	public int field8402;

	@ObfuscatedName("yi.s")
	public int field8403;

	@ObfuscatedName("yi.c")
	public int field8404;

	@ObfuscatedName("yi.m")
	public int field8400;

	@ObfuscatedName("yi.t")
	public int[] field8406;

	@ObfuscatedName("yi.l")
	public boolean field8401;

	public class684(int arg0, int arg1, int[] arg2) {
		this.field8407 = arg0;
		this.field8405 = arg1;
		this.field8406 = arg2;
	}

	@ObfuscatedName("yi.u()Z")
	public boolean method2749() {
		return false;
	}

	@ObfuscatedName("yi.j()Z")
	public boolean method2720() {
		return this.field8401;
	}

	@ObfuscatedName("yi.a()I")
	public int method2721() {
		return this.field8407;
	}

	@ObfuscatedName("yi.s()I")
	public int method2763() {
		return this.field8405;
	}

	@ObfuscatedName("yi.d()I")
	public int method2762() {
		return this.field8407 + this.field8402 + this.field8403;
	}

	@ObfuscatedName("yi.z()I")
	public int method2728() {
		return this.field8405 + this.field8404 + this.field8400;
	}

	@ObfuscatedName("yi.c()I")
	public int method2722() {
		return this.field8402;
	}

	@ObfuscatedName("yi.m()I")
	public int method2732() {
		return this.field8403;
	}

	@ObfuscatedName("yi.t()I")
	public int method2724() {
		return this.field8404;
	}

	@ObfuscatedName("yi.l()I")
	public int method2734() {
		return this.field8400;
	}

	@ObfuscatedName("yi.f()V")
	public void method2776() {
		this.field8400 = 0;
		this.field8404 = 0;
		this.field8403 = 0;
		this.field8402 = 0;
	}

	@ObfuscatedName("yi.n(I)V")
	public void method2729(int arg0) {
		int var2 = this.method2762();
		int var3 = this.method2728();
		if (this.field8407 == var2 && this.field8405 == var3) {
			return;
		}
		int var4 = arg0;
		if (arg0 > this.field8402) {
			var4 = this.field8402;
		}
		int var5 = arg0;
		if (this.field8402 + arg0 + this.field8407 > var2) {
			var5 = var2 - this.field8402 - this.field8407;
		}
		int var6 = arg0;
		if (arg0 > this.field8404) {
			var6 = this.field8404;
		}
		int var7 = arg0;
		if (this.field8404 + arg0 + this.field8405 > var3) {
			var7 = var3 - this.field8404 - this.field8405;
		}
		int var8 = this.field8407 + var4 + var5;
		int var9 = this.field8405 + var6 + var7;
		int[] var10 = new int[var8 * var9];
		for (int var11 = 0; var11 < this.field8405; var11++) {
			int var12 = this.field8407 * var11;
			int var13 = (var6 + var11) * var8 + var4;
			for (int var14 = 0; var14 < this.field8407; var14++) {
				var10[var13++] = this.field8406[var12++];
			}
		}
		this.field8402 -= var4;
		this.field8404 -= var6;
		this.field8403 -= var5;
		this.field8400 -= var7;
		this.field8407 = var8;
		this.field8405 = var9;
		this.field8406 = var10;
	}

	@ObfuscatedName("yi.o(I)V")
	public void method2730(int arg0) {
		int var2 = 0;
		int[] var3 = new int[this.field8407 * this.field8405];
		for (int var4 = 0; var4 < this.field8405; var4++) {
			for (int var5 = 0; var5 < this.field8407; var5++) {
				int var6 = this.field8406[var2];
				if ((var6 & 0xFF000000) == 0) {
					if (var5 > 0 && (this.field8406[var2 - 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 > 0 && (this.field8406[var2 - this.field8407] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var5 < this.field8407 - 1 && (this.field8406[var2 + 1] & 0xFF000000) != 0) {
						var6 = arg0;
					} else if (var4 < this.field8405 - 1 && (this.field8406[this.field8407 + var2] & 0xFF000000) != 0) {
						var6 = arg0;
					}
				}
				var3[var2++] = var6;
			}
		}
		this.field8406 = var3;
	}

	@ObfuscatedName("yi.q(I)V")
	public void method2731(int arg0) {
		for (int var2 = this.field8405 - 1; var2 > 0; var2--) {
			int var3 = this.field8407 * var2;
			for (int var4 = this.field8407 - 1; var4 > 0; var4--) {
				if ((this.field8406[var3 + var4] & 0xFF000000) == 0 && (this.field8406[var3 + var4 - 1 - this.field8407] & 0xFF000000) != 0) {
					this.field8406[var3 + var4] = arg0;
				}
			}
		}
	}

	@ObfuscatedName("yi.p()V")
	public void method2757() {
		int[] var1 = this.field8406;
		for (int var2 = this.field8405 - 1; var2 >= 0; var2--) {
			int var3 = this.field8407 * var2;
			int var4 = (var2 + 1) * this.field8407;
			while (var3 < var4) {
				var4--;
				int var5 = var1[var3];
				var1[var3] = var1[var4];
				var1[var4] = var5;
				var3++;
			}
		}
		int var6 = this.field8402;
		this.field8402 = this.field8403;
		this.field8403 = var6;
	}

	@ObfuscatedName("yi.w()V")
	public void method2778() {
		int[] var1 = this.field8406;
		for (int var2 = (this.field8405 >> 1) - 1; var2 >= 0; var2--) {
			int var3 = this.field8407 * var2;
			int var4 = (this.field8405 - var2 - 1) * this.field8407;
			for (int var5 = -this.field8407; var5 < 0; var5++) {
				int var6 = var1[var3];
				var1[var3] = var1[var4];
				var1[var4] = var6;
				var3++;
				var4++;
			}
		}
		int var7 = this.field8404;
		this.field8404 = this.field8400;
		this.field8400 = var7;
	}

	@ObfuscatedName("yi.b()V")
	public void method2733() {
		int[] var1 = new int[this.field8407 * this.field8405];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field8407; var3++) {
			for (int var4 = this.field8405 - 1; var4 >= 0; var4--) {
				var1[var2++] = this.field8406[this.field8407 * var4 + var3];
			}
		}
		this.field8406 = var1;
		int var5 = this.field8404;
		this.field8404 = this.field8402;
		this.field8402 = this.field8400;
		this.field8400 = this.field8403;
		this.field8403 = this.field8404;
		int var6 = this.field8405;
		this.field8405 = this.field8407;
		this.field8407 = var6;
	}

	@ObfuscatedName("yi.x(Z)[I")
	public int[] method2735(boolean arg0) {
		if (!arg0 || this.method2762() == this.field8407 && this.method2728() == this.field8405) {
			return this.field8406;
		}
		int var2 = this.method2762();
		int[] var3 = new int[var2 * this.method2728()];
		for (int var4 = 0; var4 < this.field8405; var4++) {
			int var5 = this.field8407 * var4;
			int var6 = (this.field8404 + var4) * var2 + this.field8402;
			for (int var7 = 0; var7 < this.field8407; var7++) {
				var3[var6++] = this.field8406[var5];
				var5++;
			}
		}
		return var3;
	}

	@ObfuscatedName("yi.i(III)V")
	public void method2719(int arg0, int arg1, int arg2) {
		for (int var4 = 1; var4 < this.field8406.length; var4++) {
			int var5 = this.field8406[var4] >> 16 & 0xFF;
			int var6 = arg0 + var5;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.field8406[var4] >> 8 & 0xFF;
			int var8 = arg1 + var7;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 255) {
				var8 = 255;
			}
			int var9 = this.field8406[var4] >> 0 & 0xFF;
			int var10 = arg2 + var9;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 255) {
				var10 = 255;
			}
			this.field8406[var4] = this.field8406[var4] & 0xFF000000 | var6 << 16 | var8 << 8 | var10;
		}
	}

	@ObfuscatedName("yi.v(II)I")
	public int method2737(int arg0, int arg1) {
		return this.field8406[this.field8407 * arg1 + arg0];
	}
}
