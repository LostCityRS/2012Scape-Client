package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afi")
public class class861 extends class537 {

	public class861(class815 arg0) {
		super(arg0);
	}

	public class861(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afi.z(S)V")
	public void method15867() {
		if (this.field6461 < 0 || this.field6461 > 4) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afi.u(I)I")
	public int method11386() {
		return 0;
	}

	@ObfuscatedName("afi.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("afi.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afi.n(I)I")
	public int method15868() {
		return this.field6461;
	}
}
