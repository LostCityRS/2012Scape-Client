
import deob.ObfuscatedName;
import java.util.Arrays;
import java.util.Random;

@ObfuscatedName("mu")
public class class380 {

	@ObfuscatedName("mu.u")
	public class371 field4074;

	@ObfuscatedName("mu.j")
	public class371 field4070;

	@ObfuscatedName("mu.a")
	public class371 field4069;

	@ObfuscatedName("mu.s")
	public class371 field4086;

	@ObfuscatedName("mu.c")
	public class371 field4072;

	@ObfuscatedName("mu.m")
	public class371 field4091;

	@ObfuscatedName("mu.t")
	public class371 field4071;

	@ObfuscatedName("mu.l")
	public class371 field4088;

	@ObfuscatedName("mu.f")
	public int[] field4082 = new int[] { 0, 0, 0, 0, 0 };

	@ObfuscatedName("mu.d")
	public int[] field4076 = new int[] { 0, 0, 0, 0, 0 };

	@ObfuscatedName("mu.z")
	public int[] field4077 = new int[] { 0, 0, 0, 0, 0 };

	@ObfuscatedName("mu.n")
	public int field4078 = 0;

	@ObfuscatedName("mu.o")
	public int field4079 = 100;

	@ObfuscatedName("mu.q")
	public class381 field4080;

	@ObfuscatedName("mu.p")
	public class371 field4081;

	@ObfuscatedName("mu.w")
	public int field4075 = 500;

	@ObfuscatedName("mu.b")
	public int field4083 = 0;

	@ObfuscatedName("mu.x")
	public static int[] field4084;

	@ObfuscatedName("mu.i")
	public static int[] field4085 = new int[32768];

	@ObfuscatedName("mu.v")
	public static int[] field4073;

	@ObfuscatedName("mu.h")
	public static int[] field4068;

	@ObfuscatedName("mu.r")
	public static int[] field4089;

	@ObfuscatedName("mu.g")
	public static int[] field4090;

	@ObfuscatedName("mu.y")
	public static int[] field4067;

	@ObfuscatedName("mu.e")
	public static int[] field4092;

