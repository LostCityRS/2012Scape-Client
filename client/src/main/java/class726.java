
import deob.ObfuscatedName;

@ObfuscatedName("aag")
public class class726 extends class202 {

	@ObfuscatedName("aag.a")
	public Shader field8696;

	@ObfuscatedName("aag.s")
	public class918 field8695;

	@ObfuscatedName("aag.c")
	public class168 field8697;

	public class726(GpuToolkit arg0) throws ShaderException {
		super(arg0);
		this.method14064();
	}

	@ObfuscatedName("aag.s(I)Z")
	public boolean method14064() throws ShaderException {
		this.field8696 = this.field2276.method13490("BatchedSprite");
		this.field8695 = this.field8696.method3357("SpriteSampler");
		this.field8697 = this.field8696.method3330("Normal");
		this.field8696.method3335(this.field8697);
		return true;
	}

	@ObfuscatedName("aag.u()V")
	public void method3878() {
		this.field8696.method3325();
		this.field8696.method3336(this.field8695, 0, this.field2275);
	}
}
