package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zi")
public class class694 extends class150 {

	@ObfuscatedName("zi.j")
	public final int field8462;

	@ObfuscatedName("zi.a")
	public final int field8461;

	@ObfuscatedName("zi.s")
	public final int field8460;

	@ObfuscatedName("zi.c")
	public final int field8463;

	@ObfuscatedName("zi.m")
	public final int field8464;

	public class694(class814 arg0) {
		super(arg0);
		this.field8462 = arg0.method15239() * -1434778741;
		int var2 = arg0.method15379();
		this.field8461 = (var2 >>> 16) * 161302019;
		this.field8460 = (var2 & 0xFFFF) * 1907394153;
		this.field8463 = arg0.method15220() * -394970869;
		this.field8464 = arg0.method15254() * 1655573269;
	}

	@ObfuscatedName("zi.j(I)V")
	public void method2873() {
		Statics.field1537[this.field8462 * -1752429533].method2851(this.field8461 * 1199445163, this.field8460 * 1656056281, this.field8463 * 2001652387, this.field8464 * 890301501);
	}
}
