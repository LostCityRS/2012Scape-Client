package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zg")
public class class709 extends class150 {

	@ObfuscatedName("zg.j")
	public final int field8520;

	@ObfuscatedName("zg.a")
	public final int field8521;

	@ObfuscatedName("zg.s")
	public final int field8522;

	@ObfuscatedName("zg.c")
	public final int field8523;

	@ObfuscatedName("zg.m")
	public class393 field8524;

	public class709(Packet arg0) {
		super(arg0);
		this.field8520 = arg0.g2();
		this.field8521 = arg0.g1();
		this.field8522 = arg0.g1();
		this.field8523 = arg0.g1();
	}

	@ObfuscatedName("zg.j(I)V")
	public void method2873() {
		this.field8524 = class395.method1717(this.field8520, this.field8523, 0, this.field8521, false, this.field8522);
	}

	@ObfuscatedName("zg.a(B)V")
	public void method2874() {
		if (this.field8524 != null) {
			Statics.method15704(this.field8524);
			this.field8524 = null;
		}
	}
}
