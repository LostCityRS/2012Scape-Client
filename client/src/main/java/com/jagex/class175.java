package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ek")
public class class175 {

	@ObfuscatedName("ek.a")
	public static final class176[] field2097 = new class176[100];

	@ObfuscatedName("ek.s")
	public static int field2099 = 0;

	public class175() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ib.u(I)I")
	public static int method4608() {
		return (field2099 += -303605781) * -1591863101 - 1;
	}

	@ObfuscatedName("b.a(ILjava/lang/String;S)V")
	public static void method1587(int arg0, String arg1) {
		method3943(arg0, 0, "", "", "", arg1);
	}

	@ObfuscatedName("gz.s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method3943(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5) {
		method13903(arg0, arg1, arg2, arg3, arg4, arg5, null, -1);
	}

	@ObfuscatedName("zx.c(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method13903(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, String arg6, int arg7) {
		class176 var8 = field2097[99];
		for (int var9 = 99; var9 > 0; var9--) {
			field2097[var9] = field2097[var9 - 1];
		}
		if (var8 == null) {
			var8 = new class176(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5);
		} else {
			var8.method3493(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5);
		}
		field2097[0] = var8;
		Statics.field2098 += -357421003;
		client.field9130 = client.field9132 * 2061094519;
	}

	@ObfuscatedName("gz.m(II)Lep;")
	public static class176 method3941(int arg0) {
		return arg0 >= 0 && arg0 < 100 ? field2097[arg0] : null;
	}

	@ObfuscatedName("pv.t(I)I")
	public static int method7655() {
		return Statics.field2098 * -235691491;
	}
}
