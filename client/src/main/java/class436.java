
import deob.ObfuscatedName;

@ObfuscatedName("px")
public class class436 {

	public class436() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("fi.u(FLko;Lkn;Lko;Lko;Lko;FI)V")
	public static void method3664(float arg0, class317 arg1, class316 arg2, class317 arg3, class317 arg4, class317 arg5, float arg6) {
		if (arg3.method5296(arg1)) {
			return;
		}
		class317 var7 = class317.method5294(0.0F, 0.0F, 0.0F);
		class317 var8 = class317.method5290(class317.method5377(arg3, arg1));
		var8.method5318(arg2);
		class317 var9 = class317.method5377(var8, var7);
		float var10 = var9.method5338();
		if (arg5.field3475 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.field3475) || var10 > 5120.0F) {
			arg1.method5334(arg3);
			arg4.method5370();
			return;
		}
		arg2.method5220();
		class317 var11 = class317.method5294(1.0F, 0.0F, 0.0F);
		class317 var12 = class317.method5294(0.0F, 1.0F, 0.0F);
		class317 var13 = class317.method5294(0.0F, 0.0F, 1.0F);
		var11.method5318(arg2);
		var12.method5318(arg2);
		var13.method5318(arg2);
		class317 var14 = class317.method5294(class317.method5306(var11, arg4), class317.method5306(var12, arg4), class317.method5306(var13, arg4));
		class317 var15 = class317.method5290(var14);
		class317 var16 = class317.method5294(arg5.field3475 * var9.field3475, arg5.field3476 * var9.field3476, arg5.field3477 * var9.field3477);
		var15.method5289(var16, arg0);
		var15.method5309(arg6);
		class317 var17 = class317.method5317(var11, var15.field3475);
		var17.method5289(var12, var15.field3476);
		var17.method5289(var13, var15.field3477);
		arg4.method5334(var17);
		if (var10 < 1.0F) {
			arg1.method5334(arg3);
			arg4.method5370();
		} else {
			arg1.method5299(class317.method5317(arg4, arg0));
		}
	}
}
