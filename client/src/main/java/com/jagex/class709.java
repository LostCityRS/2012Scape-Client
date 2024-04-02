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

	public class709(class814 arg0) {
		super(arg0);
		this.field8520 = arg0.method15239() * 1639590927;
		this.field8521 = arg0.method15220() * -1422007291;
		this.field8522 = arg0.method15220() * -1316856357;
		this.field8523 = arg0.method15220() * -130290073;
	}

	@ObfuscatedName("zg.j(I)V")
	public void method2873() {
		this.field8524 = class395.method1717(this.field8520 * -1109703953, this.field8523 * -1651815081, 0, this.field8521 * -1035777843, false, this.field8522 * -1378068909);
	}

	@ObfuscatedName("zg.a(B)V")
	public void method2874() {
		if (this.field8524 != null) {
			Statics.method15704(this.field8524);
			this.field8524 = null;
		}
	}
}
