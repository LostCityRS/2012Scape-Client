package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import java.io.IOException;

@ObfuscatedName("b")
public class class43 {

	@ObfuscatedName("b.a")
	public static int field634 = 0;

	@ObfuscatedName("b.s")
	public static int field631 = 0;

	public class43() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aeb.j(B)V")
	public static void method15481() {
		Statics.field633 = class36.field564;
		Statics.field629 = class534.field6432;
		Statics.field4011 = class535.field6449;
		Statics.field9312 = class536.field6457;
	}

	@ObfuscatedName("vl.s(Ljava/lang/String;I)V")
	public static void method12448(String arg0) {
		if (client.state != 14) {
			return;
		}
		class792 var1 = class792.method14781(class280.field2859, client.lobbyConnection.randomOut);
		var1.field9467.p2(0);
		int var2 = var1.field9467.pos;
		var1.field9467.pjstr(arg0);
		var1.field9467.pos += 7;
		var1.field9467.tinyenc(Statics.field630, var2, var1.field9467.pos);
		var1.field9467.psize2(var1.field9467.pos - var2);
		client.lobbyConnection.method1913(var1);
		Statics.field9312 = class536.field6453;
	}

	@ObfuscatedName("gz.m(II)V")
	public static void method3942(int arg0) {
		if (client.state == 14) {
			class792 var1 = class792.method14781(class280.field2917, client.lobbyConnection.randomOut);
			var1.field9467.p1(arg0);
			client.lobbyConnection.method1913(var1);
		}
	}

	@ObfuscatedName("eq.t(B)Lty;")
	public static class534 method3012() {
		return Statics.field629 == null ? class534.field6425 : Statics.field629;
	}

	@ObfuscatedName("rz.l(B)Ltk;")
	public static class535 method8659() {
		return Statics.field4011 == null ? class535.field6449 : Statics.field4011;
	}

	@ObfuscatedName("sz.f(I)Ltc;")
	public static class536 method11157() {
		return Statics.field9312 == null ? class536.field6457 : Statics.field9312;
	}

	@ObfuscatedName("na.d(Ltk;I)V")
	public static void method1219(class535 arg0) {
		Statics.field4011 = arg0;
	}

	@ObfuscatedName("ig.z(Ltc;I)V")
	public static void method4554(class536 arg0) {
		Statics.field9312 = arg0;
	}

	@ObfuscatedName("lw.n(I)V")
	public static void method5945() {
		if (Statics.field633 == null) {
			return;
		}
		try {
			short var0;
			if (field631 == 0) {
				var0 = 250;
			} else {
				var0 = 2000;
			}
			field634++;
			if (field634 > var0) {
				Statics.method5540();
			}
			if (Statics.field633 == class36.field564) {
				client.lobbyConnection.method1911(Stream.method12184(Statics.currentLobby.method12025(), 15000), Statics.currentLobby.field6765);
				client.lobbyConnection.clearWriteQueue();
				class792 var1 = class792.method4876();
				var1.field9467.p1(LoginProt.field2959.field2970);
				var1.field9467.p2(0);
				int var2 = var1.field9467.pos;
				var1.field9467.p2(742);
				var1.field9467.p2(2);
				Statics.field630 = method11380(var1);
				int var3 = var1.field9467.pos;
				var1.field9467.pjstr(client.field8921);
				var1.field9467.p2(client.field9043);
				var1.field9467.p8(client.field8910);
				var1.field9467.pjstr(Statics.field6817);
				var1.field9467.p1(Statics.field2308.method6339());
				var1.field9467.p1(client.field9163.field6408);
				GameShell.method3615(var1.field9467);
				String var4 = client.field9099;
				var1.field9467.p1(var4 == null ? 0 : 1);
				if (var4 != null) {
					var1.field9467.pjstr(var4);
				}
				Statics.field2305.method15475(var1.field9467);
				var1.field9467.pos += 7;
				var1.field9467.tinyenc(Statics.field630, var3, var1.field9467.pos);
				var1.field9467.psize2(var1.field9467.pos - var2);
				client.lobbyConnection.method1913(var1);
				client.lobbyConnection.method1912();
				Statics.field633 = class36.field565;
			}
			if (Statics.field633 == class36.field565) {
				if (client.lobbyConnection.getStream() == null) {
					Statics.method5540();
					return;
				}
				if (!client.lobbyConnection.getStream().getAvailable(1)) {
					return;
				}
				client.lobbyConnection.getStream().read(client.lobbyConnection.in.data, 0, 1);
				Statics.field629 = (class534) class518.method8032(class534.method8658(), client.lobbyConnection.in.data[0] & 0xFF);
				if (Statics.field629 == class534.field6424) {
					client.lobbyConnection.randomOut = new Isaac(Statics.field630);
					int[] var5 = new int[4];
					for (int var6 = 0; var6 < 4; var6++) {
						var5[var6] = Statics.field630[var6] + 50;
					}
					client.lobbyConnection.randomIn = new Isaac(var5);
					new Isaac(var5);
					client.lobbyConnection.in.setSeed(client.lobbyConnection.randomIn);
					client.setState(14);
					client.lobbyConnection.clearWriteQueue();
					client.lobbyConnection.in.pos = 0;
					client.lobbyConnection.lastPacketType0 = null;
					client.lobbyConnection.lastPacketType1 = null;
					client.lobbyConnection.lastPacketType2 = null;
					client.lobbyConnection.idleNetCycles = 0;
				} else {
					client.lobbyConnection.closeGracefully();
				}
				client.lobbyConnection.packetType = null;
				Statics.field633 = null;
			}
		} catch (IOException var8) {
			Statics.method5540();
		}
	}

	@ObfuscatedName("tk.o(Lada;B)[I")
	public static int[] method11380(class792 arg0) {
		Packet var1 = new Packet(518);
		int[] var2 = new int[4];
		for (int var3 = 0; var3 < 4; var3++) {
			var2[var3] = (int) (Math.random() * 9.9999999E7D);
		}
		var1.p1(10);
		var1.p4(var2[0]);
		var1.p4(var2[1]);
		var1.p4(var2[2]);
		var1.p4(var2[3]);
		for (int var4 = 0; var4 < 10; var4++) {
			var1.p4((int) (Math.random() * 9.9999999E7D));
		}
		var1.p2((int) (Math.random() * 9.9999999E7D));
		var1.rsaenc(class51.field666, class51.field667);
		arg0.field9467.pdata(var1.data, 0, var1.pos);
		return var2;
	}
}
