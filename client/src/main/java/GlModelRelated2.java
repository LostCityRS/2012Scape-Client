
import deob.ObfuscatedName;

@ObfuscatedName("gx")
public class GlModelRelated2 {

	@ObfuscatedName("gx.u")
	public boolean field2418;

	@ObfuscatedName("gx.j")
	public boolean field2419;

	@ObfuscatedName("gx.a")
	public IndexBuffer field2420;

	@ObfuscatedName("gx.s")
	public IndexBuffer field2421;

	public GlModelRelated2(boolean arg0) {
		this.field2419 = arg0;
	}

	@ObfuscatedName("gx.u()Z")
	public boolean method4263() {
		return this.field2418 && !this.field2419;
	}

	@ObfuscatedName("gx.j()V")
	public void method4265() {
		if (this.field2421 != null) {
			this.field2421.method168();
		}
		this.field2418 = false;
	}
}
