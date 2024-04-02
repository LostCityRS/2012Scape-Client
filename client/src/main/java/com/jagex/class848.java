package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afz")
public class class848 extends class537 {

	public class848(class815 arg0) {
		super(arg0);
	}

	public class848(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afz.z(I)V")
	public void method15748() {
		if (this.field6462.field9659.method15686() == 0) {
			this.field6461 = 0;
		}
		if (this.field6461 < 0 || this.field6461 > 2) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afz.u(I)I")
	public int method11386() {
		return 2;
	}

	@ObfuscatedName("afz.n(I)Z")
	public boolean method15750() {
		return this.field6462.field9659.method15686() != 0;
	}

	@ObfuscatedName("afz.j(IB)I")
	public int method11387(int arg0) {
		return this.field6462.field9659.method15686() == 0 ? 3 : 1;
	}

	@ObfuscatedName("afz.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afz.o(I)I")
	public int method15747() {
		return this.field6461;
	}
}
