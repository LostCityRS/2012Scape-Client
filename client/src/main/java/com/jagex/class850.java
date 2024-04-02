package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afo")
public class class850 extends class537 {

	public class850(class815 arg0) {
		super(arg0);
	}

	public class850(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afo.z(B)V")
	public void method15764() {
		if (this.field6461 * -402581687 < 1 || this.field6461 * -402581687 > 3) {
			this.field6461 = this.method11386() * 2118879993;
		}
	}

	@ObfuscatedName("afo.u(I)I")
	public int method11386() {
		return this.field6462.method15462().method11400() ? 3 : 2;
	}

	@ObfuscatedName("afo.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("afo.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0 * 2118879993;
	}

	@ObfuscatedName("afo.n(I)I")
	public int method15766() {
		return this.field6461 * -402581687;
	}
}
