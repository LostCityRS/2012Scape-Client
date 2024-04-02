
import deob.ObfuscatedName;

@ObfuscatedName("fo")
public class LookatMode {

	@ObfuscatedName("fo.u")
	public static final LookatMode field2167 = new LookatMode(0);

	@ObfuscatedName("fo.j")
	public static final LookatMode field2165 = new LookatMode(1);

	@ObfuscatedName("fo.a")
	public static final LookatMode field2164 = new LookatMode(2);

	@ObfuscatedName("fo.s")
	public static final LookatMode field2169 = new LookatMode(3);

	@ObfuscatedName("fo.c")
	public static final LookatMode field2168 = new LookatMode(4);

	@ObfuscatedName("fo.m")
	public static final LookatMode field2170 = new LookatMode(5);

	@ObfuscatedName("fo.t")
	public int field2166;

	public LookatMode(int arg0) {
		this.field2166 = arg0;
	}

	@ObfuscatedName("yf.u(IB)Lfo;")
	public static LookatMode method12904(int arg0) {
		if (field2167.field2166 == arg0) {
			return field2167;
		} else if (field2165.field2166 == arg0) {
			return field2165;
		} else if (field2164.field2166 == arg0) {
			return field2164;
		} else if (field2169.field2166 == arg0) {
			return field2169;
		} else if (field2168.field2166 == arg0) {
			return field2168;
		} else if (field2170.field2166 == arg0) {
			return field2170;
		} else {
			return null;
		}
	}
}
