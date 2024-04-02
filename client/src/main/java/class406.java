
import deob.ObfuscatedName;

@ObfuscatedName("of")
public class class406 {

	@ObfuscatedName("of.u")
	public int field4255;

	@ObfuscatedName("of.j")
	public int[] field4254;

	@ObfuscatedName("of.a")
	public int[] field4253;

	public class406(int arg0) {
		this.field4255 = arg0;
		this.field4254 = new int[this.field4255];
		this.field4253 = new int[this.field4255];
	}

	@ObfuscatedName("dc.u(Lls;Ljava/lang/String;ZI)Lof;")
	public static class406 method2791(class334 arg0, String arg1, boolean arg2) {
		int var3 = arg0.method5688(arg1);
		if (var3 == -1) {
			return new class406(0);
		}
		int[] var4 = arg0.method5683(var3);
		class406 var5 = new class406(var4.length);
		int var6 = 0;
		int var7 = 0;
		while (true) {
			while (var6 < var5.field4255) {
				Packet var8 = new Packet(arg0.method5627(var3, var4[var7++]));
				int var9 = var8.method15379();
				int var10 = var8.method15239();
				int var11 = var8.method15220();
				if (!arg2 && var11 == 1) {
					var5.field4255--;
				} else {
					var5.field4254[var6] = var9;
					var5.field4253[var6] = var10;
					var6++;
				}
			}
			return var5;
		}
	}
}
