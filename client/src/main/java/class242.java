
import deob.ObfuscatedName;
import java.nio.ByteBuffer;

@ObfuscatedName("hw")
public class class242 {

	@ObfuscatedName("hw.u")
	public class228 field2506;

	@ObfuscatedName("hw.j")
	public class228 field2517;

	@ObfuscatedName("hw.a")
	public class230 field2505;

	@ObfuscatedName("hw.s")
	public class258 field2516;

	@ObfuscatedName("hw.c")
	public final int field2507 = 64;

	@ObfuscatedName("hw.m")
	public final int field2508 = 768;

	@ObfuscatedName("hw.t")
	public final int field2509 = 1600;

	@ObfuscatedName("hw.l")
	public final int field2504 = class595.method2540(1600);

	@ObfuscatedName("hw.f")
	public final int field2511 = 64;

	@ObfuscatedName("hw.d")
	public int[] field2503 = new int[8191];

	@ObfuscatedName("hw.z")
	public int[] field2513 = new int[1600];

	@ObfuscatedName("hw.n")
	public int[] field2510 = new int[64];

	@ObfuscatedName("hw.o")
	public class914[][] field2515 = new class914[1600][64];

	@ObfuscatedName("hw.q")
	public class914[][] field2512 = new class914[64][768];

	@ObfuscatedName("hw.p")
	public int field2518 = 0;

	public class242(class683 arg0) {
		this.field2505 = arg0.method13585(new class243[] { new class243(new class237[] { class237.field2495, class237.field2488, class237.field2483 }), new class243(class237.field2480) });
		this.field2506 = arg0.method13584(true);
		this.field2517 = arg0.method13584(false);
		this.field2517.method4269(393168, 12);
		this.field2516 = arg0.method13797(false);
		this.field2516.method4535(49146);
		ByteBuffer var2 = arg0.field8244;
		var2.clear();
		for (int var3 = 0; var3 < 8191; var3++) {
			int var4 = var3 * 4;
			var2.putShort((short) var4);
			var2.putShort((short) (var4 + 1));
			var2.putShort((short) (var4 + 2));
			var2.putShort((short) (var4 + 2));
			var2.putShort((short) (var4 + 3));
			var2.putShort((short) var4);
		}
		this.field2516.method4452(0, var2.position(), arg0.field8245);
		var2.clear();
		for (int var5 = 0; var5 < 8191; var5++) {
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
			var2.putFloat(0.0F);
			var2.putFloat(-1.0F);
			var2.putFloat(0.0F);
		}
		this.field2517.method4452(0, var2.position(), arg0.field8245);
	}

	@ObfuscatedName("hw.u(Lyk;)V")
	public void method4468(class683 arg0) {
		this.field2506.method4269(786336, 24);
	}

	@ObfuscatedName("hw.j()V")
	public void method4466() {
		this.field2506.method168();
	}

	@ObfuscatedName("hw.a(Lyk;Ldp;)V")
	public void method4478(class683 arg0, class128 arg1) {
		arg0.method526(false);
		Statics.field2514 = arg0.field8319;
		float var3 = arg0.field8258.field3480[2];
		float var4 = arg0.field8258.field3480[6];
		float var5 = arg0.field8258.field3480[10];
		float var6 = arg0.field8258.field3480[14];
		int var7 = 0;
		int var8 = Integer.MAX_VALUE;
		int var9 = 0;
		class766 var10 = arg1.field1311.field6653;
		for (class766 var11 = var10.field9265; var11 != var10; var11 = var11.field9265) {
			class914 var12 = (class914) var11;
			int var13 = (int) ((float) (var12.field10147 >> 12) * var5 + (float) (var12.field10146 >> 12) * var4 + (float) (var12.field10145 >> 12) * var3 + var6);
			if (var13 > var9) {
				var9 = var13;
			}
			if (var13 < var8) {
				var8 = var13;
			}
			this.field2503[var7++] = var13;
		}
		int var14 = var9 - var8;
		int var15;
		if (var14 + 2 > 1600) {
			var15 = class595.method2540(var14) + 1 - this.field2504;
			var14 = (var14 >> var15) + 2;
		} else {
			var15 = 0;
			var14 += 2;
		}
		arg0.method13588(this.field2516);
		class201 var16 = arg0.field8314;
		var16.method3875(class320.field3479);
		var16.field2273.method5453();
		var16.field2272 = -1;
		this.method4480(arg0, var10, var14, var8, var15, var16);
		if (Statics.field2514 != arg0.field8319) {
			arg0.method529(Statics.field2514);
		}
		arg0.method526(true);
	}

