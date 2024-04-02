
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("bh")
public class class97 implements class98 {

	@ObfuscatedName("bh.u")
	public final int field1118;

	@ObfuscatedName("bh.j")
	public final int field1117;

	@ObfuscatedName("bh.a")
	public final class641 field1116;

	public class97(class641 arg0, int arg1, int arg2) {
		this.field1117 = arg2;
		this.field1116 = arg0;
		this.field1118 = arg1;
	}

	@ObfuscatedName("bh.u()I")
	public int method164() {
		return this.field1116.field7448;
	}

	@ObfuscatedName("bh.a()I")
	public int method165() {
		return this.field1116.field7448;
	}

	@ObfuscatedName("bh.j(I)V")
	public void method2260(int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field1118, this.field1116.field1048, this.field1117);
	}

	@ObfuscatedName("bh.s()V")
	public void method168() {
	}
}
