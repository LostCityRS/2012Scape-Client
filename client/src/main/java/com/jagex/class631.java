package com.jagex;

import deob.ObfuscatedName;
import java.util.Random;

@ObfuscatedName("wk")
public class class631 {

	@ObfuscatedName("wk.j")
	public final class334 field7391;

	@ObfuscatedName("wk.a")
	public final class630[] field7393;

	@ObfuscatedName("wk.s")
	public final int field7394;

	public class631(class527 arg0, class519 arg1, class334 arg2) {
		this.field7391 = arg2;
		Packet var4 = new Packet(this.field7391.getFile(0, 0));
		int var5 = var4.data == null || var4.data.length < 1 ? -1 : var4.g1();
		if (var5 < 4) {
			this.field7393 = new class630[0];
			this.field7394 = -1;
		} else {
			int var6 = var4.g1();
			class266[] var7 = class266.method8288();
			boolean var8 = true;
			if (var7.length == var6) {
				for (int var9 = 0; var9 < var7.length; var9++) {
					int var10 = var4.g1();
					if (var7[var9].field2629 != var10) {
						var8 = false;
						break;
					}
				}
			} else {
				var8 = false;
			}
			if (var8) {
				int var11 = var4.g1();
				int var12 = var4.g1();
				int var13;
				int var14;
				if (var5 > 2) {
					this.field7394 = var4.method15240();
					var13 = var4.method15241();
					var14 = var4.g2();
				} else {
					this.field7394 = -1;
					var13 = 0;
					var14 = 0;
				}
				this.field7393 = new class630[var12 + 1];
				for (int var15 = 0; var15 < var11; var15++) {
					int var16 = var4.g1();
					boolean var17 = var4.g1() == 1;
					int var18 = var4.g2();
					class633[] var19;
					if (this.field7394 == -1) {
						var19 = new class633[var18];
						for (int var20 = 0; var20 < var18; var20++) {
							int var21 = var4.g2();
							int var22 = var4.method15241();
							int var23 = var4.g2();
							var19[var20] = new class633(var21, var22, var23);
						}
						this.field7393[var16] = new class630(var17, var19);
					} else {
						var19 = new class633[var18 + 1];
						var19[0] = new class633(this.field7394, var13, var14);
						for (int var24 = 0; var24 < var18; var24++) {
							int var25 = var4.g2();
							int var26 = var4.method15241();
							int var27 = var4.g2();
							var19[var24 + 1] = new class633(var25, var26, var27);
						}
					}
					this.field7393[var16] = new class630(var17, var19);
				}
				for (int var28 = 0; var28 < var12 + 1; var28++) {
					if (this.field7393[var28] == null) {
						this.field7393[var28] = this.method12709(var13, var14);
					}
				}
			} else {
				this.field7393 = new class630[0];
				this.field7394 = -1;
			}
		}
	}

	@ObfuscatedName("wk.u(IIB)Lwm;")
	public class630 method12709(int arg0, int arg1) {
		if (this.field7394 == -1) {
			return new class630(false, new class633[0]);
		} else {
			class633 var3 = new class633(this.field7394, arg0, arg1);
			return new class630(false, new class633[] { var3 });
		}
	}

	@ObfuscatedName("wk.j(II)Lwb;")
	public class632 method12708(int arg0) {
		byte[] var2 = this.field7391.getFile(arg0, 0);
		class632 var3 = new class632();
		var3.method12719(new Packet(var2));
		return var3;
	}

	@ObfuscatedName("wk.a(II)[Lwh;")
	public class633[] method12706(int arg0) {
		if (arg0 < 0 || arg0 >= this.field7393.length) {
			return this.method12709(0, 0).field7389;
		}
		class630 var2 = this.field7393[arg0];
		if (!var2.field7388 || var2.field7389.length <= 1) {
			return var2.field7389;
		}
		int var3 = this.field7394 == -1 ? 0 : 1;
		Random var4 = new Random();
		class633[] var5 = new class633[var2.field7389.length];
		System.arraycopy(var2.field7389, 0, var5, 0, var5.length);
		for (int var6 = var3; var6 < var5.length; var6++) {
			int var7 = IntMath.method2715(var4, var5.length - var3) + var3;
			class633 var8 = var2.field7389[var6];
			var5[var6] = var5[var7];
			var5[var7] = var8;
		}
		return var5;
	}

	@ObfuscatedName("wk.s(I)Z")
	public boolean method12703() {
		return this.field7394 != -1;
	}
}
