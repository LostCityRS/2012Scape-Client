
import deob.ObfuscatedName;

@ObfuscatedName("yo")
public class class667 extends class118 {

	@ObfuscatedName("yo.u")
	public final GpuToolkit field7637;

	@ObfuscatedName("yo.j")
	public final class239 field7639;

	@ObfuscatedName("yo.a")
	public final class136 field7636;

	@ObfuscatedName("yo.s")
	public final int field7646;

	@ObfuscatedName("yo.c")
	public final int field7638;

	@ObfuscatedName("yo.m")
	public boolean field7643;

	@ObfuscatedName("yo.t")
	public int field7640;

	@ObfuscatedName("yo.l")
	public int field7641;

	@ObfuscatedName("yo.f")
	public int field7642;

	@ObfuscatedName("yo.d")
	public int field7634;

	@ObfuscatedName("yo.z")
	public final boolean field7644;

	@ObfuscatedName("yo.n")
	public final boolean field7645;

	@ObfuscatedName("yo.o")
	public final boolean field7635;

	@ObfuscatedName("yo.q")
	public final boolean field7647;

	public class667(GpuToolkit arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		this.field7643 = false;
		this.field7640 = 0;
		this.field7641 = 0;
		this.field7642 = 0;
		this.field7634 = 0;
		this.field7637 = arg0;
		this.field7646 = arg1;
		this.field7638 = arg2;
		if (arg4) {
			class257 var6 = arg0.method13542(arg3 ? class124.field1296 : class124.field1298, class139.field1501, arg1, arg2);
			this.field7636 = var6.method4534(0);
			this.field7639 = var6;
		} else {
			this.field7639 = arg0.method13550(arg3 ? class124.field1296 : class124.field1298, class139.field1501, arg1, arg2);
			this.field7636 = null;
		}
		this.field7639.method4412(true, true);
		this.field7644 = this.field7639.method4409() != arg1;
		this.field7645 = this.field7639.method4449() != arg2;
		this.field7635 = !this.field7644 && this.field7639.method4408();
		this.field7647 = !this.field7645 && this.field7639.method4408();
		this.field7637.method13739(12);
	}

	public class667(GpuToolkit arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
		this.field7643 = false;
		this.field7640 = 0;
		this.field7641 = 0;
		this.field7642 = 0;
		this.field7634 = 0;
		this.field7637 = arg0;
		this.field7646 = arg1;
		this.field7638 = arg2;
		this.field7636 = null;
		this.field7639 = arg0.method13552(arg1, arg2, false, arg3, arg4, arg5);
		this.field7639.method4412(true, true);
		this.field7644 = this.field7639.method4409() != arg1;
		this.field7645 = this.field7639.method4449() != arg2;
		this.field7635 = !this.field7644 && this.field7639.method4408();
		this.field7647 = !this.field7645 && this.field7639.method4408();
		this.field7637.method13739(12);
	}

	public class667(GpuToolkit arg0, class239 arg1) {
		this(arg0, arg1, arg1.method4409(), arg1.method4449());
	}

	public class667(GpuToolkit arg0, class239 arg1, int arg2, int arg3) {
		this.field7643 = false;
		this.field7640 = 0;
		this.field7641 = 0;
		this.field7642 = 0;
		this.field7634 = 0;
		this.field7637 = arg0;
		this.field7646 = arg2;
		this.field7638 = arg3;
		this.field7639 = arg1;
		this.field7636 = null;
		this.field7644 = this.field7639.method4409() != arg2;
		this.field7645 = this.field7639.method4449() != arg3;
		this.field7635 = !this.field7644 && this.field7639.method4408();
		this.field7647 = !this.field7645 && this.field7639.method4408();
		this.field7637.method13739(12);
	}