	static {
		Random var0 = new Random(0L);
		for (int var1 = 0; var1 < 32768; var1++) {
			field4085[var1] = (var0.nextInt() & 0x2) - 1;
		}
		field4073 = new int[32768];
		for (int var2 = 0; var2 < 32768; var2++) {
			field4073[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
		}
		field4084 = new int[220500];
		field4068 = new int[5];
		field4089 = new int[5];
		field4090 = new int[5];
		field4067 = new int[5];
		field4092 = new int[5];
	}

	@ObfuscatedName("mu.u(II)[I")
	public final int[] method6598(int arg0, int arg1) {
		Arrays.fill(field4084, 0, arg0, 0);
		if (arg1 < 10) {
			return field4084;
		}
		double var3 = (double) arg0 / ((double) arg1 + 0.0D);
		this.field4074.method6472();
		this.field4070.method6472();
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		if (this.field4069 != null) {
			this.field4069.method6472();
			this.field4086.method6472();
			var5 = (int) ((double) (this.field4069.field4001 - this.field4069.field4000) * 32.768D / var3);
			var6 = (int) ((double) this.field4069.field4000 * 32.768D / var3);
		}
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		if (this.field4072 != null) {
			this.field4072.method6472();
			this.field4091.method6472();
			var8 = (int) ((double) (this.field4072.field4001 - this.field4072.field4000) * 32.768D / var3);
			var9 = (int) ((double) this.field4072.field4000 * 32.768D / var3);
		}
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.field4082[var11] != 0) {
				field4068[var11] = 0;
				field4089[var11] = (int) ((double) this.field4077[var11] * var3);
				field4090[var11] = (this.field4082[var11] << 14) / 100;
				field4067[var11] = (int) ((double) (this.field4074.field4001 - this.field4074.field4000) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4076[var11]) / var3);
				field4092[var11] = (int) ((double) this.field4074.field4000 * 32.768D / var3);
			}
		}
		for (int var12 = 0; var12 < arg0; var12++) {
			int var13 = this.field4074.method6476(arg0);
			int var14 = this.field4070.method6476(arg0);
			if (this.field4069 != null) {
				int var15 = this.field4069.method6476(arg0);
				int var16 = this.field4086.method6476(arg0);
				var13 += this.method6599(var7, var16, this.field4069.field3998) >> 1;
				var7 += (var5 * var15 >> 16) + var6;
			}
			if (this.field4072 != null) {
				int var17 = this.field4072.method6476(arg0);
				int var18 = this.field4091.method6476(arg0);
				var14 = var14 * ((this.method6599(var10, var18, this.field4072.field3998) >> 1) + 32768) >> 15;
				var10 += (var8 * var17 >> 16) + var9;
			}
			for (int var19 = 0; var19 < 5; var19++) {
				if (this.field4082[var19] != 0) {
					int var20 = field4089[var19] + var12;
					if (var20 < arg0) {
						field4084[var20] += this.method6599(field4068[var19], field4090[var19] * var14 >> 15, this.field4074.field3998);
						field4068[var19] += (field4067[var19] * var13 >> 16) + field4092[var19];
					}
				}
			}
		}
		if (this.field4071 != null) {
			this.field4071.method6472();
			this.field4088.method6472();
			int var21 = 0;
			boolean var22 = false;
			boolean var23 = true;
			for (int var24 = 0; var24 < arg0; var24++) {
				int var25 = this.field4071.method6476(arg0);
				int var26 = this.field4088.method6476(arg0);
				int var27;
				if (var23) {
					var27 = ((this.field4071.field4001 - this.field4071.field4000) * var25 >> 8) + this.field4071.field4000;
				} else {
					var27 = ((this.field4071.field4001 - this.field4071.field4000) * var26 >> 8) + this.field4071.field4000;
				}
				var21 += 256;
				if (var21 >= var27) {
					var21 = 0;
					var23 = !var23;
				}
				if (var23) {
					field4084[var24] = 0;
				}
			}
		}
		if (this.field4078 > 0 && this.field4079 > 0) {
			int var28 = (int) ((double) this.field4078 * var3);
			for (int var29 = var28; var29 < arg0; var29++) {
				field4084[var29] += field4084[var29 - var28] * this.field4079 / 100;
			}
		}
		if (this.field4080.field4097[0] > 0 || this.field4080.field4097[1] > 0) {
			this.field4081.method6472();
			int var30 = this.field4081.method6476(arg0 + 1);
			int var31 = this.field4080.method6610(0, (float) var30 / 65536.0F);
			int var32 = this.field4080.method6610(1, (float) var30 / 65536.0F);
			if (arg0 >= var31 + var32) {
				int var33 = 0;
				int var34 = var32;
				if (var32 > arg0 - var31) {
					var34 = arg0 - var31;
				}
				while (var33 < var34) {
					int var35 = (int) ((long) field4084[var31 + var33] * (long) Statics.field4093 >> 16);
					for (int var36 = 0; var36 < var31; var36++) {
						var35 += (int) ((long) field4084[var31 + var33 - 1 - var36] * (long) class381.field4101[0][var36] >> 16);
					}
					for (int var37 = 0; var37 < var33; var37++) {
						var35 -= (int) ((long) field4084[var33 - 1 - var37] * (long) class381.field4101[1][var37] >> 16);
					}
					field4084[var33] = var35;
					var30 = this.field4081.method6476(arg0 + 1);
					var33++;
				}
				int var38 = 128;
				while (true) {
					if (var38 > arg0 - var31) {
						var38 = arg0 - var31;
					}
					while (var33 < var38) {
						int var39 = (int) ((long) field4084[var31 + var33] * (long) Statics.field4093 >> 16);
						for (int var40 = 0; var40 < var31; var40++) {
							var39 += (int) ((long) field4084[var31 + var33 - 1 - var40] * (long) class381.field4101[0][var40] >> 16);
						}
						for (int var41 = 0; var41 < var32; var41++) {
							var39 -= (int) ((long) field4084[var33 - 1 - var41] * (long) class381.field4101[1][var41] >> 16);
						}
						field4084[var33] = var39;
						var30 = this.field4081.method6476(arg0 + 1);
						var33++;
					}
					if (var33 >= arg0 - var31) {
						while (var33 < arg0) {
							int var42 = 0;
							for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
								var42 += (int) ((long) field4084[var31 + var33 - 1 - var43] * (long) class381.field4101[0][var43] >> 16);
							}
							for (int var44 = 0; var44 < var32; var44++) {
								var42 -= (int) ((long) field4084[var33 - 1 - var44] * (long) class381.field4101[1][var44] >> 16);
							}
							field4084[var33] = var42;
							this.field4081.method6476(arg0 + 1);
							var33++;
						}
						break;
					}
					var31 = this.field4080.method6610(0, (float) var30 / 65536.0F);
					var32 = this.field4080.method6610(1, (float) var30 / 65536.0F);
					var38 += 128;
				}
			}
		}
		for (int var46 = 0; var46 < arg0; var46++) {
			if (field4084[var46] < -32768) {
				field4084[var46] = -32768;
			}
			if (field4084[var46] > 32767) {
				field4084[var46] = 32767;
			}
		}
		return field4084;
	}

	@ObfuscatedName("mu.j(III)I")
	public final int method6599(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return field4073[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return field4085[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("mu.a(Laet;)V")
	public final void method6600(Packet arg0) {
		this.field4074 = new class371();
		this.field4074.method6470(arg0);
		this.field4070 = new class371();
		this.field4070.method6470(arg0);
		int var2 = arg0.method15220();
		if (var2 != 0) {
			arg0.field9626--;
			this.field4069 = new class371();
			this.field4069.method6470(arg0);
			this.field4086 = new class371();
			this.field4086.method6470(arg0);
		}
		int var3 = arg0.method15220();
		if (var3 != 0) {
			arg0.field9626--;
			this.field4072 = new class371();
			this.field4072.method6470(arg0);
			this.field4091 = new class371();
			this.field4091.method6470(arg0);
		}
		int var4 = arg0.method15220();
		if (var4 != 0) {
			arg0.field9626--;
			this.field4071 = new class371();
			this.field4071.method6470(arg0);
			this.field4088 = new class371();
			this.field4088.method6470(arg0);
		}
		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method15277();
			if (var6 == 0) {
				break;
			}
			this.field4082[var5] = var6;
			this.field4076[var5] = arg0.method15254();
			this.field4077[var5] = arg0.method15277();
		}
		this.field4078 = arg0.method15277();
		this.field4079 = arg0.method15277();
		this.field4075 = arg0.method15239();
		this.field4083 = arg0.method15239();
		this.field4080 = new class381();
		this.field4081 = new class371();
		this.field4080.method6623(arg0, this.field4081);
	}
}
