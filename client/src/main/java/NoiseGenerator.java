
import deob.ObfuscatedName;

@ObfuscatedName("ajj")
public class NoiseGenerator extends class818 {

	@ObfuscatedName("ajj.p")
	public short[] field10486;

	@ObfuscatedName("ajj.w")
	public short[] field10485;

	@ObfuscatedName("ajj.b")
	public byte[] field10487 = new byte[512];

	@ObfuscatedName("ajj.x")
	public int field10488 = 0;

	@ObfuscatedName("ajj.i")
	public int field10489 = 4;

	@ObfuscatedName("ajj.v")
	public int field10490 = 4;

	@ObfuscatedName("ajj.k")
	public int field10491 = 4;

	@ObfuscatedName("ajj.h")
	public int field10492 = 1638;

	@ObfuscatedName("ajj.r")
	public boolean field10493 = true;

	public NoiseGenerator() {
		super(0, true);
	}

	@ObfuscatedName("ajj.u(I[II)V")
	public void method16887(int arg0, int[] arg1) {
		int var3 = this.field10490 * Statics.field7041[arg0];
		if (this.field10491 == 1) {
			short var4 = this.field10486[0];
			int var5 = this.field10485[0] << 12;
			int var6 = this.field10490 * var5 >> 12;
			int var7 = this.field10489 * var5 >> 12;
			int var8 = var3 * var5 >> 12;
			int var9 = var8 >> 12;
			int var10 = var9 + 1;
			if (var10 >= var6) {
				var10 = 0;
			}
			int var11 = var8 & 0xFFF;
			int var12 = class290.field3290[var11];
			int var13 = this.field10487[var9 & 0xFF] & 0xFF;
			int var14 = this.field10487[var10 & 0xFF] & 0xFF;
			if (this.field10493) {
				for (int var15 = 0; var15 < Statics.field7038; var15++) {
					int var16 = this.field10489 * Statics.field7040[var15];
					int var17 = this.method16892(var5 * var16 >> 12, var11, var13, var14, var12, var7);
					int var18 = var4 * var17 >> 12;
					arg1[var15] = (var18 >> 1) + 2048;
				}
			} else {
				for (int var19 = 0; var19 < Statics.field7038; var19++) {
					int var20 = this.field10489 * Statics.field7040[var19];
					int var21 = this.method16892(var5 * var20 >> 12, var11, var13, var14, var12, var7);
					arg1[var19] = var4 * var21 >> 12;
				}
			}
			return;
		}
		short var22 = this.field10486[0];
		if (var22 > 8 || var22 < -8) {
			int var23 = this.field10485[0] << 12;
			int var24 = this.field10490 * var23 >> 12;
			int var25 = this.field10489 * var23 >> 12;
			int var26 = var3 * var23 >> 12;
			int var27 = var26 >> 12;
			int var28 = var27 + 1;
			if (var28 >= var24) {
				var28 = 0;
			}
			int var29 = var26 & 0xFFF;
			int var30 = class290.field3290[var29];
			int var31 = this.field10487[var27 & 0xFF] & 0xFF;
			int var32 = this.field10487[var28 & 0xFF] & 0xFF;
			for (int var33 = 0; var33 < Statics.field7038; var33++) {
				int var34 = this.field10489 * Statics.field7040[var33];
				int var35 = this.method16892(var23 * var34 >> 12, var29, var31, var32, var30, var25);
				arg1[var33] = var22 * var35 >> 12;
			}
		}
		for (int var36 = 1; var36 < this.field10491; var36++) {
			short var37 = this.field10486[var36];
			if (var37 > 8 || var37 < -8) {
				int var38 = this.field10485[var36] << 12;
				int var39 = this.field10490 * var38 >> 12;
				int var40 = this.field10489 * var38 >> 12;
				int var41 = var3 * var38 >> 12;
				int var42 = var41 >> 12;
				int var43 = var42 + 1;
				if (var43 >= var39) {
					var43 = 0;
				}
				int var44 = var41 & 0xFFF;
				int var45 = class290.field3290[var44];
				int var46 = this.field10487[var42 & 0xFF] & 0xFF;
				int var47 = this.field10487[var43 & 0xFF] & 0xFF;
				if (this.field10493 && this.field10491 - 1 == var36) {
					for (int var48 = 0; var48 < Statics.field7038; var48++) {
						int var49 = this.field10489 * Statics.field7040[var48];
						int var50 = this.method16892(var38 * var49 >> 12, var44, var46, var47, var45, var40);
						int var51 = (var37 * var50 >> 12) + arg1[var48];
						arg1[var48] = (var51 >> 1) + 2048;
					}
				} else {
					for (int var52 = 0; var52 < Statics.field7038; var52++) {
						int var53 = this.field10489 * Statics.field7040[var52];
						int var54 = this.method16892(var38 * var53 >> 12, var44, var46, var47, var45, var40);
						arg1[var52] += var37 * var54 >> 12;
					}
				}
			}
		}
	}