	@ObfuscatedName("hw.s(Lyk;Lacl;IIILft;)V")
	public void method4480(class683 arg0, class766 arg1, int arg2, int arg3, int arg4, class201 arg5) {
		class766 var7 = arg1.field9265;
		int var8 = 0;
		int var9 = -2;
		boolean var10 = true;
		boolean var11 = true;
		while (arg1 != var7) {
			this.field2518 = 0;
			for (int var12 = 0; var12 < arg2; var12++) {
				this.field2513[var12] = 0;
			}
			for (int var13 = 0; var13 < 64; var13++) {
				this.field2510[var13] = 0;
			}
			while (arg1 != var7) {
				class914 var14 = (class914) var7;
				if (var11) {
					var9 = var14.field10149;
					var10 = var14.field10150;
					var11 = false;
				}
				if (var8 > 0 && (var14.field10149 != var9 || var14.field10150 != var10)) {
					var11 = true;
					break;
				}
				this.method4464(this.field2503[var8++] - arg3 >> arg4, var14);
				var7 = var7.field9265;
			}
			arg5.field2271 = var9 >= 0 ? arg0.field8336.method4359(var9) : null;
			if (var10 && Statics.field2514 != arg0.field8319) {
				arg0.method529(Statics.field2514);
			} else if (arg0.field8319 != 1.0F) {
				arg0.method529(1.0F);
			}
			this.method4469(arg0, arg2);
		}
	}

