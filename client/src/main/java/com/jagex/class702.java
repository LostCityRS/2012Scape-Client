package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import java.util.Arrays;

@ObfuscatedName("zh")
public class class702 extends class150 {

	@ObfuscatedName("zh.j")
	public final int field8493;

	@ObfuscatedName("zh.a")
	public final int field8492;

	@ObfuscatedName("zh.s")
	public final int field8494;

	@ObfuscatedName("zh.c")
	public final int[] field8495;

	public class702(class814 arg0) {
		super(arg0);
		this.field8493 = arg0.method15239() * -513343681;
		this.field8495 = new int[class365.method2553().length];
		this.field8492 = arg0.method15411() * 1205510085;
		Arrays.fill(this.field8495, 0, this.field8495.length, this.field8492 * -832469235);
		this.field8494 = arg0.method15379() * 1660559451;
	}

	@ObfuscatedName("zh.j(I)V")
	public void method2873() {
		class719 var1 = Statics.field1537[this.field8493 * -662409025].method2854();
		if (this.field8494 * -1367994413 == 0) {
			client.method8263(var1, this.field8495, 0, false);
		} else {
			client.method12477(var1, new int[] { this.field8492 * -832469235 }, new int[] { 0 }, new int[] { this.field8494 * -1367994413 });
		}
	}

	@ObfuscatedName("zh.s(B)Z")
	public boolean method2883() {
		class509 var1 = Statics.field566.method11144(this.field8492 * -832469235);
		return var1.method11129();
	}
}
