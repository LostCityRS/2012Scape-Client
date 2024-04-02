
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aby")
public class class738 extends class347 implements class225 {

	@ObfuscatedName("aby.p")
	public final int field8782;

	@ObfuscatedName("aby.w")
	public final int field8783;

	@ObfuscatedName("aby.b")
	public final int field8784;

	public class738(GlxToolkit arg0, class124 arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6) {
		super(arg0, 32879, arg1, DataType.field1501, arg2 * arg3 * arg4, arg5);
		this.field8782 = arg2;
		this.field8783 = arg3;
		this.field8784 = arg4;
		this.field3733.method13557(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.field3737, 0, GlxToolkit.method16100(this.field3736, this.field3731), this.field8782, this.field8783, this.field8784, 0, GlxToolkit.method16093(this.field3736), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (arg5) {
			this.method4418();
		}
	}

	@ObfuscatedName("aby.au()V")
	public void method4527() {
		super.method4527();
	}

	@ObfuscatedName("aby.ae(Lhd;)V")
	public void method4525(GpuTextureRelated arg0) {
		super.method4525(arg0);
	}

	@ObfuscatedName("aby.s()V")
	public void method168() {
		super.method168();
	}
}
