
import deob.ObfuscatedName;

@ObfuscatedName("wl")
public class class618 {

	public class618() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kb.u(Lwr;I)V")
	public static void method5010(class617 arg0) {
		if (Statics.field9905 != null) {
			throw new IllegalStateException("");
		}
		Statics.field9905 = arg0;
	}

	@ObfuscatedName("th.j(I)Lwr;")
	public static class617 method11710() {
		if (Statics.field9905 == null) {
			throw new IllegalStateException("");
		}
		return Statics.field9905;
	}

	@ObfuscatedName("lw.a(I)Z")
	public static boolean method5944() {
		return Statics.field9905 != null;
	}
}
