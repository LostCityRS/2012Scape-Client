
import deob.ObfuscatedName;

@ObfuscatedName("mj")
public class class362 {

	public class362() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("or.u(Lkn;I)F")
	public static float method7588(class316 arg0) {
		class317 var1 = class317.method5294(0.0F, 0.0F, 1.0F);
		var1.method5318(arg0);
		double var2 = 1.5707963267948966D - Math.acos((double) var1.field3476);
		var1.method5291();
		return (float) var2;
	}

	@ObfuscatedName("gi.j(FFI)F")
	public static float method4037(float arg0, float arg1) {
		double var2 = Math.atan2((double) arg0, (double) arg1);
		if (var2 < 0.0D) {
			var2 = var2 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) var2;
	}

	@ObfuscatedName("ap.a(Lkn;I)F")
	public static float method1721(class316 arg0) {
		class317 var1 = class317.method5294(0.0F, 0.0F, 1.0F);
		var1.method5318(arg0);
		double var2 = Math.atan2((double) var1.field3475, (double) var1.field3477);
		var1.method5291();
		if (var2 < 0.0D) {
			var2 = var2 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) var2;
	}
}
