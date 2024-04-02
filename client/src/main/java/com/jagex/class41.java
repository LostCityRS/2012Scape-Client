package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("p")
public class class41 {

	public class41() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("rj.u(Lra;IILew;I)V")
	public static void method8599(class14 arg0, int arg1, int arg2, class165 arg3) {
		byte var4 = 63;
		byte var5 = 7;
		for (int var6 = 63; var6 >= 0; var6--) {
			int var7 = (var6 & 0x3F) << 10 | (var5 & 0x7) << 7 | var4 & 0x7F;
			class482.method8092(false, true);
			int var8 = Statics.field5084[var7];
			class482.method2790(false, true);
			arg0.method489(arg1, (arg3.field1929 * 1697821335 * (63 - var6) >> 6) + arg2, arg3.field1863 * 282574593, (arg3.field1929 * 1697821335 >> 6) + 1, var8 | 0xFF000000, 0);
		}
	}

	@ObfuscatedName("ef.j(Lra;IILew;II)V")
	public static void method3303(class14 arg0, int arg1, int arg2, class165 arg3, int arg4) {
		for (int var5 = 7; var5 >= 0; var5--) {
			for (int var6 = 127; var6 >= 0; var6--) {
				int var7 = (arg4 & 0x3F) << 10 | (var5 & 0x7) << 7 | var6 & 0x7F;
				class482.method8092(false, true);
				int var8 = Statics.field5084[var7];
				class482.method2790(false, true);
				arg0.method489((arg3.field1863 * 282574593 * var6 >> 7) + arg1, (arg3.field1929 * 1697821335 * (7 - var5) >> 3) + arg2, (arg3.field1863 * 282574593 >> 7) + 1, (arg3.field1929 * 1697821335 >> 3) + 1, var8 | 0xFF000000, 0);
			}
		}
	}
}
