package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("h")
public class class22 extends class13 implements class10 {

	public long nativeid;

	@ObfuscatedName("h.a")
	public class19 field474;

	@ObfuscatedName("h.s")
	public class23 field472;

	@ObfuscatedName("h.c")
	public class134[] field473;

	@ObfuscatedName("h.m")
	public class119[] field471;

	public class22(class19 arg0, class23 arg1, class129 arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field474 = arg0;
		this.field472 = arg1;
		this.field473 = arg2.field1347;
		this.field471 = arg2.field1346;
		int var8 = arg2.field1347 == null ? 0 : arg2.field1347.length;
		int var9 = arg2.field1346 == null ? 0 : arg2.field1346.length;
		int var10 = 0;
		int[] var11 = new int[var8 * 3 + var9];
		for (int var12 = 0; var12 < var8; var12++) {
			var11[var10++] = this.field473[var12].field1374 * -1110628697;
			var11[var10++] = this.field473[var12].field1375 * 87081721;
			var11[var10++] = this.field473[var12].field1376 * -1567764511;
		}
		for (int var13 = 0; var13 < var9; var13++) {
			var11[var10++] = this.field471[var13].field1239 * 1413693225;
		}
		int var14 = arg2.field1349 == null ? 0 : arg2.field1349.length;
		int[] var15 = new int[var14 * 8];
		int var16 = 0;
		for (int var17 = 0; var17 < var14; var17++) {
			class141 var18 = arg2.field1349[var17];
			class272 var19 = class272.method3666(var18.field1512 * 405999219);
			var15[var16++] = var18.field1513 * -223583975;
			var15[var16++] = var19.field2658 * 1767535009;
			var15[var16++] = var19.field2662 * -497079757;
			var15[var16++] = var19.field2661 * -2096598891;
			var15[var16++] = var19.field2665 * 98021405;
			var15[var16++] = var19.field2664 * 893578477;
			var15[var16++] = var19.field2667 ? -1 : 0;
		}
		for (int var20 = 0; var20 < var14; var20++) {
			class141 var21 = arg2.field1349[var20];
			var15[var16++] = var21.field1511 * 34721765;
		}
		this.method1128(this.field474, this.field472, arg2.field1328, arg2.field1315, arg2.field1316, arg2.field1320, arg2.field1318, arg2.field1313, arg2.field1321, arg2.field1342, arg2.field1322, arg2.field1323, arg2.field1324, arg2.field1345, arg2.field1326, arg2.field1332, arg2.field1348, arg2.field1329, arg2.field1330, arg2.field1331, arg2.field1319, arg2.field1333, arg2.field1334, arg2.field1335, arg2.field1336, arg2.field1337, arg2.field1338, arg2.field1339, arg2.field1340, arg2.field1341, arg2.field1327, arg2.field1325, arg2.field1317, arg2.field1343, arg2.field1344, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
	}

	public class22(class19 arg0) {
		this.field474 = arg0;
		this.field472 = null;
		this.method1129(arg0);
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			class111.method2358(this);
		}
	}

	@ObfuscatedName("h.ax(Lkc;)V")
	public void method294(class314 arg0) {
		this.method1135(class19.field463, arg0);
		int var2 = 0;
		if (this.field473 != null) {
			for (int var3 = 0; var3 < this.field473.length; var3++) {
				class134 var4 = this.field473[var3];
				var4.field1378 = class19.field463[var2++] * -1036677949;
				var4.field1379 = class19.field463[var2++] * -1124493457;
				var4.field1380 = class19.field463[var2++] * -1973373357;
				var4.field1381 = class19.field463[var2++] * 1467863591;
				var4.field1377 = class19.field463[var2++] * 1468179349;
				var4.field1373 = class19.field463[var2++] * 971303023;
				var4.field1384 = class19.field463[var2++] * 1599185465;
				var4.field1385 = class19.field463[var2++] * 752811421;
				var4.field1386 = class19.field463[var2++] * 132837055;
			}
		}
		if (this.field471 == null) {
			return;
		}
		for (int var5 = 0; var5 < this.field471.length; var5++) {
			class119 var6 = this.field471[var5];
			class119 var7 = var6;
			if (var6.field1238 != null) {
				var7 = var6.field1238;
			}
			if (var6.field1237 == null) {
				var6.field1237 = new class320();
			}
			var6.field1237.method5385(arg0);
			var7.field1240 = class19.field463[var2++] * 1948845905;
			var7.field1241 = class19.field463[var2++] * -41345637;
			var7.field1242 = class19.field463[var2++] * -1088598959;
		}
	}

	@ObfuscatedName("h.gp([ILkc;)V")
	public void method1135(int[] arg0, class314 arg1) {
		this.field474.method987().method89(this, arg0, arg1);
	}

