package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ls")
public final class class334 {

	@ObfuscatedName("ls.u")
	public class332 field3572 = null;

	@ObfuscatedName("ls.j")
	public Object[] field3564;

	@ObfuscatedName("ls.a")
	public Object[][] field3565;

	@ObfuscatedName("ls.s")
	public static class636 field3566 = new class636();

	@ObfuscatedName("ls.c")
	public boolean field3574;

	@ObfuscatedName("ls.f")
	public int field3571;

	@ObfuscatedName("ls.d")
	public class333 field3568;

	@ObfuscatedName("ls.z")
	public static boolean field3563 = false;

	@ObfuscatedName("ls.n")
	public static int field3573 = 0;

	public class334(class333 arg0, boolean arg1, int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("");
		}
		this.field3568 = arg0;
		this.field3574 = arg1;
		this.field3571 = arg2;
	}

	@ObfuscatedName("ls.u(I)Z")
	public synchronized boolean method5689() {
		if (this.field3572 == null) {
			this.field3572 = this.field3568.method5604();
			if (this.field3572 == null) {
				return false;
			}
			this.field3564 = new Object[this.field3572.field3553];
			this.field3565 = new Object[this.field3572.field3553][];
		}
		return true;
	}

	@ObfuscatedName("ls.j(I)I")
	public int method5622() {
		if (!this.method5689()) {
			throw new IllegalStateException("");
		}
		return this.field3572.field3546;
	}

	@ObfuscatedName("ls.a(II)Z")
	public synchronized boolean method5623(int arg0) {
		if (!this.method5689()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.field3572.field3561.length && this.field3572.field3561[arg0] != 0) {
			return true;
		} else if (field3563) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@ObfuscatedName("ls.s(III)Z")
	public synchronized boolean method5624(int arg0, int arg1) {
		if (!this.method5689()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field3572.field3561.length && arg1 < this.field3572.field3561[arg0]) {
			return true;
		} else if (field3563) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("ls.c(II)V")
	public synchronized void method5625(int arg0) {
		if (this.field3574) {
			this.field3564[arg0] = this.field3568.method5605(arg0);
		} else {
			this.field3564[arg0] = Statics.method4122(this.field3568.method5605(arg0), false);
		}
	}

	@ObfuscatedName("ls.m(II)V")
	public void method5660(int arg0) {
		this.field3568.method5606(arg0);
	}

	@ObfuscatedName("ls.t(III)[B")
	public byte[] getFile(int arg0, int arg1) {
		return this.method5699(arg0, arg1, null);
	}

	@ObfuscatedName("ls.l(II[II)[B")
	public synchronized byte[] method5699(int arg0, int arg1, int[] arg2) {
		if (!this.method5624(arg0, arg1)) {
			return null;
		}
		byte[] var4 = null;
		if (this.field3565[arg0] == null || this.field3565[arg0][arg1] == null) {
			boolean var5 = this.method5640(arg0, arg1, arg2);
			if (!var5) {
				this.method5625(arg0);
				boolean var6 = this.method5640(arg0, arg1, arg2);
				if (!var6) {
					return null;
				}
			}
		}
		if (this.field3565[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.field3565[arg0][arg1] != null) {
			var4 = Statics.method2896(this.field3565[arg0][arg1], false);
			if (var4 == null) {
				throw new RuntimeException("");
			}
		}
		if (var4 != null) {
			if (this.field3571 == 1) {
				this.field3565[arg0][arg1] = null;
				if (this.field3572.field3561[arg0] == 1) {
					this.field3565[arg0] = null;
				}
			} else if (this.field3571 == 2) {
				this.field3565[arg0] = null;
			}
		}
		return var4;
	}

	@ObfuscatedName("ls.f(III)Z")
	public synchronized boolean method5629(int arg0, int arg1) {
		if (!this.method5624(arg0, arg1)) {
			return false;
		} else if (this.field3565[arg0] != null && this.field3565[arg0][arg1] != null) {
			return true;
		} else if (this.field3564[arg0] == null) {
			this.method5625(arg0);
			return this.field3564[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ls.d(II)Z")
	public synchronized boolean method5630(int arg0) {
		if (!this.method5689()) {
			return false;
		} else if (this.field3572.field3561.length == 1) {
			return this.method5629(0, arg0);
		} else if (!this.method5623(arg0)) {
			return false;
		} else if (this.field3572.field3561[arg0] == 1) {
			return this.method5629(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ls.z(II)Z")
	public synchronized boolean method5631(int arg0) {
		if (!this.method5623(arg0)) {
			return false;
		} else if (this.field3564[arg0] == null) {
			this.method5625(arg0);
			return this.field3564[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ls.n(I)Z")
	public synchronized boolean method5662() {
		if (!this.method5689()) {
			return false;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field3572.field3554.length; var2++) {
			int var3 = this.field3572.field3554[var2];
			if (this.field3564[var3] == null) {
				this.method5625(var3);
				if (this.field3564[var3] == null) {
					var1 = false;
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("ls.o(IB)I")
	public synchronized int method5669(int arg0) {
		if (this.method5623(arg0)) {
			return this.field3564[arg0] == null ? this.field3568.method5607(arg0) : 100;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ls.q(B)I")
	public synchronized int method5634() {
		if (!this.method5689()) {
			return 0;
		}
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < this.field3564.length; var3++) {
			if (this.field3572.field3557[var3] > 0) {
				var1 += 100;
				var2 += this.method5669(var3);
			}
		}
		if (var1 == 0) {
			return 100;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("ls.p(IB)[B")
	public synchronized byte[] method5635(int arg0) {
		if (!this.method5689()) {
			return null;
		} else if (this.field3572.field3561.length == 1) {
			return this.getFile(0, arg0);
		} else if (!this.method5623(arg0)) {
			return null;
		} else if (this.field3572.field3561[arg0] == 1) {
			return this.getFile(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ls.w(II)[I")
	public synchronized int[] method5683(int arg0) {
		if (!this.method5623(arg0)) {
			return null;
		}
		int[] var2 = this.field3572.field3556[arg0];
		if (var2 == null) {
			var2 = new int[this.field3572.field3557[arg0]];
			int var3 = 0;
			while (var3 < var2.length) {
				var2[var3] = var3++;
			}
		}
		return var2;
	}

	@ObfuscatedName("ls.b(IB)I")
	public int method5637(int arg0) {
		return this.method5623(arg0) ? this.field3572.field3561[arg0] : 0;
	}

	@ObfuscatedName("ls.x(I)I")
	public int method5638() {
		return this.method5689() ? this.field3572.field3561.length : -1;
	}

	@ObfuscatedName("ls.i(IB)V")
	public synchronized void method5639(int arg0) {
		if (this.method5623(arg0) && this.field3565 != null) {
			this.field3565[arg0] = null;
		}
	}

	@ObfuscatedName("ls.v(ZZB)V")
	public void method5636(boolean arg0, boolean arg1) {
		if (!this.method5689()) {
			return;
		}
		if (arg0) {
			this.field3572.field3551 = null;
			this.field3572.field3560 = null;
		}
		if (arg1) {
			this.field3572.field3559 = null;
			this.field3572.field3558 = null;
		}
	}

	@ObfuscatedName("ls.k(II[IS)Z")
	public synchronized boolean method5640(int arg0, int arg1, int[] arg2) {
		if (!this.method5623(arg0)) {
			return false;
		} else if (this.field3564[arg0] == null) {
			return false;
		} else {
			int var4 = this.field3572.field3557[arg0];
			int[] var5 = this.field3572.field3556[arg0];
			if (this.field3565[arg0] == null) {
				this.field3565[arg0] = new Object[this.field3572.field3561[arg0]];
			}
			Object[] var6 = this.field3565[arg0];
			boolean var7 = true;
			for (int var8 = 0; var8 < var4; var8++) {
				int var9;
				if (var5 == null) {
					var9 = var8;
				} else {
					var9 = var5[var8];
				}
				if (var6[var9] == null) {
					var7 = false;
					break;
				}
			}
			if (var7) {
				return true;
			}
			byte[] var10;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				var10 = Statics.method2896(this.field3564[arg0], false);
			} else {
				var10 = Statics.method2896(this.field3564[arg0], true);
				Packet var11 = new Packet(var10);
				var11.tinydec(arg2, 5, var11.data.length);
			}
			byte[] var12;
			try {
				var12 = Statics.method1598(var10);
			} catch (RuntimeException var48) {
				throw class983.method15876(var48, (arg2 != null) + " " + arg0 + " " + var10.length + " " + Packet.method7834(var10, var10.length) + " " + Packet.method7834(var10, var10.length - 2) + " " + this.field3572.field3548[arg0] + " " + this.field3572.field3546);
			}
			if (this.field3574) {
				this.field3564[arg0] = null;
			}
			if (var4 <= 1) {
				int var47;
				if (var5 == null) {
					var47 = 0;
				} else {
					var47 = var5[0];
				}
				if (this.field3571 == 0) {
					var6[var47] = Statics.method4122(var12, false);
				} else {
					var6[var47] = var12;
				}
			} else if (this.field3571 == 2) {
				int var30 = var12.length;
				int var50 = var30 - 1;
				int var31 = var12[var50] & 0xFF;
				int var32 = var50 - var4 * var31 * 4;
				Packet var33 = new Packet(var12);
				int var34 = 0;
				int var35 = 0;
				var33.pos = var32;
				for (int var36 = 0; var36 < var31; var36++) {
					int var37 = 0;
					for (int var38 = 0; var38 < var4; var38++) {
						var37 += var33.g4s();
						int var39;
						if (var5 == null) {
							var39 = var38;
						} else {
							var39 = var5[var38];
						}
						if (arg1 == var39) {
							var34 += var37;
							var35 = var39;
						}
					}
				}
				if (var34 == 0) {
					return true;
				}
				byte[] var40 = new byte[var34];
				int var41 = 0;
				var33.pos = var32;
				int var42 = 0;
				for (int var43 = 0; var43 < var31; var43++) {
					int var44 = 0;
					for (int var45 = 0; var45 < var4; var45++) {
						var44 += var33.g4s();
						int var46;
						if (var5 == null) {
							var46 = var45;
						} else {
							var46 = var5[var45];
						}
						if (arg1 == var46) {
							System.arraycopy(var12, var42, var40, var41, var44);
							var41 += var44;
						}
						var42 += var44;
					}
				}
				var6[var35] = var40;
			} else {
				int var14 = var12.length;
				int var49 = var14 - 1;
				int var15 = var12[var49] & 0xFF;
				int var16 = var49 - var4 * var15 * 4;
				Packet var17 = new Packet(var12);
				int[] var18 = new int[var4];
				var17.pos = var16;
				for (int var19 = 0; var19 < var15; var19++) {
					int var20 = 0;
					for (int var21 = 0; var21 < var4; var21++) {
						var20 += var17.g4s();
						var18[var21] += var20;
					}
				}
				byte[][] var22 = new byte[var4][];
				for (int var23 = 0; var23 < var4; var23++) {
					var22[var23] = new byte[var18[var23]];
					var18[var23] = 0;
				}
				var17.pos = var16;
				int var24 = 0;
				for (int var25 = 0; var25 < var15; var25++) {
					int var26 = 0;
					for (int var27 = 0; var27 < var4; var27++) {
						var26 += var17.g4s();
						System.arraycopy(var12, var24, var22[var27], var18[var27], var26);
						var18[var27] += var26;
						var24 += var26;
					}
				}
				for (int var28 = 0; var28 < var4; var28++) {
					int var29;
					if (var5 == null) {
						var29 = var28;
					} else {
						var29 = var5[var28];
					}
					if (this.field3571 == 0) {
						var6[var29] = Statics.method4122(var22[var28], false);
					} else {
						var6[var29] = var22[var28];
					}
				}
			}
			return true;
		}
	}

	@ObfuscatedName("ls.h(Ljava/lang/String;B)I")
	public int method5688(String arg0) {
		if (this.method5689()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.field3572.field3560.method3564(class526.method5016(var2));
			return this.method5623(var3) ? var3 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ls.r(II)I")
	public int method5642(int arg0) {
		if (this.method5689()) {
			int var2 = this.field3572.field3560.method3564(arg0);
			return this.method5623(var2) ? var2 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ls.g(Ljava/lang/String;I)Z")
	public boolean method5680(String arg0) {
		if (this.method5689()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.field3572.field3560.method3564(class526.method5016(var2));
			return var3 >= 0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ls.y(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method5644(String arg0, String arg1) {
		if (!this.method5689()) {
			return false;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.field3572.field3560.method3564(class526.method5016(var3));
		if (var5 < 0) {
			return false;
		} else {
			int var6 = this.field3572.field3558[var5].method3564(class526.method5016(var4));
			return var6 >= 0;
		}
	}

	@ObfuscatedName("ls.e(Ljava/lang/String;Ljava/lang/String;I)[B")
	public synchronized byte[] method5645(String arg0, String arg1) {
		if (!this.method5689()) {
			return null;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.field3572.field3560.method3564(class526.method5016(var3));
		if (this.method5623(var5)) {
			int var6 = this.field3572.field3558[var5].method3564(class526.method5016(var4));
			return this.getFile(var5, var6);
		} else {
			return null;
		}
	}

	@ObfuscatedName("ls.ay(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method5646(String arg0, String arg1) {
		if (!this.method5689()) {
			return false;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.field3572.field3560.method3564(class526.method5016(var3));
		if (this.method5623(var5)) {
			int var6 = this.field3572.field3558[var5].method3564(class526.method5016(var4));
			return this.method5629(var5, var6);
		} else {
			return false;
		}
	}

	@ObfuscatedName("ls.af(Ljava/lang/String;I)Z")
	public boolean method5647(String arg0) {
		int var2 = this.method5688("");
		return var2 == -1 ? this.method5646(arg0, "") : this.method5646("", arg0);
	}

	@ObfuscatedName("ls.ar(Ljava/lang/String;B)Z")
	public boolean method5648(String arg0) {
		if (this.method5689()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.field3572.field3560.method3564(class526.method5016(var2));
			return this.method5631(var3);
		} else {
			return false;
		}
	}

	@ObfuscatedName("ls.an(Ljava/lang/String;B)V")
	public void method5649(String arg0) {
		if (this.method5689()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.field3572.field3560.method3564(class526.method5016(var2));
			this.method5660(var3);
		}
	}

	@ObfuscatedName("ls.ap(Ljava/lang/String;B)I")
	public int method5650(String arg0) {
		if (this.method5689()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.field3572.field3560.method3564(class526.method5016(var2));
			return this.method5669(var3);
		} else {
			return 0;
		}
	}
}
