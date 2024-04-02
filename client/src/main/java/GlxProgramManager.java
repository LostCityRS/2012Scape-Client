
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aap")
public class GlxProgramManager extends Shader {

	@ObfuscatedName("aap.f")
	public final GlxToolkit field8590;

	@ObfuscatedName("aap.d")
	public GlxProgram field8588;

	@ObfuscatedName("aap.z")
	public int field8589;

	public GlxProgramManager(GlxToolkit arg0, ShaderData arg1) {
		super(arg0, arg1);
		this.field8590 = arg0;
	}

	@ObfuscatedName("aap.c(Lyk;Lei;)Leo;")
	public class168 method3404(GpuToolkit arg0, class167 arg1) {
		return new GlxProgram((GlxToolkit) arg0, this, arg1);
	}

	@ObfuscatedName("aap.z(Leo;)Z")
	public boolean method3335(class168 arg0) {
		if (this.field8588 == arg0) {
			return true;
		} else if (arg0.method3272()) {
			boolean var2 = this.method3327();
			this.field8588 = (GlxProgram) arg0;
			this.field2079 = this.method3345(arg0);
			if (this.field2079 == -1) {
				throw new IllegalArgumentException();
			}
			this.field8589 = this.field8588.field8571;
			if (var2) {
				OpenGL.glUseProgram(this.field8589);
				this.field8590.field10027 = this.field8588;
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aap.q(Ley;)Laig;")
	public class918 method3338(class174 arg0) {
		return new class993(this, arg0);
	}

	@ObfuscatedName("aap.u()V")
	public void method3325() {
		if (this.field8590.field10027 == this.field8588) {
			return;
		}
		if (this.field8588 == null) {
			throw new ProgramManagerException();
		}
		OpenGL.glUseProgram(this.field8589);
		this.field8590.field10027 = this.field8588;
	}

	@ObfuscatedName("aap.j()V")
	public void method3416() {
	}

	@ObfuscatedName("aap.a()Z")
	public boolean method3327() {
		return this.field8590.field10027 == this.field8588;
	}

	@ObfuscatedName("aap.aa()V")
	public void method3363() {
		for (int var1 = 0; var1 < this.method3331(); var1++) {
			((GlxProgram) this.method3332(var1)).method168();
		}
		super.method3363();
	}

	public void finalize() throws Throwable {
		this.method3363();
		super.finalize();
	}
}
