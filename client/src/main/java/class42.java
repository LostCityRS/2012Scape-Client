
import deob.ObfuscatedName;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("w")
public class class42 {

	@ObfuscatedName("w.s")
	public static int field582 = 16;

	@ObfuscatedName("w.t")
	public static boolean field585 = false;

	@ObfuscatedName("w.l")
	public static boolean field586 = false;

	@ObfuscatedName("w.f")
	public static class946 field583 = null;

	@ObfuscatedName("w.o")
	public static int field602 = 0;

	@ObfuscatedName("w.x")
	public static int field588 = 0;

	@ObfuscatedName("w.i")
	public static int field594 = 0;

	@ObfuscatedName("w.v")
	public static class547 field595 = new class547();

	@ObfuscatedName("w.k")
	public static class565 field609 = new class565(16);

	@ObfuscatedName("w.h")
	public static class552 field592 = new class552();

	@ObfuscatedName("w.r")
	public static class547 field598 = new class547();

	@ObfuscatedName("w.g")
	public static class547 field599 = new class547();

	@ObfuscatedName("w.y")
	public static class451 field600 = new class451(30);

	@ObfuscatedName("w.ai")
	public static class165 field597 = null;

	@ObfuscatedName("w.ao")
	public static int field604 = -1;

	@ObfuscatedName("w.al")
	public static int field593 = -1;

	@ObfuscatedName("w.at")
	public static int field606 = -1;

	@ObfuscatedName("w.ax")
	public static int field607 = -1;

	@ObfuscatedName("w.aw")
	public static int field614 = 0;

	@ObfuscatedName("w.aa")
	public static int field587 = 0;

	@ObfuscatedName("w.am")
	public static class320 field610 = null;

	@ObfuscatedName("w.ad")
	public static class320 field596 = new class320();

	@ObfuscatedName("w.az")
	public static class314 field612 = new class314();

	@ObfuscatedName("w.ak")
	public static boolean field613 = false;

	@ObfuscatedName("w.br")
	public static int field615 = 0;

	@ObfuscatedName("w.bi")
	public static int field616 = -1;

	@ObfuscatedName("w.bx")
	public static class451 field620 = new class451(8);

	@ObfuscatedName("w.bo")
	public static float[] field618 = new float[4];

	public class42() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ep.u(I)Z")
	public static boolean method3496() {
		return method3635(Statics.field1736.field5129);
	}

	@ObfuscatedName("xb.j(I)Z")
	public static boolean method12751() {
		return method3635(Statics.field1736.field5125);
	}

	@ObfuscatedName("fk.s(Lpf;B)Z")
	public static boolean method3635(class450 arg0) {
		return method2554(arg0, null);
	}

	@ObfuscatedName("cc.c(Lpr;Ladv;I)Z")
	public static boolean method2554(class445 arg0, class809 arg1) {
		return arg0 != null && arg0.method7884(arg1, client.field9072, client.field8953, Statics.field2131);
	}

