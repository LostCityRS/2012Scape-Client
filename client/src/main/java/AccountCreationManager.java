
import deob.ObfuscatedName;
import java.io.IOException;

@ObfuscatedName("b")
public class AccountCreationManager {

	@ObfuscatedName("b.a")
	public static int field634 = 0;

	@ObfuscatedName("b.s")
	public static int field631 = 0;

	public AccountCreationManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aeb.j(B)V")
	public static void method15481() {
		Statics.field633 = CreateConnectStage.field564;
		Statics.field629 = ConnectReply.field6432;
		Statics.field4011 = CreateAccountReply.field6449;
		Statics.field9312 = CheckEmailReply.field6457;
	}

	@ObfuscatedName("vl.s(Ljava/lang/String;I)V")
	public static void method12448(String arg0) {
		if (client.field8923 != 14) {
			return;
		}
		ClientMessage var1 = ClientMessage.method14781(ClientProt.field2859, client.field8959.field834);
		var1.field9467.method15287(0);
		int var2 = var1.field9467.field9626;
		var1.field9467.method15228(arg0);
		var1.field9467.field9626 += 7;
		var1.field9467.method15280(Statics.field630, var2, var1.field9467.field9626);
		var1.field9467.method15233(var1.field9467.field9626 - var2);
		client.field8959.method1913(var1);
		Statics.field9312 = CheckEmailReply.field6453;
	}

	@ObfuscatedName("gz.m(II)V")
	public static void method3942(int arg0) {
		if (client.field8923 == 14) {
			ClientMessage var1 = ClientMessage.method14781(ClientProt.field2917, client.field8959.field834);
			var1.field9467.method15308(arg0);
			client.field8959.method1913(var1);
		}
	}

	@ObfuscatedName("eq.t(B)Lty;")
	public static ConnectReply method3012() {
		return Statics.field629 == null ? ConnectReply.field6425 : Statics.field629;
	}

	@ObfuscatedName("rz.l(B)Ltk;")
	public static CreateAccountReply method8659() {
		return Statics.field4011 == null ? CreateAccountReply.field6449 : Statics.field4011;
	}

	@ObfuscatedName("sz.f(I)Ltc;")
	public static CheckEmailReply method11157() {
		return Statics.field9312 == null ? CheckEmailReply.field6457 : Statics.field9312;
	}

	@ObfuscatedName("na.d(Ltk;I)V")
	public static void method1219(CreateAccountReply arg0) {
		Statics.field4011 = arg0;
	}

	@ObfuscatedName("ig.z(Ltc;I)V")
	public static void method4554(CheckEmailReply arg0) {
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
			if (Statics.field633 == CreateConnectStage.field564) {
				client.field8959.method1911(Stream.method12184(Statics.field6782.method12025(), 15000), Statics.field6782.field6765);
				client.field8959.method1935();
				ClientMessage var1 = ClientMessage.method4876();
				var1.field9467.method15308(class281.field2959.field2970);
				var1.field9467.method15287(0);
				int var2 = var1.field9467.field9626;
				var1.field9467.method15287(742);
				var1.field9467.method15287(1);
				Statics.field630 = method11380(var1);
				int var3 = var1.field9467.field9626;
				var1.field9467.method15228(client.field8921);
				var1.field9467.method15287(client.field9043);
				var1.field9467.method15420(client.field8910);
				var1.field9467.method15228(Statics.field6817);
				var1.field9467.method15308(Statics.field2308.method6339());
				var1.field9467.method15308(client.field9163.field6408);
				GameShell.method3615(var1.field9467);
				String var4 = client.field9099;
				var1.field9467.method15308(var4 == null ? 0 : 1);
				if (var4 != null) {
					var1.field9467.method15228(var4);
				}
				Statics.field2305.method15475(var1.field9467);
				var1.field9467.field9626 += 7;
				var1.field9467.method15280(Statics.field630, var3, var1.field9467.field9626);
				var1.field9467.method15233(var1.field9467.field9626 - var2);
				client.field8959.method1913(var1);
				client.field8959.method1912();
				Statics.field633 = CreateConnectStage.field565;
			}
			if (Statics.field633 == CreateConnectStage.field565) {
				if (client.field8959.method1927() == null) {
					Statics.method5540();
					return;
				}
				if (!client.field8959.method1927().method7212(1)) {
					return;
				}
				client.field8959.method1927().method7196(client.field8959.field832.field9629, 0, 1);
				Statics.field629 = (ConnectReply) SerializableEnums.method8032(ConnectReply.method8658(), client.field8959.field832.field9629[0] & 0xFF);
				if (Statics.field629 == ConnectReply.field6424) {
					client.field8959.field834 = new Isaac(Statics.field630);
					int[] var5 = new int[4];
					for (int var6 = 0; var6 < 4; var6++) {
						var5[var6] = Statics.field630[var6] + 50;
					}
					client.field8959.field833 = new Isaac(var5);
					new Isaac(var5);
					client.field8959.field832.method16876(client.field8959.field833);
					client.method11307(14);
					client.field8959.method1935();
					client.field8959.field832.field9626 = 0;
					client.field8959.field843 = null;
					client.field8959.field844 = null;
					client.field8959.field831 = null;
					client.field8959.field837 = 0;
				} else {
					client.field8959.method1916();
				}
				client.field8959.field840 = null;
				Statics.field633 = null;
			}
		} catch (IOException var8) {
			Statics.method5540();
		}
	}

	@ObfuscatedName("tk.o(Lada;B)[I")
	public static int[] method11380(ClientMessage arg0) {
		Packet var1 = new Packet(518);
		int[] var2 = new int[4];
		for (int var3 = 0; var3 < 4; var3++) {
			var2[var3] = (int) (Math.random() * 9.9999999E7D);
		}
		var1.method15308(10);
		var1.method15223(var2[0]);
		var1.method15223(var2[1]);
		var1.method15223(var2[2]);
		var1.method15223(var2[3]);
		for (int var4 = 0; var4 < 10; var4++) {
			var1.method15223((int) (Math.random() * 9.9999999E7D));
		}
		var1.method15287((int) (Math.random() * 9.9999999E7D));
		var1.method15265(class51.field666, class51.field667);
		arg0.field9467.method15276(var1.field9629, 0, var1.field9626);
		return var2;
	}
}