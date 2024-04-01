package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("om")
public class class408 {

	@ObfuscatedName("om.f")
	public static IterableMap field4272 = new IterableMap(16);

	@ObfuscatedName("om.d")
	public static int field4273 = (int) (Math.random() * 11.0D) - 5;

	@ObfuscatedName("om.z")
	public static int field4274 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("om.q")
	public static int[] field4277 = new int[1];

	@ObfuscatedName("om.p")
	public static byte[] field4271 = new byte[1];

	@ObfuscatedName("om.i")
	public static class547 field4301 = new class547();

	public class408() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("om.u(Lls;Lrd;Lux;Ltz;Lph;Lwd;Lug;)V")
	public static void method7080(class334 arg0, class484 arg1, class563 arg2, class541 arg3, class444 arg4, class609 arg5, class567 arg6) {
		Statics.field4264 = arg0;
		Statics.field4278 = arg1;
		Statics.field4265 = arg2;
		Statics.field4266 = arg3;
		Statics.field4290 = arg4;
		Statics.field4268 = arg5;
		Statics.field4299 = arg6;
		field4272.method11925();
		int var7 = Statics.field4264.method5688("details");
		int[] var8 = Statics.field4264.method5683(var7);
		if (var8 != null) {
			for (int var9 = 0; var9 < var8.length; var9++) {
				class951 var10 = class951.method13263(Statics.field4264, var7, var8[var9]);
				field4272.pushNode(var10, (long) var10.field10370);
			}
		}
		class482.method8092(true, false);
	}

	@ObfuscatedName("om.j()V")
	public static void method7106() {
		Statics.field4288 = new byte[Statics.field4285 * Statics.field4282];
		Statics.field4287 = new byte[Statics.field4285 * Statics.field4282];
		Statics.field4291 = new byte[Statics.field4285 * Statics.field4282];
		Statics.field4293 = new Object[Statics.field4285 * Statics.field4282];
		Statics.field4294 = new byte[Statics.field4285 * Statics.field4282];
		Statics.field4295 = new ArrayList[3][Statics.field4285 >> 6][Statics.field4282 >> 6];
		Statics.field4267 = new int[Statics.field4278.field5105 + 1];
	}

	@ObfuscatedName("om.a()V")
	public static void method7082() {
		Statics.field4288 = null;
		Statics.field4289 = null;
		Statics.field4280 = null;
		Statics.field4287 = null;
		Statics.field4291 = null;
		Statics.field4293 = null;
		Statics.field4294 = null;
		Statics.field4295 = null;
		Statics.field4267 = null;
	}

	@ObfuscatedName("om.s(I)V")
	public static void method7122(int arg0) {
		Statics.field4292 = (class951) field4272.method11923((long) arg0);
	}

	@ObfuscatedName("om.c(II)Lajo;")
	public static class951 method7084(int arg0, int arg1) {
		for (class951 var2 = (class951) field4272.method11928(); var2 != null; var2 = (class951) field4272.method11929()) {
			if (var2.field10361 && var2.method16717(arg0, arg1)) {
				return var2;
			}
		}
		return null;
	}

	@ObfuscatedName("om.m(I)Lajo;")
	public static class951 method7117(int arg0) {
		return (class951) field4272.method11923((long) arg0);
	}

	@ObfuscatedName("om.t(II)Ltv;")
	public static class552 method7086(int arg0, int arg1) {
		class552 var2 = new class552();
		for (class951 var3 = (class951) field4272.method11928(); var3 != null; var3 = (class951) field4272.method11929()) {
			if (var3.field10361 && var3.method16717(arg0, arg1)) {
				var2.method11728(var3);
			}
		}
		return var2;
	}

