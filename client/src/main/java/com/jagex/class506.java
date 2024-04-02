package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("rv")
public class class506 {

	@ObfuscatedName("rv.u")
	public final class334 field5246;

	@ObfuscatedName("rv.j")
	public final class334 field5244;

	@ObfuscatedName("rv.a")
	public final class451 field5247 = new class451(64);

	@ObfuscatedName("rv.s")
	public final class451 field5245 = new class451(60);

	@ObfuscatedName("rv.c")
	public int field5248;

	public class506(class527 arg0, class519 arg1, class334 arg2, class334 arg3) {
		this.field5246 = arg2;
		this.field5244 = arg3;
		int var5 = this.field5246.method5638() - 1;
		class161.field1638.method3071();
		this.field5246.method5637(var5);
	}

	@ObfuscatedName("rv.u(II)Lse;")
	public class507 method11082(int arg0) {
		class451 var2 = this.field5247;
		class507 var3;
		synchronized (this.field5247) {
			var3 = (class507) this.field5247.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field5246;
		byte[] var6;
		synchronized (this.field5246) {
			var6 = this.field5246.method5627(class161.field1638.method3073(arg0), class161.field1638.method3075(arg0));
		}
		class507 var8 = new class507();
		var8.field5256 = this;
		var8.field5250 = arg0;
		if (var6 != null) {
			var8.method11100(new class814(var6));
		}
		class451 var9 = this.field5247;
		synchronized (this.field5247) {
			this.field5247.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("rv.j(II)V")
	public void method11084(int arg0) {
		this.field5248 = arg0;
		class451 var2 = this.field5245;
		synchronized (this.field5245) {
			this.field5245.method7922();
		}
	}

	@ObfuscatedName("rv.a(I)V")
	public void method11088() {
		class451 var1 = this.field5247;
		synchronized (this.field5247) {
			this.field5247.method7922();
		}
		class451 var3 = this.field5245;
		synchronized (this.field5245) {
			this.field5245.method7922();
		}
	}

	@ObfuscatedName("rv.s(II)V")
	public void method11085(int arg0) {
		class451 var2 = this.field5247;
		synchronized (this.field5247) {
			this.field5247.method7921(arg0);
		}
		class451 var4 = this.field5245;
		synchronized (this.field5245) {
			this.field5245.method7921(arg0);
		}
	}

	@ObfuscatedName("rv.c(I)V")
	public void method11087() {
		class451 var1 = this.field5247;
		synchronized (this.field5247) {
			this.field5247.method7925();
		}
		class451 var3 = this.field5245;
		synchronized (this.field5245) {
			this.field5245.method7925();
		}
	}
}
