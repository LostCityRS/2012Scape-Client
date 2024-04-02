package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pm")
public final class class451 {

	@ObfuscatedName("pm.u")
	public int field4826;

	@ObfuscatedName("pm.j")
	public int field4827;

	@ObfuscatedName("pm.a")
	public class565 field4828;

	@ObfuscatedName("pm.s")
	public class552 field4829;

	public class451(int arg0, int arg1) {
		this.field4829 = new class552();
		this.field4826 = arg0 * 1280053969;
		this.field4827 = arg0 * -49833541;
		int var3;
		for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
		}
		this.field4828 = new class565(var3);
	}

	public class451(int arg0) {
		this(arg0, arg0);
	}

	@ObfuscatedName("pm.u(J)Ljava/lang/Object;")
	public Object method7916(long arg0) {
		class952 var3 = (class952) this.field4828.method11923(arg0);
		if (var3 == null) {
			return null;
		}
		Object var4 = var3.method16722();
		if (var4 == null) {
			var3.method6979();
			var3.method15142();
			this.field4827 += var3.field10373 * -1152245453;
			return null;
		}
		if (var3.method16724()) {
			class1005 var5 = new class1005(var4, var3.field10373 * 1115636457);
			this.field4828.method11927(var5, var3.field4228 * 4763964654233859639L);
			this.field4829.method11728(var5);
			var5.field9554 = 0L;
			var3.method6979();
			var3.method15142();
		} else {
			this.field4829.method11728(var3);
			var3.field9554 = 0L;
		}
		return var4;
	}

	@ObfuscatedName("pm.j(J)V")
	public void method7917(long arg0) {
		class952 var3 = (class952) this.field4828.method11923(arg0);
		this.method7950(var3);
	}

	@ObfuscatedName("pm.a(Lajc;B)V")
	public void method7950(class952 arg0) {
		if (arg0 != null) {
			arg0.method6979();
			arg0.method15142();
			this.field4827 += arg0.field10373 * -1152245453;
		}
	}

	@ObfuscatedName("pm.s(Ljava/lang/Object;J)V")
	public void method7937(Object arg0, long arg1) {
		this.method7918(arg0, arg1, 1);
	}

	@ObfuscatedName("pm.c(Ljava/lang/Object;JII)V")
	public void method7918(Object arg0, long arg1, int arg2) {
		if (arg2 > this.field4826 * 1239909937) {
			throw new IllegalStateException();
		}
		this.method7917(arg1);
		this.field4827 -= arg2 * -49833541;
		while (this.field4827 * 1047413619 < 0) {
			class952 var5 = (class952) this.field4829.method11729();
			this.method7950(var5);
		}
		class1005 var6 = new class1005(arg0, arg2);
		this.field4828.method11927(var6, arg1);
		this.field4829.method11728(var6);
		var6.field9554 = 0L;
	}

	@ObfuscatedName("pm.m(II)V")
	public void method7921(int arg0) {
		for (class952 var2 = (class952) this.field4829.method11756(); var2 != null; var2 = (class952) this.field4829.method11744()) {
			if (var2.method16724()) {
				if (var2.method16722() == null) {
					var2.method6979();
					var2.method15142();
					this.field4827 += var2.field10373 * -1152245453;
				}
			} else if ((var2.field9554 += -3315322578331577131L) * 4148779780871537789L > (long) arg0) {
				class1004 var3 = new class1004(var2.method16722(), var2.field10373 * 1115636457);
				this.field4828.method11927(var3, var2.field4228 * 4763964654233859639L);
				class552.method2355(var3, var2);
				var2.method6979();
				var2.method15142();
			}
		}
	}

	@ObfuscatedName("pm.t(S)V")
	public void method7922() {
		this.field4829.method11733();
		this.field4828.method11925();
		this.field4827 = this.field4826 * 1940475595;
	}

	@ObfuscatedName("pm.l(B)I")
	public int method7923() {
		return this.field4826 * 1239909937;
	}

	@ObfuscatedName("pm.f(I)I")
	public int method7924() {
		return this.field4827 * 1047413619;
	}

	@ObfuscatedName("pm.d(I)I")
	public int method7926() {
		int var1 = 0;
		for (class952 var2 = (class952) this.field4829.method11756(); var2 != null; var2 = (class952) this.field4829.method11744()) {
			if (!var2.method16724()) {
				var1++;
			}
		}
		return var1;
	}

	@ObfuscatedName("pm.z(B)V")
	public void method7925() {
		for (class952 var1 = (class952) this.field4829.method11756(); var1 != null; var1 = (class952) this.field4829.method11744()) {
			if (var1.method16724()) {
				var1.method6979();
				var1.method15142();
				this.field4827 += var1.field10373 * -1152245453;
			}
		}
	}

	@ObfuscatedName("pm.n(B)Ljava/lang/Object;")
	public Object method7931() {
		class952 var1 = (class952) this.field4828.method11928();
		while (var1 != null) {
			Object var2 = var1.method16722();
			if (var2 != null) {
				return var2;
			}
			class952 var3 = var1;
			var1 = (class952) this.field4828.method11929();
			var3.method6979();
			var3.method15142();
			this.field4827 += var3.field10373 * -1152245453;
		}
		return null;
	}

	@ObfuscatedName("pm.o(B)Ljava/lang/Object;")
	public Object method7949() {
		class952 var1 = (class952) this.field4828.method11929();
		while (var1 != null) {
			Object var2 = var1.method16722();
			if (var2 != null) {
				return var2;
			}
			class952 var3 = var1;
			var1 = (class952) this.field4828.method11929();
			var3.method6979();
			var3.method15142();
			this.field4827 += var3.field10373 * -1152245453;
		}
		return null;
	}
}
