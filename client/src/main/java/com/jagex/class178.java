package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("fr")
public class class178 {

	public class178() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("afu.u(Lfd;I)V")
	public static void method15896(class177 arg0) {
		Statics.field2118 = arg0;
	}

	@ObfuscatedName("aat.j(Laet;Ljava/lang/String;I)I")
	public static int method14081(Packet arg0, String arg1) {
		int var2 = arg0.pos;
		byte[] var3 = class524.method7652(arg1);
		arg0.method15235(var3.length);
		arg0.pos += Statics.field2118.method3500(var3, 0, var3.length, arg0.data, arg0.pos);
		return arg0.pos - var2;
	}

	@ObfuscatedName("v.a(Laet;I)Ljava/lang/String;")
	public static String method1205(Packet arg0) {
		return method4727(arg0, 32767);
	}

	@ObfuscatedName("jm.s(Laet;II)Ljava/lang/String;")
	public static String method4727(Packet arg0, int arg1) {
		try {
			int var2 = arg0.method15277();
			if (var2 > arg1) {
				var2 = arg1;
			}
			byte[] var3 = new byte[var2];
			arg0.pos += Statics.field2118.method3499(arg0.data, arg0.pos, var3, 0, var2);
			return class524.method6881(var3, 0, var2);
		} catch (Exception var6) {
			return "Cabbage";
		}
	}
}
