
import deob.ObfuscatedName;

@ObfuscatedName("pa")
public class class438 {

	public class438() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ar.u(FLko;Lkn;Lko;Lko;Lko;Lko;FFI)V")
	public static void method1697(float arg0, class317 arg1, class316 arg2, class317 arg3, class317 arg4, class317 arg5, class317 arg6, float arg7, float arg8) {
		if (arg3.method5296(arg1)) {
			return;
		}
		class317 var9 = class317.method5294(0.0F, 0.0F, 0.0F);
		class317 var10 = class317.method5290(class317.method5377(arg3, arg1));
		var10.method5318(arg2);
		class317 var11 = class317.method5377(var10, var9);
		float var12 = var11.method5338();
		if (arg7 > 0.0F) {
			arg5 = class317.method5290(arg5);
			arg5.method5357(var12 / arg7 * arg8);
		}
		if (arg5.field3475 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.field3475) || var12 > 5120.0F) {
			arg1.method5334(arg3);
			arg4.method5370();
			return;
		}
		arg2.method5220();
		class317 var13 = class317.method5294(1.0F, 0.0F, 0.0F);
		class317 var14 = class317.method5294(0.0F, 1.0F, 0.0F);
		class317 var15 = class317.method5294(0.0F, 0.0F, 1.0F);
		var13.method5318(arg2);
		var14.method5318(arg2);
		var15.method5318(arg2);
		class317 var16 = class317.method5294(class317.method5306(var13, arg4), class317.method5306(var14, arg4), class317.method5306(var15, arg4));
		class317 var17 = class317.method5290(var16);
		var17.method5310();
		class317 var18 = class317.method5315(class317.method5312(var17, var17), class317.method5317(arg5, 2.0F));
		class317 var19 = class317.method5290(var11);
		var19.method5310();
		class317 var20 = class317.method5290(var16);
		if (var18.field3475 > var19.field3475) {
			if (var11.field3475 < 0.0F) {
				var20.field3475 += arg5.field3475 * arg0;
				if (var20.field3475 > 0.0F) {
					var20.field3475 = 0.0F;
				}
			} else {
				var20.field3475 -= arg5.field3475 * arg0;
				if (var20.field3475 < 0.0F) {
					var20.field3475 = 0.0F;
				}
			}
		} else if (var17.field3475 < arg6.field3475) {
			if (var11.field3475 < 0.0F) {
				var20.field3475 -= arg5.field3475 * arg0;
				if (var20.field3475 < -arg6.field3475) {
					var20.field3475 = -arg6.field3475;
				}
			} else {
				var20.field3475 += arg5.field3475 * arg0;
				if (var20.field3475 > arg6.field3475) {
					var20.field3475 = arg6.field3475;
				}
			}
		}
		if (var18.field3476 > var19.field3476) {
			if (var11.field3476 < 0.0F) {
				var20.field3476 += arg5.field3476 * arg0;
				if (var20.field3476 > 0.0F) {
					var20.field3476 = 0.0F;
				}
			} else {
				var20.field3476 -= arg5.field3476 * arg0;
				if (var20.field3476 < 0.0F) {
					var20.field3476 = 0.0F;
				}
			}
		} else if (var17.field3476 < arg6.field3476) {
			if (var11.field3476 < 0.0F) {
				var20.field3476 -= arg5.field3476 * arg0;
				if (var20.field3476 < -arg6.field3476) {
					var20.field3476 = -arg6.field3476;
				}
			} else {
				var20.field3476 += arg5.field3476 * arg0;
				if (var20.field3476 > arg6.field3476) {
					var20.field3476 = arg6.field3476;
				}
			}
		}
		if (var18.field3477 > var19.field3477) {
			if (var11.field3477 < 0.0F) {
				var20.field3477 += arg5.field3477 * arg0;
				if (var20.field3477 > 0.0F) {
					var20.field3477 = 0.0F;
				}
			} else {
				var20.field3477 -= arg5.field3477 * arg0;
				if (var20.field3477 < 0.0F) {
					var20.field3477 = 0.0F;
				}
			}
		} else if (var17.field3477 < arg6.field3477) {
			if (var11.field3477 < 0.0F) {
				var20.field3477 -= arg5.field3477 * arg0;
				if (var20.field3477 < -arg6.field3477) {
					var20.field3477 = -arg6.field3477;
				}
			} else {
				var20.field3477 += arg5.field3477 * arg0;
				if (var20.field3477 > arg6.field3477) {
					var20.field3477 = arg6.field3477;
				}
			}
		}
		class317 var21 = class317.method5317(var13, var20.field3475);
		var21.method5289(var14, var20.field3476);
		var21.method5289(var15, var20.field3477);
		arg4.method5321(var21, 0.8F);
		if (var12 < 10.0F) {
			arg1.method5334(arg3);
			arg4.method5370();
		} else {
			arg1.method5299(class317.method5317(arg4, arg0));
		}
		var17.method5291();
		var20.method5291();
		var19.method5291();
	}
}
