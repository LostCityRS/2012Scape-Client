package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("a")
public class class8 implements class10 {

	public long nativeid;

	@ObfuscatedName("a.u")
	public class19 field378;

	@ObfuscatedName("a.j")
	public Runnable field377;

	@ObfuscatedName("a.a")
	public class22[] field380 = new class22[7];

	@ObfuscatedName("a.s")
	public class22[] field379 = new class22[7];

	@ObfuscatedName("a.c")
	public class320 field376;

	public class8(class19 arg0, int arg1, int arg2) {
		this.field378 = arg0;
		for (int var4 = 0; var4 < 7; var4++) {
			this.field380[var4] = new class22(this.field378);
			this.field379[var4] = new class22(this.field378);
		}
		this.field376 = new class320();
		this.method153(this.nativeid, arg0, arg1, arg2);
	}

	@ObfuscatedName("a.u()V")
	public void method110() {
		this.field377 = Thread.currentThread();
		this.method94();
	}

	@ObfuscatedName("a.j(Lh;BIZ)Lqa;")
	public class13 method90(class22 arg0, byte arg1, int arg2, boolean arg3) {
		boolean var5 = false;
		class22 var6;
		class22 var7;
		if (arg1 > 0 && arg1 <= 7) {
			var6 = this.field379[arg1 - 1];
			var7 = this.field380[arg1 - 1];
			var5 = true;
		} else {
			var7 = var6 = new class22(this.field378);
		}
		arg0.method1132(var7, var6, arg2, var5, arg3);
		var7.field473 = arg0.field473;
		var7.field471 = arg0.field471;
		return var7;
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			class111.method2358(this);
		}
	}

	@ObfuscatedName("a.ma(Z)V")
	public void method92(boolean arg0) {
		this.method93(this.nativeid, arg0);
	}

	@ObfuscatedName("a.a()V")
	public void method94() {
		this.method95(this.nativeid);
	}

	@ObfuscatedName("a.s(Lra;[I[I[I[SI)V")
	public void method96(class14 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
		this.method97(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("a.c(Lra;IIIIIII)V")
	public void method98(class14 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.method148(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@ObfuscatedName("a.m(Lqa;Lqa;IIIZ)V")
	public void method100(class13 arg0, class13 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.method118(this.nativeid, ((class22) arg0).nativeid, ((class22) arg1).nativeid, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("a.t(Lqa;Lkc;[II)V")
	public void method102(class13 arg0, class314 arg1, int[] arg2, int arg3) {
		this.field376.method5385(arg1);
		this.method91(this.nativeid, ((class22) arg0).nativeid, this.field376.field3480, arg2, arg3);
	}

	@ObfuscatedName("a.l(Lqa;IILkc;Z)Z")
	public boolean method104(class13 arg0, int arg1, int arg2, class314 arg3, boolean arg4) {
		this.field376.method5385(arg3);
		return this.method105(this.nativeid, ((class22) arg0).nativeid, arg1, arg2, this.field376.field3480, arg4);
	}

	@ObfuscatedName("a.f(Lqa;[ILkc;)V")
	public void method89(class13 arg0, int[] arg1, class314 arg2) {
		this.field376.method5385(arg2);
		this.method124(this.nativeid, ((class22) arg0).nativeid, arg1, this.field376.field3480);
	}

	@ObfuscatedName("a.d(Lxa;II)V")
	public void method108(class12 arg0, int arg1, int arg2) {
		this.method109(this.nativeid, ((class26) arg0).nativeid, arg1, arg2);
	}

	@ObfuscatedName("a.z(Lxa;IIIIIII[[Z)V")
	public void method119(class12 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
		this.method111(this.nativeid, ((class26) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@ObfuscatedName("a.wa(JJ[F[II)V")
	public native void method91(long arg0, long arg1, float[] arg2, int[] arg3, int arg4);

	@ObfuscatedName("a.R(JZ)V")
	public native void method93(long arg0, boolean arg1);

	@ObfuscatedName("a.JA(J)V")
	public native void method95(long arg0);

	@ObfuscatedName("a.b(JLra;[I[I[I[SI)V")
	public native void method97(long arg0, class14 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

	@ObfuscatedName("a.ya(JJII[FZ)Z")
	public native boolean method105(long arg0, long arg1, int arg2, int arg3, float[] arg4, boolean arg5);

	@ObfuscatedName("a.v(JJII)V")
	public native void method109(long arg0, long arg1, int arg2, int arg3);

	@ObfuscatedName("a.i(JJIIIIIII[[Z)V")
	public native void method111(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

	@ObfuscatedName("a.P(JJJIIIZ)V")
	public native void method118(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

	@ObfuscatedName("a.J(JJ[I[F)V")
	public native void method124(long arg0, long arg1, int[] arg2, float[] arg3);

	@ObfuscatedName("a.K(JLra;IIIIIII)V")
	public native void method148(long arg0, class14 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("a.ha(JLra;II)V")
	public native void method153(long arg0, class14 arg1, int arg2, int arg3);
}
