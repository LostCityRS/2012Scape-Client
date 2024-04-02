package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("cq")
public class class101 {

	@ObfuscatedName("cq.u")
	public static final float[] field1147 = new float[16384];

	@ObfuscatedName("cq.j")
	public static final float[] field1146 = new float[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			field1147[var2] = (float) Math.sin((double) var2 * var0);
			field1146[var2] = (float) Math.cos((double) var2 * var0);
		}
	}

	public class101() throws Throwable {
		throw new Error();
	}
}
