package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zx")
public class class706 extends class150 {

	@ObfuscatedName("zx.j")
	public final int field8510;

	@ObfuscatedName("zx.a")
	public final int field8511;

	@ObfuscatedName("zx.s")
	public class157 field8512;

	public class706(Packet arg0) {
		super(arg0);
		this.field8510 = arg0.g2();
		this.field8511 = arg0.g1();
	}

	@ObfuscatedName("zx.j(I)V")
	public void method2873() {
		class395.method4800(this.field8512, this.field8511);
	}

	@ObfuscatedName("zx.s(B)Z")
	public boolean method2883() {
		if (this.field8512 == null) {
			this.field8512 = new class157(Statics.field9367, this.field8510);
		}
		return this.field8512.method2999();
	}
}
