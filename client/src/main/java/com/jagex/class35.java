package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("t")
public class class35 {

	public class35() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ty.u(Lls;B)V")
	public static void method11376(class334 arg0) {
		Statics.field551 = arg0.method5688("p11_full") * 846930349;
		Statics.field552 = arg0.method5688("p12_full") * -1142462093;
		Statics.field557 = arg0.method5688("b12_full") * 204321263;
	}

	@ObfuscatedName("qs.j(Lls;I)V")
	public static void method8388(class334 arg0) {
		Statics.field5179 = arg0.method5688("headicons_pk") * 896630421;
		Statics.field553 = arg0.method5688("headicons_prayer") * 75793083;
		Statics.field554 = arg0.method5688("hint_headicons") * 172405697;
		Statics.field3489 = arg0.method5688("hint_mapmarkers") * -2000754209;
		Statics.field555 = arg0.method5688("mapflag") * -220663409;
		Statics.field556 = arg0.method5688("cross") * -708524625;
		Statics.field550 = arg0.method5688("mapdots") * 1567034079;
		Statics.field6816 = arg0.method5688("name_icons") * 1657331355;
		Statics.field3845 = arg0.method5688("floorshadows") * 1877422367;
		Statics.field4683 = arg0.method5688("compass") * -1049761587;
		Statics.field558 = arg0.method5688("otherlevel") * 1014841119;
		Statics.field6648 = arg0.method5688("hint_mapedge") * -1755666981;
	}

	@ObfuscatedName("ml.a(I)[I")
	public static int[] method6244() {
		return new int[] { Statics.field551 * 1788668453, Statics.field552 * -1653087301, Statics.field557 * 922590479 };
	}

	@ObfuscatedName("eu.s(Lra;I)V")
	public static void method2931(class14 arg0) {
		Statics.field2163 = (class15) Statics.field6784.method4859(client.field8914, Statics.field551 * 1788668453, true, true);
		Statics.field559 = Statics.field6784.method4843(client.field8914, Statics.field551 * 1788668453);
		Statics.field560 = (class15) Statics.field6784.method4859(client.field8914, Statics.field552 * -1653087301, true, true);
		Statics.field9813 = Statics.field6784.method4843(client.field8914, Statics.field552 * -1653087301);
		Statics.field670 = (class15) Statics.field6784.method4859(client.field8914, Statics.field557 * 922590479, true, true);
		Statics.field2399 = Statics.field6784.method4843(client.field8914, Statics.field557 * 922590479);
	}

