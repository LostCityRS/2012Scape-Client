package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("rd")
public class class484 {

	@ObfuscatedName("rd.u")
	public final class334 field5106;

	@ObfuscatedName("rd.j")
	public int field5105;

	@ObfuscatedName("rd.a")
	public final WeightedCache field5107 = new WeightedCache(64);

	@ObfuscatedName("rd.s")
	public int field5108 = 0;

	public class484(class527 arg0, class519 arg1, class334 arg2) {
		this.field5106 = arg2;
		this.field5105 = this.field5106.method5637(class161.field1629.field1668);
	}

	@ObfuscatedName("rd.u(IS)Lry;")
	public class483 method8503(int arg0) {
		WeightedCache var2 = this.field5107;
		class483 var3;
		synchronized (this.field5107) {
			var3 = (class483) this.field5107.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field5106;
		byte[] var6;
		synchronized (this.field5106) {
			var6 = this.field5106.getFile(class161.field1629.field1668, arg0);
		}
		class483 var8 = new class483();
		var8.field5088 = this;
		var8.field5089 = arg0;
		if (var6 != null) {
			var8.method8494(new Packet(var6));
		}
		var8.method8489();
		WeightedCache var9 = this.field5107;
		synchronized (this.field5107) {
			this.field5107.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("rd.j(I)V")
	public void method8500() {
		WeightedCache var1 = this.field5107;
		synchronized (this.field5107) {
			this.field5107.method7922();
		}
	}

	@ObfuscatedName("rd.a(IB)V")
	public void method8501(int arg0) {
		WeightedCache var2 = this.field5107;
		synchronized (this.field5107) {
			this.field5107.method7921(arg0);
		}
	}

	@ObfuscatedName("rd.s(I)V")
	public void method8502() {
		WeightedCache var1 = this.field5107;
		synchronized (this.field5107) {
			this.field5107.method7925();
		}
	}
}
