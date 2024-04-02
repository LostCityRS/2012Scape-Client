
import deob.ObfuscatedName;

@ObfuscatedName("rw")
public class SkillDefaults {

	@ObfuscatedName("rw.j")
	public static final int[] field5134 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@ObfuscatedName("rw.a")
	public static int[] field5135 = new int[120];

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 120; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			field5135[var1] = var0 / 4;
		}
	}

	public SkillDefaults() throws Throwable {
		throw new Error();
	}
}
