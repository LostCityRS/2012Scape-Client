
import deob.ObfuscatedName;

@ObfuscatedName("qx")
public class GWC {

	@ObfuscatedName("qx.s")
	public static boolean field4872 = false;

	public GWC() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("fk.u(IB)Laex;")
	public static GWCWorld method3630(int arg0) {
		return field4872 && arg0 >= Statics.field4871 && arg0 <= Statics.field4875 ? Statics.field4873[arg0 - Statics.field4871] : null;
	}

	@ObfuscatedName("lr.j([BI)Z")
	public static boolean method6034(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.method15220();
		if (var2 != 2) {
			return false;
		}
		boolean var3 = var1.method15220() == 1;
		if (var3) {
			method3980(var1);
		}
		method1768(var1);
		return true;
	}

	@ObfuscatedName("ge.a(Laet;I)V")
	public static void method3980(Packet arg0) {
		int var1 = arg0.method15277();
		Statics.field4869 = new GWCLocation[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			Statics.field4869[var2] = new GWCLocation();
			Statics.field4869[var2].field4861 = arg0.method15277();
			Statics.field4869[var2].field4860 = arg0.method15366();
		}
		Statics.field4871 = arg0.method15277();
		Statics.field4875 = arg0.method15277();
		Statics.field4876 = arg0.method15277();
		Statics.field4873 = new GWCWorld[Statics.field4875 - Statics.field4871 + 1];
		for (int var3 = 0; var3 < Statics.field4876; var3++) {
			int var4 = arg0.method15277();
			GWCWorld var5 = Statics.field4873[var4] = new GWCWorld();
			var5.field4864 = arg0.method15220();
			var5.field4866 = arg0.method15379();
			var5.field9799 = Statics.field4871 + var4;
			var5.field9798 = arg0.method15366();
			var5.field9797 = arg0.method15366();
		}
		Statics.field575 = arg0.method15379();
		field4872 = true;
	}

	@ObfuscatedName("ai.s(Laet;I)V")
	public static void method1768(Packet arg0) {
		for (int var1 = 0; var1 < Statics.field4876; var1++) {
			int var2 = arg0.method15277();
			int var3 = arg0.method15239();
			if (var3 == 65535) {
				var3 = -1;
			}
			if (Statics.field4873[var2] != null) {
				Statics.field4873[var2].field4868 = var3;
			}
		}
	}
}
