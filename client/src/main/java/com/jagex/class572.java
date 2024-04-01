package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("uh")
public class class572 {

	@ObfuscatedName("uh.u")
	public char field6760;

	@ObfuscatedName("uh.u(Laet;I)V")
	public void method12016(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method12021(arg0, var2);
		}
	}

	@ObfuscatedName("uh.j(Laet;II)V")
	public void method12021(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field6760 = class524.method16898(arg0.method15238());
		}
	}
}
