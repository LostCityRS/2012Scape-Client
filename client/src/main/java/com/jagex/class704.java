package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zk")
public class class704 extends class150 {

	@ObfuscatedName("zk.j")
	public final int field8503;

	@ObfuscatedName("zk.a")
	public final int field8501;

	@ObfuscatedName("zk.s")
	public final int field8502;

	@ObfuscatedName("zk.c")
	public final int field8500;

	@ObfuscatedName("zk.m")
	public final int field8504;

	public class704(class814 arg0) {
		super(arg0);
		this.field8503 = arg0.method15239() * -1703831513;
		int var2 = arg0.method15379();
		this.field8501 = (var2 >>> 16) * -1080235191;
		this.field8502 = (var2 & 0xFFFF) * 1676097683;
		this.field8500 = arg0.method15220() * -2130017433;
		this.field8504 = arg0.method15220() * 2069298555;
	}

	@ObfuscatedName("zk.j(I)V")
	public void method2873() {
		Statics.field1528[this.field8503 * 631658391].method2835(this.field8500 * -1880561577, this.field8501 * -1525680391, this.field8502 * -1097947749, this.field8504 * -636003917);
	}
}
