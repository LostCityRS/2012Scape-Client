
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("lx")
public class class351 implements GraphicsDeletable, class132, class349 {

	@ObfuscatedName("lx.u")
	public final class139 field3752;

	@ObfuscatedName("lx.j")
	public final class124 field3753;

	@ObfuscatedName("lx.a")
	public final int field3756;

	@ObfuscatedName("lx.s")
	public final int field3755;

	@ObfuscatedName("lx.c")
	public final GlxToolkit field3754;

	@ObfuscatedName("lx.m")
	public int field3757;

	public class351(GlxToolkit arg0, class124 arg1, class139 arg2, int arg3, int arg4) {
		this.field3753 = arg1;
		this.field3752 = arg2;
		this.field3756 = arg3;
		this.field3755 = arg4;
		this.field3754 = arg0;
		int[] var6 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, var6, 0);
		this.field3757 = var6[0];
		OpenGL.glBindRenderbufferEXT(36161, this.field3757);
		OpenGL.glRenderbufferStorageEXT(36161, GlxToolkit.method16100(this.field3753, this.field3752), arg3, arg4);
	}

	public class351(GlxToolkit arg0, class124 arg1, class139 arg2, int arg3, int arg4, int arg5) {
		this.field3753 = arg1;
		this.field3752 = arg2;
		this.field3756 = arg3;
		this.field3755 = arg4;
		this.field3754 = arg0;
		int[] var7 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, var7, 0);
		this.field3757 = var7[0];
		OpenGL.glBindRenderbufferEXT(36161, this.field3757);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, GlxToolkit.method16100(this.field3753, this.field3752), arg3, arg4);
	}

	@ObfuscatedName("lx.u()I")
	public int method164() {
		return this.field3756;
	}

	@ObfuscatedName("lx.a()I")
	public int method165() {
		return this.field3755;
	}

	@ObfuscatedName("lx.j(I)V")
	public void method5970(int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field3757);
	}

	@ObfuscatedName("lx.s()V")
	public void method168() {
		if (this.field3757 > 0) {
			int[] var1 = new int[] { this.field3757 };
			OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
			this.field3757 = 0;
		}
	}

	@ObfuscatedName("lx.q()V")
	public void method6012() {
		if (this.field3757 > 0) {
			this.field3754.method16088(this.field3757, this.field3752.field1508 * this.field3756 * this.field3755 * this.field3753.field1306);
			this.field3757 = 0;
		}
	}

	public void finalize() throws Throwable {
		this.method6012();
		super.finalize();
	}
}
