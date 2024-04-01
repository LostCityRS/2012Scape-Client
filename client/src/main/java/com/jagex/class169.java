package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ef")
public class class169 {

	@ObfuscatedName("ef.u")
	public byte[] field1943;

	@ObfuscatedName("ef.j")
	public int field1942;

	public class169(byte[] arg0) {
		this.field1943 = arg0;
		this.field1942 = 0;
	}

	@ObfuscatedName("ef.u(I)I")
	public int method3294() {
		short var1 = 0;
		for (int var2 = 0; var2 < 2; var2++) {
			var1 = (short) (var1 | (this.field1943[++this.field1942 - 1] & 0xFF) << var2 * 8);
		}
		return var1;
	}

	@ObfuscatedName("ef.j(B)Ljava/lang/String;")
	public String method3295() {
		int var1 = this.method3294();
		if (var1 == -1) {
			return null;
		} else if (var1 > 256) {
			throw new class982();
		} else {
			String var2 = new String(this.field1943, this.field1942, var1);
			this.field1942 += var1;
			return var2;
		}
	}
}
