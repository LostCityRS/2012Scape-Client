package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public class class442 {

	@ObfuscatedName("pb.u")
	public final class334 field4760;

	@ObfuscatedName("pb.j")
	public final class334 field4757;

	@ObfuscatedName("pb.a")
	public WeightedCache field4759 = new WeightedCache(20);

	@ObfuscatedName("pb.s")
	public final WeightedCache field4758 = new WeightedCache(64);

	public class442(class527 arg0, class519 arg1, class334 arg2, class334 arg3) {
		this.field4757 = arg3;
		this.field4760 = arg2;
		this.field4760.method5637(class161.field1648.field1668);
	}

	@ObfuscatedName("pb.u(II)Lpo;")
	public class441 method7826(int arg0) {
		WeightedCache var2 = this.field4758;
		class441 var3;
		synchronized (this.field4758) {
			var3 = (class441) this.field4758.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field4760;
		byte[] var6;
		synchronized (this.field4760) {
			var6 = this.field4760.getFile(class161.field1648.field1668, arg0);
		}
		class441 var8 = new class441();
		var8.field4754 = this;
		if (var6 != null) {
			var8.method7791(new Packet(var6));
		}
		WeightedCache var9 = this.field4758;
		synchronized (this.field4758) {
			this.field4758.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("pb.j(I)V")
	public void method7817() {
		WeightedCache var1 = this.field4758;
		synchronized (this.field4758) {
			this.field4758.method7922();
		}
		WeightedCache var3 = this.field4759;
		synchronized (this.field4759) {
			this.field4759.method7922();
		}
	}

	@ObfuscatedName("pb.a(II)V")
	public void method7818(int arg0) {
		WeightedCache var2 = this.field4758;
		synchronized (this.field4758) {
			this.field4758.method7921(arg0);
		}
		WeightedCache var4 = this.field4759;
		synchronized (this.field4759) {
			this.field4759.method7921(arg0);
		}
	}

	@ObfuscatedName("pb.s(I)V")
	public void method7819() {
		WeightedCache var1 = this.field4758;
		synchronized (this.field4758) {
			this.field4758.method7925();
		}
		WeightedCache var3 = this.field4759;
		synchronized (this.field4759) {
			this.field4759.method7925();
		}
	}
}
