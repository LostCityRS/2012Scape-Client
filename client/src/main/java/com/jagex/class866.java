package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agi")
public class class866 extends class537 {

	public class866(class815 arg0) {
		super(arg0);
	}

	public class866(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("agi.z(I)V")
	public void method15897() {
		if (this.field6461 < 0 && this.field6461 > 127) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("agi.u(I)I")
	public int method11386() {
		return 127;
	}

	@ObfuscatedName("agi.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("agi.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("agi.n(I)I")
	public int method15899() {
		return this.field6461;
	}
}
