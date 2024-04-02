
import deob.ObfuscatedName;

@ObfuscatedName("kj")
public class Js5ArchiveResourceLoader implements ResourceLoader {

	@ObfuscatedName("kj.u")
	public final Js5 field3488;

	public Js5ArchiveResourceLoader(Js5 arg0) {
		this.field3488 = arg0;
	}

	@ObfuscatedName("kj.u(I)I")
	public int method5533() {
		return this.field3488.method5662() ? 100 : this.field3488.method5634();
	}

	@ObfuscatedName("kj.j(I)Lva;")
	public LoadableResourceType method5534() {
		return LoadableResourceType.field6833;
	}
}
