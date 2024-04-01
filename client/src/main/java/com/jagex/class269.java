package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("iz")
public class class269 implements class264 {

	@ObfuscatedName("iz.u")
	public final int field2648;

	@ObfuscatedName("iz.j")
	public final class265 field2651;

	@ObfuscatedName("iz.a")
	public final class263 field2649;

	@ObfuscatedName("iz.s")
	public final int field2650;

	@ObfuscatedName("iz.c")
	public final int field2647;

	public class269(int arg0, class265 arg1, class263 arg2, int arg3, int arg4) {
		this.field2648 = arg0;
		this.field2651 = arg1;
		this.field2649 = arg2;
		this.field2650 = arg3;
		this.field2647 = arg4;
	}

	@ObfuscatedName("oe.u(Laet;I)Liz;")
	public static class269 method7324(Packet arg0) {
		int var1 = arg0.method15411();
		class265 var2 = class265.method15177()[arg0.g1()];
		class263 var3 = class263.method3623()[arg0.g1()];
		int var4 = arg0.method15240();
		int var5 = arg0.method15240();
		return new class269(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("iz.j(I)Lio;")
	public class266 method4543() {
		return class266.field2624;
	}
}
