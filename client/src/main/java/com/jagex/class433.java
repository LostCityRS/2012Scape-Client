package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pe")
public class class433 implements class464 {

	@ObfuscatedName("pe.u")
	public int field4669;

	@ObfuscatedName("pe.j")
	public int field4668;

	@ObfuscatedName("pe.a")
	public int field4670;

	@ObfuscatedName("pe.u(Laet;I)V")
	public void method7682(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method7680(arg0, var2);
		}
	}

	@ObfuscatedName("pe.j(Laet;II)V")
	public void method7680(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field4669 = arg0.method15239();
			this.field4668 = arg0.method15220();
			this.field4670 = arg0.method15220();
		}
	}
}
