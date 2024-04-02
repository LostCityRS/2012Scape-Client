
import deob.ObfuscatedName;

@ObfuscatedName("yd")
public abstract class PureJavaSprite extends Sprite {

	@ObfuscatedName("yd.u")
	public PureJavaToolkit field7602;

	@ObfuscatedName("yd.j")
	public int field7590;

	@ObfuscatedName("yd.a")
	public int field7599;

	@ObfuscatedName("yd.s")
	public int field7592;

	@ObfuscatedName("yd.c")
	public int field7621;

	@ObfuscatedName("yd.m")
	public int field7594;

	@ObfuscatedName("yd.t")
	public int field7595;

	@ObfuscatedName("yd.l")
	public int[] field7596;

	@ObfuscatedName("yd.ar")
	public static int field7617 = 0;

	@ObfuscatedName("yd.an")
	public static int field7618 = 0;

	@ObfuscatedName("yd.ap")
	public static int field7619 = 0;

	@ObfuscatedName("yd.ag")
	public static int field7620 = 0;

	@ObfuscatedName("yd.as")
	public static int field7597 = 0;

	@ObfuscatedName("yd.ai")
	public static int field7622 = 0;

	@ObfuscatedName("yd.ao")
	public static int field7623 = 0;

	@ObfuscatedName("yd.al")
	public static int field7624 = 0;

	public PureJavaSprite(PureJavaToolkit arg0, int arg1, int arg2) {
		this.field7602 = arg0;
		this.field7590 = arg1;
		this.field7599 = arg2;
	}

	@ObfuscatedName("yd.q(IIII)V")
	public void method1036(int arg0, int arg1, int arg2, int arg3) {
		this.field7592 = arg0;
		this.field7621 = arg1;
		this.field7594 = arg2;
		this.field7595 = arg3;
	}

	@ObfuscatedName("yd.p([I)V")
	public void method1063(int[] arg0) {
		arg0[0] = this.field7592;
		arg0[1] = this.field7621;
		arg0[2] = this.field7594;
		arg0[3] = this.field7595;
	}

	@ObfuscatedName("yd.w()I")
	public int method1061() {
		return this.field7590;
	}

	@ObfuscatedName("yd.i()I")
	public int method1045() {
		return this.field7599;
	}

	@ObfuscatedName("yd.b()I")
	public int method1042() {
		return this.field7592 + this.field7590 + this.field7594;
	}

	@ObfuscatedName("yd.v()I")
	public int method1047() {
		return this.field7621 + this.field7599 + this.field7595;
	}

