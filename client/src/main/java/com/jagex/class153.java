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
		if (var0 < Statics.field1575) {
			Statics.field1576 += Statics.field1575 - var0;
		}
		Statics.field1575 = var0;
		return Statics.field1576 + var0;
	}
}
