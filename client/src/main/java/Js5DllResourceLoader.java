
import deob.ObfuscatedName;

@ObfuscatedName("km")
public class Js5DllResourceLoader implements ResourceLoader {

	@ObfuscatedName("km.u")
	public final String field3499;

	@ObfuscatedName("km.j")
	public boolean field3500;

	public Js5DllResourceLoader(String arg0) {
		this.field3499 = arg0;
	}

	@ObfuscatedName("km.u(I)I")
	public int method5533() {
		if (this.field3500) {
			return 100;
		}
		int var1 = Statics.field2137.method6796(this.field3499);
		if (var1 >= 0 && var1 <= 100) {
			return var1;
		} else {
			this.field3500 = true;
			return 100;
		}
	}

	@ObfuscatedName("km.f(B)Z")
	public boolean method5557() {
		return this.field3500;
	}

	@ObfuscatedName("km.j(I)Lva;")
	public LoadableResourceType method5534() {
		return LoadableResourceType.field6835;
	}
}