	@ObfuscatedName("ajj.j(IIIIIII)I")
	public int method16892(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg0 >> 12;
		int var8 = var7 + 1;
		if (var8 >= arg5) {
			var8 = 0;
		}
		int var9 = arg0 & 0xFFF;
		int var10 = var7 & 0xFF;
		int var11 = var8 & 0xFF;
		int var12 = var9 - 4096;
		int var13 = arg1 - 4096;
		int var14 = class290.field3290[var9];
		int var15 = this.field10487[arg2 + var10] & 0x3;
		int var16;
		if (var15 <= 1) {
			var16 = var15 == 0 ? arg1 + var9 : arg1 - var9;
		} else {
			var16 = var15 == 2 ? var9 - arg1 : -var9 - arg1;
		}
		int var17 = this.field10487[arg2 + var11] & 0x3;
		int var18;
		if (var17 <= 1) {
			var18 = var17 == 0 ? arg1 + var12 : arg1 - var12;
		} else {
			var18 = var17 == 2 ? var12 - arg1 : -var12 - arg1;
		}
		int var19 = ((var18 - var16) * var14 >> 12) + var16;
		int var20 = this.field10487[arg3 + var10] & 0x3;
		int var21;
		if (var20 <= 1) {
			var21 = var20 == 0 ? var9 + var13 : var13 - var9;
		} else {
			var21 = var20 == 2 ? var9 - var13 : -var9 - var13;
		}
		int var22 = this.field10487[arg3 + var11] & 0x3;
		int var23;
		if (var22 <= 1) {
			var23 = var22 == 0 ? var12 + var13 : var13 - var12;
		} else {
			var23 = var22 == 2 ? var12 - var13 : -var12 - var13;
		}
		int var24 = ((var23 - var21) * var14 >> 12) + var21;
		return ((var24 - var19) * arg4 >> 12) + var19;
	}

	@ObfuscatedName("ajj.a(B)V")
	public void method16890() {
		this.field10487 = class589.method12215(this.field10488);
		this.method16891();
		for (int var1 = this.field10491 - 1; var1 >= 1; var1--) {
			short var2 = this.field10486[var1];
			if (var2 > 8 || var2 < -8) {
				break;
			}
			this.field10491--;
		}
	}

	@ObfuscatedName("ajj.s(I)V")
	public void method16891() {
		if (this.field10492 > 0) {
			this.field10486 = new short[this.field10491];
			this.field10485 = new short[this.field10491];
			for (int var1 = 0; var1 < this.field10491; var1++) {
				this.field10486[var1] = (short) (Math.pow((double) ((float) this.field10492 / 4096.0F), (double) var1) * 4096.0D);
				this.field10485[var1] = (short) Math.pow(2.0D, (double) var1);
			}
		} else if (this.field10486 != null && this.field10491 == this.field10486.length) {
			this.field10485 = new short[this.field10491];
			for (int var2 = 0; var2 < this.field10491; var2++) {
				this.field10485[var2] = (short) Math.pow(2.0D, (double) var2);
			}
		}
	}

	@ObfuscatedName("adg.m(IIIIIIFZI)[[I")
	public static int[][] method15136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, boolean arg7) {
		int[][] var8 = new int[arg1][arg0];
		NoiseGenerator var9 = new NoiseGenerator();
		var9.field10493 = arg7;
		var9.field10489 = arg3;
		var9.field10490 = arg4;
		var9.field10491 = arg5;
		var9.field10492 = (int) (arg6 * 4096.0F);
		var9.method16890();
		class589.method12214(arg0, arg1);
		for (int var10 = 0; var10 < arg1; var10++) {
			var9.method16887(var10, var8[var10]);
		}
		return var8;
	}
}
