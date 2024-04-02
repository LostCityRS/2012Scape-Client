
import deob.ObfuscatedName;

@ObfuscatedName("akg")
public final class DxProgramUniform extends GpuProgramUniform {

	@ObfuscatedName("akg.z")
	public DxProgramManager field10568;

	@ObfuscatedName("akg.n")
	public int[] field10567 = null;

	@ObfuscatedName("akg.o")
	public int[] field10569 = null;

	public DxProgramUniform(DxProgramManager arg0, class174 arg1) {
		super(arg1);
		this.field10568 = arg0;
		this.field10567 = arg1.field2090;
		this.field10569 = arg1.field2096;
	}

	@ObfuscatedName("akg.u(I)Z")
	public boolean method16248(int arg0) {
		return true;
	}

	@ObfuscatedName("akg.k()I")
	public final int method16988() {
		return this.field10567[this.field10568.method3401()];
	}

	@ObfuscatedName("akg.h()I")
	public final int method16989() {
		return this.field10569[this.field10568.method3401()];
	}

	@ObfuscatedName("akg.m(I)I")
	public final int method16237(int arg0) {
		int var2 = this.field10567[arg0];
		int var3 = this.field10569[arg0];
		if (var2 == -1) {
			return var3 == -1 ? -1 : var3 | 0x10000;
		} else {
			return var2;
		}
	}
}
