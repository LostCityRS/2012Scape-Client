package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("uu")
public class class574 {

	@ObfuscatedName("uu.t")
	public static boolean field6777 = false;

	@ObfuscatedName("uu.d")
	public static class832[] field6771 = new class832[0];

	@ObfuscatedName("uu.z")
	public static int field6780 = 1000251;

	@ObfuscatedName("uu.n")
	public static int field6783 = 0;

	@ObfuscatedName("uu.o")
	public static class495 field6781 = null;

	@ObfuscatedName("uu.q")
	public static boolean field6774 = false;

	public class574() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("te.u(I)V")
	public static void method11538() {
		if (!field6774) {
			return;
		}
		if (field6783 < Statics.field4871) {
			field6783 = Statics.field4871;
		}
		while (true) {
			while (field6783 < Statics.field4875) {
				class832 var0 = class461.method3630(field6783);
				if (var0 != null && var0.field9800 == -1) {
					if (field6781 == null) {
						field6781 = client.field9192.method8637(var0.field9797);
					}
					int var1 = field6781.field5178;
					if (var1 == -1) {
						return;
					}
					var0.field9800 = var1;
					field6783++;
					field6781 = null;
				} else {
					field6783++;
				}
			}
			return;
		}
	}

	@ObfuscatedName("rt.j(ILjava/lang/String;I)Z")
	public static boolean method8621(int arg0, String arg1) {
		Statics.field6772 = new class573();
		Statics.field6772.field6768 = arg0;
		Statics.field6772.field6765 = arg1;
		if (Statics.field6683 != class515.field6368) {
			Statics.field6772.field6764 = Statics.field6772.field6768 + 40000;
			Statics.field6772.field6766 = Statics.field6772.field6768 + 50000;
		}
		return true;
	}

	@ObfuscatedName("an.a(Ljava/lang/String;II)V")
	public static void method1716(String arg0, int arg1) {
		if (Statics.field6782 == null) {
			Statics.field6782 = new class573();
		}
		Statics.field6782.field6765 = arg0;
		Statics.field6782.field6768 = arg1 + 1099;
		Statics.field6782.field6764 = Statics.field6782.field6768 + 40000;
		Statics.field6782.field6766 = Statics.field6782.field6768 + 50000;
	}

	@ObfuscatedName("cy.c(Z[BI)V")
	public static void method2587(boolean arg0, byte[] arg1) {
		if (Statics.field6778 == null) {
			Statics.field6778 = new Packet(20000);
		}
		Statics.field6778.method15276(arg1, 0, arg1.length);
		if (!arg0) {
			return;
		}
		class461.method6034(Statics.field6778.data);
		field6771 = new class832[Statics.field4876];
		int var2 = 0;
		for (int var3 = Statics.field4871; var3 <= Statics.field4875; var3++) {
			class832 var4 = class461.method3630(var3);
			if (var4 != null) {
				field6771[var2++] = var4;
			}
		}
		field6777 = false;
		Statics.field6356 = class153.method5554();
		Statics.field6778 = null;
	}

	@ObfuscatedName("md.m(B)Laex;")
	public static class832 method6582() {
		field6780 = 0;
		return method3647();
	}

	@ObfuscatedName("fu.t(S)Laex;")
	public static class832 method3647() {
		return field6780 < field6771.length ? field6771[++field6780 - 1] : null;
	}

	@ObfuscatedName("rc.l(S)Laex;")
	public static class832 method8609() {
		return class461.method3630(Statics.field6772.field6768);
	}

	@ObfuscatedName("jj.f(IZIZI)V")
	public static void method4774(int arg0, boolean arg1, int arg2, boolean arg3) {
		method4618(0, field6771.length - 1, arg0, arg1, arg2, arg3);
		field6783 = 0;
		field6781 = null;
	}

	@ObfuscatedName("ix.d(IIIZIZI)V")
	public static void method4618(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
		if (arg0 >= arg1) {
			return;
		}
		int var6 = (arg0 + arg1) / 2;
		int var7 = arg0;
		class832 var8 = field6771[var6];
		field6771[var6] = field6771[arg1];
		field6771[arg1] = var8;
		for (int var9 = arg0; var9 < arg1; var9++) {
			if (method3310(field6771[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
				class832 var10 = field6771[var9];
				field6771[var9] = field6771[var7];
				field6771[var7++] = var10;
			}
		}
		field6771[arg1] = field6771[var7];
		field6771[var7] = var8;
		method4618(arg0, var7 - 1, arg2, arg3, arg4, arg5);
		method4618(var7 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("ex.z(Laex;Laex;IZIZI)I")
	public static int method3310(class832 arg0, class832 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
		int var6 = method3101(arg0, arg1, arg2, arg3);
		if (var6 != 0) {
			return arg3 ? -var6 : var6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			int var7 = method3101(arg0, arg1, arg4, arg5);
			return arg5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("es.n(Laex;Laex;IZB)I")
	public static int method3101(class832 arg0, class832 arg1, int arg2, boolean arg3) {
		if (arg2 == 1) {
			int var4 = arg0.field4868;
			int var5 = arg1.field4868;
			if (!arg3) {
				if (var4 == -1) {
					var4 = 2001;
				}
				if (var5 == -1) {
					var5 = 2001;
				}
			}
			return var4 - var5;
		} else if (arg2 == 2) {
			return class522.method4794(arg0.method15615().field4860, arg1.method15615().field4860, Statics.field2308);
		} else if (arg2 == 3) {
			if (arg0.field9798.equals("-")) {
				if (arg1.field9798.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.field9798.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return class522.method4794(arg0.field9798, arg1.field9798, Statics.field2308);
			}
		} else if (arg2 == 4) {
			return arg0.method8036() ? (arg1.method8036() ? 0 : 1) : (arg1.method8036() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method8034() ? (arg1.method8034() ? 0 : 1) : (arg1.method8034() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method8035() ? (arg1.method8035() ? 0 : 1) : (arg1.method8035() ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method8038() ? (arg1.method8038() ? 0 : 1) : (arg1.method8038() ? -1 : 0);
		} else if (arg2 == 8) {
			int var6 = arg0.field9800;
			int var7 = arg1.field9800;
			if (arg3) {
				if (var6 == 1000) {
					var6 = -1;
				}
				if (var7 == 1000) {
					var7 = -1;
				}
			} else {
				if (var6 == -1) {
					var6 = 1000;
				}
				if (var7 == -1) {
					var7 = 1000;
				}
			}
			return var6 - var7;
		} else {
			return arg0.field9799 - arg1.field9799;
		}
	}
}