	@ObfuscatedName("om.l(Lma;II)V")
	public static void method7087(class16 arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < Statics.field4278.field5105; var3++) {
			Statics.field4267[var3 + 1] = method7088(arg0, var3, arg1, arg2);
		}
	}

	@ObfuscatedName("om.f(Lma;III)I")
	public static int method7088(class16 arg0, int arg1, int arg2, int arg3) {
		class483 var4 = Statics.field4278.method8503(arg1);
		if (var4 == null) {
			return 0;
		}
		int var5 = var4.field5092;
		if (var5 >= 0 && arg0.method889(var5).field1250) {
			var5 = -1;
		}
		int var9;
		if (var4.field5091 >= 0) {
			int var6 = var4.field5091;
			int var7 = (var6 & 0x7F) + arg3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 127) {
				var7 = 127;
			}
			int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
			var9 = Statics.field5083[class482.method3444(class482.method4740(var8, 96)) & 0xFFFF] | 0xFF000000;
		} else if (var5 >= 0) {
			var9 = Statics.field5083[class482.method3444(class482.method4740(arg0.method889(var5).field1260, 96)) & 0xFFFF] | 0xFF000000;
		} else if (var4.field5094 == -1) {
			var9 = 0;
		} else {
			int var10 = var4.field5094;
			int var11 = (var10 & 0x7F) + arg3;
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 > 127) {
				var11 = 127;
			}
			int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
			var9 = Statics.field5083[class482.method3444(class482.method4740(var12, 96)) & 0xFFFF] | 0xFF000000;
		}
		return var9;
	}

	@ObfuscatedName("om.d(Lra;II)V")
	public static void method7120(class14 arg0, int arg1, int arg2) {
		Packet var3 = new Packet(Statics.field4264.method5645(Statics.field4292.field10362, "area"));
		int var4 = var3.g1();
		int[] var5 = new int[var4];
		for (int var6 = 0; var6 < var4; var6++) {
			var5[var6] = var3.g1();
		}
		int var7 = var3.g1();
		int[] var8 = new int[var7];
		for (int var9 = 0; var9 < var7; var9++) {
			var8[var9] = var3.g1();
		}
		while (true) {
			while (var3.pos < var3.data.length) {
				if (var3.g1() == 0) {
					int var10 = var3.g1();
					int var11 = var3.g1();
					for (int var12 = 0; var12 < 64; var12++) {
						for (int var13 = 0; var13 < 64; var13++) {
							int var14 = var10 * 64 + var12 - Statics.field4283;
							int var15 = var11 * 64 + var13 - Statics.field4284;
							method7085(arg0, var3, var10, var11, var14, var15, var5, var8);
						}
					}
				} else {
					int var16 = var3.g1();
					int var17 = var3.g1();
					int var18 = var3.g1();
					int var19 = var3.g1();
					for (int var20 = 0; var20 < 8; var20++) {
						for (int var21 = 0; var21 < 8; var21++) {
							int var22 = var16 * 64 + var18 * 8 + var20 - Statics.field4283;
							int var23 = var17 * 64 + var19 * 8 + var21 - Statics.field4284;
							method7085(arg0, var3, var16, var17, var22, var23, var5, var8);
						}
					}
				}
			}
			Object var24 = null;
			Statics.field4289 = new byte[Statics.field4285 * Statics.field4282];
			Statics.field4280 = new short[Statics.field4285 * Statics.field4282];
			for (int var25 = 0; var25 < 3; var25++) {
				byte[] var26 = new byte[Statics.field4285 * Statics.field4282];
				for (int var27 = 0; var27 < Statics.field4295[var25].length; var27++) {
					for (int var28 = 0; var28 < Statics.field4295[var25][0].length; var28++) {
						ArrayList var29 = Statics.field4295[var25][var27][var28];
						if (var29 != null) {
							Iterator var30 = var29.iterator();
							while (var30.hasNext()) {
								class405 var31 = (class405) var30.next();
								var26[(var28 * 64 + var31.field4247) * Statics.field4285 + var27 * 64 + var31.field4248] = (byte) var31.field4250;
							}
						}
					}
				}
				method7092(var26, Statics.field4289, Statics.field4280, arg1, arg2);
				for (int var32 = 0; var32 < Statics.field4295[var25].length; var32++) {
					for (int var33 = 0; var33 < Statics.field4295[var25][0].length; var33++) {
						ArrayList var34 = Statics.field4295[var25][var32][var33];
						if (var34 != null) {
							Iterator var35 = var34.iterator();
							while (var35.hasNext()) {
								class405 var36 = (class405) var35.next();
								int var37 = (var33 * 64 + var36.field4247) * Statics.field4285 + var32 * 64 + var36.field4248;
								var36.field4250 = (Statics.field4289[var37] & 0xFF) << 16 | Statics.field4280[var37] & 0xFFFF;
								if (var36.field4250 != 0) {
									var36.field4250 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method7092(Statics.field4288, Statics.field4289, Statics.field4280, arg1, arg2);
			Statics.field4288 = null;
			method7091();
			return;
		}
	}

	@ObfuscatedName("om.z(Lra;Laet;IIII[I[I)V")
	public static void method7085(class14 arg0, Packet arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
		int var8 = arg1.g1();
		if ((var8 & 0x1) == 0) {
			boolean var9 = (var8 & 0x2) == 0;
			int var10 = var8 >> 2 & 0x3F;
			if (var10 == 62) {
				return;
			}
			int var11;
			if (var10 == 63) {
				var11 = arg1.g1();
			} else if (var9) {
				var11 = arg6[var10];
			} else {
				var11 = arg7[var10];
			}
			if (var9) {
				Statics.field4288[Statics.field4285 * arg5 + arg4] = (byte) var11;
				Statics.field4287[Statics.field4285 * arg5 + arg4] = 0;
			} else {
				Statics.field4287[Statics.field4285 * arg5 + arg4] = (byte) var11;
				Statics.field4291[Statics.field4285 * arg5 + arg4] = 0;
				Statics.field4288[Statics.field4285 * arg5 + arg4] = arg1.method15238();
			}
			return;
		}
		int var12 = (var8 >> 1 & 0x3) + 1;
		boolean var13 = (var8 & 0x8) != 0;
		boolean var14 = (var8 & 0x10) != 0;
		for (int var15 = 0; var15 < var12; var15++) {
			int var16 = arg1.g1();
			int var17 = 0;
			int var18 = 0;
			if (var13) {
				var17 = arg1.g1();
				var18 = arg1.g1();
			}
			int var19 = 0;
			if (var14) {
				var19 = arg1.g1();
			}
			if (var15 == 0) {
				Statics.field4288[Statics.field4285 * arg5 + arg4] = (byte) var16;
				Statics.field4287[Statics.field4285 * arg5 + arg4] = (byte) var17;
				Statics.field4291[Statics.field4285 * arg5 + arg4] = (byte) var18;
				if (var19 == 1) {
					Statics.field4293[Statics.field4285 * arg5 + arg4] = Integer.valueOf(arg1.method15411());
					Statics.field4294[Statics.field4285 * arg5 + arg4] = arg1.method15238();
				} else if (var19 > 1) {
					int[] var20 = new int[var19];
					byte[] var21 = new byte[var19];
					for (int var22 = 0; var22 < var19; var22++) {
						var20[var22] = arg1.method15411();
						var21[var22] = arg1.method15238();
					}
					Statics.field4293[Statics.field4285 * arg5 + arg4] = new class805(var20, var21);
				}
			} else {
				int[] var23 = null;
				byte[] var24 = null;
				if (var19 > 0) {
					var23 = new int[var19];
					var24 = new byte[var19];
					for (int var25 = 0; var25 < var19; var25++) {
						var23[var25] = arg1.method15411();
						var24[var25] = arg1.method15238();
					}
				}
				if (Statics.field4295[var15 - 1][arg2 - (Statics.field4283 >> 6)][arg3 - (Statics.field4284 >> 6)] == null) {
					Statics.field4295[var15 - 1][arg2 - (Statics.field4283 >> 6)][arg3 - (Statics.field4284 >> 6)] = new ArrayList();
				}
				class405 var26 = new class405(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
				Statics.field4295[var15 - 1][arg2 - (Statics.field4283 >> 6)][arg3 - (Statics.field4284 >> 6)].add(var26);
			}
		}
	}

	@ObfuscatedName("om.n()V")
	public static void method7091() {
		for (int var0 = 0; var0 < Statics.field4285; var0++) {
			for (int var1 = 0; var1 < Statics.field4282; var1++) {
				Object var2 = Statics.field4293[Statics.field4285 * var1 + var0];
				if (var2 != null) {
					if (var2 instanceof class805) {
						class805 var3 = (class805) var2;
						if (var3 != null) {
							for (int var4 = 0; var4 < var3.field9562.length; var4++) {
								class540 var5 = Statics.field4266.method11471(var3.field9562[var4]);
								int var6 = var5.field6495;
								if (var5.field6534 != null) {
									class540 var7 = var5.method11431(Statics.field4299);
									if (var7 != null) {
										var6 = var7.field6495;
									}
								}
								if (var6 != -1) {
									class806 var8 = new class806(var6);
									var8.field9566 = var0;
									var8.field9567 = var1;
									field4301.method11558(var8);
								}
							}
						}
					} else {
						Integer var9 = (Integer) var2;
						class540 var10 = Statics.field4266.method11471(var9);
						int var11 = var10.field6495;
						if (var10.field6534 != null) {
							class540 var12 = var10.method11431(Statics.field4299);
							if (var12 != null) {
								var11 = var12.field6495;
							}
						}
						if (var11 != -1) {
							class806 var13 = new class806(var11);
							var13.field9566 = var0;
							var13.field9567 = var1;
							field4301.method11558(var13);
						}
					}
				}
			}
		}
		for (int var14 = 0; var14 < 3; var14++) {
			for (int var15 = 0; var15 < Statics.field4295[0].length; var15++) {
				label89: for (int var16 = 0; var16 < Statics.field4295[0][0].length; var16++) {
					ArrayList var17 = Statics.field4295[var14][var15][var16];
					if (var17 != null) {
						Iterator var18 = var17.iterator();
						while (true) {
							class405 var19;
							do {
								if (!var18.hasNext()) {
									continue label89;
								}
								var19 = (class405) var18.next();
							} while (var19.field4251 == null);
							for (int var20 = 0; var20 < var19.field4251.length; var20++) {
								class540 var21 = Statics.field4266.method11471(var19.field4251[var20]);
								int var22 = var21.field6495;
								if (var21.field6534 != null) {
									class540 var23 = var21.method11431(Statics.field4299);
									if (var23 != null) {
										var22 = var23.field6495;
									}
								}
								if (var22 != -1) {
									class806 var24 = new class806(var22);
									var24.field9566 = ((Statics.field4283 >> 6) + var15) * 64 + var19.field4248 - Statics.field4283;
									var24.field9567 = ((Statics.field4284 >> 6) + var16) * 64 + var19.field4247 - Statics.field4284;
									field4301.method11558(var24);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("om.o([B[B[SII)V")
	public static void method7092(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
		int[] var5 = new int[Statics.field4282];
		int[] var6 = new int[Statics.field4282];
		int[] var7 = new int[Statics.field4282];
		int[] var8 = new int[Statics.field4282];
		int[] var9 = new int[Statics.field4282];
		for (int var10 = -5; var10 < Statics.field4285; var10++) {
			int var11 = var10 + 5;
			int var12 = var10 - 5;
			for (int var13 = 0; var13 < Statics.field4282; var13++) {
				int var10002;
				if (var11 < Statics.field4285) {
					int var14 = arg0[Statics.field4285 * var13 + var11] & 0xFF;
					if (var14 > 0) {
						class564 var15 = Statics.field4265.method11895(var14 - 1);
						var5[var13] += var15.field6718;
						var6[var13] += var15.field6714;
						var7[var13] += var15.field6720;
						var8[var13] += var15.field6721;
						var10002 = var9[var13]++;
					}
				}
				if (var12 >= 0) {
					int var16 = arg0[Statics.field4285 * var13 + var12] & 0xFF;
					if (var16 > 0) {
						class564 var17 = Statics.field4265.method11895(var16 - 1);
						var5[var13] -= var17.field6718;
						var6[var13] -= var17.field6714;
						var7[var13] -= var17.field6720;
						var8[var13] -= var17.field6721;
						var10002 = var9[var13]--;
					}
				}
			}
			if (var10 >= 0) {
				int var18 = 0;
				int var19 = 0;
				int var20 = 0;
				int var21 = 0;
				int var22 = 0;
				for (int var23 = -5; var23 < Statics.field4282; var23++) {
					int var24 = var23 + 5;
					if (var24 < Statics.field4282) {
						var18 += var5[var24];
						var19 += var6[var24];
						var20 += var7[var24];
						var21 += var8[var24];
						var22 += var9[var24];
					}
					int var25 = var23 - 5;
					if (var25 >= 0) {
						var18 -= var5[var25];
						var19 -= var6[var25];
						var20 -= var7[var25];
						var21 -= var8[var25];
						var22 -= var9[var25];
					}
					if (var23 >= 0 && var22 > 0) {
						if ((arg0[Statics.field4285 * var23 + var10] & 0xFF) == 0) {
							int var26 = Statics.field4285 * var23 + var10;
							arg1[var26] = 0;
							arg2[var26] = 0;
						} else {
							int var27 = var21 == 0 ? 0 : class482.method6323(var18 * 256 / var21, var19 / var22, var20 / var22);
							int var28 = (var27 & 0x7F) + arg4;
							if (var28 < 0) {
								var28 = 0;
							} else if (var28 > 127) {
								var28 = 127;
							}
							int var29 = (arg3 + var27 & 0xFC00) + (var27 & 0x380) + var28;
							int var30 = Statics.field4285 * var23 + var10;
							int var31 = Statics.field5083[class482.method3444(Statics.method14030(var29, 96)) & 0xFFFF];
							arg1[var30] = (byte) (var31 >> 16 & 0xFF);
							arg2[var30] = (short) (var31 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("om.q()V")
	public static void method7093() {
		int[] var0 = new int[3];
		for (int var1 = 0; var1 < Statics.field4281.field4255; var1++) {
			boolean var2 = Statics.field4292.method16705(Statics.field4281.field4254[var1] >> 28 & 0x3, Statics.field4281.field4254[var1] >> 14 & 0x3FFF, Statics.field4281.field4254[var1] & 0x3FFF, var0);
			if (var2) {
				class806 var3 = new class806(Statics.field4281.field4253[var1]);
				var3.field9566 = var0[1] - Statics.field4283;
				var3.field9567 = var0[2] - Statics.field4284;
				field4301.method11558(var3);
			}
		}
	}

	@ObfuscatedName("om.p(IIIIIIII)V")
	public static void method7094(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Statics.field4296 = arg0 - Statics.field4283;
		Statics.field4297 = arg1 - Statics.field4284;
		Statics.field4298 = arg2 - Statics.field4283;
		Statics.field4302 = arg3 - Statics.field4284;
		Statics.field4300 = arg4;
		Statics.field4286 = arg5;
		Statics.field4270 = arg6;
		Statics.field4303 = arg7;
	}

	@ObfuscatedName("om.w(Lra;)V")
	public static void method7095(class14 arg0) {
		int var1 = Statics.field4298 - Statics.field4296;
		int var2 = Statics.field4297 - Statics.field4302;
		int var3 = (Statics.field4270 - Statics.field4300 << 16) / var1;
		int var4 = (Statics.field4303 - Statics.field4286 << 16) / var2;
		method7090(arg0, var3, var4, 0, 0);
	}

	@ObfuscatedName("om.b(Lra;IIII)V")
	public static void method7090(class14 arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = Statics.field4298 - Statics.field4296;
		int var6 = Statics.field4297 - Statics.field4302;
		if (Statics.field4298 < Statics.field4285) {
			var5++;
		}
		if (Statics.field4297 < Statics.field4282) {
			var6++;
		}
		for (int var7 = 0; var7 < var5; var7++) {
			int var8 = (arg1 * var7 + arg3 >> 16) + Statics.field4300;
			int var9 = ((var7 + 1) * arg1 + arg3 >> 16) + Statics.field4300;
			int var10 = var9 - var8;
			if (var10 > 0) {
				int var11 = Statics.field4296 + var7;
				if (var11 >= 0 && var11 < Statics.field4285) {
					for (int var12 = 0; var12 < var6; var12++) {
						int var13 = Statics.field4303 - ((var12 + 1) * arg2 + arg4 >> 16);
						int var14 = Statics.field4303 - (arg2 * var12 + arg4 >> 16);
						int var15 = var14 - var13;
						if (var15 > 0) {
							int var16 = Statics.field4302 + var12;
							int var17 = Statics.field4285 * var16 + var11;
							int var18 = 0;
							int var19 = 0;
							Object var20 = null;
							if (var16 >= 0 && var16 < Statics.field4282) {
								var18 = (Statics.field4289[var17] & 0xFF) << 16 | Statics.field4280[var17] & 0xFFFF;
								if (var18 != 0) {
									var18 |= 0xFF000000;
								}
								var19 = Statics.field4287[var17] & 0xFF;
								var20 = Statics.field4293[var17];
							}
							if (var18 == 0 && var19 == 0 && var20 == null) {
								int var21;
								if (Statics.field4292.field10366 != -1) {
									var21 = Statics.field4292.field10366 | 0xFF000000;
								} else if ((Statics.field4297 + var12 & 0x4) == (Statics.field4296 + var7 & 0x4)) {
									var21 = Statics.field4267[Statics.field4278.field5108 + 1];
								} else {
									var21 = -11840664;
								}
								if (var21 == 0) {
									var21 = -16777216;
								}
								arg0.method489(var8, var13, var10, var15, var21, 0);
							} else if (var20 == null) {
								method7079(arg0, var8, var13, var10, var15, var18, var19, Statics.field4291[var17], null, null, true);
							} else if (var20 instanceof class805) {
								class805 var22 = (class805) var20;
								if (var22 != null) {
									method7079(arg0, var8, var13, var10, var15, var18, var19, Statics.field4291[var17], var22.field9562, var22.field9563, true);
								}
							} else {
								Integer var23 = (Integer) var20;
								field4277[0] = var23;
								field4271[0] = Statics.field4294[var17];
								method7079(arg0, var8, var13, var10, var15, var18, var19, Statics.field4291[var17], field4277, field4271, true);
							}
						}
					}
				} else {
					for (int var24 = 0; var24 < var6; var24++) {
						int var25 = Statics.field4303 - ((var24 + 1) * arg2 + arg4 >> 16);
						int var26 = Statics.field4303 - (arg2 * var24 + arg4 >> 16);
						int var27 = var26 - var25;
						int var28;
						if (Statics.field4292.field10366 != -1) {
							var28 = Statics.field4292.field10366 | 0xFF000000;
						} else if ((Statics.field4297 + var24 & 0x4) == (Statics.field4296 + var7 & 0x4)) {
							var28 = Statics.field4267[Statics.field4278.field5108 + 1];
						} else {
							var28 = -11840664;
						}
						if (var28 == 0) {
							var28 = -16777216;
						}
						arg0.method489(var8, var25, var10, var27, var28, 0);
					}
				}
			}
		}
		for (int var29 = -16; var29 < var5 + 16; var29++) {
			int var30 = (arg1 * var29 + arg3 >> 16) + Statics.field4300;
			int var31 = ((var29 + 1) * arg1 + arg3 >> 16) + Statics.field4300;
			int var32 = var31 - var30;
			if (var32 > 0) {
				int var33 = Statics.field4296 + var29;
				if (var33 >= 0 && var33 < Statics.field4285) {
					for (int var34 = -16; var34 < var6 + 16; var34++) {
						int var35 = Statics.field4303 - ((var34 + 1) * arg2 + arg4 >> 16);
						int var36 = Statics.field4303 - (arg2 * var34 + arg4 >> 16);
						int var37 = var36 - var35;
						if (var37 > 0) {
							int var38 = Statics.field4302 + var34;
							if (var38 >= 0 && var38 < Statics.field4282) {
								Object var39 = Statics.field4293[Statics.field4285 * var38 + var33];
								if (var39 == null) {
									method7098(arg0, var30, var35, var32, var37, null, null);
								} else if (var39 instanceof class805) {
									class805 var40 = (class805) var39;
									if (var40 != null) {
										method7098(arg0, var30, var35, var32, var37, var40.field9562, var40.field9563);
									}
								} else {
									Integer var41 = (Integer) var39;
									field4277[0] = var41;
									field4271[0] = Statics.field4294[Statics.field4285 * var38 + var33];
									method7098(arg0, var30, var35, var32, var37, field4277, field4271);
								}
							}
						}
					}
				}
			}
		}
		int var42 = Statics.field4296 >> 6;
		int var43 = Statics.field4302 >> 6;
		if (var42 < 0) {
			var42 = 0;
		}
		if (var43 < 0) {
			var43 = 0;
		}
		int var44 = Statics.field4298 >> 6;
		int var45 = Statics.field4297 >> 6;
		if (var44 >= Statics.field4295[0].length) {
			var44 = Statics.field4295[0].length - 1;
		}
		if (var45 >= Statics.field4295[0][0].length) {
			var45 = Statics.field4295[0][0].length - 1;
		}
		for (int var46 = 0; var46 < 3; var46++) {
			for (int var47 = var42; var47 <= var44; var47++) {
				for (int var48 = var43; var48 <= var45; var48++) {
					ArrayList var49 = Statics.field4295[var46][var47][var48];
					if (var49 != null) {
						int var50 = ((Statics.field4283 >> 6) + var47) * 64;
						int var51 = ((Statics.field4284 >> 6) + var48) * 64;
						Iterator var52 = var49.iterator();
						while (var52.hasNext()) {
							class405 var53 = (class405) var52.next();
							int var54 = var53.field4248 + var50 - Statics.field4283 - Statics.field4296;
							int var55 = var53.field4247 + var51 - Statics.field4284 - Statics.field4302;
							int var56 = (arg1 * var54 + arg3 >> 16) + Statics.field4300;
							int var57 = ((var54 + 1) * arg1 + arg3 >> 16) + Statics.field4300;
							int var58 = Statics.field4303 - ((var55 + 1) * arg2 + arg4 >> 16);
							int var59 = Statics.field4303 - (arg2 * var55 + arg4 >> 16);
							method7079(arg0, var56, var58, var57 - var56, var59 - var58, var53.field4250, var53.field4249 & 0xFF, var53.field4246, var53.field4251, var53.field4252, false);
						}
					}
				}
			}
			for (int var60 = var42; var60 <= var44; var60++) {
				for (int var61 = var43; var61 <= var45; var61++) {
					ArrayList var62 = Statics.field4295[var46][var60][var61];
					if (var62 != null) {
						int var63 = ((Statics.field4283 >> 6) + var60) * 64;
						int var64 = ((Statics.field4284 >> 6) + var61) * 64;
						Iterator var65 = var62.iterator();
						while (var65.hasNext()) {
							class405 var66 = (class405) var65.next();
							int var67 = var66.field4248 + var63 - Statics.field4283 - Statics.field4296;
							int var68 = var66.field4247 + var64 - Statics.field4284 - Statics.field4302;
							int var69 = (arg1 * var67 + arg3 >> 16) + Statics.field4300;
							int var70 = ((var67 + 1) * arg1 + arg3 >> 16) + Statics.field4300;
							int var71 = Statics.field4303 - ((var68 + 1) * arg2 + arg4 >> 16);
							int var72 = Statics.field4303 - (arg2 * var68 + arg4 >> 16);
							method7098(arg0, var69, var71, var70 - var69, var72 - var71, var66.field4251, var66.field4252);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("om.x(Lra;IIIIIII[I[BZ)V")
	public static void method7079(class14 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9, boolean arg10) {
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method489(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				int var11 = arg7 & 0x3F;
				if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
					int var13 = Statics.field4267[arg6];
					if (arg10 || var13 != 0) {
						arg0.method489(arg1, arg2, arg3, arg4, var13, 0);
					}
				} else {
					int var12 = arg10 ? 0 : 1;
					class404.method4630(arg0, Statics.field4275, Statics.field4276, arg1, arg2, arg5, Statics.field4267[arg6], arg3, arg4, var11, arg7 >> 6 & 0x3, var12);
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		int var14;
		if (arg3 == 1) {
			var14 = arg1;
		} else {
			var14 = arg1 + arg3 - 1;
		}
		int var15;
		if (arg4 == 1) {
			var15 = arg2;
		} else {
			var15 = arg2 + arg4 - 1;
		}
		for (int var16 = 0; var16 < arg8.length; var16++) {
			int var17 = arg9[var16] & 0x3F;
			if (class542.field6591.field6590 == var17 || class542.field6569.field6590 == var17 || class542.field6570.field6590 == var17 || class542.field6567.field6590 == var17) {
				class540 var18 = Statics.field4266.method11471(arg8[var16]);
				if (var18.field6508 == -1) {
					int var19 = -3355444;
					if (var18.field6493 == 1) {
						var19 = -3407872;
					}
					int var20 = arg9[var16] >> 6 & 0x3;
					if (class542.field6591.field6590 == var17) {
						if (var20 == 0) {
							arg0.method494(arg1, arg2, arg4, var19, 0);
						} else if (var20 == 1) {
							arg0.method493(arg1, arg2, arg3, var19, 0);
						} else if (var20 == 2) {
							arg0.method494(var14, arg2, arg4, var19, 0);
						} else {
							arg0.method493(arg1, var15, arg3, var19, 0);
						}
					} else if (class542.field6569.field6590 == var17) {
						if (var20 == 0) {
							arg0.method494(arg1, arg2, arg4, -1, 0);
							arg0.method493(arg1, arg2, arg3, var19, 0);
						} else if (var20 == 1) {
							arg0.method494(var14, arg2, arg4, -1, 0);
							arg0.method493(arg1, arg2, arg3, var19, 0);
						} else if (var20 == 2) {
							arg0.method494(var14, arg2, arg4, -1, 0);
							arg0.method493(arg1, var15, arg3, var19, 0);
						} else {
							arg0.method494(arg1, arg2, arg4, -1, 0);
							arg0.method493(arg1, var15, arg3, var19, 0);
						}
					} else if (class542.field6570.field6590 == var17) {
						if (var20 == 0) {
							arg0.method493(arg1, arg2, 1, var19, 0);
						} else if (var20 == 1) {
							arg0.method493(var14, arg2, 1, var19, 0);
						} else if (var20 == 2) {
							arg0.method493(var14, var15, 1, var19, 0);
						} else {
							arg0.method493(arg1, var15, 1, var19, 0);
						}
					} else if (class542.field6567.field6590 == var17) {
						if (var20 == 0 || var20 == 2) {
							for (int var22 = 0; var22 < arg4; var22++) {
								arg0.method493(arg1 + var22, var15 - var22, 1, var19, 0);
							}
						} else {
							for (int var21 = 0; var21 < arg4; var21++) {
								arg0.method493(arg1 + var21, arg2 + var21, 1, var19, 0);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("om.i(Lra;IIII[I[B)V")
	public static void method7098(class14 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (int var7 = 0; var7 < arg5.length; var7++) {
			class540 var8 = Statics.field4266.method11471(arg5[var7]);
			int var9 = var8.field6508;
			if (var9 != -1) {
				class608 var10 = Statics.field4268.method12491(var9);
				class118 var11 = var10.method12484(arg0, var8.field6509 ? arg6[var7] >> 6 & 0x3 : 0, var8.field6511 ? var8.field6486 : false);
				if (var11 != null) {
					int var12 = arg3 * var11.method1042() >> 2;
					int var13 = arg4 * var11.method1047() >> 2;
					if (var10.field7195) {
						int var14 = var8.field6489;
						int var15 = var8.field6503;
						if ((arg6[var7] >> 6 & 0x1) == 1) {
							int var16 = var14;
							var14 = var15;
							var15 = var16;
						}
						var12 = arg3 * var14;
						var13 = arg4 * var15;
					}
					if (var12 != 0 && var13 != 0) {
						if (var10.field7194 == 0) {
							var11.method2513(arg1, arg2 - var13 + arg4, var12, var13);
						} else {
							var11.method2502(arg1, arg2 - var13 + arg4, var12, var13, 0, var10.field7194 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("om.v(Lra;)Ltq;")
	public static class547 method7099(class14 arg0) {
		int var1 = Statics.field4298 - Statics.field4296;
		int var2 = Statics.field4297 - Statics.field4302;
		int var3 = (Statics.field4270 - Statics.field4300 << 16) / var1;
		int var4 = (Statics.field4303 - Statics.field4286 << 16) / var2;
		return method7100(arg0, var3, var4, 0, 0);
	}

	@ObfuscatedName("om.k(Lra;IIII)Ltq;")
	public static class547 method7100(class14 arg0, int arg1, int arg2, int arg3, int arg4) {
		for (class806 var5 = (class806) field4301.method11563(); var5 != null; var5 = (class806) field4301.method11567()) {
			method7101(arg0, var5, arg1, arg2, arg3, arg4);
		}
		return field4301;
	}

	@ObfuscatedName("om.h(Lra;Ladw;IIII)V")
	public static void method7101(class14 arg0, class806 arg1, int arg2, int arg3, int arg4, int arg5) {
		arg1.field9568 = ((arg1.field9566 - Statics.field4296) * arg2 + arg4 >> 16) + Statics.field4300;
		arg1.field9569 = Statics.field4303 - ((arg1.field9567 - Statics.field4302) * arg3 + arg5 >> 16);
	}

	@ObfuscatedName("om.r(Lra;Ladw;Lpw;)V")
	public static void method7102(class14 arg0, class806 arg1, class443 arg2) {
		if (arg2.field4788 == null) {
			return;
		}
		int[] var3 = new int[arg2.field4788.length];
		for (int var4 = 0; var4 < var3.length / 2; var4++) {
			int var5 = arg1.field9566 + arg2.field4788[var4 * 2];
			int var6 = arg1.field9567 + arg2.field4788[var4 * 2 + 1];
			var3[var4 * 2] = (Statics.field4270 - Statics.field4300) * (var5 - Statics.field4296) / (Statics.field4298 - Statics.field4296) + Statics.field4300;
			var3[var4 * 2 + 1] = Statics.field4303 - (Statics.field4303 - Statics.field4286) * (var6 - Statics.field4302) / (Statics.field4297 - Statics.field4302);
		}
		class133.method2697(arg0, var3, arg2.field4785);
		if (arg2.field4795 <= 0) {
			for (int var22 = 0; var22 < var3.length / 2 - 1; var22++) {
				arg0.method487(var3[var22 * 2], var3[var22 * 2 + 1], var3[(var22 + 1) * 2], var3[(var22 + 1) * 2 + 1], arg2.field4800[arg2.field4762[var22] & 0xFF]);
			}
			arg0.method487(var3[var3.length - 2], var3[var3.length - 1], var3[0], var3[1], arg2.field4800[arg2.field4762[arg2.field4762.length - 1] & 0xFF]);
			return;
		}
		for (int var7 = 0; var7 < var3.length / 2 - 1; var7++) {
			int var8 = var3[var7 * 2];
			int var9 = var3[var7 * 2 + 1];
			int var10 = var3[(var7 + 1) * 2];
			int var11 = var3[(var7 + 1) * 2 + 1];
			if (var10 < var8) {
				int var12 = var8;
				int var13 = var9;
				var8 = var10;
				var9 = var11;
				var10 = var12;
				var11 = var13;
			} else if (var8 == var10 && var11 < var9) {
				int var14 = var9;
				var9 = var11;
				var11 = var14;
			}
			arg0.method497(var8, var9, var10, var11, arg2.field4800[arg2.field4762[var7] & 0xFF], 1, arg2.field4795, arg2.field4796, arg2.field4794);
		}
		int var15 = var3[var3.length - 2];
		int var16 = var3[var3.length - 1];
		int var17 = var3[0];
		int var18 = var3[1];
		if (var17 < var15) {
			int var19 = var15;
			int var20 = var16;
			var15 = var17;
			var16 = var18;
			var17 = var19;
			var18 = var20;
		} else if (var15 == var17 && var18 < var16) {
			int var21 = var16;
			var16 = var18;
			var18 = var21;
		}
		arg0.method497(var15, var16, var17, var18, arg2.field4800[arg2.field4762[arg2.field4762.length - 1] & 0xFF], 1, arg2.field4795, arg2.field4796, arg2.field4794);
	}
}
