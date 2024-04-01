package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zm")
public class class699 extends class150 {

	@ObfuscatedName("zm.j")
	public final long field8483;

	@ObfuscatedName("zm.a")
	public final int field8482;

	public class699(Packet arg0, boolean arg1) {
		super(arg0);
		int var3 = arg0.g2();
		if (arg1) {
			this.field8483 = (long) var3 | 0x100000000L;
		} else {
			this.field8483 = var3;
		}
		this.field8482 = arg0.g4s();
	}

	@ObfuscatedName("zm.j(I)V")
	public void method2873() {
		IntNode var1 = (IntNode) class144.field1529.method11923(this.field8483);
		if (var1 == null) {
			class144.field1529.pushNode(new IntNode(this.field8482), this.field8483);
		} else {
			var1.field9556 = this.field8482;
		}
	}
}
