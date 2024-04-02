
import deob.ObfuscatedName;

@ObfuscatedName("nq")
public class Link {

	@ObfuscatedName("nq.u")
	public Link field4223;

	@ObfuscatedName("nq.j")
	public Link field4224;

	@ObfuscatedName("nq.u(B)V")
	public void method6975() {
		if (this.field4224 != null) {
			this.field4224.field4223 = this.field4223;
			this.field4223.field4224 = this.field4224;
			this.field4223 = null;
			this.field4224 = null;
		}
	}
}
