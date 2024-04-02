package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ju")
public class class293 implements class464 {

	@ObfuscatedName("ju.u")
	public int field3310 = 0;

	@ObfuscatedName("ju.j")
	public char field3309;

	@ObfuscatedName("ju.u(Laet;I)V")
	public void method4870(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method4867(arg0, var2);
		}
	}

	@ObfuscatedName("ju.j(Laet;II)V")
	public void method4867(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field3309 = class524.method16898(arg0.g1b());
		} else if (arg1 == 5) {
			this.field3310 = arg0.g2();
		}
	}
}
