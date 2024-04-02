package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qh")
public class class474 {

	@ObfuscatedName("qh.u")
	public char field5036;

	@ObfuscatedName("qh.j")
	public int field5033;

	@ObfuscatedName("qh.a")
	public int field5035;

	@ObfuscatedName("qh.s")
	public int field5034;

	@ObfuscatedName("qh.u(Laet;B)V")
	public void method8279(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method8275(arg0, var2);
		}
	}

	@ObfuscatedName("qh.j(Laet;II)V")
	public void method8275(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field5036 = class524.method16898(arg0.g1b());
		} else if (arg1 == 2) {
			this.field5033 = arg0.g2();
			this.field5035 = arg0.g1();
			this.field5034 = arg0.g1();
		}
	}
}
