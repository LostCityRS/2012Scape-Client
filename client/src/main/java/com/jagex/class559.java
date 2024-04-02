package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("up")
public class class559 {

	@ObfuscatedName("up.u")
	public static final class559 field6696 = new class559(0);

	@ObfuscatedName("up.j")
	public static final class559 field6697 = new class559(1);

	@ObfuscatedName("up.a")
	public static final class559 field6698 = new class559(2);

	@ObfuscatedName("up.s")
	public final int field6699;

	@ObfuscatedName("sl.u(I)[Lup;")
	public static class559[] method11168() {
		return new class559[] { field6698, field6696, field6697 };
	}

	public class559(int arg0) {
		this.field6699 = arg0 * 1441779731;
	}

	@ObfuscatedName("ss.j(II)Lup;")
	public static class559 method11235(int arg0) {
		class559[] var1 = method11168();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class559 var3 = var1[var2];
			if (var3.field6699 * 1220835867 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
