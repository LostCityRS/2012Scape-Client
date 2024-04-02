package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afn")
public class class853 extends class537 {

	public class853(class815 arg0) {
		super(arg0);
	}

	public class853(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afn.z(B)V")
	public void method15796() {
		if (this.field6461 * -402581687 < 0 || this.field6461 * -402581687 > 2) {
			this.field6461 = this.method11386() * 2118879993;
		}
	}

	@ObfuscatedName("afn.u(I)I")
	public int method11386() {
		return this.field6462.field9661.method15776() && class14.method14198(this.field6462.field9661.method15781()) ? 1 : 0;
	}

	@ObfuscatedName("afn.n(B)Z")
	public boolean method15795() {
		return true;
	}

	@ObfuscatedName("afn.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("afn.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0 * 2118879993;
	}

	@ObfuscatedName("afn.o(I)I")
	public int method15794() {
		return this.field6461 * -402581687;
	}
}