	@ObfuscatedName("yd.as(IIIIIII)V")
	public void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.field7602.method13191()) {
			throw new IllegalStateException();
		}
		if (this.field7596 == null) {
			this.field7596 = new int[4];
		}
		this.field7602.method453(this.field7596);
		this.field7602.method478(this.field7602.field8005, this.field7602.field8027, arg0 + arg2, arg1 + arg3);
		int var8 = this.method1042();
		int var9 = this.method1047();
		int var10 = (arg2 + var8 - 1) / var8;
		int var11 = (arg3 + var9 - 1) / var9;
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = var9 * var12;
			for (int var14 = 0; var14 < var10; var14++) {
				this.method1054(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
			}
		}
		this.field7602.method659(this.field7596[0], this.field7596[1], this.field7596[2], this.field7596[3]);
	}

	@ObfuscatedName("yd.j(FFFFFF)Z")
	public boolean method12912(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		int var7 = this.field7592 + this.field7590 + this.field7594;
		int var8 = this.field7621 + this.field7599 + this.field7595;
		if (this.field7590 != var7 || this.field7599 != var8) {
			float var9 = (arg2 - arg0) / (float) var7;
			float var10 = (arg3 - arg1) / (float) var7;
			float var11 = (arg4 - arg0) / (float) var8;
			float var12 = (arg5 - arg1) / (float) var8;
			float var13 = (float) this.field7621 * var11;
			float var14 = (float) this.field7621 * var12;
			float var15 = (float) this.field7592 * var9;
			float var16 = (float) this.field7592 * var10;
			float var17 = (float) this.field7594 * -var9;
			float var18 = (float) this.field7594 * -var10;
			float var19 = (float) this.field7595 * -var11;
			float var20 = (float) this.field7595 * -var12;
			arg0 += var13 + var15;
			arg1 += var14 + var16;
			arg2 += var13 + var17;
			arg3 += var14 + var18;
			arg4 += var15 + var19;
			arg5 += var16 + var20;
		}
		float var21 = arg2 - arg0 + arg4;
		float var22 = arg5 - arg1 + arg3;
		float var23;
		float var24;
		if (arg0 < arg2) {
			var23 = arg0;
			var24 = arg2;
		} else {
			var23 = arg2;
			var24 = arg0;
		}
		if (arg4 < var23) {
			var23 = arg4;
		}
		if (var21 < var23) {
			var23 = var21;
		}
		if (arg4 > var24) {
			var24 = arg4;
		}
		if (var21 > var24) {
			var24 = var21;
		}
		float var25;
		float var26;
		if (arg1 < arg3) {
			var25 = arg1;
			var26 = arg3;
		} else {
			var25 = arg3;
			var26 = arg1;
		}
		if (arg5 < var25) {
			var25 = arg5;
		}
		if (var22 < var25) {
			var25 = var22;
		}
		if (arg5 > var26) {
			var26 = arg5;
		}
		if (var22 > var26) {
			var26 = var22;
		}
		if (var23 < (float) this.field7602.field8005) {
			var23 = this.field7602.field8005;
		}
		if (var24 > (float) this.field7602.field8024) {
			var24 = this.field7602.field8024;
		}
		if (var25 < (float) this.field7602.field8027) {
			var25 = this.field7602.field8027;
		}
		if (var26 > (float) this.field7602.field8008) {
			var26 = this.field7602.field8008;
		}
		float var27 = var23 - var24;
		if (var27 >= 0.0F) {
			return false;
		}
		float var28 = var25 - var26;
		if (var28 >= 0.0F) {
			return false;
		}
		Statics.field7604 = this.field7602.field8002;
		Statics.field7614 = (int) ((float) ((int) var25 * Statics.field7604) + var23);
		float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
		float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
		Statics.field7606 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field7590 / var29);
		Statics.field7589 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field7599 / var30);
		Statics.field7608 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field7590 / var30);
		Statics.field7609 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field7599 / var29);
		Statics.field7610 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
		Statics.field7611 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
		Statics.field7612 = (this.field7590 >> 1 << 12) + (Statics.field7611 * Statics.field7608 >> 4);
		Statics.field7613 = (this.field7599 >> 1 << 12) + (Statics.field7611 * Statics.field7609 >> 4);
		Statics.field7593 = Statics.field7610 * Statics.field7606 >> 4;
		Statics.field7615 = Statics.field7610 * Statics.field7589 >> 4;
		Statics.field7600 = (int) var23;
		Statics.field7607 = (int) var27;
		Statics.field7601 = (int) var25;
		Statics.field7603 = (int) var28;
		return true;
	}

	@ObfuscatedName("yd.am(FFFFFFIIII)V")
	public void method1060(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.field7602.method13191()) {
			throw new IllegalStateException();
		} else if (this.method12912(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Statics.field7616 = arg7;
			if (arg6 != 1) {
				field7617 = arg7 >>> 24;
				field7618 = 256 - field7617;
				if (arg6 == 0) {
					field7619 = arg7 >> 16 & 0xFF;
					field7620 = arg7 >> 8 & 0xFF;
					field7597 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					field7622 = arg7 >>> 24;
					field7623 = 256 - field7622;
					int var11 = (arg7 & 0xFF00FF) * field7623 & 0xFF00FF00;
					int var12 = (arg7 & 0xFF00) * field7623 & 0xFF0000;
					field7624 = (var11 | var12) >>> 8;
				}
			}
			this.method12913(arg6, arg8);
		}
	}

	@ObfuscatedName("yd.az(FFFFFFILta;II)V")
	public void method1044(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class11 arg7, int arg8, int arg9) {
		if (this.field7602.method13191()) {
			throw new IllegalStateException();
		} else if (this.method12912(arg0, arg1, arg2, arg3, arg4, arg5)) {
			class668 var11 = (class668) arg7;
			this.method12914(var11.field7648, var11.field7649, Statics.field7600 - arg8, -arg9 - (Statics.field7603 - Statics.field7601));
		}
	}

	@ObfuscatedName("yd.ay(IIIII)V")
	public abstract void method1054(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("yd.ap(IIIIIIII)V")
	public abstract void method1041(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	@ObfuscatedName("yd.a(II)V")
	public abstract void method12913(int arg0, int arg1);

	@ObfuscatedName("yd.s([I[III)V")
	public abstract void method12914(int[] arg0, int[] arg1, int arg2, int arg3);

	@ObfuscatedName("yd.u(ZZZIIFIIIIIIZ)V")
	public abstract void method12923(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12);

	@ObfuscatedName("yd.af(IILta;II)V")
	public abstract void method1056(int arg0, int arg1, class11 arg2, int arg3, int arg4);
}
