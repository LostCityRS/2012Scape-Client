package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("jw")
public class class294 implements class463 {

	@ObfuscatedName("jw.u")
	public final class334 field3314;

	@ObfuscatedName("jw.j")
	public int field3312;

	@ObfuscatedName("jw.a")
	public class451 field3313 = new class451(64);

	public class294(class527 arg0, class519 arg1, class334 arg2) {
		this.field3314 = arg2;
		if (this.field3314 == null) {
			this.field3312 = 0;
		} else {
			this.field3312 = this.field3314.method5637(class161.field1641.field1668);
		}
	}

	@ObfuscatedName("jw.u(II)Lju;")
	public class293 method4890(int arg0) {
		class451 var2 = this.field3313;
		class293 var3;
		synchronized (this.field3313) {
			var3 = (class293) this.field3313.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field3314;
		byte[] var6;
		synchronized (this.field3314) {
			var6 = this.field3314.method5627(class161.field1641.field1668, arg0);
		}
		class293 var8 = new class293();
		if (var6 != null) {
			var8.method4870(new class814(var6));
		}
		class451 var9 = this.field3313;
		synchronized (this.field3313) {
			this.field3313.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("jw.j(B)V")
	public void method4881() {
		class451 var1 = this.field3313;
		synchronized (this.field3313) {
			this.field3313.method7922();
		}
	}

	@ObfuscatedName("jw.a(II)V")
	public void method4882(int arg0) {
		class451 var2 = this.field3313;
		synchronized (this.field3313) {
			this.field3313.method7921(arg0);
		}
	}

	@ObfuscatedName("jw.s(I)V")
	public void method4883() {
		class451 var1 = this.field3313;
		synchronized (this.field3313) {
			this.field3313.method7925();
		}
	}
}