	@ObfuscatedName("hw.c(ILahl;)V")
	public void method4464(int arg0, class914 arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.field2513[arg0] < 64) {
			this.field2515[arg0][this.field2513[arg0]++] = arg1;
			return;
		}
		if (this.field2513[arg0] == 64) {
			if (this.field2518 == 64) {
				return;
			}
			this.field2513[arg0] += this.field2518++ + 1;
		}
		this.field2512[this.field2513[arg0] - 64 - 1][this.field2510[this.field2513[arg0] - 64 - 1]++] = arg1;
	}

	@ObfuscatedName("hw.m(Lyk;I)V")
	public void method4469(class683 arg0, int arg1) {
		int var3 = 0;
		class320 var4 = arg0.field8258;
		float var5 = var4.field3480[0];
		float var6 = var4.field3480[4];
		float var7 = var4.field3480[8];
		float var8 = var4.field3480[1];
		float var9 = var4.field3480[5];
		float var10 = var4.field3480[9];
		float var11 = var5 + var8;
		float var12 = var6 + var9;
		float var13 = var7 + var10;
		float var14 = var5 - var8;
		float var15 = var6 - var9;
		float var16 = var7 - var10;
		float var17 = var8 - var5;
		float var18 = var9 - var6;
		float var19 = var10 - var7;
		ByteBuffer var20 = arg0.field8244;
		var20.clear();
		for (int var21 = arg1 - 1; var21 >= 0; var21--) {
			int var22 = this.field2513[var21] > 64 ? 64 : this.field2513[var21];
			if (var22 > 0) {
				for (int var23 = var22 - 1; var23 >= 0; var23--) {
					class914 var24 = this.field2515[var21][var23];
					int var25 = var24.field10144;
					byte var26 = (byte) (var25 >> 16);
					byte var27 = (byte) (var25 >> 8);
					byte var28 = (byte) var25;
					byte var29 = (byte) (var25 >>> 24);
					if (arg0.field8348 == 0) {
						byte var30 = var26;
						var26 = var28;
						var28 = var30;
					}
					float var31 = (float) (var24.field10145 >> 12);
					float var32 = (float) (var24.field10146 >> 12);
					float var33 = (float) (var24.field10147 >> 12);
					int var34 = var24.field10148 >> 12;
					var20.putFloat((float) -var34 * var11 + var31);
					var20.putFloat((float) -var34 * var12 + var32);
					var20.putFloat((float) -var34 * var13 + var33);
					var20.put(var26);
					var20.put(var27);
					var20.put(var28);
					var20.put(var29);
					var20.putFloat(0.0F);
					var20.putFloat(0.0F);
					var20.putFloat((float) var34 * var17 + var31);
					var20.putFloat((float) var34 * var18 + var32);
					var20.putFloat((float) var34 * var19 + var33);
					var20.put(var26);
					var20.put(var27);
					var20.put(var28);
					var20.put(var29);
					var20.putFloat(0.0F);
					var20.putFloat(1.0F);
					var20.putFloat((float) var34 * var11 + var31);
					var20.putFloat((float) var34 * var12 + var32);
					var20.putFloat((float) var34 * var13 + var33);
					var20.put(var26);
					var20.put(var27);
					var20.put(var28);
					var20.put(var29);
					var20.putFloat(1.0F);
					var20.putFloat(1.0F);
					var20.putFloat((float) var34 * var14 + var31);
					var20.putFloat((float) var34 * var15 + var32);
					var20.putFloat((float) var34 * var16 + var33);
					var20.put(var26);
					var20.put(var27);
					var20.put(var28);
					var20.put(var29);
					var20.putFloat(1.0F);
					var20.putFloat(0.0F);
					var3++;
				}
				if (this.field2513[var21] > 64) {
					int var35 = this.field2513[var21] - 64 - 1;
					for (int var36 = this.field2510[var35] - 1; var36 >= 0; var36--) {
						class914 var37 = this.field2512[var35][var36];
						int var38 = var37.field10144;
						byte var39 = (byte) (var38 >> 16);
						byte var40 = (byte) (var38 >> 8);
						byte var41 = (byte) var38;
						byte var42 = (byte) (var38 >>> 24);
						if (arg0.field8348 == 0) {
							byte var43 = var39;
							var39 = var41;
							var41 = var43;
						}
						float var44 = (float) (var37.field10145 >> 12);
						float var45 = (float) (var37.field10146 >> 12);
						float var46 = (float) (var37.field10147 >> 12);
						int var47 = var37.field10148 >> 12;
						var20.putFloat((float) -var47 * var11 + var44);
						var20.putFloat((float) -var47 * var12 + var45);
						var20.putFloat((float) -var47 * var13 + var46);
						var20.put(var39);
						var20.put(var40);
						var20.put(var41);
						var20.put(var42);
						var20.putFloat(0.0F);
						var20.putFloat(0.0F);
						var20.putFloat((float) var47 * var17 + var44);
						var20.putFloat((float) var47 * var18 + var45);
						var20.putFloat((float) var47 * var19 + var46);
						var20.put(var39);
						var20.put(var40);
						var20.put(var41);
						var20.put(var42);
						var20.putFloat(0.0F);
						var20.putFloat(1.0F);
						var20.putFloat((float) var47 * var11 + var44);
						var20.putFloat((float) var47 * var12 + var45);
						var20.putFloat((float) var47 * var13 + var46);
						var20.put(var39);
						var20.put(var40);
						var20.put(var41);
						var20.put(var42);
						var20.putFloat(1.0F);
						var20.putFloat(1.0F);
						var20.putFloat((float) var47 * var14 + var44);
						var20.putFloat((float) var47 * var15 + var45);
						var20.putFloat((float) var47 * var16 + var46);
						var20.put(var39);
						var20.put(var40);
						var20.put(var41);
						var20.put(var42);
						var20.putFloat(1.0F);
						var20.putFloat(0.0F);
						var3++;
					}
				}
			}
		}
		this.field2506.method4452(0, var20.position(), arg0.field8245);
		arg0.method13587(0, this.field2506);
		arg0.method13587(1, this.field2517);
		arg0.method13688(this.field2505);
		class201 var48 = arg0.field8314;
		var48.method3871(var3);
	}
}
