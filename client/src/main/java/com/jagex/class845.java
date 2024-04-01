package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afy")
public class class845 extends class537 {

	public class845(class815 arg0) {
		super(arg0);
	}

	public class845(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afy.z(B)V")
	public void method15723() {
		if (this.field6462.method15452() != class527.field6407) {
			this.field6461 = 1;
		}
		if (this.field6461 != 0 && this.field6461 != 1) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afy.u(I)I")
	public int method11386() {
		return 1;
	}

	@ObfuscatedName("afy.n(B)Z")
	public boolean method15724() {
		return this.field6462.method15452() == class527.field6407;
	}

	@ObfuscatedName("afy.j(IB)I")
	public int method11387(int arg0) {
		return this.field6462.method15452() == class527.field6407 ? 1 : 3;
	}

	@ObfuscatedName("afy.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afy.o(I)I")
	public int method15725() {
		return this.field6461;
	}
}
