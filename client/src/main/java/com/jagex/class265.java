package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("id")
public class class265 {

	@ObfuscatedName("id.u")
	public static final class265 field2616 = new class265();

	@ObfuscatedName("id.j")
	public static final class265 field2615 = new class265();

	@ObfuscatedName("id.a")
	public static final class265 field2617 = new class265();

	@ObfuscatedName("ads.u(B)[Lid;")
	public static class265[] method15177() {
		return new class265[] { field2616, field2615, field2617 };
	}

	@ObfuscatedName("id.j(III)I")
	public int method4586(int arg0, int arg1) {
		int var3 = Statics.field4125 > arg1 ? Statics.field4125 : arg1;
		if (field2616 == this) {
			return 0;
		} else if (field2617 == this) {
			return var3 - arg0;
		} else if (field2615 == this) {
			return (var3 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
