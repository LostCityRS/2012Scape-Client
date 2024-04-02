package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("qo")
public class class465 {

	@ObfuscatedName("qo.u")
	public final class134 field4916;

	@ObfuscatedName("qo.j")
	public class273 field4901;

	@ObfuscatedName("qo.a")
	public final class467 field4902;

	@ObfuscatedName("qo.s")
	public int field4912 = 0;

	@ObfuscatedName("qo.c")
	public class548 field4904;

	@ObfuscatedName("qo.m")
	public int field4903;

	@ObfuscatedName("qo.t")
	public long field4905;

	@ObfuscatedName("qo.l")
	public boolean field4907 = false;

	@ObfuscatedName("qo.f")
	public class468 field4908 = new class468();

	@ObfuscatedName("qo.d")
	public class468 field4909 = new class468();

	@ObfuscatedName("qo.z")
	public int field4900;

	@ObfuscatedName("qo.n")
	public int field4911;

	@ObfuscatedName("qo.o")
	public int field4906;

	@ObfuscatedName("qo.q")
	public int field4913;

	@ObfuscatedName("qo.p")
	public int field4914;

	@ObfuscatedName("qo.w")
	public int field4915;

	@ObfuscatedName("qo.b")
	public int field4910;

	@ObfuscatedName("qo.x")
	public boolean field4917 = false;

	@ObfuscatedName("qo.i")
	public boolean field4918 = false;

	public class465(class14 arg0, class134 arg1, class467 arg2, long arg3) {
		this.field4916 = arg1;
		this.field4902 = arg2;
		this.field4905 = arg3;
		this.field4901 = this.field4916.method2702();
		if (!arg0.method765() && this.field4901.field2672 != -1) {
			this.field4901 = class273.method2841(this.field4901.field2672);
		}
		this.field4904 = new class548();
		this.field4912 = (int) ((double) this.field4912 + Math.random() * 64.0D);
		this.method8069();
		this.field4909.field4948 = this.field4908.field4948;
		this.field4909.field4947 = this.field4908.field4947;
		this.field4909.field4949 = this.field4908.field4949;
		this.field4909.field4952 = this.field4908.field4952;
		this.field4909.field4953 = this.field4908.field4953;
		this.field4909.field4951 = this.field4908.field4951;
		this.field4909.field4950 = this.field4908.field4950;
		this.field4909.field4954 = this.field4908.field4954;
		this.field4909.field4955 = this.field4908.field4955;
	}

	@ObfuscatedName("qo.u(I)V")
	public void method8069() {
		this.field4908.field4948 = this.field4916.field1378;
		this.field4908.field4947 = this.field4916.field1379;
		this.field4908.field4949 = this.field4916.field1380;
		this.field4908.field4952 = this.field4916.field1381;
		this.field4908.field4953 = this.field4916.field1377;
		this.field4908.field4951 = this.field4916.field1373;
		this.field4908.field4950 = this.field4916.field1384;
		this.field4908.field4954 = this.field4916.field1385;
		this.field4908.field4955 = this.field4916.field1386;
		if (this.field4908.field4952 == this.field4908.field4948 && this.field4908.field4952 == this.field4908.field4950 && this.field4908.field4953 == this.field4908.field4947 && this.field4908.field4954 == this.field4908.field4953 && this.field4908.field4951 == this.field4908.field4949 && this.field4908.field4955 == this.field4908.field4951) {
			this.field4917 = true;
		} else if (this.field4917) {
			this.field4917 = false;
			this.field4909.field4948 = this.field4908.field4948;
			this.field4909.field4947 = this.field4908.field4947;
			this.field4909.field4949 = this.field4908.field4949;
			this.field4909.field4952 = this.field4908.field4952;
			this.field4909.field4953 = this.field4908.field4953;
			this.field4909.field4951 = this.field4908.field4951;
			this.field4909.field4950 = this.field4908.field4950;
			this.field4909.field4954 = this.field4908.field4954;
			this.field4909.field4955 = this.field4908.field4955;
		}
	}

