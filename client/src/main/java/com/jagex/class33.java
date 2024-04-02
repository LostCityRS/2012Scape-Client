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
	public static int ssoKey = -1;

	@ObfuscatedName("s.f")
	public static long field506 = -1L;

	@ObfuscatedName("s.ai")
	public static int loginState = 7;

	@ObfuscatedName("s.ao")
	public static long field544 = 0L;

	@ObfuscatedName("s.al")
	public static String username = "";

	@ObfuscatedName("s.at")
	public static String password = "";

	@ObfuscatedName("s.ax")
	public static int loginWait = 0;

	@ObfuscatedName("s.aw")
	public static int loginAttempts = 0;

	@ObfuscatedName("s.az")
	public static int enterLobbyReply = -2;

	@ObfuscatedName("s.ak")
	public static int enterGameReply = -2;

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

	public class33() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gk.u(B)Z")
	public static boolean method3950() {
		if (client.field8909 == null) {
			return ssoKey == -1 ? requestGameLoginWithUsername(username, password) : requestGameLoginWithSSO();
		} else {
			return method11920();
		}
	}

	@ObfuscatedName("pw.j(I)Z")
	public static boolean method7860() {
		if (client.field8909 == null) {
			return ssoKey == -1 ? requestLobbyLoginWithUsername(username, password) : requestLobbyLoginWithSSO();
		} else {
			return method2710();
		}
	}

	@ObfuscatedName("aau.a(I)V")
	public static final void resetLoginState() {
		loginState = 7;
		enterGameReply = -2;
		enterLobbyReply = -2;
	}

	@ObfuscatedName("kj.s(I)V")
	public static final void resetSocialKeys() {
		field506 = -1L;
		field544 = 0L;
		ssoKey = -1;
	}

	@ObfuscatedName("la.c(I)V")
	public static final void cancelLogin() {
		if (loginState != 7) {
			Statics.connection.closeGracefully();
			resetLoginState();
			updateLoginState();
		}
	}

	@ObfuscatedName("vg.l(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method12220(String arg0, String arg1) {
		if (arg0.length() <= 320 && method12287()) {
			resetSocialKeys();
			username = arg0;
			password = arg1;
			client.setState(18);
		}
	}

	@ObfuscatedName("st.f(II)V")
	public static void method11156(int arg0) {
		if (!method12287()) {
			return;
		}
		if (ssoKey != arg0) {
			field506 = -1L;
		}
		ssoKey = arg0;
		client.setState(18);
	}

	@ObfuscatedName("abm.d(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method14208(String arg0, String arg1) {
		if (arg0.length() > 320 || !method12287()) {
			return;
		}
		client.lobbyConnection.closeGracefully();
		resetSocialKeys();
		username = arg0;
		password = arg1;
		client.setState(3);
	}

	@ObfuscatedName("yh.o(I)V")
	public static void resetCredentials() {
		password = "";
		username = "";
	}

	@ObfuscatedName("jc.q(Ljava/lang/String;Ljava/lang/String;S)Z")
	public static boolean requestLobbyLoginWithUsername(String arg0, String arg1) {
		if (!client.ENABLE_LOBBY) {
			return requestGameLoginWithUsername(arg0, arg1);
		}

		Statics.requestState = 154;
		Statics.connection = client.lobbyConnection;
		return requestLogin(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("dh.p(I)Z")
	public static boolean method2710() {
		Statics.requestState = 154;
		Statics.connection = client.lobbyConnection;
		if (client.field8909 != null) {
			Packet var0 = new Packet(client.field8909);
			field506 = var0.g8();
			field544 = var0.g8();
		}
		if (field506 < 0L) {
			setReply(35);
			return false;
		} else {
			return requestLogin(false, true, "", "", field506);
		}
	}

	@ObfuscatedName("sq.w(Ljava/lang/String;Ljava/lang/String;I)Z")
	public static boolean requestGameLoginWithUsername(String arg0, String arg1) {
		Statics.requestState = 223;
		Statics.connection = client.field8975;
		return requestLogin(false, false, arg0, arg1, -1L);
	}

	@ObfuscatedName("uc.b(I)Z")
	public static boolean method11920() {
		Statics.requestState = 223;
		Statics.connection = client.field8975;
		if (client.field8909 != null) {
			Packet var0 = new Packet(client.field8909);
			field506 = var0.g8();
			field544 = var0.g8();
		}
		if (field506 < 0L) {
			setReply(35);
			return false;
		} else {
			return requestLogin(false, true, "", "", field506);
		}
	}

	@ObfuscatedName("v.x(B)Z")
	public static boolean requestGameLoginWithSSO() {
		Statics.requestState = 223;
		Statics.connection = client.field8975;
		return requestLogin(field506 == -1L, true, "", "", field506);
	}

	@ObfuscatedName("uj.i(S)Z")
	public static boolean requestLobbyLoginWithSSO() {
		Statics.requestState = 154;
		Statics.connection = client.lobbyConnection;
		return requestLogin(field506 == -1L, true, "", "", field506);
	}

	@ObfuscatedName("ml.v(ZZLjava/lang/String;Ljava/lang/String;J)Z")
	public static boolean requestLogin(boolean arg0, boolean arg1, String arg2, String arg3, long arg4) {
		field504 = arg0;
		if (!arg1) {
			ssoKey = -1;
		}
		field498 = arg1;
		username = arg2;
		password = arg3;
		field506 = arg4;
		if (!field498 && (username.equals("") || password.equals(""))) {
			setReply(3);
			updateLoginState();
			return false;
		}
		if (Statics.requestState != 154) {
			field526 = 0;
			field509 = -1;
			field543 = -1;
		}
		Statics.connection.field846 = false;
		setReply(-3);
		loginState = 12;
		loginWait = 0;
		loginAttempts = 0;
		return true;
	}

	@ObfuscatedName("nc.k(I)V")
	public static final void method6853() {
		if (loginState == 7 || loginState == 106) {
			return;
		}
		try {
			short var0;
			if (loginAttempts == 0) {
				var0 = 500;
			} else {
				var0 = 2000;
			}
			if (field504 && loginState >= 61) {
				var0 = 6000;
			}
			if (Statics.requestState == 223 && loginState != 208 && enterGameReply != 42 || Statics.requestState == 154 && enterLobbyReply != 49 && enterLobbyReply != 52) {
				loginWait++;
			}
			if (loginWait > var0) {
				Statics.connection.closeGracefully();
				if (loginAttempts >= 3) {
					loginState = 7;
					setReply(-5);
					updateLoginState();
					return;
				}
				if (Statics.requestState == 223) {
					Statics.currentWorld.configureSocketType();
				} else {
					Statics.currentLobby.configureSocketType();
				}
				loginWait = 0;
				loginAttempts++;
				loginState = 12;
			}
			if (loginState == 12) {
				if (Statics.requestState == 223) {
					Statics.connection.method1911(Stream.method12184(Statics.currentWorld.method12025(), 15000), Statics.currentWorld.field6765);
				} else {
					Statics.connection.method1911(Stream.method12184(Statics.currentLobby.method12025(), 15000), Statics.currentLobby.field6765);
				}
				Statics.connection.clearWriteQueue();
				class792 var1 = class792.method4876();
				if (field504) {
					var1.field9467.p1(LoginProt.field2969.field2970);
					var1.field9467.p2(0);
					int var2 = var1.field9467.pos;
					var1.field9467.p4(742);
					var1.field9467.p4(2);
					if (Statics.requestState == 223) {
						var1.field9467.p1(client.state == 9 ? 1 : 0);
					}
					Packet var3 = craeteSecuredPacket();
					var3.p1(ssoKey);
					var3.p2((int) (Math.random() * 9.9999999E7D));
					var3.p1(Statics.field2308.method6339());
					var3.p4(client.field9043);
					for (int var4 = 0; var4 < 6; var4++) {
						var3.p4((int) (Math.random() * 9.9999999E7D));
					}
					var3.p8(client.field9138);
					var3.p1(client.field9163.field6408);
					var3.p1((int) (Math.random() * 9.9999999E7D));
					var3.rsaenc(class51.field666, class51.field667);
					var1.field9467.pdata(var3.data, 0, var3.pos);
					var1.field9467.psize2(var1.field9467.pos - var2);
				} else {
					var1.field9467.p1(LoginProt.INIT_GAME_CONNECTION.field2970);
				}
				Statics.connection.method1913(var1);
				Statics.connection.method1912();
				loginState = 35;
			}
			if (loginState == 35) {
				if (!Statics.connection.getStream().getAvailable(1)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
				Statics.connection.in.pos = 0;
				int var5 = Statics.connection.in.g1();
				if (var5 != 0) {
					loginState = 7;
					method2898(var5);
					setReply(var5);
					Statics.connection.closeGracefully();
					updateLoginState();
					return;
				}
				Statics.connection.in.pos = 0;
				if (field504) {
					loginState = 40;
				} else {
					loginState = 82;
				}
			}
			if (loginState == 40) {
				if (!Statics.connection.getStream().getAvailable(2)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 2);
				Statics.connection.in.pos = 0;
				Statics.connection.in.pos = Statics.connection.in.g2();
				loginState = 55;
			}
			if (loginState == 55) {
				if (!Statics.connection.getStream().getAvailable(Statics.connection.in.pos)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, Statics.connection.in.pos);
				Statics.connection.in.tinydec(Statics.outKey);
				Statics.connection.in.pos = 0;
				String var6 = Statics.connection.in.gjstr2();
				Statics.connection.in.pos = 0;
				String var7 = class284.field3152.method4757();
				if (!client.field8903 || !class383.method1814(var6, 1, var7)) {
					class383.method5599(var6, true, Statics.preferences.field9661.method15781() == 5, var7, client.field8915, client.field9218);
				}
				loginState = 61;
			}
			if (loginState == 61) {
				if (!Statics.connection.getStream().getAvailable(1)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
				if ((Statics.connection.in.data[0] & 0xFF) == 1) {
					loginState = 76;
				}
			}
			if (loginState == 76) {
				if (!Statics.connection.getStream().getAvailable(16)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 16);
				Statics.connection.in.pos = 16;
				Statics.connection.in.tinydec(Statics.outKey);
				Statics.connection.in.pos = 0;
				field506 = Statics.connection.in.g8();
				field544 = Statics.connection.in.g8();
				loginState = 82;
			}
			if (loginState == 82) {
				Statics.connection.in.pos = 0;
				Statics.connection.clearWriteQueue();
				class792 var8 = class792.method4876();
				PacketBit var9 = var8.field9467;
				if (Statics.requestState == 223) {
					LoginProt var10;
					if (field504) {
						var10 = LoginProt.LOBBYLOGIN;
					} else {
						var10 = LoginProt.GAMELOGIN;
					}
					var9.p1(var10.field2970);
					var9.p2(0);
					int var11 = var9.pos;
					int var12 = var9.pos;
					if (!field504) {
						var9.p4(742);
						var9.p4(2);
						if (client.ENABLE_MAC_ADDRESS) {
							var9.pjstr("userMacAddress");
						}
						var9.p1(client.state == 9 ? 1 : 0);
						if (client.ENABLE_MAC_ADDRESS) {
							var9.pjstr("userMacAddress");
						}
						int var13 = var9.pos;
						Packet var14 = method5564();
						var9.pdata(var14.data, 0, var14.pos);
						var12 = var9.pos;
						var9.p1(field506 == -1L ? 1 : 0);
						if (field506 == -1L) {
							var9.pjstr(username);
						} else {
							var9.p8(field506);
						}
					}
					var9.p1(client.method12476());
					var9.p2(Statics.field4125);
					var9.p2(Statics.field4677);
					var9.p1(Statics.preferences.field9665.method15829());
					GameShell.method3615(var9);
					var9.pjstr(client.field8947);
					var9.p4(client.field9043);
					Packet var15 = Statics.preferences.method15447();
					var9.p1(var15.pos);
					var9.pdata(var15.data, 0, var15.pos);
					client.field8932 = true;
					Packet var16 = new Packet(Statics.field2305.method15476());
					Statics.field2305.method15475(var16);
					var9.pdata(var16.data, 0, var16.data.length);
					var9.p4(client.field9023);
					var9.p8(client.field8910);
					var9.pjstr(Statics.field6817);
					var9.p1(client.field9099 == null ? 0 : 1);
					if (client.field9099 != null) {
						var9.pjstr(client.field9099);
					}
					var9.p1(Statics.field2137.method6799("jagtheora") ? 1 : 0);
					var9.p1(client.field8903 ? 1 : 0);
					var9.p1(client.field8987 ? 1 : 0);
					var9.p1(Statics.field7543);
					var9.p4(client.field9015);
					var9.pjstr(client.field8921);
					var9.p1(Statics.field6779 != null && Statics.field6779.field6768 == Statics.currentWorld.field6768 ? 0 : 1);
					method4896(var9);
					var9.tinyenc(Statics.outKey, var12, var9.pos);
					var9.psize2(var9.pos - var11);
				} else {
					LoginProt var17;
					if (field504) {
						var17 = LoginProt.LOBBYLOGIN;
					} else {
						var17 = LoginProt.field2962;
					}
					var9.p1(var17.field2970);
					var9.p2(0);
					int var18 = var9.pos;
					int var19 = var9.pos;
					if (!field504) {
						var9.p4(742);
						var9.p4(2);
						Packet var20 = method5564();
						var9.pdata(var20.data, 0, var20.pos);
						var19 = var9.pos;
						var9.p1(field506 == -1L ? 1 : 0);
						if (field506 == -1L) {
							var9.pjstr(username);
						} else {
							var9.p8(field506);
						}
					}
					var9.p1(client.field9163.field6408);
					var9.p1(Statics.field2308.method6339());
					GameShell.method3615(var9);
					var9.pjstr(client.field8947);
					Packet var21 = Statics.preferences.method15447();
					var9.p1(var21.pos);
					var9.pdata(var21.data, 0, var21.pos);
					Packet var22 = new Packet(Statics.field2305.method15476());
					Statics.field2305.method15475(var22);
					var9.pdata(var22.data, 0, var22.data.length);
					var9.pjstr(Statics.field6817);
					var9.p4(client.field9043);
					var9.p4(client.field9015);
					var9.pjstr(client.field8921);
					method4896(var9);
					var9.tinyenc(Statics.outKey, var19, var9.pos);
					var9.psize2(var9.pos - var18);
				}
				Statics.connection.method1913(var8);
				Statics.connection.method1912();
				Statics.connection.randomOut = new Isaac(Statics.outKey);
				for (int var23 = 0; var23 < 4; var23++) {
					Statics.outKey[var23] += 50;
				}
				Statics.connection.randomIn = new Isaac(Statics.outKey);
				new Isaac(Statics.outKey);
				Statics.connection.in.setSeed(Statics.connection.randomIn);
				Statics.outKey = null;
				loginState = 96;
			}
			if (loginState == 96) {
				if (!Statics.connection.getStream().getAvailable(1)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
				int var24 = Statics.connection.in.g1();
				Statics.connection.in.pos = 0;
				if (var24 == 21) {
					loginState = 120;
				} else if (var24 == 29 || var24 == 45) {
					Statics.field1025 = var24;
					loginState = 183;
				} else if (var24 == 1) {
					loginState = 106;
					setReply(var24);
					return;
				} else if (var24 == 52) {
					Statics.field1025 = var24;
					loginState = 213;
				} else if (var24 == 2) {
					if (field548) {
						field548 = false;
						loginState = 12;
						return;
					}
					loginState = 136;
				} else if (var24 == 15) {
					Statics.connection.packetSize = -2;
					loginState = 197;
				} else if (var24 == 23 && loginAttempts < 3) {
					loginWait = 0;
					loginAttempts++;
					loginState = 12;
					Statics.connection.closeGracefully();
					return;
				} else if (var24 == 42) {
					loginState = 208;
					setReply(var24);
					return;
				} else if (Statics.requestState == 154 && var24 == 49 && client.state != 4) {
					if (enterLobbyReply != 52) {
						setReply(var24);
					}
					return;
				} else if (!field498 || field504 || ssoKey == -1 || var24 != 35) {
					if (var24 != 53) {
						loginState = 7;
						setReply(var24);
						Statics.connection.closeGracefully();
						updateLoginState();
						return;
					}
					loginState = 235;
				} else {
					field504 = true;
					loginWait = 0;
					loginState = 12;
					Statics.connection.closeGracefully();
					return;
				}
			}
			if (loginState == 113) {
				Statics.connection.clearWriteQueue();
				class792 var25 = class792.method4876();
				PacketBit var26 = var25.field9467;
				var26.setSeed(Statics.connection.randomOut);
				var26.pIsaac1(LoginProt.field2968.field2970);
				Statics.connection.method1913(var25);
				Statics.connection.method1912();
				loginState = 96;
				return;
			}
			if (loginState == 120) {
				if (!Statics.connection.getStream().getAvailable(1)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
				int var27 = Statics.connection.in.data[0] & 0xFF;
				field526 = var27 * 50;
				loginState = 7;
				setReply(21);
				Statics.connection.closeGracefully();
				updateLoginState();
				return;
			}
			if (loginState == 208) {
				if (!Statics.connection.getStream().getAvailable(2)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 2);
				field545 = ((Statics.connection.in.data[0] & 0xFF) << 8) + (Statics.connection.in.data[1] & 0xFF);
				loginState = 96;
				return;
			}
			if (loginState == 235) {
				if (!Statics.connection.getStream().getAvailable(4)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 4);
				field507 = Statics.connection.in.g4s();
				Statics.connection.in.pos = 0;
				loginState = 7;
				setReply(53);
				Statics.connection.closeGracefully();
				updateLoginState();
				return;
			}
			if (loginState == 183) {
				if (Statics.field1025 == 29) {
					if (!Statics.connection.getStream().getAvailable(1)) {
						return;
					}
					Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
					field509 = Statics.connection.in.data[0] & 0xFF;
				} else if (Statics.field1025 == 45) {
					if (!Statics.connection.getStream().getAvailable(3)) {
						return;
					}
					Statics.connection.getStream().read(Statics.connection.in.data, 0, 3);
					field509 = Statics.connection.in.data[0] & 0xFF;
					field543 = ((Statics.connection.in.data[1] & 0xFF) << 8) + (Statics.connection.in.data[2] & 0xFF);
				} else {
					throw new IllegalStateException();
				}
				loginState = 7;
				setReply(Statics.field1025);
				Statics.connection.closeGracefully();
				updateLoginState();
				return;
			}
			if (loginState == 213) {
				if (!Statics.connection.getStream().getAvailable(2)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 2);
				Statics.connection.in.pos = 0;
				Statics.field10389 = Statics.connection.in.g2();
				Statics.connection.in.pos = 0;
				loginState = 225;
				return;
			}
			if (loginState == 225) {
				if (!Statics.connection.getStream().getAvailable(Statics.field10389)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, Statics.field10389);
				Statics.connection.in.pos = 0;
				byte[] var28 = new byte[Statics.field10389 + 1];
				Statics.connection.in.gIsaacArrayBuffer(var28, 0, Statics.field10389);
				Statics.connection.in.pos = 0;
				Packet var29 = new Packet(var28);
				String var30 = var29.gjstr();
				class383.method3613(var30, true, Statics.preferences.field9661.method15781() == 5, client.field8915, client.field9218);
				setReply(Statics.field1025);
				if (Statics.requestState == 154 && client.state != 4) {
					loginState = 96;
				} else {
					loginState = 7;
					Statics.connection.closeGracefully();
					updateLoginState();
				}
				return;
			}
			if (loginState == 136) {
				if (!Statics.connection.getStream().getAvailable(1)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 1);
				Statics.field8459 = Statics.connection.in.data[0] & 0xFF;
				loginState = 145;
				return;
			}
			if (loginState == 145) {
				PacketBit var31 = Statics.connection.in;
				if (Statics.requestState == 223) {
					if (!Statics.connection.getStream().getAvailable(Statics.field8459)) {
						return;
					}
					Statics.connection.getStream().read(var31.data, 0, Statics.field8459);
					var31.pos = 0;
					client.field9074 = var31.g1();
					client.field8916 = var31.g1();
					client.field9054 = var31.g1() == 1;
					client.field9077 = var31.g1() == 1;
					client.field9078 = var31.g1() == 1;
					client.field9081 = var31.g1() == 1;
					client.field9071 = var31.g2();
					client.field8998 = var31.g1() == 1;
					Statics.field8469 = var31.g3s();
					client.field9142 = var31.g1() == 1;
					Statics.field4685 = var31.gjstr();
					client.world.getLocTypeList().method11472(client.field9142);
					Statics.field8656.method6040().getLocTypeList().method11472(client.field9142);
					Statics.field3492.method12304(client.field9142);
					Statics.field3774.method12561(client.field9142);
				} else if (Statics.connection.getStream().getAvailable(Statics.field8459)) {
					Statics.connection.getStream().read(var31.data, 0, Statics.field8459);
					var31.pos = 0;
					client.field9074 = var31.g1();
					client.field8916 = var31.g1();
					client.field9054 = var31.g1() == 1;
					Statics.field8469 = var31.g3s();
					Statics.localPlayerEntity.field10043 = (byte) var31.g1();
					client.field9077 = var31.g1() == 1;
					client.field9078 = var31.g1() == 1;
					Statics.field6701 = var31.g8();
					Statics.field3384 = Statics.field6701 - class153.method5554() - var31.g5();
					int var32 = var31.g1();
					client.field8998 = (var32 & 0x1) != 0;
					Statics.field628 = (var32 & 0x2) != 0;
					Statics.field3210 = var31.g4s();
					Statics.field3497 = var31.g1() == 1;
					Statics.field3584 = var31.g4s();
					Statics.field3585 = var31.g2();
					Statics.field5056 = var31.g2();
					Statics.field4225 = var31.g2();
					Statics.field8466 = var31.g4s();
					Statics.field771 = new class44(Statics.field8466);
					(new Thread(Statics.field771)).start();
					Statics.field1685 = var31.g1();
					Statics.field1599 = var31.g2();
					Statics.field7157 = var31.g2();
					Statics.field8432 = var31.g1() == 1;
					Statics.localPlayerEntity.field10040 = Statics.localPlayerEntity.field10063 = Statics.field10527 = var31.gjstr2();
					Statics.field563 = var31.g1();
					Statics.field8537 = var31.g4s();
					client.field9079 = var31.g1() == 1;
					Statics.field6779 = new class573();
					Statics.field6779.field6768 = var31.g2();
					if (Statics.field6779.field6768 == 65535) {
						Statics.field6779.field6768 = -1;
					}
					Statics.field6779.field6765 = var31.gjstr2();
					if (Statics.field6683 != class515.field6368) {
						Statics.field6779.field6764 = Statics.field6779.field6768 + 40000;
						Statics.field6779.field6766 = Statics.field6779.field6768 + 50000;
					}
					if (Statics.field6683 != class515.field6363 && (Statics.field6683 != class515.field6362 || client.field9074 < 2) && Statics.currentWorld.method12027(Statics.field6773)) {
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
				if (Statics.requestState != 223) {
					loginState = 7;
					setReply(2);
					method3222();
					client.setState(15);
					Statics.connection.packetType = null;
					return;
				}
				loginState = 166;
			}
			if (loginState == 166) {
				if (!Statics.connection.getStream().getAvailable(3)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, 3);
				loginState = 173;
			}
			if (loginState == 173) {
				PacketBit in = Statics.connection.in;
				in.pos = 0;
				if (in.isIsaac2()) {
					if (!Statics.connection.getStream().getAvailable(1)) {
						return;
					}
					Statics.connection.getStream().read(in.data, 3, 1);
				}
				Statics.connection.packetType = ServerProt.values()[in.gIsaac1or2()];
				Statics.connection.packetSize = in.g2();
				loginState = 153;
			}
			if (loginState == 153) {
				if (!Statics.connection.getStream().getAvailable(Statics.connection.packetSize)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, Statics.connection.packetSize);
				Statics.connection.in.pos = 0;
				int var37 = Statics.connection.packetSize;
				loginState = 7;
				setReply(2);
				prepareForMap();
				class55.receivePlayerPositions(Statics.connection.in);
				int var38 = var37 - Statics.connection.in.pos;
				PacketBit var39 = new PacketBit(var38);
				System.arraycopy(Statics.connection.in.data, Statics.connection.in.pos, var39.data, 0, var38);
				Statics.connection.in.pos += var38;
				if (ServerProt.REBUILD_REGION == Statics.connection.packetType) {
					client.world.rebuildMap(new RebuildRequest(RebuildType.REBUILD_REGION, var39));
				} else {
					client.world.rebuildMap(new RebuildRequest(RebuildType.REBUILD_NORMAL, var39));
				}
				if (Statics.connection.in.pos != var37) {
					throw new RuntimeException(Statics.connection.in.pos + " " + var37);
				}
				Statics.connection.packetType = null;
				return;
			}
			if (loginState == 197) {
				if (Statics.connection.packetSize == -2) {
					if (!Statics.connection.getStream().getAvailable(2)) {
						return;
					}
					Statics.connection.getStream().read(Statics.connection.in.data, 0, 2);
					Statics.connection.in.pos = 0;
					Statics.connection.packetSize = Statics.connection.in.g2();
				}
				if (!Statics.connection.getStream().getAvailable(Statics.connection.packetSize)) {
					return;
				}
				Statics.connection.getStream().read(Statics.connection.in.data, 0, Statics.connection.packetSize);
				Statics.connection.in.pos = 0;
				int var40 = Statics.connection.packetSize;
				loginState = 7;
				setReply(15);
				Statics.prepareForPlayers();
				class55.receivePlayerPositions(Statics.connection.in);
				if (Statics.connection.in.pos != var40) {
					throw new RuntimeException(Statics.connection.in.pos + " " + var40);
				}
				Statics.connection.packetType = null;
			}
		} catch (IOException var45) {
			Statics.connection.closeGracefully();
			if (loginAttempts < 3) {
				if (Statics.requestState == 223) {
					Statics.currentWorld.configureSocketType();
				} else {
					Statics.currentLobby.configureSocketType();
				}
				loginWait = 0;
				loginAttempts++;
				loginState = 12;
			} else {
				loginState = 7;
				setReply(-4);
				updateLoginState();
			}
		}
	}

	@ObfuscatedName("dq.h(II)V")
	public static void method2898(int arg0) {
	}

	@ObfuscatedName("ru.r(I)Laet;")
	public static Packet craeteSecuredPacket() {
		Packet buf = new Packet(518);
		Statics.outKey = new int[4];
		Statics.outKey[0] = (int) (Math.random() * 9.9999999E7D);
		Statics.outKey[1] = (int) (Math.random() * 9.9999999E7D);
		Statics.outKey[2] = (int) (Math.random() * 9.9999999E7D);
		Statics.outKey[3] = (int) (Math.random() * 9.9999999E7D);
		buf.p1(10);
		buf.p4(Statics.outKey[0]);
		buf.p4(Statics.outKey[1]);
		buf.p4(Statics.outKey[2]);
		buf.p4(Statics.outKey[3]);
		return buf;
	}

	@ObfuscatedName("kg.g(S)Laet;")
	public static Packet method5564() {
		Packet buf = craeteSecuredPacket();
		buf.p8(0L);
		buf.pjstr(password);
		buf.p8(field544);
		buf.p8(client.field9138);
		buf.rsaenc(class51.field666, class51.field667);
		return buf;
	}

	@ObfuscatedName("pz.y(II)V")
	public static void setReply(int reply) {
		if (!client.ENABLE_LOBBY || Statics.requestState == 154) {
			enterLobbyReply = reply;
		} else if (client.ENABLE_LOBBY && Statics.requestState == 223) {
			enterGameReply = reply;
		}
	}

	@ObfuscatedName("ta.e(I)V")
	public static void updateLoginState() {
		if (client.method12490(client.state)) {
			if (client.lobbyConnection.getStream() == null) {
				client.setState(3);
			} else {
				client.setState(15);
			}
		} else if (client.state == 3 || client.state == 18) {
			client.setState(6);
		} else if (client.state == 4) {
			client.setState(6);
		}
	}

	@ObfuscatedName("jw.ay(Lajl;I)V")
	public static void method4896(PacketBit arg0) {
		arg0.p4(Statics.field7567.method5622());
		arg0.p4(Statics.field6690.method5622());
		arg0.p4(Statics.field7435.method5622());
		arg0.p4(Statics.field2653.method5622());
		arg0.p4(Statics.field5197.method5622());
		arg0.p4(Statics.field7343.method5622());
		arg0.p4(Statics.field9367.method5622());
		arg0.p4(Statics.field4560.method5622());
		arg0.p4(Statics.field7387.method5622());
		arg0.p4(Statics.field808.method5622());
		arg0.p4(Statics.field3523.method5622());
		arg0.p4(Statics.field1509.method5622());
		arg0.p4(Statics.clientScriptsJs5.method5622());
		arg0.p4(Statics.field8745.method5622());
		arg0.p4(Statics.field3156.method5622());
		arg0.p4(Statics.field5104.method5622());
		arg0.p4(Statics.field1565.method5622());
		arg0.p4(Statics.field6451.method5622());
		arg0.p4(Statics.field5080.method5622());
		arg0.p4(Statics.field5130.method5622());
		arg0.p4(Statics.field3897.method5622());
		arg0.p4(Statics.field2070.method5622());
		arg0.p4(Statics.field4229.method5622());
		arg0.p4(Statics.field4059.method5622());
		arg0.p4(Statics.field6343.method5622());
		arg0.p4(Statics.field6712.method5622());
		arg0.p4(Statics.field7572.method5622());
		arg0.p4(Statics.field8655.method5622());
		arg0.p4(Statics.field849.method5622());
		arg0.p4(Statics.field8734.method5622());
		arg0.p4(Statics.field663.method5622());
		arg0.p4(Statics.field2670.method5622());
		arg0.p4(Loading.method6307());
		arg0.p4(Loading.method4671());
		arg0.p4(Statics.field4824.method5622());
		arg0.p4(Statics.field2117.method5622());
		arg0.p4(Statics.field6435.method5622());
	}

	@ObfuscatedName("gr.af(I)V")
	public static void method3988() {
		Statics.connection.clearWriteQueue();
		Statics.connection.in.pos = 0;
		Statics.connection.lastPacketType0 = null;
		Statics.connection.lastPacketType1 = null;
		Statics.connection.lastPacketType2 = null;
		Statics.connection.idleNetCycles = 0;
		client.rebootTimer = 0;
		Statics.method12634();
		client.friendsListState = 0;
		client.friendsCount = 0;
		client.ignoresCount = 0;
		client.clanChatDisplayName = null;
		Statics.clanChatCount = 0;
		Statics.clanChatUsers = null;
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
	public static void prepareForMap() {
		if (client.state == 0) {
			Statics.method1681();
		}
		method3988();
		client.lobbyConnection.closeGracefully();
		Statics.field578 = true;
		class590.method11905();
		for (int i = 0; i < client.hintArrows.length; i++) {
			client.hintArrows[i] = null;
		}
		client.field9117 = false;
		class395.method2387();
		client.field9050 = (int) (Math.random() * 100.0D) - 50;
		client.field9006 = (int) (Math.random() * 110.0D) - 55;
		client.field9008 = (int) (Math.random() * 80.0D) - 40;
		client.field9087 = (int) (Math.random() * 120.0D) - 60;
		client.field8976 = (int) (Math.random() * 30.0D) - 20;
		client.field9021 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		class58.method7163();
		for (int var1 = 0; var1 < 2048; var1++) {
			client.field9070[var1] = null;
		}
		Statics.localPlayerEntity = null;
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
		if (client.openedTopInterface != -1) {
			class165.method13890(client.openedTopInterface);
		}
		for (class816 var3 = (class816) client.openedSubInterfaces.method11928(); var3 != null; var3 = (class816) client.openedSubInterfaces.method11929()) {
			if (!var3.method6982()) {
				var3 = (class816) client.openedSubInterfaces.method11928();
				if (var3 == null) {
					break;
				}
			}
			client.method7069(var3, true, false);
		}
		client.openedTopInterface = -1;
		client.openedSubInterfaces = new IterableMap(8);
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
		client.world.getEnvironmentManager().method8154();
		client.field9028 = true;
		Statics.field2744 = LocType.field6530 = class611.field7209 = class592.field7118 = new short[256];
		Statics.field2400 = class588.field6994.method12206(Statics.field2308);
		Statics.preferences.method15448(Statics.preferences.field9655, Statics.preferences.field9660.method15735());
		client.field9023 = 0;
		class42.method11300();
		client.method15612();
		Statics.field3357 = null;
		Statics.field3307 = 0L;
	}

	@ObfuscatedName("vq.ag(I)Z")
	public static boolean method12287() {
		if (client.state == 6) {
			return !Statics.method16489() && !Statics.method8399();
		} else {
			return false;
		}
	}
}
