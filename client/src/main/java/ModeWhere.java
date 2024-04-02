
import deob.ObfuscatedName;

@ObfuscatedName("sf")
public class ModeWhere implements SerializableEnum {

	@ObfuscatedName("sf.u")
	public static final ModeWhere field6363 = new ModeWhere("", 4);

	@ObfuscatedName("sf.j")
	public static final ModeWhere field6369 = new ModeWhere("", 3);

	@ObfuscatedName("sf.a")
	public static final ModeWhere field6364 = new ModeWhere("", 5);

	@ObfuscatedName("sf.s")
	public static final ModeWhere field6365 = new ModeWhere("", 8);

	@ObfuscatedName("sf.c")
	public static final ModeWhere field6362 = new ModeWhere("", 2);

	@ObfuscatedName("sf.m")
	public static final ModeWhere field6366 = new ModeWhere("", 1);

	@ObfuscatedName("sf.t")
	public static final ModeWhere field6367 = new ModeWhere("", 6);

	@ObfuscatedName("sf.l")
	public static final ModeWhere field6368 = new ModeWhere("", 0);

	@ObfuscatedName("sf.f")
	public final int field6370;

	static {
		method11173();
	}

	@ObfuscatedName("sf.u(I)[Lsf;")
	public static ModeWhere[] method11173() {
		return new ModeWhere[] { field6362, field6368, field6366, field6363, field6367, field6369, field6365, field6364 };
	}

	public ModeWhere(String arg0, int arg1) {
		this.field6370 = arg1;
	}

	@ObfuscatedName("sf.a(Lsf;I)Z")
	public static boolean method11177(ModeWhere arg0) {
		return field6366 == arg0 || field6362 == arg0 || field6369 == arg0 || field6364 == arg0 || field6365 == arg0 || field6367 == arg0;
	}

	@ObfuscatedName("sf.j(B)I")
	public int method6339() {
		return this.field6370;
	}
}