	@ObfuscatedName("h.q(BIZ)Lqa;")
	public class13 method295(byte arg0, int arg1, boolean arg2) {
		return this.field474.method987().method90(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("h.b()V")
	public void method247() {
	}

	@ObfuscatedName("h.k()V")
	public void method257() {
		if (this.field474.field457 <= 1) {
			return;
		}
		synchronized (this) {
			while (this.field391) {
				try {
					this.wait();
				} catch (InterruptedException var4) {
				}
			}
			this.field391 = true;
		}
	}

	@ObfuscatedName("h.h()V")
	public void method407() {
		if (this.field474.field457 > 1) {
			synchronized (this) {
				this.field391 = false;
				this.notifyAll();
			}
		}
	}

	@ObfuscatedName("h.ap(I[IIIIIZ)V")
	public final void method266(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		this.method1142(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("h.ag(Lkc;IZ)V")
	public void method239(class314 arg0, int arg1, boolean arg2) {
		class320 var4 = this.field474.method987().field376;
		var4.method5385(arg0);
		this.method1130(var4.field3480, arg1, arg2);
	}

	@ObfuscatedName("h.as(Lkc;Ldy;I)V")
	public void method271(class314 arg0, class142 arg1, int arg2) {
		if (arg1 == null) {
			this.field474.method987().method102(this, arg0, null, arg2);
			return;
		}
		class19.field460[5] = 0;
		this.field474.method987().method102(this, arg0, class19.field460, arg2);
		arg1.field1516 = class19.field460[0];
		arg1.field1518 = class19.field460[1];
		arg1.field1519 = class19.field460[2];
		arg1.field1520 = class19.field460[3];
		arg1.field1517 = class19.field460[4];
		arg1.field1521 = class19.field460[5] != 0;
	}

	@ObfuscatedName("h.ai(IILkc;ZI)Z")
	public boolean method272(int arg0, int arg1, class314 arg2, boolean arg3, int arg4) {
		return this.field474.method987().method104(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("h.al(B[B)V")
	public void method288(byte arg0, byte[] arg1) {
		this.method1136(arg0, arg1);
	}

	@ObfuscatedName("h.at()Z")
	public boolean method291() {
		return true;
	}

	@ObfuscatedName("h.aw()[Ldx;")
	public class134[] method276() {
		return this.field473;
	}

	@ObfuscatedName("h.am()[Lct;")
	public class119[] method413() {
		return this.field471;
	}

	@ObfuscatedName("h.ad(Lqa;IIIZ)V")
	public void method297(class13 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.field474.method987().method100(this, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("h.U(Lja;Lba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	public native void method1128(class19 arg0, class23 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

	@ObfuscatedName("h.ba(Lja;)V")
	public native void method1129(class19 arg0);

	@ObfuscatedName("h.ma(Z)V")
	public native void method92(boolean arg0);

	@ObfuscatedName("h.KA(I)V")
	public native void method252(int arg0);

	@ObfuscatedName("h.m()I")
	public native int method329();

	@ObfuscatedName("h.S(I)V")
	public native void method249(int arg0);

	@ObfuscatedName("h.f(I)V")
	public native void method246(int arg0);

	@ObfuscatedName("h.EA(I)V")
	public native void method284(int arg0);

	@ObfuscatedName("h.wa()V")
	public native void method253();

	@ObfuscatedName("h.oa(III)V")
	public native void method245(int arg0, int arg1, int arg2);

	@ObfuscatedName("h.ha()I")
	public native int method281();

	@ObfuscatedName("h.e(I[IIIIZI[I)V")
	public native void method267(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("h.w(IIII)V")
	public native void method343(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("h.aa([FIZ)V")
	public native void method1130(float[] arg0, int arg1, boolean arg2);

	@ObfuscatedName("h.N()I")
	public native int method274();

	@ObfuscatedName("h.Z()I")
	public native int method285();

	@ObfuscatedName("h.ya()I")
	public native int method277();

	@ObfuscatedName("h.YA()I")
	public native int method278();

	@ObfuscatedName("h.ia(III)V")
	public native void method353(int arg0, int arg1, int arg2);

	@ObfuscatedName("h.Q(I)V")
	public native void method283(int arg0);

	@ObfuscatedName("h.c()I")
	public native int method398();

	@ObfuscatedName("h.o()I")
	public native int method279();

	@ObfuscatedName("h.ao()[B")
	public native byte[] method334();

	@ObfuscatedName("h.PA(IIII)V")
	public native void method290(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("h.i()Z")
	public native boolean method292();

	@ObfuscatedName("h.u()Z")
	public native boolean method293();

	@ObfuscatedName("h.BA(Lh;Lh;IZZ)V")
	public native void method1132(class22 arg0, class22 arg1, int arg2, boolean arg3, boolean arg4);

	@ObfuscatedName("h.RA()I")
	public native int method358();

	@ObfuscatedName("h.AA()I")
	public native int method280();

	@ObfuscatedName("h.ka()V")
	public native void method269();

	@ObfuscatedName("h.n()I")
	public native int method275();

	@ObfuscatedName("h.X(SS)V")
	public native void method287(short arg0, short arg1);

	@ObfuscatedName("h.IA(B[B)V")
	public native void method1136(byte arg0, byte[] arg1);

	@ObfuscatedName("h.t(I)V")
	public native void method397(int arg0);

	@ObfuscatedName("h.ga(Lna;)Lna;")
	public native class30 method273(class30 arg0);

	@ObfuscatedName("h.ea()Z")
	public native boolean method421();

	@ObfuscatedName("h.W(SS)V")
	public native void method289(short arg0, short arg1);

	@ObfuscatedName("h.J(JI[IIIIIZ)V")
	public native void method1142(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

	@ObfuscatedName("h.pa(IILxa;Lxa;III)V")
	public native void method255(int arg0, int arg1, class12 arg2, class12 arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("h.p(I)V")
	public native void method282(int arg0);
}
