package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("s")
public class class33 {

	@ObfuscatedName("s.c")
	public static boolean field498 = false;

	@ObfuscatedName("s.t")
	public static boolean field504 = false;

	@ObfuscatedName("s.l")
	public static int field499 = -256547651;

	@ObfuscatedName("s.f")
	public static long field506 = -4739105360413427921L;

	@ObfuscatedName("s.ai")
	public static int field531 = 1502121489;

	@ObfuscatedName("s.ao")
	public static long field544 = 0L;

	@ObfuscatedName("s.al")
	public static String field533 = "";

	@ObfuscatedName("s.at")
	public static String field534 = "";

	@ObfuscatedName("s.ax")
	public static int field535 = 0;

	@ObfuscatedName("s.aw")
	public static int field516 = 0;

	@ObfuscatedName("s.az")
	public static int field537 = -871135410;

	@ObfuscatedName("s.ak")
	public static int field538 = -1575483146;

	@ObfuscatedName("s.av")
	public static int field547 = -40093078;

	@ObfuscatedName("s.aj")
	public static int field540 = -1087683073;

	@ObfuscatedName("s.ah")
	public static int field546 = 1799043171;

	@ObfuscatedName("s.au")
	public static int field526 = 0;

	@ObfuscatedName("s.ae")
	public static int field543 = -298427773;

	@ObfuscatedName("s.ac")
	public static int field509 = 1658883549;

	@ObfuscatedName("s.aq")
	public static int field545 = 0;

	@ObfuscatedName("s.ab")
	public static boolean field536 = false;

	@ObfuscatedName("s.bq")
	public static int field507 = 0;

	@ObfuscatedName("s.bz")
	public static boolean field548 = false;

	public class33() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gk.u(B)Z")
	public static boolean method3950() {
		if (client.field8909 == null) {
			return field499 * 1679378795 == -1 ? method11239(field533, field534) : method1201();
		} else {
			return method11920();
		}
	}

	@ObfuscatedName("pw.j(I)Z")
	public static boolean method7860() {
		if (client.field8909 == null) {
			return field499 * 1679378795 == -1 ? method4741(field533, field534) : method11994();
		} else {
			return method2710();
		}
	}

	@ObfuscatedName("aau.a(I)V")
	public static final void method14090() {
		field531 = 1502121489;
		field538 = -1575483146;
		field537 = -871135410;
	}

	@ObfuscatedName("kj.s(I)V")
	public static final void method5547() {
		field506 = -4739105360413427921L;
		field544 = 0L;
		field499 = -256547651;
	}

	@ObfuscatedName("la.c(I)V")
	public static final void method6066() {
		if (field531 * 474805399 != 7) {
			Statics.field501.method1916();
			method14090();
			method184();
		}
	}

	@ObfuscatedName("vg.l(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method12220(String arg0, String arg1) {
		if (arg0.length() <= 320 && method12287()) {
			method5547();
			field533 = arg0;
			field534 = arg1;
			client.method11307(18);
		}
	}

	@ObfuscatedName("st.f(II)V")
	public static void method11156(int arg0) {
		if (!method12287()) {
			return;
		}
		if (field499 * 1679378795 != arg0) {
			field506 = -4739105360413427921L;
		}
		field499 = arg0 * 256547651;
		client.method11307(18);
	}

	@ObfuscatedName("abm.d(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method14208(String arg0, String arg1) {
		if (arg0.length() > 320 || !method12287()) {
			return;
		}
		client.field8959.method1916();
		method5547();
		field533 = arg0;
		field534 = arg1;
		client.method11307(3);
	}

	@ObfuscatedName("yh.o(I)V")
	public static void method12896() {
		field534 = "";
		field533 = "";
	}

