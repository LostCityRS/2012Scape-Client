
import deob.ObfuscatedName;

@ObfuscatedName("alr")
public class HardCacheEntry extends CacheEntry {

	@ObfuscatedName("alr.f")
	public Object field10603;

	public HardCacheEntry(CacheKey arg0, Object arg1, int arg2) {
		super(arg0, arg2);
		this.field10603 = arg1;
	}

	@ObfuscatedName("alr.u()Ljava/lang/Object;")
	public Object method16728() {
		return this.field10603;
	}

	@ObfuscatedName("alr.j()Z")
	public boolean method16730() {
		return false;
	}
}
