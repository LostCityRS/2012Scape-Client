
import deob.ObfuscatedName;

@ObfuscatedName("ff")
public class class184 {

	@ObfuscatedName("ff.u")
	public static final class184 field2139 = new class184(0, 104);

	@ObfuscatedName("ff.j")
	public static final class184 field2141 = new class184(1, 120);

	@ObfuscatedName("ff.a")
	public static final class184 field2140 = new class184(2, 136);

	@ObfuscatedName("ff.s")
	public static final class184 field2138 = new class184(3, 168);

	@ObfuscatedName("ff.c")
	public static final class184 field2142 = new class184(4, 72);

	@ObfuscatedName("ff.m")
	public final int field2143;

	@ObfuscatedName("ff.t")
	public final int field2144;

	@ObfuscatedName("em.u(B)[Lff;")
	public static class184[] method3459() {
		return new class184[] { field2139, field2142, field2141, field2140, field2138 };
	}

	public class184(int arg0, int arg1) {
		this.field2143 = arg0;
		this.field2144 = arg1;
	}

	@ObfuscatedName("cj.j(II)Lff;")
	public static class184 method2571(int arg0) {
		class184[] var1 = method3459();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class184 var3 = var1[var2];
			if (var3.field2143 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
