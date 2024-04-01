package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pn")
public class class440 {

	@ObfuscatedName("pn.u")
	public final class334 field4734;

	@ObfuscatedName("pn.j")
	public final class451 field4732 = new class451(64);

	@ObfuscatedName("pn.a")
	public static final class439 field4733 = new class439();

	@ObfuscatedName("pn.s")
	public final class493 field4735;

	public class440(class527 arg0, class519 arg1, class334 arg2, class493 arg3) {
		this.field4734 = arg2;
		this.field4734.method5637(class161.field1657.field1668);
		this.field4735 = arg3;
	}

	@ObfuscatedName("pn.u(II)Lps;")
	public class439 method7784(int arg0) {
		class451 var2 = this.field4732;
		class439 var3;
		synchronized (this.field4732) {
			var3 = (class439) this.field4732.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field4734;
		byte[] var6;
		synchronized (this.field4734) {
			var6 = this.field4734.method5627(class161.field1657.field1668, arg0);
		}
		class439 var8 = new class439();
		var8.field4698 = this;
		if (var6 != null) {
			var8.method7752(new class814(var6));
		}
		class451 var9 = this.field4732;
		synchronized (this.field4732) {
			this.field4732.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("pn.j(I)V")
	public void method7774() {
		class451 var1 = this.field4732;
		synchronized (this.field4732) {
			this.field4732.method7922();
		}
	}

	@ObfuscatedName("pn.a(IB)V")
	public void method7775(int arg0) {
		class451 var2 = this.field4732;
		synchronized (this.field4732) {
			this.field4732.method7921(arg0);
		}
	}

	@ObfuscatedName("pn.s(I)V")
	public void method7776() {
		class451 var1 = this.field4732;
		synchronized (this.field4732) {
			this.field4732.method7925();
		}
	}
}
