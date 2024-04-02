package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("rj")
public class class489 {

	@ObfuscatedName("rj.u")
	public class445 field5132;

	public class489(class334 arg0) {
		byte[] var2 = arg0.method5635(class491.field5139.field5145);
		this.method8594(new class814(var2));
	}

	@ObfuscatedName("rj.u(Laet;I)V")
	public void method8594(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field5132 = class447.method15895(arg0);
			}
		}
	}
}
