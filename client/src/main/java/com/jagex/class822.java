package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aeq")
public class class822 extends class408 {

	@ObfuscatedName("aeq.am")
	public static int field9764 = -2117865979;

	@ObfuscatedName("aeq.ad")
	public static int field9753 = 0;

	@ObfuscatedName("aeq.ah")
	public static int field9762 = 980974933;

	@ObfuscatedName("aeq.au")
	public static int field9756 = -1795653037;

	@ObfuscatedName("aeq.ab")
	public static boolean field9754 = false;

	@ObfuscatedName("aeq.bv")
	public static int field9759 = -171441939;

	@ObfuscatedName("aeq.bj")
	public static int field9757 = -2046278891;

	@ObfuscatedName("aeq.bf")
	public static boolean field9760 = false;

	@ObfuscatedName("aeq.bc")
	public static String[] field9761 = new String[5];

	@ObfuscatedName("aeq.br")
	public static int field9755 = 1024463339;

	@ObfuscatedName("aeq.bp")
	public static int field9763 = 2139437451;

	@ObfuscatedName("aeq.bb")
	public static boolean field9758 = false;

	@ObfuscatedName("aeq.be")
	public static class565 field9765 = new class565(8);

	@ObfuscatedName("aeq.bw")
	public static class565 field9766 = new class565(8);

	@ObfuscatedName("aeq.bo")
	public static class550 field9767 = new class550(new class547());

	public class822() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("og.bp(Lra;Lma;I)V")
	public static final void method7164(class14 arg0, class16 arg1) {
		if (Statics.field4292 == null) {
			return;
		}
		class153.method5554();
		class153.method5554();
		if (field9753 * 510447267 < 10) {
			if (!Statics.field4264.method5648(Statics.field4292.field10362)) {
				field9753 = Statics.field4059.method5650(Statics.field4292.field10362) / 10 * -86158069;
				return;
			}
			client.method7380();
			field9753 = -861580690;
		}
		if (field9753 * 510447267 == 10) {
			Statics.field4283 = Statics.field4292.field10368 * 239364753 >> 6 << 6;
			Statics.field4284 = Statics.field4292.field10364 * 866111971 >> 6 << 6;
			Statics.field4285 = (Statics.field4292.field10369 * 1498150343 >> 6 << 6) - Statics.field4283 + 64;
			Statics.field4282 = (Statics.field4292.field10371 * 357331541 >> 6 << 6) - Statics.field4284 + 64;
			int[] var2 = new int[3];
			int var3 = -1;
			int var4 = -1;
			class317 var5 = Statics.field2119.method8565().field3464;
			class453 var6 = client.field8980.method6214();
			if (Statics.field4292.method16705(Statics.field2119.field9807, ((int) var5.field3475 >> 9) + var6.field4836 * 401083797, ((int) var5.field3477 >> 9) + var6.field4838 * -526848045, var2)) {
				var3 = var2[1] - Statics.field4283;
				var4 = var2[2] - Statics.field4284;
			}
			if (!field9760 && var3 >= 0 && var3 < Statics.field4285 && var4 >= 0 && var4 < Statics.field4282) {
				int var7 = var3 + ((int) (Math.random() * 10.0D) - 5);
				int var8 = var4 + ((int) (Math.random() * 10.0D) - 5);
				Statics.field4465 = var7 * 1050120801;
				Statics.field6770 = var8 * -1811479163;
			} else if (field9759 * -1418353893 == -1 || field9757 * -1438184509 == -1) {
				Statics.field4292.method16708(Statics.field4292.field10365 * -2107235481 >> 14 & 0x3FFF, Statics.field4292.field10365 * -2107235481 & 0x3FFF, var2);
				Statics.field4465 = (var2[1] - Statics.field4283) * 1050120801;
				Statics.field6770 = (var2[2] - Statics.field4284) * -1811479163;
			} else {
				Statics.field4292.method16708(field9759 * -1418353893, field9757 * -1438184509, var2);
				if (var2 != null) {
					Statics.field4465 = (var2[1] - Statics.field4283) * 1050120801;
					Statics.field6770 = (var2[2] - Statics.field4284) * -1811479163;
				}
				field9757 = -2046278891;
				field9759 = -171441939;
				field9760 = false;
			}
			if (Statics.field4292.field10367 * -1015235761 == 37) {
				Statics.field4279 = 3.0F;
				Statics.field4269 = 3.0F;
			} else if (Statics.field4292.field10367 * -1015235761 == 50) {
				Statics.field4279 = 4.0F;
				Statics.field4269 = 4.0F;
			} else if (Statics.field4292.field10367 * -1015235761 == 75) {
				Statics.field4279 = 6.0F;
				Statics.field4269 = 6.0F;
			} else if (Statics.field4292.field10367 * -1015235761 == 100) {
				Statics.field4279 = 8.0F;
				Statics.field4269 = 8.0F;
			} else if (Statics.field4292.field10367 * -1015235761 == 200) {
				Statics.field4279 = 16.0F;
				Statics.field4269 = 16.0F;
			} else {
				Statics.field4279 = 8.0F;
				Statics.field4269 = 8.0F;
			}
			Statics.field4276 = (int) Statics.field4279 >> 1;
			Statics.field4275 = class404.method6983(Statics.field4276);
			method12997();
			method7106();
			Statics.field5267 = new class547();
			field4273 += (int) (Math.random() * 5.0D) - 2;
			if (field4273 < -8) {
				field4273 = -8;
			}
			if (field4273 > 8) {
				field4273 = 8;
			}
			field4274 += (int) (Math.random() * 5.0D) - 2;
			if (field4274 < -16) {
				field4274 = -16;
			}
			if (field4274 > 16) {
				field4274 = 16;
			}
			method7087(arg1, field4273 >> 2 << 10, field4274 >> 1);
			Statics.field4290.method7876(1024, 256);
			Statics.field4268.method12502(256, 256);
			Statics.field4266.method11474(4096);
			Statics.field4645.method7658(256);
			field9753 = -1723161380;
		} else if (field9753 * 510447267 == 20) {
			class356.method8512(true);
			method7120(arg0, field4273, field4274);
			field9753 = -874516844;
			class356.method8512(true);
			class385.method2427();
		} else if (field9753 * 510447267 == 60) {
			if (Statics.field4264.method5680(Statics.field4292.field10362 + "_staticelements")) {
				if (!Statics.field4264.method5648(Statics.field4292.field10362 + "_staticelements")) {
					return;
				}
				Statics.field4281 = class406.method2791(Statics.field4264, Statics.field4292.field10362 + "_staticelements", client.field9142);
			} else {
				Statics.field4281 = new class406(0);
			}
			method7093();
			field9753 = -1736097534;
			class356.method8512(true);
			class385.method2427();
		} else if (field9753 * 510447267 == 70) {
			Statics.field4684 = new class56(arg0, 11, true, Statics.field1231);
			field9753 = -1994571741;
			class356.method8512(true);
			class385.method2427();
		} else if (field9753 * 510447267 == 73) {
			Statics.field6790 = new class56(arg0, 12, true, Statics.field1231);
			field9753 = 2041921348;
			class356.method8512(true);
			class385.method2427();
		} else if (field9753 * 510447267 == 76) {
			Statics.field1578 = new class56(arg0, 14, true, Statics.field1231);
			field9753 = 1783447141;
			class356.method8512(true);
			class385.method2427();
		} else if (field9753 * 510447267 == 79) {
			Statics.field9549 = new class56(arg0, 17, true, Statics.field1231);
			field9753 = 1524972934;
			class356.method8512(true);
			class385.method2427();
		} else if (field9753 * 510447267 == 82) {
			Statics.field3263 = new class56(arg0, 19, true, Statics.field1231);
			field9753 = 1266498727;
			class356.method8512(true);
			class385.method2427();
		} else if (field9753 * 510447267 == 85) {
			Statics.field1388 = new class56(arg0, 22, true, Statics.field1231);
			field9753 = 1008024520;
			class356.method8512(true);
			class385.method2427();
		} else if (field9753 * 510447267 == 88) {
			Statics.field7158 = new class56(arg0, 26, true, Statics.field1231);
			field9753 = 749550313;
			class356.method8512(true);
			class385.method2427();
		} else {
			Statics.field4325 = new class56(arg0, 30, true, Statics.field1231);
			field9753 = -25872308;
			class356.method8512(true);
			class385.method2427();
			System.gc();
		}
	}

