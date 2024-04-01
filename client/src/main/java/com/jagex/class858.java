package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afj")
public class class858 extends class537 {

	public class858(class815 arg0) {
		super(arg0);
	}

	public class858(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afj.z(I)V")
	public void method15841() {
		if (this.field6462.method15452() != class527.field6407) {
			this.field6461 = 1;
		}
		if (this.field6461 != 0 && this.field6461 != 1) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afj.u(I)I")
	public int method11386() {
		return 1;
	}

	@ObfuscatedName("afj.n(I)Z")
	public boolean method15842() {
		return this.field6462.method15452() == class527.field6407;
	}

	@ObfuscatedName("afj.j(IB)I")
	public int method11387(int arg0) {
		if (this.field6462.method15452() != class527.field6407) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.field6462.field9646.method15696() == 1) {
				return 2;
			}
			if (this.field6462.field9659.method15686() == 1) {
				return 2;
			}
			if (this.field6462.field9666.method15755() > 0) {
				return 2;
			}
		}
		return 1;
	}

	@ObfuscatedName("afj.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afj.o(I)I")
	public int method15843() {
		return this.field6461;
	}
}
