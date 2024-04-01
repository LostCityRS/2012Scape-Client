package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("mr")
public class class370 {

	@ObfuscatedName("mr.j")
	public class380[] field3994 = new class380[10];

	@ObfuscatedName("mr.a")
	public int field3996;

	@ObfuscatedName("mr.s")
	public int field3993;

	@ObfuscatedName("mr.u(Lls;II)Lmr;")
	public static class370 method6466(class334 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getFile(arg1, arg2);
		return var3 == null ? null : new class370(new Packet(var3));
	}

	public class370(Packet arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.g1();
			if (var3 != 0) {
				arg0.pos--;
				this.field3994[var2] = new class380();
				this.field3994[var2].method6600(arg0);
			}
		}
		this.field3996 = arg0.g2();
		this.field3993 = arg0.g2();
	}

	@ObfuscatedName("mr.j()Lalu;")
	public class997 method6463() {
		byte[] var1 = this.method6465();
		return new class997(22050, var1, this.field3996 * 22050 / 1000, this.field3993 * 22050 / 1000);
	}

	@ObfuscatedName("mr.a()I")
	public final int method6462() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field3994[var2] != null && this.field3994[var2].field4083 / 20 < var1) {
				var1 = this.field3994[var2].field4083 / 20;
			}
		}
		if (this.field3996 < this.field3993 && this.field3996 / 20 < var1) {
			var1 = this.field3996 / 20;
		}
		if (var1 == 9999999 || var1 == 0) {
			return 0;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field3994[var3] != null) {
				this.field3994[var3].field4083 -= var1 * 20;
			}
		}
		if (this.field3996 < this.field3993) {
			this.field3996 -= var1 * 20;
			this.field3993 -= var1 * 20;
		}
		return var1;
	}

	@ObfuscatedName("mr.s()[B")
	public final byte[] method6465() {
		int var1 = 0;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field3994[var2] != null && this.field3994[var2].field4083 + this.field3994[var2].field4075 > var1) {
				var1 = this.field3994[var2].field4083 + this.field3994[var2].field4075;
			}
		}
		if (var1 == 0) {
			return new byte[0];
		}
		int var3 = var1 * 22050 / 1000;
		byte[] var4 = new byte[var3];
		for (int var5 = 0; var5 < 10; var5++) {
			if (this.field3994[var5] != null) {
				int var6 = this.field3994[var5].field4075 * 22050 / 1000;
				int var7 = this.field3994[var5].field4083 * 22050 / 1000;
				int[] var8 = this.field3994[var5].method6598(var6, this.field3994[var5].field4075);
				for (int var9 = 0; var9 < var6; var9++) {
					int var10 = (var8[var9] >> 8) + var4[var7 + var9];
					if ((var10 + 128 & 0xFFFFFF00) != 0) {
						var10 = var10 >> 31 ^ 0x7F;
					}
					var4[var7 + var9] = (byte) var10;
				}
			}
		}
		return var4;
	}
}