	@ObfuscatedName("qo.j(Lra;JIZI)V")
	public void method8070(class14 arg0, long arg1, int arg2, boolean arg3) {
		if (this.field4907) {
			arg3 = false;
		} else if (class466.field4929 < this.field4901.field2722) {
			arg3 = false;
		} else if (class466.field4926 > class130.field1356[class466.field4929]) {
			arg3 = false;
		} else if (this.field4917) {
			arg3 = false;
		} else if (this.field4901.field2713 != -1) {
			int var6 = (int) (arg1 - this.field4905);
			if (this.field4901.field2711 || var6 <= this.field4901.field2713) {
				var6 %= this.field4901.field2713;
			} else {
				arg3 = false;
			}
			if (!this.field4901.field2743 && var6 < this.field4901.field2742) {
				arg3 = false;
			}
			if (this.field4901.field2743 && var6 >= this.field4901.field2742) {
				arg3 = false;
			}
		}
		this.field4903 = 0;
		for (class991 var7 = (class991) this.field4904.method11649(); var7 != null; var7 = (class991) this.field4904.method11644()) {
			var7.method16975(arg1, arg2);
			this.field4903++;
		}
		if (arg3) {
			int var8 = (this.field4908.field4950 + this.field4908.field4952 + this.field4908.field4948) / 3;
			int var9 = (this.field4908.field4954 + this.field4908.field4953 + this.field4908.field4947) / 3;
			int var10 = (this.field4908.field4955 + this.field4908.field4951 + this.field4908.field4949) / 3;
			if (this.field4908.field4956 != var8 || this.field4908.field4957 != var9 || this.field4908.field4958 != var10 || !this.field4918) {
				this.field4908.field4956 = var8;
				this.field4908.field4957 = var9;
				this.field4908.field4958 = var10;
				int var11 = this.field4908.field4952 - this.field4908.field4948;
				int var12 = this.field4908.field4953 - this.field4908.field4947;
				int var13 = this.field4908.field4951 - this.field4908.field4949;
				int var14 = this.field4908.field4950 - this.field4908.field4948;
				int var15 = this.field4908.field4954 - this.field4908.field4947;
				int var16 = this.field4908.field4955 - this.field4908.field4949;
				this.field4900 = var12 * var16 - var13 * var15;
				this.field4911 = var13 * var14 - var11 * var16;
				this.field4906 = var11 * var15 - var12 * var14;
				while (true) {
					if (this.field4900 <= 32767 && this.field4911 <= 32767 && this.field4906 <= 32767 && this.field4900 >= -32767 && this.field4911 >= -32767 && this.field4906 >= -32767) {
						int var17 = (int) Math.sqrt((double) (this.field4906 * this.field4906 + this.field4911 * this.field4911 + this.field4900 * this.field4900));
						if (var17 <= 0) {
							var17 = 1;
						}
						this.field4900 = this.field4900 * 32767 / var17;
						this.field4911 = this.field4911 * 32767 / var17;
						this.field4906 = this.field4906 * 32767 / var17;
						if (this.field4901.field2678 > 0 || this.field4901.field2737 > 0) {
							int var18 = (int) (Math.atan2((double) this.field4906, (double) this.field4900) * 2607.5945876176133D);
							int var19 = (int) (Math.atan2((double) this.field4911, Math.sqrt((double) (this.field4906 * this.field4906 + this.field4900 * this.field4900))) * 2607.5945876176133D);
							this.field4914 = this.field4901.field2678 - this.field4901.field2677;
							this.field4913 = this.field4901.field2677 + var18 - (this.field4914 >> 1);
							this.field4910 = this.field4901.field2737 - this.field4901.field2714;
							this.field4915 = this.field4901.field2714 + var19 - (this.field4910 >> 1);
						}
						this.field4918 = true;
						break;
					}
					this.field4900 >>= 0x1;
					this.field4911 >>= 0x1;
					this.field4906 >>= 0x1;
				}
			}
			this.field4912 += (int) ((double) arg2 * ((double) this.field4901.field2700 + Math.random() * (double) (this.field4901.field2679 - this.field4901.field2700)));
			if (this.field4912 > 63) {
				int var20 = this.field4912 >> 6;
				this.field4912 &= 0x3F;
				int var21 = (arg2 << 8) / var20;
				int var22 = 0;
				int var23 = 0;
				while (var23 < var20) {
					int var24;
					int var25;
					int var26;
					if (this.field4901.field2678 <= 0 && this.field4901.field2737 <= 0) {
						var24 = this.field4900;
						var25 = this.field4911;
						var26 = this.field4906;
					} else {
						int var27 = this.field4913 + (int) ((double) this.field4914 * Math.random());
						int var28 = var27 & 0x3FFF;
						int var29 = class312.field3439[var28];
						int var30 = class312.field3447[var28];
						int var31 = this.field4915 + (int) ((double) this.field4910 * Math.random());
						int var32 = var31 & 0x1FFF;
						int var33 = class312.field3439[var32];
						int var34 = class312.field3447[var32];
						byte var35 = 13;
						var24 = var30 * var33 >> var35;
						var25 = (var34 << 1) * -1;
						var26 = var29 * var33 >> var35;
					}
					float var36 = (float) Math.random();
					float var37 = (float) Math.random();
					if (var36 + var37 > 1.0F) {
						var36 = 1.0F - var36;
						var37 = 1.0F - var37;
					}
					float var38 = 1.0F - (var36 + var37);
					int var39 = (int) ((float) this.field4908.field4950 * var38 + (float) this.field4908.field4952 * var37 + (float) this.field4908.field4948 * var36);
					int var40 = (int) ((float) this.field4908.field4954 * var38 + (float) this.field4908.field4953 * var37 + (float) this.field4908.field4947 * var36);
					int var41 = (int) ((float) this.field4908.field4955 * var38 + (float) this.field4908.field4951 * var37 + (float) this.field4908.field4949 * var36);
					int var42 = this.field4901.field2681 + (int) (Math.random() * (double) (this.field4901.field2682 - this.field4901.field2681));
					int var43 = this.field4901.field2680 + (int) (Math.random() * (double) (this.field4901.field2699 - this.field4901.field2680));
					int var44 = this.field4901.field2716 + (int) (Math.random() * (double) (this.field4901.field2688 - this.field4901.field2716));
					int var47;
					if (this.field4901.field2693) {
						double var45 = Math.random();
						var47 = (int) ((double) this.field4901.field2724 * var45 + (double) this.field4901.field2731) << 16 | (int) ((double) this.field4901.field2727 * var45 + (double) this.field4901.field2725) << 8 | (int) ((double) this.field4901.field2720 * var45 + (double) this.field4901.field2728) | (int) ((double) this.field4901.field2687 + Math.random() * (double) this.field4901.field2733) << 24;
					} else {
						var47 = (int) ((double) this.field4901.field2731 + Math.random() * (double) this.field4901.field2724) << 16 | (int) ((double) this.field4901.field2725 + Math.random() * (double) this.field4901.field2727) << 8 | (int) ((double) this.field4901.field2728 + Math.random() * (double) this.field4901.field2720) | (int) ((double) this.field4901.field2687 + Math.random() * (double) this.field4901.field2733) << 24;
					}
					int var48 = this.field4901.field2697;
					if (!arg0.method765() && !this.field4901.field2694) {
						var48 = -1;
					}
					class991 var49;
					if (class466.field4922 == class466.field4921) {
						var49 = new class991(this, var39, var40, var41, var24, var25, var26, var42, var43, var47, var44, var48, this.field4901.field2715, this.field4901.field2718);
					} else {
						var49 = Statics.field4919[class466.field4922];
						class466.field4922 = class466.field4922 + 1 & 0x3FF;
						var49.method16973(this, var39, var40, var41, var24, var25, var26, var42, var43, var47, var44, var48, this.field4901.field2715, this.field4901.field2718);
					}
					if (var22 > 256) {
						var49.method16975(arg1, var22 >> 8);
					}
					this.field4903++;
					var23++;
					var22 += var21;
				}
			}
		}
		if (!this.field4908.method8136(this.field4909)) {
			class468 var50 = this.field4909;
			this.field4909 = this.field4908;
			this.field4908 = var50;
			this.field4908.field4948 = this.field4916.field1378;
			this.field4908.field4947 = this.field4916.field1379;
			this.field4908.field4949 = this.field4916.field1380;
			this.field4908.field4952 = this.field4916.field1381;
			this.field4908.field4953 = this.field4916.field1377;
			this.field4908.field4951 = this.field4916.field1373;
			this.field4908.field4950 = this.field4916.field1384;
			this.field4908.field4954 = this.field4916.field1385;
			this.field4908.field4955 = this.field4916.field1386;
			this.field4908.field4956 = this.field4909.field4956;
			this.field4908.field4957 = this.field4909.field4957;
			this.field4908.field4958 = this.field4909.field4958;
		}
		class466.field4925 += this.field4903;
	}

	@ObfuscatedName("qo.a(Loo;Lra;J)V")
	public void method8071(class423 arg0, class14 arg1, long arg2) {
		for (class991 var5 = (class991) this.field4904.method11649(); var5 != null; var5 = (class991) this.field4904.method11644()) {
			var5.method16987(arg0, arg1, arg2);
		}
	}
}
