package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zm")
public class class699 extends class150 {

	@ObfuscatedName("zm.j")
	public final long field8483;

	@ObfuscatedName("zm.a")
	public final int field8482;

	public class699(class814 arg0, boolean arg1) {
		super(arg0);
		int var3 = arg0.method15239();
		if (arg1) {
			this.field8483 = ((long) var3 | 0x100000000L) * 2439263311156532097L;
		} else {
			this.field8483 = (long) var3 * 2439263311156532097L;
		}
		this.field8482 = arg0.method15379() * -191196385;
	}

	@ObfuscatedName("zm.j(I)V")
	public void method2873() {
		class802 var1 = (class802) class144.field1529.method11923(this.field8483 * -5497262398962439039L);
		if (var1 == null) {
			class144.field1529.method11927(new class802(this.field8482 * 1392715999), this.field8483 * -5497262398962439039L);
		} else {
			var1.field9556 = this.field8482 * 1604167571;
		}
	}
}
