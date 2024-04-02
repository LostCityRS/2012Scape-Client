package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("kq")
public class class313 {

	@ObfuscatedName("kq.u")
	public static final float[] field3448 = new float[16384];

	@ObfuscatedName("kq.j")
	public static final float[] field3449 = new float[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			field3448[var2] = (float) Math.sin((double) var2 * var0);
			field3449[var2] = (float) Math.cos((double) var2 * var0);
		}
	}

	public class313() throws Throwable {
		throw new Error();
	}
}
