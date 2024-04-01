package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vk")
public class class600 {

	@ObfuscatedName("vk.u")
	public final class334 field7169;

	@ObfuscatedName("vk.j")
	public final class334 field7167;

	@ObfuscatedName("vk.a")
	public final WeightedCache field7166 = new WeightedCache(64);

	@ObfuscatedName("vk.s")
	public final WeightedCache field7168 = new WeightedCache(2);

	public class600(class527 arg0, class519 arg1, class334 arg2, class334 arg3) {
		this.field7169 = arg2;
		this.field7167 = arg3;
		this.field7169.method5637(class161.field1658.field1668);
	}

	@ObfuscatedName("vk.u(II)Lvv;")
	public class599 method12378(int arg0) {
		WeightedCache var2 = this.field7166;
		class599 var3;
		synchronized (this.field7166) {
			var3 = (class599) this.field7166.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field7169;
		byte[] var6;
		synchronized (this.field7169) {
			var6 = this.field7169.getFile(class161.field1658.field1668, arg0);
		}
		class599 var8 = new class599();
		var8.field7162 = this;
		if (var6 != null) {
			var8.method12367(new Packet(var6));
		}
		WeightedCache var9 = this.field7166;
		synchronized (this.field7166) {
			this.field7166.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("vk.j(I)V")
	public void method12372() {
		WeightedCache var1 = this.field7166;
		synchronized (this.field7166) {
			this.field7166.method7922();
		}
		WeightedCache var3 = this.field7168;
		synchronized (this.field7168) {
			this.field7168.method7922();
		}
	}

	@ObfuscatedName("vk.a(II)V")
	public void method12373(int arg0) {
		WeightedCache var2 = this.field7166;
		synchronized (this.field7166) {
			this.field7166.method7921(arg0);
		}
		WeightedCache var4 = this.field7168;
		synchronized (this.field7168) {
			this.field7168.method7921(arg0);
		}
	}

	@ObfuscatedName("vk.s(I)V")
	public void method12374() {
		WeightedCache var1 = this.field7166;
		synchronized (this.field7166) {
			this.field7166.method7925();
		}
		WeightedCache var3 = this.field7168;
		synchronized (this.field7168) {
			this.field7168.method7925();
		}
	}
}
