package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zn")
public class class692 extends class150 {

	@ObfuscatedName("zn.j")
	public final int field8457;

	@ObfuscatedName("zn.a")
	public final int field8456;

	public class692(Packet arg0) {
		super(arg0);
		this.field8457 = arg0.g2();
		this.field8456 = arg0.g2();
	}

	@ObfuscatedName("zn.j(I)V")
	public void method2873() {
		Statics.field1537[this.field8457].method2854().method13946(this.field8456, true);
	}
}