	@ObfuscatedName("ya.bi(I)V")
	public static void method12997() {
		if (Statics.field4465 * 1195676065 < 0) {
			Statics.field4465 = 0;
			field9762 = 980974933;
			field9756 = -1795653037;
		}
		if (Statics.field4465 * 1195676065 > Statics.field4285) {
			Statics.field4465 = Statics.field4285 * 1050120801;
			field9762 = 980974933;
			field9756 = -1795653037;
		}
		if (Statics.field6770 * 721300301 < 0) {
			Statics.field6770 = 0;
			field9762 = 980974933;
			field9756 = -1795653037;
		}
		if (Statics.field6770 * 721300301 > Statics.field4282) {
			Statics.field6770 = Statics.field4282 * -1811479163;
			field9762 = 980974933;
			field9756 = -1795653037;
		}
	}

	@ObfuscatedName("on.bx(ZI)V")
	public static void method7184(boolean arg0) {
		if (arg0 && Statics.field4292 != null) {
			Statics.field809 = Statics.field4292.field10370 * 1005732043;
		} else {
			Statics.field809 = -1184493409;
		}
		Statics.field4292 = null;
		Statics.field5267 = null;
		field9753 = 0;
		Statics.field4960 = null;
		method7082();
		field4301.method11557();
		Statics.field4281 = null;
		Statics.field2214 = null;
		field9762 = 980974933;
		field9756 = -1795653037;
		Statics.field4684 = null;
		Statics.field6790 = null;
		Statics.field1578 = null;
		Statics.field9549 = null;
		Statics.field3263 = null;
		Statics.field1388 = null;
		Statics.field7158 = null;
		Statics.field4325 = null;
		if (Statics.field4290 != null) {
			Statics.field4290.method7864();
			Statics.field4290.method7876(128, 64);
		}
		if (Statics.field4268 != null) {
			Statics.field4268.method12502(64, 64);
		}
		if (Statics.field4266 != null) {
			Statics.field4266.method11474(256);
		}
		Statics.field4645.method7658(64);
	}

	@ObfuscatedName("eb.bm(B)V")
	public static void method3318() {
		field9765.method11925();
		field9766.method11925();
	}

