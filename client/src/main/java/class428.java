
import deob.ObfuscatedName;

@ObfuscatedName("od")
public class class428 {

	@ObfuscatedName("od.u")
	public boolean field4624 = true;

	@ObfuscatedName("od.j")
	public boolean field4613 = true;

	@ObfuscatedName("od.m")
	public class423 field4605;

	@ObfuscatedName("od.t")
	public class422 field4606;

	@ObfuscatedName("od.l")
	public boolean field4607 = false;

	@ObfuscatedName("od.f")
	public int field4608;

	@ObfuscatedName("od.d")
	public int field4612;

	@ObfuscatedName("od.z")
	public int[][][] field4611;

	@ObfuscatedName("od.n")
	public int field4630;

	@ObfuscatedName("od.o")
	public class431[] field4600;

	@ObfuscatedName("od.q")
	public int field4614;

	@ObfuscatedName("od.p")
	public class431[] field4629;

	@ObfuscatedName("od.w")
	public int field4601;

	@ObfuscatedName("od.b")
	public class431[] field4616;

	@ObfuscatedName("od.x")
	public int field4617 = 0;

	@ObfuscatedName("od.i")
	public class431[] field4618;

	@ObfuscatedName("od.v")
	public int[] field4619;

	@ObfuscatedName("od.k")
	public int[] field4620;

	@ObfuscatedName("od.h")
	public int[] field4621;

	@ObfuscatedName("od.r")
	public int[] field4622;

	@ObfuscatedName("od.g")
	public int[] field4623;

	@ObfuscatedName("od.y")
	public int[] field4610;

	@ObfuscatedName("od.ay")
	public final float[] field4626 = new float[3];

	@ObfuscatedName("od.af")
	public final int[] field4627 = new int[2];

	@ObfuscatedName("od.ar")
	public int field4628 = -1;

	@ObfuscatedName("od.an")
	public int field4609 = -1;

	@ObfuscatedName("od.ap")
	public boolean field4615 = true;

	public class428(class423 arg0) {
		this.field4608 = arg0.field4499;
		this.field4612 = arg0.field4499;
		this.field4605 = arg0;
		this.field4600 = new class431[537];
		this.field4630 = 0;
		this.field4629 = new class431[2003];
		this.field4614 = 0;
		this.field4616 = new class431[1019];
		this.field4601 = 0;
		this.field4618 = new class431[1045];
		this.field4617 = 0;
		this.field4611 = new int[this.field4605.field4494][this.field4605.field4495 + 1][this.field4605.field4496 + 1];
		this.field4607 = false;
		if (this.field4605.field4489 instanceof ja) {
			this.field4624 = false;
		} else {
			this.field4624 = true;
		}
		if (this.field4624) {
			this.field4606 = new class422(this);
		}
	}

