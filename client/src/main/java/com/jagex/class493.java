package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("rt")
public class class493 {

	@ObfuscatedName("rt.s")
	public int[] field5171;

	@ObfuscatedName("rt.c")
	public int field5173 = 1830576027;

	@ObfuscatedName("rt.m")
	public int field5174 = 19122137;

	@ObfuscatedName("rt.t")
	public int[] field5176;

	@ObfuscatedName("rt.l")
	public int[] field5172;

	public class493(class334 arg0) {
		byte[] var2 = arg0.method5635(class491.field5142.field5145 * -1832333129);
		this.method8620(new class814(var2));
		if (this.field5171 == null) {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("rt.u(Laet;B)V")
	public void method8620(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				int var3 = arg0.method15220();
				this.field5171 = new int[var3];
				for (int var4 = 0; var4 < this.field5171.length; var4++) {
					this.field5171[var4] = arg0.method15220();
					if (this.field5171[var4] != 0 && this.field5171[var4] == 2) {
					}
				}
			} else if (var2 == 3) {
				this.field5173 = arg0.method15220() * -1830576027;
			} else if (var2 == 4) {
				this.field5174 = arg0.method15220() * -19122137;
			} else if (var2 == 5) {
				this.field5176 = new int[arg0.method15220()];
				for (int var5 = 0; var5 < this.field5176.length; var5++) {
					this.field5176[var5] = arg0.method15220();
				}
			} else if (var2 == 6) {
				this.field5172 = new int[arg0.method15220()];
				for (int var6 = 0; var6 < this.field5172.length; var6++) {
					this.field5172[var6] = arg0.method15220();
				}
			}
		}
	}
}
