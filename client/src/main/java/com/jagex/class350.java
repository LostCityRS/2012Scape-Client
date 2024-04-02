package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;
import java.awt.Canvas;

@ObfuscatedName("lz")
public class class350 {

	public class350() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("lz.u(Ljava/awt/Canvas;Lma;Lls;I)Lra;")
	public static class14 method6008(Canvas arg0, class16 arg1, class334 arg2, int arg3) {
		try {
			boolean var4 = class683.method13494();
			if (!var4) {
				throw new RuntimeException("");
			} else if (class618.method11710().method6800("jaggl")) {
				class14.method16838(arg0);
				OpenGL var5 = new OpenGL();
				long var6 = var5.init(arg0, 8, 8, 8, 24, 0, arg3);
				if (var6 == 0L) {
					throw new RuntimeException("");
				}
				class899 var8 = new class899(var5, arg0, var6, arg1, arg2, arg3);
				var8.method13495();
				return var8;
			} else {
				throw new RuntimeException("");
			}
		} catch (RuntimeException var11) {
			throw var11;
		} catch (Throwable var12) {
			throw new RuntimeException("");
		}
	}
}
