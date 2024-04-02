
import deob.ObfuscatedName;

@ObfuscatedName("cp")
public class class111 {

	@ObfuscatedName("cp.u")
	public static int field1192 = 0;

	@ObfuscatedName("cp.j")
	public static boolean field1193 = false;

	@ObfuscatedName("cp.a")
	public static final class547 field1194 = new class547();

	public class111() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cp.u(Lua;I)V")
	public static synchronized void method2358(class10 arg0) {
		if (field1193) {
			return;
		}
		if (field1192 > 0) {
			class798 var1 = new class798(arg0);
			field1194.method11558(var1);
		} else {
			arg0.method92(false);
		}
	}

	@ObfuscatedName("cp.j(B)V")
	public static synchronized void method2359() {
		while (true) {
			class798 var0 = (class798) field1194.method11560();
			if (var0 == null) {
				return;
			}
			((class10) var0.field9550).method92(true);
			var0.method6979();
		}
	}

	@ObfuscatedName("cp.a(B)V")
	public static synchronized void method2360() {
		field1192++;
	}

	@ObfuscatedName("cp.s(I)V")
	public static synchronized void method2361() {
		field1192--;
		if (field1192 == 0) {
			method2359();
		}
	}
}
