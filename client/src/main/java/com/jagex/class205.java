package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("gq")
public class class205 implements class463 {

	@ObfuscatedName("gq.u")
	public final class334 field2298;

	@ObfuscatedName("gq.j")
	public final class334 field2299;

	@ObfuscatedName("gq.a")
	public final WeightedCache field2300 = new WeightedCache(64);

	public class205(class527 arg0, class519 arg1, class334 arg2, class334 arg3) {
		this.field2298 = arg2;
		this.field2299 = arg3;
		this.field2298.method5637(class161.field1666.field1668);
	}

	@ObfuscatedName("gq.u(II)Lgp;")
	public class204 method3909(int arg0) {
		WeightedCache var2 = this.field2300;
		class204 var3;
		synchronized (this.field2300) {
			var3 = (class204) this.field2300.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field2298;
		byte[] var6;
		synchronized (this.field2298) {
			var6 = this.field2298.getFile(class161.field1666.field1668, arg0);
		}
		class204 var8 = new class204();
		var8.field2296 = this;
		if (var6 != null) {
			var8.method3902(new Packet(var6));
		}
		WeightedCache var9 = this.field2300;
		synchronized (this.field2300) {
			this.field2300.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("gq.j(B)V")
	public void method3910() {
		WeightedCache var1 = this.field2300;
		synchronized (this.field2300) {
			this.field2300.method7922();
		}
	}

	@ObfuscatedName("gq.a(IS)V")
	public void method3911(int arg0) {
		WeightedCache var2 = this.field2300;
		synchronized (this.field2300) {
			this.field2300.method7921(arg0);
		}
	}

	@ObfuscatedName("gq.s(I)V")
	public void method3917() {
		WeightedCache var1 = this.field2300;
		synchronized (this.field2300) {
			this.field2300.method7925();
		}
	}
}
