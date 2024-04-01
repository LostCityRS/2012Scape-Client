package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afr")
public class class856 extends class537 {

	public class856(class815 arg0) {
		super(arg0);
	}

	public class856(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afr.z(I)V")
	public void method15826() {
		if (this.field6462.field9661.method15776() && !class14.method3321(this.field6462.field9661.method15781())) {
			this.field6461 = 0;
		}
		if (this.field6461 < 0 || this.field6461 > 2) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afr.u(I)I")
	public int method11386() {
		return 0;
	}

	@ObfuscatedName("afr.n(B)Z")
	public boolean method15828() {
		return class14.method3321(this.field6462.field9661.method15781());
	}

	@ObfuscatedName("afr.j(IB)I")
	public int method11387(int arg0) {
		return class14.method3321(this.field6462.field9661.method15781()) ? 1 : 3;
	}

	@ObfuscatedName("afr.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afr.o(S)I")
	public int method15829() {
		return this.field6461;
	}
}
