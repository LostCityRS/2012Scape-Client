package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afv")
public class class859 extends class537 {

	public class859(class815 arg0) {
		super(arg0);
	}

	public class859(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afv.z(I)V")
	public void method15851() {
		if (this.field6461 < class185.field2148.field2145 || this.field6461 > class185.field2147.field2145) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afv.u(I)I")
	public int method11386() {
		return class185.field2148.field2145;
	}

	@ObfuscatedName("afv.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("afv.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afv.n(I)I")
	public int method15853() {
		return this.field6461;
	}
}
