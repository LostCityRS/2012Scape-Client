package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vy")
public class class607 {

	@ObfuscatedName("vy.u")
	public int field7188 = 0;

	@ObfuscatedName("vy.j")
	public int field7190 = 0;

	@ObfuscatedName("vy.a")
	public int field7189 = 2048;

	@ObfuscatedName("vy.s")
	public int field7191 = 2048;

	@ObfuscatedName("vy.u(Laet;I)V")
	public void method12467(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method12468(arg0, var2);
		}
	}

	@ObfuscatedName("vy.j(Laet;IB)V")
	public void method12468(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field7188 = arg0.g1();
		} else if (arg1 == 2) {
			this.field7191 = arg0.g2();
		} else if (arg1 == 3) {
			this.field7189 = arg0.g2();
		} else if (arg1 == 4) {
			this.field7190 = arg0.method15240();
		}
	}
}
