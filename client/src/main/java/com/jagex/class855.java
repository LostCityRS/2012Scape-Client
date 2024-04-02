package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afl")
public class class855 extends class537 {

	public class855(class815 arg0) {
		super(arg0);
	}

	public class855(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afl.z(I)V")
	public void method15818() {
		if (this.field6462.field9661.method15776() && !class14.method3321(this.field6462.field9661.method15781())) {
			this.field6461 = 0;
		}
		if (this.field6461 < 0 || this.field6461 > 1) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afl.u(I)I")
	public int method11386() {
		return 0;
	}

	@ObfuscatedName("afl.n(I)Z")
	public boolean method15815() {
		return class14.method3321(this.field6462.field9661.method15781());
	}

	@ObfuscatedName("afl.j(IB)I")
	public int method11387(int arg0) {
		return class14.method3321(this.field6462.field9661.method15781()) ? 1 : 3;
	}

	@ObfuscatedName("afl.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afl.o(I)I")
	public int method15816() {
		return this.field6461;
	}
}
