package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pt")
public class class437 {

	public class437() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("pd.u(FLko;Lko;Lko;Lko;Lko;FFB)V")
	public static void method7675(float arg0, class317 arg1, class317 arg2, class317 arg3, class317 arg4, class317 arg5, float arg6, float arg7) {
		if (arg2.method5296(arg1)) {
			return;
		}
		class317 var8 = class317.method5377(arg2, arg1);
		float var9 = var8.method5338();
		if (arg6 > 0.0F) {
			arg4 = class317.method5290(arg4);
			arg4.method5357(var9 / arg6 * arg7);
		}
		if (arg4.field3475 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.field3475) || var9 > 5120.0F) {
			arg1.method5334(arg2);
			arg3.method5370();
			return;
		}
		class317 var10 = class317.method5290(arg3);
		var10.method5310();
		class317 var11 = class317.method5315(var10, arg4);
		class317 var12 = class317.method5312(var10, var11);
		class317 var13 = class317.method5290(arg3);
		class317 var14 = class317.method5290(var8);
		var14.method5310();
		if (var12.field3475 > var14.field3475) {
			if (var8.field3475 < 0.0F) {
				var13.field3475 += arg4.field3475 * arg0;
				if (var13.field3475 > 0.0F) {
					var13.field3475 = 0.0F;
				}
			} else {
				var13.field3475 -= arg4.field3475 * arg0;
				if (var13.field3475 < 0.0F) {
					var13.field3475 = 0.0F;
				}
			}
		} else if (var10.field3475 < arg5.field3475) {
			if (var8.field3475 < 0.0F) {
				var13.field3475 -= arg4.field3475 * arg0;
				if (var13.field3475 < -arg5.field3475) {
					var13.field3475 = -arg5.field3475;
				}
			} else {
				var13.field3475 += arg4.field3475 * arg0;
				if (var13.field3475 > arg5.field3475) {
					var13.field3475 = arg5.field3475;
				}
			}
		}
		if (var12.field3476 > var14.field3476) {
			if (var8.field3476 < 0.0F) {
				var13.field3476 += arg4.field3476 * arg0;
				if (var13.field3476 > 0.0F) {
					var13.field3476 = 0.0F;
				}
			} else {
				var13.field3476 -= arg4.field3476 * arg0;
				if (var13.field3476 < 0.0F) {
					var13.field3476 = 0.0F;
				}
			}
		} else if (var10.field3476 < arg5.field3476) {
			if (var8.field3476 < 0.0F) {
				var13.field3476 -= arg4.field3476 * arg0;
				if (var13.field3476 < -arg5.field3476) {
					var13.field3476 = -arg5.field3476;
				}
			} else {
				var13.field3476 += arg4.field3476 * arg0;
				if (var13.field3476 > arg5.field3476) {
					var13.field3476 = arg5.field3476;
				}
			}
		}
		if (var12.field3477 > var14.field3477) {
			if (var8.field3477 < 0.0F) {
				var13.field3477 += arg4.field3477 * arg0;
				if (var13.field3477 > 0.0F) {
					var13.field3477 = 0.0F;
				}
			} else {
				var13.field3477 -= arg4.field3477 * arg0;
				if (var13.field3477 < 0.0F) {
					var13.field3477 = 0.0F;
				}
			}
		} else if (var10.field3477 < arg5.field3477) {
			if (var8.field3477 < 0.0F) {
				var13.field3477 -= arg4.field3477 * arg0;
				if (var13.field3477 < -arg5.field3477) {
					var13.field3477 = -arg5.field3477;
				}
			} else {
				var13.field3477 += arg4.field3477 * arg0;
				if (var13.field3477 > arg5.field3477) {
					var13.field3477 = arg5.field3477;
				}
			}
		}
		arg3.method5321(var13, 0.8F);
		if (var9 < 10.0F && arg3.method5338() < 10.0F) {
			arg1.method5334(arg2);
			arg3.method5370();
		} else {
			arg1.method5299(class317.method5317(arg3, arg0));
		}
		var10.method5291();
		var13.method5291();
		var14.method5291();
	}
}
