package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("acm")
public class class767 extends class398 {

	@ObfuscatedName("acm.a")
	public class416 field9268;

	@ObfuscatedName("acm.s")
	public class548 field9267 = new class548();

	public class767(class416 arg0) {
		this.field9268 = arg0;
	}

	@ObfuscatedName("acm.a(IIIII)V")
	public void method14733(int arg0, int arg1, int arg2, int arg3) {
		class768 var5 = null;
		int var6 = 0;
		for (class768 var7 = (class768) this.field9267.method11649(); var7 != null; var7 = (class768) this.field9267.method11644()) {
			var6++;
			if (var7.field9271 * -1386941313 == arg0) {
				var7.method14744(arg0, arg1, arg2, arg3);
				return;
			}
			if (var7.field9271 * -1386941313 <= arg0) {
				var5 = var7;
			}
		}
		if (var5 != null) {
			class548.method1968(new class768(arg0, arg1, arg2, arg3), var5);
			if (var6 >= Statics.field4825.field5151 * -1918586481) {
				this.field9267.method11649().method6975();
			}
		} else if (var6 < Statics.field4825.field5151 * -1918586481) {
			this.field9267.method11641(new class768(arg0, arg1, arg2, arg3));
		}
	}

	@ObfuscatedName("acm.s(II)Lacr;")
	public class768 method14734(int arg0) {
		class768 var2 = (class768) this.field9267.method11649();
		if (var2 == null || var2.field9271 * -1386941313 > arg0) {
			return null;
		}
		for (class768 var3 = (class768) this.field9267.method11644(); var3 != null && var3.field9271 * -1386941313 <= arg0; var3 = (class768) this.field9267.method11644()) {
			var2.method6975();
			var2 = var3;
		}
		if (this.field9268.field4445 * 767670557 + var2.field9272 * 260586189 + var2.field9271 * -1386941313 > arg0) {
			return var2;
		} else {
			var2.method6975();
			return null;
		}
	}

	@ObfuscatedName("acm.c(I)Z")
	public boolean method14735() {
		return this.field9267.method11647();
	}
}
