
import deob.ObfuscatedName;

@ObfuscatedName("pj")
public class Bindings {

	public Bindings() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("afu.u(Laet;I)Lpr;")
	public static Binding method15895(Packet arg0) {
		class449 var1 = class449.method6333(arg0.method15220());
		if (class449.field4820 == var1) {
			return class446.method1698(arg0);
		} else if (class449.field4818 == var1) {
			return class448.method11866(arg0);
		} else if (class449.field4819 == var1) {
			return Statics.method3541(arg0);
		} else {
			return null;
		}
	}
}
