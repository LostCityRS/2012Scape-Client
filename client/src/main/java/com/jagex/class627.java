package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("we")
public class class627 {

	@ObfuscatedName("we.u")
	public char field7350;

	@ObfuscatedName("we.j")
	public int field7352;

	@ObfuscatedName("we.a")
	public int field7351;

	@ObfuscatedName("we.s")
	public int field7349;

	@ObfuscatedName("we.u(Laet;I)V")
	public void method12682(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method12683(arg0, var2);
		}
	}

	@ObfuscatedName("we.j(Laet;II)V")
	public void method12683(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field7350 = class524.method16898(arg0.g1b());
		} else if (arg1 == 3) {
			this.field7352 = arg0.g2();
			this.field7351 = arg0.g1();
			this.field7349 = arg0.g1();
		}
	}
}