	@ObfuscatedName("zb.bb(Lra;Lma;IIIIB)V")
	public static void method13877(class14 arg0, class16 arg1, int arg2, int arg3, int arg4, int arg5) {
		if (field9753 * 510447267 < 100) {
			method7164(arg0, arg1);
		}
		arg0.method659(arg2, arg3, arg2 + arg4, arg3 + arg5);
		if (field9753 * 510447267 < 100) {
			byte var6 = 20;
			int var7 = arg4 / 2 + arg2;
			int var8 = arg5 / 2 + arg3 - 18 - var6;
			arg0.method489(arg2, arg3, arg4, arg5, -16777216, 0);
			arg0.method488(var7 - 152, var8, 304, 34, client.field8956[client.field8907 * 380066983].getRGB(), 0);
			arg0.method489(var7 - 150, var8 + 2, field9753 * 1531341801, 30, client.field8974[client.field8907 * 380066983].getRGB(), 0);
			Statics.field670.method834(class588.field7014.method12206(Statics.field2308), var7, var6 + var8, client.field8902[client.field8907 * 380066983].getRGB(), -1);
			return;
		}
		int var9 = Statics.field4465 * 1195676065 - (int) ((float) arg4 / Statics.field4279);
		int var10 = Statics.field6770 * 721300301 + (int) ((float) arg5 / Statics.field4279);
		int var11 = Statics.field4465 * 1195676065 + (int) ((float) arg4 / Statics.field4279);
		int var12 = Statics.field6770 * 721300301 - (int) ((float) arg5 / Statics.field4279);
		Statics.field6354 = (Statics.field4465 * 1195676065 - (int) ((float) arg4 / Statics.field4279)) * 110057855;
		Statics.field7054 = (Statics.field6770 * 721300301 - (int) ((float) arg5 / Statics.field4279)) * -2058530697;
		Statics.field6423 = (int) ((float) (arg4 * 2) / Statics.field4279) * 1162224271;
		Statics.field6344 = (int) ((float) (arg5 * 2) / Statics.field4279) * -34129491;
		method7094(Statics.field4283 + var9, Statics.field4284 + var10, Statics.field4283 + var11, Statics.field4284 + var12, arg2, arg3, arg2 + arg4, arg3 + arg5 + 1);
		method7095(arg0);
		class547 var13 = method7099(arg0);
		method2356(arg0, var13, 0, 0);
		if (Statics.field4469 * -98872673 > 0) {
			Statics.field10208 -= -1507481465;
			if (Statics.field10208 * -1753047753 == 0) {
				Statics.field4469 -= -1936504481;
				Statics.field10208 = -84858228;
			}
		}
		if (!client.field8926) {
			return;
		}
		int var14 = arg2 + arg4 - 5;
		int var15 = arg3 + arg5 - 8;
		Statics.field560.method862("Fps:" + class385.field4121 * -1738065381, var14, var15, 16776960, -1);
		int var19 = var15 - 15;
		Runtime var16 = Runtime.getRuntime();
		int var17 = (int) ((var16.totalMemory() - var16.freeMemory()) / 1024L);
		int var18 = 16776960;
		if (var17 > 65536) {
			var18 = 16711680;
		}
		Statics.field560.method862("Mem:" + var17 + "k", var14, var19, var18, -1);
		var15 = var19 - 15;
	}

	@ObfuscatedName("cr.be(Lra;Ltq;III)V")
	public static void method2356(class14 arg0, class547 arg1, int arg2, int arg3) {
		Statics.field5267.method11557();
		if (field9758) {
			return;
		}
		for (class806 var4 = (class806) arg1.method11563(); var4 != null; var4 = (class806) arg1.method11567()) {
			class443 var5 = Statics.field4290.method7862(var4.field9564 * 489208493);
			if (method1371(var5)) {
				boolean var6 = method1358(arg0, var4, var5, arg2, arg3);
				if (var6) {
					method14746(arg0, var4, var5);
				}
			}
		}
	}

