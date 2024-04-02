
import deob.ObfuscatedName;

@ObfuscatedName("pu")
public class MaterialAlphaMode implements SerializableEnum {

	@ObfuscatedName("pu.u")
	public static final MaterialAlphaMode field4854 = new MaterialAlphaMode(0);

	@ObfuscatedName("pu.j")
	public static final MaterialAlphaMode field4852 = new MaterialAlphaMode(1);

	@ObfuscatedName("pu.a")
	public static final MaterialAlphaMode field4853 = new MaterialAlphaMode(2);

	@ObfuscatedName("pu.s")
	public final int field4851;

	@ObfuscatedName("oe.u(B)[Lpu;")
	public static MaterialAlphaMode[] method7322() {
		return new MaterialAlphaMode[] { field4852, field4853, field4854 };
	}

	public MaterialAlphaMode(int arg0) {
		this.field4851 = arg0;
	}

	@ObfuscatedName("pu.j(B)I")
	public int method6339() {
		return this.field4851;
	}
}
