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

	public class900(class814 arg0) {
		super(arg0);
		int var2 = arg0.method15379();
		this.field10035 = (var2 >>> 16) * -1498824859;
		this.field10034 = (var2 & 0xFFFF) * 1266329343;
		this.field10033 = arg0.method15220() * 240670477;
	}

	@ObfuscatedName("ahj.j(I)V")
	public void method2873() {
		int var1 = this.field10035 * 1622465024 + 256;
		int var2 = this.field10034 * 682753536 + 256;
		int var3 = this.field10033 * 902320069;
		if (var3 < 3 && client.field8980.method6100().method5794(this.field10035 * -1146070419, this.field10034 * -460039937)) {
			var3++;
		}
		class1010 var4 = new class1010(client.field8980.method6098(), this.field8498 * -1802432815, 0, this.field10033 * 902320069, var3, var1, client.method8663(var1, var2, this.field10033 * 902320069) - this.field8497 * 542812541, var2, this.field10035 * -1146070419, this.field10035 * -1146070419, this.field10034 * -460039937, this.field10034 * -460039937, this.field8496 * -2000007953, false, 0);
		client.field9090.method11927(new class942(var4), (long) (this.field10035 * -1146070419 << 16 | this.field10034 * -460039937));
	}
}
