package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vr")
public class class597 {

	@ObfuscatedName("vr.a")
	public char field7153;

	@ObfuscatedName("vr.s")
	public int field7156 = 1;

	@ObfuscatedName("vr.u(Laet;I)V")
	public void method12349(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method12350(arg0, var2);
		}
	}

	@ObfuscatedName("vr.j(Laet;IS)V")
	public void method12350(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field7153 = class524.method16898(arg0.method15238());
		} else if (arg1 == 2) {
			this.field7156 = 0;
		}
	}
}
