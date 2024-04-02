package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("fu")
public class class192 {

	@ObfuscatedName("fu.u")
	public static final class192 field2196 = new class192(0, true);

	@ObfuscatedName("fu.j")
	public static final class192 field2197 = new class192(1, true);

	@ObfuscatedName("fu.a")
	public static final class192 field2199 = new class192(2, false);

	@ObfuscatedName("fu.s")
	public int field2198;

	@ObfuscatedName("fu.c")
	public boolean field2200;

	public class192(int arg0, boolean arg1) {
		this.field2198 = arg0;
		this.field2200 = arg1;
	}

	@ObfuscatedName("ak.u(IB)Lfu;")
	public static class192 method1955(int arg0) {
		if (field2196.field2198 == arg0) {
			return field2196;
		} else if (field2197.field2198 == arg0) {
			return field2197;
		} else if (field2199.field2198 == arg0) {
			return field2199;
		} else {
			return null;
		}
	}
}
