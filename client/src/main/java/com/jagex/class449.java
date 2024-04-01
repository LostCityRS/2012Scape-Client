package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pl")
public class class449 {

	@ObfuscatedName("pl.u")
	public static final class449 field4820 = new class449(0);

	@ObfuscatedName("pl.j")
	public static final class449 field4818 = new class449(1);

	@ObfuscatedName("pl.a")
	public static final class449 field4819 = new class449(2);

	@ObfuscatedName("pl.s")
	public final int field4821;

	@ObfuscatedName("ai.u(I)[Lpl;")
	public static class449[] method1773() {
		return new class449[] { field4820, field4818, field4819 };
	}

	public class449(int arg0) {
		this.field4821 = arg0;
	}

	@ObfuscatedName("mn.j(II)Lpl;")
	public static class449 method6333(int arg0) {
		class449[] var1 = method1773();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class449 var3 = var1[var2];
			if (var3.field4821 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
