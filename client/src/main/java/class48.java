
import deob.ObfuscatedName;

@ObfuscatedName("y")
public class class48 {

	@ObfuscatedName("y.u")
	public static WeightedCache field654 = new WeightedCache(32);

	public class48() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("p.u(Lra;IIIIILqa;IIIILtt;I)Lqa;")
	public static Model method1417(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Model arg6, int arg7, int arg8, int arg9, int arg10, AnimationNode arg11) {
		if (arg6 == null) {
			return null;
		}
		int var12 = 2055;
		if (arg11 != null) {
			int var13 = var12 | arg11.method11779();
			var12 = var13 & 0xFFFFFDFF;
		}
		long var14 = ((long) arg8 << 48) + ((long) arg7 << 32) + (long) ((arg10 << 24) + (arg9 << 16) + arg5);
		WeightedCache var16 = field654;
		Model var17;
		synchronized (field654) {
			var17 = (Model) field654.method7916(var14);
		}
		if (var17 == null || arg0.method519(var17.method329(), var12) != 0) {
			if (var17 != null) {
				var12 = arg0.method520(var12, var17.method329());
			}
			byte var19;
			if (arg5 == 1) {
				var19 = 9;
			} else if (arg5 == 2) {
				var19 = 12;
			} else if (arg5 == 3) {
				var19 = 15;
			} else if (arg5 == 4) {
				var19 = 18;
			} else {
				var19 = 21;
			}
			byte var20 = 3;
			int[] var21 = new int[] { 64, 96, 128 };
			ModelUnlit var22 = new ModelUnlit(var19 * var20 + 1, var19 * var20 * 2 - var19, 0);
			int var23 = var22.method2625(0, 0, 0);
			int[][] var24 = new int[var20][var19];
			for (int var25 = 0; var25 < var20; var25++) {
				int var26 = var21[var25];
				int var27 = var21[var25];
				for (int var28 = 0; var28 < var19; var28++) {
					int var29 = (var28 << 14) / var19;
					int var30 = Trig1.field3439[var29] * var26 >> 14;
					int var31 = Trig1.field3447[var29] * var27 >> 14;
					var24[var25][var28] = var22.method2625(var30, 0, var31);
				}
			}
			for (int var32 = 0; var32 < var20; var32++) {
				int var33 = (var32 * 256 + 128) / var20;
				int var34 = 256 - var33;
				byte var35 = (byte) (arg9 * var34 + arg10 * var33 >> 8);
				short var36 = (short) (((arg7 & 0x7F) * var34 + (arg8 & 0x7F) * var33 & 0x7F00) + ((arg7 & 0x380) * var34 + (arg8 & 0x380) * var33 & 0x38000) + ((arg7 & 0xFC00) * var34 + (arg8 & 0xFC00) * var33 & 0xFC0000) >> 8);
				for (int var37 = 0; var37 < var19; var37++) {
					if (var32 == 0) {
						var22.method2626(var23, var24[0][(var37 + 1) % var19], var24[0][var37], (byte) 1, (byte) -1, var36, var35, (short) -1);
					} else {
						var22.method2626(var24[var32 - 1][var37], var24[var32 - 1][(var37 + 1) % var19], var24[var32][(var37 + 1) % var19], (byte) 1, (byte) -1, var36, var35, (short) -1);
						var22.method2626(var24[var32 - 1][var37], var24[var32][(var37 + 1) % var19], var24[var32][var37], (byte) 1, (byte) -1, var36, var35, (short) -1);
					}
				}
			}
			var17 = arg0.method625(var22, var12, Statics.field653, 64, 768);
			WeightedCache var38 = field654;
			synchronized (field654) {
				field654.method7937(var17, var14);
			}
		}
		int var40 = arg6.method358();
		int var41 = arg6.method277();
		int var42 = arg6.method280();
		int var43 = arg6.method281();
		Model var44;
		if (arg11 == null) {
			var44 = var17.method295((byte) 3, var12, true);
			var44.method245(var41 - var40 >> 1, 128, var43 - var42 >> 1);
			var44.method353(var40 + var41 >> 1, 0, var42 + var43 >> 1);
		} else {
			var44 = var17.method295((byte) 3, var12, true);
			var44.method245(var41 - var40 >> 1, 128, var43 - var42 >> 1);
			var44.method353(var40 + var41 >> 1, 0, var42 + var43 >> 1);
			arg11.method11782(var44);
		}
		if (arg2 != 0) {
			var44.method397(arg2);
		}
		if (arg3 != 0) {
			var44.method284(arg3);
		}
		if (arg4 != 0) {
			var44.method353(0, arg4, 0);
		}
		return var44;
	}

	@ObfuscatedName("ob.j(II)V")
	public static void method7280(int arg0) {
		Statics.field653 = arg0;
		WeightedCache var1 = field654;
		synchronized (field654) {
			field654.method7922();
		}
	}

	@ObfuscatedName("gi.a(B)V")
	public static void method4036() {
		WeightedCache var0 = field654;
		synchronized (field654) {
			field654.method7922();
		}
	}

	@ObfuscatedName("qx.s(IB)V")
	public static void method8061(int arg0) {
		WeightedCache var1 = field654;
		synchronized (field654) {
			field654.method7921(arg0);
		}
	}

	@ObfuscatedName("lp.c(B)V")
	public static void method6026() {
		WeightedCache var0 = field654;
		synchronized (field654) {
			field654.method7925();
		}
	}
}
