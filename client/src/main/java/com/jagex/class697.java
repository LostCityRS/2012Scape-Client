package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zs")
public class class697 extends class150 {

	@ObfuscatedName("zs.j")
	public final int field8474;

	@ObfuscatedName("zs.a")
	public final int field8473;

	@ObfuscatedName("zs.s")
	public final int field8472;

	@ObfuscatedName("zs.c")
	public final int field8475;

	@ObfuscatedName("zs.m")
	public final int field8476;

	public class697(class814 arg0) {
		super(arg0);
		this.field8474 = arg0.method15239() * -1818605995;
		int var2 = arg0.method15220();
		if ((var2 & 0x1) == 0) {
			this.field8473 = -1733652299;
			this.field8472 = 1131311575;
		} else {
			this.field8473 = arg0.method15239() * 1733652299;
			this.field8472 = arg0.method15239() * -1131311575;
		}
		if ((var2 & 0x2) == 0) {
			this.field8475 = -1984901521;
			this.field8476 = 830299201;
		} else {
			this.field8475 = arg0.method15239() * 1984901521;
			this.field8476 = arg0.method15239() * -830299201;
		}
		if ((var2 & 0x4) != 0) {
			int var3 = arg0.method15239();
			int var4 = arg0.method15239();
			int var5 = var3 * 255 / var4;
			if (var3 > 0 && var5 < 1) {
				boolean var6 = true;
			}
		}
	}

	@ObfuscatedName("zs.j(I)V")
	public void method2873() {
		class719 var1 = Statics.field1537[this.field8474 * -388462851].method2854();
		var1.method13953(this.field8473 * -1597365661, this.field8472 * 1820847641, this.field8475 * 2098835313, this.field8476 * 100879423, client.field9213 * 1194705519, 0);
	}
}