	@ObfuscatedName("un.c(Lls;B)I")
	public static int method12092(class334 arg0) {
		int var1 = 0;
		if (arg0.method5630(Statics.field5179 * 618159293)) {
			var1++;
		}
		if (arg0.method5630(Statics.field553 * 61239923)) {
			var1++;
		}
		if (arg0.method5630(Statics.field554 * 741563457)) {
			var1++;
		}
		if (arg0.method5630(Statics.field3489 * 1771049503)) {
			var1++;
		}
		if (arg0.method5630(Statics.field555 * -635105937)) {
			var1++;
		}
		if (arg0.method5630(Statics.field556 * 1832366415)) {
			var1++;
		}
		if (arg0.method5630(Statics.field550 * -1750126305)) {
			var1++;
		}
		if (arg0.method5630(Statics.field6816 * -61024365)) {
			var1++;
		}
		if (arg0.method5630(Statics.field3845 * 1731136223)) {
			var1++;
		}
		if (arg0.method5630(Statics.field4683 * 856966149)) {
			var1++;
		}
		if (arg0.method5630(Statics.field558 * 1481473247)) {
			var1++;
		}
		if (arg0.method5630(Statics.field6648 * 1414712915)) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("b.m(I)I")
	public static int method1589() {
		return 12;
	}

	@ObfuscatedName("afb.t(Lra;Lls;I)V")
	public static void method15812(class14 arg0, class334 arg1) {
		class140[] var2 = class125.method2591(arg1, Statics.field5179 * 618159293, 0);
		Statics.field2209 = new class118[var2.length];
		for (int var3 = 0; var3 < var2.length; var3++) {
			Statics.field2209[var3] = arg0.method517(var2[var3], true);
		}
		class140[] var4 = class125.method2591(arg1, Statics.field553 * 61239923, 0);
		Statics.field9904 = new class118[var4.length];
		for (int var5 = 0; var5 < var4.length; var5++) {
			Statics.field9904[var5] = arg0.method517(var4[var5], true);
		}
		class140[] var6 = class125.method2591(arg1, Statics.field554 * 741563457, 0);
		Statics.field6361 = new class118[var6.length];
		for (int var7 = 0; var7 < var6.length; var7++) {
			Statics.field6361[var7] = arg0.method517(var6[var7], true);
		}
		class140[] var8 = class125.method2591(arg1, Statics.field3489 * 1771049503, 0);
		Statics.field3311 = new class118[var8.length];
		for (int var9 = 0; var9 < var8.length; var9++) {
			Statics.field3311[var9] = arg0.method517(var8[var9], true);
		}
		class140[] var10 = class125.method2591(arg1, Statics.field555 * -635105937, 0);
		Statics.field9826 = new class118[var10.length];
		byte var11 = 25;
		for (int var12 = 0; var12 < var10.length; var12++) {
			var10[var12].method2719(-var11 + (int) (Math.random() * (double) var11 * 2.0D), -var11 + (int) (Math.random() * (double) var11 * 2.0D), -var11 + (int) (Math.random() * (double) var11 * 2.0D));
			Statics.field9826[var12] = arg0.method517(var10[var12], true);
		}
		class140[] var13 = class125.method2591(arg1, Statics.field556 * 1832366415, 0);
		Statics.field2618 = new class118[var13.length];
		for (int var14 = 0; var14 < var13.length; var14++) {
			Statics.field2618[var14] = arg0.method517(var13[var14], true);
		}
		class140[] var15 = class125.method2591(arg1, Statics.field550 * -1750126305, 0);
		Statics.field561 = new class118[var15.length];
		byte var16 = 12;
		for (int var17 = 0; var17 < var15.length; var17++) {
			var15[var17].method2719(-var16 + (int) (Math.random() * (double) var16 * 2.0D), -var16 + (int) (Math.random() * (double) var16 * 2.0D), -var16 + (int) (Math.random() * (double) var16 * 2.0D));
			Statics.field561[var17] = arg0.method517(var15[var17], true);
		}
		class140[] var18 = class125.method2591(arg1, Statics.field6816 * -61024365, 0);
		Statics.field8538 = new class118[var18.length];
		byte var19 = 12;
		for (int var20 = 0; var20 < var18.length; var20++) {
			var18[var20].method2719(-var19 + (int) (Math.random() * (double) var19 * 2.0D), -var19 + (int) (Math.random() * (double) var19 * 2.0D), -var19 + (int) (Math.random() * (double) var19 * 2.0D));
			Statics.field8538[var20] = arg0.method517(var18[var20], true);
		}
		Statics.field7290 = arg0.method517(class125.method2590(arg1, Statics.field4683 * 856966149, 0), true);
		Statics.field6385 = arg0.method517(class125.method2590(arg1, Statics.field558 * 1481473247, 0), true);
		class140[] var21 = class125.method2591(arg1, Statics.field6648 * 1414712915, 0);
		Statics.field4878 = new class118[var21.length];
		for (int var22 = 0; var22 < var21.length; var22++) {
			Statics.field4878[var22] = arg0.method517(var21[var22], true);
		}
	}

	@ObfuscatedName("ee.l(I)V")
	public static void method3095() {
		Statics.field2163 = null;
		Statics.field560 = null;
		Statics.field670 = null;
		Statics.field2209 = null;
		Statics.field9904 = null;
		Statics.field6361 = null;
		Statics.field3311 = null;
		Statics.field9826 = null;
		Statics.field2618 = null;
		Statics.field561 = null;
		Statics.field8538 = null;
		Statics.field7290 = null;
		Statics.field6385 = null;
		Statics.field4878 = null;
	}
}