	@ObfuscatedName("ey.m(S)V")
	public static void method3475() {
		Statics.field7187 = new class944(class588.field6937.method12206(Statics.field2308), "", client.field9235, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@ObfuscatedName("fc.t(I)V")
	public static void method3534() {
		if (client.field9059 >= 0) {
			return;
		}
		class603 var0 = method8078();
		if (!field585) {
			field586 = field616 != -1 && field588 >= field616 || (field613 ? 26 : 22) + field588 * field582 > Statics.field4677;
		}
		field598.method11557();
		field599.method11557();
		for (class944 var1 = (class944) field595.method11563(); var1 != null; var1 = (class944) field595.method11567()) {
			int var2 = var1.field10340;
			if (var2 < 1000) {
				var1.method6979();
				if (var2 == 59 || var2 == 2 || var2 == 8 || var2 == 17 || var2 == 15 || var2 == 16 || var2 == 58) {
					field599.method11558(var1);
				} else {
					field598.method11558(var1);
				}
			}
		}
		field598.method11601(field595);
		field599.method11601(field595);
		if (field588 > 1) {
			if (method12751() && field588 > 2) {
				Statics.field6655 = (class944) field595.field6647.field4227.field4227;
			} else {
				Statics.field6655 = (class944) field595.field6647.field4227;
			}
			Statics.field2654 = (class944) field595.field6647.field4227;
			if (field588 > 2) {
				Statics.field627 = (class944) Statics.field2654.field4227;
			} else {
				Statics.field627 = null;
			}
		} else {
			Statics.field6655 = null;
			Statics.field2654 = null;
			Statics.field627 = null;
		}
		class809 var3 = (class809) client.field9136.method11563();
		int var4;
		int var5;
		if (var3 == null) {
			var4 = Statics.field7136.method7254();
			var5 = Statics.field7136.method7255();
		} else {
			var4 = var3.method15182();
			var5 = var3.method15183();
		}
		if (!field585) {
			boolean var36 = method2554(Statics.field1736.field5120, var3);
			boolean var37 = method2554(Statics.field1736.field5121, var3);
			boolean var38 = method2554(Statics.field1736.field5122, var3);
			if ((var36 || var37) && (client.field8933 == 1 && field588 > 2 || method16114())) {
				var38 = true;
			}
			if (var38 && field588 > 0) {
				if (client.field9115 == null && client.field9150 == 0) {
					Statics.method5718(var4, var5);
				} else {
					field602 = 2;
				}
			} else if (var37) {
				if (Statics.field627 != null) {
					Statics.method15936(Statics.field627, var4, var5);
				}
			} else if (var36) {
				if (Statics.field6655 != null) {
					boolean var39 = client.field9115 != null || client.field9150 > 0;
					if (var39) {
						field602 = 1;
						Statics.field5136 = Statics.field6655;
					} else {
						Statics.method15936(Statics.field6655, var4, var5);
					}
				} else if (client.field9117) {
					client.method11223();
				}
			}
			if (client.field9115 == null && client.field9150 == 0) {
				field602 = 0;
				Statics.field5136 = null;
			}
		} else if (!method2554(Statics.field1736.field5123, var3)) {
			boolean var27 = false;
			if (field583 != null) {
				if (var4 >= Statics.field384 - 10 && var4 <= Statics.field603 + Statics.field384 + 10 && var5 >= Statics.field9294 - 10 && var5 <= Statics.field9294 + Statics.field567 + 10) {
					var27 = true;
				} else {
					method7557();
				}
			}
			if (!var27) {
				if (var4 < Statics.field4756 - 10 || var4 > Statics.field4756 + Statics.field1571 + 10 || var5 < Statics.field2325 - 10 || var5 > Statics.field611 + Statics.field2325 + 10) {
					method3561();
				} else if (field586) {
					int var28 = -1;
					int var29 = -1;
					for (int var30 = 0; var30 < field594; var30++) {
						if (field613) {
							int var31 = field582 * var30 + var0.field7176 + Statics.field2325 + 20 + 1;
							if (var5 > var31 - var0.field7176 - 1 && var5 < var0.field7177 + var31) {
								var28 = var30;
								var29 = var31 - var0.field7176 - 1;
								break;
							}
						} else {
							int var32 = field582 * var30 + Statics.field2325 + 31;
							if (var5 > var32 - 13 && var5 < var32 + 3) {
								var28 = var30;
								var29 = var32 - 13;
								break;
							}
						}
					}
					if (var28 != -1) {
						int var33 = 0;
						class551 var34 = new class551(field592);
						for (class946 var35 = (class946) var34.method11715(); var35 != null; var35 = (class946) var34.next()) {
							if (var28 == var33) {
								if (var35.field10346 > 1) {
									method1672(var35, var29);
								}
								break;
							}
							var33++;
						}
					}
				}
			}
		} else if (field583 != null && var4 >= Statics.field384 && var4 <= Statics.field603 + Statics.field384 && var5 >= Statics.field9294 && var5 <= Statics.field9294 + Statics.field567) {
			int var6 = -1;
			for (int var7 = 0; var7 < field583.field10346; var7++) {
				if (field613) {
					int var8 = field582 * var7 + var0.field7176 + Statics.field9294 + 20 + 1;
					if (var5 > var8 - var0.field7176 - 1 && var5 < var0.field7177 + var8) {
						var6 = var7;
					}
				} else {
					int var9 = field582 * var7 + Statics.field9294 + 31;
					if (var5 > var9 - 13 && var5 < var9 + 3) {
						var6 = var7;
					}
				}
			}
			if (var6 != -1) {
				int var10 = 0;
				class551 var11 = new class551(field583.field10345);
				for (class944 var12 = (class944) var11.method11715(); var12 != null; var12 = (class944) var11.next()) {
					if (var6 == var10) {
						Statics.method15936(var12, var4, var5);
						break;
					}
					var10++;
				}
			}
			method3561();
		} else if (var4 >= Statics.field4756 && var4 <= Statics.field4756 + Statics.field1571 && var5 >= Statics.field2325 && var5 <= Statics.field611 + Statics.field2325) {
			if (field586) {
				int var20 = -1;
				for (int var21 = 0; var21 < field594; var21++) {
					if (field613) {
						int var22 = field582 * var21 + var0.field7176 + Statics.field2325 + 20 + 1;
						if (var5 > var22 - var0.field7176 - 1 && var5 < var0.field7177 + var22) {
							var20 = var21;
							break;
						}
					} else {
						int var23 = field582 * var21 + Statics.field2325 + 31;
						if (var5 > var23 - 13 && var5 < var23 + 3) {
							var20 = var21;
							break;
						}
					}
				}
				if (var20 != -1) {
					int var24 = 0;
					class551 var25 = new class551(field592);
					for (class946 var26 = (class946) var25.method11715(); var26 != null; var26 = (class946) var25.next()) {
						if (var20 == var24) {
							Statics.method15936((class944) var26.field10345.field6662.field9552, var4, var5);
							method3561();
							break;
						}
						var24++;
					}
				}
			} else {
				int var13 = -1;
				for (int var14 = 0; var14 < field588; var14++) {
					if (field613) {
						int var15 = field582 * (field588 - 1 - var14) + var0.field7176 + Statics.field2325 + 20 + 1;
						if (var5 > var15 - var0.field7176 - 1 && var5 < var0.field7177 + var15) {
							var13 = var14;
						}
					} else {
						int var16 = field582 * (field588 - 1 - var14) + Statics.field2325 + 31;
						if (var5 > var16 - 13 && var5 < var16 + 3) {
							var13 = var14;
						}
					}
				}
				if (var13 != -1) {
					int var17 = 0;
					class550 var18 = new class550(field595);
					for (class944 var19 = (class944) var18.method11701(); var19 != null; var19 = (class944) var18.next()) {
						if (var13 == var17) {
							Statics.method15936(var19, var4, var5);
							break;
						}
						var17++;
					}
				}
				method3561();
			}
		}
	}

	@ObfuscatedName("zs.l(III)V")
	public static void method13889(int arg0, int arg1) {
		if (field602 == 1) {
			Statics.method15936(Statics.field5136, arg0, arg1);
		} else if (field602 == 2) {
			Statics.method5718(arg0, arg1);
		}
		field602 = 0;
		Statics.field5136 = null;
	}

	@ObfuscatedName("ahj.f(I)Z")
	public static boolean method16114() {
		if (Statics.field2654 == null) {
			return false;
		} else {
			if (Statics.field2654.field10340 >= 2000) {
				Statics.field2654.field10340 -= 2000;
			}
			return Statics.field2654.field10340 == 1007;
		}
	}

	@ObfuscatedName("e.z(Lajz;II)V")
	public static void method1672(class946 arg0, int arg1) {
		if (!field585) {
			return;
		}
		class603 var2 = method8078();
		int var3 = 0;
		for (class944 var4 = (class944) arg0.field10345.method11756(); var4 != null; var4 = (class944) arg0.field10345.method11744()) {
			int var5 = method5560(var4, var2);
			if (var5 > var3) {
				var3 = var5;
			}
		}
		var3 += 8;
		int var6 = field582 * arg0.field10346 + 21;
		Statics.field567 = (field613 ? 26 : 22) + field582 * arg0.field10346;
		int var7 = Statics.field4756 + Statics.field1571;
		if (var3 + var7 > Statics.field4125) {
			var7 = Statics.field4756 - var3;
		}
		if (var7 < 0) {
			var7 = 0;
		}
		int var8 = field613 ? var2.field7176 + 20 + 1 : 31;
		int var9 = var2.field7176 + (arg1 - var8) + 1;
		if (var6 + var9 > Statics.field4677) {
			var9 = Statics.field4677 - var6;
		}
		if (var9 < 0) {
			var9 = 0;
		}
		Statics.field384 = var7;
		Statics.field9294 = var9;
		Statics.field603 = var3;
		field583 = arg0;
	}

	@ObfuscatedName("qo.n(I)Lvm;")
	public static class603 method8078() {
		class603 var0;
		if (!field613) {
			var0 = Statics.field2399;
		} else if (Statics.field10523 == null || Statics.field2136 == null) {
			var0 = Statics.field2399;
		} else {
			var0 = Statics.field2136;
		}
		field582 = var0.field7177 + var0.field7176;
		return var0;
	}

	@ObfuscatedName("fn.o(I)V")
	public static void method3561() {
		method7557();
		field585 = false;
		client.method7910(Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611);
		Statics.field6655 = null;
		Statics.field627 = null;
	}

	@ObfuscatedName("oo.q(I)V")
	public static void method7557() {
		if (field583 != null) {
			field583 = null;
			client.method7910(Statics.field384, Statics.field9294, Statics.field603, Statics.field567);
		}
	}

	@ObfuscatedName("cd.w(Lajs;B)V")
	public static void method2494(class944 arg0) {
		if (arg0 == null) {
			return;
		}
		field595.method11558(arg0);
		field588++;
		Object var1 = null;
		class946 var4;
		if (arg0.field10338 || "".equals(arg0.field10334)) {
			var4 = new class946(arg0.field10334);
			field594++;
		} else {
			long var2 = arg0.field10330;
			for (var4 = (class946) field609.method11923(var2); var4 != null && !var4.field10344.equals(arg0.field10334); var4 = (class946) field609.method11924()) {
			}
			if (var4 == null) {
				var4 = (class946) field600.method7916(var2);
				if (var4 != null && !var4.field10344.equals(arg0.field10334)) {
					var4 = null;
				}
				if (var4 == null) {
					var4 = new class946(arg0.field10334);
				}
				field609.method11927(var4, var2);
				field594++;
			}
		}
		if (var4.method16644(arg0)) {
			method7720(var4);
		}
	}

	@ObfuscatedName("px.b(Lajz;I)V")
	public static void method7720(class946 arg0) {
		boolean var1 = false;
		arg0.method15142();
		for (class946 var2 = (class946) field592.method11756(); var2 != null; var2 = (class946) field592.method11744()) {
			if (method5825(arg0.method16648(), var2.method16648())) {
				class552.method2355(arg0, var2);
				var1 = true;
				break;
			}
		}
		if (!var1) {
			field592.method11728(arg0);
		}
	}

	@ObfuscatedName("l.x(Lew;III)V")
	public static void method881(class165 arg0, int arg1, int arg2) {
		if (client.field9117) {
			class613 var3 = Statics.field7366 == -1 ? null : Statics.field4464.method12600(Statics.field7366);
			if (client.method14331(arg0).method14931() && (Statics.field4822 & 0x20) != 0 && (var3 == null || arg0.method3132(Statics.field7366, var3.field7287) != var3.field7287)) {
				Statics.method8140(client.field9103, client.field9151 + " " + class32.field491 + " " + arg0.field1795, Statics.field477, 58, arg0.field1903, 0L, arg0.field1765, arg0.field1764, true, false, (long) (arg0.field1765 << 32 | arg0.field1764), false);
			}
		}
		for (int var4 = 9; var4 >= 5; var4--) {
			String var5 = method3213(arg0, var4);
			if (var5 != null) {
				Statics.method8140(var5, arg0.field1795, client.method1956(arg0, var4), 1007, arg0.field1903, (long) (var4 + 1), arg0.field1765, arg0.field1764, true, false, (long) (arg0.field1765 << 32 | arg0.field1764), false);
			}
		}
		String var6 = client.method14722(arg0);
		if (var6 != null) {
			Statics.method8140(var6, arg0.field1795, arg0.field1855, 25, arg0.field1903, 0L, arg0.field1765, arg0.field1764, true, false, (long) (arg0.field1765 << 32 | arg0.field1764), false);
		}
		for (int var7 = 4; var7 >= 0; var7--) {
			String var8 = method3213(arg0, var7);
			if (var8 != null) {
				Statics.method8140(var8, arg0.field1795, client.method1956(arg0, var7), 57, arg0.field1903, (long) (var7 + 1), arg0.field1765, arg0.field1764, true, false, (long) (arg0.field1765 << 32 | arg0.field1764), false);
			}
		}
		if (!client.method14331(arg0).method14927()) {
			return;
		}
		if (arg0.field1853 == null) {
			Statics.method8140(class588.field6914.method12206(Statics.field2308), "", -1, 30, arg0.field1903, 0L, arg0.field1765, arg0.field1764, true, false, (long) (arg0.field1765 << 32 | arg0.field1764), false);
		} else {
			Statics.method8140(arg0.field1853, "", -1, 30, arg0.field1903, 0L, arg0.field1765, arg0.field1764, true, false, (long) (arg0.field1765 << 32 | arg0.field1764), false);
		}
	}

	@ObfuscatedName("dv.i(Laay;B)V")
	public static void method2845(class719 arg0) {
		if (arg0 instanceof class903) {
			class903 var1 = (class903) arg0;
			if (var1.field10075 != null) {
				method3201(var1, Statics.field2119.field9807 != var1.field9807);
			}
		} else if (arg0 instanceof class902) {
			class902 var2 = (class902) arg0;
			Statics.method13909(var2, Statics.field2119.field9807 != var2.field9807);
		}
	}

	@ObfuscatedName("je.v(Lra;III)V")
	public static void method4866(class14 arg0, int arg1, int arg2) {
		if (arg1 < 0 || arg2 < 0 || field610 == null) {
			return;
		}
		class453 var3 = client.field8980.method6214();
		class320 var4 = arg0.method781();
		arg0.method784(field610);
		arg0.method524(field612);
		arg0.method659(field606, field607, field614 + field606, field607 + field587);
		arg0.method474(field606, field607, field614, field587);
		var4.method5385(field612);
		var4.method5384(field610);
		var4.method5387();
		int var5 = arg1 - field606;
		int var6 = arg2 - field607;
		if (client.field8980.method6098() != null && (!client.field9117 || (Statics.field4822 & 0x40) != 0)) {
			int var7 = -1;
			int var8 = -1;
			float var9 = (float) var5 * 2.0F / (float) field614 - 1.0F;
			float var10 = (float) var6 * 2.0F / (float) field587 - 1.0F;
			var4.method5390(var9, var10, -1.0F, field618);
			float var11 = field618[0] / field618[3];
			float var12 = field618[1] / field618[3];
			float var13 = field618[2] / field618[3];
			var4.method5390(var9, var10, 1.0F, field618);
			float var14 = field618[0] / field618[3];
			float var15 = field618[1] / field618[3];
			float var16 = field618[2] / field618[3];
			float var17 = method16791(var11, var12, var13, var14, var15, var16, 4);
			if (var17 > 0.0F) {
				float var18 = var14 - var11;
				float var19 = var16 - var13;
				int var20 = (int) (var17 * var18 + var11);
				int var21 = (int) (var17 * var19 + var13);
				var7 = var20 + (Statics.field2119.method13954() - 1 << 8) >> 9;
				var8 = var21 + (Statics.field2119.method13954() - 1 << 8) >> 9;
				byte var22 = Statics.field2119.field9807;
				if (var22 < 3 && (client.field8980.method6100().field3606[1][var20 >> 9][var21 >> 9] & 0x2) != 0) {
					int var91 = var22 + 1;
				}
			}
			if (var7 != -1 && var8 != -1) {
				if (client.field9117 && (Statics.field4822 & 0x40) != 0) {
					class165 var23 = class165.method15145(Statics.field4166, client.field9101);
					if (var23 == null) {
						client.method11223();
					} else {
						Statics.method8140(client.field9103, " " + class32.field491 + " ", Statics.field477, 59, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
					}
				} else {
					if (Statics.field6371) {
						Statics.method8140(class588.field6995.method12206(Statics.field2308), "", -1, 60, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
					}
					Statics.method8140(Statics.field2400, "", client.field9172, 23, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
				}
			}
		}
		class421 var24 = client.field8980.method6098().field4541;
		int var25 = arg1;
		int var26 = arg2;
		List var27 = var24.field4471;
		Iterator var28 = var27.iterator();
		while (true) {
			int var32;
			int var33;
			class113 var83;
			class540 var84;
			String[] var86;
			do {
				class425 var29;
				do {
					do {
						do {
							while (true) {
								while (true) {
									do {
										do {
											if (!var28.hasNext()) {
												return;
											}
											var29 = (class425) var28.next();
										} while (!client.field8940 && Statics.field2119.field9807 != var29.field4563.field9807);
									} while (!var29.method7568(arg0, var25, var26));
									boolean var30 = false;
									boolean var31 = false;
									if (var29.field4563 instanceof class974) {
										var32 = ((class974) var29.field4563).field10510;
										var33 = ((class974) var29.field4563).field10509;
									} else {
										class317 var34 = var29.field4563.method8565().field3464;
										var32 = (int) var34.field3475 >> 9;
										var33 = (int) var34.field3477 >> 9;
									}
									if (!(var29.field4563 instanceof class902)) {
										break;
									}
									class902 var35 = (class902) var29.field4563;
									int var36 = var35.method13954();
									class317 var37 = var35.method8565().field3464;
									if ((var36 & 0x1) == 0 && ((int) var37.field3475 & 0x1FF) == 0 && ((int) var37.field3477 & 0x1FF) == 0 || (var36 & 0x1) == 1 && ((int) var37.field3475 & 0x1FF) == 256 && ((int) var37.field3477 & 0x1FF) == 256) {
										int var38 = (int) var37.field3475 - (var35.method13954() - 1 << 8);
										int var39 = (int) var37.field3477 - (var35.method13954() - 1 << 8);
										for (int var40 = 0; var40 < client.field9104; var40++) {
											class798 var41 = (class798) client.field8964.method11923((long) client.field9056[var40]);
											if (var41 != null) {
												class903 var42 = (class903) var41.field9550;
												if (client.field9213 != var42.field8635 && var42.field8634) {
													class317 var43 = var42.method8565().field3464;
													int var44 = (int) var43.field3475 - (var42.field10075.field7213 - 1 << 8);
													int var45 = (int) var43.field3477 - (var42.field10075.field7213 - 1 << 8);
													if (var44 >= var38 && var42.field10075.field7213 <= var35.method13954() - (var44 - var38 >> 9) && var45 >= var39 && var42.field10075.field7213 <= var35.method13954() - (var45 - var39 >> 9)) {
														method3201(var42, Statics.field2119.field9807 != var29.field4563.field9807);
														var42.field8635 = client.field9213;
													}
												}
											}
										}
										int var46 = class55.field732;
										int[] var47 = class55.field727;
										for (int var48 = 0; var48 < var46; var48++) {
											class902 var49 = client.field9070[var47[var48]];
											if (var49 != null && client.field9213 != var49.field8635 && var35 != var49 && var49.field8634) {
												class317 var50 = var49.method8565().field3464;
												int var51 = (int) var50.field3475 - (var49.method13954() - 1 << 8);
												int var52 = (int) var50.field3477 - (var49.method13954() - 1 << 8);
												if (var51 >= var38 && var49.method13954() <= var35.method13954() - (var51 - var38 >> 9) && var52 >= var39 && var49.method13954() <= var35.method13954() - (var52 - var39 >> 9)) {
													Statics.method13909(var49, Statics.field2119.field9807 != var29.field4563.field9807);
													var49.field8635 = client.field9213;
												}
											}
										}
									}
									if (client.field9213 != var35.field8635) {
										Statics.method13909(var35, Statics.field2119.field9807 != var29.field4563.field9807);
										var35.field8635 = client.field9213;
										break;
									}
								}
								if (!(var29.field4563 instanceof class903)) {
									break;
								}
								class903 var53 = (class903) var29.field4563;
								if (var53.field10075 == null) {
									break;
								}
								class317 var54 = var53.method8565().field3464;
								if ((var53.field10075.field7213 & 0x1) == 0 && ((int) var54.field3475 & 0x1FF) == 0 && ((int) var54.field3477 & 0x1FF) == 0 || (var53.field10075.field7213 & 0x1) == 1 && ((int) var54.field3475 & 0x1FF) == 256 && ((int) var54.field3477 & 0x1FF) == 256) {
									int var55 = (int) var54.field3475 - (var53.field10075.field7213 - 1 << 8);
									int var56 = (int) var54.field3477 - (var53.field10075.field7213 - 1 << 8);
									for (int var57 = 0; var57 < client.field9104; var57++) {
										class798 var58 = (class798) client.field8964.method11923((long) client.field9056[var57]);
										if (var58 != null) {
											class903 var59 = (class903) var58.field9550;
											if (client.field9213 != var59.field8635 && var53 != var59 && var59.field8634) {
												class317 var60 = var59.method8565().field3464;
												int var61 = (int) var60.field3475 - (var59.field10075.field7213 - 1 << 8);
												int var62 = (int) var60.field3477 - (var59.field10075.field7213 - 1 << 8);
												if (var61 >= var55 && var59.field10075.field7213 <= var53.field10075.field7213 - (var61 - var55 >> 9) && var62 >= var56 && var59.field10075.field7213 <= var53.field10075.field7213 - (var62 - var56 >> 9)) {
													method3201(var59, Statics.field2119.field9807 != var29.field4563.field9807);
													var59.field8635 = client.field9213;
												}
											}
										}
									}
									int var63 = class55.field732;
									int[] var64 = class55.field727;
									for (int var65 = 0; var65 < var63; var65++) {
										class902 var66 = client.field9070[var64[var65]];
										if (var66 != null && client.field9213 != var66.field8635 && var66.field8634) {
											class317 var67 = var66.method8565().field3464;
											int var68 = (int) var67.field3475 - (var66.method13954() - 1 << 8);
											int var69 = (int) var67.field3477 - (var66.method13954() - 1 << 8);
											if (var68 >= var55 && var66.method13954() <= var53.field10075.field7213 - (var68 - var55 >> 9) && var69 >= var56 && var66.method13954() <= var53.field10075.field7213 - (var69 - var56 >> 9)) {
												Statics.method13909(var66, Statics.field2119.field9807 != var29.field4563.field9807);
												var66.field8635 = client.field9213;
											}
										}
									}
								}
								if (client.field9213 != var53.field8635) {
									method3201(var53, Statics.field2119.field9807 != var29.field4563.field9807);
									var53.field8635 = client.field9213;
									break;
								}
							}
							if (var29.field4563 instanceof class1008) {
								int var70 = var3.field4836 + var32;
								int var71 = var3.field4838 + var33;
								class774 var72 = (class774) client.field9088.method11923((long) (var29.field4563.field9807 << 28 | var71 << 14 | var70));
								if (var72 != null) {
									int var73 = 0;
									class773 var74 = (class773) var72.field9313.method11565();
									while (var74 != null) {
										class592 var75 = Statics.field3492.method12316(var74.field9311);
										int var76;
										if (var75.field7086) {
											var76 = var75.field7097;
										} else if (var75.field7099) {
											var76 = Statics.field1736.field5127;
										} else {
											var76 = Statics.field1736.field5128;
										}
										if (client.field9117 && Statics.field2119.field9807 == var29.field4563.field9807) {
											class613 var77 = Statics.field7366 == -1 ? null : Statics.field4464.method12600(Statics.field7366);
											if ((Statics.field4822 & 0x1) != 0 && (var77 == null || var75.method12250(Statics.field7366, var77.field7287) != var77.field7287)) {
												Statics.method8140(client.field9103, client.field9151 + " " + class32.field491 + " " + class32.method3978(var76) + var75.field7125, Statics.field477, 17, -1, (long) var74.field9311, var32, var33, true, false, (long) var73, false);
											}
										}
										if (Statics.field2119.field9807 == var29.field4563.field9807) {
											String[] var78 = var75.field7082;
											for (int var79 = var78.length - 1; var79 >= 0; var79--) {
												if (var78[var79] != null) {
													short var80 = 0;
													int var81 = client.field9098;
													if (var79 == 0) {
														var80 = 18;
													}
													if (var79 == 1) {
														var80 = 19;
													}
													if (var79 == 2) {
														var80 = 20;
													}
													if (var79 == 3) {
														var80 = 21;
													}
													if (var79 == 4) {
														var80 = 22;
													}
													if (var79 == 5) {
														var80 = 1004;
													}
													int var82 = var75.method12251(var79);
													if (var82 != -1) {
														var81 = var82;
													}
													Statics.method8140(var78[var79], class32.method3978(var76) + var75.field7125, var81, var80, -1, (long) var74.field9311, var32, var33, true, false, (long) var73, false);
												}
											}
										}
										var74 = (class773) var72.field9313.method11568();
										var73++;
									}
								}
							}
						} while (!(var29.field4563 instanceof class113));
						var83 = (class113) var29.field4563;
						var84 = client.field8980.method6103().method11471(var83.method2401());
						if (var84.field6534 != null) {
							var84 = var84.method11431(Statics.field2669);
						}
					} while (var84 == null);
					if (client.field9117 && Statics.field2119.field9807 == var29.field4563.field9807) {
						class613 var85 = Statics.field7366 == -1 ? null : Statics.field4464.method12600(Statics.field7366);
						if ((Statics.field4822 & 0x4) != 0 && (var85 == null || var84.method11444(Statics.field7366, var85.field7287) != var85.field7287)) {
							Statics.method8140(client.field9103, client.field9151 + " " + class32.field491 + " " + class32.method3978(65535) + var84.field6490, Statics.field477, 2, -1, method14745(var83, var32, var33), var32, var33, true, false, (long) var83.hashCode(), false);
						}
					}
				} while (Statics.field2119.field9807 != var29.field4563.field9807);
				var86 = var84.field6505;
			} while (var86 == null);
			for (int var87 = var86.length - 1; var87 >= 0; var87--) {
				if (var86[var87] != null) {
					short var88 = 0;
					int var89 = client.field9098;
					if (var87 == 0) {
						var88 = 3;
					}
					if (var87 == 1) {
						var88 = 4;
					}
					if (var87 == 2) {
						var88 = 5;
					}
					if (var87 == 3) {
						var88 = 6;
					}
					if (var87 == 4) {
						var88 = 1001;
					}
					if (var87 == 5) {
						var88 = 1002;
					}
					int var90 = var84.method11413(var87);
					if (var90 != -1) {
						var89 = var90;
					}
					Statics.method8140(var86[var87], class32.method3978(65535) + var84.field6490, var89, var88, -1, method14745(var83, var32, var33), var32, var33, true, false, (long) var83.hashCode(), false);
				}
			}
		}
	}

	@ObfuscatedName("acr.k(Lca;III)J")
	public static long method14745(class113 arg0, int arg1, int arg2) {
		long var3 = 4194304L;
		long var5 = Long.MIN_VALUE;
		class540 var7 = client.field8980.method6103().method11471(arg0.method2401());
		long var8 = (long) (arg1 | arg2 << 7 | arg0.method2390() << 14 | arg0.method2391() << 20 | 0x40000000);
		if (var7.field6493 == 0) {
			var8 |= var5;
		}
		if (var7.field6527 == 1) {
			var8 |= var3;
		}
		return var8 | (long) arg0.method2401() << 32;
	}

	@ObfuscatedName("nf.h(Lajs;S)V")
	public static void method6643(class944 arg0) {
		if (field585) {
			return;
		}
		arg0.method6979();
		field588--;
		if (!arg0.field10338) {
			long var1 = arg0.field10330;
			class946 var3;
			for (var3 = (class946) field609.method11923(var1); var3 != null && !var3.field10344.equals(arg0.field10334); var3 = (class946) field609.method11924()) {
			}
			if (var3 != null && var3.method16650(arg0)) {
				method7720(var3);
			}
			return;
		}
		for (class946 var4 = (class946) field592.method11756(); var4 != null; var4 = (class946) field592.method11744()) {
			if (var4.field10344.equals(arg0.field10334)) {
				boolean var5 = false;
				for (class944 var6 = (class944) var4.field10345.method11756(); var6 != null; var6 = (class944) var4.field10345.method11744()) {
					if (arg0 == var6) {
						if (var4.method16650(arg0)) {
							method7720(var4);
						}
						var5 = true;
						break;
					}
				}
				if (var5) {
					break;
				}
			}
		}
	}

	@ObfuscatedName("ru.r(B)V")
	public static void method8628() {
		for (class944 var0 = (class944) field595.method11563(); var0 != null; var0 = (class944) field595.method11567()) {
			if (Statics.method1367(var0.field10340)) {
				method6643(var0);
			}
		}
	}

	@ObfuscatedName("sl.g(II)Z")
	public static boolean method11169(int arg0) {
		for (class944 var1 = (class944) field595.method11563(); var1 != null; var1 = (class944) field595.method11567()) {
			if (method8731(var1.field10340) && var1.field10333 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("eq.y(I)Z")
	public static boolean method3011() {
		return field588 > 0;
	}

	@ObfuscatedName("abm.e(Lra;I)V")
	public static void method14209(class14 arg0) {
		if (field585) {
			method1238(arg0);
		} else {
			method3526(arg0);
		}
	}

	@ObfuscatedName("q.ay(I)V")
	public static void method1401() {
		for (class946 var0 = (class946) field592.method11756(); var0 != null; var0 = (class946) field592.method11744()) {
			if (var0.field10346 > 1) {
				var0.field10346 = 0;
				field600.method7937(var0, ((class944) var0.field10345.field6662.field9552).field10330);
				var0.field10345.method11733();
			}
		}
		field594 = 0;
		field588 = 0;
		field595.method11557();
		field609.method11925();
		field592.method11733();
		method2494(Statics.field7187);
	}

	@ObfuscatedName("sv.af(I)V")
	public static void method11300() {
		for (class946 var0 = (class946) field592.method11756(); var0 != null; var0 = (class946) field592.method11744()) {
			if (var0.field10346 > 1) {
				var0.field10346 = 0;
				field600.method7937(var0, ((class944) var0.field10345.field6662.field9552).field10330);
				var0.field10345.method11733();
			}
		}
		field594 = 0;
		field588 = 0;
		field595.method11557();
		field609.method11925();
		field592.method11733();
		field585 = false;
	}

	@ObfuscatedName("zy.ar(B)V")
	public static void method13886() {
		Statics.field8491 = null;
		Statics.field1557 = null;
		Statics.field2652 = null;
		Statics.field6392 = null;
		Statics.field6819 = null;
		Statics.field8519 = null;
		Statics.field3925 = null;
		Statics.field3411 = null;
		Statics.field10523 = null;
		Statics.field2136 = null;
	}

	@ObfuscatedName("gc.an(I)V")
	public static void method3963() {
		method13886();
		Statics.field383 = null;
	}

	@ObfuscatedName("eo.ap([Lce;B)V")
	public static void method3288(class118[] arg0) {
		Statics.field4161 = arg0.length;
		Statics.field383 = new class118[Statics.field4161 + 10];
		Statics.field2187 = new int[Statics.field4161 + 10];
		System.arraycopy(arg0, 0, Statics.field383, 0, Statics.field4161);
		for (int var1 = 0; var1 < Statics.field4161; var1++) {
			Statics.field2187[var1] = Statics.field383[var1].method1047();
		}
		for (int var2 = Statics.field4161; var2 < Statics.field383.length; var2++) {
			Statics.field2187[var2] = 12;
		}
	}

	@ObfuscatedName("ig.as(Lew;III)V")
	public static void method4560(class165 arg0, int arg1, int arg2) {
		field597 = arg0;
		field604 = arg1;
		field593 = arg2;
	}

	@ObfuscatedName("aai.ai(I)I")
	public static int method14087() {
		if (client.field9115 == null) {
			if (field585) {
				class603 var0 = method8078();
				int var1 = Statics.field7136.method7254();
				int var2 = Statics.field7136.method7255();
				if (field586) {
					if (var1 > Statics.field4756 && var1 < Statics.field4756 + Statics.field1571) {
						int var10 = -1;
						for (int var11 = 0; var11 < field594; var11++) {
							if (field613) {
								int var12 = field582 * var11 + var0.field7176 + Statics.field2325 + 20 + 1;
								if (var2 > var12 - var0.field7176 - 1 && var2 < var0.field7177 + var12) {
									var10 = var11;
								}
							} else {
								int var13 = field582 * var11 + Statics.field2325 + 31;
								if (var2 > var13 - var0.field7176 - 1 && var2 < var0.field7177 + var13) {
									var10 = var11;
								}
							}
						}
						if (var10 != -1) {
							int var14 = 0;
							class551 var15 = new class551(field592);
							for (class946 var16 = (class946) var15.method11715(); var16 != null; var16 = (class946) var15.next()) {
								if (var14++ == var10) {
									return ((class944) var16.field10345.field6662.field9552).field10331;
								}
							}
						}
					} else if (field583 != null && var1 > Statics.field384 && var1 < Statics.field603 + Statics.field384) {
						int var17 = -1;
						for (int var18 = 0; var18 < field583.field10346; var18++) {
							if (field613) {
								int var19 = field582 * var18 + var0.field7176 + Statics.field9294 + 20 + 1;
								if (var2 > var19 - var0.field7176 - 1 && var2 < var0.field7177 + var19) {
									var17 = var18;
								}
							} else {
								int var20 = field582 * var18 + Statics.field9294 + 31;
								if (var2 > var20 - var0.field7176 - 1 && var2 < var0.field7177 + var20) {
									var17 = var18;
								}
							}
						}
						if (var17 != -1) {
							int var21 = 0;
							class551 var22 = new class551(field583.field10345);
							for (class944 var23 = (class944) var22.method11715(); var23 != null; var23 = (class944) var22.next()) {
								if (var21++ == var17) {
									return var23.field10331;
								}
							}
						}
					}
				} else if (var1 > Statics.field4756 && var1 < Statics.field4756 + Statics.field1571) {
					int var3 = -1;
					for (int var4 = 0; var4 < field588; var4++) {
						if (field613) {
							int var5 = field582 * (field588 - 1 - var4) + var0.field7176 + Statics.field2325 + 20 + 1;
							if (var2 > var5 - var0.field7176 - 1 && var2 < var0.field7177 + var5) {
								var3 = var4;
							}
						} else {
							int var6 = field582 * (field588 - 1 - var4) + Statics.field2325 + 31;
							if (var2 > var6 - var0.field7176 - 1 && var2 < var0.field7177 + var6) {
								var3 = var4;
							}
						}
					}
					if (var3 != -1) {
						int var7 = 0;
						class550 var8 = new class550(field595);
						for (class944 var9 = (class944) var8.method11701(); var9 != null; var9 = (class944) var8.next()) {
							if (var7++ == var3) {
								return var9.field10331;
							}
						}
					}
				}
			} else if (Statics.field1736.field5124) {
				if (Statics.field627 != null) {
					return Statics.field627.field10331;
				}
			} else if (Statics.field6655 != null) {
				return Statics.field6655.field10331;
			}
		}
		return -1;
	}

	@ObfuscatedName("qr.ao(III)Z")
	public static boolean method8097(int arg0, int arg1) {
		if (!field585) {
			return false;
		}
		int var2 = arg0 >> 16;
		int var3 = arg0 & 0xFFFF;
		if (Statics.field1756[var2] == null || Statics.field1756[var2].field1732[var3] == null) {
			return false;
		}
		class165 var4 = Statics.field1756[var2].field1732[var3];
		if (arg1 == -1 && var4.field1766 == 0) {
			for (class944 var5 = (class944) field595.method11563(); var5 != null; var5 = (class944) field595.method11567()) {
				if (var5.field10340 == 58 || var5.field10340 == 1007 || var5.field10340 == 25 || var5.field10340 == 57 || var5.field10340 == 30) {
					for (class165 var6 = class165.method11381(var5.field10335); var6 != null; var6 = client.method4752(Statics.field1756[var6.field1764 >> 16], var6)) {
						if (var4.field1764 == var6.field1764) {
							return true;
						}
					}
				}
			}
		} else {
			for (class944 var7 = (class944) field595.method11563(); var7 != null; var7 = (class944) field595.method11567()) {
				if (var7.field10329 == arg1 && var4.field1764 == var7.field10335 && (var7.field10340 == 58 || var7.field10340 == 1007 || var7.field10340 == 25 || var7.field10340 == 57 || var7.field10340 == 30)) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("rv.al(I)Lajs;")
	public static class944 method11098() {
		return Statics.field6655;
	}

	@ObfuscatedName("oe.at(I)Lajs;")
	public static class944 method7326() {
		return Statics.field627;
	}

	@ObfuscatedName("fm.aw(Lajs;I)Ljava/lang/String;")
	public static String method3629(class944 arg0) {
		if (field585 || arg0 == null) {
			return "";
		} else if ((arg0.field10334 == null || arg0.field10334.length() == 0) && arg0.field10341 != null && arg0.field10341.length() > 0) {
			return arg0.field10341;
		} else {
			return arg0.field10334;
		}
	}

	@ObfuscatedName("sh.aa(Lajs;I)I")
	public static int method11220(class944 arg0) {
		if (field585) {
			return 6;
		} else if (arg0 == null) {
			return 0;
		} else {
			int var1 = arg0.field10340;
			if (Statics.method1367(var1)) {
				return 1;
			} else if (method5562(var1)) {
				return 2;
			} else if (method1676(var1)) {
				return 3;
			} else if (method8731(var1)) {
				return 4;
			} else if (method5597(var1)) {
				return 7;
			} else if (var1 == 16) {
				return 8;
			} else {
				return 5;
			}
		}
	}

	@ObfuscatedName("mp.am(Lajs;I)Ljava/lang/String;")
	public static String method6256(class944 arg0) {
		if (field585 || arg0 == null) {
			return "";
		} else {
			int[] var1 = Statics.method3289(arg0);
			return var1 == null ? "" : method11875(var1);
		}
	}

	@ObfuscatedName("er.ad(Lkc;Lka;III)V")
	public static void method2994(class314 arg0, class320 arg1, int arg2, int arg3) {
		if (field610 == null) {
			field610 = new class320(arg1);
		} else {
			field610.method5412(arg1);
		}
		field612.method5115(arg0);
		field614 = arg2;
		field587 = arg3;
	}

	@ObfuscatedName("u.ak(Lra;B)V")
	public static void method1238(class14 arg0) {
		if (field613) {
			method7895(arg0);
		} else {
			method5017(arg0);
		}
	}

	@ObfuscatedName("fr.av(Lra;B)V")
	public static void method3526(class14 arg0) {
		if (field588 < 2 && !client.field9117 || client.field9115 != null) {
			return;
		}
		String var1;
		if (client.field9117 && field588 < 2) {
			var1 = client.field9103 + class588.field6984.method12206(Statics.field2308) + client.field9151 + " " + class32.field491;
		} else if (method12751() && field588 > 2) {
			var1 = method12186(Statics.field6655);
		} else {
			class944 var2 = Statics.field6655;
			if (var2 == null) {
				return;
			}
			var1 = method12186(var2);
			int[] var3 = Statics.method3289(var2);
			if (var3 != null) {
				var1 = var1 + method11875(var3);
			}
		}
		if (field588 > 2) {
			var1 = var1 + class32.method3978(16777215) + " / " + (field588 - 2) + class588.field6993.method12206(Statics.field2308);
		}
		if (field597 == null) {
			return;
		}
		class15 var4 = field597.method3116(Statics.field6784, client.field8914);
		if (var4 == null) {
			var4 = Statics.field670;
		}
		var4.method842(var1, field604, field593, field597.field1863, field597.field1929, field597.field1792, field597.field1801, field597.field1836, field597.field1837, client.field9207, Statics.field2113, client.field8920, Statics.field383, Statics.field2187);
		client.method7910(client.field8920[0], client.field8920[1], client.field8920[2], client.field8920[3]);
	}

	@ObfuscatedName("ya.aj(Lra;IIIIIIB)V")
	public static void method12996(class14 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		arg0.method496(arg1, arg2, arg3, arg4, arg5);
		arg0.method496(arg1 + 1, arg2 + 1, arg3 - 2, 16, arg6);
		arg0.method482(arg1 + 1, arg2 + 18, arg3 - 2, arg4 - 19, arg6);
	}

	@ObfuscatedName("x.ae(IIIIIIILajz;Ll;Lvm;III)V")
	public static void method1599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class946 arg7, class15 arg8, class603 arg9, int arg10, int arg11) {
		if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.field7176 - 1 && arg1 < arg9.field7177 + arg6) {
			arg10 = arg11;
		}
		String var12 = Statics.method3322(arg7);
		arg8.method841(var12, arg2 + 3, arg6, arg10, 0, client.field9207, Statics.field2113, Statics.field383, Statics.field2187);
	}

	@ObfuscatedName("ky.ac(Lra;I)V")
	public static void method5017(class14 arg0) {
		int var1 = -10660793;
		method12996(arg0, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var1, -16777216);
		Statics.field670.method833(class588.field6992.method12206(Statics.field2308), Statics.field4756 + 3, Statics.field2325 + 14, var1, -1);
		int var2 = Statics.field7136.method7254();
		int var3 = Statics.field7136.method7255();
		if (!field586) {
			int var4 = 0;
			for (class944 var5 = (class944) field595.method11563(); var5 != null; var5 = (class944) field595.method11567()) {
				int var6 = field582 * (field588 - 1 - var4) + Statics.field2325 + 31;
				Statics.method15995(var2, var3, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var6, var5, Statics.field670, Statics.field2399, -1, -256);
				var4++;
			}
			return;
		}
		int var7 = 0;
		for (class946 var8 = (class946) field592.method11756(); var8 != null; var8 = (class946) field592.method11744()) {
			int var9 = field582 * var7 + Statics.field2325 + 31;
			if (var8.field10346 == 1) {
				Statics.method15995(var2, var3, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var9, (class944) var8.field10345.field6662.field9552, Statics.field670, Statics.field2399, -1, -256);
			} else {
				method1599(var2, var3, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var9, var8, Statics.field670, Statics.field2399, -1, -256);
			}
			var7++;
		}
		if (field583 == null) {
			return;
		}
		method12996(arg0, Statics.field384, Statics.field9294, Statics.field603, Statics.field567, var1, -16777216);
		Statics.field670.method833(field583.field10344, Statics.field384 + 3, Statics.field9294 + 14, var1, -1);
		int var10 = 0;
		for (class944 var11 = (class944) field583.field10345.method11756(); var11 != null; var11 = (class944) field583.field10345.method11744()) {
			int var12 = field582 * var10 + Statics.field9294 + 31;
			Statics.method15995(var2, var3, Statics.field384, Statics.field9294, Statics.field603, Statics.field567, var12, var11, Statics.field670, Statics.field2399, -1, -256);
			var10++;
		}
	}

	@ObfuscatedName("ta.aq(Lra;IIIIILl;Lvm;Ljava/lang/String;I)V")
	public static void method190(class14 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class15 arg6, class603 arg7, String arg8) {
		int var9 = 255 - Statics.field6566 - field615;
		if (var9 < 0) {
			var9 = 0;
		}
		if (Statics.field2652 == null || Statics.field8491 == null) {
			if (Statics.field7387.method5630(Statics.field8531) && Statics.field7387.method5630(Statics.field6372)) {
				Statics.field2652 = arg0.method517(class125.method2590(Statics.field7387, Statics.field8531, 0), true);
				class140 var10 = class125.method2590(Statics.field7387, Statics.field6372, 0);
				Statics.field8491 = arg0.method517(var10, true);
				var10.method2757();
				Statics.field1557 = arg0.method517(var10, true);
			} else {
				arg0.method489(arg1, arg2, arg3, arg5, var9 << 24 | Statics.field9426, 1);
			}
		}
		if (Statics.field2652 != null && Statics.field8491 != null) {
			int var11 = (arg3 - Statics.field8491.method1061() * 2) / Statics.field2652.method1061();
			for (int var12 = 0; var12 < var11; var12++) {
				Statics.field2652.method2500(arg1 + Statics.field8491.method1061() + var12 * Statics.field2652.method1061(), arg2);
			}
			Statics.field8491.method2500(arg1, arg2);
			Statics.field1557.method2500(arg1 + arg3 - Statics.field1557.method1061(), arg2);
		}
		arg6.method833(arg8, arg1 + 3, (20 - arg7.field7176) / 2 + arg7.field7176 + arg2, Statics.field8718 | 0xFF000000, -1);
		arg0.method489(arg1, arg2 + arg5, arg3, arg4 - arg5, var9 << 24 | Statics.field9426, 1);
	}

	@ObfuscatedName("ag.ab(Lra;IIIIII)V")
	public static void method1740(class14 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((Statics.field8519 == null || Statics.field6392 == null || Statics.field3925 == null) && Statics.field7387.method5630(Statics.field2333) && Statics.field7387.method5630(Statics.field617) && Statics.field7387.method5630(Statics.field2338)) {
			class140 var6 = class125.method2590(Statics.field7387, Statics.field617, 0);
			Statics.field6392 = arg0.method517(var6, true);
			var6.method2757();
			Statics.field6819 = arg0.method517(var6, true);
			Statics.field8519 = arg0.method517(class125.method2590(Statics.field7387, Statics.field2333, 0), true);
			class140 var7 = class125.method2590(Statics.field7387, Statics.field2338, 0);
			Statics.field3925 = arg0.method517(var7, true);
			var7.method2757();
			Statics.field3411 = arg0.method517(var7, true);
		}
		if (Statics.field8519 == null || Statics.field6392 == null || Statics.field3925 == null) {
			return;
		}
		int var8 = (arg3 - Statics.field3925.method1061() * 2) / Statics.field8519.method1061();
		for (int var9 = 0; var9 < var8; var9++) {
			Statics.field8519.method2500(arg1 + Statics.field3925.method1061() + var9 * Statics.field8519.method1061(), arg2 + arg4 - Statics.field8519.method1045());
		}
		int var10 = (arg4 - arg5 - Statics.field3925.method1045()) / Statics.field6392.method1045();
		for (int var11 = 0; var11 < var10; var11++) {
			Statics.field6392.method2500(arg1, arg2 + arg5 + var11 * Statics.field6392.method1045());
			Statics.field6819.method2500(arg1 + arg3 - Statics.field6819.method1061(), arg2 + arg5 + var11 * Statics.field6392.method1045());
		}
		Statics.field3925.method2500(arg1, arg2 + arg4 - Statics.field3925.method1045());
		Statics.field3411.method2500(arg1 + arg3 - Statics.field3925.method1061(), arg2 + arg4 - Statics.field3925.method1045());
	}

	@ObfuscatedName("pj.bq(Lra;I)V")
	public static void method7895(class14 arg0) {
		int var1 = Statics.field4756;
		int var2 = Statics.field2325;
		int var3 = Statics.field1571;
		int var4 = Statics.field611 - 3;
		byte var5 = 20;
		if (Statics.field10523 == null || Statics.field2136 == null) {
			Statics.field10523 = (class15) Statics.field6784.method4859(client.field8914, Statics.field1387, true, true);
			Statics.field2136 = Statics.field6784.method4843(client.field8914, Statics.field1387);
			if (Statics.field10523 != null && Statics.field2136 != null) {
				method3561();
				int var6 = var3 / 2 + var1;
				if (var3 + var6 > Statics.field4125) {
					var6 = Statics.field4125 - var3;
				}
				if (var6 < 0) {
					var6 = 0;
				}
				Statics.method5718(var6, Statics.field2325);
				return;
			}
		}
		class15 var7;
		if (Statics.field10523 == null || Statics.field2136 == null) {
			var7 = Statics.field670;
		} else {
			var7 = Statics.field10523;
		}
		class603 var8 = method8078();
		method190(arg0, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var5, var7, var8, class588.field6992.method12206(Statics.field2308));
		int var9 = 255 - Statics.field5052 - field615;
		if (var9 < 0) {
			var9 = 0;
		}
		int var10 = Statics.field7136.method7254();
		int var11 = Statics.field7136.method7255();
		if (field586) {
			int var15 = 0;
			for (class946 var16 = (class946) field592.method11756(); var16 != null; var16 = (class946) field592.method11744()) {
				int var17 = field582 * var15 + var8.field7176 + var2 + var5 + 1;
				if (var10 > Statics.field4756 && var10 < Statics.field4756 + Statics.field1571 && var11 > var17 - var8.field7176 - 1 && var11 < var8.field7177 + var17 && (var16.field10346 > 1 || ((class944) var16.field10345.field6662.field9552).field10336)) {
					arg0.method489(Statics.field4756, var17 - var8.field7176, Statics.field1571, field582, var9 << 24 | Statics.field1477, 1);
				}
				var15++;
			}
			if (field583 != null) {
				method190(arg0, Statics.field384, Statics.field9294, Statics.field603, Statics.field567, var5, var7, var8, field583.field10344);
				int var18 = 0;
				for (class944 var19 = (class944) field583.field10345.method11756(); var19 != null; var19 = (class944) field583.field10345.method11744()) {
					int var20 = field582 * var18 + var8.field7176 + Statics.field9294 + var5 + 1;
					if (var10 > Statics.field384 && var10 < Statics.field603 + Statics.field384 && var11 > var20 - var8.field7176 - 1 && var11 < var8.field7177 + var20 && var19.field10336) {
						arg0.method489(Statics.field384, var20 - var8.field7176, Statics.field603, field582, var9 << 24 | Statics.field1477, 1);
					}
					var18++;
				}
				method1740(arg0, Statics.field384, Statics.field9294, Statics.field603, Statics.field567, var5);
			}
		} else {
			int var12 = 0;
			for (class944 var13 = (class944) field595.method11563(); var13 != null; var13 = (class944) field595.method11567()) {
				int var14 = field582 * (field588 - 1 - var12) + var8.field7176 + var2 + var5 + 1;
				if (var10 > Statics.field4756 && var10 < Statics.field4756 + Statics.field1571 && var11 > var14 - var8.field7176 - 1 && var11 < var8.field7177 + var14 && var13.field10336) {
					arg0.method489(Statics.field4756, var14 - var8.field7176, Statics.field1571, field582, var9 << 24 | Statics.field1477, 1);
				}
				var12++;
			}
		}
		method1740(arg0, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var5);
		if (!field586) {
			int var21 = 0;
			for (class944 var22 = (class944) field595.method11563(); var22 != null; var22 = (class944) field595.method11567()) {
				int var23 = field582 * (field588 - 1 - var21) + var8.field7176 + var2 + var5 + 1;
				Statics.method15995(var10, var11, var1, var2, var3, var4, var23, var22, var7, var8, Statics.field8718 | 0xFF000000, Statics.field5086 | 0xFF000000);
				var21++;
			}
			return;
		}
		int var24 = 0;
		for (class946 var25 = (class946) field592.method11756(); var25 != null; var25 = (class946) field592.method11744()) {
			int var26 = field582 * var24 + var8.field7176 + Statics.field2325 + var5 + 1;
			if (var25.field10346 == 1) {
				Statics.method15995(var10, var11, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var26, (class944) var25.field10345.field6662.field9552, var7, var8, Statics.field8718 | 0xFF000000, Statics.field5086 | 0xFF000000);
			} else {
				method1599(var10, var11, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var26, var25, var7, var8, Statics.field8718 | 0xFF000000, Statics.field5086 | 0xFF000000);
			}
			var24++;
		}
		if (field583 == null) {
			return;
		}
		int var27 = 0;
		for (class944 var28 = (class944) field583.field10345.method11756(); var28 != null; var28 = (class944) field583.field10345.method11744()) {
			int var29 = field582 * var27 + var8.field7176 + Statics.field9294 + var5 + 1;
			Statics.method15995(var10, var11, Statics.field384, Statics.field9294, Statics.field603, Statics.field567, var29, var28, var7, var8, Statics.field8718 | 0xFF000000, Statics.field5086 | 0xFF000000);
			var27++;
		}
	}

	@ObfuscatedName("va.bz(Lajs;I)Ljava/lang/String;")
	public static String method12186(class944 arg0) {
		if (arg0.field10341 == null || arg0.field10341.length() == 0) {
			return arg0.field10334 == null || arg0.field10334.length() <= 0 ? arg0.field10339 : arg0.field10339 + class588.field6984.method12206(Statics.field2308) + arg0.field10334;
		} else if (arg0.field10334 == null || arg0.field10334.length() <= 0) {
			return arg0.field10339 + class588.field6984.method12206(Statics.field2308) + arg0.field10341;
		} else {
			return arg0.field10339 + class588.field6984.method12206(Statics.field2308) + arg0.field10334 + class588.field6984.method12206(Statics.field2308) + arg0.field10341;
		}
	}

	@ObfuscatedName("q.bj(Lajz;Lvm;B)I")
	public static int method1399(class946 arg0, class603 arg1) {
		String var2 = Statics.method3322(arg0);
		return arg1.method12390(var2, Statics.field383);
	}

	@ObfuscatedName("km.bf(Lajs;Lvm;I)I")
	public static int method5560(class944 arg0, class603 arg1) {
		String var2 = method12186(arg0);
		int[] var3 = Statics.method3289(arg0);
		if (var3 != null) {
			var2 = var2 + method11875(var3);
		}
		int var4 = arg1.method12390(var2, Statics.field383);
		if (arg0.field10337) {
			var4 += Statics.field6385.method1061() + 4;
		}
		return var4;
	}

	@ObfuscatedName("up.bt([II)Ljava/lang/String;")
	public static String method11875(int[] arg0) {
		StringBuilder var1 = new StringBuilder();
		int var2 = Statics.field4161;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			class481 var4 = Statics.field4959.method8401(arg0[var3]);
			if (var4.field5079 != -1) {
				class118 var5 = (class118) field620.method7916((long) var4.field5079);
				if (var5 == null) {
					class140 var6 = class125.method2590(Statics.field7387, var4.field5079, 0);
					if (var6 != null) {
						var5 = Statics.field5187.method517(var6, true);
						field620.method7937(var5, (long) var4.field5079);
					}
				}
				if (var5 != null) {
					Statics.field383[var2] = var5;
					var1.append(" <img=").append(var2).append(">");
					var2++;
				}
			}
		}
		return var1.toString();
	}

	@ObfuscatedName("kg.bl(II)Z")
	public static boolean method5562(int arg0) {
		if (arg0 == 18 || arg0 == 19 || arg0 == 20 || arg0 == 21 || arg0 == 22 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 17;
		}
	}

	@ObfuscatedName("ro.bk(II)Z")
	public static boolean method8731(int arg0) {
		if (arg0 == 9 || arg0 == 10 || arg0 == 11 || arg0 == 12 || arg0 == 13 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@ObfuscatedName("lb.bs(II)Z")
	public static boolean method5597(int arg0) {
		return arg0 == 44 || arg0 == 45 || arg0 == 46 || arg0 == 47 || arg0 == 48 || arg0 == 49 || arg0 == 50 || arg0 == 51 || arg0 == 52 || arg0 == 53 || arg0 == 15;
	}

	@ObfuscatedName("ay.bn(II)Z")
	public static boolean method1676(int arg0) {
		if (arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6 || arg0 == 1001 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 2;
		}
	}

	@ObfuscatedName("ew.ba(Lahs;ZI)V")
	public static void method3201(class903 arg0, boolean arg1) {
		if (field588 >= 406) {
			return;
		}
		class611 var2 = arg0.field10075;
		String var3 = arg0.field10077;
		if (var2.field7244 != null) {
			var2 = var2.method12516(Statics.field2669);
			if (var2 == null) {
				return;
			}
			var3 = var2.field7212;
		}
		if (!var2.field7271) {
			return;
		}
		if (arg0.field10072 != 0) {
			String var4 = client.field9163 == class527.field6402 ? class588.field6998.method12206(Statics.field2308) : class588.field6996.method12206(Statics.field2308);
			var3 = var3 + method2609(arg0.field10072, Statics.field2119.field10047) + class32.field489 + var4 + arg0.field10072 + class32.field487;
		}
		if (client.field9117 && !arg1) {
			class613 var5 = Statics.field7366 == -1 ? null : Statics.field4464.method12600(Statics.field7366);
			if ((Statics.field4822 & 0x2) != 0 && (var5 == null || var2.method12514(Statics.field7366, var5.field7287) != var5.field7287)) {
				Statics.method8140(client.field9103, client.field9151 + " " + class32.field491 + " " + class32.method3978(16776960) + var3, Statics.field477, 8, -1, (long) arg0.field8593, 0, 0, true, false, (long) arg0.field8593, false);
			}
		}
		if (arg1) {
			return;
		}
		String[] var6 = var2.field7227;
		if (client.field9112) {
			var6 = client.method15472(var6);
		}
		if (var6 == null) {
			return;
		}
		for (int var7 = var6.length - 1; var7 >= 0; var7--) {
			if (var6[var7] != null && (var2.field7248 == 0 || !var6[var7].equalsIgnoreCase(class588.field6991.method12206(Statics.field2308)) && !var6[var7].equalsIgnoreCase(class588.field6874.method12206(Statics.field2308)))) {
				short var8 = 0;
				int var9 = client.field9098;
				if (var7 == 0) {
					var8 = 9;
				}
				if (var7 == 1) {
					var8 = 10;
				}
				if (var7 == 2) {
					var8 = 11;
				}
				if (var7 == 3) {
					var8 = 12;
				}
				if (var7 == 4) {
					var8 = 13;
				}
				if (var7 == 5) {
					var8 = 1003;
				}
				int var10 = var2.method12543(var7);
				if (var10 != -1) {
					var9 = var10;
				}
				Statics.method8140(var6[var7], class32.method3978(16776960) + var3, var6[var7].equalsIgnoreCase(class588.field6991.method12206(Statics.field2308)) ? var2.field7222 : var9, var8, -1, (long) arg0.field8593, 0, 0, true, false, (long) arg0.field8593, false);
			}
		}
		if (var2.field7248 != 1) {
			return;
		}
		for (int var11 = 0; var11 < var6.length; var11++) {
			if (var6[var11] != null && (var6[var11].equalsIgnoreCase(class588.field6991.method12206(Statics.field2308)) || var6[var11].equalsIgnoreCase(class588.field6874.method12206(Statics.field2308)))) {
				short var12 = 0;
				if (arg0.field10072 > Statics.field2119.field10047) {
					var12 = 2000;
				}
				short var13 = 0;
				int var14 = client.field9098;
				if (var11 == 0) {
					var13 = 9;
				}
				if (var11 == 1) {
					var13 = 10;
				}
				if (var11 == 2) {
					var13 = 11;
				}
				if (var11 == 3) {
					var13 = 12;
				}
				if (var11 == 4) {
					var13 = 13;
				}
				if (var11 == 5) {
					var13 = 1003;
				}
				if (var13 != 0) {
					var13 += var12;
				}
				int var15 = var2.method12543(var11);
				if (var15 != -1) {
					var14 = var15;
				}
				Statics.method8140(var6[var11], class32.method3978(16776960) + var3, var6[var11].equalsIgnoreCase(class588.field6991.method12206(Statics.field2308)) ? var2.field7222 : var14, var13, -1, (long) arg0.field8593, 0, 0, true, false, (long) arg0.field8593, false);
			}
		}
	}

	@ObfuscatedName("el.bc(Lew;II)Ljava/lang/String;")
	public static String method3213(class165 arg0, int arg1) {
		if (!client.method14331(arg0).method14948(arg1) && arg0.field1887 == null) {
			return null;
		} else if (arg0.field1852 == null || arg0.field1852.length <= arg1 || arg0.field1852[arg1] == null || arg0.field1852[arg1].trim().length() == 0) {
			return client.field9111 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.field1852[arg1];
		}
	}

	@ObfuscatedName("dj.br(III)Ljava/lang/String;")
	public static String method2609(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return class32.method3978(16711680);
		} else if (var2 < -6) {
			return class32.method3978(16723968);
		} else if (var2 < -3) {
			return class32.method3978(16740352);
		} else if (var2 < 0) {
			return class32.method3978(16756736);
		} else if (var2 > 9) {
			return class32.method3978(65280);
		} else if (var2 > 6) {
			return class32.method3978(4259584);
		} else if (var2 > 3) {
			return class32.method3978(8453888);
		} else if (var2 > 0) {
			return class32.method3978(12648192);
		} else {
			return class32.method3978(16776960);
		}
	}

	@ObfuscatedName("am.bi(IIII)Lada;")
	public static class792 method1910(int arg0, int arg1, int arg2) {
		class792 var3 = null;
		if (arg2 == 0) {
			var3 = class792.method14781(class280.field2923, client.field8975.field834);
		}
		if (arg2 == 1) {
			var3 = class792.method14781(class280.field2890, client.field8975.field834);
		}
		class453 var4 = client.field8980.method6214();
		var3.field9467.method15287(var4.field4838 + arg1);
		var3.field9467.method15279(var4.field4836 + arg0);
		var3.field9467.method15308(method3496() ? 1 : 0);
		class58.field763 = arg0;
		class58.field764 = arg1;
		class58.field766 = false;
		class943.method13915();
		return var3;
	}

	@ObfuscatedName("lu.bx(III)Z")
	public static boolean method5825(int arg0, int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (method11182(arg0)) {
			return true;
		} else {
			return !method11182(arg1);
		}
	}

	@ObfuscatedName("sm.bm(IB)Z")
	public static boolean method11182(int arg0) {
		return arg0 == 59 || arg0 == 2 || arg0 == 8 || arg0 == 17 || arg0 == 15 || arg0 == 16 || arg0 == 58;
	}

	@ObfuscatedName("aju.bb(FFFFFFIB)F")
	public static float method16791(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
		float var7 = 0.0F;
		float var8 = arg3 - arg0;
		float var9 = arg4 - arg1;
		float var10 = arg5 - arg2;
		float var11 = 0.0F;
		float var12 = 0.0F;
		float var13 = 0.0F;
		class423 var14 = client.field8980.method6098();
		while (var7 < 1.1F) {
			float var15 = var7 * var8 + arg0;
			float var16 = var7 * var9 + arg1;
			float var17 = var7 * var10 + arg2;
			int var18 = (int) var15 >> 9;
			int var19 = (int) var17 >> 9;
			if (var18 > 0 && var19 > 0 && var18 < client.field8980.method6220() && var19 < client.field8980.method6193()) {
				int var20 = Statics.field2119.field9807;
				if (var20 < 3 && (client.field8980.method6100().field3606[1][var18][var19] & 0x2) != 0) {
					var20++;
				}
				int var21 = var14.field4527[var20].method196((int) var15, (int) var17);
				if ((float) var21 < var16) {
					if (arg6 >= 2) {
						return var7 - 0.1F + method16791(var11, var12, var13, var15, var16, var17, arg6 - 1) * 0.1F;
					}
					return var7;
				}
			}
			var11 = var15;
			var12 = var16;
			var13 = var17;
			var7 += 0.1F;
		}
		return -1.0F;
	}
}