	@ObfuscatedName("z.bw(Lpw;I)Z")
	public static boolean method1371(class443 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.field4797) {
			return false;
		} else if (!arg0.method7835(Statics.field4299)) {
			return false;
		} else if (field9765.method11923((long) (arg0.field4763 * 1124031359)) == null) {
			return field9766.method11923((long) (arg0.field4775 * -915402335)) == null;
		} else {
			return false;
		}
	}

	@ObfuscatedName("d.bo(Lra;Ladw;Lpw;III)Z")
	public static boolean method1358(class14 arg0, class806 arg1, class443 arg2, int arg3, int arg4) {
		int var5 = Integer.MAX_VALUE;
		int var6 = Integer.MIN_VALUE;
		int var7 = Integer.MAX_VALUE;
		int var8 = Integer.MIN_VALUE;
		if (arg2.field4788 != null) {
			var5 = (arg1.field9566 * 181589995 + arg2.field4790 * 1218081049 - Statics.field4296) * (Statics.field4270 - Statics.field4300) / (Statics.field4298 - Statics.field4296) + Statics.field4300;
			var6 = (arg1.field9566 * 181589995 + arg2.field4792 * -1377975363 - Statics.field4296) * (Statics.field4270 - Statics.field4300) / (Statics.field4298 - Statics.field4296) + Statics.field4300;
			var8 = Statics.field4303 - (arg1.field9567 * 1571295259 + arg2.field4791 * -1006494569 - Statics.field4302) * (Statics.field4303 - Statics.field4286) / (Statics.field4297 - Statics.field4302);
			var7 = Statics.field4303 - (arg1.field9567 * 1571295259 + arg2.field4773 * -1533759511 - Statics.field4302) * (Statics.field4303 - Statics.field4286) / (Statics.field4297 - Statics.field4302);
		}
		class118 var9 = null;
		int var10 = 0;
		int var11 = 0;
		int var12 = 0;
		int var13 = 0;
		if (arg2.field4764 * 1631376311 != -1) {
			if (arg1.field9570 && arg2.field4769 * -1789777335 != -1) {
				var9 = arg2.method7847(arg0, true);
			} else {
				var9 = arg2.method7847(arg0, false);
			}
			if (var9 != null) {
				var10 = arg1.field9568 * 1212466503 - (var9.method1042() + 1 >> 1);
				if (var10 < var5) {
					var5 = var10;
				}
				var11 = arg1.field9568 * 1212466503 + (var9.method1042() + 1 >> 1);
				if (var11 > var6) {
					var6 = var11;
				}
				var12 = arg1.field9569 * 1752588477 - (var9.method1047() + 1 >> 1);
				if (var12 < var7) {
					var7 = var12;
				}
				var13 = arg1.field9569 * 1752588477 + (var9.method1047() + 1 >> 1);
				if (var13 > var8) {
					var8 = var13;
				}
			}
		}
		class56 var14 = null;
		int var15 = 0;
		int var16 = 0;
		int var17 = 0;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		int var22 = 0;
		if (arg2.field4766 != null) {
			var14 = method188(arg2.field4777 * -508652975);
			if (var14 != null) {
				var15 = Statics.field559.method12398(arg2.field4766, null, field9761, null);
				var16 = arg2.field4793 * 1380727543 * (Statics.field4270 - Statics.field4300) / (Statics.field4298 - Statics.field4296) + arg1.field9568 * 1212466503;
				int var23 = arg1.field9569 * 1752588477 - arg2.field4799 * 819690603 * (Statics.field4303 - Statics.field4286) / (Statics.field4297 - Statics.field4302);
				if (var9 == null) {
					var17 = var23 - var14.method1762() * var15 / 2;
				} else {
					var17 = var23 - ((var9.method1047() >> 1) + var14.method1746() * var15);
				}
				for (int var24 = 0; var24 < var15; var24++) {
					String var25 = field9761[var24];
					if (var24 < var15 - 1) {
						var25 = var25.substring(0, var25.length() - 4);
					}
					int var26 = var14.method1747(var25);
					if (var26 > var18) {
						var18 = var26;
					}
				}
				var19 = var16 - var18 / 2 + arg3;
				if (var19 < var5) {
					var5 = var19;
				}
				var20 = var18 / 2 + var16 + arg3;
				if (var20 > var6) {
					var6 = var20;
				}
				var21 = arg4 + var17;
				if (var21 < var7) {
					var7 = var21;
				}
				var22 = var17 + var15 * var14.method1746() + arg4;
				if (var22 > var8) {
					var8 = var22;
				}
			}
		}
		if (var6 < Statics.field4300 || var5 > Statics.field4270 || var8 < Statics.field4286 || var7 > Statics.field4303) {
			return true;
		}
		method7102(arg0, arg1, arg2);
		if (var9 != null) {
			if (Statics.field4469 * -98872673 > 0 && (field9755 * -1375112899 != -1 && field9755 * -1375112899 == arg1.field9564 * 489208493 || field9763 * 1383356893 != -1 && field9763 * 1383356893 == arg2.field4775 * -915402335)) {
				int var27;
				if (Statics.field10208 * -1753047753 > 50) {
					var27 = 200 - Statics.field10208 * 788871790;
				} else {
					var27 = Statics.field10208 * 788871790;
				}
				int var28 = var27 << 24 | 0xFFFF00;
				arg0.method484(arg1.field9568 * 1212466503, arg1.field9569 * 1752588477, var9.method1061() / 2 + 7, var28);
				arg0.method484(arg1.field9568 * 1212466503, arg1.field9569 * 1752588477, var9.method1061() / 2 + 5, var28);
				arg0.method484(arg1.field9568 * 1212466503, arg1.field9569 * 1752588477, var9.method1061() / 2 + 3, var28);
				arg0.method484(arg1.field9568 * 1212466503, arg1.field9569 * 1752588477, var9.method1061() / 2 + 1, var28);
				arg0.method484(arg1.field9568 * 1212466503, arg1.field9569 * 1752588477, var9.method1061() / 2, var28);
			}
			var9.method2500(arg1.field9568 * 1212466503 - (var9.method1042() >> 1), arg1.field9569 * 1752588477 - (var9.method1047() >> 1));
		}
		if (arg2.field4766 != null && var14 != null) {
			method6644(arg0, arg1, arg2, var15, var16, var17, var18, var14);
		}
		if (arg2.field4764 * 1631376311 != -1 || arg2.field4766 != null) {
			class771 var29 = new class771(arg1);
			var29.field9295 = var10 * -698931095;
			var29.field9296 = var11 * 1005265897;
			var29.field9301 = var12 * 36816141;
			var29.field9298 = var13 * 300220153;
			var29.field9297 = var19 * 2141902221;
			var29.field9300 = var20 * 734861661;
			var29.field9299 = var21 * 969474777;
			var29.field9302 = var22 * 1199674849;
			Statics.field5267.method11558(var29);
		}
		return false;
	}

	@ObfuscatedName("acr.bh(Lra;Ladw;Lpw;I)V")
	public static void method14746(class14 arg0, class806 arg1, class443 arg2) {
		class118 var3 = arg2.method7841(arg0);
		if (var3 == null) {
			return;
		}
		int var4 = var3.method1061();
		if (var3.method1045() > var4) {
			var4 = var3.method1045();
		}
		byte var5 = 10;
		int var6 = arg1.field9568 * 1212466503;
		int var7 = arg1.field9569 * 1752588477;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		if (arg2.field4766 != null) {
			var8 = Statics.field559.method12398(arg2.field4766, null, field9761, null);
			for (int var11 = 0; var11 < var8; var11++) {
				String var12 = field9761[var11];
				if (var11 < var8 - 1) {
					var12 = var12.substring(0, var12.length() - 4);
				}
				int var13 = Statics.field1578.method1747(var12);
				if (var13 > var9) {
					var9 = var13;
				}
			}
			var10 = Statics.field1578.method1746() * var8 + Statics.field1578.method1762() / 2;
		}
		int var14 = var4 / 2 + arg1.field9568 * 1212466503;
		int var15 = arg1.field9569 * 1752588477;
		if (var6 < Statics.field4300 + var4) {
			var6 = Statics.field4300;
			var14 = var9 / 2 + var4 / 2 + Statics.field4300 + var5 + 5;
		} else if (var6 > Statics.field4270 - var4) {
			var6 = Statics.field4270 - var4;
			var14 = Statics.field4270 - var4 / 2 - var5 - var9 / 2 - 5;
		}
		if (var7 < Statics.field4286 + var4) {
			var7 = Statics.field4286;
			var15 = var4 / 2 + Statics.field4286 + var5;
		} else if (var7 > Statics.field4303 - var4) {
			var7 = Statics.field4303 - var4;
			var15 = Statics.field4303 - var4 / 2 - var5 - var10;
		}
		int var16 = (int) (Math.atan2((double) (var6 - arg1.field9568 * 1212466503), (double) (var7 - arg1.field9569 * 1752588477)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		var3.method2503((float) var4 / 2.0F + (float) var6, (float) var4 / 2.0F + (float) var7, 4096, var16);
		int var17 = -2;
		int var18 = -2;
		int var19 = -2;
		int var20 = -2;
		if (arg2.field4766 != null) {
			var17 = var14 - var9 / 2 - 5;
			var18 = var15;
			var19 = var9 + var17 + 10;
			var20 = var15 + Statics.field1578.method1746() * var8 + 3;
			if (arg2.field4801 * 551609653 != 0) {
				arg0.method496(var17, var15, var19 - var17, var20 - var15, arg2.field4801 * 551609653);
			}
			if (arg2.field4782 * -368620319 != 0) {
				arg0.method482(var17, var15, var19 - var17, var20 - var15, arg2.field4782 * -368620319);
			}
			for (int var21 = 0; var21 < var8; var21++) {
				String var22 = field9761[var21];
				if (var21 < var8 - 1) {
					var22 = var22.substring(0, var22.length() - 4);
				}
				Statics.field1578.method1749(arg0, var22, var14, var15, arg2.field4767 * 1897540121, true);
				var15 += Statics.field1578.method1746();
			}
		}
		if (arg2.field4764 * 1631376311 == -1 && arg2.field4766 == null) {
			return;
		}
		class771 var23 = new class771(arg1);
		int var24 = var4 >> 1;
		var23.field9295 = (var6 - var24) * -698931095;
		var23.field9296 = (var6 + var24) * 1005265897;
		var23.field9301 = (var7 - var24) * 36816141;
		var23.field9298 = (var7 + var24) * 300220153;
		var23.field9297 = var17 * 2141902221;
		var23.field9300 = var19 * 734861661;
		var23.field9299 = var18 * 969474777;
		var23.field9302 = var20 * 1199674849;
		Statics.field5267.method11558(var23);
	}

	@ObfuscatedName("ta.by(IB)Las;")
	public static class56 method188(int arg0) {
		if (arg0 == 0) {
			if ((double) Statics.field4279 == 3.0D) {
				return Statics.field4684;
			}
			if ((double) Statics.field4279 == 4.0D) {
				return Statics.field6790;
			}
			if ((double) Statics.field4279 == 6.0D) {
				return Statics.field1578;
			}
			if ((double) Statics.field4279 >= 8.0D) {
				return Statics.field9549;
			}
		} else if (arg0 == 1) {
			if ((double) Statics.field4279 == 3.0D) {
				return Statics.field1578;
			}
			if ((double) Statics.field4279 == 4.0D) {
				return Statics.field9549;
			}
			if ((double) Statics.field4279 == 6.0D) {
				return Statics.field3263;
			}
			if ((double) Statics.field4279 >= 8.0D) {
				return Statics.field1388;
			}
		} else if (arg0 == 2) {
			if ((double) Statics.field4279 == 3.0D) {
				return Statics.field3263;
			}
			if ((double) Statics.field4279 == 4.0D) {
				return Statics.field1388;
			}
			if ((double) Statics.field4279 == 6.0D) {
				return Statics.field7158;
			}
			if ((double) Statics.field4279 >= 8.0D) {
				return Statics.field4325;
			}
		}
		return null;
	}

	@ObfuscatedName("nf.bu(Lra;Ladw;Lpw;IIIILas;B)V")
	public static void method6644(class14 arg0, class806 arg1, class443 arg2, int arg3, int arg4, int arg5, int arg6, class56 arg7) {
		int var8 = arg4 - arg6 / 2 - 5;
		int var9 = arg5 + 2;
		if (arg2.field4801 * 551609653 != 0) {
			arg0.method496(var8, var9, arg6 + 10, arg5 + arg3 * arg7.method1746() - var9 + 1, arg2.field4801 * 551609653);
		}
		if (arg2.field4782 * -368620319 != 0) {
			arg0.method482(var8, var9, arg6 + 10, arg5 + arg3 * arg7.method1746() - var9 + 1, arg2.field4782 * -368620319);
		}
		int var10 = arg2.field4767 * 1897540121;
		if (arg1.field9570 && arg2.field4768 * 120868477 != -1) {
			var10 = arg2.field4768 * 120868477;
		}
		for (int var11 = 0; var11 < arg3; var11++) {
			String var12 = field9761[var11];
			if (var11 < arg3 - 1) {
				var12 = var12.substring(0, var12.length() - 4);
			}
			arg7.method1749(arg0, var12, arg4, arg5, var10, true);
			arg5 += arg7.method1746();
		}
	}

	@ObfuscatedName("if.cl(Lra;IIIII)V")
	public static final void method4707(class14 arg0, int arg1, int arg2, int arg3, int arg4) {
		arg0.method659(arg1, arg2, arg1 + arg3, arg2 + arg4);
		arg0.method496(arg1, arg2, arg3, arg4, -16777216);
		if (field9753 * 510447267 < 100) {
			return;
		}
		float var5 = (float) Statics.field4282 / (float) Statics.field4285;
		int var6 = arg3;
		int var7 = arg4;
		if (var5 < 1.0F) {
			var7 = (int) ((float) arg3 * var5);
		} else {
			var6 = (int) ((float) arg4 / var5);
		}
		int var8 = (arg3 - var6) / 2 + arg1;
		int var9 = (arg4 - var7) / 2 + arg2;
		if (Statics.field2214 == null || Statics.field2214.method1061() != arg3 || Statics.field2214.method1045() != arg4) {
			method7094(Statics.field4283, Statics.field4284 + Statics.field4282, Statics.field4285 + Statics.field4283, Statics.field4284, var8, var9, var6 + var8, var7 + var9);
			method7095(arg0);
			Statics.field2214 = arg0.method508(var8, var9, var6, var7, false);
		}
		Statics.field2214.method2500(var8, var9);
		int var10 = Statics.field6423 * 2053815407 * var6 / Statics.field4285;
		int var11 = Statics.field6344 * -908029403 * var7 / Statics.field4282;
		int var12 = Statics.field6354 * 398878335 * var6 / Statics.field4285 + var8;
		int var13 = var7 + var9 - Statics.field7054 * 1798932807 * var7 / Statics.field4282 - var11;
		int var14 = -1996554240;
		if (client.field9163 == class527.field6402) {
			var14 = -1996488705;
		}
		arg0.method489(var12, var13, var10, var11, var14, 1);
		arg0.method488(var12, var13, var10, var11, var14, 0);
		if (Statics.field4469 * -98872673 <= 0) {
			return;
		}
		int var15;
		if (Statics.field10208 * -1753047753 > 50) {
			var15 = 500 - Statics.field10208 * -175304173;
		} else {
			var15 = Statics.field10208 * -175304173;
		}
		for (class806 var16 = (class806) field4301.method11563(); var16 != null; var16 = (class806) field4301.method11567()) {
			class443 var17 = Statics.field4290.method7862(var16.field9564 * 489208493);
			if (method1371(var17)) {
				if (field9755 * -1375112899 == var16.field9564 * 489208493) {
					int var18 = var16.field9566 * 181589995 * var6 / Statics.field4285 + var8;
					int var19 = (Statics.field4282 - var16.field9567 * 1571295259) * var7 / Statics.field4282 + var9;
					arg0.method496(var18 - 2, var19 - 2, 4, 4, var15 << 24 | 0xFFFF00);
				} else if (field9763 * 1383356893 != -1 && field9763 * 1383356893 == var17.field4775 * -915402335) {
					int var20 = var16.field9566 * 181589995 * var6 / Statics.field4285 + var8;
					int var21 = (Statics.field4282 - var16.field9567 * 1571295259) * var7 / Statics.field4282 + var9;
					arg0.method496(var20 - 2, var21 - 2, 4, 4, var15 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@ObfuscatedName("ud.cq(IIB)V")
	public static final void method12144(int arg0, int arg1) {
		if (Statics.field4279 < Statics.field4269) {
			Statics.field4279 = (float) ((double) Statics.field4279 / 30.0D + (double) Statics.field4279);
			if (Statics.field4279 > Statics.field4269) {
				Statics.field4279 = Statics.field4269;
			}
			method12997();
			Statics.field4276 = (int) Statics.field4279 >> 1;
			Statics.field4275 = class404.method6983(Statics.field4276);
		} else if (Statics.field4279 > Statics.field4269) {
			Statics.field4279 = (float) ((double) Statics.field4279 - (double) Statics.field4279 / 30.0D);
			if (Statics.field4279 < Statics.field4269) {
				Statics.field4279 = Statics.field4269;
			}
			method12997();
			Statics.field4276 = (int) Statics.field4279 >> 1;
			Statics.field4275 = class404.method6983(Statics.field4276);
		}
		if (field9762 * 117204995 != -1 && field9756 * -1880822235 != -1) {
			int var2 = field9762 * 117204995 - Statics.field4465 * 1195676065;
			if (var2 < 2 || var2 > 2) {
				var2 /= 8;
			}
			int var3 = field9756 * -1880822235 - Statics.field6770 * 721300301;
			if (var3 < 2 || var3 > 2) {
				var3 /= 8;
			}
			Statics.field4465 = (Statics.field4465 * 1195676065 + var2) * 1050120801;
			Statics.field6770 = (Statics.field6770 * 721300301 + var3) * -1811479163;
			if (var2 == 0 && var3 == 0) {
				field9762 = 980974933;
				field9756 = -1795653037;
			}
			method12997();
		}
		if (Statics.field4469 * -98872673 > 0) {
			Statics.field10208 -= -1507481465;
			if (Statics.field10208 * -1753047753 == 0) {
				Statics.field4469 -= -1936504481;
				Statics.field10208 = -424291140;
			}
		} else {
			field9755 = 1024463339;
			field9763 = 2139437451;
		}
		if (!field9754 || Statics.field5267 == null) {
			return;
		}
		for (class771 var4 = (class771) Statics.field5267.method11563(); var4 != null; var4 = (class771) Statics.field5267.method11567()) {
			class443 var5 = Statics.field4290.method7862(var4.field9303.field9564 * 489208493);
			if (var4.method14803(arg0, arg1)) {
				if (var5.field4778 != null) {
					if (var5.field4778[4] != null) {
						Statics.method8140(var5.field4778[4], var5.field4779, -1, 1012, -1, (long) (var4.field9303.field9564 * 489208493), var5.field4775 * -915402335, 0, true, false, (long) (var4.field9303.field9564 * 489208493), false);
					}
					if (var5.field4778[3] != null) {
						Statics.method8140(var5.field4778[3], var5.field4779, -1, 1011, -1, (long) (var4.field9303.field9564 * 489208493), var5.field4775 * -915402335, 0, true, false, (long) (var4.field9303.field9564 * 489208493), false);
					}
					if (var5.field4778[2] != null) {
						Statics.method8140(var5.field4778[2], var5.field4779, -1, 1010, -1, (long) (var4.field9303.field9564 * 489208493), var5.field4775 * -915402335, 0, true, false, (long) (var4.field9303.field9564 * 489208493), false);
					}
					if (var5.field4778[1] != null) {
						Statics.method8140(var5.field4778[1], var5.field4779, -1, 1009, -1, (long) (var4.field9303.field9564 * 489208493), var5.field4775 * -915402335, 0, true, false, (long) (var4.field9303.field9564 * 489208493), false);
					}
					if (var5.field4778[0] != null) {
						Statics.method8140(var5.field4778[0], var5.field4779, -1, 1008, -1, (long) (var4.field9303.field9564 * 489208493), var5.field4775 * -915402335, 0, true, false, (long) (var4.field9303.field9564 * 489208493), false);
					}
				}
				if (!var4.field9303.field9570) {
					var4.field9303.field9570 = true;
					class502.method1372(class619.field7304, var4.field9303.field9564 * 489208493, var5.field4775 * -915402335);
				}
				if (var4.field9303.field9570) {
					class502.method1372(class619.field7311, var4.field9303.field9564 * 489208493, var5.field4775 * -915402335);
				}
			} else if (var4.field9303.field9570) {
				var4.field9303.field9570 = false;
				class502.method1372(class619.field7319, var4.field9303.field9564 * 489208493, var5.field4775 * -915402335);
			}
		}
	}

	@ObfuscatedName("ze.co(IIII)V")
	public static void method13878(int arg0, int arg1, int arg2) {
		if (arg0 == 1008) {
			class502.method1372(class619.field7317, arg1, arg2);
		} else if (arg0 == 1009) {
			class502.method1372(class619.field7306, arg1, arg2);
		} else if (arg0 == 1010) {
			class502.method1372(class619.field7301, arg1, arg2);
		} else if (arg0 == 1011) {
			class502.method1372(class619.field7302, arg1, arg2);
		} else if (arg0 == 1012) {
			class502.method1372(class619.field7303, arg1, arg2);
		}
	}

	@ObfuscatedName("ru.cb(IIIZB)V")
	public static void method8626(int arg0, int arg1, int arg2, boolean arg3) {
		if (Statics.field4961.field9661.method15781() == 0) {
			method7184(false);
		} else {
			field9764 = Statics.field4961.field9661.method15781() * 2117865979;
			Statics.method5600(0, true);
		}
		field9759 = arg1 * 171441939;
		field9757 = arg2 * 2046278891;
		field9760 = arg3;
		method7122(arg0);
	}

	@ObfuscatedName("em.cm(I)V")
	public static void method3465() {
		method7184(false);
		if (field9764 * -242724557 < 0 || field9764 * -242724557 == 0) {
			return;
		}
		Statics.method5600(field9764 * -242724557, false);
		if (Statics.field4961.field9661.method15781() != field9764 * -242724557) {
			switch(field9764 * -242724557) {
				case 1:
					class558.method12023(class628.field7359);
					break;
				case 2:
					class558.method12023(class628.field7360);
					break;
				case 3:
					class558.method12023(class628.field7361);
			}
		}
		field9764 = -2117865979;
	}

	@ObfuscatedName("of.cw(B)V")
	public static void method7071() {
		if (Statics.field809 * 638121121 != -1) {
			method8626(Statics.field809 * 638121121, -1, -1, false);
			Statics.field809 = -1184493409;
		}
	}

	@ObfuscatedName("uh.cx(I)Lajo;")
	public static class951 method12024() {
		return Statics.field4292;
	}

	@ObfuscatedName("jf.cn(II)V")
	public static void method4746(int arg0) {
		Statics.field4465 = arg0 * 1050120801;
		field9762 = 980974933;
		field9756 = -1795653037;
		method12997();
	}

	@ObfuscatedName("uv.cf(II)V")
	public static void method12163(int arg0) {
		Statics.field6770 = arg0 * -1811479163;
		field9756 = -1795653037;
		field9756 = -1795653037;
		method12997();
	}

	@ObfuscatedName("yf.cs(II)V")
	public static void method12903(int arg0) {
		if (arg0 == 37) {
			Statics.field4269 = 3.0F;
		} else if (arg0 == 50) {
			Statics.field4269 = 4.0F;
		} else if (arg0 == 75) {
			Statics.field4269 = 6.0F;
		} else if (arg0 == 100) {
			Statics.field4269 = 8.0F;
		} else if (arg0 == 200) {
			Statics.field4269 = 16.0F;
		}
		field9756 = -1795653037;
		field9756 = -1795653037;
	}

	@ObfuscatedName("we.cr(IIIIB)V")
	public static void method12692(int arg0, int arg1, int arg2, int arg3) {
		float var4 = (float) Statics.field4282 / (float) Statics.field4285;
		int var5 = arg2;
		int var6 = arg3;
		if (var4 < 1.0F) {
			var6 = (int) ((float) arg2 * var4);
		} else {
			var5 = (int) ((float) arg3 / var4);
		}
		int var7 = arg0 - (arg2 - var5) / 2;
		int var8 = arg1 - (arg3 - var6) / 2;
		Statics.field4465 = Statics.field4285 * var7 / var5 * 1050120801;
		Statics.field6770 = (Statics.field4282 - Statics.field4282 * var8 / var6) * -1811479163;
		field9762 = 980974933;
		field9756 = -1795653037;
		method12997();
	}

	@ObfuscatedName("x.cp(I)I")
	public static int method1603() {
		if ((double) Statics.field4269 == 3.0D) {
			return 37;
		} else if ((double) Statics.field4269 == 4.0D) {
			return 50;
		} else if ((double) Statics.field4269 == 6.0D) {
			return 75;
		} else if ((double) Statics.field4269 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@ObfuscatedName("ss.ci(II)V")
	public static void method11236(int arg0) {
		field9755 = arg0 * -1024463339;
		field9763 = 2139437451;
		Statics.field4469 = -1514546147;
		Statics.field10208 = -424291140;
	}

	@ObfuscatedName("ed.ca(II)V")
	public static void method3087(int arg0) {
		field9755 = 1024463339;
		field9763 = arg0 * -2139437451;
		Statics.field4469 = -1514546147;
		Statics.field10208 = -424291140;
	}

	@ObfuscatedName("py.ch(IIII)I")
	public static int method7984(int arg0, int arg1, int arg2) {
		if (field9753 * 510447267 < 100) {
			return -2;
		}
		int var3 = -2;
		int var4 = Integer.MAX_VALUE;
		int var5 = arg1 - Statics.field4283;
		int var6 = arg2 - Statics.field4284;
		for (class806 var7 = (class806) field4301.method11563(); var7 != null; var7 = (class806) field4301.method11567()) {
			if (var7.field9564 * 489208493 == arg0) {
				int var8 = var7.field9566 * 181589995;
				int var9 = var7.field9567 * 1571295259;
				int var10 = Statics.field4283 + var8 << 14 | Statics.field4284 + var9;
				int var11 = (var5 - var8) * (var5 - var8) + (var6 - var9) * (var6 - var9);
				if (var3 < 0 || var11 < var4) {
					var3 = var10;
					var4 = var11;
				}
			}
		}
		return var3;
	}

	@ObfuscatedName("wb.cv(I)Ladw;")
	public static class806 method12725() {
		if (field4301 == null || field9767 == null) {
			return null;
		}
		field9767.method11691(field4301);
		class806 var0 = (class806) field9767.method11701();
		if (var0 == null) {
			return null;
		} else {
			class443 var1 = Statics.field4290.method7862(var0.field9564 * 489208493);
			return var1 != null && var1.field4802 && var1.method7835(Statics.field4299) ? var0 : method11468();
		}
	}

	@ObfuscatedName("tg.ck(S)Ladw;")
	public static class806 method11468() {
		if (field4301 == null || field9767 == null) {
			return null;
		}
		for (class806 var0 = (class806) field9767.next(); var0 != null; var0 = (class806) field9767.next()) {
			class443 var1 = Statics.field4290.method7862(var0.field9564 * 489208493);
			if (var1 != null && var1.field4802 && var1.method7835(Statics.field4299)) {
				return var0;
			}
		}
		return null;
	}

	@ObfuscatedName("wh.cd(III)V")
	public static void method12730(int arg0, int arg1) {
		field9762 = (arg0 - Statics.field4283) * -980974933;
		field9756 = (arg1 - Statics.field4284) * 1795653037;
	}
}
