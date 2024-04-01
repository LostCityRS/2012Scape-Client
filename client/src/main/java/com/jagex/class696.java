package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zy")
public class class696 extends class150 {

	@ObfuscatedName("zy.j")
	public final String field8471;

	@ObfuscatedName("zy.a")
	public final int field8470;

	public class696(Packet arg0) {
		super(arg0);
		this.field8471 = arg0.gjstr();
		this.field8470 = arg0.g2();
	}

	@ObfuscatedName("zy.j(I)V")
	public void method2873() {
		if (client.field9059 != -1) {
			Statics.method3211(client.field9059, this.field8471, this.field8470);
		}
	}
}