	@ObfuscatedName("od.u(IIIIII)V")
	public void method7615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			class424 var7 = this.field4605.field4497[arg1][arg2][arg3];
			if (var7 == null) {
				this.field4605.field4497[arg1][arg2][arg3] = var7 = new class424(arg1);
			}
			if (arg0 == 1) {
				var7.field4555 = (short) arg4;
				var7.field4556 = (short) arg5;
			} else if (arg0 == 2) {
				var7.field4557 = (short) arg4;
				var7.field4558 = (short) arg5;
			}
			if (this.field4607) {
				this.method7593();
			}
		} else if (arg0 == 8) {
			int var8 = arg2 << this.field4605.field4510;
			int var9 = this.field4605.field4499 + var8;
			int var10 = arg3 << this.field4605.field4510;
			int var11 = this.field4605.field4499 + var10;
			int var12 = this.field4605.field4527[arg1].method199(arg2, arg3);
			int var13 = this.field4605.field4527[arg1].method199(arg2 + 1, arg3 + 1);
			this.field4616[this.field4601++] = new class431(this.field4605, arg0, arg1, var8, var9, var9, var8, var12, var13, var13 - arg4, var12 - arg4, var10, var11, var11, var10);
		} else {
			int var14 = (arg2 << this.field4605.field4510) + this.field4605.field4499;
			int var15 = var14 - this.field4605.field4499;
			int var16 = arg3 << this.field4605.field4510;
			int var17 = this.field4605.field4499 + var16;
			int var18 = this.field4605.field4527[arg1].method199(arg2 + 1, arg3);
			int var19 = this.field4605.field4527[arg1].method199(arg2, arg3 + 1);
			this.field4616[this.field4601++] = new class431(this.field4605, arg0, arg1, var14, var15, var15, var14, var18, var19, var19 - arg4, var18 - arg4, var16, var17, var17, var16);
		}
	}

	@ObfuscatedName("od.j(IIII)V")
	public void method7601(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			class424 var5 = this.field4605.field4497[arg1][arg2][arg3];
			if (var5 != null) {
				if (arg0 == 1) {
					var5.field4555 = 0;
				} else if (arg0 == 2) {
					var5.field4557 = 0;
				}
			}
			this.method7593();
			return;
		}
		for (int var6 = 0; var6 < this.field4601; var6++) {
			class431 var7 = this.field4616[var6];
			if (var7.field4651 == arg0 && var7.field4652 == arg1 && (var7.field4654 == arg2 && var7.field4660 == arg3 || var7.field4647 == arg2 && var7.field4656 == arg3)) {
				if (this.field4601 != var6) {
					System.arraycopy(this.field4616, var6 + 1, this.field4616, var6, this.field4616.length - (var6 + 1));
				}
				this.field4601--;
				return;
			}
		}
	}

	@ObfuscatedName("od.a()V")
	public void method7627() {
		this.method7593();
	}

	@ObfuscatedName("od.s()V")
	public void method7593() {
		for (int var1 = 0; var1 < this.field4614; var1++) {
			this.field4629[var1] = null;
		}
		this.field4614 = 0;
		for (int var2 = 0; var2 < this.field4605.field4494; var2++) {
			for (int var3 = 0; var3 < this.field4605.field4495; var3++) {
				for (int var4 = 0; var4 < this.field4605.field4496; var4++) {
					class424 var5 = this.field4605.field4497[var2][var4][var3];
					if (var5 != null) {
						if (var5.field4555 > 0) {
							var5.field4555 = (short) (var5.field4555 * -1);
						}
						if (var5.field4557 > 0) {
							var5.field4557 = (short) (var5.field4557 * -1);
						}
					}
				}
			}
		}
		for (int var6 = 0; var6 < this.field4605.field4494; var6++) {
			for (int var7 = 0; var7 < this.field4605.field4495; var7++) {
				for (int var8 = 0; var8 < this.field4605.field4496; var8++) {
					class424 var9 = this.field4605.field4497[var6][var8][var7];
					if (var9 != null) {
						boolean var10 = this.field4605.field4497[0][var8][var7] != null && this.field4605.field4497[0][var8][var7].field4547 != null;
						if (var9.field4555 < 0) {
							int var11 = var7;
							int var12 = var7;
							int var14 = var6;
							class424 var15 = this.field4605.field4497[var6][var8][var7 - 1];
							int var16 = this.field4605.field4527[var6].method199(var8, var7);
							while (var11 > 0 && var15 != null && var15.field4555 < 0 && var9.field4555 == var15.field4555 && var9.field4556 == var15.field4556 && var16 == this.field4605.field4527[var6].method199(var8, var11 - 1) && (var11 - 1 <= 0 || var16 == this.field4605.field4527[var6].method199(var8, var11 - 2)) && var12 - var11 <= 10) {
								var11--;
								var15 = this.field4605.field4497[var6][var8][var11 - 1];
							}
							for (class424 var17 = this.field4605.field4497[var6][var8][var12 + 1]; var12 < this.field4605.field4496 && var17 != null && var17.field4555 < 0 && var9.field4555 == var17.field4555 && var9.field4556 == var17.field4556 && var16 == this.field4605.field4527[var6].method199(var8, var12 + 1) && (var12 + 1 >= this.field4605.field4496 || var16 == this.field4605.field4527[var6].method199(var8, var12 + 2)) && var12 - var11 <= 10; var17 = this.field4605.field4497[var6][var8][var12 + 1]) {
								var12++;
							}
							int var18 = var6 - var6 + 1;
							int var19 = this.field4605.field4527[var10 ? var6 + 1 : var6].method199(var8, var11);
							int var20 = var9.field4555 * var18 + var19;
							int var21 = this.field4605.field4527[var10 ? var6 + 1 : var6].method199(var8, var12 + 1);
							int var22 = var9.field4555 * var18 + var21;
							int var23 = var8 << this.field4605.field4510;
							int var24 = var11 << this.field4605.field4510;
							int var25 = (var12 << this.field4605.field4510) + this.field4605.field4499;
							this.field4629[this.field4614++] = new class431(this.field4605, 1, var6, var9.field4556 + var23, var9.field4556 + var23, var9.field4556 + var23, var9.field4556 + var23, var19, var21, var22, var20, var24, var25, var25, var24);
							for (int var26 = var6; var26 <= var14; var26++) {
								for (int var27 = var11; var27 <= var12; var27++) {
									this.field4605.field4497[var26][var8][var27].field4555 = (short) (this.field4605.field4497[var26][var8][var27].field4555 * -1);
								}
							}
						}
						if (var9.field4557 < 0) {
							int var28 = var8;
							int var29 = var8;
							int var31 = var6;
							class424 var32 = this.field4605.field4497[var6][var8 - 1][var7];
							int var33 = this.field4605.field4527[var6].method199(var8, var7);
							while (var28 > 0 && var32 != null && var32.field4557 < 0 && var9.field4557 == var32.field4557 && var9.field4558 == var32.field4558 && var33 == this.field4605.field4527[var6].method199(var28 - 1, var7) && (var28 - 1 <= 0 || var33 == this.field4605.field4527[var6].method199(var28 - 2, var7)) && var29 - var28 <= 10) {
								var28--;
								var32 = this.field4605.field4497[var6][var28 - 1][var7];
							}
							for (class424 var34 = this.field4605.field4497[var6][var29 + 1][var7]; var29 < this.field4605.field4495 && var34 != null && var34.field4557 < 0 && var9.field4557 == var34.field4557 && var9.field4558 == var34.field4558 && var33 == this.field4605.field4527[var6].method199(var29 + 1, var7) && (var29 + 1 >= this.field4605.field4495 || var33 == this.field4605.field4527[var6].method199(var29 + 2, var7)) && var29 - var28 <= 10; var34 = this.field4605.field4497[var6][var29 + 1][var7]) {
								var29++;
							}
							int var35 = var6 - var6 + 1;
							int var36 = this.field4605.field4527[var10 ? var6 + 1 : var6].method199(var28, var7);
							int var37 = var9.field4557 * var35 + var36;
							int var38 = this.field4605.field4527[var10 ? var6 + 1 : var6].method199(var29 + 1, var7);
							int var39 = var9.field4557 * var35 + var38;
							int var40 = var28 << this.field4605.field4510;
							int var41 = (var29 << this.field4605.field4510) + this.field4605.field4499;
							int var42 = var7 << this.field4605.field4510;
							this.field4629[this.field4614++] = new class431(this.field4605, 2, var6, var40, var41, var41, var40, var36, var38, var39, var37, var9.field4558 + var42, var9.field4558 + var42, var9.field4558 + var42, var9.field4558 + var42);
							for (int var43 = var6; var43 <= var31; var43++) {
								for (int var44 = var28; var44 <= var29; var44++) {
									this.field4605.field4497[var43][var44][var7].field4557 = (short) (this.field4605.field4497[var43][var44][var7].field4557 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.field4607 = true;
	}

	@ObfuscatedName("od.c(IIIIIIII)V")
	public void method7594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field4600[this.field4630++] = new class431(this.field4605, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
	}

	@ObfuscatedName("od.m(Lra;I)V")
	public void method7591(class14 arg0, int arg1) {
		Statics.field4625 = arg0;
		if (!this.field4624 || !this.field4613) {
			this.field4617 = 0;
			return;
		}
		if (this.field4615) {
			this.field4605.field4490.method12173();
		}
		Statics.field4625.method703(this.field4627);
		if ((int) ((float) this.field4627[0] / 3.0F) != this.field4628 || (int) ((float) this.field4627[1] / 3.0F) != this.field4609) {
			this.field4628 = (int) ((float) this.field4627[0] / 3.0F);
			this.field4609 = (int) ((float) this.field4627[1] / 3.0F);
			this.field4610 = new int[this.field4628 * this.field4609];
		}
		this.field4617 = 0;
		for (int var3 = 0; var3 < this.field4630; var3++) {
			this.method7596(Statics.field4625, this.field4600[var3], arg1);
		}
		for (int var4 = 0; var4 < this.field4614; var4++) {
			this.method7596(Statics.field4625, this.field4629[var4], arg1);
		}
		for (int var5 = 0; var5 < this.field4601; var5++) {
			this.method7596(Statics.field4625, this.field4616[var5], arg1);
		}
		this.field4606.field4481 = 0;
		if (this.field4617 > 0) {
			int var6 = this.field4610.length;
			int var7 = var6 - var6 & 0x7;
			int var8 = 0;
			while (var8 < var7) {
				this.field4610[var8++] = Integer.MAX_VALUE;
				this.field4610[var8++] = Integer.MAX_VALUE;
				this.field4610[var8++] = Integer.MAX_VALUE;
				this.field4610[var8++] = Integer.MAX_VALUE;
				this.field4610[var8++] = Integer.MAX_VALUE;
				this.field4610[var8++] = Integer.MAX_VALUE;
				this.field4610[var8++] = Integer.MAX_VALUE;
				this.field4610[var8++] = Integer.MAX_VALUE;
			}
			while (var8 < var6) {
				this.field4610[var8++] = Integer.MAX_VALUE;
			}
			this.field4606.field4483 = 1;
			for (int var9 = 0; var9 < this.field4617; var9++) {
				class431 var10 = this.field4618[var9];
				this.field4606.method7397(var10.field4661[0], var10.field4661[1], var10.field4661[3], var10.field4646[0], var10.field4646[1], var10.field4646[3], var10.field4662[0], var10.field4662[1], var10.field4662[3]);
				this.field4606.method7397(var10.field4661[1], var10.field4661[2], var10.field4661[3], var10.field4646[1], var10.field4646[2], var10.field4646[3], var10.field4662[1], var10.field4662[2], var10.field4662[3]);
			}
			this.field4606.field4483 = 2;
		}
		if (this.field4615) {
			this.field4605.field4490.method12173();
		}
	}

	@ObfuscatedName("od.t(Lra;Lpv;I)V")
	public void method7596(class14 arg0, class431 arg1, int arg2) {
		Statics.field4625 = arg0;
		if (this.field4619 != null && arg1.field4652 >= arg2) {
			for (int var4 = 0; var4 < this.field4619.length; var4++) {
				if (this.field4619[var4] != -1000000 && (arg1.field4650[0] <= this.field4619[var4] || arg1.field4650[1] <= this.field4619[var4] || arg1.field4650[2] <= this.field4619[var4] || arg1.field4650[3] <= this.field4619[var4]) && (arg1.field4655[0] <= this.field4621[var4] || arg1.field4655[1] <= this.field4621[var4] || arg1.field4655[2] <= this.field4621[var4] || arg1.field4655[3] <= this.field4621[var4]) && (arg1.field4655[0] >= this.field4620[var4] || arg1.field4655[1] >= this.field4620[var4] || arg1.field4655[2] >= this.field4620[var4] || arg1.field4655[3] >= this.field4620[var4]) && (arg1.field4659[0] <= this.field4622[var4] || arg1.field4659[1] <= this.field4622[var4] || arg1.field4659[2] <= this.field4622[var4] || arg1.field4659[3] <= this.field4622[var4]) && (arg1.field4659[0] >= this.field4623[var4] || arg1.field4659[1] >= this.field4623[var4] || arg1.field4659[2] >= this.field4623[var4] || arg1.field4659[3] >= this.field4623[var4])) {
					return;
				}
			}
		}
		if (arg1.field4651 == 1) {
			int var5 = this.field4605.field4531 + (arg1.field4654 - this.field4605.field4521);
			if (var5 >= 0 && var5 <= this.field4605.field4531 + this.field4605.field4531) {
				int var6 = this.field4605.field4531 + (arg1.field4660 - this.field4605.field4503);
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > this.field4605.field4531 + this.field4605.field4531) {
					return;
				}
				int var7 = this.field4605.field4531 + (arg1.field4656 - this.field4605.field4503);
				if (var7 > this.field4605.field4531 + this.field4605.field4531) {
					var7 = this.field4605.field4531 + this.field4605.field4531;
				} else if (var7 < 0) {
					return;
				}
				boolean var8 = false;
				while (var6 <= var7) {
					if (this.field4605.field4544[var5][var6++]) {
						var8 = true;
						break;
					}
				}
				if (var8) {
					float var9 = (float) (this.field4605.field4523 - arg1.field4655[0]);
					if (var9 < 0.0F) {
						var9 *= -1.0F;
					}
					if (!(var9 < (float) this.field4608) && (this.method7597(arg1, 0) && (this.method7597(arg1, 1) && (this.method7597(arg1, 2) && this.method7597(arg1, 3))))) {
						this.field4618[this.field4617++] = arg1;
					}
				}
			}
		} else if (arg1.field4651 == 2) {
			int var10 = this.field4605.field4531 + (arg1.field4660 - this.field4605.field4503);
			if (var10 >= 0 && var10 <= this.field4605.field4531 + this.field4605.field4531) {
				int var11 = this.field4605.field4531 + (arg1.field4654 - this.field4605.field4521);
				if (var11 < 0) {
					var11 = 0;
				} else if (var11 > this.field4605.field4531 + this.field4605.field4531) {
					return;
				}
				int var12 = this.field4605.field4531 + (arg1.field4647 - this.field4605.field4521);
				if (var12 > this.field4605.field4531 + this.field4605.field4531) {
					var12 = this.field4605.field4531 + this.field4605.field4531;
				} else if (var12 < 0) {
					return;
				}
				boolean var13 = false;
				while (var11 <= var12) {
					if (this.field4605.field4544[var11++][var10]) {
						var13 = true;
						break;
					}
				}
				if (var13) {
					float var14 = (float) (this.field4605.field4515 - arg1.field4659[0]);
					if (var14 < 0.0F) {
						var14 *= -1.0F;
					}
					if (!(var14 < (float) this.field4608) && (this.method7597(arg1, 0) && (this.method7597(arg1, 1) && (this.method7597(arg1, 2) && this.method7597(arg1, 3))))) {
						this.field4618[this.field4617++] = arg1;
					}
				}
			}
		} else if (arg1.field4651 == 16 || arg1.field4651 == 8) {
			int var23 = this.field4605.field4531 + (arg1.field4654 - this.field4605.field4521);
			if (var23 >= 0 && var23 <= this.field4605.field4531 + this.field4605.field4531) {
				int var24 = this.field4605.field4531 + (arg1.field4660 - this.field4605.field4503);
				if (var24 >= 0 && var24 <= this.field4605.field4531 + this.field4605.field4531 && this.field4605.field4544[var23][var24]) {
					float var25 = (float) (this.field4605.field4523 - arg1.field4655[0]);
					if (var25 < 0.0F) {
						var25 *= -1.0F;
					}
					float var26 = (float) (this.field4605.field4515 - arg1.field4659[0]);
					if (var26 < 0.0F) {
						var26 *= -1.0F;
					}
					if ((!(var25 < (float) this.field4608) || !(var26 < (float) this.field4608)) && (this.method7597(arg1, 0) && (this.method7597(arg1, 1) && (this.method7597(arg1, 2) && this.method7597(arg1, 3))))) {
						this.field4618[this.field4617++] = arg1;
					}
				}
			}
		} else if (arg1.field4651 == 4) {
			float var15 = (float) (arg1.field4650[0] - this.field4605.field4525);
			if (!(var15 <= (float) this.field4612)) {
				int var16 = this.field4605.field4531 + (arg1.field4660 - this.field4605.field4503);
				if (var16 < 0) {
					var16 = 0;
				} else if (var16 > this.field4605.field4531 + this.field4605.field4531) {
					return;
				}
				int var17 = this.field4605.field4531 + (arg1.field4656 - this.field4605.field4503);
				if (var17 > this.field4605.field4531 + this.field4605.field4531) {
					var17 = this.field4605.field4531 + this.field4605.field4531;
				} else if (var17 < 0) {
					return;
				}
				int var18 = this.field4605.field4531 + (arg1.field4654 - this.field4605.field4521);
				if (var18 < 0) {
					var18 = 0;
				} else if (var18 > this.field4605.field4531 + this.field4605.field4531) {
					return;
				}
				int var19 = this.field4605.field4531 + (arg1.field4647 - this.field4605.field4521);
				if (var19 > this.field4605.field4531 + this.field4605.field4531) {
					var19 = this.field4605.field4531 + this.field4605.field4531;
				} else if (var19 < 0) {
					return;
				}
				boolean var20 = false;
				label291: for (int var21 = var18; var21 <= var19; var21++) {
					for (int var22 = var16; var22 <= var17; var22++) {
						if (this.field4605.field4544[var21][var22]) {
							var20 = true;
							break label291;
						}
					}
				}
				if (var20 && (this.method7597(arg1, 0) && (this.method7597(arg1, 1) && (this.method7597(arg1, 2) && this.method7597(arg1, 3))))) {
					this.field4618[this.field4617++] = arg1;
				}
			}
		}
	}

	@ObfuscatedName("od.l(Lpv;I)Z")
	public boolean method7597(class431 arg0, int arg1) {
		if (this.method7633(arg0.field4655[arg1], arg0.field4650[arg1], arg0.field4659[arg1])) {
			arg0.field4646[arg1] = (short) this.field4626[0];
			arg0.field4661[arg1] = (short) this.field4626[1];
			arg0.field4662[arg1] = (short) this.field4626[2];
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("od.f(III)Z")
	public final boolean method7633(int arg0, int arg1, int arg2) {
		Statics.field4625.method550((float) arg0, (float) arg1, (float) arg2, this.field4626);
		if (this.field4626[2] < 50.0F) {
			return false;
		} else {
			this.field4626[0] /= 3.0F;
			this.field4626[1] /= 3.0F;
			return true;
		}
	}

	@ObfuscatedName("od.d(III)Z")
	public boolean method7599(int arg0, int arg1, int arg2) {
		if (!this.field4624 || !this.field4613) {
			return false;
		} else if (this.field4606.field4481 < 101) {
			return false;
		} else {
			int var4 = this.field4611[arg0][arg1][arg2];
			if (-this.field4605.field4520 == var4) {
				return false;
			} else if (this.field4605.field4520 == var4) {
				return true;
			} else if (this.field4605.field4502 == this.field4605.field4498) {
				return false;
			} else {
				int var5 = arg1 << this.field4605.field4510;
				int var6 = arg2 << this.field4605.field4510;
				if (this.method7605(var5 + 1, this.field4605.field4498[arg0].method199(arg1, arg2), var6 + 1, this.field4605.field4499 + var5 - 1, this.field4605.field4498[arg0].method199(arg1 + 1, arg2 + 1), this.field4605.field4499 + var6 - 1, var5 + 1, this.field4605.field4498[arg0].method199(arg1, arg2 + 1), this.field4605.field4499 + var6 - 1) && this.method7605(var5 + 1, this.field4605.field4498[arg0].method199(arg1, arg2), var6 + 1, this.field4605.field4499 + var5 - 1, this.field4605.field4498[arg0].method199(arg1 + 1, arg2), var6 + 1, this.field4605.field4499 + var5 - 1, this.field4605.field4498[arg0].method199(arg1 + 1, arg2 + 1), this.field4605.field4499 + var6 - 1)) {
					this.field4611[arg0][arg1][arg2] = this.field4605.field4520;
					return true;
				} else {
					this.field4611[arg0][arg1][arg2] = -this.field4605.field4520;
					return false;
				}
			}
		}
	}

	@ObfuscatedName("od.z(Lakr;III)Z")
	public boolean method7600(class972 arg0, int arg1, int arg2, int arg3) {
		if (!this.field4624 || !this.field4613) {
			return false;
		} else if (this.field4606.field4481 < 101) {
			return false;
		} else if (this.method7599(arg1, arg2, arg3)) {
			int var5 = arg2 << this.field4605.field4510;
			int var6 = arg3 << this.field4605.field4510;
			int var7 = this.field4605.field4498[arg1].method199(arg2, arg3) - 1;
			int var8 = var7 + arg0.method12809();
			if (arg0.field10507 == 1) {
				if (this.method7605(var5, var7, var6, var5, var8, var6, var5, var8, this.field4605.field4499 + var6)) {
					return this.method7605(var5, var7, var6, var5, var8, this.field4605.field4499 + var6, var5, var7, this.field4605.field4499 + var6);
				} else {
					return false;
				}
			} else if (arg0.field10507 == 2) {
				if (this.method7605(var5, var7, this.field4605.field4499 + var6, this.field4605.field4499 + var5, var8, this.field4605.field4499 + var6, var5, var8, this.field4605.field4499 + var6)) {
					return this.method7605(var5, var7, this.field4605.field4499 + var6, this.field4605.field4499 + var5, var7, this.field4605.field4499 + var6, this.field4605.field4499 + var5, var8, this.field4605.field4499 + var6);
				} else {
					return false;
				}
			} else if (arg0.field10507 == 4) {
				if (this.method7605(this.field4605.field4499 + var5, var7, var6, this.field4605.field4499 + var5, var8, var6, this.field4605.field4499 + var5, var8, this.field4605.field4499 + var6)) {
					return this.method7605(this.field4605.field4499 + var5, var7, var6, this.field4605.field4499 + var5, var8, this.field4605.field4499 + var6, this.field4605.field4499 + var5, var7, this.field4605.field4499 + var6);
				} else {
					return false;
				}
			} else if (arg0.field10507 == 8) {
				if (this.method7605(var5, var7, var6, this.field4605.field4499 + var5, var8, var6, var5, var8, var6)) {
					return this.method7605(var5, var7, var6, this.field4605.field4499 + var5, var7, var6, this.field4605.field4499 + var5, var8, var6);
				} else {
					return false;
				}
			} else if (arg0.field10507 == 16) {
				return this.method7604(var5, var7, this.field4605.field4487 + var6, this.field4605.field4487, var8, this.field4605.field4487);
			} else if (arg0.field10507 == 32) {
				return this.method7604(this.field4605.field4487 + var5, var7, this.field4605.field4487 + var6, this.field4605.field4487, var8, this.field4605.field4487);
			} else if (arg0.field10507 == 64) {
				return this.method7604(this.field4605.field4487 + var5, var7, var6, this.field4605.field4487, var8, this.field4605.field4487);
			} else if (arg0.field10507 == 128) {
				return this.method7604(var5, var7, var6, this.field4605.field4487, var8, this.field4605.field4487);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("od.n(IIII)Z")
	public boolean method7590(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field4624 || !this.field4613) {
			return false;
		} else if (this.field4606.field4481 < 101) {
			return false;
		} else if (this.method7599(arg0, arg1, arg2)) {
			int var5 = arg1 << this.field4605.field4510;
			int var6 = arg2 << this.field4605.field4510;
			return this.method7604(var5, this.field4605.field4498[arg0].method199(arg1, arg2), var6, this.field4605.field4499, arg3, this.field4605.field4499);
		} else {
			return false;
		}
	}

	@ObfuscatedName("od.o(IIIIILok;)Z")
	public boolean method7602(int arg0, int arg1, int arg2, int arg3, int arg4, class429 arg5) {
		if (!this.field4624 || !this.field4613) {
			return false;
		} else if (this.field4606.field4481 < 101) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (int var7 = arg1; var7 <= arg2; var7++) {
				for (int var8 = arg3; var8 <= arg4; var8++) {
					if (this.field4611[arg0][var7][var8] == -this.field4605.field4520) {
						return false;
					}
				}
			}
			if (this.method7603(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method7599(arg0, arg1, arg3)) {
			return this.method7603(arg5);
		} else {
			return false;
		}
	}

	@ObfuscatedName("od.q(Lok;)Z")
	public final boolean method7603(class429 arg0) {
		return arg0 == null ? false : this.method7604(arg0.field4639, arg0.field4637, arg0.field4634, arg0.field4636 - arg0.field4639, arg0.field4633 - arg0.field4637, arg0.field4640 - arg0.field4634);
	}

	@ObfuscatedName("od.p(IIIIII)Z")
	public final boolean method7604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg0 + arg3;
		int var8 = arg1 + arg4;
		int var9 = arg2 + arg5;
		if (!this.method7605(arg0, var8, arg2, var7, var8, var9, arg0, var8, var9)) {
			return false;
		} else if (this.method7605(arg0, var8, arg2, var7, var8, arg2, var7, var8, var9)) {
			if (arg0 < this.field4605.field4523) {
				if (!this.method7605(arg0, arg1, var9, arg0, var8, arg2, arg0, var8, var9)) {
					return false;
				}
				if (!this.method7605(arg0, arg1, var9, arg0, arg1, arg2, arg0, var8, arg2)) {
					return false;
				}
			} else if (!this.method7605(var7, arg1, var9, var7, var8, arg2, var7, var8, var9)) {
				return false;
			} else if (!this.method7605(var7, arg1, var9, var7, arg1, arg2, var7, var8, arg2)) {
				return false;
			}
			if (arg2 < this.field4605.field4515) {
				if (!this.method7605(arg0, arg1, arg2, var7, var8, arg2, arg0, var8, arg2)) {
					return false;
				}
				if (!this.method7605(arg0, arg1, arg2, var7, arg1, arg2, var7, var8, arg2)) {
					return false;
				}
			} else if (!this.method7605(arg0, arg1, var9, var7, var8, var9, arg0, var8, var9)) {
				return false;
			} else if (!this.method7605(arg0, arg1, var9, var7, arg1, var9, var7, var8, var9)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("od.w(IIIIIIIII)Z")
	public final boolean method7605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (!this.method7633(arg0, arg1, arg2)) {
			return false;
		}
		int var10 = (int) this.field4626[0];
		int var11 = (int) this.field4626[1];
		int var12 = (int) this.field4626[2];
		if (!this.method7633(arg3, arg4, arg5)) {
			return false;
		}
		int var13 = (int) this.field4626[0];
		int var14 = (int) this.field4626[1];
		int var15 = (int) this.field4626[2];
		if (this.method7633(arg6, arg7, arg8)) {
			int var16 = (int) this.field4626[0];
			int var17 = (int) this.field4626[1];
			int var18 = (int) this.field4626[2];
			return this.field4606.method7397(var11, var14, var17, var10, var13, var16, var12, var15, var18);
		} else {
			return false;
		}
	}
}
