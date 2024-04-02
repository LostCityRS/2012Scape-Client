
import deob.ObfuscatedName;

@ObfuscatedName("mp")
public class RebuildType {

	@ObfuscatedName("mp.u")
	public static final RebuildType field3838 = new RebuildType(false, false);

	@ObfuscatedName("mp.j")
	public static final RebuildType field3839 = new RebuildType(true, false);

	@ObfuscatedName("mp.a")
	public static final RebuildType field3836 = new RebuildType(false, false);

	@ObfuscatedName("mp.s")
	public static final RebuildType field3835 = new RebuildType(true, false);

	@ObfuscatedName("mp.c")
	public static final RebuildType field3837 = new RebuildType(true, false);

	@ObfuscatedName("mp.m")
	public static final RebuildType field3840 = new RebuildType(true, true);

	@ObfuscatedName("mp.t")
	public static final RebuildType field3841 = new RebuildType(true, true);

	@ObfuscatedName("mp.l")
	public static final RebuildType field3842 = new RebuildType(false, false);

	@ObfuscatedName("mp.f")
	public boolean field3843;

	@ObfuscatedName("mp.d")
	public boolean field3844;

	public RebuildType(boolean arg0, boolean arg1) {
		this.field3843 = arg0;
		this.field3844 = arg1;
	}

	@ObfuscatedName("mp.u(I)Z")
	public boolean method6249() {
		return this.field3843;
	}

	@ObfuscatedName("mp.j(I)Z")
	public boolean method6251() {
		return this.field3844;
	}
}
