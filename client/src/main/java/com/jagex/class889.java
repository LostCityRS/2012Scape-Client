package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("age")
public class class889 extends class674 {

	@ObfuscatedName("age.j")
	public class681 field9919;

	@ObfuscatedName("age.a")
	public class78 field9920;

	@ObfuscatedName("age.s")
	public class71 field9921;

	@ObfuscatedName("age.c")
	public int field9922 = 0;

	@ObfuscatedName("age.m")
	public int field9923 = 0;

	public class889(class681 arg0) {
		this.field9919 = arg0;
	}

	@ObfuscatedName("age.u()I")
	public int method921() {
		return this.field9922 * -2044916535;
	}

	@ObfuscatedName("age.j()I")
	public int method922() {
		return this.field9923 * 688544813;
	}

	@ObfuscatedName("age.x(ILde;)V")
	public void method1206(int arg0, class136 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		class71 var3 = (class71) arg1;
		if (this.field9920 != null && var3 != null && (this.field9920.field1023 * 356336209 != var3.field934 * -1863882617 || this.field9920.field1022 * -1966159123 != var3.field933 * -205655939)) {
			throw new RuntimeException();
		}
		this.field9921 = var3;
		if (var3 != null) {
			this.field9922 = var3.field934 * -645102897;
			this.field9923 = var3.field933 * 768903057;
		} else if (this.field9920 == null) {
			this.field9922 = 0;
			this.field9923 = 0;
		}
		if (this.field9919.method457() == this) {
			this.method954();
		}
	}

	@ObfuscatedName("age.n(Ldo;)V")
	public void method1207(class132 arg0) {
		class78 var2 = (class78) arg0;
		if (this.field9921 != null && var2 != null && (this.field9921.field934 * -1863882617 != var2.field1023 * 356336209 || this.field9921.field933 * -205655939 != var2.field1022 * -1966159123)) {
			throw new RuntimeException();
		}
		this.field9920 = var2;
		if (var2 != null) {
			this.field9922 = var2.field1023 * 592917833;
			this.field9923 = var2.field1022 * 2005115329;
		} else if (this.field9921 == null) {
			this.field9922 = 0;
			this.field9923 = 0;
		}
		if (this.field9919.method457() == this) {
			this.method954();
		}
	}

	@ObfuscatedName("age.r()Z")
	public boolean method1208() {
		return true;
	}

	@ObfuscatedName("age.s()Z")
	public boolean method954() {
		this.field9919.method13197(this.field9922 * -2044916535, this.field9923 * 688544813, this.field9921 == null ? null : this.field9921.field932, this.field9920 == null ? null : this.field9920.field1024);
		return true;
	}

	@ObfuscatedName("age.c()Z")
	public boolean method925() {
		return true;
	}

	@ObfuscatedName("age.g(IIIIIIZZ)V")
	public void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		int[] var9 = null;
		int[] var10 = null;
		float[] var11 = null;
		float[] var12 = null;
		if (arg6 && this.field9921 != null) {
			var9 = this.field9921.field932;
			var10 = this.field9919.field8001;
		}
		if (arg7 && this.field9920 != null) {
			var11 = this.field9920.field1024;
			var12 = this.field9919.field8023;
		}
		method7656(this.field9922 * -2044916535, this.field9919.field8002 * 1322125985, var9, var10, var11, var12, arg0, arg1, arg4, arg5, arg2, arg3);
	}

	@ObfuscatedName("pv.ap(II[I[I[F[FIIIIIIB)V")
	public static void method7656(int arg0, int arg1, int[] arg2, int[] arg3, float[] arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		int var12 = arg0 * arg7 + arg6;
		int var13 = arg1 * arg9 + arg8;
		int var14 = arg0 - arg10;
		int var15 = arg1 - arg10;
		if (arg2 == null) {
			for (int var16 = 0; var16 < arg11; var16++) {
				int var17 = arg10 + var12;
				while (var12 < var17) {
					arg5[var13++] = arg4[var12++];
				}
				var12 += var14;
				var13 += var15;
			}
		} else if (arg4 == null) {
			for (int var18 = 0; var18 < arg11; var18++) {
				int var19 = arg10 + var12;
				while (var12 < var19) {
					arg3[var13++] = arg2[var12++];
				}
				var12 += var14;
				var13 += var15;
			}
		} else {
			for (int var20 = 0; var20 < arg11; var20++) {
				int var21 = arg10 + var12;
				while (var12 < var21) {
					arg3[var13] = arg2[var12];
					arg5[var13++] = arg4[var12++];
				}
				var12 += var14;
				var13 += var15;
			}
		}
	}

	@ObfuscatedName("age.a()V")
	public void method944() {
	}
}
