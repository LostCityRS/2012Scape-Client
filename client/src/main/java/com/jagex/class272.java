package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ik")
public class class272 {

	@ObfuscatedName("ik.a")
	public static class451 field2660 = new class451(64);

	@ObfuscatedName("ik.s")
	public int field2661 = 808527171;

	@ObfuscatedName("ik.c")
	public int field2658 = 1181521984;

	@ObfuscatedName("ik.m")
	public int field2662 = -1980219712;

	@ObfuscatedName("ik.t")
	public int field2664 = 1425056202;

	@ObfuscatedName("ik.l")
	public int field2665 = -1291283915;

	@ObfuscatedName("ik.f")
	public boolean field2666 = false;

	@ObfuscatedName("ik.d")
	public boolean field2667 = false;

	@ObfuscatedName("qg.u(Lls;I)V")
	public static void method8409(class334 arg0) {
		Statics.field2663 = arg0;
	}

	@ObfuscatedName("fi.j(II)Lik;")
	public static class272 method3666(int arg0) {
		class272 var1 = (class272) field2660.method7916((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2663.method5627(0, arg0);
		class272 var3 = new class272();
		if (var2 != null) {
			var3.method4641(new class814(var2), arg0);
		}
		field2660.method7937(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("ik.a(Laet;II)V")
	public void method4641(class814 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method15220();
			if (var3 == 0) {
				return;
			}
			this.method4643(arg0, var3, arg1);
		}
	}

	@ObfuscatedName("ik.s(Laet;III)V")
	public void method4643(class814 arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			this.field2661 = arg0.method15239() * -808527171;
			if (this.field2661 * -2096598891 == 65535) {
				this.field2661 = 808527171;
			}
		} else if (arg1 == 2) {
			this.field2658 = (arg0.method15239() + 1) * 2031727201;
			this.field2662 = (arg0.method15239() + 1) * 1042800891;
		} else if (arg1 == 3) {
			arg0.method15238();
		} else if (arg1 == 4) {
			this.field2664 = arg0.method15220() * -1434955547;
		} else if (arg1 == 5) {
			this.field2665 = arg0.method15220() * -1291283915;
		} else if (arg1 == 6) {
			this.field2666 = true;
		} else if (arg1 == 7) {
			this.field2667 = true;
		}
	}
}
