package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zo")
public class class705 extends class150 {

	@ObfuscatedName("zo.j")
	public final int field8506;

	@ObfuscatedName("zo.a")
	public final int field8507;

	@ObfuscatedName("zo.s")
	public final String field8505;

	@ObfuscatedName("zo.c")
	public final int field8508;

	@ObfuscatedName("zo.m")
	public final int field8509;

	public class705(Packet arg0) {
		super(arg0);
		this.field8506 = arg0.g2();
		this.field8507 = arg0.g2();
		this.field8505 = arg0.gjstr();
		this.field8508 = arg0.g4s();
		this.field8509 = arg0.g2();
	}

	@ObfuscatedName("zo.j(I)V")
	public void method2873() {
		client.method6854(Statics.field7324, this.field8506, this.field8507, client.method8663(this.field8506, this.field8507, Statics.field7324), this.field8509, this.field8508, this.field8505);
	}
}
