package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zt")
public class class695 extends class150 {

	@ObfuscatedName("zt.j")
	public final int field8467;

	@ObfuscatedName("zt.a")
	public final int field8468;

	public class695(class814 arg0) {
		super(arg0);
		this.field8467 = arg0.method15239() * -2010359683;
		this.field8468 = arg0.method15411() * 1879803547;
	}

	@ObfuscatedName("zt.j(I)V")
	public void method2873() {
		class147 var1 = Statics.field1528[this.field8467 * 2029117653];
		client.method3302(var1.field1553 * 908097707, var1.field1554 * 421851883, var1.field1555 * -1825506097, var1.field1551.field6582 * 1958533131, var1.field1551.field6590 * -1082126853, var1.field1556 * -1568742419, this.field8468 * 1410723731);
	}

	@ObfuscatedName("zt.s(B)Z")
	public boolean method2883() {
		class509 var1 = Statics.field566.method11144(this.field8468 * 1410723731);
		return var1.method11129();
	}
}
