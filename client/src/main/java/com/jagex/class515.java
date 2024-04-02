package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("sf")
public class class515 implements class517 {

	@ObfuscatedName("sf.u")
	public static final class515 field6363 = new class515("", 4);

	@ObfuscatedName("sf.j")
	public static final class515 field6369 = new class515("", 3);

	@ObfuscatedName("sf.a")
	public static final class515 field6364 = new class515("", 5);

	@ObfuscatedName("sf.s")
	public static final class515 field6365 = new class515("", 8);

	@ObfuscatedName("sf.c")
	public static final class515 field6362 = new class515("", 2);

	@ObfuscatedName("sf.m")
	public static final class515 field6366 = new class515("", 1);

	@ObfuscatedName("sf.t")
	public static final class515 field6367 = new class515("", 6);

	@ObfuscatedName("sf.l")
	public static final class515 field6368 = new class515("", 0);

	@ObfuscatedName("sf.f")
	public final int field6370;

	static {
		method11173();
	}

	@ObfuscatedName("sf.u(I)[Lsf;")
	public static class515[] method11173() {
		return new class515[] { field6362, field6368, field6366, field6363, field6367, field6369, field6365, field6364 };
	}

	public class515(String arg0, int arg1) {
		this.field6370 = arg1 * 715770441;
	}

	@ObfuscatedName("sf.a(Lsf;I)Z")
	public static boolean method11177(class515 arg0) {
		return field6366 == arg0 || field6362 == arg0 || field6369 == arg0 || field6364 == arg0 || field6365 == arg0 || field6367 == arg0;
	}

	@ObfuscatedName("sf.j(B)I")
	public int method6339() {
		return this.field6370 * 465586169;
	}
}
