package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("eu")
public final class class153 {

	public class153() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kw.u(I)J")
	public static final synchronized long method5554() {
		long var0 = System.currentTimeMillis();
		if (var0 < Statics.field1575 * 4590970403291218677L) {
			Statics.field1576 += (Statics.field1575 * 4590970403291218677L - var0) * 4558889088330735147L;
		}
		Statics.field1575 = var0 * -7378312942837180067L;
		return Statics.field1576 * 7835102648480182403L + var0;
	}
}
