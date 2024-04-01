package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aab")
public class class712 extends class150 {

	@ObfuscatedName("aab.j")
	public final int field8534;

	@ObfuscatedName("aab.a")
	public final int field8532;

	@ObfuscatedName("aab.s")
	public final int field8536;

	@ObfuscatedName("aab.c")
	public final int field8535;

	@ObfuscatedName("aab.m")
	public class393 field8533;

	public class712(Packet arg0) {
		super(arg0);
		this.field8534 = arg0.g2();
		this.field8532 = arg0.g1();
		this.field8536 = arg0.g1();
		this.field8535 = arg0.g1();
	}

	@ObfuscatedName("aab.j(I)V")
	public void method2873() {
		this.field8533 = class395.method14082(this.field8534, this.field8535, 0, this.field8532, this.field8536);
	}

	@ObfuscatedName("aab.a(B)V")
	public void method2874() {
		if (this.field8533 != null) {
			Statics.method15704(this.field8533);
			this.field8533 = null;
		}
	}
}
