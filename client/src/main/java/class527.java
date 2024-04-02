
import deob.ObfuscatedName;

@ObfuscatedName("sv")
public class class527 {

	@ObfuscatedName("sv.u")
	public static final class527 field6407 = new class527("runescape", "RuneScape", 0);

	@ObfuscatedName("sv.j")
	public static final class527 field6402 = new class527("stellardawn", "Stellar Dawn", 1);

	@ObfuscatedName("sv.a")
	public static final class527 field6403 = new class527("game3", "Game 3", 2);

	@ObfuscatedName("sv.s")
	public static final class527 field6406 = new class527("game4", "Game 4", 3);

	@ObfuscatedName("sv.c")
	public static final class527 field6405 = new class527("game5", "Game 5", 4);

	@ObfuscatedName("sv.m")
	public final String field6404;

	@ObfuscatedName("sv.t")
	public final String field6401;

	@ObfuscatedName("sv.l")
	public final int field6408;

	@ObfuscatedName("vh.u(S)[Lsv;")
	public static class527[] method12452() {
		return new class527[] { field6406, field6403, field6402, field6405, field6407 };
	}

	public class527(String arg0, String arg1, int arg2) {
		this.field6404 = arg0;
		this.field6401 = arg1;
		this.field6408 = arg2;
	}

	@ObfuscatedName("aaf.j(II)Lsv;")
	public static class527 method14061(int arg0) {
		class527[] var1 = method12452();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class527 var3 = var1[var2];
			if (var3.field6408 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
