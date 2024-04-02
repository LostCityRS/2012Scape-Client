
import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("akp")
public class class991 extends class914 {

	@ObfuscatedName("akp.p")
	public class465 field10561;

	@ObfuscatedName("akp.w")
	public short field10558;

	@ObfuscatedName("akp.b")
	public short field10560;

	@ObfuscatedName("akp.x")
	public short field10562;

	@ObfuscatedName("akp.i")
	public int field10559;

	@ObfuscatedName("akp.v")
	public int field10563;

	@ObfuscatedName("akp.k")
	public short field10564;

	@ObfuscatedName("akp.h")
	public short field10565;

	@ObfuscatedName("akp.r")
	public short field10566;

	public class991(class465 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
		this.field10561 = arg0;
		this.field10145 = arg1 << 12;
		this.field10146 = arg2 << 12;
		this.field10147 = arg3 << 12;
		this.field10144 = arg9;
		this.field10560 = this.field10562 = (short) arg8;
		this.field10148 = arg10;
		this.field10149 = arg11;
		this.field10150 = arg13;
		this.field10564 = (short) arg4;
		this.field10565 = (short) arg5;
		this.field10566 = (short) arg6;
		this.field10563 = arg7;
		this.field10151 = this.field10561.field4916.field1382;
		this.method16974();
	}

	@ObfuscatedName("akp.c(Lqo;IIIIIIIIIIIZZ)V")
	public void method16973(class465 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
		this.field10561 = arg0;
		this.field10145 = arg1 << 12;
		this.field10146 = arg2 << 12;
		this.field10147 = arg3 << 12;
		this.field10144 = arg9;
		this.field10560 = this.field10562 = (short) arg8;
		this.field10148 = arg10;
		this.field10149 = arg11;
		this.field10150 = arg13;
		this.field10564 = (short) arg4;
		this.field10565 = (short) arg5;
		this.field10566 = (short) arg6;
		this.field10563 = arg7;
		this.field10151 = this.field10561.field4916.field1382;
		this.method16974();
	}

	@ObfuscatedName("akp.m()V")
	public void method16974() {
		int var1 = this.field10561.field4902.field4934;
		if (this.field10561.field4902.field4933[var1] != null) {
			this.field10561.field4902.field4933[var1].method16977();
		}
		this.field10561.field4902.field4933[var1] = this;
		this.field10558 = (short) this.field10561.field4902.field4934;
		this.field10561.field4902.field4934 = var1 + 1 & 0x1FFF;
		this.field10561.field4904.method11640(this);
	}

