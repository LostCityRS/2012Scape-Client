
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ll")
public class class346 implements class349 {

	@ObfuscatedName("ll.u")
	public final int field3727;

	@ObfuscatedName("ll.j")
	public final class745 field3726;

	public class346(class745 arg0, int arg1) {
		this.field3727 = arg1;
		this.field3726 = arg0;
	}

	@ObfuscatedName("ll.u()I")
	public int method164() {
		return this.field3726.method4409();
	}

	@ObfuscatedName("ll.a()I")
	public int method165() {
		return this.field3726.method4449();
	}

	@ObfuscatedName("ll.j(I)V")
	public void method5970(int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field3726.field3737, this.field3726.field3734, this.field3727);
	}

	@ObfuscatedName("ll.s()V")
	public void method168() {
	}
}
