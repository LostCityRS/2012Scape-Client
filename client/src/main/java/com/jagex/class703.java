package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zp")
public abstract class class703 extends class150 {

	@ObfuscatedName("zp.j")
	public final int field8498;

	@ObfuscatedName("zp.a")
	public final int field8496;

	@ObfuscatedName("zp.s")
	public final int field8497;

	public class703(class814 arg0) {
		super(arg0);
		this.field8498 = arg0.method15239() * -2060973519;
		this.field8496 = arg0.method15239() * 1148084751;
		this.field8497 = arg0.method15220() * -1100097579;
	}

	@ObfuscatedName("zp.s(B)Z")
	public boolean method2883() {
		class507 var1 = Statics.field4213.method11082(this.field8498 * -1802432815);
		boolean var2 = var1.method11104();
		class509 var3 = Statics.field566.method11144(var1.field5252 * 627575481);
		return var2 & var3.method11129();
	}
}
