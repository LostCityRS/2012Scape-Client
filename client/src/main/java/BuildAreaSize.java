
import deob.ObfuscatedName;

@ObfuscatedName("ff")
public class BuildAreaSize {

	@ObfuscatedName("ff.u")
	public static final BuildAreaSize field2139 = new BuildAreaSize(0, 104);

	@ObfuscatedName("ff.j")
	public static final BuildAreaSize field2141 = new BuildAreaSize(1, 120);

	@ObfuscatedName("ff.a")
	public static final BuildAreaSize field2140 = new BuildAreaSize(2, 136);

	@ObfuscatedName("ff.s")
	public static final BuildAreaSize field2138 = new BuildAreaSize(3, 168);

	@ObfuscatedName("ff.c")
	public static final BuildAreaSize field2142 = new BuildAreaSize(4, 72);

	@ObfuscatedName("ff.m")
	public final int field2143;

	@ObfuscatedName("ff.t")
	public final int field2144;

	@ObfuscatedName("em.u(B)[Lff;")
	public static BuildAreaSize[] method3459() {
		return new BuildAreaSize[] { field2139, field2142, field2141, field2140, field2138 };
	}

	public BuildAreaSize(int arg0, int arg1) {
		this.field2143 = arg0;
		this.field2144 = arg1;
	}

	@ObfuscatedName("cj.j(II)Lff;")
	public static BuildAreaSize method2571(int arg0) {
		BuildAreaSize[] var1 = method3459();
		for (int var2 = 0; var2 < var1.length; var2++) {
			BuildAreaSize var3 = var1[var2];
			if (var3.field2143 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
