
import deob.ObfuscatedName;

@ObfuscatedName("kt")
public class class318 {

	public class318() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kt.u(Lko;Lko;Lko;F[Lko;)V")
	public static void method5379(class317 arg0, class317 arg1, class317 arg2, float arg3, class317[] arg4) {
		class317 var5 = class317.method5377(arg0, arg2);
		float var6 = class317.method5306(var5, var5) - arg3 * arg3;
		float var7 = class317.method5306(arg1, var5);
		float var8 = var7 * var7 - var6;
		if (var8 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (var8 >= 9.765625E-4F) {
			float var10 = (float) Math.sqrt((double) var8);
			arg4[0] = class317.method5288();
			arg4[0].method5334(arg0);
			arg4[0].method5299(class317.method5317(class317.method5290(arg1), -var7 - var10));
			arg4[1] = class317.method5288();
			arg4[1].method5334(arg0);
			arg4[1].method5299(class317.method5317(class317.method5290(arg1), -var7 + var10));
		} else {
			arg4[0] = class317.method5288();
			arg4[0].method5334(arg0);
			arg4[0].method5299(class317.method5317(class317.method5290(arg1), -var7));
			arg4[1] = null;
		}
	}
}