	@ObfuscatedName("yo.h(IIIIII)V")
	public void method1086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int[] var7 = this.field7637.method691(arg4, arg5, arg2, arg3);
		if (var7 != null) {
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] |= 0xFF000000;
			}
			this.method12938(arg0, arg1, arg2, arg3, var7, 0, arg2);
		}
	}

	@ObfuscatedName("yo.r(III)V")
	public void method1052(int arg0, int arg1, int arg2) {
		int[] var4 = this.field7637.method691(arg0, arg1, this.field7646, this.field7638);
		int[] var5 = new int[this.field7646 * this.field7638];
		this.field7639.method4415(0, 0, this.field7646, this.field7638, var5, 0);
		if (arg2 == 0) {
			for (int var6 = 0; var6 < this.field7638; var6++) {
				int var7 = this.field7646 * var6;
				for (int var8 = 0; var8 < this.field7646; var8++) {
					var5[var7 + var8] = var5[var7 + var8] & 0xFFFFFF | (var4[var7 + var8] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (int var9 = 0; var9 < this.field7638; var9++) {
				int var10 = this.field7646 * var9;
				for (int var11 = 0; var11 < this.field7646; var11++) {
					var5[var10 + var11] = var5[var10 + var11] & 0xFFFFFF | (var4[var10 + var11] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (int var12 = 0; var12 < this.field7638; var12++) {
				int var13 = this.field7646 * var12;
				for (int var14 = 0; var14 < this.field7646; var14++) {
					var5[var13 + var14] = var5[var13 + var14] & 0xFFFFFF | (var4[var13 + var14] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (int var15 = 0; var15 < this.field7638; var15++) {
				int var16 = this.field7646 * var15;
				for (int var17 = 0; var17 < this.field7646; var17++) {
					var5[var16 + var17] = var5[var16 + var17] & 0xFFFFFF | (var4[var16 + var17] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method12938(0, 0, this.field7646, this.field7638, var5, 0, this.field7646);
	}

	@ObfuscatedName("yo.q(IIII)V")
	public void method1036(int arg0, int arg1, int arg2, int arg3) {
		this.field7641 = arg0;
		this.field7640 = arg1;
		this.field7634 = arg2;
		this.field7642 = arg3;
		this.field7643 = this.field7641 != 0 || this.field7640 != 0 || this.field7634 != 0 || this.field7642 != 0;
	}

	@ObfuscatedName("yo.p([I)V")
	public void method1063(int[] arg0) {
		arg0[0] = this.field7641;
		arg0[1] = this.field7640;
		arg0[2] = this.field7634;
		arg0[3] = this.field7642;
	}

	@ObfuscatedName("yo.w()I")
	public int method1061() {
		return this.field7646;
	}

	@ObfuscatedName("yo.b()I")
	public int method1042() {
		return this.field7646 + this.field7641 + this.field7634;
	}

	@ObfuscatedName("yo.i()I")
	public int method1045() {
		return this.field7638;
	}

	@ObfuscatedName("yo.v()I")
	public int method1047() {
		return this.field7640 + this.field7638 + this.field7642;
	}

	@ObfuscatedName("yo.k()Lde;")
	public class136 method1049() {
		return this.field7636;
	}

	@ObfuscatedName("yo.u(IIII[III)V")
	public void method12938(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.field7639.method4413(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("yo.ay(IIIII)V")
	public void method1054(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.field7637.method13508() != class224.field2416) {
			int var6 = this.field7641 + arg0;
			int var7 = this.field7640 + arg1;
			this.field7637.field8342.method4497((float) var6, (float) var7, (float) (this.field7646 + var6), (float) (this.field7638 + var7), 0.0F, 0.0F, this.field7639.method4433(), this.field7639.method4443(), this.field7639, arg3);
			return;
		}
		this.field7637.method13610();
		this.field7637.method13592(arg4);
		class203 var8 = this.field7637.field8346;
		var8.field2284 = this.field7639;
		var8.method3881(arg2, arg3);
		int var9 = this.field7641 + arg0;
		int var10 = this.field7640 + arg1;
		float var11 = (float) this.field7637.method457().method921();
		float var12 = (float) this.field7637.method457().method922();
		var8.field2280.method5435((float) this.field7646 * 2.0F / var11, (float) this.field7638 * 2.0F / var12, 1.0F, 1.0F);
		var8.field2280.field3480[12] = ((float) var9 + this.field7637.method13750()) * 2.0F / var11 - 1.0F;
		var8.field2280.field3480[13] = ((float) var10 + this.field7637.method13750()) * 2.0F / var12 - 1.0F;
		var8.field2280.field3480[14] = -1.0F;
		var8.field2281.method5435(this.field7639.method4437((float) this.field7646), this.field7639.method4439((float) this.field7638), 1.0F, 1.0F);
		var8.field2283 = this.field7637.field8328;
		var8.field2277 = 0;
		var8.field2285 = this.field7637.field8389;
		var8.method3882();
	}

	@ObfuscatedName("yo.af(IILta;II)V")
	public void method1056(int arg0, int arg1, class11 arg2, int arg3, int arg4) {
		this.field7637.method13610();
		class203 var6 = this.field7637.field8346;
		var6.field2284 = this.field7639;
		var6.method3881(1, -1);
		int var7 = this.field7641 + arg0;
		int var8 = this.field7640 + arg1;
		float var9 = (float) this.field7637.method457().method921();
		float var10 = (float) this.field7637.method457().method922();
		var6.field2280.method5435((float) this.field7646 * 2.0F / var9, (float) this.field7638 * 2.0F / var10, 1.0F, 1.0F);
		var6.field2280.field3480[12] = ((float) var7 + this.field7637.method13750()) * 2.0F / var9 - 1.0F;
		var6.field2280.field3480[13] = ((float) var8 + this.field7637.method13750()) * 2.0F / var10 - 1.0F;
		var6.field2280.field3480[14] = -1.0F;
		var6.field2281.method5435(this.field7639.method4437((float) this.field7646), this.field7639.method4439((float) this.field7638), 1.0F, 1.0F);
		var6.field2283 = this.field7637.field8328;
		var6.field2277 = 0;
		var6.field2285 = this.field7637.field8389;
		class239 var11 = ((class670) arg2).field7652;
		var6.field2279 = var11;
		var6.field2282.method5435(var11.method4437((float) this.field7646), var11.method4439((float) this.field7638), 1.0F, 1.0F);
		var6.field2282.field3480[12] = var11.method4437((float) (var7 - arg3));
		var6.field2282.field3480[13] = var11.method4439((float) (var8 - arg4));
		var6.method3883();
	}

	@ObfuscatedName("yo.ap(IIIIIIII)V")
	public void method1041(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.field7637.method13508() != class224.field2416) {
			if (this.field7643) {
				arg2 = this.field7646 * arg2 / this.method1042();
				arg3 = this.field7638 * arg3 / this.method1047();
				arg0 += this.field7641 * arg2 / this.field7646;
				arg1 += this.field7640 * arg3 / this.field7638;
			}
			this.field7637.field8342.method4497((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.field7639.method4437(0.0F), this.field7639.method4439(0.0F), this.field7639.method4437((float) this.field7646), this.field7639.method4439((float) this.field7638), this.field7639, arg5);
			return;
		}
		this.field7637.method13610();
		this.field7637.method13592(arg6);
		class203 var9 = this.field7637.field8346;
		var9.field2284 = this.field7639;
		var9.method3881(arg4, arg5);
		if (this.field7643) {
			arg2 = this.field7646 * arg2 / this.method1042();
			arg3 = this.field7638 * arg3 / this.method1047();
			arg0 += this.field7641 * arg2 / this.field7646;
			arg1 += this.field7640 * arg3 / this.field7638;
		}
		float var10 = (float) this.field7637.method457().method921();
		float var11 = (float) this.field7637.method457().method922();
		var9.field2280.method5435((float) arg2 * 2.0F / var10, (float) arg3 * 2.0F / var11, 1.0F, 1.0F);
		var9.field2280.field3480[12] = ((float) arg0 + this.field7637.method13750()) * 2.0F / var10 - 1.0F;
		var9.field2280.field3480[13] = ((float) arg1 + this.field7637.method13750()) * 2.0F / var11 - 1.0F;
		var9.field2280.field3480[14] = -1.0F;
		var9.field2281.method5435(this.field7639.method4437((float) this.field7646), this.field7639.method4439((float) this.field7638), 1.0F, 1.0F);
		var9.field2283 = this.field7637.field8328;
		var9.field2277 = 0;
		var9.field2285 = this.field7637.field8389;
		var9.method3882();
	}

	@ObfuscatedName("yo.as(IIIIIII)V")
	public void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.field7637.method13508() != class224.field2416) {
			int var8 = arg1 + arg3;
			int var9 = arg0 + arg2;
			int var10 = this.method1042();
			int var11 = this.method1047();
			int var12 = this.field7640 + arg1;
			for (int var13 = this.field7638 + var12; var13 <= var8; var13 += var11) {
				int var14 = this.field7641 + arg0;
				for (int var15 = this.field7646 + var14; var15 <= var9; var15 += var10) {
					this.field7637.field8342.method4497((float) var14, (float) var12, (float) (this.field7646 + var14), (float) (this.field7638 + var12), 0.0F, 0.0F, this.field7639.method4433(), this.field7639.method4443(), this.field7639, arg5);
					var14 += var10;
				}
				if (var14 < var9) {
					int var16 = var9 - var14;
					this.field7637.field8342.method4497((float) var14, (float) var12, (float) (var14 + var16), (float) (this.field7638 + var12), 0.0F, 0.0F, (float) var16 / (float) this.field7646 * this.field7639.method4433(), this.field7639.method4443(), this.field7639, arg5);
				}
				var12 += var11;
			}
			if (var12 < var8) {
				int var17 = var8 - var12;
				float var18 = (float) var17 / (float) this.field7638 * this.field7639.method4443();
				int var19 = this.field7641 + arg0;
				for (int var20 = this.field7646 + var19; var20 <= var9; var20 += var10) {
					this.field7637.field8342.method4497((float) var19, (float) var12, (float) (this.field7646 + var19), (float) (var12 + var17), 0.0F, 0.0F, this.field7639.method4433(), var18, this.field7639, arg5);
					var19 += var10;
				}
				if (var19 < var9) {
					int var21 = var9 - var19;
					this.field7637.field8342.method4497((float) var19, (float) var12, (float) (var19 + var21), (float) (var12 + var17), 0.0F, 0.0F, (float) var21 / (float) this.field7646 * this.field7639.method4433(), var18, this.field7639, arg5);
				}
			}
			return;
		}
		this.field7637.method13610();
		this.field7637.method13592(arg6);
		class203 var22 = this.field7637.field8346;
		var22.field2284 = this.field7639;
		var22.method3881(arg4, arg5);
		float var23 = (float) this.field7637.method457().method921();
		float var24 = (float) this.field7637.method457().method922();
		var22.field2283 = this.field7637.field8328;
		var22.field2277 = 0;
		var22.field2285 = this.field7637.field8389;
		boolean var25 = this.field7647 && this.field7640 == 0 && this.field7642 == 0;
		boolean var26 = this.field7635 && this.field7641 == 0 && this.field7634 == 0;
		if (var26 & var25) {
			var22.field2280.method5435((float) arg2 * 2.0F / var23, (float) arg3 * 2.0F / var24, 1.0F, 1.0F);
			var22.field2280.field3480[12] = ((float) arg0 + this.field7637.method13750()) * 2.0F / var23 - 1.0F;
			var22.field2280.field3480[13] = ((float) arg1 + this.field7637.method13750()) * 2.0F / var24 - 1.0F;
			var22.field2280.field3480[14] = -1.0F;
			var22.field2281.method5435(this.field7639.method4437((float) arg2), this.field7639.method4439((float) arg3), 1.0F, 1.0F);
			var22.method3882();
		} else if (var26) {
			int var27 = arg1 + arg3;
			int var28 = this.method1047();
			var22.field2281.method5435(this.field7639.method4437((float) arg2), this.field7639.method4439((float) this.field7638), 1.0F, 1.0F);
			int var29 = this.field7640 + arg1;
			for (int var30 = this.field7638 + var29; var30 <= var27; var30 += var28) {
				var22.field2280.method5435((float) arg2 * 2.0F / var23, (float) this.field7638 * 2.0F / var24, 1.0F, 1.0F);
				var22.field2280.field3480[12] = ((float) arg0 + this.field7637.method13750()) * 2.0F / var23 - 1.0F;
				var22.field2280.field3480[13] = ((float) var29 + this.field7637.method13750()) * 2.0F / var24 - 1.0F;
				var22.field2280.field3480[14] = -1.0F;
				var22.method3882();
				var29 += var28;
			}
			if (var29 < var27) {
				int var31 = var27 - var29;
				var22.field2281.method5435(this.field7639.method4437((float) arg2), this.field7639.method4439((float) var31), 1.0F, 1.0F);
				var22.field2280.method5435((float) arg2 * 2.0F / var23, (float) var31 * 2.0F / var24, 1.0F, 1.0F);
				var22.field2280.field3480[12] = ((float) arg0 + this.field7637.method13750()) * 2.0F / var23 - 1.0F;
				var22.field2280.field3480[13] = ((float) var29 + this.field7637.method13750()) * 2.0F / var24 - 1.0F;
				var22.field2280.field3480[14] = -1.0F;
				var22.method3882();
			}
		} else if (var25) {
			int var32 = arg0 + arg2;
			int var33 = this.method1042();
			var22.field2281.method5435(this.field7639.method4437((float) this.field7646), this.field7639.method4439((float) arg3), 1.0F, 1.0F);
			int var34 = this.field7641 + arg0;
			for (int var35 = this.field7646 + var34; var35 <= var32; var35 += var33) {
				var22.field2280.method5435((float) this.field7646 * 2.0F / var23, (float) arg3 * 2.0F / var24, 1.0F, 1.0F);
				var22.field2280.field3480[12] = ((float) var34 + this.field7637.method13750()) * 2.0F / var23 - 1.0F;
				var22.field2280.field3480[13] = ((float) arg1 + this.field7637.method13750()) * 2.0F / var24 - 1.0F;
				var22.field2280.field3480[14] = -1.0F;
				var22.method3882();
				var34 += var33;
			}
			if (var34 < var32) {
				int var36 = var32 - var34;
				var22.field2281.method5435(this.field7639.method4437((float) var36), this.field7639.method4439((float) arg3), 1.0F, 1.0F);
				var22.field2280.method5435((float) var36 * 2.0F / var23, (float) arg3 * 2.0F / var24, 1.0F, 1.0F);
				var22.field2280.field3480[12] = ((float) var34 + this.field7637.method13750()) * 2.0F / var23 - 1.0F;
				var22.field2280.field3480[13] = ((float) arg1 + this.field7637.method13750()) * 2.0F / var24 - 1.0F;
				var22.field2280.field3480[14] = -1.0F;
				var22.method3882();
			}
		} else {
			int var37 = arg1 + arg3;
			int var38 = arg0 + arg2;
			int var39 = this.method1042();
			int var40 = this.method1047();
			int var41 = this.field7640 + arg1;
			for (int var42 = this.field7638 + var41; var42 <= var37; var42 += var40) {
				var22.field2281.method5435(this.field7639.method4437((float) this.field7646), this.field7639.method4439((float) this.field7638), 1.0F, 1.0F);
				int var43 = this.field7641 + arg0;
				for (int var44 = this.field7646 + var43; var44 <= var38; var44 += var39) {
					var22.field2280.method5435((float) this.field7646 * 2.0F / var23, (float) this.field7638 * 2.0F / var24, 1.0F, 1.0F);
					var22.field2280.field3480[12] = ((float) var43 + this.field7637.method13750()) * 2.0F / var23 - 1.0F;
					var22.field2280.field3480[13] = ((float) var41 + this.field7637.method13750()) * 2.0F / var24 - 1.0F;
					var22.field2280.field3480[14] = -1.0F;
					var22.method3882();
					var43 += var39;
				}
				if (var43 < var38) {
					int var45 = var38 - var43;
					var22.field2281.method5435(this.field7639.method4437((float) var45), this.field7639.method4439((float) this.field7638), 1.0F, 1.0F);
					var22.field2280.method5435((float) var45 * 2.0F / var23, (float) this.field7638 * 2.0F / var24, 1.0F, 1.0F);
					var22.field2280.field3480[12] = ((float) var43 + this.field7637.method13750()) * 2.0F / var23 - 1.0F;
					var22.field2280.field3480[13] = ((float) var41 + this.field7637.method13750()) * 2.0F / var24 - 1.0F;
					var22.field2280.field3480[14] = -1.0F;
					var22.method3882();
				}
				var41 += var40;
			}
			if (var41 < var37) {
				int var46 = var37 - var41;
				var22.field2281.method5435(this.field7639.method4437((float) this.field7646), this.field7639.method4439((float) var46), 1.0F, 1.0F);
				int var47 = this.field7641 + arg0;
				for (int var48 = this.field7646 + var47; var48 <= var38; var48 += var39) {
					var22.field2280.method5435((float) this.field7646 * 2.0F / var23, (float) var46 * 2.0F / var24, 1.0F, 1.0F);
					var22.field2280.field3480[12] = ((float) var47 + this.field7637.method13750()) * 2.0F / var23 - 1.0F;
					var22.field2280.field3480[13] = ((float) var41 + this.field7637.method13750()) * 2.0F / var24 - 1.0F;
					var22.field2280.field3480[14] = -1.0F;
					var22.method3882();
					var47 += var39;
				}
				if (var47 < var38) {
					int var49 = var38 - var47;
					var22.field2281.method5435(this.field7639.method4437((float) var49), this.field7639.method4439((float) var46), 1.0F, 1.0F);
					var22.field2280.method5435((float) var49 * 2.0F / var23, (float) var46 * 2.0F / var24, 1.0F, 1.0F);
					var22.field2280.field3480[12] = ((float) var47 + this.field7637.method13750()) * 2.0F / var23 - 1.0F;
					var22.field2280.field3480[13] = ((float) var41 + this.field7637.method13750()) * 2.0F / var24 - 1.0F;
					var22.field2280.field3480[14] = -1.0F;
					var22.method3882();
				}
			}
		}
	}

	@ObfuscatedName("yo.am(FFFFFFIIII)V")
	public void method1060(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.field7637.method13508() != class224.field2416) {
			this.field7637.field8342.method4498(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.field7639.method4433(), 0.0F, 0.0F, this.field7639.method4443(), this.field7639.method4433(), this.field7639.method4443(), this.field7639, arg7);
			return;
		}
		this.field7637.method13610();
		this.field7637.method13592(arg8);
		if (this.field7643) {
			float var11 = (float) this.method1042();
			float var12 = (float) this.method1047();
			float var13 = (arg2 - arg0) / var11;
			float var14 = (arg3 - arg1) / var11;
			float var15 = (arg4 - arg0) / var12;
			float var16 = (arg5 - arg1) / var12;
			float var17 = (float) this.field7640 * var15;
			float var18 = (float) this.field7640 * var16;
			float var19 = (float) this.field7641 * var13;
			float var20 = (float) this.field7641 * var14;
			float var21 = (float) this.field7634 * -var13;
			float var22 = (float) this.field7634 * -var14;
			float var23 = (float) this.field7642 * -var15;
			float var24 = (float) this.field7642 * -var16;
			arg0 = arg0 + var19 + var17;
			arg1 = arg1 + var20 + var18;
			arg2 = arg2 + var21 + var17;
			arg3 = arg3 + var22 + var18;
			arg4 = arg4 + var19 + var23;
			arg5 = arg5 + var20 + var24;
		}
		class203 var25 = this.field7637.field8346;
		var25.field2284 = this.field7639;
		var25.method3881(arg6, arg7);
		float var26 = (float) this.field7637.method457().method921();
		float var27 = (float) this.field7637.method457().method922();
		var25.field2280.method5453();
		var25.field2280.field3480[0] = (arg2 - arg0) * 2.0F / var26;
		var25.field2280.field3480[1] = (arg3 - arg1) * 2.0F / var27;
		var25.field2280.field3480[4] = (arg4 - arg0) * 2.0F / var26;
		var25.field2280.field3480[5] = (arg5 - arg1) * 2.0F / var27;
		var25.field2280.field3480[12] = (arg0 + this.field7637.method13750()) * 2.0F / var26 - 1.0F;
		var25.field2280.field3480[13] = (arg1 + this.field7637.method13750()) * 2.0F / var27 - 1.0F;
		var25.field2280.field3480[14] = -1.0F;
		var25.field2281.method5435(this.field7639.method4437((float) this.field7646), this.field7639.method4439((float) this.field7638), 1.0F, 1.0F);
		var25.field2283 = this.field7637.field8328;
		var25.field2277 = 0;
		var25.field2285 = this.field7637.field8389;
		var25.method3882();
	}

	@ObfuscatedName("yo.az(FFFFFFILta;II)V")
	public void method1044(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class11 arg7, int arg8, int arg9) {
		this.field7637.method13610();
		class203 var11 = this.field7637.field8346;
		var11.field2284 = this.field7639;
		var11.method3881(1, -1);
		float var12 = (float) this.field7637.method457().method921();
		float var13 = (float) this.field7637.method457().method922();
		var11.field2280.method5453();
		if (this.field7643) {
			float var14 = (float) this.field7646 / (float) this.method1042();
			float var15 = (float) this.field7638 / (float) this.method1047();
			var11.field2280.field3480[0] = (arg2 - arg0) * var14;
			var11.field2280.field3480[1] = (arg3 - arg1) * var14;
			var11.field2280.field3480[4] = (arg4 - arg0) * var15;
			var11.field2280.field3480[5] = (arg5 - arg1) * var15;
			var11.field2280.field3480[12] = ((float) this.field7641 + arg0) * var14 + this.field7637.method13750();
			var11.field2280.field3480[13] = ((float) this.field7640 + arg1) * var15 + this.field7637.method13750();
		} else {
			var11.field2280.field3480[0] = arg2 - arg0;
			var11.field2280.field3480[1] = arg3 - arg1;
			var11.field2280.field3480[4] = arg4 - arg0;
			var11.field2280.field3480[5] = arg5 - arg1;
			var11.field2280.field3480[12] = arg0 + this.field7637.method13750();
			var11.field2280.field3480[13] = arg1 + this.field7637.method13750();
		}
		Matrix4x4 var16 = this.field7637.field8264;
		var16.method5453();
		var16.field3480[0] = 2.0F / var12;
		var16.field3480[5] = 2.0F / var13;
		var16.field3480[12] = -1.0F;
		var16.field3480[13] = -1.0F;
		var16.field3480[14] = -1.0F;
		var11.field2280.method5384(var16);
		var11.field2281.method5435(this.field7639.method4437((float) this.field7646), this.field7639.method4439((float) this.field7638), 1.0F, 1.0F);
		var11.field2283 = this.field7637.field8328;
		var11.field2277 = 0;
		var11.field2285 = this.field7637.field8389;
		class239 var17 = ((class670) arg7).field7652;
		var11.field2279 = var17;
		var11.field2282.method5453();
		var11.field2282.field3480[0] = (arg2 - arg0) * var17.method4437(1.0F);
		var11.field2282.field3480[1] = (arg3 - arg1) * var17.method4437(1.0F);
		var11.field2282.field3480[4] = (arg4 - arg0) * var17.method4439(1.0F);
		var11.field2282.field3480[5] = (arg5 - arg1) * var17.method4439(1.0F);
		var11.field2282.field3480[12] = (arg0 - (float) arg8) * var17.method4437(1.0F);
		var11.field2282.field3480[13] = (arg1 - (float) arg9) * var17.method4439(1.0F);
		var11.method3883();
	}
}
