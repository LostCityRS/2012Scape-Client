package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pc")
public class class446 implements class445 {

	@ObfuscatedName("pc.u")
	public final int field4811;

	@ObfuscatedName("pc.j")
	public final int field4812;

	@ObfuscatedName("pc.a")
	public final int[] field4813;

	public class446(int arg0, int arg1, int[] arg2) {
		this.field4811 = arg0;
		this.field4812 = arg1;
		this.field4813 = arg2;
	}

	@ObfuscatedName("pc.u(Ladv;[Lox;ILoq;I)Z")
	public boolean method7884(class809 arg0, class415[] arg1, int arg2, class413 arg3) {
		if (arg0 != null) {
			if (this.field4811 != arg0.method15181()) {
				return false;
			}
			if (this.field4812 > arg0.method15184()) {
				return false;
			}
			int[] var5 = this.field4813;
			for (int var6 = 0; var6 < var5.length; var6++) {
				int var7 = var5[var6];
				if (!arg3.method7243(var7)) {
					return false;
				}
			}
		} else if (this.field4811 != -1) {
			return false;
		}
		return true;
	}

	@ObfuscatedName("ar.a(Laet;B)Lpc;")
	public static class446 method1698(Packet arg0) {
		int var1 = arg0.g1();
		int var2 = arg0.g1();
		int var3 = arg0.g1();
		int[] var4 = new int[var3];
		for (int var5 = 0; var5 < var3; var5++) {
			var4[var5] = arg0.g1();
		}
		return new class446(var1, var2, var4);
	}
}
