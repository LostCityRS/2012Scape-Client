package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afe")
public class class864 extends class537 {

	public class864(class815 arg0) {
		super(arg0);
	}

	public class864(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afe.z(B)V")
	public void method15883() {
		int var1 = this.field6462.field9670.method15781();
		if (var1 != 3 && var1 != 5) {
			this.field6461 = 0;
		}
		if (this.field6462.method15462().method11398() < 2) {
			this.field6461 = 0;
		}
		if (this.field6461 * -402581687 != 0 && this.field6461 * -402581687 != 1) {
			this.field6461 = this.method11386() * 2118879993;
		}
	}

	@ObfuscatedName("afe.u(I)I")
	public int method11386() {
		int var1 = this.field6462.field9670.method15781();
		return var1 == 3 || var1 == 5 ? 0 : 0;
	}

	@ObfuscatedName("afe.j(IB)I")
	public int method11387(int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.field6462.method15462().method11398() < 2) {
			return 3;
		} else {
			int var2 = this.field6462.field9670.method15781();
			return var2 == 3 || var2 == 5 ? 1 : 3;
		}
	}

	@ObfuscatedName("afe.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0 * 2118879993;
	}

	@ObfuscatedName("afe.n(I)I")
	public int method15884() {
		return this.field6461 * -402581687;
	}
}