	@ObfuscatedName("akp.t(JI)V")
	public void method16975(long arg0, int arg1) {
		this.field10562 = (short) (this.field10562 - arg1);
		if (this.field10562 <= 0) {
			this.method16977();
			return;
		}
		int var4 = this.field10145 >> 12;
		int var5 = this.field10146 >> 12;
		int var6 = this.field10147 >> 12;
		class467 var7 = this.field10561.field4902;
		class273 var8 = this.field10561.field4901;
		if (var8.field2712 != 0) {
			if (this.field10560 - this.field10562 <= var8.field2734) {
				int var9 = var8.field2736 * arg1 + (this.field10559 >> 16 & 0xFF) + (this.field10144 >> 8 & 0xFF00);
				int var10 = var8.field2686 * arg1 + (this.field10559 >> 8 & 0xFF) + (this.field10144 & 0xFF00);
				int var11 = var8.field2738 * arg1 + ((this.field10144 & 0xFF) << 8) + (this.field10559 & 0xFF);
				if (var9 < 0) {
					var9 = 0;
				} else if (var9 > 65535) {
					var9 = 65535;
				}
				if (var10 < 0) {
					var10 = 0;
				} else if (var10 > 65535) {
					var10 = 65535;
				}
				if (var11 < 0) {
					var11 = 0;
				} else if (var11 > 65535) {
					var11 = 65535;
				}
				this.field10144 &= 0xFF000000;
				this.field10144 |= (var11 >> 8 & 0xFF) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
				this.field10559 &= 0xFF000000;
				this.field10559 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
			}
			if (this.field10560 - this.field10562 <= var8.field2735) {
				int var12 = var8.field2739 * arg1 + (this.field10559 >> 24 & 0xFF) + (this.field10144 >> 16 & 0xFF00);
				if (var12 < 0) {
					var12 = 0;
				} else if (var12 > 65535) {
					var12 = 65535;
				}
				this.field10144 &= 0xFFFFFF;
				this.field10144 |= (var12 & 0xFF00) << 16;
				this.field10559 &= 0xFFFFFF;
				this.field10559 |= (var12 & 0xFF) << 24;
			}
		}
		if (var8.field2685 != -1 && this.field10560 - this.field10562 <= var8.field2740) {
			this.field10563 += var8.field2741 * arg1;
		}
		if (var8.field2689 != -1 && this.field10560 - this.field10562 <= var8.field2710) {
			this.field10148 += var8.field2729 * arg1;
		}
		double var13 = (double) this.field10564;
		double var15 = (double) this.field10565;
		double var17 = (double) this.field10566;
		boolean var19 = false;
		if (var8.field2683 == 1) {
			int var20 = var4 - this.field10561.field4908.field4956;
			int var21 = var5 - this.field10561.field4908.field4957;
			int var22 = var6 - this.field10561.field4908.field4958;
			int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
			long var24 = (long) (var8.field2684 * var23 * arg1);
			this.field10563 = (int) ((long) this.field10563 - ((long) this.field10563 * var24 >> 18));
		} else if (var8.field2683 == 2) {
			int var26 = var4 - this.field10561.field4908.field4956;
			int var27 = var5 - this.field10561.field4908.field4957;
			int var28 = var6 - this.field10561.field4908.field4958;
			int var29 = var28 * var28 + var26 * var26 + var27 * var27;
			long var30 = (long) (var8.field2684 * var29 * arg1);
			this.field10563 = (int) ((long) this.field10563 - ((long) this.field10563 * var30 >> 28));
		}
		if (var8.field2702 != null) {
			Iterator var32 = var7.field4944.iterator();
			label215: while (true) {
				class811 var33;
				class274 var34;
				do {
					if (!var32.hasNext()) {
						break label215;
					}
					var33 = (class811) var32.next();
					var34 = var33.field9602;
				} while (var34.field2760 == 1);
				boolean var35 = false;
				for (int var36 = 0; var36 < var8.field2702.length; var36++) {
					if (var34.field2748 == var8.field2702[var36]) {
						var35 = true;
						break;
					}
				}
				if (var35) {
					double var37 = (double) (var4 - var33.field9601);
					double var39 = (double) (var5 - var33.field9603);
					double var41 = (double) (var6 - var33.field9599);
					double var43 = var41 * var41 + var37 * var37 + var39 * var39;
					if (!(var43 > (double) var34.field2771)) {
						double var45 = Math.sqrt(var43);
						if (var45 == 0.0D) {
							var45 = 1.0D;
						}
						double var47 = ((double) var33.field9605 * var41 + (double) var33.field9604 * var37 + (double) var34.field2763 * var39) * 65535.0D / ((double) var34.field2770 * var45);
						if (!(var47 < (double) var34.field2772)) {
							double var49 = 0.0D;
							if (var34.field2759 == 1) {
								var49 = var45 / 16.0D * (double) var34.field2766;
							} else if (var34.field2759 == 2) {
								var49 = var45 / 16.0D * (var45 / 16.0D) * (double) var34.field2766;
							}
							if (var34.field2768 != 0) {
								double var51 = var37 / var45 * (double) var34.field2770;
								double var53 = var39 / var45 * (double) var34.field2770;
								double var55 = var41 / var45 * (double) var34.field2770;
								if (var34.field2767 == 0) {
									var13 += (double) arg1 * var51;
									var15 += (double) arg1 * var53;
									var17 += (double) arg1 * var55;
									var19 = true;
								} else {
									this.field10145 = (int) ((double) this.field10145 + (double) arg1 * var51);
									this.field10146 = (int) ((double) this.field10146 + (double) arg1 * var53);
									this.field10147 = (int) ((double) this.field10147 + (double) arg1 * var55);
								}
							} else if (var34.field2767 == 0) {
								var13 += ((double) var33.field9604 - var49) * (double) arg1;
								var15 += ((double) var34.field2763 - var49) * (double) arg1;
								var17 += ((double) var33.field9605 - var49) * (double) arg1;
								var19 = true;
							} else {
								this.field10145 = (int) ((double) this.field10145 + ((double) var33.field9604 - var49) * (double) arg1);
								this.field10146 = (int) ((double) this.field10146 + ((double) var34.field2763 - var49) * (double) arg1);
								this.field10147 = (int) ((double) this.field10147 + ((double) var33.field9605 - var49) * (double) arg1);
							}
						}
					}
				}
			}
		}
		if (var8.field2674 != null) {
			for (int var57 = 0; var57 < var8.field2674.length; var57++) {
				class811 var58 = (class811) class466.field4924.method11923((long) var8.field2674[var57]);
				while (var58 != null) {
					class274 var59 = var58.field9602;
					double var60 = (double) (var4 - var58.field9601);
					double var62 = (double) (var5 - var58.field9603);
					double var64 = (double) (var6 - var58.field9599);
					double var66 = var64 * var64 + var60 * var60 + var62 * var62;
					if (var66 > (double) var59.field2771) {
						var58 = (class811) class466.field4924.method11924();
					} else {
						double var68 = Math.sqrt(var66);
						if (var68 == 0.0D) {
							var68 = 1.0D;
						}
						double var70 = ((double) var58.field9605 * var64 + (double) var58.field9604 * var60 + (double) var59.field2763 * var62) * 65535.0D / ((double) var59.field2770 * var68);
						if (var70 < (double) var59.field2772) {
							var58 = (class811) class466.field4924.method11924();
						} else {
							double var72 = 0.0D;
							if (var59.field2759 == 1) {
								var72 = var68 / 16.0D * (double) var59.field2766;
							} else if (var59.field2759 == 2) {
								var72 = var68 / 16.0D * (var68 / 16.0D) * (double) var59.field2766;
							}
							if (var59.field2768 != 0) {
								double var74 = var60 / var68 * (double) var59.field2770;
								double var76 = var62 / var68 * (double) var59.field2770;
								double var78 = var64 / var68 * (double) var59.field2770;
								if (var59.field2767 == 0) {
									var13 += (double) arg1 * var74;
									var15 += (double) arg1 * var76;
									var17 += (double) arg1 * var78;
									var19 = true;
								} else {
									this.field10145 = (int) ((double) this.field10145 + (double) arg1 * var74);
									this.field10146 = (int) ((double) this.field10146 + (double) arg1 * var76);
									this.field10147 = (int) ((double) this.field10147 + (double) arg1 * var78);
								}
							} else if (var59.field2767 == 0) {
								var13 += ((double) var58.field9604 - var72) * (double) arg1;
								var15 += ((double) var59.field2763 - var72) * (double) arg1;
								var17 += ((double) var58.field9605 - var72) * (double) arg1;
								var19 = true;
							} else {
								this.field10145 = (int) ((double) this.field10145 + ((double) var58.field9604 - var72) * (double) arg1);
								this.field10146 = (int) ((double) this.field10146 + ((double) var59.field2763 - var72) * (double) arg1);
								this.field10147 = (int) ((double) this.field10147 + ((double) var58.field9605 - var72) * (double) arg1);
							}
							var58 = (class811) class466.field4924.method11924();
						}
					}
				}
			}
		}
		if (var8.field2698 != null) {
			if (var8.field2705 == null) {
				var8.field2705 = new int[var8.field2698.length];
				for (int var80 = 0; var80 < var8.field2698.length; var80++) {
					class274.method2938(var8.field2698[var80]);
					var8.field2705[var80] = ((class802) class274.field2745.method11923((long) var8.field2698[var80])).field9556;
				}
			}
			for (int var81 = 0; var81 < var8.field2705.length; var81++) {
				class274 var82 = class274.field2756[var8.field2705[var81]];
				if (var82.field2767 == 0) {
					var13 += var82.field2754 * arg1;
					var15 += var82.field2763 * arg1;
					var17 += var82.field2765 * arg1;
					var19 = true;
				} else {
					this.field10145 += var82.field2754 * arg1;
					this.field10146 += var82.field2763 * arg1;
					this.field10147 += var82.field2765 * arg1;
				}
			}
		}
		if (var19) {
			while (true) {
				if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
					this.field10564 = (short) var13;
					this.field10565 = (short) var15;
					this.field10566 = (short) var17;
					break;
				}
				var13 /= 2.0D;
				var15 /= 2.0D;
				var17 /= 2.0D;
				this.field10563 <<= 0x1;
			}
		}
		this.field10145 = (int) ((long) this.field10145 + ((long) (this.field10563 << 2) * (long) this.field10564 >> 23) * (long) arg1);
		this.field10146 = (int) ((long) this.field10146 + ((long) (this.field10563 << 2) * (long) this.field10565 >> 23) * (long) arg1);
		this.field10147 = (int) ((long) this.field10147 + ((long) (this.field10563 << 2) * (long) this.field10566 >> 23) * (long) arg1);
	}

	@ObfuscatedName("akp.l(Loo;Lra;J)V")
	public void method16987(class423 arg0, class14 arg1, long arg2) {
		int var5 = this.field10145 >> arg0.field4510 + 12;
		int var6 = this.field10147 >> arg0.field4510 + 12;
		int var7 = this.field10146 >> 12;
		if (var7 > 262144 || var7 < -262144 || var5 < 0 || var5 >= arg0.field4495 || var6 < 0 || var6 >= arg0.field4496) {
			this.method16977();
			return;
		}
		class467 var8 = this.field10561.field4902;
		class273 var9 = this.field10561.field4901;
		class12[] var10 = arg0.field4498;
		int var11 = var8.field4943;
		class424 var12 = arg0.field4497[var8.field4943][var5][var6];
		if (var12 != null) {
			var11 = var12.field4549;
		}
		int var13 = var10[var11].method199(var5, var6);
		int var14;
		if (var11 < arg0.field4494 - 1) {
			var14 = var10[var11 + 1].method199(var5, var6);
		} else {
			var14 = var13 - (0x8 << arg0.field4510);
		}
		if (var9.field2721) {
			if (var9.field2707 == -1 && var7 > var13) {
				this.method16977();
				return;
			}
			if (var9.field2707 >= 0 && var7 > var10[var9.field2707].method199(var5, var6)) {
				this.method16977();
				return;
			}
			if (var9.field2708 == -1 && var7 < var14) {
				this.method16977();
				return;
			}
			if (var9.field2708 >= 0 && var7 < var10[var9.field2708 + 1].method199(var5, var6)) {
				this.method16977();
				return;
			}
		}
		int var15;
		for (var15 = arg0.field4494 - 1; var15 > 0 && var7 > var10[var15].method199(var5, var6); var15--) {
		}
		if (var9.field2701 && var15 == 0 && var7 > var10[0].method199(var5, var6)) {
			this.method16977();
		} else if (arg0.field4494 - 1 == var15 && var10[var15].method199(var5, var6) - var7 > 0x8 << arg0.field4510) {
			this.method16977();
		} else {
			class424 var16 = arg0.field4497[var15][var5][var6];
			if (var16 == null) {
				if (var15 == 0 || arg0.field4497[0][var5][var6] == null) {
					var16 = arg0.field4497[0][var5][var6] = new class424(0);
				}
				boolean var17 = arg0.field4497[0][var5][var6].field4547 != null;
				if (var15 == 3 && var17) {
					this.method16977();
					return;
				}
				for (int var18 = 1; var18 <= var15; var18++) {
					if (arg0.field4497[var18][var5][var6] == null) {
						var16 = arg0.field4497[var18][var5][var6] = new class424(var18);
						if (var17) {
							var16.field4549++;
						}
					}
				}
			}
			if (var9.field2719) {
				int var19 = this.field10145 >> 12;
				int var20 = this.field10147 >> 12;
				if (var16.field4548 != null) {
					class429 var21 = var16.field4548.method12810(arg1);
					if (var21 != null && var21.method7645(var19, var7, var20)) {
						this.method16977();
						return;
					}
				}
				if (var16.field4550 != null) {
					class429 var22 = var16.field4550.method12810(arg1);
					if (var22 != null && var22.method7645(var19, var7, var20)) {
						this.method16977();
						return;
					}
				}
				if (var16.field4552 != null) {
					class429 var23 = var16.field4552.method12810(arg1);
					if (var23 != null && var23.method7645(var19, var7, var20)) {
						this.method16977();
						return;
					}
				}
				for (class430 var24 = var16.field4554; var24 != null; var24 = var24.field4641) {
					class429 var25 = var24.field4642.method12810(arg1);
					if (var25 != null && var25.method7645(var19, var7, var20)) {
						this.method16977();
						return;
					}
				}
			}
			var8.field4940.field1311.method11668(this);
		}
	}

	@ObfuscatedName("akp.f()V")
	public void method16977() {
		this.field10561.field4902.field4933[this.field10558] = null;
		Statics.field4919[class466.field4921] = this;
		class466.field4921 = class466.field4921 + 1 & 0x3FF;
		this.method6975();
		this.method14730();
	}
}
