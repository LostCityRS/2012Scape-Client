package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ain")
public class class930 extends class787 {

	// $FF: synthetic field
	public final class219 this$0;

	@ObfuscatedName("ain.s")
	public int field10207;

	public class930(class219 arg0) {
		this.this$0 = arg0;
		this.field10207 = -1;
	}

	@ObfuscatedName("ain.u(Laet;I)V")
	public void method14956(Packet arg0) {
		this.field10207 = arg0.g2();
	}

	@ObfuscatedName("ain.j(Lga;B)V")
	public void method14955(class218 arg0) {
		arg0.method4063(this.field10207);
	}
}
