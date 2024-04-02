
import deob.ObfuscatedName;

@ObfuscatedName("sc")
public class class525 {

	@ObfuscatedName("sc.u")
	public static char[] field6398 = new char[64];

	@ObfuscatedName("sc.j")
	public static char[] field6397;

	@ObfuscatedName("sc.a")
	public static int[] field6399;

	static {
		for (int var0 = 0; var0 < 26; var0++) {
			field6398[var0] = (char) (var0 + 65);
		}
		for (int var1 = 26; var1 < 52; var1++) {
			field6398[var1] = (char) (var1 + 97 - 26);
		}
		for (int var2 = 52; var2 < 62; var2++) {
			field6398[var2] = (char) (var2 + 48 - 52);
		}
		field6398[62] = '+';
		field6398[63] = '/';
		field6397 = new char[64];
		for (int var3 = 0; var3 < 26; var3++) {
			field6397[var3] = (char) (var3 + 65);
		}
		for (int var4 = 26; var4 < 52; var4++) {
			field6397[var4] = (char) (var4 + 97 - 26);
		}
		for (int var5 = 52; var5 < 62; var5++) {
			field6397[var5] = (char) (var5 + 48 - 52);
		}
		field6397[62] = '*';
		field6397[63] = '-';
		field6399 = new int[128];
		for (int var6 = 0; var6 < field6399.length; var6++) {
			field6399[var6] = -1;
		}
		for (int var7 = 65; var7 <= 90; var7++) {
			field6399[var7] = var7 - 65;
		}
		for (int var8 = 97; var8 <= 122; var8++) {
			field6399[var8] = var8 - 97 + 26;
		}
		for (int var9 = 48; var9 <= 57; var9++) {
			field6399[var9] = var9 - 48 + 52;
		}
		int[] var10 = field6399;
		field6399[43] = 62;
		var10[42] = 62;
		int[] var11 = field6399;
		field6399[47] = 63;
		var11[45] = 63;
	}

	public class525() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("dl.a(Ljava/lang/String;B)[B")
	public static byte[] method2608(String arg0) {
		int var1 = arg0.length();
		if (var1 == 0) {
			return new byte[0];
		}
		int var2 = var1 + 3 & 0xFFFFFFFC;
		int var3 = var2 / 4 * 3;
		if (var2 - 2 >= var1 || Statics.method11908(arg0.charAt(var2 - 2)) == -1) {
			var3 -= 2;
		} else if (var2 - 1 >= var1 || Statics.method11908(arg0.charAt(var2 - 1)) == -1) {
			var3--;
		}
		byte[] var4 = new byte[var3];
		Statics.method4633(arg0, var4, 0);
		return var4;
	}
}
