package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ahj")
public class class900 extends class703 {

	@ObfuscatedName("ahj.c")
	public final int field10035;

	@ObfuscatedName("ahj.m")
	public final int field10034;

	@ObfuscatedName("ahj.t")
	public final int field10033;

	public class900(Packet arg0) {
		super(arg0);
		int var2 = arg0.g4s();
		this.field10035 = var2 >>> 16;
		this.field10034 = var2 & 0xFFFF;
		this.field10033 = arg0.g1();
	}

	@ObfuscatedName("ahj.j(I)V")
	public void method2873() {
		int var1 = this.field10035 * 512 + 256;
		int var2 = this.field10034 * 512 + 256;
		int var3 = this.field10033;
		if (var3 < 3 && client.world.getSceneLevelTileFlags().method5794(this.field10035, this.field10034)) {
			var3++;
		}
		class1010 var4 = new class1010(client.world.getScene(), this.field8498, 0, this.field10033, var3, var1, client.method8663(var1, var2, this.field10033) - this.field8497, var2, this.field10035, this.field10035, this.field10034, this.field10034, this.field8496, false, 0);
		client.field9090.pushNode(new class942(var4), (long) (this.field10035 << 16 | this.field10034));
	}
}
