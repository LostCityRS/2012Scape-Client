package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("kp")
public class class312 {

	@ObfuscatedName("kp.b")
	public static final int[] field3439 = new int[16384];

	@ObfuscatedName("kp.x")
	public static final int[] field3447 = new int[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			field3439[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
			field3447[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
		}
	}

	public class312() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kp.u(I)F")
	public static float method5096(int arg0) {
		int var1 = arg0 & 0x3FFF;
		return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
	}
}
