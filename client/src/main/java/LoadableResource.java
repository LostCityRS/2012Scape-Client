
import deob.ObfuscatedName;

@ObfuscatedName("vu")
public class LoadableResource {

	@ObfuscatedName("vu.u")
	public static final LoadableResource field6859 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.j")
	public static final LoadableResource field6838 = new LoadableResource(LoadableResourceType.field6835);

	@ObfuscatedName("vu.a")
	public static final LoadableResource field6839 = new LoadableResource(LoadableResourceType.field6835);

	@ObfuscatedName("vu.s")
	public static final LoadableResource field6840 = new LoadableResource(LoadableResourceType.field6835);

	@ObfuscatedName("vu.c")
	public static final LoadableResource field6841 = new LoadableResource(LoadableResourceType.field6835);

	@ObfuscatedName("vu.m")
	public static final LoadableResource field6842 = new LoadableResource(LoadableResourceType.field6835);

	@ObfuscatedName("vu.t")
	public static final LoadableResource field6843 = new LoadableResource(LoadableResourceType.field6835);

	@ObfuscatedName("vu.l")
	public static final LoadableResource field6844 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.f")
	public static final LoadableResource field6862 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.d")
	public static final LoadableResource field6837 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.z")
	public static final LoadableResource field6847 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.n")
	public static final LoadableResource field6864 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.o")
	public static final LoadableResource field6858 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.q")
	public static final LoadableResource field6850 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.p")
	public static final LoadableResource field6851 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.w")
	public static final LoadableResource field6852 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.b")
	public static final LoadableResource field6853 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.x")
	public static final LoadableResource field6848 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.i")
	public static final LoadableResource field6855 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.v")
	public static final LoadableResource field6845 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.k")
	public static final LoadableResource field6857 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.h")
	public static final LoadableResource field6854 = new LoadableResource(LoadableResourceType.field6834);

	@ObfuscatedName("vu.r")
	public static final LoadableResource field6846 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.g")
	public static final LoadableResource field6860 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.y")
	public static final LoadableResource field6861 = new LoadableResource(LoadableResourceType.field6833);

	@ObfuscatedName("vu.e")
	public static final LoadableResource field6849 = new LoadableResource(LoadableResourceType.field6836);

	@ObfuscatedName("vu.ay")
	public final LoadableResourceType field6863;

	@ObfuscatedName("vu.af")
	public int field6856;

	@ObfuscatedName("vu.ar")
	public ResourceLoader field6865;

	@ObfuscatedName("vu.u(I)[Lvu;")
	public static LoadableResource[] method12194() {
		return new LoadableResource[] { field6859, field6838, field6839, field6840, field6841, field6842, field6843, field6844, field6862, field6837, field6847, field6864, field6858, field6850, field6851, field6852, field6853, field6848, field6855, field6845, field6857, field6854, field6846, field6860, field6861, field6849 };
	}

	public LoadableResource(LoadableResourceType arg0) {
		this.field6863 = arg0;
		this.field6856 = 1;
	}

	@ObfuscatedName("vu.j(S)I")
	public int method12190() {
		return this.field6856;
	}

	@ObfuscatedName("vu.a(II)V")
	public void method12191(int arg0) {
		this.field6856 = arg0;
	}

	@ObfuscatedName("vu.s(I)Lve;")
	public ResourceLoader method12192() {
		return this.field6865;
	}

	@ObfuscatedName("vu.c(Lve;B)V")
	public void method12193(ResourceLoader arg0) {
		if (arg0.method5534() != this.field6863) {
			throw new IllegalArgumentException();
		}
		this.field6865 = arg0;
	}
}