	@ObfuscatedName("jc.q(Ljava/lang/String;Ljava/lang/String;S)Z")
	public static boolean method4741(String arg0, String arg1) {
		Statics.field500 = 782622354;
		Statics.field501 = client.field8959;
		return method6245(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("dh.p(I)Z")
	public static boolean method2710() {
		Statics.field500 = 782622354;
		Statics.field501 = client.field8959;
		if (client.field8909 != null) {
			class814 var0 = new class814(client.field8909);
			field506 = var0.method15246() * 4739105360413427921L;
			field544 = var0.method15246() * 2719416539628386491L;
		}
		if (field506 * -4221559737306197967L < 0L) {
			method7972(35);
			return false;
		} else {
			return method6245(false, true, "", "", field506 * -4221559737306197967L);
		}
	}

	@ObfuscatedName("sq.w(Ljava/lang/String;Ljava/lang/String;I)Z")
	public static boolean method11239(String arg0, String arg1) {
		Statics.field500 = 1886291571;
		Statics.field501 = client.field8975;
		return method6245(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("uc.b(I)Z")
	public static boolean method11920() {
		Statics.field500 = 1886291571;
		Statics.field501 = client.field8975;
		if (client.field8909 != null) {
			class814 var0 = new class814(client.field8909);
			field506 = var0.method15246() * 4739105360413427921L;
			field544 = var0.method15246() * 2719416539628386491L;
		}
		if (field506 * -4221559737306197967L < 0L) {
			method7972(35);
			return false;
		} else {
			return method6245(false, true, "", "", field506 * -4221559737306197967L);
		}
	}

	@ObfuscatedName("v.x(B)Z")
	public static boolean method1201() {
		Statics.field500 = 1886291571;
		Statics.field501 = client.field8975;
		return method6245(field506 * -4221559737306197967L == -1L, true, "", "", field506 * -4221559737306197967L);
	}

	@ObfuscatedName("uj.i(S)Z")
	public static boolean method11994() {
		Statics.field500 = 782622354;
		Statics.field501 = client.field8959;
		return method6245(field506 * -4221559737306197967L == -1L, true, "", "", field506 * -4221559737306197967L);
	}

	@ObfuscatedName("ml.v(ZZLjava/lang/String;Ljava/lang/String;J)Z")
	public static boolean method6245(boolean arg0, boolean arg1, String arg2, String arg3, long arg4) {
		field504 = arg0;
		if (!arg1) {
			field499 = -256547651;
		}
		field498 = arg1;
		field533 = arg2;
		field534 = arg3;
		field506 = arg4 * 4739105360413427921L;
		if (!field498 && (field533.equals("") || field534.equals(""))) {
			method7972(3);
			method184();
			return false;
		}
		if (Statics.field500 * 770462949 != 154) {
			field526 = 0;
			field509 = 1658883549;
			field543 = -298427773;
		}
		Statics.field501.field846 = false;
		method7972(-3);
		field531 = 734365140;
		field535 = 0;
		field516 = 0;
		return true;
	}

	@ObfuscatedName("nc.k(I)V")
	public static final void method6853() {
		if (field531 * 474805399 == 7 || field531 * 474805399 == 106) {
			return;
		}
		try {
			short var0;
			if (field516 * 597715077 == 0) {
				var0 = 500;
			} else {
				var0 = 2000;
			}
			if (field504 && field531 * 474805399 >= 61) {
				var0 = 6000;
			}
			if (Statics.field500 * 770462949 == 223 && field531 * 474805399 != 208 && field538 * 1959839053 != 42 || Statics.field500 * 770462949 == 154 && field537 * -365081623 != 49 && field537 * -365081623 != 52) {
				field535 += 1670890815;
			}
			if (field535 * 2100865727 > var0) {
				Statics.field501.method1916();
				if (field516 * 597715077 >= 3) {
					field531 = 1502121489;
					method7972(-5);
					method184();
					return;
				}
				if (Statics.field500 * 770462949 == 223) {
					Statics.field6772.method12026();
				} else {
					Statics.field6782.method12026();
				}
				field535 = 0;
				field516 += 1055608909;
				field531 = 734365140;
			}
			if (field531 * 474805399 == 12) {
				if (Statics.field500 * 770462949 == 223) {
					Statics.field501.method1911(class411.method12184(Statics.field6772.method12025(), 15000), Statics.field6772.field6765);
				} else {
					Statics.field501.method1911(class411.method12184(Statics.field6782.method12025(), 15000), Statics.field6782.field6765);
				}
				Statics.field501.method1935();
				class792 var1 = class792.method4876();
				if (field504) {
					var1.field9467.method15308(class281.field2969.field2970 * -807844433);
					var1.field9467.method15287(0);
					int var2 = var1.field9467.field9626 * 803401371;
					var1.field9467.method15223(742);
					var1.field9467.method15223(1);
					if (Statics.field500 * 770462949 == 223) {
						var1.field9467.method15308(client.field8923 * 1964982599 == 9 ? 1 : 0);
					}
					class814 var3 = method8625();
					var3.method15308(field499 * 1679378795);
					var3.method15287((int) (Math.random() * 9.9999999E7D));
					var3.method15308(Statics.field2308.method6339());
					var3.method15223(client.field9043 * 1285568981);
					for (int var4 = 0; var4 < 6; var4++) {
						var3.method15223((int) (Math.random() * 9.9999999E7D));
					}
					var3.method15420(client.field9138 * -2406081141406693333L);
					var3.method15308(client.field9163.field6408 * 692067827);
					var3.method15308((int) (Math.random() * 9.9999999E7D));
					var3.method15265(class51.field666, class51.field667);
					var1.field9467.method15276(var3.field9629, 0, var3.field9626 * 803401371);
					var1.field9467.method15233(var1.field9467.field9626 * 803401371 - var2);
				} else {
					var1.field9467.method15308(class281.field2965.field2970 * -807844433);
				}
				Statics.field501.method1913(var1);
				Statics.field501.method1912();
				field531 = -1079327147;
			}
			if (field531 * 474805399 == 35) {
				if (!Statics.field501.method1927().method7212(1)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
				Statics.field501.field832.field9626 = 0;
				int var5 = Statics.field501.field832.method15220();
				if (var5 != 0) {
					field531 = 1502121489;
					method2898(var5);
					method7972(var5);
					Statics.field501.method1916();
					method184();
					return;
				}
				Statics.field501.field832.field9626 = 0;
				if (field504) {
					field531 = -1847083496;
				} else {
					field531 = -1424289154;
				}
			}
			if (field531 * 474805399 == 40) {
				if (!Statics.field501.method1927().method7212(2)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 2);
				Statics.field501.field832.field9626 = 0;
				Statics.field501.field832.field9626 = Statics.field501.field832.method15239() * -1748220013;
				field531 = 144614753;
			}
			if (field531 * 474805399 == 55) {
				if (!Statics.field501.method1927().method7212(Statics.field501.field832.field9626 * 803401371)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, Statics.field501.field832.field9626 * 803401371);
				Statics.field501.field832.method15262(Statics.field541);
				Statics.field501.field832.field9626 = 0;
				String var6 = Statics.field501.field832.method15366();
				Statics.field501.field832.field9626 = 0;
				String var7 = class284.field3152.method4757();
				if (!client.field8903 || !class383.method1814(var6, 1, var7)) {
					class383.method5599(var6, true, Statics.field4961.field9661.method15781() == 5, var7, client.field8915, client.field9218);
				}
				field531 = -1635686325;
			}
			if (field531 * 474805399 == 61) {
				if (!Statics.field501.method1927().method7212(1)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
				if ((Statics.field501.field832.field9629[0] & 0xFF) == 1) {
					field531 = 356011924;
				}
			}
			if (field531 * 474805399 == 76) {
				if (!Statics.field501.method1927().method7212(16)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 16);
				Statics.field501.field832.field9626 = 2093250864;
				Statics.field501.field832.method15262(Statics.field541);
				Statics.field501.field832.field9626 = 0;
				field506 = Statics.field501.field832.method15246() * 4739105360413427921L;
				field544 = Statics.field501.field832.method15246() * 2719416539628386491L;
				field531 = -1424289154;
			}
			if (field531 * 474805399 == 82) {
				Statics.field501.field832.field9626 = 0;
				Statics.field501.method1935();
				class792 var8 = class792.method4876();
				class964 var9 = var8.field9467;
				if (Statics.field500 * 770462949 == 223) {
					class281 var10;
					if (field504) {
						var10 = class281.field2967;
					} else {
						var10 = class281.field2961;
					}
					var9.method15308(var10.field2970 * -807844433);
					var9.method15287(0);
					int var11 = var9.field9626 * 803401371;
					int var12 = var9.field9626 * 803401371;
					if (!field504) {
						var9.method15223(742);
						var9.method15223(1);
						var9.method15308(client.field8923 * 1964982599 == 9 ? 1 : 0);
						int var13 = var9.field9626 * 803401371;
						class814 var14 = method5564();
						var9.method15276(var14.field9629, 0, var14.field9626 * 803401371);
						var12 = var9.field9626 * 803401371;
						var9.method15308(field506 * -4221559737306197967L == -1L ? 1 : 0);
						if (field506 * -4221559737306197967L == -1L) {
							var9.method15228(field533);
						} else {
							var9.method15420(field506 * -4221559737306197967L);
						}
					}
					var9.method15308(client.method12476());
					var9.method15287(Statics.field4125 * -1227076991);
					var9.method15287(Statics.field4677 * 1204117463);
					var9.method15308(Statics.field4961.field9665.method15829());
					class385.method3615(var9);
					var9.method15228(client.field8947);
					var9.method15223(client.field9043 * 1285568981);
					class814 var15 = Statics.field4961.method15447();
					var9.method15308(var15.field9626 * 803401371);
					var9.method15276(var15.field9629, 0, var15.field9626 * 803401371);
					client.field8932 = true;
					class814 var16 = new class814(Statics.field2305.method15476());
					Statics.field2305.method15475(var16);
					var9.method15276(var16.field9629, 0, var16.field9629.length);
					var9.method15223(client.field9023 * 924369695);
					var9.method15420(client.field8910 * 3001472439041802899L);
					var9.method15228(Statics.field6817);
					var9.method15308(client.field9099 == null ? 0 : 1);
					if (client.field9099 != null) {
						var9.method15228(client.field9099);
					}
					var9.method15308(Statics.field2137.method6799("jagtheora") ? 1 : 0);
					var9.method15308(client.field8903 ? 1 : 0);
					var9.method15308(client.field8987 ? 1 : 0);
					var9.method15308(Statics.field7543 * 1088005033);
					var9.method15223(client.field9015 * 953525421);
					var9.method15228(client.field8921);
					var9.method15308(Statics.field6779 != null && Statics.field6779.field6768 * 971048829 == Statics.field6772.field6768 * 971048829 ? 0 : 1);
					method4896(var9);
					var9.method15280(Statics.field541, var12, var9.field9626 * 803401371);
					var9.method15233(var9.field9626 * 803401371 - var11);
				} else {
					class281 var17;
					if (field504) {
						var17 = class281.field2967;
					} else {
						var17 = class281.field2962;
					}
					var9.method15308(var17.field2970 * -807844433);
					var9.method15287(0);
					int var18 = var9.field9626 * 803401371;
					int var19 = var9.field9626 * 803401371;
					if (!field504) {
						var9.method15223(742);
						var9.method15223(1);
						class814 var20 = method5564();
						var9.method15276(var20.field9629, 0, var20.field9626 * 803401371);
						var19 = var9.field9626 * 803401371;
						var9.method15308(field506 * -4221559737306197967L == -1L ? 1 : 0);
						if (field506 * -4221559737306197967L == -1L) {
							var9.method15228(field533);
						} else {
							var9.method15420(field506 * -4221559737306197967L);
						}
					}
					var9.method15308(client.field9163.field6408 * 692067827);
					var9.method15308(Statics.field2308.method6339());
					class385.method3615(var9);
					var9.method15228(client.field8947);
					class814 var21 = Statics.field4961.method15447();
					var9.method15308(var21.field9626 * 803401371);
					var9.method15276(var21.field9629, 0, var21.field9626 * 803401371);
					class814 var22 = new class814(Statics.field2305.method15476());
					Statics.field2305.method15475(var22);
					var9.method15276(var22.field9629, 0, var22.field9629.length);
					var9.method15228(Statics.field6817);
					var9.method15223(client.field9043 * 1285568981);
					var9.method15223(client.field9015 * 953525421);
					var9.method15228(client.field8921);
					method4896(var9);
					var9.method15280(Statics.field541, var19, var9.field9626 * 803401371);
					var9.method15233(var9.field9626 * 803401371 - var18);
				}
				Statics.field501.method1913(var8);
				Statics.field501.method1912();
				Statics.field501.field834 = new class568(Statics.field541);
				for (int var23 = 0; var23 < 4; var23++) {
					Statics.field541[var23] += 50;
				}
				Statics.field501.field833 = new class568(Statics.field541);
				new class568(Statics.field541);
				Statics.field501.field832.method16876(Statics.field501.field833);
				Statics.field541 = null;
				field531 = 1579953824;
			}
			if (field531 * 474805399 == 96) {
				if (!Statics.field501.method1927().method7212(1)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
				int var24 = Statics.field501.field832.method15220();
				Statics.field501.field832.field9626 = 0;
				if (var24 == 21) {
					field531 = -1246283192;
				} else if (var24 == 29 || var24 == 45) {
					Statics.field1025 = var24 * -1184360831;
					field531 = -612091679;
				} else if (var24 == 1) {
					field531 = 44441126;
					method7972(var24);
					return;
				} else if (var24 == 52) {
					Statics.field1025 = var24 * -1184360831;
					field531 = -923662477;
				} else if (var24 == 2) {
					if (field548) {
						field548 = false;
						field531 = 734365140;
						return;
					}
					field531 = -267129672;
				} else if (var24 == 15) {
					Statics.field501.field835 = 454567558;
					field531 = -1902815997;
				} else if (var24 == 23 && field516 * 597715077 < 3) {
					field535 = 0;
					field516 += 1055608909;
					field531 = 734365140;
					Statics.field501.method1916();
					return;
				} else if (var24 == 42) {
					field531 = -155906128;
					method7972(var24);
					return;
				} else if (Statics.field500 * 770462949 == 154 && var24 == 49 && client.field8923 * 1964982599 != 4) {
					if (field537 * -365081623 != 52) {
						method7972(var24);
					}
					return;
				} else if (!field498 || field504 || field499 * 1679378795 == -1 || var24 != 35) {
					if (var24 != 53) {
						field531 = 1502121489;
						method7972(var24);
						Statics.field501.method1916();
						method184();
						return;
					}
					field531 = -1724810035;
				} else {
					field504 = true;
					field535 = 0;
					field531 = 734365140;
					Statics.field501.method1916();
					return;
				}
			}
			if (field531 * 474805399 == 113) {
				Statics.field501.method1935();
				class792 var25 = class792.method4876();
				class964 var26 = var25.field9467;
				var26.method16876(Statics.field501.field834);
				var26.method16864(class281.field2968.field2970 * -807844433);
				Statics.field501.method1913(var25);
				Statics.field501.method1912();
				field531 = 1579953824;
				return;
			}
			if (field531 * 474805399 == 120) {
				if (!Statics.field501.method1927().method7212(1)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
				int var27 = Statics.field501.field832.field9629[0] & 0xFF;
				field526 = var27 * -319436370;
				field531 = 1502121489;
				method7972(21);
				Statics.field501.method1916();
				method184();
				return;
			}
			if (field531 * 474805399 == 208) {
				if (!Statics.field501.method1927().method7212(2)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 2);
				field545 = (((Statics.field501.field832.field9629[0] & 0xFF) << 8) + (Statics.field501.field832.field9629[1] & 0xFF)) * 829648069;
				field531 = 1579953824;
				return;
			}
			if (field531 * 474805399 == 235) {
				if (!Statics.field501.method1927().method7212(4)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 4);
				field507 = Statics.field501.field832.method15379() * 685624055;
				Statics.field501.field832.field9626 = 0;
				field531 = 1502121489;
				method7972(53);
				Statics.field501.method1916();
				method184();
				return;
			}
			if (field531 * 474805399 == 183) {
				if (Statics.field1025 * 569518465 == 29) {
					if (!Statics.field501.method1927().method7212(1)) {
						return;
					}
					Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
					field509 = (Statics.field501.field832.field9629[0] & 0xFF) * -1658883549;
				} else if (Statics.field1025 * 569518465 == 45) {
					if (!Statics.field501.method1927().method7212(3)) {
						return;
					}
					Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 3);
					field509 = (Statics.field501.field832.field9629[0] & 0xFF) * -1658883549;
					field543 = (((Statics.field501.field832.field9629[1] & 0xFF) << 8) + (Statics.field501.field832.field9629[2] & 0xFF)) * 298427773;
				} else {
					throw new IllegalStateException();
				}
				field531 = 1502121489;
				method7972(Statics.field1025 * 569518465);
				Statics.field501.method1916();
				method184();
				return;
			}
			if (field531 * 474805399 == 213) {
				if (!Statics.field501.method1927().method7212(2)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 2);
				Statics.field501.field832.field9626 = 0;
				Statics.field10389 = Statics.field501.field832.method15239() * -1101930179;
				Statics.field501.field832.field9626 = 0;
				field531 = -189297337;
				return;
			}
			if (field531 * 474805399 == 225) {
				if (!Statics.field501.method1927().method7212(Statics.field10389 * 2112290325)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, Statics.field10389 * 2112290325);
				Statics.field501.field832.field9626 = 0;
				byte[] var28 = new byte[Statics.field10389 * 2112290325 + 1];
				Statics.field501.field832.method16861(var28, 0, Statics.field10389 * 2112290325);
				Statics.field501.field832.field9626 = 0;
				class814 var29 = new class814(var28);
				String var30 = var29.method15337();
				class383.method3613(var30, true, Statics.field4961.field9661.method15781() == 5, client.field8915, client.field9218);
				method7972(Statics.field1025 * 569518465);
				if (Statics.field500 * 770462949 == 154 && client.field8923 * 1964982599 != 4) {
					field531 = 1579953824;
				} else {
					field531 = 1502121489;
					Statics.field501.method1916();
					method184();
				}
				return;
			}
			if (field531 * 474805399 == 136) {
				if (!Statics.field501.method1927().method7212(1)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
				Statics.field8459 = (Statics.field501.field832.field9629[0] & 0xFF) * 1304816119;
				field531 = -790097641;
				return;
			}
			if (field531 * 474805399 == 145) {
				class964 var31 = Statics.field501.field832;
				if (Statics.field500 * 770462949 == 223) {
					if (!Statics.field501.method1927().method7212(Statics.field8459 * -1024350265)) {
						return;
					}
					Statics.field501.method1927().method7196(var31.field9629, 0, Statics.field8459 * -1024350265);
					var31.field9626 = 0;
					client.field9074 = var31.method15220() * -1346441571;
					client.field8916 = var31.method15220() * 1474362151;
					client.field9054 = var31.method15220() == 1;
					client.field9077 = var31.method15220() == 1;
					client.field9078 = var31.method15220() == 1;
					client.field9081 = var31.method15220() == 1;
					client.field9071 = var31.method15239() * -113604455;
					client.field8998 = var31.method15220() == 1;
					Statics.field8469 = var31.method15242() * -328767621;
					client.field9142 = var31.method15220() == 1;
					Statics.field4685 = var31.method15337();
					client.field8980.method6103().method11472(client.field9142);
					Statics.field8656.method6040().method6103().method11472(client.field9142);
					Statics.field3492.method12304(client.field9142);
					Statics.field3774.method12561(client.field9142);
				} else if (Statics.field501.method1927().method7212(Statics.field8459 * -1024350265)) {
					Statics.field501.method1927().method7196(var31.field9629, 0, Statics.field8459 * -1024350265);
					var31.field9626 = 0;
					client.field9074 = var31.method15220() * -1346441571;
					client.field8916 = var31.method15220() * 1474362151;
					client.field9054 = var31.method15220() == 1;
					Statics.field8469 = var31.method15242() * -328767621;
					Statics.field2119.field10043 = (byte) var31.method15220();
					client.field9077 = var31.method15220() == 1;
					client.field9078 = var31.method15220() == 1;
					Statics.field6701 = var31.method15246() * 2823786921355265335L;
					Statics.field3384 = (Statics.field6701 * -7080762364234399609L - class153.method5554() - var31.method15245()) * 8394181049192046283L;
					int var32 = var31.method15220();
					client.field8998 = (var32 & 0x1) != 0;
					Statics.field628 = (var32 & 0x2) != 0;
					Statics.field3210 = var31.method15379() * 1743810047;
					Statics.field3497 = var31.method15220() == 1;
					Statics.field3584 = var31.method15379() * 1606069267;
					Statics.field3585 = var31.method15239() * 1103693313;
					Statics.field5056 = var31.method15239() * 1187178193;
					Statics.field4225 = var31.method15239() * 44202023;
					Statics.field8466 = var31.method15379() * 1485150765;
					Statics.field771 = new class44(Statics.field8466 * -1919171163);
					(new Thread(Statics.field771)).start();
					Statics.field1685 = var31.method15220() * -1297163189;
					Statics.field1599 = var31.method15239() * -1315003819;
					Statics.field7157 = var31.method15239() * -1003295231;
					Statics.field8432 = var31.method15220() == 1;
					Statics.field2119.field10040 = Statics.field2119.field10063 = Statics.field10527 = var31.method15366();
					Statics.field563 = var31.method15220() * -884208917;
					Statics.field8537 = var31.method15379() * 1277897611;
					client.field9079 = var31.method15220() == 1;
					Statics.field6779 = new class573();
					Statics.field6779.field6768 = var31.method15239() * -1308300843;
					if (Statics.field6779.field6768 * 971048829 == 65535) {
						Statics.field6779.field6768 = 1308300843;
					}
					Statics.field6779.field6765 = var31.method15366();
					if (Statics.field6683 != class515.field6368) {
						Statics.field6779.field6764 = Statics.field6779.field6768 * -2091197685 + -851669568;
						Statics.field6779.field6766 = Statics.field6779.field6768 * -1966902117 + 123249200;
					}
					if (Statics.field6683 != class515.field6363 && (Statics.field6683 != class515.field6362 || client.field9074 * -1124661323 < 2) && Statics.field6772.method12027(Statics.field6773)) {
						Statics.method12022();
					}
				} else {
					return;
				}
				if (client.field9054 && !client.field9078 || client.field8998) {
					try {
						class582.method12167(Statics.field6387, "zap");
					} catch (Throwable var44) {
						if (client.field9193) {
							try {
								Statics.field6387.getAppletContext().showDocument(new URL(Statics.field6387.getCodeBase(), "blank.ws"), "tbi");
							} catch (Exception var43) {
							}
						}
					}
				} else {
					try {
						class582.method12167(Statics.field6387, "unzap");
					} catch (Throwable var42) {
					}
				}
				if (Statics.field6683 == class515.field6368) {
					class284.field3141.method4761();
				}
				if (Statics.field500 * 770462949 != 223) {
					field531 = 1502121489;
					method7972(2);
					method3222();
					client.method11307(15);
					Statics.field501.field840 = null;
					return;
				}
				field531 = -578700470;
			}
			if (field531 * 474805399 == 166) {
				if (!Statics.field501.method1927().method7212(3)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 3);
				field531 = 923421019;
			}
			if (field531 * 474805399 == 173) {
				class964 var36 = Statics.field501.field832;
				var36.field9626 = 0;
				if (var36.method16859()) {
					if (!Statics.field501.method1927().method7212(1)) {
						return;
					}
					Statics.field501.method1927().method7196(var36.field9629, 3, 1);
				}
				Statics.field501.field840 = class283.method14807()[var36.method16883()];
				Statics.field501.field835 = var36.method15239() * 1920199869;
				field531 = -300520881;
			}
			if (field531 * 474805399 == 153) {
				if (!Statics.field501.method1927().method7212(Statics.field501.field835 * -169447787)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, Statics.field501.field835 * -169447787);
				Statics.field501.field832.field9626 = 0;
				int var37 = Statics.field501.field835 * -169447787;
				field531 = 1502121489;
				method7972(2);
				method3965();
				class55.method12667(Statics.field501.field832);
				int var38 = var37 - Statics.field501.field832.field9626 * 803401371;
				class964 var39 = new class964(var38);
				System.arraycopy(Statics.field501.field832.field9629, Statics.field501.field832.field9626 * 803401371, var39.field9629, 0, var38);
				Statics.field501.field832.field9626 += var38 * -1748220013;
				if (class283.field3128 == Statics.field501.field840) {
					client.field8980.method6135(new class358(class360.field3835, var39));
				} else {
					client.field8980.method6135(new class358(class360.field3836, var39));
				}
				if (Statics.field501.field832.field9626 * 803401371 != var37) {
					throw new RuntimeException(Statics.field501.field832.field9626 * 803401371 + " " + var37);
				}
				Statics.field501.field840 = null;
				return;
			}
			if (field531 * 474805399 == 197) {
				if (Statics.field501.field835 * -169447787 == -2) {
					if (!Statics.field501.method1927().method7212(2)) {
						return;
					}
					Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 2);
					Statics.field501.field832.field9626 = 0;
					Statics.field501.field835 = Statics.field501.field832.method15239() * 1920199869;
				}
				if (!Statics.field501.method1927().method7212(Statics.field501.field835 * -169447787)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, Statics.field501.field835 * -169447787);
				Statics.field501.field832.field9626 = 0;
				int var40 = Statics.field501.field835 * -169447787;
				field531 = 1502121489;
				method7972(15);
				Statics.method1237();
				class55.method12667(Statics.field501.field832);
				if (Statics.field501.field832.field9626 * 803401371 != var40) {
					throw new RuntimeException(Statics.field501.field832.field9626 * 803401371 + " " + var40);
				}
				Statics.field501.field840 = null;
				return;
			}
		} catch (IOException var45) {
			Statics.field501.method1916();
			if (field516 * 597715077 < 3) {
				if (Statics.field500 * 770462949 == 223) {
					Statics.field6772.method12026();
				} else {
					Statics.field6782.method12026();
				}
				field535 = 0;
				field516 += 1055608909;
				field531 = 734365140;
			} else {
				field531 = 1502121489;
				method7972(-4);
				method184();
			}
		}
	}

	@ObfuscatedName("dq.h(II)V")
	public static void method2898(int arg0) {
	}

	@ObfuscatedName("ru.r(I)Laet;")
	public static class814 method8625() {
		class814 var0 = new class814(518);
		Statics.field541 = new int[4];
		Statics.field541[0] = (int) (Math.random() * 9.9999999E7D);
		Statics.field541[1] = (int) (Math.random() * 9.9999999E7D);
		Statics.field541[2] = (int) (Math.random() * 9.9999999E7D);
		Statics.field541[3] = (int) (Math.random() * 9.9999999E7D);
		var0.method15308(10);
		var0.method15223(Statics.field541[0]);
		var0.method15223(Statics.field541[1]);
		var0.method15223(Statics.field541[2]);
		var0.method15223(Statics.field541[3]);
		return var0;
	}

	@ObfuscatedName("kg.g(S)Laet;")
	public static class814 method5564() {
		class814 var0 = method8625();
		var0.method15420(0L);
		var0.method15228(field534);
		var0.method15420(field544 * -2904508851564426125L);
		var0.method15420(client.field9138 * -2406081141406693333L);
		var0.method15265(class51.field666, class51.field667);
		return var0;
	}

	@ObfuscatedName("pz.y(II)V")
	public static void method7972(int arg0) {
		if (Statics.field500 * 770462949 == 154) {
			field537 = arg0 * -1711915943;
		} else if (Statics.field500 * 770462949 == 223) {
			field538 = arg0 * -1359742075;
		}
	}

	@ObfuscatedName("ta.e(I)V")
	public static void method184() {
		if (client.method12490(client.field8923 * 1964982599)) {
			if (client.field8959.method1927() == null) {
				client.method11307(3);
			} else {
				client.method11307(15);
			}
		} else if (client.field8923 * 1964982599 == 3 || client.field8923 * 1964982599 == 18) {
			client.method11307(6);
		} else if (client.field8923 * 1964982599 == 4) {
			client.method11307(6);
		}
	}

	@ObfuscatedName("jw.ay(Lajl;I)V")
	public static void method4896(class964 arg0) {
		arg0.method15223(Statics.field7567.method5622());
		arg0.method15223(Statics.field6690.method5622());
		arg0.method15223(Statics.field7435.method5622());
		arg0.method15223(Statics.field2653.method5622());
		arg0.method15223(Statics.field5197.method5622());
		arg0.method15223(Statics.field7343.method5622());
		arg0.method15223(Statics.field9367.method5622());
		arg0.method15223(Statics.field4560.method5622());
		arg0.method15223(Statics.field7387.method5622());
		arg0.method15223(Statics.field808.method5622());
		arg0.method15223(Statics.field3523.method5622());
		arg0.method15223(Statics.field1509.method5622());
		arg0.method15223(Statics.field6651.method5622());
		arg0.method15223(Statics.field8745.method5622());
		arg0.method15223(Statics.field3156.method5622());
		arg0.method15223(Statics.field5104.method5622());
		arg0.method15223(Statics.field1565.method5622());
		arg0.method15223(Statics.field6451.method5622());
		arg0.method15223(Statics.field5080.method5622());
		arg0.method15223(Statics.field5130.method5622());
		arg0.method15223(Statics.field3897.method5622());
		arg0.method15223(Statics.field2070.method5622());
		arg0.method15223(Statics.field4229.method5622());
		arg0.method15223(Statics.field4059.method5622());
		arg0.method15223(Statics.field6343.method5622());
		arg0.method15223(Statics.field6712.method5622());
		arg0.method15223(Statics.field7572.method5622());
		arg0.method15223(Statics.field8655.method5622());
		arg0.method15223(Statics.field849.method5622());
		arg0.method15223(Statics.field8734.method5622());
		arg0.method15223(Statics.field663.method5622());
		arg0.method15223(Statics.field2670.method5622());
		arg0.method15223(class309.method6307());
		arg0.method15223(class309.method4671());
		arg0.method15223(Statics.field4824.method5622());
		arg0.method15223(Statics.field2117.method5622());
		arg0.method15223(Statics.field6435.method5622());
	}

	@ObfuscatedName("gr.af(I)V")
	public static void method3988() {
		Statics.field501.method1935();
		Statics.field501.field832.field9626 = 0;
		Statics.field501.field843 = null;
		Statics.field501.field844 = null;
		Statics.field501.field831 = null;
		Statics.field501.field837 = 0;
		client.field8935 = 0;
		Statics.method12634();
		client.field9121 = 0;
		client.field9206 = 0;
		client.field9211 = 0;
		client.field9182 = null;
		Statics.field7045 = 0;
		Statics.field5180 = null;
		Statics.field913 = null;
		Statics.field2972 = null;
		class477.method5946();
		for (int var0 = 0; var0 < 25; var0++) {
			client.field9092[var0] = 0;
			client.field9093[var0] = 0;
			client.field9094[var0] = 0;
		}
	}

	@ObfuscatedName("ei.ar(I)V")
	public static void method3222() {
		method3988();
	}

	@ObfuscatedName("gc.an(B)V")
	public static void method3965() {
		if (client.field8923 * 1964982599 == 0) {
			Statics.method1681();
		}
		method3988();
		client.field8959.method1916();
		Statics.field578 = true;
		class590.method11905();
		for (int var0 = 0; var0 < client.field8936.length; var0++) {
			client.field8936[var0] = null;
		}
		client.field9117 = false;
		class395.method2387();
		client.field9050 = ((int) (Math.random() * 100.0D) - 50) * 271204793;
		client.field9006 = ((int) (Math.random() * 110.0D) - 55) * -366219207;
		client.field9008 = ((int) (Math.random() * 80.0D) - 40) * 885451905;
		client.field9087 = ((int) (Math.random() * 120.0D) - 60) * 630548241;
		client.field8976 = ((int) (Math.random() * 30.0D) - 20) * -685642519;
		client.field9021 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		class58.method7163();
		for (int var1 = 0; var1 < 2048; var1++) {
			client.field9070[var1] = null;
		}
		Statics.field2119 = null;
		client.field9104 = 0;
		client.field8966 = 0;
		client.field8964.method11925();
		client.field9007.method11557();
		client.field9090.method11925();
		client.field9091.method11653();
		client.field9088.method11925();
		class770.field9278 = new class547();
		class770.field9292 = new class547();
		Statics.field2669.method1647();
		Statics.method12620();
		Statics.field1577 = 0;
		Statics.field2123 = 0;
		Statics.field4194 = 0;
		Statics.field3385 = 0;
		Statics.field2611 = 0;
		Statics.field2799 = 0;
		Statics.field4855 = 0;
		Statics.field9680 = 0;
		Statics.field9277 = 0;
		Statics.field3785 = 0;
		for (int var2 = 0; var2 < Statics.field6666.length; var2++) {
			if (!Statics.field2210[var2]) {
				Statics.field6666[var2] = -1;
			}
		}
		if (client.field8941 * -101162797 != -1) {
			class165.method13890(client.field8941 * -101162797);
		}
		for (class816 var3 = (class816) client.field9075.method11928(); var3 != null; var3 = (class816) client.field9075.method11929()) {
			if (!var3.method6982()) {
				var3 = (class816) client.field9075.method11928();
				if (var3 == null) {
					break;
				}
			}
			client.method7069(var3, true, false);
		}
		client.field8941 = 1521551525;
		client.field9075 = new class565(8);
		Statics.method4591();
		client.field9108 = null;
		for (int var4 = 0; var4 < 8; var4++) {
			client.field9085[var4] = null;
			client.field9086[var4] = false;
			client.field9084[var4] = -1;
		}
		class769.method8048();
		client.field9226 = true;
		for (int var5 = 0; var5 < 100; var5++) {
			client.field9204[var5] = true;
		}
		for (int var6 = 0; var6 < 6; var6++) {
			client.field9184[var6] = new class352();
		}
		client.field8980.method6139().method8154();
		client.field9028 = true;
		Statics.field2744 = class540.field6530 = class611.field7209 = class592.field7118 = new short[256];
		Statics.field2400 = class588.field6994.method12206(Statics.field2308);
		Statics.field4961.method15448(Statics.field4961.field9655, Statics.field4961.field9660.method15735());
		client.field9023 = 0;
		class42.method11300();
		client.method15612();
		Statics.field3357 = null;
		Statics.field3307 = 0L;
	}

	@ObfuscatedName("vq.ag(I)Z")
	public static boolean method12287() {
		if (client.field8923 * 1964982599 == 6) {
			return !Statics.method16489() && !Statics.method8399();
		} else {
			return false;
		}
	}
}
