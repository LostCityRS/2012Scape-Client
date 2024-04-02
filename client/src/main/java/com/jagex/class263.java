package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("iv")
public class class263 {

	@ObfuscatedName("iv.u")
	public static final class263 field2612 = new class263();

	@ObfuscatedName("iv.j")
	public static final class263 field2613 = new class263();

	@ObfuscatedName("iv.a")
	public static final class263 field2614 = new class263();

	@ObfuscatedName("fm.u(I)[Liv;")
	public static class263[] method3623() {
		return new class263[] { field2612, field2613, field2614 };
	}

	@ObfuscatedName("iv.j(III)I")
	public int method4574(int arg0, int arg1) {
		int var3 = Statics.field4677 > arg1 ? Statics.field4677 : arg1;
		if (field2612 == this) {
			return 0;
		} else if (field2614 == this) {
			return var3 - arg0;
		} else if (field2613 == this) {
			return (var3 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
