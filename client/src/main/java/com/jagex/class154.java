package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("eg")
public class class154 {

	public class154() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("nw.u(J)V")
	public static final void method7052(long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			method15886(arg0 - 1L);
			method15886(1L);
		} else {
			method15886(arg0);
		}
	}

	@ObfuscatedName("afe.j(J)V")
	public static final void method15886(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException var3) {
		}
	}
}
