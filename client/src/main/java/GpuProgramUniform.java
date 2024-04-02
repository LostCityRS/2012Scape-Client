
import deob.ObfuscatedName;

@ObfuscatedName("aig")
public abstract class GpuProgramUniform extends class786 {

	@ObfuscatedName("aig.m")
	public class170 field10176;

	@ObfuscatedName("aig.t")
	public String field10178;

	@ObfuscatedName("aig.l")
	public String field10177;

	@ObfuscatedName("aig.f")
	public int field10175;

	@ObfuscatedName("aig.d")
	public class170 field10179;

	public GpuProgramUniform(class174 arg0) {
		this.field10176 = arg0.field2095;
		this.field10178 = arg0.field2093;
		this.field10177 = arg0.field2094;
		this.field10175 = arg0.field2092;
		this.field10179 = arg0.field2091;
	}

	public String toString() {
		String var1 = this.field10176.toString() + " " + this.field10178;
		if (this.field10177 != null && !"".equals(this.field10177)) {
			var1 = var1 + " : " + this.field10177;
		}
		return var1;
	}

	@ObfuscatedName("aig.j(I)Ljava/lang/String;")
	public String method16233() {
		return this.field10178;
	}

	@ObfuscatedName("aig.a(I)Lex;")
	public class170 method16234() {
		return this.field10176;
	}

	@ObfuscatedName("aig.s(B)Lex;")
	public class170 method16235() {
		return this.field10179;
	}

	@ObfuscatedName("aig.c(B)I")
	public int method16236() {
		if (class170.field1977 != this.field10176) {
			throw new OpenGLError(this, this.field10176.toString().toLowerCase());
		}
		return this.field10175;
	}

	@ObfuscatedName("aig.m(I)I")
	public abstract int method16237(int arg0);

	@ObfuscatedName("aig.u(I)Z")
	public abstract boolean method16248(int arg0);
}
