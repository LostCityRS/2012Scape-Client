package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("em")
public class class173 {

	@ObfuscatedName("em.u")
	public String field2086;

	@ObfuscatedName("em.s")
	public class174[] field2088;

	@ObfuscatedName("em.c")
	public class174[] field2082;

	@ObfuscatedName("em.m")
	public class167[] field2087;

	public class173(byte[] arg0) throws class882 {
		this.method3456(arg0);
	}

	@ObfuscatedName("em.u([BI)V")
	public void method3456(byte[] arg0) throws class882 {
		class169 var2 = new class169(arg0);
		int var3 = var2.method3294();
		if (var3 != 4) {
			throw new class882(this, var3, 4);
		}
		this.field2086 = var2.method3295();
		this.field2088 = new class174[var2.method3294()];
		this.field2082 = new class174[var2.method3294()];
		this.field2087 = new class167[var2.method3294()];
		for (int var4 = 0; var4 < this.field2088.length; var4++) {
			this.field2088[var4] = new class174();
			this.field2088[var4].method3468(var2);
		}
		for (int var5 = 0; var5 < this.field2082.length; var5++) {
			this.field2082[var5] = new class174();
			this.field2082[var5].method3468(var2);
		}
		for (int var6 = 0; var6 < this.field2087.length; var6++) {
			this.field2087[var6] = new class167();
			this.field2087[var6].method3216(var2);
		}
	}
}
