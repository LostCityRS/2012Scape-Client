
import deob.ObfuscatedName;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("s")
public class LoginManager {

	@ObfuscatedName("s.c")
	public static boolean field498 = false;

	@ObfuscatedName("s.t")
	public static boolean field504 = false;

	@ObfuscatedName("s.l")
	public static int field499 = -1;

	@ObfuscatedName("s.f")
	public static long field506 = -1L;

	@ObfuscatedName("s.ai")
	public static int field531 = 7;

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
	public static int field537 = -2;

	@ObfuscatedName("s.ak")
	public static int field538 = -2;

	@ObfuscatedName("s.av")
	public static int field547 = -2;

	@ObfuscatedName("s.aj")
	public static int field540 = -1;

	@ObfuscatedName("s.ah")
	public static int field546 = -1;

	@ObfuscatedName("s.au")
	public static int field526 = 0;

	@ObfuscatedName("s.ae")
	public static int field543 = -1;

	@ObfuscatedName("s.ac")
	public static int field509 = -1;

	@ObfuscatedName("s.aq")
	public static int field545 = 0;

	@ObfuscatedName("s.ab")
	public static boolean field536 = false;

	@ObfuscatedName("s.bq")
	public static int field507 = 0;

	@ObfuscatedName("s.bz")
	public static boolean field548 = false;

	public LoginManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gk.u(B)Z")
	public static boolean method3950() {
		if (client.field8909 == null) {
			return field499 == -1 ? method11239(field533, field534) : method1201();
		} else {
			return method11920();
		}
	}

	@ObfuscatedName("pw.j(I)Z")
	public static boolean method7860() {
		if (client.field8909 == null) {
			return field499 == -1 ? method4741(field533, field534) : method11994();
		} else {
			return method2710();
		}
	}

	@ObfuscatedName("aau.a(I)V")
	public static final void method14090() {
		field531 = 7;
		field538 = -2;
		field537 = -2;
	}

	@ObfuscatedName("kj.s(I)V")
	public static final void method5547() {
		field506 = -1L;
		field544 = 0L;
		field499 = -1;
	}

