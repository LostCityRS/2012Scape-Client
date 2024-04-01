package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("gz")
public class class206 implements class214 {

	@ObfuscatedName("gz.u")
	public final class269 field2303;

	@ObfuscatedName("gz.j")
	public final class334 field2302;

	@ObfuscatedName("gz.a")
	public class118 field2301;

	public class206(class334 arg0, class269 arg1) {
		this.field2302 = arg0;
		this.field2303 = arg1;
	}

	@ObfuscatedName("gz.u(B)V")
	public void method3936() {
		this.field2301 = class308.method1624(this.field2302, this.field2303.field2648);
	}

	@ObfuscatedName("gz.j(ZI)V")
	public void method3932(boolean arg0) {
		if (arg0) {
			int var2 = this.field2303.field2651.method4586(this.field2301.method1042(), client.field9067) + this.field2303.field2650;
			int var3 = this.field2303.field2649.method4574(this.field2301.method1047(), client.field9068) + this.field2303.field2647;
			this.field2301.method2500(var2, var3);
		}
	}

	@ObfuscatedName("gz.a(I)Z")
	public boolean method3931() {
		return this.field2302.method5630(this.field2303.field2648);
	}
}
