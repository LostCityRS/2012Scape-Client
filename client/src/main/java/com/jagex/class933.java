package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ail")
public class class933 extends class789 {

	// $FF: synthetic field
	public final class220 this$0;

	@ObfuscatedName("ail.s")
	public int field10217;

	public class933(class220 arg0) {
		this.this$0 = arg0;
		this.field10217 = -1;
	}

	@ObfuscatedName("ail.u(Laet;B)V")
	public void method14985(Packet arg0) {
		this.field10217 = arg0.g2();
		arg0.g1();
		if (arg0.g1() != 255) {
			arg0.pos--;
			arg0.g8();
		}
	}

	@ObfuscatedName("ail.j(Ladh;B)V")
	public void method14986(class788 arg0) {
		arg0.method14964(this.field10217);
	}
}
