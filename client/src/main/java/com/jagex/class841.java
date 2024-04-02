package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afg")
public class class841 extends class537 {

	public class841(class815 arg0) {
		super(arg0);
	}

	public class841(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afg.z(I)V")
	public void method15685() {
		if (this.field6462.method15452() != class527.field6407) {
			this.field6461 = 2118879993;
		}
		if (this.field6461 * -402581687 != 0 && this.field6461 * -402581687 != 1) {
			this.field6461 = this.method11386() * 2118879993;
		}
	}

	@ObfuscatedName("afg.u(I)I")
	public int method11386() {
		return 1;
	}

	@ObfuscatedName("afg.n(B)Z")
	public boolean method15687() {
		return this.field6462.method15452() == class527.field6407;
	}

	@ObfuscatedName("afg.j(IB)I")
	public int method11387(int arg0) {
		if (this.field6462.method15452() == class527.field6407) {
			return arg0 == 0 || this.field6462.field9647.method15843() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@ObfuscatedName("afg.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0 * 2118879993;
	}

	@ObfuscatedName("afg.o(I)I")
	public int method15686() {
		return this.field6461 * -402581687;
	}
}
