package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wd")
public class class609 {

	@ObfuscatedName("wd.u")
	public final class334 field7200;

	@ObfuscatedName("wd.j")
	public final class334 field7199;

	@ObfuscatedName("wd.c")
	public WeightedCache field7201 = new WeightedCache(64);

	@ObfuscatedName("wd.m")
	public WeightedCache field7202 = new WeightedCache(64);

	public class609(class527 arg0, class519 arg1, class334 arg2, class334 arg3) {
		this.field7200 = arg2;
		this.field7199 = arg3;
		this.field7200.method5637(class161.field1630.field1668);
		Math.random();
		Math.random();
		Math.random();
		Math.random();
	}

	@ObfuscatedName("wd.u(II)Lvc;")
	public class608 method12491(int arg0) {
		WeightedCache var2 = this.field7201;
		class608 var3;
		synchronized (this.field7201) {
			var3 = (class608) this.field7201.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field7200;
		byte[] var6;
		synchronized (this.field7200) {
			var6 = this.field7200.getFile(class161.field1630.field1668, arg0);
		}
		class608 var8 = new class608();
		var8.field7193 = this;
		if (var6 != null) {
			var8.method12486(new Packet(var6));
		}
		WeightedCache var9 = this.field7201;
		synchronized (this.field7201) {
			this.field7201.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("wd.j(IIB)V")
	public void method12502(int arg0, int arg1) {
		this.field7201 = new WeightedCache(arg0);
		this.field7202 = new WeightedCache(arg1);
	}

	@ObfuscatedName("wd.a(I)V")
	public void method12496() {
		WeightedCache var1 = this.field7201;
		synchronized (this.field7201) {
			this.field7201.method7922();
		}
		WeightedCache var3 = this.field7202;
		synchronized (this.field7202) {
			this.field7202.method7922();
		}
	}

	@ObfuscatedName("wd.s(IB)V")
	public void method12495(int arg0) {
		WeightedCache var2 = this.field7201;
		synchronized (this.field7201) {
			this.field7201.method7921(arg0);
		}
		WeightedCache var4 = this.field7202;
		synchronized (this.field7202) {
			this.field7202.method7921(arg0);
		}
	}

	@ObfuscatedName("wd.c(I)V")
	public void method12494() {
		WeightedCache var1 = this.field7201;
		synchronized (this.field7201) {
			this.field7201.method7925();
		}
		WeightedCache var3 = this.field7202;
		synchronized (this.field7202) {
			this.field7202.method7925();
		}
	}
}
