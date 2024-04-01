package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agx")
public class class885 extends class640 {

	@ObfuscatedName("agx.x")
	public final int field9910;

	@ObfuscatedName("agx.i")
	public final int field9909;

	@ObfuscatedName("agx.v")
	public final float field9911;

	@ObfuscatedName("agx.k")
	public final float field9912;

	@ObfuscatedName("agx.h")
	public final boolean field9913;

	@ObfuscatedName("agx.r")
	public final boolean field9914;

	@ObfuscatedName("agx.ac(Lyq;Lcy;Ldz;II)Lagx;")
	public static class885 method15981(class682 arg0, class124 arg1, class139 arg2, int arg3, int arg4) {
		if (arg0.field8151 || IntMath.method11258(arg3) && IntMath.method11258(arg4)) {
			return new class885(arg0, 3553, arg1, arg2, arg3, arg4);
		} else if (arg0.field8208) {
			return new class885(arg0, 34037, arg1, arg2, arg3, arg4);
		} else {
			return new class885(arg0, arg1, arg2, arg3, arg4, IntMath.bitceil(arg3), IntMath.bitceil(arg4));
		}
	}

	@ObfuscatedName("agx.aq(Lyq;IIZ[III)Lagx;")
	public static class885 method15974(class682 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		if (arg0.field8151 || IntMath.method11258(arg1) && IntMath.method11258(arg2)) {
			return new class885(arg0, 3553, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (arg0.field8208) {
			return new class885(arg0, 34037, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			return new class885(arg0, arg1, arg2, IntMath.bitceil(arg1), IntMath.bitceil(arg2), arg4);
		}
	}

	@ObfuscatedName("agx.ab(Lyq;Lcy;Ldz;IIZ[BLcy;)Lagx;")
	public static class885 method15975(class682 arg0, class124 arg1, class139 arg2, int arg3, int arg4, boolean arg5, byte[] arg6, class124 arg7) {
		if (arg0.field8151 || IntMath.method11258(arg3) && IntMath.method11258(arg4)) {
			return new class885(arg0, 3553, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} else if (arg0.field8208) {
			return new class885(arg0, 34037, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} else {
			return new class885(arg0, arg1, arg2, arg3, arg4, IntMath.bitceil(arg3), IntMath.bitceil(arg4), arg6, arg7);
		}
	}

	@ObfuscatedName("agx.bq(Lyq;IIII)Lagx;")
	public static class885 method15976(class682 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0.field8151 || IntMath.method11258(arg3) && IntMath.method11258(arg4)) {
			return new class885(arg0, 3553, arg1, arg2, arg3, arg4, true);
		} else if (arg0.field8208) {
			return new class885(arg0, 34037, arg1, arg2, arg3, arg4, true);
		} else {
			return new class885(arg0, arg1, arg2, arg3, arg4, IntMath.bitceil(arg3), IntMath.bitceil(arg4), true);
		}
	}

	public class885(class682 arg0, int arg1, class124 arg2, class139 arg3, int arg4, int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.field9910 = arg4;
		this.field9909 = arg5;
		if (this.field1049 == 34037) {
			this.field9911 = arg5;
			this.field9912 = arg4;
			this.field9913 = false;
		} else {
			this.field9911 = 1.0F;
			this.field9912 = 1.0F;
			this.field9913 = true;
		}
		this.field9914 = false;
	}

	public class885(class682 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.field9910 = arg2;
		this.field9909 = arg3;
		if (this.field1049 == 34037) {
			this.field9911 = arg3;
			this.field9912 = arg2;
			this.field9913 = false;
		} else {
			this.field9911 = 1.0F;
			this.field9912 = 1.0F;
			this.field9913 = true;
		}
		this.field9914 = false;
	}

	public class885(class682 arg0, int arg1, class124 arg2, class139 arg3, int arg4, int arg5, boolean arg6, byte[] arg7, class124 arg8) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, true);
		this.field9910 = arg4;
		this.field9909 = arg5;
		if (this.field1049 == 34037) {
			this.field9911 = arg5;
			this.field9912 = arg4;
			this.field9913 = false;
		} else {
			this.field9911 = 1.0F;
			this.field9912 = 1.0F;
			this.field9913 = true;
		}
		this.field9914 = false;
	}

	public class885(class682 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.field9910 = arg4;
		this.field9909 = arg5;
		if (this.field1049 == 34037) {
			this.field9911 = arg5;
			this.field9912 = arg4;
			this.field9913 = false;
		} else {
			this.field9911 = 1.0F;
			this.field9912 = 1.0F;
			this.field9913 = true;
		}
		this.field9914 = false;
	}

	public class885(class682 arg0, class124 arg1, class139 arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.field9910 = arg3;
		this.field9909 = arg4;
		this.field9911 = (float) arg4 / (float) arg6;
		this.field9912 = (float) arg3 / (float) arg5;
		this.field9913 = false;
		this.field9914 = true;
		this.method12765(false, false);
	}

	public class885(class682 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
		super(arg0, 3553, class124.field1296, class139.field1501, arg3, arg4);
		this.field9910 = arg1;
		this.field9909 = arg2;
		this.method12766(0, arg4 - arg2, arg1, arg2, arg5, 0, 0, true);
		this.field9911 = (float) arg2 / (float) arg4;
		this.field9912 = (float) arg1 / (float) arg3;
		this.field9913 = false;
		this.field9914 = true;
		this.method12765(false, false);
	}

	public class885(class682 arg0, class124 arg1, class139 arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class124 arg8) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.field9910 = arg3;
		this.field9909 = arg4;
		this.method12769(0, arg6 - arg4, arg3, arg4, arg7, arg8, 0, 0, true);
		this.field9911 = (float) arg4 / (float) arg6;
		this.field9912 = (float) arg3 / (float) arg5;
		this.field9913 = false;
		this.field9914 = true;
		this.method12765(false, false);
	}

	public class885(class682 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.field9910 = arg3;
		this.field9909 = arg4;
		this.field9911 = (float) arg4 / (float) arg6;
		this.field9912 = (float) arg3 / (float) arg5;
		this.field9913 = false;
		this.field9914 = true;
		this.method12765(false, false);
	}

	@ObfuscatedName("agx.u(Z)V")
	public void method2055(boolean arg0) {
		super.method2055(arg0 && !this.field9914);
	}
}