	@ObfuscatedName("la.c(I)V")
	public static final void method6066() {
		if (field531 != 7) {
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
		if (field499 != arg0) {
			field506 = -1L;
		}
		field499 = arg0;
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
		Statics.field500 = 154;
		Statics.field501 = client.field8959;
		return method6245(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("dh.p(I)Z")
	public static boolean method2710() {
		Statics.field500 = 154;
		Statics.field501 = client.field8959;
		if (client.field8909 != null) {
			Packet var0 = new Packet(client.field8909);
			field506 = var0.method15246();
			field544 = var0.method15246();
		}
		if (field506 < 0L) {
			method7972(35);
			return false;
		} else {
			return method6245(false, true, "", "", field506);
		}
	}

	@ObfuscatedName("sq.w(Ljava/lang/String;Ljava/lang/String;I)Z")
	public static boolean method11239(String arg0, String arg1) {
		Statics.field500 = 223;
		Statics.field501 = client.field8975;
		return method6245(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("uc.b(I)Z")
	public static boolean method11920() {
		Statics.field500 = 223;
		Statics.field501 = client.field8975;
		if (client.field8909 != null) {
			Packet var0 = new Packet(client.field8909);
			field506 = var0.method15246();
			field544 = var0.method15246();
		}
		if (field506 < 0L) {
			method7972(35);
			return false;
		} else {
			return method6245(false, true, "", "", field506);
		}
	}

	@ObfuscatedName("v.x(B)Z")
	public static boolean method1201() {
		Statics.field500 = 223;
		Statics.field501 = client.field8975;
		return method6245(field506 == -1L, true, "", "", field506);
	}

	@ObfuscatedName("uj.i(S)Z")
	public static boolean method11994() {
		Statics.field500 = 154;
		Statics.field501 = client.field8959;
		return method6245(field506 == -1L, true, "", "", field506);
	}

	@ObfuscatedName("ml.v(ZZLjava/lang/String;Ljava/lang/String;J)Z")
	public static boolean method6245(boolean arg0, boolean arg1, String arg2, String arg3, long arg4) {
		field504 = arg0;
		if (!arg1) {
			field499 = -1;
		}
		field498 = arg1;
		field533 = arg2;
		field534 = arg3;
		field506 = arg4;
		if (!field498 && (field533.equals("") || field534.equals(""))) {
			method7972(3);
			method184();
			return false;
		}
		if (Statics.field500 != 154) {
			field526 = 0;
			field509 = -1;
			field543 = -1;
		}
		Statics.field501.field846 = false;
		method7972(-3);
		field531 = 12;
		field535 = 0;
		field516 = 0;
		return true;
	}

	@ObfuscatedName("nc.k(I)V")
	public static final void method6853() {
		if (field531 == 7 || field531 == 106) {
			return;
		}
		try {
			short var0;
			if (field516 == 0) {
				var0 = 500;
			} else {
				var0 = 2000;
			}
			if (field504 && field531 >= 61) {
				var0 = 6000;
			}
			if (Statics.field500 == 223 && field531 != 208 && field538 != 42 || Statics.field500 == 154 && field537 != 49 && field537 != 52) {
				field535++;
			}
			if (field535 > var0) {
				Statics.field501.method1916();
				if (field516 >= 3) {
					field531 = 7;
					method7972(-5);
					method184();
					return;
				}
				if (Statics.field500 == 223) {
					Statics.field6772.method12026();
				} else {
					Statics.field6782.method12026();
				}
				field535 = 0;
				field516++;
				field531 = 12;
			}
			if (field531 == 12) {
				if (Statics.field500 == 223) {
					Statics.field501.method1911(Stream.method12184(Statics.field6772.method12025(), 15000), Statics.field6772.field6765);
				} else {
					Statics.field501.method1911(Stream.method12184(Statics.field6782.method12025(), 15000), Statics.field6782.field6765);
				}
				Statics.field501.method1935();
				ClientMessage var1 = ClientMessage.method4876();
				if (field504) {
					var1.field9467.method15308(class281.field2969.field2970);
					var1.field9467.method15287(0);
					int var2 = var1.field9467.field9626;
					var1.field9467.method15223(742);
					var1.field9467.method15223(1);
					if (Statics.field500 == 223) {
						var1.field9467.method15308(client.field8923 == 9 ? 1 : 0);
					}
					Packet var3 = method8625();
					var3.method15308(field499);
					var3.method15287((int) (Math.random() * 9.9999999E7D));
					var3.method15308(Statics.field2308.method6339());
					var3.method15223(client.field9043);
					for (int var4 = 0; var4 < 6; var4++) {
						var3.method15223((int) (Math.random() * 9.9999999E7D));
					}
					var3.method15420(client.field9138);
					var3.method15308(client.field9163.field6408);
					var3.method15308((int) (Math.random() * 9.9999999E7D));
					var3.method15265(class51.field666, class51.field667);
					var1.field9467.method15276(var3.field9629, 0, var3.field9626);
					var1.field9467.method15233(var1.field9467.field9626 - var2);
				} else {
					var1.field9467.method15308(class281.field2965.field2970);
				}
				Statics.field501.method1913(var1);
				Statics.field501.method1912();
				field531 = 35;
			}
			if (field531 == 35) {
				if (!Statics.field501.method1927().method7212(1)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
				Statics.field501.field832.field9626 = 0;
				int var5 = Statics.field501.field832.method15220();
				if (var5 != 0) {
					field531 = 7;
					method2898(var5);
					method7972(var5);
					Statics.field501.method1916();
					method184();
					return;
				}
				Statics.field501.field832.field9626 = 0;
				if (field504) {
					field531 = 40;
				} else {
					field531 = 82;
				}
			}
			if (field531 == 40) {
				if (!Statics.field501.method1927().method7212(2)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 2);
				Statics.field501.field832.field9626 = 0;
				Statics.field501.field832.field9626 = Statics.field501.field832.method15239();
				field531 = 55;
			}
			if (field531 == 55) {
				if (!Statics.field501.method1927().method7212(Statics.field501.field832.field9626)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, Statics.field501.field832.field9626);
				Statics.field501.field832.method15262(Statics.field541);
				Statics.field501.field832.field9626 = 0;
				String var6 = Statics.field501.field832.method15366();
				Statics.field501.field832.field9626 = 0;
				String var7 = JavascriptFunction.field3152.method4757();
				if (!client.field8903 || !class383.method1814(var6, 1, var7)) {
					class383.method5599(var6, true, Statics.field4961.field9661.method15781() == 5, var7, client.field8915, client.field9218);
				}
				field531 = 61;
			}
			if (field531 == 61) {
				if (!Statics.field501.method1927().method7212(1)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
				if ((Statics.field501.field832.field9629[0] & 0xFF) == 1) {
					field531 = 76;
				}
			}
			if (field531 == 76) {
				if (!Statics.field501.method1927().method7212(16)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 16);
				Statics.field501.field832.field9626 = 16;
				Statics.field501.field832.method15262(Statics.field541);
				Statics.field501.field832.field9626 = 0;
				field506 = Statics.field501.field832.method15246();
				field544 = Statics.field501.field832.method15246();
				field531 = 82;
			}
			if (field531 == 82) {
				Statics.field501.field832.field9626 = 0;
				Statics.field501.method1935();
				ClientMessage var8 = ClientMessage.method4876();
				PacketBit var9 = var8.field9467;
				if (Statics.field500 == 223) {
					class281 var10;
					if (field504) {
						var10 = class281.field2967;
					} else {
						var10 = class281.field2961;
					}
					var9.method15308(var10.field2970);
					var9.method15287(0);
					int var11 = var9.field9626;
					int var12 = var9.field9626;
					if (!field504) {
						var9.method15223(742);
						var9.method15223(1);
						var9.method15308(client.field8923 == 9 ? 1 : 0);
						int var13 = var9.field9626;
						Packet var14 = method5564();
						var9.method15276(var14.field9629, 0, var14.field9626);
						var12 = var9.field9626;
						var9.method15308(field506 == -1L ? 1 : 0);
						if (field506 == -1L) {
							var9.method15228(field533);
						} else {
							var9.method15420(field506);
						}
					}
					var9.method15308(client.method12476());
					var9.method15287(Statics.field4125);
					var9.method15287(Statics.field4677);
					var9.method15308(Statics.field4961.field9665.method15829());
					GameShell.method3615(var9);
					var9.method15228(client.field8947);
					var9.method15223(client.field9043);
					Packet var15 = Statics.field4961.method15447();
					var9.method15308(var15.field9626);
					var9.method15276(var15.field9629, 0, var15.field9626);
					client.field8932 = true;
					Packet var16 = new Packet(Statics.field2305.method15476());
					Statics.field2305.method15475(var16);
					var9.method15276(var16.field9629, 0, var16.field9629.length);
					var9.method15223(client.field9023);
					var9.method15420(client.field8910);
					var9.method15228(Statics.field6817);
					var9.method15308(client.field9099 == null ? 0 : 1);
					if (client.field9099 != null) {
						var9.method15228(client.field9099);
					}
					var9.method15308(Statics.field2137.method6799("jagtheora") ? 1 : 0);
					var9.method15308(client.field8903 ? 1 : 0);
					var9.method15308(client.field8987 ? 1 : 0);
					var9.method15308(Statics.field7543);
					var9.method15223(client.field9015);
					var9.method15228(client.field8921);
					var9.method15308(Statics.field6779 != null && Statics.field6779.field6768 == Statics.field6772.field6768 ? 0 : 1);
					method4896(var9);
					var9.method15280(Statics.field541, var12, var9.field9626);
					var9.method15233(var9.field9626 - var11);
				} else {
					class281 var17;
					if (field504) {
						var17 = class281.field2967;
					} else {
						var17 = class281.field2962;
					}
					var9.method15308(var17.field2970);
					var9.method15287(0);
					int var18 = var9.field9626;
					int var19 = var9.field9626;
					if (!field504) {
						var9.method15223(742);
						var9.method15223(1);
						Packet var20 = method5564();
						var9.method15276(var20.field9629, 0, var20.field9626);
						var19 = var9.field9626;
						var9.method15308(field506 == -1L ? 1 : 0);
						if (field506 == -1L) {
							var9.method15228(field533);
						} else {
							var9.method15420(field506);
						}
					}
					var9.method15308(client.field9163.field6408);
					var9.method15308(Statics.field2308.method6339());
					GameShell.method3615(var9);
					var9.method15228(client.field8947);
					Packet var21 = Statics.field4961.method15447();
					var9.method15308(var21.field9626);
					var9.method15276(var21.field9629, 0, var21.field9626);
					Packet var22 = new Packet(Statics.field2305.method15476());
					Statics.field2305.method15475(var22);
					var9.method15276(var22.field9629, 0, var22.field9629.length);
					var9.method15228(Statics.field6817);
					var9.method15223(client.field9043);
					var9.method15223(client.field9015);
					var9.method15228(client.field8921);
					method4896(var9);
					var9.method15280(Statics.field541, var19, var9.field9626);
					var9.method15233(var9.field9626 - var18);
				}
				Statics.field501.method1913(var8);
				Statics.field501.method1912();
				Statics.field501.field834 = new Isaac(Statics.field541);
				for (int var23 = 0; var23 < 4; var23++) {
					Statics.field541[var23] += 50;
				}
				Statics.field501.field833 = new Isaac(Statics.field541);
				new Isaac(Statics.field541);
				Statics.field501.field832.method16876(Statics.field501.field833);
				Statics.field541 = null;
				field531 = 96;
			}
			if (field531 == 96) {
				if (!Statics.field501.method1927().method7212(1)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
				int var24 = Statics.field501.field832.method15220();
				Statics.field501.field832.field9626 = 0;
				if (var24 == 21) {
					field531 = 120;
				} else if (var24 == 29 || var24 == 45) {
					Statics.field1025 = var24;
					field531 = 183;
				} else if (var24 == 1) {
					field531 = 106;
					method7972(var24);
					return;
				} else if (var24 == 52) {
					Statics.field1025 = var24;
					field531 = 213;
				} else if (var24 == 2) {
					if (field548) {
						field548 = false;
						field531 = 12;
						return;
					}
					field531 = 136;
				} else if (var24 == 15) {
					Statics.field501.field835 = -2;
					field531 = 197;
				} else if (var24 == 23 && field516 < 3) {
					field535 = 0;
					field516++;
					field531 = 12;
					Statics.field501.method1916();
					return;
				} else if (var24 == 42) {
					field531 = 208;
					method7972(var24);
					return;
				} else if (Statics.field500 == 154 && var24 == 49 && client.field8923 != 4) {
					if (field537 != 52) {
						method7972(var24);
					}
					return;
				} else if (!field498 || field504 || field499 == -1 || var24 != 35) {
					if (var24 != 53) {
						field531 = 7;
						method7972(var24);
						Statics.field501.method1916();
						method184();
						return;
					}
					field531 = 235;
				} else {
					field504 = true;
					field535 = 0;
					field531 = 12;
					Statics.field501.method1916();
					return;
				}
			}
			if (field531 == 113) {
				Statics.field501.method1935();
				ClientMessage var25 = ClientMessage.method4876();
				PacketBit var26 = var25.field9467;
				var26.method16876(Statics.field501.field834);
				var26.method16864(class281.field2968.field2970);
				Statics.field501.method1913(var25);
				Statics.field501.method1912();
				field531 = 96;
				return;
			}
			if (field531 == 120) {
				if (!Statics.field501.method1927().method7212(1)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
				int var27 = Statics.field501.field832.field9629[0] & 0xFF;
				field526 = var27 * 50;
				field531 = 7;
				method7972(21);
				Statics.field501.method1916();
				method184();
				return;
			}
			if (field531 == 208) {
				if (!Statics.field501.method1927().method7212(2)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 2);
				field545 = ((Statics.field501.field832.field9629[0] & 0xFF) << 8) + (Statics.field501.field832.field9629[1] & 0xFF);
				field531 = 96;
				return;
			}
			if (field531 == 235) {
				if (!Statics.field501.method1927().method7212(4)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 4);
				field507 = Statics.field501.field832.method15379();
				Statics.field501.field832.field9626 = 0;
				field531 = 7;
				method7972(53);
				Statics.field501.method1916();
				method184();
				return;
			}
			if (field531 == 183) {
				if (Statics.field1025 == 29) {
					if (!Statics.field501.method1927().method7212(1)) {
						return;
					}
					Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
					field509 = Statics.field501.field832.field9629[0] & 0xFF;
				} else if (Statics.field1025 == 45) {
					if (!Statics.field501.method1927().method7212(3)) {
						return;
					}
					Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 3);
					field509 = Statics.field501.field832.field9629[0] & 0xFF;
					field543 = ((Statics.field501.field832.field9629[1] & 0xFF) << 8) + (Statics.field501.field832.field9629[2] & 0xFF);
				} else {
					throw new IllegalStateException();
				}
				field531 = 7;
				method7972(Statics.field1025);
				Statics.field501.method1916();
				method184();
				return;
			}
			if (field531 == 213) {
				if (!Statics.field501.method1927().method7212(2)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 2);
				Statics.field501.field832.field9626 = 0;
				Statics.field10389 = Statics.field501.field832.method15239();
				Statics.field501.field832.field9626 = 0;
				field531 = 225;
				return;
			}
			if (field531 == 225) {
				if (!Statics.field501.method1927().method7212(Statics.field10389)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, Statics.field10389);
				Statics.field501.field832.field9626 = 0;
				byte[] var28 = new byte[Statics.field10389 + 1];
				Statics.field501.field832.method16861(var28, 0, Statics.field10389);
				Statics.field501.field832.field9626 = 0;
				Packet var29 = new Packet(var28);
				String var30 = var29.method15337();
				class383.method3613(var30, true, Statics.field4961.field9661.method15781() == 5, client.field8915, client.field9218);
				method7972(Statics.field1025);
				if (Statics.field500 == 154 && client.field8923 != 4) {
					field531 = 96;
				} else {
					field531 = 7;
					Statics.field501.method1916();
					method184();
				}
				return;
			}
			if (field531 == 136) {
				if (!Statics.field501.method1927().method7212(1)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 1);
				Statics.field8459 = Statics.field501.field832.field9629[0] & 0xFF;
				field531 = 145;
				return;
			}
			if (field531 == 145) {
				PacketBit var31 = Statics.field501.field832;
				if (Statics.field500 == 223) {
					if (!Statics.field501.method1927().method7212(Statics.field8459)) {
						return;
					}
					Statics.field501.method1927().method7196(var31.field9629, 0, Statics.field8459);
					var31.field9626 = 0;
					client.field9074 = var31.method15220();
					client.field8916 = var31.method15220();
					client.field9054 = var31.method15220() == 1;
					client.field9077 = var31.method15220() == 1;
					client.field9078 = var31.method15220() == 1;
					client.field9081 = var31.method15220() == 1;
					client.field9071 = var31.method15239();
					client.field8998 = var31.method15220() == 1;
					Statics.field8469 = var31.method15242();
					client.field9142 = var31.method15220() == 1;
					Statics.field4685 = var31.method15337();
					client.field8980.method6103().method11472(client.field9142);
					Statics.field8656.method6040().method6103().method11472(client.field9142);
					Statics.field3492.method12304(client.field9142);
					Statics.field3774.method12561(client.field9142);
				} else if (Statics.field501.method1927().method7212(Statics.field8459)) {
					Statics.field501.method1927().method7196(var31.field9629, 0, Statics.field8459);
					var31.field9626 = 0;
					client.field9074 = var31.method15220();
					client.field8916 = var31.method15220();
					client.field9054 = var31.method15220() == 1;
					Statics.field8469 = var31.method15242();
					Statics.field2119.field10043 = (byte) var31.method15220();
					client.field9077 = var31.method15220() == 1;
					client.field9078 = var31.method15220() == 1;
					Statics.field6701 = var31.method15246();
					Statics.field3384 = Statics.field6701 - MonotonicTime.method5554() - var31.method15245();
					int var32 = var31.method15220();
					client.field8998 = (var32 & 0x1) != 0;
					Statics.field628 = (var32 & 0x2) != 0;
					Statics.field3210 = var31.method15379();
					Statics.field3497 = var31.method15220() == 1;
					Statics.field3584 = var31.method15379();
					Statics.field3585 = var31.method15239();
					Statics.field5056 = var31.method15239();
					Statics.field4225 = var31.method15239();
					Statics.field8466 = var31.method15379();
					Statics.field771 = new HostNameProvider(Statics.field8466);
					(new Thread(Statics.field771)).start();
					Statics.field1685 = var31.method15220();
					Statics.field1599 = var31.method15239();
					Statics.field7157 = var31.method15239();
					Statics.field8432 = var31.method15220() == 1;
					Statics.field2119.field10040 = Statics.field2119.field10063 = Statics.field10527 = var31.method15366();
					Statics.field563 = var31.method15220();
					Statics.field8537 = var31.method15379();
					client.field9079 = var31.method15220() == 1;
					Statics.field6779 = new ServerAddress();
					Statics.field6779.field6768 = var31.method15239();
					if (Statics.field6779.field6768 == 65535) {
						Statics.field6779.field6768 = -1;
					}
					Statics.field6779.field6765 = var31.method15366();
					if (Statics.field6683 != ModeWhere.field6368) {
						Statics.field6779.field6764 = Statics.field6779.field6768 + 40000;
						Statics.field6779.field6766 = Statics.field6779.field6768 + 50000;
					}
					if (Statics.field6683 != ModeWhere.field6363 && (Statics.field6683 != ModeWhere.field6362 || client.field9074 < 2) && Statics.field6772.method12027(Statics.field6773)) {
						Statics.method12022();
					}
				} else {
					return;
				}
				if (client.field9054 && !client.field9078 || client.field8998) {
					try {
						BrowserControl.method12167(Statics.field6387, "zap");
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
						BrowserControl.method12167(Statics.field6387, "unzap");
					} catch (Throwable var42) {
					}
				}
				if (Statics.field6683 == ModeWhere.field6368) {
					JavascriptFunction.field3141.method4761();
				}
				if (Statics.field500 != 223) {
					field531 = 7;
					method7972(2);
					method3222();
					client.method11307(15);
					Statics.field501.field840 = null;
					return;
				}
				field531 = 166;
			}
			if (field531 == 166) {
				if (!Statics.field501.method1927().method7212(3)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 3);
				field531 = 173;
			}
			if (field531 == 173) {
				PacketBit var36 = Statics.field501.field832;
				var36.field9626 = 0;
				if (var36.method16859()) {
					if (!Statics.field501.method1927().method7212(1)) {
						return;
					}
					Statics.field501.method1927().method7196(var36.field9629, 3, 1);
				}
				Statics.field501.field840 = ServerProt.method14807()[var36.method16883()];
				Statics.field501.field835 = var36.method15239();
				field531 = 153;
			}
			if (field531 == 153) {
				if (!Statics.field501.method1927().method7212(Statics.field501.field835)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, Statics.field501.field835);
				Statics.field501.field832.field9626 = 0;
				int var37 = Statics.field501.field835;
				field531 = 7;
				method7972(2);
				method3965();
				ReceivePlayerPositions.method12667(Statics.field501.field832);
				int var38 = var37 - Statics.field501.field832.field9626;
				PacketBit var39 = new PacketBit(var38);
				System.arraycopy(Statics.field501.field832.field9629, Statics.field501.field832.field9626, var39.field9629, 0, var38);
				Statics.field501.field832.field9626 += var38;
				if (ServerProt.field3128 == Statics.field501.field840) {
					client.field8980.method6135(new RebuildRequest(RebuildType.field3835, var39));
				} else {
					client.field8980.method6135(new RebuildRequest(RebuildType.field3836, var39));
				}
				if (Statics.field501.field832.field9626 != var37) {
					throw new RuntimeException(Statics.field501.field832.field9626 + " " + var37);
				}
				Statics.field501.field840 = null;
				return;
			}
			if (field531 == 197) {
				if (Statics.field501.field835 == -2) {
					if (!Statics.field501.method1927().method7212(2)) {
						return;
					}
					Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, 2);
					Statics.field501.field832.field9626 = 0;
					Statics.field501.field835 = Statics.field501.field832.method15239();
				}
				if (!Statics.field501.method1927().method7212(Statics.field501.field835)) {
					return;
				}
				Statics.field501.method1927().method7196(Statics.field501.field832.field9629, 0, Statics.field501.field835);
				Statics.field501.field832.field9626 = 0;
				int var40 = Statics.field501.field835;
				field531 = 7;
				method7972(15);
				Statics.method1237();
				ReceivePlayerPositions.method12667(Statics.field501.field832);
				if (Statics.field501.field832.field9626 != var40) {
					throw new RuntimeException(Statics.field501.field832.field9626 + " " + var40);
				}
				Statics.field501.field840 = null;
				return;
			}
		} catch (IOException var45) {
			Statics.field501.method1916();
			if (field516 < 3) {
				if (Statics.field500 == 223) {
					Statics.field6772.method12026();
				} else {
					Statics.field6782.method12026();
				}
				field535 = 0;
				field516++;
				field531 = 12;
			} else {
				field531 = 7;
				method7972(-4);
				method184();
			}
		}
	}

	@ObfuscatedName("dq.h(II)V")
	public static void method2898(int arg0) {
	}

	@ObfuscatedName("ru.r(I)Laet;")
	public static Packet method8625() {
		Packet var0 = new Packet(518);
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
	public static Packet method5564() {
		Packet var0 = method8625();
		var0.method15420(0L);
		var0.method15228(field534);
		var0.method15420(field544);
		var0.method15420(client.field9138);
		var0.method15265(class51.field666, class51.field667);
		return var0;
	}

	@ObfuscatedName("pz.y(II)V")
	public static void method7972(int arg0) {
		if (Statics.field500 == 154) {
			field537 = arg0;
		} else if (Statics.field500 == 223) {
			field538 = arg0;
		}
	}

	@ObfuscatedName("ta.e(I)V")
	public static void method184() {
		if (client.method12490(client.field8923)) {
			if (client.field8959.method1927() == null) {
				client.method11307(3);
			} else {
				client.method11307(15);
			}
		} else if (client.field8923 == 3 || client.field8923 == 18) {
			client.method11307(6);
		} else if (client.field8923 == 4) {
			client.method11307(6);
		}
	}

	@ObfuscatedName("jw.ay(Lajl;I)V")
	public static void method4896(PacketBit arg0) {
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
		if (client.field8923 == 0) {
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
		client.field9050 = (int) (Math.random() * 100.0D) - 50;
		client.field9006 = (int) (Math.random() * 110.0D) - 55;
		client.field9008 = (int) (Math.random() * 80.0D) - 40;
		client.field9087 = (int) (Math.random() * 120.0D) - 60;
		client.field8976 = (int) (Math.random() * 30.0D) - 20;
		client.field9021 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		MiniMap.method7163();
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
		class770.field9278 = new IterableQueue();
		class770.field9292 = new IterableQueue();
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
		if (client.field8941 != -1) {
			ComType.method13890(client.field8941);
		}
		for (SubIfType var3 = (SubIfType) client.field9075.method11928(); var3 != null; var3 = (SubIfType) client.field9075.method11929()) {
			if (!var3.method6982()) {
				var3 = (SubIfType) client.field9075.method11928();
				if (var3 == null) {
					break;
				}
			}
			client.method7069(var3, true, false);
		}
		client.field8941 = -1;
		client.field9075 = new IterableMap(8);
		Statics.method4591();
		client.field9108 = null;
		for (int var4 = 0; var4 < 8; var4++) {
			client.field9085[var4] = null;
			client.field9086[var4] = false;
			client.field9084[var4] = -1;
		}
		ClientInvCache.method8048();
		client.field9226 = true;
		for (int var5 = 0; var5 < 100; var5++) {
			client.field9204[var5] = true;
		}
		for (int var6 = 0; var6 < 6; var6++) {
			client.field9184[var6] = new StockMarketSlot();
		}
		client.field8980.method6139().method8154();
		client.field9028 = true;
		Statics.field2744 = LocType.field6530 = NPCType.field7209 = ObjType.field7118 = new short[256];
		Statics.field2400 = LocalisedText.field6994.method12206(Statics.field2308);
		Statics.field4961.method15448(Statics.field4961.field9655, Statics.field4961.field9660.method15735());
		client.field9023 = 0;
		MiniMenu.method11300();
		client.method15612();
		Statics.field3357 = null;
		Statics.field3307 = 0L;
	}

	@ObfuscatedName("vq.ag(I)Z")
	public static boolean method12287() {
		if (client.field8923 == 6) {
			return !Statics.method16489() && !Statics.method8399();
		} else {
			return false;
		}
	}
}
