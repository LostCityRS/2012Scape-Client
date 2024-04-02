package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aff")
public class class862 extends class537 {

	public class862(class815 arg0) {
		super(arg0);
	}

	public class862(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("aff.z(B)V")
	public void method15873() {
		if (this.field6461 * -402581687 < 0 && this.field6461 * -402581687 > 4) {
			this.field6461 = this.method11386() * 2118879993;
		}
	}

	@ObfuscatedName("aff.u(I)I")
	public int method11386() {
		return this.field6462.method15462().method11398() > 1 ? 4 : 2;
	}

	@ObfuscatedName("aff.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("aff.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0 * 2118879993;
	}

	@ObfuscatedName("aff.n(I)I")
	public int method15874() {
		return this.field6461 * -402581687;
	}
}
