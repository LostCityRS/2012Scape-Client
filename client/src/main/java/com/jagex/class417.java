package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ow")
public class class417 {

	@ObfuscatedName("ow.u")
	public final class334 field4452;

	@ObfuscatedName("ow.j")
	public final class334 field4451;

	@ObfuscatedName("ow.a")
	public final WeightedCache field4453 = new WeightedCache(64);

	@ObfuscatedName("ow.s")
	public WeightedCache field4454 = new WeightedCache(20);

	public class417(class527 arg0, class519 arg1, class334 arg2, class334 arg3) {
		this.field4451 = arg3;
		this.field4452 = arg2;
		this.field4452.method5637(class161.field1680.field1668);
	}

	@ObfuscatedName("ow.u(IB)Loe;")
	public class416 method7334(int arg0) {
		WeightedCache var2 = this.field4453;
		class416 var3;
		synchronized (this.field4453) {
			var3 = (class416) this.field4453.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field4452;
		byte[] var6;
		synchronized (this.field4452) {
			var6 = this.field4452.getFile(class161.field1680.field1668, arg0);
		}
		class416 var8 = new class416();
		var8.field4439 = this;
		if (var6 != null) {
			var8.method7302(new Packet(var6));
		}
		WeightedCache var9 = this.field4453;
		synchronized (this.field4453) {
			this.field4453.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("ow.j(I)V")
	public void method7329() {
		WeightedCache var1 = this.field4453;
		synchronized (this.field4453) {
			this.field4453.method7922();
		}
		WeightedCache var3 = this.field4454;
		synchronized (this.field4454) {
			this.field4454.method7922();
		}
	}

	@ObfuscatedName("ow.a(II)V")
	public void method7327(int arg0) {
		WeightedCache var2 = this.field4453;
		synchronized (this.field4453) {
			this.field4453.method7921(arg0);
		}
		WeightedCache var4 = this.field4454;
		synchronized (this.field4454) {
			this.field4454.method7921(arg0);
		}
	}

	@ObfuscatedName("ow.s(I)V")
	public void method7331() {
		WeightedCache var1 = this.field4453;
		synchronized (this.field4453) {
			this.field4453.method7925();
		}
		WeightedCache var3 = this.field4454;
		synchronized (this.field4454) {
			this.field4454.method7925();
		}
	}
}
